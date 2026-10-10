.class public final Lcom/kubi/futures/trade/position/PositionSortDialog;
.super Lcom/kubi/resources/dialog/DialogFragmentHelper;
.source "PositionSortDialog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/futures/trade/position/PositionSortDialog$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0018\u0000 32\u00020\u0001:\u00013B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010&\u001a\u00020 H\u0016J>\u0010\'\u001a\u00020\u001526\u0010(\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0014\u0012\u0004\u0012\u00020\u00150\u0010J&\u0010)\u001a\u0004\u0018\u00010*2\u0006\u0010+\u001a\u00020,2\u0008\u0010-\u001a\u0004\u0018\u00010.2\u0008\u0010/\u001a\u0004\u0018\u000100H\u0016J\u001a\u00101\u001a\u00020\u00152\u0006\u00102\u001a\u00020*2\u0008\u0010/\u001a\u0004\u0018\u000100H\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\t\u001a\u0004\u0008\u000c\u0010\rR>\u0010\u000f\u001a2\u0012\u0013\u0012\u00110\u0005\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0013\u0012\u0013\u0012\u00110\u000b\u00a2\u0006\u000c\u0008\u0011\u0012\u0008\u0008\u0012\u0012\u0004\u0008\u0008(\u0014\u0012\u0004\u0012\u00020\u00150\u0010X\u0082.\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0016\u001a\u0004\u0018\u00010\u00178BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001a\u0010\u001b\u001a\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u001c\u001a\u0008\u0012\u0004\u0012\u00020\u001e0\u001dX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008!\u0010\"\"\u0004\u0008#\u0010$R\u000e\u0010%\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u00064"
    }
    d2 = {
        "Lcom/kubi/futures/trade/position/PositionSortDialog;",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper;",
        "<init>",
        "()V",
        "lastSortKey",
        "",
        "getLastSortKey",
        "()Ljava/lang/String;",
        "lastSortKey$delegate",
        "Lkotlin/Lazy;",
        "lastSortOrder",
        "Lcom/kubi/futures/trade/position/data/PositionSortOrder;",
        "getLastSortOrder",
        "()Lcom/kubi/futures/trade/position/data/PositionSortOrder;",
        "lastSortOrder$delegate",
        "onConfirmCallback",
        "Lkotlin/Function2;",
        "Lkotlin/ParameterName;",
        "name",
        "sortKey",
        "order",
        "",
        "viewBinding",
        "Lcom/kubi/kumex/databinding/BkumexDialogPositionSortBinding;",
        "getViewBinding",
        "()Lcom/kubi/kumex/databinding/BkumexDialogPositionSortBinding;",
        "viewBinding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "sortList",
        "",
        "Lcom/kubi/futures/trade/position/data/PositionSortType;",
        "selectedPos",
        "",
        "getSelectedPos",
        "()I",
        "setSelectedPos",
        "(I)V",
        "currentSortOrder",
        "initType",
        "setConfirmCallback",
        "callback",
        "onCreateView",
        "Landroid/view/View;",
        "inflater",
        "Landroid/view/LayoutInflater;",
        "container",
        "Landroid/view/ViewGroup;",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "onViewCreated",
        "view",
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
        "SMAP\nPositionSortDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PositionSortDialog.kt\ncom/kubi/futures/trade/position/PositionSortDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,338:1\n143#2,20:339\n360#3,7:359\n1#4:366\n*S KotlinDebug\n*F\n+ 1 PositionSortDialog.kt\ncom/kubi/futures/trade/position/PositionSortDialog\n*L\n63#1:339,20\n176#1:359,7\n*E\n"
    }
.end annotation


# static fields
.field public static final x0:Lcom/kubi/futures/trade/position/PositionSortDialog$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic y0:[Lkotlin/reflect/KProperty;
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
.field public final q0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final r0:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public s0:Lkotlin/jvm/functions/Function2;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Lcom/kubi/futures/trade/position/data/PositionSortOrder;",
            "Lkotlin/Unit;",
            ">;"
        }
    .end annotation
.end field

.field public final t0:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final u0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lti/k;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public v0:I

