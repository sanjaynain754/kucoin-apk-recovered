.class public abstract Lcom/sumsub/sns/core/presentation/helper/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# direct methods
.method public static a(ZLjava/lang/Integer;Landroid/content/res/ColorStateList;)Landroid/content/res/ColorStateList;
    .locals 13

    .line 19
    invoke-static {}, Lcom/sumsub/sns/core/presentation/helper/a;->a()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_c

    const v2, -0xff01

    if-nez p1, :cond_1

    .line 20
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_NEUTRAL:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {v0, p1, p0}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    move-result-object p1

    if-nez p1, :cond_1

    if-eqz p2, :cond_0

    .line 21
    sget p1, Lcom/sumsub/sns/R$attr;->sns_stateInit:I

    filled-new-array {p1}, [I

    move-result-object p1

    invoke-virtual {p2, p1, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    goto :goto_0

    :cond_0
    move-object p1, v1

    .line 22
    :cond_1
    :goto_0
    sget-object v3, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_WARNING:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {v0, v3, p0}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    move-result-object v4

    if-nez v4, :cond_3

    if-eqz p2, :cond_2

    .line 23
    sget v4, Lcom/sumsub/sns/R$attr;->sns_statePending:I

    filled-new-array {v4}, [I

    move-result-object v4

    invoke-virtual {p2, v4, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    goto :goto_1

    :cond_2
    move-object v4, v1

    :goto_1
    if-nez v4, :cond_3

    move-object v4, p1

    .line 24
    :cond_3
    sget-object v5, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_SUCCESS:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {v0, v5, p0}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    move-result-object v5

    if-nez v5, :cond_5

    if-eqz p2, :cond_4

    .line 25
    sget v5, Lcom/sumsub/sns/R$attr;->sns_stateApproved:I

    filled-new-array {v5}, [I

    move-result-object v5

    invoke-virtual {p2, v5, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    goto :goto_2

    :cond_4
    move-object v5, v1

    :goto_2
    if-nez v5, :cond_5

    move-object v5, p1

    .line 26
    :cond_5
    sget-object v6, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_CRITICAL:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {v0, v6, p0}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    move-result-object v6

    if-nez v6, :cond_7

    if-eqz p2, :cond_6

    .line 27
    sget v6, Lcom/sumsub/sns/R$attr;->sns_stateRejected:I

    filled-new-array {v6}, [I

    move-result-object v6

    invoke-virtual {p2, v6, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    goto :goto_3

    :cond_6
    move-object v6, v1

    :goto_3
    if-nez v6, :cond_7

    move-object v6, p1

    .line 28
    :cond_7
    invoke-static {v0, v3, p0}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    move-result-object v3

    if-nez v3, :cond_9

    if-eqz p2, :cond_8

    .line 29
    sget v3, Lcom/sumsub/sns/R$attr;->sns_stateProcessing:I

    filled-new-array {v3}, [I

    move-result-object v3

    invoke-virtual {p2, v3, v2}, Landroid/content/res/ColorStateList;->getColorForState([II)I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    move-object v3, v2

    goto :goto_4

    :cond_8
    move-object v3, v1

    :goto_4
    if-nez v3, :cond_9

    move-object v3, p1

    .line 30
    :cond_9
    sget-object v2, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_WEAK:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {v0, v2, p0}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;

    move-result-object p0

    if-nez p0, :cond_b

    if-eqz p2, :cond_a

    .line 31
    invoke-virtual {p2}, Landroid/content/res/ColorStateList;->getDefaultColor()I

    move-result p0

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    goto :goto_5

    :cond_a
    move-object p0, v1

    :goto_5
    if-nez p0, :cond_b

    move-object p0, p1

    :cond_b
    if-eqz p1, :cond_c

    .line 32
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v7

    .line 33
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v8

    .line 34
    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v9

    .line 35
    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v10

    .line 36
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v11

    .line 37
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result v12

    filled-new-array/range {v7 .. v12}, [I

    move-result-object p0

    .line 38
    new-instance p1, Landroid/content/res/ColorStateList;

    .line 39
    sget p2, Lcom/sumsub/sns/R$attr;->sns_stateInit:I

    filled-new-array {p2}, [I

    move-result-object v0

    .line 40
    sget p2, Lcom/sumsub/sns/R$attr;->sns_statePending:I

    filled-new-array {p2}, [I

    move-result-object v1

    .line 41
    sget p2, Lcom/sumsub/sns/R$attr;->sns_stateApproved:I

    filled-new-array {p2}, [I

    move-result-object v2

    .line 42
    sget p2, Lcom/sumsub/sns/R$attr;->sns_stateRejected:I

    filled-new-array {p2}, [I

    move-result-object v3

    .line 43
    sget p2, Lcom/sumsub/sns/R$attr;->sns_stateProcessing:I

    filled-new-array {p2}, [I

    move-result-object v4

    const/4 p2, 0x0

    .line 44
    new-array v5, p2, [I

    filled-new-array/range {v0 .. v5}, [[I

    move-result-object p2

    .line 45
    invoke-direct {p1, p2, p0}, Landroid/content/res/ColorStateList;-><init>([[I[I)V

    return-object p1

    :cond_c
    return-object v1
.end method

.method public static a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Ljava/lang/String;Ljava/lang/String;)Landroid/graphics/drawable/BitmapDrawable;
    .locals 1

    .line 9
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->e:Ljava/util/Map;

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 10
    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    instance-of p2, p0, Lcom/sumsub/sns/internal/core/presentation/theme/f;

    if-eqz p2, :cond_1

    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/theme/f;

    goto :goto_1

    :cond_1
    move-object p0, v0

    :goto_1
    if-eqz p0, :cond_2

    .line 11
    iget-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/theme/f;->a:Ljava/util/LinkedHashMap;

    .line 12
    invoke-virtual {p2, p1}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/e;

    if-eqz p1, :cond_2

    .line 13
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/theme/e;->d:Landroid/graphics/Bitmap;

    goto :goto_2

    :cond_2
    move-object p1, v0

    :goto_2
    if-eqz p0, :cond_3

    .line 14
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/theme/f;->a:Ljava/util/LinkedHashMap;

    .line 15
    const-string p2, "default"

    invoke-virtual {p0, p2}, Ljava/util/LinkedHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/theme/e;

    if-eqz p0, :cond_3

    .line 16
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/theme/e;->d:Landroid/graphics/Bitmap;

    goto :goto_3

    :cond_3
    move-object p0, v0

    :goto_3
    if-nez p1, :cond_4

    move-object p1, p0

    :cond_4
    if-eqz p1, :cond_5

    .line 17
    new-instance p0, Landroid/graphics/drawable/BitmapDrawable;

    invoke-direct {p0, p1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V

    return-object p0

    :cond_5
    return-object v0
.end method

.method public static a()Lcom/sumsub/sns/internal/core/presentation/theme/p;
    .locals 3

    .line 1
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

    return-object v0

    :cond_1
    return-object v1
.end method

.method public static a(Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;
    .locals 1

    .line 18
    invoke-static {}, Lcom/sumsub/sns/core/presentation/helper/a;->a()Lcom/sumsub/sns/internal/core/presentation/theme/p;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {v0, p0}, Lcom/sumsub/sns/core/presentation/helper/a;->a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/Float;
    .locals 1

    .line 6
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 7
    invoke-virtual {p1}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    goto :goto_0

    :cond_0
    move-object p0, v0

    :goto_0
    instance-of p1, p0, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    if-eqz p1, :cond_1

    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    goto :goto_1

    :cond_1
    move-object p0, v0

    :goto_1
    if-eqz p0, :cond_2

    .line 8
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/theme/d;->a:Ljava/lang/Float;

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static a(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSColorElement;Z)Ljava/lang/Integer;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->c:Ljava/util/Map;

    if-eqz p0, :cond_1

    .line 3
    invoke-virtual {p1}, Lcom/sumsub/sns/core/theme/SNSColorElement;->getValue()Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/theme/c;

    if-eqz p0, :cond_1

    if-eqz p2, :cond_0

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->a:Ljava/lang/Integer;

    return-object p0

    .line 5
    :cond_0
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/theme/c;->b:Ljava/lang/Integer;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static b(Lcom/sumsub/sns/internal/core/presentation/theme/p;Lcom/sumsub/sns/core/theme/SNSMetricElement;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-eqz p0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    move-object p0, v0

    .line 18
    .line 19
    :goto_0
    instance-of p1, p0, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    .line 20
    .line 21
    if-eqz p1, :cond_1

    .line 22
    .line 23
    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    .line 24
    goto :goto_1

    .line 25
    :cond_1
    move-object p0, v0

    .line 26
    .line 27
    :goto_1
    if-eqz p0, :cond_2

    .line 28
    .line 29
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/theme/h;->a:Ljava/lang/String;

    .line 30
    return-object p0

    .line 31
    :cond_2
    return-object v0
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
