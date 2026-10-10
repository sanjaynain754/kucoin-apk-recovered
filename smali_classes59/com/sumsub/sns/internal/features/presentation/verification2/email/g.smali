.class public final Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;
.super Lcom/sumsub/sns/core/presentation/base/F;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/sumsub/sns/core/presentation/base/F<",
        "Lcom/sumsub/sns/databinding/u;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;",
        "Lcom/sumsub/sns/core/presentation/base/F;",
        "Lcom/sumsub/sns/databinding/u;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;",
        "Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;",
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
        "SMAP\nEmailVerificationFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmailVerificationFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/email/EmailVerificationFragment\n+ 2 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 3 TextView.kt\nandroidx/core/widget/TextViewKt\n+ 4 View.kt\nandroidx/core/view/ViewKt\n*L\n1#1,94:1\n106#2,15:95\n49#3:110\n65#3,16:111\n93#3,3:127\n256#4,2:130\n*S KotlinDebug\n*F\n+ 1 EmailVerificationFragment.kt\ncom/sumsub/sns/internal/features/presentation/verification2/email/EmailVerificationFragment\n*L\n24#1:95,15\n38#1:110\n38#1:111,16\n38#1:127,3\n76#1:130,2\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Lkotlin/Lazy;


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/sumsub/sns/core/presentation/base/F;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/c0;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/c0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;)V

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/b;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/b;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;)V

    .line 14
    .line 15
    sget-object v2, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 16
    .line 17
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification2/email/c;

    .line 18
    .line 19
    .line 20
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/c;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/b;)V

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    const-class v2, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    new-instance v3, Lcom/sumsub/sns/internal/features/presentation/verification2/email/d;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/d;-><init>(Lkotlin/Lazy;)V

    .line 36
    .line 37
    new-instance v4, Lcom/sumsub/sns/internal/features/presentation/verification2/email/e;

    .line 38
    .line 39
    .line 40
    invoke-direct {v4, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/e;-><init>(Lkotlin/Lazy;)V

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v2, v3, v4, v0}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 44
    move-result-object v0

    .line 45
    .line 46
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;->a:Lkotlin/Lazy;

    .line 47
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
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;)Landroidx/lifecycle/ViewModelProvider$Factory;
    .locals 1

    .line 1
    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/E;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/E;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;)V

    return-object v0
.end method

