.class public final Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModelFactory;
.super Landroidx/lifecycle/AbstractSavedStateViewModelFactory;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J5\u0010\u0006\u001a\u0002H\u0007\"\u0008\u0008\u0000\u0010\u0007*\u00020\u00082\u0006\u0010\t\u001a\u00020\n2\u000c\u0010\u000b\u001a\u0008\u0012\u0004\u0012\u0002H\u00070\u000c2\u0006\u0010\r\u001a\u00020\u000eH\u0014\u00a2\u0006\u0002\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModelFactory;",
        "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;",
        "fragment",
        "Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment;",
        "<init>",
        "(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment;)V",
        "create",
        "T",
        "Landroidx/lifecycle/ViewModel;",
        "key",
        "",
        "modelClass",
        "Ljava/lang/Class;",
        "handle",
        "Landroidx/lifecycle/SavedStateHandle;",
        "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;",
        "idensic-mobile-sdk-aar_defaultRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final fragment:Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment;)V
    .locals 1
    .param p1    # Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, v0}, Landroidx/lifecycle/AbstractSavedStateViewModelFactory;-><init>(Landroidx/savedstate/SavedStateRegistryOwner;Landroid/os/Bundle;)V

    .line 8
    .line 9
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModelFactory;->fragment:Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment;

    .line 10
    return-void
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
.method public create(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;
    .locals 7
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/Class;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Landroidx/lifecycle/SavedStateHandle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Landroidx/lifecycle/ViewModel;",
            ">(",
            "Ljava/lang/String;",
            "Ljava/lang/Class<",
            "TT;>;",
            "Landroidx/lifecycle/SavedStateHandle;",
            ")TT;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModelFactory;->fragment:Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneFragment;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/domain/e;

    .line 11
    .line 12
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 13
    .line 14
    .line 15
    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 16
    move-result-object p2

    .line 17
    .line 18
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 19
    .line 20
    iget-object v2, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    invoke-interface {v2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1, p2, v2}, Lcom/sumsub/sns/internal/features/domain/e;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 30
    .line 31
    new-instance v2, Lcom/sumsub/sns/internal/features/domain/a0;

    .line 32
    .line 33
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 34
    .line 35
    .line 36
    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 37
    move-result-object p2

    .line 38
    .line 39
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 40
    .line 41
    iget-object v3, p1, Lcom/sumsub/sns/internal/core/domain/h;->g:Lkotlin/Lazy;

    .line 42
    .line 43
    .line 44
    invoke-interface {v3}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/applicant/d;

    .line 48
    .line 49
    .line 50
    invoke-direct {v2, p2, v3}, Lcom/sumsub/sns/internal/features/domain/a0;-><init>(Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/applicant/d;)V

    .line 51
    .line 52
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 53
    .line 54
    .line 55
    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 56
    move-result-object p2

    .line 57
    move-object v3, p2

    .line 58
    .line 59
    check-cast v3, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 60
    .line 61
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 62
    .line 63
    .line 64
    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 65
    move-result-object p2

    .line 66
    move-object v4, p2

    .line 67
    .line 68
    check-cast v4, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 69
    .line 70
    iget-object v6, p1, Lcom/sumsub/sns/internal/core/domain/h;->q:Lcom/sumsub/sns/internal/core/domain/d;

    .line 71
    move-object v5, p3

    .line 72
    .line 73
    .line 74
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/internal/features/presentation/videoident/presentation/EnterPhoneViewModel;-><init>(Lcom/sumsub/sns/internal/features/domain/e;Lcom/sumsub/sns/internal/features/domain/a0;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;Landroidx/lifecycle/SavedStateHandle;Lcom/sumsub/sns/internal/features/data/repository/extensions/a;)V

    .line 75
    return-object v0
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
