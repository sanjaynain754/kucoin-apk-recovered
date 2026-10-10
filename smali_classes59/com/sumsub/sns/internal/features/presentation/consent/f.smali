.class public final Lcom/sumsub/sns/internal/features/presentation/consent/f;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/c;",
        "Lcom/sumsub/sns/internal/features/presentation/consent/n;",
        "Lcom/sumsub/sns/internal/features/presentation/consent/u;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/consent/f;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/c;",
        "Lcom/sumsub/sns/internal/features/presentation/consent/n;",
        "Lcom/sumsub/sns/internal/features/presentation/consent/u;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSNSAgreementSelectorFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSAgreementSelectorFragment.kt\ncom/sumsub/sns/internal/features/presentation/consent/SNSAgreementSelectorFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 ViewGroup.kt\nandroidx/core/view/ViewGroupKt\n*L\n1#1,188:1\n106#2,15:189\n277#3,2:204\n256#3,2:213\n298#3,2:215\n1878#4,3:206\n53#5,4:209\n*S KotlinDebug\n*F\n+ 1 SNSAgreementSelectorFragment.kt\ncom/sumsub/sns/internal/features/presentation/consent/SNSAgreementSelectorFragment\n*L\n34#1:189,15\n112#1:204,2\n169#1:213,2\n171#1:215,2\n124#1:206,3\n164#1:209,4\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;

.field public final b:Ljava/lang/String;

