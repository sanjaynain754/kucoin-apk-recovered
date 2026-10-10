.class public final Landroidx/camera/view/impl/ZoomGestureDetector;
.super Ljava/lang/Object;
.source "ZoomGestureDetector.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/camera/view/impl/ZoomGestureDetector$Companion;,
        Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;,
        Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0010\u0007\n\u0002\u0008\u0006\n\u0002\u0010\t\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 02\u00020\u0001:\u0003./0B-\u0008\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0003\u0010\u0004\u001a\u00020\u0005\u0012\u0008\u0008\u0003\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0010\u0010&\u001a\u00020\u000e2\u0006\u0010\'\u001a\u00020(H\u0007J\u0008\u0010)\u001a\u00020\u000eH\u0002J\u0008\u0010*\u001a\u00020\u0015H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0008X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000b\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u0012\u0010\u000c\u001a\u00020\u00058\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\r\u0010\u000f\"\u0004\u0008\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u000f\"\u0004\u0008\u0013\u0010\u0011R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\u000eX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0011\u0010+\u001a\u00020\u001c8F\u00a2\u0006\u0006\u001a\u0004\u0008,\u0010-\u00a8\u00061"
    }
    d2 = {
        "Landroidx/camera/view/impl/ZoomGestureDetector;",
        "",
        "context",
        "Landroid/content/Context;",
        "spanSlop",
        "",
        "minSpan",
        "listener",
        "Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;",
        "<init>",
        "(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;)V",
        "focusX",
        "focusY",
        "isQuickZoomEnabled",
        "",
        "()Z",
        "setQuickZoomEnabled",
        "(Z)V",
        "isStylusZoomEnabled",
        "setStylusZoomEnabled",
        "currentSpan",
        "",
        "previousSpan",
        "currentSpanX",
        "currentSpanY",
        "previousSpanX",
        "previousSpanY",
        "eventTime",
        "",
        "isInProgress",
        "initialSpan",
        "prevTime",
        "anchoredZoomStartX",
        "anchoredZoomStartY",
        "anchoredZoomMode",
        "gestureDetector",
        "Landroid/view/GestureDetector;",
        "eventBeforeOrAboveStartingGestureEvent",
        "onTouchEvent",
        "event",
        "Landroid/view/MotionEvent;",
        "inAnchoredZoomMode",
        "getIncrementalScaleFactor",
        "timeDelta",
        "getTimeDelta",
        "()J",
        "ZoomEvent",
        "OnZoomGestureListener",
        "Companion",
        "camera-view_release"
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
.field private static final ANCHORED_ZOOM_MODE_DOUBLE_TAP:I = 0x1

.field private static final ANCHORED_ZOOM_MODE_NONE:I = 0x0

.field private static final ANCHORED_ZOOM_MODE_STYLUS:I = 0x2

.field public static final Companion:Landroidx/camera/view/impl/ZoomGestureDetector$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final DEFAULT_MIN_SPAN:I = 0x0

.field private static final SCALE_FACTOR:F = 0.5f


# instance fields
.field private anchoredZoomMode:I

.field private anchoredZoomStartX:F

.field private anchoredZoomStartY:F

.field private final context:Landroid/content/Context;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private currentSpan:F

.field private currentSpanX:F

.field private currentSpanY:F

.field private eventBeforeOrAboveStartingGestureEvent:Z

.field private eventTime:J

.field private focusX:I
    .annotation build Landroidx/annotation/Px;
    .end annotation
.end field

.field private focusY:I
    .annotation build Landroidx/annotation/Px;
    .end annotation
.end field

.field private gestureDetector:Landroid/view/GestureDetector;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private initialSpan:F

.field private isInProgress:Z

.field private isQuickZoomEnabled:Z

.field private isStylusZoomEnabled:Z

.field private final listener:Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final minSpan:I

.field private prevTime:J

.field private previousSpan:F

.field private previousSpanX:F

.field private previousSpanY:F

.field private final spanSlop:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroidx/camera/view/impl/ZoomGestureDetector$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Landroidx/camera/view/impl/ZoomGestureDetector$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Landroidx/camera/view/impl/ZoomGestureDetector;->Companion:Landroidx/camera/view/impl/ZoomGestureDetector$Companion;

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
.end method

.method public constructor <init>(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;)V
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/Px;
        .end annotation
    .end param
    .param p3    # I
        .annotation build Landroidx/annotation/Px;
        .end annotation
    .end param
    .param p4    # Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ExecutorRegistration"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "listener"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    iput-object p1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->context:Landroid/content/Context;

    .line 5
    iput p2, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->spanSlop:I

    .line 6
    iput p3, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->minSpan:I

    .line 7
    iput-object p4, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->listener:Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;

    const/4 p2, 0x1

    .line 8
    iput-boolean p2, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->isQuickZoomEnabled:Z

    .line 9
    iput-boolean p2, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->isStylusZoomEnabled:Z

    .line 10
    new-instance p2, Landroid/view/GestureDetector;

    .line 11
    new-instance p3, Landroidx/camera/view/impl/ZoomGestureDetector$gestureDetector$1;

    invoke-direct {p3, p0}, Landroidx/camera/view/impl/ZoomGestureDetector$gestureDetector$1;-><init>(Landroidx/camera/view/impl/ZoomGestureDetector;)V

    .line 12
    invoke-direct {p2, p1, p3}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    iput-object p2, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->gestureDetector:Landroid/view/GestureDetector;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    and-int/lit8 p6, p5, 0x2

    if-eqz p6, :cond_0

    .line 13
    invoke-static {p1}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    mul-int/lit8 p2, p2, 0x2

    :cond_0
    and-int/lit8 p5, p5, 0x4

    if-eqz p5, :cond_1

    const/4 p3, 0x0

    .line 14
    :cond_1
    invoke-direct {p0, p1, p2, p3, p4}, Landroidx/camera/view/impl/ZoomGestureDetector;-><init>(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;ILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # I
        .annotation build Landroidx/annotation/Px;
        .end annotation
    .end param
    .param p3    # Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ExecutorRegistration"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 1
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "listener"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x4

    const/4 v7, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v5, p3

    invoke-direct/range {v1 .. v7}, Landroidx/camera/view/impl/ZoomGestureDetector;-><init>(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;)V
    .locals 8
    .param p1    # Landroid/content/Context;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "ExecutorRegistration"
        }
    .end annotation

    .annotation build Lkotlin/jvm/JvmOverloads;
    .end annotation

    .line 2
    const-string v0, "context"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string/jumbo v0, "listener"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v6, 0x6

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v5, p2

    invoke-direct/range {v1 .. v7}, Landroidx/camera/view/impl/ZoomGestureDetector;-><init>(Landroid/content/Context;IILandroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public static final synthetic access$setAnchoredZoomMode$p(Landroidx/camera/view/impl/ZoomGestureDetector;I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomMode:I

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
.end method

.method public static final synthetic access$setAnchoredZoomStartX$p(Landroidx/camera/view/impl/ZoomGestureDetector;F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomStartX:F

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
.end method

.method public static final synthetic access$setAnchoredZoomStartY$p(Landroidx/camera/view/impl/ZoomGestureDetector;F)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomStartY:F

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
.end method

.method private final getIncrementalScaleFactor()F
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const/high16 v1, 0x3f800000    # 1.0f

    .line 7
    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    iget-boolean v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventBeforeOrAboveStartingGestureEvent:Z

    .line 11
    const/4 v2, 0x1

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget v3, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 16
    .line 17
    iget v4, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 18
    .line 19
    cmpg-float v3, v3, v4

    .line 20
    .line 21
    if-ltz v3, :cond_1

    .line 22
    .line 23
    :cond_0
    if-nez v0, :cond_2

    .line 24
    .line 25
    iget v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 26
    .line 27
    iget v3, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 28
    .line 29
    cmpl-float v0, v0, v3

    .line 30
    .line 31
    if-lez v0, :cond_2

    .line 32
    :cond_1
    move v0, v2

    .line 33
    goto :goto_0

    .line 34
    :cond_2
    const/4 v0, 0x0

    .line 35
    :goto_0
    int-to-float v2, v2

    .line 36
    .line 37
    iget v3, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 38
    .line 39
    iget v4, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 40
    div-float/2addr v3, v4

    .line 41
    sub-float/2addr v2, v3

    .line 42
    .line 43
    .line 44
    invoke-static {v2}, Ljava/lang/Math;->abs(F)F

    .line 45
    move-result v2

    .line 46
    .line 47
    const/high16 v3, 0x3f000000    # 0.5f

    .line 48
    mul-float/2addr v2, v3

    .line 49
    .line 50
    iget v3, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 51
    .line 52
    iget v4, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->spanSlop:I

    .line 53
    int-to-float v4, v4

    .line 54
    .line 55
    cmpg-float v3, v3, v4

    .line 56
    .line 57
    if-gtz v3, :cond_3

    .line 58
    return v1

    .line 59
    .line 60
    :cond_3
    if-eqz v0, :cond_4

    .line 61
    add-float/2addr v2, v1

    .line 62
    return v2

    .line 63
    :cond_4
    sub-float/2addr v1, v2

    .line 64
    return v1

    .line 65
    .line 66
    :cond_5
    iget v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 67
    const/4 v2, 0x0

    .line 68
    .line 69
    cmpl-float v2, v0, v2

    .line 70
    .line 71
    if-lez v2, :cond_6

    .line 72
    .line 73
    iget v1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 74
    div-float/2addr v1, v0

    .line 75
    :cond_6
    return v1
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
.end method

.method private final inAnchoredZoomMode()Z
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomMode:I

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    return v0

    .line 7
    :cond_0
    const/4 v0, 0x0

    .line 8
    return v0
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


# virtual methods
.method public final getTimeDelta()J
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 3
    .line 4
    iget-wide v2, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->prevTime:J

    .line 5
    sub-long/2addr v0, v2

    .line 6
    return-wide v0
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

.method public final isQuickZoomEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->isQuickZoomEnabled:Z

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
    .line 19
    .line 20
.end method

.method public final isStylusZoomEnabled()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->isStylusZoomEnabled:Z

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
    .line 19
    .line 20
.end method

.method public final onTouchEvent(Landroid/view/MotionEvent;)Z
    .locals 26
    .param p1    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/UiThread;
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    const-string v2, "event"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getEventTime()J

    .line 13
    move-result-wide v2

    .line 14
    .line 15
    iput-wide v2, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 19
    move-result v2

    .line 20
    .line 21
    iget-boolean v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isQuickZoomEnabled:Z

    .line 22
    .line 23
    if-eqz v3, :cond_0

    .line 24
    .line 25
    iget-object v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->gestureDetector:Landroid/view/GestureDetector;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v3, v1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getPointerCount()I

    .line 32
    move-result v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getButtonState()I

    .line 36
    move-result v4

    .line 37
    .line 38
    and-int/lit8 v4, v4, 0x20

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x1

    .line 41
    .line 42
    if-eqz v4, :cond_1

    .line 43
    move v4, v6

    .line 44
    goto :goto_0

    .line 45
    :cond_1
    move v4, v5

    .line 46
    .line 47
    :goto_0
    iget v7, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomMode:I

    .line 48
    const/4 v8, 0x2

    .line 49
    .line 50
    if-ne v7, v8, :cond_2

    .line 51
    .line 52
    if-nez v4, :cond_2

    .line 53
    move v7, v6

    .line 54
    goto :goto_1

    .line 55
    :cond_2
    move v7, v5

    .line 56
    .line 57
    :goto_1
    if-eq v2, v6, :cond_4

    .line 58
    const/4 v9, 0x3

    .line 59
    .line 60
    if-eq v2, v9, :cond_4

    .line 61
    .line 62
    if-eqz v7, :cond_3

    .line 63
    goto :goto_2

    .line 64
    :cond_3
    move v9, v5

    .line 65
    goto :goto_3

    .line 66
    :cond_4
    :goto_2
    move v9, v6

    .line 67
    :goto_3
    const/4 v10, 0x0

    .line 68
    .line 69
    if-eqz v2, :cond_6

    .line 70
    .line 71
    if-eqz v9, :cond_5

    .line 72
    goto :goto_4

    .line 73
    .line 74
    :cond_5
    move/from16 v18, v6

    .line 75
    goto :goto_6

    .line 76
    .line 77
    :cond_6
    :goto_4
    iget-boolean v11, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 78
    .line 79
    if-eqz v11, :cond_7

    .line 80
    .line 81
    iget-object v11, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->listener:Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;

    .line 82
    .line 83
    new-instance v12, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$End;

    .line 84
    .line 85
    iget-wide v13, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 86
    .line 87
    iget v15, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusX:I

    .line 88
    .line 89
    move/from16 v18, v6

    .line 90
    .line 91
    iget v6, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusY:I

    .line 92
    .line 93
    .line 94
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->getIncrementalScaleFactor()F

    .line 95
    move-result v17

    .line 96
    .line 97
    move/from16 v16, v6

    .line 98
    .line 99
    .line 100
    invoke-direct/range {v12 .. v17}, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$End;-><init>(JIIF)V

    .line 101
    .line 102
    .line 103
    invoke-interface {v11, v12}, Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;->onZoomEvent(Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;)Z

    .line 104
    .line 105
    iput-boolean v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 106
    .line 107
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->initialSpan:F

    .line 108
    .line 109
    iput v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomMode:I

    .line 110
    goto :goto_5

    .line 111
    .line 112
    :cond_7
    move/from16 v18, v6

    .line 113
    .line 114
    .line 115
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 116
    move-result v6

    .line 117
    .line 118
    if-eqz v6, :cond_8

    .line 119
    .line 120
    if-eqz v9, :cond_8

    .line 121
    .line 122
    iput-boolean v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 123
    .line 124
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->initialSpan:F

    .line 125
    .line 126
    iput v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomMode:I

    .line 127
    .line 128
    :cond_8
    :goto_5
    if-eqz v9, :cond_9

    .line 129
    return v18

    .line 130
    .line 131
    :cond_9
    :goto_6
    iget-boolean v6, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 132
    .line 133
    if-nez v6, :cond_a

    .line 134
    .line 135
    iget-boolean v6, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isStylusZoomEnabled:Z

    .line 136
    .line 137
    if-eqz v6, :cond_a

    .line 138
    .line 139
    .line 140
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 141
    move-result v6

    .line 142
    .line 143
    if-nez v6, :cond_a

    .line 144
    .line 145
    if-nez v9, :cond_a

    .line 146
    .line 147
    if-eqz v4, :cond_a

    .line 148
    .line 149
    .line 150
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getX()F

    .line 151
    move-result v4

    .line 152
    .line 153
    iput v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomStartX:F

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 157
    move-result v4

    .line 158
    .line 159
    iput v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomStartY:F

    .line 160
    .line 161
    iput v8, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomMode:I

    .line 162
    .line 163
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->initialSpan:F

    .line 164
    :cond_a
    const/4 v4, 0x6

    .line 165
    .line 166
    if-eqz v2, :cond_c

    .line 167
    .line 168
    if-eq v2, v4, :cond_c

    .line 169
    const/4 v6, 0x5

    .line 170
    .line 171
    if-eq v2, v6, :cond_c

    .line 172
    .line 173
    if-eqz v7, :cond_b

    .line 174
    goto :goto_7

    .line 175
    :cond_b
    move v6, v5

    .line 176
    goto :goto_8

    .line 177
    .line 178
    :cond_c
    :goto_7
    move/from16 v6, v18

    .line 179
    .line 180
    :goto_8
    if-ne v2, v4, :cond_d

    .line 181
    .line 182
    move/from16 v4, v18

    .line 183
    goto :goto_9

    .line 184
    :cond_d
    move v4, v5

    .line 185
    .line 186
    :goto_9
    if-eqz v4, :cond_e

    .line 187
    .line 188
    .line 189
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getActionIndex()I

    .line 190
    move-result v7

    .line 191
    goto :goto_a

    .line 192
    :cond_e
    const/4 v7, -0x1

    .line 193
    .line 194
    :goto_a
    if-eqz v4, :cond_f

    .line 195
    .line 196
    add-int/lit8 v4, v3, -0x1

    .line 197
    goto :goto_b

    .line 198
    :cond_f
    move v4, v3

    .line 199
    .line 200
    .line 201
    :goto_b
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 202
    move-result v9

    .line 203
    .line 204
    if-eqz v9, :cond_11

    .line 205
    .line 206
    iget v9, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomStartX:F

    .line 207
    .line 208
    iget v11, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->anchoredZoomStartY:F

    .line 209
    .line 210
    .line 211
    invoke-virtual {v1}, Landroid/view/MotionEvent;->getY()F

    .line 212
    move-result v12

    .line 213
    .line 214
    cmpg-float v12, v12, v11

    .line 215
    .line 216
    if-gez v12, :cond_10

    .line 217
    .line 218
    move/from16 v12, v18

    .line 219
    goto :goto_c

    .line 220
    :cond_10
    move v12, v5

    .line 221
    .line 222
    :goto_c
    iput-boolean v12, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventBeforeOrAboveStartingGestureEvent:Z

    .line 223
    goto :goto_e

    .line 224
    :cond_11
    move v9, v5

    .line 225
    move v11, v10

    .line 226
    move v12, v11

    .line 227
    .line 228
    :goto_d
    if-ge v9, v3, :cond_13

    .line 229
    .line 230
    if-eq v7, v9, :cond_12

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getX(I)F

    .line 234
    move-result v13

    .line 235
    add-float/2addr v11, v13

    .line 236
    .line 237
    .line 238
    invoke-virtual {v1, v9}, Landroid/view/MotionEvent;->getY(I)F

    .line 239
    move-result v13

    .line 240
    add-float/2addr v12, v13

    .line 241
    .line 242
    :cond_12
    add-int/lit8 v9, v9, 0x1

    .line 243
    goto :goto_d

    .line 244
    :cond_13
    int-to-float v9, v4

    .line 245
    div-float/2addr v11, v9

    .line 246
    .line 247
    div-float v9, v12, v9

    .line 248
    .line 249
    move/from16 v25, v11

    .line 250
    move v11, v9

    .line 251
    .line 252
    move/from16 v9, v25

    .line 253
    :goto_e
    move v13, v5

    .line 254
    move v12, v10

    .line 255
    .line 256
    :goto_f
    if-ge v13, v3, :cond_15

    .line 257
    .line 258
    if-eq v7, v13, :cond_14

    .line 259
    .line 260
    .line 261
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getX(I)F

    .line 262
    move-result v14

    .line 263
    sub-float/2addr v14, v9

    .line 264
    .line 265
    .line 266
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 267
    move-result v14

    .line 268
    add-float/2addr v10, v14

    .line 269
    .line 270
    .line 271
    invoke-virtual {v1, v13}, Landroid/view/MotionEvent;->getY(I)F

    .line 272
    move-result v14

    .line 273
    sub-float/2addr v14, v11

    .line 274
    .line 275
    .line 276
    invoke-static {v14}, Ljava/lang/Math;->abs(F)F

    .line 277
    move-result v14

    .line 278
    add-float/2addr v12, v14

    .line 279
    .line 280
    :cond_14
    add-int/lit8 v13, v13, 0x1

    .line 281
    goto :goto_f

    .line 282
    :cond_15
    int-to-float v1, v4

    .line 283
    div-float/2addr v10, v1

    .line 284
    div-float/2addr v12, v1

    .line 285
    int-to-float v1, v8

    .line 286
    mul-float/2addr v10, v1

    .line 287
    mul-float/2addr v12, v1

    .line 288
    .line 289
    .line 290
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 291
    move-result v1

    .line 292
    .line 293
    if-eqz v1, :cond_16

    .line 294
    move v1, v12

    .line 295
    goto :goto_10

    .line 296
    :cond_16
    float-to-double v3, v10

    .line 297
    float-to-double v13, v12

    .line 298
    .line 299
    .line 300
    invoke-static {v3, v4, v13, v14}, Ljava/lang/Math;->hypot(DD)D

    .line 301
    move-result-wide v3

    .line 302
    double-to-float v1, v3

    .line 303
    .line 304
    :goto_10
    iget-boolean v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 305
    .line 306
    .line 307
    invoke-static {v9}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 308
    move-result v4

    .line 309
    .line 310
    iput v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusX:I

    .line 311
    .line 312
    .line 313
    invoke-static {v11}, Lkotlin/math/MathKt;->roundToInt(F)I

    .line 314
    move-result v4

    .line 315
    .line 316
    iput v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusY:I

    .line 317
    .line 318
    .line 319
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 320
    move-result v4

    .line 321
    .line 322
    if-nez v4, :cond_18

    .line 323
    .line 324
    iget-boolean v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 325
    .line 326
    if-eqz v4, :cond_18

    .line 327
    .line 328
    iget v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->minSpan:I

    .line 329
    int-to-float v4, v4

    .line 330
    .line 331
    cmpg-float v4, v1, v4

    .line 332
    .line 333
    if-ltz v4, :cond_17

    .line 334
    .line 335
    if-eqz v6, :cond_18

    .line 336
    .line 337
    :cond_17
    iget-object v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->listener:Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;

    .line 338
    .line 339
    new-instance v19, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$End;

    .line 340
    .line 341
    iget-wide v13, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 342
    .line 343
    iget v7, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusX:I

    .line 344
    .line 345
    iget v9, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusY:I

    .line 346
    .line 347
    .line 348
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->getIncrementalScaleFactor()F

    .line 349
    move-result v24

    .line 350
    .line 351
    move/from16 v22, v7

    .line 352
    .line 353
    move/from16 v23, v9

    .line 354
    .line 355
    move-wide/from16 v20, v13

    .line 356
    .line 357
    .line 358
    invoke-direct/range {v19 .. v24}, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$End;-><init>(JIIF)V

    .line 359
    .line 360
    move-object/from16 v7, v19

    .line 361
    .line 362
    .line 363
    invoke-interface {v4, v7}, Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;->onZoomEvent(Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;)Z

    .line 364
    .line 365
    iput-boolean v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 366
    .line 367
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->initialSpan:F

    .line 368
    .line 369
    :cond_18
    if-eqz v6, :cond_19

    .line 370
    .line 371
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanX:F

    .line 372
    .line 373
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpanX:F

    .line 374
    .line 375
    iput v12, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanY:F

    .line 376
    .line 377
    iput v12, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpanY:F

    .line 378
    .line 379
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 380
    .line 381
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 382
    .line 383
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->initialSpan:F

    .line 384
    .line 385
    .line 386
    :cond_19
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->inAnchoredZoomMode()Z

    .line 387
    move-result v4

    .line 388
    .line 389
    if-eqz v4, :cond_1a

    .line 390
    .line 391
    iget v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->spanSlop:I

    .line 392
    goto :goto_11

    .line 393
    .line 394
    :cond_1a
    iget v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->minSpan:I

    .line 395
    .line 396
    :goto_11
    iget-boolean v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 397
    .line 398
    if-nez v5, :cond_1c

    .line 399
    int-to-float v4, v4

    .line 400
    .line 401
    cmpl-float v4, v1, v4

    .line 402
    .line 403
    if-ltz v4, :cond_1c

    .line 404
    .line 405
    if-nez v3, :cond_1b

    .line 406
    .line 407
    iget v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->initialSpan:F

    .line 408
    .line 409
    sub-float v3, v1, v3

    .line 410
    .line 411
    .line 412
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 413
    move-result v3

    .line 414
    .line 415
    iget v4, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->spanSlop:I

    .line 416
    int-to-float v4, v4

    .line 417
    .line 418
    cmpl-float v3, v3, v4

    .line 419
    .line 420
    if-lez v3, :cond_1c

    .line 421
    .line 422
    :cond_1b
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanX:F

    .line 423
    .line 424
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpanX:F

    .line 425
    .line 426
    iput v12, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanY:F

    .line 427
    .line 428
    iput v12, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpanY:F

    .line 429
    .line 430
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 431
    .line 432
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 433
    .line 434
    iget-wide v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 435
    .line 436
    iput-wide v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->prevTime:J

    .line 437
    .line 438
    iget-object v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->listener:Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;

    .line 439
    .line 440
    new-instance v6, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$Begin;

    .line 441
    .line 442
    iget v7, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusX:I

    .line 443
    .line 444
    iget v9, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusY:I

    .line 445
    .line 446
    .line 447
    invoke-direct {v6, v3, v4, v7, v9}, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$Begin;-><init>(JII)V

    .line 448
    .line 449
    .line 450
    invoke-interface {v5, v6}, Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;->onZoomEvent(Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;)Z

    .line 451
    move-result v3

    .line 452
    .line 453
    iput-boolean v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 454
    .line 455
    :cond_1c
    if-ne v2, v8, :cond_1e

    .line 456
    .line 457
    iput v10, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanX:F

    .line 458
    .line 459
    iput v12, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanY:F

    .line 460
    .line 461
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 462
    .line 463
    iget-boolean v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->isInProgress:Z

    .line 464
    .line 465
    if-eqz v1, :cond_1d

    .line 466
    .line 467
    iget-object v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->listener:Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;

    .line 468
    .line 469
    new-instance v2, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$Move;

    .line 470
    .line 471
    iget-wide v3, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 472
    .line 473
    iget v5, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusX:I

    .line 474
    .line 475
    iget v6, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->focusY:I

    .line 476
    .line 477
    .line 478
    invoke-direct {v0}, Landroidx/camera/view/impl/ZoomGestureDetector;->getIncrementalScaleFactor()F

    .line 479
    move-result v7

    .line 480
    .line 481
    .line 482
    invoke-direct/range {v2 .. v7}, Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent$Move;-><init>(JIIF)V

    .line 483
    .line 484
    .line 485
    invoke-interface {v1, v2}, Landroidx/camera/view/impl/ZoomGestureDetector$OnZoomGestureListener;->onZoomEvent(Landroidx/camera/view/impl/ZoomGestureDetector$ZoomEvent;)Z

    .line 486
    move-result v1

    .line 487
    goto :goto_12

    .line 488
    .line 489
    :cond_1d
    move/from16 v1, v18

    .line 490
    .line 491
    :goto_12
    if-eqz v1, :cond_1e

    .line 492
    .line 493
    iget v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanX:F

    .line 494
    .line 495
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpanX:F

    .line 496
    .line 497
    iget v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpanY:F

    .line 498
    .line 499
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpanY:F

    .line 500
    .line 501
    iget v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->currentSpan:F

    .line 502
    .line 503
    iput v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->previousSpan:F

    .line 504
    .line 505
    iget-wide v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->eventTime:J

    .line 506
    .line 507
    iput-wide v1, v0, Landroidx/camera/view/impl/ZoomGestureDetector;->prevTime:J

    .line 508
    :cond_1e
    return v18
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
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
.end method

.method public final setQuickZoomEnabled(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->isQuickZoomEnabled:Z

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
.end method

.method public final setStylusZoomEnabled(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Landroidx/camera/view/impl/ZoomGestureDetector;->isStylusZoomEnabled:Z

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
.end method
