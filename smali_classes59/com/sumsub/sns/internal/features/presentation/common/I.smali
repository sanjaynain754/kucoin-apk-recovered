.class public final Lcom/sumsub/sns/internal/features/presentation/common/I;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

.field public final b:Lkotlin/jvm/functions/Function0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/I;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/common/I;->b:Lkotlin/jvm/functions/Function0;

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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/common/I;)Lkotlin/Unit;
    .locals 0

    .line 30
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/common/I;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->hide()V

    .line 31
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/common/I;Z)Lkotlin/Unit;
    .locals 0

    if-nez p1, :cond_0

    .line 32
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/common/I;->b:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 33
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/I;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    sget v1, Lcom/sumsub/sns/R$layout;->sns_warning_bottom_sheet:I

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->inflate(I)Landroid/view/View;

    move-result-object v0

    .line 2
    sget v1, Lcom/sumsub/sns/R$id;->sns_handle:I

    .line 3
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/core/widget/SNSBottomSheetHandleView;

    if-eqz v2, :cond_5

    .line 4
    sget v1, Lcom/sumsub/sns/R$id;->sns_warning_icon:I

    .line 5
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Landroid/widget/ImageView;

    if-eqz v2, :cond_5

    .line 6
    sget v1, Lcom/sumsub/sns/R$id;->sns_warning_message:I

    .line 7
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    if-eqz v3, :cond_5

    .line 8
    sget v1, Lcom/sumsub/sns/R$id;->sns_warning_primary_button:I

    .line 9
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/core/widget/SNSSecondaryButton;

    if-eqz v4, :cond_5

    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/common/I;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v0

    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->WARNING_OUTLINE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v1

    .line 11
    sget-object v5, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v6

    invoke-interface {v6, v0, v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v0

    .line 12
    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 13
    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-interface {v0}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    instance-of v5, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v5, :cond_1

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_1

    :cond_1
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_4

    .line 14
    sget-object v5, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_CRITICAL:Lcom/sumsub/sns/core/theme/SNSColorElement;

    iget-object v6, p0, Lcom/sumsub/sns/internal/features/presentation/common/I;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 15
    invoke-virtual {v6}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object v6

    invoke-virtual {v6}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object v6

    invoke-static {v6}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result v6

    .line 16
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    if-eqz v0, :cond_3

    .line 17
    invoke-virtual {v5}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    move-result-object v5

    invoke-interface {v0, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    if-eqz v0, :cond_3

    if-eqz v6, :cond_2

    .line 18
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    goto :goto_2

    .line 19
    :cond_2
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    :cond_3
    :goto_2
    if-eqz v1, :cond_4

    .line 20
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v0

    .line 21
    invoke-static {v0}, Landroid/content/res/ColorStateList;->valueOf(I)Landroid/content/res/ColorStateList;

    move-result-object v0

    invoke-virtual {v2, v0}, Landroid/widget/ImageView;->setImageTintList(Landroid/content/res/ColorStateList;)V

    .line 22
    :cond_4
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    invoke-virtual {v4, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/common/b0;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/common/b0;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/I;)V

    invoke-static {p1, v4}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 25
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/I;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/common/c0;

    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/common/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/common/I;)V

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->setStateCallback(Lkotlin/jvm/functions/Function1;)V

    .line 26
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/I;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->setDismissOnTouchOutside(Z)V

    .line 27
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/I;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->show()V

    return-void

    .line 28
    :cond_5
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    .line 29
    new-instance p2, Ljava/lang/NullPointerException;

    const-string v0, "Missing required view with ID: "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
