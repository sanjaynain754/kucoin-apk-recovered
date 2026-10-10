.class public final Lcom/sumsub/sns/internal/features/presentation/prooface/P0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

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
.method public final a(Lcom/sumsub/sns/internal/features/presentation/prooface/session/D0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/prooface/N0;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N0;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N0;->d:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N0;->d:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N0;

    invoke-direct {v0, p0, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/N0;-><init>(Lcom/sumsub/sns/internal/features/presentation/prooface/P0;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N0;->b:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 1
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N0;->d:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/C0;

    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p2}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 2
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "ViewModel: handleTermination: terminalState: "

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 3
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/C0;

    if-eqz p2, :cond_7

    .line 4
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    move-object v2, p1

    check-cast v2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/C0;

    iput-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/C0;

    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/prooface/N0;->d:I

    invoke-static {p2, v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->c(Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    .line 5
    :cond_3
    :goto_1
    move-object p2, p1

    check-cast p2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/C0;

    .line 6
    instance-of v0, p2, Lcom/sumsub/sns/internal/features/presentation/prooface/session/z0;

    if-eqz v0, :cond_4

    .line 7
    new-instance p2, Lcom/sumsub/sns/core/data/model/SNSException$Network;

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/z0;

    .line 8
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/z0;->a:Ljava/lang/Throwable;

    .line 9
    invoke-direct {p2, p1}, Lcom/sumsub/sns/core/data/model/SNSException$Network;-><init>(Ljava/lang/Throwable;)V

    .line 10
    new-instance p1, Lcom/sumsub/sns/internal/features/data/model/prooface/F;

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/data/model/prooface/F;-><init>(Ljava/lang/Exception;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;)V

    .line 11
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    .line 12
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->a(Ljava/lang/Throwable;)V

    goto :goto_2

    .line 13
    :cond_4
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/A0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/A0;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_5

    .line 14
    new-instance p1, Lcom/sumsub/sns/internal/features/data/model/prooface/E;

    new-instance p2, Ljava/lang/IllegalStateException;

    const-string v0, "Liveness init failure"

    invoke-direct {p2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/data/model/prooface/E;-><init>(Ljava/lang/Exception;)V

    .line 15
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;)V

    goto :goto_2

    .line 16
    :cond_5
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/B0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/session/B0;

    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_6

    .line 17
    new-instance p1, Lcom/sumsub/sns/internal/features/data/model/prooface/F;

    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2}, Ljava/io/IOException;-><init>()V

    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/data/model/prooface/F;-><init>(Ljava/lang/Exception;)V

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;)V

    goto :goto_2

    .line 18
    :cond_6
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 19
    :cond_7
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/y0;

    if-eqz p2, :cond_8

    .line 20
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/y0;

    .line 21
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/prooface/session/y0;->a:Lcom/sumsub/sns/internal/features/data/network/prooface/i;

    .line 22
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/data/network/prooface/i;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/M;

    .line 23
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    invoke-static {p2}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/prooface/O0;

    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    const/4 v1, 0x0

    invoke-direct {v3, p1, p2, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/prooface/O0;-><init>(Lcom/sumsub/sns/internal/features/data/model/prooface/M;Lcom/sumsub/sns/internal/features/presentation/prooface/c2;Lcom/sumsub/sns/internal/features/presentation/prooface/P0;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 24
    :goto_2
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p1

    .line 25
    :cond_8
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/data/model/prooface/J;)V
    .locals 14

    .line 26
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    const-string v1, "ViewModel: finishWithReason: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/sumsub/sns/internal/features/presentation/prooface/utils/d;->a(Ljava/lang/String;)V

    .line 27
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/I;

    if-nez v0, :cond_6

    .line 28
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/D;

    if-eqz v0, :cond_0

    goto :goto_1

    .line 29
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/H;

    if-eqz v0, :cond_1

    .line 30
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    sget-object v2, Lcom/sumsub/sns/internal/core/common/s;->b:Lcom/sumsub/sns/internal/core/common/s;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    return-void

    .line 31
    :cond_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/E;

    if-eqz v0, :cond_2

    .line 32
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/prooface/E;

    .line 33
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/E;->a:Ljava/lang/Exception;

    .line 34
    iget-object p1, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 35
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 36
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    return-void

    .line 37
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/F;

    if-eqz v0, :cond_3

    .line 38
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    check-cast p1, Lcom/sumsub/sns/internal/features/data/model/prooface/F;

    .line 39
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/model/prooface/F;->a:Ljava/lang/Exception;

    .line 40
    iget-object p1, v1, Lcom/sumsub/sns/internal/features/presentation/prooface/c2;->a:Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 41
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/data/model/common/X;->a:Ljava/lang/String;

    const/4 v5, 0x4

    const/4 v6, 0x0

    const/4 v4, 0x0

    .line 42
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->throwError$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/Throwable;Ljava/lang/String;Landroid/os/Parcelable;ILjava/lang/Object;)V

    return-void

    .line 43
    :cond_3
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/prooface/C;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/C;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_5

    .line 44
    sget-object v0, Lcom/sumsub/sns/internal/features/data/model/prooface/G;->a:Lcom/sumsub/sns/internal/features/data/model/prooface/G;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_4

    goto :goto_0

    .line 45
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    .line 46
    :cond_5
    :goto_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    sget-object v1, Lcom/sumsub/sns/internal/core/common/s;->b:Lcom/sumsub/sns/internal/core/common/s;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v0 .. v6}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    return-void

    .line 47
    :cond_6
    :goto_1
    iget-object v7, p0, Lcom/sumsub/sns/internal/features/presentation/prooface/P0;->a:Lcom/sumsub/sns/internal/features/presentation/prooface/c2;

    new-instance v8, Lcom/sumsub/sns/internal/core/common/t;

    invoke-direct {v8}, Lcom/sumsub/sns/internal/core/common/t;-><init>()V

    const/16 v12, 0xe

    const/4 v13, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v7 .. v13}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    return-void
.end method
