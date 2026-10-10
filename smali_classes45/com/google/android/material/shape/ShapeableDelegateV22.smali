.class Lcom/google/android/material/shape/ShapeableDelegateV22;
.super Lcom/google/android/material/shape/ShapeableDelegate;
.source "ShapeableDelegateV22.java"


# annotations
.annotation build Landroidx/annotation/RequiresApi;
    value = 0x16
.end annotation


# instance fields
.field private canUseViewOutline:Z

.field private cornerRadius:F


# direct methods
.method public constructor <init>(Landroid/view/View;)V
    .locals 1
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/shape/ShapeableDelegate;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/google/android/material/shape/ShapeableDelegateV22;->canUseViewOutline:Z

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput v0, p0, Lcom/google/android/material/shape/ShapeableDelegateV22;->cornerRadius:F

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, p1}, Lcom/google/android/material/shape/ShapeableDelegateV22;->initMaskOutlineProvider(Landroid/view/View;)V

    .line 13
    return-void
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

.method public static synthetic access$000(Lcom/google/android/material/shape/ShapeableDelegateV22;)F
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/google/android/material/shape/ShapeableDelegateV22;->cornerRadius:F

    .line 3
    return p0
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
.end method

.method private getDefaultCornerRadius()F
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->shapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    iget-object v0, v0, Lcom/google/android/material/shape/ShapeAppearanceModel;->topRightCornerSize:Lcom/google/android/material/shape/CornerSize;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Lcom/google/android/material/shape/CornerSize;->getCornerSize(Landroid/graphics/RectF;)F

    .line 15
    move-result v0

    .line 16
    return v0

    .line 17
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 18
    return v0
.end method

.method private initMaskOutlineProvider(Landroid/view/View;)V
    .locals 1
    .annotation build Landroidx/annotation/DoNotInline;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/android/material/shape/ShapeableDelegateV22$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/google/android/material/shape/ShapeableDelegateV22$1;-><init>(Lcom/google/android/material/shape/ShapeableDelegateV22;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1, v0}, Landroid/view/View;->setOutlineProvider(Landroid/view/ViewOutlineProvider;)V

    .line 9
    return-void
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

.method private isShapeRoundRect()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    iget-object v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->shapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    iget-object v1, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/google/android/material/shape/ShapeAppearanceModel;->isRoundRect(Landroid/graphics/RectF;)Z

    .line 19
    move-result v0

    .line 20
    return v0

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    return v0
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
.end method

