.class public Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final n:I

.field public o:Landroid/view/View;

.field public final p:Landroid/graphics/Paint;

.field public final q:Landroid/graphics/RectF;

.field public r:Ljava/lang/Integer;

.field public s:Landroid/graphics/RectF;

.field public t:I

.field public final u:Landroid/graphics/Path;

.field public v:Lv/a;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 7
    move-result-object p2

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    const-string v2, "iqa_timeout_frame"

    .line 18
    .line 19
    const-string v3, "color"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2, v3, v1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 23
    move-result v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2, v0}, Landroid/content/res/Resources;->getColor(I)I

    .line 27
    move-result p2

    .line 28
    .line 29
    iput p2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->n:I

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 37
    move-result-object v0

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    const-string v1, "advance_black"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1, v3, p1}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I

    .line 47
    move-result p1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, p1}, Landroid/content/res/Resources;->getColor(I)I

    .line 51
    move-result p1

    .line 52
    .line 53
    iput p1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->t:I

    .line 54
    .line 55
    new-instance p1, Landroid/graphics/Path;

    .line 56
    .line 57
    .line 58
    invoke-direct {p1}, Landroid/graphics/Path;-><init>()V

    .line 59
    .line 60
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 61
    .line 62
    new-instance p1, Landroid/graphics/Paint;

    .line 63
    .line 64
    .line 65
    invoke-direct {p1}, Landroid/graphics/Paint;-><init>()V

    .line 66
    .line 67
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 68
    const/4 p2, 0x1

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setAntiAlias(Z)V

    .line 72
    .line 73
    iget p2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->t:I

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 77
    .line 78
    const/high16 p2, 0x3f800000    # 1.0f

    .line 79
    .line 80
    .line 81
    invoke-direct {p0, p2}, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->g(F)I

    .line 82
    move-result p2

    .line 83
    int-to-float p2, p2

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 87
    .line 88
    sget-object p2, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 92
    .line 93
    new-instance p1, Landroid/graphics/RectF;

    .line 94
    .line 95
    .line 96
    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    .line 97
    .line 98
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->q:Landroid/graphics/RectF;

    .line 99
    return-void
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
.end method

.method private g(F)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    .line 11
    mul-float/2addr p1, v0

    .line 12
    float-to-int p1, p1

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
.end method


