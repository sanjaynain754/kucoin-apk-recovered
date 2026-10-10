.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/A;
.super Landroid/graphics/drawable/Drawable;
.source "SourceFile"


# instance fields
.field public final a:Landroid/graphics/Movie;

.field public final b:Landroid/widget/ImageView;

.field public c:J

.field public final d:Landroid/os/Handler;

.field public e:Z

.field public final f:Lio/trtc/tuikit/atomicxcore/impl/view/call/z;


# direct methods
.method public constructor <init>(Landroid/graphics/Movie;Landroid/widget/ImageView;)V
    .locals 4

    .line 1
    .line 2
    const-string v0, "movie"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "imageView"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Landroid/graphics/drawable/Drawable;-><init>()V

    .line 14
    .line 15
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->a:Landroid/graphics/Movie;

    .line 16
    .line 17
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->b:Landroid/widget/ImageView;

    .line 18
    .line 19
    new-instance v0, Landroid/os/Handler;

    .line 20
    .line 21
    .line 22
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 27
    .line 28
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->d:Landroid/os/Handler;

    .line 29
    .line 30
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/z;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/z;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/A;)V

    .line 34
    .line 35
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->f:Lio/trtc/tuikit/atomicxcore/impl/view/call/z;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Landroid/graphics/Movie;->width()I

    .line 39
    move-result v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/graphics/Movie;->height()I

    .line 43
    move-result p1

    .line 44
    const/4 v3, 0x0

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v3, v3, v2, p1}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V

    .line 48
    .line 49
    iget-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->e:Z

    .line 50
    .line 51
    if-eqz p1, :cond_0

    .line 52
    goto :goto_0

    .line 53
    :cond_0
    const/4 p1, 0x1

    .line 54
    .line 55
    iput-boolean p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->e:Z

    .line 56
    .line 57
    .line 58
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 59
    move-result-wide v2

    .line 60
    .line 61
    iput-wide v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->c:J

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 65
    .line 66
    :goto_0
    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/y;

    .line 67
    .line 68
    .line 69
    invoke-direct {p1, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/y;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/A;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {p2, p1}, Landroid/view/View;->addOnAttachStateChangeListener(Landroid/view/View$OnAttachStateChangeListener;)V

    .line 73
    return-void
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
.end method


# virtual methods
.method public final draw(Landroid/graphics/Canvas;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "canvas"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/graphics/drawable/Drawable;->getBounds()Landroid/graphics/Rect;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v1, "getBounds(...)"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/graphics/Rect;->isEmpty()Z

    .line 18
    move-result v1

    .line 19
    .line 20
    if-eqz v1, :cond_0

    .line 21
    return-void

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 25
    move-result v1

    .line 26
    int-to-float v1, v1

    .line 27
    .line 28
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->a:Landroid/graphics/Movie;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Landroid/graphics/Movie;->width()I

    .line 32
    move-result v2

    .line 33
    int-to-float v2, v2

    .line 34
    div-float/2addr v1, v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 38
    move-result v2

    .line 39
    int-to-float v2, v2

    .line 40
    .line 41
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->a:Landroid/graphics/Movie;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v3}, Landroid/graphics/Movie;->height()I

    .line 45
    move-result v3

    .line 46
    int-to-float v3, v3

    .line 47
    div-float/2addr v2, v3

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v2}, Lkotlin/ranges/RangesKt;->coerceAtMost(FF)F

    .line 51
    move-result v1

    .line 52
    .line 53
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->a:Landroid/graphics/Movie;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/graphics/Movie;->width()I

    .line 57
    move-result v2

    .line 58
    int-to-float v2, v2

    .line 59
    mul-float/2addr v2, v1

    .line 60
    .line 61
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->a:Landroid/graphics/Movie;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Landroid/graphics/Movie;->height()I

    .line 65
    move-result v3

    .line 66
    int-to-float v3, v3

    .line 67
    mul-float/2addr v3, v1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 71
    move-result v4

    .line 72
    int-to-float v4, v4

    .line 73
    sub-float/2addr v4, v2

    .line 74
    .line 75
    const/high16 v2, 0x40000000    # 2.0f

    .line 76
    div-float/2addr v4, v2

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 80
    move-result v0

    .line 81
    int-to-float v0, v0

    .line 82
    sub-float/2addr v0, v3

    .line 83
    div-float/2addr v0, v2

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v4, v0}, Landroid/graphics/Canvas;->translate(FF)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, v1, v1}, Landroid/graphics/Canvas;->scale(FF)V

    .line 93
    .line 94
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->a:Landroid/graphics/Movie;

    .line 95
    const/4 v1, 0x0

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p1, v1, v1}, Landroid/graphics/Movie;->draw(Landroid/graphics/Canvas;FF)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V

    .line 102
    return-void
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
.end method

.method public final getIntrinsicHeight()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->a:Landroid/graphics/Movie;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Movie;->height()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final getIntrinsicWidth()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->a:Landroid/graphics/Movie;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/Movie;->width()I

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public final getOpacity()I
    .locals 1

    .line 1
    const/4 v0, -0x3

    .line 2
    return v0
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
.end method

.method public final onBoundsChange(Landroid/graphics/Rect;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "bounds"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Landroid/graphics/drawable/Drawable;->onBoundsChange(Landroid/graphics/Rect;)V

    .line 9
    .line 10
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/A;->b:Landroid/widget/ImageView;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

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
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final setAlpha(I)V
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
.end method

.method public final setColorFilter(Landroid/graphics/ColorFilter;)V
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
.end method
