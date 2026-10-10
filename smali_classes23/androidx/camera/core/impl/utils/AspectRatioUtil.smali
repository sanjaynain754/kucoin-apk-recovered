.class public final Landroidx/camera/core/impl/utils/AspectRatioUtil;
.super Ljava/lang/Object;
.source "AspectRatioUtil.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/core/impl/utils/AspectRatioUtil$CompareAspectRatiosByMappingAreaInFullFovAspectRatioSpace;
    }
.end annotation


# static fields
.field private static final ALIGN16:I = 0x10

.field public static final ASPECT_RATIO_16_9:Landroid/util/Rational;

.field public static final ASPECT_RATIO_3_4:Landroid/util/Rational;

.field public static final ASPECT_RATIO_4_3:Landroid/util/Rational;

.field public static final ASPECT_RATIO_9_16:Landroid/util/Rational;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    .line 2
    new-instance v0, Landroid/util/Rational;

    .line 3
    const/4 v1, 0x4

    .line 4
    const/4 v2, 0x3

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, v2}, Landroid/util/Rational;-><init>(II)V

    .line 8
    .line 9
    sput-object v0, Landroidx/camera/core/impl/utils/AspectRatioUtil;->ASPECT_RATIO_4_3:Landroid/util/Rational;

    .line 10
    .line 11
    new-instance v0, Landroid/util/Rational;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v2, v1}, Landroid/util/Rational;-><init>(II)V

    .line 15
    .line 16
    sput-object v0, Landroidx/camera/core/impl/utils/AspectRatioUtil;->ASPECT_RATIO_3_4:Landroid/util/Rational;

    .line 17
    .line 18
    new-instance v0, Landroid/util/Rational;

    .line 19
    .line 20
    const/16 v1, 0x10

    .line 21
    .line 22
    const/16 v2, 0x9

    .line 23
    .line 24
    .line 25
    invoke-direct {v0, v1, v2}, Landroid/util/Rational;-><init>(II)V

    .line 26
    .line 27
    sput-object v0, Landroidx/camera/core/impl/utils/AspectRatioUtil;->ASPECT_RATIO_16_9:Landroid/util/Rational;

    .line 28
    .line 29
    new-instance v0, Landroid/util/Rational;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, v2, v1}, Landroid/util/Rational;-><init>(II)V

    .line 33
    .line 34
    sput-object v0, Landroidx/camera/core/impl/utils/AspectRatioUtil;->ASPECT_RATIO_9_16:Landroid/util/Rational;

    .line 35
    return-void
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

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static hasMatchingAspectRatio(Landroid/util/Size;Landroid/util/Rational;)Z
    .locals 1

    .line 1
    sget-object v0, Landroidx/camera/core/internal/utils/SizeUtil;->RESOLUTION_VGA:Landroid/util/Size;

    invoke-static {p0, p1, v0}, Landroidx/camera/core/impl/utils/AspectRatioUtil;->hasMatchingAspectRatio(Landroid/util/Size;Landroid/util/Rational;Landroid/util/Size;)Z

    move-result p0

    return p0
.end method

.method public static hasMatchingAspectRatio(Landroid/util/Size;Landroid/util/Rational;Landroid/util/Size;)Z
    .locals 4

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 2
    :cond_0
    new-instance v1, Landroid/util/Rational;

    .line 3
    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    move-result v2

    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    move-result v3

    invoke-direct {v1, v2, v3}, Landroid/util/Rational;-><init>(II)V

    .line 4
    invoke-virtual {p1, v1}, Landroid/util/Rational;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    return p0

    .line 5
    :cond_1
    invoke-static {p0}, Landroidx/camera/core/internal/utils/SizeUtil;->getArea(Landroid/util/Size;)I

    move-result v1

    invoke-static {p2}, Landroidx/camera/core/internal/utils/SizeUtil;->getArea(Landroid/util/Size;)I

    move-result p2

    if-lt v1, p2, :cond_2

    .line 6
    invoke-static {p0, p1}, Landroidx/camera/core/impl/utils/AspectRatioUtil;->isPossibleMod16FromAspectRatio(Landroid/util/Size;Landroid/util/Rational;)Z

    move-result p0

    return p0

    :cond_2
    return v0
.end method

