.class public final Ljumio/core/i1;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "SourceFile"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public final synthetic b:Lcom/jumio/core/extraction/ExtractionClient;


# direct methods
.method public constructor <init>(Lcom/jumio/core/extraction/ExtractionClient;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Ljumio/core/i1;->b:Lcom/jumio/core/extraction/ExtractionClient;

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
    new-instance p1, Ljumio/core/i1;

    .line 3
    .line 4
    iget-object v0, p0, Ljumio/core/i1;->b:Lcom/jumio/core/extraction/ExtractionClient;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Ljumio/core/i1;-><init>(Lcom/jumio/core/extraction/ExtractionClient;Lkotlin/coroutines/Continuation;)V

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
    new-instance p1, Ljumio/core/i1;

    .line 7
    .line 8
    iget-object v0, p0, Ljumio/core/i1;->b:Lcom/jumio/core/extraction/ExtractionClient;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Ljumio/core/i1;-><init>(Lcom/jumio/core/extraction/ExtractionClient;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Ljumio/core/i1;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Ljumio/core/i1;->a:I

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
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    goto :goto_1

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
    iget-object p1, p0, Ljumio/core/i1;->b:Lcom/jumio/core/extraction/ExtractionClient;

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Lcom/jumio/core/extraction/ExtractionClient;->access$getExtractionSemaphore$p(Lcom/jumio/core/extraction/ExtractionClient;)Lrg0/g;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    iput v2, p0, Ljumio/core/i1;->a:I

    .line 37
    .line 38
    .line 39
    invoke-interface {p1, p0}, Lrg0/g;->c(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    if-ne p1, v0, :cond_2

    .line 43
    return-object v0

    .line 44
    .line 45
    :cond_2
    :goto_0
    iget-object p1, p0, Ljumio/core/i1;->b:Lcom/jumio/core/extraction/ExtractionClient;

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lcom/jumio/core/extraction/ExtractionClient;->access$getExtractionSemaphore$p(Lcom/jumio/core/extraction/ExtractionClient;)Lrg0/g;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    iget-object v0, p0, Ljumio/core/i1;->b:Lcom/jumio/core/extraction/ExtractionClient;

    .line 52
    monitor-enter p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 53
    .line 54
    .line 55
    :try_start_2
    invoke-static {v0}, Lcom/jumio/core/extraction/ExtractionClient;->access$getFrame$p(Lcom/jumio/core/extraction/ExtractionClient;)Lcom/jumio/commons/camera/Frame;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionClient;->getCameraSettings()Lcom/jumio/commons/camera/CameraSettings;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/jumio/core/extraction/ExtractionClient;->getExtractionArea()Landroid/graphics/Rect;

    .line 64
    move-result-object v3

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1, v2, v3}, Lcom/jumio/core/extraction/ExtractionClient;->process(Lcom/jumio/commons/camera/Frame;Lcom/jumio/commons/camera/CameraSettings;Landroid/graphics/Rect;)V

    .line 68
    .line 69
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 70
    :try_start_3
    monitor-exit p1

    .line 71
    .line 72
    iget-object p1, p0, Ljumio/core/i1;->b:Lcom/jumio/core/extraction/ExtractionClient;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/jumio/core/extraction/ExtractionClient;->getFrameRateObserver()Lcom/jumio/core/performance/FrameRateObserver;

    .line 76
    move-result-object p1

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/jumio/core/performance/FrameRateObserver;->doFrame()V

    .line 82
    return-object v0

    .line 83
    :cond_3
    const/4 p1, 0x0

    .line 84
    return-object p1

    .line 85
    :catchall_1
    move-exception v0

    .line 86
    monitor-exit p1

    .line 87
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 88
    .line 89
    .line 90
    :goto_1
    invoke-static {p1}, Lcom/jumio/commons/log/Log;->printStackTrace(Ljava/lang/Throwable;)V

    .line 91
    .line 92
    iget-object p1, p0, Ljumio/core/i1;->b:Lcom/jumio/core/extraction/ExtractionClient;

    .line 93
    const/4 v0, 0x0

    .line 94
    .line 95
    .line 96
    invoke-virtual {p1, v0}, Lcom/jumio/core/extraction/ExtractionClient;->setResult(Z)V

    .line 97
    .line 98
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 99
    return-object p1
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
