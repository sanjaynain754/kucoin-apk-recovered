.class public final Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;
.super Ljava/lang/Object;
.source "AspectRatioUtil.java"

# interfaces
.implements Ljava/util/Comparator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/camera/core/impl/utils/AspectRatioUtil;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Ljava/util/Comparator<",
        "Landroid/util/Rational;",
        ">;"
    }
.end annotation


# instance fields
.field private final mFullFovRatio:Landroid/util/Rational;

.field private final mTargetRatio:Landroid/util/Rational;

.field private final mTransformedMappingArea:Landroid/graphics/RectF;


# direct methods
.method public constructor <init>(Landroid/util/Rational;Landroid/util/Rational;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mTargetRatio:Landroid/util/Rational;

    .line 6
    .line 7
    if-eqz p2, :cond_0

    .line 8
    goto :goto_0

    .line 9
    .line 10
    :cond_0
    new-instance p2, Landroid/util/Rational;

    .line 11
    const/4 v0, 0x4

    .line 12
    const/4 v1, 0x3

    .line 13
    .line 14
    .line 15
    invoke-direct {p2, v0, v1}, Landroid/util/Rational;-><init>(II)V

    .line 16
    .line 17
    :goto_0
    iput-object p2, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mFullFovRatio:Landroid/util/Rational;

    .line 18
    .line 19
    .line 20
    invoke-direct {p0, p1}, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->getTransformedMappingArea(Landroid/util/Rational;)Landroid/graphics/RectF;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    iput-object p1, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mTransformedMappingArea:Landroid/graphics/RectF;

    .line 24
    return-void
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
.end method

.method private getMappingAreaSize(Landroid/graphics/RectF;)F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 8
    move-result p1

    .line 9
    mul-float/2addr v0, p1

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
.end method

.method private getOverlappingAreaSize(Landroid/graphics/RectF;Landroid/graphics/RectF;)F
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 8
    move-result v1

    .line 9
    .line 10
    cmpg-float v0, v0, v1

    .line 11
    .line 12
    if-gez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 16
    move-result v0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 21
    move-result v0

    .line 22
    .line 23
    .line 24
    :goto_0
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 25
    move-result v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 29
    move-result v2

    .line 30
    .line 31
    cmpg-float v1, v1, v2

    .line 32
    .line 33
    if-gez v1, :cond_1

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 37
    move-result p1

    .line 38
    goto :goto_1

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 42
    move-result p1

    .line 43
    :goto_1
    mul-float/2addr v0, p1

    .line 44
    return v0
    .line 45
.end method

.method private getTransformedMappingArea(Landroid/util/Rational;)Landroid/graphics/RectF;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    .line 4
    move-result v0

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mFullFovRatio:Landroid/util/Rational;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v1}, Landroid/util/Rational;->floatValue()F

    .line 10
    move-result v1

    .line 11
    .line 12
    cmpl-float v0, v0, v1

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    new-instance p1, Landroid/graphics/RectF;

    .line 18
    .line 19
    iget-object v0, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mFullFovRatio:Landroid/util/Rational;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/util/Rational;->getNumerator()I

    .line 23
    move-result v0

    .line 24
    int-to-float v0, v0

    .line 25
    .line 26
    iget-object v2, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mFullFovRatio:Landroid/util/Rational;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v2}, Landroid/util/Rational;->getDenominator()I

    .line 30
    move-result v2

    .line 31
    int-to-float v2, v2

    .line 32
    .line 33
    .line 34
    invoke-direct {p1, v1, v1, v0, v2}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 35
    return-object p1

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-virtual {p1}, Landroid/util/Rational;->floatValue()F

    .line 39
    move-result v0

    .line 40
    .line 41
    iget-object v2, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mFullFovRatio:Landroid/util/Rational;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v2}, Landroid/util/Rational;->floatValue()F

    .line 45
    move-result v2

    .line 46
    .line 47
    cmpl-float v0, v0, v2

    .line 48
    .line 49
    if-lez v0, :cond_1

    .line 50
    .line 51
    new-instance v0, Landroid/graphics/RectF;

    .line 52
    .line 53
    iget-object v2, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mFullFovRatio:Landroid/util/Rational;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v2}, Landroid/util/Rational;->getNumerator()I

    .line 57
    move-result v2

    .line 58
    int-to-float v2, v2

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    .line 62
    move-result v3

    .line 63
    int-to-float v3, v3

    .line 64
    .line 65
    iget-object v4, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mFullFovRatio:Landroid/util/Rational;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v4}, Landroid/util/Rational;->getNumerator()I

    .line 69
    move-result v4

    .line 70
    int-to-float v4, v4

    .line 71
    mul-float/2addr v3, v4

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/util/Rational;->getNumerator()I

    .line 75
    move-result p1

    .line 76
    int-to-float p1, p1

    .line 77
    div-float/2addr v3, p1

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, v1, v1, v2, v3}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 81
    return-object v0

    .line 82
    .line 83
    :cond_1
    new-instance v0, Landroid/graphics/RectF;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p1}, Landroid/util/Rational;->getNumerator()I

    .line 87
    move-result v2

    .line 88
    int-to-float v2, v2

    .line 89
    .line 90
    iget-object v3, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mFullFovRatio:Landroid/util/Rational;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v3}, Landroid/util/Rational;->getDenominator()I

    .line 94
    move-result v3

    .line 95
    int-to-float v3, v3

    .line 96
    mul-float/2addr v2, v3

    .line 97
    .line 98
    .line 99
    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    .line 100
    move-result p1

    .line 101
    int-to-float p1, p1

    .line 102
    div-float/2addr v2, p1

    .line 103
    .line 104
    iget-object p1, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mFullFovRatio:Landroid/util/Rational;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    .line 108
    move-result p1

    .line 109
    int-to-float p1, p1

    .line 110
    .line 111
    .line 112
    invoke-direct {v0, v1, v1, v2, p1}, Landroid/graphics/RectF;-><init>(FFFF)V

    .line 113
    return-object v0
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
.end method

