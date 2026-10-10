.class public final Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;
.super Lcom/kubi/resources/dialog/DialogFragmentHelper;
.source "ModifyPositionLeverageDialog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0018\u0002\n\u0002\u0008\n\u0018\u0000 ]2\u00020\u0001:\u0001]B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u00103\u001a\u00020*H\u0016J&\u00104\u001a\u0004\u0018\u0001052\u0006\u00106\u001a\u0002072\u0008\u00108\u001a\u0004\u0018\u0001092\u0008\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u001a\u0010<\u001a\u00020=2\u0006\u0010>\u001a\u0002052\u0008\u0010:\u001a\u0004\u0018\u00010;H\u0016J\u0008\u0010?\u001a\u00020=H\u0002J\u001e\u0010@\u001a\u00020=2\u0014\u0010A\u001a\u0010\u0012\u0004\u0012\u00020/\u0012\u0006\u0012\u0004\u0018\u00010C0BH\u0002J\u0008\u0010D\u001a\u00020EH\u0002J\u001c\u0010F\u001a\u00020=2\u0012\u0010A\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020G0BH\u0002J\u0010\u0010H\u001a\u00020=2\u0006\u0010A\u001a\u00020 H\u0002J\u0010\u0010I\u001a\u00020E2\u0006\u0010J\u001a\u00020GH\u0002J\u0010\u0010K\u001a\u00020=2\u0006\u0010A\u001a\u00020GH\u0002J\u0008\u0010L\u001a\u00020=H\u0002J\u0008\u0010M\u001a\u00020=H\u0002J\u0010\u0010N\u001a\u00020=2\u0006\u0010O\u001a\u00020GH\u0002J\u0012\u0010P\u001a\u00020=2\u0008\u0010J\u001a\u0004\u0018\u00010GH\u0002J\u0010\u0010Q\u001a\u00020=2\u0006\u0010A\u001a\u00020GH\u0002J\u0010\u0010R\u001a\u00020=2\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010U\u001a\u00020=2\u0006\u0010S\u001a\u00020TH\u0002J\u0010\u0010V\u001a\u00020=2\u0006\u0010J\u001a\u00020GH\u0002J\u0012\u0010W\u001a\u00020=2\u0008\u0010X\u001a\u0004\u0018\u00010EH\u0002J\u0008\u0010Y\u001a\u00020=H\u0002J\u0010\u0010Z\u001a\u00020E2\u0006\u0010[\u001a\u00020*H\u0002J\u0008\u0010\\\u001a\u00020=H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000c\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0012\u0010\u0013R\u001b\u0010\u0015\u001a\u00020\u00168BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u000f\u001a\u0004\u0008\u0017\u0010\u0018R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u000f\u001a\u0004\u0008\u001c\u0010\u001dR\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010\u000f\u001a\u0004\u0008!\u0010\"R\u001d\u0010$\u001a\u0004\u0018\u00010%8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008(\u0010\u000f\u001a\u0004\u0008&\u0010\'R\u001b\u0010)\u001a\u00020*8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008-\u0010\u000f\u001a\u0004\u0008+\u0010,R\u000e\u0010.\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00100\u001a\u000201X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020/X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006^"
    }
    d2 = {
        "Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper;",
        "<init>",
        "()V",
        "binding",
        "Lcom/kubi/kumex/databinding/BkumexDialogPositionLeverageBinding;",
        "getBinding",
        "()Lcom/kubi/kumex/databinding/BkumexDialogPositionLeverageBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "viewModel",
        "Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;",
        "getViewModel",
        "()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "addMarginViewModel",
        "Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;",
        "getAddMarginViewModel",
        "()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;",
        "addMarginViewModel$delegate",
        "reduceMarginViewModel",
        "Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;",
        "getReduceMarginViewModel",
        "()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;",
        "reduceMarginViewModel$delegate",
        "futuresViewModel",
        "Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;",
        "getFuturesViewModel",
        "()Lcom/kubi/futures/trade/vm/ExclusionDialogFuturesViewModel;",
        "futuresViewModel$delegate",
        "position",
        "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
        "getPosition",
        "()Lcom/kubi/kumex/data/trade/model/PositionEntity;",
        "position$delegate",
        "contract",
        "Lcom/kubi/kumex/data/platform/model/ContractEntity;",
        "getContract",
        "()Lcom/kubi/kumex/data/platform/model/ContractEntity;",
        "contract$delegate",
        "currencyPrecision",
        "",
        "getCurrencyPrecision",
        "()I",
        "currencyPrecision$delegate",
        "trackLeverageNotAdjustOnce",
        "",
        "debounceTime",
        "",
        "alreadySetInitLeverage",
        "initType",
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
        "initObserver",
        "handleSubmitResult",
        "it",
        "Lkotlin/Pair;",
        "",
        "toTrackPositionMode",
        "",
        "onLeverageRangeChanged",
        "Ljava/math/BigDecimal;",
        "onPositionChanged",
        "formatLeverage",
        "leverage",
        "onMarginChanged",
        "initView",
        "handleConfirm",
        "trackConfirm",
        "margin",
        "onInputValueChanged",
        "handleLeverageChanged",
        "onAfterPositionInfoChanged",
        "info",
        "Lcom/kubi/futures/trade/position/PositionRenderInfo;",
        "onCurrentPositionInfoChanged",
        "showWarning",
        "showError",
        "errorMessage",
        "showLeverageRangeTips",
        "getStringRes",
        "stringRes",
        "onResume",
        "Companion",
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
        "SMAP\nModifyPositionLeverageDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ModifyPositionLeverageDialog.kt\ncom/kubi/futures/trade/position/ModifyPositionLeverageDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 MviEx.kt\ncom/kubi/mvi/common/MviExKt\n*L\n1#1,606:1\n143#2,20:607\n220#3,5:627\n220#3,5:632\n220#3,5:637\n*S KotlinDebug\n*F\n+ 1 ModifyPositionLeverageDialog.kt\ncom/kubi/futures/trade/position/ModifyPositionLeverageDialog\n*L\n65#1:607,20\n67#1:627,5\n69#1:632,5\n71#1:637,5\n*E\n"
    }
.end annotation


# static fields
.field public static final B0:Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic C0:[Lkotlin/reflect/KProperty;
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
.field public A0:Z

.field public final q0:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final s0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final t0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final u0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final v0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final w0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final x0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public y0:Z

.field public z0:J


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getBinding()Lcom/kubi/kumex/databinding/BkumexDialogPositionLeverageBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;

    .line 8
    .line 9
    const-string v4, "binding"

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
    sput-object v1, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->C0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->B0:Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$Companion;

    .line 32
    return-void
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
    sget-object v0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$special$$inlined$viewBindingFragment$default$1;->INSTANCE:Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$special$$inlined$viewBindingFragment$default$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$special$$inlined$viewBindingFragment$default$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$special$$inlined$viewBindingFragment$default$2;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->q0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    new-instance v0, Lcom/kubi/futures/trade/position/d2;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/d2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iput-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->r0:Lkotlin/Lazy;

    .line 28
    .line 29
    new-instance v0, Lcom/kubi/futures/trade/position/e2;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/e2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    iput-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->s0:Lkotlin/Lazy;

    .line 39
    .line 40
    new-instance v0, Lcom/kubi/futures/trade/position/f2;

    .line 41
    .line 42
    .line 43
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/f2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 44
    .line 45
    .line 46
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    iput-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->t0:Lkotlin/Lazy;

    .line 50
    .line 51
    new-instance v0, Lcom/kubi/futures/trade/position/g2;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/g2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    iput-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->u0:Lkotlin/Lazy;

    .line 61
    .line 62
    new-instance v0, Lcom/kubi/futures/trade/position/h2;

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/h2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    iput-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->v0:Lkotlin/Lazy;

    .line 72
    .line 73
    new-instance v0, Lcom/kubi/futures/trade/position/i2;

    .line 74
    .line 75
    .line 76
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/i2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    iput-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->w0:Lkotlin/Lazy;

    .line 83
    .line 84
    new-instance v0, Lcom/kubi/futures/trade/position/j2;

    .line 85
    .line 86
    .line 87
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/j2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 88
    .line 89
    .line 90
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    iput-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->x0:Lkotlin/Lazy;

    .line 94
    return-void
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
.end method

.method public static synthetic A4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->t5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Unit;

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

.method public static synthetic B4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->M4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)I

    .line 4
    move-result p0

    .line 5
    return p0
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

