.class public final Ljumio/core/v;
.super Lcom/jumio/core/cdn/CDNDownloadListener;
.source "SourceFile"


# instance fields
.field public final synthetic a:Lcom/jumio/core/cdn/CDNCache;

.field public final synthetic b:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/jumio/core/cdn/CDNCache;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ljumio/core/v;->a:Lcom/jumio/core/cdn/CDNCache;

    .line 3
    .line 4
    iput-object p2, p0, Ljumio/core/v;->b:Ljava/lang/String;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Lcom/jumio/core/cdn/CDNDownloadListener;-><init>()V

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
.method public final onProgressDone(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Ljumio/core/u;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Ljumio/core/u;

    iget v1, v0, Ljumio/core/u;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Ljumio/core/u;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Ljumio/core/u;

    invoke-direct {v0, p0, p2}, Ljumio/core/u;-><init>(Ljumio/core/v;Lkotlin/coroutines/Continuation;)V

    :goto_0
    iget-object p2, v0, Ljumio/core/u;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 2
    iget v2, v0, Ljumio/core/u;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Ljumio/core/u;->a:Ljava/lang/Object;

    check-cast p1, Ljava/lang/Boolean;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 3
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    iput-object p2, v0, Ljumio/core/u;->a:Ljava/lang/Object;

    iput v3, v0, Ljumio/core/u;->d:I

    invoke-super {p0, p1, v0}, Lcom/jumio/core/cdn/CDNDownloadListener;->onProgressDone(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 4
    :cond_3
    :goto_1
    iget-object p1, p0, Ljumio/core/v;->a:Lcom/jumio/core/cdn/CDNCache;

    invoke-static {p1}, Lcom/jumio/core/cdn/CDNCache;->access$getLoadingLock$p(Lcom/jumio/core/cdn/CDNCache;)Ljava/lang/Object;

    move-result-object p1

    iget-object p2, p0, Ljumio/core/v;->a:Lcom/jumio/core/cdn/CDNCache;

    iget-object v0, p0, Ljumio/core/v;->b:Ljava/lang/String;

    monitor-enter p1

    .line 5
    :try_start_0
    invoke-static {p2}, Lcom/jumio/core/cdn/CDNCache;->access$getEntriesInProgress$p(Lcom/jumio/core/cdn/CDNCache;)Ljava/util/concurrent/ConcurrentHashMap;

    move-result-object p2

    invoke-virtual {p2, v0}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lcom/jumio/core/cdn/CDNDownload;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    monitor-exit p1

    .line 7
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :catchall_0
    move-exception p2

    .line 8
    monitor-exit p1

    throw p2
.end method

.method public final bridge synthetic onProgressDone(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p0, p1, p2}, Ljumio/core/v;->onProgressDone(Ljava/lang/Boolean;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method
