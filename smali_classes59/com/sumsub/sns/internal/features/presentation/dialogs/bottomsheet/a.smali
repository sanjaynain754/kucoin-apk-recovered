.class public final Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;
.super Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;",
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

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nSNSTermsAndConditionsDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SNSTermsAndConditionsDialog.kt\ncom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/SNSTermsAndConditionsDialog\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,131:1\n1#2:132\n256#3,2:133\n256#3,2:135\n157#3,8:137\n*S KotlinDebug\n*F\n+ 1 SNSTermsAndConditionsDialog.kt\ncom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/SNSTermsAndConditionsDialog\n*L\n79#1:133,2\n82#1:135,2\n90#1:137,8\n*E\n"
    }
.end annotation


# instance fields
.field public a:Lcom/sumsub/sns/databinding/q;

.field public final b:Lkotlin/Lazy;

.field public final c:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/b;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->b:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/c;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->c:Lkotlin/Lazy;

    .line 26
    return-void
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;)Lcom/sumsub/sns/internal/core/analytics/f;
    .locals 2

    .line 12
    new-instance v0, Lcom/sumsub/sns/internal/core/analytics/f;

    .line 13
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->AgreementScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 14
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->b:Lkotlin/Lazy;

    .line 15
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 16
    invoke-direct {v0, v1, p0}, Lcom/sumsub/sns/internal/core/analytics/f;-><init>(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p0

    .line 2
    instance-of v0, p0, Lcom/sumsub/sns/internal/core/common/u0;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/sumsub/sns/internal/core/common/u0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_1

    .line 3
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;

    const/4 v0, 0x1

    invoke-virtual {p0, p1, v0}, Lcom/sumsub/sns/internal/features/presentation/main/SNSAppActivity;->a(Ljava/lang/String;Z)V

    .line 4
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;Landroid/content/DialogInterface;)V
    .locals 3

    .line 17
    check-cast p1, Lcom/google/android/material/bottomsheet/BottomSheetDialog;

    .line 18
    sget v0, Lcom/google/android/material/R$id;->design_bottom_sheet:I

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;

    move-result-object p1

    check-cast p1, Landroid/widget/FrameLayout;

    if-nez p1, :cond_0

    return-void

    .line 19
    :cond_0
    invoke-static {p1}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->from(Landroid/view/View;)Lcom/google/android/material/bottomsheet/BottomSheetBehavior;

    move-result-object p1

    const/4 v0, 0x3

    invoke-virtual {p1, v0}, Lcom/google/android/material/bottomsheet/BottomSheetBehavior;->setState(I)V

    .line 20
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->c:Lkotlin/Lazy;

    .line 21
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/analytics/f;

    .line 22
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->AgreementScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 23
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->b:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 v1, 0x0

    const/16 v2, 0xc

    .line 24
    invoke-static {p1, v0, p0, v1, v2}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;I)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;Landroid/view/View;)V
    .locals 6

    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->c:Lkotlin/Lazy;

    .line 6
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v0, p1

    check-cast v0, Lcom/sumsub/sns/internal/core/analytics/f;

    .line 7
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Screen;->AgreementScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 8
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->b:Lkotlin/Lazy;

    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v2, p1

    check-cast v2, Ljava/lang/String;

    .line 9
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Control;->CloseButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    const/4 v4, 0x0

    const/16 v5, 0x18

    .line 10
    invoke-static/range {v0 .. v5}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;I)V

    .line 11
    invoke-virtual {p0}, Lcom/google/android/material/bottomsheet/BottomSheetDialogFragment;->dismiss()V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;)Ljava/lang/String;
    .locals 3

    .line 1
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragmentManager()Landroidx/fragment/app/FragmentManager;

    move-result-object p0

    invoke-virtual {p0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    move-result-object p0

    .line 2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p0, v0}, Ljava/util/List;->listIterator(I)Ljava/util/ListIterator;

    move-result-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/ListIterator;->hasPrevious()Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {p0}, Ljava/util/ListIterator;->previous()Ljava/lang/Object;

    move-result-object v0

    move-object v2, v0

    check-cast v2, Landroidx/fragment/app/Fragment;

    instance-of v2, v2, Lcom/sumsub/sns/core/presentation/base/l;

    if-eqz v2, :cond_0

    goto :goto_0

    :cond_1
    move-object v0, v1

    .line 3
    :goto_0
    instance-of p0, v0, Lcom/sumsub/sns/core/presentation/base/l;

    if-eqz p0, :cond_2

    check-cast v0, Lcom/sumsub/sns/core/presentation/base/l;

    goto :goto_1

    :cond_2
    move-object v0, v1

    :goto_1
    if-eqz v0, :cond_3

    .line 4
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    move-result-object v1

    :cond_3
    if-nez v1, :cond_4

    .line 5
    const-string p0, "TYPE_UNKNOWN"

    return-object p0

    :cond_4
    return-object v1
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;Landroid/content/DialogInterface;)V
    .locals 3

    .line 6
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->c:Lkotlin/Lazy;

    .line 7
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/analytics/f;

    .line 8
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->AgreementScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 9
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->b:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    const/4 v1, 0x0

    const/16 v2, 0xc

    .line 10
    invoke-static {p1, v0, p0, v1, v2}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/f;Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/LinkedHashMap;I)V

    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/core/widget/SNSToolbarView;)V
    .locals 3

    .line 25
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v0

    .line 26
    sget-object v1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    invoke-virtual {v1}, Lcom/sumsub/sns/internal/core/common/k0;->getIconHandler()Lcom/sumsub/sns/core/data/listener/SNSIconHandler;

    move-result-object v1

    .line 27
    sget-object v2, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->CLOSE:Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;

    invoke-virtual {v2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler$SNSCommonIcons;->getImageName()Ljava/lang/String;

    move-result-object v2

    invoke-interface {v1, v0, v2}, Lcom/sumsub/sns/core/data/listener/SNSIconHandler;->onResolveIcon(Landroid/content/Context;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    if-nez v1, :cond_0

    .line 28
    invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/sumsub/sns/R$drawable;->sns_ic_close:I

    invoke-virtual {v0}, Landroid/content/Context;->getTheme()Landroid/content/res/Resources$Theme;

    move-result-object v0

    invoke-static {v1, v2, v0}, Landroidx/core/content/res/ResourcesCompat;->getDrawable(Landroid/content/res/Resources;ILandroid/content/res/Resources$Theme;)Landroid/graphics/drawable/Drawable;

    move-result-object v1

    .line 29
    :cond_0
    invoke-virtual {p1, v1}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setCloseButtonDrawable(Landroid/graphics/drawable/Drawable;)V

    .line 30
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/g;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;)V

    invoke-virtual {p1, v0}, Lcom/sumsub/sns/core/widget/SNSToolbarView;->setOnCloseButtonClickListener(Landroid/view/View$OnClickListener;)V

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
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/d;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/d;-><init>(Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 13
    .line 14
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/e;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/e;-><init>(Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 21
    return-object p1
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public final onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 7

    .line 1
    .line 2
    sget p3, Lcom/sumsub/sns/R$layout;->sns_fragment_terms_and_conditions:I

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    sget p2, Lcom/sumsub/sns/R$id;->sns_content:I

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 13
    move-result-object p3

    .line 14
    move-object v2, p3

    .line 15
    .line 16
    check-cast v2, Landroidx/core/widget/NestedScrollView;

    .line 17
    .line 18
    if-eqz v2, :cond_0

    .line 19
    .line 20
    sget p2, Lcom/sumsub/sns/R$id;->sns_text:I

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 24
    move-result-object p3

    .line 25
    move-object v3, p3

    .line 26
    .line 27
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSTextView;

    .line 28
    .line 29
    if-eqz v3, :cond_0

    .line 30
    .line 31
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 35
    move-result-object p3

    .line 36
    move-object v4, p3

    .line 37
    .line 38
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 39
    .line 40
    if-eqz v4, :cond_0

    .line 41
    .line 42
    sget p2, Lcom/sumsub/sns/R$id;->sns_web_content:I

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 46
    move-result-object p3

    .line 47
    move-object v5, p3

    .line 48
    .line 49
    check-cast v5, Landroidx/core/widget/NestedScrollView;

    .line 50
    .line 51
    if-eqz v5, :cond_0

    .line 52
    .line 53
    sget p2, Lcom/sumsub/sns/R$id;->sns_webview:I

    .line 54
    .line 55
    .line 56
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 57
    move-result-object p3

    .line 58
    move-object v6, p3

    .line 59
    .line 60
    check-cast v6, Landroid/webkit/WebView;

    .line 61
    .line 62
    if-eqz v6, :cond_0

    .line 63
    .line 64
    new-instance v0, Lcom/sumsub/sns/databinding/q;

    .line 65
    move-object v1, p1

    .line 66
    .line 67
    check-cast v1, Lcom/sumsub/sns/core/widget/SNSBottomSheetView;

    .line 68
    .line 69
    .line 70
    invoke-direct/range {v0 .. v6}, Lcom/sumsub/sns/databinding/q;-><init>(Lcom/sumsub/sns/core/widget/SNSBottomSheetView;Landroidx/core/widget/NestedScrollView;Lcom/sumsub/sns/core/widget/SNSTextView;Lcom/sumsub/sns/core/widget/SNSToolbarView;Landroidx/core/widget/NestedScrollView;Landroid/webkit/WebView;)V

    .line 71
    .line 72
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->a:Lcom/sumsub/sns/databinding/q;

    .line 73
    return-object v1

    .line 74
    .line 75
    .line 76
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    .line 80
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    new-instance p2, Ljava/lang/NullPointerException;

    .line 84
    .line 85
    const-string p3, "Missing required view with ID: "

    .line 86
    .line 87
    .line 88
    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    .line 92
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 93
    throw p2
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
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->a:Lcom/sumsub/sns/databinding/q;

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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Landroidx/fragment/app/Fragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->a:Lcom/sumsub/sns/databinding/q;

    .line 6
    .line 7
    if-eqz p1, :cond_0

    .line 8
    .line 9
    iget-object p1, p1, Lcom/sumsub/sns/databinding/q;->d:Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->a(Lcom/sumsub/sns/core/widget/SNSToolbarView;)V

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    if-eqz p1, :cond_5

    .line 19
    .line 20
    const-string p2, "ARGS_DATA"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p2}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    if-eqz v2, :cond_5

    .line 27
    .line 28
    sget-object p1, Lcom/sumsub/sns/internal/core/common/G;->a:Ljava/util/regex/Pattern;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1, v2}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Ljava/util/regex/Matcher;->find()Z

    .line 36
    move-result p1

    .line 37
    .line 38
    const/16 p2, 0x8

    .line 39
    .line 40
    if-eqz p1, :cond_2

    .line 41
    .line 42
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->a:Lcom/sumsub/sns/databinding/q;

    .line 43
    .line 44
    if-eqz p1, :cond_1

    .line 45
    .line 46
    iget-object p1, p1, Lcom/sumsub/sns/databinding/q;->b:Landroidx/core/widget/NestedScrollView;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 50
    .line 51
    :cond_1
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->a:Lcom/sumsub/sns/databinding/q;

    .line 52
    .line 53
    if-eqz p1, :cond_5

    .line 54
    .line 55
    iget-object v0, p1, Lcom/sumsub/sns/databinding/q;->f:Landroid/webkit/WebView;

    .line 56
    .line 57
    const-string v4, "UTF-8"

    .line 58
    const/4 v5, 0x0

    .line 59
    const/4 v1, 0x0

    .line 60
    .line 61
    .line 62
    const-string/jumbo v3, "text/html"

    .line 63
    .line 64
    .line 65
    invoke-virtual/range {v0 .. v5}, Landroid/webkit/WebView;->loadDataWithBaseURL(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 66
    goto :goto_0

    .line 67
    .line 68
    :cond_2
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->a:Lcom/sumsub/sns/databinding/q;

    .line 69
    .line 70
    if-eqz p1, :cond_3

    .line 71
    .line 72
    iget-object p1, p1, Lcom/sumsub/sns/databinding/q;->e:Landroidx/core/widget/NestedScrollView;

    .line 73
    .line 74
    .line 75
    invoke-virtual {p1, p2}, Landroid/view/View;->setVisibility(I)V

    .line 76
    .line 77
    :cond_3
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->a:Lcom/sumsub/sns/databinding/q;

    .line 78
    .line 79
    if-eqz p1, :cond_4

    .line 80
    .line 81
    iget-object p1, p1, Lcom/sumsub/sns/databinding/q;->c:Lcom/sumsub/sns/core/widget/SNSTextView;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 85
    move-result-object p2

    .line 86
    .line 87
    .line 88
    invoke-static {v2, p2}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    .line 89
    move-result-object p2

    .line 90
    .line 91
    .line 92
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 93
    .line 94
    :cond_4
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->a:Lcom/sumsub/sns/databinding/q;

    .line 95
    .line 96
    if-eqz p1, :cond_5

    .line 97
    .line 98
    iget-object p1, p1, Lcom/sumsub/sns/databinding/q;->c:Lcom/sumsub/sns/core/widget/SNSTextView;

    .line 99
    .line 100
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/f;

    .line 101
    .line 102
    .line 103
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;)V

    .line 104
    .line 105
    .line 106
    invoke-static {p1, p2}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 107
    .line 108
    :cond_5
    :goto_0
    sget-object p1, Lcom/sumsub/sns/internal/core/common/k0;->a:Lcom/sumsub/sns/internal/core/common/k0;

    .line 109
    .line 110
    .line 111
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/core/common/k0;->getCustomization()Lcom/sumsub/sns/core/theme/SNSJsonCustomization;

    .line 112
    move-result-object p1

    .line 113
    const/4 p2, 0x0

    .line 114
    .line 115
    if-eqz p1, :cond_6

    .line 116
    .line 117
    .line 118
    invoke-interface {p1}, Lcom/sumsub/sns/core/theme/SNSJsonCustomization;->getTheme()Lcom/sumsub/sns/core/theme/SNSCustomizationTheme;

    .line 119
    move-result-object p1

    .line 120
    goto :goto_1

    .line 121
    :cond_6
    move-object p1, p2

    .line 122
    .line 123
    :goto_1
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 124
    .line 125
    if-eqz v0, :cond_7

    .line 126
    .line 127
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;

    .line 128
    goto :goto_2

    .line 129
    :cond_7
    move-object p1, p2

    .line 130
    .line 131
    :goto_2
    if-eqz p1, :cond_b

    .line 132
    .line 133
    sget-object v0, Lcom/sumsub/sns/core/theme/SNSMetricElement;->SCREEN_HORIZONTAL_MARGIN:Lcom/sumsub/sns/core/theme/SNSMetricElement;

    .line 134
    .line 135
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/theme/p;->d:Ljava/util/Map;

    .line 136
    .line 137
    if-eqz p1, :cond_8

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0}, Lcom/sumsub/sns/core/theme/SNSMetricElement;->getValue()Ljava/lang/String;

    .line 141
    move-result-object v0

    .line 142
    .line 143
    .line 144
    invoke-interface {p1, v0}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 145
    move-result-object p1

    .line 146
    .line 147
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/j;

    .line 148
    goto :goto_3

    .line 149
    :cond_8
    move-object p1, p2

    .line 150
    .line 151
    :goto_3
    instance-of v0, p1, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    .line 152
    .line 153
    if-eqz v0, :cond_9

    .line 154
    .line 155
    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/theme/d;

    .line 156
    goto :goto_4

    .line 157
    :cond_9
    move-object p1, p2

    .line 158
    .line 159
    :goto_4
    if-eqz p1, :cond_a

    .line 160
    .line 161
    iget-object p2, p1, Lcom/sumsub/sns/internal/core/presentation/theme/d;->a:Ljava/lang/Float;

    .line 162
    .line 163
    :cond_a
    if-eqz p2, :cond_b

    .line 164
    .line 165
    .line 166
    invoke-virtual {p2}, Ljava/lang/Number;->floatValue()F

    .line 167
    move-result p1

    .line 168
    .line 169
    iget-object p2, p0, Lcom/sumsub/sns/internal/features/presentation/dialogs/bottomsheet/a;->a:Lcom/sumsub/sns/databinding/q;

    .line 170
    .line 171
    if-eqz p2, :cond_b

    .line 172
    .line 173
    iget-object p2, p2, Lcom/sumsub/sns/databinding/q;->e:Landroidx/core/widget/NestedScrollView;

    .line 174
    float-to-int p1, p1

    .line 175
    .line 176
    .line 177
    invoke-virtual {p2}, Landroid/view/View;->getPaddingTop()I

    .line 178
    move-result v0

    .line 179
    .line 180
    .line 181
    invoke-virtual {p2}, Landroid/view/View;->getPaddingBottom()I

    .line 182
    move-result v1

    .line 183
    .line 184
    .line 185
    invoke-virtual {p2, p1, v0, p1, v1}, Landroid/view/View;->setPadding(IIII)V

    .line 186
    :cond_b
    return-void
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
