.class public abstract Lcom/kubi/resources/widget/chart/view/AxisChartView;
.super Landroid/widget/FrameLayout;
.source "AxisChartView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/resources/widget/chart/view/AxisChartView$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<T:",
        "Low/a;",
        ">",
        "Landroid/widget/FrameLayout;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00a4\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u0000 T*\u0008\u0008\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0001TB/\u0008\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0008\u0008\u0002\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00028\u0000\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u0008\u0010;\u001a\u00020<H\u0014J\u0008\u0010=\u001a\u00020<H\u0014J\u0018\u0010>\u001a\u00020<2\u0006\u0010?\u001a\u00020\t2\u0006\u0010@\u001a\u00020\tH\u0014J\u0010\u0010A\u001a\u00020<2\u0006\u0010&\u001a\u00020\'H\u0014J\u0012\u0010B\u001a\u00020C2\u0008\u0010D\u001a\u0004\u0018\u00010EH\u0016J\u0010\u0010F\u001a\u00020<2\u0006\u0010D\u001a\u00020EH\u0002J\u0014\u0010G\u001a\u00020<2\u000c\u0010H\u001a\u0008\u0012\u0004\u0012\u00020\u00140IJ\u001f\u0010J\u001a\u00020<2\u0017\u0010K\u001a\u0013\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020<0L\u00a2\u0006\u0002\u0008MJ\u0010\u0010N\u001a\u00020<2\u0006\u0010O\u001a\u00020PH\u0002J\u0008\u0010Q\u001a\u00020<H\u0004J\u000e\u0010R\u001a\u00020<2\u0006\u0010S\u001a\u000206R\u001c\u0010\n\u001a\u00028\u0000X\u0084\u000e\u00a2\u0006\u0010\n\u0002\u0010\u0011\u001a\u0004\u0008\r\u0010\u000e\"\u0004\u0008\u000f\u0010\u0010R \u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016\"\u0004\u0008\u0017\u0010\u0018R\u0011\u0010\u0019\u001a\u00020\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u001c\u0010\u001d\u001a\u0004\u0018\u00010\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001f\u0010 \"\u0004\u0008!\u0010\"R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0084\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008(\u0010)\"\u0004\u0008*\u0010+R\u0014\u0010,\u001a\u00020-X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u0014\u00100\u001a\u000201X\u0084\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u0014\u00104\u001a\u0008\u0012\u0004\u0012\u00020605X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u00107\u001a\u000208X\u00a4\u0004\u00a2\u0006\u0006\u001a\u0004\u00089\u0010:\u00a8\u0006U"
    }
    d2 = {
        "Lcom/kubi/resources/widget/chart/view/AxisChartView;",
        "T",
        "Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;",
        "Landroid/widget/FrameLayout;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "mChartConfiguration",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;ILcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;)V",
        "getMChartConfiguration",
        "()Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;",
        "setMChartConfiguration",
        "(Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;)V",
        "Lcom/kubi/resources/widget/chart/data/configuration/ChartConfiguration;",
        "animation",
        "Lcom/kubi/resources/widget/chart/animation/ChartAnimation;",
        "Lcom/kubi/resources/widget/chart/data/DataPoint;",
        "getAnimation",
        "()Lcom/kubi/resources/widget/chart/animation/ChartAnimation;",
        "setAnimation",
        "(Lcom/kubi/resources/widget/chart/animation/ChartAnimation;)V",
        "labels",
        "Lcom/kubi/resources/widget/chart/Labels;",
        "getLabels",
        "()Lcom/kubi/resources/widget/chart/Labels;",
        "grid",
        "Lcom/kubi/resources/widget/chart/Grid;",
        "getGrid",
        "()Lcom/kubi/resources/widget/chart/Grid;",
        "setGrid",
        "(Lcom/kubi/resources/widget/chart/Grid;)V",
        "startX",
        "",
        "startY",
        "canvas",
        "Landroid/graphics/Canvas;",
        "getCanvas",
        "()Landroid/graphics/Canvas;",
        "setCanvas",
        "(Landroid/graphics/Canvas;)V",
        "painter",
        "Lcom/kubi/resources/widget/chart/Painter;",
        "getPainter",
        "()Lcom/kubi/resources/widget/chart/Painter;",
        "textPainter",
        "Landroid/text/TextPaint;",
        "getTextPainter",
        "()Landroid/text/TextPaint;",
        "tooltipListeners",
        "",
        "Lcom/kubi/resources/widget/chart/Tooltip;",
        "renderer",
        "Lcom/kubi/resources/widget/chart/ChartContract$Renderer;",
        "getRenderer",
        "()Lcom/kubi/resources/widget/chart/ChartContract$Renderer;",
        "onAttachedToWindow",
        "",
        "onDetachedFromWindow",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onDraw",
        "onTouchEvent",
        "",
        "event",
        "Landroid/view/MotionEvent;",
        "selectPoint",
        "show",
        "entries",
        "",
        "updateConfig",
        "block",
        "Lkotlin/Function1;",
        "Lkotlin/ExtensionFunctionType;",
        "handleAttributes",
        "typedArray",
        "Landroid/content/res/TypedArray;",
        "handleEditMode",
        "addDataTransferListener",
        "listener",
        "Companion",
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
        "SMAP\nAxisChartView.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AxisChartView.kt\ncom/kubi/resources/widget/chart/view/AxisChartView\n+ 2 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,244:1\n81#2:245\n81#2:246\n*S KotlinDebug\n*F\n+ 1 AxisChartView.kt\ncom/kubi/resources/widget/chart/view/AxisChartView\n*L\n62#1:245\n143#1:246\n*E\n"
    }
