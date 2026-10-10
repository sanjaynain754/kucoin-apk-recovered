.class public final Lcom/sumsub/sns/internal/core/common/O;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:I

.field public final synthetic b:Lkotlin/jvm/functions/Function2;

.field public final synthetic c:Lkotlinx/coroutines/flow/e;


# direct methods
.method public constructor <init>(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/flow/e;)V
    .locals 0

    .line 1
    .line 2
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/common/O;->b:Lkotlin/jvm/functions/Function2;

    .line 3
    .line 4
    iput-object p3, p0, Lcom/sumsub/sns/internal/core/common/O;->c:Lkotlinx/coroutines/flow/e;

    .line 5
    const/4 p2, 0x2

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p2, p1}, Lkotlin/coroutines/jvm/internal/SuspendLambda;-><init>(ILkotlin/coroutines/Continuation;)V

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
    new-instance p1, Lcom/sumsub/sns/internal/core/common/O;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/O;->b:Lkotlin/jvm/functions/Function2;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/common/O;->c:Lkotlinx/coroutines/flow/e;

    .line 7
    .line 8
    .line 9
    invoke-direct {p1, p2, v0, v1}, Lcom/sumsub/sns/internal/core/common/O;-><init>(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/flow/e;)V

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
    new-instance p1, Lcom/sumsub/sns/internal/core/common/O;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/common/O;->b:Lkotlin/jvm/functions/Function2;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/common/O;->c:Lkotlinx/coroutines/flow/e;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, p2, v0, v1}, Lcom/sumsub/sns/internal/core/common/O;-><init>(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/flow/e;)V

    .line 14
    .line 15
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/core/common/O;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/core/common/O;->a:I

    .line 7
    const/4 v2, 0x2

    .line 8
    const/4 v3, 0x1

    .line 9
    .line 10
    if-eqz v1, :cond_2

    .line 11
    .line 12
    if-eq v1, v3, :cond_1

    .line 13
    .line 14
    if-ne v1, v2, :cond_0

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 18
    .line 19
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 20
    .line 21
    .line 22
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 23
    throw p1

    .line 24
    .line 25
    .line 26
    :cond_1
    :goto_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    goto :goto_2

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 31
    .line 32
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/common/O;->b:Lkotlin/jvm/functions/Function2;

    .line 33
    .line 34
    if-nez p1, :cond_3

    .line 35
    .line 36
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/common/O;->c:Lkotlinx/coroutines/flow/e;

    .line 37
    .line 38
    iput v3, p0, Lcom/sumsub/sns/internal/core/common/O;->a:I

    .line 39
    .line 40
    .line 41
    invoke-static {p1, p0}, Lkotlinx/coroutines/flow/g;->k(Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    if-ne p1, v0, :cond_4

    .line 45
    goto :goto_1

    .line 46
    .line 47
    :cond_3
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/common/O;->c:Lkotlinx/coroutines/flow/e;

    .line 48
    .line 49
    new-instance v3, Lcom/sumsub/sns/internal/core/common/T;

    .line 50
    .line 51
    .line 52
    invoke-direct {v3, p1}, Lcom/sumsub/sns/internal/core/common/T;-><init>(Lkotlin/jvm/functions/Function2;)V

    .line 53
    .line 54
    iput v2, p0, Lcom/sumsub/sns/internal/core/common/O;->a:I

    .line 55
    .line 56
    .line 57
    invoke-interface {v1, v3, p0}, Lkotlinx/coroutines/flow/e;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    if-ne p1, v0, :cond_4

    .line 61
    :goto_1
    return-object v0

    .line 62
    .line 63
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 64
    return-object p1
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
.end method
