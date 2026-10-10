.class public final Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;
.super Landroidx/lifecycle/AbstractSavedStateViewModelFactory;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/domain/h;

.field public final b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/AbstractSavedStateViewModelFactory;-><init>(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;->b:Landroid/os/Bundle;

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
    .locals 8

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;->b:Landroid/os/Bundle;

    .line 3
    const/4 p2, 0x0

    .line 4
    .line 5
    if-eqz p1, :cond_0

    .line 6
    .line 7
    const-string v0, "eid_mobile_token"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    move-object v1, p1

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v1, p2

    .line 15
    .line 16
    :goto_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;->b:Landroid/os/Bundle;

    .line 17
    .line 18
    if-eqz p1, :cond_1

    .line 19
    .line 20
    const-string v0, "eid_url"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object p1

    .line 25
    move-object v2, p1

    .line 26
    goto :goto_1

    .line 27
    :cond_1
    move-object v2, p2

    .line 28
    .line 29
    :goto_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;->b:Landroid/os/Bundle;

    .line 30
    .line 31
    if-eqz p1, :cond_2

    .line 32
    .line 33
    const-string v0, "eid_certificate_pem"

    .line 34
    .line 35
    .line 36
    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 37
    move-result-object p1

    .line 38
    move-object v3, p1

    .line 39
    goto :goto_2

    .line 40
    :cond_2
    move-object v3, p2

    .line 41
    .line 42
    :goto_2
    new-instance v4, Lcom/sumsub/sns/internal/features/domain/ekyc/f;

    .line 43
    .line 44
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;->b:Landroid/os/Bundle;

    .line 45
    .line 46
    if-eqz p1, :cond_3

    .line 47
    .line 48
    const-string v0, "ekyc_confirmation_id"

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, v0, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 52
    move-result-object p2

    .line 53
    .line 54
    :cond_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 55
    .line 56
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->j:Lkotlin/Lazy;

    .line 57
    .line 58
    .line 59
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/applicant/M;

    .line 63
    .line 64
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 65
    .line 66
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    check-cast v0, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 73
    .line 74
    .line 75
    invoke-direct {v4, p2, p1, v0}, Lcom/sumsub/sns/internal/features/domain/ekyc/f;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/applicant/M;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 76
    .line 77
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 78
    .line 79
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 80
    .line 81
    .line 82
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 83
    move-result-object p1

    .line 84
    move-object v6, p1

    .line 85
    .line 86
    check-cast v6, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 87
    .line 88
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/X;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 89
    .line 90
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 91
    .line 92
    .line 93
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 94
    move-result-object p1

    .line 95
    move-object v7, p1

    .line 96
    .line 97
    check-cast v7, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 98
    .line 99
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;

    .line 100
    move-object v5, p3

    .line 101
    .line 102
    .line 103
    invoke-direct/range {v0 .. v7}, Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/M0;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/domain/ekyc/f;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 104
    return-object v0
    .line 105
.end method
