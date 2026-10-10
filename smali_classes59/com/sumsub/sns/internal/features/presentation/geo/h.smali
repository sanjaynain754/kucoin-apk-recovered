.class public final Lcom/sumsub/sns/internal/features/presentation/geo/h;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/geo/v0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/h;->b:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

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
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/h;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/h;->b:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/geo/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/h;->a:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/core/presentation/base/W;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/geo/h;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/h;->b:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/geo/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/geo/v0;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/geo/h;->a:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/geo/h;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .locals 6

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
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/h;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lcom/sumsub/sns/core/presentation/base/W;

    .line 11
    .line 12
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/geo/z0;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/h;->b:Lcom/sumsub/sns/internal/features/presentation/geo/v0;

    .line 17
    .line 18
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/geo/v0;->u:Lkotlinx/coroutines/flow/n;

    .line 19
    .line 20
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/form/h;

    .line 21
    .line 22
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/geo/z0;

    .line 23
    .line 24
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/geo/z0;->a:Ljava/lang/CharSequence;

    .line 25
    const/4 v3, 0x0

    .line 26
    .line 27
    if-eqz v2, :cond_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v2, v3

    .line 34
    .line 35
    :goto_0
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/geo/z0;->b:Ljava/lang/CharSequence;

    .line 36
    .line 37
    if-eqz v4, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 41
    move-result-object v4

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    move-object v4, v3

    .line 44
    .line 45
    :goto_1
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/geo/z0;->c:Ljava/util/List;

    .line 46
    const/4 v5, 0x0

    .line 47
    .line 48
    .line 49
    invoke-direct {v1, v5, v2, v4, p1}, Lcom/sumsub/sns/internal/core/presentation/form/h;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 53
    move-result-object p1

    .line 54
    .line 55
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/form/j;

    .line 56
    .line 57
    .line 58
    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/presentation/form/j;-><init>()V

    .line 59
    .line 60
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/form/f;

    .line 61
    .line 62
    .line 63
    invoke-direct {v2, v5, p1, v3, v1}, Lcom/sumsub/sns/internal/core/presentation/form/f;-><init>(ILjava/util/List;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/form/j;)V

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 67
    .line 68
    :cond_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 69
    return-object p1
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
