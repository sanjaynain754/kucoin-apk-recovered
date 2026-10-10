.class public final Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;
.super Lcom/kubi/resources/dialog/DialogFragmentHelper;
.source "FuturesCouponRulesDialog.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0010\u001a\u00020\u0011H\u0016J&\u0010\u0012\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u00172\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u001a\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00132\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0016J\u0008\u0010\u001d\u001a\u00020\u001eH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000c\u0010\r\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper;",
        "<init>",
        "()V",
        "viewBinding",
        "Lcom/kubi/kumex/databinding/BkumexDialogFuturesCouponRulesBinding;",
        "getViewBinding",
        "()Lcom/kubi/kumex/databinding/BkumexDialogFuturesCouponRulesBinding;",
        "viewBinding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "coupon",
        "Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;",
        "getCoupon",
        "()Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;",
        "coupon$delegate",
        "Lkotlin/Lazy;",
        "initType",
        "",
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
        "isBottomSheet",
        "",
        "KumexLib_googleRelease"
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
        "SMAP\nFuturesCouponRulesDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FuturesCouponRulesDialog.kt\ncom/kubi/futures/trade/welfare/FuturesCouponRulesDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 CoinEntityEx.kt\ncom/kubi/kumex/extensions/CoinEntityExKt\n*L\n1#1,81:1\n157#2,6:82\n20#3:88\n*S KotlinDebug\n*F\n+ 1 FuturesCouponRulesDialog.kt\ncom/kubi/futures/trade/welfare/FuturesCouponRulesDialog\n*L\n36#1:82,6\n61#1:88\n*E\n"
    }
.end annotation


