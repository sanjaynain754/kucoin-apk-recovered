.class public final Lcom/facebook/react/uimanager/style/BorderColors;
.super Ljava/lang/Object;
.source "BorderColors.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u0008\u0081@\u0018\u00002\u00020\u0001B\u0019\u0012\u0010\u0008\u0003\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u001d\u0010\n\u001a\u00020\u000b2\u0006\u0010\u000c\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u000e\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J\u001a\u0010\u0011\u001a\u00020\u00122\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001\u00a2\u0006\u0004\u0008\u001b\u0010\u001cR\u001b\u0010\u0002\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003\u00a2\u0006\n\n\u0002\u0010\t\u001a\u0004\u0008\u0007\u0010\u0008\u0088\u0001\u0002\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/facebook/react/uimanager/style/BorderColors;",
        "",
        "edgeColors",
        "",
        "",
        "constructor-impl",
        "([Ljava/lang/Integer;)[Ljava/lang/Integer;",
        "getEdgeColors",
        "()[Ljava/lang/Integer;",
        "[Ljava/lang/Integer;",
        "resolve",
        "Lcom/facebook/react/uimanager/style/ColorEdges;",
        "layoutDirection",
        "context",
        "Landroid/content/Context;",
        "resolve-impl",
        "([Ljava/lang/Integer;ILandroid/content/Context;)Lcom/facebook/react/uimanager/style/ColorEdges;",
        "equals",
        "",
        "other",
        "equals-impl",
        "([Ljava/lang/Integer;Ljava/lang/Object;)Z",
        "hashCode",
        "hashCode-impl",
        "([Ljava/lang/Integer;)I",
        "toString",
        "",
        "toString-impl",
        "([Ljava/lang/Integer;)Ljava/lang/String;",
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

.annotation runtime Lkotlin/jvm/JvmInline;
.end annotation