.method public static final B5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/kumex/data/trade/model/PositionEntity;
    .locals 54

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    const-string v1, "data"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/os/Bundle;->getParcelable(Ljava/lang/String;)Landroid/os/Parcelable;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    return-object v0

    .line 19
    .line 20
    :cond_1
    :goto_0
    new-instance v1, Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 21
    .line 22
    .line 23
    const v52, 0x1ffff

    .line 24
    .line 25
    const/16 v53, 0x0

    .line 26
    const/4 v2, 0x0

    .line 27
    const/4 v3, 0x0

    .line 28
    const/4 v4, 0x0

    .line 29
    const/4 v5, 0x0

    .line 30
    const/4 v6, 0x0

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v8, 0x0

    .line 33
    const/4 v9, 0x0

    .line 34
    const/4 v10, 0x0

    .line 35
    const/4 v11, 0x0

    .line 36
    const/4 v12, 0x0

    .line 37
    const/4 v13, 0x0

    .line 38
    const/4 v14, 0x0

    .line 39
    const/4 v15, 0x0

    .line 40
    .line 41
    const/16 v16, 0x0

    .line 42
    .line 43
    const/16 v17, 0x0

    .line 44
    .line 45
    const/16 v18, 0x0

    .line 46
    .line 47
    const/16 v19, 0x0

    .line 48
    .line 49
    const/16 v20, 0x0

    .line 50
    .line 51
    const/16 v21, 0x0

    .line 52
    .line 53
    const/16 v22, 0x0

    .line 54
    .line 55
    const/16 v23, 0x0

    .line 56
    .line 57
    const/16 v24, 0x0

    .line 58
    .line 59
    const/16 v25, 0x0

    .line 60
    .line 61
    const/16 v26, 0x0

    .line 62
    .line 63
    const/16 v27, 0x0

    .line 64
    .line 65
    const/16 v28, 0x0

    .line 66
    .line 67
    const/16 v29, 0x0

    .line 68
    .line 69
    const/16 v30, 0x0

    .line 70
    .line 71
    const/16 v31, 0x0

    .line 72
    .line 73
    const/16 v32, 0x0

    .line 74
    .line 75
    const/16 v33, 0x0

    .line 76
    .line 77
    const/16 v34, 0x0

    .line 78
    .line 79
    const/16 v35, 0x0

    .line 80
    .line 81
    const/16 v36, 0x0

    .line 82
    .line 83
    const/16 v37, 0x0

    .line 84
    .line 85
    const/16 v38, 0x0

    .line 86
    .line 87
    const/16 v39, 0x0

    .line 88
    .line 89
    const/16 v40, 0x0

    .line 90
    .line 91
    const/16 v41, 0x0

    .line 92
    .line 93
    const/16 v42, 0x0

    .line 94
    .line 95
    const/16 v43, 0x0

    .line 96
    .line 97
    const/16 v44, 0x0

    .line 98
    .line 99
    const/16 v45, 0x0

    .line 100
    .line 101
    const/16 v46, 0x0

    .line 102
    .line 103
    const/16 v47, 0x0

    .line 104
    .line 105
    const/16 v48, 0x0

    .line 106
    .line 107
    const/16 v49, 0x0

    .line 108
    .line 109
    const/16 v50, 0x0

    .line 110
    .line 111
    const/16 v51, -0x1

    .line 112
    .line 113
    .line 114
    invoke-direct/range {v1 .. v53}, Lcom/kubi/kumex/data/trade/model/PositionEntity;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/Long;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/kumex/data/trade/model/PositionTrialEntity;Lcom/kubi/kumex/data/trade/model/UserJoinChallengeEntity;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Ljava/lang/String;Ljava/math/BigDecimal;Ljava/math/BigDecimal;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 115
    return-object v1
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
.end method

.method public static synthetic C4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->h5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

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
.end method

.method public static final C5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 6
    .line 7
    const-class p0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    check-cast p0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 14
    return-object p0
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

.method public static synthetic D4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->q5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;

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

.method public static synthetic E4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/kumex/data/platform/model/ContractEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->L4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

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

.method public static synthetic F4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->s5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Z)Lkotlin/Unit;

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
.end method

.method private final F5()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    .line 14
    move-result v1

    .line 15
    .line 16
    .line 17
    const v2, 0x1f3381

    .line 18
    .line 19
    if-eq v1, v2, :cond_3

    .line 20
    .line 21
    .line 22
    const v2, 0x23be7c

    .line 23
    .line 24
    if-eq v1, v2, :cond_1

    .line 25
    .line 26
    .line 27
    const v2, 0x4b38c5c

    .line 28
    .line 29
    if-eq v1, v2, :cond_0

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    const-string v1, "SHORT"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 36
    move-result v0

    .line 37
    .line 38
    if-nez v0, :cond_2

    .line 39
    goto :goto_0

    .line 40
    .line 41
    :cond_1
    const-string v1, "LONG"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 45
    move-result v0

    .line 46
    .line 47
    if-nez v0, :cond_2

    .line 48
    goto :goto_0

    .line 49
    .line 50
    :cond_2
    const-string v0, "2"

    .line 51
    return-object v0

    .line 52
    .line 53
    :cond_3
    const-string v1, "BOTH"

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 57
    move-result v0

    .line 58
    .line 59
    if-nez v0, :cond_4

    .line 60
    goto :goto_0

    .line 61
    .line 62
    :cond_4
    const-string v0, "1"

    .line 63
    return-object v0

    .line 64
    .line 65
    :cond_5
    :goto_0
    const-string v0, "none"

    .line 66
    return-object v0
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
.end method

.method public static synthetic G4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->f5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lkotlin/Pair;)Lkotlin/Unit;

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
.end method

.method public static synthetic H4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->u5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;

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

.method public static final H5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 6
    .line 7
    const-class p0, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    check-cast p0, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 14
    return-object p0
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

.method public static synthetic I4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->k5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Ljava/math/BigDecimal;)Lkotlin/Unit;

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
.end method

.method public static final synthetic J4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/kumex/data/trade/model/PositionEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

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

.method public static final K4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 6
    .line 7
    const-class p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p0}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 11
    move-result-object p0

    .line 12
    .line 13
    check-cast p0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 14
    return-object p0
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

.method public static final L4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/kumex/data/platform/model/ContractEntity;
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/broker/r;->a:Lcom/kubi/broker/r;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/broker/r;->g()Lth/d;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    .line 17
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object p0

    .line 19
    const/4 v1, 0x2

    .line 20
    const/4 v2, 0x0

    .line 21
    const/4 v3, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p0, v3, v1, v2}, Lth/d;->O(Lth/d;Ljava/lang/String;ZILjava/lang/Object;)Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 25
    move-result-object p0

    .line 26
    return-object p0
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public static final M4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->R4()Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    .line 7
    invoke-static {p0}, Lfm/b;->c(Lcom/kubi/kumex/data/platform/model/ContractEntity;)I

    .line 8
    move-result p0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    invoke-static {p0}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 16
    move-result p0

    .line 17
    return p0
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

.method public static final O4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/futures/trade/vm/u;
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 20
    move-result v3

    .line 21
    .line 22
    .line 23
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    const/16 v6, 0x8

    .line 31
    const/4 v7, 0x0

    .line 32
    const/4 v5, 0x0

    .line 33
    move-object v1, p0

    .line 34
    .line 35
    .line 36
    invoke-static/range {v1 .. v7}, Lcom/kubi/futures/trade/vm/v;->b(Landroidx/fragment/app/Fragment;Ljava/lang/String;ZLjava/lang/String;Lcom/kubi/broker/MultiBizType;ILjava/lang/Object;)Lcom/kubi/futures/trade/vm/u;

    .line 37
    move-result-object p0

    .line 38
    return-object p0
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
.end method

.method private final R4()Lcom/kubi/kumex/data/platform/model/ContractEntity;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->w0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/kumex/data/platform/model/ContractEntity;

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

.method private final T4()Lcom/kubi/futures/trade/vm/u;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->u0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/futures/trade/vm/u;

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

.method private final U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->v0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/kumex/data/trade/model/PositionEntity;

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

