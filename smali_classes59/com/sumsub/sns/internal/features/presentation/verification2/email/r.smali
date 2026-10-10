.class public final Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public a:I

.field public synthetic b:Lkotlinx/coroutines/flow/f;

.field public synthetic c:Ljava/lang/Object;

.field public final synthetic d:Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;->d:Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;

    .line 3
    const/4 p1, 0x3

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
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    check-cast p3, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;->d:Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p3}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;->b:Lkotlinx/coroutines/flow/f;

    .line 14
    .line 15
    iput-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;->c:Ljava/lang/Object;

    .line 16
    .line 17
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 21
    move-result-object p1

    .line 22
    return-object p1
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

.method public final invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;->a:I

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 15
    goto :goto_1

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
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 27
    .line 28
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;->b:Lkotlinx/coroutines/flow/f;

    .line 29
    .line 30
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;->c:Ljava/lang/Object;

    .line 31
    .line 32
    check-cast v1, Ljava/lang/String;

    .line 33
    .line 34
    if-eqz v1, :cond_2

    .line 35
    .line 36
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;->d:Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;

    .line 37
    .line 38
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/email/h;

    .line 39
    .line 40
    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    .line 41
    .line 42
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->h:Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;

    .line 43
    .line 44
    iget-object v3, v3, Lcom/sumsub/sns/internal/features/presentation/verification2/host/k;->b:Lkotlinx/coroutines/flow/w;

    .line 45
    .line 46
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/verification2/host/j;

    .line 47
    .line 48
    .line 49
    invoke-direct {v4, v3, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/j;-><init>(Lkotlinx/coroutines/flow/e;Ljava/lang/String;)V

    .line 50
    goto :goto_0

    .line 51
    :cond_2
    const/4 v1, 0x0

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Lkotlinx/coroutines/flow/g;->M(Ljava/lang/Object;)Lkotlinx/coroutines/flow/e;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    :goto_0
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/r;->a:I

    .line 58
    .line 59
    .line 60
    invoke-static {p1, v4, p0}, Lkotlinx/coroutines/flow/g;->B(Lkotlinx/coroutines/flow/f;Lkotlinx/coroutines/flow/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 61
    move-result-object p1

    .line 62
    .line 63
    if-ne p1, v0, :cond_3

    .line 64
    return-object v0

    .line 65
    .line 66
    :cond_3
    :goto_1
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 67
    return-object p1
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