.field public w0:Lcom/kubi/futures/trade/position/data/PositionSortOrder;
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
    const-string v1, "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogPositionSortBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/futures/trade/position/PositionSortDialog;

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
    sput-object v1, Lcom/kubi/futures/trade/position/PositionSortDialog;->y0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/futures/trade/position/PositionSortDialog$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/futures/trade/position/PositionSortDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/futures/trade/position/PositionSortDialog;->x0:Lcom/kubi/futures/trade/position/PositionSortDialog$Companion;

    .line 32
    return-void
    .line 33
.end method

.method public constructor <init>()V
    .locals 15

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/kubi/futures/trade/position/o3;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/o3;-><init>(Lcom/kubi/futures/trade/position/PositionSortDialog;)V

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->q0:Lkotlin/Lazy;

    .line 15
    .line 16
    new-instance v0, Lcom/kubi/futures/trade/position/p3;

    .line 17
    .line 18
    .line 19
    invoke-direct {v0, p0}, Lcom/kubi/futures/trade/position/p3;-><init>(Lcom/kubi/futures/trade/position/PositionSortDialog;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    iput-object v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->r0:Lkotlin/Lazy;

    .line 26
    .line 27
    sget-object v0, Lcom/kubi/futures/trade/position/PositionSortDialog$special$$inlined$viewBindingFragment$default$1;->INSTANCE:Lcom/kubi/futures/trade/position/PositionSortDialog$special$$inlined$viewBindingFragment$default$1;

    .line 28
    .line 29
    new-instance v1, Lcom/kubi/futures/trade/position/PositionSortDialog$special$$inlined$viewBindingFragment$default$2;

    .line 30
    .line 31
    .line 32
    invoke-direct {v1}, Lcom/kubi/futures/trade/position/PositionSortDialog$special$$inlined$viewBindingFragment$default$2;-><init>()V

    .line 33
    .line 34
    .line 35
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    iput-object v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->t0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 39
    .line 40
    new-instance v1, Lti/k;

    .line 41
    .line 42
    sget-object v0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 43
    .line 44
    sget v2, Lcom/kubi/kumex/R$string;->kc_trade_funds_default_sort:I

    .line 45
    const/4 v7, 0x0

    .line 46
    .line 47
    new-array v3, v7, [Ljava/lang/Object;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v2, v3}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    new-instance v5, Lcom/kubi/futures/trade/position/q3;

    .line 54
    .line 55
    .line 56
    invoke-direct {v5}, Lcom/kubi/futures/trade/position/q3;-><init>()V

    .line 57
    .line 58
    sget-object v13, Lcom/kubi/futures/trade/position/data/PositionSortOrder;->DESC:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 59
    .line 60
    const-string v3, "POSITION_DEFAULT_SORT"

    .line 61
    const/4 v4, 0x0

    .line 62
    move-object v6, v13

    .line 63
    .line 64
    .line 65
    invoke-direct/range {v1 .. v6}, Lti/k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lcom/kubi/futures/trade/position/data/PositionSortOrder;)V

    .line 66
    .line 67
    new-instance v2, Lti/k;

    .line 68
    .line 69
    sget v3, Lcom/kubi/kumex/R$string;->kumex_contracts_name:I

    .line 70
    .line 71
    new-array v4, v7, [Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0, v3, v4}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 75
    move-result-object v9

    .line 76
    .line 77
    new-instance v12, Lcom/kubi/futures/trade/position/r3;

    .line 78
    .line 79
    .line 80
    invoke-direct {v12}, Lcom/kubi/futures/trade/position/r3;-><init>()V

    .line 81
    .line 82
    const-string v10, "POSITION_CONTRACT_NAME"

    .line 83
    const/4 v11, 0x1

    .line 84
    move-object v8, v2

    .line 85
    .line 86
    .line 87
    invoke-direct/range {v8 .. v13}, Lti/k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lcom/kubi/futures/trade/position/data/PositionSortOrder;)V

    .line 88
    .line 89
    new-instance v3, Lti/k;

    .line 90
    .line 91
    sget v4, Lcom/kubi/kumex/R$string;->kumex_position_qty_unit_value:I

    .line 92
    .line 93
    new-array v5, v7, [Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v4, v5}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 97
    move-result-object v9

    .line 98
    .line 99
    new-instance v12, Lcom/kubi/futures/trade/position/s3;

    .line 100
    .line 101
    .line 102
    invoke-direct {v12}, Lcom/kubi/futures/trade/position/s3;-><init>()V

    .line 103
    .line 104
    const-string v10, "POSITION_QTY_VALUE_SORT"

    .line 105
    move-object v8, v3

    .line 106
    .line 107
    .line 108
    invoke-direct/range {v8 .. v13}, Lti/k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lcom/kubi/futures/trade/position/data/PositionSortOrder;)V

    .line 109
    .line 110
    new-instance v4, Lti/k;

    .line 111
    .line 112
    sget v5, Lcom/kubi/kumex/R$string;->unrealised_pnl:I

    .line 113
    .line 114
    new-array v6, v7, [Ljava/lang/Object;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v5, v6}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 118
    move-result-object v9

    .line 119
    .line 120
    new-instance v12, Lcom/kubi/futures/trade/position/t3;

    .line 121
    .line 122
    .line 123
    invoke-direct {v12}, Lcom/kubi/futures/trade/position/t3;-><init>()V

    .line 124
    .line 125
    const-string v10, "POSITION_UNREALIZED_SORT"

    .line 126
    move-object v8, v4

    .line 127
    .line 128
    .line 129
    invoke-direct/range {v8 .. v13}, Lti/k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lcom/kubi/futures/trade/position/data/PositionSortOrder;)V

    .line 130
    .line 131
    new-instance v5, Lti/k;

    .line 132
    .line 133
    sget v6, Lcom/kubi/kumex/R$string;->realised_pnl:I

    .line 134
    .line 135
    new-array v8, v7, [Ljava/lang/Object;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v6, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 139
    move-result-object v9

    .line 140
    .line 141
    new-instance v12, Lcom/kubi/futures/trade/position/h3;

    .line 142
    .line 143
    .line 144
    invoke-direct {v12}, Lcom/kubi/futures/trade/position/h3;-><init>()V

    .line 145
    .line 146
    const-string v10, "POSITION_REALIZED_SORT"

    .line 147
    move-object v8, v5

    .line 148
    .line 149
    .line 150
    invoke-direct/range {v8 .. v13}, Lti/k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lcom/kubi/futures/trade/position/data/PositionSortOrder;)V

    .line 151
    .line 152
    new-instance v6, Lti/k;

    .line 153
    .line 154
    sget v8, Lcom/kubi/kumex/R$string;->unify_funds_hold_equity:I

    .line 155
    .line 156
    new-array v9, v7, [Ljava/lang/Object;

    .line 157
    .line 158
    .line 159
    invoke-virtual {v0, v8, v9}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 160
    move-result-object v9

    .line 161
    .line 162
    new-instance v12, Lcom/kubi/futures/trade/position/i3;

    .line 163
    .line 164
    .line 165
    invoke-direct {v12}, Lcom/kubi/futures/trade/position/i3;-><init>()V

    .line 166
    .line 167
    const-string v10, "POSITION_MARGIN_SORT"

    .line 168
    move-object v8, v6

    .line 169
    .line 170
    .line 171
    invoke-direct/range {v8 .. v13}, Lti/k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lcom/kubi/futures/trade/position/data/PositionSortOrder;)V

    .line 172
    .line 173
    new-instance v8, Lti/k;

    .line 174
    .line 175
    sget v9, Lcom/kubi/kumex/R$string;->kumex_pnl_rate_in_position:I

    .line 176
    .line 177
    new-array v10, v7, [Ljava/lang/Object;

    .line 178
    .line 179
    .line 180
    invoke-virtual {v0, v9, v10}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 181
    move-result-object v9

    .line 182
    .line 183
    new-instance v12, Lcom/kubi/futures/trade/position/j3;

    .line 184
    .line 185
    .line 186
    invoke-direct {v12}, Lcom/kubi/futures/trade/position/j3;-><init>()V

    .line 187
    .line 188
    const-string v10, "POSITION_ROI_SORT"

    .line 189
    .line 190
    .line 191
    invoke-direct/range {v8 .. v13}, Lti/k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lcom/kubi/futures/trade/position/data/PositionSortOrder;)V

    .line 192
    move-object v14, v8

    .line 193
    move v8, v7

    .line 194
    move-object v7, v14

    .line 195
    .line 196
    new-instance v9, Lti/k;

    .line 197
    .line 198
    sget v10, Lcom/kubi/kumex/R$string;->kumex_position_risk_ratio:I

    .line 199
    .line 200
    new-array v8, v8, [Ljava/lang/Object;

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v10, v8}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 204
    move-result-object v0

    .line 205
    .line 206
    new-instance v12, Lcom/kubi/futures/trade/position/k3;

    .line 207
    .line 208
    .line 209
    invoke-direct {v12}, Lcom/kubi/futures/trade/position/k3;-><init>()V

    .line 210
    .line 211
    const-string v10, "POSITION_RISK_SORT"

    .line 212
    move-object v8, v9

    .line 213
    move-object v9, v0

    .line 214
    .line 215
    .line 216
    invoke-direct/range {v8 .. v13}, Lti/k;-><init>(Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lcom/kubi/futures/trade/position/data/PositionSortOrder;)V

    .line 217
    .line 218
    .line 219
    filled-new-array/range {v1 .. v8}, [Lti/k;

    .line 220
    move-result-object v0

    .line 221
    .line 222
    .line 223
    invoke-static {v0}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 224
    move-result-object v0

    .line 225
    .line 226
    iput-object v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->u0:Ljava/util/List;

    .line 227
    .line 228
    iput-object v13, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->w0:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 229
    return-void
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
.end method

.method public static final A4(Lcom/kubi/futures/trade/position/PositionSortDialog;)Ljava/lang/String;
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
    invoke-virtual {p0, v0}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    return-object p0

    .line 14
    :cond_0
    const/4 p0, 0x0

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
.end method

.method public static final B4(Lcom/kubi/futures/trade/position/PositionSortDialog;)Lcom/kubi/futures/trade/position/data/PositionSortOrder;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getArguments()Landroid/os/Bundle;

    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-eqz p0, :cond_0

    .line 8
    .line 9
    const-string v1, "data_1"

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v1}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 13
    move-result-object p0

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    move-object p0, v0

    .line 16
    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-static {p0}, Lcom/kubi/futures/trade/position/data/PositionSortOrder;->valueOf(Ljava/lang/String;)Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 21
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 22
    :catch_0
    :cond_1
    return-object v0
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

