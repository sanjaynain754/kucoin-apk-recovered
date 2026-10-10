.class public final Lcom/sumsub/sns/internal/features/presentation/verification2/email/E;
.super Landroidx/lifecycle/AbstractSavedStateViewModelFactory;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;)V
    .locals 1

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
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/E;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;

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
.method public final create(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;
    .locals 2

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/E;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    check-cast p1, Lcom/sumsub/sns/core/presentation/base/l;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/h;

    .line 15
    .line 16
    if-nez p2, :cond_0

    .line 17
    const/4 p1, 0x0

    .line 18
    .line 19
    :cond_0
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/h;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/E;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p2}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    .line 27
    move-result-object p2

    .line 28
    .line 29
    new-instance p3, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;

    .line 30
    .line 31
    iget-object v0, p2, Lcom/sumsub/sns/internal/core/domain/h;->q:Lcom/sumsub/sns/internal/core/domain/d;

    .line 32
    .line 33
    iget-object v1, p2, Lcom/sumsub/sns/internal/core/domain/h;->f:Lkotlin/Lazy;

    .line 34
    .line 35
    .line 36
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    check-cast v1, Lcom/sumsub/sns/internal/features/data/repository/common/a;

    .line 40
    .line 41
    iget-object p2, p2, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    .line 42
    .line 43
    .line 44
    invoke-interface {p2}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 45
    move-result-object p2

    .line 46
    .line 47
    check-cast p2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    .line 48
    .line 49
    .line 50
    invoke-direct {p3, p1, v0, v1, p2}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/h;Lcom/sumsub/sns/internal/features/data/repository/extensions/a;Lcom/sumsub/sns/internal/features/data/repository/common/a;Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;)V

    .line 51
    return-object p3

    .line 52
    .line 53
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 54
    .line 55
    const-class p2, Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;

    .line 56
    .line 57
    .line 58
    invoke-static {p2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 59
    move-result-object p2

    .line 60
    .line 61
    .line 62
    invoke-interface {p2}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 63
    move-result-object p2

    .line 64
    .line 65
    const-class p3, Lcom/sumsub/sns/internal/features/presentation/verification2/email/h;

    .line 66
    .line 67
    .line 68
    invoke-static {p3}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 69
    move-result-object p3

    .line 70
    .line 71
    .line 72
    invoke-interface {p3}, Lkotlin/reflect/KClass;->getSimpleName()Ljava/lang/String;

    .line 73
    move-result-object p3

    .line 74
    .line 75
    new-instance v0, Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    const-string p2, " requires parent VM to implement "

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 93
    move-result-object p2

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 97
    move-result-object p2

    .line 98
    .line 99
    .line 100
    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 101
    throw p1
    .line 102
    .line 103
    .line 104
    .line 105
.end method
