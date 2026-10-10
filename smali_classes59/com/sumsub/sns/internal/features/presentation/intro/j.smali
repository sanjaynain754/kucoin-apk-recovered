.class public final Lcom/sumsub/sns/internal/features/presentation/intro/j;
.super Lcom/sumsub/sns/core/presentation/base/I;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/I<",
        "Lcom/sumsub/sns/core/presentation/base/s;",
        "Lcom/sumsub/sns/internal/features/presentation/intro/n;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u0001\u0006B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/intro/j;",
        "Lcom/sumsub/sns/core/presentation/base/I;",
        "Lcom/sumsub/sns/core/presentation/base/s;",
        "Lcom/sumsub/sns/internal/features/presentation/intro/n;",
        "<init>",
        "()V",
        "com/sumsub/sns/internal/features/presentation/intro/d",
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
        "SMAP\nSNSIntroScreenFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSIntroScreenFragment.kt\ncom/sumsub/sns/internal/features/presentation/intro/SNSIntroScreenFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n*L\n1#1,155:1\n106#2,15:156\n*S KotlinDebug\n*F\n+ 1 SNSIntroScreenFragment.kt\ncom/sumsub/sns/internal/features/presentation/intro/SNSIntroScreenFragment\n*L\n28#1:156,15\n*E\n"
    }
.end annotation


# static fields
.field public static final c:Lcom/sumsub/sns/internal/features/presentation/intro/d;

