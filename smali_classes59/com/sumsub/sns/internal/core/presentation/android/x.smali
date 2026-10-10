.class public final Lcom/sumsub/sns/internal/core/presentation/android/x;
.super Lcom/sumsub/sns/internal/core/presentation/common/h;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Lkotlin/Lazy;

.field public h:Landroidx/activity/result/ActivityResultLauncher;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/geo/g;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/h;-><init>(Lcom/sumsub/sns/core/presentation/base/l;)V

    .line 4
    .line 5
    const-string p1, "PermissionsHandler"

    .line 6
    .line 7
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->f:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    .line 14
    return-void
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

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/android/L;)Ljava/lang/CharSequence;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/android/L;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/android/x;Landroid/content/DialogInterface;)V
    .locals 0

    .line 25
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    .line 26
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 27
    const-string p1, "cancelled by user"

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    .line 28
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/h;->a:Lcom/sumsub/sns/internal/core/presentation/android/h;

    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Lcom/sumsub/sns/internal/core/presentation/android/j;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/android/x;Landroid/content/DialogInterface;I)V
    .locals 2

    .line 16
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    .line 17
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 18
    const-string/jumbo p2, "opened app settings"

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    .line 19
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/android/t;->d:Lkotlinx/coroutines/flow/n;

    sget-object p2, Lcom/sumsub/sns/internal/core/presentation/android/l;->a:Lcom/sumsub/sns/internal/core/presentation/android/l;

    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 20
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p0

    .line 21
    new-instance p1, Landroid/content/Intent;

    invoke-direct {p1}, Landroid/content/Intent;-><init>()V

    .line 22
    const-string p2, "android.settings.APPLICATION_DETAILS_SETTINGS"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setAction(Ljava/lang/String;)Landroid/content/Intent;

    .line 23
    invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    move-result-object p2

    const-string/jumbo v0, "package"

    const/4 v1, 0x0

    invoke-static {v0, p2, v1}, Landroid/net/Uri;->fromParts(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;

    .line 24
    invoke-virtual {p0, p1}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/android/x;Ljava/util/Map;)V
    .locals 0

    .line 29
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    .line 30
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 31
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/android/x;->q()Ljava/util/Set;

    move-result-object p0

    invoke-virtual {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/android/t;->c(Ljava/util/Set;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/core/presentation/android/x;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 9
    .line 10
    const-string p1, "cancelled by user"

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    sget-object p1, Lcom/sumsub/sns/internal/core/presentation/android/h;->a:Lcom/sumsub/sns/internal/core/presentation/android/h;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->a(Lcom/sumsub/sns/internal/core/presentation/android/j;)V

    .line 19
    return-void
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
.end method


# virtual methods
.method public final a(Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;)Landroidx/appcompat/app/AlertDialog;
    .locals 3

    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 3
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/t;->e:Lkotlinx/coroutines/flow/w;

    .line 4
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lcom/sumsub/sns/internal/core/presentation/android/o;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/o;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-eqz v0, :cond_2

    .line 5
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/o;->a:Lcom/sumsub/sns/internal/core/presentation/android/K;

    if-nez v0, :cond_1

    goto :goto_1

    .line 6
    :cond_1
    new-instance v1, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;

    .line 7
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v2}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v2

    .line 8
    invoke-direct {v1, v2}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;-><init>(Landroid/content/Context;)V

    .line 9
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/K;->d:Ljava/lang/String;

    .line 10
    invoke-virtual {p1, v0}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setMessage(Ljava/lang/CharSequence;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object v0

    const/4 v1, 0x0

    .line 11
    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setCancelable(Z)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object v0

    .line 12
    const-string/jumbo v1, "sns_alert_action_settings"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/android/o0;

    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/core/presentation/android/o0;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/x;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object v0

    .line 13
    const-string/jumbo v1, "sns_alert_action_cancel"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/android/p0;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/core/presentation/android/p0;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/x;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object p1

    .line 14
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/q0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/android/q0;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/x;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object p1

    .line 15
    invoke-virtual {p1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object p1

    return-object p1

    :cond_2
    :goto_1
    return-object v2
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->f:Ljava/lang/String;

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

.method public final i()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/android/x;->q()Ljava/util/Set;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->b(Ljava/util/Set;)V

    .line 16
    return-void
    .line 17
.end method

.method public final j()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Lcom/sumsub/sns/internal/core/presentation/android/x;->q()Ljava/util/Set;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/t;->b(Ljava/util/Set;)V

    .line 16
    return-void
    .line 17
.end method

.method public final k()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/t;->f:Lkotlinx/coroutines/flow/n;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method public final l()V
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 9
    .line 10
    iget-object v1, v0, Lcom/sumsub/sns/internal/core/presentation/android/t;->a:Ljava/util/Set;

    .line 11
    .line 12
    new-instance v7, Lcom/sumsub/sns/internal/core/presentation/android/m0;

    .line 13
    .line 14
    .line 15
    invoke-direct {v7}, Lcom/sumsub/sns/internal/core/presentation/android/m0;-><init>()V

    .line 16
    .line 17
    const/16 v8, 0x1e

    .line 18
    const/4 v9, 0x0

    .line 19
    .line 20
    const-string v2, "_"

    .line 21
    const/4 v3, 0x0

    .line 22
    const/4 v4, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    const/4 v6, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static/range {v1 .. v9}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    new-instance v1, Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;

    .line 31
    .line 32
    .line 33
    invoke-direct {v1}, Landroidx/activity/result/contract/ActivityResultContracts$RequestMultiplePermissions;-><init>()V

    .line 34
    .line 35
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/android/n0;

    .line 36
    .line 37
    .line 38
    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/core/presentation/android/n0;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/x;)V

    .line 39
    .line 40
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    .line 47
    invoke-virtual {v3}, Landroidx/activity/ComponentActivity;->getActivityResultRegistry()Landroidx/activity/result/ActivityResultRegistry;

    .line 48
    move-result-object v3

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    iget-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    .line 61
    invoke-virtual {v3, v0, v4, v1, v2}, Landroidx/activity/result/ActivityResultRegistry;->register(Ljava/lang/String;Landroidx/lifecycle/LifecycleOwner;Landroidx/activity/result/contract/ActivityResultContract;Landroidx/activity/result/ActivityResultCallback;)Landroidx/activity/result/ActivityResultLauncher;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 65
    .line 66
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 73
    .line 74
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/t;->e:Lkotlinx/coroutines/flow/w;

    .line 75
    .line 76
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/android/w;

    .line 83
    const/4 v3, 0x0

    .line 84
    .line 85
    .line 86
    invoke-direct {v2, p0, v3}, Lcom/sumsub/sns/internal/core/presentation/android/w;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/x;Lkotlin/coroutines/Continuation;)V

    .line 87
    .line 88
    .line 89
    invoke-static {v0, v1, v2}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)V

    .line 90
    return-void
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
.end method

