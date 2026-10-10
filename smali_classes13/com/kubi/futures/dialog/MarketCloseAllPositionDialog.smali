.class public final Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;
.super Lcom/kubi/resources/dialog/DialogFragmentHelper;
.source "MarketCloseAllPositionDialog.kt"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0003\u0018\u0000 \"2\u00020\u0001:\u0001\"B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0008\u0010\u0015\u001a\u00020\u0016H\u0016J$\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016J\u001a\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\u00182\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0016R\u001d\u0010\u0004\u001a\u0004\u0018\u00010\u00058BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010\t\u001a\u0004\u0008\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000c\u0010\rR\u001d\u0010\u0010\u001a\u0004\u0018\u00010\u00118BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u000f\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006#"
    }
    d2 = {
        "Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;",
        "Lcom/kubi/resources/dialog/DialogFragmentHelper;",
        "<init>",
        "()V",
        "viewBinding",
        "Lcom/kubi/kumex/databinding/BkumexDialogAllMarketCloseBinding;",
        "getViewBinding",
        "()Lcom/kubi/kumex/databinding/BkumexDialogAllMarketCloseBinding;",
        "viewBinding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "viewModel",
        "Lcom/kubi/futures/trade/position/vm/MarketClosePositionViewModel;",
        "getViewModel",
        "()Lcom/kubi/futures/trade/position/vm/MarketClosePositionViewModel;",
        "viewModel$delegate",
        "Lkotlin/Lazy;",
        "position",
        "Lcom/kubi/kumex/data/trade/model/PositionEntity;",
        "getPosition",
        "()Lcom/kubi/kumex/data/trade/model/PositionEntity;",
        "position$delegate",
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
        "SMAP\nMarketCloseAllPositionDialog.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MarketCloseAllPositionDialog.kt\ncom/kubi/futures/dialog/MarketCloseAllPositionDialog\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FragmentViewModelLazy.kt\nandroidx/fragment/app/FragmentViewModelLazyKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,141:1\n143#2,20:142\n106#3,15:162\n126#4,2:177\n*S KotlinDebug\n*F\n+ 1 MarketCloseAllPositionDialog.kt\ncom/kubi/futures/dialog/MarketCloseAllPositionDialog\n*L\n52#1:142,20\n53#1:162,15\n90#1:177,2\n*E\n"
    }
.end annotation


