.class public final Lcom/sumsub/sns/internal/features/presentation/geo/t0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlinx/coroutines/flow/e;


# instance fields
.field public final synthetic a:Lkotlinx/coroutines/flow/e;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/geo/B0;


# direct methods
.method public constructor <init>(Lkotlinx/coroutines/flow/e;Lcom/sumsub/sns/internal/features/presentation/geo/B0;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/geo/t0;->a:Lkotlinx/coroutines/flow/e;

    .line 3
    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/geo/t0;->b:Lcom/sumsub/sns/internal/features/presentation/geo/B0;

    .line 5
    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    return-void
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
.method public final collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/geo/t0;->a:Lkotlinx/coroutines/flow/e;

    .line 3
    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/geo/s0;

    .line 5
    .line 6
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/geo/t0;->b:Lcom/sumsub/sns/internal/features/presentation/geo/B0;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p1, v2}, Lcom/sumsub/sns/internal/features/presentation/geo/s0;-><init>(Lkotlinx/coroutines/flow/f;Lcom/sumsub/sns/internal/features/presentation/geo/B0;)V

    .line 10
    .line 11
    .line 12
    invoke-interface {v0, v1, p2}, Lkotlinx/coroutines/flow/e;->collect(Lkotlinx/coroutines/flow/f;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    if-ne p1, p2, :cond_0

    .line 20
    return-object p1

    .line 21
    .line 22
    :cond_0
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    return-object p1
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