.method public static final a(Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 59
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;Landroid/view/View;)V
    .locals 0

    .line 60
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;->f()V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;Landroid/widget/TextView;ILandroid/view/KeyEvent;)Z
    .locals 0

    const/4 p2, 0x6

    if-ne p3, p2, :cond_0

    .line 61
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->e:Lcom/sumsub/sns/internal/features/presentation/verification2/email/k;

    .line 62
    iget-boolean p0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/k;->b:Z

    if-eqz p0, :cond_0

    .line 63
    invoke-virtual {p1}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;->f()V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;)V
    .locals 5

    .line 2
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/databinding/u;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->g:Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 4
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->a:Ljava/lang/CharSequence;

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v4

    invoke-static {v2, v4}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v2

    goto :goto_0

    :cond_1
    move-object v2, v3

    :goto_0
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 6
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->f:Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 7
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->b:Ljava/lang/CharSequence;

    if-eqz v2, :cond_2

    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v3

    invoke-static {v2, v3}, Lcom/sumsub/sns/internal/core/common/i0;->a(Ljava/lang/CharSequence;Landroid/content/Context;)Landroid/text/Spanned;

    move-result-object v3

    :cond_2
    invoke-virtual {v1, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 9
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->b:Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 10
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->c:Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;

    .line 11
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;->c:Ljava/lang/CharSequence;

    .line 12
    invoke-virtual {v1, v2}, Lcom/sumsub/sns/core/widget/SNSTextInputLayout;->setError(Ljava/lang/CharSequence;)V

    .line 13
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->b:Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 14
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->c:Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;

    .line 15
    iget-boolean v2, v2, Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;->d:Z

    const/4 v3, 0x1

    xor-int/2addr v2, v3

    .line 16
    invoke-virtual {v1, v2}, Landroid/view/View;->setEnabled(Z)V

    .line 17
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->c:Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;

    .line 18
    iget-object v1, v1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;->a:Ljava/lang/CharSequence;

    if-eqz v1, :cond_4

    .line 19
    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    xor-int/2addr v1, v3

    if-ne v1, v3, :cond_4

    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->c:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_3

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 20
    :cond_3
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->c:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 21
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->c:Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;

    .line 22
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;->a:Ljava/lang/CharSequence;

    .line 23
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 24
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->c:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 25
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->c:Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;

    .line 26
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;->a:Ljava/lang/CharSequence;

    .line 27
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    invoke-virtual {v1, v2}, Landroid/widget/EditText;->setSelection(I)V

    .line 28
    :cond_4
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->c:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 29
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->c:Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;

    .line 30
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;->b:Ljava/lang/CharSequence;

    .line 31
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setHint(Ljava/lang/CharSequence;)V

    .line 32
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->c:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/verification2/email/f;

    invoke-direct {v2, p1, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/f;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;)V

    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setOnEditorActionListener(Landroid/widget/TextView$OnEditorActionListener;)V

    .line 33
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->c:Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;

    .line 34
    iget-boolean v1, v1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;->d:Z

    const/4 v2, 0x0

    if-nez v1, :cond_6

    .line 35
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->c:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    invoke-virtual {v1}, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;->getText()Landroid/text/Editable;

    move-result-object v1

    if-eqz v1, :cond_5

    invoke-static {v1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 36
    :cond_5
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->c:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    invoke-static {v1}, Lcom/sumsub/sns/internal/core/common/h;->f(Landroid/view/View;)V

    goto :goto_1

    .line 37
    :cond_6
    iget-object v1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->c:Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;

    .line 38
    iget-boolean v1, v1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/o;->d:Z

    if-eqz v1, :cond_7

    .line 39
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->c:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 40
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    move-result-object v3

    const-string v4, "input_method"

    invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/view/inputmethod/InputMethodManager;

    .line 41
    invoke-virtual {v1}, Landroid/view/View;->getWindowToken()Landroid/os/IBinder;

    move-result-object v1

    .line 42
    invoke-virtual {v3, v1, v2}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z

    .line 43
    :cond_7
    :goto_1
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->d:Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 44
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->d:Ljava/lang/CharSequence;

    .line 45
    invoke-static {v1, v3}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/widget/TextView;Ljava/lang/CharSequence;)V

    .line 46
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->d:Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 47
    iget-object v3, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->d:Ljava/lang/CharSequence;

    if-eqz v3, :cond_8

    goto :goto_2

    :cond_8
    const/16 v2, 0x8

    .line 48
    :goto_2
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 49
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->d:Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/verification2/email/a0;

    invoke-direct {v2}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/a0;-><init>()V

    invoke-static {v1, v2}, Lcom/sumsub/sns/internal/core/common/q;->a(Landroid/widget/TextView;Lkotlin/jvm/functions/Function1;)V

    .line 50
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->e:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 51
    iget-object v2, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->e:Lcom/sumsub/sns/internal/features/presentation/verification2/email/k;

    .line 52
    iget-object v2, v2, Lcom/sumsub/sns/internal/features/presentation/verification2/email/k;->a:Ljava/lang/CharSequence;

    .line 53
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 54
    iget-object v1, v0, Lcom/sumsub/sns/databinding/u;->e:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 55
    iget-object p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;->e:Lcom/sumsub/sns/internal/features/presentation/verification2/email/k;

    .line 56
    iget-boolean p1, p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/k;->b:Z

    .line 57
    invoke-virtual {v1, p1}, Landroid/view/View;->setEnabled(Z)V

    .line 58
    iget-object p1, v0, Lcom/sumsub/sns/databinding/u;->e:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    new-instance v0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/b0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/b0;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;)V

    invoke-virtual {p1, v0}, Landroid/view/View;->setOnClickListener(Landroid/view/View$OnClickListener;)V

    return-void
.end method

