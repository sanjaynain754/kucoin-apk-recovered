.class public final Lcom/sumsub/sns/internal/features/presentation/poa/g;
.super Lcom/sumsub/sns/internal/features/presentation/common/g;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/internal/features/presentation/common/g<",
        "Lcom/sumsub/sns/databinding/l;",
        "Lcom/sumsub/sns/internal/features/presentation/poa/l;",
        "Lcom/sumsub/sns/internal/features/presentation/poa/x;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/poa/g;",
        "Lcom/sumsub/sns/internal/features/presentation/common/g;",
        "Lcom/sumsub/sns/databinding/l;",
        "Lcom/sumsub/sns/internal/features/presentation/poa/l;",
        "Lcom/sumsub/sns/internal/features/presentation/poa/x;",
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
        "SMAP\nSNSProofOfAddressFragmentV2.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSProofOfAddressFragmentV2.kt\ncom/sumsub/sns/internal/features/presentation/poa/SNSProofOfAddressFragmentV2\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 6 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n*L\n1#1,285:1\n106#2,15:286\n256#3,2:301\n256#3,2:303\n256#3,2:305\n256#3,2:307\n256#3,2:309\n256#3,2:311\n1869#4,2:313\n1869#4,2:315\n1869#4,2:317\n1#5:319\n27#6,4:320\n*S KotlinDebug\n*F\n+ 1 SNSProofOfAddressFragmentV2.kt\ncom/sumsub/sns/internal/features/presentation/poa/SNSProofOfAddressFragmentV2\n*L\n38#1:286,15\n90#1:301,2\n102#1:303,2\n109#1:305,2\n110#1:307,2\n111#1:309,2\n112#1:311,2\n121#1:313,2\n205#1:315,2\n217#1:317,2\n40#1:320,4\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic V:I


# instance fields
.field public final e:Lkotlin/Lazy;

.field public final f:Ljava/lang/String;

