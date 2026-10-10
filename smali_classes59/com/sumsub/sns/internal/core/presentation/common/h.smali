.class public abstract Lcom/sumsub/sns/internal/core/presentation/common/h;
.super Lcom/sumsub/sns/internal/core/presentation/common/t;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public e:Landroidx/appcompat/app/AlertDialog;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/core/presentation/base/l;)V
    .locals 1

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/core/presentation/common/t;)V
    .locals 1

    .line 2
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-direct {p0, v0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;-><init>(Lcom/sumsub/sns/core/presentation/base/l;Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/common/h;Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Lkotlin/Unit;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/h;->e:Landroidx/appcompat/app/AlertDialog;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    :cond_0
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/h;->e:Landroidx/appcompat/app/AlertDialog;

    .line 3
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/h;->a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Landroidx/appcompat/app/AlertDialog;

    move-result-object p1

    if-eqz p1, :cond_1

    .line 4
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/common/d0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/common/d0;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/h;)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnShowListener(Landroid/content/DialogInterface$OnShowListener;)V

    .line 5
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/common/e0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/common/e0;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/h;)V

    invoke-virtual {p1, v0}, Landroid/app/Dialog;->setOnDismissListener(Landroid/content/DialogInterface$OnDismissListener;)V

    .line 6
    sget-object v0, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;->Companion:Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;

    invoke-virtual {v0, p1}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder$Companion;->showWithThemeExtension(Landroidx/appcompat/app/AlertDialog;)V

    move-object v0, p1

    .line 7
    :cond_1
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/h;->e:Landroidx/appcompat/app/AlertDialog;

    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/common/h;Landroid/content/DialogInterface;)V
    .locals 0

    .line 9
    const-string p1, "Showing dialog."

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V

    .line 10
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/common/h;->o()V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/core/presentation/common/h;Landroid/content/DialogInterface;)V
    .locals 0

    .line 1
    .line 2
    const-string p1, "Dismissing dialog."

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/common/h;->n()V

    .line 9
    return-void
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


# virtual methods
.method public abstract a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Landroidx/appcompat/app/AlertDialog;
.end method

.method public m()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/h;->e:Landroidx/appcompat/app/AlertDialog;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/h;->e:Landroidx/appcompat/app/AlertDialog;

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public n()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public o()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public p()V
    .locals 8

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/h;->e:Landroidx/appcompat/app/AlertDialog;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    if-ne v0, v1, :cond_0

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/common/c0;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/common/c0;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/h;)V

    .line 18
    .line 19
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-static {v1}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    new-instance v5, Lcom/sumsub/sns/internal/core/presentation/common/s;

    .line 30
    const/4 v1, 0x0

    .line 31
    .line 32
    .line 33
    invoke-direct {v5, p0, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/s;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/t;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)V

    .line 34
    const/4 v6, 0x3

    .line 35
    const/4 v7, 0x0

    .line 36
    const/4 v3, 0x0

    .line 37
    const/4 v4, 0x0

    .line 38
    .line 39
    .line 40
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 41
    return-void
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
