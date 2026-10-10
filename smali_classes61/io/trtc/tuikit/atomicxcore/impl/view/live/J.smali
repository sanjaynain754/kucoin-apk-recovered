.class public final Lio/trtc/tuikit/atomicxcore/impl/view/live/J;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;->b:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 3
    const/4 p1, 0x2

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1, p2}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
    .line 43
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;

    .line 3
    .line 4
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;->b:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;-><init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;->a:Ljava/lang/Object;

    .line 10
    return-object v0
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
.end method

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;

    .line 7
    .line 8
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;->b:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;-><init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;->a:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    return-object p1
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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 7
    .line 8
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;->a:Ljava/lang/Object;

    .line 9
    move-object v0, p1

    .line 10
    .line 11
    check-cast v0, Lkotlinx/coroutines/m0;

    .line 12
    .line 13
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/view/live/I;

    .line 14
    .line 15
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/live/J;->b:Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;

    .line 16
    const/4 v1, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {v3, p1, v1}, Lio/trtc/tuikit/atomicxcore/impl/view/live/I;-><init>(Lio/trtc/tuikit/atomicxcore/api/view/LiveCoreView;Lkotlin/coroutines/Continuation;)V

    .line 20
    const/4 v4, 0x3

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 26
    .line 27
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    return-object p1
    .line 29
    .line 30
.end method
