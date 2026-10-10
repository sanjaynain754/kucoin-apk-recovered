.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

.field public b:Ljava/lang/String;

.field public c:Lkotlinx/coroutines/x1;


# direct methods
.method public constructor <init>()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    .line 11
    .line 12
    const-string v0, ""

    .line 13
    .line 14
    iput-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->b:Ljava/lang/String;

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lkotlinx/coroutines/z0;->c()Lkotlinx/coroutines/e2;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lkotlinx/coroutines/n0;->a(Lkotlin/coroutines/CoroutineContext;)Lkotlinx/coroutines/m0;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    new-instance v4, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;

    .line 25
    const/4 v0, 0x0

    .line 26
    .line 27
    .line 28
    invoke-direct {v4, p0, v0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/v0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/Continuation;)V

    .line 29
    const/4 v5, 0x3

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v2, 0x0

    .line 32
    const/4 v3, 0x0

    .line 33
    .line 34
    .line 35
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    const-string v1, "<set-?>"

    .line 39
    .line 40
    .line 41
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 42
    return-void
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
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/w0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/w0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/w0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/w0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/w0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/w0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/w0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 11
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/w0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 12
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->getCameraStatus()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/x0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/x0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/w0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/l0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/l0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/l0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/l0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/l0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/l0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/l0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 7
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/l0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->getBattleState()Lio/trtc/tuikit/atomicxcore/api/live/BattleState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleState;->getCurrentBattleInfo()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/m0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/m0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/l0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/j0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/j0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/j0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/j0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/j0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/j0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/j0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/j0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getApplicants()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/k0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/k0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/j0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/y0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/y0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/y0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/y0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/y0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/y0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/y0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 15
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/y0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 16
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->getCoHostState()Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;->getApplicant()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/z0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/z0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/y0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/G0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/G0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 19
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListStore;->getLiveState()Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveListState;->getCurrentLive()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/H0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/H0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/G0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 21
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 22
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/T0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/T0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 23
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 24
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatStore;->getLiveSeatState()Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSeatState;->getSeatList()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/U0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/U0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/T0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 13
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 14
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/K0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/K0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/K0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/K0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/K0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/K0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/K0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 15
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/K0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 16
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->isFrontCamera()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/L0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/L0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/K0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/n0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/n0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/n0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/n0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/n0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/n0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/n0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/n0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleStore;->getBattleState()Lio/trtc/tuikit/atomicxcore/api/live/BattleState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/BattleState;->getBattleUsers()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/o0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/o0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/n0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/E0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/E0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 11
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 12
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getConnected()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/F0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/F0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/E0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final b(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/A0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/A0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/A0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/A0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/A0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/A0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/A0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 7
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/A0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->getCoHostState()Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;->getInvitees()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/B0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/B0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/A0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final c(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 9
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/P0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/P0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/P0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/P0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/P0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/P0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/P0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 11
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/P0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 12
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->getCameraStatus()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/Q0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/Q0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/P0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final c(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 6
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/I0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/I0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/I0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/I0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/I0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/I0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/I0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 7
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/I0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 8
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestStore;->getCoGuestState()Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoGuestState;->getInvitees()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/J0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/J0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/I0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final c(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/C0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/C0;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/C0;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/C0;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/C0;

    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/C0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/C0;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/C0;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostStore;->getCoHostState()Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;

    move-result-object p1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/CoHostState;->getConnected()Lkotlinx/coroutines/flow/w;

    move-result-object p1

    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/D0;

    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/D0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/C0;->c:I

    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final d(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    instance-of v0, p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/R0;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    move-object v0, p2

    .line 9
    .line 10
    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/R0;

    .line 11
    .line 12
    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/R0;->c:I

    .line 13
    .line 14
    const/high16 v2, -0x80000000

    .line 15
    .line 16
    and-int v3, v1, v2

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    sub-int/2addr v1, v2

    .line 20
    .line 21
    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/R0;->c:I

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/R0;

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p0, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/R0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 28
    .line 29
    :goto_0
    iget-object p2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/R0;->a:Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/R0;->c:I

    .line 36
    const/4 v3, 0x1

    .line 37
    .line 38
    if-eqz v2, :cond_2

    .line 39
    .line 40
    if-eq v2, v3, :cond_1

    .line 41
    .line 42
    new-instance p0, Ljava/lang/IllegalStateException;

    .line 43
    .line 44
    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    .line 45
    .line 46
    .line 47
    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    throw p0

    .line 49
    .line 50
    .line 51
    :cond_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 52
    goto :goto_1

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceStore;->getDeviceState()Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/device/DeviceState;->getMicrophoneStatus()Lkotlinx/coroutines/flow/w;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    new-instance p2, Lio/trtc/tuikit/atomicxcore/impl/view/live/S0;

    .line 66
    .line 67
    .line 68
    invoke-direct {p2, p0}, Lio/trtc/tuikit/atomicxcore/impl/view/live/S0;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;)V

    .line 69
    .line 70
    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/R0;->c:I

    .line 71
    .line 72
    .line 73
    invoke-interface {p1, p2, v0}, Lkotlinx/coroutines/flow/r;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 74
    move-result-object p0

    .line 75
    .line 76
    if-ne p0, v1, :cond_3

    .line 77
    return-object v1

    .line 78
    .line 79
    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    .line 80
    .line 81
    .line 82
    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    .line 83
    throw p0
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
.end method


# virtual methods
.method public final a(Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;)V
    .locals 2

    const-string v0, "liveInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 25
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;->roomState:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;

    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;->roomId:Landroidx/lifecycle/LiveData;

    const-string v1, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.String>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveID()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 26
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;->roomState:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;

    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;->ownerInfo:Landroidx/lifecycle/LiveData;

    const-string v1, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.tencent.cloud.tuikit.engine.room.TUIRoomDefine.UserInfo>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getLiveOwner()Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;

    move-result-object v1

    invoke-static {v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/A;->a(Lio/trtc/tuikit/atomicxcore/api/live/LiveUserInfo;)Lcom/tencent/cloud/tuikit/engine/room/TUIRoomDefine$UserInfo;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    .line 27
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/V0;->a:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;

    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$CoreState;->roomState:Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;

    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/api/live/deprecated/LiveCoreViewDefine$RoomState;->maxCoGuestCount:Landroidx/lifecycle/LiveData;

    const-string v1, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<kotlin.Int>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Landroidx/lifecycle/MutableLiveData;

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/live/LiveInfo;->getMaxSeatCount()I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, p1}, Landroidx/lifecycle/MutableLiveData;->setValue(Ljava/lang/Object;)V

    return-void
.end method
