.class public final Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;
.super Lcom/kubi/resources/dialog/GravityDialogFragment;
.source "MarginConfirmDialog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$Companion;,
        Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0007\u0018\u0000 \u001f2\u00020\u0001:\u0002\u001e\u001fB\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J&\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u001a\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u00112\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0017J\u0008\u0010\u001b\u001a\u00020\u0019H\u0002J\u0008\u0010\u001c\u001a\u00020\u0019H\u0002J\u0008\u0010\u001d\u001a\u00020\u0019H\u0002R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006 "
    }
    d2 = {
        "Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;",
        "Lcom/kubi/resources/dialog/GravityDialogFragment;",
        "<init>",
        "()V",
        "bmarginDialogMarginDelegationConfirmBinding",
        "Lcom/kubi/margin/databinding/BmarginDialogMarginDelegationConfirmBinding;",
        "getBmarginDialogMarginDelegationConfirmBinding",
        "()Lcom/kubi/margin/databinding/BmarginDialogMarginDelegationConfirmBinding;",
        "bmarginDialogMarginDelegationConfirmBinding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "config",
        "Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;",
        "getConfig",
        "()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;",
        "config$delegate",
        "Lkotlin/Lazy;",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onViewCreated",
        "",
        "view",
        "showRateTipsDialog",
        "showBorrowFixDialog",
        "fetchDayRate",
        "ConfirmDialogConfig",
        "Companion",
        "MarginLib_googleRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nMarginConfirmDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarginConfirmDialog.kt\ncom/kubi/margin/trade/dialog/MarginConfirmDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n*L\n1#1,283:1\n143#2,20:284\n*S KotlinDebug\n*F\n+ 1 MarginConfirmDialog.kt\ncom/kubi/margin/trade/dialog/MarginConfirmDialog\n*L\n45#1:284,20\n*E\n"
    }
.end annotation


