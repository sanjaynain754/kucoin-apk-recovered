.class public abstract Lcom/sumsub/sns/internal/core/common/U;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;
    .locals 6

    .line 2
    new-instance v3, Lcom/sumsub/sns/internal/core/common/O;

    const/4 v0, 0x0

    invoke-direct {v3, v0, p2, p0}, Lcom/sumsub/sns/internal/core/common/O;-><init>(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/flow/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)V
    .locals 6

    .line 1
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/core/common/N;

    const/4 v1, 0x0

    invoke-direct {v3, p1, p0, p2, v1}, Lcom/sumsub/sns/internal/core/common/N;-><init>(Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public static final b(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;
    .locals 6

    .line 1
    invoke-static {p1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/core/common/S;

    const/4 v1, 0x0

    invoke-direct {v3, p1, p0, p2, v1}, Lcom/sumsub/sns/internal/core/common/S;-><init>(Landroidx/lifecycle/LifecycleOwner;Lkotlinx/coroutines/flow/e;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;
    .locals 6

    .line 2
    new-instance v3, Lcom/sumsub/sns/internal/core/common/P;

    const/4 v0, 0x0

    invoke-direct {v3, v0, p2, p0}, Lcom/sumsub/sns/internal/core/common/P;-><init>(Lkotlin/coroutines/Continuation;Lkotlin/jvm/functions/Function2;Lkotlinx/coroutines/flow/e;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p1

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    move-result-object p0

    return-object p0
.end method
