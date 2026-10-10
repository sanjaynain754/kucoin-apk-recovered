.class public final Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;
.super Landroid/view/View;
.source "KCCountdownView.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0005\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000e\n\u0002\u0008\r*\u0001\u001e\u0018\u00002\u00020\u0001:\u00019B\'\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000e\u0010 \u001a\u00020\u00182\u0006\u0010!\u001a\u00020\u0013J\u0006\u0010\"\u001a\u00020\u0018J\u0010\u0010#\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%H\u0014J@\u0010&\u001a\u00020\u00182\u0006\u0010$\u001a\u00020%2\u0006\u0010\'\u001a\u00020\u00112\u0006\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020\u00112\u0006\u0010*\u001a\u00020\u00112\u0006\u0010+\u001a\u00020\u00132\u0006\u0010,\u001a\u00020-H\u0002J\u0018\u0010.\u001a\u00020\u00182\u0006\u0010/\u001a\u00020\u00072\u0006\u00100\u001a\u00020\u0007H\u0014J\u0008\u00101\u001a\u00020\u0018H\u0014J\u000e\u00102\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0011J\u000e\u00104\u001a\u00020\u00182\u0006\u00103\u001a\u00020\u0011J\u0010\u00105\u001a\u00020\u00182\u0008\u0008\u0001\u00106\u001a\u00020\u0007J\u0010\u00107\u001a\u00020\u00182\u0008\u0008\u0001\u00106\u001a\u00020\u0007J\u0010\u00108\u001a\u00020\u00182\u0008\u0008\u0001\u00106\u001a\u00020\u0007R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000c\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u0017X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0019\u0010\u001a\"\u0004\u0008\u001b\u0010\u001cR\u0010\u0010\u001d\u001a\u00020\u001eX\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u001f\u00a8\u0006:"
    }
    d2 = {
        "Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;",
        "Landroid/view/View;",
        "context",
        "Landroid/content/Context;",
        "attrs",
        "Landroid/util/AttributeSet;",
        "defStyleAttr",
        "",
        "<init>",
        "(Landroid/content/Context;Landroid/util/AttributeSet;I)V",
        "numberPaint",
        "Landroid/graphics/Paint;",
        "labelPaint",
        "backgroundPaint",
        "rectF",
        "Landroid/graphics/RectF;",
        "cornerRadius",
        "",
        "targetTimeMillis",
        "",
        "currentTimeData",
        "Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$TimeData;",
        "onCountdownFinishListener",
        "Lkotlin/Function0;",
        "",
        "getOnCountdownFinishListener",
        "()Lkotlin/jvm/functions/Function0;",
        "setOnCountdownFinishListener",
        "(Lkotlin/jvm/functions/Function0;)V",
        "countdownRunnable",
        "com/trtc/uikit/livekit/kc/widget/KCCountdownView$countdownRunnable$1",
        "Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$countdownRunnable$1;",
        "setTargetTime",
        "targetMillis",
        "stopCountdown",
        "onDraw",
        "canvas",
        "Landroid/graphics/Canvas;",
        "drawTimeUnit",
        "left",
        "top",
        "width",
        "height",
        "value",
        "label",
        "",
        "onMeasure",
        "widthMeasureSpec",
        "heightMeasureSpec",
        "onDetachedFromWindow",
        "setNumberTextSize",
        "size",
        "setLabelTextSize",
        "setNumberTextColor",
        "color",
        "setLabelTextColor",
        "setItemBackgroundColor",
        "TimeData",
        "tuilivekit_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field public final b:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final c:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Landroid/graphics/Paint;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Landroid/graphics/RectF;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:F

.field public g:J

.field public h:Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public i:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final j:Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$b;
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

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

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

    invoke-direct/range {v1 .. v6}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V
    .locals 11
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
    invoke-direct {p0, p1, p2, p3}, Landroid/view/View;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    .line 5
    new-instance p1, Landroid/graphics/Paint;

    const/4 p2, 0x1

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    const/4 p3, -0x1

    .line 6
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p3, 0x42400000    # 48.0f

    .line 7
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 8
    sget-object p3, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 9
    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setFakeBoldText(Z)V

    .line 10
    iput-object p1, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->b:Landroid/graphics/Paint;

    .line 11
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 12
    const-string v0, "#99FFFFFF"

    invoke-static {v0}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 v0, 0x41c00000    # 24.0f

    .line 13
    invoke-virtual {p1, v0}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 14
    invoke-virtual {p1, p3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    .line 15
    iput-object p1, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->c:Landroid/graphics/Paint;

    .line 16
    new-instance p1, Landroid/graphics/Paint;

    invoke-direct {p1, p2}, Landroid/graphics/Paint;-><init>(I)V

    .line 17
    const-string p2, "#66000000"

    invoke-static {p2}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    move-result p2

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setColor(I)V

    .line 18
    sget-object p2, Landroid/graphics/Paint$Style;->FILL:Landroid/graphics/Paint$Style;

    invoke-virtual {p1, p2}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V

    .line 19
    iput-object p1, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->d:Landroid/graphics/Paint;

    .line 20
    new-instance p1, Landroid/graphics/RectF;

    invoke-direct {p1}, Landroid/graphics/RectF;-><init>()V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->e:Landroid/graphics/RectF;

    const/high16 p1, 0x41400000    # 12.0f

    .line 21
    iput p1, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->f:F

    .line 22
    new-instance v0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;

    const/16 v9, 0xf

    const/4 v10, 0x0

    const-wide/16 v1, 0x0

    const-wide/16 v3, 0x0

    const-wide/16 v5, 0x0

    const-wide/16 v7, 0x0

    invoke-direct/range {v0 .. v10}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;-><init>(JJJJILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->h:Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;

    .line 23
    new-instance p1, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$b;

    invoke-direct {p1, p0}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$b;-><init>(Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;)V

    iput-object p1, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->j:Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$b;

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
    invoke-direct {p0, p1, p2, p3}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V

    return-void
.end method

.method public static final synthetic a(Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->g:J

    .line 3
    return-wide v0
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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public static final synthetic b(Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->h:Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;

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
.method public final c(Landroid/graphics/Canvas;FFFFJLjava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->e:Landroid/graphics/RectF;

    .line 3
    .line 4
    add-float v1, p2, p4

    .line 5
    .line 6
    add-float v2, p3, p5

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p2, p3, v1, v2}, Landroid/graphics/RectF;->set(FFFF)V

    .line 10
    .line 11
    iget-object v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->e:Landroid/graphics/RectF;

    .line 12
    .line 13
    iget v1, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->f:F

    .line 14
    .line 15
    iget-object v2, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->d:Landroid/graphics/Paint;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0, v1, v1, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V

    .line 19
    .line 20
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 21
    .line 22
    .line 23
    invoke-static {p6, p7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 24
    move-result-object p6

    .line 25
    .line 26
    .line 27
    filled-new-array {p6}, [Ljava/lang/Object;

    .line 28
    move-result-object p6

    .line 29
    const/4 p7, 0x1

    .line 30
    .line 31
    .line 32
    invoke-static {p6, p7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 33
    move-result-object p6

    .line 34
    .line 35
    const-string p7, "%02d"

    .line 36
    .line 37
    .line 38
    invoke-static {p7, p6}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 39
    move-result-object p6

    .line 40
    .line 41
    const-string p7, "format(...)"

    .line 42
    .line 43
    .line 44
    invoke-static {p6, p7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 45
    const/4 p7, 0x2

    .line 46
    int-to-float p7, p7

    .line 47
    div-float/2addr p5, p7

    .line 48
    add-float/2addr p3, p5

    .line 49
    .line 50
    iget-object p5, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->b:Landroid/graphics/Paint;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p5}, Landroid/graphics/Paint;->descent()F

    .line 54
    move-result p5

    .line 55
    .line 56
    iget-object v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->b:Landroid/graphics/Paint;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Landroid/graphics/Paint;->ascent()F

    .line 60
    move-result v0

    .line 61
    add-float/2addr p5, v0

    .line 62
    div-float/2addr p5, p7

    .line 63
    .line 64
    sub-float p5, p3, p5

    .line 65
    .line 66
    const/high16 v0, 0x41700000    # 15.0f

    .line 67
    sub-float/2addr p5, v0

    .line 68
    div-float/2addr p4, p7

    .line 69
    add-float/2addr p2, p4

    .line 70
    .line 71
    iget-object p4, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->b:Landroid/graphics/Paint;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, p6, p2, p5, p4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 75
    .line 76
    iget-object p4, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->c:Landroid/graphics/Paint;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p4}, Landroid/graphics/Paint;->descent()F

    .line 80
    move-result p4

    .line 81
    .line 82
    iget-object p5, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->c:Landroid/graphics/Paint;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p5}, Landroid/graphics/Paint;->ascent()F

    .line 86
    move-result p5

    .line 87
    add-float/2addr p4, p5

    .line 88
    div-float/2addr p4, p7

    .line 89
    sub-float/2addr p3, p4

    .line 90
    .line 91
    const/high16 p4, 0x41c80000    # 25.0f

    .line 92
    add-float/2addr p3, p4

    .line 93
    .line 94
    iget-object p4, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->c:Landroid/graphics/Paint;

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, p8, p2, p3, p4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    .line 98
    return-void
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
.end method

.method public final d()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->j:Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

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
.end method

.method public final getOnCountdownFinishListener()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->i:Lkotlin/jvm/functions/Function0;

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
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public onDetachedFromWindow()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->d()V

    .line 7
    return-void
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
.end method

.method public onDraw(Landroid/graphics/Canvas;)V
    .locals 11
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
    .line 11
    invoke-virtual {p0}, Landroid/view/View;->getWidth()I

    .line 12
    move-result v0

    .line 13
    int-to-float v0, v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroid/view/View;->getHeight()I

    .line 17
    move-result v1

    .line 18
    int-to-float v7, v1

    .line 19
    .line 20
    const/high16 v1, 0x42700000    # 60.0f

    .line 21
    sub-float/2addr v0, v1

    .line 22
    .line 23
    const/high16 v1, 0x40800000    # 4.0f

    .line 24
    .line 25
    div-float v6, v0, v1

    .line 26
    .line 27
    iget-object v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->h:Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;->a()J

    .line 31
    move-result-wide v8

    .line 32
    .line 33
    const-string v10, "\u5929"

    .line 34
    const/4 v4, 0x0

    .line 35
    const/4 v5, 0x0

    .line 36
    move-object v2, p0

    .line 37
    move-object v3, p1

    .line 38
    .line 39
    .line 40
    invoke-virtual/range {v2 .. v10}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->c(Landroid/graphics/Canvas;FFFFJLjava/lang/String;)V

    .line 41
    .line 42
    const/high16 p1, 0x41a00000    # 20.0f

    .line 43
    .line 44
    add-float v4, v6, p1

    .line 45
    .line 46
    iget-object p1, v2, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->h:Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;->b()J

    .line 50
    move-result-wide v8

    .line 51
    .line 52
    const-string v10, "\u5c0f\u65f6"

    .line 53
    .line 54
    .line 55
    invoke-virtual/range {v2 .. v10}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->c(Landroid/graphics/Canvas;FFFFJLjava/lang/String;)V

    .line 56
    move p1, v4

    .line 57
    const/4 v0, 0x2

    .line 58
    int-to-float v0, v0

    .line 59
    .line 60
    mul-float v4, p1, v0

    .line 61
    .line 62
    iget-object v0, v2, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->h:Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;->c()J

    .line 66
    move-result-wide v8

    .line 67
    .line 68
    const-string v10, "\u5206\u949f"

    .line 69
    .line 70
    .line 71
    invoke-virtual/range {v2 .. v10}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->c(Landroid/graphics/Canvas;FFFFJLjava/lang/String;)V

    .line 72
    const/4 v0, 0x3

    .line 73
    int-to-float v0, v0

    .line 74
    .line 75
    mul-float v4, p1, v0

    .line 76
    .line 77
    iget-object p1, v2, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->h:Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$a;->d()J

    .line 81
    move-result-wide v8

    .line 82
    .line 83
    const-string v10, "\u79d2"

    .line 84
    .line 85
    .line 86
    invoke-virtual/range {v2 .. v10}, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->c(Landroid/graphics/Canvas;FFFFJLjava/lang/String;)V

    .line 87
    return-void
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
.end method

.method public onMeasure(II)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 8
    move-result p1

    .line 9
    .line 10
    .line 11
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getMode(I)I

    .line 12
    move-result v1

    .line 13
    .line 14
    .line 15
    invoke-static {p2}, Landroid/view/View$MeasureSpec;->getSize(I)I

    .line 16
    move-result p2

    .line 17
    .line 18
    const/high16 v2, 0x40000000    # 2.0f

    .line 19
    .line 20
    const/high16 v3, -0x80000000

    .line 21
    .line 22
    const/16 v4, 0x140

    .line 23
    .line 24
    if-eq v0, v3, :cond_0

    .line 25
    .line 26
    if-eq v0, v2, :cond_1

    .line 27
    move p1, v4

    .line 28
    goto :goto_0

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-static {v4, p1}, Ljava/lang/Math;->min(II)I

    .line 32
    move-result p1

    .line 33
    .line 34
    :cond_1
    :goto_0
    const/16 v0, 0x64

    .line 35
    .line 36
    if-eq v1, v3, :cond_2

    .line 37
    .line 38
    if-eq v1, v2, :cond_3

    .line 39
    move p2, v0

    .line 40
    goto :goto_1

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-static {v0, p2}, Ljava/lang/Math;->min(II)I

    .line 44
    move-result p2

    .line 45
    .line 46
    .line 47
    :cond_3
    :goto_1
    invoke-virtual {p0, p1, p2}, Landroid/view/View;->setMeasuredDimension(II)V

    .line 48
    return-void
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

.method public final setItemBackgroundColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->d:Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public final setLabelTextColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->c:Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public final setLabelTextSize(F)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->c:Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public final setNumberTextColor(I)V
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/ColorInt;
        .end annotation
    .end param

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->b:Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setColor(I)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public final setNumberTextSize(F)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->b:Landroid/graphics/Paint;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Landroid/graphics/Paint;->setTextSize(F)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroid/view/View;->invalidate()V

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
.end method

.method public final setOnCountdownFinishListener(Lkotlin/jvm/functions/Function0;)V
    .locals 0
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    iput-object p1, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->i:Lkotlin/jvm/functions/Function0;

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
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public final setTargetTime(J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->g:J

    .line 3
    .line 4
    iget-object p1, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->j:Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$b;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1}, Landroid/view/View;->removeCallbacks(Ljava/lang/Runnable;)Z

    .line 8
    .line 9
    iget-object p1, p0, Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView;->j:Lcom/trtc/uikit/livekit/kc/widget/KCCountdownView$b;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

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
.end method
