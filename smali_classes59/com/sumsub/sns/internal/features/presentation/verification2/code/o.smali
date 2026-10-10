.class public final Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/t;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/t;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;",
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
        "SMAP\nOtpInputFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OtpInputFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/code/OtpInputFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 BundleExtensions.kt\ncom/sumsub/sns/internal/core/common/BundleExtensionsKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n+ 5 Extensions.kt\ncom/sumsub/sns/internal/core/common/ExtensionsKt\n*L\n1#1,121:1\n106#2,15:122\n27#3,4:137\n256#4,2:141\n119#5:143\n133#5,3:144\n*S KotlinDebug\n*F\n+ 1 OtpInputFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/code/OtpInputFragment\n*L\n31#1:122,15\n27#1:137,4\n83#1:141,2\n108#1:143\n108#1:144,3\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic U:I


# instance fields
.field public final a:Lkotlin/Lazy;

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/z;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/code/z;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/j;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/code/j;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification2/code/k;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/code/k;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/code/j;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification2/code/l;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/code/l;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/verification2/code/m;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/code/m;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;->a:Lkotlin/Lazy;

    .line 47
    const/4 v0, 0x1

    .line 48
    .line 49
    iput-boolean v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;->b:Z

    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 5

    .line 8
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/x;

    .line 9
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 10
    const-string/jumbo v3, "otp_screen"

    const-class v4, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/b;

    invoke-static {v1, v3, v4, v2}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    move-result-object v1

    move-object v2, v1

    check-cast v2, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/b;

    :cond_0
    if-eqz v2, :cond_1

    .line 11
    invoke-direct {v0, p0, v2}, Lcom/sumsub/sns/internal/features/presentation/verification2/code/x;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;Lcom/sumsub/sns/internal/core/presentation/screen/navigation/b;)V

    return-object v0

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "OtpInputFragment requires CodeInput in arguments"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;Landroid/view/View;)V
    .locals 12

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;->a:Lkotlin/Lazy;

    .line 2
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    move-object v1, p0

    check-cast v1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;

    .line 3
    iget-object v5, v1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;->b:Ljava/lang/String;

    .line 4
    iget-object p0, v1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;->c:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;->getType()Ljava/lang/String;

    move-result-object v4

    .line 5
    invoke-static {v5}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p0

    if-nez p0, :cond_1

    invoke-static {v4}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x1

    .line 6
    invoke-virtual {v1, p0}, Lcom/sumsub/sns/core/presentation/base/p0;->showProgress(Z)V

    .line 7
    invoke-static {v1}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    move-result-object v6

    invoke-static {}, Lkotlinx/coroutines/z0;->b()Lkotlinx/coroutines/j0;

    move-result-object v7

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/u;

    const/4 v2, 0x0

    move-object v3, v1

    invoke-direct/range {v0 .. v5}, Lcom/sumsub/sns/internal/features/presentation/verification2/code/u;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;Lkotlin/coroutines/Continuation;Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;Ljava/lang/String;Ljava/lang/String;)V

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    move-object v9, v0

    invoke-static/range {v6 .. v11}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;)V
    .locals 6

    .line 13
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/databinding/t;

    if-nez v0, :cond_0

    return-void

    .line 14
    :cond_0
    iget-boolean v1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;->b:Z

    const/4 v2, 0x0

    if-eqz v1, :cond_1

    .line 15
    iput-boolean v2, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;->b:Z

    .line 16
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->c:Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    invoke-static {v1}, Lcom/sumsub/sns/internal/core/common/h;->f(Landroid/view/View;)V

    .line 17
    :cond_1
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->f:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 18
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;->a:Ljava/lang/CharSequence;

    const/4 v4, 0x0

    if-eqz v3, :cond_2

    .line 19
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v3

    goto :goto_0

    :cond_2
    move-object v3, v4

    :goto_0
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 20
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->e:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 21
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;->b:Ljava/lang/CharSequence;

    if-eqz v3, :cond_3

    .line 22
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v5

    invoke-static {v3, v5}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v3

    goto :goto_1

    :cond_3
    move-object v3, v4

    :goto_1
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 23
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->c:Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 24
    iget v3, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;->c:I

    .line 25
    invoke-virtual {v1, v3}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setItemCount(I)V

    .line 26
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->c:Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification2/code/g;

    invoke-direct {v3, p0, v0}, Lcom/sumsub/sns/internal/features/presentation/verification2/code/g;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;Lcom/sumsub/sns/databinding/t;)V

    invoke-virtual {v1, v3}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setOnTextCompleteListener(Lcom/sumsub/sns/core/widget/pincode/SNSPinView$OnTextCompleteListener;)V

    .line 27
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->b:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 28
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;->g:Ljava/lang/CharSequence;

    .line 29
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 30
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->b:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 31
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;->g:Ljava/lang/CharSequence;

    if-eqz v3, :cond_4

    move v3, v2

    goto :goto_2

    :cond_4
    const/16 v3, 0x8

    .line 32
    :goto_2
    invoke-virtual {v1, v3}, Landroid/view/View;->setVisibility(I)V

    .line 33
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->c:Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 34
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;->g:Ljava/lang/CharSequence;

    const/4 v5, 0x1

    if-eqz v3, :cond_5

    move v3, v5

    goto :goto_3

    :cond_5
    move v3, v2

    .line 35
    :goto_3
    invoke-virtual {v1, v3}, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;->setError(Z)V

    .line 36
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;->d:Ljava/lang/CharSequence;

    if-eqz v1, :cond_6

    .line 37
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->d:Lcom/sumsub/sns/core/widget/SNSLinkButton;

    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 38
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->d:Lcom/sumsub/sns/core/widget/SNSLinkButton;

    .line 39
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;->d:Ljava/lang/CharSequence;

    .line 40
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 41
    iget-object p1, v0, Lcom/sumsub/sns/databinding/t;->d:Lcom/sumsub/sns/core/widget/SNSLinkButton;

    invoke-virtual {p1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    .line 42
    :cond_6
    iget-boolean v1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;->f:Z

    if-eqz v1, :cond_7

    .line 43
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->d:Lcom/sumsub/sns/core/widget/SNSLinkButton;

    invoke-virtual {v1, v5}, Landroid/view/View;->setEnabled(Z)V

    .line 44
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->d:Lcom/sumsub/sns/core/widget/SNSLinkButton;

    .line 45
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;->e:Ljava/lang/CharSequence;

    .line 46
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 47
    iget-object p1, v0, Lcom/sumsub/sns/databinding/t;->d:Lcom/sumsub/sns/core/widget/SNSLinkButton;

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/n;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/code/n;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;)V

    invoke-virtual {p1, v1}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    goto :goto_4

    .line 48
    :cond_7
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->d:Lcom/sumsub/sns/core/widget/SNSLinkButton;

    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 49
    iget-object v1, v0, Lcom/sumsub/sns/databinding/t;->d:Lcom/sumsub/sns/core/widget/SNSLinkButton;

    .line 50
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;->e:Ljava/lang/CharSequence;

    .line 51
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 52
    iget-object p1, v0, Lcom/sumsub/sns/databinding/t;->d:Lcom/sumsub/sns/core/widget/SNSLinkButton;

    invoke-virtual {p1, v4}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    .line 53
    :goto_4
    iget-object p1, v0, Lcom/sumsub/sns/databinding/t;->c:Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    invoke-virtual {p1}, Landroid/view/View;->requestFocus()Z

    return-void
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    const-string/jumbo v2, "otp_screen"

    .line 11
    .line 12
    const-class v3, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/b;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v2, v3, v1}, Lcom/sumsub/sns/internal/core/common/b;->a(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Class;Landroid/content/Context;)Landroid/os/Parcelable;

    .line 16
    move-result-object v0

    .line 17
    move-object v1, v0

    .line 18
    .line 19
    check-cast v1, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/b;

    .line 20
    .line 21
    :cond_0
    if-eqz v1, :cond_3

    .line 22
    .line 23
    iget-object v0, v1, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/b;->b:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 24
    .line 25
    sget-object v1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/f;->a:[I

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    .line 29
    move-result v0

    .line 30
    .line 31
    aget v0, v1, v0

    .line 32
    const/4 v1, 0x1

    .line 33
    .line 34
    if-eq v0, v1, :cond_2

    .line 35
    const/4 v1, 0x2

    .line 36
    .line 37
    if-ne v0, v1, :cond_1

    .line 38
    .line 39
    const-string v0, "PHONE_VERIFICATION"

    .line 40
    return-object v0

    .line 41
    .line 42
    :cond_1
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    .line 43
    .line 44
    .line 45
    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    .line 46
    throw v0

    .line 47
    .line 48
    :cond_2
    const-string v0, "EMAIL_VERIFICATION"

    .line 49
    return-object v0

    .line 50
    .line 51
    :cond_3
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 52
    .line 53
    const-string v1, "OtpInputFragment requires CodeInput in arguments"

    .line 54
    .line 55
    .line 56
    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 57
    throw v0
.end method

.method public final getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/sumsub/sns/internal/core/analytics/Screen;->ConfirmationContactScreen:Lcom/sumsub/sns/internal/core/analytics/Screen;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;

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

.method public final bridge synthetic handleSuccessState(Lcom/sumsub/sns/core/presentation/base/V;Landroid/os/Bundle;)V
    .locals 0

    .line 1
    .line 2
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;->a(Lcom/sumsub/sns/internal/features/presentation/verification2/code/q;)V

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

.method public final onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lcom/sumsub/sns/core/presentation/base/F;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 4
    .line 5
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;->a:Lkotlin/Lazy;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;

    .line 12
    .line 13
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/code/w;->h:Lkotlinx/coroutines/flow/r;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/code/h;

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, p0, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/code/h;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/code/o;Lkotlin/coroutines/Continuation;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, p2, v0}, Lcom/sumsub/sns/internal/core/common/U;->b(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 27
    return-void
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

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 8

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_verify_code2:I

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
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_end:I

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_start:I

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 26
    .line 27
    if-eqz v0, :cond_0

    .line 28
    .line 29
    sget p2, Lcom/sumsub/sns/R$id;->sns_otp_error:I

    .line 30
    .line 31
    .line 32
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 33
    move-result-object v0

    .line 34
    move-object v3, v0

    .line 35
    .line 36
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    sget p2, Lcom/sumsub/sns/R$id;->sns_pin_code:I

    .line 41
    .line 42
    .line 43
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 44
    move-result-object v0

    .line 45
    move-object v4, v0

    .line 46
    .line 47
    check-cast v4, Lcom/sumsub/sns/core/widget/pincode/SNSPinView;

    .line 48
    .line 49
    if-eqz v4, :cond_0

    .line 50
    .line 51
    sget p2, Lcom/sumsub/sns/R$id;->sns_resend_verification_code:I

    .line 52
    .line 53
    .line 54
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 55
    move-result-object v0

    .line 56
    move-object v5, v0

    .line 57
    .line 58
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSLinkButton;

    .line 59
    .line 60
    if-eqz v5, :cond_0

    .line 61
    .line 62
    sget p2, Lcom/sumsub/sns/R$id;->sns_subtitle:I

    .line 63
    .line 64
    .line 65
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 66
    move-result-object v0

    .line 67
    move-object v6, v0

    .line 68
    .line 69
    check-cast v6, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 70
    .line 71
    if-eqz v6, :cond_0

    .line 72
    .line 73
    sget p2, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 74
    .line 75
    .line 76
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 77
    move-result-object v0

    .line 78
    move-object v7, v0

    .line 79
    .line 80
    check-cast v7, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 81
    .line 82
    if-eqz v7, :cond_0

    .line 83
    .line 84
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 85
    .line 86
    .line 87
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 91
    .line 92
    if-eqz v0, :cond_0

    .line 93
    .line 94
    new-instance v1, Lcom/sumsub/sns/databinding/t;

    .line 95
    move-object v2, p1

    .line 96
    .line 97
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 98
    .line 99
    .line 100
    invoke-direct/range {v1 .. v7}, Lcom/sumsub/sns/databinding/t;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/pincode/SNSPinView;Lcom/sumsub/sns/core/widget/SNSLinkButton;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V

    .line 101
    return-object v1

    .line 102
    .line 103
    .line 104
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 105
    move-result-object p1

    .line 106
    .line 107
    .line 108
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    new-instance p2, Ljava/lang/NullPointerException;

    .line 112
    .line 113
    const-string v0, "Missing required view with ID: "

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    .line 120
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 121
    throw p2
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
