.class public final Lio/trtc/tuikit/atomicxcore/impl/search/j;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

.field public final synthetic b:Lkotlin/coroutines/SafeContinuation;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/search/p;Lkotlin/coroutines/SafeContinuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/j;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/search/j;->b:Lkotlin/coroutines/SafeContinuation;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.method public final onError(ILjava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/search/j;->b:Lkotlin/coroutines/SafeContinuation;

    .line 3
    .line 4
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 5
    .line 6
    new-instance v1, Lio/trtc/tuikit/atomicxcore/impl/common/e;

    .line 7
    .line 8
    if-nez p2, :cond_0

    .line 9
    .line 10
    const-string p2, "Group search failed"

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-direct {v1, p1, p2}, Lio/trtc/tuikit/atomicxcore/impl/common/e;-><init>(ILjava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {v1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p1}, Lkotlin/coroutines/SafeContinuation;->resumeWith(Ljava/lang/Object;)V

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
.end method

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 3

    .line 1
    .line 2
    check-cast p1, Ljava/util/List;

    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/search/j;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    .line 7
    .line 8
    new-instance v1, Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    .line 18
    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v2

    .line 20
    .line 21
    if-eqz v2, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    check-cast v2, Lcom/tencent/imsdk/v2/V2TIMGroupInfo;

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v2}, Lio/trtc/tuikit/atomicxcore/impl/search/p;->a(Lio/trtc/tuikit/atomicxcore/impl/search/p;Lcom/tencent/imsdk/v2/V2TIMGroupInfo;)Lio/trtc/tuikit/atomicxcore/api/search/GroupSearchInfo;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    if-eqz v2, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    goto :goto_0

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-static {}, Lkotlin/collections/CollectionsKt;->emptyList()Ljava/util/List;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    :cond_2
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/j;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    .line 44
    .line 45
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/search/p;->n:Lkotlinx/coroutines/flow/n;

    .line 46
    .line 47
    .line 48
    invoke-interface {p1, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 49
    .line 50
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/j;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    .line 51
    .line 52
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/search/p;->o:Lkotlinx/coroutines/flow/n;

    .line 53
    .line 54
    .line 55
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 56
    move-result v0

    .line 57
    .line 58
    .line 59
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 64
    .line 65
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/j;->a:Lio/trtc/tuikit/atomicxcore/impl/search/p;

    .line 66
    .line 67
    iget-object p1, p1, Lio/trtc/tuikit/atomicxcore/impl/search/p;->p:Lkotlinx/coroutines/flow/n;

    .line 68
    .line 69
    sget-object v0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 70
    .line 71
    .line 72
    invoke-interface {p1, v0}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 73
    .line 74
    iget-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/search/j;->b:Lkotlin/coroutines/SafeContinuation;

    .line 75
    .line 76
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 77
    .line 78
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 79
    .line 80
    .line 81
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lkotlin/coroutines/SafeContinuation;->resumeWith(Ljava/lang/Object;)V

    .line 86
    return-void
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
