.class public final Lcom/sumsub/sentry/s0;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/sumsub/sentry/t0;

.field public final synthetic c:Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;


# direct methods
.method public constructor <init>(Lcom/sumsub/sentry/t0;Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sentry/s0;->b:Lcom/sumsub/sentry/t0;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sentry/s0;->c:Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;

    .line 5
    const/4 p1, 0x2

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1, p3}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

    .line 9
    return-void
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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 2

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sentry/s0;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sentry/s0;->b:Lcom/sumsub/sentry/t0;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/sumsub/sentry/s0;->c:Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, v0, v1, p2}, Lcom/sumsub/sentry/s0;-><init>(Lcom/sumsub/sentry/t0;Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;Lkotlin/coroutines/Continuation;)V

    .line 10
    return-object p1
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
    new-instance p1, Lcom/sumsub/sentry/s0;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sentry/s0;->b:Lcom/sumsub/sentry/t0;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/sumsub/sentry/s0;->c:Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, v0, v1, p2}, Lcom/sumsub/sentry/s0;-><init>(Lcom/sumsub/sentry/t0;Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lcom/sumsub/sentry/s0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
.end method

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sentry/s0;->a:I

    .line 7
    const/4 v2, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_1

    .line 10
    .line 11
    if-ne v1, v2, :cond_0

    .line 12
    .line 13
    .line 14
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    goto :goto_1

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 20
    .line 21
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 22
    .line 23
    .line 24
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 25
    throw p1

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 29
    .line 30
    :try_start_1
    iget-object p1, p0, Lcom/sumsub/sentry/s0;->b:Lcom/sumsub/sentry/t0;

    .line 31
    .line 32
    iget-object p1, p1, Lcom/sumsub/sentry/t0;->a:Lcom/sumsub/sentry/c0;

    .line 33
    .line 34
    iget-object v1, p0, Lcom/sumsub/sentry/s0;->c:Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1, v1}, Lcom/sumsub/sentry/c0;->a(Lcom/sumsub/sns/internal/core/exception/SNSCallbacksLostOnRestoreException;)Lcom/sumsub/sentry/b0;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    if-nez p1, :cond_2

    .line 41
    .line 42
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 43
    return-object p1

    .line 44
    .line 45
    :cond_2
    iget-object v1, p0, Lcom/sumsub/sentry/s0;->b:Lcom/sumsub/sentry/t0;

    .line 46
    .line 47
    iget-object v1, v1, Lcom/sumsub/sentry/t0;->b:Lcom/sumsub/sns/internal/log/cacher/c;

    .line 48
    .line 49
    iput v2, p0, Lcom/sumsub/sentry/s0;->a:I

    .line 50
    .line 51
    .line 52
    invoke-interface {v1, p1, p0}, Lcom/sumsub/sns/internal/log/cacher/c;->send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 53
    move-result-object p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 54
    .line 55
    if-ne p1, v0, :cond_3

    .line 56
    return-object v0

    .line 57
    .line 58
    :goto_0
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->c:Lcom/sumsub/sns/internal/log/logger/k;

    .line 59
    .line 60
    const-string v1, "SentryHandledEventReporter"

    .line 61
    .line 62
    const-string v2, "captureException failed"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1, v2, p1}, Lcom/sumsub/sns/internal/log/logger/k;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 66
    .line 67
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 68
    return-object p1
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
.end method
