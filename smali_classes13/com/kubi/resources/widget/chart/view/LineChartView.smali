.class public final Lcom/kubi/resources/widget/chart/view/LineChartView;
.super Lcom/kubi/resources/widget/chart/view/AxisChartView;
.source "LineChartView.kt"

# interfaces
.implements Llw/b;


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/resources/widget/chart/view/AxisChartView<",
        "Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;",
        ">;",
        "Llw/b;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003B\'\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ(\u0010\u000c\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\tH\u0014J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0015J\u001e\u0010\u0016\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0016J\u0006\u0010\u001c\u001a\u00020\u0015J\u001e\u0010\u001d\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001f2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0017J\u0010\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001bH\u0016J.\u0010\"\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010#\u001a\u00020\tH\u0016J\u0016\u0010$\u001a\u00020\r2\u000c\u0010%\u001a\u0008\u0012\u0004\u0012\u00020&0\u001aH\u0016J,\u0010\'\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\u00182\u000c\u0010(\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u001a2\u000c\u0010)\u001a\u0008\u0012\u0004\u0012\u00020\u00130\u001aH\u0016J\u001e\u0010*\u001a\u00020\r2\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\u000e\u0010+\u001a\u00020\t2\u0006\u0010,\u001a\u00020\u0015J\u000e\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\u0013J \u0010/\u001a\u00020\t2\u0006\u00100\u001a\u00020\t2\u0006\u00101\u001a\u00020\t2\u0006\u00102\u001a\u00020\u0013H\u0002J$\u00103\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001b2\u0006\u00104\u001a\u00020\u001b2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aJ\u001e\u00106\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001b2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u001e\u00107\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u001b2\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J&\u0010 \u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u00182\u000c\u00105\u001a\u0008\u0012\u0004\u0012\u00020\u001b0\u001aH\u0002J\u0018\u00108\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0018\u00109\u001a\u00020\r2\u0006\u0010!\u001a\u00020\u001b2\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0016\u0010:\u001a\u00020\r2\u000c\u0010;\u001a\u0008\u0012\u0004\u0012\u00020\u00180\u001aH\u0016J\u0010\u0010<\u001a\u00020\r2\u0006\u0010=\u001a\u00020>H\u0002R\u0014\u0010?\u001a\u00020@X\u0094\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008A\u0010B\u00a8\u0006C"
    }
    d2 = {
        "Lcom/kubi/resources/widget/chart/view/LineChartView;",
        "Lcom/kubi/resources/widget/chart/view/AxisChartView;",
        "Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;",
        "Lcom/kubi/resources/widget/chart/ChartContract$LineView;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "onSizeChanged",
        "",
        "w",
        "h",
        "oldw",
        "oldh",
        "lineThickness",
        "",
        "isSmoothEnabled",
        "",
        "drawBackgroundImage",
        "innerFrame",
        "Lcom/kubi/resources/widget/chart/data/Frame;",
        "points",
        "",
        "Lcom/kubi/resources/widget/chart/data/DataPoint;",
        "isUpGreen",
        "drawLine",
        "path",
        "Landroid/graphics/Path;",
        "drawSelectLine",
        "dataPoint",
        "drawLineBackground",
        "alpha",
        "drawLabels",
        "xLabels",
        "Lcom/kubi/resources/widget/chart/data/Label;",
        "drawGrid",
        "xLabelsPositions",
        "yLabelsPositions",
        "drawPoints",
        "getCircleColor",
        "isUp",
        "getAnimatedLineColor",
        "animationProgress",
        "interpolateColor",
        "startColor",
        "endColor",
        "fraction",
        "drawSelectPoint",
        "first",
        "allPoints",
        "getPointColorByPosition",
        "getLastPointColor",
        "drawTextTip",
        "drawInOutPoint",
        "drawDebugFrame",
        "frames",
        "handleAttributes",
        "typedArray",
        "Landroid/content/res/TypedArray;",
        "renderer",
        "Lcom/kubi/resources/widget/chart/ChartContract$Renderer;",
        "getRenderer",
        "()Lcom/kubi/resources/widget/chart/ChartContract$Renderer;",
        "LComponent_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nLineChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LineChartView.kt\ncom/kubi/resources/widget/chart/view/LineChartView\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,522:1\n1869#2,2:523\n1761#2,3:525\n1869#2,2:529\n1#3:528\n*S KotlinDebug\n*F\n+ 1 LineChartView.kt\ncom/kubi/resources/widget/chart/view/LineChartView\n*L\n183#1:523,2\n264#1:525,3\n478#1:529,2\n*E\n"
    }
.end annotation


