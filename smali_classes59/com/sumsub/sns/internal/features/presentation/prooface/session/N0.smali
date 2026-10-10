.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;
.super Lkotlin/coroutines/jvm/internal/SuspendLambda;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lkotlin/jvm/functions/Function2;


# instance fields
.field public synthetic a:I

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;Lkotlin/coroutines/Continuation;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;Lkotlin/coroutines/Continuation;)V

    .line 8
    .line 9
    check-cast p1, Ljava/lang/Number;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 13
    move-result p1

    .line 14
    .line 15
    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;->a:I

    .line 16
    return-object v0
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
    check-cast p1, Ljava/lang/Number;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 6
    move-result p1

    .line 7
    .line 8
    check-cast p2, Lkotlin/coroutines/Continuation;

    .line 9
    .line 10
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;Lkotlin/coroutines/Continuation;)V

    .line 16
    .line 17
    iput p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;->a:I

    .line 18
    .line 19
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;->invokeSuspend(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    return-object p1
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
    .locals 1

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
    iget p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;->a:I

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/N0;->b:Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;

    .line 11
    .line 12
    iget v0, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/session/c1;->f:I

    .line 13
    .line 14
    if-lt p1, v0, :cond_0

    .line 15
    const/4 p1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 p1, 0x0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-static {p1}, Lkotlin/coroutines/jvm/internal/Boxing;->boxBoolean(Z)Ljava/lang/Boolean;

    .line 21
    move-result-object p1

    .line 22
    return-object p1
    .line 23
    .line 24
    .line 25
.end method
