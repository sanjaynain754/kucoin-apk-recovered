.class public final Lcom/facebook/react/views/view/ColorUtil;
.super Ljava/lang/Object;
.source "ColorUtil.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J(\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u0007H\u0007J\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u000c\u001a\u00020\u0007H\u0002\u00a8\u0006\r"
    }
    d2 = {
        "Lcom/facebook/react/views/view/ColorUtil;",
        "",
        "<init>",
        "()V",
        "normalize",
        "",
        "r",
        "",
        "g",
        "b",
        "a",
        "clamp255",
        "value",
        "ReactAndroid_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/facebook/react/views/view/ColorUtil;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/views/view/ColorUtil;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/facebook/react/views/view/ColorUtil;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/facebook/react/views/view/ColorUtil;->INSTANCE:Lcom/facebook/react/views/view/ColorUtil;

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
.end method

.method private final clamp255(D)I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xff

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p2}, Lkotlin/math/MathKt;->roundToInt(D)I

    .line 6
    move-result p1

    .line 7
    .line 8
    .line 9
    invoke-static {v0, p1}, Ljava/lang/Math;->min(II)I

    .line 10
    move-result p1

    .line 11
    const/4 p2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static {p2, p1}, Ljava/lang/Math;->max(II)I

    .line 15
    move-result p1

    .line 16
    return p1
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static final normalize(DDDD)I
    .locals 3
    .annotation runtime Lkotlin/jvm/JvmStatic;
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/facebook/react/views/view/ColorUtil;->INSTANCE:Lcom/facebook/react/views/view/ColorUtil;

    .line 3
    .line 4
    const/16 v1, 0xff

    .line 5
    int-to-double v1, v1

    .line 6
    mul-double/2addr p6, v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p6, p7}, Lcom/facebook/react/views/view/ColorUtil;->clamp255(D)I

    .line 10
    move-result p6

    .line 11
    .line 12
    shl-int/lit8 p6, p6, 0x18

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, p0, p1}, Lcom/facebook/react/views/view/ColorUtil;->clamp255(D)I

    .line 16
    move-result p0

    .line 17
    .line 18
    shl-int/lit8 p0, p0, 0x10

    .line 19
    or-int/2addr p0, p6

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, p2, p3}, Lcom/facebook/react/views/view/ColorUtil;->clamp255(D)I

    .line 23
    move-result p1

    .line 24
    .line 25
    shl-int/lit8 p1, p1, 0x8

    .line 26
    or-int/2addr p0, p1

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, p4, p5}, Lcom/facebook/react/views/view/ColorUtil;->clamp255(D)I

    .line 30
    move-result p1

    .line 31
    or-int/2addr p0, p1

    .line 32
    return p0
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
.end method
