.class public abstract Lcom/sumsub/sns/internal/features/presentation/common/c;
.super Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008 \u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/common/c;",
        "Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;",
        "<init>",
        "()V",
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
.field public a:Lcom/sumsub/sns/databinding/C;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;-><init>()V

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

.method public static a(Landroidx/recyclerview/widget/RecyclerView;)V
    .locals 5

    .line 52
    invoke-static {}, Lcom/sumsub/sns/core/presentation/helper/a;->a()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 53
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSColorElement;->LIST_SEPARATOR:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 54
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    invoke-virtual {v2}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v2

    invoke-static {v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result v2

    .line 55
    invoke-static {v0, v1, v2}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 56
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v1

    goto :goto_0

    .line 57
    :cond_0
    invoke-virtual {p0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v1

    sget v2, Lcom/sumsub/sns/R$color;->sns_listSeparator:I

    invoke-static {v1, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    move-result v1

    :goto_0
    if-eqz v0, :cond_1

    .line 58
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSMetricElement;->LIST_SEPARATOR_HEIGHT:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    invoke-static {v0, v2}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 59
    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    goto :goto_1

    .line 60
    :cond_1
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/sumsub/sns/R$dimen;->sns_list_separator_height_default:I

    invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v2

    int-to-float v2, v2

    :goto_1
    if-eqz v0, :cond_2

    .line 61
    sget-object v3, Lcom/sumsub/sns/core/theme/SNSMetricElement;->LIST_SEPARATOR_MARGIN_LEFT:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    invoke-static {v0, v3}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;

    move-result-object v3

    if-eqz v3, :cond_2

    .line 62
    invoke-virtual {v3}, Ljava/lang/Float;->floatValue()F

    move-result v3

    goto :goto_2

    .line 63
    :cond_2
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/sumsub/sns/R$dimen;->sns_margin_medium:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    int-to-float v3, v3

    :goto_2
    if-eqz v0, :cond_3

    .line 64
    sget-object v4, Lcom/sumsub/sns/core/theme/SNSMetricElement;->LIST_SEPARATOR_MARGIN_RIGHT:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    invoke-static {v0, v4}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;

    move-result-object v0

    if-eqz v0, :cond_3

    .line 65
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_3

    .line 66
    :cond_3
    invoke-virtual {p0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v0

    sget v4, Lcom/sumsub/sns/R$dimen;->sns_margin_medium:I

    invoke-virtual {v0, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v0

    int-to-float v0, v0

    .line 67
    :goto_3
    new-instance v4, Lcom/sumsub/sns/core/presentation/base/adapter/decorator/a;

    invoke-direct {v4, v3, v0, v2, v1}, Lcom/sumsub/sns/core/presentation/base/adapter/decorator/a;-><init>(FFFI)V

    .line 68
    invoke-virtual {p0, v4}, Landroidx/recyclerview/widget/RecyclerView;->addItemDecoration(Landroidx/recyclerview/widget/RecyclerView$ItemDecoration;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/common/c;Landroid/content/DialogInterface;)V
    .locals 6

    .line 1
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;

    .line 2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 3
    sget v0, Lcom/google/android/material/R$id;->design_bottom_sheet:I

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object v1

    check-cast v1, Landroid/widget/FrameLayout;

    .line 4
    invoke-static {v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->from(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object v2

    .line 5
    invoke-virtual {v1}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    move-result-object v3

    .line 6
    new-instance v4, Landroid/util/DisplayMetrics;

    invoke-direct {v4}, Landroid/util/DisplayMetrics;-><init>()V

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v5

    invoke-virtual {v5}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;

    move-result-object v5

    invoke-interface {v5}, Landroid/view/WindowManager;->getDefaultDisplay()Landroid/view/Display;

    move-result-object v5

    invoke-virtual {v5, v4}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V

    .line 8
    iget v4, v4, Landroid/util/DisplayMetrics;->heightPixels:I

    if-eqz v3, :cond_0

    .line 9
    iput v4, v3, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 10
    :cond_0
    invoke-virtual {v1, v3}, Landroid/view/View;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V

    const/4 v1, 0x3

    .line 11
    invoke-virtual {v2, v1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 12
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    .line 13
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object v1

    goto :goto_0

    :cond_1
    move-object v1, v2

    :goto_0
    instance-of v3, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v3, :cond_2

    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_1

    :cond_2
    move-object v1, v2

    :goto_1
    if-eqz v1, :cond_4

    .line 14
    sget-object v3, Lcom/sumsub/sns/core/theme/SNSColorElement;->BOTTOM_SHEET_BACKGROUND:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 15
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    invoke-virtual {v4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v4

    invoke-static {v4}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result v4

    .line 16
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    if-eqz v1, :cond_4

    .line 17
    invoke-virtual {v3}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v1, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    if-eqz v1, :cond_4

    if-eqz v4, :cond_3

    .line 18
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    goto :goto_2

    .line 19
    :cond_3
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    goto :goto_2

    :cond_4
    move-object v1, v2

    :goto_2
    if-eqz v1, :cond_d

    .line 20
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    .line 21
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    instance-of v4, v3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    if-eqz v4, :cond_5

    check-cast v3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    goto :goto_3

    :cond_5
    move-object v3, v2

    :goto_3
    if-eqz v3, :cond_c

    .line 22
    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-interface {p1}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object p1

    goto :goto_4

    :cond_6
    move-object p1, v2

    :goto_4
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v0, :cond_7

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_5

    :cond_7
    move-object p1, v2

    :goto_5
    if-eqz p1, :cond_b

    .line 23
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSMetricElement;->BOTTOM_SHEET_CORNER_RADIUS:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 24
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    if-eqz p1, :cond_8

    .line 25
    invoke-virtual {v0}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    goto :goto_6

    :cond_8
    move-object p1, v2

    :goto_6
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    if-eqz v0, :cond_9

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    goto :goto_7

    :cond_9
    move-object p1, v2

    :goto_7
    if-eqz p1, :cond_a

    .line 26
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/theme/d;->a:Ljava/lang/Float;

    goto :goto_8

    :cond_a
    move-object p1, v2

    :goto_8
    if-eqz p1, :cond_b

    .line 27
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    .line 28
    invoke-virtual {v3, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setCornerSize(F)V

    .line 29
    :cond_b
    invoke-static {v1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    .line 30
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/common/c;->a:Lcom/sumsub/sns/databinding/C;

    if-eqz p0, :cond_d

    .line 31
    iget-object p0, p0, Lcom/sumsub/sns/databinding/C;->a:Lcom/sumsub/sns/core/widget/SNSBottomSheetView;

    if-eqz p0, :cond_d

    .line 32
    invoke-virtual {p0, v2}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    return-void

    :cond_c
    const/4 p0, 0x0

    .line 33
    invoke-virtual {p1, p0}, Landroid/view/View;->setBackgroundColor(I)V

    :cond_d
    return-void
.end method


# virtual methods
.method public final a(Lkotlin/coroutines/jvm/internal/ContinuationImpl;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/common/a;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/common/a;

    iget v1, v0, Lcom/sumsub/sns/internal/features/presentation/common/a;->c:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/sumsub/sns/internal/features/presentation/common/a;->c:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/common/a;

    invoke-direct {v0, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/c;Lkotlin/coroutines/jvm/internal/ContinuationImpl;)V

    :goto_0
    iget-object p1, v0, Lcom/sumsub/sns/internal/features/presentation/common/a;->a:Ljava/lang/Object;

    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    move-result-object v1

    .line 69
    iget v2, v0, Lcom/sumsub/sns/internal/features/presentation/common/a;->c:I

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 70
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p1

    instance-of v2, p1, Lcom/sumsub/sns/core/presentation/base/f;

    if-eqz v2, :cond_3

    check-cast p1, Lcom/sumsub/sns/core/presentation/base/f;

    goto :goto_1

    :cond_3
    move-object p1, v4

    :goto_1
    if-eqz p1, :cond_5

    .line 71
    iget-object p1, p1, Lcom/sumsub/sns/core/presentation/base/f;->a:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/domain/h;

    if-eqz p1, :cond_5

    .line 72
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->r:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/m;

    if-eqz p1, :cond_5

    .line 73
    iput v3, v0, Lcom/sumsub/sns/internal/features/presentation/common/a;->c:I

    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;

    .line 74
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->l:Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;

    .line 75
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/data/repository/dynamic/g;->h:Lkotlinx/coroutines/flow/n;

    .line 76
    invoke-interface {v2}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v2

    .line 77
    new-instance v3, Lcom/sumsub/sns/internal/features/data/repository/dynamic/A;

    invoke-direct {v3, p1, v4}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/A;-><init>(Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;Lkotlin/coroutines/Continuation;)V

    invoke-virtual {p1, v2, v3, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/J;->a(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    return-object v1

    .line 78
    :cond_4
    :goto_2
    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/N;->c()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;

    return-object p1

    :cond_5
    return-object v4
.end method

.method public final a(Lcom/sumsub/sns/core/widget/SNSTextInputLayout;)V
    .locals 10

    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    .line 35
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v2

    .line 36
    sget-object v3, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->SEARCH:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v3}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v2, v0, v3}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    if-nez v2, :cond_0

    .line 37
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v2

    sget v3, Lcom/sumsub/sns/R$drawable;->sns_ic_search:I

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-static {v2, v3, v0}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v2

    .line 38
    :cond_0
    invoke-virtual {p1, v2}, Lcom/sumsub/sns/core/widget/SNSTextInputLayout;->setStartIconDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 39
    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object v0

    goto :goto_0

    :cond_1
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v2, :cond_2

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    .line 40
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSColorElement;->FIELD_PLACEHOLDER:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 41
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result v3

    .line 42
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    if-eqz v0, :cond_4

    .line 43
    invoke-virtual {v2}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    if-eqz v0, :cond_4

    if-eqz v3, :cond_3

    .line 44
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    goto :goto_2

    .line 45
    :cond_3
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    goto :goto_2

    :cond_4
    move-object v0, v1

    :goto_2
    if-eqz v0, :cond_5

    .line 46
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    move-result v0

    invoke-virtual {v2, v0}, Landroid/widget/TextView;->setHintTextColor(I)V

    .line 47
    :cond_5
    invoke-virtual {p1}, Lcom/google/android/material/textfield/TextInputLayout;->getEditText()Landroid/widget/EditText;

    move-result-object v0

    if-eqz v0, :cond_6

    .line 48
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->SUBTITLE2:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 49
    sget-object v3, Lcom/sumsub/sns/core/theme/SNSColorElement;->FIELD_CONTENT:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 50
    invoke-static {v0, v2, v3}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/widget/TextView;Lcom/sumsub/sns/core/theme/SNSTypographyElement;Lcom/sumsub/sns/core/theme/SNSColorElement;)V

    .line 51
    :cond_6
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    move-result-object v4

    new-instance v7, Lcom/sumsub/sns/internal/features/presentation/common/b;

    invoke-direct {v7, p0, p1, v1}, Lcom/sumsub/sns/internal/features/presentation/common/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/c;Lcom/sumsub/sns/core/widget/SNSTextInputLayout;Lkotlin/coroutines/Continuation;)V

    const/4 v8, 0x3

    const/4 v9, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    return-void
.end method

.method public final onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;->onCreateDialog(Landroid/os/Bundle;)Landroid/app/Dialog;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/common/d0;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/common/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/c;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 13
    return-object p1
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

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 6

    .line 1
    .line 2
    sget p3, Lcom/sumsub/sns/R$layout;->sns_picker_multiselect_dialog:I

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 7
    move-result-object p1

    .line 8
    move-object v1, p1

    .line 9
    .line 10
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSBottomSheetView;

    .line 11
    .line 12
    sget p2, Lcom/sumsub/sns/R$id;->sns_confirm:I

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 16
    move-result-object p3

    .line 17
    move-object v2, p3

    .line 18
    .line 19
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sget p2, Lcom/sumsub/sns/R$id;->sns_editor_layout:I

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 27
    move-result-object p3

    .line 28
    move-object v3, p3

    .line 29
    .line 30
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 31
    .line 32
    if-eqz v3, :cond_0

    .line 33
    .line 34
    sget p2, Lcom/sumsub/sns/R$id;->sns_list:I

    .line 35
    .line 36
    .line 37
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 38
    move-result-object p3

    .line 39
    move-object v4, p3

    .line 40
    .line 41
    check-cast v4, Landroidx/recyclerview/widget/RecyclerView;

    .line 42
    .line 43
    if-eqz v4, :cond_0

    .line 44
    .line 45
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 46
    .line 47
    .line 48
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 49
    move-result-object p3

    .line 50
    move-object v5, p3

    .line 51
    .line 52
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 53
    .line 54
    if-eqz v5, :cond_0

    .line 55
    .line 56
    new-instance v0, Lcom/sumsub/sns/databinding/C;

    .line 57
    .line 58
    .line 59
    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/databinding/C;-><init>(Lcom/sumsub/sns/core/widget/SNSBottomSheetView;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Lcom/sumsub/sns/core/widget/SNSTextInputLayout;Landroidx/recyclerview/widget/RecyclerView;Lcom/sumsub/sns/core/widget/SNSToolbarView;)V

    .line 60
    .line 61
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/c;->a:Lcom/sumsub/sns/databinding/C;

    .line 62
    return-object v1

    .line 63
    .line 64
    .line 65
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    new-instance p2, Ljava/lang/NullPointerException;

    .line 73
    .line 74
    const-string p3, "Missing required view with ID: "

    .line 75
    .line 76
    .line 77
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    .line 81
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 82
    throw p2
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

.method public final onDestroyView()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/fragment/app/DialogFragment;->onDestroyView()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/c;->a:Lcom/sumsub/sns/databinding/C;

    .line 7
    return-void
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