.method public static final C4(Lcom/kubi/futures/trade/position/PositionSortDialog;Ldm/w0;I)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->v0:I

    .line 3
    .line 4
    const-string v1, "null cannot be cast to non-null type com.kubi.futures.trade.position.SortTypeAdapter"

    .line 5
    .line 6
    if-ne v0, p2, :cond_1

    .line 7
    .line 8
    iget-object p2, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->w0:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 9
    .line 10
    sget-object v0, Lcom/kubi/futures/trade/position/data/PositionSortOrder;->ASC:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 11
    .line 12
    if-ne p2, v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/kubi/futures/trade/position/data/PositionSortOrder;->DESC:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 15
    .line 16
    :cond_0
    iput-object v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->w0:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 17
    .line 18
    iget-object p1, p1, Ldm/w0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 22
    move-result-object p1

    .line 23
    .line 24
    .line 25
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 26
    .line 27
    check-cast p1, Lcom/kubi/futures/trade/position/n4;

    .line 28
    .line 29
    iget-object p0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->w0:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, p0}, Lcom/kubi/futures/trade/position/n4;->n(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)V

    .line 33
    goto :goto_0

    .line 34
    .line 35
    :cond_1
    iput p2, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->v0:I

    .line 36
    .line 37
    iget-object v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->u0:Ljava/util/List;

    .line 38
    .line 39
    .line 40
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 41
    move-result-object p2

    .line 42
    .line 43
    check-cast p2, Lti/k;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p2}, Lti/k;->a()Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 47
    move-result-object p2

    .line 48
    .line 49
    iput-object p2, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->w0:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 50
    .line 51
    iget-object p1, p1, Ldm/w0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 55
    move-result-object p1

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 59
    .line 60
    check-cast p1, Lcom/kubi/futures/trade/position/n4;

    .line 61
    .line 62
    iget p2, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->v0:I

    .line 63
    .line 64
    iget-object p0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->w0:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1, p2, p0}, Lcom/kubi/futures/trade/position/n4;->o(ILcom/kubi/futures/trade/position/data/PositionSortOrder;)V

    .line 68
    .line 69
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 70
    return-object p0
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