# static fields
.field public static final t0:Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic u0:[Lkotlin/reflect/KProperty;
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

.field public final s0:Lkotlin/Lazy;
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
    const-string v1, "getViewBinding()Lcom/kubi/kumex/databinding/BkumexDialogAllMarketCloseBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;

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
    sput-object v1, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->u0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->t0:Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$Companion;

    .line 32
    return-void
    .line 33
.end method

.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewBindingFragment$default$1;->INSTANCE:Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewBindingFragment$default$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewBindingFragment$default$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewBindingFragment$default$2;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->q0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    new-instance v0, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewModels$default$1;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewModels$default$1;-><init>(Landroidx/fragment/app/Fragment;)V

    .line 22
    .line 23
    sget-object v1, Lkotlin/LazyThreadSafetyMode;->NONE:Lkotlin/LazyThreadSafetyMode;

    .line 24
    .line 25
    new-instance v2, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewModels$default$2;

    .line 26
    .line 27
    .line 28
    invoke-direct {v2, v0}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewModels$default$2;-><init>(Lkotlin/jvm/functions/Function0;)V

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, Lkotlin/LazyKt;->lazy(Lkotlin/LazyThreadSafetyMode;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    const-class v1, Lcom/kubi/futures/trade/position/vm/t1;

    .line 35
    .line 36
    .line 37
    invoke-static {v1}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    new-instance v2, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewModels$default$3;

    .line 41
    .line 42
    .line 43
    invoke-direct {v2, v0}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewModels$default$3;-><init>(Lkotlin/Lazy;)V

    .line 44
    .line 45
    new-instance v3, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewModels$default$4;

    .line 46
    const/4 v4, 0x0

    .line 47
    .line 48
    .line 49
    invoke-direct {v3, v4, v0}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewModels$default$4;-><init>(Lkotlin/jvm/functions/Function0;Lkotlin/Lazy;)V

    .line 50
    .line 51
    new-instance v4, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewModels$default$5;

    .line 52
    .line 53
    .line 54
    invoke-direct {v4, p0, v0}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$special$$inlined$viewModels$default$5;-><init>(Landroidx/fragment/app/Fragment;Lkotlin/Lazy;)V

    .line 55
    .line 56
    .line 57
    invoke-static {p0, v1, v2, v3, v4}, Landroidx/fragment/app/FragmentViewModelLazyKt;->createViewModelLazy(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KClass;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    iput-object v0, p0, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->r0:Lkotlin/Lazy;

    .line 61
    .line 62
    new-instance v0, Lcom/kubi/futures/dialog/j0;

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, p0}, Lcom/kubi/futures/dialog/j0;-><init>(Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;)V

    .line 66
    .line 67
    .line 68
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    iput-object v0, p0, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->s0:Lkotlin/Lazy;

    .line 72
    return-void
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

.method public static synthetic j4(Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->s4(Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;)Lkotlin/Unit;

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

.method public static synthetic k4(Ldm/h;Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;Lcom/kubi/kumex/data/trade/model/PositionEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->t4(Ldm/h;Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;Lcom/kubi/kumex/data/trade/model/PositionEntity;)Lkotlin/Unit;

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

.method public static synthetic l4(Ldm/h;Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;Lcom/kubi/kumex/dialog/ResultData;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->u4(Ldm/h;Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;Lcom/kubi/kumex/dialog/ResultData;)Lkotlin/Unit;

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

.method public static synthetic m4(Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;)Lcom/kubi/kumex/data/trade/model/PositionEntity;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->v4(Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;)Lcom/kubi/kumex/data/trade/model/PositionEntity;

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

.method public static synthetic n4(Landroid/widget/CompoundButton;Z)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->r4(Landroid/widget/CompoundButton;Z)Lkotlin/Unit;

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

.method private final o4()Lcom/kubi/kumex/data/trade/model/PositionEntity;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->s0:Lkotlin/Lazy;

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

.method public static final r4(Landroid/widget/CompoundButton;Z)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    const-string p1, "<unused var>"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const/16 v4, 0xc

    .line 12
    const/4 v5, 0x0

    .line 13
    .line 14
    const-string v1, "MarketCloseAllPositionsConfirmSwitch"

    .line 15
    const/4 v2, 0x0

    .line 16
    const/4 v3, 0x0

    .line 17
    .line 18
    .line 19
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 20
    .line 21
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object p0
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

.method public static final s4(Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const/16 v4, 0xc

    .line 7
    const/4 v5, 0x0

    .line 8
    .line 9
    const-string v1, "MarketCloseAllPositionsConfirmCancell"

    .line 10
    const/4 v2, 0x0

    .line 11
    const/4 v3, 0x0

    .line 12
    .line 13
    .line 14
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 18
    .line 19
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 20
    return-object p0
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

.method public static final t4(Ldm/h;Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;Lcom/kubi/kumex/data/trade/model/PositionEntity;)Lkotlin/Unit;
    .locals 10

    .line 1
    .line 2
    iget-object v0, p0, Ldm/h;->d:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->m()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 11
    return-object p0

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    const/16 v4, 0xc

    .line 18
    const/4 v5, 0x0

    .line 19
    .line 20
    const-string v1, "MarketCloseAllPositionsConfirm"

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 26
    .line 27
    iget-object v0, p0, Ldm/h;->d:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->o()V

    .line 31
    .line 32
    sget-object v0, Lzl/j;->a:Lzl/j;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lzl/j;->H()Ly70/g;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    iget-object p0, p0, Ldm/h;->c:Lcom/kubi/resources/widget/AlignTopCheckBox;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0}, Landroid/widget/CompoundButton;->isChecked()Z

    .line 42
    move-result p0

    .line 43
    .line 44
    xor-int/lit8 p0, p0, 0x1

    .line 45
    .line 46
    .line 47
    invoke-static {v0, p0}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 48
    .line 49
    .line 50
    invoke-virtual {p1}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->q4()Lcom/kubi/futures/trade/position/vm/t1;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Lcom/kubi/kumex/data/trade/model/PositionEntity;->getCurrentQty()Ljava/math/BigDecimal;

    .line 55
    move-result-object p0

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, Lcom/kubi/utils/extensions/d;->p(Ljava/math/BigDecimal;)Ljava/math/BigDecimal;

    .line 59
    move-result-object v4

    .line 60
    .line 61
    sget-object p0, Lcom/kubi/broker/BrokerConfig;->a:Lcom/kubi/broker/BrokerConfig;

    .line 62
    .line 63
    .line 64
    invoke-virtual {p0}, Lcom/kubi/broker/BrokerConfig;->d()Lcom/kubi/broker/f;

    .line 65
    move-result-object p0

    .line 66
    .line 67
    .line 68
    invoke-interface {p0}, Lcom/kubi/broker/f;->x()Lcom/kubi/broker/MultiBizType;

    .line 69
    move-result-object v6

    .line 70
    .line 71
    const/16 v8, 0x20

    .line 72
    const/4 v9, 0x0

    .line 73
    const/4 v3, 0x0

    .line 74
    const/4 v7, 0x0

    .line 75
    move-object v2, p1

    .line 76
    move-object v5, p2

    .line 77
    .line 78
    .line 79
    invoke-static/range {v1 .. v9}, Lcom/kubi/futures/trade/position/vm/b0;->b0(Lcom/kubi/futures/trade/position/vm/b0;Landroidx/fragment/app/Fragment;Ljava/math/BigDecimal;Ljava/math/BigDecimal;Lcom/kubi/kumex/data/trade/model/PositionEntity;Lcom/kubi/broker/MultiBizType;ZILjava/lang/Object;)V

    .line 80
    .line 81
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 82
    return-object p0
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

.method public static final u4(Ldm/h;Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;Lcom/kubi/kumex/dialog/ResultData;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Ldm/h;->d:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/resources/widget/button/KcPrimaryButton;->l()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p2}, Lcom/kubi/kumex/dialog/ResultData;->getSuccess()Z

    .line 9
    move-result p0

    .line 10
    .line 11
    if-eqz p0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 15
    .line 16
    :cond_0
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

.method public static final v4(Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;)Lcom/kubi/kumex/data/trade/model/PositionEntity;
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
    check-cast p0, Lcom/kubi/kumex/data/trade/model/PositionEntity;

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


# virtual methods
.method public N3()I
    .locals 1

    .line 1
    const/4 v0, 0x4

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
    .annotation build Lorg/jetbrains/annotations/NotNull;
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
    sget p3, Lcom/kubi/kumex/R$layout;->bkumex_dialog_all_market_close:I

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p3, p2, v0}, Landroid/view/LayoutInflater;->inflate(ILandroid/view/ViewGroup;Z)Landroid/view/View;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    const-string p2, "inflate(...)"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    return-object p1
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
    invoke-virtual {v0}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->p4()Ldm/h;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    if-nez v1, :cond_0

    .line 19
    return-void

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-direct {v0}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->o4()Lcom/kubi/kumex/data/trade/model/PositionEntity;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/kubi/resources/dialog/DialogFragmentHelper;->dismissAllowingStateLoss()V

    .line 29
    return-void

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {}, Lcom/kubi/kumex/utils/n0;->b()Ljava/lang/String;

    .line 33
    move-result-object v3

    .line 34
    .line 35
    const/16 v7, 0xc

    .line 36
    const/4 v8, 0x0

    .line 37
    .line 38
    const-string v4, "MarketCloseAllPositionsConfirm"

    .line 39
    const/4 v5, 0x0

    .line 40
    const/4 v6, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static/range {v3 .. v8}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 44
    .line 45
    iget-object v3, v1, Ldm/h;->c:Lcom/kubi/resources/widget/AlignTopCheckBox;

    .line 46
    .line 47
    const-string v4, "cbAgain"

    .line 48
    .line 49
    .line 50
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 51
    .line 52
    new-instance v4, Lcom/kubi/futures/dialog/f0;

    .line 53
    .line 54
    .line 55
    invoke-direct {v4}, Lcom/kubi/futures/dialog/f0;-><init>()V

    .line 56
    .line 57
    .line 58
    invoke-static {v3, v4}, Lcom/kubi/utils/extensions/k;->w(Landroid/widget/CompoundButton;Lkotlin/jvm/functions/Function2;)V

    .line 59
    .line 60
    iget-object v5, v1, Ldm/h;->b:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 61
    .line 62
    const-string v3, "cancel"

    .line 63
    .line 64
    .line 65
    invoke-static {v5, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 66
    .line 67
    new-instance v8, Lcom/kubi/futures/dialog/g0;

    .line 68
    .line 69
    .line 70
    invoke-direct {v8, v0}, Lcom/kubi/futures/dialog/g0;-><init>(Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;)V

    .line 71
    const/4 v9, 0x1

    .line 72
    const/4 v10, 0x0

    .line 73
    .line 74
    const-wide/16 v6, 0x0

    .line 75
    .line 76
    .line 77
    invoke-static/range {v5 .. v10}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 78
    .line 79
    iget-object v11, v1, Ldm/h;->d:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 80
    .line 81
    const-string v3, "confirm"

    .line 82
    .line 83
    .line 84
    invoke-static {v11, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 85
    .line 86
    new-instance v14, Lcom/kubi/futures/dialog/h0;

    .line 87
    .line 88
    .line 89
    invoke-direct {v14, v1, v0, v2}, Lcom/kubi/futures/dialog/h0;-><init>(Ldm/h;Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;Lcom/kubi/kumex/data/trade/model/PositionEntity;)V

    .line 90
    const/4 v15, 0x1

    .line 91
    .line 92
    const/16 v16, 0x0

    .line 93
    .line 94
    const-wide/16 v12, 0x0

    .line 95
    .line 96
    .line 97
    invoke-static/range {v11 .. v16}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->q4()Lcom/kubi/futures/trade/position/vm/t1;

    .line 101
    move-result-object v3

    .line 102
    .line 103
    .line 104
    invoke-virtual {v3}, Lcom/kubi/futures/trade/position/vm/b0;->W()Landroidx/lifecycle/MutableLiveData;

    .line 105
    move-result-object v3

    .line 106
    .line 107
    .line 108
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getViewLifecycleOwner()Landroidx/lifecycle/LifecycleOwner;

    .line 109
    move-result-object v4

    .line 110
    .line 111
    new-instance v5, Lcom/kubi/futures/dialog/i0;

    .line 112
    .line 113
    .line 114
    invoke-direct {v5, v1, v0}, Lcom/kubi/futures/dialog/i0;-><init>(Ldm/h;Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;)V

    .line 115
    .line 116
    new-instance v6, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$a;

    .line 117
    .line 118
    .line 119
    invoke-direct {v6, v5}, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 120
    .line 121
    .line 122
    invoke-virtual {v3, v4, v6}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 123
    .line 124
    .line 125
    invoke-static {v2}, Lfm/d;->u(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Ljava/lang/CharSequence;

    .line 126
    move-result-object v3

    .line 127
    .line 128
    .line 129
    invoke-static {v2}, Lfm/d;->t(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Ljava/lang/CharSequence;

    .line 130
    move-result-object v4

    .line 131
    .line 132
    sget v5, Lcom/kubi/kumex/R$string;->kumex_position_list_all_market_close_submit_desc:I

    .line 133
    .line 134
    const-string v6, ""

    .line 135
    .line 136
    .line 137
    filled-new-array {v3, v4, v6}, [Ljava/lang/Object;

    .line 138
    move-result-object v3

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, v5, v3}, Landroidx/fragment/app/Fragment;->getString(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 142
    move-result-object v3

    .line 143
    .line 144
    const-string v4, "getString(...)"

    .line 145
    .line 146
    .line 147
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 148
    .line 149
    iget-object v4, v1, Ldm/h;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v4, v3}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 153
    .line 154
    sget-object v3, Lcom/kubi/resources/HighlightTextHelper;->a:Lcom/kubi/resources/HighlightTextHelper;

    .line 155
    .line 156
    iget-object v4, v1, Ldm/h;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 157
    .line 158
    const-string v5, "message"

    .line 159
    .line 160
    .line 161
    invoke-static {v4, v5}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 162
    .line 163
    new-instance v6, Lkotlin/Pair;

    .line 164
    .line 165
    sget-object v5, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 166
    .line 167
    new-instance v7, Landroid/text/style/ForegroundColorSpan;

    .line 168
    .line 169
    sget-object v8, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 170
    .line 171
    sget v9, Lcom/kubi/kumex/R$color;->c_text:I

    .line 172
    .line 173
    .line 174
    invoke-virtual {v8, v9}, Lcom/kubi/utils/c;->a(I)I

    .line 175
    move-result v10

    .line 176
    .line 177
    .line 178
    invoke-direct {v7, v10}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 179
    .line 180
    .line 181
    invoke-direct {v6, v5, v7}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 182
    .line 183
    new-instance v7, Lkotlin/Pair;

    .line 184
    .line 185
    sget v10, Lcom/kubi/kumex/R$font;->medium:I

    .line 186
    .line 187
    .line 188
    invoke-static {v10}, Lcom/kubi/kumex/utils/l0;->b(I)Landroid/text/style/TypefaceSpan;

    .line 189
    move-result-object v11

    .line 190
    .line 191
    const-string v12, "sans-serif-medium"

    .line 192
    .line 193
    if-nez v11, :cond_2

    .line 194
    .line 195
    new-instance v11, Landroid/text/style/TypefaceSpan;

    .line 196
    .line 197
    .line 198
    invoke-direct {v11, v12}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 199
    .line 200
    .line 201
    :cond_2
    invoke-direct {v7, v5, v11}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 202
    .line 203
    new-instance v5, Lkotlin/Pair;

    .line 204
    .line 205
    sget-object v11, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN1:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 206
    .line 207
    new-instance v13, Landroid/text/style/ForegroundColorSpan;

    .line 208
    .line 209
    iget-object v1, v1, Ldm/h;->e:Lcom/kubi/resources/widget/BaseTextView;

    .line 210
    .line 211
    .line 212
    invoke-virtual {v1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 213
    move-result-object v1

    .line 214
    .line 215
    const-string v14, "getContext(...)"

    .line 216
    .line 217
    .line 218
    invoke-static {v1, v14}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 219
    .line 220
    .line 221
    invoke-static {v2}, Lfm/d;->z(Lcom/kubi/kumex/data/trade/model/PositionEntity;)Z

    .line 222
    move-result v2

    .line 223
    .line 224
    .line 225
    invoke-static {v1, v2}, Lcom/kubi/resources/g;->f(Landroid/content/Context;Z)I

    .line 226
    move-result v1

    .line 227
    .line 228
    .line 229
    invoke-direct {v13, v1}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 230
    .line 231
    .line 232
    invoke-direct {v5, v11, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 233
    .line 234
    new-instance v1, Lkotlin/Pair;

    .line 235
    .line 236
    .line 237
    invoke-static {v10}, Lcom/kubi/kumex/utils/l0;->b(I)Landroid/text/style/TypefaceSpan;

    .line 238
    move-result-object v2

    .line 239
    .line 240
    if-nez v2, :cond_3

    .line 241
    .line 242
    new-instance v2, Landroid/text/style/TypefaceSpan;

    .line 243
    .line 244
    .line 245
    invoke-direct {v2, v12}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 246
    .line 247
    .line 248
    :cond_3
    invoke-direct {v1, v11, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 249
    move v2, v10

    .line 250
    .line 251
    new-instance v10, Lkotlin/Pair;

    .line 252
    .line 253
    sget-object v11, Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;->SPAN2:Lcom/kubi/resources/HighlightTextHelper$TextTagEnum;

    .line 254
    .line 255
    new-instance v13, Landroid/text/style/ForegroundColorSpan;

    .line 256
    .line 257
    .line 258
    invoke-virtual {v8, v9}, Lcom/kubi/utils/c;->a(I)I

    .line 259
    move-result v8

    .line 260
    .line 261
    .line 262
    invoke-direct {v13, v8}, Landroid/text/style/ForegroundColorSpan;-><init>(I)V

    .line 263
    .line 264
    .line 265
    invoke-direct {v10, v11, v13}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 266
    .line 267
    new-instance v8, Lkotlin/Pair;

    .line 268
    .line 269
    .line 270
    invoke-static {v2}, Lcom/kubi/kumex/utils/l0;->b(I)Landroid/text/style/TypefaceSpan;

    .line 271
    move-result-object v2

    .line 272
    .line 273
    if-nez v2, :cond_4

    .line 274
    .line 275
    new-instance v2, Landroid/text/style/TypefaceSpan;

    .line 276
    .line 277
    .line 278
    invoke-direct {v2, v12}, Landroid/text/style/TypefaceSpan;-><init>(Ljava/lang/String;)V

    .line 279
    .line 280
    .line 281
    :cond_4
    invoke-direct {v8, v11, v2}, Lkotlin/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    .line 282
    move-object v9, v1

    .line 283
    move-object v11, v8

    .line 284
    move-object v8, v5

    .line 285
    .line 286
    .line 287
    filled-new-array/range {v6 .. v11}, [Lkotlin/Pair;

    .line 288
    move-result-object v1

    .line 289
    .line 290
    .line 291
    invoke-virtual {v3, v4, v1}, Lcom/kubi/resources/HighlightTextHelper;->f(Landroid/widget/TextView;[Lkotlin/Pair;)V

    .line 292
    return-void
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

.method public final p4()Ldm/h;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->q0:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->u0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Ldm/h;

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

.method public final q4()Lcom/kubi/futures/trade/position/vm/t1;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/futures/dialog/MarketCloseAllPositionDialog;->r0:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/futures/trade/position/vm/t1;

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