# instance fields
.field public final n:Llw/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x6

    const/4 v6, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-direct/range {v1 .. v6}, Lcom/kubi/resources/widget/chart/view/LineChartView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;)V
    .locals 7
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-direct/range {v1 .. v6}, Lcom/kubi/resources/widget/chart/view/LineChartView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 4
    new-instance v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    invoke-direct {v0}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;-><init>()V

    .line 5
    invoke-direct {p0, p1, p2, p3, v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;ILow/a;)V

    .line 6
    new-instance p1, Lsw/b;

    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    move-result-object p3

    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    move-result-object v0

    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    invoke-direct {p1, p0, p3, v0}, Lsw/b;-><init>(Llw/b;Llw/h;Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;)V

    iput-object p1, p0, Lcom/kubi/resources/widget/chart/view/LineChartView;->n:Llw/c;

    .line 7
    sget-object p1, Lcom/kubi/sdk/res/R$styleable;->LineChartAttrs:[I

    const-string p3, "LineChartAttrs"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p2, p1}, Lqw/a;->a(Landroid/widget/FrameLayout;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/chart/view/LineChartView;->i(Landroid/content/res/TypedArray;)V

    .line 8
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->j()V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p5, p4, 0x2

    if-eqz p5, :cond_0

    const/4 p2, 0x0

    :cond_0
    and-int/lit8 p4, p4, 0x4

    if-eqz p4, :cond_1

    const/4 p3, 0x0

    .line 3
    :cond_1
    invoke-direct {p0, p1, p2, p3}, Lcom/kubi/resources/widget/chart/view/LineChartView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method


# virtual methods
.method public a(Ljava/util/List;Lnw/b;)V
    .locals 3
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lnw/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;",
            "Lnw/b;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "points"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "innerFrame"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->Y()Z

    .line 20
    move-result v0

    .line 21
    .line 22
    if-eqz v0, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-interface {p1}, Ljava/util/Collection;->isEmpty()Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-nez v0, :cond_0

    .line 29
    .line 30
    .line 31
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    check-cast v0, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 35
    const/4 v1, 0x1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->setNeedShowPoint(Z)V

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lkotlin/collections/CollectionsKt;->last(Ljava/util/List;)Ljava/lang/Object;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    check-cast v0, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->setAnimatedSolidPoint(Z)V

    .line 48
    .line 49
    .line 50
    :cond_0
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 55
    move-result v1

    .line 56
    .line 57
    if-eqz v1, :cond_2

    .line 58
    .line 59
    .line 60
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 61
    move-result-object v1

    .line 62
    .line 63
    check-cast v1, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 64
    const/4 v2, 0x0

    .line 65
    .line 66
    .line 67
    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    check-cast v2, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v1, v2, p1}, Lcom/kubi/resources/widget/chart/view/LineChartView;->p(Lcom/kubi/resources/widget/chart/data/DataPoint;Lcom/kubi/resources/widget/chart/data/DataPoint;Ljava/util/List;)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v1, p2, p1}, Lcom/kubi/resources/widget/chart/view/LineChartView;->o(Lcom/kubi/resources/widget/chart/data/DataPoint;Lnw/b;Ljava/util/List;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0, v1, p2}, Lcom/kubi/resources/widget/chart/view/LineChartView;->q(Lcom/kubi/resources/widget/chart/data/DataPoint;Lnw/b;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 83
    move-result-object v2

    .line 84
    .line 85
    check-cast v2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->b0()Z

    .line 89
    move-result v2

    .line 90
    .line 91
    if-eqz v2, :cond_1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p0, v1, p2}, Lcom/kubi/resources/widget/chart/view/LineChartView;->n(Lcom/kubi/resources/widget/chart/data/DataPoint;Lnw/b;)V

    .line 95
    goto :goto_0

    .line 96
    :cond_2
    return-void
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public b(Ljava/util/List;)V
    .locals 10
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lnw/d;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "xLabels"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Low/a;->g()F

    .line 19
    move-result v2

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Low/a;->e()I

    .line 29
    move-result v3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Low/a;->f()Landroid/graphics/Typeface;

    .line 39
    move-result-object v7

    .line 40
    .line 41
    const/16 v8, 0x1c

    .line 42
    const/4 v9, 0x0

    .line 43
    const/4 v4, 0x0

    .line 44
    const/4 v5, 0x0

    .line 45
    const/4 v6, 0x0

    .line 46
    .line 47
    .line 48
    invoke-static/range {v1 .. v9}, Llw/h;->f(Llw/h;FILandroid/graphics/Paint$Style;FLandroid/graphics/Shader;Landroid/graphics/Typeface;ILjava/lang/Object;)Landroid/graphics/Paint;

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getLabels()Llw/g;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    .line 55
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v2}, Llw/h;->a()Landroid/graphics/Paint;

    .line 64
    move-result-object v2

    .line 65
    .line 66
    .line 67
    invoke-interface {v0, v1, v2, p1}, Llw/g;->a(Landroid/graphics/Canvas;Landroid/graphics/Paint;Ljava/util/List;)V

    .line 68
    return-void
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
.end method

.method public c(Lnw/b;Ljava/util/List;)V
    .locals 17
    .param p1    # Lnw/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnw/b;",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "innerFrame"

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    const-string v0, "points"

    .line 10
    .line 11
    move-object/from16 v2, p2

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->W()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-nez v0, :cond_0

    .line 27
    .line 28
    goto/16 :goto_1

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual/range {p0 .. p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    check-cast v2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->K()Ljava/lang/Integer;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    if-eqz v2, :cond_1

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    .line 48
    move-result v2

    .line 49
    goto :goto_0

    .line 50
    .line 51
    :cond_1
    sget v2, Lcom/kubi/sdk/res/R$drawable;->asset_line_chat_up_bg:I

    .line 52
    .line 53
    .line 54
    :goto_0
    invoke-static {v0, v2}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    if-eqz v0, :cond_3

    .line 58
    .line 59
    new-instance v7, Landroid/graphics/BitmapShader;

    .line 60
    .line 61
    sget-object v2, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 62
    .line 63
    .line 64
    invoke-direct {v7, v0, v2, v2}, Landroid/graphics/BitmapShader;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Shader$TileMode;Landroid/graphics/Shader$TileMode;)V

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1}, Lnw/b;->c()F

    .line 68
    move-result v2

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1}, Lnw/b;->b()F

    .line 72
    move-result v3

    .line 73
    sub-float/2addr v2, v3

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 77
    move-result v3

    .line 78
    int-to-float v3, v3

    .line 79
    div-float/2addr v2, v3

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Lnw/b;->a()F

    .line 83
    move-result v3

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1}, Lnw/b;->d()F

    .line 87
    move-result v4

    .line 88
    sub-float/2addr v3, v4

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 92
    move-result v0

    .line 93
    int-to-float v0, v0

    .line 94
    div-float/2addr v3, v0

    .line 95
    .line 96
    new-instance v0, Landroid/graphics/Matrix;

    .line 97
    .line 98
    .line 99
    invoke-direct {v0}, Landroid/graphics/Matrix;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->setScale(FF)V

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1}, Lnw/b;->b()F

    .line 106
    move-result v2

    .line 107
    .line 108
    .line 109
    invoke-virtual {v1}, Lnw/b;->d()F

    .line 110
    move-result v3

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0, v2, v3}, Landroid/graphics/Matrix;->postTranslate(FF)Z

    .line 114
    .line 115
    .line 116
    invoke-virtual {v7, v0}, Landroid/graphics/Shader;->setLocalMatrix(Landroid/graphics/Matrix;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 120
    move-result-object v2

    .line 121
    .line 122
    sget-object v5, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 123
    .line 124
    const/16 v9, 0x2b

    .line 125
    const/4 v10, 0x0

    .line 126
    const/4 v3, 0x0

    .line 127
    const/4 v4, 0x0

    .line 128
    const/4 v6, 0x0

    .line 129
    const/4 v8, 0x0

    .line 130
    .line 131
    .line 132
    invoke-static/range {v2 .. v10}, Llw/h;->f(Llw/h;FILandroid/graphics/Paint$Style;FLandroid/graphics/Shader;Landroid/graphics/Typeface;ILjava/lang/Object;)Landroid/graphics/Paint;

    .line 133
    .line 134
    .line 135
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 136
    move-result-object v11

    .line 137
    .line 138
    if-eqz v11, :cond_2

    .line 139
    .line 140
    .line 141
    invoke-virtual {v1}, Lnw/b;->b()F

    .line 142
    move-result v12

    .line 143
    .line 144
    .line 145
    invoke-virtual {v1}, Lnw/b;->d()F

    .line 146
    move-result v13

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1}, Lnw/b;->c()F

    .line 150
    move-result v14

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Lnw/b;->a()F

    .line 154
    move-result v15

    .line 155
    .line 156
    .line 157
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Llw/h;->a()Landroid/graphics/Paint;

    .line 162
    move-result-object v16

    .line 163
    .line 164
    .line 165
    invoke-virtual/range {v11 .. v16}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V

    .line 166
    .line 167
    .line 168
    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Llw/h;->a()Landroid/graphics/Paint;

    .line 173
    move-result-object v0

    .line 174
    const/4 v1, 0x0

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 178
    :cond_3
    :goto_1
    return-void
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public d(Lnw/b;Ljava/util/List;Ljava/util/List;)V
    .locals 2
    .param p1    # Lnw/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnw/b;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "innerFrame"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "xLabelsPositions"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    const-string v0, "yLabelsPositions"

    .line 13
    .line 14
    .line 15
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getGrid()Llw/d;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-interface {v0, v1, p1, p2, p3}, Llw/d;->a(Landroid/graphics/Canvas;Lnw/b;Ljava/util/List;Ljava/util/List;)V

    .line 29
    :cond_0
    return-void
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
.end method