.method private final Y4()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Q4()Ldm/q0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_2

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->w()Landroidx/lifecycle/MutableLiveData;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    check-cast v1, Ljava/math/BigDecimal;

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    if-nez v1, :cond_1

    .line 25
    .line 26
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 27
    .line 28
    sget v1, Lcom/kubi/kumex/R$string;->kumex_modify_leverage_so_smal:I

    .line 29
    .line 30
    new-array v2, v2, [Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-direct {p0, v0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->showError(Ljava/lang/String;)V

    .line 38
    return-void

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->S4()I

    .line 42
    move-result v3

    .line 43
    .line 44
    sget-object v4, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 48
    move-result v5

    .line 49
    .line 50
    if-ltz v5, :cond_2

    .line 51
    .line 52
    sget-object v5, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 53
    goto :goto_0

    .line 54
    .line 55
    :cond_2
    sget-object v5, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 56
    .line 57
    .line 58
    :goto_0
    invoke-virtual {v1, v3, v5}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 63
    move-result-object v3

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->R4()Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 67
    move-result-object v5

    .line 68
    .line 69
    if-eqz v5, :cond_3

    .line 70
    .line 71
    .line 72
    invoke-static {v5}, Lfm/b;->g(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Ljava/math/BigDecimal;

    .line 73
    move-result-object v5

    .line 74
    goto :goto_1

    .line 75
    :cond_3
    const/4 v5, 0x0

    .line 76
    .line 77
    .line 78
    :goto_1
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 79
    move-result-object v5

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v5}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 83
    move-result v3

    .line 84
    .line 85
    if-gez v3, :cond_4

    .line 86
    .line 87
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 88
    .line 89
    sget v1, Lcom/kubi/kumex/R$string;->kumex_modify_leverage_so_smal:I

    .line 90
    .line 91
    new-array v2, v2, [Ljava/lang/Object;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1, v2}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 95
    move-result-object v0

    .line 96
    .line 97
    .line 98
    invoke-direct {p0, v0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->showError(Ljava/lang/String;)V

    .line 99
    return-void

    .line 100
    .line 101
    :cond_4
    iget-object v2, v0, Ldm/q0;->y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 102
    .line 103
    .line 104
    invoke-virtual {v2}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->m()Z

    .line 105
    move-result v2

    .line 106
    .line 107
    if-eqz v2, :cond_5

    .line 108
    :goto_2
    return-void

    .line 109
    .line 110
    :cond_5
    iget-object v0, v0, Ldm/q0;->y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->o()V

    .line 114
    .line 115
    .line 116
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 117
    .line 118
    .line 119
    invoke-virtual {p0, v1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->G5(Ljava/math/BigDecimal;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v1, v4}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 123
    move-result v0

    .line 124
    .line 125
    if-lez v0, :cond_6

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->P4()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 129
    move-result-object v0

    .line 130
    .line 131
    .line 132
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 133
    move-result-object v2

    .line 134
    .line 135
    .line 136
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 137
    move-result-object v2

    .line 138
    .line 139
    .line 140
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 141
    move-result-object v2

    .line 142
    .line 143
    .line 144
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 145
    move-result-object v3

    .line 146
    .line 147
    .line 148
    invoke-virtual {v3}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 149
    move-result v3

    .line 150
    .line 151
    .line 152
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 153
    move-result-object v4

    .line 154
    .line 155
    .line 156
    invoke-virtual {v4}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 157
    move-result-object v4

    .line 158
    .line 159
    .line 160
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    move-result-object v4

    .line 162
    .line 163
    .line 164
    invoke-virtual {v0, v2, v3, v1, v4}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->l0(Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/lang/String;)V

    .line 165
    return-void

    .line 166
    .line 167
    .line 168
    :cond_6
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->V4()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 169
    move-result-object v0

    .line 170
    .line 171
    .line 172
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 173
    move-result-object v2

    .line 174
    .line 175
    .line 176
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 177
    move-result-object v2

    .line 178
    .line 179
    .line 180
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 181
    move-result-object v2

    .line 182
    .line 183
    .line 184
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 185
    move-result-object v3

    .line 186
    .line 187
    .line 188
    invoke-virtual {v3}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 189
    move-result v3

    .line 190
    .line 191
    .line 192
    invoke-virtual {v1}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 193
    move-result-object v1

    .line 194
    .line 195
    const-string v4, "abs(...)"

    .line 196
    .line 197
    .line 198
    invoke-static {v1, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 202
    move-result-object v4

    .line 203
    .line 204
    .line 205
    invoke-virtual {v4}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 206
    move-result-object v4

    .line 207
    .line 208
    .line 209
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 210
    move-result-object v4

    .line 211
    .line 212
    .line 213
    invoke-virtual {v0, v2, v3, v1, v4}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->f0(Ljava/lang/String;ZLjava/math/BigDecimal;Ljava/lang/String;)V

    .line 214
    return-void
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
.end method

.method private final a5(Lkotlin/Pair;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "Ljava/lang/Boolean;",
            "+",
            "Ljava/lang/Throwable;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Q4()Ldm/q0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Ldm/q0;->y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->l()V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    check-cast v0, Ljava/lang/Boolean;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-eqz v0, :cond_1

    .line 26
    .line 27
    sget p1, Lcom/kubi/kumex/R$string;->kumex_modify_leverage_success:I

    .line 28
    .line 29
    .line 30
    invoke-static {p1}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 34
    .line 35
    const-string p1, "success"

    .line 36
    goto :goto_1

    .line 37
    .line 38
    .line 39
    :cond_1
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    check-cast v0, Ljava/lang/Throwable;

    .line 43
    .line 44
    if-eqz v0, :cond_5

    .line 45
    .line 46
    instance-of v1, v0, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 47
    .line 48
    if-eqz v1, :cond_4

    .line 49
    .line 50
    check-cast v0, Lcom/kubi/network/retrofit/exception/ApiException;

    .line 51
    .line 52
    iget-object v1, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 53
    .line 54
    const-string v2, "200013"

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 58
    move-result v1

    .line 59
    .line 60
    if-nez v1, :cond_2

    .line 61
    .line 62
    iget-object v1, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 63
    .line 64
    const-string v3, "200012"

    .line 65
    .line 66
    .line 67
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 68
    move-result v1

    .line 69
    .line 70
    if-eqz v1, :cond_4

    .line 71
    .line 72
    :cond_2
    iget-object p1, v0, Lcom/kubi/network/retrofit/exception/ApiException;->code:Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 76
    move-result p1

    .line 77
    .line 78
    if-eqz p1, :cond_3

    .line 79
    .line 80
    sget p1, Lcom/kubi/kumex/R$string;->kumex_modify_margin_reduce_fail_risk_change:I

    .line 81
    .line 82
    .line 83
    invoke-static {p0, p1}, Lcom/kubi/kumex/utils/m0;->c(Landroidx/lifecycle/LifecycleOwner;I)V

    .line 84
    goto :goto_0

    .line 85
    .line 86
    :cond_3
    sget p1, Lcom/kubi/kumex/R$string;->kumex_modify_margin_reduce_fail_max_amount:I

    .line 87
    .line 88
    .line 89
    invoke-static {p0, p1}, Lcom/kubi/kumex/utils/m0;->c(Landroidx/lifecycle/LifecycleOwner;I)V

    .line 90
    goto :goto_0

    .line 91
    .line 92
    .line 93
    :cond_4
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    check-cast p1, Ljava/lang/Throwable;

    .line 97
    .line 98
    .line 99
    invoke-static {p0, p1}, Lcom/kubi/kumex/utils/m0;->e(Landroidx/lifecycle/LifecycleOwner;Ljava/lang/Throwable;)V

    .line 100
    .line 101
    :cond_5
    :goto_0
    const-string p1, "failure"

    .line 102
    .line 103
    .line 104
    :goto_1
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 105
    move-result-object v0

    .line 106
    .line 107
    new-instance v1, Lorg/json/JSONObject;

    .line 108
    .line 109
    .line 110
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 111
    .line 112
    const-string v2, "AdjResult"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 116
    .line 117
    .line 118
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    .line 126
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 127
    move-result-object p1

    .line 128
    .line 129
    const-string v2, "symbol"

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 133
    .line 134
    .line 135
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 140
    move-result p1

    .line 141
    .line 142
    .line 143
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    const-string v2, "isTrialFunds"

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 150
    .line 151
    const-string p1, "positionMode"

    .line 152
    .line 153
    .line 154
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->F5()Ljava/lang/String;

    .line 155
    move-result-object v2

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, p1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 159
    .line 160
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 161
    .line 162
    const-string p1, "AdjustLeverage"

    .line 163
    .line 164
    const-string v2, "7"

    .line 165
    .line 166
    .line 167
    invoke-static {v0, p1, v2, v1}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 168
    return-void
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
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method

.method private final b5()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "getViewLifecycleOwner(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    new-instance v2, Lcom/kubi/futures/trade/position/c2;

    .line 20
    .line 21
    .line 22
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/c2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 23
    .line 24
    new-instance v3, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;

    .line 25
    .line 26
    .line 27
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->w()Landroidx/lifecycle/MutableLiveData;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    new-instance v2, Lcom/kubi/futures/trade/position/n2;

    .line 41
    .line 42
    .line 43
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/n2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 44
    .line 45
    new-instance v3, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;

    .line 46
    .line 47
    .line 48
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->P4()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->Z()Landroidx/lifecycle/MutableLiveData;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    new-instance v2, Lcom/kubi/futures/trade/position/u2;

    .line 62
    .line 63
    .line 64
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/u2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 65
    .line 66
    new-instance v3, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;

    .line 67
    .line 68
    .line 69
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 73
    .line 74
    .line 75
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->V4()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 76
    move-result-object v1

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->a0()Landroidx/lifecycle/MutableLiveData;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    new-instance v2, Lcom/kubi/futures/trade/position/v2;

    .line 83
    .line 84
    .line 85
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/v2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 86
    .line 87
    new-instance v3, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;

    .line 88
    .line 89
    .line 90
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 97
    move-result-object v1

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    new-instance v2, Lcom/kubi/futures/trade/position/w2;

    .line 104
    .line 105
    .line 106
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/w2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 107
    .line 108
    new-instance v3, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;

    .line 109
    .line 110
    .line 111
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 118
    move-result-object v1

    .line 119
    .line 120
    .line 121
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->u()Landroidx/lifecycle/MutableLiveData;

    .line 122
    move-result-object v1

    .line 123
    .line 124
    new-instance v2, Lcom/kubi/futures/trade/position/x2;

    .line 125
    .line 126
    .line 127
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/x2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 128
    .line 129
    new-instance v3, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;

    .line 130
    .line 131
    .line 132
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->P4()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 139
    move-result-object v1

    .line 140
    .line 141
    .line 142
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->c0()Landroidx/lifecycle/MutableLiveData;

    .line 143
    move-result-object v1

    .line 144
    .line 145
    new-instance v2, Lcom/kubi/futures/trade/position/y2;

    .line 146
    .line 147
    .line 148
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/y2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 149
    .line 150
    new-instance v3, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;

    .line 151
    .line 152
    .line 153
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 157
    .line 158
    .line 159
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->V4()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 160
    move-result-object v1

    .line 161
    .line 162
    .line 163
    invoke-virtual {v1}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->d0()Landroidx/lifecycle/MutableLiveData;

    .line 164
    move-result-object v1

    .line 165
    .line 166
    new-instance v2, Lcom/kubi/futures/trade/position/z2;

    .line 167
    .line 168
    .line 169
    invoke-direct {v2, p0}, Lcom/kubi/futures/trade/position/z2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 170
    .line 171
    new-instance v3, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;

    .line 172
    .line 173
    .line 174
    invoke-direct {v3, v2}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 175
    .line 176
    .line 177
    invoke-virtual {v1, v0, v3}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 178
    .line 179
    .line 180
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->T4()Lcom/kubi/futures/trade/vm/u;

    .line 181
    move-result-object v0

    .line 182
    .line 183
    new-instance v1, Lcom/kubi/futures/trade/position/a3;

    .line 184
    .line 185
    .line 186
    invoke-direct {v1, p0}, Lcom/kubi/futures/trade/position/a3;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, v1}, Lcom/kubi/futures/trade/vm/u;->a(Landroidx/lifecycle/Observer;)V

    .line 190
    .line 191
    .line 192
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->T4()Lcom/kubi/futures/trade/vm/u;

    .line 193
    move-result-object v0

    .line 194
    .line 195
    new-instance v1, Lcom/kubi/futures/trade/position/b3;

    .line 196
    .line 197
    .line 198
    invoke-direct {v1, p0}, Lcom/kubi/futures/trade/position/b3;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 199
    .line 200
    .line 201
    invoke-virtual {v0, v1}, Lcom/kubi/futures/trade/vm/u;->E(Landroidx/lifecycle/Observer;)V

    .line 202
    .line 203
    .line 204
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->P4()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 205
    move-result-object v0

    .line 206
    .line 207
    .line 208
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 209
    move-result-object v1

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Lcom/kubi/futures/trade/position/vm/e2;->z(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->V4()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 216
    move-result-object v0

    .line 217
    .line 218
    .line 219
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 220
    move-result-object v1

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0, v1}, Lcom/kubi/futures/trade/position/vm/e2;->z(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 224
    return-void
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
.end method

.method public static final c5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->v5(Lcom/kubi/futures/trade/position/f3;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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

.method public static final d5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/kumex/data/trade/model/PositionEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->A5(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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

.method public static final e5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->y5(Lkotlin/Pair;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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

.method public static final f5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->a5(Lkotlin/Pair;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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

.method public static final g5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->a5(Lkotlin/Pair;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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

.method public static final h5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->z(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

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
.end method

.method public static final i5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;->getAvailableBalance()Ljava/math/BigDecimal;

    .line 13
    move-result-object p1

    .line 14
    .line 15
    .line 16
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->x(Ljava/math/BigDecimal;)V

    .line 21
    return-void
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

.method private final initView()V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Q4()Ldm/q0;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    iget-object v2, v1, Ldm/q0;->m:Landroidx/appcompat/widget/AppCompatImageView;

    .line 12
    .line 13
    const-string v3, "ivBack"

    .line 14
    .line 15
    .line 16
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 17
    .line 18
    new-instance v3, Lcom/kubi/futures/trade/position/k2;

    .line 19
    .line 20
    .line 21
    invoke-direct {v3, v0}, Lcom/kubi/futures/trade/position/k2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v2, v3}, Lcom/kubi/utils/extensions/core/ViewExtKt;->f(Landroid/view/View;Lkotlin/jvm/functions/Function1;)V

    .line 25
    .line 26
    iget-object v2, v1, Ldm/q0;->w:Lcom/kubi/resources/widget/BaseTextView;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->R4()Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 30
    move-result-object v3

    .line 31
    .line 32
    if-eqz v3, :cond_1

    .line 33
    .line 34
    sget-object v4, Lcom/kubi/futures/a;->a:Lcom/kubi/futures/a;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4, v3}, Lcom/kubi/futures/a;->e(Lcom/kubi/kumex/data/platform/model/ContractEntity;)Lcom/kubi/utils/v0;

    .line 38
    move-result-object v3

    .line 39
    .line 40
    if-eqz v3, :cond_1

    .line 41
    goto :goto_0

    .line 42
    .line 43
    .line 44
    :cond_1
    invoke-direct {v0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 45
    move-result-object v3

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 49
    move-result-object v3

    .line 50
    .line 51
    .line 52
    :goto_0
    invoke-virtual {v2, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 53
    .line 54
    iget-object v2, v1, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 55
    const/4 v3, 0x2

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v3}, Lcom/kubi/futures/view/ModifyLeverageInputView;->setPrecision(I)V

    .line 59
    .line 60
    iget-object v2, v1, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 61
    .line 62
    new-instance v3, Lcom/kubi/futures/trade/position/l2;

    .line 63
    .line 64
    .line 65
    invoke-direct {v3, v0}, Lcom/kubi/futures/trade/position/l2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v2, v3}, Lcom/kubi/futures/view/ModifyLeverageInputView;->setOnValueChangedListener(Lkotlin/jvm/functions/Function1;)V

    .line 69
    .line 70
    iget-object v2, v1, Ldm/q0;->u:Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;

    .line 71
    .line 72
    .line 73
    invoke-direct {v0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->R4()Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 74
    move-result-object v3

    .line 75
    const/4 v4, 0x1

    .line 76
    .line 77
    .line 78
    invoke-static {v3, v4}, Lfm/b;->d(Lcom/kubi/kumex/data/platform/model/ContractEntity;Z)I

    .line 79
    move-result v3

    .line 80
    int-to-float v3, v3

    .line 81
    .line 82
    new-instance v5, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$a;

    .line 83
    .line 84
    .line 85
    invoke-direct {v5}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$a;-><init>()V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v2, v5}, Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;->setProgressFormatCallback(Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$a;)V

    .line 89
    .line 90
    new-instance v5, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$b;

    .line 91
    .line 92
    .line 93
    invoke-direct {v5}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$b;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v5}, Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;->setSectionTextFormatCallback(Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$b;)V

    .line 97
    const/4 v5, 0x0

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, v5}, Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;->setMin(F)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;->setMax(F)V

    .line 104
    .line 105
    const/high16 v6, 0x40800000    # 4.0f

    .line 106
    rem-float/2addr v3, v6

    .line 107
    .line 108
    cmpg-float v3, v3, v5

    .line 109
    .line 110
    if-nez v3, :cond_2

    .line 111
    const/4 v3, 0x4

    .line 112
    goto :goto_1

    .line 113
    :cond_2
    const/4 v3, 0x5

    .line 114
    .line 115
    .line 116
    :goto_1
    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;->setSectionCount(I)V

    .line 117
    .line 118
    iget-object v2, v1, Ldm/q0;->u:Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;

    .line 119
    .line 120
    new-instance v3, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$c;

    .line 121
    .line 122
    .line 123
    invoke-direct {v3, v1, v0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog$c;-><init>(Ldm/q0;Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;->setOnSimpleProgressChangedListener(Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar$d;)V

    .line 127
    .line 128
    iget-object v2, v1, Ldm/q0;->n:Lcom/kubi/resources/widget/DashTextView;

    .line 129
    .line 130
    .line 131
    invoke-virtual {v2, v4}, Lcom/kubi/resources/widget/DashTextView;->setNeedDash(Z)V

    .line 132
    .line 133
    iget-object v5, v1, Ldm/q0;->n:Lcom/kubi/resources/widget/DashTextView;

    .line 134
    .line 135
    const-string v2, "leverage"

    .line 136
    .line 137
    .line 138
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 139
    .line 140
    new-instance v8, Lcom/kubi/futures/trade/position/m2;

    .line 141
    .line 142
    .line 143
    invoke-direct {v8, v0}, Lcom/kubi/futures/trade/position/m2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 144
    const/4 v9, 0x1

    .line 145
    const/4 v10, 0x0

    .line 146
    .line 147
    const-wide/16 v6, 0x0

    .line 148
    .line 149
    .line 150
    invoke-static/range {v5 .. v10}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 151
    .line 152
    iget-object v11, v1, Ldm/q0;->y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 153
    .line 154
    const-string v2, "tvConfirm"

    .line 155
    .line 156
    .line 157
    invoke-static {v11, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 158
    .line 159
    new-instance v14, Lcom/kubi/futures/trade/position/o2;

    .line 160
    .line 161
    .line 162
    invoke-direct {v14, v0}, Lcom/kubi/futures/trade/position/o2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 163
    const/4 v15, 0x1

    .line 164
    .line 165
    const/16 v16, 0x0

    .line 166
    .line 167
    const-wide/16 v12, 0x0

    .line 168
    .line 169
    .line 170
    invoke-static/range {v11 .. v16}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 171
    .line 172
    iget-object v2, v1, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 173
    .line 174
    new-instance v3, Lcom/kubi/futures/trade/position/p2;

    .line 175
    .line 176
    .line 177
    invoke-direct {v3, v0}, Lcom/kubi/futures/trade/position/p2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 178
    .line 179
    .line 180
    invoke-virtual {v2, v3}, Lcom/kubi/futures/view/ModifyLeverageInputView;->setPlusListener(Lkotlin/jvm/functions/Function0;)V

    .line 181
    .line 182
    iget-object v2, v1, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 183
    .line 184
    new-instance v3, Lcom/kubi/futures/trade/position/q2;

    .line 185
    .line 186
    .line 187
    invoke-direct {v3, v0}, Lcom/kubi/futures/trade/position/q2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 188
    .line 189
    .line 190
    invoke-virtual {v2, v3}, Lcom/kubi/futures/view/ModifyLeverageInputView;->setSubListener(Lkotlin/jvm/functions/Function0;)V

    .line 191
    .line 192
    iget-object v2, v1, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 193
    .line 194
    new-instance v3, Lcom/kubi/futures/trade/position/r2;

    .line 195
    .line 196
    .line 197
    invoke-direct {v3, v0}, Lcom/kubi/futures/trade/position/r2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v2, v3}, Lcom/kubi/futures/view/ModifyLeverageInputView;->setOnFocusChangeListener(Lkotlin/jvm/functions/Function1;)V

    .line 201
    .line 202
    iget-object v2, v1, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 203
    .line 204
    new-instance v3, Lcom/kubi/futures/trade/position/s2;

    .line 205
    .line 206
    .line 207
    invoke-direct {v3, v0}, Lcom/kubi/futures/trade/position/s2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 208
    .line 209
    .line 210
    invoke-virtual {v2, v3}, Lcom/kubi/futures/view/ModifyLeverageInputView;->setLimitRangeListener(Lkotlin/jvm/functions/Function2;)V

    .line 211
    .line 212
    iget-object v4, v1, Ldm/q0;->k:Lcom/kubi/resources/widget/BaseTextView;

    .line 213
    .line 214
    .line 215
    invoke-virtual {v4}, Landroid/widget/TextView;->getPaintFlags()I

    .line 216
    move-result v1

    .line 217
    .line 218
    or-int/lit8 v1, v1, 0x8

    .line 219
    .line 220
    .line 221
    invoke-virtual {v4, v1}, Landroid/widget/TextView;->setPaintFlags(I)V

    .line 222
    .line 223
    .line 224
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 225
    .line 226
    new-instance v7, Lcom/kubi/futures/trade/position/t2;

    .line 227
    .line 228
    .line 229
    invoke-direct {v7, v0}, Lcom/kubi/futures/trade/position/t2;-><init>(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)V

    .line 230
    const/4 v8, 0x1

    .line 231
    const/4 v9, 0x0

    .line 232
    .line 233
    const-wide/16 v5, 0x0

    .line 234
    .line 235
    .line 236
    invoke-static/range {v4 .. v9}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 237
    return-void
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
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
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
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
    .line 1292
    .line 1293
    .line 1294
    .line 1295
    .line 1296
    .line 1297
    .line 1298
    .line 1299
    .line 1300
    .line 1301
    .line 1302
    .line 1303
    .line 1304
    .line 1305
    .line 1306
    .line 1307
    .line 1308
    .line 1309
    .line 1310
    .line 1311
    .line 1312
    .line 1313
    .line 1314
    .line 1315
    .line 1316
    .line 1317
    .line 1318
    .line 1319
    .line 1320
    .line 1321
    .line 1322
    .line 1323
    .line 1324
    .line 1325
    .line 1326
    .line 1327
    .line 1328
    .line 1329
    .line 1330
    .line 1331
    .line 1332
    .line 1333
    .line 1334
    .line 1335
    .line 1336
    .line 1337
    .line 1338
    .line 1339
    .line 1340
    .line 1341
    .line 1342
    .line 1343
    .line 1344
    .line 1345
    .line 1346
    .line 1347
    .line 1348
    .line 1349
    .line 1350
.end method

.method public static synthetic j4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->K4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

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

.method public static final j5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->w5(Lcom/kubi/futures/trade/position/f3;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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

.method public static synthetic k4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->l5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;

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
.end method

.method public static final k5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->z5(Ljava/math/BigDecimal;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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

.method public static synthetic l4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Landroid/view/View;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->m5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Landroid/view/View;)Lkotlin/Unit;

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
.end method

.method public static final l5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->v5(Lcom/kubi/futures/trade/position/f3;)V

    .line 7
    .line 8
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 9
    return-object p0
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

.method public static synthetic m4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->j5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;

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
.end method

.method public static final m5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Landroid/view/View;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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

.method public static synthetic n4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->n5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Ljava/math/BigDecimal;)Lkotlin/Unit;

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
.end method

.method public static final n5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->x5(Ljava/math/BigDecimal;)V

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0
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

.method public static synthetic o4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->o5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;

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

.method public static final o5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lorg/json/JSONObject;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 17
    move-result v2

    .line 18
    .line 19
    .line 20
    invoke-static {v2}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    const-string v3, "isTrialFunds"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    const-string v2, "AdjustLeverage"

    .line 30
    .line 31
    const-string v3, "5"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v2, v3, v1}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->D5()V

    .line 38
    .line 39
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 40
    return-object p0
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
.end method

.method public static synthetic p4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->H5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

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

.method public static final p5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Y4()V

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

.method public static synthetic q4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->r5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;

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

.method public static final q5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lorg/json/JSONObject;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 17
    move-result p0

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    const-string v2, "isTrialFunds"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    move-result-object p0

    .line 28
    .line 29
    const-string v1, "AdjustLeverage"

    .line 30
    .line 31
    const-string v2, "2"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v2, p0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 37
    return-object p0
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
.end method

.method public static synthetic r4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->e5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lkotlin/Pair;)Lkotlin/Unit;

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
.end method

.method public static final r5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lorg/json/JSONObject;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 13
    move-result-object p0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 17
    move-result p0

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    const-string v2, "isTrialFunds"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 27
    move-result-object p0

    .line 28
    .line 29
    const-string v1, "AdjustLeverage"

    .line 30
    .line 31
    const-string v2, "3"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v2, p0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 35
    .line 36
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 37
    return-object p0
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
.end method

.method public static synthetic s4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->C5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

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

.method public static final s5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Z)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    new-instance v0, Lorg/json/JSONObject;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 15
    move-result-object p0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 19
    move-result p0

    .line 20
    .line 21
    .line 22
    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 23
    move-result-object p0

    .line 24
    .line 25
    const-string v1, "isTrialFunds"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 29
    move-result-object p0

    .line 30
    .line 31
    const-string v0, "AdjustLeverage"

    .line 32
    .line 33
    const-string v1, "1"

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v0, v1, p0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 37
    .line 38
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 39
    return-object p0
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

.method private final showError(Ljava/lang/String;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Q4()Ldm/q0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    const-string v1, "error"

    .line 10
    .line 11
    if-eqz p1, :cond_2

    .line 12
    .line 13
    .line 14
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 15
    move-result v2

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    :cond_1
    iget-object v2, v0, Ldm/q0;->y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 21
    const/4 v3, 0x0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v3}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 25
    .line 26
    iget-object v2, v0, Ldm/q0;->j:Lcom/kubi/resources/widget/AlignTopTextView;

    .line 27
    .line 28
    .line 29
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-static {v2}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 33
    .line 34
    iget-object v0, v0, Ldm/q0;->j:Lcom/kubi/resources/widget/AlignTopTextView;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 38
    return-void

    .line 39
    .line 40
    :cond_2
    :goto_0
    iget-object p1, v0, Ldm/q0;->j:Lcom/kubi/resources/widget/AlignTopTextView;

    .line 41
    .line 42
    .line 43
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 44
    .line 45
    .line 46
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 47
    .line 48
    iget-object p1, v0, Ldm/q0;->y:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 49
    const/4 v0, 0x1

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/button/BaseAnimatedButton;->setEnabled(Z)V

    .line 53
    return-void
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
.end method

.method public static synthetic t4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->i5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/kumex/data/assets/model/SimpleBalanceEntity;)V

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
.end method

.method public static final t5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Ljava/math/BigDecimal;Ljava/math/BigDecimal;)Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    const-string v0, "min"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "max"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 14
    move-result v0

    .line 15
    .line 16
    if-ltz v0, :cond_0

    .line 17
    .line 18
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 19
    return-object p0

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    move-result-wide v0

    .line 24
    .line 25
    iget-wide v2, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->z0:J

    .line 26
    sub-long/2addr v0, v2

    .line 27
    .line 28
    const-wide/16 v2, 0xbb8

    .line 29
    .line 30
    cmp-long v0, v0, v2

    .line 31
    .line 32
    if-lez v0, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 36
    move-result-wide v0

    .line 37
    .line 38
    iput-wide v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->z0:J

    .line 39
    .line 40
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 41
    .line 42
    sget v1, Lcom/kubi/kumex/R$string;->kumex_modify_leverage_adjust_range:I

    .line 43
    .line 44
    new-instance v2, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->N4(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string p1, " - "

    .line 57
    .line 58
    .line 59
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, p2}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->N4(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    move-result-object p1

    .line 71
    .line 72
    .line 73
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 74
    move-result-object p1

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1, p1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 78
    move-result-object p1

    .line 79
    const/4 p2, 0x0

    .line 80
    .line 81
    new-array p2, p2, [Ljava/lang/Object;

    .line 82
    .line 83
    .line 84
    invoke-static {p1, p2}, Lcom/kubi/utils/ToastCompat;->G(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 85
    .line 86
    .line 87
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 88
    move-result-object p1

    .line 89
    .line 90
    new-instance p2, Lorg/json/JSONObject;

    .line 91
    .line 92
    .line 93
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 94
    .line 95
    .line 96
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 97
    move-result-object p0

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 101
    move-result p0

    .line 102
    .line 103
    .line 104
    invoke-static {p0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 105
    move-result-object p0

    .line 106
    .line 107
    const-string v0, "isTrialFunds"

    .line 108
    .line 109
    .line 110
    invoke-virtual {p2, v0, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 111
    move-result-object p0

    .line 112
    .line 113
    const-string p2, "AdjustLeverage"

    .line 114
    .line 115
    const-string v0, "8"

    .line 116
    .line 117
    .line 118
    invoke-static {p1, p2, v0, p0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 119
    .line 120
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 121
    return-object p0
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

.method public static synthetic u4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/futures/trade/vm/u;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->O4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/futures/trade/vm/u;

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

.method public static final u5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/futures/trade/position/IsolatedPositionLeverageDescDialog;->q0:Lcom/kubi/futures/trade/position/IsolatedPositionLeverageDescDialog$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    const-string v1, "getChildFragmentManager(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p0}, Lcom/kubi/futures/trade/position/IsolatedPositionLeverageDescDialog$Companion;->show(Landroidx/fragment/app/FragmentManager;)V

    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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

.method public static synthetic v4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->c5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/futures/trade/position/f3;)Lkotlin/Unit;

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
.end method

.method private final v5(Lcom/kubi/futures/trade/position/f3;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Q4()Ldm/q0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    sget v1, Lcom/kubi/kumex/R$string;->stub:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->W4(I)Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/f3;->d()Ljava/lang/String;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 21
    move-result v1

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 26
    .line 27
    sget v2, Lcom/kubi/kumex/R$color;->c_text30:I

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 31
    move-result v1

    .line 32
    goto :goto_0

    .line 33
    .line 34
    :cond_1
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 35
    .line 36
    sget v2, Lcom/kubi/kumex/R$color;->c_text:I

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 40
    move-result v1

    .line 41
    .line 42
    :goto_0
    iget-object v2, v0, Ldm/q0;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 43
    .line 44
    .line 45
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 46
    .line 47
    iget-object v2, v0, Ldm/q0;->o:Lcom/kubi/resources/widget/BaseTextView;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 51
    .line 52
    iget-object v2, v0, Ldm/q0;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 56
    .line 57
    iget-object v1, v0, Ldm/q0;->r:Lcom/kubi/resources/widget/BaseTextView;

    .line 58
    .line 59
    .line 60
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/f3;->d()Ljava/lang/String;

    .line 61
    move-result-object v2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 65
    .line 66
    iget-object v1, v0, Ldm/q0;->o:Lcom/kubi/resources/widget/BaseTextView;

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/f3;->c()Ljava/lang/String;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 74
    .line 75
    iget-object v0, v0, Ldm/q0;->g:Lcom/kubi/resources/widget/BaseTextView;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/f3;->a()Ljava/lang/String;

    .line 79
    move-result-object p1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 83
    return-void
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
.end method

.method public static synthetic w4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lkotlin/Pair;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->g5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lkotlin/Pair;)Lkotlin/Unit;

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
.end method

.method private final w5(Lcom/kubi/futures/trade/position/f3;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Q4()Ldm/q0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 10
    .line 11
    sget v2, Lcom/kubi/kumex/R$color;->c_text:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1, v2}, Lcom/kubi/utils/c;->a(I)I

    .line 15
    move-result v1

    .line 16
    .line 17
    iget-object v2, v0, Ldm/q0;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 21
    .line 22
    iget-object v2, v0, Ldm/q0;->p:Lcom/kubi/resources/widget/BaseTextView;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 26
    .line 27
    iget-object v2, v0, Ldm/q0;->h:Lcom/kubi/resources/widget/BaseTextView;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2, v1}, Landroid/widget/TextView;->setTextColor(I)V

    .line 31
    .line 32
    iget-object v1, v0, Ldm/q0;->s:Lcom/kubi/resources/widget/BaseTextView;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/f3;->d()Ljava/lang/String;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 40
    .line 41
    iget-object v1, v0, Ldm/q0;->p:Lcom/kubi/resources/widget/BaseTextView;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/f3;->c()Ljava/lang/String;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v2}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 49
    .line 50
    iget-object v0, v0, Ldm/q0;->h:Lcom/kubi/resources/widget/BaseTextView;

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/f3;->a()Ljava/lang/String;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 58
    return-void
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
.end method

.method public static synthetic x4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/kumex/data/trade/model/PositionEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->B5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lcom/kubi/kumex/data/trade/model/PositionEntity;

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

.method private final x5(Ljava/math/BigDecimal;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Q4()Ldm/q0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 11
    move-result-object p1

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    .line 15
    invoke-direct {p0, v1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->showError(Ljava/lang/String;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Z4(Ljava/math/BigDecimal;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->E5(Ljava/math/BigDecimal;)V

    .line 22
    .line 23
    iget-object v0, v0, Ldm/q0;->u:Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Ljava/math/BigDecimal;->floatValue()F

    .line 27
    move-result p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/bubbleseekbar/KcSeekBar;->setProgress(F)V

    .line 31
    return-void
    .line 32
.end method

.method public static synthetic y4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/kumex/data/trade/model/PositionEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->d5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;Lcom/kubi/kumex/data/trade/model/PositionEntity;)Lkotlin/Unit;

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
.end method

.method public static synthetic z4(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->p5(Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;)Lkotlin/Unit;

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


# virtual methods
.method public final A5(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Q4()Ldm/q0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object v1, v0, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/kubi/futures/view/ModifyLeverageInputView;->getValue()Ljava/math/BigDecimal;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    iget-boolean v2, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->A0:Z

    .line 16
    .line 17
    if-nez v2, :cond_1

    .line 18
    const/4 v1, 0x1

    .line 19
    .line 20
    iput-boolean v1, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->A0:Z

    .line 21
    .line 22
    iget-object v1, v0, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getRealLeverage()Ljava/math/BigDecimal;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v1, v2}, Lcom/kubi/futures/view/ModifyLeverageInputView;->setValue(Ljava/math/BigDecimal;)V

    .line 34
    goto :goto_0

    .line 35
    .line 36
    .line 37
    :cond_1
    invoke-static {v1}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Z4(Ljava/math/BigDecimal;)V

    .line 42
    .line 43
    :goto_0
    iget-object v1, v0, Ldm/q0;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 44
    .line 45
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 46
    .line 47
    sget v3, Lcom/kubi/kumex/R$string;->kumex_modify_leverage_current_leverage:I

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getRealLeverage()Ljava/math/BigDecimal;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    .line 54
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->N4(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 59
    move-result-object p1

    .line 60
    .line 61
    .line 62
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 63
    move-result-object p1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2, v3, p1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 71
    .line 72
    sget-object p1, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 73
    .line 74
    iget-object v0, v0, Ldm/q0;->f:Lcom/kubi/resources/widget/BaseTextView;

    .line 75
    .line 76
    const-string v1, "currentLeverage"

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    new-instance v1, Lkotlin/Pair;

    .line 82
    .line 83
    sget-object v3, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 84
    .line 85
    new-instance v4, Landroid/text/style/ForegroundColorSpan;

    .line 86
    .line 87
    sget v5, Lcom/kubi/kumex/R$color;->c_text:I

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v5}, Lcom/kubi/utils/c;->a(I)I

    .line 91
    move-result v2

    .line 92
    .line 93
    .line 94
    invoke-direct {v4, v2}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 95
    .line 96
    .line 97
    invoke-direct {v1, v3, v4}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    filled-new-array {v1}, [Lkotlin/Pair;

    .line 101
    move-result-object v1

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1, v0, v1}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 105
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
.end method

.method public final D5()V
    .locals 4

    .line 1
    .line 2
    sget v0, Lcom/kubi/kumex/R$string;->kumex_modify_leverage_adjust_title:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/kumex/R$string;->kumex_modify_leverage_adjust_desc:I

    .line 5
    const/4 v2, 0x0

    .line 6
    const/4 v3, 0x4

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1, v2, v3, v2}, Lcom/kubi/kumex/dialog/u;->J(IILkotlin/jvm/functions/Function0;ILjava/lang/Object;)Lcom/kubi/resources/dialog/BaseDialogFragment;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    const-string v2, "getChildFragmentManager(...)"

    .line 17
    .line 18
    .line 19
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    const-string v2, "kumex_modify_leverage_adjust_title"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
.end method

.method public final E5(Ljava/math/BigDecimal;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Q4()Ldm/q0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    sget-object v1, Ljava/math/BigDecimal;->TEN:Ljava/math/BigDecimal;

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 13
    move-result p1

    .line 14
    .line 15
    const-string v1, "warning"

    .line 16
    .line 17
    if-ltz p1, :cond_1

    .line 18
    .line 19
    iget-object p1, v0, Ldm/q0;->z:Lcom/kubi/resources/widget/AlignTopTextView;

    .line 20
    .line 21
    .line 22
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lcom/kubi/utils/extensions/k;->H(Landroid/view/View;)V

    .line 26
    return-void

    .line 27
    .line 28
    :cond_1
    iget-object p1, v0, Ldm/q0;->z:Lcom/kubi/resources/widget/AlignTopTextView;

    .line 29
    .line 30
    .line 31
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 35
    return-void
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
.end method

.method public final G5(Ljava/math/BigDecimal;)V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lorg/json/JSONObject;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 13
    move-result-object v2

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->t()Landroidx/lifecycle/MutableLiveData;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    check-cast v2, Lcom/kubi/futures/trade/position/f3;

    .line 24
    .line 25
    sget-object v3, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 29
    move-result p1

    .line 30
    .line 31
    if-lez p1, :cond_0

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->P4()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->Z()Landroidx/lifecycle/MutableLiveData;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    check-cast p1, Lcom/kubi/futures/trade/position/f3;

    .line 46
    goto :goto_0

    .line 47
    .line 48
    .line 49
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->V4()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 50
    move-result-object p1

    .line 51
    .line 52
    .line 53
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->a0()Landroidx/lifecycle/MutableLiveData;

    .line 54
    move-result-object p1

    .line 55
    .line 56
    .line 57
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 58
    move-result-object p1

    .line 59
    .line 60
    check-cast p1, Lcom/kubi/futures/trade/position/f3;

    .line 61
    :goto_0
    const/4 v3, 0x0

    .line 62
    .line 63
    if-eqz v2, :cond_1

    .line 64
    .line 65
    .line 66
    invoke-virtual {v2}, Lcom/kubi/futures/trade/position/f3;->a()Ljava/lang/String;

    .line 67
    move-result-object v4

    .line 68
    goto :goto_1

    .line 69
    :cond_1
    move-object v4, v3

    .line 70
    .line 71
    .line 72
    :goto_1
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 73
    move-result-object v4

    .line 74
    .line 75
    const-string v5, "openPrice1"

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 79
    .line 80
    if-eqz p1, :cond_2

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/f3;->a()Ljava/lang/String;

    .line 84
    move-result-object v4

    .line 85
    goto :goto_2

    .line 86
    :cond_2
    move-object v4, v3

    .line 87
    .line 88
    .line 89
    :goto_2
    invoke-static {v4}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 90
    move-result-object v4

    .line 91
    .line 92
    const-string v5, "openPrice2"

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v5, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    .line 97
    if-eqz v2, :cond_3

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2}, Lcom/kubi/futures/trade/position/f3;->c()Ljava/lang/String;

    .line 101
    move-result-object v2

    .line 102
    goto :goto_3

    .line 103
    :cond_3
    move-object v2, v3

    .line 104
    .line 105
    .line 106
    :goto_3
    invoke-static {v2}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 107
    move-result-object v2

    .line 108
    .line 109
    const-string v4, "liqPrice1"

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v4, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    .line 114
    if-eqz p1, :cond_4

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/f3;->c()Ljava/lang/String;

    .line 118
    move-result-object p1

    .line 119
    goto :goto_4

    .line 120
    :cond_4
    move-object p1, v3

    .line 121
    .line 122
    .line 123
    :goto_4
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 124
    move-result-object p1

    .line 125
    .line 126
    const-string v2, "liqPrice2"

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 130
    .line 131
    .line 132
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Q4()Ldm/q0;

    .line 133
    move-result-object p1

    .line 134
    .line 135
    if-eqz p1, :cond_5

    .line 136
    .line 137
    iget-object p1, p1, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 138
    .line 139
    if-eqz p1, :cond_5

    .line 140
    .line 141
    .line 142
    invoke-virtual {p1}, Lcom/kubi/futures/view/ModifyLeverageInputView;->getValue()Ljava/math/BigDecimal;

    .line 143
    move-result-object p1

    .line 144
    .line 145
    if-eqz p1, :cond_5

    .line 146
    .line 147
    .line 148
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 149
    move-result-object p1

    .line 150
    .line 151
    if-eqz p1, :cond_5

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 155
    move-result-object p1

    .line 156
    goto :goto_5

    .line 157
    :cond_5
    move-object p1, v3

    .line 158
    .line 159
    .line 160
    :goto_5
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 161
    move-result-object p1

    .line 162
    .line 163
    const-string v2, "chooseLev"

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 167
    .line 168
    .line 169
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 170
    move-result-object p1

    .line 171
    .line 172
    .line 173
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 174
    move-result-object p1

    .line 175
    .line 176
    .line 177
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 178
    move-result-object p1

    .line 179
    .line 180
    check-cast p1, Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 181
    .line 182
    if-eqz p1, :cond_6

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getRealLeverage()Ljava/math/BigDecimal;

    .line 186
    move-result-object p1

    .line 187
    .line 188
    if-eqz p1, :cond_6

    .line 189
    .line 190
    .line 191
    invoke-static {p1}, Lcom/fasterxml/jackson/databind/node/a;->a(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 192
    move-result-object p1

    .line 193
    .line 194
    if-eqz p1, :cond_6

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 198
    move-result-object v3

    .line 199
    .line 200
    .line 201
    :cond_6
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 202
    move-result-object p1

    .line 203
    .line 204
    const-string v2, "currentLev"

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 208
    .line 209
    .line 210
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 211
    move-result-object p1

    .line 212
    .line 213
    .line 214
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 215
    move-result-object p1

    .line 216
    .line 217
    .line 218
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 219
    move-result-object p1

    .line 220
    .line 221
    const-string v2, "symbol"

    .line 222
    .line 223
    .line 224
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 225
    .line 226
    .line 227
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 228
    move-result-object p1

    .line 229
    .line 230
    .line 231
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 232
    move-result p1

    .line 233
    .line 234
    .line 235
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 236
    move-result-object p1

    .line 237
    .line 238
    const-string v2, "isTrialFunds"

    .line 239
    .line 240
    .line 241
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 242
    .line 243
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 244
    .line 245
    const-string p1, "AdjustLeverage"

    .line 246
    .line 247
    const-string v2, "6"

    .line 248
    .line 249
    .line 250
    invoke-static {v0, p1, v2, v1}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 251
    return-void
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
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method

.method public N3()I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x8

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

.method public final N4(Ljava/math/BigDecimal;)Ljava/lang/String;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v2, v0, v1}, Lcom/kubi/kumex/utils/k0;->d(Ljava/math/BigDecimal;ZILjava/lang/Object;)Ljava/lang/String;

    .line 7
    move-result-object p1

    .line 8
    return-object p1
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

.method public final P4()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->s0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

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

.method public final Q4()Ldm/q0;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->q0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->C0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Ldm/q0;

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

.method public final S4()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->x0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Number;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    .line 12
    move-result v0

    .line 13
    return v0
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

.method public final V4()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->t0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

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

.method public final W4(I)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    new-array v1, v1, [Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    return-object p1
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

.method public final X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->r0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

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

.method public final Z4(Ljava/math/BigDecimal;)V
    .locals 13

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->u()Landroidx/lifecycle/MutableLiveData;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    check-cast v0, Lkotlin/Pair;

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    if-eqz v0, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    check-cast v0, Ljava/math/BigDecimal;

    .line 24
    move-object v2, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move-object v2, v1

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->u()Landroidx/lifecycle/MutableLiveData;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    check-cast v0, Lkotlin/Pair;

    .line 41
    .line 42
    if-eqz v0, :cond_1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    check-cast v0, Ljava/math/BigDecimal;

    .line 49
    move-object v3, v0

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    move-object v3, v1

    .line 52
    .line 53
    :goto_1
    if-eqz v2, :cond_2

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 57
    move-result v0

    .line 58
    .line 59
    if-gez v0, :cond_2

    .line 60
    .line 61
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 62
    .line 63
    sget v0, Lcom/kubi/kumex/R$string;->kumex_modify_leverage_min_tips:I

    .line 64
    .line 65
    const/16 v10, 0x7b

    .line 66
    const/4 v11, 0x0

    .line 67
    const/4 v3, 0x0

    .line 68
    const/4 v4, 0x0

    .line 69
    const/4 v5, 0x1

    .line 70
    const/4 v6, 0x0

    .line 71
    const/4 v7, 0x0

    .line 72
    const/4 v8, 0x0

    .line 73
    const/4 v9, 0x0

    .line 74
    .line 75
    .line 76
    invoke-static/range {v2 .. v11}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    .line 80
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 81
    move-result-object v1

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    invoke-direct {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->showError(Ljava/lang/String;)V

    .line 89
    return-void

    .line 90
    .line 91
    :cond_2
    if-eqz v3, :cond_3

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, v3}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 95
    move-result v0

    .line 96
    .line 97
    if-lez v0, :cond_3

    .line 98
    .line 99
    sget-object p1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 100
    .line 101
    sget v0, Lcom/kubi/kumex/R$string;->kumex_modify_leverage_max_tips:I

    .line 102
    .line 103
    const/16 v11, 0x7b

    .line 104
    const/4 v12, 0x0

    .line 105
    const/4 v4, 0x0

    .line 106
    const/4 v5, 0x0

    .line 107
    const/4 v6, 0x1

    .line 108
    const/4 v7, 0x0

    .line 109
    const/4 v8, 0x0

    .line 110
    const/4 v9, 0x0

    .line 111
    const/4 v10, 0x0

    .line 112
    .line 113
    .line 114
    invoke-static/range {v3 .. v12}, Llf/b;->e(Ljava/math/BigDecimal;Ljava/math/RoundingMode;IZZZILjava/util/Locale;ILjava/lang/Object;)Ljava/lang/String;

    .line 115
    move-result-object v1

    .line 116
    .line 117
    .line 118
    filled-new-array {v1}, [Ljava/lang/Object;

    .line 119
    move-result-object v1

    .line 120
    .line 121
    .line 122
    invoke-virtual {p1, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 123
    move-result-object p1

    .line 124
    .line 125
    .line 126
    invoke-direct {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->showError(Ljava/lang/String;)V

    .line 127
    return-void

    .line 128
    .line 129
    .line 130
    :cond_3
    invoke-direct {p0, v1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->showError(Ljava/lang/String;)V

    .line 131
    .line 132
    .line 133
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 134
    move-result-object v0

    .line 135
    .line 136
    .line 137
    invoke-virtual {v0, p1}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->y(Ljava/math/BigDecimal;)V

    .line 138
    return-void
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
    const p3, 0x3f733333    # 0.95f

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p3}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->d4(F)V

    .line 12
    .line 13
    sget p3, Lcom/kubi/kumex/R$layout;->bkumex_dialog_position_leverage:I

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

.method public onResume()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/resources/dialog/BaseDialogFragment;->onResume()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getSymbol()Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 27
    move-result v2

    .line 28
    .line 29
    .line 30
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    .line 34
    invoke-virtual {v3}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getPositionSide()Ljava/lang/String;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1, v2, v3}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->s(Ljava/lang/String;ZLjava/lang/String;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Q4()Ldm/q0;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    if-eqz v0, :cond_0

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ldm/q0;->b()Landroidx/constraintlayout/widget/ConstraintLayout;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    if-eqz v0, :cond_0

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Landroidx/constraintlayout/widget/ConstraintLayout;->requestLayout()V

    .line 58
    :cond_0
    return-void
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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 2
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
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2}, Lcom/kubi/resources/dialog/BaseDialogFragment;->onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lcom/blankj/utilcode/util/e0;->a()I

    .line 12
    move-result p2

    .line 13
    int-to-float p2, p2

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->M3()F

    .line 17
    move-result v0

    .line 18
    mul-float/2addr p2, v0

    .line 19
    float-to-int p2, p2

    .line 20
    .line 21
    .line 22
    invoke-static {p1, p2}, Lcom/kubi/utils/extensions/core/ViewExtKt;->i(Landroid/view/View;I)Landroid/view/View;

    .line 23
    .line 24
    .line 25
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    new-instance p2, Lorg/json/JSONObject;

    .line 29
    .line 30
    .line 31
    invoke-direct {p2}, Lorg/json/JSONObject;-><init>()V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 39
    move-result v0

    .line 40
    .line 41
    .line 42
    invoke-static {v0}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    const-string v1, "isTrialFunds"

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 49
    move-result-object p2

    .line 50
    .line 51
    const-string v0, "AdjustLeverage"

    .line 52
    .line 53
    const-string v1, "1"

    .line 54
    .line 55
    .line 56
    invoke-static {p1, v0, v1, p2}, Lqq/m;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 57
    .line 58
    .line 59
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->T4()Lcom/kubi/futures/trade/vm/u;

    .line 60
    move-result-object p1

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1}, Lcom/kubi/futures/trade/vm/u;->b()V

    .line 64
    .line 65
    .line 66
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->initView()V

    .line 67
    .line 68
    .line 69
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->b5()V

    .line 70
    return-void
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

.method public final y5(Lkotlin/Pair;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/Pair<",
            "+",
            "Ljava/math/BigDecimal;",
            "+",
            "Ljava/math/BigDecimal;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->Q4()Ldm/q0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    goto/16 :goto_2

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    check-cast v1, Ljava/math/BigDecimal;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    check-cast v2, Ljava/math/BigDecimal;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 24
    move-result v1

    .line 25
    const/4 v2, 0x1

    .line 26
    .line 27
    if-ltz v1, :cond_2

    .line 28
    .line 29
    iget-object p1, v0, Ldm/q0;->n:Lcom/kubi/resources/widget/DashTextView;

    .line 30
    .line 31
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 32
    .line 33
    sget v3, Lcom/kubi/kumex/R$string;->kumex_modify_leverage_invaild:I

    .line 34
    const/4 v4, 0x0

    .line 35
    .line 36
    new-array v5, v4, [Ljava/lang/Object;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1, v3, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 47
    move-result-object p1

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 51
    move-result-object p1

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    check-cast p1, Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    .line 61
    .line 62
    invoke-virtual {p1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getRealLeverage()Ljava/math/BigDecimal;

    .line 63
    move-result-object p1

    .line 64
    goto :goto_0

    .line 65
    :cond_1
    const/4 p1, 0x0

    .line 66
    .line 67
    .line 68
    :goto_0
    invoke-static {p1}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 69
    move-result-object p1

    .line 70
    .line 71
    iget-object v1, v0, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1, p1}, Lcom/kubi/futures/view/ModifyLeverageInputView;->setMin(Ljava/math/BigDecimal;)V

    .line 75
    .line 76
    iget-object v1, v0, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, p1}, Lcom/kubi/futures/view/ModifyLeverageInputView;->setMax(Ljava/math/BigDecimal;)V

    .line 80
    .line 81
    iget-object p1, v0, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v4}, Lcom/kubi/futures/view/ModifyLeverageInputView;->setSubAndPlusEnabled(Z)V

    .line 85
    .line 86
    iget-boolean p1, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->y0:Z

    .line 87
    .line 88
    if-nez p1, :cond_4

    .line 89
    .line 90
    iput-boolean v2, p0, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->y0:Z

    .line 91
    .line 92
    .line 93
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 94
    move-result-object p1

    .line 95
    .line 96
    new-instance v0, Lorg/json/JSONObject;

    .line 97
    .line 98
    .line 99
    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 100
    .line 101
    .line 102
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->U4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 103
    move-result-object v1

    .line 104
    .line 105
    .line 106
    invoke-virtual {v1}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->isTrialFunds()Z

    .line 107
    move-result v1

    .line 108
    .line 109
    .line 110
    invoke-static {v1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 111
    move-result-object v1

    .line 112
    .line 113
    const-string v2, "isTrialFunds"

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 117
    move-result-object v0

    .line 118
    .line 119
    const-string v1, "AdjustLeverage"

    .line 120
    .line 121
    const-string v2, "9"

    .line 122
    .line 123
    .line 124
    invoke-static {p1, v1, v2, v0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 125
    return-void

    .line 126
    .line 127
    .line 128
    :cond_2
    invoke-virtual {p1}, Lkotlin/Pair;->getFirst()Ljava/lang/Object;

    .line 129
    move-result-object v1

    .line 130
    .line 131
    check-cast v1, Ljava/math/BigDecimal;

    .line 132
    .line 133
    .line 134
    invoke-virtual {p1}, Lkotlin/Pair;->getSecond()Ljava/lang/Object;

    .line 135
    move-result-object p1

    .line 136
    .line 137
    check-cast p1, Ljava/math/BigDecimal;

    .line 138
    .line 139
    .line 140
    invoke-direct {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->R4()Lcom/kubi/kumex/data/platform/model/ContractEntity;

    .line 141
    move-result-object v3

    .line 142
    .line 143
    .line 144
    invoke-static {v3, v2}, Lfm/b;->d(Lcom/kubi/kumex/data/platform/model/ContractEntity;Z)I

    .line 145
    move-result v2

    .line 146
    int-to-long v2, v2

    .line 147
    .line 148
    .line 149
    invoke-static {v2, v3}, Ljava/math/BigDecimal;->valueOf(J)Ljava/math/BigDecimal;

    .line 150
    move-result-object v2

    .line 151
    .line 152
    const-string v3, "valueOf(...)"

    .line 153
    .line 154
    .line 155
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1, v2}, Ljava/math/BigDecimal;->min(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 159
    move-result-object p1

    .line 160
    .line 161
    iget-object v2, v0, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v2, v1}, Lcom/kubi/futures/view/ModifyLeverageInputView;->setMin(Ljava/math/BigDecimal;)V

    .line 165
    .line 166
    iget-object v2, v0, Ldm/q0;->l:Lcom/kubi/futures/view/ModifyLeverageInputView;

    .line 167
    .line 168
    .line 169
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v2, p1}, Lcom/kubi/futures/view/ModifyLeverageInputView;->setMax(Ljava/math/BigDecimal;)V

    .line 173
    .line 174
    .line 175
    invoke-static {}, Lcom/blankj/utilcode/util/w0;->a()Z

    .line 176
    move-result v2

    .line 177
    .line 178
    const-string v3, " - "

    .line 179
    .line 180
    if-eqz v2, :cond_3

    .line 181
    .line 182
    new-instance v2, Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->N4(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 189
    move-result-object p1

    .line 190
    .line 191
    .line 192
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 196
    .line 197
    .line 198
    invoke-virtual {p0, v1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->N4(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 199
    move-result-object p1

    .line 200
    .line 201
    .line 202
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 203
    .line 204
    .line 205
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 206
    move-result-object p1

    .line 207
    goto :goto_1

    .line 208
    .line 209
    :cond_3
    new-instance v2, Ljava/lang/StringBuilder;

    .line 210
    .line 211
    .line 212
    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0, v1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->N4(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 216
    move-result-object v1

    .line 217
    .line 218
    .line 219
    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->N4(Ljava/math/BigDecimal;)Ljava/lang/String;

    .line 226
    move-result-object p1

    .line 227
    .line 228
    .line 229
    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 233
    move-result-object p1

    .line 234
    .line 235
    :goto_1
    iget-object v0, v0, Ldm/q0;->n:Lcom/kubi/resources/widget/DashTextView;

    .line 236
    .line 237
    sget-object v1, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 238
    .line 239
    sget v2, Lcom/kubi/kumex/R$string;->kumex_modify_leverage_adjust_range:I

    .line 240
    .line 241
    .line 242
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 243
    move-result-object p1

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, v2, p1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 247
    move-result-object p1

    .line 248
    .line 249
    .line 250
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 251
    .line 252
    .line 253
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 254
    move-result-object p1

    .line 255
    .line 256
    .line 257
    invoke-virtual {p1}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 258
    move-result-object p1

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 262
    move-result-object p1

    .line 263
    .line 264
    check-cast p1, Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 265
    .line 266
    if-eqz p1, :cond_4

    .line 267
    .line 268
    .line 269
    invoke-virtual {p0, p1}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->A5(Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 270
    :cond_4
    :goto_2
    return-void
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
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
.end method

.method public final z5(Ljava/math/BigDecimal;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->S4()I

    .line 4
    move-result v0

    .line 5
    .line 6
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 10
    move-result v2

    .line 11
    .line 12
    if-ltz v2, :cond_0

    .line 13
    .line 14
    sget-object v2, Ljava/math/RoundingMode;->UP:Ljava/math/RoundingMode;

    .line 15
    goto :goto_0

    .line 16
    .line 17
    :cond_0
    sget-object v2, Ljava/math/RoundingMode;->DOWN:Ljava/math/RoundingMode;

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-virtual {p1, v0, v2}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 25
    move-result v0

    .line 26
    .line 27
    if-ltz v0, :cond_1

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->showError(Ljava/lang/String;)V

    .line 32
    .line 33
    .line 34
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->X4()Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/vm/ModifyPositionLeverageViewModel;->v()Landroidx/lifecycle/MutableLiveData;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    check-cast v0, Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 46
    .line 47
    .line 48
    invoke-virtual {p1, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 49
    move-result v1

    .line 50
    .line 51
    if-lez v1, :cond_2

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->P4()Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, p1, v0}, Lcom/kubi/futures/trade/position/vm/AddMarginViewModel;->d0(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 59
    return-void

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/futures/trade/position/ModifyPositionLeverageDialog;->V4()Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;

    .line 63
    move-result-object v1

    .line 64
    .line 65
    .line 66
    invoke-virtual {p1}, Ljava/math/BigDecimal;->abs()Ljava/math/BigDecimal;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p1, v0}, Lcom/kubi/futures/trade/position/vm/ReduceMarginViewModel;->e0(Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 71
    return-void
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
.end method