.method private isMappingAreaCovered(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroid/graphics/RectF;->width()F

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p2}, Landroid/graphics/RectF;->width()F

    .line 8
    move-result v1

    .line 9
    .line 10
    cmpl-float v0, v0, v1

    .line 11
    .line 12
    if-ltz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/graphics/RectF;->height()F

    .line 16
    move-result p1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Landroid/graphics/RectF;->height()F

    .line 20
    move-result p2

    .line 21
    .line 22
    cmpl-float p1, p1, p2

    .line 23
    .line 24
    if-ltz p1, :cond_0

    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_0
    const/4 p1, 0x0

    .line 28
    return p1
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
.end method


# virtual methods
.method public compare(Landroid/util/Rational;Landroid/util/Rational;)I
    .locals 2

    .line 2
    invoke-virtual {p1, p2}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 3
    :cond_0
    invoke-direct {p0, p1}, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->getTransformedMappingArea(Landroid/util/Rational;)Landroid/graphics/RectF;

    move-result-object p1

    .line 4
    invoke-direct {p0, p2}, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->getTransformedMappingArea(Landroid/util/Rational;)Landroid/graphics/RectF;

    move-result-object p2

    .line 5
    iget-object v0, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mTransformedMappingArea:Landroid/graphics/RectF;

    invoke-direct {p0, p1, v0}, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->isMappingAreaCovered(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    move-result v0

    .line 6
    iget-object v1, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mTransformedMappingArea:Landroid/graphics/RectF;

    invoke-direct {p0, p2, v1}, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->isMappingAreaCovered(Landroid/graphics/RectF;Landroid/graphics/RectF;)Z

    move-result v1

    if-eqz v0, :cond_1

    if-eqz v1, :cond_1

    .line 7
    invoke-direct {p0, p1}, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->getMappingAreaSize(Landroid/graphics/RectF;)F

    move-result p1

    invoke-direct {p0, p2}, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->getMappingAreaSize(Landroid/graphics/RectF;)F

    move-result p2

    sub-float/2addr p1, p2

    .line 8
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    float-to-int p1, p1

    return p1

    :cond_1
    if-eqz v0, :cond_2

    const/4 p1, -0x1

    return p1

    :cond_2
    if-eqz v1, :cond_3

    const/4 p1, 0x1

    return p1

    .line 9
    :cond_3
    iget-object v0, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mTransformedMappingArea:Landroid/graphics/RectF;

    invoke-direct {p0, p1, v0}, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->getOverlappingAreaSize(Landroid/graphics/RectF;Landroid/graphics/RectF;)F

    move-result p1

    .line 10
    iget-object v0, p0, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->mTransformedMappingArea:Landroid/graphics/RectF;

    invoke-direct {p0, p2, v0}, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->getOverlappingAreaSize(Landroid/graphics/RectF;Landroid/graphics/RectF;)F

    move-result p2

    sub-float/2addr p1, p2

    .line 11
    invoke-static {p1}, Ljava/lang/Math;->signum(F)F

    move-result p1

    float-to-int p1, p1

    neg-int p1, p1

    return p1
.end method

.method public bridge synthetic compare(Ljava/lang/Object;Ljava/lang/Object;)I
    .locals 0

    .line 1
    check-cast p1, Landroid/util/Rational;

    check-cast p2, Landroid/util/Rational;

    invoke-virtual {p0, p1, p2}, Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;->compare(Landroid/util/Rational;Landroid/util/Rational;)I

    move-result p1

    return p1
.end method
