.class public final Lcom/sumsub/sns/internal/features/presentation/sumsubid/a;
.super Landroidx/lifecycle/AbstractSavedStateViewModelFactory;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/domain/h;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/sumsubid/z;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/AbstractSavedStateViewModelFactory;-><init>(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/a;->a:Lcom/sumsub/sns/internal/core/domain/h;

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
    .locals 8

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/a;->a:Lcom/sumsub/sns/internal/core/domain/h;

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
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/a;->a:Lcom/sumsub/sns/internal/core/domain/h;

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
    move-object v2, p1

    .line 21
    .line 22
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 23
    .line 24
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/a;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 25
    .line 26
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->g:Lkotlin/Lazy;

    .line 27
    .line 28
    .line 29
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 30
    move-result-object p1

    .line 31
    move-object v5, p1

    .line 32
    .line 33
    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 34
    .line 35
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/a;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->l:Lkotlin/Lazy;

    .line 38
    .line 39
    .line 40
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 41
    move-result-object p1

    .line 42
    move-object v3, p1

    .line 43
    .line 44
    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/e;

    .line 45
    .line 46
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/a;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 47
    .line 48
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->k:Lkotlin/Lazy;

    .line 49
    .line 50
    .line 51
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 52
    move-result-object p1

    .line 53
    move-object v4, p1

    .line 54
    .line 55
    check-cast v4, Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;

    .line 56
    .line 57
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/verification/d;

    .line 58
    .line 59
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/a;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 60
    .line 61
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->R:Lkotlin/Lazy;

    .line 62
    .line 63
    .line 64
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    check-cast p1, Ljava/util/Map;

    .line 68
    .line 69
    .line 70
    invoke-direct {v6, p3, p1}, Lcom/sumsub/sns/internal/features/presentation/verification/d;-><init>(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)V

    .line 71
    .line 72
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;

    .line 73
    move-object v7, p3

    .line 74
    .line 75
    .line 76
    invoke-direct/range {v0 .. v7}, Lcom/sumsub/sns/internal/features/presentation/sumsubid/O0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/sumsubid/e;Lcom/sumsub/sns/internal/features/data/repository/sumsubid/b;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Lcom/sumsub/sns/internal/features/presentation/verification/d;Landroidx/lifecycle/SavedStateHandle;)V

    .line 77
    return-object v0
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