.method public static final D4(Lcom/kubi/futures/trade/position/PositionSortDialog;Ldm/w0;I)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->v0:I

    .line 3
    .line 4
    if-eq v0, p2, :cond_0

    .line 5
    .line 6
    iput p2, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->v0:I

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->u0:Ljava/util/List;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 12
    move-result-object p2

    .line 13
    .line 14
    check-cast p2, Lti/k;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lti/k;->a()Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 18
    move-result-object p2

    .line 19
    .line 20
    iput-object p2, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->w0:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 21
    .line 22
    iget-object p1, p1, Ldm/w0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    const-string p2, "null cannot be cast to non-null type com.kubi.futures.trade.position.SortTypeAdapter"

    .line 29
    .line 30
    .line 31
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    .line 33
    check-cast p1, Lcom/kubi/futures/trade/position/n4;

    .line 34
    .line 35
    iget p2, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->v0:I

    .line 36
    .line 37
    iget-object p0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->w0:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1, p2, p0}, Lcom/kubi/futures/trade/position/n4;->o(ILcom/kubi/futures/trade/position/data/PositionSortOrder;)V

    .line 41
    .line 42
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 43
    return-object p0
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

.method public static final E4(Lcom/kubi/futures/trade/position/PositionSortDialog;Lcom/kubi/futures/trade/position/n4;)Lkotlin/Unit;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->v0:I

    .line 4
    .line 5
    iget-object v1, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->u0:Ljava/util/List;

    .line 6
    .line 7
    .line 8
    invoke-interface {v1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    check-cast v0, Lti/k;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lti/k;->a()Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iput-object v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->w0:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 18
    .line 19
    iget p0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->v0:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, p0, v0}, Lcom/kubi/futures/trade/position/n4;->m(ILcom/kubi/futures/trade/position/data/PositionSortOrder;)V

    .line 23
    .line 24
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 25
    return-object p0
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