.method private offsetZeroCornerEdgeBoundsIfPossible()Z
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/graphics/RectF;->isEmpty()Z

    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    if-nez v0, :cond_4

    .line 10
    .line 11
    iget-object v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->shapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 12
    .line 13
    if-eqz v0, :cond_4

    .line 14
    .line 15
    iget-boolean v2, p0, Lcom/google/android/material/shape/ShapeableDelegate;->offsetZeroCornerEdgeBoundsEnabled:Z

    .line 16
    .line 17
    if-eqz v2, :cond_4

    .line 18
    .line 19
    iget-object v2, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lcom/google/android/material/shape/ShapeAppearanceModel;->isRoundRect(Landroid/graphics/RectF;)Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-nez v0, :cond_4

    .line 26
    .line 27
    iget-object v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->shapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lcom/google/android/material/shape/ShapeableDelegateV22;->shapeUsesAllRoundedCornerTreatments(Lcom/google/android/material/shape/ShapeAppearanceModel;)Z

    .line 31
    move-result v0

    .line 32
    .line 33
    if-nez v0, :cond_0

    .line 34
    .line 35
    goto/16 :goto_1

    .line 36
    .line 37
    :cond_0
    iget-object v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->shapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Lcom/google/android/material/shape/ShapeAppearanceModel;->getTopLeftCornerSize()Lcom/google/android/material/shape/CornerSize;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    iget-object v2, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v2}, Lcom/google/android/material/shape/CornerSize;->getCornerSize(Landroid/graphics/RectF;)F

    .line 47
    move-result v0

    .line 48
    .line 49
    iget-object v2, p0, Lcom/google/android/material/shape/ShapeableDelegate;->shapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/google/android/material/shape/ShapeAppearanceModel;->getTopRightCornerSize()Lcom/google/android/material/shape/CornerSize;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    iget-object v3, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 56
    .line 57
    .line 58
    invoke-interface {v2, v3}, Lcom/google/android/material/shape/CornerSize;->getCornerSize(Landroid/graphics/RectF;)F

    .line 59
    move-result v2

    .line 60
    .line 61
    iget-object v3, p0, Lcom/google/android/material/shape/ShapeableDelegate;->shapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v3}, Lcom/google/android/material/shape/ShapeAppearanceModel;->getBottomLeftCornerSize()Lcom/google/android/material/shape/CornerSize;

    .line 65
    move-result-object v3

    .line 66
    .line 67
    iget-object v4, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 68
    .line 69
    .line 70
    invoke-interface {v3, v4}, Lcom/google/android/material/shape/CornerSize;->getCornerSize(Landroid/graphics/RectF;)F

    .line 71
    move-result v3

    .line 72
    .line 73
    iget-object v4, p0, Lcom/google/android/material/shape/ShapeableDelegate;->shapeAppearanceModel:Lcom/google/android/material/shape/ShapeAppearanceModel;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v4}, Lcom/google/android/material/shape/ShapeAppearanceModel;->getBottomRightCornerSize()Lcom/google/android/material/shape/CornerSize;

    .line 77
    move-result-object v4

    .line 78
    .line 79
    iget-object v5, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 80
    .line 81
    .line 82
    invoke-interface {v4, v5}, Lcom/google/android/material/shape/CornerSize;->getCornerSize(Landroid/graphics/RectF;)F

    .line 83
    move-result v4

    .line 84
    const/4 v5, 0x0

    .line 85
    .line 86
    cmpl-float v6, v0, v5

    .line 87
    .line 88
    if-nez v6, :cond_1

    .line 89
    .line 90
    cmpl-float v7, v3, v5

    .line 91
    .line 92
    if-nez v7, :cond_1

    .line 93
    .line 94
    cmpl-float v7, v2, v4

    .line 95
    .line 96
    if-nez v7, :cond_1

    .line 97
    .line 98
    iget-object v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 99
    .line 100
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 101
    sub-float/2addr v1, v2

    .line 102
    .line 103
    iget v3, v0, Landroid/graphics/RectF;->top:F

    .line 104
    .line 105
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 106
    .line 107
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 111
    .line 112
    iput v2, p0, Lcom/google/android/material/shape/ShapeableDelegateV22;->cornerRadius:F

    .line 113
    goto :goto_0

    .line 114
    .line 115
    :cond_1
    if-nez v6, :cond_2

    .line 116
    .line 117
    cmpl-float v6, v2, v5

    .line 118
    .line 119
    if-nez v6, :cond_2

    .line 120
    .line 121
    cmpl-float v6, v3, v4

    .line 122
    .line 123
    if-nez v6, :cond_2

    .line 124
    .line 125
    iget-object v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 126
    .line 127
    iget v1, v0, Landroid/graphics/RectF;->left:F

    .line 128
    .line 129
    iget v2, v0, Landroid/graphics/RectF;->top:F

    .line 130
    sub-float/2addr v2, v3

    .line 131
    .line 132
    iget v4, v0, Landroid/graphics/RectF;->right:F

    .line 133
    .line 134
    iget v5, v0, Landroid/graphics/RectF;->bottom:F

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, v1, v2, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 138
    .line 139
    iput v3, p0, Lcom/google/android/material/shape/ShapeableDelegateV22;->cornerRadius:F

    .line 140
    goto :goto_0

    .line 141
    .line 142
    :cond_2
    cmpl-float v6, v2, v5

    .line 143
    .line 144
    if-nez v6, :cond_3

    .line 145
    .line 146
    cmpl-float v6, v4, v5

    .line 147
    .line 148
    if-nez v6, :cond_3

    .line 149
    .line 150
    cmpl-float v6, v0, v3

    .line 151
    .line 152
    if-nez v6, :cond_3

    .line 153
    .line 154
    iget-object v1, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 155
    .line 156
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 157
    .line 158
    iget v3, v1, Landroid/graphics/RectF;->top:F

    .line 159
    .line 160
    iget v4, v1, Landroid/graphics/RectF;->right:F

    .line 161
    add-float/2addr v4, v0

    .line 162
    .line 163
    iget v5, v1, Landroid/graphics/RectF;->bottom:F

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 167
    .line 168
    iput v0, p0, Lcom/google/android/material/shape/ShapeableDelegateV22;->cornerRadius:F

    .line 169
    goto :goto_0

    .line 170
    .line 171
    :cond_3
    cmpl-float v3, v3, v5

    .line 172
    .line 173
    if-nez v3, :cond_4

    .line 174
    .line 175
    cmpl-float v3, v4, v5

    .line 176
    .line 177
    if-nez v3, :cond_4

    .line 178
    .line 179
    cmpl-float v2, v0, v2

    .line 180
    .line 181
    if-nez v2, :cond_4

    .line 182
    .line 183
    iget-object v1, p0, Lcom/google/android/material/shape/ShapeableDelegate;->maskBounds:Landroid/graphics/RectF;

    .line 184
    .line 185
    iget v2, v1, Landroid/graphics/RectF;->left:F

    .line 186
    .line 187
    iget v3, v1, Landroid/graphics/RectF;->top:F

    .line 188
    .line 189
    iget v4, v1, Landroid/graphics/RectF;->right:F

    .line 190
    .line 191
    iget v5, v1, Landroid/graphics/RectF;->bottom:F

    .line 192
    add-float/2addr v5, v0

    .line 193
    .line 194
    .line 195
    invoke-virtual {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;->set(FFFF)V

    .line 196
    .line 197
    iput v0, p0, Lcom/google/android/material/shape/ShapeableDelegateV22;->cornerRadius:F

    .line 198
    :goto_0
    const/4 v0, 0x1

    .line 199
    return v0

    .line 200
    :cond_4
    :goto_1
    return v1
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
.end method

.method private static shapeUsesAllRoundedCornerTreatments(Lcom/google/android/material/shape/ShapeAppearanceModel;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/google/android/material/shape/ShapeAppearanceModel;->getTopLeftCorner()Lcom/google/android/material/shape/CornerTreatment;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v0, v0, Lcom/google/android/material/shape/RoundedCornerTreatment;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/google/android/material/shape/ShapeAppearanceModel;->getTopRightCorner()Lcom/google/android/material/shape/CornerTreatment;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    instance-of v0, v0, Lcom/google/android/material/shape/RoundedCornerTreatment;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/google/android/material/shape/ShapeAppearanceModel;->getBottomLeftCorner()Lcom/google/android/material/shape/CornerTreatment;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    instance-of v0, v0, Lcom/google/android/material/shape/RoundedCornerTreatment;

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/google/android/material/shape/ShapeAppearanceModel;->getBottomRightCorner()Lcom/google/android/material/shape/CornerTreatment;

    .line 28
    move-result-object p0

    .line 29
    .line 30
    instance-of p0, p0, Lcom/google/android/material/shape/RoundedCornerTreatment;

    .line 31
    .line 32
    if-eqz p0, :cond_0

    .line 33
    const/4 p0, 0x1

    .line 34
    return p0

    .line 35
    :cond_0
    const/4 p0, 0x0

    .line 36
    return p0
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
.end method


# virtual methods
.method public getCornerRadius()F
    .locals 1
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/google/android/material/shape/ShapeableDelegateV22;->cornerRadius:F

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
.end method

.method public invalidateClippingMethod(Landroid/view/View;)V
    .locals 2
    .param p1    # Landroid/view/View;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/shape/ShapeableDelegateV22;->getDefaultCornerRadius()F

    .line 4
    move-result v0

    .line 5
    .line 6
    iput v0, p0, Lcom/google/android/material/shape/ShapeableDelegateV22;->cornerRadius:F

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/google/android/material/shape/ShapeableDelegateV22;->isShapeRoundRect()Z

    .line 10
    move-result v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-nez v0, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-direct {p0}, Lcom/google/android/material/shape/ShapeableDelegateV22;->offsetZeroCornerEdgeBoundsIfPossible()Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    :goto_0
    move v0, v1

    .line 24
    .line 25
    :goto_1
    iput-boolean v0, p0, Lcom/google/android/material/shape/ShapeableDelegateV22;->canUseViewOutline:Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0}, Lcom/google/android/material/shape/ShapeableDelegateV22;->shouldUseCompatClipping()Z

    .line 29
    move-result v0

    .line 30
    xor-int/2addr v0, v1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1, v0}, Landroid/view/View;->setClipToOutline(Z)V

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Lcom/google/android/material/shape/ShapeableDelegateV22;->shouldUseCompatClipping()Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-eqz v0, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroid/view/View;->invalidate()V

    .line 43
    return-void

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p1}, Landroid/view/View;->invalidateOutline()V

    .line 47
    return-void
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

.method public shouldUseCompatClipping()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/android/material/shape/ShapeableDelegateV22;->canUseViewOutline:Z

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/google/android/material/shape/ShapeableDelegate;->forceCompatClippingEnabled:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 13
    return v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method
