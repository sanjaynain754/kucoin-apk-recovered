.class public final Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig$Companion;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0016\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0008J\u000c\u0010\t\u001a\u00020\n*\u00020\nH\u0002\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig$Companion;",
        "",
        "()V",
        "from",
        "Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;",
        "context",
        "Landroid/content/Context;",
        "sessionReplay",
        "Lcom/tencent/bugly/common/replay/BuglyReplayOptions;",
        "adjustToBlockSize",
        "",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig$Companion;-><init>()V

    return-void
.end method

.method private final adjustToBlockSize(I)I
    .locals 2

    .line 1
    .line 2
    rem-int/lit8 v0, p1, 0x10

    .line 3
    .line 4
    const/16 v1, 0x8

    .line 5
    .line 6
    if-gt v0, v1, :cond_0

    .line 7
    sub-int/2addr p1, v0

    .line 8
    return p1

    .line 9
    .line 10
    :cond_0
    rsub-int/lit8 v0, v0, 0x10

    .line 11
    add-int/2addr v0, p1

    .line 12
    return v0
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


# virtual methods
.method public final from(Landroid/content/Context;Lcom/tencent/bugly/common/replay/BuglyReplayOptions;)Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;
    .locals 9
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/tencent/bugly/common/replay/BuglyReplayOptions;
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
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "sessionReplay"

    .line 9
    .line 10
    .line 11
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    const-string/jumbo v0, "window"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast v0, Landroid/view/WindowManager;

    .line 23
    .line 24
    sget-object v1, Lcom/tencent/bugly/common/utils/AndroidVersion;->Companion:Lcom/tencent/bugly/common/utils/AndroidVersion$Companion;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Lcom/tencent/bugly/common/utils/AndroidVersion$Companion;->isOverR()Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-eqz v1, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lm0/a;->a(Landroid/view/WindowManager;)Landroid/view/WindowMetrics;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {v0}, Landroidx/window/layout/c;->a(Landroid/view/WindowMetrics;)Landroid/graphics/Rect;

    .line 38
    move-result-object v0

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_0
    new-instance v1, Landroid/graphics/Point;

    .line 42
    .line 43
    .line 44
    invoke-direct {v1}, Landroid/graphics/Point;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {v0}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Landroid/view/Display;->getRealSize(Landroid/graphics/Point;)V

    .line 52
    .line 53
    new-instance v0, Landroid/graphics/Rect;

    .line 54
    .line 55
    iget v2, v1, Landroid/graphics/Point;->x:I

    .line 56
    .line 57
    iget v1, v1, Landroid/graphics/Point;->y:I

    .line 58
    const/4 v3, 0x0

    .line 59
    .line 60
    .line 61
    invoke-direct {v0, v3, v3, v2, v1}, Landroid/graphics/Rect;-><init>(IIII)V

    .line 62
    .line 63
    :goto_0
    const-string v1, "if (AndroidVersion.isOve\u2026enBounds.y)\n            }"

    .line 64
    .line 65
    .line 66
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 70
    move-result v1

    .line 71
    int-to-float v1, v1

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    .line 78
    invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 79
    move-result-object v2

    .line 80
    .line 81
    iget v2, v2, Landroid/util/DisplayMetrics;->density:F

    .line 82
    div-float/2addr v1, v2

    .line 83
    .line 84
    .line 85
    invoke-virtual {p2}, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->getQuality()Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    .line 86
    move-result-object v2

    .line 87
    .line 88
    iget v2, v2, Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;->sizeScale:F

    .line 89
    mul-float/2addr v1, v2

    .line 90
    .line 91
    .line 92
    invoke-static {v1}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 93
    move-result v1

    .line 94
    .line 95
    .line 96
    invoke-direct {p0, v1}, Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig$Companion;->adjustToBlockSize(I)I

    .line 97
    move-result v1

    .line 98
    .line 99
    .line 100
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    .line 104
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 105
    move-result v2

    .line 106
    int-to-float v2, v2

    .line 107
    .line 108
    .line 109
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 110
    move-result-object p1

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    iget p1, p1, Landroid/util/DisplayMetrics;->density:F

    .line 117
    div-float/2addr v2, p1

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->getQuality()Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    .line 121
    move-result-object p1

    .line 122
    .line 123
    iget p1, p1, Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;->sizeScale:F

    .line 124
    mul-float/2addr v2, p1

    .line 125
    .line 126
    .line 127
    invoke-static {v2}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 128
    move-result p1

    .line 129
    .line 130
    .line 131
    invoke-direct {p0, p1}, Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig$Companion;->adjustToBlockSize(I)I

    .line 132
    move-result p1

    .line 133
    .line 134
    .line 135
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    .line 139
    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 140
    move-result-object p1

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Lkotlin/Pair;->component1()Ljava/lang/Object;

    .line 144
    move-result-object v1

    .line 145
    .line 146
    check-cast v1, Ljava/lang/Number;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 150
    move-result v4

    .line 151
    .line 152
    .line 153
    invoke-virtual {p1}, Lkotlin/Pair;->component2()Ljava/lang/Object;

    .line 154
    move-result-object p1

    .line 155
    .line 156
    check-cast p1, Ljava/lang/Number;

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 160
    move-result v3

    .line 161
    .line 162
    new-instance v2, Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;

    .line 163
    int-to-float p1, v3

    .line 164
    .line 165
    .line 166
    invoke-virtual {v0}, Landroid/graphics/Rect;->width()I

    .line 167
    move-result v1

    .line 168
    int-to-float v1, v1

    .line 169
    .line 170
    div-float v5, p1, v1

    .line 171
    int-to-float p1, v4

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0}, Landroid/graphics/Rect;->height()I

    .line 175
    move-result v0

    .line 176
    int-to-float v0, v0

    .line 177
    .line 178
    div-float v6, p1, v0

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2}, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->getFrameRate()I

    .line 182
    move-result v7

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2}, Lcom/tencent/bugly/common/replay/BuglyReplayOptions;->getQuality()Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;

    .line 186
    move-result-object p1

    .line 187
    .line 188
    iget v8, p1, Lcom/tencent/bugly/common/replay/BuglyReplayOptions$BuglyReplayQuality;->bitRate:I

    .line 189
    .line 190
    .line 191
    invoke-direct/range {v2 .. v8}, Lcom/tencent/bugly/common/replay/ScreenshotRecorderConfig;-><init>(IIFFII)V

    .line 192
    return-object v2

    .line 193
    .line 194
    :cond_1
    new-instance p1, Ljava/lang/NullPointerException;

    .line 195
    .line 196
    .line 197
    const-string/jumbo p2, "null cannot be cast to non-null type android.view.WindowManager"

    .line 198
    .line 199
    .line 200
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 201
    throw p1
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