.method public final m()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/internal/core/presentation/common/h;->m()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Landroidx/activity/result/ActivityResultLauncher;->unregister()V

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->h:Landroidx/activity/result/ActivityResultLauncher;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public final q()Ljava/util/Set;
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/x;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/t;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/t;->a:Ljava/util/Set;

    .line 11
    .line 12
    new-instance v1, Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 16
    .line 17
    .line 18
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v2

    .line 24
    .line 25
    if-eqz v2, :cond_4

    .line 26
    .line 27
    .line 28
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v2

    .line 30
    move-object v3, v2

    .line 31
    .line 32
    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/android/L;

    .line 33
    .line 34
    instance-of v4, v3, Lcom/sumsub/sns/internal/core/presentation/android/I;

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    iget-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 42
    move-result-object v4

    .line 43
    .line 44
    check-cast v3, Lcom/sumsub/sns/internal/core/presentation/android/I;

    .line 45
    .line 46
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/android/I;->d:Ljava/lang/String;

    .line 47
    .line 48
    .line 49
    invoke-static {v4, v3}, Lcom/sumsub/sns/internal/core/common/i;->a(Landroid/content/Context;Ljava/lang/String;)Z

    .line 50
    move-result v3

    .line 51
    goto :goto_2

    .line 52
    .line 53
    :cond_1
    iget-object v3, v3, Lcom/sumsub/sns/internal/core/presentation/android/L;->b:Ljava/lang/String;

    .line 54
    .line 55
    if-eqz v3, :cond_3

    .line 56
    .line 57
    iget-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 61
    move-result-object v4

    .line 62
    .line 63
    .line 64
    invoke-static {v4, v3}, Landroidx/core/content/ContextCompat;->checkSelfPermission(Landroid/content/Context;Ljava/lang/String;)I

    .line 65
    move-result v3

    .line 66
    .line 67
    if-nez v3, :cond_2

    .line 68
    goto :goto_1

    .line 69
    :cond_2
    const/4 v3, 0x0

    .line 70
    goto :goto_2

    .line 71
    :cond_3
    :goto_1
    const/4 v3, 0x1

    .line 72
    .line 73
    :goto_2
    if-nez v3, :cond_0

    .line 74
    .line 75
    .line 76
    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 77
    goto :goto_0

    .line 78
    .line 79
    .line 80
    :cond_4
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->toSet(Ljava/lang/Iterable;)Ljava/util/Set;

    .line 81
    move-result-object v0

    .line 82
    return-object v0
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
.end method
