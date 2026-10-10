.class public final Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;
.super Ljava/lang/Object;
.source "GridItemTouchHelper.kt"

# interfaces
.implements Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x11
    name = "a"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0004\u0018\u00002\u00020\u0001Bq\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u001e\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\n0\u000c\u0012\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\n0\u000c\u0012\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000f\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u0018\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0018\u0010#\u001a\u00020\n2\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0016J\u0010\u0010$\u001a\u00020\n2\u0006\u0010%\u001a\u00020\u0015H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R&\u0010\u0006\u001a\u001a\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\n0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\n0\u000cX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0015X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006&"
    }
    d2 = {
        "Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$ItemTouchHandler;",
        "Landroidx/recyclerview/widget/RecyclerView$OnItemTouchListener;",
        "moveThreshold",
        "",
        "longPressTimeout",
        "",
        "onClick",
        "Lkotlin/Function3;",
        "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
        "",
        "",
        "onLongPress",
        "Lkotlin/Function1;",
        "onDragStart",
        "onTouchUp",
        "Lkotlin/Function0;",
        "<init>",
        "(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;IJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V",
        "initialX",
        "initialY",
        "hasMoved",
        "",
        "downView",
        "Landroid/view/View;",
        "downHolder",
        "handler",
        "Landroid/os/Handler;",
        "longPressTriggered",
        "longPressRunnable",
        "Ljava/lang/Runnable;",
        "onInterceptTouchEvent",
        "rv",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "e",
        "Landroid/view/MotionEvent;",
        "onTouchEvent",
        "onRequestDisallowInterceptTouchEvent",
        "disallowIntercept",
        "HomeLib_googleRelease"
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
        "SMAP\nGridItemTouchHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 GridItemTouchHelper.kt\ncom/kubi/home/v2/container/ui/GridItemTouchHelper$ItemTouchHandler\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,793:1\n1#2:794\n*E\n"
    }
.end annotation


# instance fields
.field public final a:I

.field public final b:J

.field public final c:Lkotlin/jvm/functions/Function3;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function3<",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "Ljava/lang/Float;",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final e:Lkotlin/jvm/functions/Function1;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function1<",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final f:Lkotlin/jvm/functions/Function0;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public g:F

.field public h:F

.field public i:Z

.field public j:Landroid/view/View;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public k:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final l:Landroid/os/Handler;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public m:Z

