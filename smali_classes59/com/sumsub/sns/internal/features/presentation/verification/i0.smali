.class public final Lcom/sumsub/sns/internal/features/presentation/verification/i0;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function3;


# instance fields
.field public synthetic a:Ljava/lang/Throwable;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/verification/j0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/i0;->b:Lcom/sumsub/sns/internal/features/presentation/verification/j0;

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
    .locals 1

    .line 1
    .line 2
    check-cast p1, Lkotlinx/coroutines/flow/f;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Throwable;

    .line 5
    .line 6
    check-cast p3, Lkotlin/coroutines/Continuation;

    .line 7
    .line 8
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/verification/i0;

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification/i0;->b:Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 11
    .line 12
    .line 13
    invoke-direct {p1, v0, p3}, Lcom/sumsub/sns/internal/features/presentation/verification/i0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification/j0;Lkotlin/coroutines/Continuation;)V

    .line 14
    .line 15
    iput-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/verification/i0;->a:Ljava/lang/Throwable;

    .line 16
    .line 17
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/verification/i0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 7
    .line 8
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/i0;->a:Ljava/lang/Throwable;

    .line 9
    .line 10
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->e:Lcom/sumsub/sns/internal/log/a;

    .line 11
    .line 12
    iget-object v0, v0, Lcom/sumsub/sns/internal/log/a;->a:Lcom/sumsub/sns/internal/log/logger/b;

    .line 13
    .line 14
    const-string v1, "SNSVerificationStepViewModel"

    .line 15
    .line 16
    const-string v2, "Verification step. Error building state"

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1, v2, p1}, Lcom/sumsub/sns/internal/log/logger/b;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 20
    .line 21
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification/i0;->b:Lcom/sumsub/sns/internal/features/presentation/verification/j0;

    .line 22
    .line 23
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification/j0;->t:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v2}, Lcom/sumsub/sns/core/presentation/base/C;->finishAbnormal(Ljava/lang/String;)V

    .line 27
    .line 28
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    return-object p1
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
.end method
