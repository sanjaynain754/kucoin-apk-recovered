.class public final Lcom/sumsub/sns/core/presentation/intro/b;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

.field public final b:Z

.field public final c:Lcom/sumsub/sns/internal/core/common/u0;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/extensions/a;Lcom/sumsub/sns/internal/core/common/u0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/intro/b;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    const/4 p1, 0x0

    .line 3
    iput-boolean p1, p0, Lcom/sumsub/sns/core/presentation/intro/b;->b:Z

    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/core/presentation/intro/b;->c:Lcom/sumsub/sns/internal/core/common/u0;

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/data/repository/extensions/a;Lcom/sumsub/sns/internal/core/common/u0;I)V
    .locals 0

    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/sumsub/sns/core/presentation/intro/b;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    const/4 p1, 0x1

    .line 7
    iput-boolean p1, p0, Lcom/sumsub/sns/core/presentation/intro/b;->b:Z

    .line 8
    iput-object p2, p0, Lcom/sumsub/sns/core/presentation/intro/b;->c:Lcom/sumsub/sns/internal/core/common/u0;

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/core/presentation/intro/b;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 158
    iget-object p0, p0, Lcom/sumsub/sns/core/presentation/intro/b;->c:Lcom/sumsub/sns/internal/core/common/u0;

    if-eqz p0, :cond_0

    .line 159
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Ljava/lang/String;Z)V

    .line 160
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static a(Lcom/sumsub/sns/core/presentation/intro/b;Landroid/view/View;Ljava/util/Map;II)V
    .locals 34

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    const/4 v3, 0x1

    .line 1
    sget v4, Lcom/sumsub/sns/R$id;->sns_instructions_disclaimer:I

    .line 2
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v6

    if-nez v6, :cond_0

    goto/16 :goto_33

    .line 3
    :cond_0
    new-instance v12, Landroid/widget/LinearLayout;

    invoke-direct {v12, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    .line 4
    invoke-virtual {v12, v3}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 5
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v7, Lcom/sumsub/sns/R$dimen;->sns_margin_medium:I

    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v5

    const/4 v13, 0x0

    .line 6
    invoke-virtual {v12, v5, v13, v5, v13}, Landroid/view/View;->setPadding(IIII)V

    .line 7
    const-string/jumbo v14, "title"

    invoke-interface {v2, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/String;

    if-eqz v7, :cond_1

    check-cast v5, Ljava/lang/String;

    goto :goto_0

    :cond_1
    const/4 v5, 0x0

    .line 8
    :goto_0
    const-string/jumbo v7, "subtitle"

    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/lang/String;

    if-eqz v9, :cond_2

    check-cast v8, Ljava/lang/String;

    goto :goto_1

    :cond_2
    const/4 v8, 0x0

    .line 9
    :goto_1
    const-string v9, "contentBlocks"

    invoke-interface {v2, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Ljava/util/List;

    if-eqz v10, :cond_3

    check-cast v9, Ljava/util/List;

    goto :goto_2

    :cond_3
    const/4 v9, 0x0

    .line 10
    :goto_2
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v10

    sget v11, Lcom/sumsub/sns/R$dimen;->sns_margin_small:I

    invoke-virtual {v10, v11}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v10

    .line 11
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v11

    sget v15, Lcom/sumsub/sns/R$dimen;->sns_margin_large:I

    invoke-virtual {v11, v15}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v11

    if-eqz v8, :cond_4

    goto :goto_3

    :cond_4
    move v10, v11

    :goto_3
    const/4 v15, -0x2

    const/4 v13, -0x1

    if-eqz v5, :cond_5

    .line 12
    invoke-virtual {v0, v6, v5}, Lcom/sumsub/sns/core/presentation/intro/b;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/sumsub/sns/core/widget/SNSTextView;

    move-result-object v5

    move/from16 v16, v3

    .line 13
    new-instance v3, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v3, v13, v15}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 14
    iput v10, v3, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 15
    invoke-virtual {v12, v5, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    goto :goto_4

    :cond_5
    move/from16 v16, v3

    :goto_4
    if-eqz v8, :cond_6

    .line 16
    invoke-virtual {v0, v6, v8}, Lcom/sumsub/sns/core/presentation/intro/b;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/sumsub/sns/core/widget/SNSTextView;

    move-result-object v3

    .line 17
    new-instance v5, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v5, v13, v15}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 18
    iput v11, v5, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 19
    invoke-virtual {v12, v3, v5}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_6
    if-eqz v9, :cond_3d

    .line 20
    invoke-interface {v9}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_7

    move/from16 v0, p3

    move/from16 v25, v4

    move v14, v13

    move v13, v15

    goto/16 :goto_2e

    .line 21
    :cond_7
    new-instance v3, Lcom/sumsub/sns/core/presentation/intro/a;

    iget-object v5, v0, Lcom/sumsub/sns/core/presentation/intro/b;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    iget-object v8, v0, Lcom/sumsub/sns/core/presentation/intro/b;->c:Lcom/sumsub/sns/internal/core/common/u0;

    invoke-direct {v3, v5, v8}, Lcom/sumsub/sns/core/presentation/intro/a;-><init>(Lcom/sumsub/sns/internal/features/data/repository/extensions/a;Lcom/sumsub/sns/internal/core/common/u0;)V

    .line 22
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 23
    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :cond_8
    :goto_5
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_9

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    instance-of v10, v9, Ljava/util/Map;

    if-eqz v10, :cond_8

    invoke-virtual {v5, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_5

    .line 24
    :cond_9
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 25
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x0

    :goto_6
    if-ge v10, v9, :cond_38

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v17, v10, 0x1

    .line 26
    check-cast v11, Ljava/util/Map;

    .line 27
    const-string/jumbo v10, "type"

    invoke-interface {v11, v10}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    move-object/from16 v18, v7

    .line 28
    const-string v7, "image"

    invoke-static {v10, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v19

    const-string v20, ""

    if-eqz v19, :cond_c

    .line 29
    invoke-interface {v11, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v10, v7, Ljava/lang/String;

    if-eqz v10, :cond_a

    check-cast v7, Ljava/lang/String;

    goto :goto_7

    :cond_a
    const/4 v7, 0x0

    :goto_7
    if-nez v7, :cond_b

    :goto_8
    move-object v7, v5

    goto :goto_9

    :cond_b
    move-object/from16 v20, v7

    goto :goto_8

    .line 30
    :goto_9
    new-instance v5, Lcom/sumsub/sns/core/widget/SNSImageView;

    const/16 v10, 0xe

    const/4 v11, 0x0

    move-object/from16 v19, v7

    const/4 v7, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move/from16 v22, v9

    const/4 v9, 0x0

    move-object/from16 v23, v18

    move-object/from16 v15, v20

    move-object/from16 v24, v21

    invoke-direct/range {v5 .. v11}, Lcom/sumsub/sns/core/widget/SNSImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    sget-object v7, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v7

    invoke-interface {v7, v6, v15}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    :goto_a
    move-object v15, v3

    :goto_b
    move/from16 v25, v4

    move-object/from16 v7, v23

    goto/16 :goto_2a

    :cond_c
    move-object/from16 v19, v5

    move-object/from16 v24, v8

    move/from16 v22, v9

    move-object/from16 v23, v18

    .line 32
    const-string v5, "header"

    invoke-static {v10, v5}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    const-string/jumbo v9, "text"

    if-eqz v8, :cond_10

    .line 33
    invoke-interface {v11, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/String;

    if-eqz v7, :cond_d

    check-cast v5, Ljava/lang/String;

    goto :goto_c

    :cond_d
    const/4 v5, 0x0

    :goto_c
    if-nez v5, :cond_f

    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/String;

    if-eqz v7, :cond_e

    check-cast v5, Ljava/lang/String;

    goto :goto_d

    :cond_e
    const/4 v5, 0x0

    :goto_d
    if-nez v5, :cond_f

    move-object/from16 v5, v20

    .line 34
    :cond_f
    invoke-virtual {v3, v6, v5}, Lcom/sumsub/sns/core/presentation/intro/a;->a(Landroid/content/Context;Ljava/lang/String;)Lcom/sumsub/sns/core/widget/SNSH2TextView;

    move-result-object v5

    goto :goto_a

    .line 35
    :cond_10
    invoke-static {v10, v9}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_12

    .line 36
    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/String;

    if-eqz v7, :cond_11

    check-cast v5, Ljava/lang/String;

    goto :goto_e

    :cond_11
    const/4 v5, 0x0

    .line 37
    :goto_e
    invoke-virtual {v3, v6, v5}, Lcom/sumsub/sns/core/presentation/intro/a;->b(Landroid/content/Context;Ljava/lang/String;)Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    move-result-object v5

    goto :goto_a

    .line 38
    :cond_12
    const-string/jumbo v8, "single"

    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_20

    .line 39
    invoke-interface {v11, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/String;

    if-eqz v8, :cond_13

    check-cast v7, Ljava/lang/String;

    goto :goto_f

    :cond_13
    const/4 v7, 0x0

    :goto_f
    if-nez v7, :cond_14

    move-object/from16 v15, v20

    goto :goto_10

    :cond_14
    move-object v15, v7

    .line 40
    :goto_10
    invoke-interface {v11, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v7, v5, Ljava/lang/String;

    if-eqz v7, :cond_15

    check-cast v5, Ljava/lang/String;

    goto :goto_11

    :cond_15
    const/4 v5, 0x0

    .line 41
    :goto_11
    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/String;

    if-eqz v8, :cond_16

    check-cast v7, Ljava/lang/String;

    goto :goto_12

    :cond_16
    const/4 v7, 0x0

    .line 42
    :goto_12
    new-instance v8, Landroid/widget/LinearLayout;

    invoke-direct {v8, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    move/from16 v9, v16

    .line 43
    invoke-virtual {v8, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    move-object v9, v5

    .line 44
    new-instance v5, Lcom/sumsub/sns/core/widget/SNSImageView;

    const/16 v10, 0xe

    const/4 v11, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v25, v9

    const/4 v9, 0x0

    move-object/from16 v27, v20

    move-object/from16 v28, v21

    move-object/from16 v26, v25

    invoke-direct/range {v5 .. v11}, Lcom/sumsub/sns/core/widget/SNSImageView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    sget-object v7, Landroid/widget/ImageView$ScaleType;->FIT_CENTER:Landroid/widget/ImageView$ScaleType;

    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setScaleType(Landroid/widget/ImageView$ScaleType;)V

    .line 46
    sget-object v20, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual/range {v20 .. v20}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v7

    invoke-interface {v7, v6, v15}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v5, v7}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 47
    new-instance v7, Landroid/view/ViewGroup$MarginLayoutParams;

    .line 48
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    sget v9, Lcom/sumsub/sns/R$dimen;->sns_icon_size_huge:I

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    .line 49
    invoke-direct {v7, v13, v8}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 50
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    sget v9, Lcom/sumsub/sns/R$dimen;->sns_margin_medium_plus:I

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    iput v8, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 51
    sget-object v8, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    move-object/from16 v15, v28

    .line 52
    invoke-virtual {v15, v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 53
    new-instance v5, Lcom/sumsub/sns/core/widget/SNSH2TextView;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/sumsub/sns/core/widget/SNSH2TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v9, v26

    if-eqz v9, :cond_17

    .line 54
    iget-object v7, v3, Lcom/sumsub/sns/core/presentation/intro/a;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast v7, Lcom/sumsub/sns/internal/core/domain/d;

    .line 55
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 56
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 57
    invoke-static {v9, v7}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v7

    goto :goto_13

    :cond_17
    const/4 v7, 0x0

    .line 58
    :goto_13
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 59
    invoke-virtual/range {v20 .. v20}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    move-result-object v7

    if-eqz v7, :cond_18

    invoke-interface {v7}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    move-result-object v7

    goto :goto_14

    :cond_18
    const/4 v7, 0x0

    :goto_14
    instance-of v8, v7, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v8, :cond_19

    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_15

    :cond_19
    const/4 v7, 0x0

    :goto_15
    if-eqz v7, :cond_1d

    .line 60
    sget-object v8, Lcom/sumsub/sns/core/theme/SNSMetricElement;->SCREEN_HEADER_ALIGNMENT:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 61
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    if-eqz v7, :cond_1a

    .line 62
    invoke-virtual {v8}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    move-result-object v8

    invoke-interface {v7, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    goto :goto_16

    :cond_1a
    const/4 v7, 0x0

    :goto_16
    instance-of v8, v7, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    if-eqz v8, :cond_1b

    check-cast v7, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    goto :goto_17

    :cond_1b
    const/4 v7, 0x0

    :goto_17
    if-eqz v7, :cond_1c

    .line 63
    iget-object v7, v7, Lcom/sumsub/sns/internal/core/presentation/theme/h;->a:Ljava/lang/String;

    goto :goto_18

    :cond_1c
    const/4 v7, 0x0

    :goto_18
    if-nez v7, :cond_1e

    .line 64
    :cond_1d
    sget-object v7, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->CENTER:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    invoke-virtual {v7}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->getValue()Ljava/lang/String;

    move-result-object v7

    .line 65
    :cond_1e
    invoke-static {v5, v7}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    .line 66
    new-instance v7, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v8, -0x2

    invoke-direct {v7, v13, v8}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 67
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    sget v9, Lcom/sumsub/sns/R$dimen;->sns_margin_medium:I

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    iput v8, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 68
    invoke-virtual {v15, v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 69
    new-instance v5, Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    const/16 v10, 0xe

    const/4 v11, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v5 .. v11}, Lcom/sumsub/sns/core/widget/SNSBodyTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v7, v27

    if-eqz v7, :cond_1f

    .line 70
    iget-object v8, v3, Lcom/sumsub/sns/core/presentation/intro/a;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast v8, Lcom/sumsub/sns/internal/core/domain/d;

    .line 71
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 72
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 73
    invoke-static {v7, v8}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v7

    goto :goto_19

    :cond_1f
    const/4 v7, 0x0

    .line 74
    :goto_19
    invoke-virtual {v5, v7}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 75
    new-instance v7, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v8, -0x2

    invoke-direct {v7, v13, v8}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 76
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    sget v9, Lcom/sumsub/sns/R$dimen;->sns_margin_small_plus:I

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    iput v8, v7, Landroid/view/ViewGroup$MarginLayoutParams;->topMargin:I

    .line 77
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v8

    invoke-virtual {v8, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v8

    iput v8, v7, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 78
    invoke-virtual {v15, v5, v7}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move/from16 v25, v4

    move-object v5, v15

    move-object/from16 v7, v23

    move-object v15, v3

    goto/16 :goto_2a

    .line 79
    :cond_20
    const-string v8, "do"

    invoke-static {v10, v8}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_25

    .line 80
    invoke-interface {v11, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    instance-of v8, v7, Ljava/lang/String;

    if-eqz v8, :cond_21

    check-cast v7, Ljava/lang/String;

    goto :goto_1a

    :cond_21
    const/4 v7, 0x0

    :goto_1a
    if-nez v7, :cond_22

    move-object/from16 v7, v20

    .line 81
    :cond_22
    invoke-interface {v11, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v8, v5, Ljava/lang/String;

    if-eqz v8, :cond_23

    check-cast v5, Ljava/lang/String;

    move-object v8, v5

    goto :goto_1b

    :cond_23
    const/4 v8, 0x0

    .line 82
    :goto_1b
    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v9, v5, Ljava/lang/String;

    if-eqz v9, :cond_24

    check-cast v5, Ljava/lang/String;

    move-object v9, v5

    goto :goto_1c

    :cond_24
    const/4 v9, 0x0

    .line 83
    :goto_1c
    sget-object v10, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->APPROVED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    move-object v5, v3

    invoke-virtual/range {v5 .. v10}, Lcom/sumsub/sns/core/presentation/intro/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)Lcom/sumsub/sns/core/widget/SNSIntroItemView;

    move-result-object v3

    move/from16 v25, v4

    move-object v15, v5

    :goto_1d
    move-object/from16 v7, v23

    move-object v5, v3

    goto/16 :goto_2a

    :cond_25
    move-object v8, v3

    .line 84
    const-string v3, "dont"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2a

    .line 85
    invoke-interface {v11, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v7, v3, Ljava/lang/String;

    if-eqz v7, :cond_26

    check-cast v3, Ljava/lang/String;

    goto :goto_1e

    :cond_26
    const/4 v3, 0x0

    :goto_1e
    if-nez v3, :cond_27

    move-object/from16 v7, v20

    goto :goto_1f

    :cond_27
    move-object v7, v3

    .line 86
    :goto_1f
    invoke-interface {v11, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_28

    check-cast v3, Ljava/lang/String;

    goto :goto_20

    :cond_28
    const/4 v3, 0x0

    .line 87
    :goto_20
    invoke-interface {v11, v9}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    instance-of v9, v5, Ljava/lang/String;

    if-eqz v9, :cond_29

    check-cast v5, Ljava/lang/String;

    move-object v9, v5

    goto :goto_21

    :cond_29
    const/4 v9, 0x0

    .line 88
    :goto_21
    sget-object v10, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    move-object v5, v8

    move-object v8, v3

    invoke-virtual/range {v5 .. v10}, Lcom/sumsub/sns/core/presentation/intro/a;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)Lcom/sumsub/sns/core/widget/SNSIntroItemView;

    move-result-object v3

    move-object v15, v5

    move-object v5, v3

    goto/16 :goto_b

    :cond_2a
    move-object v15, v8

    .line 89
    const-string v3, "listItems"

    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_36

    .line 90
    invoke-interface {v11, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    instance-of v5, v3, Ljava/util/List;

    if-eqz v5, :cond_2b

    check-cast v3, Ljava/util/List;

    goto :goto_22

    :cond_2b
    const/4 v3, 0x0

    :goto_22
    if-eqz v3, :cond_36

    .line 91
    new-instance v5, Ljava/util/ArrayList;

    invoke-direct {v5}, Ljava/util/ArrayList;-><init>()V

    .line 92
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_2c
    :goto_23
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_2d

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    instance-of v9, v8, Ljava/util/Map;

    if-eqz v9, :cond_2c

    invoke-virtual {v5, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_23

    .line 93
    :cond_2d
    new-instance v3, Landroid/widget/LinearLayout;

    invoke-direct {v3, v6}, Landroid/widget/LinearLayout;-><init>(Landroid/content/Context;)V

    const/4 v9, 0x1

    .line 94
    invoke-virtual {v3, v9}, Landroid/widget/LinearLayout;->setOrientation(I)V

    .line 95
    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8}, Ljava/util/ArrayList;-><init>()V

    .line 96
    invoke-virtual {v5}, Ljava/util/ArrayList;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_24
    if-ge v11, v10, :cond_2f

    move/from16 v16, v9

    invoke-virtual {v5, v11}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v11, v11, 0x1

    instance-of v13, v9, Ljava/util/Map;

    if-eqz v13, :cond_2e

    invoke-virtual {v8, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2e
    move/from16 v9, v16

    const/4 v13, -0x1

    goto :goto_24

    :cond_2f
    move/from16 v16, v9

    .line 97
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v5

    sget v9, Lcom/sumsub/sns/R$dimen;->sns_margin_small_plus:I

    invoke-virtual {v5, v9}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v13

    .line 98
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    .line 99
    invoke-virtual {v8}, Ljava/util/ArrayList;->size()I

    move-result v9

    const/4 v10, 0x0

    const/4 v11, 0x0

    :goto_25
    if-ge v10, v9, :cond_35

    invoke-virtual {v8, v10}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v25

    add-int/lit8 v26, v10, 0x1

    add-int/lit8 v27, v11, 0x1

    if-gez v11, :cond_30

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_30
    check-cast v25, Ljava/util/Map;

    if-ne v11, v5, :cond_31

    const/4 v10, 0x0

    :goto_26
    move v11, v5

    goto :goto_27

    :cond_31
    move v10, v13

    goto :goto_26

    .line 100
    :goto_27
    new-instance v5, Lcom/sumsub/sns/core/widget/SNSListItemView;

    move/from16 v28, v10

    const/16 v10, 0xe

    move/from16 v29, v11

    const/4 v11, 0x0

    move-object/from16 v30, v7

    const/4 v7, 0x0

    move-object/from16 v31, v8

    const/4 v8, 0x0

    move/from16 v32, v9

    const/4 v9, 0x0

    move/from16 v33, v13

    move-object/from16 v0, v25

    move-object/from16 v13, v30

    move/from16 v25, v4

    move/from16 v4, v28

    invoke-direct/range {v5 .. v11}, Lcom/sumsub/sns/core/widget/SNSListItemView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 101
    sget-object v7, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v7}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v7

    invoke-interface {v0, v13}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/String;

    if-nez v8, :cond_32

    move-object/from16 v8, v20

    :cond_32
    invoke-interface {v7, v6, v8}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v7

    invoke-virtual {v5, v7}, Lcom/sumsub/sns/core/widget/SNSStepView;->setIconStart(Landroid/graphics/drawable/Drawable;)V

    .line 102
    invoke-interface {v0, v14}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/String;

    if-eqz v7, :cond_33

    iget-object v8, v15, Lcom/sumsub/sns/core/presentation/intro/a;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast v8, Lcom/sumsub/sns/internal/core/domain/d;

    .line 103
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 104
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 105
    invoke-static {v7, v8}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v7

    goto :goto_28

    :cond_33
    const/4 v7, 0x0

    .line 106
    :goto_28
    invoke-virtual {v5, v7}, Lcom/sumsub/sns/core/widget/SNSStepView;->setTitle(Ljava/lang/CharSequence;)V

    move-object/from16 v7, v23

    .line 107
    invoke-interface {v0, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    if-eqz v0, :cond_34

    iget-object v8, v15, Lcom/sumsub/sns/core/presentation/intro/a;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast v8, Lcom/sumsub/sns/internal/core/domain/d;

    .line 108
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 109
    iget-object v8, v8, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 110
    invoke-static {v0, v8}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v0

    goto :goto_29

    :cond_34
    const/4 v0, 0x0

    .line 111
    :goto_29
    invoke-virtual {v5, v0}, Lcom/sumsub/sns/core/widget/SNSStepView;->setSubtitle(Ljava/lang/CharSequence;)V

    .line 112
    new-instance v0, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v8, -0x2

    const/4 v9, -0x1

    invoke-direct {v0, v9, v8}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 113
    iput v4, v0, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 114
    sget-object v4, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 115
    invoke-virtual {v3, v5, v0}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    const/16 v16, 0x1

    move-object/from16 v0, p0

    move-object/from16 v23, v7

    move-object v7, v13

    move/from16 v4, v25

    move/from16 v10, v26

    move/from16 v11, v27

    move/from16 v5, v29

    move-object/from16 v8, v31

    move/from16 v9, v32

    move/from16 v13, v33

    goto/16 :goto_25

    :cond_35
    move/from16 v25, v4

    goto/16 :goto_1d

    :cond_36
    move/from16 v25, v4

    move-object/from16 v7, v23

    const/4 v5, 0x0

    :goto_2a
    move-object/from16 v0, v24

    if-eqz v5, :cond_37

    .line 116
    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_37
    const/4 v13, -0x1

    const/16 v16, 0x1

    move-object v8, v0

    move-object v3, v15

    move/from16 v10, v17

    move-object/from16 v5, v19

    move/from16 v9, v22

    move/from16 v4, v25

    const/4 v15, -0x2

    move-object/from16 v0, p0

    goto/16 :goto_6

    :cond_38
    move/from16 v25, v4

    move-object v0, v8

    .line 117
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v3

    sget v4, Lcom/sumsub/sns/R$dimen;->sns_margin_small_plus:I

    invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v3

    .line 118
    invoke-virtual {v6}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v4

    sget v5, Lcom/sumsub/sns/R$dimen;->sns_margin_large:I

    invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v4

    .line 119
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v5

    const/16 v16, 0x1

    add-int/lit8 v5, v5, -0x1

    .line 120
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    const/4 v7, 0x0

    const/4 v8, 0x0

    :goto_2b
    if-ge v7, v6, :cond_3c

    invoke-virtual {v0, v7}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v9

    add-int/lit8 v7, v7, 0x1

    add-int/lit8 v10, v8, 0x1

    if-gez v8, :cond_39

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_39
    check-cast v9, Landroid/view/View;

    if-ne v8, v5, :cond_3a

    const/4 v8, 0x0

    goto :goto_2c

    .line 121
    :cond_3a
    instance-of v8, v9, Lcom/sumsub/sns/core/widget/SNSImageView;

    if-eqz v8, :cond_3b

    move v8, v4

    goto :goto_2c

    :cond_3b
    move v8, v3

    .line 122
    :goto_2c
    new-instance v11, Landroid/view/ViewGroup$MarginLayoutParams;

    const/4 v13, -0x2

    const/4 v14, -0x1

    invoke-direct {v11, v14, v13}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 123
    iput v8, v11, Landroid/view/ViewGroup$MarginLayoutParams;->bottomMargin:I

    .line 124
    invoke-virtual {v12, v9, v11}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    move v8, v10

    goto :goto_2b

    :cond_3c
    const/4 v13, -0x2

    const/4 v14, -0x1

    :goto_2d
    move/from16 v0, p3

    goto :goto_2e

    :cond_3d
    move/from16 v25, v4

    move v14, v13

    move v13, v15

    goto :goto_2d

    .line 125
    :goto_2e
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/view/ViewGroup;

    if-eqz v0, :cond_3e

    .line 126
    invoke-virtual {v0}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 127
    new-instance v3, Landroid/view/ViewGroup$MarginLayoutParams;

    invoke-direct {v3, v14, v13}, Landroid/view/ViewGroup$MarginLayoutParams;-><init>(II)V

    .line 128
    invoke-virtual {v0, v12, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    .line 129
    :cond_3e
    const-string v0, "actionTitle"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v3, v0, Ljava/lang/String;

    if-eqz v3, :cond_3f

    check-cast v0, Ljava/lang/String;

    goto :goto_2f

    :cond_3f
    const/4 v0, 0x0

    :goto_2f
    if-eqz v0, :cond_40

    move/from16 v3, p4

    .line 130
    invoke-virtual {v1, v3}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Landroid/widget/Button;

    if-eqz v3, :cond_40

    .line 131
    invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 132
    :cond_40
    const-string v0, "disclaimer"

    invoke-interface {v2, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    instance-of v2, v0, Ljava/lang/String;

    if-eqz v2, :cond_41

    move-object v15, v0

    check-cast v15, Ljava/lang/String;

    :goto_30
    move/from16 v0, v25

    goto :goto_31

    :cond_41
    const/4 v15, 0x0

    goto :goto_30

    .line 133
    :goto_31
    invoke-virtual {v1, v0}, Landroid/view/View;->findViewById(I)Landroid/view/View;

    move-result-object v0

    check-cast v0, Landroid/widget/TextView;

    if-eqz v0, :cond_44

    if-eqz v15, :cond_43

    .line 134
    invoke-static {v15}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_42

    goto :goto_32

    :cond_42
    move-object/from16 v1, p0

    .line 135
    iget-object v1, v1, Lcom/sumsub/sns/core/presentation/intro/b;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast v1, Lcom/sumsub/sns/internal/core/domain/d;

    .line 136
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 137
    iget-object v1, v1, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 138
    invoke-static {v15, v1}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v1

    .line 139
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    const/4 v1, 0x0

    .line 140
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_43
    :goto_32
    const/16 v1, 0x8

    .line 141
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    :cond_44
    :goto_33
    return-void
.end method

.method public static final b(Lcom/sumsub/sns/core/presentation/intro/b;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 17
    iget-object p0, p0, Lcom/sumsub/sns/core/presentation/intro/b;->c:Lcom/sumsub/sns/internal/core/common/u0;

    if-eqz p0, :cond_0

    .line 18
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Ljava/lang/String;Z)V

    .line 19
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Landroid/content/Context;Ljava/lang/String;)Lcom/sumsub/sns/core/widget/SNSTextView;
    .locals 9

    .line 142
    iget-boolean v0, p0, Lcom/sumsub/sns/core/presentation/intro/b;->b:Z

    if-eqz v0, :cond_0

    .line 143
    new-instance v1, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v2, p1

    .line 144
    new-instance p1, Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v2

    move-object v2, p1

    invoke-direct/range {v2 .. v8}, Lcom/sumsub/sns/core/widget/SNSBodyTextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    .line 145
    :goto_0
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/intro/b;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast p1, Lcom/sumsub/sns/internal/core/domain/d;

    .line 146
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 147
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 148
    invoke-static {p2, p1}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object p1

    .line 149
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 150
    new-instance p1, Lcom/sumsub/sns/core/presentation/intro/f;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/core/presentation/intro/f;-><init>(Lcom/sumsub/sns/core/presentation/intro/b;)V

    invoke-static {v1, p1}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 151
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
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_2

    :cond_2
    move-object p1, p2

    :goto_2
    if-eqz p1, :cond_6

    .line 152
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSMetricElement;->SCREEN_HEADER_ALIGNMENT:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 153
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    if-eqz p1, :cond_3

    .line 154
    invoke-virtual {v0}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    goto :goto_3

    :cond_3
    move-object p1, p2

    :goto_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    goto :goto_4

    :cond_4
    move-object p1, p2

    :goto_4
    if-eqz p1, :cond_5

    .line 155
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/theme/h;->a:Ljava/lang/String;

    :cond_5
    if-nez p2, :cond_7

    .line 156
    :cond_6
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->CENTER:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    invoke-virtual {p1}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->getValue()Ljava/lang/String;

    move-result-object p2

    .line 157
    :cond_7
    invoke-static {v1, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    return-object v1
.end method

.method public final b(Landroid/content/Context;Ljava/lang/String;)Lcom/sumsub/sns/core/widget/SNSTextView;
    .locals 9

    .line 1
    iget-boolean v0, p0, Lcom/sumsub/sns/core/presentation/intro/b;->b:Z

    if-eqz v0, :cond_0

    .line 2
    new-instance v1, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p1

    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/core/widget/SNSH1TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :cond_0
    move-object v2, p1

    .line 3
    new-instance p1, Lcom/sumsub/sns/core/widget/SNSH2TextView;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v3, v2

    move-object v2, p1

    invoke-direct/range {v2 .. v8}, Lcom/sumsub/sns/core/widget/SNSH2TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v1, v2

    .line 4
    :goto_0
    iget-object p1, p0, Lcom/sumsub/sns/core/presentation/intro/b;->a:Lcom/sumsub/sns/internal/features/data/repository/extensions/a;

    check-cast p1, Lcom/sumsub/sns/internal/core/domain/d;

    .line 5
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/d;->a:Lcom/sumsub/sns/internal/core/domain/h;

    .line 6
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/domain/h;->a:Landroid/content/Context;

    .line 7
    invoke-static {p2, p1}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object p1

    .line 8
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    new-instance p1, Lcom/sumsub/sns/core/presentation/intro/e;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/core/presentation/intro/e;-><init>(Lcom/sumsub/sns/core/presentation/intro/b;)V

    invoke-static {v1, p1}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 10
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
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    if-eqz v0, :cond_2

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    goto :goto_2

    :cond_2
    move-object p1, p2

    :goto_2
    if-eqz p1, :cond_6

    .line 11
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSMetricElement;->SCREEN_HEADER_ALIGNMENT:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 12
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    if-eqz p1, :cond_3

    .line 13
    invoke-virtual {v0}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    goto :goto_3

    :cond_3
    move-object p1, p2

    :goto_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    if-eqz v0, :cond_4

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/h;

    goto :goto_4

    :cond_4
    move-object p1, p2

    :goto_4
    if-eqz p1, :cond_5

    .line 14
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/theme/h;->a:Ljava/lang/String;

    :cond_5
    if-nez p2, :cond_7

    .line 15
    :cond_6
    sget-object p1, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->CENTER:Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;

    invoke-virtual {p1}, Lcom/sumsub/sns/core/theme/SNSThemeMetric$TextAlignment;->getValue()Ljava/lang/String;

    move-result-object p2

    .line 16
    :cond_7
    invoke-static {v1, p2}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/widget/TextView;Ljava/lang/String;)V

    return-object v1
.end method
