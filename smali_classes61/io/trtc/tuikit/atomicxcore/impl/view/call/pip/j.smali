.class public final Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;

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
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;

    .line 3
    .line 4
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;->a:Ljava/lang/Object;

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
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;

    .line 7
    .line 8
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;->a:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 7

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
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;->a:Ljava/lang/Object;

    .line 9
    move-object v0, p1

    .line 10
    .line 11
    check-cast v0, Lkotlinx/coroutines/m0;

    .line 12
    .line 13
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/g;

    .line 14
    .line 15
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;

    .line 16
    const/4 v6, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {v3, p1, v6}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/g;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/Continuation;)V

    .line 20
    const/4 v4, 0x3

    .line 21
    const/4 v5, 0x0

    .line 22
    const/4 v1, 0x0

    .line 23
    const/4 v2, 0x0

    .line 24
    .line 25
    .line 26
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 27
    .line 28
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/h;

    .line 29
    .line 30
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;

    .line 31
    .line 32
    .line 33
    invoke-direct {v3, p1, v6}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/h;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/Continuation;)V

    .line 34
    .line 35
    .line 36
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 37
    .line 38
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;

    .line 39
    .line 40
    sget v1, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;->k:I

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 44
    .line 45
    sget-object p1, Lio/trtc/tuikit/atomicxcore/api/call/CallStore;->Companion:Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    check-cast v1, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getInviteeIds()Ljava/util/LinkedHashSet;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    .line 59
    move-result v1

    .line 60
    .line 61
    .line 62
    invoke-static {p1}, Lio/trtc/tuikit/atomicxcore/api/view/b;->a(Lio/trtc/tuikit/atomicxcore/api/call/CallStore$Companion;)Ljava/lang/Object;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    check-cast p1, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;

    .line 66
    .line 67
    .line 68
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/call/CallInfo;->getChatGroupId()Ljava/lang/String;

    .line 69
    move-result-object p1

    .line 70
    const/4 v2, 0x1

    .line 71
    .line 72
    if-gt v1, v2, :cond_0

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 76
    move-result p1

    .line 77
    .line 78
    if-lez p1, :cond_1

    .line 79
    .line 80
    :cond_0
    new-instance v3, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/i;

    .line 81
    .line 82
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/j;->b:Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;

    .line 83
    .line 84
    .line 85
    invoke-direct {v3, p1, v6}, Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/i;-><init>(Lio/trtc/tuikit/atomicxcore/impl/view/call/pip/l;Lkotlin/coroutines/Continuation;)V

    .line 86
    const/4 v4, 0x3

    .line 87
    const/4 v5, 0x0

    .line 88
    const/4 v1, 0x0

    .line 89
    const/4 v2, 0x0

    .line 90
    .line 91
    .line 92
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 93
    .line 94
    :cond_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 95
    return-object p1
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