# virtual methods
.method public a(Ljava/lang/CharSequence;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->v:Lv/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->v:Lv/a;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Lv/a;->a(Ljava/lang/CharSequence;)V

    .line 16
    :cond_0
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public draw(Landroid/graphics/Canvas;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/view/View;->draw(Landroid/graphics/Canvas;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->j()V

    .line 7
    .line 8
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->o:Landroid/view/View;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->r:Ljava/lang/Integer;

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->h(Landroid/graphics/Canvas;)V

    .line 19
    goto :goto_0

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-virtual {p0, p1}, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->i(Landroid/graphics/Canvas;)V

    .line 23
    .line 24
    :goto_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->v:Lv/a;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->isShowing()Z

    .line 30
    move-result v0

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    iget v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->n:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v0}, Landroid/graphics/Canvas;->drawColor(I)V

    .line 38
    :cond_2
    :goto_1
    return-void
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
.end method

.method public f()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->v:Lv/a;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/widget/PopupWindow;->dismiss()V

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->v:Lv/a;

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
.end method

.method public final declared-synchronized h(Landroid/graphics/Canvas;)V
    .locals 8

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->o:Landroid/view/View;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v0}, Landroid/view/View;->getLeft()I

    .line 7
    move-result v0

    .line 8
    int-to-float v0, v0

    .line 9
    .line 10
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 14
    move-result v1

    .line 15
    .line 16
    const/high16 v2, 0x40000000    # 2.0f

    .line 17
    div-float/2addr v1, v2

    .line 18
    sub-float/2addr v0, v1

    .line 19
    float-to-int v0, v0

    .line 20
    .line 21
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->o:Landroid/view/View;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 25
    move-result v1

    .line 26
    int-to-float v1, v1

    .line 27
    .line 28
    iget-object v3, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v3}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 32
    move-result v3

    .line 33
    div-float/2addr v3, v2

    .line 34
    sub-float/2addr v1, v3

    .line 35
    float-to-int v1, v1

    .line 36
    .line 37
    iget-object v3, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->o:Landroid/view/View;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v3}, Landroid/view/View;->getRight()I

    .line 41
    move-result v3

    .line 42
    int-to-float v3, v3

    .line 43
    .line 44
    iget-object v4, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v4}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 48
    move-result v4

    .line 49
    div-float/2addr v4, v2

    .line 50
    add-float/2addr v3, v4

    .line 51
    float-to-int v3, v3

    .line 52
    .line 53
    iget-object v4, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->o:Landroid/view/View;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v4}, Landroid/view/View;->getBottom()I

    .line 57
    move-result v4

    .line 58
    int-to-float v4, v4

    .line 59
    .line 60
    iget-object v5, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v5}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 64
    move-result v5

    .line 65
    div-float/2addr v5, v2

    .line 66
    add-float/2addr v4, v5

    .line 67
    float-to-int v2, v4

    .line 68
    .line 69
    iget-object v4, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->q:Landroid/graphics/RectF;

    .line 70
    int-to-float v0, v0

    .line 71
    .line 72
    iput v0, v4, Landroid/graphics/RectF;->left:F

    .line 73
    int-to-float v5, v1

    .line 74
    .line 75
    iput v5, v4, Landroid/graphics/RectF;->top:F

    .line 76
    int-to-float v3, v3

    .line 77
    .line 78
    iput v3, v4, Landroid/graphics/RectF;->right:F

    .line 79
    int-to-float v6, v2

    .line 80
    .line 81
    iput v6, v4, Landroid/graphics/RectF;->bottom:F

    .line 82
    .line 83
    iget-object v4, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v4}, Landroid/graphics/Path;->reset()V

    .line 87
    sub-int/2addr v2, v1

    .line 88
    int-to-float v1, v2

    .line 89
    .line 90
    .line 91
    const v2, 0x3dc08312    # 0.094f

    .line 92
    mul-float/2addr v1, v2

    .line 93
    .line 94
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 95
    .line 96
    add-float v4, v5, v1

    .line 97
    .line 98
    .line 99
    invoke-virtual {v2, v0, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 100
    .line 101
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2, v0, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 105
    .line 106
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 107
    .line 108
    add-float v7, v0, v1

    .line 109
    .line 110
    .line 111
    invoke-virtual {v2, v7, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 112
    .line 113
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v2, v7, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 117
    .line 118
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 119
    .line 120
    .line 121
    invoke-virtual {v2, v0, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 122
    .line 123
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 124
    .line 125
    sub-float v7, v6, v1

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v0, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 129
    .line 130
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0, v3, v4}, Landroid/graphics/Path;->moveTo(FF)V

    .line 134
    .line 135
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v3, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 139
    .line 140
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 141
    .line 142
    sub-float v2, v3, v1

    .line 143
    .line 144
    .line 145
    invoke-virtual {v0, v2, v5}, Landroid/graphics/Path;->lineTo(FF)V

    .line 146
    .line 147
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0, v2, v6}, Landroid/graphics/Path;->moveTo(FF)V

    .line 151
    .line 152
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v0, v3, v6}, Landroid/graphics/Path;->lineTo(FF)V

    .line 156
    .line 157
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 158
    .line 159
    .line 160
    invoke-virtual {v0, v3, v7}, Landroid/graphics/Path;->lineTo(FF)V

    .line 161
    .line 162
    const/high16 v0, 0x40a00000    # 5.0f

    .line 163
    div-float/2addr v1, v0

    .line 164
    .line 165
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 169
    .line 170
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->u:Landroid/graphics/Path;

    .line 171
    .line 172
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 173
    .line 174
    .line 175
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 176
    .line 177
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 178
    .line 179
    const/high16 v1, 0x3f800000    # 1.0f

    .line 180
    .line 181
    .line 182
    invoke-direct {p0, v1}, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->g(F)I

    .line 183
    move-result v1

    .line 184
    int-to-float v1, v1

    .line 185
    .line 186
    .line 187
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 188
    .line 189
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->q:Landroid/graphics/RectF;

    .line 190
    .line 191
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 192
    .line 193
    .line 194
    invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->drawRect(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 195
    monitor-exit p0

    .line 196
    return-void

    .line 197
    :catchall_0
    move-exception p1

    .line 198
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 199
    throw p1
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
.end method

.method public final i(Landroid/graphics/Canvas;)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->s:Landroid/graphics/RectF;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroid/graphics/RectF;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 10
    .line 11
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->s:Landroid/graphics/RectF;

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->s:Landroid/graphics/RectF;

    .line 14
    .line 15
    iget v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 16
    .line 17
    iget v0, v0, Landroid/graphics/RectF;->top:F

    .line 18
    sub-float/2addr v1, v0

    .line 19
    .line 20
    .line 21
    const v0, 0x3dc08312    # 0.094f

    .line 22
    mul-float/2addr v1, v0

    .line 23
    .line 24
    const/high16 v0, 0x40a00000    # 5.0f

    .line 25
    div-float/2addr v1, v0

    .line 26
    .line 27
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 31
    .line 32
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->s:Landroid/graphics/RectF;

    .line 33
    .line 34
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->o:Landroid/view/View;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Landroid/view/View;->getLeft()I

    .line 38
    move-result v1

    .line 39
    int-to-float v1, v1

    .line 40
    .line 41
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 45
    move-result v2

    .line 46
    .line 47
    const/high16 v3, 0x40000000    # 2.0f

    .line 48
    div-float/2addr v2, v3

    .line 49
    sub-float/2addr v1, v2

    .line 50
    float-to-int v1, v1

    .line 51
    int-to-float v1, v1

    .line 52
    .line 53
    iput v1, v0, Landroid/graphics/RectF;->left:F

    .line 54
    .line 55
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->s:Landroid/graphics/RectF;

    .line 56
    .line 57
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->o:Landroid/view/View;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1}, Landroid/view/View;->getTop()I

    .line 61
    move-result v1

    .line 62
    int-to-float v1, v1

    .line 63
    .line 64
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 68
    move-result v2

    .line 69
    div-float/2addr v2, v3

    .line 70
    sub-float/2addr v1, v2

    .line 71
    float-to-int v1, v1

    .line 72
    int-to-float v1, v1

    .line 73
    .line 74
    iput v1, v0, Landroid/graphics/RectF;->top:F

    .line 75
    .line 76
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->s:Landroid/graphics/RectF;

    .line 77
    .line 78
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->o:Landroid/view/View;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1}, Landroid/view/View;->getRight()I

    .line 82
    move-result v1

    .line 83
    int-to-float v1, v1

    .line 84
    .line 85
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 89
    move-result v2

    .line 90
    div-float/2addr v2, v3

    .line 91
    add-float/2addr v1, v2

    .line 92
    float-to-int v1, v1

    .line 93
    int-to-float v1, v1

    .line 94
    .line 95
    iput v1, v0, Landroid/graphics/RectF;->right:F

    .line 96
    .line 97
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->s:Landroid/graphics/RectF;

    .line 98
    .line 99
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->o:Landroid/view/View;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1}, Landroid/view/View;->getBottom()I

    .line 103
    move-result v1

    .line 104
    int-to-float v1, v1

    .line 105
    .line 106
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v2}, Landroid/graphics/Paint;->getStrokeWidth()F

    .line 110
    move-result v2

    .line 111
    div-float/2addr v2, v3

    .line 112
    add-float/2addr v1, v2

    .line 113
    float-to-int v1, v1

    .line 114
    int-to-float v1, v1

    .line 115
    .line 116
    iput v1, v0, Landroid/graphics/RectF;->bottom:F

    .line 117
    .line 118
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->s:Landroid/graphics/RectF;

    .line 119
    .line 120
    iget-object v1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->r:Ljava/lang/Integer;

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 124
    move-result v1

    .line 125
    int-to-float v1, v1

    .line 126
    .line 127
    iget-object v2, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->r:Ljava/lang/Integer;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 131
    move-result v2

    .line 132
    int-to-float v2, v2

    .line 133
    .line 134
    iget-object v3, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 138
    return-void
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
.end method