.method public static final F4(Lcom/kubi/futures/trade/position/PositionSortDialog;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->u0:Ljava/util/List;

    .line 3
    .line 4
    iget v1, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->v0:I

    .line 5
    .line 6
    .line 7
    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    check-cast v0, Lti/k;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lti/k;->c()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iget-object v1, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->s0:Lkotlin/jvm/functions/Function2;

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    .line 20
    const-string v1, "onConfirmCallback"

    .line 21
    .line 22
    .line 23
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 24
    const/4 v1, 0x0

    .line 25
    .line 26
    :cond_0
    iget-object v2, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->w0:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 27
    .line 28
    .line 29
    invoke-interface {v1, v0, v2}, Lkotlin/jvm/functions/Function2;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismiss()V

    .line 33
    .line 34
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 35
    return-object p0
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

.method public static final H4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p0, ""

    .line 8
    return-object p0
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

.method public static final I4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/futures/trade/position/data/PositionSortOrder;->ASC:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 13
    .line 14
    sget v0, Lcom/kubi/kumex/R$string;->sort_alphabet_desc:I

    .line 15
    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_0
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 24
    .line 25
    sget v0, Lcom/kubi/kumex/R$string;->sort_alphabet_asc:I

    .line 26
    .line 27
    new-array v1, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static final J4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/futures/trade/position/data/PositionSortOrder;->ASC:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 13
    .line 14
    sget v0, Lcom/kubi/kumex/R$string;->sort_by_asc:I

    .line 15
    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_0
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 24
    .line 25
    sget v0, Lcom/kubi/kumex/R$string;->sort_by_desc:I

    .line 26
    .line 27
    new-array v1, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static final K4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/futures/trade/position/data/PositionSortOrder;->ASC:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 13
    .line 14
    sget v0, Lcom/kubi/kumex/R$string;->sort_by_asc:I

    .line 15
    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_0
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 24
    .line 25
    sget v0, Lcom/kubi/kumex/R$string;->sort_by_desc:I

    .line 26
    .line 27
    new-array v1, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static final L4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/futures/trade/position/data/PositionSortOrder;->ASC:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 13
    .line 14
    sget v0, Lcom/kubi/kumex/R$string;->sort_by_asc:I

    .line 15
    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_0
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 24
    .line 25
    sget v0, Lcom/kubi/kumex/R$string;->sort_by_desc:I

    .line 26
    .line 27
    new-array v1, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static final M4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/futures/trade/position/data/PositionSortOrder;->ASC:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 13
    .line 14
    sget v0, Lcom/kubi/kumex/R$string;->sort_by_asc:I

    .line 15
    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_0
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 24
    .line 25
    sget v0, Lcom/kubi/kumex/R$string;->sort_by_desc:I

    .line 26
    .line 27
    new-array v1, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static final N4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/futures/trade/position/data/PositionSortOrder;->ASC:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 13
    .line 14
    sget v0, Lcom/kubi/kumex/R$string;->sort_by_asc:I

    .line 15
    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_0
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 24
    .line 25
    sget v0, Lcom/kubi/kumex/R$string;->sort_by_desc:I

    .line 26
    .line 27
    new-array v1, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static final O4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    const-string v0, "it"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/kubi/futures/trade/position/data/PositionSortOrder;->ASC:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 13
    .line 14
    sget v0, Lcom/kubi/kumex/R$string;->sort_by_asc:I

    .line 15
    .line 16
    new-array v1, v1, [Ljava/lang/Object;

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 20
    move-result-object p0

    .line 21
    return-object p0

    .line 22
    .line 23
    :cond_0
    sget-object p0, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 24
    .line 25
    sget v0, Lcom/kubi/kumex/R$string;->sort_by_desc:I

    .line 26
    .line 27
    new-array v1, v1, [Ljava/lang/Object;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v0, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 31
    move-result-object p0

    .line 32
    return-object p0
.end method

.method public static synthetic j4(Lcom/kubi/futures/trade/position/PositionSortDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->F4(Lcom/kubi/futures/trade/position/PositionSortDialog;)Lkotlin/Unit;

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

.method public static synthetic k4(Lcom/kubi/futures/trade/position/PositionSortDialog;Ldm/w0;I)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/futures/trade/position/PositionSortDialog;->D4(Lcom/kubi/futures/trade/position/PositionSortDialog;Ldm/w0;I)Lkotlin/Unit;

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

.method public static synthetic l4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->K4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;

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

.method public static synthetic m4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->N4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;

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

.method public static synthetic n4(Lcom/kubi/futures/trade/position/PositionSortDialog;Ldm/w0;I)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/futures/trade/position/PositionSortDialog;->C4(Lcom/kubi/futures/trade/position/PositionSortDialog;Ldm/w0;I)Lkotlin/Unit;

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

.method public static synthetic o4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->L4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;

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

.method public static synthetic p4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->M4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;

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

.method public static synthetic q4(Lcom/kubi/futures/trade/position/PositionSortDialog;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->A4(Lcom/kubi/futures/trade/position/PositionSortDialog;)Ljava/lang/String;

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

.method public static synthetic r4(Lcom/kubi/futures/trade/position/PositionSortDialog;)Lcom/kubi/futures/trade/position/data/PositionSortOrder;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->B4(Lcom/kubi/futures/trade/position/PositionSortDialog;)Lcom/kubi/futures/trade/position/data/PositionSortOrder;

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

.method public static synthetic s4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->O4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;

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

.method public static synthetic t4(Lcom/kubi/futures/trade/position/PositionSortDialog;Lcom/kubi/futures/trade/position/n4;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/trade/position/PositionSortDialog;->E4(Lcom/kubi/futures/trade/position/PositionSortDialog;Lcom/kubi/futures/trade/position/n4;)Lkotlin/Unit;

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

.method public static synthetic u4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->J4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;

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

.method public static synthetic v4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->H4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;

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

.method public static synthetic w4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->I4(Lcom/kubi/futures/trade/position/data/PositionSortOrder;)Ljava/lang/String;

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
.method public final G4(Lkotlin/jvm/functions/Function2;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function2;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function2<",
            "-",
            "Ljava/lang/String;",
            "-",
            "Lcom/kubi/futures/trade/position/data/PositionSortOrder;",
            "Lkotlin/Unit;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "callback"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->s0:Lkotlin/jvm/functions/Function2;

    .line 8
    return-void
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

.method public N3()I
    .locals 1

    .line 1
    .line 2
    const/16 v0, -0xb

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
    sget p3, Lcom/kubi/kumex/R$layout;->bkumex_dialog_position_sort:I

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
.end method

.method public onViewCreated(Landroid/view/View;Landroid/os/Bundle;)V
    .locals 17
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
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->z4()Ldm/w0;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    return-void

    .line 20
    .line 21
    :cond_0
    iget-object v3, v0, Lcom/kubi/futures/trade/position/PositionSortDialog;->u0:Ljava/util/List;

    .line 22
    .line 23
    .line 24
    invoke-interface {v3}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 25
    move-result-object v3

    .line 26
    const/4 v4, 0x0

    .line 27
    move v5, v4

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v6

    .line 32
    .line 33
    if-eqz v6, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v6

    .line 38
    .line 39
    check-cast v6, Lti/k;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6}, Lti/k;->c()Ljava/lang/String;

    .line 43
    move-result-object v6

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->x4()Ljava/lang/String;

    .line 47
    move-result-object v7

    .line 48
    .line 49
    .line 50
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 51
    move-result v6

    .line 52
    .line 53
    if-eqz v6, :cond_1

    .line 54
    goto :goto_1

    .line 55
    .line 56
    :cond_1
    add-int/lit8 v5, v5, 0x1

    .line 57
    goto :goto_0

    .line 58
    :cond_2
    const/4 v5, -0x1

    .line 59
    .line 60
    .line 61
    :goto_1
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 62
    move-result-object v3

    .line 63
    .line 64
    .line 65
    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    .line 66
    move-result v5

    .line 67
    .line 68
    if-ltz v5, :cond_3

    .line 69
    goto :goto_2

    .line 70
    :cond_3
    const/4 v3, 0x0

    .line 71
    .line 72
    :goto_2
    if-eqz v3, :cond_4

    .line 73
    .line 74
    .line 75
    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    .line 76
    move-result v4

    .line 77
    .line 78
    :cond_4
    iput v4, v0, Lcom/kubi/futures/trade/position/PositionSortDialog;->v0:I

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lcom/kubi/futures/trade/position/PositionSortDialog;->y4()Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 82
    move-result-object v3

    .line 83
    .line 84
    if-nez v3, :cond_5

    .line 85
    .line 86
    iget-object v3, v0, Lcom/kubi/futures/trade/position/PositionSortDialog;->u0:Ljava/util/List;

    .line 87
    .line 88
    iget v4, v0, Lcom/kubi/futures/trade/position/PositionSortDialog;->v0:I

    .line 89
    .line 90
    .line 91
    invoke-interface {v3, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    check-cast v3, Lti/k;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v3}, Lti/k;->a()Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 98
    move-result-object v3

    .line 99
    :cond_5
    move-object v7, v3

    .line 100
    .line 101
    iput-object v7, v0, Lcom/kubi/futures/trade/position/PositionSortDialog;->w0:Lcom/kubi/futures/trade/position/data/PositionSortOrder;

    .line 102
    .line 103
    new-instance v4, Lcom/kubi/futures/trade/position/n4;

    .line 104
    .line 105
    iget-object v5, v0, Lcom/kubi/futures/trade/position/PositionSortDialog;->u0:Ljava/util/List;

    .line 106
    .line 107
    iget v6, v0, Lcom/kubi/futures/trade/position/PositionSortDialog;->v0:I

    .line 108
    .line 109
    new-instance v8, Lcom/kubi/futures/trade/position/g3;

    .line 110
    .line 111
    .line 112
    invoke-direct {v8, v0, v1}, Lcom/kubi/futures/trade/position/g3;-><init>(Lcom/kubi/futures/trade/position/PositionSortDialog;Ldm/w0;)V

    .line 113
    .line 114
    new-instance v9, Lcom/kubi/futures/trade/position/l3;

    .line 115
    .line 116
    .line 117
    invoke-direct {v9, v0, v1}, Lcom/kubi/futures/trade/position/l3;-><init>(Lcom/kubi/futures/trade/position/PositionSortDialog;Ldm/w0;)V

    .line 118
    .line 119
    .line 120
    invoke-direct/range {v4 .. v9}, Lcom/kubi/futures/trade/position/n4;-><init>(Ljava/util/List;ILcom/kubi/futures/trade/position/data/PositionSortOrder;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    .line 121
    .line 122
    iget-object v3, v1, Ldm/w0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 123
    .line 124
    new-instance v5, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 125
    .line 126
    .line 127
    invoke-virtual {v2}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 128
    move-result-object v2

    .line 129
    .line 130
    .line 131
    invoke-direct {v5, v2}, Landroidx/recyclerview/widget/LinearLayoutManager;-><init>(Landroid/content/Context;)V

    .line 132
    .line 133
    .line 134
    invoke-virtual {v3, v5}, Landroidx/recyclerview/widget/RecyclerView;->setLayoutManager(Landroidx/recyclerview/widget/RecyclerView$LayoutManager;)V

    .line 135
    .line 136
    iget-object v2, v1, Ldm/w0;->b:Landroidx/recyclerview/widget/RecyclerView;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2, v4}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 140
    .line 141
    iget-object v5, v1, Ldm/w0;->d:Lcom/kubi/resources/widget/button/KcSecondaryButton;

    .line 142
    .line 143
    const-string v2, "tvReset"

    .line 144
    .line 145
    .line 146
    invoke-static {v5, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 147
    .line 148
    new-instance v8, Lcom/kubi/futures/trade/position/m3;

    .line 149
    .line 150
    .line 151
    invoke-direct {v8, v0, v4}, Lcom/kubi/futures/trade/position/m3;-><init>(Lcom/kubi/futures/trade/position/PositionSortDialog;Lcom/kubi/futures/trade/position/n4;)V

    .line 152
    const/4 v9, 0x1

    .line 153
    const/4 v10, 0x0

    .line 154
    .line 155
    const-wide/16 v6, 0x0

    .line 156
    .line 157
    .line 158
    invoke-static/range {v5 .. v10}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 159
    .line 160
    iget-object v11, v1, Ldm/w0;->c:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 161
    .line 162
    const-string v1, "tvConfirm"

    .line 163
    .line 164
    .line 165
    invoke-static {v11, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 166
    .line 167
    new-instance v14, Lcom/kubi/futures/trade/position/n3;

    .line 168
    .line 169
    .line 170
    invoke-direct {v14, v0}, Lcom/kubi/futures/trade/position/n3;-><init>(Lcom/kubi/futures/trade/position/PositionSortDialog;)V

    .line 171
    const/4 v15, 0x1

    .line 172
    .line 173
    const/16 v16, 0x0

    .line 174
    .line 175
    const-wide/16 v12, 0x0

    .line 176
    .line 177
    .line 178
    invoke-static/range {v11 .. v16}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 179
    return-void
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

.method public final x4()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->q0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/String;

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

.method public final y4()Lcom/kubi/futures/trade/position/data/PositionSortOrder;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->r0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/futures/trade/position/data/PositionSortOrder;

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

.method public final z4()Ldm/w0;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/trade/position/PositionSortDialog;->t0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/futures/trade/position/PositionSortDialog;->y0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Ldm/w0;

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