.method public final f()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    check-cast v0, Lcom/sumsub/sns/databinding/u;

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/databinding/u;->e:Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Landroid/view/View;->setEnabled(Z)V

    .line 15
    .line 16
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;->a:Lkotlin/Lazy;

    .line 17
    .line 18
    .line 19
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;

    .line 23
    .line 24
    iget-object v1, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;->c:Lkotlinx/coroutines/flow/n;

    .line 25
    .line 26
    .line 27
    invoke-interface {v1}, Lkotlinx/coroutines/flow/n;->getValue()Ljava/lang/Object;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    check-cast v1, Ljava/lang/String;

    .line 31
    .line 32
    if-nez v1, :cond_1

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    const-string v2, "(?:[a-z0-9!#$%&\'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&\'*+/=?^_`{|}~-]+)*|\"(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21\\x23-\\x5b\\x5d-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])*\")@(?:(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?|\\[(?:(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9]))\\.){3}(?:(2(5[0-5]|[0-4][0-9])|1[0-9][0-9]|[1-9]?[0-9])|[a-z0-9-]*[a-z0-9]:(?:[\\x01-\\x08\\x0b\\x0c\\x0e-\\x1f\\x21-\\x5a\\x53-\\x7f]|\\\\[\\x01-\\x09\\x0b\\x0c\\x0e-\\x7f])+)\\])"

    .line 36
    const/4 v3, 0x2

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v3}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 40
    move-result-object v2

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 44
    move-result-object v2

    .line 45
    .line 46
    .line 47
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 48
    move-result v2

    .line 49
    .line 50
    if-nez v2, :cond_2

    .line 51
    .line 52
    .line 53
    invoke-static {v0}, Landroidx/lifecycle/ViewModelKt;->getViewModelScope(Landroidx/lifecycle/ViewModel;)Lkotlinx/coroutines/m0;

    .line 54
    move-result-object v3

    .line 55
    .line 56
    new-instance v6, Lcom/sumsub/sns/internal/features/presentation/verification2/email/t;

    .line 57
    const/4 v1, 0x0

    .line 58
    .line 59
    .line 60
    invoke-direct {v6, v0, v1}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/t;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;Lkotlin/coroutines/Continuation;)V

    .line 61
    const/4 v7, 0x3

    .line 62
    const/4 v8, 0x0

    .line 63
    const/4 v4, 0x0

    .line 64
    const/4 v5, 0x0

    .line 65
    .line 66
    .line 67
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 68
    goto :goto_0

    .line 69
    .line 70
    :cond_2
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/email/h;

    .line 71
    .line 72
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;

    .line 73
    .line 74
    iget-object v2, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->j:Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;

    .line 75
    .line 76
    sget-object v3, Lcom/sumsub/sns/internal/features/presentation/verification2/host/l;->a:Lcom/sumsub/sns/internal/features/presentation/verification2/host/l;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v2, v3}, Lcom/sumsub/sns/internal/features/presentation/verification2/host/A;->a(Lcom/sumsub/sns/internal/features/presentation/verification2/host/n;)V

    .line 80
    .line 81
    iget-object v2, v0, Lcom/sumsub/sns/internal/core/presentation/screen/base/s;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/k;

    .line 82
    .line 83
    new-instance v3, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/b;

    .line 84
    .line 85
    iget-object v0, v0, Lcom/sumsub/sns/internal/features/presentation/verification2/host/J;->d:Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;

    .line 86
    .line 87
    .line 88
    invoke-direct {v3, v1, v0}, Lcom/sumsub/sns/internal/core/presentation/screen/navigation/b;-><init>(Ljava/lang/String;Lcom/sumsub/sns/internal/features/data/model/common/ValidationIdentifierType;)V

    .line 89
    .line 90
    .line 91
    invoke-virtual {v2, v3}, Lcom/sumsub/sns/internal/core/presentation/screen/base/k;->b(Lcom/sumsub/sns/internal/core/presentation/screen/navigation/i;)V

    .line 92
    .line 93
    .line 94
    :goto_0
    invoke-virtual {p0}, Lcom/sumsub/sns/core/presentation/base/F;->getViewBinding()Landroidx/viewbinding/ViewBinding;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    check-cast v0, Lcom/sumsub/sns/databinding/u;

    .line 98
    .line 99
    if-eqz v0, :cond_3

    .line 100
    .line 101
    iget-object v0, v0, Lcom/sumsub/sns/databinding/u;->c:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 102
    .line 103
    .line 104
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->a(Landroid/view/View;)V

    .line 105
    :cond_3
    return-void
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
.end method

.method public final getIdDocSetType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "EMAIL_VERIFICATION"

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;->a:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/verification2/email/D;

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
    check-cast p1, Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;->a(Lcom/sumsub/sns/internal/features/presentation/verification2/email/p;)V

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
    .locals 0

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
    check-cast p1, Lcom/sumsub/sns/databinding/u;

    .line 10
    .line 11
    if-eqz p1, :cond_0

    .line 12
    .line 13
    iget-object p1, p1, Lcom/sumsub/sns/databinding/u;->c:Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 14
    .line 15
    new-instance p2, Lcom/sumsub/sns/internal/features/presentation/verification2/email/a;

    .line 16
    .line 17
    .line 18
    invoke-direct {p2, p0}, Lcom/sumsub/sns/internal/features/presentation/verification2/email/a;-><init>(Lcom/sumsub/sns/internal/features/presentation/verification2/email/g;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, p2}, Landroid/widget/TextView;->addTextChangedListener(Landroid/text/TextWatcher;)V

    .line 22
    :cond_0
    return-void
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

