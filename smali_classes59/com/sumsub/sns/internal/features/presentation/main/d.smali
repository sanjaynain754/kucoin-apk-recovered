.class public final Lcom/sumsub/sns/internal/features/presentation/main/d;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/screen/base/b;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/presentation/main/i2;

.field public final b:Ljava/util/concurrent/ConcurrentHashMap;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/main/i2;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/d;->a:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 6
    .line 7
    new-instance p1, Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    .line 10
    invoke-direct {p1}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 11
    .line 12
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/d;->b:Ljava/util/concurrent/ConcurrentHashMap;

    .line 13
    return-void
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


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/core/presentation/screen/base/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/main/c;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/c;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/c;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/main/c;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/main/c;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/main/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/d;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/c;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 47
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/main/c;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/main/c;->a:Ljava/lang/String;

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_2

    :catchall_0
    move-exception p2

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 48
    invoke-static {}, Ljava/util/UUID;->randomUUID()Ljava/util/UUID;

    move-result-object p2

    invoke-virtual {p2}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object p2

    const/4 v2, 0x0

    .line 49
    invoke-static {v2, v3, v2}, Lkotlinx/coroutines/y;->c(Lkotlinx/coroutines/x1;ILjava/lang/Object;)Lkotlinx/coroutines/w;

    move-result-object v2

    .line 50
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/main/d;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v4, p2, v2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 51
    :try_start_1
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/presentation/main/d;->a:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 52
    iget-object v5, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/c;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 53
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/c;->b:Ljava/lang/String;

    if-nez p1, :cond_3

    .line 54
    const-string p1, "TYPE_UNKNOWN"

    goto :goto_1

    :catchall_1
    move-exception p1

    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    goto :goto_3

    :cond_3
    :goto_1
    const/4 v6, 0x0

    .line 55
    invoke-virtual {v4, v5, p1, v6, p2}, Lcom/sumsub/sns/core/presentation/base/C;->throwError(Lcom/sumsub/sns/internal/features/data/model/common/l0;Ljava/lang/String;ZLjava/lang/String;)V

    .line 56
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/main/c;->a:Ljava/lang/String;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/main/c;->d:I

    invoke-interface {v2, v0}, Lkotlinx/coroutines/r0;->h(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    if-ne p1, v1, :cond_4

    return-object v1

    :cond_4
    move-object v7, p2

    move-object p2, p1

    move-object p1, v7

    .line 57
    :goto_2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/d;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :goto_3
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/d;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    throw p2
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/screen/base/a;)V
    .locals 5

    .line 1
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/a;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 2
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/a;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/ErrorClosure$Outcome;

    .line 3
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/a;->b:Lcom/sumsub/sns/internal/core/common/w;

    .line 4
    instance-of v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/i0;

    if-nez v3, :cond_4

    .line 5
    instance-of v3, v0, Lcom/sumsub/sns/internal/features/data/model/common/g0;

    if-eqz v3, :cond_0

    goto :goto_0

    .line 6
    :cond_0
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    if-eqz v1, :cond_2

    .line 7
    sget-object v1, Lcom/sumsub/sns/internal/core/common/u;->b:Lcom/sumsub/sns/internal/core/common/u;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 8
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/error/a;

    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/error/a;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    goto :goto_1

    .line 9
    :cond_1
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/error/c;

    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/error/c;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    goto :goto_1

    .line 10
    :cond_2
    instance-of v1, v0, Lcom/sumsub/sns/internal/features/data/model/common/k0;

    if-eqz v1, :cond_3

    .line 11
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/error/c;

    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/error/c;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    goto :goto_1

    .line 12
    :cond_3
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 13
    :cond_4
    :goto_0
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/screen/base/ErrorClosure$Outcome;->CANCELLED:Lcom/sumsub/sns/internal/core/presentation/screen/base/ErrorClosure$Outcome;

    if-ne v1, v3, :cond_5

    .line 14
    sget-object v1, Lcom/sumsub/sns/internal/core/common/u;->b:Lcom/sumsub/sns/internal/core/common/u;

    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 15
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/error/b;

    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/error/b;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    goto :goto_1

    .line 16
    :cond_5
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/error/a;

    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/error/a;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 17
    :goto_1
    invoke-interface {v1}, Lcom/sumsub/sns/internal/features/presentation/error/d;->getError()Lcom/sumsub/sns/internal/features/data/model/common/l0;

    move-result-object v0

    .line 18
    instance-of v2, v0, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    const/4 v3, 0x0

    if-eqz v2, :cond_6

    .line 19
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/a;->b:Lcom/sumsub/sns/internal/core/common/w;

    .line 20
    sget-object v4, Lcom/sumsub/sns/internal/core/common/u;->b:Lcom/sumsub/sns/internal/core/common/u;

    invoke-static {v2, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    .line 21
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "Fatal error \u2014 terminating SDK: "

    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 22
    sget-object v1, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 23
    iget-object v1, v1, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 24
    const-string v2, "ErrorControllerImpl"

    invoke-virtual {v1, v2, p1, v3}, Lcom/sumsub/sns/internal/log/logger/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 25
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/d;->a:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    new-instance v1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$AbnormalTermination;

    check-cast v0, Lcom/sumsub/sns/internal/features/data/model/common/e0;

    .line 26
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/data/model/common/e0;->a:Ljava/lang/Throwable;

    .line 27
    invoke-direct {v1, v0}, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$AbnormalTermination;-><init>(Ljava/lang/Throwable;)V

    const/4 v0, 0x0

    .line 28
    invoke-virtual {p1, v1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/i2;->a(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;Z)V

    return-void

    .line 29
    :cond_6
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/a;->d:Ljava/lang/String;

    if-eqz p1, :cond_8

    .line 30
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/main/d;->b:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lkotlinx/coroutines/w;

    if-eqz p1, :cond_7

    .line 31
    invoke-interface {p1, v1}, Lkotlinx/coroutines/w;->n(Ljava/lang/Object;)Z

    .line 32
    :cond_7
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/main/k;

    invoke-direct {p1, v3}, Lcom/sumsub/sns/internal/features/presentation/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/j;)V

    move-object v3, p1

    goto :goto_2

    .line 33
    :cond_8
    instance-of p1, v1, Lcom/sumsub/sns/internal/features/presentation/error/b;

    if-eqz p1, :cond_9

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/main/k;

    .line 34
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/main/i;

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/error/b;

    .line 35
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/error/b;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 36
    invoke-direct {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/i;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 37
    invoke-direct {v3, p1}, Lcom/sumsub/sns/internal/features/presentation/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/j;)V

    goto :goto_2

    .line 38
    :cond_9
    instance-of p1, v1, Lcom/sumsub/sns/internal/features/presentation/error/a;

    if-eqz p1, :cond_a

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/main/k;

    .line 39
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/main/h;

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/error/a;

    .line 40
    iget-object v0, v1, Lcom/sumsub/sns/internal/features/presentation/error/a;->a:Lcom/sumsub/sns/internal/features/data/model/common/l0;

    .line 41
    invoke-direct {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/h;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/l0;)V

    .line 42
    invoke-direct {v3, p1}, Lcom/sumsub/sns/internal/features/presentation/main/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/main/j;)V

    goto :goto_2

    .line 43
    :cond_a
    instance-of p1, v1, Lcom/sumsub/sns/internal/features/presentation/error/c;

    if-eqz p1, :cond_c

    :goto_2
    if-eqz v3, :cond_b

    .line 44
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/main/d;->a:Lcom/sumsub/sns/internal/features/presentation/main/i2;

    .line 45
    invoke-virtual {p1, v3}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    :cond_b
    return-void

    .line 46
    :cond_c
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