.field public c:Ljava/util/List;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/consent/x;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/consent/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/consent/f;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/consent/a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/consent/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/consent/f;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/consent/b;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/consent/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/consent/a;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/consent/u;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/consent/c;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/consent/c;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/consent/d;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/consent/d;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/consent/f;->a:Lkotlin/Lazy;

    .line 47
    .line 48
    const-string v0, "Agreements"

    .line 49
    .line 50
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/consent/f;->b:Ljava/lang/String;

    .line 51
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/consent/f;)Lkotlin/Unit;
    .locals 1

    .line 11
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/consent/f;->a:Lkotlin/Lazy;

    .line 12
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;

    .line 13
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/consent/i;->a:Lcom/sumsub/sns/internal/features/presentation/consent/i;

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/consent/u;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/consent/f;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 7
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/consent/f;->a:Lkotlin/Lazy;

    .line 8
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;

    .line 9
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/consent/k;

    invoke-direct {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/consent/k;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/features/presentation/consent/u;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/consent/f;Lcom/sumsub/sns/internal/features/presentation/consent/h;Landroid/widget/CompoundButton;Z)V
    .locals 0

    if-eqz p3, :cond_0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/consent/f;->a:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/consent/u;

    .line 3
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/consent/j;

    .line 4
    iget p1, p1, Lcom/sumsub/sns/internal/features/presentation/consent/h;->a:I

    .line 5
    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/consent/j;-><init>(I)V

    .line 6
    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/consent/u;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    :cond_0
    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/consent/f;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 3

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/consent/v;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v1

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v2

    invoke-direct {v0, p0, v1, v2}, Lcom/sumsub/sns/internal/features/presentation/consent/v;-><init>(Lcom/sumsub/sns/internal/features/presentation/consent/f;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/consent/n;)V
    .locals 17

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const/4 v2, 0x1

    .line 15
    iget-object v3, v0, Lcom/sumsub/sns/internal/features/presentation/consent/f;->c:Ljava/util/List;

    .line 16
    iget-object v4, v1, Lcom/sumsub/sns/internal/features/presentation/consent/n;->f:Ljava/util/List;

    .line 17
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    return-void

    .line 18
    :cond_0
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/consent/n;->f:Ljava/util/List;

    .line 19
    invoke-interface {v3}, Ljava/util/List;->size()I

    move-result v3

    if-le v3, v2, :cond_9

    .line 20
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/databinding/c;

    if-eqz v3, :cond_1

    iget-object v3, v3, Lcom/sumsub/sns/databinding/c;->e:Landroid/widget/RadioGroup;

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 21
    :cond_1
    iget-object v3, v1, Lcom/sumsub/sns/internal/features/presentation/consent/n;->f:Ljava/util/List;

    .line 22
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v4, 0x0

    move v5, v4

    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v8, v5, 0x1

    if-gez v5, :cond_2

    invoke-static {}, Lkotlin/collections/CollectionsKt;->throwIndexOverflow()V

    :cond_2
    check-cast v6, Lcom/sumsub/sns/internal/features/presentation/consent/h;

    .line 23
    iget-object v5, v6, Lcom/sumsub/sns/internal/features/presentation/consent/h;->b:Lcom/sumsub/sns/internal/features/presentation/country/b;

    .line 24
    new-instance v9, Lcom/sumsub/sns/core/widget/SNSCardRadioButton;

    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v10

    const/16 v15, 0x1e

    const/16 v16, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Lcom/sumsub/sns/core/widget/SNSCardRadioButton;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IILcom/sumsub/sns/core/theme/SNSMetricElement;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 25
    iget-object v10, v5, Lcom/sumsub/sns/internal/features/presentation/country/b;->b:Ljava/lang/String;

    .line 26
    invoke-virtual {v9, v10}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    iget v10, v6, Lcom/sumsub/sns/internal/features/presentation/consent/h;->a:I

    .line 28
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v9, v10}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 29
    iget-object v10, v5, Lcom/sumsub/sns/internal/features/presentation/country/b;->a:Ljava/lang/String;

    .line 30
    invoke-interface {v10}, Ljava/lang/CharSequence;->length()I

    move-result v10

    if-nez v10, :cond_3

    .line 31
    sget-object v5, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v5}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v5

    .line 32
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v10

    .line 33
    sget-object v11, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->COUNTRY_OTHER:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v11}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v11

    .line 34
    invoke-interface {v5, v10, v11}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    goto :goto_1

    .line 35
    :cond_3
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v10

    invoke-static {v5, v10}, Lcom/sumsub/sns/internal/features/presentation/country/c;->a(Lcom/sumsub/sns/internal/features/presentation/country/b;Landroid/content/Context;)Landroid/graphics/drawable/Drawable;

    move-result-object v5

    :goto_1
    const/4 v10, 0x2

    .line 36
    invoke-static {v9, v5, v4, v10, v7}, Lcom/sumsub/sns/core/widget/SNSCardRadioButton;->setStartDrawable$default(Lcom/sumsub/sns/core/widget/SNSCardRadioButton;Landroid/graphics/drawable/Drawable;ZILjava/lang/Object;)V

    .line 37
    new-instance v5, Lcom/sumsub/sns/internal/features/presentation/consent/y;

    invoke-direct {v5, v0, v6}, Lcom/sumsub/sns/internal/features/presentation/consent/y;-><init>(Lcom/sumsub/sns/internal/features/presentation/consent/f;Lcom/sumsub/sns/internal/features/presentation/consent/h;)V

    invoke-virtual {v9, v5}, Landroid/widget/CompoundButton;->setOnCheckedChangeListener(Landroid/widget/CompoundButton$OnCheckedChangeListener;)V

    .line 38
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v5

    check-cast v5, Lcom/sumsub/sns/databinding/c;

    if-eqz v5, :cond_4

    iget-object v5, v5, Lcom/sumsub/sns/databinding/c;->e:Landroid/widget/RadioGroup;

    if-eqz v5, :cond_4

    .line 39
    new-instance v6, Landroid/widget/RadioGroup$LayoutParams;

    const/4 v7, -0x1

    const/4 v10, -0x2

    .line 40
    invoke-direct {v6, v7, v10}, Landroid/widget/RadioGroup$LayoutParams;-><init>(II)V

    .line 41
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    move-result-object v7

    sget v10, Lcom/sumsub/sns/R$dimen;->sns_margin_small_plus:I

    invoke-virtual {v7, v10}, Landroid/content/res/Resources;->getDimensionPixelSize(I)I

    move-result v7

    .line 42
    invoke-virtual {v6, v4, v4, v4, v7}, Landroid/view/ViewGroup$MarginLayoutParams;->setMargins(IIII)V

    .line 43
    sget-object v7, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 44
    invoke-virtual {v5, v9, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V

    :cond_4
    move v5, v8

    goto/16 :goto_0

    .line 45
    :cond_5
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/databinding/c;

    if-eqz v3, :cond_8

    iget-object v3, v3, Lcom/sumsub/sns/databinding/c;->e:Landroid/widget/RadioGroup;

    if-eqz v3, :cond_8

    .line 46
    invoke-virtual {v3}, Landroid/view/ViewGroup;->getChildCount()I

    move-result v5

    move v6, v4

    :goto_2
    if-ge v6, v5, :cond_8

    .line 47
    invoke-virtual {v3, v6}, Landroid/view/ViewGroup;->getChildAt(I)Landroid/view/View;

    move-result-object v8

    .line 48
    instance-of v9, v8, Lcom/sumsub/sns/core/widget/SNSCardRadioButton;

    if-eqz v9, :cond_6

    check-cast v8, Lcom/sumsub/sns/core/widget/SNSCardRadioButton;

    goto :goto_3

    :cond_6
    move-object v8, v7

    :goto_3
    if-eqz v8, :cond_7

    .line 49
    invoke-virtual {v8}, Landroid/view/View;->getTag()Ljava/lang/Object;

    move-result-object v9

    .line 50
    iget-object v10, v1, Lcom/sumsub/sns/internal/features/presentation/consent/n;->a:Ljava/lang/Integer;

    .line 51
    invoke-static {v9, v10}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v8, v9}, Landroid/widget/CompoundButton;->setChecked(Z)V

    :cond_7
    add-int/2addr v6, v2

    goto :goto_2

    .line 52
    :cond_8
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/databinding/c;

    if-eqz v2, :cond_a

    iget-object v2, v2, Lcom/sumsub/sns/databinding/c;->e:Landroid/widget/RadioGroup;

    if-eqz v2, :cond_a

    .line 53
    invoke-virtual {v2, v4}, Landroid/view/View;->setVisibility(I)V

    goto :goto_4

    .line 54
    :cond_9
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/databinding/c;

    if-eqz v2, :cond_a

    iget-object v2, v2, Lcom/sumsub/sns/databinding/c;->e:Landroid/widget/RadioGroup;

    if-eqz v2, :cond_a

    const/16 v3, 0x8

    .line 55
    invoke-virtual {v2, v3}, Landroid/view/View;->setVisibility(I)V

    .line 56
    :cond_a
    :goto_4
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/consent/n;->f:Ljava/util/List;

    .line 57
    iput-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/consent/f;->c:Ljava/util/List;

    return-void