# instance fields
.field private final edgeColors:[Ljava/lang/Integer;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method private synthetic constructor <init>([Ljava/lang/Integer;)V
    .locals 0
    .param p1    # [Ljava/lang/Integer;
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/react/uimanager/style/BorderColors;->edgeColors:[Ljava/lang/Integer;

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
.end method

.method public static final synthetic box-impl([Ljava/lang/Integer;)Lcom/facebook/react/uimanager/style/BorderColors;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/facebook/react/uimanager/style/BorderColors;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/facebook/react/uimanager/style/BorderColors;-><init>([Ljava/lang/Integer;)V

    .line 6
    return-object v0
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

.method public static constructor-impl([Ljava/lang/Integer;)[Ljava/lang/Integer;
    .locals 1
    .param p0    # [Ljava/lang/Integer;
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation

        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "edgeColors"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    return-object p0
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

.method public static synthetic constructor-impl$default([Ljava/lang/Integer;ILkotlin/jvm/internal/DefaultConstructorMarker;)[Ljava/lang/Integer;
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p1, p1, 0x1

    .line 3
    .line 4
    if-eqz p1, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lcom/facebook/react/uimanager/style/LogicalEdge;->values()[Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 8
    move-result-object p0

    .line 9
    array-length p0, p0

    .line 10
    .line 11
    new-array p0, p0, [Ljava/lang/Integer;

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {p0}, Lcom/facebook/react/uimanager/style/BorderColors;->constructor-impl([Ljava/lang/Integer;)[Ljava/lang/Integer;

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
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
.end method

.method public static equals-impl([Ljava/lang/Integer;Ljava/lang/Object;)Z
    .locals 2

    .line 1
    .line 2
    instance-of v0, p1, Lcom/facebook/react/uimanager/style/BorderColors;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    :cond_0
    check-cast p1, Lcom/facebook/react/uimanager/style/BorderColors;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/facebook/react/uimanager/style/BorderColors;->unbox-impl()[Ljava/lang/Integer;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    move-result p0

    .line 17
    .line 18
    if-nez p0, :cond_1

    .line 19
    return v1

    .line 20
    :cond_1
    const/4 p0, 0x1

    .line 21
    return p0
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
.end method

.method public static final equals-impl0([Ljava/lang/Integer;[Ljava/lang/Integer;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static hashCode-impl([Ljava/lang/Integer;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Arrays;->hashCode([Ljava/lang/Object;)I

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static final resolve-impl([Ljava/lang/Integer;ILandroid/content/Context;)Lcom/facebook/react/uimanager/style/ColorEdges;
    .locals 4
    .param p2    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "context"

    .line 3
    .line 4
    .line 5
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const/high16 v0, -0x1000000

    .line 8
    .line 9
    if-eqz p1, :cond_26

    .line 10
    const/4 v1, 0x1

    .line 11
    .line 12
    if-ne p1, v1, :cond_25

    .line 13
    .line 14
    sget-object p1, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->Companion:Lcom/facebook/react/modules/i18nmanager/I18nUtil$Companion;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/facebook/react/modules/i18nmanager/I18nUtil$Companion;->getInstance()Lcom/facebook/react/modules/i18nmanager/I18nUtil;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Lcom/facebook/react/modules/i18nmanager/I18nUtil;->doLeftAndRightSwapInRTL(Landroid/content/Context;)Z

    .line 22
    move-result p1

    .line 23
    .line 24
    if-eqz p1, :cond_12

    .line 25
    .line 26
    new-instance p1, Lcom/facebook/react/uimanager/style/ColorEdges;

    .line 27
    .line 28
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 32
    move-result p2

    .line 33
    .line 34
    aget-object p2, p0, p2

    .line 35
    .line 36
    if-eqz p2, :cond_0

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 40
    move-result p2

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_0
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->RIGHT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 47
    move-result p2

    .line 48
    .line 49
    aget-object p2, p0, p2

    .line 50
    .line 51
    if-eqz p2, :cond_1

    .line 52
    goto :goto_0

    .line 53
    .line 54
    :cond_1
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 58
    move-result p2

    .line 59
    .line 60
    aget-object p2, p0, p2

    .line 61
    .line 62
    if-eqz p2, :cond_2

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :cond_2
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 69
    move-result p2

    .line 70
    .line 71
    aget-object p2, p0, p2

    .line 72
    .line 73
    if-eqz p2, :cond_3

    .line 74
    goto :goto_0

    .line 75
    :cond_3
    move p2, v0

    .line 76
    .line 77
    :goto_1
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 81
    move-result v1

    .line 82
    .line 83
    aget-object v1, p0, v1

    .line 84
    .line 85
    if-eqz v1, :cond_4

    .line 86
    .line 87
    .line 88
    :goto_2
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 89
    move-result v1

    .line 90
    goto :goto_3

    .line 91
    .line 92
    :cond_4
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->TOP:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 96
    move-result v1

    .line 97
    .line 98
    aget-object v1, p0, v1

    .line 99
    .line 100
    if-eqz v1, :cond_5

    .line 101
    goto :goto_2

    .line 102
    .line 103
    :cond_5
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 107
    move-result v1

    .line 108
    .line 109
    aget-object v1, p0, v1

    .line 110
    .line 111
    if-eqz v1, :cond_6

    .line 112
    goto :goto_2

    .line 113
    .line 114
    :cond_6
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 118
    move-result v1

    .line 119
    .line 120
    aget-object v1, p0, v1

    .line 121
    .line 122
    if-eqz v1, :cond_7

    .line 123
    goto :goto_2

    .line 124
    .line 125
    :cond_7
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 129
    move-result v1

    .line 130
    .line 131
    aget-object v1, p0, v1

    .line 132
    .line 133
    if-eqz v1, :cond_8

    .line 134
    goto :goto_2

    .line 135
    :cond_8
    move v1, v0

    .line 136
    .line 137
    :goto_3
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 138
    .line 139
    .line 140
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 141
    move-result v2

    .line 142
    .line 143
    aget-object v2, p0, v2

    .line 144
    .line 145
    if-eqz v2, :cond_9

    .line 146
    .line 147
    .line 148
    :goto_4
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 149
    move-result v2

    .line 150
    goto :goto_5

    .line 151
    .line 152
    :cond_9
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->LEFT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 156
    move-result v2

    .line 157
    .line 158
    aget-object v2, p0, v2

    .line 159
    .line 160
    if-eqz v2, :cond_a

    .line 161
    goto :goto_4

    .line 162
    .line 163
    :cond_a
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 164
    .line 165
    .line 166
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 167
    move-result v2

    .line 168
    .line 169
    aget-object v2, p0, v2

    .line 170
    .line 171
    if-eqz v2, :cond_b

    .line 172
    goto :goto_4

    .line 173
    .line 174
    :cond_b
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 178
    move-result v2

    .line 179
    .line 180
    aget-object v2, p0, v2

    .line 181
    .line 182
    if-eqz v2, :cond_c

    .line 183
    goto :goto_4

    .line 184
    :cond_c
    move v2, v0

    .line 185
    .line 186
    :goto_5
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 190
    move-result v3

    .line 191
    .line 192
    aget-object v3, p0, v3

    .line 193
    .line 194
    if-eqz v3, :cond_d

    .line 195
    .line 196
    .line 197
    :goto_6
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 198
    move-result v0

    .line 199
    goto :goto_7

    .line 200
    .line 201
    :cond_d
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BOTTOM:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 202
    .line 203
    .line 204
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 205
    move-result v3

    .line 206
    .line 207
    aget-object v3, p0, v3

    .line 208
    .line 209
    if-eqz v3, :cond_e

    .line 210
    goto :goto_6

    .line 211
    .line 212
    :cond_e
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 216
    move-result v3

    .line 217
    .line 218
    aget-object v3, p0, v3

    .line 219
    .line 220
    if-eqz v3, :cond_f

    .line 221
    goto :goto_6

    .line 222
    .line 223
    :cond_f
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 224
    .line 225
    .line 226
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 227
    move-result v3

    .line 228
    .line 229
    aget-object v3, p0, v3

    .line 230
    .line 231
    if-eqz v3, :cond_10

    .line 232
    goto :goto_6

    .line 233
    .line 234
    :cond_10
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 235
    .line 236
    .line 237
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 238
    move-result v3

    .line 239
    .line 240
    aget-object p0, p0, v3

    .line 241
    .line 242
    if-eqz p0, :cond_11

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 246
    move-result v0

    .line 247
    .line 248
    .line 249
    :cond_11
    :goto_7
    invoke-direct {p1, p2, v1, v2, v0}, Lcom/facebook/react/uimanager/style/ColorEdges;-><init>(IIII)V

    .line 250
    return-object p1

    .line 251
    .line 252
    :cond_12
    new-instance p1, Lcom/facebook/react/uimanager/style/ColorEdges;

    .line 253
    .line 254
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 255
    .line 256
    .line 257
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 258
    move-result p2

    .line 259
    .line 260
    aget-object p2, p0, p2

    .line 261
    .line 262
    if-eqz p2, :cond_13

    .line 263
    .line 264
    .line 265
    :goto_8
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 266
    move-result p2

    .line 267
    goto :goto_9

    .line 268
    .line 269
    :cond_13
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->LEFT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 270
    .line 271
    .line 272
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 273
    move-result p2

    .line 274
    .line 275
    aget-object p2, p0, p2

    .line 276
    .line 277
    if-eqz p2, :cond_14

    .line 278
    goto :goto_8

    .line 279
    .line 280
    :cond_14
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 281
    .line 282
    .line 283
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 284
    move-result p2

    .line 285
    .line 286
    aget-object p2, p0, p2

    .line 287
    .line 288
    if-eqz p2, :cond_15

    .line 289
    goto :goto_8

    .line 290
    .line 291
    :cond_15
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 292
    .line 293
    .line 294
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 295
    move-result p2

    .line 296
    .line 297
    aget-object p2, p0, p2

    .line 298
    .line 299
    if-eqz p2, :cond_16

    .line 300
    goto :goto_8

    .line 301
    :cond_16
    move p2, v0

    .line 302
    .line 303
    :goto_9
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 307
    move-result v1

    .line 308
    .line 309
    aget-object v1, p0, v1

    .line 310
    .line 311
    if-eqz v1, :cond_17

    .line 312
    .line 313
    .line 314
    :goto_a
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 315
    move-result v1

    .line 316
    goto :goto_b

    .line 317
    .line 318
    :cond_17
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->TOP:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 319
    .line 320
    .line 321
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 322
    move-result v1

    .line 323
    .line 324
    aget-object v1, p0, v1

    .line 325
    .line 326
    if-eqz v1, :cond_18

    .line 327
    goto :goto_a

    .line 328
    .line 329
    :cond_18
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 330
    .line 331
    .line 332
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 333
    move-result v1

    .line 334
    .line 335
    aget-object v1, p0, v1

    .line 336
    .line 337
    if-eqz v1, :cond_19

    .line 338
    goto :goto_a

    .line 339
    .line 340
    :cond_19
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 341
    .line 342
    .line 343
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 344
    move-result v1

    .line 345
    .line 346
    aget-object v1, p0, v1

    .line 347
    .line 348
    if-eqz v1, :cond_1a

    .line 349
    goto :goto_a

    .line 350
    .line 351
    :cond_1a
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 352
    .line 353
    .line 354
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 355
    move-result v1

    .line 356
    .line 357
    aget-object v1, p0, v1

    .line 358
    .line 359
    if-eqz v1, :cond_1b

    .line 360
    goto :goto_a

    .line 361
    :cond_1b
    move v1, v0

    .line 362
    .line 363
    :goto_b
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 364
    .line 365
    .line 366
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 367
    move-result v2

    .line 368
    .line 369
    aget-object v2, p0, v2

    .line 370
    .line 371
    if-eqz v2, :cond_1c

    .line 372
    .line 373
    .line 374
    :goto_c
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 375
    move-result v2

    .line 376
    goto :goto_d

    .line 377
    .line 378
    :cond_1c
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->RIGHT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 379
    .line 380
    .line 381
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 382
    move-result v2

    .line 383
    .line 384
    aget-object v2, p0, v2

    .line 385
    .line 386
    if-eqz v2, :cond_1d

    .line 387
    goto :goto_c

    .line 388
    .line 389
    :cond_1d
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 390
    .line 391
    .line 392
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 393
    move-result v2

    .line 394
    .line 395
    aget-object v2, p0, v2

    .line 396
    .line 397
    if-eqz v2, :cond_1e

    .line 398
    goto :goto_c

    .line 399
    .line 400
    :cond_1e
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 401
    .line 402
    .line 403
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 404
    move-result v2

    .line 405
    .line 406
    aget-object v2, p0, v2

    .line 407
    .line 408
    if-eqz v2, :cond_1f

    .line 409
    goto :goto_c

    .line 410
    :cond_1f
    move v2, v0

    .line 411
    .line 412
    :goto_d
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 416
    move-result v3

    .line 417
    .line 418
    aget-object v3, p0, v3

    .line 419
    .line 420
    if-eqz v3, :cond_20

    .line 421
    .line 422
    .line 423
    :goto_e
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 424
    move-result v0

    .line 425
    goto :goto_f

    .line 426
    .line 427
    :cond_20
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BOTTOM:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 428
    .line 429
    .line 430
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 431
    move-result v3

    .line 432
    .line 433
    aget-object v3, p0, v3

    .line 434
    .line 435
    if-eqz v3, :cond_21

    .line 436
    goto :goto_e

    .line 437
    .line 438
    :cond_21
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 439
    .line 440
    .line 441
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 442
    move-result v3

    .line 443
    .line 444
    aget-object v3, p0, v3

    .line 445
    .line 446
    if-eqz v3, :cond_22

    .line 447
    goto :goto_e

    .line 448
    .line 449
    :cond_22
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 450
    .line 451
    .line 452
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 453
    move-result v3

    .line 454
    .line 455
    aget-object v3, p0, v3

    .line 456
    .line 457
    if-eqz v3, :cond_23

    .line 458
    goto :goto_e

    .line 459
    .line 460
    :cond_23
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 461
    .line 462
    .line 463
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 464
    move-result v3

    .line 465
    .line 466
    aget-object p0, p0, v3

    .line 467
    .line 468
    if-eqz p0, :cond_24

    .line 469
    .line 470
    .line 471
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 472
    move-result v0

    .line 473
    .line 474
    .line 475
    :cond_24
    :goto_f
    invoke-direct {p1, p2, v1, v2, v0}, Lcom/facebook/react/uimanager/style/ColorEdges;-><init>(IIII)V

    .line 476
    return-object p1

    .line 477
    .line 478
    :cond_25
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 479
    .line 480
    const-string p1, "Expected resolved layout direction"

    .line 481
    .line 482
    .line 483
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 484
    throw p0

    .line 485
    .line 486
    :cond_26
    new-instance p1, Lcom/facebook/react/uimanager/style/ColorEdges;

    .line 487
    .line 488
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 489
    .line 490
    .line 491
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 492
    move-result p2

    .line 493
    .line 494
    aget-object p2, p0, p2

    .line 495
    .line 496
    if-eqz p2, :cond_27

    .line 497
    .line 498
    .line 499
    :goto_10
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 500
    move-result p2

    .line 501
    goto :goto_11

    .line 502
    .line 503
    :cond_27
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->LEFT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 504
    .line 505
    .line 506
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 507
    move-result p2

    .line 508
    .line 509
    aget-object p2, p0, p2

    .line 510
    .line 511
    if-eqz p2, :cond_28

    .line 512
    goto :goto_10

    .line 513
    .line 514
    :cond_28
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 515
    .line 516
    .line 517
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 518
    move-result p2

    .line 519
    .line 520
    aget-object p2, p0, p2

    .line 521
    .line 522
    if-eqz p2, :cond_29

    .line 523
    goto :goto_10

    .line 524
    .line 525
    :cond_29
    sget-object p2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 526
    .line 527
    .line 528
    invoke-virtual {p2}, Ljava/lang/Enum;->ordinal()I

    .line 529
    move-result p2

    .line 530
    .line 531
    aget-object p2, p0, p2

    .line 532
    .line 533
    if-eqz p2, :cond_2a

    .line 534
    goto :goto_10

    .line 535
    :cond_2a
    move p2, v0

    .line 536
    .line 537
    :goto_11
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_START:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 538
    .line 539
    .line 540
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 541
    move-result v1

    .line 542
    .line 543
    aget-object v1, p0, v1

    .line 544
    .line 545
    if-eqz v1, :cond_2b

    .line 546
    .line 547
    .line 548
    :goto_12
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 549
    move-result v1

    .line 550
    goto :goto_13

    .line 551
    .line 552
    :cond_2b
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->TOP:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 553
    .line 554
    .line 555
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 556
    move-result v1

    .line 557
    .line 558
    aget-object v1, p0, v1

    .line 559
    .line 560
    if-eqz v1, :cond_2c

    .line 561
    goto :goto_12

    .line 562
    .line 563
    :cond_2c
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 564
    .line 565
    .line 566
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 567
    move-result v1

    .line 568
    .line 569
    aget-object v1, p0, v1

    .line 570
    .line 571
    if-eqz v1, :cond_2d

    .line 572
    goto :goto_12

    .line 573
    .line 574
    :cond_2d
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 575
    .line 576
    .line 577
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 578
    move-result v1

    .line 579
    .line 580
    aget-object v1, p0, v1

    .line 581
    .line 582
    if-eqz v1, :cond_2e

    .line 583
    goto :goto_12

    .line 584
    .line 585
    :cond_2e
    sget-object v1, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 586
    .line 587
    .line 588
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 589
    move-result v1

    .line 590
    .line 591
    aget-object v1, p0, v1

    .line 592
    .line 593
    if-eqz v1, :cond_2f

    .line 594
    goto :goto_12

    .line 595
    :cond_2f
    move v1, v0

    .line 596
    .line 597
    :goto_13
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 598
    .line 599
    .line 600
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 601
    move-result v2

    .line 602
    .line 603
    aget-object v2, p0, v2

    .line 604
    .line 605
    if-eqz v2, :cond_30

    .line 606
    .line 607
    .line 608
    :goto_14
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 609
    move-result v2

    .line 610
    goto :goto_15

    .line 611
    .line 612
    :cond_30
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->RIGHT:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 613
    .line 614
    .line 615
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 616
    move-result v2

    .line 617
    .line 618
    aget-object v2, p0, v2

    .line 619
    .line 620
    if-eqz v2, :cond_31

    .line 621
    goto :goto_14

    .line 622
    .line 623
    :cond_31
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->HORIZONTAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 624
    .line 625
    .line 626
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 627
    move-result v2

    .line 628
    .line 629
    aget-object v2, p0, v2

    .line 630
    .line 631
    if-eqz v2, :cond_32

    .line 632
    goto :goto_14

    .line 633
    .line 634
    :cond_32
    sget-object v2, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 635
    .line 636
    .line 637
    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    .line 638
    move-result v2

    .line 639
    .line 640
    aget-object v2, p0, v2

    .line 641
    .line 642
    if-eqz v2, :cond_33

    .line 643
    goto :goto_14

    .line 644
    :cond_33
    move v2, v0

    .line 645
    .line 646
    :goto_15
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK_END:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 647
    .line 648
    .line 649
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 650
    move-result v3

    .line 651
    .line 652
    aget-object v3, p0, v3

    .line 653
    .line 654
    if-eqz v3, :cond_34

    .line 655
    .line 656
    .line 657
    :goto_16
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 658
    move-result v0

    .line 659
    goto :goto_17

    .line 660
    .line 661
    :cond_34
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BOTTOM:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 662
    .line 663
    .line 664
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 665
    move-result v3

    .line 666
    .line 667
    aget-object v3, p0, v3

    .line 668
    .line 669
    if-eqz v3, :cond_35

    .line 670
    goto :goto_16

    .line 671
    .line 672
    :cond_35
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->BLOCK:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 673
    .line 674
    .line 675
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 676
    move-result v3

    .line 677
    .line 678
    aget-object v3, p0, v3

    .line 679
    .line 680
    if-eqz v3, :cond_36

    .line 681
    goto :goto_16

    .line 682
    .line 683
    :cond_36
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->VERTICAL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 684
    .line 685
    .line 686
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 687
    move-result v3

    .line 688
    .line 689
    aget-object v3, p0, v3

    .line 690
    .line 691
    if-eqz v3, :cond_37

    .line 692
    goto :goto_16

    .line 693
    .line 694
    :cond_37
    sget-object v3, Lcom/facebook/react/uimanager/style/LogicalEdge;->ALL:Lcom/facebook/react/uimanager/style/LogicalEdge;

    .line 695
    .line 696
    .line 697
    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    .line 698
    move-result v3

    .line 699
    .line 700
    aget-object p0, p0, v3

    .line 701
    .line 702
    if-eqz p0, :cond_38

    .line 703
    .line 704
    .line 705
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 706
    move-result v0

    .line 707
    .line 708
    .line 709
    :cond_38
    :goto_17
    invoke-direct {p1, p2, v1, v2, v0}, Lcom/facebook/react/uimanager/style/ColorEdges;-><init>(IIII)V

    .line 710
    return-object p1
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
.end method

.method public static toString-impl([Ljava/lang/Integer;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v1, "BorderColors(edgeColors="

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const-string p0, ")"

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    return-object p0
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
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BorderColors;->edgeColors:[Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p1}, Lcom/facebook/react/uimanager/style/BorderColors;->equals-impl([Ljava/lang/Integer;Ljava/lang/Object;)Z

    .line 6
    move-result p1

    .line 7
    return p1
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

.method public final getEdgeColors()[Ljava/lang/Integer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BorderColors;->edgeColors:[Ljava/lang/Integer;

    .line 3
    return-object v0
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

.method public hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BorderColors;->edgeColors:[Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/uimanager/style/BorderColors;->hashCode-impl([Ljava/lang/Integer;)I

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
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BorderColors;->edgeColors:[Ljava/lang/Integer;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/facebook/react/uimanager/style/BorderColors;->toString-impl([Ljava/lang/Integer;)Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final synthetic unbox-impl()[Ljava/lang/Integer;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/uimanager/style/BorderColors;->edgeColors:[Ljava/lang/Integer;

    .line 3
    return-object v0
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
