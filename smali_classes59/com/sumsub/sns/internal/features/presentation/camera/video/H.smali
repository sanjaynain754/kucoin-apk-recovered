.class public final Lcom/sumsub/sns/internal/features/presentation/camera/video/H;
.super Landroidx/lifecycle/AbstractSavedStateViewModelFactory;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/domain/h;

.field public final b:Landroid/os/Bundle;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/camera/video/i;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p3}, Landroidx/lifecycle/AbstractSavedStateViewModelFactory;-><init>(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/H;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 6
    .line 7
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/H;->b:Landroid/os/Bundle;

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
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/camera/video/G;

    .line 3
    .line 4
    new-instance v2, Lcom/sumsub/sns/internal/features/domain/o;

    .line 5
    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/H;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 7
    .line 8
    .line 9
    invoke-direct {v2, p1}, Lcom/sumsub/sns/internal/features/domain/o;-><init>(Lcom/sumsub/sns/internal/core/domain/h;)V

    .line 10
    .line 11
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/H;->b:Landroid/os/Bundle;

    .line 12
    const/4 p2, 0x0

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    const-string v1, "EXTRA_ID_DOC_SET_TYPE"

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 20
    move-result-object p1

    .line 21
    move-object v3, p1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    move-object v3, p2

    .line 24
    .line 25
    :goto_0
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/H;->b:Landroid/os/Bundle;

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    const-string p2, "EXTRA_TYPE"

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    move-result-object p2

    .line 34
    :cond_1
    move-object v4, p2

    .line 35
    .line 36
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/H;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 37
    .line 38
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 39
    .line 40
    .line 41
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 42
    move-result-object p1

    .line 43
    move-object v5, p1

    .line 44
    .line 45
    check-cast v5, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 46
    .line 47
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/video/H;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 48
    .line 49
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 50
    .line 51
    .line 52
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 53
    move-result-object p1

    .line 54
    move-object v6, p1

    .line 55
    .line 56
    check-cast v6, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 57
    move-object v1, p3

    .line 58
    .line 59
    .line 60
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/presentation/camera/video/G;-><init>(Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/domain/o;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 61
    return-object v0
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