.end annotation


# static fields
.field public static final l:Lcom/kubi/resources/widget/chart/view/AxisChartView$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public b:Low/a;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public c:Lcom/kubi/resources/widget/chart/animation/ChartAnimation;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/resources/widget/chart/animation/ChartAnimation<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Llw/g;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public e:Llw/d;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f:F

.field public g:F

.field public h:Landroid/graphics/Canvas;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final i:Llw/h;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Landroid/text/TextPaint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Llw/i;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 31

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/resources/widget/chart/view/AxisChartView$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/resources/widget/chart/view/AxisChartView$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->l:Lcom/kubi/resources/widget/chart/view/AxisChartView$Companion;

    .line 9
    .line 10
    new-instance v2, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 11
    .line 12
    .line 13
    const v26, 0x3ffffd

    .line 14
    .line 15
    const/16 v27, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    const-wide/high16 v4, 0x3ff0000000000000L    # 1.0

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v7, 0x0

    .line 21
    const/4 v8, 0x0

    .line 22
    const/4 v9, 0x0

    .line 23
    const/4 v10, 0x0

    .line 24
    const/4 v11, 0x0

    .line 25
    const/4 v12, 0x0

    .line 26
    const/4 v13, 0x0

    .line 27
    const/4 v14, 0x0

    .line 28
    const/4 v15, 0x0

    .line 29
    .line 30
    const/16 v16, 0x0

    .line 31
    .line 32
    const/16 v17, 0x0

    .line 33
    .line 34
    const/16 v18, 0x0

    .line 35
    .line 36
    const/16 v19, 0x0

    .line 37
    .line 38
    const/16 v20, 0x0

    .line 39
    .line 40
    const/16 v21, 0x0

    .line 41
    .line 42
    const/16 v22, 0x0

    .line 43
    .line 44
    const/16 v23, 0x0

    .line 45
    .line 46
    const/16 v24, 0x0

    .line 47
    .line 48
    const/16 v25, 0x0

    .line 49
    .line 50
    .line 51
    invoke-direct/range {v2 .. v27}, Lcom/kubi/resources/widget/chart/data/DataPoint;-><init>(IDZZZZZZZFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLcom/kubi/resources/widget/chart/data/TipGravity;ILjava/lang/Long;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 52
    .line 53
    new-instance v3, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 54
    .line 55
    .line 56
    const v27, 0x3ffffd

    .line 57
    .line 58
    const/16 v28, 0x0

    .line 59
    const/4 v4, 0x0

    .line 60
    .line 61
    const-wide/high16 v5, 0x401e000000000000L    # 7.5

    .line 62
    const/4 v13, 0x0

    .line 63
    const/4 v14, 0x0

    .line 64
    .line 65
    const/16 v18, 0x0

    .line 66
    .line 67
    const/16 v20, 0x0

    .line 68
    .line 69
    const/16 v21, 0x0

    .line 70
    .line 71
    const/16 v22, 0x0

    .line 72
    .line 73
    const/16 v24, 0x0

    .line 74
    .line 75
    const/16 v26, 0x0

    .line 76
    .line 77
    .line 78
    invoke-direct/range {v3 .. v28}, Lcom/kubi/resources/widget/chart/data/DataPoint;-><init>(IDZZZZZZZFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLcom/kubi/resources/widget/chart/data/TipGravity;ILjava/lang/Long;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 79
    .line 80
    new-instance v4, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 81
    .line 82
    .line 83
    const v28, 0x3ffffd

    .line 84
    .line 85
    const/16 v29, 0x0

    .line 86
    const/4 v5, 0x0

    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    const-wide v6, 0x4012cccccccccccdL    # 4.7

    .line 92
    const/4 v14, 0x0

    .line 93
    const/4 v15, 0x0

    .line 94
    .line 95
    const/16 v19, 0x0

    .line 96
    .line 97
    const/16 v21, 0x0

    .line 98
    .line 99
    const/16 v22, 0x0

    .line 100
    .line 101
    const/16 v23, 0x0

    .line 102
    .line 103
    const/16 v25, 0x0

    .line 104
    .line 105
    const/16 v27, 0x0

    .line 106
    .line 107
    .line 108
    invoke-direct/range {v4 .. v29}, Lcom/kubi/resources/widget/chart/data/DataPoint;-><init>(IDZZZZZZZFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLcom/kubi/resources/widget/chart/data/TipGravity;ILjava/lang/Long;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 109
    .line 110
    new-instance v5, Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 111
    .line 112
    .line 113
    const v29, 0x3ffffd

    .line 114
    .line 115
    const/16 v30, 0x0

    .line 116
    const/4 v6, 0x0

    .line 117
    .line 118
    const-wide/high16 v7, 0x400c000000000000L    # 3.5

    .line 119
    const/4 v15, 0x0

    .line 120
    .line 121
    const/16 v16, 0x0

    .line 122
    .line 123
    const/16 v20, 0x0

    .line 124
    .line 125
    const/16 v22, 0x0

    .line 126
    .line 127
    const/16 v23, 0x0

    .line 128
    .line 129
    const/16 v24, 0x0

    .line 130
    .line 131
    const/16 v26, 0x0

    .line 132
    .line 133
    const/16 v28, 0x0

    .line 134
    .line 135
    .line 136
    invoke-direct/range {v5 .. v30}, Lcom/kubi/resources/widget/chart/data/DataPoint;-><init>(IDZZZZZZZFLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;FFLcom/kubi/resources/widget/chart/data/TipGravity;ILjava/lang/Long;Ljava/lang/String;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 137
    .line 138
    .line 139
    filled-new-array {v2, v3, v4, v5}, [Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 140
    move-result-object v0

    .line 141
    .line 142
    .line 143
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    sput-object v0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->m:Ljava/util/List;

    .line 147
    return-void
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
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;ILow/a;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/util/AttributeSet;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Low/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Landroid/util/AttributeSet;",
            "ITT;)V"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
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
    const-string v0, "mChartConfiguration"

    .line 8
    .line 9
    .line 10
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-direct {p0, p1, p2, p3}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 14
    .line 15
    iput-object p4, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

    .line 16
    .line 17
    new-instance p1, Lmw/a;

    .line 18
    .line 19
    .line 20
    invoke-direct {p1}, Lmw/a;-><init>()V

    .line 21
    .line 22
    iput-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->c:Lcom/kubi/resources/widget/chart/animation/ChartAnimation;

    .line 23
    .line 24
    new-instance p1, Lrw/c;

    .line 25
    .line 26
    .line 27
    invoke-direct {p1}, Lrw/c;-><init>()V

    .line 28
    .line 29
    iput-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->d:Llw/g;

    .line 30
    .line 31
    new-instance p1, Llw/h;

    .line 32
    const/4 p3, 0x0

    .line 33
    const/4 p4, 0x3

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, p3, p3, p4, p3}, Llw/h;-><init>(Landroid/graphics/Paint;Landroid/graphics/Typeface;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 37
    .line 38
    iput-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->i:Llw/h;

    .line 39
    .line 40
    new-instance p1, Landroid/text/TextPaint;

    .line 41
    .line 42
    .line 43
    invoke-direct {p1}, Landroid/text/TextPaint;-><init>()V

    .line 44
    .line 45
    iput-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->j:Landroid/text/TextPaint;

    .line 46
    .line 47
    new-instance p1, Ljava/util/ArrayList;

    .line 48
    .line 49
    .line 50
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 51
    .line 52
    iput-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->k:Ljava/util/List;

    .line 53
    .line 54
    sget-object p1, Lcom/kubi/sdk/res/R$styleable;->ChartAttrs:[I

    .line 55
    .line 56
    const-string p3, "ChartAttrs"

    .line 57
    .line 58
    .line 59
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 60
    .line 61
    .line 62
    invoke-static {p0, p2, p1}, Lqw/a;->a(Landroid/widget/FrameLayout;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    .line 66
    invoke-direct {p0, p1}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->i(Landroid/content/res/TypedArray;)V

    .line 67
    .line 68
    new-instance p1, Lcom/kubi/resources/widget/chart/view/AxisChartView$b;

    .line 69
    .line 70
    .line 71
    invoke-direct {p1, p0, p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView$b;-><init>(Landroid/view/View;Lcom/kubi/resources/widget/chart/view/AxisChartView;)V

    .line 72
    .line 73
    .line 74
    invoke-static {p0, p1}, Landroidx/core/view/OneShotPreDrawListener;->add(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/OneShotPreDrawListener;

    .line 75
    return-void
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

.method public static final synthetic g(Lcom/kubi/resources/widget/chart/view/AxisChartView;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->k:Ljava/util/List;

    .line 3
    return-object p0
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
.end method

.method private final i(Landroid/content/res/TypedArray;)V
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

    .line 3
    .line 4
    sget v1, Lcom/kubi/sdk/res/R$styleable;->ChartAttrs_chart_axis:I

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    const-string v2, "0"

    .line 11
    .line 12
    const-string v3, "1"

    .line 13
    .line 14
    const-string v4, "2"

    .line 15
    .line 16
    if-eqz v1, :cond_3

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 20
    move-result v5

    .line 21
    .line 22
    .line 23
    packed-switch v5, :pswitch_data_0

    .line 24
    goto :goto_0

    .line 25
    .line 26
    .line 27
    :pswitch_0
    invoke-virtual {v1, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 28
    move-result v1

    .line 29
    .line 30
    if-nez v1, :cond_0

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_0
    sget-object v1, Lcom/kubi/resources/widget/chart/data/AxisType;->Y:Lcom/kubi/resources/widget/chart/data/AxisType;

    .line 34
    goto :goto_1

    .line 35
    .line 36
    .line 37
    :pswitch_1
    invoke-virtual {v1, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 38
    move-result v1

    .line 39
    .line 40
    if-nez v1, :cond_1

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_1
    sget-object v1, Lcom/kubi/resources/widget/chart/data/AxisType;->X:Lcom/kubi/resources/widget/chart/data/AxisType;

    .line 44
    goto :goto_1

    .line 45
    .line 46
    .line 47
    :pswitch_2
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 48
    move-result v1

    .line 49
    .line 50
    if-nez v1, :cond_2

    .line 51
    goto :goto_0

    .line 52
    .line 53
    :cond_2
    sget-object v1, Lcom/kubi/resources/widget/chart/data/AxisType;->NONE:Lcom/kubi/resources/widget/chart/data/AxisType;

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :cond_3
    :goto_0
    sget-object v1, Lcom/kubi/resources/widget/chart/data/AxisType;->XY:Lcom/kubi/resources/widget/chart/data/AxisType;

    .line 57
    .line 58
    .line 59
    :goto_1
    invoke-virtual {v0, v1}, Low/a;->q(Lcom/kubi/resources/widget/chart/data/AxisType;)V

    .line 60
    .line 61
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

    .line 62
    .line 63
    sget v1, Lcom/kubi/sdk/res/R$styleable;->ChartAttrs_chart_labelsSize:I

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0}, Low/a;->g()F

    .line 67
    move-result v5

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v1, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 71
    move-result v1

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v1}, Low/a;->v(F)V

    .line 75
    .line 76
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

    .line 77
    .line 78
    sget v1, Lcom/kubi/sdk/res/R$styleable;->ChartAttrs_chart_labelsColor:I

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Low/a;->e()I

    .line 82
    move-result v5

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v1, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 86
    move-result v1

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, v1}, Low/a;->t(I)V

    .line 90
    .line 91
    sget v0, Lcom/kubi/sdk/res/R$styleable;->ChartAttrs_chart_labelsFont:I

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 95
    move-result v1

    .line 96
    .line 97
    if-eqz v1, :cond_4

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 101
    move-result v1

    .line 102
    .line 103
    if-nez v1, :cond_4

    .line 104
    .line 105
    iget-object v1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 109
    move-result-object v5

    .line 110
    const/4 v6, -0x1

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0, v6}, Landroid/content/res/TypedArray;->getResourceId(II)I

    .line 114
    move-result v0

    .line 115
    .line 116
    .line 117
    invoke-static {v5, v0}, Landroidx/core/content/res/ResourcesCompat;->getFont(Landroid/content/Context;I)Landroid/graphics/Typeface;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1, v0}, Low/a;->u(Landroid/graphics/Typeface;)V

    .line 122
    .line 123
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->i:Llw/h;

    .line 124
    .line 125
    iget-object v1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v1}, Low/a;->f()Landroid/graphics/Typeface;

    .line 129
    move-result-object v1

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0, v1}, Llw/h;->g(Landroid/graphics/Typeface;)V

    .line 133
    .line 134
    :cond_4
    sget v0, Lcom/kubi/sdk/res/R$styleable;->ChartAttrs_chart_grid:I

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->hasValue(I)Z

    .line 138
    move-result v1

    .line 139
    .line 140
    if-eqz v1, :cond_d

    .line 141
    .line 142
    new-instance v1, Lrw/b;

    .line 143
    .line 144
    .line 145
    invoke-direct {v1}, Lrw/b;-><init>()V

    .line 146
    .line 147
    .line 148
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 149
    move-result-object v0

    .line 150
    .line 151
    if-eqz v0, :cond_8

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 155
    move-result v5

    .line 156
    .line 157
    .line 158
    packed-switch v5, :pswitch_data_1

    .line 159
    goto :goto_2

    .line 160
    .line 161
    .line 162
    :pswitch_3
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 163
    move-result v0

    .line 164
    .line 165
    if-nez v0, :cond_5

    .line 166
    goto :goto_2

    .line 167
    .line 168
    :cond_5
    sget-object v0, Lcom/kubi/resources/widget/chart/plugin/GridType;->HORIZONTAL:Lcom/kubi/resources/widget/chart/plugin/GridType;

    .line 169
    goto :goto_3

    .line 170
    .line 171
    .line 172
    :pswitch_4
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 173
    move-result v0

    .line 174
    .line 175
    if-nez v0, :cond_6

    .line 176
    goto :goto_2

    .line 177
    .line 178
    :cond_6
    sget-object v0, Lcom/kubi/resources/widget/chart/plugin/GridType;->VERTICAL:Lcom/kubi/resources/widget/chart/plugin/GridType;

    .line 179
    goto :goto_3

    .line 180
    .line 181
    .line 182
    :pswitch_5
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 183
    move-result v0

    .line 184
    .line 185
    if-nez v0, :cond_7

    .line 186
    goto :goto_2

    .line 187
    .line 188
    :cond_7
    sget-object v0, Lcom/kubi/resources/widget/chart/plugin/GridType;->FULL:Lcom/kubi/resources/widget/chart/plugin/GridType;

    .line 189
    goto :goto_3

    .line 190
    .line 191
    :cond_8
    :goto_2
    sget-object v0, Lcom/kubi/resources/widget/chart/plugin/GridType;->FULL:Lcom/kubi/resources/widget/chart/plugin/GridType;

    .line 192
    .line 193
    .line 194
    :goto_3
    invoke-virtual {v1, v0}, Lrw/b;->i(Lcom/kubi/resources/widget/chart/plugin/GridType;)V

    .line 195
    .line 196
    sget v0, Lcom/kubi/sdk/res/R$styleable;->ChartAttrs_chart_gridColor:I

    .line 197
    .line 198
    .line 199
    invoke-virtual {v1}, Lrw/b;->c()I

    .line 200
    move-result v5

    .line 201
    .line 202
    .line 203
    invoke-virtual {p1, v0, v5}, Landroid/content/res/TypedArray;->getColor(II)I

    .line 204
    move-result v0

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v0}, Lrw/b;->g(I)V

    .line 208
    .line 209
    sget v0, Lcom/kubi/sdk/res/R$styleable;->ChartAttrs_chart_gridStrokeWidth:I

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Lrw/b;->e()F

    .line 213
    move-result v5

    .line 214
    .line 215
    .line 216
    invoke-virtual {p1, v0, v5}, Landroid/content/res/TypedArray;->getDimension(IF)F

    .line 217
    move-result v0

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v0}, Lrw/b;->j(F)V

    .line 221
    .line 222
    sget v0, Lcom/kubi/sdk/res/R$styleable;->ChartAttrs_chart_gridEffect:I

    .line 223
    .line 224
    .line 225
    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    .line 226
    move-result-object v0

    .line 227
    .line 228
    if-eqz v0, :cond_c

    .line 229
    .line 230
    .line 231
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 232
    move-result v5

    .line 233
    .line 234
    .line 235
    packed-switch v5, :pswitch_data_2

    .line 236
    goto :goto_4

    .line 237
    .line 238
    .line 239
    :pswitch_6
    invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 240
    move-result v0

    .line 241
    .line 242
    if-nez v0, :cond_9

    .line 243
    goto :goto_4

    .line 244
    .line 245
    :cond_9
    sget-object v0, Lcom/kubi/resources/widget/chart/plugin/GridEffect;->DOTTED:Lcom/kubi/resources/widget/chart/plugin/GridEffect;

    .line 246
    goto :goto_5

    .line 247
    .line 248
    .line 249
    :pswitch_7
    invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 250
    move-result v0

    .line 251
    .line 252
    if-nez v0, :cond_a

    .line 253
    goto :goto_4

    .line 254
    .line 255
    :cond_a
    sget-object v0, Lcom/kubi/resources/widget/chart/plugin/GridEffect;->DASHED:Lcom/kubi/resources/widget/chart/plugin/GridEffect;

    .line 256
    goto :goto_5

    .line 257
    .line 258
    .line 259
    :pswitch_8
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 260
    move-result v0

    .line 261
    .line 262
    if-nez v0, :cond_b

    .line 263
    goto :goto_4

    .line 264
    .line 265
    :cond_b
    sget-object v0, Lcom/kubi/resources/widget/chart/plugin/GridEffect;->SOLID:Lcom/kubi/resources/widget/chart/plugin/GridEffect;

    .line 266
    goto :goto_5

    .line 267
    .line 268
    :cond_c
    :goto_4
    sget-object v0, Lcom/kubi/resources/widget/chart/plugin/GridEffect;->SOLID:Lcom/kubi/resources/widget/chart/plugin/GridEffect;

    .line 269
    .line 270
    .line 271
    :goto_5
    invoke-virtual {v1, v0}, Lrw/b;->h(Lcom/kubi/resources/widget/chart/plugin/GridEffect;)V

    .line 272
    .line 273
    iput-object v1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->e:Llw/d;

    .line 274
    .line 275
    .line 276
    :cond_d
    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    .line 277
    return-void

    .line 278
    nop

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
    :pswitch_data_0
    .packed-switch 0x30
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch

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
    :pswitch_data_1
    .packed-switch 0x30
        :pswitch_5
        :pswitch_4
        :pswitch_3
    .end packed-switch

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
    :pswitch_data_2
    .packed-switch 0x30
        :pswitch_8
        :pswitch_7
        :pswitch_6
    .end packed-switch
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
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
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
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method


# virtual methods
.method public final getAnimation()Lcom/kubi/resources/widget/chart/animation/ChartAnimation;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lcom/kubi/resources/widget/chart/animation/ChartAnimation<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->c:Lcom/kubi/resources/widget/chart/animation/ChartAnimation;

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

.method public final getCanvas()Landroid/graphics/Canvas;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->h:Landroid/graphics/Canvas;

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

.method public final getGrid()Llw/d;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->e:Llw/d;

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

.method public final getLabels()Llw/g;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->d:Llw/g;

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

.method public final getMChartConfiguration()Low/a;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

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

.method public final getPainter()Llw/h;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->i:Llw/h;

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

.method public abstract getRenderer()Llw/c;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end method

.method public final getTextPainter()Landroid/text/TextPaint;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->j:Landroid/text/TextPaint;

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

.method public final h(Llw/i;)V
    .locals 1
    .param p1    # Llw/i;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "listener"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->k:Ljava/util/List;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

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
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final j()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/view/View;->isInEditMode()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->m:Ljava/util/List;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->l(Ljava/util/List;)V

    .line 12
    :cond_0
    return-void
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

.method public final k(Landroid/view/MotionEvent;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getRenderer()Llw/c;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 16
    move-result p1

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-interface {v0, v1, p1}, Llw/c;->f(Ljava/lang/Float;Ljava/lang/Float;)Lcom/kubi/resources/widget/chart/data/DataPoint;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    const-string v1, "MotionEvent event ---> ACTION_DOWN index:"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    const-string v1, "chart"

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v0}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 47
    .line 48
    if-eqz p1, :cond_0

    .line 49
    .line 50
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->k:Ljava/util/List;

    .line 51
    .line 52
    .line 53
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 58
    move-result v1

    .line 59
    .line 60
    if-eqz v1, :cond_0

    .line 61
    .line 62
    .line 63
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    check-cast v1, Llw/i;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getRenderer()Llw/c;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    .line 73
    invoke-interface {v1, p1, v2}, Llw/i;->a(Lcom/kubi/resources/widget/chart/data/DataPoint;Llw/c;)V

    .line 74
    goto :goto_0

    .line 75
    :cond_0
    return-void
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

.method public final l(Ljava/util/List;)V
    .locals 1
    .param p1    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "entries"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    new-instance v0, Lcom/kubi/resources/widget/chart/view/AxisChartView$a;

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, p0, p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView$a;-><init>(Landroid/view/View;Lcom/kubi/resources/widget/chart/view/AxisChartView;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, Landroidx/core/view/OneShotPreDrawListener;->add(Landroid/view/View;Ljava/lang/Runnable;)Landroidx/core/view/OneShotPreDrawListener;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getRenderer()Llw/c;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, p1}, Llw/c;->e(Ljava/util/List;)V

    .line 21
    return-void
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
.end method

.method public final m(Lkotlin/jvm/functions/Function1;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1<",
            "-TT;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "block"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

    .line 8
    .line 9
    .line 10
    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 11
    .line 12
    iget-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->j:Landroid/text/TextPaint;

    .line 13
    .line 14
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Low/a;->k()F

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 22
    .line 23
    iget-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->j:Landroid/text/TextPaint;

    .line 24
    .line 25
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Low/a;->j()I

    .line 29
    move-result v0

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    .line 33
    .line 34
    iget-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Low/a;->l()Landroid/graphics/Typeface;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    if-eqz p1, :cond_0

    .line 41
    .line 42
    iget-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->j:Landroid/text/TextPaint;

    .line 43
    .line 44
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Low/a;->l()Landroid/graphics/Typeface;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    .line 52
    .line 53
    .line 54
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->postInvalidate()V

    .line 55
    return-void
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

.method public onAttachedToWindow()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Landroid/view/View;->setWillNotDraw(Z)V

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

.method public onDetachedFromWindow()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getRenderer()Llw/c;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Llw/c;->stopAnimation()V

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

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 1
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

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
    invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V

    .line 9
    .line 10
    iput-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->h:Landroid/graphics/Canvas;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getRenderer()Llw/c;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    .line 17
    invoke-interface {p1}, Llw/c;->i()V

    .line 18
    return-void
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
.end method

.method public onMeasure(II)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroid/widget/FrameLayout;->onMeasure(II)V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 7
    move-result v0

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 11
    move-result v1

    .line 12
    .line 13
    const/high16 v2, -0x80000000

    .line 14
    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    .line 17
    const/16 p1, 0xc8

    .line 18
    .line 19
    :cond_0
    if-ne v1, v2, :cond_1

    .line 20
    .line 21
    const/16 p2, 0x64

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 25
    return-void
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
.end method

.method public onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 4
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Low/a;->c()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-super {p0, p1}, Landroid/view/View;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 12
    move-result p1

    .line 13
    return p1

    .line 14
    .line 15
    :cond_0
    if-eqz p1, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 19
    move-result v0

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getRenderer()Llw/c;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Llw/c;->h()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 32
    move-result v0

    .line 33
    .line 34
    iput v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->f:F

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 38
    move-result v0

    .line 39
    .line 40
    iput v0, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->g:F

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->k(Landroid/view/MotionEvent;)V

    .line 44
    :cond_1
    const/4 v0, 0x1

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 50
    move-result v1

    .line 51
    const/4 v2, 0x2

    .line 52
    .line 53
    if-ne v1, v2, :cond_2

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F

    .line 57
    move-result v1

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F

    .line 61
    move-result v2

    .line 62
    .line 63
    iget v3, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->f:F

    .line 64
    sub-float/2addr v1, v3

    .line 65
    .line 66
    iget v3, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->g:F

    .line 67
    sub-float/2addr v2, v3

    .line 68
    .line 69
    .line 70
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 71
    move-result v1

    .line 72
    .line 73
    .line 74
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 75
    move-result v2

    .line 76
    .line 77
    cmpl-float v1, v1, v2

    .line 78
    .line 79
    if-lez v1, :cond_2

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 83
    move-result-object v1

    .line 84
    .line 85
    .line 86
    invoke-interface {v1, v0}, Landroid/view/ViewParent;->requestDisallowInterceptTouchEvent(Z)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {p0, p1}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->k(Landroid/view/MotionEvent;)V

    .line 90
    .line 91
    :cond_2
    if-eqz p1, :cond_3

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 95
    move-result v1

    .line 96
    .line 97
    if-ne v1, v0, :cond_3

    .line 98
    goto :goto_0

    .line 99
    .line 100
    :cond_3
    if-eqz p1, :cond_4

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I

    .line 104
    move-result p1

    .line 105
    const/4 v1, 0x3

    .line 106
    .line 107
    if-ne p1, v1, :cond_4

    .line 108
    .line 109
    :goto_0
    const-string p1, "chart"

    .line 110
    .line 111
    const-string v1, "MotionEvent event ---> ACTION_UP"

    .line 112
    .line 113
    .line 114
    invoke-static {p1, v1}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 115
    .line 116
    iget-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->k:Ljava/util/List;

    .line 117
    .line 118
    .line 119
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 120
    move-result-object p1

    .line 121
    .line 122
    .line 123
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 124
    move-result v1

    .line 125
    .line 126
    if-eqz v1, :cond_4

    .line 127
    .line 128
    .line 129
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 130
    move-result-object v1

    .line 131
    .line 132
    check-cast v1, Llw/i;

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0}, Lcom/kubi/resources/widget/chart/view/AxisChartView;->getRenderer()Llw/c;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    .line 139
    invoke-interface {v1, v2}, Llw/i;->b(Llw/c;)V

    .line 140
    goto :goto_1

    .line 141
    :cond_4
    return v0
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

.method public final setAnimation(Lcom/kubi/resources/widget/chart/animation/ChartAnimation;)V
    .locals 1
    .param p1    # Lcom/kubi/resources/widget/chart/animation/ChartAnimation;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/kubi/resources/widget/chart/animation/ChartAnimation<",
            "Lcom/kubi/resources/widget/chart/data/DataPoint;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->c:Lcom/kubi/resources/widget/chart/animation/ChartAnimation;

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
.end method

.method public final setCanvas(Landroid/graphics/Canvas;)V
    .locals 0
    .param p1    # Landroid/graphics/Canvas;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->h:Landroid/graphics/Canvas;

    .line 3
    return-void
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
.end method

.method public final setGrid(Llw/d;)V
    .locals 0
    .param p1    # Llw/d;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->e:Llw/d;

    .line 3
    return-void
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
.end method

.method public final setMChartConfiguration(Low/a;)V
    .locals 1
    .param p1    # Low/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(TT;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/resources/widget/chart/view/AxisChartView;->b:Low/a;

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
.end method
