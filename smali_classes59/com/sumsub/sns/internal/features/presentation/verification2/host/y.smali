.class public final Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;
.super Lcom/sumsub/sns/internal/core/presentation/screen/base/l;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/internal/core/presentation/screen/base/l<",
        "Lcom/sumsub/sns/databinding/r;",
        "Lcom/sumsub/sns/internal/core/presentation/screen/base/m;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0007B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;",
        "Lcom/sumsub/sns/internal/core/presentation/screen/base/l;",
        "Lcom/sumsub/sns/databinding/r;",
        "Lcom/sumsub/sns/internal/core/presentation/screen/base/m;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/verification2/host/s",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nVerificationStepHostFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 VerificationStepHostFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/host/VerificationStepHostFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,102:1\n106#2,15:103\n27#3,4:118\n*S KotlinDebug\n*F\n+ 1 VerificationStepHostFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/host/VerificationStepHostFragment\n*L\n38#1:103,15\n26#1:118,4\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic U:I


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:I


# direct methods
.method static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/core/presentation/screen/base/l;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/s;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/s;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/t;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification2/host/u;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/host/t;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification2/host/v;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/v;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/verification2/host/w;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/w;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    sget v0, Lcom/sumsub/sns/R$id;->sns_verification_container:I

    .line 49
    .line 50
    iput v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;->b:I

    .line 51
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 6

    .line 1
    .line 2
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/K;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 6
    move-result-object v1

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    const-string v3, "VerificationType"

    .line 12
    .line 13
    const-class v4, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 14
    .line 15
    .line 16
    invoke-static {v1, v3, v4, v2}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 17
    move-result-object v1

    .line 18
    move-object v2, v1

    .line 19
    .line 20
    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 21
    .line 22
    :cond_0
    if-eqz v2, :cond_3

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 26
    move-result-object v1

    .line 27
    const/4 v3, 0x0

    .line 28
    .line 29
    if-eqz v1, :cond_1

    .line 30
    .line 31
    const-string v4, "VerificationEmbedded"

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v4, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 35
    move-result v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move v1, v3

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 41
    move-result-object v4

    .line 42
    .line 43
    if-eqz v4, :cond_2

    .line 44
    .line 45
    const-string v5, "SendPhoneCodeImmediately"

    .line 46
    .line 47
    .line 48
    invoke-virtual {v4, v5, v3}, Landroid/os/BaseBundle;->getBoolean(Ljava/lang/String;Z)Z

    .line 49
    move-result v3

    .line 50
    .line 51
    .line 52
    :cond_2
    invoke-direct {v0, p0, v2, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/K;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;ZZ)V

    .line 53
    return-object v0

    .line 54
    .line 55
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 56
    .line 57
    const-string v0, "VerificationStepHostFragment requires ValidationIdentifierType in arguments"

    .line 58
    .line 59
    .line 60
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 61
    throw p0
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
.method public final f()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;->b:I

    .line 3
    return v0
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

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    const-string v2, "VerificationType"

    .line 10
    .line 11
    const-class v3, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v2, v3, v1}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 15
    move-result-object v0

    .line 16
    move-object v1, v0

    .line 17
    .line 18
    check-cast v1, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 19
    .line 20
    :cond_0
    if-eqz v1, :cond_3

    .line 21
    .line 22
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/L;->a:[I

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    .line 26
    move-result v1

    .line 27
    .line 28
    aget v0, v0, v1

    .line 29
    const/4 v1, 0x1

    .line 30
    .line 31
    if-eq v0, v1, :cond_2

    .line 32
    const/4 v1, 0x2

    .line 33
    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    .line 36
    const-string v0, "PHONE_VERIFICATION"

    .line 37
    return-object v0

    .line 38
    .line 39
    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 40
    .line 41
    .line 42
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 43
    throw v0

    .line 44
    .line 45
    :cond_2
    const-string v0, "EMAIL_VERIFICATION"

    .line 46
    return-object v0

    .line 47
    .line 48
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 49
    .line 50
    const-string v1, "VerificationStepHostFragment requires ValidationIdentifierType in arguments"

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 54
    throw v0
    .line 55
    .line 56
    .line 57
.end method

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->ConfirmationContactScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

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

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/y;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 9

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/F;

    .line 3
    .line 4
    if-eqz v0, :cond_5

    .line 5
    .line 6
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/F;

    .line 7
    .line 8
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/D;

    .line 9
    const/4 v1, 0x2

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->isForResult()Z

    .line 16
    move-result p1

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    const/4 p1, 0x1

    .line 20
    .line 21
    .line 22
    invoke-static {p0, p1, v2, v1, v2}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 23
    return-void

    .line 24
    .line 25
    :cond_0
    new-instance v4, Lcom/sumsub/sns/internal/core/common/t;

    .line 26
    .line 27
    .line 28
    invoke-direct {v4}, Lcom/sumsub/sns/internal/core/common/t;-><init>()V

    .line 29
    const/4 v7, 0x6

    .line 30
    const/4 v8, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    const/4 v6, 0x0

    .line 33
    move-object v3, p0

    .line 34
    .line 35
    .line 36
    invoke-static/range {v3 .. v8}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    .line 37
    return-void

    .line 38
    :cond_1
    move-object v3, p0

    .line 39
    .line 40
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/C;

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v1, v2, v1, v2}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 46
    return-void

    .line 47
    .line 48
    :cond_2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/E;

    .line 49
    .line 50
    if-eqz v0, :cond_3

    .line 51
    const/4 p1, 0x4

    .line 52
    .line 53
    .line 54
    invoke-static {p0, p1, v2, v1, v2}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 55
    return-void

    .line 56
    .line 57
    :cond_3
    instance-of p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/B;

    .line 58
    .line 59
    if-eqz p1, :cond_4

    .line 60
    const/4 p1, 0x5

    .line 61
    .line 62
    .line 63
    invoke-static {p0, p1, v2, v1, v2}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    .line 64
    return-void

    .line 65
    .line 66
    :cond_4
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 67
    .line 68
    .line 69
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 70
    throw p1

    .line 71
    :cond_5
    move-object v3, p0

    .line 72
    .line 73
    .line 74
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 75
    return-void
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 2

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_verification_host2:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    check-cast p1, Landroid/widget/FrameLayout;

    .line 12
    .line 13
    new-instance p2, Lcom/sumsub/sns/databinding/r;

    .line 14
    .line 15
    .line 16
    invoke-direct {p2, p1}, Lcom/sumsub/sns/databinding/r;-><init>(Landroid/widget/FrameLayout;)V

    .line 17
    return-object p2

    .line 18
    .line 19
    :cond_0
    new-instance p1, Ljava/lang/NullPointerException;

    .line 20
    .line 21
    .line 22
    const-string/jumbo p2, "rootView"

    .line 23
    .line 24
    .line 25
    invoke-direct {p1, p2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 26
    throw p1
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
.end method