.method public final j()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->o:Landroid/view/View;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    .line 8
    :goto_0
    invoke-virtual {p0}, Landroid/view/ViewGroup;->getChildCount()I

    .line 9
    move-result v1

    .line 10
    .line 11
    if-ge v0, v1, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    instance-of v2, v1, Lai/advance/sdk/global/iqa/lib/GlobalIQAView;

    .line 18
    .line 19
    if-eqz v2, :cond_0

    .line 20
    .line 21
    iput-object v1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->o:Landroid/view/View;

    .line 22
    return-void

    .line 23
    .line 24
    :cond_0
    add-int/lit8 v0, v0, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_1
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
.end method

.method public k(Ljava/lang/CharSequence;I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->j()V

    .line 4
    .line 5
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->o:Landroid/view/View;

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    return-void

    .line 9
    .line 10
    :cond_0
    new-instance v0, Lv/a;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Lv/a;-><init>(Landroid/content/Context;)V

    .line 18
    .line 19
    iput-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->v:Lv/a;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1, p2}, Lv/a;->b(Ljava/lang/CharSequence;I)V

    .line 23
    .line 24
    iget-object p1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->v:Lv/a;

    .line 25
    .line 26
    const/16 p2, 0x11

    .line 27
    const/4 v0, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, p0, p2, v0, v0}, Landroid/widget/PopupWindow;->showAtLocation(Landroid/view/View;III)V

    .line 31
    return-void
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
.end method

.method public setCornerRadius(Ljava/lang/Integer;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->r:Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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

.method public setLineColor(I)V
    .locals 1

    .line 1
    .line 2
    iput p1, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->t:I

    .line 3
    .line 4
    iget-object v0, p0, Lai/advance/sdk/global/iqa/lib/widgets/ImageQualityRootLayout;->p:Landroid/graphics/Paint;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

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