.end method

.method public final b(Lcom/sumsub/sns/internal/features/presentation/consent/n;)V
    .locals 5

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/databinding/c;

    if-eqz v0, :cond_3

    .line 3
    iget-object v1, v0, Lcom/sumsub/sns/databinding/c;->d:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 4
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/consent/n;->d:Ljava/lang/CharSequence;

    .line 5
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v1, v0, Lcom/sumsub/sns/databinding/c;->b:Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    .line 7
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/consent/n;->e:Landroid/text/SpannableStringBuilder;

    .line 8
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v1, v0, Lcom/sumsub/sns/databinding/c;->g:Lcom/sumsub/sns/core/widget/SNSH2TextView;

    .line 10
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/consent/n;->b:Ljava/lang/CharSequence;

    .line 11
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 12
    iget-object v1, v0, Lcom/sumsub/sns/databinding/c;->f:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 13
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/consent/n;->c:Ljava/lang/CharSequence;

    .line 14
    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 15
    iget-object v1, v0, Lcom/sumsub/sns/databinding/c;->b:Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/consent/w;

    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/consent/w;-><init>(Lcom/sumsub/sns/internal/features/presentation/consent/f;)V

    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 16
    iget-object v1, v0, Lcom/sumsub/sns/databinding/c;->d:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 17
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/consent/n;->a:Ljava/lang/Integer;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    .line 18
    :goto_0
    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 19
    iget-object v1, v0, Lcom/sumsub/sns/databinding/c;->b:Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    .line 20
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/consent/n;->a:Ljava/lang/Integer;

    if-nez v2, :cond_1

    const/4 v3, 0x4

    .line 21
    :cond_1
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 22
    iget-object v0, v0, Lcom/sumsub/sns/databinding/c;->b:Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    .line 23
    iget-boolean v1, p1, Lcom/sumsub/sns/internal/features/presentation/consent/n;->g:Z

    if-eqz v1, :cond_2

    const v4, 0x800003

    .line 24
    :cond_2
    invoke-virtual {v0, v4}, Landroid/widget/TextView;->setGravity(I)V

    .line 25
    :cond_3
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/consent/f;->a(Lcom/sumsub/sns/internal/features/presentation/consent/n;)V

    return-void
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/consent/f;->b:Ljava/lang/String;

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

