.class public final Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;
.super Lcom/sumsub/sns/internal/core/presentation/common/h;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Lkotlin/Lazy;


# direct methods
.method public constructor <init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/F;Lkotlin/jvm/functions/Function0;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/sumsub/sns/internal/core/presentation/common/h;-><init>(Lcom/sumsub/sns/core/presentation/base/l;)V

    .line 4
    .line 5
    const-string p1, "MrtdExitConfirmation"

    .line 6
    .line 7
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;->f:Ljava/lang/String;

    .line 8
    .line 9
    .line 10
    invoke-static {p2}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iput-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;->g:Lkotlin/Lazy;

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

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/d;)Lkotlin/Unit;
    .locals 1

    .line 1
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f;->a:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/f;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-super {p0}, Lcom/sumsub/sns/internal/core/presentation/common/h;->p()V

    goto :goto_1

    .line 3
    :cond_0
    sget-object v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/e;->a:Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/e;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    .line 4
    iget-object p0, p0, Lcom/sumsub/sns/internal/core/presentation/common/h;->e:Landroidx/appcompat/app/AlertDialog;

    if-eqz p0, :cond_2

    .line 5
    invoke-virtual {p0}, Landroid/app/Dialog;->isShowing()Z

    move-result p1

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    if-eqz p0, :cond_2

    invoke-virtual {p0}, Landroid/app/Dialog;->dismiss()V

    .line 6
    :cond_2
    :goto_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    return-object p0

    .line 7
    :cond_3
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static final a(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;Landroid/content/DialogInterface;I)V
    .locals 5

    .line 8
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 9
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    move-result-object p1

    .line 10
    iget-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 11
    invoke-virtual {p2}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object p2

    .line 12
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 13
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    move-result-object v0

    .line 14
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->ConfirmButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 15
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Popup;->MrtdExitPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 16
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 17
    invoke-virtual {v3}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    move-result-object v3

    const-string v4, "fromScreen"

    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    move-result-object v3

    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    move-result-object v3

    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {p2, v0, v1, v3, v2}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 19
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;->g:Lkotlin/Lazy;

    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;

    .line 20
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;->e:[Lkotlin/reflect/KProperty;

    const/4 v0, 0x0

    aget-object p2, p2, v0

    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 21
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 22
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 23
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;->a:Lkotlin/jvm/functions/Function0;

    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public static final b(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;Landroid/content/DialogInterface;I)V
    .locals 5

    .line 1
    .line 2
    iget-object p1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/sumsub/sns/core/presentation/base/l;->getAnalyticsDelegate()Lcom/sumsub/sns/internal/core/analytics/f;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    iget-object p2, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    iget-object v0, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/sumsub/sns/core/presentation/base/l;->getIdDocSetType()Ljava/lang/String;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    sget-object v1, Lcom/sumsub/sns/internal/core/analytics/Control;->CancelButton:Lcom/sumsub/sns/internal/core/analytics/Control;

    .line 21
    .line 22
    sget-object v2, Lcom/sumsub/sns/internal/core/analytics/Popup;->MrtdExitPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

    .line 23
    .line 24
    iget-object v3, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v3}, Lcom/sumsub/sns/core/presentation/base/l;->getScreen()Lcom/sumsub/sns/internal/core/analytics/Screen;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    const-string v4, "fromScreen"

    .line 31
    .line 32
    .line 33
    invoke-static {v4, v3}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 34
    move-result-object v3

    .line 35
    .line 36
    .line 37
    invoke-static {v3}, Lkotlin/collections/MapsKt;->mapOf(Lkotlin/Pair;)Ljava/util/Map;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 42
    .line 43
    .line 44
    invoke-static {p2, v0, v1, v3, v2}, Lcom/sumsub/sns/internal/core/analytics/f;->a(Lcom/sumsub/sns/internal/core/analytics/Screen;Ljava/lang/String;Lcom/sumsub/sns/internal/core/analytics/Control;Ljava/util/Map;Lcom/sumsub/sns/internal/core/analytics/Popup;)V

    .line 45
    .line 46
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;->g:Lkotlin/Lazy;

    .line 47
    .line 48
    .line 49
    invoke-interface {p0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 50
    move-result-object p0

    .line 51
    .line 52
    check-cast p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;

    .line 53
    .line 54
    iget-object p1, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;->c:Lcom/sumsub/sns/internal/core/presentation/screen/base/t;

    .line 55
    .line 56
    sget-object p2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;->e:[Lkotlin/reflect/KProperty;

    .line 57
    const/4 v0, 0x0

    .line 58
    .line 59
    aget-object p2, p2, v0

    .line 60
    .line 61
    sget-object p2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 62
    .line 63
    iget-object v0, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->a:Landroidx/lifecycle/SavedStateHandle;

    .line 64
    .line 65
    iget-object p1, p1, Lcom/sumsub/sns/internal/core/presentation/screen/base/t;->b:Ljava/lang/String;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0, p1, p2}, Landroidx/lifecycle/SavedStateHandle;->set(Ljava/lang/String;Ljava/lang/Object;)V

    .line 69
    .line 70
    iget-object p0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;->b:Lkotlin/jvm/functions/Function0;

    .line 71
    .line 72
    .line 73
    invoke-interface {p0}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 74
    return-void
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

    .line 24
    new-instance v0, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;

    .line 25
    iget-object v1, p0, Lcom/sumsub/sns/internal/core/presentation/common/t;->a:Lcom/sumsub/sns/core/presentation/base/l;

    invoke-virtual {v1}, Landroidx/fragment/app/Fragment;->requireActivity()Landroidx/fragment/app/FragmentActivity;

    move-result-object v1

    .line 26
    invoke-direct {v0, v1}, Lcom/sumsub/sns/core/widget/SNSAlertDialogBuilder;-><init>(Landroid/content/Context;)V

    .line 27
    const-string/jumbo v1, "sns_mrtdscan_alert_aboutToExit"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setMessage(Ljava/lang/CharSequence;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object v0

    .line 28
    const-string/jumbo v1, "sns_alert_action_confirm"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    new-instance v2, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/t0;

    invoke-direct {v2, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/t0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;)V

    invoke-virtual {v0, v1, v2}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object v0

    .line 29
    const-string/jumbo v1, "sns_alert_action_cancel"

    invoke-virtual {p1, v1}, Lcom/sumsub/sns/internal/features/data/repository/dynamic/l;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/u0;

    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/u0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;)V

    invoke-virtual {v0, p1, v1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object p1

    const/4 v0, 0x0

    .line 30
    invoke-virtual {p1, v0}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->setCancelable(Z)Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;

    move-result-object p1

    invoke-virtual {p1}, Lcom/google/android/material/dialog/MaterialAlertDialogBuilder;->create()Landroidx/appcompat/app/AlertDialog;

    move-result-object p1

    return-object p1
.end method

.method public final h()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;->f:Ljava/lang/String;

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

.method public final l()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;->g:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/j;

    .line 9
    .line 10
    new-instance v1, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/s0;

    .line 11
    .line 12
    .line 13
    invoke-direct {v1, p0}, Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/s0;-><init>(Lcom/sumsub/sns/internal/features/presentation/preview/photo/mrtd/k;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0, v1}, Lcom/sumsub/sns/internal/core/presentation/common/t;->a(Lcom/sumsub/sns/internal/core/presentation/common/g;Lkotlin/jvm/functions/Function1;)V

    .line 17
    return-void
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
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Popup;->MrtdExitPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

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
    sget-object v3, Lcom/sumsub/sns/internal/core/analytics/Popup;->MrtdExitPopup:Lcom/sumsub/sns/internal/core/analytics/Popup;

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

.method public final p()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    throw v0
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
