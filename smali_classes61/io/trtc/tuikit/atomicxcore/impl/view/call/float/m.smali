.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;
.super Landroidx/constraintlayout/widget/ConstraintLayout;
.source "SourceFile"


# instance fields
.field public final a:Landroid/content/Context;

.field public b:Lkotlinx/coroutines/x1;

.field public c:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

.field public d:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

.field public e:Z

.field public f:Ljava/util/Map;

.field public final g:Z

.field public final h:Lio/trtc/tuikit/atomicxcore/impl/view/call/B;

.field public i:Landroid/widget/FrameLayout;

.field public j:Landroid/widget/FrameLayout;

.field public k:Landroidx/constraintlayout/utils/widget/ImageFilterView;

.field public l:Landroid/widget/TextView;

.field public m:Landroid/widget/ImageView;


# direct methods
.method public constructor <init>(Landroid/content/Context;)V
    .locals 2

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
    invoke-direct {p0, p1}, Landroidx/constraintlayout/widget/ConstraintLayout;-><init>(Landroid/content/Context;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a:Landroid/content/Context;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->f:Ljava/util/Map;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Landroid/content/res/Configuration;->getLayoutDirection()I

    .line 32
    move-result v0

    .line 33
    const/4 v1, 0x1

    .line 34
    .line 35
    if-ne v0, v1, :cond_0

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    const/4 v1, 0x0

    .line 38
    .line 39
    :goto_0
    iput-boolean v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->g:Z

    .line 40
    .line 41
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;-><init>(Landroid/content/Context;)V

    .line 45
    .line 46
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->h:Lio/trtc/tuikit/atomicxcore/impl/view/call/B;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a()V

    .line 50
    return-void
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
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/b;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/b;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/b;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/b;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/b;

    invoke-direct {v0, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/b;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/b;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/b;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->getCameraStatus()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/c;

    invoke-direct {v2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/c;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/b;->c:I

    invoke-interface {p1, v2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static a(Landroid/view/View;)V
    .locals 2

    if-eqz p0, :cond_0

    .line 68
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    .line 69
    invoke-virtual {p0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object v0

    const-string v1, "null cannot be cast to non-null type android.view.ViewGroup"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroid/view/ViewGroup;

    invoke-virtual {v0, p0}, Landroid/view/ViewGroup;->removeView(Landroid/view/View;)V

    :cond_1
    return-void
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;Landroid/view/View;)V
    .locals 0

    const-string/jumbo p1, "this$0"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 64
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->d()V

    return-void
.end method

.method public static final a(Landroid/view/GestureDetector;Landroid/view/View;Landroid/view/MotionEvent;)Z
    .locals 0

    const-string p1, "$detector"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 67
    invoke-virtual {p0, p2}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z

    move-result p0

    return p0
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/d;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/d;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/d;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/d;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/d;

    invoke-direct {v0, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/d;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/d;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/d;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getAllParticipants()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/e;

    invoke-direct {v2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/e;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/d;->c:I

    invoke-interface {p1, v2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final c(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v0, p1, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/f;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/f;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/f;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/f;

    invoke-direct {v0, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/f;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/f;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/f;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSelfInfo()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/g;

    invoke-direct {v2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/g;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/f;->c:I

    invoke-interface {p1, v2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method


# virtual methods
.method public final a(F)I
    .locals 1

    .line 70
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a:Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;

    move-result-object v0

    iget v0, v0, Landroid/util/DisplayMetrics;->density:F

    mul-float/2addr p1, v0

    const/high16 v0, 0x3f000000    # 0.5f

    add-float/2addr p1, v0

    float-to-int p1, p1

    return p1
.end method

.method public final a()V
    .locals 10

    const/4 v0, 0x0

    .line 5
    invoke-virtual {p0, v0}, Landroid/view/View;->setBackgroundColor(I)V

    .line 6
    new-instance v1, Landroid/widget/FrameLayout;

    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a:Landroid/content/Context;

    invoke-direct {v1, v2}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    const/16 v2, 0x8

    .line 7
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 8
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->i:Landroid/widget/FrameLayout;

    .line 9
    new-instance v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    const/4 v3, -0x1

    .line 10
    invoke-direct {v1, v3, v3}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 11
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->i:Landroid/widget/FrameLayout;

    const/4 v5, 0x0

    if-nez v4, :cond_0

    const-string v4, "bigVideoContainer"

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v4, v5

    :cond_0
    invoke-virtual {p0, v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 12
    new-instance v1, Landroid/widget/FrameLayout;

    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a:Landroid/content/Context;

    invoke-direct {v1, v4}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V

    .line 13
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 14
    new-instance v4, Lgg0/a;

    invoke-direct {v4, p0}, Lgg0/a;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;)V

    invoke-virtual {v1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 15
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    .line 16
    new-instance v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    const/high16 v4, 0x42f00000    # 120.0f

    .line 17
    invoke-virtual {p0, v4}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    move-result v4

    const/high16 v6, 0x43340000    # 180.0f

    .line 18
    invoke-virtual {p0, v6}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    move-result v6

    .line 19
    invoke-direct {v1, v4, v6}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    const/high16 v4, 0x42c80000    # 100.0f

    .line 20
    invoke-virtual {p0, v4}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    move-result v6

    iput v6, v1, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    const/high16 v6, 0x41a00000    # 20.0f

    .line 21
    invoke-virtual {p0, v6}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    move-result v6

    invoke-virtual {v1, v6}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 22
    iput v0, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToTop:I

    .line 23
    iput v0, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->endToEnd:I

    .line 24
    iget-object v6, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    if-nez v6, :cond_1

    const-string/jumbo v6, "smallVideoContainer"

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v6, v5

    :cond_1
    invoke-virtual {p0, v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 25
    new-instance v1, Landroid/widget/ImageView;

    iget-object v6, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a:Landroid/content/Context;

    invoke-direct {v1, v6}, Landroid/widget/ImageView;-><init>(Landroid/content/Context;)V

    .line 26
    sget-object v6, Landroid/widget/ImageView$ScaleType;->CENTER_CROP:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 27
    invoke-virtual {v1, v2}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 28
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->m:Landroid/widget/ImageView;

    .line 29
    new-instance v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 30
    invoke-direct {v1, v3, v3}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 31
    iget-object v6, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->m:Landroid/widget/ImageView;

    if-nez v6, :cond_2

    const-string v6, "imageBackground"

    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v6, v5

    :cond_2
    invoke-virtual {p0, v6, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 32
    new-instance v1, Landroidx/constraintlayout/widget/Guideline;

    iget-object v6, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a:Landroid/content/Context;

    invoke-direct {v1, v6}, Landroidx/constraintlayout/widget/Guideline;-><init>(Landroid/content/Context;)V

    .line 33
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v6

    invoke-virtual {v1, v6}, Landroid/view/View;->setId(I)V

    .line 34
    new-instance v6, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    const/4 v7, -0x2

    invoke-direct {v6, v0, v7}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 35
    iput v0, v6, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->orientation:I

    .line 36
    invoke-virtual {p0, v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const v6, 0x3e99999a    # 0.3f

    .line 37
    invoke-virtual {v1, v6}, Landroidx/constraintlayout/widget/Guideline;->setGuidelinePercent(F)V

    .line 38
    invoke-virtual {p0, v4}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    move-result v4

    const/high16 v6, 0x41400000    # 12.0f

    .line 39
    invoke-virtual {p0, v6}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    move-result v6

    .line 40
    new-instance v8, Landroidx/constraintlayout/utils/widget/ImageFilterView;

    iget-object v9, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a:Landroid/content/Context;

    invoke-direct {v8, v9}, Landroidx/constraintlayout/utils/widget/ImageFilterView;-><init>(Landroid/content/Context;)V

    .line 41
    invoke-static {}, Landroid/view/View;->generateViewId()I

    move-result v9

    invoke-virtual {v8, v9}, Landroid/view/View;->setId(I)V

    .line 42
    invoke-virtual {v8, v2}, Landroid/view/View;->setVisibility(I)V

    int-to-float v9, v6

    .line 43
    invoke-virtual {v8, v9}, Landroidx/constraintlayout/utils/widget/ImageFilterView;->setRound(F)V

    .line 44
    iput-object v8, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->k:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    .line 45
    new-instance v8, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    invoke-direct {v8, v4, v4}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 46
    iput v6, v8, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 47
    invoke-virtual {v1}, Landroid/view/View;->getId()I

    move-result v1

    iput v1, v8, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToTop:I

    .line 48
    iput v0, v8, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->startToStart:I

    .line 49
    iput v0, v8, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->endToEnd:I

    .line 50
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->k:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    const-string v4, "imageAvatar"

    if-nez v1, :cond_3

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v5

    :cond_3
    invoke-virtual {p0, v1, v8}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    new-instance v1, Landroid/widget/TextView;

    iget-object v6, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a:Landroid/content/Context;

    invoke-direct {v1, v6}, Landroid/widget/TextView;-><init>(Landroid/content/Context;)V

    .line 52
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 53
    sget-object v2, Landroid/text/TextUtils$TruncateAt;->END:Landroid/text/TextUtils$TruncateAt;

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setEllipsize(Landroid/text/TextUtils$TruncateAt;)V

    const/4 v2, 0x1

    .line 54
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setMaxLines(I)V

    .line 55
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setTextColor(I)V

    const/4 v2, 0x2

    const/high16 v3, 0x41900000    # 18.0f

    .line 56
    invoke-virtual {v1, v2, v3}, Landroid/widget/TextView;->setTextSize(IF)V

    .line 57
    iput-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->l:Landroid/widget/TextView;

    .line 58
    new-instance v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;

    .line 59
    invoke-direct {v1, v7, v7}, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;-><init>(II)V

    .line 60
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->k:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    if-nez v2, :cond_4

    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v5

    :cond_4
    invoke-virtual {v2}, Landroid/view/View;->getId()I

    move-result v2

    iput v2, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->topToBottom:I

    .line 61
    iput v0, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->startToStart:I

    .line 62
    iput v0, v1, Landroidx/constraintlayout/widget/ConstraintLayout$LayoutParams;->endToEnd:I

    .line 63
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->l:Landroid/widget/TextView;

    if-nez v0, :cond_5

    const-string/jumbo v0, "textUserName"

    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_5
    move-object v5, v0

    :goto_0
    invoke-virtual {p0, v5, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    return-void
.end method

.method public final a(Landroid/widget/FrameLayout;)V
    .locals 3

    .line 65
    new-instance v0, Landroid/view/GestureDetector;

    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a:Landroid/content/Context;

    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/a;

    invoke-direct {v2, p1, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/a;-><init>(Landroid/widget/FrameLayout;Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;)V

    invoke-direct {v0, v1, v2}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V

    .line 66
    new-instance v1, Lgg0/b;

    invoke-direct {v1, v0}, Lgg0/b;-><init>(Landroid/view/GestureDetector;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V

    return-void
.end method

.method public final a(Z)V
    .locals 4

    if-eqz p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    :cond_0
    const/16 v0, 0x8

    .line 71
    :goto_0
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->k:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    const-string v2, "imageAvatar"

    const/4 v3, 0x0

    if-nez v1, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v3

    :cond_1
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 72
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->l:Landroid/widget/TextView;

    if-nez v1, :cond_2

    const-string/jumbo v1, "textUserName"

    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v1, v3

    :cond_2
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    .line 73
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v0, :cond_3

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->getParticipantId()Ljava/lang/String;

    move-result-object v0

    goto :goto_1

    :cond_3
    move-object v0, v3

    .line 74
    :goto_1
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->f:Ljava/util/Map;

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz p1, :cond_5

    if-eqz v0, :cond_5

    .line 75
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->h:Lio/trtc/tuikit/atomicxcore/impl/view/call/B;

    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->k:Landroidx/constraintlayout/utils/widget/ImageFilterView;

    if-nez v1, :cond_4

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    move-object v3, v1

    :goto_2
    invoke-virtual {p1, v3, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a(Landroid/widget/ImageView;Ljava/lang/String;)V

    :cond_5
    return-void
.end method

.method public final b()V
    .locals 7

    .line 5
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    move-result-object v1

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSelfInfo()Lkotlinx/coroutines/flow/w;

    move-result-object v1

    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    move-result-object v1

    .line 6
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore$Companion;->shared()Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    move-result-object v2

    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->getCameraStatus()Lkotlinx/coroutines/flow/w;

    move-result-object v2

    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;->OFF:Lio/trtc/tuikit/atomicxcore/api/device/DeviceStatus;

    const/4 v4, 0x0

    if-ne v2, v3, :cond_0

    const/4 v2, 0x1

    goto :goto_0

    :cond_0
    move v2, v4

    .line 7
    :goto_0
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    move-result-object v0

    .line 8
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getMediaType()Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    move-result-object v0

    .line 9
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;->Video:Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    const-string v5, "imageBackground"

    const/4 v6, 0x0

    if-ne v0, v3, :cond_3

    .line 10
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->m:Landroid/widget/ImageView;

    if-nez v0, :cond_1

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v6

    :cond_1
    sget-object v3, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->Waiting:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    if-ne v1, v3, :cond_2

    if-eqz v2, :cond_2

    goto :goto_1

    :cond_2
    const/16 v4, 0x8

    :goto_1
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    goto :goto_2

    .line 11
    :cond_3
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->m:Landroid/widget/ImageView;

    if-nez v0, :cond_4

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v6

    :cond_4
    invoke-virtual {v0, v4}, Landroid/widget/ImageView;->setVisibility(I)V

    .line 12
    :goto_2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->f:Ljava/util/Map;

    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    if-eqz v1, :cond_5

    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->getParticipantId()Ljava/lang/String;

    move-result-object v1

    goto :goto_3

    :cond_5
    move-object v1, v6

    :goto_3
    invoke-interface {v0, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 13
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->h:Lio/trtc/tuikit/atomicxcore/impl/view/call/B;

    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->m:Landroid/widget/ImageView;

    if-nez v2, :cond_6

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v2, v6

    :cond_6
    const/16 v3, 0x19

    invoke-virtual {v1, v2, v0, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/call/B;->a(Landroid/widget/ImageView;Ljava/lang/String;I)V

    .line 14
    :cond_7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->m:Landroid/widget/ImageView;

    if-nez v0, :cond_8

    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_4

    :cond_8
    move-object v6, v0

    :goto_4
    const v0, -0x7fddd9d2

    invoke-virtual {v6, v0}, Landroid/widget/ImageView;->setColorFilter(I)V

    return-void
.end method

.method public final c()V
    .locals 4

    .line 5
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->e()V

    .line 6
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Landroid/view/View;)V

    .line 7
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    const/4 v1, 0x0

    const-string/jumbo v2, "smallVideoContainer"

    if-nez v0, :cond_0

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    if-nez v0, :cond_1

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    move-object v0, v1

    :cond_1
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    invoke-virtual {v0, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    if-nez v0, :cond_2

    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    goto :goto_0

    :cond_2
    move-object v1, v0

    :goto_0
    const/4 v0, 0x0

    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSelfInfo()Lkotlinx/coroutines/flow/w;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->Accept:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 27
    .line 28
    if-ne v0, v1, :cond_7

    .line 29
    .line 30
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Landroid/view/View;)V

    .line 34
    .line 35
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Landroid/view/View;)V

    .line 39
    .line 40
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    .line 41
    .line 42
    .line 43
    const-string/jumbo v1, "smallVideoContainer"

    .line 44
    const/4 v2, 0x0

    .line 45
    .line 46
    if-nez v0, :cond_0

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 50
    move-object v0, v2

    .line 51
    .line 52
    .line 53
    :cond_0
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 54
    .line 55
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->i:Landroid/widget/FrameLayout;

    .line 56
    .line 57
    const-string v3, "bigVideoContainer"

    .line 58
    .line 59
    if-nez v0, :cond_1

    .line 60
    .line 61
    .line 62
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 63
    move-object v0, v2

    .line 64
    .line 65
    .line 66
    :cond_1
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->e()V

    .line 70
    .line 71
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->e:Z

    .line 72
    .line 73
    if-eqz v0, :cond_4

    .line 74
    .line 75
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    .line 76
    .line 77
    if-nez v0, :cond_2

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 81
    move-object v0, v2

    .line 82
    .line 83
    :cond_2
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 87
    .line 88
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->i:Landroid/widget/FrameLayout;

    .line 89
    .line 90
    if-nez v0, :cond_3

    .line 91
    .line 92
    .line 93
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 94
    goto :goto_0

    .line 95
    :cond_3
    move-object v2, v0

    .line 96
    .line 97
    :goto_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 101
    goto :goto_2

    .line 102
    .line 103
    :cond_4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    .line 104
    .line 105
    if-nez v0, :cond_5

    .line 106
    .line 107
    .line 108
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 109
    move-object v0, v2

    .line 110
    .line 111
    :cond_5
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 115
    .line 116
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->i:Landroid/widget/FrameLayout;

    .line 117
    .line 118
    if-nez v0, :cond_6

    .line 119
    .line 120
    .line 121
    invoke-static {v3}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 122
    goto :goto_1

    .line 123
    :cond_6
    move-object v2, v0

    .line 124
    .line 125
    :goto_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v2, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 129
    .line 130
    :goto_2
    iget-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->e:Z

    .line 131
    .line 132
    xor-int/lit8 v0, v0, 0x1

    .line 133
    .line 134
    iput-boolean v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->e:Z

    .line 135
    :cond_7
    return-void
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
.end method

.method public final e()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    const-string/jumbo v2, "smallVideoContainer"

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    move-object v0, v1

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_1
    const/high16 v3, 0x42f00000    # 120.0f

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    .line 25
    move-result v3

    .line 26
    .line 27
    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 28
    .line 29
    :goto_0
    if-nez v0, :cond_2

    .line 30
    goto :goto_1

    .line 31
    .line 32
    :cond_2
    const/high16 v3, 0x43340000    # 180.0f

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v3}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    .line 36
    move-result v3

    .line 37
    .line 38
    iput v3, v0, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 39
    .line 40
    :goto_1
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    .line 41
    .line 42
    if-nez v3, :cond_3

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 46
    goto :goto_2

    .line 47
    :cond_3
    move-object v1, v3

    .line 48
    .line 49
    .line 50
    :goto_2
    invoke-virtual {v1, v0}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    .line 51
    return-void
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
.end method

.method public final onAttachedToWindow()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onAttachedToWindow()V

    .line 4
    .line 5
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSelfInfo()Lkotlinx/coroutines/flow/w;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-interface {v1}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getId()Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getInviterId()Ljava/lang/String;

    .line 37
    move-result-object v2

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 41
    move-result-object v3

    .line 42
    .line 43
    check-cast v3, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getInviteeIds()Ljava/util/LinkedHashSet;

    .line 47
    move-result-object v3

    .line 48
    .line 49
    .line 50
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->first(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 51
    move-result-object v3

    .line 52
    .line 53
    check-cast v3, Ljava/lang/String;

    .line 54
    .line 55
    .line 56
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 57
    move-result v4

    .line 58
    .line 59
    if-eqz v4, :cond_0

    .line 60
    goto :goto_0

    .line 61
    :cond_0
    move-object v2, v3

    .line 62
    .line 63
    :goto_0
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 64
    .line 65
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a:Landroid/content/Context;

    .line 66
    .line 67
    const-string v5, "context"

    .line 68
    .line 69
    .line 70
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 71
    .line 72
    .line 73
    invoke-direct {v3, v4, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 74
    .line 75
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 76
    .line 77
    const/high16 v1, 0x42a00000    # 80.0f

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    .line 81
    move-result v4

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    .line 85
    move-result v6

    .line 86
    const/4 v7, 0x0

    .line 87
    .line 88
    const/high16 v8, 0x41400000    # 12.0f

    .line 89
    .line 90
    .line 91
    invoke-virtual {v3, v7, v4, v6, v8}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->a(ZIIF)V

    .line 92
    .line 93
    iget-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 94
    .line 95
    if-eqz v3, :cond_1

    .line 96
    .line 97
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->f:Ljava/util/Map;

    .line 98
    .line 99
    .line 100
    invoke-virtual {v3, v4}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setParticipantsAvatar(Ljava/util/Map;)V

    .line 101
    .line 102
    :cond_1
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 103
    .line 104
    iget-object v4, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a:Landroid/content/Context;

    .line 105
    .line 106
    .line 107
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-direct {v3, v4, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;-><init>(Landroid/content/Context;Ljava/lang/String;)V

    .line 111
    .line 112
    iput-object v3, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    .line 116
    move-result v2

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(F)I

    .line 120
    move-result v1

    .line 121
    const/4 v4, 0x1

    .line 122
    .line 123
    .line 124
    invoke-virtual {v3, v4, v2, v1, v8}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->a(ZIIF)V

    .line 125
    .line 126
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 127
    .line 128
    if-eqz v1, :cond_2

    .line 129
    .line 130
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->f:Ljava/util/Map;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setParticipantsAvatar(Ljava/util/Map;)V

    .line 134
    .line 135
    .line 136
    :cond_2
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 137
    move-result-object v1

    .line 138
    .line 139
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getMediaType()Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    .line 146
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 147
    move-result-object v0

    .line 148
    .line 149
    .line 150
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 151
    move-result-object v0

    .line 152
    .line 153
    .line 154
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSelfInfo()Lkotlinx/coroutines/flow/w;

    .line 155
    move-result-object v0

    .line 156
    .line 157
    .line 158
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 159
    move-result-object v0

    .line 160
    .line 161
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 165
    move-result-object v0

    .line 166
    .line 167
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;->Audio:Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    .line 168
    .line 169
    const/16 v3, 0x8

    .line 170
    .line 171
    .line 172
    const-string/jumbo v5, "smallVideoContainer"

    .line 173
    .line 174
    const-string v6, "bigVideoContainer"

    .line 175
    const/4 v8, 0x0

    .line 176
    .line 177
    if-ne v1, v2, :cond_5

    .line 178
    .line 179
    .line 180
    invoke-virtual {p0, v4}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Z)V

    .line 181
    .line 182
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->i:Landroid/widget/FrameLayout;

    .line 183
    .line 184
    if-nez v0, :cond_3

    .line 185
    .line 186
    .line 187
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 188
    move-object v0, v8

    .line 189
    .line 190
    .line 191
    :cond_3
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 192
    .line 193
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    .line 194
    .line 195
    if-nez v0, :cond_4

    .line 196
    .line 197
    .line 198
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 199
    move-object v0, v8

    .line 200
    .line 201
    .line 202
    :cond_4
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 203
    goto :goto_1

    .line 204
    .line 205
    :cond_5
    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;->Video:Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    .line 206
    .line 207
    if-ne v1, v2, :cond_d

    .line 208
    .line 209
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 210
    .line 211
    .line 212
    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Landroid/view/View;)V

    .line 213
    .line 214
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->i:Landroid/widget/FrameLayout;

    .line 215
    .line 216
    if-nez v1, :cond_6

    .line 217
    .line 218
    .line 219
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 220
    move-object v1, v8

    .line 221
    .line 222
    .line 223
    :cond_6
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 224
    .line 225
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->i:Landroid/widget/FrameLayout;

    .line 226
    .line 227
    if-nez v1, :cond_7

    .line 228
    .line 229
    .line 230
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 231
    move-object v1, v8

    .line 232
    .line 233
    :cond_7
    iget-object v2, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 237
    .line 238
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    .line 239
    .line 240
    if-nez v1, :cond_8

    .line 241
    .line 242
    .line 243
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 244
    move-object v1, v8

    .line 245
    .line 246
    .line 247
    :cond_8
    invoke-virtual {p0, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Landroid/widget/FrameLayout;)V

    .line 248
    .line 249
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->i:Landroid/widget/FrameLayout;

    .line 250
    .line 251
    if-nez v1, :cond_9

    .line 252
    .line 253
    .line 254
    invoke-static {v6}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 255
    move-object v1, v8

    .line 256
    .line 257
    .line 258
    :cond_9
    invoke-virtual {v1, v7}, Landroid/view/View;->setVisibility(I)V

    .line 259
    .line 260
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->Accept:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 261
    .line 262
    if-ne v0, v1, :cond_b

    .line 263
    .line 264
    .line 265
    invoke-virtual {p0, v7}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Z)V

    .line 266
    .line 267
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    .line 268
    .line 269
    if-nez v0, :cond_a

    .line 270
    .line 271
    .line 272
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 273
    move-object v0, v8

    .line 274
    .line 275
    .line 276
    :cond_a
    invoke-virtual {v0, v7}, Landroid/view/View;->setVisibility(I)V

    .line 277
    .line 278
    .line 279
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c()V

    .line 280
    goto :goto_1

    .line 281
    .line 282
    .line 283
    :cond_b
    invoke-virtual {p0, v4}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Z)V

    .line 284
    .line 285
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    .line 286
    .line 287
    if-nez v0, :cond_c

    .line 288
    .line 289
    .line 290
    invoke-static {v5}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 291
    move-object v0, v8

    .line 292
    .line 293
    .line 294
    :cond_c
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 295
    .line 296
    .line 297
    :cond_d
    :goto_1
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->b()V

    .line 298
    .line 299
    .line 300
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 301
    move-result-object v0

    .line 302
    .line 303
    .line 304
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 305
    move-result-object v1

    .line 306
    .line 307
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/l;

    .line 308
    .line 309
    .line 310
    invoke-direct {v4, p0, v8}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/l;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;Lkotlin/coroutines/Continuation;)V

    .line 311
    const/4 v5, 0x3

    .line 312
    const/4 v6, 0x0

    .line 313
    const/4 v2, 0x0

    .line 314
    const/4 v3, 0x0

    .line 315
    .line 316
    .line 317
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 318
    move-result-object v0

    .line 319
    .line 320
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->b:Lkotlinx/coroutines/x1;

    .line 321
    return-void
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
.end method

.method public final onDetachedFromWindow()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/view/View;->onDetachedFromWindow()V

    .line 4
    .line 5
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->b:Lkotlinx/coroutines/x1;

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    const/4 v2, 0x1

    .line 10
    .line 11
    .line 12
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 13
    .line 14
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Landroid/view/View;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 23
    .line 24
    :cond_1
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 25
    .line 26
    if-eqz v0, :cond_2

    .line 27
    .line 28
    .line 29
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Landroid/view/View;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 33
    .line 34
    :cond_2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->i:Landroid/widget/FrameLayout;

    .line 35
    .line 36
    if-nez v0, :cond_3

    .line 37
    .line 38
    const-string v0, "bigVideoContainer"

    .line 39
    .line 40
    .line 41
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 42
    move-object v0, v1

    .line 43
    .line 44
    .line 45
    :cond_3
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 46
    .line 47
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->j:Landroid/widget/FrameLayout;

    .line 48
    .line 49
    if-nez v0, :cond_4

    .line 50
    .line 51
    .line 52
    const-string/jumbo v0, "smallVideoContainer"

    .line 53
    .line 54
    .line 55
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 56
    goto :goto_0

    .line 57
    :cond_4
    move-object v1, v0

    .line 58
    .line 59
    .line 60
    :goto_0
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 61
    return-void
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
.end method

.method public final setParticipantsAvatar(Ljava/util/Map;)V
    .locals 3
    .param p1    # Ljava/util/Map;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "avatars"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->f:Ljava/util/Map;

    .line 8
    .line 9
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->c:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setParticipantsAvatar(Ljava/util/Map;)V

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->d:Lio/trtc/tuikit/atomicxcore/impl/view/call/x;

    .line 17
    .line 18
    if-eqz v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/x;->setParticipantsAvatar(Ljava/util/Map;)V

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->b()V

    .line 25
    .line 26
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;->getShared()Lio/trtc/tuikit/atomicxcore/api/call/CallStore;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->getObserverState()Lio/trtc/tuikit/atomicxcore/api/call/CallState;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallState;->getSelfInfo()Lkotlinx/coroutines/flow/w;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantInfo;->getStatus()Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getMediaType()Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->Waiting:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 61
    const/4 v2, 0x1

    .line 62
    .line 63
    if-ne v0, v1, :cond_2

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Z)V

    .line 67
    return-void

    .line 68
    .line 69
    :cond_2
    sget-object v1, Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;->Accept:Lio/trtc/tuikit/atomicxcore/api/call/CallParticipantStatus;

    .line 70
    .line 71
    if-ne v0, v1, :cond_3

    .line 72
    .line 73
    sget-object v0, Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;->Audio:Lio/trtc/tuikit/atomicxcore/api/call/CallMediaType;

    .line 74
    .line 75
    if-ne p1, v0, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0, v2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/float/m;->a(Z)V

    .line 79
    :cond_3
    return-void
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
.end method
