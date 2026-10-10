.class public final Lcom/sumsub/sns/core/presentation/intro/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

.field public final b:Lcom/sumsub/sns/internal/core/common/u0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/extensions/a;Lcom/sumsub/sns/internal/core/common/u0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/intro/a;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/sumsub/sns/core/presentation/intro/a;->b:Lcom/sumsub/sns/internal/core/common/u0;

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

.method public static final a(Lcom/sumsub/sns/core/presentation/intro/a;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 15
    iget-object p0, p0, Lcom/sumsub/sns/core/presentation/intro/a;->b:Lcom/sumsub/sns/internal/core/common/u0;

    if-eqz p0, :cond_0

    .line 16
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Ljava/lang/String;Z)V

    .line 17
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final b(Lcom/sumsub/sns/core/presentation/intro/a;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 8
    iget-object p0, p0, Lcom/sumsub/sns/core/presentation/intro/a;->b:Lcom/sumsub/sns/internal/core/common/u0;

    if-eqz p0, :cond_0

    .line 9
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Ljava/lang/String;Z)V

    .line 10
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;)Lcom/sumsub/sns/core/widget/SNSH2TextView;
    .locals 7

    .line 1
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSH2TextView;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/SNSH2TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/intro/a;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast p1, Lcom/sumsub/sns/internal/core/domain/d;

    .line 3
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 4
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 5
    invoke-static {p2, p1}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object p1

    .line 6
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    new-instance p1, Lcom/sumsub/sns/core/presentation/intro/c;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/core/presentation/intro/c;-><init>(Lcom/sumsub/sns/core/presentation/intro/a;)V

    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 8
    sget-object p1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object p1

    const/4 p2, 0x0

    if-eqz p1, :cond_0

    invoke-interface {p1}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, p2

    :goto_0
    instance-of v1, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_1

    :cond_1
    move-object p1, p2

    :goto_1
    if-eqz p1, :cond_5

    .line 9
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSMetricElement;->SCREEN_HEADER_ALIGNMENT:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 10
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    if-eqz p1, :cond_2

    .line 11
    invoke-virtual {v1}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    goto :goto_2

    :cond_2
    move-object p1, p2

    :goto_2
    instance-of v1, p1, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    if-eqz v1, :cond_3

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    goto :goto_3

    :cond_3
    move-object p1, p2

    :goto_3
    if-eqz p1, :cond_4

    .line 12
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/theme/h;->a:Ljava/lang/String;

    :cond_4
    if-nez p2, :cond_6

    .line 13
    :cond_5
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->CENTER:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    invoke-virtual {p1}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->getValue()Ljava/lang/String;

    move-result-object p2

    .line 14
    :cond_6
    invoke-static {v0, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    return-object v0
.end method

.method public final a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)Lcom/sumsub/sns/core/widget/SNSIntroItemView;
    .locals 7

    .line 18
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSIntroItemView;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/SNSIntroItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    if-eqz p3, :cond_0

    .line 19
    iget-object v2, p0, Lcom/sumsub/sns/core/presentation/intro/a;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast v2, Lcom/sumsub/sns/internal/core/domain/d;

    .line 20
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 21
    iget-object v2, v2, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 22
    invoke-static {p3, v2}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object p3

    goto :goto_0

    :cond_0
    move-object p3, p1

    .line 23
    :goto_0
    invoke-virtual {v0, p3}, Lcom/sumsub/sns/core/widget/SNSStepView;->setTitle(Ljava/lang/CharSequence;)V

    if-eqz p4, :cond_1

    .line 24
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/intro/a;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast p1, Lcom/sumsub/sns/internal/core/domain/d;

    .line 25
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 26
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 27
    invoke-static {p4, p1}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object p1

    .line 28
    :cond_1
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/widget/SNSStepView;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 29
    sget-object p1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object p1

    invoke-interface {p1, v1, p2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/widget/SNSStepView;->setIconStart(Landroid/graphics/drawable/Drawable;)V

    .line 30
    invoke-static {v0, p5}, Lcom/sumsub/sns/core/widget/SNSStepViewExtensionsKt;->setSnsStepState(Landroid/view/View;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    return-object v0
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;)Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;
    .locals 7

    .line 1
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    const/16 v5, 0xe

    const/4 v6, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object v1, p1

    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-eqz p2, :cond_0

    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/intro/a;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast p1, Lcom/sumsub/sns/internal/core/domain/d;

    .line 3
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 4
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 5
    invoke-static {p2, p1}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object p1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    .line 6
    :goto_0
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 7
    new-instance p1, Lcom/sumsub/sns/core/presentation/intro/d;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/core/presentation/intro/d;-><init>(Lcom/sumsub/sns/core/presentation/intro/a;)V

    invoke-static {v0, p1}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    return-object v0
.end method