.method public e(Lnw/b;Ljava/util/List;Landroid/graphics/Path;I)V
    .locals 21
    .param p1    # Lnw/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroid/graphics/Path;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lnw/b;",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;",
            "Landroid/graphics/Path;",
            "I)V"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    move-object/from16 v1, p3

    .line 5
    .line 6
    const-string v2, "innerFrame"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v2, "points"

    .line 12
    .line 13
    move-object/from16 v3, p2

    .line 14
    .line 15
    .line 16
    invoke-static {v3, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    const-string v2, "path"

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->N()Lnw/e;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lnw/e;->c()Z

    .line 35
    move-result v2

    .line 36
    .line 37
    if-eqz v2, :cond_0

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    .line 44
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->N()Lnw/e;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lnw/e;->b()I

    .line 55
    move-result v5

    .line 56
    .line 57
    sget-object v6, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 58
    .line 59
    const/16 v10, 0x39

    .line 60
    const/4 v11, 0x0

    .line 61
    const/4 v4, 0x0

    .line 62
    const/4 v7, 0x0

    .line 63
    const/4 v8, 0x0

    .line 64
    const/4 v9, 0x0

    .line 65
    .line 66
    .line 67
    invoke-static/range {v3 .. v11}, Llw/h;->f(Llw/h;FILandroid/graphics/Paint$Style;FLandroid/graphics/Shader;Landroid/graphics/Typeface;ILjava/lang/Object;)Landroid/graphics/Paint;

    .line 68
    goto :goto_0

    .line 69
    .line 70
    .line 71
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 72
    move-result-object v12

    .line 73
    .line 74
    .line 75
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 76
    move-result-object v2

    .line 77
    .line 78
    check-cast v2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->N()Lnw/e;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    .line 85
    invoke-static {v0, v2}, Lnw/c;->b(Lnw/b;Lnw/e;)Landroid/graphics/LinearGradient;

    .line 86
    move-result-object v17

    .line 87
    .line 88
    sget-object v15, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 89
    .line 90
    const/16 v19, 0x2b

    .line 91
    .line 92
    const/16 v20, 0x0

    .line 93
    const/4 v13, 0x0

    .line 94
    const/4 v14, 0x0

    .line 95
    .line 96
    const/16 v16, 0x0

    .line 97
    .line 98
    const/16 v18, 0x0

    .line 99
    .line 100
    .line 101
    invoke-static/range {v12 .. v20}, Llw/h;->f(Llw/h;FILandroid/graphics/Paint$Style;FLandroid/graphics/Shader;Landroid/graphics/Typeface;ILjava/lang/Object;)Landroid/graphics/Paint;

    .line 102
    .line 103
    .line 104
    :goto_0
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Llw/h;->a()Landroid/graphics/Paint;

    .line 109
    move-result-object v0

    .line 110
    .line 111
    move/from16 v2, p4

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V

    .line 115
    .line 116
    .line 117
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    if-eqz v0, :cond_1

    .line 121
    .line 122
    .line 123
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 124
    move-result-object v2

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Llw/h;->a()Landroid/graphics/Paint;

    .line 128
    move-result-object v2

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v1, v2}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 132
    :cond_1
    return-void
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
.end method

