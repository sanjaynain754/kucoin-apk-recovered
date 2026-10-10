.class public abstract Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# static fields
.field public static final j:Landroid/graphics/RectF;


# instance fields
.field public e:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

.field public final f:Ljava/util/ArrayList;

.field public final g:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/f;

.field public final h:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/g;

.field public final i:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroid/graphics/RectF;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->j:Landroid/graphics/RectF;

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
.end method

.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/l;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 2
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->f:Ljava/util/ArrayList;

    .line 3
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/f;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/f;-><init>(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;)V

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->g:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/f;

    .line 4
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/g;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/g;-><init>(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;)V

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->h:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/g;

    .line 5
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;-><init>(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;)V

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->i:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/w;)V
    .locals 1

    .line 6
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-direct {p0, v0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 7
    new-instance p1, Ljava/util/ArrayList;

    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->f:Ljava/util/ArrayList;

    .line 8
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/f;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/f;-><init>(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;)V

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->g:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/f;

    .line 9
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/g;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/g;-><init>(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;)V

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->h:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/g;

    .line 10
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;-><init>(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;)V

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->i:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;)Landroid/view/View;
    .locals 0

    .line 33
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->e:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    if-eqz p0, :cond_0

    .line 34
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;Landroidx/lifecycle/LifecycleOwner;)Lkotlin/Unit;
    .locals 0

    if-eqz p1, :cond_0

    .line 66
    invoke-interface {p1}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object p1

    if-eqz p1, :cond_0

    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->h:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/g;

    invoke-virtual {p1, p0}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 67
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static a(Lcom/google/android/material/bottomsheet/BottomSheetDialog;)V
    .locals 1

    .line 35
    invoke-virtual {p0}, Landroid/app/Dialog;->getWindow()Landroid/view/Window;

    move-result-object p0

    if-eqz p0, :cond_0

    const v0, 0x3dcccccd    # 0.1f

    invoke-virtual {p0, v0}, Landroid/view/Window;->setDimAmount(F)V

    :cond_0
    return-void
.end method

.method public static a(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;Lcom/sumsub/sns/internal/core/analytics/Control;)V
    .locals 6

    .line 36
    invoke-static {}, Lkotlin/collections/MapsKt;->emptyMap()Ljava/util/Map;

    move-result-object v4

    .line 37
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->o()Lcom/sumsub/sns/internal/core/presentation/bottomsheet/c;

    move-result-object v0

    .line 38
    instance-of v1, v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/b;

    if-eqz v1, :cond_0

    .line 39
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v1

    .line 40
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/b;

    .line 41
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/b;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 42
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p0

    .line 43
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/analytics/f;->b:Ljava/lang/String;

    const/16 v5, 0x10

    move-object v3, v1

    move-object v1, v0

    move-object v0, v3

    move-object v3, p1

    .line 44
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    return-void

    :cond_0
    move-object v3, p1

    .line 45
    instance-of p1, v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;

    if-eqz p1, :cond_1

    .line 46
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p0

    .line 47
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;

    .line 48
    iget-object p1, v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/a;->a:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 49
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 50
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->b:Ljava/lang/String;

    .line 51
    invoke-static {v0, p0, v3, v4, p1}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    return-void

    .line 52
    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final b(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;)Landroid/view/View;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->e:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    if-eqz p0, :cond_0

    .line 2
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method


