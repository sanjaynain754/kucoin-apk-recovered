.class public final Lio/trtc/tuikit/atomicxcore/impl/conversation/u;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/tencent/imsdk/v2/V2TIMValueCallback;


# instance fields
.field public final synthetic a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

.field public final synthetic b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;


# direct methods
.method public constructor <init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/E;Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/u;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

    .line 3
    .line 4
    iput-object p2, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/u;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

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
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/u;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-nez p2, :cond_0

    .line 7
    .line 8
    const-string p2, "Unknown error"

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {v0, p1, p2}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onFailure(ILjava/lang/String;)V

    .line 12
    :cond_1
    return-void
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

.method public final onSuccess(Ljava/lang/Object;)V
    .locals 5

    .line 1
    .line 2
    check-cast p1, Lcom/tencent/imsdk/v2/V2TIMConversationResult;

    .line 3
    .line 4
    if-eqz p1, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/u;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/E;

    .line 7
    .line 8
    iget-object v1, p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/u;->b:Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMConversationResult;->getConversationList()Ljava/util/List;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    const-string v3, "getConversationList(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    const-string/jumbo v3, "v2List"

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    new-instance v3, Ljava/util/ArrayList;

    .line 26
    .line 27
    const/16 v4, 0xa

    .line 28
    .line 29
    .line 30
    invoke-static {v2, v4}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    .line 31
    move-result v4

    .line 32
    .line 33
    .line 34
    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    .line 35
    .line 36
    .line 37
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 38
    move-result-object v2

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 42
    move-result v4

    .line 43
    .line 44
    if-eqz v4, :cond_0

    .line 45
    .line 46
    .line 47
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 48
    move-result-object v4

    .line 49
    .line 50
    check-cast v4, Lcom/tencent/imsdk/v2/V2TIMConversation;

    .line 51
    .line 52
    .line 53
    invoke-static {v4}, Lio/trtc/tuikit/atomicxcore/impl/conversation/b;->a(Lcom/tencent/imsdk/v2/V2TIMConversation;)Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    .line 54
    move-result-object v4

    .line 55
    .line 56
    .line 57
    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 58
    goto :goto_0

    .line 59
    .line 60
    :cond_0
    new-instance v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/a;

    .line 61
    .line 62
    .line 63
    invoke-direct {v2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/a;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {v3, v2}, Lkotlin/collections/CollectionsKt;->sortedWith(Ljava/lang/Iterable;Ljava/util/Comparator;)Ljava/util/List;

    .line 67
    move-result-object v2

    .line 68
    .line 69
    iget-object v3, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->e:Lkotlinx/coroutines/flow/n;

    .line 70
    .line 71
    .line 72
    invoke-interface {v3}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 73
    move-result-object v4

    .line 74
    .line 75
    check-cast v4, Ljava/util/Collection;

    .line 76
    .line 77
    .line 78
    invoke-static {v4, v2}, Lkotlin/collections/CollectionsKt;->plus(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/List;

    .line 79
    move-result-object v2

    .line 80
    .line 81
    .line 82
    invoke-interface {v3, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 83
    .line 84
    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->f:Lkotlinx/coroutines/flow/n;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMConversationResult;->isFinished()Z

    .line 88
    move-result v3

    .line 89
    .line 90
    xor-int/lit8 v3, v3, 0x1

    .line 91
    .line 92
    .line 93
    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 94
    move-result-object v3

    .line 95
    .line 96
    .line 97
    invoke-interface {v2, v3}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMConversationResult;->getNextSeq()J

    .line 101
    move-result-wide v2

    .line 102
    .line 103
    iput-wide v2, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/E;->i:J

    .line 104
    .line 105
    if-eqz v1, :cond_1

    .line 106
    .line 107
    .line 108
    invoke-interface {v1}, Lio/trtc/tuikit/atomicxcore/api/CompletionHandler;->onSuccess()V

    .line 109
    :cond_1
    return-void
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