.method public f(Landroid/graphics/Path;Ljava/util/List;)V
    .locals 9
    .param p1    # Landroid/graphics/Path;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RequiresApi;
        value = 0x1a
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/graphics/Path;",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "path"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "points"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 14
    move-result-object p2

    .line 15
    .line 16
    check-cast p2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p2}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->a0()Z

    .line 20
    move-result p2

    .line 21
    .line 22
    if-eqz p2, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 26
    move-result-object p2

    .line 27
    .line 28
    check-cast p2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p2}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->P()[I

    .line 32
    move-result-object p2

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/LineChartView;->getRenderer()Llw/c;

    .line 38
    move-result-object p2

    .line 39
    .line 40
    .line 41
    invoke-interface {p2}, Llw/c;->d()Lnw/b;

    .line 42
    move-result-object p2

    .line 43
    .line 44
    new-instance v0, Landroid/graphics/LinearGradient;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p2}, Lnw/b;->b()F

    .line 48
    move-result v1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Lnw/b;->d()F

    .line 52
    move-result v2

    .line 53
    .line 54
    .line 55
    invoke-virtual {p2}, Lnw/b;->c()F

    .line 56
    move-result v3

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2}, Lnw/b;->d()F

    .line 60
    move-result v4

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 64
    move-result-object p2

    .line 65
    .line 66
    check-cast p2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->P()[I

    .line 70
    move-result-object v5

    .line 71
    .line 72
    .line 73
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 74
    const/4 v6, 0x0

    .line 75
    .line 76
    sget-object v7, Landroid/graphics/Shader$TileMode;->CLAMP:Landroid/graphics/Shader$TileMode;

    .line 77
    .line 78
    .line 79
    invoke-direct/range {v0 .. v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 83
    move-result-object p2

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 87
    move-result-object v1

    .line 88
    .line 89
    check-cast v1, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->O()I

    .line 93
    move-result v2

    .line 94
    .line 95
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 96
    .line 97
    .line 98
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 99
    move-result-object v1

    .line 100
    .line 101
    check-cast v1, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->Q()F

    .line 105
    move-result v4

    .line 106
    .line 107
    const/16 v7, 0x21

    .line 108
    const/4 v8, 0x0

    .line 109
    const/4 v1, 0x0

    .line 110
    move-object v5, v0

    .line 111
    move-object v0, p2

    .line 112
    .line 113
    .line 114
    invoke-static/range {v0 .. v8}, Llw/h;->f(Llw/h;FILandroid/graphics/Paint$Style;FLandroid/graphics/Shader;Landroid/graphics/Typeface;ILjava/lang/Object;)Landroid/graphics/Paint;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 118
    move-result-object p2

    .line 119
    .line 120
    if-eqz p2, :cond_0

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0}, Llw/h;->a()Landroid/graphics/Paint;

    .line 128
    move-result-object v0

    .line 129
    .line 130
    .line 131
    invoke-virtual {p2, p1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 132
    .line 133
    .line 134
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 135
    move-result-object p1

    .line 136
    .line 137
    .line 138
    invoke-virtual {p1}, Llw/h;->a()Landroid/graphics/Paint;

    .line 139
    move-result-object p1

    .line 140
    const/4 p2, 0x0

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;

    .line 144
    return-void

    .line 145
    .line 146
    .line 147
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 148
    move-result-object v0

    .line 149
    .line 150
    .line 151
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 152
    move-result-object p2

    .line 153
    .line 154
    check-cast p2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p2}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->O()I

    .line 158
    move-result v2

    .line 159
    .line 160
    sget-object v3, Landroid/graphics/Paint$Style;->STROKE:Landroid/graphics/Paint$Style;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 164
    move-result-object p2

    .line 165
    .line 166
    check-cast p2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->Q()F

    .line 170
    move-result v4

    .line 171
    .line 172
    const/16 v7, 0x31

    .line 173
    const/4 v8, 0x0

    .line 174
    const/4 v1, 0x0

    .line 175
    const/4 v5, 0x0

    .line 176
    const/4 v6, 0x0

    .line 177
    .line 178
    .line 179
    invoke-static/range {v0 .. v8}, Llw/h;->f(Llw/h;FILandroid/graphics/Paint$Style;FLandroid/graphics/Shader;Landroid/graphics/Typeface;ILjava/lang/Object;)Landroid/graphics/Paint;

    .line 180
    .line 181
    .line 182
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 183
    move-result-object p2

    .line 184
    .line 185
    if-eqz p2, :cond_2

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 189
    move-result-object v0

    .line 190
    .line 191
    .line 192
    invoke-virtual {v0}, Llw/h;->a()Landroid/graphics/Paint;

    .line 193
    move-result-object v0

    .line 194
    .line 195
    .line 196
    invoke-virtual {p2, p1, v0}, Landroid/graphics/Canvas;->drawPath(Landroid/graphics/Path;Landroid/graphics/Paint;)V

    .line 197
    :cond_2
    return-void
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public getRenderer()Llw/c;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/LineChartView;->n:Llw/c;

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
.end method

.method public final i(Landroid/content/res/TypedArray;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 7
    .line 8
    sget v1, Lcom/kubi/sdk/res/R$styleable;->LineChartAttrs_chart_lineColor:I

    .line 9
    .line 10
    const/high16 v2, -0x1000000

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 14
    move-result v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->g0(I)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 24
    .line 25
    sget v1, Lcom/kubi/sdk/res/R$styleable;->LineChartAttrs_chart_lineThickness:I

    .line 26
    .line 27
    const/high16 v2, 0x40800000    # 4.0f

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 31
    move-result v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->i0(F)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 41
    .line 42
    sget v1, Lcom/kubi/sdk/res/R$styleable;->LineChartAttrs_chart_smoothLine:I

    .line 43
    const/4 v2, 0x0

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1, v2}, Landroid/content/res/TypedArray;->getBoolean(IZ)Z

    .line 47
    move-result v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->t0(Z)V

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 54
    return-void
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
.end method

.method public final n(Lcom/kubi/resources/widget/chart/data/DataPoint;Lnw/b;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->isDepositOrWithdraw()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-eq v0, v1, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->isDepositOrWithdraw()I

    .line 11
    move-result v0

    .line 12
    const/4 v2, 0x2

    .line 13
    .line 14
    if-ne v0, v2, :cond_5

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->isDepositOrWithdraw()I

    .line 18
    move-result v0

    .line 19
    .line 20
    const-string v2, "decodeResource(...)"

    .line 21
    .line 22
    if-ne v0, v1, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    sget v1, Lcom/kubi/sdk/res/R$mipmap;->ic_line_chart_funds_in:I

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    goto :goto_0

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    sget v1, Lcom/kubi/sdk/res/R$mipmap;->ic_line_chart_funds_out:I

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1}, Landroid/graphics/BitmapFactory;->decodeResource(Landroid/content/res/Resources;I)Landroid/graphics/Bitmap;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionX()F

    .line 53
    move-result v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 57
    move-result v2

    .line 58
    int-to-float v2, v2

    .line 59
    .line 60
    const/high16 v3, 0x40000000    # 2.0f

    .line 61
    div-float/2addr v2, v3

    .line 62
    sub-float/2addr v1, v2

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 66
    move-result v2

    .line 67
    int-to-float v2, v2

    .line 68
    add-float/2addr v2, v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Lnw/b;->c()F

    .line 72
    move-result v3

    .line 73
    .line 74
    cmpl-float v2, v2, v3

    .line 75
    .line 76
    if-lez v2, :cond_2

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Lnw/b;->c()F

    .line 80
    move-result v1

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I

    .line 84
    move-result v2

    .line 85
    int-to-float v2, v2

    .line 86
    sub-float/2addr v1, v2

    .line 87
    .line 88
    .line 89
    :cond_2
    invoke-virtual {p2}, Lnw/b;->b()F

    .line 90
    move-result v2

    .line 91
    .line 92
    cmpg-float v2, v1, v2

    .line 93
    .line 94
    if-gez v2, :cond_3

    .line 95
    .line 96
    .line 97
    invoke-virtual {p2}, Lnw/b;->b()F

    .line 98
    move-result v1

    .line 99
    .line 100
    .line 101
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getTipGravity()Lcom/kubi/resources/widget/chart/data/TipGravity;

    .line 102
    move-result-object p2

    .line 103
    .line 104
    sget-object v2, Lcom/kubi/resources/widget/chart/data/TipGravity;->TOP:Lcom/kubi/resources/widget/chart/data/TipGravity;

    .line 105
    const/4 v3, 0x0

    .line 106
    .line 107
    const/high16 v4, 0x41700000    # 15.0f

    .line 108
    .line 109
    if-ne p2, v2, :cond_4

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 113
    move-result-object p2

    .line 114
    .line 115
    if-eqz p2, :cond_5

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionY()F

    .line 119
    move-result p1

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I

    .line 123
    move-result v2

    .line 124
    int-to-float v2, v2

    .line 125
    sub-float/2addr p1, v2

    .line 126
    sub-float/2addr p1, v4

    .line 127
    const/4 v2, 0x0

    .line 128
    .line 129
    .line 130
    invoke-static {p1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 131
    move-result p1

    .line 132
    .line 133
    .line 134
    invoke-virtual {p2, v0, v1, p1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 135
    return-void

    .line 136
    .line 137
    .line 138
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 139
    move-result-object p2

    .line 140
    .line 141
    if-eqz p2, :cond_5

    .line 142
    .line 143
    .line 144
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionY()F

    .line 145
    move-result p1

    .line 146
    add-float/2addr p1, v4

    .line 147
    .line 148
    .line 149
    invoke-virtual {p2, v0, v1, p1, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V

    .line 150
    :cond_5
    return-void
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public final o(Lcom/kubi/resources/widget/chart/data/DataPoint;Lnw/b;Ljava/util/List;)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            "Lnw/b;",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;)V"
        }
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getNeedShowSelectLine()Z

    .line 6
    move-result v2

    .line 7
    .line 8
    if-eqz v2, :cond_2

    .line 9
    .line 10
    .line 11
    invoke-static {p3, v1}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 12
    move-result-object p3

    .line 13
    .line 14
    check-cast p3, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getValue()D

    .line 18
    move-result-wide v2

    .line 19
    .line 20
    if-eqz p3, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getValue()D

    .line 24
    move-result-wide v4

    .line 25
    goto :goto_0

    .line 26
    .line 27
    :cond_0
    const-wide/16 v4, 0x0

    .line 28
    .line 29
    :goto_0
    cmpl-double p3, v2, v4

    .line 30
    .line 31
    if-ltz p3, :cond_1

    .line 32
    move p3, v0

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move p3, v1

    .line 35
    .line 36
    .line 37
    :goto_1
    invoke-virtual {p0, p3}, Lcom/kubi/resources/widget/chart/view/LineChartView;->s(Z)I

    .line 38
    move-result p3

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    if-eqz v2, :cond_2

    .line 45
    .line 46
    .line 47
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionX()F

    .line 48
    move-result v3

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2}, Lnw/b;->a()F

    .line 52
    move-result v4

    .line 53
    .line 54
    const/16 v5, 0x8

    .line 55
    .line 56
    .line 57
    invoke-static {v5}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 58
    move-result v5

    .line 59
    int-to-float v5, v5

    .line 60
    add-float/2addr v4, v5

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionX()F

    .line 64
    move-result v5

    .line 65
    .line 66
    .line 67
    invoke-virtual {p2}, Lnw/b;->d()F

    .line 68
    move-result p1

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 72
    move-result-object p2

    .line 73
    .line 74
    check-cast p2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 75
    .line 76
    .line 77
    invoke-virtual {p2}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->R()I

    .line 78
    move-result p2

    .line 79
    .line 80
    .line 81
    invoke-static {p2}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 82
    move-result p2

    .line 83
    int-to-float p2, p2

    .line 84
    .line 85
    sub-float v6, p1, p2

    .line 86
    .line 87
    new-instance v7, Landroid/graphics/Paint;

    .line 88
    .line 89
    .line 90
    invoke-direct {v7}, Landroid/graphics/Paint;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v7, p3}, Landroid/graphics/Paint;->setColor(I)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    check-cast p1, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 100
    .line 101
    .line 102
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->U()F

    .line 103
    move-result p1

    .line 104
    .line 105
    .line 106
    invoke-virtual {v7, p1}, Landroid/graphics/Paint;->setStrokeWidth(F)V

    .line 107
    .line 108
    new-instance p1, Landroid/graphics/DashPathEffect;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 112
    move-result-object p2

    .line 113
    .line 114
    check-cast p2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 115
    .line 116
    .line 117
    invoke-virtual {p2}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->M()F

    .line 118
    move-result p2

    .line 119
    .line 120
    .line 121
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 122
    move-result-object p3

    .line 123
    .line 124
    check-cast p3, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 125
    .line 126
    .line 127
    invoke-virtual {p3}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->M()F

    .line 128
    move-result p3

    .line 129
    const/4 v8, 0x2

    .line 130
    .line 131
    new-array v8, v8, [F

    .line 132
    .line 133
    aput p2, v8, v1

    .line 134
    .line 135
    aput p3, v8, v0

    .line 136
    const/4 p2, 0x0

    .line 137
    .line 138
    .line 139
    invoke-direct {p1, v8, p2}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    .line 140
    .line 141
    .line 142
    invoke-virtual {v7, p1}, Landroid/graphics/Paint;->setPathEffect(Landroid/graphics/PathEffect;)Landroid/graphics/PathEffect;

    .line 143
    .line 144
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 145
    .line 146
    .line 147
    invoke-virtual/range {v2 .. v7}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V

    .line 148
    :cond_2
    return-void
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
.end method

.method public onSizeChanged(IIII)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Landroid/view/View;->onSizeChanged(IIII)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 7
    move-result-object p3

    .line 8
    .line 9
    check-cast p3, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p3, p1}, Low/a;->B(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Low/a;->s(I)V

    .line 22
    return-void
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
.end method

.method public final p(Lcom/kubi/resources/widget/chart/data/DataPoint;Lcom/kubi/resources/widget/chart/data/DataPoint;Ljava/util/List;)V
    .locals 18
    .param p1    # Lcom/kubi/resources/widget/chart/data/DataPoint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/kubi/resources/widget/chart/data/DataPoint;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    move-object/from16 v2, p3

    .line 7
    .line 8
    const-string v3, "dataPoint"

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    const-string v3, "first"

    .line 14
    .line 15
    move-object/from16 v4, p2

    .line 16
    .line 17
    .line 18
    invoke-static {v4, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    const-string v3, "allPoints"

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getNeedShowPoint()Z

    .line 27
    move-result v3

    .line 28
    .line 29
    if-eqz v3, :cond_6

    .line 30
    .line 31
    .line 32
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->isAnimatedSolidPoint()Z

    .line 33
    move-result v3

    .line 34
    .line 35
    if-eqz v3, :cond_4

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->isAnimatedPoint()Z

    .line 39
    move-result v3

    .line 40
    .line 41
    if-eqz v3, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getAnimationProgress()F

    .line 45
    move-result v3

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v3}, Lcom/kubi/resources/widget/chart/view/LineChartView;->r(F)I

    .line 49
    move-result v3

    .line 50
    goto :goto_0

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/widget/chart/view/LineChartView;->t(Lcom/kubi/resources/widget/chart/data/DataPoint;Ljava/util/List;)I

    .line 54
    move-result v3

    .line 55
    .line 56
    :goto_0
    if-eqz v2, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    .line 60
    move-result v4

    .line 61
    .line 62
    if-eqz v4, :cond_1

    .line 63
    goto :goto_1

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    .line 70
    :cond_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    move-result v4

    .line 72
    .line 73
    if-eqz v4, :cond_3

    .line 74
    .line 75
    .line 76
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    move-result-object v4

    .line 78
    .line 79
    check-cast v4, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v4}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getNeedShowPoint()Z

    .line 83
    move-result v5

    .line 84
    .line 85
    if-eqz v5, :cond_2

    .line 86
    .line 87
    .line 88
    invoke-static {v4, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 89
    move-result v4

    .line 90
    .line 91
    if-nez v4, :cond_2

    .line 92
    .line 93
    const/16 v2, 0x40

    .line 94
    goto :goto_2

    .line 95
    .line 96
    :cond_3
    :goto_1
    const/16 v2, 0xff

    .line 97
    .line 98
    .line 99
    :goto_2
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 100
    move-result-object v4

    .line 101
    .line 102
    .line 103
    invoke-static {v3, v2}, Landroidx/core/graphics/ColorUtils;->setAlphaComponent(II)I

    .line 104
    move-result v6

    .line 105
    .line 106
    sget-object v7, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 107
    .line 108
    const/16 v11, 0x39

    .line 109
    const/4 v12, 0x0

    .line 110
    const/4 v5, 0x0

    .line 111
    const/4 v8, 0x0

    .line 112
    const/4 v9, 0x0

    .line 113
    const/4 v10, 0x0

    .line 114
    .line 115
    .line 116
    invoke-static/range {v4 .. v12}, Llw/h;->f(Llw/h;FILandroid/graphics/Paint$Style;FLandroid/graphics/Shader;Landroid/graphics/Typeface;ILjava/lang/Object;)Landroid/graphics/Paint;

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 120
    move-result-object v2

    .line 121
    .line 122
    if-eqz v2, :cond_6

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionX()F

    .line 126
    move-result v3

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionY()F

    .line 130
    move-result v1

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 134
    move-result-object v4

    .line 135
    .line 136
    check-cast v4, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v4}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->T()F

    .line 140
    move-result v4

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 144
    move-result-object v5

    .line 145
    .line 146
    .line 147
    invoke-virtual {v5}, Llw/h;->a()Landroid/graphics/Paint;

    .line 148
    move-result-object v5

    .line 149
    .line 150
    .line 151
    invoke-virtual {v2, v3, v1, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 152
    return-void

    .line 153
    .line 154
    .line 155
    :cond_4
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/widget/chart/view/LineChartView;->u(Lcom/kubi/resources/widget/chart/data/DataPoint;Ljava/util/List;)I

    .line 156
    move-result v8

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 160
    move-result-object v2

    .line 161
    .line 162
    sget v3, Lcom/kubi/sdk/res/R$color;->c_overlay:I

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getColor(I)I

    .line 166
    move-result v2

    .line 167
    .line 168
    .line 169
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 170
    move-result-object v6

    .line 171
    .line 172
    sget-object v12, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    .line 173
    .line 174
    const/16 v13, 0x39

    .line 175
    const/4 v14, 0x0

    .line 176
    const/4 v7, 0x0

    .line 177
    const/4 v10, 0x0

    .line 178
    const/4 v11, 0x0

    .line 179
    move-object v9, v12

    .line 180
    const/4 v12, 0x0

    .line 181
    .line 182
    .line 183
    invoke-static/range {v6 .. v14}, Llw/h;->f(Llw/h;FILandroid/graphics/Paint$Style;FLandroid/graphics/Shader;Landroid/graphics/Typeface;ILjava/lang/Object;)Landroid/graphics/Paint;

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 187
    move-result-object v3

    .line 188
    .line 189
    if-eqz v3, :cond_5

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionX()F

    .line 193
    move-result v4

    .line 194
    .line 195
    .line 196
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionY()F

    .line 197
    move-result v5

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 201
    move-result-object v6

    .line 202
    .line 203
    check-cast v6, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 204
    .line 205
    .line 206
    invoke-virtual {v6}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->T()F

    .line 207
    move-result v6

    .line 208
    .line 209
    .line 210
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 211
    move-result-object v7

    .line 212
    .line 213
    .line 214
    invoke-virtual {v7}, Llw/h;->a()Landroid/graphics/Paint;

    .line 215
    move-result-object v7

    .line 216
    .line 217
    .line 218
    invoke-virtual {v3, v4, v5, v6, v7}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 219
    :cond_5
    move-object v12, v9

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 223
    move-result-object v9

    .line 224
    .line 225
    const/16 v16, 0x39

    .line 226
    .line 227
    const/16 v17, 0x0

    .line 228
    const/4 v10, 0x0

    .line 229
    const/4 v13, 0x0

    .line 230
    const/4 v14, 0x0

    .line 231
    const/4 v15, 0x0

    .line 232
    move v11, v2

    .line 233
    .line 234
    .line 235
    invoke-static/range {v9 .. v17}, Llw/h;->f(Llw/h;FILandroid/graphics/Paint$Style;FLandroid/graphics/Shader;Landroid/graphics/Typeface;ILjava/lang/Object;)Landroid/graphics/Paint;

    .line 236
    .line 237
    .line 238
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 239
    move-result-object v2

    .line 240
    .line 241
    if-eqz v2, :cond_6

    .line 242
    .line 243
    .line 244
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionX()F

    .line 245
    move-result v3

    .line 246
    .line 247
    .line 248
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionY()F

    .line 249
    move-result v1

    .line 250
    .line 251
    .line 252
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 253
    move-result-object v4

    .line 254
    .line 255
    check-cast v4, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v4}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->V()F

    .line 259
    move-result v4

    .line 260
    .line 261
    .line 262
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 263
    move-result-object v5

    .line 264
    .line 265
    .line 266
    invoke-virtual {v5}, Llw/h;->a()Landroid/graphics/Paint;

    .line 267
    move-result-object v5

    .line 268
    .line 269
    .line 270
    invoke-virtual {v2, v3, v1, v4, v5}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V

    .line 271
    :cond_6
    return-void
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
.end method

