.class public final Lcom/sumsub/sns/internal/features/presentation/status/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

.field public final b:Lkotlin/jvm/functions/Function0;

.field public final c:Lkotlin/jvm/functions/Function1;

.field public final d:Lcom/sumsub/sns/internal/core/analytics/f;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->b:Lkotlin/jvm/functions/Function0;

    .line 8
    .line 9
    iput-object p3, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->c:Lkotlin/jvm/functions/Function1;

    .line 10
    .line 11
    new-instance p1, Lcom/sumsub/sns/internal/core/analytics/f;

    .line 12
    .line 13
    sget-object p2, Lcom/sumsub/sns/internal/core/analytics/Screen;->StatusScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 14
    .line 15
    const-string p3, "Status"

    .line 16
    .line 17
    .line 18
    invoke-direct {p1, p2, p3}, Lcom/sumsub/sns/internal/core/analytics/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;)V

    .line 19
    .line 20
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->d:Lcom/sumsub/sns/internal/core/analytics/f;

    .line 21
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/a;)Lkotlin/Unit;
    .locals 5

    .line 33
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->d:Lcom/sumsub/sns/internal/core/analytics/f;

    .line 34
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->AcceptButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 35
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Popup;->AgreementsPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    const/4 v3, 0x0

    const/4 v4, 0x2

    .line 36
    invoke-static {v0, v1, v3, v2, v4}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 37
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->hide()V

    .line 38
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->b:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/a;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 32
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->c:Lkotlin/jvm/functions/Function1;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/status/a;Z)Lkotlin/Unit;
    .locals 2

    if-eqz p1, :cond_0

    .line 40
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->d:Lcom/sumsub/sns/internal/core/analytics/f;

    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/Popup;->AgreementsPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 41
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 42
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/analytics/f;->b:Ljava/lang/String;

    iget-object p0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->c:Ljava/util/Map;

    invoke-static {v0, v1, p0, p1}, Lcom/sumsub/sns/internal/core/analytics/f;->b(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    goto :goto_0

    .line 43
    :cond_0
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->d:Lcom/sumsub/sns/internal/core/analytics/f;

    sget-object p1, Lcom/sumsub/sns/internal/core/analytics/Popup;->AgreementsPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 44
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->a:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 45
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/analytics/f;->b:Ljava/lang/String;

    iget-object p0, p0, Lcom/sumsub/sns/internal/core/analytics/f;->c:Ljava/util/Map;

    invoke-static {v0, v1, p0, p1}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 46
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)V
    .locals 5

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    sget v1, Lcom/sumsub/sns/R$layout;->sns_agreement_bottom_sheet:I

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->inflate(I)Landroid/view/View;

    move-result-object v0

    .line 2
    sget v1, Lcom/sumsub/sns/R$id;->sns_agreement_button:I

    .line 3
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    if-eqz v2, :cond_6

    .line 4
    sget v1, Lcom/sumsub/sns/R$id;->sns_agreement_handle:I

    .line 5
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/ImageView;

    if-eqz v3, :cond_6

    .line 6
    sget v1, Lcom/sumsub/sns/R$id;->sns_agreement_powered:I

    .line 7
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    if-eqz v3, :cond_6

    .line 8
    sget v1, Lcom/sumsub/sns/R$id;->sns_agreement_scroll:I

    .line 9
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/core/widget/NestedScrollView;

    if-eqz v4, :cond_6

    .line 10
    sget v1, Lcom/sumsub/sns/R$id;->sns_agreement_text:I

    .line 11
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    if-eqz v4, :cond_6

    .line 12
    invoke-virtual {v4, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 13
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/status/c0;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/status/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/a;)V

    invoke-static {v4, p1}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 14
    invoke-virtual {v2, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 15
    new-instance p1, Lcom/sumsub/sns/internal/features/presentation/status/d0;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/features/presentation/status/d0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/a;)V

    invoke-static {p1, v2}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 16
    invoke-virtual {v3, p3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p4, :cond_0

    const/16 p1, 0x8

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 17
    :goto_0
    invoke-virtual {v3, p1}, Landroid/view/View;->setVisibility(I)V

    .line 18
    sget-object p1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_1

    invoke-interface {p1}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, p2

    :goto_1
    instance-of p3, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz p3, :cond_2

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_2

    :cond_2
    move-object p1, p2

    :goto_2
    if-eqz p1, :cond_5

    .line 19
    sget-object p3, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_WEAK:Lcom/sumsub/sns/core/theme/SNSColorElement;

    .line 20
    invoke-virtual {v3}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p4

    invoke-virtual {p4}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;

    move-result-object p4

    invoke-static {p4}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/content/res/Configuration;)Z

    move-result p4

    .line 21
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    if-eqz p1, :cond_4

    .line 22
    invoke-virtual {p3}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    move-result-object p3

    invoke-interface {p1, p3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    if-eqz p1, :cond_4

    if-eqz p4, :cond_3

    .line 23
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    goto :goto_3

    .line 24
    :cond_3
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    :cond_4
    :goto_3
    if-eqz p2, :cond_5

    .line 25
    invoke-virtual {p2}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 26
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 27
    :cond_5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/status/e0;

    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/status/e0;-><init>(Lcom/sumsub/sns/internal/features/presentation/status/a;)V

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->setStateCallback(Lkotlin/jvm/functions/Function1;)V

    .line 28
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    const/4 p2, 0x1

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->setDismissOnTouchOutside(Z)V

    .line 29
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/status/a;->a:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->show()V

    return-void

    .line 30
    :cond_6
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    .line 31
    new-instance p2, Ljava/lang/NullPointerException;

    const-string p3, "Missing required view with ID: "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
.end method
