.class public final Lcom/sumsub/sns/internal/features/data/repository/applicant/z;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/features/data/repository/applicant/d;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

.field public final b:Lcom/sumsub/sns/internal/features/data/repository/esign/b;

.field public final c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/a;Lcom/sumsub/sns/internal/features/data/repository/esign/b;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b:Lcom/sumsub/sns/internal/features/data/repository/esign/b;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 10
    return-void
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
.method public final a(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 19
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;->d:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;->a:I

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 20
    iput p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;->a:I

    iput v5, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_5

    :cond_5
    :goto_1
    if-eqz p2, :cond_8

    .line 21
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;->d:I

    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 22
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/b;

    .line 23
    invoke-interface {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/b;->b(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_6

    goto :goto_2

    :cond_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_2
    if-ne p1, v1, :cond_7

    goto :goto_5

    .line 24
    :cond_7
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 25
    :cond_8
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/k;->d:I

    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 26
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->b:Lcom/sumsub/sns/internal/features/data/repository/applicant/b;

    .line 27
    invoke-interface {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/b;->c(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_9

    goto :goto_4

    :cond_9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_4
    if-ne p1, v1, :cond_a

    :goto_5
    return-object v1

    .line 28
    :cond_a
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 10
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;->d:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;->a:Lcom/sumsub/sns/internal/features/data/model/common/W2;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 11
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;->a:Lcom/sumsub/sns/internal/features/data/model/common/W2;

    iput v5, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_5

    :cond_5
    :goto_1
    check-cast p2, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz p2, :cond_8

    .line 12
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;->a:Lcom/sumsub/sns/internal/features/data/model/common/W2;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;->d:I

    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 13
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 14
    invoke-interface {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->b(Lcom/sumsub/sns/internal/features/data/model/common/W2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_6

    goto :goto_2

    :cond_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_2
    if-ne p1, v1, :cond_7

    goto :goto_5

    .line 15
    :cond_7
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_8
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;->a:Lcom/sumsub/sns/internal/features/data/model/common/W2;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/v;->d:I

    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 16
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 17
    invoke-interface {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Lcom/sumsub/sns/internal/features/data/model/common/W2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_9

    goto :goto_4

    :cond_9
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    :goto_4
    if-ne p1, v1, :cond_a

    :goto_5
    return-object v1

    .line 18
    :cond_a
    :goto_6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/remote/Y3;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 7

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 75
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;->d:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_4

    :catch_0
    move-exception p1

    goto/16 :goto_7

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_2

    :cond_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y3;

    :try_start_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    :try_start_3
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y3;

    iput v6, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_3

    :cond_5
    :goto_1
    if-eqz p2, :cond_7

    .line 77
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y3;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;->d:I

    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 78
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 79
    invoke-interface {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Lcom/sumsub/sns/internal/features/data/model/common/remote/Y3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_3

    .line 80
    :cond_6
    :goto_2
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/I;

    goto :goto_5

    .line 81
    :cond_7
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v5, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/Y3;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/w;->d:I

    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 82
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 83
    invoke-interface {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->b(Lcom/sumsub/sns/internal/features/data/model/common/remote/Y3;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_8

    :goto_3
    return-object v1

    .line 84
    :cond_8
    :goto_4
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/I;

    .line 85
    :goto_5
    iget-object p1, p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/I;->a:Ljava/lang/Integer;

    if-nez p1, :cond_9

    goto :goto_6

    .line 86
    :cond_9
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p1, v6, :cond_a

    .line 87
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1

    .line 88
    :cond_a
    :goto_6
    sget-object p1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    new-instance p1, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;

    invoke-direct {p1, v5, v6, v5}, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;-><init>(Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    return-object p1

    .line 89
    :goto_7
    invoke-virtual {v0}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;->getContext()Lkotlin/coroutines/CoroutineContext;

    move-result-object p2

    .line 90
    invoke-static {p2}, Lkotlinx/coroutines/z1;->l(Lkotlin/coroutines/CoroutineContext;)V

    .line 91
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/common/remote/o1;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 35
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/o1;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p2

    :cond_4
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/o1;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 36
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/o1;

    iput v7, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_8

    .line 37
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/o1;

    iput v6, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->d:I

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 38
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 39
    invoke-interface {v2, p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/o1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    return-object p1

    .line 40
    :cond_8
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/o1;

    iput v5, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    goto :goto_3

    :cond_9
    :goto_2
    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_b

    .line 41
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->a:Lcom/sumsub/sns/internal/features/data/model/common/remote/o1;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/q;->d:I

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 42
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 43
    invoke-interface {v2, p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->b(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/remote/o1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_a

    :goto_3
    return-object v1

    .line 44
    :cond_a
    :goto_4
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;

    if-eqz p2, :cond_b

    return-object p2

    .line 45
    :cond_b
    new-instance p1, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Applicant id missing"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/esign/E;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 63
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;->a:Lcom/sumsub/sns/internal/features/data/model/esign/E;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 64
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;->a:Lcom/sumsub/sns/internal/features/data/model/esign/E;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz p2, :cond_6

    .line 65
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b:Lcom/sumsub/sns/internal/features/data/repository/esign/b;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;->a:Lcom/sumsub/sns/internal/features/data/model/esign/E;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/j;->d:I

    .line 66
    iget-object v2, v4, Lcom/sumsub/sns/internal/features/data/repository/esign/b;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 67
    invoke-interface {v2, p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/esign/E;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    .line 68
    :cond_5
    :goto_3
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    return-object p2

    :cond_6
    return-object v2
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/esign/H;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 57
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;->a:Lcom/sumsub/sns/internal/features/data/model/esign/H;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 58
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;->a:Lcom/sumsub/sns/internal/features/data/model/esign/H;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz p2, :cond_6

    .line 59
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b:Lcom/sumsub/sns/internal/features/data/repository/esign/b;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;->a:Lcom/sumsub/sns/internal/features/data/model/esign/H;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/r;->d:I

    .line 60
    iget-object v2, v4, Lcom/sumsub/sns/internal/features/data/repository/esign/b;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 61
    invoke-interface {v2, p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/esign/H;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    .line 62
    :cond_5
    :goto_3
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    return-object p2

    :cond_6
    return-object v2
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/esign/N;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 69
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;->a:Lcom/sumsub/sns/internal/features/data/model/esign/N;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 70
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;->a:Lcom/sumsub/sns/internal/features/data/model/esign/N;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz p2, :cond_6

    .line 71
    iget-object v4, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b:Lcom/sumsub/sns/internal/features/data/repository/esign/b;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;->a:Lcom/sumsub/sns/internal/features/data/model/esign/N;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/p;->d:I

    .line 72
    iget-object v2, v4, Lcom/sumsub/sns/internal/features/data/repository/esign/b;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 73
    invoke-interface {v2, p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/esign/N;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    .line 74
    :cond_5
    :goto_3
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    return-object p2

    :cond_6
    return-object v2
.end method

.method public final a(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/Map;Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/utils/a;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 16

    move-object/from16 v0, p0

    move-object/from16 v1, p8

    instance-of v2, v1, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;

    iget v3, v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->j:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->j:I

    :goto_0
    move-object v11, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;

    invoke-direct {v2, v0, v1}, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    goto :goto_0

    :goto_1
    iget-object v1, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->h:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v2

    .line 29
    iget v3, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->j:I

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eqz v3, :cond_5

    if-eq v3, v7, :cond_4

    if-eq v3, v6, :cond_3

    if-eq v3, v5, :cond_2

    if-ne v3, v4, :cond_1

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_5

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->g:Lcom/sumsub/sns/internal/features/data/utils/a;

    iget-object v5, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->f:Lcom/sumsub/sns/internal/features/data/model/common/X;

    iget-object v6, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->e:Ljava/util/Map;

    iget-object v7, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->d:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    iget-object v9, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->c:Ljava/lang/String;

    iget-object v10, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->b:Ljava/io/File;

    iget-object v12, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->a:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v14, v12

    move-object v12, v9

    move-object v9, v5

    move-object v5, v10

    move-object v10, v3

    goto/16 :goto_3

    :cond_3
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object v1

    :cond_4
    iget-object v3, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->g:Lcom/sumsub/sns/internal/features/data/utils/a;

    iget-object v7, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->f:Lcom/sumsub/sns/internal/features/data/model/common/X;

    iget-object v9, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->e:Ljava/util/Map;

    iget-object v10, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->d:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    iget-object v12, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->c:Ljava/lang/String;

    iget-object v13, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->b:Ljava/io/File;

    iget-object v14, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->a:Ljava/lang/String;

    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object v15, v10

    move-object v10, v3

    move v3, v5

    move-object v5, v13

    move-object v13, v7

    move-object v7, v15

    move-object v15, v12

    move-object v12, v9

    move-object v9, v15

    goto :goto_2

    :cond_5
    invoke-static {v1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    move-object/from16 v1, p1

    .line 30
    iput-object v1, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->a:Ljava/lang/String;

    move-object/from16 v3, p2

    iput-object v3, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->b:Ljava/io/File;

    move-object/from16 v9, p3

    iput-object v9, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->c:Ljava/lang/String;

    move-object/from16 v10, p4

    iput-object v10, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->d:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    move-object/from16 v12, p5

    iput-object v12, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->e:Ljava/util/Map;

    move-object/from16 v13, p6

    iput-object v13, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->f:Lcom/sumsub/sns/internal/features/data/model/common/X;

    move-object/from16 v14, p7

    iput-object v14, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->g:Lcom/sumsub/sns/internal/features/data/utils/a;

    iput v7, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->j:I

    invoke-virtual {v0, v11}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v2, :cond_6

    goto/16 :goto_4

    :cond_6
    move-object v15, v14

    move-object v14, v1

    move-object v1, v7

    move-object v7, v10

    move-object v10, v15

    move v15, v5

    move-object v5, v3

    move v3, v15

    :goto_2
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_8

    .line 31
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->a:Ljava/lang/String;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->b:Ljava/io/File;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->c:Ljava/lang/String;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->d:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->e:Ljava/util/Map;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->f:Lcom/sumsub/sns/internal/features/data/model/common/X;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->g:Lcom/sumsub/sns/internal/features/data/utils/a;

    iput v6, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->j:I

    move-object v3, v1

    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    move-object v6, v9

    move-object v8, v12

    move-object v9, v13

    move-object v4, v14

    invoke-virtual/range {v3 .. v11}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->b(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/Map;Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/utils/a;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_7

    goto :goto_4

    :cond_7
    return-object v1

    :cond_8
    move-object v6, v12

    move-object v12, v9

    move-object v9, v13

    .line 32
    iput-object v14, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->a:Ljava/lang/String;

    iput-object v5, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->b:Ljava/io/File;

    iput-object v12, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->c:Ljava/lang/String;

    iput-object v7, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->d:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    iput-object v6, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->e:Ljava/util/Map;

    iput-object v9, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->f:Lcom/sumsub/sns/internal/features/data/model/common/X;

    iput-object v10, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->g:Lcom/sumsub/sns/internal/features/data/utils/a;

    iput v3, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->j:I

    invoke-virtual {v0, v11}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    check-cast v1, Ljava/lang/String;

    if-eqz v1, :cond_b

    .line 33
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->a:Ljava/lang/String;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->b:Ljava/io/File;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->c:Ljava/lang/String;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->d:Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->e:Ljava/util/Map;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->f:Lcom/sumsub/sns/internal/features/data/model/common/X;

    iput-object v8, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->g:Lcom/sumsub/sns/internal/features/data/utils/a;

    iput v4, v11, Lcom/sumsub/sns/internal/features/data/repository/applicant/x;->j:I

    move-object v3, v1

    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    move-object v8, v6

    move-object v6, v12

    move-object v4, v14

    invoke-virtual/range {v3 .. v11}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/IdentitySide;Ljava/util/Map;Lcom/sumsub/sns/internal/features/data/model/common/X;Lcom/sumsub/sns/internal/features/data/utils/a;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_a

    :goto_4
    return-object v2

    .line 34
    :cond_a
    :goto_5
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/remote/Y0;

    return-object v1

    :cond_b
    return-object v8
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 9

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->e:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->e:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->c:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 46
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->e:I

    const/4 v3, 0x4

    const/4 v4, 0x3

    const/4 v5, 0x2

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz v2, :cond_5

    if-eq v2, v6, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->b:Ljava/lang/String;

    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->a:Ljava/lang/String;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_3
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p3

    :cond_4
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->b:Ljava/lang/String;

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->a:Ljava/lang/String;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 47
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->a:Ljava/lang/String;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->b:Ljava/lang/String;

    iput v6, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->e:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    goto :goto_3

    :cond_6
    :goto_1
    check-cast p3, Ljava/lang/String;

    if-eqz p3, :cond_8

    .line 48
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->a:Ljava/lang/String;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->b:Ljava/lang/String;

    iput v5, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->e:I

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 49
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 50
    invoke-interface {v2, p3, p1, p2, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_3

    :cond_7
    return-object p1

    .line 51
    :cond_8
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->a:Ljava/lang/String;

    iput-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->b:Ljava/lang/String;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->e:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_9

    goto :goto_3

    :cond_9
    move-object v8, p2

    move-object p2, p1

    move-object p1, v8

    :goto_2
    check-cast p3, Ljava/lang/String;

    if-eqz p3, :cond_b

    .line 52
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->a:Ljava/lang/String;

    iput-object v7, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->b:Ljava/lang/String;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/y;->e:I

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 53
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 54
    invoke-interface {v2, p3, p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_a

    :goto_3
    return-object v1

    .line 55
    :cond_a
    :goto_4
    check-cast p3, Lcom/sumsub/sns/internal/features/data/model/common/remote/response/k0;

    if-eqz p3, :cond_b

    return-object p3

    .line 56
    :cond_b
    new-instance p1, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string p3, "Applicant id missing"

    invoke-direct {p2, p3}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/sumsub/sns/core/data/model/SNSException$Unknown;-><init>(Ljava/lang/Throwable;)V

    throw p1
.end method

.method public final a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;->a:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;->a:Ljava/lang/String;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_5

    .line 3
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    const/4 v4, 0x0

    iput-object v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;->a:Ljava/lang/String;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/s;->d:I

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    invoke-virtual {v2, p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/applicant/s;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    .line 4
    :cond_5
    :goto_3
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 5
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;->d:I

    const/4 v3, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_4

    if-eq v2, v5, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p2

    :cond_3
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;->a:Ljava/util/List;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_4
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 6
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;->a:Ljava/util/List;

    iput v5, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    goto :goto_2

    .line 7
    :cond_5
    :goto_1
    check-cast p2, Ljava/lang/String;

    const/4 v2, 0x0

    if-eqz p2, :cond_7

    .line 8
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;->a:Ljava/util/List;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;->d:I

    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    invoke-virtual {v3, p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a(Ljava/lang/String;Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    goto :goto_2

    :cond_6
    return-object p1

    .line 9
    :cond_7
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;->a:Ljava/util/List;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/o;->d:I

    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    invoke-virtual {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a(Ljava/util/List;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    :goto_2
    return-object v1

    :cond_8
    return-object p1
.end method

.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/e;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/e;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/e;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/e;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/e;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/applicant/e;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/e;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 92
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/e;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 93
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/e;->c:I

    .line 94
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->b(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 95
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/h;

    if-eqz p1, :cond_4

    .line 96
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/h;->x:Lcom/sumsub/sns/internal/features/data/model/common/g;

    if-eqz p1, :cond_4

    .line 97
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/model/common/g;->a:Ljava/lang/String;

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final b(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/l;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/l;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/l;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/l;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/l;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/l;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/l;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 7
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/l;->d:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    return-object p2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/l;->a:I

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 8
    iput p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/l;->a:I

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/l;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_6

    .line 9
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/l;->d:I

    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    invoke-virtual {p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a(ILkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    return-object p1

    .line 10
    :cond_6
    new-instance v2, Lcom/sumsub/sns/core/data/model/SNSGeneralException;

    const/4 v6, 0x6

    const/4 v7, 0x0

    const-string v3, "NOT supported for action"

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v2 .. v7}, Lcom/sumsub/sns/core/data/model/SNSGeneralException;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    throw v2
.end method

.method public final b(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->d:I

    const/4 v3, 0x0

    const/4 v4, 0x4

    const/4 v5, 0x3

    const/4 v6, 0x2

    const/4 v7, 0x1

    if-eqz v2, :cond_5

    if-eq v2, v7, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_5

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->a:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->a:Ljava/lang/String;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->a:Ljava/lang/String;

    iput v7, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_6

    goto :goto_4

    :cond_6
    :goto_1
    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_8

    .line 3
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->a:Ljava/lang/String;

    iput v6, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->d:I

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    invoke-virtual {v2, p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->b(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/applicant/t;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_4

    .line 4
    :cond_7
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    :cond_8
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->a:Ljava/lang/String;

    iput v5, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->d:I

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_9

    goto :goto_4

    :cond_9
    :goto_3
    check-cast p2, Ljava/lang/String;

    if-eqz p2, :cond_a

    .line 5
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    iput-object v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->a:Ljava/lang/String;

    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/t;->d:I

    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    invoke-virtual {v2, p2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/applicant/t;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_a

    :goto_4
    return-object v1

    .line 6
    :cond_a
    :goto_5
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/f;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/f;

    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/f;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/f;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/f;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/applicant/f;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/f;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 11
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/f;->c:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 12
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/f;->c:I

    .line 13
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    const/4 v2, 0x0

    invoke-virtual {p1, v2, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    .line 14
    :cond_3
    :goto_1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/p;

    if-eqz p1, :cond_4

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/p;->e()Ljava/lang/String;

    move-result-object p1

    return-object p1

    :cond_4
    const/4 p1, 0x0

    return-object p1
.end method

.method public final c(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 4

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/g;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/g;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/g;->c:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/g;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/g;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/applicant/g;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/g;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/g;->c:I

    .line 33
    const/4 v3, 0x1

    .line 34
    .line 35
    if-eqz v2, :cond_2

    .line 36
    .line 37
    if-ne v2, v3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 41
    goto :goto_1

    .line 42
    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    .line 48
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 49
    throw p1

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/g;->c:I

    .line 55
    .line 56
    .line 57
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    if-ne p1, v1, :cond_3

    .line 61
    return-object v1

    .line 62
    .line 63
    :cond_3
    :goto_1
    if-eqz p1, :cond_4

    .line 64
    .line 65
    new-instance p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/h;

    .line 66
    .line 67
    .line 68
    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/data/repository/applicant/h;-><init>()V

    .line 69
    return-object p1

    .line 70
    .line 71
    :cond_4
    new-instance p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/i;

    .line 72
    .line 73
    .line 74
    invoke-direct {p1}, Lcom/sumsub/sns/internal/features/data/repository/applicant/i;-><init>()V

    .line 75
    return-object p1
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final d(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/m;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/m;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/m;->c:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/m;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/m;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/applicant/m;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/m;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/m;->c:I

    .line 33
    const/4 v3, 0x3

    .line 34
    const/4 v4, 0x2

    .line 35
    const/4 v5, 0x1

    .line 36
    .line 37
    if-eqz v2, :cond_4

    .line 38
    .line 39
    if-eq v2, v5, :cond_3

    .line 40
    .line 41
    if-eq v2, v4, :cond_2

    .line 42
    .line 43
    if-ne v2, v3, :cond_1

    .line 44
    .line 45
    .line 46
    :try_start_0
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 47
    goto :goto_4

    .line 48
    :catch_0
    move-exception p1

    .line 49
    goto :goto_6

    .line 50
    .line 51
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 52
    .line 53
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 54
    .line 55
    .line 56
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 57
    throw p1

    .line 58
    .line 59
    .line 60
    :cond_2
    :try_start_1
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 61
    goto :goto_2

    .line 62
    .line 63
    .line 64
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 65
    goto :goto_1

    .line 66
    .line 67
    .line 68
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 69
    .line 70
    :try_start_2
    iput v5, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/m;->c:I

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    if-ne p1, v1, :cond_5

    .line 77
    goto :goto_3

    .line 78
    .line 79
    :cond_5
    :goto_1
    if-eqz p1, :cond_7

    .line 80
    .line 81
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 82
    .line 83
    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/m;->c:I

    .line 84
    .line 85
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 86
    .line 87
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 88
    .line 89
    .line 90
    invoke-interface {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    if-ne p1, v1, :cond_6

    .line 94
    goto :goto_3

    .line 95
    .line 96
    :cond_6
    :goto_2
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/y;

    .line 97
    goto :goto_5

    .line 98
    .line 99
    :cond_7
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 100
    .line 101
    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/m;->c:I

    .line 102
    .line 103
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 104
    .line 105
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 106
    .line 107
    .line 108
    invoke-interface {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->f(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    if-ne p1, v1, :cond_8

    .line 112
    :goto_3
    return-object v1

    .line 113
    .line 114
    :cond_8
    :goto_4
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/remote/y;

    .line 115
    .line 116
    .line 117
    :goto_5
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 118
    move-result-object p1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    .line 119
    return-object p1

    .line 120
    .line 121
    .line 122
    :goto_6
    invoke-virtual {v0}, Lkotlin/coroutines/jvm/internal/ContinuationImpl;->getContext()Lkotlin/coroutines/CoroutineContext;

    .line 123
    move-result-object v0

    .line 124
    .line 125
    .line 126
    invoke-static {v0}, Lkotlinx/coroutines/z1;->l(Lkotlin/coroutines/CoroutineContext;)V

    .line 127
    .line 128
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 129
    .line 130
    .line 131
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    .line 135
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 136
    move-result-object p1

    .line 137
    return-object p1
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public final e(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/n;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/n;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/n;->c:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/n;->c:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/n;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/applicant/n;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/n;->a:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/n;->c:I

    .line 33
    const/4 v3, 0x2

    .line 34
    const/4 v4, 0x1

    .line 35
    .line 36
    if-eqz v2, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 44
    goto :goto_3

    .line 45
    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    .line 51
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 52
    throw p1

    .line 53
    .line 54
    .line 55
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 56
    goto :goto_1

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 60
    .line 61
    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/n;->c:I

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    if-ne p1, v1, :cond_4

    .line 68
    goto :goto_2

    .line 69
    .line 70
    :cond_4
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 71
    .line 72
    if-eqz p1, :cond_6

    .line 73
    .line 74
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b:Lcom/sumsub/sns/internal/features/data/repository/esign/b;

    .line 75
    .line 76
    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/n;->c:I

    .line 77
    .line 78
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/repository/esign/b;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/K;

    .line 79
    .line 80
    .line 81
    invoke-interface {v2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/K;->a(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    if-ne p1, v1, :cond_5

    .line 85
    :goto_2
    return-object v1

    .line 86
    .line 87
    :cond_5
    :goto_3
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/esign/Y;

    .line 88
    return-object p1

    .line 89
    :cond_6
    const/4 p1, 0x0

    .line 90
    return-object p1
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
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public final f(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 8

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;

    .line 8
    .line 9
    iget v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;->d:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;->d:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;-><init>(Lcom/sumsub/sns/internal/features/data/repository/applicant/z;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;->b:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;->d:I

    .line 33
    const/4 v3, 0x5

    .line 34
    const/4 v4, 0x4

    .line 35
    const/4 v5, 0x3

    .line 36
    const/4 v6, 0x2

    .line 37
    const/4 v7, 0x1

    .line 38
    .line 39
    if-eqz v2, :cond_6

    .line 40
    .line 41
    if-eq v2, v7, :cond_5

    .line 42
    .line 43
    if-eq v2, v6, :cond_4

    .line 44
    .line 45
    if-eq v2, v5, :cond_3

    .line 46
    .line 47
    if-eq v2, v4, :cond_2

    .line 48
    .line 49
    if-ne v2, v3, :cond_1

    .line 50
    .line 51
    .line 52
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 53
    .line 54
    goto/16 :goto_6

    .line 55
    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p1

    .line 63
    .line 64
    .line 65
    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 66
    goto :goto_4

    .line 67
    .line 68
    :cond_3
    iget-boolean v0, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;->a:Z

    .line 69
    .line 70
    .line 71
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 72
    goto :goto_3

    .line 73
    .line 74
    .line 75
    :cond_4
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 76
    goto :goto_2

    .line 77
    .line 78
    .line 79
    :cond_5
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 80
    goto :goto_1

    .line 81
    .line 82
    .line 83
    :cond_6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 84
    .line 85
    iput v7, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;->d:I

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    if-ne p1, v1, :cond_7

    .line 92
    goto :goto_5

    .line 93
    .line 94
    :cond_7
    :goto_1
    check-cast p1, Ljava/lang/String;

    .line 95
    .line 96
    if-eqz p1, :cond_a

    .line 97
    .line 98
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 99
    .line 100
    iput v6, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;->d:I

    .line 101
    .line 102
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 103
    .line 104
    .line 105
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 106
    move-result-object p1

    .line 107
    .line 108
    if-ne p1, v1, :cond_8

    .line 109
    goto :goto_5

    .line 110
    .line 111
    :cond_8
    :goto_2
    check-cast p1, Ljava/lang/Boolean;

    .line 112
    .line 113
    .line 114
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 115
    move-result p1

    .line 116
    .line 117
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->c:Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 118
    .line 119
    iput-boolean p1, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;->a:Z

    .line 120
    .line 121
    iput v5, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;->d:I

    .line 122
    .line 123
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v7, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(ZLkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 127
    move-result-object v0

    .line 128
    .line 129
    if-ne v0, v1, :cond_9

    .line 130
    goto :goto_5

    .line 131
    :cond_9
    move v0, p1

    .line 132
    .line 133
    .line 134
    :goto_3
    invoke-static {v0}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 135
    move-result-object p1

    .line 136
    return-object p1

    .line 137
    .line 138
    :cond_a
    iput v4, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;->d:I

    .line 139
    .line 140
    .line 141
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->b(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    if-ne p1, v1, :cond_b

    .line 145
    goto :goto_5

    .line 146
    .line 147
    :cond_b
    :goto_4
    check-cast p1, Ljava/lang/String;

    .line 148
    .line 149
    if-eqz p1, :cond_d

    .line 150
    .line 151
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/data/repository/applicant/z;->a:Lcom/sumsub/sns/internal/features/data/repository/applicant/a;

    .line 152
    .line 153
    iput v3, v0, Lcom/sumsub/sns/internal/features/data/repository/applicant/u;->d:I

    .line 154
    .line 155
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v2, p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/applicant/J;->a(Ljava/lang/String;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    .line 159
    move-result-object p1

    .line 160
    .line 161
    if-ne p1, v1, :cond_c

    .line 162
    :goto_5
    return-object v1

    .line 163
    .line 164
    :cond_c
    :goto_6
    check-cast p1, Ljava/lang/Boolean;

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 168
    move-result p1

    .line 169
    goto :goto_7

    .line 170
    :cond_d
    const/4 p1, 0x0

    .line 171
    .line 172
    .line 173
    :goto_7
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 174
    move-result-object p1

    .line 175
    return-object p1
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method
