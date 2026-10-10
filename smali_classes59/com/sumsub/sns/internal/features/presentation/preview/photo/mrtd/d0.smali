.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/d0;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"

# interfaces
.implements Lcom/sumsub/sns/internal/core/presentation/common/g;


# instance fields
.field public final a:Lkotlinx/coroutines/flow/w;

.field public final synthetic b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;)V
    .locals 3

    .line 1
    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/d0;->b:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f0;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/p0;->getViewState()Lkotlinx/coroutines/flow/w;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/Z;

    .line 12
    .line 13
    .line 14
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/Z;-><init>(Lkotlinx/coroutines/flow/w;)V

    .line 15
    .line 16
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c0;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/Z;)V

    .line 20
    .line 21
    .line 22
    invoke-static {p1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    sget-object v1, Lkotlinx/coroutines/flow/SharingStarted;->a:Lkotlinx/coroutines/flow/SharingStarted$Companion;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lkotlinx/coroutines/flow/SharingStarted$Companion;->getLazily()Lkotlinx/coroutines/flow/SharingStarted;

    .line 29
    move-result-object v1

    .line 30
    const/4 v2, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static {v0, p1, v1, v2}, Lkotlinx/coroutines/flow/g;->g0(Lkotlinx/coroutines/flow/e;Lkotlinx/coroutines/m0;Lkotlinx/coroutines/flow/SharingStarted;Ljava/lang/Object;)Lkotlinx/coroutines/flow/w;

    .line 34
    move-result-object p1

    .line 35
    .line 36
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/d0;->a:Lkotlinx/coroutines/flow/w;

    .line 37
    return-void
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
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


# virtual methods
.method public final getState()Lkotlinx/coroutines/flow/w;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/d0;->a:Lkotlinx/coroutines/flow/w;

    .line 3
    return-object v0
    .line 4
    .line 5
    .line 6
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
.end method