# virtual methods
.method public abstract a(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroid/view/View;
.end method

.method public final a(Lkotlin/jvm/functions/Function1;)Lcom/sumsub/sns/internal/core/presentation/common/j;
    .locals 2

    .line 53
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/common/j;

    .line 54
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/m;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/m;-><init>(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;)V

    .line 55
    invoke-direct {v0, p1, v1}, Lcom/sumsub/sns/internal/core/presentation/common/j;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V

    .line 56
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->f:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final a(Landroid/widget/FrameLayout;)V
    .locals 7

    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v0}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v2, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v2, :cond_1

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    .line 3
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSColorElement;->BOTTOM_SHEET_BACKGROUND:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 4
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v3

    invoke-static {v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result v3

    .line 5
    iget-object v4, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    if-eqz v4, :cond_3

    .line 6
    invoke-virtual {v2}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v4, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    if-eqz v2, :cond_3

    if-eqz v3, :cond_2

    .line 7
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    goto :goto_2

    .line 8
    :cond_2
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    goto :goto_2

    :cond_3
    move-object v2, v1

    :goto_2
    if-eqz v0, :cond_6

    .line 9
    sget-object v3, Lcom/sumsub/sns/core/theme/SNSMetricElement;->BOTTOM_SHEET_CORNER_RADIUS:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    if-eqz v0, :cond_4

    .line 11
    invoke-virtual {v3}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    move-result-object v3

    invoke-interface {v0, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    goto :goto_3

    :cond_4
    move-object v0, v1

    :goto_3
    instance-of v3, v0, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    if-eqz v3, :cond_5

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    goto :goto_4

    :cond_5
    move-object v0, v1

    :goto_4
    if-eqz v0, :cond_6

    .line 12
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/d;->a:Ljava/lang/Float;

    goto :goto_5

    :cond_6
    move-object v0, v1

    .line 13
    :goto_5
    invoke-virtual {p1}, Landroid/view/View;->getBackground()Landroid/graphics/drawable/Drawable;

    move-result-object v3

    instance-of v4, v3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    if-eqz v4, :cond_7

    check-cast v3, Lcom/google/android/material/shape/MaterialShapeDrawable;

    goto :goto_6

    :cond_7
    move-object v3, v1

    :goto_6
    const/4 v4, 0x0

    if-nez v3, :cond_8

    if-eqz v2, :cond_d

    .line 14
    invoke-virtual {p1, v4}, Landroid/view/View;->setBackgroundColor(I)V

    return-void

    :cond_8
    if-nez v0, :cond_a

    .line 15
    new-instance p1, Landroid/util/TypedValue;

    invoke-direct {p1}, Landroid/util/TypedValue;-><init>()V

    .line 16
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    .line 18
    sget v5, Lcom/google/android/material/R$attr;->shapeAppearanceMediumComponent:I

    const/4 v6, 0x1

    .line 19
    invoke-virtual {v0, v5, p1, v6}, Landroid/content/res/Resources$Theme;->resolveAttribute(ILandroid/util/TypedValue;Z)Z

    move-result v0

    if-nez v0, :cond_9

    move-object v0, v1

    goto :goto_7

    .line 20
    :cond_9
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    .line 21
    iget p1, p1, Landroid/util/TypedValue;->resourceId:I

    invoke-static {v0, p1, v4}, Lcom/google/android/material/shape/ShapeAppearanceModel;->builder(Landroid/content/Context;II)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->build()Lcom/google/android/material/shape/ShapeAppearanceModel;

    move-result-object p1

    .line 22
    invoke-virtual {p1}, Lcom/google/android/material/shape/ShapeAppearanceModel;->getTopLeftCornerSize()Lcom/google/android/material/shape/CornerSize;

    move-result-object p1

    sget-object v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->j:Landroid/graphics/RectF;

    invoke-interface {p1, v0}, Lcom/google/android/material/shape/CornerSize;->getCornerSize(Landroid/graphics/RectF;)F

    move-result p1

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :cond_a
    :goto_7
    if-eqz v0, :cond_b

    .line 23
    invoke-virtual {v3}, Lcom/google/android/material/shape/MaterialShapeDrawable;->getShapeAppearanceModel()Lcom/google/android/material/shape/ShapeAppearanceModel;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/shape/ShapeAppearanceModel;->toBuilder()Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object p1

    .line 24
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v5

    invoke-virtual {p1, v4, v5}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->setTopLeftCorner(IF)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object p1

    .line 25
    invoke-virtual {v0}, Ljava/lang/Float;->floatValue()F

    move-result v0

    invoke-virtual {p1, v4, v0}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->setTopRightCorner(IF)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object p1

    const/4 v0, 0x0

    .line 26
    invoke-virtual {p1, v4, v0}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->setBottomLeftCorner(IF)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object p1

    .line 27
    invoke-virtual {p1, v4, v0}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->setBottomRightCorner(IF)Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;

    move-result-object p1

    .line 28
    invoke-virtual {p1}, Lcom/google/android/material/shape/ShapeAppearanceModel$Builder;->build()Lcom/google/android/material/shape/ShapeAppearanceModel;

    move-result-object p1

    .line 29
    invoke-virtual {v3, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setShapeAppearanceModel(Lcom/google/android/material/shape/ShapeAppearanceModel;)V

    :cond_b
    if-eqz v2, :cond_d

    .line 30
    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-static {p1}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object p1

    invoke-virtual {v3, p1}, Lcom/google/android/material/shape/MaterialShapeDrawable;->setFillColor(Landroid/content/res/ColorStateList;)V

    .line 31
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->e:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    if-eqz p1, :cond_c

    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object p1

    goto :goto_8

    :cond_c
    move-object p1, v1

    :goto_8
    if-eqz p1, :cond_d

    .line 32
    invoke-virtual {p1, v1}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    :cond_d
    return-void
.end method

.method public a(Lcom/google/android/material/bottomsheet/BottomSheetBehavior;)V
    .locals 0

    .line 1
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;)V
    .locals 3

    .line 57
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->e:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    if-ne v0, p1, :cond_0

    return-void

    :cond_0
    if-eqz v0, :cond_1

    const/4 v1, 0x0

    .line 58
    iput-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;->a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;

    .line 59
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v1

    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->g:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/f;

    invoke-virtual {v1, v2}, Landroidx/lifecycle/Lifecycle;->removeObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 60
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getView()Landroid/view/View;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    move-result-object v0

    invoke-interface {v0}, Landroidx/lifecycle/LifecycleOwner;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v0

    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->h:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/g;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle;->removeObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 61
    :cond_1
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->e:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    .line 62
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->i:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;

    .line 63
    iput-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;->a:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/e;

    .line 64
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getLifecycle()Landroidx/lifecycle/Lifecycle;

    move-result-object v0

    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->g:Lcom/sumsub/sns/internal/core/presentation/bottomsheet/f;

    invoke-virtual {v0, v1}, Landroidx/lifecycle/Lifecycle;->addObserver(Landroidx/lifecycle/LifecycleObserver;)V

    .line 65
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwnerLiveData()Landroidx/lifecycle/LiveData;

    move-result-object v0

    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/k;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/k;-><init>(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;)V

    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/h;

    invoke-direct {v2, v1}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/h;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v0, p1, v2}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    return-void
.end method

.method public final b(I)Lcom/sumsub/sns/internal/core/presentation/common/k;
    .locals 2

    .line 3
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/common/k;

    .line 4
    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/l;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/l;-><init>(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;)V

    .line 5
    invoke-direct {v0, p1, v1}, Lcom/sumsub/sns/internal/core/presentation/common/k;-><init>(ILkotlin/jvm/functions/Function0;)V

    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->f:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    return-object v0
.end method

.method public final i()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->executePendingTransactions()Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->n()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    instance-of v1, v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    .line 27
    :goto_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->a(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;)V

    .line 31
    :cond_1
    return-void
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

.method public final l()V
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

.method public final m()V
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

.method public abstract n()Ljava/lang/String;
.end method

.method public abstract o()Lcom/sumsub/sns/internal/core/presentation/bottomsheet/c;
.end method

.method public abstract p()V
.end method

.method public q()V
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

.method public final r()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->executePendingTransactions()Z

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->n()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Landroidx/fragment/app/FragmentManager;->findFragmentByTag(Ljava/lang/String;)Landroidx/fragment/app/Fragment;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    instance-of v1, v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    const/4 v0, 0x0

    .line 26
    .line 27
    :goto_0
    if-eqz v0, :cond_1

    .line 28
    .line 29
    const-string v0, "Bottom sheet already visible"

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V

    .line 33
    return-void

    .line 34
    .line 35
    :cond_1
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;

    .line 36
    .line 37
    .line 38
    invoke-direct {v0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;-><init>()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->a(Lcom/sumsub/sns/internal/core/presentation/bottomsheet/d;)V

    .line 42
    .line 43
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/bottomsheet/i;->n()Ljava/lang/String;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1, v2}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 55
    .line 56
    const-string v0, "Showing bottom sheet"

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V

    .line 60
    return-void
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