.field public final g:Lcom/sumsub/sns/internal/core/analytics/Screen;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/internal/features/presentation/common/g;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/poa/z;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/poa/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/g;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/poa/b;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/poa/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/g;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/poa/c;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/poa/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/b;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/poa/x;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/poa/d;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/poa/d;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/poa/e;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/poa/e;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->e:Lkotlin/Lazy;

    .line 47
    .line 48
    const-string v0, "PROOF_OF_RESIDENCE"

    .line 49
    .line 50
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->f:Ljava/lang/String;

    .line 51
    .line 52
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->PoaUploadScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 53
    .line 54
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->g:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 55
    return-void
    .line 56
    .line 57
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/poa/g;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 5

    .line 3
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/poa/a;

    .line 4
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 5
    const-string v3, "ARGS_DOCUMENT"

    const-class v4, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    invoke-static {v1, v3, v4, v2}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 6
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getServiceLocator$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/domain/h;

    move-result-object v1

    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v3

    .line 8
    invoke-direct {v0, v2, p0, v1, v3}, Lcom/sumsub/sns/internal/features/presentation/poa/a;-><init>(Lcom/sumsub/sns/internal/features/data/model/common/Document;Lcom/sumsub/sns/internal/features/presentation/poa/g;Lcom/sumsub/sns/internal/core/domain/h;Landroid/os/Bundle;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/poa/g;Lcom/sumsub/sns/databinding/l;)Lkotlin/Unit;
    .locals 6

    .line 134
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    .line 135
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->PoaInstructionsScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 136
    iget-object v2, p0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->f:Ljava/lang/String;

    .line 137
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->DismissButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 138
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 139
    iget-object p0, p1, Lcom/sumsub/sns/databinding/l;->i:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    invoke-virtual {p0}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->hide()V

    .line 140
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/poa/g;Lcom/sumsub/sns/internal/features/presentation/poa/k;)Lkotlin/Unit;
    .locals 4

    .line 84
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->InfoButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v2, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 85
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->i:Lcom/sumsub/sns/internal/features/presentation/poa/o;

    .line 86
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->e:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;

    .line 87
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/poa/x;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 88
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/poa/g;Lcom/sumsub/sns/internal/features/presentation/poa/k;Lcom/sumsub/sns/databinding/l;)Lkotlin/Unit;
    .locals 4

    .line 89
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object v0

    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->ContinueButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v2, 0x0

    const/4 v3, 0x6

    invoke-static {v0, v1, v2, v2, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;I)V

    .line 90
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->c:Lcom/sumsub/sns/internal/features/presentation/poa/j;

    .line 91
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/j;->a:Lcom/sumsub/sns/internal/features/domain/documents/w;

    if-eqz p1, :cond_0

    .line 92
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->e:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/poa/x;

    .line 93
    sget-object p1, Lcom/sumsub/sns/internal/features/presentation/common/u;->a:Lcom/sumsub/sns/internal/features/presentation/common/u;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/G;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    goto :goto_0

    .line 94
    :cond_0
    iget-object p1, p2, Lcom/sumsub/sns/databinding/l;->j:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    invoke-virtual {p1}, Landroid/view/View;->getId()I

    move-result p1

    .line 95
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/poa/g;->getViewModel$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/core/presentation/base/C;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/common/G;

    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/common/t;

    invoke-direct {p2, p1}, Lcom/sumsub/sns/internal/features/presentation/common/t;-><init>(I)V

    invoke-virtual {p0, p2}, Lcom/sumsub/sns/internal/features/presentation/common/G;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    .line 96
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/poa/g;Z)Lkotlin/Unit;
    .locals 3

    const/16 v0, 0xc

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    .line 141
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p1

    .line 142
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Screen;->PoaInstructionsScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 143
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->f:Ljava/lang/String;

    .line 144
    invoke-static {p1, v2, p0, v1, v0}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;I)V

    goto :goto_0

    .line 145
    :cond_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p1

    .line 146
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Screen;->PoaInstructionsScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 147
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->f:Ljava/lang/String;

    .line 148
    invoke-static {p1, v2, p0, v1, v0}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/LinkedHashMap;I)V

    .line 149
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method


