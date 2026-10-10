.class public final Lcom/sumsub/sns/internal/core/presentation/android/location/v;
.super Lcom/sumsub/sns/internal/core/presentation/common/h;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/geo/g;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/h;-><init>(Lcom/sumsub/sns/core/presentation/base/l;)V

    .line 4
    .line 5
    const-string p1, "LocationService"

    .line 6
    .line 7
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/v;->f:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/v;->g:Lkotlin/Lazy;

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

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/android/location/v;Landroid/content/DialogInterface;)V
    .locals 0

    .line 7
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/v;->g:Lkotlin/Lazy;

    .line 8
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;

    const/4 p1, 0x0

    .line 9
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->a(Z)V

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/android/location/v;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/v;->g:Lkotlin/Lazy;

    .line 2
    invoke-interface {p1}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/sumsub/sns/internal/core/presentation/android/location/s;

    .line 3
    const-string/jumbo p2, "opened location settings"

    invoke-virtual {p1, p2}, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->a(Ljava/lang/String;)V

    .line 4
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->c:Lkotlinx/coroutines/flow/n;

    sget-object p2, Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;->AwaitingSettingsReturn:Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;

    invoke-interface {p1, p2}, Lkotlinx/coroutines/flow/n;->setValue(Ljava/lang/Object;)V

    .line 5
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p0

    .line 6
    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.settings.LOCATION_SOURCE_SETTINGS"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/core/presentation/android/location/v;Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/v;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;

    .line 9
    const/4 p1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->a(Z)V

    .line 13
    return-void
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

    .line 10
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;

    .line 11
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    move-result-object v1

    .line 12
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;-><init>(Landroid/content/Context;)V

    .line 13
    const-string/jumbo v1, "sns_alert_lackOfLocationPermissions"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setMessage(Ljava/lang/CharSequence;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object v0

    const/4 v1, 0x0

    .line 14
    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setCancelable(Z)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object v0

    .line 15
    const-string/jumbo v1, "sns_alert_action_settings"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/android/location/z;

    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/core/presentation/android/location/z;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/location/v;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object v0

    .line 16
    const-string/jumbo v1, "sns_alert_action_cancel"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/android/location/a0;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/core/presentation/android/location/a0;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/location/v;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object p1

    .line 17
    new-instance v0, Lcom/sumsub/sns/internal/core/presentation/android/location/b0;

    invoke-direct {v0, p0}, Lcom/sumsub/sns/internal/core/presentation/android/location/b0;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/location/v;)V

    invoke-virtual {p1, v0}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object p1

    .line 18
    invoke-virtual {p1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/v;->f:Ljava/lang/String;

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

.method public final j()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/v;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->d:Lkotlinx/coroutines/flow/w;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0}, Lkotlinx/coroutines/flow/w;->getValue()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    sget-object v1, Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;->AwaitingSettingsReturn:Lcom/sumsub/sns/internal/core/presentation/android/location/LocationServiceController$Phase;

    .line 17
    .line 18
    if-ne v0, v1, :cond_0

    .line 19
    .line 20
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/v;->g:Lkotlin/Lazy;

    .line 21
    .line 22
    .line 23
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;

    .line 27
    .line 28
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-static {v1}, Lcom/sumsub/sns/internal/core/presentation/android/location/t;->a(Landroid/content/Context;)Lkotlin/jvm/functions/Function0;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-interface {v1}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    check-cast v1, Ljava/lang/Boolean;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 46
    move-result v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->b(Z)V

    .line 50
    :cond_0
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public final l()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/android/location/v;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;

    .line 9
    .line 10
    iget-object v0, v0, Lcom/sumsub/sns/internal/core/presentation/android/location/s;->d:Lkotlinx/coroutines/flow/w;

    .line 11
    .line 12
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/android/location/u;

    .line 19
    const/4 v3, 0x0

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p0, v3}, Lcom/sumsub/sns/internal/core/presentation/android/location/u;-><init>(Lcom/sumsub/sns/internal/core/presentation/android/location/v;Lkotlin/coroutines/Continuation;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, v2}, Lcom/sumsub/sns/internal/core/common/U;->a(Lkotlinx/coroutines/flow/e;Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function2;)V

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
