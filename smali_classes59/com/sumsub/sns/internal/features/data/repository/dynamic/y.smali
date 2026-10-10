.class public final Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function1;


# instance fields
.field public a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

.field public b:I

.field public final synthetic c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

.field public final synthetic d:Z


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;ZLkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 3
    .line 4
    iput-boolean p2, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->d:Z

    .line 5
    const/4 p1, 0x1

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
.method public final create(Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 5
    .line 6
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->d:Z

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1, v2, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;ZLkotlin/coroutines/Continuation;)V

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
.end method

.method public final invoke(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    check-cast p1, Lkotlin/coroutines/Continuation;

    .line 3
    .line 4
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;

    .line 5
    .line 6
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 7
    .line 8
    iget-boolean v2, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->d:Z

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, v2, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;ZLkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->b:I

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
    .line 16
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 17
    .line 18
    .line 19
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    return-object v0

    .line 21
    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 23
    .line 24
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 28
    throw p1

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    .line 37
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 38
    .line 39
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->k:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 40
    .line 41
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->d:Z

    .line 42
    .line 43
    iput v3, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->b:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, v1, p0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    if-ne p1, v0, :cond_3

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_3
    :goto_0
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 53
    .line 54
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->d:Z

    .line 55
    .line 56
    if-eqz v1, :cond_4

    .line 57
    .line 58
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 59
    .line 60
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->l:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 61
    .line 62
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->a:Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    .line 63
    .line 64
    iput v2, p0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/y;->b:I

    .line 65
    .line 66
    .line 67
    invoke-virtual {v1, v3, p0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    if-ne v1, v0, :cond_4

    .line 71
    :goto_1
    return-object v0

    .line 72
    :cond_4
    return-object p1
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
