.class public final Lcom/sumsub/sns/internal/core/presentation/nfc/b;
.super Lcom/sumsub/sns/internal/core/presentation/common/h;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final f:Lkotlin/jvm/functions/Function1;

.field public final g:Lkotlin/jvm/functions/Function0;

.field public final h:Ljava/lang/String;

.field public final i:Lcom/sumsub/sns/internal/core/presentation/nfc/a;

.field public j:Ljava/lang/Boolean;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/core/presentation/nfc/m;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 6
    invoke-direct {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/h;-><init>(Lcom/sumsub/sns/internal/core/presentation/common/t;)V

    .line 7
    const-string p1, "NfcDialog"

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->h:Ljava/lang/String;

    .line 8
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/nfc/a;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/nfc/a;-><init>(Lcom/sumsub/sns/internal/core/presentation/nfc/b;)V

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->i:Lcom/sumsub/sns/internal/core/presentation/nfc/a;

    .line 9
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->f:Lkotlin/jvm/functions/Function1;

    .line 10
    iput-object p3, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->g:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/i;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/b;Lcom/sumsub/sns/internal/features/presentation/preview/ekyc/eid/main/c;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/h;-><init>(Lcom/sumsub/sns/core/presentation/base/l;)V

    .line 2
    const-string p1, "NfcDialog"

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->h:Ljava/lang/String;

    .line 3
    new-instance p1, Lcom/sumsub/sns/internal/core/presentation/nfc/a;

    invoke-direct {p1, p0}, Lcom/sumsub/sns/internal/core/presentation/nfc/a;-><init>(Lcom/sumsub/sns/internal/core/presentation/nfc/b;)V

    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->i:Lcom/sumsub/sns/internal/core/presentation/nfc/a;

    .line 4
    iput-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->f:Lkotlin/jvm/functions/Function1;

    .line 5
    iput-object p3, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->g:Lkotlin/jvm/functions/Function0;

    return-void
.end method

.method public static final a(Lcom/sumsub/sns/internal/core/presentation/nfc/b;Landroid/content/DialogInterface;I)V
    .locals 5

    .line 1
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 2
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p1

    .line 3
    iget-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 4
    invoke-virtual {p2}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object p2

    .line 5
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 6
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    move-result-object v0

    .line 7
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->SettingsButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 8
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Popup;->NfcRequestPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 9
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 10
    invoke-virtual {v3}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v3

    const-string v4, "fromScreen"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    .line 11
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, v0, v1, v3, v2}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 12
    new-instance p1, Landroid/content/Intent;

    const-string p2, "android.settings.NFC_SETTINGS"

    invoke-direct {p1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    const/high16 p2, 0x10000000

    .line 13
    invoke-virtual {p1, p2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 14
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object p0

    .line 15
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/core/presentation/nfc/b;Landroid/content/DialogInterface;I)V
    .locals 5

    .line 1
    .line 2
    const-string p1, "MRTD screen: canceled - NFC disabled"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iget-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 14
    .line 15
    .line 16
    invoke-virtual {p2}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 17
    move-result-object p2

    .line 18
    .line 19
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->DismissButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 26
    .line 27
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Popup;->NfcRequestPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 28
    .line 29
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v3}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    const-string v4, "fromScreen"

    .line 36
    .line 37
    .line 38
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 47
    .line 48
    .line 49
    invoke-static {p2, v0, v1, v3, v2}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 50
    .line 51
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->g:Lkotlin/jvm/functions/Function0;

    .line 52
    .line 53
    .line 54
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 55
    return-void
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

    .line 22
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;

    .line 23
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    .line 24
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;-><init>(Landroid/content/Context;)V

    const/4 v1, 0x0

    .line 25
    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setCancelable(Z)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 26
    const-string/jumbo v1, "sns_dialog_nfc_title"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setTitle(Ljava/lang/CharSequence;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 27
    const-string/jumbo v1, "sns_dialog_nfc_message"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setMessage(Ljava/lang/CharSequence;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 28
    const-string/jumbo v1, "sns_dialog_nfc_action_settings"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/sumsub/sns/internal/core/presentation/nfc/n;

    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/core/presentation/nfc/n;-><init>(Lcom/sumsub/sns/internal/core/presentation/nfc/b;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 29
    const-string/jumbo v1, "sns_alert_action_dismiss"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/sumsub/sns/internal/core/presentation/nfc/o;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/core/presentation/nfc/o;-><init>(Lcom/sumsub/sns/internal/core/presentation/nfc/b;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    .line 30
    invoke-virtual {v0}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public final a(Ljava/lang/Boolean;)V
    .locals 1

    .line 16
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 17
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/h;->e:Landroidx/appcompat/app/AlertDialog;

    if-eqz v0, :cond_0

    .line 18
    invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V

    .line 19
    :cond_0
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->j:Ljava/lang/Boolean;

    invoke-static {v0, p1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-void

    .line 20
    :cond_1
    iput-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->j:Ljava/lang/Boolean;

    .line 21
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->f:Lkotlin/jvm/functions/Function1;

    invoke-interface {v0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->h:Ljava/lang/String;

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
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->b(Landroid/content/Context;)Lcom/sumsub/sns/internal/core/common/r0;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sget-object v1, Lcom/sumsub/sns/internal/core/common/o0;->b:Lcom/sumsub/sns/internal/core/common/o0;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->a(Ljava/lang/Boolean;)V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    .line 32
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->b(Landroid/content/Context;)Lcom/sumsub/sns/internal/core/common/r0;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 37
    move-result v0

    .line 38
    .line 39
    if-nez v0, :cond_0

    .line 40
    .line 41
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/h;->e:Landroidx/appcompat/app/AlertDialog;

    .line 42
    .line 43
    if-eqz v0, :cond_0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z

    .line 47
    move-result v0

    .line 48
    .line 49
    if-nez v0, :cond_0

    .line 50
    .line 51
    .line 52
    invoke-super {p0}, Lcom/sumsub/sns/internal/core/presentation/common/h;->p()V

    .line 53
    :cond_0
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public final l()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/sumsub/sns/internal/core/common/h;->b(Landroid/content/Context;)Lcom/sumsub/sns/internal/core/common/r0;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sget-object v1, Lcom/sumsub/sns/internal/core/common/o0;->b:Lcom/sumsub/sns/internal/core/common/o0;

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->a(Ljava/lang/Boolean;)V

    .line 24
    .line 25
    :try_start_0
    const-string v0, "Registering NFC receiver."

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V

    .line 29
    .line 30
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->i:Lcom/sumsub/sns/internal/core/presentation/nfc/a;

    .line 41
    .line 42
    new-instance v2, Landroid/content/IntentFilter;

    .line 43
    .line 44
    const-string v3, "android.nfc.action.ADAPTER_STATE_CHANGED"

    .line 45
    .line 46
    .line 47
    invoke-direct {v2, v3}, Landroid/content/IntentFilter;-><init>(Ljava/lang/String;)V

    .line 48
    const/4 v3, 0x2

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1, v2, v3}, Landroidx/core/content/ContextCompat;->registerReceiver(Landroid/content/Context;Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;I)Landroid/content/Intent;

    .line 52
    .line 53
    const-string v0, "NFC receiver registered successfully."

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 57
    return-void

    .line 58
    :catchall_0
    move-exception v0

    .line 59
    .line 60
    const-string v1, "Receiver registering error"

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0, v1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 64
    return-void
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
.end method

.method public final m()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/sumsub/sns/internal/core/presentation/common/h;->m()V

    .line 4
    .line 5
    :try_start_0
    const-string v0, "Unregistering NFC receiver."

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V

    .line 9
    .line 10
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/nfc/b;->i:Lcom/sumsub/sns/internal/core/presentation/nfc/a;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 24
    .line 25
    const-string v0, "NFC receiver unregistered successfully."

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 29
    return-void

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    .line 32
    const-string v1, "Receiver unregistering error"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1, v0}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 36
    return-void
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

.method public final n()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Popup;->NfcRequestPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 21
    .line 22
    iget-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    const-string v5, "fromScreen"

    .line 29
    .line 30
    .line 31
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v4, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 43
    return-void
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

.method public final o()V
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    iget-object v2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v2}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Popup;->NfcRequestPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 21
    .line 22
    iget-object v4, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v4}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 26
    move-result-object v4

    .line 27
    .line 28
    const-string v5, "fromScreen"

    .line 29
    .line 30
    .line 31
    invoke-static {v5, v4}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 32
    move-result-object v4

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 36
    move-result-object v4

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v4, v3}, Lcom/sumsub/sns/internal/core/analytics/f;->b(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 43
    return-void
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
