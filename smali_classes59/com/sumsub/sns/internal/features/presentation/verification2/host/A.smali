.class public final Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final synthetic a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

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
.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification2/host/n;)V
    .locals 1

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/l;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/l;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/C;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/C;

    .line 2
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void

    .line 3
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/m;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/m;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/E;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/E;

    .line 4
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void

    .line 5
    :cond_1
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification2/host/r;)V
    .locals 6

    .line 6
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/q;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/q;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/D;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/D;

    .line 7
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void

    .line 8
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/o;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/o;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/B;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/B;

    .line 9
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/presentation/base/C;->fireEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    return-void

    .line 10
    :cond_1
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/p;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/p;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    .line 11
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v0

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification2/host/z;

    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    const/4 v1, 0x0

    invoke-direct {v3, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;Lkotlin/coroutines/Continuation;)V

    const/4 v4, 0x3

    const/4 v5, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void

    .line 12
    :cond_2
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1
.end method