# static fields
.field public static final e0:Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic f0:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final c0:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final d0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getBmarginDialogMarginDelegationConfirmBinding()Lcom/kubi/margin/databinding/BmarginDialogMarginDelegationConfirmBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;

    .line 8
    .line 9
    const-string v4, "bmarginDialogMarginDelegationConfirmBinding"

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v3, v4, v1, v2}, Lkotlin/jvm/internal/PropertyReference1Impl;-><init>(Ljava/lang/Class;Ljava/lang/String;Ljava/lang/String;I)V

    .line 13
    .line 14
    .line 15
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->property1(Lkotlin/jvm/internal/PropertyReference1;)Lkotlin/reflect/KProperty1;

    .line 16
    move-result-object v0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    new-array v1, v1, [Lkotlin/reflect/KProperty;

    .line 20
    .line 21
    aput-object v0, v1, v2

    .line 22
    .line 23
    sput-object v1, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->f0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->e0:Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$Companion;

    .line 32
    return-void
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

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/dialog/GravityDialogFragment;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$special$$inlined$viewBindingFragment$default$1;->INSTANCE:Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$special$$inlined$viewBindingFragment$default$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$special$$inlined$viewBindingFragment$default$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$special$$inlined$viewBindingFragment$default$2;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->c0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    new-instance v0, Lcom/kubi/margin/trade/dialog/k0;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/kubi/margin/trade/dialog/k0;-><init>(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iput-object v0, p0, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->d0:Lkotlin/Lazy;

    .line 28
    return-void
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

.method public static synthetic A3(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->O3(Ljava/lang/Throwable;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic B3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->N3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    .line 4
    return-void
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
.end method

.method public static synthetic C3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->T3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic D3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->M3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;Ljava/math/BigDecimal;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic E3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->X3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic F3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->W3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;Ljava/lang/String;)V

    .line 4
    return-void
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
.end method

.method public static synthetic G3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->V3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic H3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->K3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic I3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->U3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static synthetic J3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->S3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method public static final K3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->requireArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    const-string v0, "data"

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 14
    .line 15
    check-cast p0, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 16
    return-object p0
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
.end method

.method public static final M3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->Q3()Ldp/g;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Ldp/g;->k:Landroidx/appcompat/widget/AppCompatTextView;

    .line 9
    .line 10
    if-eqz p0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 14
    .line 15
    const/16 v7, 0x1b

    .line 16
    const/4 v8, 0x0

    .line 17
    const/4 v1, 0x0

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    const/16 v3, 0x14

    .line 21
    const/4 v4, 0x0

    .line 22
    const/4 v5, 0x0

    .line 23
    const/4 v6, 0x0

    .line 24
    move-object v0, p1

    .line 25
    .line 26
    .line 27
    invoke-static/range {v0 .. v8}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 32
    .line 33
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 34
    return-object p0
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
.end method

.method public static final N3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    return-void
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
.end method

.method public static final O3(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static final P3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    return-void
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
.end method

.method public static final S3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->dismissAllowingStateLoss()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static final T3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getActivity()Landroidx/fragment/app/FragmentActivity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v1, v0, Lcom/kubi/sdk/BaseActivity;

    .line 7
    const/4 v2, 0x0

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    check-cast v0, Lcom/kubi/sdk/BaseActivity;

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    move-object v0, v2

    .line 14
    .line 15
    :goto_0
    if-eqz v0, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getCallBackKey()Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    const/4 v3, 0x2

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1, v2, v3, v2}, Lcom/kubi/sdk/BaseActivity;->setFragmentResult$default(Lcom/kubi/sdk/BaseActivity;Ljava/lang/String;Landroid/os/Bundle;ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->dismissAllowingStateLoss()V

    .line 31
    .line 32
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 33
    return-object p0
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
.end method

.method public static final U3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->Z3()V

    .line 4
    .line 5
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 6
    return-object p0
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
.end method

.method public static final V3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/margin/trade/MarginConfigManager;->a:Lcom/kubi/margin/trade/MarginConfigManager;

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/margin/trade/dialog/f0;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1, p0}, Lcom/kubi/margin/trade/dialog/f0;-><init>(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)V

    .line 8
    .line 9
    const-string p0, "SPOT_TAX_TIPS"

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0, v1}, Lcom/kubi/margin/trade/MarginConfigManager;->d1(Ljava/lang/String;Lio/reactivex/functions/Consumer;)V

    .line 13
    .line 14
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 15
    return-object p0
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
.end method

.method public static final W3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;Ljava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget v1, Lcom/kubi/margin/R$string;->kc_trade_india_tax_title:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget v1, Lcom/kubi/margin/R$string;->common_tax_tips:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    const-string v2, "getString(...)"

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v1}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    sget v0, Lcom/kubi/margin/R$string;->i_already_know:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0, v0}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 37
    move-result-object v0

    .line 38
    const/4 v1, 0x0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->T4(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 46
    move-result-object p0

    .line 47
    .line 48
    const-string v0, "getChildFragmentManager(...)"

    .line 49
    .line 50
    .line 51
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 52
    .line 53
    const-string v0, "tax_tip"

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, p0, v0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 57
    return-void
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
.end method

.method public static final X3(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->isBorrowFix()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 13
    return-object p0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->Y3()V

    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    return-object p0
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
.end method

.method public static synthetic z3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->P3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    .line 4
    return-void
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
.end method


# virtual methods
.method public final L3()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lmp/a;->a:Lmp/a;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lmp/a;->c()Lcom/kubi/loan/api/ILoanService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getBorrowSize()Ljava/math/BigDecimal;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getThisAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1, v2}, Lcom/kubi/loan/api/ILoanService;->e(Ljava/math/BigDecimal;Ljava/lang/String;)Lio/reactivex/Observable;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-static {}, Lcom/kubi/sdk/util/a1;->m()Lio/reactivex/ObservableTransformer;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->compose(Lio/reactivex/ObservableTransformer;)Lio/reactivex/Observable;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    new-instance v1, Lcom/kubi/margin/trade/dialog/l0;

    .line 41
    .line 42
    .line 43
    invoke-direct {v1, p0}, Lcom/kubi/margin/trade/dialog/l0;-><init>(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)V

    .line 44
    .line 45
    new-instance v2, Lcom/kubi/margin/trade/dialog/m0;

    .line 46
    .line 47
    .line 48
    invoke-direct {v2, v1}, Lcom/kubi/margin/trade/dialog/m0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 49
    .line 50
    new-instance v1, Lcom/kubi/margin/trade/dialog/n0;

    .line 51
    .line 52
    .line 53
    invoke-direct {v1}, Lcom/kubi/margin/trade/dialog/n0;-><init>()V

    .line 54
    .line 55
    new-instance v3, Lcom/kubi/margin/trade/dialog/o0;

    .line 56
    .line 57
    .line 58
    invoke-direct {v3, v1}, Lcom/kubi/margin/trade/dialog/o0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    const-string v1, "subscribe(...)"

    .line 65
    .line 66
    .line 67
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->getDestroyDisposable()Lio/reactivex/disposables/CompositeDisposable;

    .line 71
    move-result-object v1

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Lio/reactivex/rxkotlin/DisposableKt;->addTo(Lio/reactivex/disposables/Disposable;Lio/reactivex/disposables/CompositeDisposable;)Lio/reactivex/disposables/Disposable;

    .line 75
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
.end method

.method public final Q3()Ldp/g;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->c0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->f0:[Lkotlin/reflect/KProperty;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    aget-object v1, v1, v2

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p0, v1}, Lcom/kubi/sdk/viewbindingdelegate/base/a;->getValue(Ljava/lang/Object;Lkotlin/reflect/KProperty;)Landroidx/viewbinding/ViewBinding;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Ldp/g;

    .line 14
    return-object v0
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
.end method

.method public final R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->d0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

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
.end method

.method public final Y3()V
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    sget v2, Lcom/kubi/margin/R$string;->notice_prompt:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    new-instance v2, Ljava/lang/StringBuilder;

    .line 17
    .line 18
    .line 19
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 20
    .line 21
    sget v3, Lcom/kubi/margin/R$string;->margin_borrow_min_amount:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    .line 28
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getCurrency()Ljava/lang/String;

    .line 29
    move-result-object v4

    .line 30
    const/4 v5, 0x0

    .line 31
    .line 32
    if-eqz v4, :cond_0

    .line 33
    .line 34
    .line 35
    invoke-static {v4}, Lnf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 36
    move-result-object v4

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    move-object v4, v5

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 42
    move-result-object v4

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    .line 49
    invoke-virtual {v6}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getBorrowMinAmount()Ljava/math/BigDecimal;

    .line 50
    move-result-object v7

    .line 51
    .line 52
    if-eqz v7, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 56
    move-result-object v6

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getCurrency()Ljava/lang/String;

    .line 60
    move-result-object v8

    .line 61
    .line 62
    const/16 v16, 0xfe

    .line 63
    .line 64
    const/16 v17, 0x0

    .line 65
    const/4 v9, 0x0

    .line 66
    const/4 v10, 0x0

    .line 67
    const/4 v11, 0x0

    .line 68
    const/4 v12, 0x0

    .line 69
    const/4 v13, 0x0

    .line 70
    const/4 v14, 0x0

    .line 71
    const/4 v15, 0x0

    .line 72
    .line 73
    .line 74
    invoke-static/range {v7 .. v17}, Lgf/j;->b(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;IILjava/lang/Object;)Ljava/lang/String;

    .line 75
    move-result-object v6

    .line 76
    goto :goto_1

    .line 77
    :cond_1
    move-object v6, v5

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 81
    move-result-object v6

    .line 82
    .line 83
    .line 84
    filled-new-array {v4, v6}, [Ljava/lang/Object;

    .line 85
    move-result-object v4

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v3, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 89
    move-result-object v3

    .line 90
    .line 91
    .line 92
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    const-string v3, ", "

    .line 95
    .line 96
    .line 97
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 98
    .line 99
    sget v3, Lcom/kubi/margin/R$string;->margin_borrow_min_unit:I

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 103
    move-result-object v4

    .line 104
    .line 105
    .line 106
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getCurrency()Ljava/lang/String;

    .line 107
    move-result-object v4

    .line 108
    .line 109
    if-eqz v4, :cond_2

    .line 110
    .line 111
    .line 112
    invoke-static {v4}, Lnf/b;->n(Ljava/lang/String;)Ljava/lang/String;

    .line 113
    move-result-object v4

    .line 114
    goto :goto_2

    .line 115
    :cond_2
    move-object v4, v5

    .line 116
    .line 117
    .line 118
    :goto_2
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 119
    move-result-object v4

    .line 120
    .line 121
    .line 122
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 123
    move-result-object v6

    .line 124
    .line 125
    .line 126
    invoke-virtual {v6}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getBorrowMinUnit()Ljava/math/BigDecimal;

    .line 127
    move-result-object v7

    .line 128
    .line 129
    if-eqz v7, :cond_3

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 133
    move-result-object v6

    .line 134
    .line 135
    .line 136
    invoke-virtual {v6}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getCurrency()Ljava/lang/String;

    .line 137
    move-result-object v8

    .line 138
    .line 139
    const/16 v16, 0xfe

    .line 140
    .line 141
    const/16 v17, 0x0

    .line 142
    const/4 v9, 0x0

    .line 143
    const/4 v10, 0x0

    .line 144
    const/4 v11, 0x0

    .line 145
    const/4 v12, 0x0

    .line 146
    const/4 v13, 0x0

    .line 147
    const/4 v14, 0x0

    .line 148
    const/4 v15, 0x0

    .line 149
    .line 150
    .line 151
    invoke-static/range {v7 .. v17}, Lgf/j;->b(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;IILjava/lang/Object;)Ljava/lang/String;

    .line 152
    move-result-object v6

    .line 153
    goto :goto_3

    .line 154
    :cond_3
    move-object v6, v5

    .line 155
    .line 156
    .line 157
    :goto_3
    filled-new-array {v4, v6}, [Ljava/lang/Object;

    .line 158
    move-result-object v4

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0, v3, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 162
    move-result-object v3

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 169
    move-result-object v2

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 173
    move-result-object v1

    .line 174
    .line 175
    sget v2, Lcom/kubi/margin/R$string;->i_know:I

    .line 176
    .line 177
    .line 178
    invoke-virtual {v0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 179
    move-result-object v2

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v2, v5}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->T4(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 183
    move-result-object v1

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 187
    move-result-object v2

    .line 188
    .line 189
    .line 190
    invoke-virtual {v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->c5(Landroidx/fragment/app/FragmentManager;)V

    .line 191
    return-void
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
.end method

.method public final Z3()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sget v1, Lcom/kubi/margin/R$string;->notice_prompt:I

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    sget v1, Lcom/kubi/margin/R$string;->margin_about_daily_rate_tips:I

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    sget v1, Lcom/kubi/margin/R$string;->i_know:I

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 28
    move-result-object v1

    .line 29
    const/4 v2, 0x0

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->T4(Ljava/lang/String;Landroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    .line 36
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->c5(Landroidx/fragment/app/FragmentManager;)V

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

.method public onCreateView(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;
    .locals 1
    .param p1    # Landroid/view/LayoutInflater;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/view/ViewGroup;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p3    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    const-string p3, "inflater"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, p3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget p3, Lcom/kubi/margin/R$layout;->bmargin_dialog_margin_delegation_confirm:I

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 12
    move-result-object p1

    .line 13
    return-object p1
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
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 20
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "SetTextI18n",
            "KCCyclomaticComplexityCheck"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    const-string v1, "view"

    .line 5
    .line 6
    move-object/from16 v2, p1

    .line 7
    .line 8
    .line 9
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-super/range {p0 .. p2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->Q3()Ldp/g;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    if-eqz v1, :cond_5

    .line 19
    .line 20
    iget-object v2, v1, Ldp/g;->b:Landroidx/appcompat/widget/AppCompatImageView;

    .line 21
    .line 22
    const-string v3, "close"

    .line 23
    .line 24
    .line 25
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    new-instance v5, Lcom/kubi/margin/trade/dialog/e0;

    .line 28
    .line 29
    .line 30
    invoke-direct {v5, v0}, Lcom/kubi/margin/trade/dialog/e0;-><init>(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)V

    .line 31
    const/4 v6, 0x1

    .line 32
    const/4 v7, 0x0

    .line 33
    .line 34
    const-wide/16 v3, 0x0

    .line 35
    .line 36
    .line 37
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 38
    .line 39
    iget-object v2, v1, Ldp/g;->c:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    .line 46
    invoke-virtual {v3}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->isBuy()Z

    .line 47
    move-result v3

    .line 48
    .line 49
    if-eqz v3, :cond_0

    .line 50
    .line 51
    sget v3, Lcom/kubi/margin/R$string;->buy_more_rich:I

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 55
    move-result-object v4

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getSymbol()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 59
    move-result-object v4

    .line 60
    .line 61
    .line 62
    invoke-virtual {v4}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 63
    move-result-object v4

    .line 64
    .line 65
    .line 66
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 67
    move-result-object v4

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v3, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 71
    move-result-object v3

    .line 72
    goto :goto_0

    .line 73
    .line 74
    :cond_0
    sget v3, Lcom/kubi/margin/R$string;->sell_less_rich:I

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 78
    move-result-object v4

    .line 79
    .line 80
    .line 81
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getSymbol()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 82
    move-result-object v4

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4}, Lcom/kubi/data/entity/SymbolInfoEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 86
    move-result-object v4

    .line 87
    .line 88
    .line 89
    filled-new-array {v4}, [Ljava/lang/Object;

    .line 90
    move-result-object v4

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0, v3, v4}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 94
    move-result-object v3

    .line 95
    .line 96
    .line 97
    :goto_0
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 98
    .line 99
    iget-object v2, v1, Ldp/g;->c:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 103
    move-result-object v3

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->isBuy()Z

    .line 107
    move-result v3

    .line 108
    .line 109
    const-string v4, "requireContext(...)"

    .line 110
    .line 111
    if-eqz v3, :cond_1

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 115
    move-result-object v3

    .line 116
    .line 117
    .line 118
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 119
    .line 120
    .line 121
    invoke-static {v3}, Lcom/kubi/resources/g;->p(Landroid/content/Context;)I

    .line 122
    move-result v3

    .line 123
    goto :goto_1

    .line 124
    .line 125
    .line 126
    :cond_1
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 127
    move-result-object v3

    .line 128
    .line 129
    .line 130
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-static {v3}, Lcom/kubi/resources/g;->n(Landroid/content/Context;)I

    .line 134
    move-result v3

    .line 135
    .line 136
    :goto_1
    const/high16 v5, 0x41c00000    # 24.0f

    .line 137
    .line 138
    .line 139
    invoke-static {v3, v5}, Lcom/kubi/resources/g;->l(IF)Landroid/graphics/drawable/GradientDrawable;

    .line 140
    move-result-object v3

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, v3}, Landroid/view/View;->setBackground(Landroid/graphics/drawable/Drawable;)V

    .line 144
    .line 145
    iget-object v5, v1, Ldp/g;->c:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 146
    .line 147
    const-string v2, "confirm"

    .line 148
    .line 149
    .line 150
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 151
    .line 152
    new-instance v8, Lcom/kubi/margin/trade/dialog/g0;

    .line 153
    .line 154
    .line 155
    invoke-direct {v8, v0}, Lcom/kubi/margin/trade/dialog/g0;-><init>(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)V

    .line 156
    const/4 v9, 0x1

    .line 157
    const/4 v10, 0x0

    .line 158
    .line 159
    const-wide/16 v6, 0x0

    .line 160
    .line 161
    .line 162
    invoke-static/range {v5 .. v10}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 163
    .line 164
    iget-object v2, v1, Ldp/g;->l:Lcom/kubi/resources/widget/DashTextView;

    .line 165
    const/4 v3, 0x1

    .line 166
    .line 167
    .line 168
    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 169
    .line 170
    iget-object v5, v1, Ldp/g;->l:Lcom/kubi/resources/widget/DashTextView;

    .line 171
    .line 172
    const-string v2, "tvDayRageLabel"

    .line 173
    .line 174
    .line 175
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 176
    .line 177
    new-instance v8, Lcom/kubi/margin/trade/dialog/h0;

    .line 178
    .line 179
    .line 180
    invoke-direct {v8, v0}, Lcom/kubi/margin/trade/dialog/h0;-><init>(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)V

    .line 181
    .line 182
    .line 183
    invoke-static/range {v5 .. v10}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 184
    .line 185
    iget-object v2, v1, Ldp/g;->e:Landroidx/appcompat/widget/AppCompatTextView;

    .line 186
    .line 187
    .line 188
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 189
    move-result-object v5

    .line 190
    .line 191
    .line 192
    invoke-virtual {v5}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->isBuy()Z

    .line 193
    move-result v5

    .line 194
    .line 195
    if-eqz v5, :cond_2

    .line 196
    .line 197
    sget v5, Lcom/kubi/margin/R$string;->buy_in:I

    .line 198
    goto :goto_2

    .line 199
    .line 200
    :cond_2
    sget v5, Lcom/kubi/margin/R$string;->sell_out:I

    .line 201
    .line 202
    .line 203
    :goto_2
    invoke-virtual {v0, v5}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 204
    move-result-object v5

    .line 205
    .line 206
    .line 207
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 208
    move-result-object v6

    .line 209
    .line 210
    new-instance v7, Ljava/lang/StringBuilder;

    .line 211
    .line 212
    .line 213
    invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V

    .line 214
    .line 215
    .line 216
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 217
    move-result-object v8

    .line 218
    .line 219
    .line 220
    invoke-virtual {v8}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getTradeTypeString()Ljava/lang/String;

    .line 221
    move-result-object v8

    .line 222
    .line 223
    .line 224
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 225
    .line 226
    const/16 v8, 0x20

    .line 227
    .line 228
    .line 229
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 233
    move-result-object v8

    .line 234
    .line 235
    .line 236
    invoke-virtual {v8}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getSymbol()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 237
    move-result-object v8

    .line 238
    .line 239
    .line 240
    invoke-virtual {v8}, Lcom/kubi/data/entity/SymbolInfoEntity;->getShowSymbol()Ljava/lang/String;

    .line 241
    move-result-object v8

    .line 242
    .line 243
    .line 244
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    const-string v8, "  "

    .line 247
    .line 248
    .line 249
    invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 253
    .line 254
    .line 255
    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 256
    move-result-object v7

    .line 257
    .line 258
    .line 259
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->requireContext()Landroid/content/Context;

    .line 260
    move-result-object v8

    .line 261
    .line 262
    .line 263
    invoke-static {v8, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 264
    .line 265
    .line 266
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 267
    move-result-object v4

    .line 268
    .line 269
    .line 270
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->isBuy()Z

    .line 271
    move-result v4

    .line 272
    .line 273
    .line 274
    invoke-static {v8, v4}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 275
    move-result v4

    .line 276
    .line 277
    .line 278
    invoke-static {v6, v7, v5, v4}, Lcom/kubi/utils/p0;->d(Landroid/content/Context;Ljava/lang/CharSequence;Ljava/lang/String;I)Landroid/text/SpannableStringBuilder;

    .line 279
    move-result-object v4

    .line 280
    .line 281
    .line 282
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 286
    move-result-object v2

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->isBuy()Z

    .line 290
    move-result v4

    .line 291
    .line 292
    .line 293
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 294
    move-result-object v2

    .line 295
    .line 296
    .line 297
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getSymbol()Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 298
    move-result-object v5

    .line 299
    .line 300
    .line 301
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 302
    move-result-object v2

    .line 303
    .line 304
    .line 305
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getOrderAmount()Ljava/math/BigDecimal;

    .line 306
    move-result-object v6

    .line 307
    .line 308
    .line 309
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 310
    move-result-object v2

    .line 311
    .line 312
    .line 313
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getThisAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 314
    move-result-object v2

    .line 315
    .line 316
    .line 317
    invoke-virtual {v2}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 318
    move-result-object v7

    .line 319
    .line 320
    .line 321
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 322
    move-result-object v2

    .line 323
    .line 324
    .line 325
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getThisAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 326
    move-result-object v2

    .line 327
    .line 328
    .line 329
    invoke-virtual {v2}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 330
    move-result-object v8

    .line 331
    .line 332
    .line 333
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 334
    move-result-object v2

    .line 335
    .line 336
    .line 337
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getMarketDisplayAmount()Ljava/math/BigDecimal;

    .line 338
    move-result-object v9

    .line 339
    .line 340
    .line 341
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 342
    move-result-object v2

    .line 343
    .line 344
    .line 345
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getMarketAmountUnit()Lcom/kubi/tradebase/marketamount/MarketAmountUnit;

    .line 346
    move-result-object v10

    .line 347
    .line 348
    .line 349
    invoke-static/range {v4 .. v10}, Lcom/kubi/margin/trade/dialog/p0;->a(ZLcom/kubi/data/entity/SymbolInfoEntity;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;Lcom/kubi/tradebase/marketamount/MarketAmountUnit;)Lcom/kubi/margin/trade/dialog/w1;

    .line 350
    move-result-object v2

    .line 351
    .line 352
    iget-object v4, v1, Ldp/g;->h:Lcom/kubi/resources/widget/BaseTextView;

    .line 353
    .line 354
    .line 355
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/w1;->c()I

    .line 356
    move-result v5

    .line 357
    .line 358
    .line 359
    invoke-virtual {v4, v5}, Landroid/widget/TextView;->setText(I)V

    .line 360
    .line 361
    iget-object v4, v1, Ldp/g;->g:Landroidx/appcompat/widget/AppCompatTextView;

    .line 362
    .line 363
    new-instance v5, Lcom/kubi/utils/v0;

    .line 364
    .line 365
    .line 366
    invoke-direct {v5}, Lcom/kubi/utils/v0;-><init>()V

    .line 367
    .line 368
    .line 369
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/w1;->d()Ljava/math/BigDecimal;

    .line 370
    move-result-object v6

    .line 371
    .line 372
    .line 373
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/w1;->a()Ljava/lang/String;

    .line 374
    move-result-object v7

    .line 375
    .line 376
    const/16 v15, 0xfe

    .line 377
    .line 378
    const/16 v16, 0x0

    .line 379
    const/4 v8, 0x0

    .line 380
    const/4 v9, 0x0

    .line 381
    const/4 v10, 0x0

    .line 382
    const/4 v11, 0x0

    .line 383
    const/4 v12, 0x0

    .line 384
    const/4 v13, 0x0

    .line 385
    const/4 v14, 0x0

    .line 386
    .line 387
    .line 388
    invoke-static/range {v6 .. v16}, Lgf/j;->b(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;IILjava/lang/Object;)Ljava/lang/String;

    .line 389
    move-result-object v6

    .line 390
    .line 391
    .line 392
    invoke-static {v6}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 393
    move-result-object v6

    .line 394
    .line 395
    .line 396
    invoke-virtual {v5, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 397
    move-result-object v5

    .line 398
    .line 399
    const-string v6, " "

    .line 400
    .line 401
    .line 402
    invoke-virtual {v5, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 403
    move-result-object v5

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/w1;->b()Ljava/lang/String;

    .line 407
    move-result-object v2

    .line 408
    .line 409
    .line 410
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 411
    move-result-object v2

    .line 412
    .line 413
    .line 414
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 415
    move-result-object v7

    .line 416
    .line 417
    sget v8, Lcom/kubi/margin/R$color;->c_text40:I

    .line 418
    .line 419
    .line 420
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    .line 421
    move-result v7

    .line 422
    .line 423
    .line 424
    invoke-virtual {v5, v2, v7}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 425
    move-result-object v2

    .line 426
    .line 427
    .line 428
    invoke-virtual {v4, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 429
    .line 430
    iget-object v2, v1, Ldp/g;->m:Landroidx/appcompat/widget/AppCompatTextView;

    .line 431
    .line 432
    new-instance v4, Lcom/kubi/utils/v0;

    .line 433
    .line 434
    .line 435
    invoke-direct {v4}, Lcom/kubi/utils/v0;-><init>()V

    .line 436
    .line 437
    .line 438
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 439
    move-result-object v5

    .line 440
    .line 441
    .line 442
    invoke-virtual {v5}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getFeeAmount()Ljava/math/BigDecimal;

    .line 443
    move-result-object v9

    .line 444
    .line 445
    .line 446
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 447
    move-result-object v5

    .line 448
    .line 449
    .line 450
    invoke-virtual {v5}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getFeeAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 451
    move-result-object v5

    .line 452
    .line 453
    .line 454
    invoke-virtual {v5}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 455
    move-result-object v10

    .line 456
    .line 457
    const/16 v18, 0xfe

    .line 458
    .line 459
    const/16 v19, 0x0

    .line 460
    const/4 v11, 0x0

    .line 461
    const/4 v13, 0x0

    .line 462
    const/4 v15, 0x0

    .line 463
    .line 464
    const/16 v17, 0x0

    .line 465
    .line 466
    .line 467
    invoke-static/range {v9 .. v19}, Lgf/j;->b(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;IILjava/lang/Object;)Ljava/lang/String;

    .line 468
    move-result-object v5

    .line 469
    .line 470
    .line 471
    invoke-static {v5}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 472
    move-result-object v5

    .line 473
    .line 474
    .line 475
    invoke-virtual {v4, v5}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 476
    move-result-object v4

    .line 477
    .line 478
    .line 479
    invoke-virtual {v4, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 480
    move-result-object v4

    .line 481
    .line 482
    .line 483
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 484
    move-result-object v5

    .line 485
    .line 486
    .line 487
    invoke-virtual {v5}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getFeeAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 488
    move-result-object v5

    .line 489
    .line 490
    .line 491
    invoke-virtual {v5}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 492
    move-result-object v5

    .line 493
    .line 494
    .line 495
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 496
    move-result-object v7

    .line 497
    .line 498
    .line 499
    invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getColor(I)I

    .line 500
    move-result v7

    .line 501
    .line 502
    .line 503
    invoke-virtual {v4, v5, v7}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 504
    move-result-object v4

    .line 505
    .line 506
    .line 507
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 508
    .line 509
    .line 510
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 511
    move-result-object v2

    .line 512
    .line 513
    .line 514
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getTaxAmount()Ljava/math/BigDecimal;

    .line 515
    move-result-object v2

    .line 516
    .line 517
    .line 518
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->g(Ljava/math/BigDecimal;)D

    .line 519
    move-result-wide v4

    .line 520
    .line 521
    const-wide/16 v9, 0x0

    .line 522
    .line 523
    cmpl-double v2, v4, v9

    .line 524
    .line 525
    if-lez v2, :cond_4

    .line 526
    .line 527
    sget-object v2, Lcom/kubi/margin/trade/MarginConfigManager;->a:Lcom/kubi/margin/trade/MarginConfigManager;

    .line 528
    .line 529
    const-string v4, "SPOT_TAX_TIPS"

    .line 530
    const/4 v5, 0x2

    .line 531
    const/4 v7, 0x0

    .line 532
    .line 533
    .line 534
    invoke-static {v2, v4, v7, v5, v7}, Lcom/kubi/margin/trade/MarginConfigManager;->e1(Lcom/kubi/margin/trade/MarginConfigManager;Ljava/lang/String;Lio/reactivex/functions/Consumer;ILjava/lang/Object;)V

    .line 535
    .line 536
    iget-object v2, v1, Ldp/g;->p:Lcom/kubi/resources/widget/DashTextView;

    .line 537
    .line 538
    .line 539
    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 540
    .line 541
    iget-object v2, v1, Ldp/g;->p:Lcom/kubi/resources/widget/DashTextView;

    .line 542
    .line 543
    const-string v3, "tvTaxUnit"

    .line 544
    .line 545
    .line 546
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 547
    .line 548
    .line 549
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 550
    .line 551
    iget-object v9, v1, Ldp/g;->p:Lcom/kubi/resources/widget/DashTextView;

    .line 552
    .line 553
    .line 554
    invoke-static {v9, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 555
    .line 556
    new-instance v12, Lcom/kubi/margin/trade/dialog/i0;

    .line 557
    .line 558
    .line 559
    invoke-direct {v12, v0}, Lcom/kubi/margin/trade/dialog/i0;-><init>(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)V

    .line 560
    const/4 v13, 0x1

    .line 561
    const/4 v14, 0x0

    .line 562
    .line 563
    const-wide/16 v10, 0x0

    .line 564
    .line 565
    .line 566
    invoke-static/range {v9 .. v14}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 567
    .line 568
    iget-object v2, v1, Ldp/g;->o:Landroidx/appcompat/widget/AppCompatTextView;

    .line 569
    .line 570
    const-string v3, "tvTax"

    .line 571
    .line 572
    .line 573
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 574
    .line 575
    .line 576
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 577
    .line 578
    iget-object v2, v1, Ldp/g;->o:Landroidx/appcompat/widget/AppCompatTextView;

    .line 579
    .line 580
    new-instance v3, Lcom/kubi/utils/v0;

    .line 581
    .line 582
    .line 583
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 584
    .line 585
    .line 586
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 587
    move-result-object v4

    .line 588
    .line 589
    .line 590
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getTaxAmount()Ljava/math/BigDecimal;

    .line 591
    move-result-object v9

    .line 592
    .line 593
    if-eqz v9, :cond_3

    .line 594
    .line 595
    .line 596
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 597
    move-result-object v4

    .line 598
    .line 599
    .line 600
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getFeeAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 601
    move-result-object v4

    .line 602
    .line 603
    .line 604
    invoke-virtual {v4}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 605
    move-result-object v10

    .line 606
    .line 607
    const/16 v18, 0xfe

    .line 608
    .line 609
    const/16 v19, 0x0

    .line 610
    const/4 v11, 0x0

    .line 611
    const/4 v12, 0x0

    .line 612
    const/4 v13, 0x0

    .line 613
    const/4 v14, 0x0

    .line 614
    const/4 v15, 0x0

    .line 615
    .line 616
    const/16 v16, 0x0

    .line 617
    .line 618
    const/16 v17, 0x0

    .line 619
    .line 620
    .line 621
    invoke-static/range {v9 .. v19}, Lgf/j;->b(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;IILjava/lang/Object;)Ljava/lang/String;

    .line 622
    move-result-object v7

    .line 623
    .line 624
    .line 625
    :cond_3
    invoke-static {v7}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 626
    move-result-object v4

    .line 627
    .line 628
    .line 629
    invoke-virtual {v3, v4}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 630
    move-result-object v3

    .line 631
    .line 632
    .line 633
    invoke-virtual {v3, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 634
    move-result-object v3

    .line 635
    .line 636
    .line 637
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 638
    move-result-object v4

    .line 639
    .line 640
    .line 641
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getFeeAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 642
    move-result-object v4

    .line 643
    .line 644
    .line 645
    invoke-virtual {v4}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 646
    move-result-object v4

    .line 647
    .line 648
    .line 649
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 650
    move-result-object v5

    .line 651
    .line 652
    sget v7, Lcom/kubi/margin/R$color;->emphasis40:I

    .line 653
    .line 654
    .line 655
    invoke-virtual {v5, v7}, Landroid/content/res/Resources;->getColor(I)I

    .line 656
    move-result v5

    .line 657
    .line 658
    .line 659
    invoke-virtual {v3, v4, v5}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 660
    move-result-object v3

    .line 661
    .line 662
    .line 663
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 664
    .line 665
    :cond_4
    iget-object v2, v1, Ldp/g;->r:Landroidx/appcompat/widget/AppCompatTextView;

    .line 666
    .line 667
    new-instance v3, Lcom/kubi/utils/v0;

    .line 668
    .line 669
    .line 670
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 671
    .line 672
    .line 673
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 674
    move-result-object v4

    .line 675
    .line 676
    .line 677
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getRealAvailable()Ljava/math/BigDecimal;

    .line 678
    move-result-object v9

    .line 679
    .line 680
    .line 681
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 682
    move-result-object v4

    .line 683
    .line 684
    .line 685
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getThisAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 686
    move-result-object v4

    .line 687
    .line 688
    .line 689
    invoke-virtual {v4}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 690
    move-result-object v10

    .line 691
    .line 692
    const/16 v18, 0xfe

    .line 693
    .line 694
    const/16 v19, 0x0

    .line 695
    const/4 v11, 0x0

    .line 696
    const/4 v12, 0x0

    .line 697
    const/4 v13, 0x0

    .line 698
    const/4 v14, 0x0

    .line 699
    const/4 v15, 0x0

    .line 700
    .line 701
    const/16 v16, 0x0

    .line 702
    .line 703
    const/16 v17, 0x0

    .line 704
    .line 705
    .line 706
    invoke-static/range {v9 .. v19}, Lgf/j;->b(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;IILjava/lang/Object;)Ljava/lang/String;

    .line 707
    move-result-object v4

    .line 708
    .line 709
    .line 710
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 711
    move-result-object v4

    .line 712
    .line 713
    .line 714
    invoke-virtual {v3, v4}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 715
    move-result-object v3

    .line 716
    .line 717
    .line 718
    invoke-virtual {v3, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 719
    move-result-object v3

    .line 720
    .line 721
    .line 722
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 723
    move-result-object v4

    .line 724
    .line 725
    .line 726
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getThisAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 727
    move-result-object v4

    .line 728
    .line 729
    .line 730
    invoke-virtual {v4}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 731
    move-result-object v4

    .line 732
    .line 733
    .line 734
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 735
    move-result-object v5

    .line 736
    .line 737
    .line 738
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getColor(I)I

    .line 739
    move-result v5

    .line 740
    .line 741
    .line 742
    invoke-virtual {v3, v4, v5}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 743
    move-result-object v3

    .line 744
    .line 745
    .line 746
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 747
    .line 748
    iget-object v2, v1, Ldp/g;->j:Lcom/kubi/resources/widget/DashTextView;

    .line 749
    .line 750
    .line 751
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 752
    move-result-object v3

    .line 753
    .line 754
    .line 755
    invoke-virtual {v3}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->isBorrowFix()Z

    .line 756
    move-result v3

    .line 757
    .line 758
    .line 759
    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 760
    .line 761
    iget-object v9, v1, Ldp/g;->j:Lcom/kubi/resources/widget/DashTextView;

    .line 762
    .line 763
    const-string v2, "tvAutoBorrowLabel"

    .line 764
    .line 765
    .line 766
    invoke-static {v9, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 767
    .line 768
    new-instance v12, Lcom/kubi/margin/trade/dialog/j0;

    .line 769
    .line 770
    .line 771
    invoke-direct {v12, v0}, Lcom/kubi/margin/trade/dialog/j0;-><init>(Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;)V

    .line 772
    const/4 v13, 0x1

    .line 773
    const/4 v14, 0x0

    .line 774
    .line 775
    const-wide/16 v10, 0x0

    .line 776
    .line 777
    .line 778
    invoke-static/range {v9 .. v14}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 779
    .line 780
    iget-object v2, v1, Ldp/g;->i:Landroidx/appcompat/widget/AppCompatTextView;

    .line 781
    .line 782
    new-instance v3, Lcom/kubi/utils/v0;

    .line 783
    .line 784
    .line 785
    invoke-direct {v3}, Lcom/kubi/utils/v0;-><init>()V

    .line 786
    .line 787
    .line 788
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 789
    move-result-object v4

    .line 790
    .line 791
    .line 792
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getBorrowSize()Ljava/math/BigDecimal;

    .line 793
    move-result-object v9

    .line 794
    .line 795
    .line 796
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 797
    move-result-object v4

    .line 798
    .line 799
    .line 800
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getThisAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 801
    move-result-object v4

    .line 802
    .line 803
    .line 804
    invoke-virtual {v4}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrency()Ljava/lang/String;

    .line 805
    move-result-object v10

    .line 806
    const/4 v11, 0x0

    .line 807
    const/4 v12, 0x0

    .line 808
    const/4 v13, 0x0

    .line 809
    const/4 v14, 0x0

    .line 810
    .line 811
    .line 812
    invoke-static/range {v9 .. v19}, Lgf/j;->b(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/RoundingMode;ZZZILjava/util/Locale;IILjava/lang/Object;)Ljava/lang/String;

    .line 813
    move-result-object v4

    .line 814
    .line 815
    .line 816
    invoke-virtual {v3, v4}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 817
    move-result-object v3

    .line 818
    .line 819
    .line 820
    invoke-virtual {v3, v6}, Lcom/kubi/utils/v0;->b(Ljava/lang/CharSequence;)Lcom/kubi/utils/v0;

    .line 821
    move-result-object v3

    .line 822
    .line 823
    .line 824
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 825
    move-result-object v4

    .line 826
    .line 827
    .line 828
    invoke-virtual {v4}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->getThisAsset()Lcom/kubi/tradebase/entity/CurrencyBalance;

    .line 829
    move-result-object v4

    .line 830
    .line 831
    .line 832
    invoke-virtual {v4}, Lcom/kubi/tradebase/entity/CurrencyBalance;->getCurrencyName()Ljava/lang/String;

    .line 833
    move-result-object v4

    .line 834
    .line 835
    .line 836
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 837
    move-result-object v5

    .line 838
    .line 839
    .line 840
    invoke-virtual {v5, v8}, Landroid/content/res/Resources;->getColor(I)I

    .line 841
    move-result v5

    .line 842
    .line 843
    .line 844
    invoke-virtual {v3, v4, v5}, Lcom/kubi/utils/v0;->e(Ljava/lang/CharSequence;I)Lcom/kubi/utils/v0;

    .line 845
    move-result-object v3

    .line 846
    .line 847
    .line 848
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 849
    .line 850
    .line 851
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->L3()V

    .line 852
    .line 853
    iget-object v2, v1, Ldp/g;->q:Landroidx/appcompat/widget/AppCompatTextView;

    .line 854
    .line 855
    const-string v3, "tvTips"

    .line 856
    .line 857
    .line 858
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 859
    .line 860
    .line 861
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 862
    .line 863
    .line 864
    invoke-virtual {v0}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog;->R3()Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;

    .line 865
    move-result-object v2

    .line 866
    .line 867
    .line 868
    invoke-virtual {v2}, Lcom/kubi/margin/trade/dialog/MarginConfirmDialog$ConfirmDialogConfig;->isReverse()Ljava/lang/Boolean;

    .line 869
    move-result-object v2

    .line 870
    .line 871
    if-eqz v2, :cond_5

    .line 872
    .line 873
    .line 874
    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 875
    move-result v2

    .line 876
    .line 877
    if-eqz v2, :cond_5

    .line 878
    .line 879
    iget-object v2, v1, Ldp/g;->q:Landroidx/appcompat/widget/AppCompatTextView;

    .line 880
    .line 881
    .line 882
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 883
    .line 884
    .line 885
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 886
    .line 887
    iget-object v2, v1, Ldp/g;->q:Landroidx/appcompat/widget/AppCompatTextView;

    .line 888
    .line 889
    sget v4, Lcom/kubi/margin/R$string;->margin_trade_make_revert_order_tip:I

    .line 890
    .line 891
    .line 892
    invoke-virtual {v0, v4}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 893
    move-result-object v4

    .line 894
    .line 895
    .line 896
    invoke-virtual {v2, v4}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 897
    .line 898
    sget-object v2, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 899
    .line 900
    iget-object v1, v1, Ldp/g;->q:Landroidx/appcompat/widget/AppCompatTextView;

    .line 901
    .line 902
    .line 903
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 904
    .line 905
    new-instance v3, Lkotlin/Pair;

    .line 906
    .line 907
    sget-object v4, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 908
    .line 909
    new-instance v5, Landroid/text/style/ForegroundColorSpan;

    .line 910
    .line 911
    .line 912
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 913
    move-result-object v6

    .line 914
    .line 915
    sget v7, Lcom/kubi/margin/R$color;->complementary:I

    .line 916
    .line 917
    .line 918
    invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getColor(I)I

    .line 919
    move-result v6

    .line 920
    .line 921
    .line 922
    invoke-direct {v5, v6}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 923
    .line 924
    .line 925
    invoke-direct {v3, v4, v5}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 926
    .line 927
    .line 928
    filled-new-array {v3}, [Lkotlin/Pair;

    .line 929
    move-result-object v3

    .line 930
    .line 931
    .line 932
    invoke-virtual {v2, v1, v3}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 933
    :cond_5
    return-void
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
.end method