.method public final provideViewBinding(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Landroidx/viewbinding/ViewBinding;
    .locals 9

    .line 1
    .line 2
    sget v0, Lcom/sumsub/sns/R$layout;->sns_fragment_verify_email2:I

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
    sget p2, Lcom/sumsub/sns/R$id;->sns_email:I

    .line 10
    .line 11
    .line 12
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 13
    move-result-object v0

    .line 14
    move-object v3, v0

    .line 15
    .line 16
    check-cast v3, Lcom/sumsub/sns/core/widget/SNSTextInputLayout;

    .line 17
    .line 18
    if-eqz v3, :cond_0

    .line 19
    .line 20
    sget p2, Lcom/sumsub/sns/R$id;->sns_email_id:I

    .line 21
    .line 22
    .line 23
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 24
    move-result-object v0

    .line 25
    move-object v4, v0

    .line 26
    .line 27
    check-cast v4, Lcom/sumsub/sns/core/widget/SNSTextInputEditText;

    .line 28
    .line 29
    if-eqz v4, :cond_0

    .line 30
    .line 31
    sget p2, Lcom/sumsub/sns/R$id;->sns_footer:I

    .line 32
    .line 33
    .line 34
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 35
    move-result-object v0

    .line 36
    move-object v5, v0

    .line 37
    .line 38
    check-cast v5, Lcom/sumsub/sns/core/widget/SNSCaptionTextView;

    .line 39
    .line 40
    if-eqz v5, :cond_0

    .line 41
    .line 42
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_end:I

    .line 43
    .line 44
    .line 45
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 49
    .line 50
    if-eqz v0, :cond_0

    .line 51
    .line 52
    sget p2, Lcom/sumsub/sns/R$id;->sns_guideline_start:I

    .line 53
    .line 54
    .line 55
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    check-cast v0, Landroidx/constraintlayout/widget/Guideline;

    .line 59
    .line 60
    if-eqz v0, :cond_0

    .line 61
    .line 62
    sget p2, Lcom/sumsub/sns/R$id;->sns_primary_button:I

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
    check-cast v6, Lcom/sumsub/sns/core/widget/SNSPrimaryButton;

    .line 70
    .line 71
    if-eqz v6, :cond_0

    .line 72
    .line 73
    sget p2, Lcom/sumsub/sns/R$id;->sns_subtitle:I

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
    check-cast v7, Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;

    .line 81
    .line 82
    if-eqz v7, :cond_0

    .line 83
    .line 84
    sget p2, Lcom/sumsub/sns/R$id;->sns_title:I

    .line 85
    .line 86
    .line 87
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 88
    move-result-object v0

    .line 89
    move-object v8, v0

    .line 90
    .line 91
    check-cast v8, Lcom/sumsub/sns/core/widget/SNSH1TextView;

    .line 92
    .line 93
    if-eqz v8, :cond_0

    .line 94
    .line 95
    sget p2, Lcom/sumsub/sns/R$id;->sns_toolbar:I

    .line 96
    .line 97
    .line 98
    invoke-static {p1, p2}, Landroidx/viewbinding/ViewBindings;->findChildViewById(Landroid/view/View;I)Landroid/view/View;

    .line 99
    move-result-object v0

    .line 100
    .line 101
    check-cast v0, Lcom/sumsub/sns/core/widget/SNSToolbarView;

    .line 102
    .line 103
    if-eqz v0, :cond_0

    .line 104
    .line 105
    new-instance v1, Lcom/sumsub/sns/databinding/u;

    .line 106
    move-object v2, p1

    .line 107
    .line 108
    check-cast v2, Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 109
    .line 110
    .line 111
    invoke-direct/range {v1 .. v8}, Lcom/sumsub/sns/databinding/u;-><init>(Landroidx/constraintlayout/widget/ConstraintLayout;Lcom/sumsub/sns/core/widget/SNSTextInputLayout;Lcom/sumsub/sns/core/widget/SNSTextInputEditText;Lcom/sumsub/sns/core/widget/SNSCaptionTextView;Lcom/sumsub/sns/core/widget/SNSPrimaryButton;Lcom/sumsub/sns/core/widget/SNSSubtitle2TextView;Lcom/sumsub/sns/core/widget/SNSH1TextView;)V

    .line 112
    return-object v1

    .line 113
    .line 114
    .line 115
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getResources()Landroid/content/res/Resources;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    .line 119
    invoke-virtual {p1, p2}, Landroid/content/res/Resources;->getResourceName(I)Ljava/lang/String;

    .line 120
    move-result-object p1

    .line 121
    .line 122
    new-instance p2, Ljava/lang/NullPointerException;

    .line 123
    .line 124
    const-string v0, "Missing required view with ID: "

    .line 125
    .line 126
    .line 127
    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 128
    move-result-object p1

    .line 129
    .line 130
    .line 131
    invoke-direct {p2, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    .line 132
    throw p2
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