.method private static isPossibleMod16FromAspectRatio(Landroid/util/Size;Landroid/util/Rational;)Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/util/Size;->getWidth()I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroid/util/Size;->getHeight()I

    .line 8
    move-result p0

    .line 9
    .line 10
    new-instance v1, Landroid/util/Rational;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroid/util/Rational;->getDenominator()I

    .line 14
    move-result v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Landroid/util/Rational;->getNumerator()I

    .line 18
    move-result v3

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, v2, v3}, Landroid/util/Rational;-><init>(II)V

    .line 22
    .line 23
    rem-int/lit8 v2, v0, 0x10

    .line 24
    const/4 v3, 0x0

    .line 25
    .line 26
    if-nez v2, :cond_2

    .line 27
    .line 28
    rem-int/lit8 v4, p0, 0x10

    .line 29
    .line 30
    if-nez v4, :cond_2

    .line 31
    .line 32
    add-int/lit8 v2, p0, -0x10

    .line 33
    .line 34
    .line 35
    invoke-static {v3, v2}, Ljava/lang/Math;->max(II)I

    .line 36
    move-result v2

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v0, p1}, Landroidx/camera/core/impl/utils/AspectRatioUtil;->ratioIntersectsMod16Segment(IILandroid/util/Rational;)Z

    .line 40
    move-result p1

    .line 41
    .line 42
    if-nez p1, :cond_1

    .line 43
    .line 44
    add-int/lit8 v0, v0, -0x10

    .line 45
    .line 46
    .line 47
    invoke-static {v3, v0}, Ljava/lang/Math;->max(II)I

    .line 48
    move-result p1

    .line 49
    .line 50
    .line 51
    invoke-static {p1, p0, v1}, Landroidx/camera/core/impl/utils/AspectRatioUtil;->ratioIntersectsMod16Segment(IILandroid/util/Rational;)Z

    .line 52
    move-result p0

    .line 53
    .line 54
    if-eqz p0, :cond_0

    .line 55
    goto :goto_0

    .line 56
    :cond_0
    return v3

    .line 57
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 58
    return p0

    .line 59
    .line 60
    :cond_2
    if-nez v2, :cond_3

    .line 61
    .line 62
    .line 63
    invoke-static {p0, v0, p1}, Landroidx/camera/core/impl/utils/AspectRatioUtil;->ratioIntersectsMod16Segment(IILandroid/util/Rational;)Z

    .line 64
    move-result p0

    .line 65
    return p0

    .line 66
    .line 67
    :cond_3
    rem-int/lit8 p1, p0, 0x10

    .line 68
    .line 69
    if-nez p1, :cond_4

    .line 70
    .line 71
    .line 72
    invoke-static {v0, p0, v1}, Landroidx/camera/core/impl/utils/AspectRatioUtil;->ratioIntersectsMod16Segment(IILandroid/util/Rational;)Z

    .line 73
    move-result p0

    .line 74
    return p0

    .line 75
    :cond_4
    return v3
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
.end method

.method private static ratioIntersectsMod16Segment(IILandroid/util/Rational;)Z
    .locals 7

    .line 1
    .line 2
    rem-int/lit8 v0, p1, 0x10

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    move v0, v1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    move v0, v2

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0}, Landroidx/core/util/Preconditions;->checkArgument(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Landroid/util/Rational;->getNumerator()I

    .line 16
    move-result v0

    .line 17
    mul-int/2addr p0, v0

    .line 18
    int-to-double v3, p0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Landroid/util/Rational;->getDenominator()I

    .line 22
    move-result p0

    .line 23
    int-to-double v5, p0

    .line 24
    div-double/2addr v3, v5

    .line 25
    .line 26
    add-int/lit8 p0, p1, -0x10

    .line 27
    .line 28
    .line 29
    invoke-static {v2, p0}, Ljava/lang/Math;->max(II)I

    .line 30
    move-result p0

    .line 31
    int-to-double v5, p0

    .line 32
    .line 33
    cmpl-double p0, v3, v5

    .line 34
    .line 35
    if-lez p0, :cond_1

    .line 36
    .line 37
    add-int/lit8 p1, p1, 0x10

    .line 38
    int-to-double p0, p1

    .line 39
    .line 40
    cmpg-double p0, v3, p0

    .line 41
    .line 42
    if-gez p0, :cond_1

    .line 43
    return v1

    .line 44
    :cond_1
    return v2
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
.end method
