.class public final Lio/trtc/tuikit/atomicxcore/impl/live/b1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/live/e1;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/b1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

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
    .locals 1

    .line 1
    .line 2
    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/live/b1;

    .line 3
    .line 4
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/b1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lio/trtc/tuikit/atomicxcore/impl/live/b1;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/e1;Lkotlin/coroutines/Continuation;)V

    .line 8
    return-object p1
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

.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/m0;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/live/b1;

    .line 7
    .line 8
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/live/b1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lio/trtc/tuikit/atomicxcore/impl/live/b1;-><init>(Lio/trtc/tuikit/atomicxcore/impl/live/e1;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/live/b1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

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
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/b1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 9
    .line 10
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->b:Lkotlinx/coroutines/flow/n;

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object p1

    .line 15
    move-object v0, p1

    .line 16
    .line 17
    check-cast v0, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->getTotalDuration()J

    .line 21
    move-result-wide v1

    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    const-wide v3, 0x7ffffffffffffc17L

    .line 27
    .line 28
    cmp-long p1, v1, v3

    .line 29
    .line 30
    if-gtz p1, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->getTotalDuration()J

    .line 34
    move-result-wide v1

    .line 35
    .line 36
    const-wide/16 v3, 0x3e8

    .line 37
    add-long/2addr v1, v3

    .line 38
    goto :goto_0

    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    :cond_0
    const-wide v1, 0x7fffffffffffffffL

    .line 44
    .line 45
    :goto_0
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/live/b1;->a:Lio/trtc/tuikit/atomicxcore/impl/live/e1;

    .line 46
    .line 47
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/live/e1;->b:Lkotlinx/coroutines/flow/n;

    .line 48
    .line 49
    const/16 v9, 0x7e

    .line 50
    const/4 v10, 0x0

    .line 51
    const/4 v3, 0x0

    .line 52
    const/4 v4, 0x0

    .line 53
    const/4 v5, 0x0

    .line 54
    const/4 v6, 0x0

    .line 55
    const/4 v7, 0x0

    .line 56
    const/4 v8, 0x0

    .line 57
    .line 58
    .line 59
    invoke-static/range {v0 .. v10}, Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;->copy$default(Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;JIIIIIIILjava/lang/Object;)Lio/trtc/tuikit/atomicxcore/api/live/LiveSummaryData;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 66
    return-object p1
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
