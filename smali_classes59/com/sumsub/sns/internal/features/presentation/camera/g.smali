.class public final Lcom/sumsub/sns/internal/features/presentation/camera/g;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/camera/s;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/camera/h;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/h;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/g;->a:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    return-void
    .line 7
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
.end method


# virtual methods
.method public final a(Landroid/graphics/Bitmap;Lcom/sumsub/sns/internal/core/presentation/camera/x;Lcom/sumsub/sns/internal/core/presentation/camera/j;)Ljava/lang/Object;
    .locals 1

    .line 15
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/camera/t;

    invoke-direct {v0, p1, p2}, Lcom/sumsub/sns/internal/core/presentation/camera/t;-><init>(Landroid/graphics/Bitmap;Lcom/sumsub/sns/internal/core/presentation/camera/x;)V

    .line 16
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/g;->a:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 17
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/h;->g:Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 18
    invoke-interface {p1, v0, p3}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object p2

    if-ne p1, p2, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Landroidx/camera/core/ImageProxy;Lcom/sumsub/sns/internal/core/presentation/camera/x;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/f;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/f;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/f;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/f;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/f;

    check-cast p3, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/g;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/f;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 8
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/f;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/f;->a:Landroidx/camera/core/ImageProxy;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 9
    new-instance p3, Lcom/sumsub/sns/internal/core/presentation/camera/u;

    invoke-direct {p3, p1, p2}, Lcom/sumsub/sns/internal/core/presentation/camera/u;-><init>(Landroidx/camera/core/ImageProxy;Lcom/sumsub/sns/internal/core/presentation/camera/x;)V

    .line 10
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/g;->a:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 11
    iget-object p2, p2, Lcom/sumsub/sns/internal/features/presentation/camera/h;->g:Lkotlin/coroutines/jvm/internal/SuspendLambda;

    .line 12
    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/f;->a:Landroidx/camera/core/ImageProxy;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/f;->d:I

    invoke-interface {p2, p3, v0}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 13
    :cond_3
    :goto_1
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 14
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/camera/f;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/g;->a:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 5
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->f:Lkotlin/jvm/functions/Function1;

    .line 6
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/camera/p;

    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/core/presentation/camera/p;-><init>(Lcom/sumsub/sns/internal/core/presentation/camera/f;)V

    .line 7
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final a(Ljava/io/File;)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/g;->a:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 2
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->f:Lkotlin/jvm/functions/Function1;

    .line 3
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/camera/n;

    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/core/presentation/camera/n;-><init>(Ljava/io/File;)V

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/g;->a:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 2
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->f:Lkotlin/jvm/functions/Function1;

    .line 3
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/camera/o;->a:Lcom/sumsub/sns/internal/core/presentation/camera/o;

    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final b(Ljava/io/File;)V
    .locals 2

    .line 4
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/g;->a:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 5
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->f:Lkotlin/jvm/functions/Function1;

    .line 6
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/camera/q;

    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/core/presentation/camera/q;-><init>(Ljava/io/File;)V

    .line 7
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final onError(Ljava/lang/Exception;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/g;->a:Lcom/sumsub/sns/internal/features/presentation/camera/h;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/h;->f:Lkotlin/jvm/functions/Function1;

    .line 5
    .line 6
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/camera/m;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/core/presentation/camera/m;-><init>(Ljava/lang/Exception;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    return-void
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
