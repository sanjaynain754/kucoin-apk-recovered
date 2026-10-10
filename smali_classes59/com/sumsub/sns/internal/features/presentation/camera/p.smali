.class public final Lcom/sumsub/sns/internal/features/presentation/camera/p;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final synthetic k:[Lkotlin/reflect/KProperty;


# instance fields
.field public final e:Lcom/sumsub/sns/internal/features/presentation/camera/n;

.field public final f:Ljava/lang/String;

.field public final g:Lkotlin/Lazy;

.field public final h:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public final i:Lcom/sumsub/sns/internal/core/presentation/common/k;

.field public j:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    const-class v0, Lcom/sumsub/sns/internal/features/presentation/camera/p;

    .line 3
    .line 4
    const-string v1, "helperView"

    .line 5
    .line 6
    const-string v2, "getHelperView()Landroid/view/View;"

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1, v2, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    const-string v2, "darkOverlay"

    .line 14
    .line 15
    const-string v4, "getDarkOverlay()Landroid/view/View;"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, v4, v3}, Lcom/sumsub/sns/core/presentation/base/g;->a(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)Lkotlin/reflect/KProperty1;

    .line 19
    move-result-object v0

    .line 20
    const/4 v2, 0x2

    .line 21
    .line 22
    new-array v2, v2, [Lkotlin/reflect/KProperty;

    .line 23
    .line 24
    aput-object v1, v2, v3

    .line 25
    const/4 v1, 0x1

    .line 26
    .line 27
    aput-object v0, v2, v1

    .line 28
    .line 29
    sput-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/p;->k:[Lkotlin/reflect/KProperty;

    .line 30
    return-void
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

.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/l;Lkotlin/jvm/functions/Function0;Lcom/sumsub/sns/internal/features/presentation/camera/n;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, p1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 5
    .line 6
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->e:Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 7
    .line 8
    const-string p1, "CameraHelper"

    .line 9
    .line 10
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->f:Ljava/lang/String;

    .line 11
    .line 12
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/camera/v0;

    .line 13
    .line 14
    .line 15
    invoke-direct {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/camera/v0;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 16
    .line 17
    .line 18
    invoke-static {p1}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->g:Lkotlin/Lazy;

    .line 22
    .line 23
    iget p1, p3, Lcom/sumsub/sns/internal/features/presentation/camera/n;->a:I

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 30
    .line 31
    iget p1, p3, Lcom/sumsub/sns/internal/features/presentation/camera/n;->b:I

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(I)Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 38
    return-void
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

.method public static final a(Lkotlin/jvm/functions/Function0;)Lcom/sumsub/sns/internal/features/presentation/camera/m;
    .locals 0

    .line 1
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/camera/m;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/p;Lcom/sumsub/sns/internal/core/presentation/helper/camera/f;)Lkotlin/Unit;
    .locals 4

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/d;

    if-eqz v0, :cond_3

    .line 4
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/d;

    .line 5
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/d;->a:Lcom/sumsub/sns/internal/core/presentation/intro/g;

    .line 6
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/d;->b:Ljava/util/Map;

    .line 7
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    if-nez v1, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->e:Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 9
    iget v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/n;->c:I

    .line 10
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 11
    :cond_1
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/camera/p;->a(Lcom/sumsub/sns/internal/core/presentation/intro/g;)Z

    move-result v0

    if-nez v0, :cond_4

    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->e:Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 13
    iget v0, v0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->d:I

    .line 14
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 15
    :cond_2
    new-instance v0, Lcom/sumsub/sns/core/presentation/intro/b;

    .line 16
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 17
    invoke-virtual {v2}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v2

    .line 18
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/domain/h;->q:Lcom/sumsub/sns/internal/core/domain/d;

    .line 19
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 20
    invoke-virtual {v3}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    move-result-object v3

    .line 21
    invoke-direct {v0, v2, v3}, Lcom/sumsub/sns/core/presentation/intro/b;-><init>(Lcom/sumsub/sns/internal/features/data/repository/extensions/a;Lcom/sumsub/sns/internal/core/common/u0;)V

    .line 22
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->e:Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 23
    iget p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/n;->d:I

    const/4 v2, -0x1

    .line 24
    invoke-static {v0, v1, p1, p0, v2}, Lcom/sumsub/sns/core/presentation/intro/b;->a(Lcom/sumsub/sns/core/presentation/intro/b;Landroid/view/View;Ljava/util/Map;II)V

    goto :goto_0

    .line 25
    :cond_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;

    if-eqz v0, :cond_4

    .line 26
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;

    .line 27
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;->a:Ljava/lang/String;

    .line 28
    iget-object v1, p1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;->c:Ljava/lang/String;

    .line 29
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/helper/camera/c;->d:Lcom/sumsub/sns/internal/core/presentation/intro/g;

    .line 30
    invoke-virtual {p0, v0, v1, p1}, Lcom/sumsub/sns/internal/features/presentation/camera/p;->a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/intro/g;)V

    .line 31
    :cond_4
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/p;Ljava/lang/String;)Lkotlin/Unit;
    .locals 3

    .line 54
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 55
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p0

    const/4 v0, 0x2

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 56
    invoke-static {p0, p1, v2, v0, v1}, Lcom/sumsub/sns/core/presentation/base/C;->onLinkClicked$default(Lcom/sumsub/sns/core/presentation/base/C;Ljava/lang/String;ZILjava/lang/Object;)V

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/camera/p;Landroid/view/View;)V
    .locals 1

    .line 57
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->j:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    if-eqz p0, :cond_0

    .line 58
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->getState()I

    move-result p1

    const/4 v0, 0x3

    if-ne p1, v0, :cond_0

    const/4 p1, 0x4

    .line 59
    invoke-virtual {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    :cond_0
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/intro/g;)V
    .locals 4

    .line 32
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v0

    if-nez v0, :cond_0

    goto/16 :goto_0

    .line 33
    :cond_0
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    sget-object v2, Lcom/sumsub/sns/internal/features/presentation/camera/p;->k:[Lkotlin/reflect/KProperty;

    const/4 v3, 0x0

    aget-object v2, v2, v3

    invoke-virtual {v1, p0, v2}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/view/View;

    if-nez v1, :cond_1

    goto :goto_0

    .line 34
    :cond_1
    invoke-virtual {p0, p3}, Lcom/sumsub/sns/internal/features/presentation/camera/p;->a(Lcom/sumsub/sns/internal/core/presentation/intro/g;)Z

    move-result p3

    if-nez p3, :cond_8

    .line 35
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->e:Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 36
    iget p3, p3, Lcom/sumsub/sns/internal/features/presentation/camera/n;->c:I

    .line 37
    invoke-virtual {v0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    if-eqz p3, :cond_2

    invoke-virtual {p3, v3}, Landroid/view/View;->setVisibility(I)V

    .line 38
    :cond_2
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->e:Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 39
    iget p3, p3, Lcom/sumsub/sns/internal/features/presentation/camera/n;->d:I

    .line 40
    invoke-virtual {v0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    const/16 v1, 0x8

    if-eqz p3, :cond_3

    invoke-virtual {p3, v1}, Landroid/view/View;->setVisibility(I)V

    .line 41
    :cond_3
    iget-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->e:Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 42
    iget p3, p3, Lcom/sumsub/sns/internal/features/presentation/camera/n;->e:I

    .line 43
    invoke-virtual {v0, p3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p3

    check-cast p3, Landroid/widget/TextView;

    if-eqz p3, :cond_4

    invoke-virtual {p3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->e:Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 45
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/n;->f:I

    .line 46
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    if-eqz p1, :cond_5

    invoke-virtual {p1, v1}, Landroid/view/View;->setVisibility(I)V

    .line 47
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->e:Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 48
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/camera/n;->g:I

    .line 49
    invoke-virtual {v0, p1}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/TextView;

    if-eqz p1, :cond_6

    .line 50
    invoke-virtual {p1, v3}, Landroid/view/View;->setVisibility(I)V

    :cond_6
    if-eqz p1, :cond_7

    .line 51
    iget-object p3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {p3}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p3

    .line 52
    invoke-static {p2, p3}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    :cond_7
    if-eqz p1, :cond_8

    .line 53
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/camera/x0;

    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/x0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/p;)V

    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    :cond_8
    :goto_0
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/intro/g;)Z
    .locals 8

    .line 60
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getInstructionsViewHandler()Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 61
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    .line 62
    iget-object v3, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->a:Ljava/lang/String;

    .line 63
    iget-object v4, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->c:Ljava/lang/String;

    .line 64
    iget-object v5, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->b:Ljava/lang/String;

    .line 65
    sget-object v0, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;->BOTTOMSHEET:Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;

    invoke-virtual {v0}, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler$Position;->getValue()Ljava/lang/String;

    move-result-object v6

    .line 66
    iget-object v7, p1, Lcom/sumsub/sns/internal/core/presentation/intro/g;->d:Ljava/lang/String;

    .line 67
    invoke-interface/range {v1 .. v7}, Lcom/sumsub/sns/core/data/listener/SNSInstructionsViewHandler;->onVerificationStep(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/view/View;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    const/4 v0, 0x0

    if-eqz p1, :cond_5

    .line 68
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 69
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireView()Landroid/view/View;

    move-result-object v1

    .line 70
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->e:Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 71
    iget v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/n;->c:I

    .line 72
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v2

    if-eqz v2, :cond_1

    const/16 v3, 0x8

    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 73
    :cond_1
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->e:Lcom/sumsub/sns/internal/features/presentation/camera/n;

    .line 74
    iget v2, v2, Lcom/sumsub/sns/internal/features/presentation/camera/n;->d:I

    .line 75
    invoke-virtual {v1, v2}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/view/ViewGroup;

    if-eqz v1, :cond_2

    .line 76
    invoke-virtual {v1, v0}, Landroid/view/View;->setVisibility(I)V

    :cond_2
    if-eqz v1, :cond_3

    .line 77
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    :cond_3
    if-eqz v1, :cond_4

    .line 78
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v2, -0x1

    const/4 v3, -0x2

    invoke-direct {v0, v2, v3}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 79
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    .line 80
    invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/sumsub/sns/R$dimen;->sns_margin_medium:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    .line 81
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginStart(I)V

    .line 82
    invoke-virtual {v0, v2}, Landroid/view/ViewGroup$MarginLayoutParams;->setMarginEnd(I)V

    .line 83
    iput v2, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 84
    sget-object v2, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 85
    invoke-virtual {v1, p1, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_4
    const/4 p1, 0x1

    return p1

    :cond_5
    return v0
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->f:Ljava/lang/String;

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

.method public final l()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/camera/m;

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/w0;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/w0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/p;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Lcom/sumsub/sns/internal/core/presentation/common/g;Lkotlin/jvm/functions/Function1;)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/camera/p;->n()V

    .line 20
    return-void
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

.method public final m()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->j:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 4
    return-void
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

.method public final n()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->h:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 3
    .line 4
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/camera/p;->k:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v3, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0, v3}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Landroid/view/View;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-static {v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->from(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setHideable(Z)V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setPeekHeight(I)V

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    .line 29
    :goto_0
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->j:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 30
    .line 31
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->i:Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 32
    const/4 v2, 0x1

    .line 33
    .line 34
    aget-object v1, v1, v2

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Ljava/lang/Object;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    check-cast v0, Landroid/view/View;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/y0;

    .line 45
    .line 46
    .line 47
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/y0;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/p;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 51
    const/4 v1, 0x0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Landroid/view/View;->setAlpha(F)V

    .line 55
    .line 56
    :cond_1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/camera/p;->j:Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    .line 57
    .line 58
    if-eqz v0, :cond_2

    .line 59
    .line 60
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/camera/o;

    .line 61
    .line 62
    .line 63
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/camera/o;-><init>(Lcom/sumsub/sns/internal/features/presentation/camera/p;)V

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->addBottomSheetCallback(Lcom/google/android/material/bottomsheet/BottomSheetBehavior$BottomSheetCallback;)V

    .line 67
    :cond_2
    return-void
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