# virtual methods
.method public final a(Ljava/lang/CharSequence;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)Landroid/widget/LinearLayout;
    .locals 4

    .line 150
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 151
    sget v1, Lcom/sumsub/sns/R$layout;->sns_poa_examples_bottom_sheet_title:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 152
    sget v1, Lcom/sumsub/sns/R$id;->sns_image:I

    .line 153
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/core/widget/SNSImageView;

    if-eqz v2, :cond_1

    .line 154
    sget v1, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 155
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;

    if-eqz v3, :cond_1

    .line 156
    check-cast v0, Landroid/widget/LinearLayout;

    .line 157
    invoke-virtual {v3, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    if-eqz p2, :cond_0

    .line 158
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object p1

    .line 159
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v1

    invoke-interface {v1, p1, p2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object p1

    .line 160
    invoke-virtual {v2, p1}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 161
    :cond_0
    invoke-static {v2, p3}, Lcom/sumsub/sns/core/widget/SNSStepViewExtensionsKt;->setSnsStepState(Landroid/view/View;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)V

    return-object v0

    .line 162
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    .line 163
    new-instance p2, Ljava/lang/NullPointerException;

    const-string p3, "Missing required view with ID: "

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p2
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/poa/m;)Landroidx/constraintlayout/widget/ConstraintLayout;
    .locals 6

    .line 164
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getLayoutInflater()Landroid/view/LayoutInflater;

    move-result-object v0

    .line 165
    sget v1, Lcom/sumsub/sns/R$layout;->sns_poa_examples_bottom_sheet_item:I

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-virtual {v0, v1, v2, v3}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    move-result-object v0

    .line 166
    sget v1, Lcom/sumsub/sns/R$id;->sns_bullet:I

    .line 167
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/core/widget/SNSH2TextView;

    if-eqz v2, :cond_3

    .line 168
    sget v1, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 169
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v2

    check-cast v2, Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    if-eqz v2, :cond_3

    .line 170
    sget v1, Lcom/sumsub/sns/R$id;->sns_text:I

    .line 171
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/core/widget/SNSBodyTextView;

    if-eqz v3, :cond_3

    .line 172
    sget v1, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 173
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    if-eqz v4, :cond_3

    .line 174
    check-cast v0, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 175
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_STRONG:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {v0, v1}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_0

    .line 176
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v5

    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 177
    :cond_0
    iget-object v5, p1, Lcom/sumsub/sns/internal/features/presentation/poa/m;->a:Ljava/lang/CharSequence;

    .line 178
    invoke-static {v4, v5}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    if-eqz v1, :cond_1

    .line 179
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 180
    :cond_1
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/m;->c:Ljava/lang/CharSequence;

    .line 181
    invoke-static {v3, v1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 182
    sget-object v1, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_WEAK:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {v2, v1}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    move-result-object v1

    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 183
    :cond_2
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/m;->b:Ljava/lang/CharSequence;

    .line 184
    invoke-static {v2, p1}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    return-object v0

    .line 185
    :cond_3
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    .line 186
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public final a(I)V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->e:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/poa/x;

    .line 2
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/poa/i;

    invoke-direct {v1, p1}, Lcom/sumsub/sns/internal/features/presentation/poa/i;-><init>(I)V

    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/features/presentation/poa/x;->intent(Lcom/sumsub/sns/core/presentation/base/Q;)V

    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/poa/k;)V
    .locals 13

    .line 9
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/databinding/l;

    if-eqz v0, :cond_3

    .line 10
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->m:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    const/4 v2, 0x0

    .line 11
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 12
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->l:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 13
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 14
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->k:Landroid/widget/ScrollView;

    .line 15
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 16
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->h:Landroid/widget/FrameLayout;

    const/16 v3, 0x8

    .line 17
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 18
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->m:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 19
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->a:Ljava/lang/CharSequence;

    .line 20
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 21
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->l:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 22
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->b:Ljava/lang/CharSequence;

    .line 23
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->c:Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;

    .line 25
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->j:Ljava/lang/CharSequence;

    .line 26
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 27
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->d:Landroid/widget/LinearLayout;

    .line 28
    invoke-virtual {v1}, Landroid/view/ViewGroup;->removeAllViews()V

    .line 29
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->k:Ljava/util/List;

    if-eqz v4, :cond_1

    .line 30
    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_0
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_1

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/CharSequence;

    .line 31
    new-instance v6, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v7

    const/16 v11, 0xe

    const/4 v12, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;IIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 32
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 33
    sget-object v5, Lcom/sumsub/sns/core/theme/SNSColorElement;->CONTENT_STRONG:Lcom/sumsub/sns/core/theme/SNSColorElement;

    invoke-static {v6, v5}, Lcom/sumsub/sns/core/presentation/helper/b;->a(Landroid/view/View;Lcom/sumsub/sns/core/theme/SNSColorElement;)Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5

    goto :goto_1

    .line 34
    :cond_0
    invoke-virtual {v6}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v5

    sget v7, Lcom/sumsub/sns/R$color;->sns_contentStrong:I

    invoke-virtual {v5, v7}, Landroid/content/Context;->getColor(I)I

    move-result v5

    .line 35
    :goto_1
    invoke-virtual {v6, v5}, Landroid/widget/TextView;->setTextColor(I)V

    .line 36
    invoke-virtual {v1, v6}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 37
    :cond_1
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->b:Lcom/sumsub/sns/core/widget/SNSLinkButton;

    .line 38
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->g:Ljava/lang/CharSequence;

    .line 39
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->b:Lcom/sumsub/sns/core/widget/SNSLinkButton;

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/poa/f;

    invoke-direct {v4, p0, p1}, Lcom/sumsub/sns/internal/features/presentation/poa/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/g;Lcom/sumsub/sns/internal/features/presentation/poa/k;)V

    invoke-static {v4, v1}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 41
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->b:Lcom/sumsub/sns/core/widget/SNSLinkButton;

    .line 42
    iget-boolean v4, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->h:Z

    .line 43
    invoke-virtual {v1, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 44
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->j:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 45
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->e:Ljava/lang/CharSequence;

    .line 46
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->j:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 48
    iget-boolean v4, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->f:Z

    .line 49
    invoke-virtual {v1, v4}, Landroid/view/View;->setEnabled(Z)V

    .line 50
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->j:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/poa/y;

    invoke-direct {v4, p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/poa/y;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/g;Lcom/sumsub/sns/internal/features/presentation/poa/k;Lcom/sumsub/sns/databinding/l;)V

    invoke-static {v4, v1}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 51
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->g:Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 52
    iget-object v4, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->q:Ljava/lang/CharSequence;

    .line 53
    invoke-virtual {v1, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    new-instance v10, Lcom/sumsub/sns/internal/features/presentation/utils/n;

    .line 55
    iget-object v6, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->n:Ljava/lang/CharSequence;

    .line 56
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->o:Ljava/lang/CharSequence;

    .line 57
    iget-object v8, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->l:Ljava/lang/CharSequence;

    .line 58
    iget-object v9, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->m:Ljava/lang/CharSequence;

    move-object v5, v10

    .line 59
    iget-object v10, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->r:Ljava/lang/CharSequence;

    .line 60
    iget-object v11, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->s:Ljava/lang/CharSequence;

    .line 61
    iget-object v12, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->p:Ljava/lang/CharSequence;

    .line 62
    invoke-direct/range {v5 .. v12}, Lcom/sumsub/sns/internal/features/presentation/utils/n;-><init>(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V

    .line 63
    iget-object v6, v0, Lcom/sumsub/sns/databinding/l;->e:Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 64
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->c:Lcom/sumsub/sns/internal/features/presentation/poa/j;

    move-object v10, v5

    .line 65
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/common/g;->c:Lcom/sumsub/sns/internal/features/presentation/utils/o;

    .line 66
    iget-object v7, v1, Lcom/sumsub/sns/internal/features/presentation/poa/j;->a:Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 67
    iget-boolean v8, v1, Lcom/sumsub/sns/internal/features/presentation/poa/j;->d:Z

    .line 68
    iget-boolean v9, v1, Lcom/sumsub/sns/internal/features/presentation/poa/j;->c:Z

    .line 69
    invoke-virtual/range {v5 .. v10}, Lcom/sumsub/sns/internal/features/presentation/utils/o;->a(Lcom/sumsub/sns/core/widget/SNSFileItemView;Lcom/sumsub/sns/internal/features/domain/documents/w;ZZLcom/sumsub/sns/internal/features/presentation/utils/n;)V

    move-object v5, v10

    .line 70
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 71
    iget-boolean v1, v1, Lcom/sumsub/sns/internal/features/presentation/poa/j;->b:Z

    .line 72
    invoke-virtual {v6, v1}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setEnabled(Z)V

    .line 73
    iget-object v6, v0, Lcom/sumsub/sns/databinding/l;->f:Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 74
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;->d:Lcom/sumsub/sns/internal/features/presentation/poa/j;

    if-nez p1, :cond_2

    .line 75
    invoke-virtual {v6, v3}, Landroid/view/View;->setVisibility(I)V

    return-void

    :cond_2
    move-object v10, v5

    .line 76
    iget-object v5, p0, Lcom/sumsub/sns/internal/features/presentation/common/g;->c:Lcom/sumsub/sns/internal/features/presentation/utils/o;

    .line 77
    iget-object v7, p1, Lcom/sumsub/sns/internal/features/presentation/poa/j;->a:Lcom/sumsub/sns/internal/features/domain/documents/w;

    .line 78
    iget-boolean v8, p1, Lcom/sumsub/sns/internal/features/presentation/poa/j;->d:Z

    .line 79
    iget-boolean v9, p1, Lcom/sumsub/sns/internal/features/presentation/poa/j;->c:Z

    .line 80
    invoke-virtual/range {v5 .. v10}, Lcom/sumsub/sns/internal/features/presentation/utils/o;->a(Lcom/sumsub/sns/core/widget/SNSFileItemView;Lcom/sumsub/sns/internal/features/domain/documents/w;ZZLcom/sumsub/sns/internal/features/presentation/utils/n;)V

    .line 81
    invoke-virtual {v6, v2}, Landroid/view/View;->setVisibility(I)V

    .line 82
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/j;->b:Z

    .line 83
    invoke-virtual {v6, p1}, Lcom/sumsub/sns/core/widget/SNSFileItemView;->setEnabled(Z)V

    :cond_3
    return-void
.end method

.method public final a(Lcom/sumsub/sns/internal/features/presentation/poa/n;)V
    .locals 6

    .line 97
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/databinding/l;

    if-eqz v0, :cond_3

    .line 98
    iget-object v1, v0, Lcom/sumsub/sns/databinding/l;->i:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    sget v2, Lcom/sumsub/sns/R$layout;->sns_poa_examples_bottom_sheet:I

    invoke-virtual {v1, v2}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->inflate(I)Landroid/view/View;

    move-result-object v1

    .line 99
    sget v2, Lcom/sumsub/sns/R$id;->sns_poa_examples_button:I

    .line 100
    invoke-static {v1, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    if-eqz v3, :cond_2

    .line 101
    sget v2, Lcom/sumsub/sns/R$id;->sns_poa_examples_divider:I

    .line 102
    invoke-static {v1, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Lcom/sumsub/sns/core/widget/SNSBottomSheetHandleView;

    if-eqz v4, :cond_2

    .line 103
    sget v2, Lcom/sumsub/sns/R$id;->sns_poa_examples_scroller:I

    .line 104
    invoke-static {v1, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroidx/core/widget/NestedScrollView;

    if-eqz v4, :cond_2

    .line 105
    sget v2, Lcom/sumsub/sns/R$id;->sns_poa_examples_scroller_content:I

    .line 106
    invoke-static {v1, v2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    move-result-object v4

    check-cast v4, Landroid/widget/LinearLayout;

    if-eqz v4, :cond_2

    .line 107
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/n;->g:Ljava/lang/CharSequence;

    .line 108
    invoke-virtual {v3, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 109
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/poa/a0;

    invoke-direct {v1, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/poa/a0;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/g;Lcom/sumsub/sns/databinding/l;)V

    invoke-static {v1, v3}, Lcom/sumsub/sns/internal/core/common/k;->a(Lkotlin/jvm/functions/Function0;Landroid/view/View;)V

    .line 110
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/n;->c:Ljava/util/List;

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    .line 111
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v2

    if-ne v1, v2, :cond_0

    .line 112
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/n;->a:Ljava/lang/CharSequence;

    .line 113
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/poa/n;->b:Ljava/lang/String;

    .line 114
    sget-object v5, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->APPROVED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 115
    invoke-virtual {p0, v1, v3, v5}, Lcom/sumsub/sns/internal/features/presentation/poa/g;->a(Ljava/lang/CharSequence;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 116
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 117
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/n;->c:Ljava/util/List;

    .line 118
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/sumsub/sns/internal/features/presentation/poa/m;

    .line 119
    invoke-virtual {p0, v3}, Lcom/sumsub/sns/internal/features/presentation/poa/g;->a(Lcom/sumsub/sns/internal/features/presentation/poa/m;)Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v3

    invoke-virtual {v4, v3}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_0

    .line 120
    :cond_0
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/n;->f:Ljava/util/List;

    if-eqz v1, :cond_1

    .line 121
    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    xor-int/2addr v1, v2

    if-ne v1, v2, :cond_1

    .line 122
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/n;->d:Ljava/lang/CharSequence;

    .line 123
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/poa/n;->e:Ljava/lang/String;

    .line 124
    sget-object v3, Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;->REJECTED:Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;

    .line 125
    invoke-virtual {p0, v1, v2, v3}, Lcom/sumsub/sns/internal/features/presentation/poa/g;->a(Ljava/lang/CharSequence;Ljava/lang/String;Lcom/sumsub/sns/internal/core/presentation/widget/SNSStepState;)Landroid/widget/LinearLayout;

    move-result-object v1

    .line 126
    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    .line 127
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/n;->f:Ljava/util/List;

    .line 128
    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/poa/m;

    .line 129
    invoke-virtual {p0, v1}, Lcom/sumsub/sns/internal/features/presentation/poa/g;->a(Lcom/sumsub/sns/internal/features/presentation/poa/m;)Landroidx/constraintlayout/widget/ConstraintLayout;

    move-result-object v1

    invoke-virtual {v4, v1}, Landroid/view/ViewGroup;->addView(Landroid/view/View;)V

    goto :goto_1

    .line 130
    :cond_1
    iget-object p1, v0, Lcom/sumsub/sns/databinding/l;->i:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/poa/b0;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/poa/b0;-><init>(Lcom/sumsub/sns/internal/features/presentation/poa/g;)V

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->setStateCallback(Lkotlin/jvm/functions/Function1;)V

    .line 131
    iget-object p1, v0, Lcom/sumsub/sns/databinding/l;->i:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->show()V

    return-void

    .line 132
    :cond_2
    invoke-virtual {v1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    move-result-object p1

    invoke-virtual {p1, v2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    move-result-object p1

    .line 133
    new-instance v0, Ljava/lang/NullPointerException;

    const-string v1, "Missing required view with ID: "

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return-void
.end method

.method public final f()Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/sumsub/sns/databinding/l;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/databinding/l;->i:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 11
    return-object v0

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->f:Ljava/lang/String;

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

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->g:Lcom/sumsub/sns/internal/core/analytics/Screen;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/poa/g;->e:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/poa/x;

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
    .locals 1

    .line 1
    .line 2
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/poa/n;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/poa/n;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/poa/g;->a(Lcom/sumsub/sns/internal/features/presentation/poa/n;)V

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    instance-of v0, p1, Lcom/sumsub/sns/internal/features/presentation/poa/h;

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/l;->getAppListener$idensic_mobile_sdk_aar_defaultRelease()Lcom/sumsub/sns/internal/core/common/u0;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/poa/h;

    .line 23
    .line 24
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/poa/h;->a:Lcom/sumsub/sns/internal/features/data/model/common/Document;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/data/model/common/Document;->getType()Lcom/sumsub/sns/internal/features/data/model/common/X;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, p1}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Lcom/sumsub/sns/internal/features/data/model/common/X;)V

    .line 34
    :cond_1
    return-void

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-super {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/common/g;->handleEvent(Lcom/sumsub/sns/core/presentation/base/r;)V

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
.end method

.method public final handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/poa/l;

    .line 3
    .line 4
    instance-of p2, p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/poa/k;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/poa/g;->a(Lcom/sumsub/sns/internal/features/presentation/poa/k;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    .line 15
    .line 16
    .line 17
    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 18
    throw p1
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

.method public final onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/sumsub/sns/databinding/l;

    .line 7
    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/databinding/l;->i:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 11
    .line 12
    if-eqz v0, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->isHidden()Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    check-cast p1, Lcom/sumsub/sns/databinding/l;

    .line 25
    .line 26
    if-eqz p1, :cond_0

    .line 27
    .line 28
    iget-object p1, p1, Lcom/sumsub/sns/databinding/l;->i:Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 29
    .line 30
    if-eqz p1, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;->hide()V

    .line 34
    :cond_0
    const/4 p1, 0x0

    .line 35
    return p1

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-super {p0, p1}, Lcom/sumsub/sns/core/presentation/base/F;->onFinishCalled(Lcom/sumsub/sns/internal/core/common/w;)Z

    .line 39
    move-result p1

    .line 40
    return p1
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
.end method

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/internal/features/presentation/common/g;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/common/g;->c:Lcom/sumsub/sns/internal/features/presentation/utils/o;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 9
    move-result-object p2

    .line 10
    .line 11
    check-cast p2, Lcom/sumsub/sns/databinding/l;

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    if-eqz p2, :cond_0

    .line 15
    .line 16
    iget-object p2, p2, Lcom/sumsub/sns/databinding/l;->e:Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    move-object p2, v0

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    check-cast v1, Lcom/sumsub/sns/databinding/l;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    iget-object v0, v1, Lcom/sumsub/sns/databinding/l;->f:Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 29
    .line 30
    .line 31
    :cond_1
    filled-new-array {p2, v0}, [Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/features/presentation/utils/o;->a([Lcom/sumsub/sns/core/widget/SNSFileItemView;)V

    .line 36
    return-void
    .line 37
.end method

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 17

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_poa:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    move-object/from16 v2, p1

    .line 6
    .line 7
    move-object/from16 v3, p2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2, v0, v3, v1}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    sget v1, Lcom/sumsub/sns/R$id;->sns_container:I

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    check-cast v2, Landroid/widget/LinearLayout;

    .line 20
    .line 21
    if-eqz v2, :cond_0

    .line 22
    .line 23
    sget v1, Lcom/sumsub/sns/R$id;->sns_example_more:I

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 27
    move-result-object v2

    .line 28
    move-object v5, v2

    .line 29
    .line 30
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSLinkButton;

    .line 31
    .line 32
    if-eqz v5, :cond_0

    .line 33
    .line 34
    sget v1, Lcom/sumsub/sns/R$id;->sns_example_title:I

    .line 35
    .line 36
    .line 37
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 38
    move-result-object v2

    .line 39
    move-object v6, v2

    .line 40
    .line 41
    check-cast v6, Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;

    .line 42
    .line 43
    if-eqz v6, :cond_0

    .line 44
    .line 45
    sget v1, Lcom/sumsub/sns/R$id;->sns_examples_layout:I

    .line 46
    .line 47
    .line 48
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 49
    move-result-object v2

    .line 50
    move-object v7, v2

    .line 51
    .line 52
    check-cast v7, Landroid/widget/LinearLayout;

    .line 53
    .line 54
    if-eqz v7, :cond_0

    .line 55
    .line 56
    sget v1, Lcom/sumsub/sns/R$id;->sns_file1:I

    .line 57
    .line 58
    .line 59
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 60
    move-result-object v2

    .line 61
    move-object v8, v2

    .line 62
    .line 63
    check-cast v8, Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 64
    .line 65
    if-eqz v8, :cond_0

    .line 66
    .line 67
    sget v1, Lcom/sumsub/sns/R$id;->sns_file2:I

    .line 68
    .line 69
    .line 70
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 71
    move-result-object v2

    .line 72
    move-object v9, v2

    .line 73
    .line 74
    check-cast v9, Lcom/sumsub/sns/core/widget/SNSFileItemView;

    .line 75
    .line 76
    if-eqz v9, :cond_0

    .line 77
    .line 78
    sget v1, Lcom/sumsub/sns/R$id;->sns_file_formats_text_view:I

    .line 79
    .line 80
    .line 81
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 82
    move-result-object v2

    .line 83
    move-object v10, v2

    .line 84
    .line 85
    check-cast v10, Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 86
    .line 87
    if-eqz v10, :cond_0

    .line 88
    .line 89
    sget v1, Lcom/sumsub/sns/R$id;->sns_form_placeholder:I

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 93
    move-result-object v2

    .line 94
    move-object v11, v2

    .line 95
    .line 96
    check-cast v11, Landroid/widget/FrameLayout;

    .line 97
    .line 98
    if-eqz v11, :cond_0

    .line 99
    .line 100
    sget v1, Lcom/sumsub/sns/R$id;->sns_guideline_end:I

    .line 101
    .line 102
    .line 103
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 104
    move-result-object v2

    .line 105
    .line 106
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 107
    .line 108
    if-eqz v2, :cond_0

    .line 109
    .line 110
    sget v1, Lcom/sumsub/sns/R$id;->sns_guideline_start:I

    .line 111
    .line 112
    .line 113
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 114
    move-result-object v2

    .line 115
    .line 116
    check-cast v2, Landroidx/constraintlayout/widget/Guideline;

    .line 117
    .line 118
    if-eqz v2, :cond_0

    .line 119
    .line 120
    sget v1, Lcom/sumsub/sns/R$id;->sns_poa_bottom_sheet:I

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 124
    move-result-object v2

    .line 125
    move-object v12, v2

    .line 126
    .line 127
    check-cast v12, Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;

    .line 128
    .line 129
    if-eqz v12, :cond_0

    .line 130
    .line 131
    sget v1, Lcom/sumsub/sns/R$id;->sns_primary_button:I

    .line 132
    .line 133
    .line 134
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 135
    move-result-object v2

    .line 136
    move-object v13, v2

    .line 137
    .line 138
    check-cast v13, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 139
    .line 140
    if-eqz v13, :cond_0

    .line 141
    .line 142
    sget v1, Lcom/sumsub/sns/R$id;->sns_scroller:I

    .line 143
    .line 144
    .line 145
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 146
    move-result-object v2

    .line 147
    move-object v14, v2

    .line 148
    .line 149
    check-cast v14, Landroid/widget/ScrollView;

    .line 150
    .line 151
    if-eqz v14, :cond_0

    .line 152
    .line 153
    sget v1, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 154
    .line 155
    .line 156
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 157
    move-result-object v2

    .line 158
    move-object v15, v2

    .line 159
    .line 160
    check-cast v15, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 161
    .line 162
    if-eqz v15, :cond_0

    .line 163
    .line 164
    sget v1, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 165
    .line 166
    .line 167
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 168
    move-result-object v2

    .line 169
    .line 170
    move-object/from16 v16, v2

    .line 171
    .line 172
    check-cast v16, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 173
    .line 174
    if-eqz v16, :cond_0

    .line 175
    .line 176
    sget v1, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 177
    .line 178
    .line 179
    invoke-static {v0, v1}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 180
    move-result-object v2

    .line 181
    .line 182
    check-cast v2, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 183
    .line 184
    if-eqz v2, :cond_0

    .line 185
    .line 186
    new-instance v3, Lcom/sumsub/sns/databinding/l;

    .line 187
    move-object v4, v0

    .line 188
    .line 189
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSBackgroundView;

    .line 190
    .line 191
    .line 192
    invoke-direct/range {v3 .. v16}, Lcom/sumsub/sns/databinding/l;-><init>(Lcom/sumsub/sns/core/widget/SNSBackgroundView;Lcom/sumsub/sns/core/widget/SNSLinkButton;Lcom/sumsub/sns/core/widget/SNSSubtitle1TextView;Landroid/widget/LinearLayout;Lcom/sumsub/sns/core/widget/SNSFileItemView;Lcom/sumsub/sns/core/widget/SNSFileItemView;Lcom/sumsub/sns/core/widget/SNSCaptionTextView;Landroid/widget/FrameLayout;Lcom/sumsub/sns/core/widget/SNSCommonBottomSheetView;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Landroid/widget/ScrollView;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V

    .line 193
    return-object v3

    .line 194
    .line 195
    .line 196
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 197
    move-result-object v0

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 201
    move-result-object v0

    .line 202
    .line 203
    new-instance v1, Ljava/lang/NullPointerException;

    .line 204
    .line 205
    const-string v2, "Missing required view with ID: "

    .line 206
    .line 207
    .line 208
    invoke-virtual {v2, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 209
    move-result-object v0

    .line 210
    .line 211
    .line 212
    invoke-direct {v1, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 213
    throw v1
    .line 214
.end method
