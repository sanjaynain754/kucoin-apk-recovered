.class public final Lcom/sumsub/sns/internal/log/logger/g;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/log/cacher/a;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/log/b;

.field public final b:Lxg0/a;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/log/b;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/log/logger/g;->a:Lcom/sumsub/sns/internal/features/data/repository/log/b;

    .line 6
    .line 7
    sget-boolean p1, Lcom/sumsub/sns/internal/core/common/k0;->f:Z

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/sumsub/sns/internal/core/common/J;->a(Z)Lxg0/a;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/sumsub/sns/internal/log/logger/g;->b:Lxg0/a;

    .line 14
    return-void
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


# virtual methods
.method public final a(Ljava/io/ByteArrayInputStream;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/log/logger/d;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/log/logger/d;

    iget v1, v0, Lcom/sumsub/sns/internal/log/logger/d;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/log/logger/d;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/log/logger/d;

    check-cast p2, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/log/logger/d;-><init>(Lcom/sumsub/sns/internal/log/logger/g;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/log/logger/d;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lcom/sumsub/sns/internal/log/logger/d;->c:I

    const/4 v3, 0x0

    const/4 v4, 0x2

    const/4 v5, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v5, :cond_2

    if-ne v2, v4, :cond_1

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    iput v5, v0, Lcom/sumsub/sns/internal/log/logger/d;->c:I

    .line 5
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object p2

    new-instance v2, Lcom/sumsub/sns/internal/log/logger/e;

    invoke-direct {v2, p1, p0, v3}, Lcom/sumsub/sns/internal/log/logger/e;-><init>(Ljava/io/InputStream;Lcom/sumsub/sns/internal/log/logger/g;Lkotlin/coroutines/Continuation;)V

    invoke-static {p2, v2, v0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    goto :goto_2

    .line 6
    :cond_4
    :goto_1
    check-cast p2, Lcom/sumsub/sns/internal/features/data/model/common/LogParams;

    if-eqz p2, :cond_6

    iput v4, v0, Lcom/sumsub/sns/internal/log/logger/d;->c:I

    .line 7
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object p1

    new-instance v2, Lcom/sumsub/sns/internal/log/logger/f;

    invoke-direct {v2, p0, p2, v3}, Lcom/sumsub/sns/internal/log/logger/f;-><init>(Lcom/sumsub/sns/internal/log/logger/g;Lcom/sumsub/sns/internal/features/data/model/common/LogParams;Lkotlin/coroutines/Continuation;)V

    invoke-static {p1, v2, v0}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_5

    :goto_2
    return-object v1

    .line 8
    :cond_5
    :goto_3
    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    goto :goto_4

    :cond_6
    const/4 p1, 0x0

    :goto_4
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/Object;Ljava/io/ByteArrayOutputStream;Lcom/sumsub/sns/internal/log/cacher/f;)Ljava/lang/Object;
    .locals 3

    .line 1
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/LogParams;

    .line 2
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v0

    new-instance v1, Lcom/sumsub/sns/internal/log/logger/c;

    const/4 v2, 0x0

    invoke-direct {v1, p2, p0, p1, v2}, Lcom/sumsub/sns/internal/log/logger/c;-><init>(Ljava/io/ByteArrayOutputStream;Lcom/sumsub/sns/internal/log/logger/g;Lcom/sumsub/sns/internal/features/data/model/common/LogParams;Lkotlin/coroutines/Continuation;)V

    invoke-static {v0, v1, p3}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final send(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/common/LogParams;

    .line 3
    .line 4
    check-cast p2, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/log/logger/f;

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, p0, p1, v2}, Lcom/sumsub/sns/internal/log/logger/f;-><init>(Lcom/sumsub/sns/internal/log/logger/g;Lcom/sumsub/sns/internal/features/data/model/common/LogParams;Lkotlin/coroutines/Continuation;)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, p2}, Lkotlinx/coroutines/h;->g(Lkotlin/coroutines/CoroutineContext;Lkotlin/jvm/functions/Function2;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 18
    move-result-object p1

    .line 19
    return-object p1
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