.method public final q(Lcom/kubi/resources/widget/chart/data/DataPoint;Lnw/b;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getNeedShowTip()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_6

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getNormalText()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    check-cast v2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2}, Low/a;->k()F

    .line 24
    move-result v2

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1, v2}, Llw/h;->d(Ljava/lang/String;F)F

    .line 28
    move-result v0

    .line 29
    const/4 v1, 0x2

    .line 30
    int-to-float v2, v1

    .line 31
    .line 32
    div-float v2, v0, v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionX()F

    .line 36
    move-result v3

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getPainter()Llw/h;

    .line 40
    move-result-object v4

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 44
    move-result-object v5

    .line 45
    .line 46
    check-cast v5, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 47
    .line 48
    .line 49
    invoke-virtual {v5}, Low/a;->k()F

    .line 50
    move-result v5

    .line 51
    .line 52
    .line 53
    invoke-virtual {v4, v5}, Llw/h;->c(F)F

    .line 54
    move-result v4

    .line 55
    sub-float/2addr v3, v2

    .line 56
    .line 57
    add-float v2, v3, v0

    .line 58
    .line 59
    .line 60
    invoke-virtual {p2}, Lnw/b;->c()F

    .line 61
    move-result v5

    .line 62
    .line 63
    cmpl-float v2, v2, v5

    .line 64
    .line 65
    if-lez v2, :cond_0

    .line 66
    .line 67
    .line 68
    invoke-virtual {p2}, Lnw/b;->c()F

    .line 69
    move-result v2

    .line 70
    .line 71
    sub-float v3, v2, v0

    .line 72
    .line 73
    .line 74
    :cond_0
    invoke-virtual {p2}, Lnw/b;->b()F

    .line 75
    move-result v0

    .line 76
    .line 77
    cmpg-float v0, v3, v0

    .line 78
    .line 79
    if-gez v0, :cond_1

    .line 80
    .line 81
    .line 82
    invoke-virtual {p2}, Lnw/b;->b()F

    .line 83
    move-result v3

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->isDepositOrWithdraw()I

    .line 87
    move-result p2

    .line 88
    const/4 v0, 0x1

    .line 89
    const/4 v2, 0x0

    .line 90
    .line 91
    if-eq p2, v0, :cond_2

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->isDepositOrWithdraw()I

    .line 95
    move-result p2

    .line 96
    .line 97
    if-ne p2, v1, :cond_4

    .line 98
    .line 99
    .line 100
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 101
    move-result-object p2

    .line 102
    .line 103
    check-cast p2, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p2}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->b0()Z

    .line 107
    move-result p2

    .line 108
    .line 109
    if-eqz p2, :cond_4

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 113
    move-result-object p2

    .line 114
    .line 115
    if-eqz p2, :cond_6

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getNormalText()Ljava/lang/String;

    .line 119
    move-result-object v0

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getTipGravity()Lcom/kubi/resources/widget/chart/data/TipGravity;

    .line 123
    move-result-object v1

    .line 124
    .line 125
    sget-object v5, Lcom/kubi/resources/widget/chart/data/TipGravity;->TOP:Lcom/kubi/resources/widget/chart/data/TipGravity;

    .line 126
    .line 127
    if-ne v1, v5, :cond_3

    .line 128
    .line 129
    .line 130
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionY()F

    .line 131
    move-result p1

    .line 132
    .line 133
    const/16 v1, 0x1a

    .line 134
    .line 135
    .line 136
    invoke-static {v1}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 137
    move-result v1

    .line 138
    int-to-float v1, v1

    .line 139
    sub-float/2addr p1, v1

    .line 140
    .line 141
    .line 142
    invoke-static {p1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 143
    move-result p1

    .line 144
    goto :goto_0

    .line 145
    .line 146
    .line 147
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionY()F

    .line 148
    move-result p1

    .line 149
    add-float/2addr p1, v4

    .line 150
    .line 151
    const/16 v1, 0x11

    .line 152
    .line 153
    .line 154
    invoke-static {v1}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 155
    move-result v1

    .line 156
    int-to-float v1, v1

    .line 157
    add-float/2addr p1, v1

    .line 158
    .line 159
    .line 160
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getTextPainter()Landroid/text/TextPaint;

    .line 161
    move-result-object v1

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2, v0, v3, p1, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 165
    return-void

    .line 166
    .line 167
    .line 168
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getCanvas()Landroid/graphics/Canvas;

    .line 169
    move-result-object p2

    .line 170
    .line 171
    if-eqz p2, :cond_6

    .line 172
    .line 173
    .line 174
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getNormalText()Ljava/lang/String;

    .line 175
    move-result-object v0

    .line 176
    .line 177
    .line 178
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getTipGravity()Lcom/kubi/resources/widget/chart/data/TipGravity;

    .line 179
    move-result-object v1

    .line 180
    .line 181
    sget-object v5, Lcom/kubi/resources/widget/chart/data/TipGravity;->TOP:Lcom/kubi/resources/widget/chart/data/TipGravity;

    .line 182
    .line 183
    if-ne v1, v5, :cond_5

    .line 184
    .line 185
    .line 186
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionY()F

    .line 187
    move-result p1

    .line 188
    .line 189
    const/16 v1, 0xc

    .line 190
    .line 191
    .line 192
    invoke-static {v1}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 193
    move-result v1

    .line 194
    int-to-float v1, v1

    .line 195
    sub-float/2addr p1, v1

    .line 196
    .line 197
    .line 198
    invoke-static {p1, v2}, Lkotlin/ranges/RangesKt;->coerceAtLeast(FF)F

    .line 199
    move-result p1

    .line 200
    goto :goto_1

    .line 201
    .line 202
    .line 203
    :cond_5
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionY()F

    .line 204
    move-result p1

    .line 205
    add-float/2addr p1, v4

    .line 206
    const/4 v1, 0x7

    .line 207
    .line 208
    .line 209
    invoke-static {v1}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 210
    move-result v1

    .line 211
    int-to-float v1, v1

    .line 212
    add-float/2addr p1, v1

    .line 213
    .line 214
    .line 215
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getTextPainter()Landroid/text/TextPaint;

    .line 216
    move-result-object v1

    .line 217
    .line 218
    .line 219
    invoke-virtual {p2, v0, v3, p1, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 220
    :cond_6
    return-void
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public final r(F)I
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->P()[I

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->S()I

    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    array-length v1, v0

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    check-cast p1, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->S()I

    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_1
    array-length v1, v0

    .line 39
    const/4 v2, 0x1

    .line 40
    .line 41
    if-ne v1, v2, :cond_2

    .line 42
    const/4 p1, 0x0

    .line 43
    .line 44
    aget p1, v0, p1

    .line 45
    return p1

    .line 46
    :cond_2
    array-length v1, v0

    .line 47
    const/4 v3, 0x0

    .line 48
    .line 49
    const/high16 v4, 0x3f800000    # 1.0f

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v3, v4}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 53
    move-result p1

    .line 54
    sub-int/2addr v1, v2

    .line 55
    int-to-float v3, v1

    .line 56
    mul-float/2addr p1, v3

    .line 57
    float-to-int v3, p1

    .line 58
    int-to-float v4, v3

    .line 59
    sub-float/2addr p1, v4

    .line 60
    .line 61
    if-lt v3, v1, :cond_3

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lkotlin/collections/ArraysKt;->last([I)I

    .line 65
    move-result p1

    .line 66
    return p1

    .line 67
    .line 68
    :cond_3
    aget v1, v0, v3

    .line 69
    add-int/2addr v3, v2

    .line 70
    .line 71
    aget v0, v0, v3

    .line 72
    .line 73
    .line 74
    invoke-virtual {p0, v1, v0, p1}, Lcom/kubi/resources/widget/chart/view/LineChartView;->v(IIF)I

    .line 75
    move-result p1

    .line 76
    return p1
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
.end method

.method public final s(Z)I
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->M:Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/LineChartView;->x()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, v1}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration$Companion;->getGradientColors(ZZ)[I

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/collections/ArraysKt;->lastOrNull([I)Ljava/lang/Integer;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    check-cast p1, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->S()I

    .line 31
    move-result p1

    .line 32
    return p1
.end method

.method public final t(Lcom/kubi/resources/widget/chart/data/DataPoint;Ljava/util/List;)I
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;)I"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    move-result v1

    .line 9
    .line 10
    if-eqz v1, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    move-result-object v1

    .line 15
    move-object v2, v1

    .line 16
    .line 17
    check-cast v2, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getNeedShowPoint()Z

    .line 21
    move-result v3

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-static {v2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 27
    move-result v2

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    const/4 v1, 0x0

    .line 32
    .line 33
    :goto_0
    check-cast v1, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 34
    const/4 v0, 0x0

    .line 35
    .line 36
    .line 37
    invoke-static {p2, v0}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 38
    move-result-object p2

    .line 39
    .line 40
    check-cast p2, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 41
    const/4 v2, 0x1

    .line 42
    .line 43
    const-wide/16 v3, 0x0

    .line 44
    .line 45
    if-eqz v1, :cond_4

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getValue()D

    .line 49
    move-result-wide v5

    .line 50
    .line 51
    if-eqz p2, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getValue()D

    .line 55
    move-result-wide v3

    .line 56
    .line 57
    :cond_2
    cmpl-double p1, v5, v3

    .line 58
    .line 59
    if-ltz p1, :cond_3

    .line 60
    move v0, v2

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/chart/view/LineChartView;->s(Z)I

    .line 64
    move-result p1

    .line 65
    return p1

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getValue()D

    .line 69
    move-result-wide v5

    .line 70
    .line 71
    if-eqz p2, :cond_5

    .line 72
    .line 73
    .line 74
    invoke-virtual {p2}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getValue()D

    .line 75
    move-result-wide v3

    .line 76
    .line 77
    :cond_5
    cmpl-double p1, v5, v3

    .line 78
    .line 79
    if-ltz p1, :cond_6

    .line 80
    move v0, v2

    .line 81
    .line 82
    .line 83
    :cond_6
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/chart/view/LineChartView;->s(Z)I

    .line 84
    move-result p1

    .line 85
    return p1
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public final u(Lcom/kubi/resources/widget/chart/data/DataPoint;Ljava/util/List;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;)I"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->P()[I

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    check-cast p1, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->S()I

    .line 22
    move-result p1

    .line 23
    return p1

    .line 24
    :cond_0
    array-length v1, v0

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    check-cast p1, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->S()I

    .line 36
    move-result p1

    .line 37
    return p1

    .line 38
    :cond_1
    array-length v1, v0

    .line 39
    const/4 v2, 0x1

    .line 40
    const/4 v3, 0x0

    .line 41
    .line 42
    if-ne v1, v2, :cond_2

    .line 43
    .line 44
    aget p1, v0, v3

    .line 45
    return p1

    .line 46
    .line 47
    .line 48
    :cond_2
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->firstOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    check-cast v1, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 52
    .line 53
    if-nez v1, :cond_3

    .line 54
    .line 55
    aget p1, v0, v3

    .line 56
    return p1

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-static {p2}, Lkotlin/collections/CollectionsKt;->lastOrNull(Ljava/util/List;)Ljava/lang/Object;

    .line 60
    move-result-object p2

    .line 61
    .line 62
    check-cast p2, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 63
    .line 64
    if-nez p2, :cond_4

    .line 65
    .line 66
    aget p1, v0, v3

    .line 67
    return p1

    .line 68
    .line 69
    .line 70
    :cond_4
    invoke-static {v1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 71
    move-result v2

    .line 72
    .line 73
    if-eqz v2, :cond_5

    .line 74
    .line 75
    aget p1, v0, v3

    .line 76
    return p1

    .line 77
    .line 78
    .line 79
    :cond_5
    invoke-virtual {p2}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionX()F

    .line 80
    move-result p2

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionX()F

    .line 84
    move-result v0

    .line 85
    sub-float/2addr p2, v0

    .line 86
    const/4 v0, 0x0

    .line 87
    .line 88
    cmpg-float v2, p2, v0

    .line 89
    .line 90
    if-nez v2, :cond_6

    .line 91
    goto :goto_0

    .line 92
    .line 93
    .line 94
    :cond_6
    invoke-virtual {p1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionX()F

    .line 95
    move-result p1

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1}, Lcom/kubi/resources/widget/chart/data/DataPoint;->getScreenPositionX()F

    .line 99
    move-result v1

    .line 100
    sub-float/2addr p1, v1

    .line 101
    div-float/2addr p1, p2

    .line 102
    .line 103
    const/high16 p2, 0x3f800000    # 1.0f

    .line 104
    .line 105
    .line 106
    invoke-static {p1, v0, p2}, Lkotlin/ranges/RangesKt;->coerceIn(FFF)F

    .line 107
    move-result v0

    .line 108
    .line 109
    .line 110
    :goto_0
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/chart/view/LineChartView;->r(F)I

    .line 111
    move-result p1

    .line 112
    return p1
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
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
.end method

.method public final v(IIF)I
    .locals 7

    .line 1
    .line 2
    shr-int/lit8 v0, p1, 0x18

    .line 3
    .line 4
    and-int/lit16 v0, v0, 0xff

    .line 5
    .line 6
    shr-int/lit8 v1, p1, 0x10

    .line 7
    .line 8
    and-int/lit16 v1, v1, 0xff

    .line 9
    .line 10
    shr-int/lit8 v2, p1, 0x8

    .line 11
    .line 12
    and-int/lit16 v2, v2, 0xff

    .line 13
    .line 14
    and-int/lit16 p1, p1, 0xff

    .line 15
    .line 16
    shr-int/lit8 v3, p2, 0x18

    .line 17
    .line 18
    and-int/lit16 v3, v3, 0xff

    .line 19
    .line 20
    shr-int/lit8 v4, p2, 0x10

    .line 21
    .line 22
    and-int/lit16 v4, v4, 0xff

    .line 23
    .line 24
    shr-int/lit8 v5, p2, 0x8

    .line 25
    .line 26
    and-int/lit16 v5, v5, 0xff

    .line 27
    .line 28
    and-int/lit16 p2, p2, 0xff

    .line 29
    int-to-float v6, v0

    .line 30
    sub-int/2addr v3, v0

    .line 31
    int-to-float v0, v3

    .line 32
    mul-float/2addr v0, p3

    .line 33
    add-float/2addr v6, v0

    .line 34
    float-to-int v0, v6

    .line 35
    int-to-float v3, v1

    .line 36
    sub-int/2addr v4, v1

    .line 37
    int-to-float v1, v4

    .line 38
    mul-float/2addr v1, p3

    .line 39
    add-float/2addr v3, v1

    .line 40
    float-to-int v1, v3

    .line 41
    int-to-float v3, v2

    .line 42
    sub-int/2addr v5, v2

    .line 43
    int-to-float v2, v5

    .line 44
    mul-float/2addr v2, p3

    .line 45
    add-float/2addr v3, v2

    .line 46
    float-to-int v2, v3

    .line 47
    int-to-float v3, p1

    .line 48
    sub-int/2addr p2, p1

    .line 49
    int-to-float p1, p2

    .line 50
    mul-float/2addr p1, p3

    .line 51
    add-float/2addr v3, p1

    .line 52
    float-to-int p1, v3

    .line 53
    .line 54
    shl-int/lit8 p2, v0, 0x18

    .line 55
    .line 56
    shl-int/lit8 p3, v1, 0x10

    .line 57
    or-int/2addr p2, p3

    .line 58
    .line 59
    shl-int/lit8 p3, v2, 0x8

    .line 60
    or-int/2addr p2, p3

    .line 61
    or-int/2addr p1, p2

    .line 62
    return p1
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
.end method

.method public final w()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->Z()Z

    .line 10
    move-result v0

    .line 11
    return v0
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
.end method

.method public final x()Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    const-string v1, "upDown"

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x1

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v2, v3, v0}, Lcom/kubi/utils/n;->c(Ljava/lang/String;IILjava/lang/Object;)I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    return v3

    .line 13
    :cond_0
    return v2
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
.end method

.method public final y()F
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getMChartConfiguration()Low/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/resources/widget/chart/data/configuration/LineChartConfiguration;->Q()F

    .line 10
    move-result v0

    .line 11
    return v0
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
.end method