.method public final getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/consent/f;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/consent/u;

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

.method public final handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V
    .locals 7

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/consent/m;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/consent/m;

    .line 7
    .line 8
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/consent/m;->a:Ljava/lang/String;

    .line 9
    .line 10
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v0}, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;-><init>()V

    .line 14
    .line 15
    new-instance v1, Landroid/os/Bundle;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1}, Landroid/os/Bundle;-><init>()V

    .line 19
    .line 20
    const-string v2, "ARGS_DATA"

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2, p1}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Landroidx/fragment/app/Fragment;->setArguments(Landroid/os/Bundle;)V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 30
    move-result-object p1

    .line 31
    .line 32
    const-string v1, "TermsAndConditionsBottomSheet"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1, v1}, Landroidx/fragment/app/DialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 36
    return-void

    .line 37
    .line 38
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/consent/g;

    .line 39
    .line 40
    if-eqz v0, :cond_1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    iget-object v3, p0, Lcom/sumsub/sns/internal/features/presentation/consent/f;->b:Ljava/lang/String;

    .line 51
    .line 52
    sget-object v4, Lcom/sumsub/sns/internal/core/analytics/Control;->AcceptButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 53
    .line 54
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/consent/g;

    .line 55
    .line 56
    iget-object v0, p1, Lcom/sumsub/sns/internal/features/presentation/consent/g;->a:Ljava/lang/String;

    .line 57
    .line 58
    const-string v5, "agreementCountry"

    .line 59
    .line 60
    .line 61
    invoke-static {v5, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/consent/g;->b:Ljava/lang/String;

    .line 65
    .line 66
    const-string v5, "agreementTitleKey"

    .line 67
    .line 68
    .line 69
    invoke-static {v5, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    filled-new-array {v0, p1}, [Lkotlin/Pair;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-static {p1}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 78
    move-result-object v5

    .line 79
    .line 80
    const/16 v6, 0x10

    .line 81
    .line 82
    .line 83
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 84
    return-void

    .line 85
    .line 86
    .line 87
    :cond_1
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/l;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

    .line 88
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public final bridge synthetic handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/consent/n;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/consent/f;->b(Lcom/sumsub/sns/internal/features/presentation/consent/n;)V

    .line 6
    return-void
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

.method public final onDestroyView()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/core/presentation/base/F;->onDestroyView()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/consent/f;->c:Ljava/util/List;

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

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 7

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/common/u;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    new-instance v2, Lcom/sumsub/sns/internal/core/common/v;

    .line 7
    .line 8
    .line 9
    invoke-direct {v2}, Lcom/sumsub/sns/internal/core/common/v;-><init>()V

    .line 10
    const/4 v5, 0x6

    .line 11
    const/4 v6, 0x0

    .line 12
    const/4 v3, 0x0

    .line 13
    const/4 v4, 0x0

    .line 14
    move-object v1, p0

    .line 15
    .line 16
    .line 17
    invoke-static/range {v1 .. v6}, Lcom/sumsub/sns/core/presentation/base/l;->finish$idensic_mobile_sdk_aar_defaultRelease$default(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/common/w;Ljava/lang/Object;Ljava/lang/Long;ILjava/lang/Object;)V

    .line 18
    const/4 p1, 0x0

    .line 19
    return p1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/F;->onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z

    .line 23
    move-result p1

    .line 24
    return p1
    .line 25
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/F;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Lcom/sumsub/sns/databinding/c;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p2, p1, Lcom/sumsub/sns/databinding/c;->d:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 14
    .line 15
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/consent/e;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/consent/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/consent/f;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p2}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 22
    .line 23
    iget-object p1, p1, Lcom/sumsub/sns/databinding/c;->c:Landroid/widget/ImageView;

    .line 24
    .line 25
    sget-object p2, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p2}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    sget-object v1, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->PICTURE_AGREEMENT:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-interface {p2, v0, v1}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    .line 43
    move-result-object p2

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 47
    :cond_0
    return-void
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

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 9

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_agreement_selector:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0, p2, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    sget p2, Lcom/sumsub/sns/R$id;->sns_barrier_start:I

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Landroidx/constraintlayout/widget/Barrier;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget p2, Lcom/sumsub/sns/R$id;->sns_footer:I

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 23
    move-result-object v0

    .line 24
    move-object v3, v0

    .line 25
    .line 26
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    .line 27
    .line 28
    if-eqz v3, :cond_0

    .line 29
    .line 30
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_end:I

    .line 31
    .line 32
    .line 33
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 37
    .line 38
    if-eqz v0, :cond_0

    .line 39
    .line 40
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_start:I

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    sget p2, Lcom/sumsub/sns/R$id;->sns_icon:I

    .line 51
    .line 52
    .line 53
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 54
    move-result-object v0

    .line 55
    move-object v4, v0

    .line 56
    .line 57
    check-cast v4, Landroid/widget/ImageView;

    .line 58
    .line 59
    if-eqz v4, :cond_0

    .line 60
    .line 61
    sget p2, Lcom/sumsub/sns/R$id;->sns_powered:I

    .line 62
    .line 63
    .line 64
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    if-eqz v0, :cond_0

    .line 68
    .line 69
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 70
    .line 71
    sget p2, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 72
    .line 73
    .line 74
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 75
    move-result-object v0

    .line 76
    move-object v5, v0

    .line 77
    .line 78
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 79
    .line 80
    if-eqz v5, :cond_0

    .line 81
    .line 82
    sget p2, Lcom/sumsub/sns/R$id;->sns_radiogroup:I

    .line 83
    .line 84
    .line 85
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 86
    move-result-object v0

    .line 87
    move-object v6, v0

    .line 88
    .line 89
    check-cast v6, Landroid/widget/RadioGroup;

    .line 90
    .line 91
    if-eqz v6, :cond_0

    .line 92
    .line 93
    sget p2, Lcom/sumsub/sns/R$id;->sns_scroller:I

    .line 94
    .line 95
    .line 96
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    check-cast v0, Landroidx/core/widget/NestedScrollView;

    .line 100
    .line 101
    if-eqz v0, :cond_0

    .line 102
    .line 103
    sget p2, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 104
    .line 105
    .line 106
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 107
    move-result-object v0

    .line 108
    move-object v7, v0

    .line 109
    .line 110
    check-cast v7, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 111
    .line 112
    if-eqz v7, :cond_0

    .line 113
    .line 114
    sget p2, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 115
    .line 116
    .line 117
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 118
    move-result-object v0

    .line 119
    move-object v8, v0

    .line 120
    .line 121
    check-cast v8, Lcom/sumsub/sns/core/widget/SNSH2TextView;

    .line 122
    .line 123
    if-eqz v8, :cond_0

    .line 124
    .line 125
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 126
    .line 127
    .line 128
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 132
    .line 133
    if-eqz v0, :cond_0

    .line 134
    .line 135
    new-instance v1, Lcom/sumsub/sns/databinding/c;

    .line 136
    move-object v2, p1

    .line 137
    .line 138
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;

    .line 139
    .line 140
    .line 141
    invoke-direct/range {v1 .. v8}, Lcom/sumsub/sns/databinding/c;-><init>(Lcom/sumsub/sns/core/widget/SNSBackgroundConstraintLayout;Lcom/sumsub/sns/core/widget/SNSBodyTextView;Landroid/widget/ImageView;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Landroid/widget/RadioGroup;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH2TextView;)V

    .line 142
    return-object v1

    .line 143
    .line 144
    .line 145
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 146
    move-result-object p1

    .line 147
    .line 148
    .line 149
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 150
    move-result-object p1

    .line 151
    .line 152
    new-instance p2, Ljava/lang/NullPointerException;

    .line 153
    .line 154
    const-string v0, "Missing required view with ID: "

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 158
    move-result-object p1

    .line 159
    .line 160
    .line 161
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 162
    throw p2
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
