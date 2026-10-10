.class public final Lcom/sumsub/sns/internal/features/presentation/status/M;
.super Landroidx/lifecycle/AbstractSavedStateViewModelFactory;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/domain/h;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/status/m;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/AbstractSavedStateViewModelFactory;-><init>(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/status/M;->a:Lcom/sumsub/sns/internal/core/domain/h;

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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method


# virtual methods
.method public final create(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;
    .locals 9

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/M;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 3
    .line 4
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 5
    .line 6
    .line 7
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 8
    move-result-object p1

    .line 9
    move-object v1, p1

    .line 10
    .line 11
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 12
    .line 13
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/M;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 14
    .line 15
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 19
    move-result-object p1

    .line 20
    move-object v4, p1

    .line 21
    .line 22
    check-cast v4, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 23
    .line 24
    new-instance v2, Lcom/sumsub/sns/internal/features/domain/W;

    .line 25
    .line 26
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/M;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 27
    .line 28
    .line 29
    invoke-direct {v2, p1}, Lcom/sumsub/sns/internal/features/domain/W;-><init>(Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 30
    .line 31
    new-instance v3, Lcom/sumsub/sns/internal/features/domain/z;

    .line 32
    .line 33
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/M;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 34
    .line 35
    .line 36
    invoke-direct {v3, p1}, Lcom/sumsub/sns/internal/features/domain/z;-><init>(Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 37
    .line 38
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/M;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 39
    .line 40
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->g:Lkotlin/Lazy;

    .line 41
    .line 42
    .line 43
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 44
    move-result-object p1

    .line 45
    move-object v5, p1

    .line 46
    .line 47
    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 48
    .line 49
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/M;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 50
    .line 51
    iget-object v6, p1, Lcom/sumsub/sns/internal/core/domain/h;->q:Lcom/sumsub/sns/internal/core/domain/d;

    .line 52
    .line 53
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->i:Lkotlin/Lazy;

    .line 54
    .line 55
    .line 56
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 57
    move-result-object p1

    .line 58
    move-object v8, p1

    .line 59
    .line 60
    check-cast v8, Lcom/sumsub/sns/internal/features/presentation/main/j2;

    .line 61
    .line 62
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/status/L;

    .line 63
    move-object v7, p3

    .line 64
    .line 65
    .line 66
    invoke-direct/range {v0 .. v8}, Lcom/sumsub/sns/internal/features/presentation/status/L;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/domain/W;Lcom/sumsub/sns/internal/features/domain/z;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/core/domain/d;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/presentation/main/j2;)V

    .line 67
    return-object v0
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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
.end method
