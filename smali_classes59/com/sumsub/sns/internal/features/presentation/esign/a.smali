.class public final Lcom/sumsub/sns/internal/features/presentation/esign/a;
.super Landroidx/lifecycle/AbstractSavedStateViewModelFactory;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/domain/h;

.field public final b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/esign/h;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/AbstractSavedStateViewModelFactory;-><init>(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/esign/a;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/esign/a;->b:Landroid/os/Bundle;

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
    .locals 12

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/esign/n0;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/a;->b:Landroid/os/Bundle;

    .line 5
    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/a;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    move-object v3, p1

    .line 14
    .line 15
    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 16
    .line 17
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/a;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 18
    .line 19
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 20
    .line 21
    .line 22
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    move-object v4, p1

    .line 25
    .line 26
    check-cast v4, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 27
    .line 28
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/a;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 29
    .line 30
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->g:Lkotlin/Lazy;

    .line 31
    .line 32
    .line 33
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 34
    move-result-object p1

    .line 35
    move-object v5, p1

    .line 36
    .line 37
    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 38
    .line 39
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/esign/a;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 40
    .line 41
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 42
    .line 43
    new-instance v6, Ljava/io/File;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    const-string/jumbo p2, "sns_download"

    .line 51
    .line 52
    .line 53
    invoke-direct {v6, p1, p2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V

    .line 54
    .line 55
    new-instance v7, Lcom/sumsub/sns/internal/features/domain/esign/g;

    .line 56
    .line 57
    .line 58
    invoke-direct {v7}, Lcom/sumsub/sns/internal/features/domain/esign/g;-><init>()V

    .line 59
    .line 60
    new-instance v8, Lcom/sumsub/sns/internal/features/domain/esign/i;

    .line 61
    .line 62
    .line 63
    invoke-direct {v8}, Lcom/sumsub/sns/internal/features/domain/esign/i;-><init>()V

    .line 64
    .line 65
    new-instance v9, Lcom/sumsub/sns/internal/features/domain/esign/k;

    .line 66
    .line 67
    .line 68
    invoke-direct {v9}, Lcom/sumsub/sns/internal/features/domain/esign/k;-><init>()V

    .line 69
    .line 70
    new-instance v10, Lcom/sumsub/sns/internal/features/domain/esign/e;

    .line 71
    .line 72
    .line 73
    invoke-direct {v10}, Lcom/sumsub/sns/internal/features/domain/esign/e;-><init>()V

    .line 74
    .line 75
    new-instance v11, Lcom/sumsub/sns/internal/features/domain/esign/b;

    .line 76
    .line 77
    .line 78
    invoke-direct {v11}, Lcom/sumsub/sns/internal/features/domain/esign/b;-><init>()V

    .line 79
    move-object v2, p3

    .line 80
    .line 81
    .line 82
    invoke-direct/range {v0 .. v11}, Lcom/sumsub/sns/internal/features/presentation/esign/n0;-><init>(Landroid/os/Bundle;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;Ljava/io/File;Lcom/sumsub/sns/internal/features/domain/esign/g;Lcom/sumsub/sns/internal/features/domain/esign/i;Lcom/sumsub/sns/internal/features/domain/esign/k;Lcom/sumsub/sns/internal/features/domain/esign/e;Lcom/sumsub/sns/internal/features/domain/esign/b;)V

    .line 83
    return-object v0
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