.field public final n:Ljava/lang/Runnable;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final synthetic o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lcom/kubi/home/v2/container/ui/GridItemTouchHelper<",
            "TT;>;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;IJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p3    # J
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lkotlin/jvm/functions/Function3;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p6    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p7    # Lkotlin/jvm/functions/Function1;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(IJ",
            "Lkotlin/jvm/functions/Function3<",
            "-",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "-",
            "Ljava/lang/Float;",
            "-",
            "Ljava/lang/Float;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function1<",
            "-",
            "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;",
            "Lkotlin/Unit;",
            ">;",
            "Lkotlin/jvm/functions/Function0<",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    const-string v0, "onClick"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onLongPress"

    invoke-static {p6, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDragStart"

    invoke-static {p7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onTouchUp"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    iput-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput p2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->a:I

    .line 3
    iput-wide p3, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->b:J

    .line 4
    iput-object p5, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->c:Lkotlin/jvm/functions/Function3;

    .line 5
    iput-object p6, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->d:Lkotlin/jvm/functions/Function1;

    .line 6
    iput-object p7, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->e:Lkotlin/jvm/functions/Function1;

    .line 7
    iput-object p8, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->f:Lkotlin/jvm/functions/Function0;

    .line 8
    new-instance p1, Landroid/os/Handler;

    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object p2

    invoke-direct {p1, p2}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    iput-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->l:Landroid/os/Handler;

    .line 9
    new-instance p1, Lqj/h;

    invoke-direct {p1, p0}, Lqj/h;-><init>(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;)V

    iput-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->n:Ljava/lang/Runnable;

    return-void
.end method

.method public synthetic constructor <init>(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;IJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    .line 10
    sget-object p2, Lcom/kubi/sdk/BaseApplication;->Companion:Lcom/kubi/sdk/BaseApplication$Companion;

    invoke-virtual {p2}, Lcom/kubi/sdk/BaseApplication$Companion;->get()Landroid/app/Application;

    move-result-object p2

    invoke-static {p2}, Landroid/view/ViewConfiguration;->get(Landroid/content/Context;)Landroid/view/ViewConfiguration;

    move-result-object p2

    invoke-virtual {p2}, Landroid/view/ViewConfiguration;->getScaledTouchSlop()I

    move-result p2

    add-int/lit8 p2, p2, 0x5

    :cond_0
    move v2, p2

    and-int/lit8 p2, p9, 0x2

    if-eqz p2, :cond_1

    .line 11
    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result p2

    int-to-long p3, p2

    :cond_1
    move-object v0, p0

    move-object v1, p1

    move-wide v3, p3

    move-object v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    .line 12
    invoke-direct/range {v0 .. v8}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;-><init>(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;IJLkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    return-void
.end method

.method public static synthetic a(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->b(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;)V

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

.method public static final b(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->k:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    iput-boolean v1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->m:Z

    .line 8
    .line 9
    iget-object p0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->d:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    :cond_0
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
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method


# virtual methods
.method public onInterceptTouchEvent(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)Z
    .locals 10
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "rv"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "e"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->k(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Z

    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    return v1

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 24
    move-result v0

    .line 25
    const/4 v2, 0x0

    .line 26
    .line 27
    if-eqz v0, :cond_14

    .line 28
    const/4 v3, 0x1

    .line 29
    .line 30
    if-eq v0, v3, :cond_8

    .line 31
    const/4 v4, 0x2

    .line 32
    .line 33
    if-eq v0, v4, :cond_1

    .line 34
    const/4 v4, 0x3

    .line 35
    .line 36
    if-eq v0, v4, :cond_8

    .line 37
    .line 38
    goto/16 :goto_4

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 42
    move-result p1

    .line 43
    .line 44
    iget v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->g:F

    .line 45
    sub-float/2addr p1, v0

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Ljava/lang/Math;->abs(F)F

    .line 49
    move-result p1

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 53
    move-result p2

    .line 54
    .line 55
    iget v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->h:F

    .line 56
    sub-float/2addr p2, v0

    .line 57
    .line 58
    .line 59
    invoke-static {p2}, Ljava/lang/Math;->abs(F)F

    .line 60
    move-result p2

    .line 61
    .line 62
    iget-object v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 63
    .line 64
    .line 65
    invoke-static {v0}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->n(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Z

    .line 66
    move-result v0

    .line 67
    .line 68
    if-eqz v0, :cond_4

    .line 69
    .line 70
    iget v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->a:I

    .line 71
    int-to-float v2, v0

    .line 72
    .line 73
    cmpl-float p1, p1, v2

    .line 74
    .line 75
    if-gtz p1, :cond_2

    .line 76
    int-to-float p1, v0

    .line 77
    .line 78
    cmpl-float p1, p2, p1

    .line 79
    .line 80
    if-lez p1, :cond_16

    .line 81
    .line 82
    :cond_2
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->k:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 83
    .line 84
    iget-object p2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 85
    .line 86
    .line 87
    invoke-static {p2}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->j(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 88
    move-result-object p2

    .line 89
    .line 90
    .line 91
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 92
    move-result p1

    .line 93
    .line 94
    if-eqz p1, :cond_3

    .line 95
    .line 96
    iget-boolean p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->i:Z

    .line 97
    .line 98
    if-nez p1, :cond_16

    .line 99
    .line 100
    iput-boolean v3, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->i:Z

    .line 101
    .line 102
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->l:Landroid/os/Handler;

    .line 103
    .line 104
    iget-object p2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->n:Ljava/lang/Runnable;

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 108
    .line 109
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->k:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 110
    .line 111
    if-eqz p1, :cond_16

    .line 112
    .line 113
    iget-object p2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->e:Lkotlin/jvm/functions/Function1;

    .line 114
    .line 115
    .line 116
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 117
    .line 118
    goto/16 :goto_4

    .line 119
    .line 120
    :cond_3
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 121
    .line 122
    .line 123
    invoke-static {p1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->h(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)V

    .line 124
    .line 125
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->l(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Lqj/t;

    .line 129
    move-result-object p1

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1, v1}, Lqj/t;->u(Z)V

    .line 133
    .line 134
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->l:Landroid/os/Handler;

    .line 135
    .line 136
    iget-object p2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->n:Ljava/lang/Runnable;

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 140
    return v3

    .line 141
    .line 142
    :cond_4
    iget-object v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 143
    .line 144
    .line 145
    invoke-static {v0}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->m(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Z

    .line 146
    move-result v0

    .line 147
    .line 148
    if-eqz v0, :cond_6

    .line 149
    float-to-double v4, p1

    .line 150
    float-to-double v6, p2

    .line 151
    .line 152
    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    .line 153
    mul-double/2addr v6, v8

    .line 154
    .line 155
    cmpl-double v0, v4, v6

    .line 156
    .line 157
    if-lez v0, :cond_5

    .line 158
    .line 159
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->l:Landroid/os/Handler;

    .line 160
    .line 161
    iget-object p2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->n:Ljava/lang/Runnable;

    .line 162
    .line 163
    .line 164
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 165
    return v3

    .line 166
    .line 167
    :cond_5
    iget v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->a:I

    .line 168
    int-to-float v0, v0

    .line 169
    .line 170
    cmpl-float v0, p2, v0

    .line 171
    .line 172
    if-lez v0, :cond_16

    .line 173
    .line 174
    cmpl-float p1, p2, p1

    .line 175
    .line 176
    if-lez p1, :cond_16

    .line 177
    .line 178
    iget-boolean p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->i:Z

    .line 179
    .line 180
    if-nez p1, :cond_16

    .line 181
    .line 182
    iput-boolean v3, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->i:Z

    .line 183
    .line 184
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->l:Landroid/os/Handler;

    .line 185
    .line 186
    iget-object p2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->n:Ljava/lang/Runnable;

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 190
    .line 191
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->k:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 192
    .line 193
    if-eqz p1, :cond_16

    .line 194
    .line 195
    iget-object p2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->e:Lkotlin/jvm/functions/Function1;

    .line 196
    .line 197
    .line 198
    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    .line 200
    goto/16 :goto_4

    .line 201
    .line 202
    :cond_6
    iget v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->a:I

    .line 203
    int-to-float v2, v0

    .line 204
    .line 205
    cmpl-float p1, p1, v2

    .line 206
    .line 207
    if-gtz p1, :cond_7

    .line 208
    int-to-float p1, v0

    .line 209
    .line 210
    cmpl-float p1, p2, p1

    .line 211
    .line 212
    if-lez p1, :cond_16

    .line 213
    .line 214
    :cond_7
    iput-boolean v3, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->i:Z

    .line 215
    .line 216
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->l:Landroid/os/Handler;

    .line 217
    .line 218
    iget-object p2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->n:Ljava/lang/Runnable;

    .line 219
    .line 220
    .line 221
    invoke-virtual {p1, p2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 222
    .line 223
    goto/16 :goto_4

    .line 224
    .line 225
    :cond_8
    iget-object v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->l:Landroid/os/Handler;

    .line 226
    .line 227
    iget-object v4, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->n:Ljava/lang/Runnable;

    .line 228
    .line 229
    .line 230
    invoke-virtual {v0, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 231
    .line 232
    iget-object v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 233
    .line 234
    .line 235
    invoke-static {v0}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->n(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Z

    .line 236
    move-result v0

    .line 237
    .line 238
    if-nez v0, :cond_9

    .line 239
    .line 240
    iget-object v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 241
    .line 242
    .line 243
    invoke-static {v0}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->m(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Z

    .line 244
    move-result v0

    .line 245
    .line 246
    if-eqz v0, :cond_a

    .line 247
    .line 248
    :cond_9
    iget-boolean v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->i:Z

    .line 249
    .line 250
    if-eqz v0, :cond_b

    .line 251
    .line 252
    iget-boolean v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->m:Z

    .line 253
    .line 254
    if-eqz v0, :cond_a

    .line 255
    goto :goto_0

    .line 256
    :cond_a
    move v0, v1

    .line 257
    goto :goto_1

    .line 258
    :cond_b
    :goto_0
    move v0, v3

    .line 259
    .line 260
    :goto_1
    iget-object v4, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 261
    .line 262
    .line 263
    invoke-static {v4}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->i(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Ljava/lang/Runnable;

    .line 264
    move-result-object v4

    .line 265
    .line 266
    if-eqz v4, :cond_c

    .line 267
    .line 268
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->f:Lkotlin/jvm/functions/Function0;

    .line 269
    .line 270
    .line 271
    invoke-interface {p1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 272
    .line 273
    goto/16 :goto_3

    .line 274
    .line 275
    .line 276
    :cond_c
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getActionMasked()I

    .line 277
    move-result v4

    .line 278
    .line 279
    if-ne v4, v3, :cond_13

    .line 280
    .line 281
    iget-object v4, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 282
    .line 283
    .line 284
    invoke-static {v4}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->n(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Z

    .line 285
    move-result v4

    .line 286
    .line 287
    if-nez v4, :cond_d

    .line 288
    .line 289
    iget-object v4, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 290
    .line 291
    .line 292
    invoke-static {v4}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->m(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Z

    .line 293
    move-result v4

    .line 294
    .line 295
    if-eqz v4, :cond_13

    .line 296
    .line 297
    :cond_d
    iget-boolean v4, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->i:Z

    .line 298
    .line 299
    if-nez v4, :cond_13

    .line 300
    .line 301
    .line 302
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 303
    move-result v4

    .line 304
    const/4 v5, 0x0

    .line 305
    .line 306
    cmpl-float v4, v4, v5

    .line 307
    .line 308
    if-ltz v4, :cond_11

    .line 309
    .line 310
    .line 311
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 312
    move-result v4

    .line 313
    .line 314
    cmpl-float v4, v4, v5

    .line 315
    .line 316
    if-ltz v4, :cond_11

    .line 317
    .line 318
    .line 319
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 320
    move-result v4

    .line 321
    .line 322
    .line 323
    invoke-virtual {p1}, Landroid/view/View;->getWidth()I

    .line 324
    move-result v5

    .line 325
    int-to-float v5, v5

    .line 326
    .line 327
    cmpg-float v4, v4, v5

    .line 328
    .line 329
    if-gtz v4, :cond_11

    .line 330
    .line 331
    .line 332
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 333
    move-result v4

    .line 334
    .line 335
    .line 336
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 337
    move-result p1

    .line 338
    int-to-float p1, p1

    .line 339
    .line 340
    cmpg-float p1, v4, p1

    .line 341
    .line 342
    if-lez p1, :cond_e

    .line 343
    goto :goto_2

    .line 344
    .line 345
    :cond_e
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->k:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 346
    .line 347
    if-eqz p1, :cond_f

    .line 348
    .line 349
    .line 350
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 351
    move-result v1

    .line 352
    .line 353
    iget v3, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->g:F

    .line 354
    sub-float/2addr v1, v3

    .line 355
    .line 356
    .line 357
    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    .line 358
    move-result v1

    .line 359
    .line 360
    .line 361
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 362
    move-result v3

    .line 363
    .line 364
    iget v4, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->h:F

    .line 365
    sub-float/2addr v3, v4

    .line 366
    .line 367
    .line 368
    invoke-static {v3}, Ljava/lang/Math;->abs(F)F

    .line 369
    move-result v3

    .line 370
    .line 371
    iget-boolean v4, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->m:Z

    .line 372
    .line 373
    if-nez v4, :cond_13

    .line 374
    .line 375
    iget v4, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->a:I

    .line 376
    int-to-float v5, v4

    .line 377
    .line 378
    cmpg-float v1, v1, v5

    .line 379
    .line 380
    if-gtz v1, :cond_13

    .line 381
    int-to-float v1, v4

    .line 382
    .line 383
    cmpg-float v1, v3, v1

    .line 384
    .line 385
    if-gtz v1, :cond_13

    .line 386
    .line 387
    iget-object v1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->c:Lkotlin/jvm/functions/Function3;

    .line 388
    .line 389
    .line 390
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 391
    move-result v3

    .line 392
    .line 393
    .line 394
    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 395
    move-result-object v3

    .line 396
    .line 397
    .line 398
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 399
    move-result p2

    .line 400
    .line 401
    .line 402
    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 403
    move-result-object p2

    .line 404
    .line 405
    .line 406
    invoke-interface {v1, p1, v3, p2}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 407
    goto :goto_3

    .line 408
    .line 409
    :cond_f
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 410
    .line 411
    .line 412
    invoke-static {p1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->n(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Z

    .line 413
    move-result p2

    .line 414
    .line 415
    if-eqz p2, :cond_10

    .line 416
    .line 417
    .line 418
    invoke-static {p1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->h(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)V

    .line 419
    .line 420
    .line 421
    invoke-static {p1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->l(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Lqj/t;

    .line 422
    move-result-object p2

    .line 423
    .line 424
    .line 425
    invoke-static {p2, v1, v3, v2}, Lqj/t;->v(Lqj/t;ZILjava/lang/Object;)V

    .line 426
    .line 427
    .line 428
    :cond_10
    invoke-static {p1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->m(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Z

    .line 429
    move-result p2

    .line 430
    .line 431
    if-eqz p2, :cond_13

    .line 432
    .line 433
    .line 434
    invoke-static {p1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->g(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)V

    .line 435
    goto :goto_3

    .line 436
    .line 437
    :cond_11
    :goto_2
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 438
    .line 439
    .line 440
    invoke-static {p1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->n(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Z

    .line 441
    move-result p1

    .line 442
    .line 443
    if-eqz p1, :cond_12

    .line 444
    .line 445
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 446
    .line 447
    .line 448
    invoke-static {p1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->h(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)V

    .line 449
    .line 450
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 451
    .line 452
    .line 453
    invoke-static {p1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->l(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Lqj/t;

    .line 454
    move-result-object p1

    .line 455
    .line 456
    .line 457
    invoke-static {p1, v1, v3, v2}, Lqj/t;->v(Lqj/t;ZILjava/lang/Object;)V

    .line 458
    .line 459
    :cond_12
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 460
    .line 461
    .line 462
    invoke-static {p1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->m(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)Z

    .line 463
    move-result p1

    .line 464
    .line 465
    if-eqz p1, :cond_13

    .line 466
    .line 467
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->o:Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;

    .line 468
    .line 469
    .line 470
    invoke-static {p1}, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;->g(Lcom/kubi/home/v2/container/ui/GridItemTouchHelper;)V

    .line 471
    .line 472
    new-instance v6, Lorg/json/JSONObject;

    .line 473
    .line 474
    .line 475
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 476
    .line 477
    const-string p1, "norm_version"

    .line 478
    .line 479
    const-string p2, "1"

    .line 480
    .line 481
    .line 482
    invoke-virtual {v6, p1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 483
    .line 484
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 485
    const/4 v7, 0x4

    .line 486
    const/4 v8, 0x0

    .line 487
    .line 488
    const-string v3, "B1homepage"

    .line 489
    .line 490
    const-string v4, "clickBlank"

    .line 491
    const/4 v5, 0x0

    .line 492
    .line 493
    .line 494
    invoke-static/range {v3 .. v8}, Lcom/kubi/utils/extensions/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 495
    .line 496
    :cond_13
    :goto_3
    iput-object v2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->j:Landroid/view/View;

    .line 497
    .line 498
    iput-object v2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->k:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 499
    return v0

    .line 500
    .line 501
    .line 502
    :cond_14
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 503
    move-result v0

    .line 504
    .line 505
    iput v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->g:F

    .line 506
    .line 507
    .line 508
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 509
    move-result v0

    .line 510
    .line 511
    iput v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->h:F

    .line 512
    .line 513
    iput-boolean v1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->i:Z

    .line 514
    .line 515
    iput-boolean v1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->m:Z

    .line 516
    .line 517
    .line 518
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F

    .line 519
    move-result v0

    .line 520
    .line 521
    .line 522
    invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F

    .line 523
    move-result p2

    .line 524
    .line 525
    .line 526
    invoke-virtual {p1, v0, p2}, Landroidx/recyclerview/widget/RecyclerView;->findChildViewUnder(FF)Landroid/view/View;

    .line 527
    move-result-object p2

    .line 528
    .line 529
    iput-object p2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->j:Landroid/view/View;

    .line 530
    .line 531
    if-eqz p2, :cond_15

    .line 532
    .line 533
    .line 534
    invoke-virtual {p1, p2}, Landroidx/recyclerview/widget/RecyclerView;->getChildViewHolder(Landroid/view/View;)Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 535
    move-result-object v2

    .line 536
    .line 537
    :cond_15
    iput-object v2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->k:Landroidx/recyclerview/widget/RecyclerView$ViewHolder;

    .line 538
    .line 539
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->l:Landroid/os/Handler;

    .line 540
    .line 541
    iget-object p2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->n:Ljava/lang/Runnable;

    .line 542
    .line 543
    iget-wide v2, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->b:J

    .line 544
    .line 545
    .line 546
    invoke-virtual {p1, p2, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 547
    :cond_16
    :goto_4
    return v1
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
.end method

.method public onRequestDisallowInterceptTouchEvent(Z)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    iget-object p1, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->l:Landroid/os/Handler;

    .line 5
    .line 6
    iget-object v0, p0, Lcom/kubi/home/v2/container/ui/GridItemTouchHelper$a;->n:Ljava/lang/Runnable;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v0}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 10
    :cond_0
    return-void
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

.method public onTouchEvent(Landroidx/recyclerview/widget/RecyclerView;Landroid/view/MotionEvent;)V
    .locals 1
    .param p1    # Landroidx/recyclerview/widget/RecyclerView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/MotionEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "rv"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "e"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