# static fields
.field public static final synthetic s0:[Lkotlin/reflect/KProperty;
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
.field public final q0:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r0:Lkotlin/Lazy;
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
    const-string v1, "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogFuturesCouponRulesBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;

    .line 8
    .line 9
    const-string v4, "viewBinding"

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
    sput-object v1, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;->s0:[Lkotlin/reflect/KProperty;

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog$special$$inlined$viewBindingFragmentWithCallbacks$default$1;->INSTANCE:Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog$special$$inlined$viewBindingFragmentWithCallbacks$default$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog$special$$inlined$viewBindingFragmentWithCallbacks$default$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog$special$$inlined$viewBindingFragmentWithCallbacks$default$2;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;->q0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    new-instance v0, Lcom/kubi/futures/trade/welfare/a;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/welfare/a;-><init>(Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iput-object v0, p0, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;->r0:Lkotlin/Lazy;

    .line 28
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public static synthetic j4(Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;->l4(Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;

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
.end method

.method public static synthetic k4(Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;->o4(Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;)Lkotlin/Unit;

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
.end method

.method public static final l4(Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;)Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    const-string v0, "data"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    check-cast p0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;

    .line 15
    return-object p0

    .line 16
    :cond_0
    const/4 p0, 0x0

    .line 17
    return-object p0
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
.end method

.method public static final o4(Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

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
.end method


# virtual methods
.method public N3()I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xa

    .line 3
    return v0
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
.end method

.method public k3()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public final m4()Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;->r0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;

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
.end method

.method public final n4()Ldm/y;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;->q0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;->s0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Ldm/y;

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
    .line 8
    const p3, 0x3f333333    # 0.7f

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p3}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->d4(F)V

    .line 12
    .line 13
    sget p3, Lcom/kubi/kumex/R$layout;->bkumex_dialog_futures_coupon_rules:I

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 18
    move-result-object p1

    .line 19
    return-object p1
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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 19
    .param p1    # Landroid/view/View;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "view"

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-static {v1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 8
    .line 9
    .line 10
    invoke-super/range {p0 .. p2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;->m4()Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    .line 17
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;->n4()Ldm/y;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    if-nez v1, :cond_1

    .line 23
    .line 24
    :cond_0
    move-object/from16 v0, p0

    .line 25
    .line 26
    goto/16 :goto_3

    .line 27
    .line 28
    :cond_1
    sget-object v2, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getCurrency()Ljava/lang/String;

    .line 36
    move-result-object v3

    .line 37
    .line 38
    .line 39
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 40
    move-result-object v3

    .line 41
    const/4 v4, 0x0

    .line 42
    const/4 v5, 0x2

    .line 43
    const/4 v6, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v3, v4, v5, v6}, Lth/d;->E(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/CoinEntity;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    if-eqz v2, :cond_2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/CoinEntity;->getProperties()Lcom/kubi/kumex/data/platform/model/PropertyEntity;

    .line 53
    move-result-object v2

    .line 54
    .line 55
    if-eqz v2, :cond_2

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2}, Lcom/kubi/kumex/data/platform/model/PropertyEntity;->getShortDisplayPrecision()Ljava/lang/Integer;

    .line 59
    move-result-object v2

    .line 60
    goto :goto_0

    .line 61
    :cond_2
    move-object v2, v6

    .line 62
    :goto_0
    const/4 v3, 0x4

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 66
    move-result v9

    .line 67
    .line 68
    iget-object v2, v1, Ldm/y;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 69
    .line 70
    .line 71
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 72
    move-result v3

    .line 73
    .line 74
    if-nez v3, :cond_3

    .line 75
    const/4 v3, 0x5

    .line 76
    goto :goto_1

    .line 77
    :cond_3
    const/4 v3, 0x3

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setGravity(I)V

    .line 81
    .line 82
    iget-object v2, v1, Ldm/y;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getDeductionRatio()Ljava/math/BigDecimal;

    .line 86
    move-result-object v3

    .line 87
    .line 88
    .line 89
    invoke-static {v3}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 90
    move-result-object v3

    .line 91
    .line 92
    new-instance v4, Ljava/math/BigDecimal;

    .line 93
    .line 94
    const/16 v5, 0x64

    .line 95
    .line 96
    .line 97
    invoke-direct {v4, v5}, Ljava/math/BigDecimal;-><init>(I)V

    .line 98
    .line 99
    sget-object v5, Ljava/math/RoundingMode;->HALF_EVEN:Ljava/math/RoundingMode;

    .line 100
    .line 101
    .line 102
    invoke-virtual {v3, v4, v5}, Ljava/math/BigDecimal;->divide(Ljava/math/BigDecimal;Ljava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 103
    move-result-object v10

    .line 104
    .line 105
    const-string v3, "divide(...)"

    .line 106
    .line 107
    .line 108
    invoke-static {v10, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 109
    .line 110
    const/16 v17, 0x1f

    .line 111
    .line 112
    const/16 v18, 0x0

    .line 113
    const/4 v11, 0x0

    .line 114
    const/4 v12, 0x0

    .line 115
    const/4 v13, 0x0

    .line 116
    const/4 v14, 0x0

    .line 117
    const/4 v15, 0x0

    .line 118
    .line 119
    const/16 v16, 0x0

    .line 120
    .line 121
    .line 122
    invoke-static/range {v10 .. v18}, Llf/b;->g(Ljava/math/BigDecimal;Ljava/util/Locale;Ljava/math/RoundingMode;IZZZILjava/lang/Object;)Ljava/lang/String;

    .line 123
    move-result-object v3

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 127
    .line 128
    iget-object v2, v1, Ldm/y;->d:Lcom/kubi/resources/widget/BaseTextView;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getFaceValue()Ljava/math/BigDecimal;

    .line 132
    move-result-object v7

    .line 133
    .line 134
    if-eqz v7, :cond_4

    .line 135
    .line 136
    const/16 v15, 0x69

    .line 137
    .line 138
    const/16 v16, 0x0

    .line 139
    const/4 v8, 0x0

    .line 140
    const/4 v10, 0x1

    .line 141
    const/4 v11, 0x0

    .line 142
    const/4 v12, 0x1

    .line 143
    const/4 v13, 0x0

    .line 144
    const/4 v14, 0x0

    .line 145
    .line 146
    .line 147
    invoke-static/range {v7 .. v16}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 148
    move-result-object v3

    .line 149
    move-object v7, v3

    .line 150
    goto :goto_2

    .line 151
    :cond_4
    move-object v7, v6

    .line 152
    .line 153
    .line 154
    :goto_2
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getCurrency()Ljava/lang/String;

    .line 155
    move-result-object v3

    .line 156
    .line 157
    .line 158
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->q(Ljava/lang/String;)Ljava/lang/String;

    .line 159
    move-result-object v3

    .line 160
    .line 161
    .line 162
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 163
    move-result-object v8

    .line 164
    const/4 v11, 0x4

    .line 165
    const/4 v12, 0x0

    .line 166
    const/4 v9, 0x1

    .line 167
    const/4 v10, 0x0

    .line 168
    .line 169
    .line 170
    invoke-static/range {v7 .. v12}, Lnf/b;->g(Ljava/lang/String;Ljava/lang/String;ZZILjava/lang/Object;)Ljava/lang/String;

    .line 171
    move-result-object v3

    .line 172
    .line 173
    .line 174
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 175
    .line 176
    iget-object v2, v1, Ldm/y;->n:Lcom/kubi/resources/widget/BaseTextView;

    .line 177
    .line 178
    const-string v3, "ruleUrl"

    .line 179
    .line 180
    .line 181
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 182
    .line 183
    .line 184
    invoke-static {v2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 185
    .line 186
    iget-object v2, v1, Ldm/y;->j:Lcom/kubi/resources/widget/BaseTextView;

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0}, Lcom/kubi/kumex/data/platform/model/FuturesWelfareCouponAttributes;->getValidPeriod()Ljava/lang/Long;

    .line 190
    move-result-object v0

    .line 191
    .line 192
    if-eqz v0, :cond_5

    .line 193
    .line 194
    .line 195
    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    .line 196
    move-result-wide v7

    .line 197
    .line 198
    const/16 v13, 0xb

    .line 199
    const/4 v14, 0x0

    .line 200
    const/4 v9, 0x0

    .line 201
    const/4 v10, 0x0

    .line 202
    const/4 v11, 0x1

    .line 203
    const/4 v12, 0x0

    .line 204
    .line 205
    .line 206
    invoke-static/range {v7 .. v14}, Llf/a;->f(JLjava/util/Locale;ZZLjava/util/TimeZone;ILjava/lang/Object;)Ljava/lang/String;

    .line 207
    move-result-object v6

    .line 208
    .line 209
    .line 210
    :cond_5
    invoke-virtual {v2, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 211
    .line 212
    iget-object v7, v1, Ldm/y;->o:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 213
    .line 214
    const-string v0, "tvConfirm"

    .line 215
    .line 216
    .line 217
    invoke-static {v7, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 218
    .line 219
    new-instance v10, Lcom/kubi/futures/trade/welfare/b;

    .line 220
    .line 221
    move-object/from16 v0, p0

    .line 222
    .line 223
    .line 224
    invoke-direct {v10, v0}, Lcom/kubi/futures/trade/welfare/b;-><init>(Lcom/kubi/futures/trade/welfare/FuturesCouponRulesDialog;)V

    .line 225
    const/4 v11, 0x1

    .line 226
    const/4 v12, 0x0

    .line 227
    .line 228
    const-wide/16 v8, 0x0

    .line 229
    .line 230
    .line 231
    invoke-static/range {v7 .. v12}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 232
    return-void

    .line 233
    .line 234
    .line 235
    :goto_3
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 236
    return-void
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
.end method
