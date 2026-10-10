.class public abstract Lcom/sumsub/sns/internal/core/common/X;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static final a(FLjava/lang/Float;)F
    .locals 4

    const/4 v0, 0x0

    if-eqz p1, :cond_0

    .line 8
    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-static {v1}, Ljava/lang/Math;->abs(F)F

    move-result v2

    const v3, 0x7f7fffff    # Float.MAX_VALUE

    cmpg-float v2, v2, v3

    if-gtz v2, :cond_0

    cmpl-float v1, v1, v0

    if-lez v1, :cond_0

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    if-eqz p1, :cond_1

    cmpl-float v0, p0, v0

    if-lez v0, :cond_1

    .line 9
    sget-object v0, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    long-to-float v0, v0

    div-float/2addr p0, v0

    invoke-virtual {p1}, Ljava/lang/Float;->floatValue()F

    move-result p1

    div-float/2addr p0, p1

    return p0

    :cond_1
    const/high16 p0, 0x3f800000    # 1.0f

    return p0
.end method

.method public static final a(ILp1/b;)Ljava/lang/Integer;
    .locals 0

    .line 24
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public static final a(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/Float;)V
    .locals 3

    .line 1
    sget v0, Lcom/sumsub/sns/R$id;->sns_lottie_speed_listener:I

    invoke-virtual {p0, v0}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v1

    instance-of v2, v1, Lcom/airbnb/lottie/l0;

    if-eqz v2, :cond_0

    check-cast v1, Lcom/airbnb/lottie/l0;

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    if-eqz v1, :cond_1

    .line 2
    invoke-virtual {p0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->removeLottieOnCompositionLoadedListener(Lcom/airbnb/lottie/l0;)Z

    .line 3
    :cond_1
    new-instance v1, Lcom/sumsub/sns/internal/core/common/n1;

    invoke-direct {v1}, Lcom/sumsub/sns/internal/core/common/n1;-><init>()V

    .line 4
    new-instance v2, Lcom/sumsub/sns/internal/core/common/o1;

    invoke-direct {v2, p0, v1, p1}, Lcom/sumsub/sns/internal/core/common/o1;-><init>(Lcom/airbnb/lottie/LottieAnimationView;Lkotlin/jvm/functions/Function2;Ljava/lang/Float;)V

    .line 5
    invoke-virtual {p0, v0, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 6
    invoke-virtual {p0, v2}, Lcom/airbnb/lottie/LottieAnimationView;->addLottieOnCompositionLoadedListener(Lcom/airbnb/lottie/l0;)Z

    .line 7
    invoke-virtual {p0}, Lcom/airbnb/lottie/LottieAnimationView;->getComposition()Lcom/airbnb/lottie/h;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Lcom/airbnb/lottie/h;->d()F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-interface {v1, v0, p1}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setSpeed(F)V

    :cond_2
    return-void
.end method

.method public static final a(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;I)V
    .locals 2

    .line 23
    new-instance v0, Lh1/d;

    const-string v1, "**"

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lh1/d;-><init>([Ljava/lang/String;)V

    sget-object p1, Lcom/airbnb/lottie/m0;->a:Ljava/lang/Integer;

    new-instance v1, Lcom/sumsub/sns/internal/core/common/p1;

    invoke-direct {v1, p2}, Lcom/sumsub/sns/internal/core/common/p1;-><init>(I)V

    invoke-virtual {p0, v0, p1, v1}, Lcom/airbnb/lottie/LottieAnimationView;->addValueCallback(Lh1/d;Ljava/lang/Object;Lp1/e;)V

    return-void
.end method

.method public static a(Lcom/airbnb/lottie/LottieAnimationView;Ljava/lang/String;Ljava/lang/CharSequence;)V
    .locals 5

    .line 11
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->CAPTION:Lcom/sumsub/sns/core/theme/SNSTypographyElement;

    .line 12
    sget v1, Lcom/sumsub/sns/R$id;->sns_lottie_text_delegate:I

    invoke-virtual {p0, v1}, Landroid/view/View;->getTag(I)Ljava/lang/Object;

    move-result-object v2

    instance-of v3, v2, Lcom/airbnb/lottie/t0;

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    check-cast v2, Lcom/airbnb/lottie/t0;

    goto :goto_0

    :cond_0
    move-object v2, v4

    :goto_0
    if-nez v2, :cond_4

    .line 13
    new-instance v2, Lcom/airbnb/lottie/t0;

    invoke-direct {v2, p0}, Lcom/airbnb/lottie/t0;-><init>(Lcom/airbnb/lottie/LottieAnimationView;)V

    .line 14
    invoke-virtual {p0, v1, v2}, Landroid/view/View;->setTag(ILjava/lang/Object;)V

    .line 15
    invoke-virtual {p0, v2}, Lcom/airbnb/lottie/LottieAnimationView;->setTextDelegate(Lcom/airbnb/lottie/t0;)V

    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-interface {v1}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object v1

    goto :goto_1

    :cond_1
    move-object v1, v4

    :goto_1
    instance-of v3, v1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v3, :cond_2

    move-object v4, v1

    check-cast v4, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    :cond_2
    if-eqz v4, :cond_3

    .line 17
    iget-object v1, v4, Lcom/sumsub/sns/internal/core/presentation/theme/p;->b:Ljava/util/Map;

    if-eqz v1, :cond_3

    .line 18
    invoke-virtual {v0}, Lcom/sumsub/sns/core/theme/SNSTypographyElement;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {v1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/theme/i;

    if-eqz v0, :cond_3

    .line 19
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/theme/i;->d:Landroid/graphics/Typeface;

    if-eqz v0, :cond_3

    goto :goto_2

    .line 20
    :cond_3
    sget-object v0, Landroid/graphics/Typeface;->SANS_SERIF:Landroid/graphics/Typeface;

    .line 21
    :goto_2
    new-instance v1, Lcom/sumsub/sns/internal/core/common/W;

    invoke-direct {v1, v0}, Lcom/sumsub/sns/internal/core/common/W;-><init>(Landroid/graphics/Typeface;)V

    invoke-virtual {p0, v1}, Lcom/airbnb/lottie/LottieAnimationView;->setFontAssetDelegate(Lcom/airbnb/lottie/a;)V

    .line 22
    :cond_4
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v2, p0, p1}, Lcom/airbnb/lottie/t0;->e(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public static final a(Lcom/airbnb/lottie/LottieAnimationView;Lkotlin/jvm/functions/Function2;Ljava/lang/Float;Lcom/airbnb/lottie/h;)V
    .locals 0

    .line 10
    invoke-virtual {p3}, Lcom/airbnb/lottie/h;->d()F

    move-result p3

    invoke-static {p3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p3

    invoke-interface {p1, p3, p2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Number;

    invoke-virtual {p1}, Ljava/lang/Number;->floatValue()F

    move-result p1

    invoke-virtual {p0, p1}, Lcom/airbnb/lottie/LottieAnimationView;->setSpeed(F)V

    return-void
.end method
