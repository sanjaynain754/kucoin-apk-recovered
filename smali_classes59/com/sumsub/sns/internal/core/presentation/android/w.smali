.class public final Lcom/sumsub/sns/internal/core/presentation/android/w;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:Ljava/lang/Object;

.field public final synthetic b:Lcom/sumsub/sns/internal/core/presentation/android/x;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/presentation/android/x;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/w;->b:Lcom/sumsub/sns/internal/core/presentation/android/x;

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
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/w;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/android/w;->b:Lcom/sumsub/sns/internal/core/presentation/android/x;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/core/presentation/android/w;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/x;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    iput-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/android/w;->a:Ljava/lang/Object;

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
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/p;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/w;

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/android/w;->b:Lcom/sumsub/sns/internal/core/presentation/android/x;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/core/presentation/android/w;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/x;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    iput-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/android/w;->a:Ljava/lang/Object;

    .line 14
    .line 15
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/w;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

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
    .line 5
    .line 6
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 7
    .line 8
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/w;->a:Ljava/lang/Object;

    .line 9
    .line 10
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/p;

    .line 11
    .line 12
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/android/n;

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/w;->b:Lcom/sumsub/sns/internal/core/presentation/android/x;

    .line 17
    .line 18
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/n;

    .line 19
    .line 20
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/android/n;->a:Ljava/util/Set;

    .line 21
    .line 22
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    .line 23
    .line 24
    .line 25
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 29
    .line 30
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/android/t;->d:Lkotlinx/coroutines/flow/n;

    .line 31
    .line 32
    sget-object v2, Lcom/sumsub/sns/internal/core/presentation/android/k;->a:Lcom/sumsub/sns/internal/core/presentation/android/k;

    .line 33
    .line 34
    .line 35
    invoke-interface {v1, v2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 36
    .line 37
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/x;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    const/4 v1, 0x0

    .line 41
    .line 42
    new-array v1, v1, [Ljava/lang/String;

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, v1}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, p1}, Landroidx/activity/result/ActivityResultLauncher;->launch(Ljava/lang/Object;)V

    .line 50
    goto :goto_0

    .line 51
    .line 52
    :cond_0
    instance-of p1, p1, Lcom/sumsub/sns/internal/core/presentation/android/o;

    .line 53
    .line 54
    if-eqz p1, :cond_1

    .line 55
    .line 56
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/w;->b:Lcom/sumsub/sns/internal/core/presentation/android/x;

    .line 57
    .line 58
    .line 59
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/common/h;->p()V

    .line 60
    .line 61
    :cond_1
    :goto_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 62
    return-object p1
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
