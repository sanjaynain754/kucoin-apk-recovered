.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/e0;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public a:Lkotlinx/coroutines/flow/n;

.field public b:I

.field public final synthetic c:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

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
.end method


# virtual methods
.method public final create(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Lkotlin/coroutines/Continuation;
    .locals 1

    .line 1
    .line 2
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 5
    .line 6
    .line 7
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/Continuation;)V

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
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;

    .line 7
    .line 8
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 9
    .line 10
    .line 11
    invoke-direct {p1, v0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/k0;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    sget-object p2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    iget v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;->b:I

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
    .line 17
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 18
    goto :goto_2

    .line 19
    .line 20
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 21
    .line 22
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 26
    throw p1

    .line 27
    .line 28
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;->a:Lkotlinx/coroutines/flow/n;

    .line 29
    .line 30
    .line 31
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
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;->c:Lcom/sumsub/sns/internal/features/presentation/prooface/k0;

    .line 38
    .line 39
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/k0;->I:Lkotlinx/coroutines/flow/n;

    .line 40
    .line 41
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;->a:Lkotlinx/coroutines/flow/n;

    .line 42
    .line 43
    iput v3, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;->b:I

    .line 44
    .line 45
    .line 46
    const-string/jumbo v3, "sns_facescan_hint_processingTakesTooLong"

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, v3, p0}, Lcom/sumsub/sns/core/presentation/base/M0;->getString(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    if-ne p1, v0, :cond_3

    .line 53
    goto :goto_1

    .line 54
    .line 55
    :cond_3
    :goto_0
    check-cast p1, Ljava/lang/CharSequence;

    .line 56
    .line 57
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/prooface/F;

    .line 58
    .line 59
    .line 60
    invoke-direct {v3, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/F;-><init>(Ljava/lang/CharSequence;)V

    .line 61
    const/4 p1, 0x0

    .line 62
    .line 63
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;->a:Lkotlinx/coroutines/flow/n;

    .line 64
    .line 65
    iput v2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/e0;->b:I

    .line 66
    .line 67
    .line 68
    invoke-interface {v1, v3, p0}, Lkotlinx/coroutines/flow/m;->emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    if-ne p1, v0, :cond_4

    .line 72
    :goto_1
    return-object v0

    .line 73
    .line 74
    :cond_4
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 75
    return-object p1
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method
