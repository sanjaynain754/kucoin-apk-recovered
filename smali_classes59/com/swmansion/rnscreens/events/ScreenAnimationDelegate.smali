.class public final Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;
.super Ljava/lang/Object;
.source "ScreenAnimationDelegate.kt"

# interfaces
.implements Landroid/animation/Animator$AnimatorListener;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;,
        Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$Companion;,
        Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;,
        Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0018\u0000 \u00162\u00020\u0001:\u0003\u0014\u0015\u0016B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u0008\u0010\u000c\u001a\u00020\rH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0012\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0013\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0017"
    }
    d2 = {
        "Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;",
        "Landroid/animation/Animator$AnimatorListener;",
        "wrapper",
        "Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;",
        "eventEmitter",
        "Lcom/swmansion/rnscreens/events/ScreenEventEmitter;",
        "animationType",
        "Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;",
        "<init>",
        "(Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;Lcom/swmansion/rnscreens/events/ScreenEventEmitter;Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;)V",
        "currentState",
        "Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;",
        "progressState",
        "",
        "onAnimationStart",
        "animation",
        "Landroid/animation/Animator;",
        "onAnimationEnd",
        "onAnimationCancel",
        "onAnimationRepeat",
        "AnimationType",
        "LifecycleState",
        "Companion",
        "react-native-screens_release"
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
.field public static final Companion:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final TAG:Ljava/lang/String; = "ScreenEventDelegate"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field private final animationType:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private currentState:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private final eventEmitter:Lcom/swmansion/rnscreens/events/ScreenEventEmitter;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private final wrapper:Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->Companion:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$Companion;

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
.end method

.method public constructor <init>(Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;Lcom/swmansion/rnscreens/events/ScreenEventEmitter;Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;)V
    .locals 1
    .param p1    # Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lcom/swmansion/rnscreens/events/ScreenEventEmitter;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "wrapper"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "animationType"

    .line 9
    .line 10
    .line 11
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    iput-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->wrapper:Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;

    .line 17
    .line 18
    iput-object p2, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->eventEmitter:Lcom/swmansion/rnscreens/events/ScreenEventEmitter;

    .line 19
    .line 20
    iput-object p3, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->animationType:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;

    .line 21
    .line 22
    sget-object p1, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;->INITIALIZED:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;

    .line 23
    .line 24
    iput-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->currentState:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;

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

.method private final progressState()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->currentState:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;

    .line 3
    .line 4
    sget-object v1, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$WhenMappings;->$EnumSwitchMapping$0:[I

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 8
    move-result v0

    .line 9
    .line 10
    aget v0, v1, v0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    if-eq v0, v1, :cond_2

    .line 14
    const/4 v1, 0x2

    .line 15
    .line 16
    if-eq v0, v1, :cond_1

    .line 17
    const/4 v1, 0x3

    .line 18
    .line 19
    if-ne v0, v1, :cond_0

    .line 20
    .line 21
    sget-object v0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;->END_DISPATCHED:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 28
    throw v0

    .line 29
    .line 30
    :cond_1
    sget-object v0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;->END_DISPATCHED:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_2
    sget-object v0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;->START_DISPATCHED:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;

    .line 34
    .line 35
    :goto_0
    iput-object v0, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->currentState:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;

    .line 36
    return-void
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


# virtual methods
.method public onAnimationCancel(Landroid/animation/Animator;)V
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "animation"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
.end method

.method public onAnimationEnd(Landroid/animation/Animator;)V
    .locals 2
    .param p1    # Landroid/animation/Animator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "animation"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->currentState:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;

    .line 8
    .line 9
    sget-object v1, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;->START_DISPATCHED:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;

    .line 10
    .line 11
    if-ne v0, v1, :cond_5

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->progressState()V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/animation/Animator;->removeListener(Landroid/animation/Animator$AnimatorListener;)V

    .line 18
    .line 19
    iget-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->animationType:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;

    .line 20
    .line 21
    sget-object v0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 25
    move-result p1

    .line 26
    .line 27
    aget p1, v0, p1

    .line 28
    const/4 v0, 0x1

    .line 29
    .line 30
    if-eq p1, v0, :cond_1

    .line 31
    const/4 v1, 0x2

    .line 32
    .line 33
    if-ne p1, v1, :cond_0

    .line 34
    .line 35
    iget-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->eventEmitter:Lcom/swmansion/rnscreens/events/ScreenEventEmitter;

    .line 36
    .line 37
    if-eqz p1, :cond_2

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/events/ScreenEventEmitter;->dispatchOnDisappear()Lkotlin/Unit;

    .line 41
    goto :goto_0

    .line 42
    .line 43
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 44
    .line 45
    .line 46
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 47
    throw p1

    .line 48
    .line 49
    :cond_1
    iget-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->eventEmitter:Lcom/swmansion/rnscreens/events/ScreenEventEmitter;

    .line 50
    .line 51
    if-eqz p1, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/events/ScreenEventEmitter;->dispatchOnAppear()Lkotlin/Unit;

    .line 55
    .line 56
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->animationType:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;

    .line 57
    .line 58
    sget-object v1, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;->EXIT:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;

    .line 59
    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    goto :goto_1

    .line 62
    :cond_3
    const/4 v0, 0x0

    .line 63
    .line 64
    :goto_1
    iget-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->eventEmitter:Lcom/swmansion/rnscreens/events/ScreenEventEmitter;

    .line 65
    .line 66
    if-eqz p1, :cond_4

    .line 67
    .line 68
    const/high16 v1, 0x3f800000    # 1.0f

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v1, v0, v0}, Lcom/swmansion/rnscreens/events/ScreenEventEmitter;->dispatchTransitionProgress(FZZ)V

    .line 72
    .line 73
    :cond_4
    iget-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->wrapper:Lcom/swmansion/rnscreens/ScreenStackFragmentWrapper;

    .line 74
    .line 75
    .line 76
    invoke-interface {p1}, Lcom/swmansion/rnscreens/ScreenFragmentWrapper;->getScreen()Lcom/swmansion/rnscreens/Screen;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/Screen;->endRemovalTransition()V

    .line 81
    :cond_5
    return-void
.end method

.method public onAnimationRepeat(Landroid/animation/Animator;)V
    .locals 1
    .param p1    # Landroid/animation/Animator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "animation"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

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
.end method

.method public onAnimationStart(Landroid/animation/Animator;)V
    .locals 2
    .param p1    # Landroid/animation/Animator;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "animation"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->currentState:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;

    .line 8
    .line 9
    sget-object v0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;->INITIALIZED:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$LifecycleState;

    .line 10
    .line 11
    if-ne p1, v0, :cond_4

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->progressState()V

    .line 15
    .line 16
    iget-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->animationType:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;

    .line 17
    .line 18
    sget-object v0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$WhenMappings;->$EnumSwitchMapping$1:[I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    .line 22
    move-result p1

    .line 23
    .line 24
    aget p1, v0, p1

    .line 25
    const/4 v0, 0x1

    .line 26
    .line 27
    if-eq p1, v0, :cond_1

    .line 28
    const/4 v1, 0x2

    .line 29
    .line 30
    if-ne p1, v1, :cond_0

    .line 31
    .line 32
    iget-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->eventEmitter:Lcom/swmansion/rnscreens/events/ScreenEventEmitter;

    .line 33
    .line 34
    if-eqz p1, :cond_2

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/events/ScreenEventEmitter;->dispatchOnWillDisappear()Lkotlin/Unit;

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 41
    .line 42
    .line 43
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 44
    throw p1

    .line 45
    .line 46
    :cond_1
    iget-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->eventEmitter:Lcom/swmansion/rnscreens/events/ScreenEventEmitter;

    .line 47
    .line 48
    if-eqz p1, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/swmansion/rnscreens/events/ScreenEventEmitter;->dispatchOnWillAppear()Lkotlin/Unit;

    .line 52
    .line 53
    :cond_2
    :goto_0
    iget-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->animationType:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;

    .line 54
    .line 55
    sget-object v1, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;->EXIT:Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate$AnimationType;

    .line 56
    .line 57
    if-ne p1, v1, :cond_3

    .line 58
    goto :goto_1

    .line 59
    :cond_3
    const/4 v0, 0x0

    .line 60
    .line 61
    :goto_1
    iget-object p1, p0, Lcom/swmansion/rnscreens/events/ScreenAnimationDelegate;->eventEmitter:Lcom/swmansion/rnscreens/events/ScreenEventEmitter;

    .line 62
    .line 63
    if-eqz p1, :cond_4

    .line 64
    const/4 v1, 0x0

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, v1, v0, v0}, Lcom/swmansion/rnscreens/events/ScreenEventEmitter;->dispatchTransitionProgress(FZZ)V

    .line 68
    :cond_4
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
.end method