.field public static final synthetic d:[Lkotlin/reflect/KProperty;


# instance fields
.field public final a:Lcom/sumsub/sns/internal/core/common/L;

.field public final b:Lkotlin/Lazy;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    const-string v0, "getContent()Landroid/view/ViewGroup;"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/intro/j;

    .line 6
    .line 7
    const-string v3, "content"

    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3, v0, v1}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 11
    move-result-object v0

    .line 12
    const/4 v2, 0x1

    .line 13
    .line 14
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 15
    .line 16
    aput-object v0, v2, v1

    .line 17
    .line 18
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/intro/j;->d:[Lkotlin/reflect/KProperty;

    .line 19
    .line 20
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/intro/d;

    .line 21
    .line 22
    .line 23
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/intro/d;-><init>()V

    .line 24
    .line 25
    sput-object v0, Lcom/sumsub/sns/internal/features/presentation/intro/j;->c:Lcom/sumsub/sns/internal/features/presentation/intro/d;

    .line 26
    return-void
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
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/I;-><init>()V

    .line 4
    .line 5
    sget v0, Lcom/sumsub/sns/R$id;->sns_container:I

    .line 6
    .line 7
    new-instance v1, Lcom/sumsub/sns/internal/core/common/L;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/L;-><init>(I)V

    .line 11
    .line 12
    iput-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/intro/j;->a:Lcom/sumsub/sns/internal/core/common/L;

    .line 13
    .line 14
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/intro/b;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/intro/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/intro/j;)V

    .line 18
    .line 19
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/intro/e;

    .line 20
    .line 21
    .line 22
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/intro/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/intro/j;)V

    .line 23
    .line 24
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 25
    .line 26
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/intro/f;

    .line 27
    .line 28
    .line 29
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/intro/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/intro/e;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/intro/n;

    .line 36
    .line 37
    .line 38
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/intro/g;

    .line 42
    .line 43
    .line 44
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/intro/g;-><init>(Lkotlin/Lazy;)V

    .line 45
    .line 46
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/intro/h;

    .line 47
    .line 48
    .line 49
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/intro/h;-><init>(Lkotlin/Lazy;)V

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/intro/j;->b:Lkotlin/Lazy;

    .line 56
    return-void
    .line 57
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/intro/j;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 2

    .line 10
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/intro/o;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v1

    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/intro/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/intro/j;Lcom/sumsub/sns/internal/core/domain/h;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/intro/j;Landroid/view/View;)V
    .locals 8

    .line 1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/intro/j;->b:Lkotlin/Lazy;

    .line 2
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/intro/n;

    .line 3
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->g:Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;

    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/features/data/model/common/t2;

    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->a:Ljava/lang/String;

    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->c:Ljava/lang/String;

    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->b:Ljava/lang/String;

    const/4 v6, 0x0

    const/16 v7, 0x38

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/internal/features/data/model/common/t2;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;I)V

    .line 5
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->b:Ljava/util/Set;

    .line 6
    invoke-static {v1}, Lcom/sumsub/sns/internal/features/presentation/main/instructions/h;->a(Lcom/sumsub/sns/internal/features/data/model/common/t2;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 7
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->f:Lcom/sumsub/sns/internal/features/presentation/intro/c;

    if-eqz p1, :cond_0

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/s;

    .line 8
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/presentation/screen/base/s;->e()V

    .line 9
    :cond_0
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, p1, v0, v1}, Lcom/sumsub/sns/core/presentation/base/l;->setResult$default(Lcom/sumsub/sns/core/presentation/base/l;ILandroid/os/Bundle;ILjava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/intro/j;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/intro/n;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/intro/n;->a:Ljava/lang/String;

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final getLayoutId()Ljava/lang/Integer;
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_intro:I

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final getOpenPayload()Ljava/util/Map;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getOpenPayload()Ljava/util/Map;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/intro/j;->b:Lkotlin/Lazy;

    .line 7
    .line 8
    .line 9
    invoke-interface {v1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/intro/n;

    .line 13
    .line 14
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->h:Ljava/util/HashMap;

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1}, Lkotlin/collections/MapsKt;->plus(Ljava/util/Map;Ljava/util/Map;)Ljava/util/Map;

    .line 18
    move-result-object v0

    .line 19
    return-object v0
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
.end method

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/intro/j;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/intro/n;

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

.method public final handleState(Lcom/sumsub/sns/core/presentation/base/s;Landroid/os/Bundle;)V
    .locals 8

    .line 1
    .line 2
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/intro/l;

    .line 3
    .line 4
    if-eqz p2, :cond_7

    .line 5
    .line 6
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/intro/l;

    .line 7
    .line 8
    iget-object p2, p1, Lcom/sumsub/sns/internal/features/presentation/intro/l;->b:Ljava/util/Map;

    .line 9
    .line 10
    .line 11
    invoke-interface {p2}, Ljava/util/Map;->isEmpty()Z

    .line 12
    move-result p2

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    goto/16 :goto_2

    .line 17
    .line 18
    :cond_0
    sget-object p2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/core/common/k0;->getInstructionsViewHandler()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;

    .line 22
    move-result-object v0

    .line 23
    const/4 p2, 0x0

    .line 24
    const/4 v7, 0x0

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/intro/l;->a:Lcom/sumsub/sns/internal/core/presentation/intro/g;

    .line 33
    move-object v3, v2

    .line 34
    .line 35
    iget-object v2, v3, Lcom/sumsub/sns/internal/core/presentation/intro/g;->a:Ljava/lang/String;

    .line 36
    move-object v4, v3

    .line 37
    .line 38
    iget-object v3, v4, Lcom/sumsub/sns/internal/core/presentation/intro/g;->c:Ljava/lang/String;

    .line 39
    .line 40
    iget-object v4, v4, Lcom/sumsub/sns/internal/core/presentation/intro/g;->b:Ljava/lang/String;

    .line 41
    .line 42
    sget-object v5, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;->FULLSCREEN:Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v5}, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;->getValue()Ljava/lang/String;

    .line 46
    move-result-object v5

    .line 47
    .line 48
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/intro/l;->a:Lcom/sumsub/sns/internal/core/presentation/intro/g;

    .line 49
    .line 50
    iget-object v6, v6, Lcom/sumsub/sns/internal/core/presentation/intro/g;->d:Ljava/lang/String;

    .line 51
    .line 52
    .line 53
    invoke-interface/range {v0 .. v6}, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;->onVerificationStep(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/intro/j;->a:Lcom/sumsub/sns/internal/core/common/L;

    .line 59
    .line 60
    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/intro/j;->d:[Lkotlin/reflect/KProperty;

    .line 61
    .line 62
    aget-object v3, v2, v7

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p0, v3}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    check-cast v1, Landroid/view/ViewGroup;

    .line 69
    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 74
    .line 75
    :cond_1
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/intro/j;->a:Lcom/sumsub/sns/internal/core/common/L;

    .line 76
    .line 77
    aget-object v2, v2, v7

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, p0, v2}, Lcom/sumsub/sns/internal/core/common/L;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    check-cast v1, Landroid/view/ViewGroup;

    .line 84
    .line 85
    if-eqz v1, :cond_2

    .line 86
    .line 87
    new-instance v2, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 88
    const/4 v3, -0x1

    .line 89
    const/4 v4, -0x2

    .line 90
    .line 91
    .line 92
    invoke-direct {v2, v3, v4}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v0, v2}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 96
    .line 97
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 98
    goto :goto_0

    .line 99
    :cond_2
    move-object v0, p2

    .line 100
    .line 101
    :goto_0
    if-nez v0, :cond_5

    .line 102
    .line 103
    :cond_3
    new-instance v0, Lcom/sumsub/sns/core/presentation/intro/b;

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/domain/h;->q:Lcom/sumsub/sns/internal/core/domain/d;

    .line 110
    .line 111
    .line 112
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    .line 113
    move-result-object v2

    .line 114
    .line 115
    .line 116
    invoke-direct {v0, v1, v2, v7}, Lcom/sumsub/sns/core/presentation/intro/b;-><init>(Lcom/sumsub/sns/internal/features/data/repository/extensions/a;Lcom/sumsub/sns/internal/core/common/u0;I)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    if-nez v1, :cond_4

    .line 123
    goto :goto_1

    .line 124
    .line 125
    :cond_4
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/intro/l;->b:Ljava/util/Map;

    .line 126
    .line 127
    sget v3, Lcom/sumsub/sns/R$id;->sns_container:I

    .line 128
    .line 129
    sget v4, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 130
    .line 131
    .line 132
    invoke-static {v0, v1, v2, v3, v4}, Lcom/sumsub/sns/core/presentation/intro/b;->a(Lcom/sumsub/sns/core/presentation/intro/b;Landroid/view/View;Ljava/util/Map;II)V

    .line 133
    .line 134
    .line 135
    :cond_5
    :goto_1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    .line 136
    move-result-object v0

    .line 137
    .line 138
    if-eqz v0, :cond_7

    .line 139
    .line 140
    sget v1, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 141
    .line 142
    .line 143
    invoke-virtual {v0, v1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    .line 144
    move-result-object v0

    .line 145
    .line 146
    check-cast v0, Landroid/widget/Button;

    .line 147
    .line 148
    if-eqz v0, :cond_7

    .line 149
    .line 150
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/intro/l;->b:Ljava/util/Map;

    .line 151
    .line 152
    const-string v1, "actionTitle"

    .line 153
    .line 154
    .line 155
    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    move-result-object p1

    .line 157
    .line 158
    instance-of v1, p1, Ljava/lang/String;

    .line 159
    .line 160
    if-eqz v1, :cond_6

    .line 161
    move-object p2, p1

    .line 162
    .line 163
    check-cast p2, Ljava/lang/String;

    .line 164
    .line 165
    .line 166
    :cond_6
    invoke-virtual {v0, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 167
    .line 168
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/intro/i;

    .line 169
    .line 170
    .line 171
    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/intro/i;-><init>(Lcom/sumsub/sns/internal/features/presentation/intro/j;)V

    .line 172
    .line 173
    .line 174
    invoke-virtual {v0, p1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 175
    :cond_7
    :goto_2
    return-void
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/intro/j;->b:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    move-object v1, v0

    .line 8
    .line 9
    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/intro/n;

    .line 10
    .line 11
    instance-of p1, p1, Lcom/sumsub/sns/internal/core/common/u;

    .line 12
    .line 13
    if-nez p1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 17
    goto :goto_1

    .line 18
    .line 19
    :cond_0
    iget-object p1, v1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->f:Lcom/sumsub/sns/internal/features/presentation/intro/c;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/intro/a;->a:Lcom/sumsub/sns/internal/features/presentation/intro/a;

    .line 24
    .line 25
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/s;

    .line 26
    .line 27
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    .line 28
    .line 29
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->j:Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;

    .line 30
    .line 31
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/p;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/p;

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a(Lcom/sumsub/sns/internal/features/presentation/verification2/host/r;)V

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    iget-boolean p1, v1, Lcom/sumsub/sns/internal/features/presentation/intro/n;->e:Z

    .line 38
    .line 39
    if-eqz p1, :cond_2

    .line 40
    .line 41
    new-instance v2, Lcom/sumsub/sns/internal/core/common/v;

    .line 42
    .line 43
    sget-object p1, Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;->INSTANCE:Lcom/sumsub/sns/core/data/model/SNSCompletionResult$SuccessTermination;

    .line 44
    .line 45
    .line 46
    invoke-direct {v2, p1}, Lcom/sumsub/sns/internal/core/common/v;-><init>(Lcom/sumsub/sns/core/data/model/SNSCompletionResult;)V

    .line 47
    .line 48
    const/16 v6, 0xe

    .line 49
    const/4 v7, 0x0

    .line 50
    const/4 v3, 0x0

    .line 51
    const/4 v4, 0x0

    .line 52
    const/4 v5, 0x0

    .line 53
    .line 54
    .line 55
    invoke-static/range {v1 .. v7}, Lcom/sumsub/sns/core/presentation/base/C;->finish$default(Lcom/sumsub/sns/core/presentation/base/C;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;Lcom/sumsub/sns/internal/features/presentation/result/c;ILjava/lang/Object;)V

    .line 56
    :goto_0
    const/4 p1, 0x0

    .line 57
    return p1

    .line 58
    .line 59
    .line 60
    :cond_2
    :goto_1
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->e()V

    .line 61
    const/4 p1, 0x1

    .line 62
    return p1
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
