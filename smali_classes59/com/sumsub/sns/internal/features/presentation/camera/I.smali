.class public final Lcom/sumsub/sns/internal/features/presentation/camera/I;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/camera/s;


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/camera/K;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/K;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/I;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

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
    .locals 0

    .line 7
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/I;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    invoke-virtual {p2, p1, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->a(Landroid/graphics/Bitmap;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

    instance-of v0, p3, Lcom/sumsub/sns/internal/features/presentation/camera/H;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/H;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/H;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/H;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/H;

    check-cast p3, Lkotlin/coroutines/jvm/internal/ContinuationImpl;

    invoke-direct {v0, p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/H;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/I;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/H;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 3
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/camera/H;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/H;->a:Landroidx/camera/core/ImageProxy;

    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p3}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 4
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/I;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    iput-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/camera/H;->a:Landroidx/camera/core/ImageProxy;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/camera/H;->d:I

    invoke-virtual {p3, p1, p2, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->a(Landroidx/camera/core/ImageProxy;Lcom/sumsub/sns/internal/core/presentation/camera/x;Lcom/sumsub/sns/internal/features/presentation/camera/H;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 5
    :cond_3
    :goto_1
    invoke-interface {p1}, Landroidx/camera/core/ImageProxy;->close()V

    .line 6
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/camera/f;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/I;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->a(Lcom/sumsub/sns/internal/core/presentation/camera/f;)V

    return-void
.end method

.method public final a(Ljava/io/File;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/I;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/W;

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/W;->a(Ljava/io/File;)V

    return-void
.end method

.method public final b()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/I;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->w()V

    return-void
.end method

.method public final b(Ljava/io/File;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/I;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->b(Ljava/io/File;)V

    return-void
.end method

.method public final onError(Ljava/lang/Exception;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/I;->a:Lcom/sumsub/sns/internal/features/presentation/camera/K;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/K;->a(Ljava/lang/Exception;)V

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
