.class public final Lio/trtc/tuikit/atomicxcore/impl/conversation/P;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lio/trtc/tuikit/atomicxcore/impl/conversation/P;

.field public static final b:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final c:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;

.field public static final e:Ljava/util/concurrent/ConcurrentSkipListSet;

.field public static final f:Ljava/util/concurrent/ConcurrentSkipListSet;

.field public static final g:Ljava/util/concurrent/ConcurrentHashMap;

.field public static volatile h:Z

.field public static final i:Lkotlinx/coroutines/flow/m;

.field public static final j:Lkotlinx/coroutines/flow/r;

.field public static final k:Lio/trtc/tuikit/atomicxcore/impl/conversation/F;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/P;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    .line 16
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 20
    .line 21
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 22
    .line 23
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 27
    .line 28
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 29
    .line 30
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    .line 34
    .line 35
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->e:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 36
    .line 37
    new-instance v0, Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentSkipListSet;-><init>()V

    .line 41
    .line 42
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 43
    .line 44
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 48
    .line 49
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->g:Ljava/util/concurrent/ConcurrentHashMap;

    .line 50
    .line 51
    sget-object v0, Lkotlinx/coroutines/channels/BufferOverflow;->DROP_OLDEST:Lkotlinx/coroutines/channels/BufferOverflow;

    .line 52
    const/4 v1, 0x2

    .line 53
    const/4 v2, 0x0

    .line 54
    const/4 v3, 0x1

    .line 55
    const/4 v4, 0x0

    .line 56
    .line 57
    .line 58
    invoke-static {v3, v4, v0, v1, v2}, Lkotlinx/coroutines/flow/s;->b(IILkotlinx/coroutines/channels/BufferOverflow;ILjava/lang/Object;)Lkotlinx/coroutines/flow/m;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->i:Lkotlinx/coroutines/flow/m;

    .line 62
    .line 63
    .line 64
    invoke-static {v0}, Lkotlinx/coroutines/flow/g;->b(Lkotlinx/coroutines/flow/m;)Lkotlinx/coroutines/flow/r;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->j:Lkotlinx/coroutines/flow/r;

    .line 68
    .line 69
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/F;

    .line 70
    .line 71
    .line 72
    invoke-direct {v0}, Lio/trtc/tuikit/atomicxcore/impl/conversation/F;-><init>()V

    .line 73
    .line 74
    sput-object v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->k:Lio/trtc/tuikit/atomicxcore/impl/conversation/F;

    .line 75
    return-void
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

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static final a(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 10

    .line 1
    instance-of v0, p1, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;

    invoke-direct {v0, p1}, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;-><init>(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->d:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->e:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->c:Lkotlin/jvm/internal/Ref$LongRef;

    iget-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->b:Ljava/util/List;

    iget-object v4, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->a:Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v5, v4

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    new-instance p1, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;

    invoke-direct {p1}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;-><init>()V

    .line 4
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->getValue()J

    move-result-wide v4

    invoke-virtual {p1, v4, v5}, Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;->setMarkType(J)V

    .line 5
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    new-instance v2, Lkotlin/jvm/internal/Ref$LongRef;

    invoke-direct {v2}, Lkotlin/jvm/internal/Ref$LongRef;-><init>()V

    const/4 v4, 0x0

    move-object v5, v2

    move-object v2, p0

    move-object p0, v5

    move-object v5, p1

    :goto_1
    if-nez v4, :cond_7

    .line 7
    iput-object v5, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->a:Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;

    iput-object v2, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->b:Ljava/util/List;

    iput-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->c:Lkotlin/jvm/internal/Ref$LongRef;

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/J;->e:I

    .line 8
    new-instance p1, Lkotlinx/coroutines/o;

    invoke-static {v0}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->intercepted(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;

    move-result-object v4

    invoke-direct {p1, v4, v3}, Lkotlinx/coroutines/o;-><init>(Lkotlin/coroutines/Continuation;I)V

    .line 9
    invoke-virtual {p1}, Lkotlinx/coroutines/o;->E()V

    .line 10
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    move-result-object v4

    .line 11
    iget-wide v6, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 12
    new-instance v9, Lio/trtc/tuikit/atomicxcore/impl/conversation/K;

    invoke-direct {v9, p1}, Lio/trtc/tuikit/atomicxcore/impl/conversation/K;-><init>(Lkotlinx/coroutines/o;)V

    const/16 v8, 0x64

    .line 13
    invoke-virtual/range {v4 .. v9}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->getConversationListByFilter(Lcom/tencent/imsdk/v2/V2TIMConversationListFilter;JILcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 14
    invoke-virtual {p1}, Lkotlinx/coroutines/o;->w()Ljava/lang/Object;

    move-result-object p1

    .line 15
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v4

    if-ne p1, v4, :cond_3

    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/DebugProbesKt;->probeCoroutineSuspended(Lkotlin/coroutines/Continuation;)V

    :cond_3
    if-ne p1, v1, :cond_4

    return-object v1

    .line 16
    :cond_4
    :goto_2
    check-cast p1, Lcom/tencent/imsdk/v2/V2TIMConversationResult;

    if-eqz p1, :cond_6

    .line 17
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMConversationResult;->getConversationList()Ljava/util/List;

    move-result-object v4

    const-string v6, "getConversationList(...)"

    invoke-static {v4, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    new-instance v6, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v4, v7}, Lkotlin/collections/CollectionsKt;->collectionSizeOrDefault(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    .line 19
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_3
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_5

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    .line 20
    check-cast v7, Lcom/tencent/imsdk/v2/V2TIMConversation;

    .line 21
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    invoke-static {v7}, Lio/trtc/tuikit/atomicxcore/impl/conversation/b;->a(Lcom/tencent/imsdk/v2/V2TIMConversation;)Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    move-result-object v7

    .line 22
    invoke-virtual {v6, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    .line 23
    :cond_5
    invoke-interface {v2, v6}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 24
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMConversationResult;->getNextSeq()J

    move-result-wide v6

    iput-wide v6, p0, Lkotlin/jvm/internal/Ref$LongRef;->element:J

    .line 25
    invoke-virtual {p1}, Lcom/tencent/imsdk/v2/V2TIMConversationResult;->isFinished()Z

    move-result v4

    goto :goto_1

    :cond_6
    move v4, v3

    goto :goto_1

    :cond_7
    return-object v2
.end method

.method public static final a(Ljava/util/List;)V
    .locals 4

    .line 41
    sget-boolean v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->h:Z

    if-nez v0, :cond_0

    .line 42
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 43
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    .line 44
    :cond_0
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v0, 0x0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 45
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x1

    if-eqz v2, :cond_1

    move v0, v3

    .line 46
    :cond_1
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->c:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_2

    move v0, v3

    .line 47
    :cond_2
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_3

    move v0, v3

    .line 48
    :cond_3
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->e:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->remove(Ljava/lang/Object;)Z

    .line 49
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    invoke-virtual {v2, v1}, Ljava/util/concurrent/ConcurrentSkipListSet;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_4
    if-eqz v0, :cond_5

    .line 50
    sget-object p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->i:Lkotlinx/coroutines/flow/m;

    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-interface {p0, v0}, Lkotlinx/coroutines/flow/m;->d(Ljava/lang/Object;)Z

    :cond_5
    return-void
.end method

.method public static a(Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;)Z
    .locals 4

    const/4 v0, 0x1

    if-nez p1, :cond_0

    return v0

    .line 38
    :cond_0
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getType()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;

    move-result-object v1

    sget-object v2, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;->UNKNOWN:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;

    const/4 v3, 0x0

    if-eq v1, v2, :cond_1

    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getType()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;

    move-result-object v1

    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getType()Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationType;

    move-result-object v2

    if-eq v1, v2, :cond_1

    return v3

    .line 39
    :cond_1
    invoke-virtual {p1}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationListFilter;->getConversationGroup()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_2

    .line 40
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getConversationGroupList()Ljava/util/List;

    move-result-object p0

    invoke-interface {p0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result p0

    if-nez p0, :cond_2

    return v3

    :cond_2
    return v0
.end method

.method public static b(Ljava/util/List;)V
    .locals 10

    .line 1
    .line 2
    new-instance v1, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    new-instance v6, Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 14
    move-result-object p0

    .line 15
    const/4 v0, 0x0

    .line 16
    move v8, v0

    .line 17
    .line 18
    .line 19
    :cond_0
    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 20
    move-result v2

    .line 21
    .line 22
    if-eqz v2, :cond_b

    .line 23
    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    check-cast v2, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getConversationID()Ljava/lang/String;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getMarkList()Ljava/util/List;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    sget-object v5, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->HIDE:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;

    .line 39
    .line 40
    .line 41
    invoke-interface {v4, v5}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 42
    move-result v4

    .line 43
    const/4 v5, 0x1

    .line 44
    .line 45
    if-eqz v4, :cond_4

    .line 46
    .line 47
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    move-result-object v7

    .line 52
    .line 53
    check-cast v7, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;

    .line 54
    .line 55
    if-eqz v7, :cond_1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v7}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getRawConversation$atomicxcore_release()Lcom/tencent/imsdk/v2/V2TIMConversation;

    .line 59
    move-result-object v7

    .line 60
    .line 61
    if-eqz v7, :cond_1

    .line 62
    .line 63
    .line 64
    invoke-virtual {v7}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getUnreadCount()I

    .line 65
    move-result v7

    .line 66
    goto :goto_1

    .line 67
    :cond_1
    move v7, v0

    .line 68
    .line 69
    .line 70
    :goto_1
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getRawConversation$atomicxcore_release()Lcom/tencent/imsdk/v2/V2TIMConversation;

    .line 71
    move-result-object v9

    .line 72
    .line 73
    if-eqz v9, :cond_2

    .line 74
    .line 75
    .line 76
    invoke-virtual {v9}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getUnreadCount()I

    .line 77
    move-result v9

    .line 78
    goto :goto_2

    .line 79
    :cond_2
    move v9, v0

    .line 80
    .line 81
    :goto_2
    if-le v9, v7, :cond_3

    .line 82
    .line 83
    sget-object v7, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->e:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v7, v3}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    .line 87
    move-result v7

    .line 88
    .line 89
    if-nez v7, :cond_3

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 93
    .line 94
    .line 95
    :cond_3
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 96
    move-result-object v7

    .line 97
    .line 98
    .line 99
    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 100
    move-result v7

    .line 101
    .line 102
    if-nez v7, :cond_5

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 106
    :goto_3
    move v8, v5

    .line 107
    goto :goto_4

    .line 108
    .line 109
    :cond_4
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 110
    .line 111
    .line 112
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 113
    move-result-object v4

    .line 114
    .line 115
    if-eqz v4, :cond_5

    .line 116
    .line 117
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->e:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentSkipListSet;->remove(Ljava/lang/Object;)Z

    .line 121
    goto :goto_3

    .line 122
    .line 123
    .line 124
    :cond_5
    :goto_4
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getMarkList()Ljava/util/List;

    .line 125
    move-result-object v4

    .line 126
    .line 127
    sget-object v7, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->FOLD:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;

    .line 128
    .line 129
    .line 130
    invoke-interface {v4, v7}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 131
    move-result v4

    .line 132
    .line 133
    if-eqz v4, :cond_6

    .line 134
    .line 135
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 139
    move-result-object v7

    .line 140
    .line 141
    .line 142
    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 143
    move-result v7

    .line 144
    .line 145
    if-nez v7, :cond_7

    .line 146
    .line 147
    .line 148
    invoke-virtual {v4, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 149
    :goto_5
    move v8, v5

    .line 150
    goto :goto_6

    .line 151
    .line 152
    :cond_6
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->c:Ljava/util/concurrent/ConcurrentHashMap;

    .line 153
    .line 154
    .line 155
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    move-result-object v4

    .line 157
    .line 158
    if-eqz v4, :cond_7

    .line 159
    goto :goto_5

    .line 160
    .line 161
    .line 162
    :cond_7
    :goto_6
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getRawConversation$atomicxcore_release()Lcom/tencent/imsdk/v2/V2TIMConversation;

    .line 163
    move-result-object v4

    .line 164
    .line 165
    if-eqz v4, :cond_8

    .line 166
    .line 167
    .line 168
    invoke-virtual {v4}, Lcom/tencent/imsdk/v2/V2TIMConversation;->getUnreadCount()I

    .line 169
    move-result v4

    .line 170
    goto :goto_7

    .line 171
    :cond_8
    move v4, v0

    .line 172
    .line 173
    .line 174
    :goto_7
    invoke-virtual {v2}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationInfo;->getMarkList()Ljava/util/List;

    .line 175
    move-result-object v7

    .line 176
    .line 177
    sget-object v9, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->UNREAD:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;

    .line 178
    .line 179
    .line 180
    invoke-interface {v7, v9}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 181
    move-result v7

    .line 182
    .line 183
    if-eqz v7, :cond_a

    .line 184
    .line 185
    if-lez v4, :cond_9

    .line 186
    .line 187
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentSkipListSet;->contains(Ljava/lang/Object;)Z

    .line 191
    move-result v4

    .line 192
    .line 193
    if-nez v4, :cond_9

    .line 194
    .line 195
    .line 196
    invoke-virtual {v6, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 197
    .line 198
    :cond_9
    sget-object v4, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 199
    .line 200
    .line 201
    invoke-virtual {v4, v3}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    move-result-object v7

    .line 203
    .line 204
    .line 205
    invoke-static {v7, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 206
    move-result v7

    .line 207
    .line 208
    if-nez v7, :cond_0

    .line 209
    .line 210
    .line 211
    invoke-virtual {v4, v3, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 212
    :goto_8
    move v8, v5

    .line 213
    .line 214
    goto/16 :goto_0

    .line 215
    .line 216
    :cond_a
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    move-result-object v2

    .line 221
    .line 222
    if-eqz v2, :cond_0

    .line 223
    .line 224
    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 225
    .line 226
    .line 227
    invoke-virtual {v2, v3}, Ljava/util/concurrent/ConcurrentSkipListSet;->remove(Ljava/lang/Object;)Z

    .line 228
    goto :goto_8

    .line 229
    .line 230
    .line 231
    :cond_b
    invoke-virtual {v1}, Ljava/util/ArrayList;->isEmpty()Z

    .line 232
    move-result p0

    .line 233
    .line 234
    if-nez p0, :cond_c

    .line 235
    .line 236
    sget-object p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->e:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 237
    .line 238
    .line 239
    invoke-virtual {p0, v1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 240
    .line 241
    .line 242
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 243
    move-result-object v0

    .line 244
    .line 245
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->HIDE:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;

    .line 246
    .line 247
    .line 248
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->getValue()J

    .line 249
    move-result-wide v2

    .line 250
    .line 251
    new-instance v5, Lio/trtc/tuikit/atomicxcore/impl/conversation/H;

    .line 252
    .line 253
    .line 254
    invoke-direct {v5, v1}, Lio/trtc/tuikit/atomicxcore/impl/conversation/H;-><init>(Ljava/util/ArrayList;)V

    .line 255
    const/4 v4, 0x0

    .line 256
    .line 257
    .line 258
    invoke-virtual/range {v0 .. v5}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->markConversation(Ljava/util/List;JZLcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 259
    .line 260
    .line 261
    :cond_c
    invoke-virtual {v6}, Ljava/util/ArrayList;->isEmpty()Z

    .line 262
    move-result p0

    .line 263
    .line 264
    if-nez p0, :cond_d

    .line 265
    .line 266
    sget-object p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->f:Ljava/util/concurrent/ConcurrentSkipListSet;

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0, v6}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    .line 270
    .line 271
    .line 272
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    .line 273
    move-result-object v2

    .line 274
    .line 275
    sget-object p0, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->UNREAD:Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;

    .line 276
    .line 277
    .line 278
    invoke-virtual {p0}, Lio/trtc/tuikit/atomicxcore/api/conversation/ConversationMarkType;->getValue()J

    .line 279
    move-result-wide v4

    .line 280
    .line 281
    new-instance v7, Lio/trtc/tuikit/atomicxcore/impl/conversation/I;

    .line 282
    .line 283
    .line 284
    invoke-direct {v7, v6}, Lio/trtc/tuikit/atomicxcore/impl/conversation/I;-><init>(Ljava/util/ArrayList;)V

    .line 285
    move-object v3, v6

    .line 286
    const/4 v6, 0x0

    .line 287
    .line 288
    .line 289
    invoke-virtual/range {v2 .. v7}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->markConversation(Ljava/util/List;JZLcom/tencent/imsdk/v2/V2TIMValueCallback;)V

    .line 290
    .line 291
    :cond_d
    if-eqz v8, :cond_e

    .line 292
    .line 293
    sget-object p0, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->i:Lkotlinx/coroutines/flow/m;

    .line 294
    .line 295
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 296
    .line 297
    .line 298
    invoke-interface {p0, v0}, Lkotlinx/coroutines/flow/m;->d(Ljava/lang/Object;)Z

    .line 299
    :cond_e
    return-void
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
.end method


# virtual methods
.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lio/trtc/tuikit/atomicxcore/impl/conversation/G;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/G;

    iget v1, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/G;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/G;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/G;

    invoke-direct {v0, p0, p1}, Lio/trtc/tuikit/atomicxcore/impl/conversation/G;-><init>(Lio/trtc/tuikit/atomicxcore/impl/conversation/P;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/G;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 26
    iget v2, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/G;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/G;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/P;

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    sget-boolean p1, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->h:Z

    if-eqz p1, :cond_3

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 28
    :cond_3
    invoke-static {}, Lcom/tencent/imsdk/v2/V2TIMManager;->getConversationManager()Lcom/tencent/imsdk/v2/V2TIMConversationManager;

    move-result-object p1

    sget-object v2, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->k:Lio/trtc/tuikit/atomicxcore/impl/conversation/F;

    invoke-virtual {p1, v2}, Lcom/tencent/imsdk/v2/V2TIMConversationManager;->addConversationListener(Lcom/tencent/imsdk/v2/V2TIMConversationListener;)V

    .line 29
    iput-object p0, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/G;->a:Lio/trtc/tuikit/atomicxcore/impl/conversation/P;

    iput v3, v0, Lio/trtc/tuikit/atomicxcore/impl/conversation/G;->d:I

    .line 30
    new-instance p1, Lio/trtc/tuikit/atomicxcore/impl/conversation/O;

    const/4 v2, 0x0

    invoke-direct {p1, v2}, Lio/trtc/tuikit/atomicxcore/impl/conversation/O;-><init>(Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v0}, Lkotlinx/coroutines/n0;->f(Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v0, p0

    .line 31
    :goto_1
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 32
    sget-object p1, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->g:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_5

    goto :goto_2

    .line 33
    :cond_5
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->values()Ljava/util/Collection;

    move-result-object v0

    const-string v1, "<get-values>(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v0

    .line 34
    invoke-static {v0}, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->b(Ljava/util/List;)V

    .line 35
    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentHashMap;->clear()V

    .line 36
    :goto_2
    sput-boolean v3, Lio/trtc/tuikit/atomicxcore/impl/conversation/P;->h:Z

    .line 37
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method
