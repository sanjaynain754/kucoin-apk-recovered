.class public final Lcom/kubi/assets/overview/AssetOverviewFragment;
.super Lcom/kubi/mvi/state/SimpleStateFragment;
.source "AssetOverviewFragment.kt"

# interfaces
.implements Lcom/kubi/assets/AssetV2Fragment$a;
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;
.implements Lcom/kubi/assets/view/t0;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "KCFragmentCheck"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/assets/overview/AssetOverviewFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/SimpleStateFragment<",
        "Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;",
        ">;",
        "Lcom/kubi/assets/AssetV2Fragment$a;",
        "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;",
        "Lcom/kubi/assets/view/t0;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u009a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u0000 Y2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001YB\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\t\u00106\u001a\u00020(H\u0082\u0008J\u0008\u00107\u001a\u000208H\u0014J\u0012\u00109\u001a\u00020:2\u0008\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u0008\u0010=\u001a\u00020:H\u0014J\u0008\u0010>\u001a\u00020:H\u0016J\u0008\u0010?\u001a\u00020:H\u0015J\u0008\u0010@\u001a\u00020:H\u0002J\u0010\u0010A\u001a\u00020:2\u0006\u0010B\u001a\u00020(H\u0014J\u0008\u0010C\u001a\u00020:H\u0015J\u0008\u0010D\u001a\u00020:H\u0002J\u0012\u0010E\u001a\u00020:2\u0008\u0010F\u001a\u0004\u0018\u00010\u0011H\u0016J\u0010\u0010G\u001a\u00020:2\u0006\u0010F\u001a\u00020\u0011H\u0002J\u0008\u0010H\u001a\u00020:H\u0002J\u0008\u0010I\u001a\u00020:H\u0002J\u0012\u0010J\u001a\u00020:2\u0008\u0010F\u001a\u0004\u0018\u00010\u0011H\u0002J\u0010\u0010K\u001a\u00020:2\u0006\u0010L\u001a\u000208H\u0002J\u0008\u0010M\u001a\u00020:H\u0002J\u0008\u0010N\u001a\u00020:H\u0016J\u0010\u0010O\u001a\u00020:2\u0006\u0010P\u001a\u00020(H\u0002J\u0006\u0010Q\u001a\u00020:J\u0008\u0010R\u001a\u00020:H\u0016J\n\u0010X\u001a\u0004\u0018\u00010\u0011H\u0016R\u000e\u0010\u0008\u001a\u00020\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\n\u001a\u0004\u0018\u00010\u000b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010\u000f\u001a\u0004\u0008\u000c\u0010\rR\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\"\u0004\u0008\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u0012\u0012\u0004\u0012\u00020\u00180\u0017j\u0008\u0012\u0004\u0012\u00020\u0018`\u0019X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u001e\u0010\u001f\u001a\u0004\u0008\u001c\u0010\u001dR\u0014\u0010 \u001a\u0008\u0012\u0004\u0012\u00020\"0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010#\u001a\u0008\u0012\u0004\u0012\u00020%0$X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0014\u0010&\u001a\u0008\u0012\u0004\u0012\u00020\"0!X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\'\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010*\u001a\u00020(X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008+\u0010,\"\u0004\u0008-\u0010.R\u0010\u0010/\u001a\u0004\u0018\u000100X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00101\u001a\u0004\u0018\u000102X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u00103\u001a\u0004\u0018\u000104X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u00105\u001a\u00020(X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u0010S\u001a\u0010\u0012\u000c\u0008\u0001\u0012\u0008\u0012\u0004\u0012\u00020\u00020U0T8TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008V\u0010W\u00a8\u0006Z"
    }
    d2 = {
        "Lcom/kubi/assets/overview/AssetOverviewFragment;",
        "Lcom/kubi/mvi/state/SimpleStateFragment;",
        "Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;",
        "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;",
        "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;",
        "Lcom/kubi/assets/view/IAssetV2OverviewEntityGet;",
        "<init>",
        "()V",
        "lastRotation",
        "",
        "binding",
        "Lcom/kubi/assets/databinding/FragmentAssetOverviewBinding;",
        "getBinding",
        "()Lcom/kubi/assets/databinding/FragmentAssetOverviewBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "overviewEntity",
        "Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
        "getOverviewEntity",
        "()Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
        "setOverviewEntity",
        "(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V",
        "fragmentList",
        "Ljava/util/ArrayList;",
        "Lcom/kubi/sdk/BaseFragment;",
        "Lkotlin/collections/ArrayList;",
        "dynamicsAdapter",
        "Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;",
        "getDynamicsAdapter",
        "()Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;",
        "dynamicsAdapter$delegate",
        "Lkotlin/Lazy;",
        "mDynamicsBarList",
        "",
        "Lcom/kubi/assets/entity/DynamicsEntity;",
        "mDynamicsBarIdSet",
        "",
        "",
        "mDynamicsCardList",
        "isOnCoinPage",
        "",
        "isFirst",
        "needLoadingView",
        "getNeedLoadingView",
        "()Z",
        "setNeedLoadingView",
        "(Z)V",
        "loadingView",
        "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;",
        "newOverviewEntity",
        "Lcom/kubi/assets/entity/NewOverviewEntity;",
        "oldOverviewEntity",
        "Lcom/kubi/assets/entity/OldOverviewEntity;",
        "isMiniChartVisible",
        "checkFragmentValid",
        "getLayout",
        "",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "bindFlowEvent",
        "lazyLoad",
        "initView",
        "loadData",
        "onViewHideOrShowToggle",
        "show",
        "bindState",
        "lineChartBindState",
        "onAssetsGet",
        "myAssetEntity",
        "sendLineChartEvent",
        "bindLineChartFlowEvent",
        "goCoinGuide",
        "updateNewView",
        "showFilterIcon",
        "position",
        "hideRefresh",
        "onRefresh",
        "showOrHideDynamicsBar",
        "visible",
        "adjustHeaderBottomSpace",
        "onShow",
        "vmClass",
        "Lkotlin/reflect/KClass;",
        "Lcom/kubi/mvi/state/SimpleStateVM;",
        "getVmClass",
        "()Lkotlin/reflect/KClass;",
        "assetV2OverviewEntityGet",
        "Companion",
        "AssetsCenterLib_googleRelease"
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
        "SMAP\nAssetOverviewFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 4 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 5 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,765:1\n147#2,16:766\n158#3,2:782\n158#3,2:784\n158#3,2:786\n81#3,2:788\n158#3,2:790\n153#3,7:792\n81#3,2:818\n158#3,2:820\n81#3,2:822\n81#3,2:824\n135#4,2:799\n135#4,2:801\n135#4,2:803\n808#5,11:805\n1869#5,2:816\n*S KotlinDebug\n*F\n+ 1 AssetOverviewFragment.kt\ncom/kubi/assets/overview/AssetOverviewFragment\n*L\n98#1:766,16\n160#1:782,2\n170#1:784,2\n175#1:786,2\n179#1:788,2\n185#1:790,2\n190#1:792,7\n619#1:818,2\n628#1:820,2\n642#1:822,2\n647#1:824,2\n433#1:799,2\n434#1:801,2\n452#1:803,2\n581#1:805,11\n581#1:816,2\n*E\n"
    }
.end annotation


# static fields
.field public static final i0:Lcom/kubi/assets/overview/AssetOverviewFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic j0:[Lkotlin/reflect/KProperty;
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
.field public final U:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public V:Lcom/kubi/assets/entity/AssetV2OverviewEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public W:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/kubi/sdk/BaseFragment;",
            ">;"
        }
    .end annotation
.end field

.field public final X:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Y:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/DynamicsEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public Z:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public a0:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/kubi/assets/entity/DynamicsEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public b0:Z

.field public c0:Z

.field public d0:Z

.field public e0:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public f0:Lcom/kubi/assets/entity/NewOverviewEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public g0:Lcom/kubi/assets/entity/OldOverviewEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public h0:Z


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getBinding()Lcom/kubi/assets/databinding/FragmentAssetOverviewBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/assets/overview/AssetOverviewFragment;

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
    sput-object v1, Lcom/kubi/assets/overview/AssetOverviewFragment;->j0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/assets/overview/AssetOverviewFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/assets/overview/AssetOverviewFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->i0:Lcom/kubi/assets/overview/AssetOverviewFragment$Companion;

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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/mvi/state/SimpleStateFragment;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/assets/overview/AssetOverviewFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/assets/overview/AssetOverviewFragment$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/assets/overview/AssetOverviewFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->U:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    new-instance v0, Lcom/kubi/assets/overview/q;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/kubi/assets/overview/q;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iput-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->X:Lkotlin/Lazy;

    .line 28
    .line 29
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 33
    .line 34
    iput-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Y:Ljava/util/List;

    .line 35
    .line 36
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 37
    .line 38
    .line 39
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 40
    .line 41
    iput-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Z:Ljava/util/Set;

    .line 42
    .line 43
    new-instance v0, Ljava/util/ArrayList;

    .line 44
    .line 45
    .line 46
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 47
    .line 48
    iput-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->a0:Ljava/util/List;

    .line 49
    const/4 v0, 0x1

    .line 50
    .line 51
    iput-boolean v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->c0:Z

    .line 52
    .line 53
    iput-boolean v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->h0:Z

    .line 54
    .line 55
    const-string v0, "B1overview"

    .line 56
    .line 57
    .line 58
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 59
    return-void
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
.end method

.method public static synthetic A3(Lcom/kubi/assets/overview/AssetOverviewFragment;Lcom/google/android/material/appbar/AppBarLayout;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/assets/overview/AssetOverviewFragment;->p4(Lcom/kubi/assets/overview/AssetOverviewFragment;Lcom/google/android/material/appbar/AppBarLayout;I)V

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
.end method

.method public static synthetic B3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/AssetOverviewFragment;->j4()Lkotlin/Unit;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static synthetic C3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->o4(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lkotlin/Unit;

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
.end method

.method public static synthetic D3(Lcom/kubi/assets/overview/AssetOverviewFragment;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/AssetOverviewFragment;->n4(Lcom/kubi/assets/overview/AssetOverviewFragment;Ljava/lang/Boolean;)V

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
.end method

.method public static final synthetic E3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lta/p3;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

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
.end method

.method public static final synthetic F3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->d4()Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;

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
.end method

.method public static final synthetic G3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Ljava/util/ArrayList;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->W:Ljava/util/ArrayList;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic H3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lcom/kubi/sdk/widget/loading/WrapperLoadingView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->e0:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic I3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Ljava/util/Set;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Z:Ljava/util/Set;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic J3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Y:Ljava/util/List;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic K3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Ljava/util/List;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->a0:Ljava/util/List;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic L3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lcom/kubi/assets/entity/NewOverviewEntity;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->f0:Lcom/kubi/assets/entity/NewOverviewEntity;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic M3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lcom/kubi/assets/entity/OldOverviewEntity;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->g0:Lcom/kubi/assets/entity/OldOverviewEntity;

    .line 3
    return-object p0
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
.end method

.method public static final synthetic N3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateFragment;->getState()Lcom/kubi/mvi/state/f;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;

    .line 7
    return-object p0
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
.end method

.method public static final synthetic O3(Lcom/kubi/assets/overview/AssetOverviewFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->f4()V

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
.end method

.method public static final synthetic P3(Lcom/kubi/assets/overview/AssetOverviewFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->g4()V

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
.end method

.method public static final synthetic Q3(Lcom/kubi/assets/overview/AssetOverviewFragment;Lcom/kubi/mvi/state/d;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

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
.end method

.method public static final synthetic R3(Lcom/kubi/assets/overview/AssetOverviewFragment;Ljava/util/Set;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Z:Ljava/util/Set;

    .line 3
    return-void
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
.end method

.method public static final synthetic S3(Lcom/kubi/assets/overview/AssetOverviewFragment;Ljava/util/List;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Y:Ljava/util/List;

    .line 3
    return-void
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
.end method

.method public static final synthetic T3(Lcom/kubi/assets/overview/AssetOverviewFragment;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->h0:Z

    .line 3
    return-void
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
.end method

.method public static final synthetic U3(Lcom/kubi/assets/overview/AssetOverviewFragment;Lcom/kubi/assets/entity/NewOverviewEntity;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->f0:Lcom/kubi/assets/entity/NewOverviewEntity;

    .line 3
    return-void
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
.end method

.method public static final synthetic V3(Lcom/kubi/assets/overview/AssetOverviewFragment;Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->b0:Z

    .line 3
    return-void
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
.end method

.method public static final synthetic W3(Lcom/kubi/assets/overview/AssetOverviewFragment;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/AssetOverviewFragment;->B4(I)V

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
.end method

.method public static final synthetic X3(Lcom/kubi/assets/overview/AssetOverviewFragment;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/AssetOverviewFragment;->C4(Z)V

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
.end method

.method public static final synthetic Y3(Lcom/kubi/assets/overview/AssetOverviewFragment;Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/AssetOverviewFragment;->D4(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

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
.end method

.method public static final b4(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 6
    return-object v0
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
.end method

.method public static final h4(Lcom/kubi/assets/overview/AssetOverviewFragment;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    move-result p1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 16
    return-void
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
.end method

.method public static final i4()Lkotlin/Unit;
    .locals 10

    .line 1
    .line 2
    const-string v0, "after_page_id"

    .line 3
    .line 4
    const-string v1, "B1depositCoinList"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "norm_version"

    .line 11
    .line 12
    const-string v2, "1"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/kubi/assets/dialog/payment/j;->a()Z

    .line 20
    move-result v2

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    const-string v3, "isABNew"

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v1, v2}, [Lkotlin/Pair;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    const-string v1, "B1overview"

    .line 37
    .line 38
    const-string v2, "deposit"

    .line 39
    .line 40
    const-string v3, "zeroBalance"

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2, v3, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 44
    .line 45
    sget-object v4, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v2, v3}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v5

    .line 50
    const/4 v8, 0x2

    .line 51
    const/4 v9, 0x0

    .line 52
    const/4 v6, 0x0

    .line 53
    const/4 v7, 0x0

    .line 54
    .line 55
    .line 56
    invoke-static/range {v4 .. v9}, Lcom/kubi/assets/service/AssetsHelper;->F(Lcom/kubi/assets/service/AssetsHelper;Ljava/lang/String;IZILjava/lang/Object;)V

    .line 57
    .line 58
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    return-object v0
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
.end method

.method public static final j4()Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    const-string v0, "after_page_id"

    .line 3
    .line 4
    const-string v1, "B7FastTrade"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "norm_version"

    .line 11
    .line 12
    const-string v2, "1"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    const-string v1, "B1overview"

    .line 23
    .line 24
    const-string v2, "buyFiat"

    .line 25
    .line 26
    const-string v3, "zeroBalance"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2, v3, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 30
    .line 31
    sget-object v0, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v2, v3}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1}, Lcom/kubi/assets/service/AssetsHelper;->z(Ljava/lang/String;)V

    .line 39
    .line 40
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 41
    return-object v0
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
.end method

.method public static final k4()Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    const-string v0, "after_page_id"

    .line 3
    .line 4
    const-string v1, "B7FastTrade"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "norm_version"

    .line 11
    .line 12
    const-string v2, "1"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    filled-new-array {v0, v1}, [Lkotlin/Pair;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    const-string v1, "B1overview"

    .line 23
    .line 24
    const-string v2, "buyP2P"

    .line 25
    .line 26
    const-string v3, "zeroBalance"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, v2, v3, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 30
    .line 31
    sget-object v0, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 32
    const/4 v1, 0x0

    .line 33
    const/4 v2, 0x1

    .line 34
    .line 35
    .line 36
    invoke-static {v0, v1, v2, v1}, Lcom/kubi/assets/service/AssetsHelper;->K(Lcom/kubi/assets/service/AssetsHelper;Ljava/lang/String;ILjava/lang/Object;)V

    .line 37
    .line 38
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 39
    return-object v0
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
.end method

.method public static final l4()Lkotlin/Unit;
    .locals 4

    .line 1
    .line 2
    const-string v0, "after_page_id"

    .line 3
    .line 4
    const-string v1, "B7FiatList"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-string v1, "norm_version"

    .line 11
    .line 12
    const-string v2, "1"

    .line 13
    .line 14
    .line 15
    invoke-static {v1, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-static {}, Lcom/kubi/assets/dialog/payment/j;->a()Z

    .line 20
    move-result v2

    .line 21
    .line 22
    .line 23
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    const-string v3, "isABNew"

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    filled-new-array {v0, v1, v2}, [Lkotlin/Pair;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    const-string v1, "B1overview"

    .line 37
    .line 38
    const-string v2, "depositFiat"

    .line 39
    .line 40
    const-string v3, "zeroBalance"

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v2, v3, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 44
    .line 45
    sget-object v0, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 46
    .line 47
    .line 48
    invoke-static {v1, v2, v3}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 49
    move-result-object v1

    .line 50
    const/4 v2, 0x1

    .line 51
    const/4 v3, 0x0

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1, v2, v3}, Lcom/kubi/assets/service/AssetsHelper;->E(Ljava/lang/String;IZ)V

    .line 55
    .line 56
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 57
    return-object v0
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
.end method

.method public static synthetic m3()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/AssetOverviewFragment;->m4()V

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
.end method

.method public static final m4()V
    .locals 10

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/assets/service/AssetsHelper;->L()V

    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x4

    .line 8
    .line 9
    const-string v2, "B1overview_charge_record_load"

    .line 10
    .line 11
    const-string v3, "page_load_start"

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3, v0, v1, v0}, Lqq/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 15
    .line 16
    const/16 v8, 0x8

    .line 17
    const/4 v9, 0x0

    .line 18
    .line 19
    const-string v4, "B1overview"

    .line 20
    .line 21
    const-string v5, "record"

    .line 22
    .line 23
    const-string v6, "1"

    .line 24
    const/4 v7, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static/range {v4 .. v9}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

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
.end method

.method public static synthetic n3(Landroid/content/DialogInterface;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/AssetOverviewFragment;->r4(Landroid/content/DialogInterface;I)V

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
.end method

.method public static final n4(Lcom/kubi/assets/overview/AssetOverviewFragment;Ljava/lang/Boolean;)V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;

    .line 3
    .line 4
    .line 5
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    move-result p1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, p1}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;-><init>(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 16
    return-void
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
.end method

.method public static synthetic o3(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->t4(Ljava/lang/Boolean;)V

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
.end method

.method public static final o4(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->y4()V

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
.end method

.method public static synthetic p3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/AssetOverviewFragment;->i4()Lkotlin/Unit;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final p4(Lcom/kubi/assets/overview/AssetOverviewFragment;Lcom/google/android/material/appbar/AppBarLayout;I)V
    .locals 0

    .line 1
    .line 2
    if-nez p2, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    iget-object p0, p0, Lta/p3;->s:Lcom/kubi/resources/widget/KuCoinRefreshLayout;

    .line 11
    .line 12
    if-eqz p0, :cond_1

    .line 13
    const/4 p1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setEnableRefresh(Z)Lhb0/f;

    .line 17
    return-void

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    if-eqz p0, :cond_1

    .line 24
    .line 25
    iget-object p0, p0, Lta/p3;->s:Lcom/kubi/resources/widget/KuCoinRefreshLayout;

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    const/4 p1, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, p1}, Lcom/scwang/smart/refresh/layout/SmartRefreshLayout;->setEnableRefresh(Z)Lhb0/f;

    .line 32
    :cond_1
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
.end method

.method public static synthetic q3(Lcom/kubi/assets/overview/AssetOverviewFragment;Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/AssetOverviewFragment;->h4(Lcom/kubi/assets/overview/AssetOverviewFragment;Ljava/lang/Boolean;)V

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
.end method

.method public static final q4(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    sget v1, Lcom/kubi/assets/R$string;->kc_assets_coin_desc_1:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v1}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const/16 v1, 0xa

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    sget v2, Lcom/kubi/assets/R$string;->kc_assets_coin_desc_2:I

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v2}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    sget v1, Lcom/kubi/assets/R$string;->kc_assets_coin_desc_site_3:I

    .line 34
    .line 35
    sget-object v2, Lhf/b;->a:Lhf/b;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2}, Lhf/b;->a()Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    filled-new-array {v2}, [Ljava/lang/Object;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v1, v2}, Lcom/kubi/sdk/BaseFragment;->getStringRes(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    sget-object v1, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->a1:Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper$Companion;->newInstanceAlert()Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    sget v2, Lcom/kubi/assets/R$string;->kc_assets_coin_intro:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->X4(I)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1, v0}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->M4(Ljava/lang/CharSequence;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    sget v1, Lcom/kubi/assets/R$string;->already_know:I

    .line 73
    .line 74
    new-instance v2, Lcom/kubi/assets/overview/o;

    .line 75
    .line 76
    .line 77
    invoke-direct {v2}, Lcom/kubi/assets/overview/o;-><init>()V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1, v2}, Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;->S4(ILandroid/content/DialogInterface$OnClickListener;)Lcom/kubi/resources/dialog/AlertDialogFragmentHelper;

    .line 81
    move-result-object v0

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 85
    move-result-object p0

    .line 86
    .line 87
    const-string v1, "getChildFragmentManager(...)"

    .line 88
    .line 89
    .line 90
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    const-string v1, "AlertDialogFragmentHelper"

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, p0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 96
    .line 97
    sget-object p0, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 98
    .line 99
    const-string v0, "info"

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0, v0}, Lcom/kubi/assets/overview/b1;->x(Ljava/lang/String;)V

    .line 103
    .line 104
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 105
    return-object p0
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
.end method

.method public static synthetic r3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->b4(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;

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
.end method

.method public static final r4(Landroid/content/DialogInterface;I)V
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
.end method

.method public static synthetic s3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->q4(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lkotlin/Unit;

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
.end method

.method public static final s4(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/coin/SmallAssetHideDialog;

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/assets/overview/n;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lcom/kubi/assets/overview/n;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/kubi/assets/overview/coin/SmallAssetHideDialog;-><init>(Lio/reactivex/functions/Consumer;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    const-string v1, "getChildFragmentManager(...)"

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    const-string v1, "SmallAssetHideDialog"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 25
    .line 26
    sget-object p0, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 27
    .line 28
    const-string v0, "hide"

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0}, Lcom/kubi/assets/overview/b1;->x(Ljava/lang/String;)V

    .line 32
    .line 33
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
.end method

.method public static synthetic t3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->u4(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lkotlin/Unit;

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
.end method

.method public static final t4(Ljava/lang/Boolean;)V
    .locals 6

    .line 1
    const/4 v4, 0x4

    .line 2
    const/4 v5, 0x0

    .line 3
    .line 4
    const-string v0, "event_hide_small_asset"

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    move-object v1, p0

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 11
    return-void
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
.end method

.method public static synthetic u3(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->s4(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lkotlin/Unit;

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
.end method

.method public static final u4(Lcom/kubi/assets/overview/AssetOverviewFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/account/AccountSettingDialog;

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/assets/overview/p;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lcom/kubi/assets/overview/p;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1}, Lcom/kubi/assets/overview/account/AccountSettingDialog;-><init>(Lio/reactivex/functions/Consumer;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    const-string v1, "getChildFragmentManager(...)"

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 20
    .line 21
    const-string v1, "AccountSettingDialog"

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, p0, v1}, Lcom/kubi/resources/dialog/BaseDialogFragment;->show(Landroidx/fragment/app/FragmentManager;Ljava/lang/String;)V

    .line 25
    .line 26
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 27
    return-object p0
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
.end method

.method public static synthetic v3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/AssetOverviewFragment;->k4()Lkotlin/Unit;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method public static final v4(Ljava/lang/Boolean;)V
    .locals 6

    .line 1
    const/4 v4, 0x4

    .line 2
    const/4 v5, 0x0

    .line 3
    .line 4
    const-string v0, "EVENT_HIDE_SMALL_ASSET_ACCOUNT"

    .line 5
    .line 6
    const-wide/16 v2, 0x0

    .line 7
    move-object v1, p0

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 11
    return-void
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
.end method

.method public static synthetic w3(Ljava/lang/Boolean;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->v4(Ljava/lang/Boolean;)V

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
.end method

.method public static final w4(Lcom/kubi/assets/overview/AssetOverviewFragment;Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 9

    .line 1
    .line 2
    if-ltz p3, :cond_e

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getData()Ljava/util/List;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    .line 9
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 10
    move-result p1

    .line 11
    const/4 p2, 0x1

    .line 12
    sub-int/2addr p1, p2

    .line 13
    .line 14
    if-le p3, p1, :cond_0

    .line 15
    .line 16
    goto/16 :goto_9

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->d4()Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, p3}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    check-cast p1, Lcom/kubi/assets/entity/DynamicsEntity;

    .line 27
    .line 28
    iget-object p3, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Z:Ljava/util/Set;

    .line 29
    const/4 v0, 0x0

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getId()Ljava/lang/String;

    .line 35
    move-result-object v1

    .line 36
    goto :goto_0

    .line 37
    :cond_1
    move-object v1, v0

    .line 38
    .line 39
    .line 40
    :goto_0
    invoke-static {v1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-interface {p3, v1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    const-string p3, "key_overview_dynamics_bar"

    .line 47
    .line 48
    iget-object v1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Z:Ljava/util/Set;

    .line 49
    .line 50
    const-string v2, "asset"

    .line 51
    .line 52
    .line 53
    invoke-static {v2, p3, v1}, Ly70/e;->p(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ly70/e;

    .line 54
    .line 55
    iget-object p0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Y:Ljava/util/List;

    .line 56
    .line 57
    .line 58
    invoke-static {p0}, Lkotlin/jvm/internal/TypeIntrinsics;->asMutableCollection(Ljava/lang/Object;)Ljava/util/Collection;

    .line 59
    move-result-object p0

    .line 60
    .line 61
    .line 62
    invoke-interface {p0, p1}, Ljava/util/Collection;->remove(Ljava/lang/Object;)Z

    .line 63
    .line 64
    if-eqz p1, :cond_2

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getUrl()Ljava/lang/String;

    .line 68
    move-result-object p0

    .line 69
    goto :goto_1

    .line 70
    :cond_2
    move-object p0, v0

    .line 71
    .line 72
    :goto_1
    if-eqz p0, :cond_5

    .line 73
    .line 74
    .line 75
    invoke-interface {p0}, Ljava/lang/CharSequence;->length()I

    .line 76
    move-result p0

    .line 77
    .line 78
    if-nez p0, :cond_3

    .line 79
    goto :goto_3

    .line 80
    .line 81
    :cond_3
    if-eqz p1, :cond_4

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getUrl()Ljava/lang/String;

    .line 85
    move-result-object p0

    .line 86
    goto :goto_2

    .line 87
    :cond_4
    move-object p0, v0

    .line 88
    .line 89
    .line 90
    :goto_2
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 91
    move-result-object p0

    .line 92
    .line 93
    .line 94
    invoke-static {p0}, Lcom/kubi/router/utils/RouteExKt;->H(Ljava/lang/String;)Z

    .line 95
    goto :goto_7

    .line 96
    .line 97
    :cond_5
    :goto_3
    if-eqz p1, :cond_7

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getDynamicsType()Ljava/lang/Integer;

    .line 101
    move-result-object p0

    .line 102
    .line 103
    if-nez p0, :cond_6

    .line 104
    goto :goto_4

    .line 105
    .line 106
    .line 107
    :cond_6
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 108
    move-result p0

    .line 109
    .line 110
    if-nez p0, :cond_7

    .line 111
    goto :goto_5

    .line 112
    .line 113
    :cond_7
    :goto_4
    if-eqz p1, :cond_9

    .line 114
    .line 115
    .line 116
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getDynamicsType()Ljava/lang/Integer;

    .line 117
    move-result-object p0

    .line 118
    .line 119
    if-nez p0, :cond_8

    .line 120
    goto :goto_6

    .line 121
    .line 122
    .line 123
    :cond_8
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 124
    move-result p0

    .line 125
    .line 126
    if-ne p0, p2, :cond_9

    .line 127
    .line 128
    :goto_5
    sget-object v1, Lf00/a;->a:Lf00/a;

    .line 129
    .line 130
    .line 131
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getId()Ljava/lang/String;

    .line 132
    move-result-object p0

    .line 133
    .line 134
    .line 135
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    .line 139
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getDynamicsType()Ljava/lang/Integer;

    .line 140
    move-result-object p0

    .line 141
    .line 142
    .line 143
    invoke-virtual {p0}, Ljava/lang/Integer;->toString()Ljava/lang/String;

    .line 144
    move-result-object v3

    .line 145
    .line 146
    const/16 v7, 0x1c

    .line 147
    const/4 v8, 0x0

    .line 148
    const/4 v4, 0x0

    .line 149
    const/4 v5, 0x0

    .line 150
    const/4 v6, 0x0

    .line 151
    .line 152
    .line 153
    invoke-static/range {v1 .. v8}, Lg00/a$a;->h(Lg00/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 154
    goto :goto_7

    .line 155
    .line 156
    :cond_9
    :goto_6
    if-eqz p1, :cond_b

    .line 157
    .line 158
    .line 159
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getDynamicsType()Ljava/lang/Integer;

    .line 160
    move-result-object p0

    .line 161
    .line 162
    if-nez p0, :cond_a

    .line 163
    goto :goto_7

    .line 164
    .line 165
    .line 166
    :cond_a
    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    .line 167
    move-result p0

    .line 168
    const/4 p2, 0x2

    .line 169
    .line 170
    if-ne p0, p2, :cond_b

    .line 171
    .line 172
    sget-object v1, Lf00/a;->a:Lf00/a;

    .line 173
    .line 174
    const/16 v6, 0xe

    .line 175
    const/4 v7, 0x0

    .line 176
    .line 177
    const-string v2, "finance"

    .line 178
    const/4 v3, 0x0

    .line 179
    const/4 v4, 0x0

    .line 180
    const/4 v5, 0x0

    .line 181
    .line 182
    .line 183
    invoke-static/range {v1 .. v7}, Lg00/f$a;->b(Lg00/f;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 184
    .line 185
    :cond_b
    :goto_7
    sget-object p0, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 186
    .line 187
    if-eqz p1, :cond_c

    .line 188
    .line 189
    .line 190
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getDynamicsType()Ljava/lang/Integer;

    .line 191
    move-result-object p2

    .line 192
    goto :goto_8

    .line 193
    :cond_c
    move-object p2, v0

    .line 194
    .line 195
    .line 196
    :goto_8
    invoke-static {p2}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 197
    move-result p2

    .line 198
    .line 199
    if-eqz p1, :cond_d

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1}, Lcom/kubi/assets/entity/DynamicsEntity;->getStyle()Ljava/lang/String;

    .line 203
    move-result-object v0

    .line 204
    .line 205
    .line 206
    :cond_d
    invoke-static {v0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 207
    move-result-object p1

    .line 208
    .line 209
    .line 210
    invoke-virtual {p0, p2, p1}, Lcom/kubi/assets/overview/b1;->f(ILjava/lang/String;)V

    .line 211
    :cond_e
    :goto_9
    return-void
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
.end method

.method public static synthetic x3(Lcom/kubi/assets/overview/AssetOverviewFragment;Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/assets/overview/AssetOverviewFragment;->w4(Lcom/kubi/assets/overview/AssetOverviewFragment;Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

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
.end method

.method public static synthetic y3()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/AssetOverviewFragment;->l4()Lkotlin/Unit;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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
.end method

.method private final y4()V
    .locals 6

    .line 1
    const/4 v4, 0x6

    .line 2
    const/4 v5, 0x0

    .line 3
    .line 4
    const-string v0, "event_refresh_overview"

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    const-wide/16 v2, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static/range {v0 .. v5}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    .line 18
    iget-object v0, v0, Lta/p3;->z:Lcom/kubi/resources/widget/CustomViewPager;

    .line 19
    .line 20
    if-eqz v0, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 24
    move-result v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, -0x1

    .line 27
    :goto_0
    const/4 v1, 0x0

    .line 28
    .line 29
    .line 30
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    move-result-object v1

    .line 32
    const/4 v2, 0x2

    .line 33
    .line 34
    .line 35
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 36
    move-result-object v2

    .line 37
    .line 38
    .line 39
    filled-new-array {v1, v2}, [Ljava/lang/Integer;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf([Ljava/lang/Object;)Ljava/util/List;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    .line 47
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    .line 51
    invoke-interface {v1, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 52
    move-result v1

    .line 53
    .line 54
    if-eqz v1, :cond_3

    .line 55
    .line 56
    iget-object v1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->W:Ljava/util/ArrayList;

    .line 57
    const/4 v2, 0x0

    .line 58
    .line 59
    if-nez v1, :cond_1

    .line 60
    .line 61
    const-string v1, "fragmentList"

    .line 62
    .line 63
    .line 64
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 65
    move-object v1, v2

    .line 66
    .line 67
    .line 68
    :cond_1
    invoke-static {v1, v0}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    instance-of v1, v0, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;

    .line 72
    .line 73
    if-eqz v1, :cond_2

    .line 74
    move-object v2, v0

    .line 75
    .line 76
    check-cast v2, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;

    .line 77
    .line 78
    :cond_2
    if-eqz v2, :cond_3

    .line 79
    .line 80
    .line 81
    invoke-interface {v2}, Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;->onRefresh()V

    .line 82
    .line 83
    :cond_3
    sget-object v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetDynamicsData;->INSTANCE:Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetDynamicsData;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 87
    return-void
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
.end method

.method public static synthetic z3(Lcom/kubi/assets/overview/AssetOverviewFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->z4(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

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
.end method

.method public static final z4(Lcom/kubi/assets/overview/AssetOverviewFragment;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lta/p3;->s:Lcom/kubi/resources/widget/KuCoinRefreshLayout;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v1, 0x1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/KuCoinRefreshLayout;->setRefreshing(Z)V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-direct {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->y4()V

    .line 18
    return-void
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
.end method


# virtual methods
.method public final A4(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V
    .locals 6

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->h0:Z

    .line 3
    .line 4
    const-string v1, "LAST_1_DAY"

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    new-instance v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetLineChartPoint;

    .line 9
    .line 10
    sget-object v2, Lcom/kubi/assets/overview/AssetOverviewFragment;->i0:Lcom/kubi/assets/overview/AssetOverviewFragment$Companion;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v2}, Lcom/kubi/assets/overview/AssetOverviewFragment$Companion;->getLineChartRange()Ljava/lang/String;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    move-object v2, v1

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-direct {v0, v2}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetLineChartPoint;-><init>(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 24
    .line 25
    :cond_1
    sget-object v0, Lcom/kubi/profit/loss/analysis/api/a;->a:Lcom/kubi/profit/loss/analysis/api/a;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lcom/kubi/profit/loss/analysis/api/a;->o()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotalAssetValue()Ljava/math/BigDecimal;

    .line 32
    move-result-object v2

    .line 33
    const/4 v3, 0x0

    .line 34
    .line 35
    if-eqz v2, :cond_3

    .line 36
    .line 37
    iget-object v4, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->V:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 38
    .line 39
    if-eqz v4, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v4}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 43
    move-result-object v4

    .line 44
    goto :goto_0

    .line 45
    :cond_2
    move-object v4, v3

    .line 46
    .line 47
    :goto_0
    sget-object v5, Lhf/b;->a:Lhf/b;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v5}, Lhf/b;->a()Ljava/lang/String;

    .line 51
    move-result-object v5

    .line 52
    .line 53
    .line 54
    invoke-static {v2, v4, v5}, Lkf/a;->A(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 55
    move-result-object v2

    .line 56
    goto :goto_1

    .line 57
    :cond_3
    move-object v2, v3

    .line 58
    :goto_1
    const/4 v4, 0x1

    .line 59
    .line 60
    .line 61
    invoke-static {v2, v3, v4, v3}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2, p1}, Lcom/kubi/profit/loss/analysis/api/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)V

    .line 70
    .line 71
    new-instance p1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetProfitLoss;

    .line 72
    .line 73
    sget-object v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->i0:Lcom/kubi/assets/overview/AssetOverviewFragment$Companion;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment$Companion;->getLineChartRange()Ljava/lang/String;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    if-nez v0, :cond_4

    .line 80
    goto :goto_2

    .line 81
    :cond_4
    move-object v1, v0

    .line 82
    .line 83
    .line 84
    :goto_2
    invoke-direct {p1, v1}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetProfitLoss;-><init>(Ljava/lang/String;)V

    .line 85
    .line 86
    .line 87
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 91
    move-result-object p1

    .line 92
    .line 93
    if-eqz p1, :cond_5

    .line 94
    .line 95
    iget-object p1, p1, Lta/p3;->r:Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;

    .line 96
    .line 97
    if-eqz p1, :cond_5

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1}, Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;->getAccountInfoHeader()Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    if-eqz p1, :cond_5

    .line 104
    .line 105
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->f0:Lcom/kubi/assets/entity/NewOverviewEntity;

    .line 106
    .line 107
    iget-object v1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->V:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1, v0, v1}, Lcom/kubi/assets/view/AccountInfoHeaderView;->G(Lcom/kubi/assets/entity/NewOverviewEntity;Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

    .line 111
    :cond_5
    return-void
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
.end method

.method public final B4(I)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->V:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->hasZeroAccount()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 12
    move-result-object v0

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    const/4 v0, 0x0

    .line 15
    :goto_0
    const/4 v1, 0x1

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    if-eqz v0, :cond_1

    .line 22
    .line 23
    if-ne p1, v1, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    if-eqz p1, :cond_2

    .line 30
    .line 31
    iget-object p1, p1, Lta/p3;->i:Lcom/kubi/sdk/widget/shape/view/ShapeImageView;

    .line 32
    .line 33
    if-eqz p1, :cond_2

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v1}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 37
    return-void

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 41
    move-result-object p1

    .line 42
    .line 43
    if-eqz p1, :cond_2

    .line 44
    .line 45
    iget-object p1, p1, Lta/p3;->i:Lcom/kubi/sdk/widget/shape/view/ShapeImageView;

    .line 46
    .line 47
    if-eqz p1, :cond_2

    .line 48
    const/4 v0, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static {p1, v0}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 52
    :cond_2
    return-void
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
.end method

.method public final C4(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lta/p3;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, p1}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->Z3()V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    iget-object v0, v0, Lta/p3;->x:Landroid/view/View;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-static {v0, p1}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 30
    :cond_1
    return-void
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
.end method

.method public final D4(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V
    .locals 16

    .line 1
    .line 2
    move-object/from16 v0, p1

    .line 3
    .line 4
    .line 5
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    iget-object v1, v1, Lta/p3;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    const/16 v2, 0x8

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setVisibility(I)V

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    if-eqz v1, :cond_1

    .line 24
    .line 25
    iget-object v1, v1, Lta/p3;->e:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 26
    .line 27
    if-eqz v1, :cond_1

    .line 28
    const/4 v2, 0x0

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1, v2}, Landroid/view/View;->setVisibility(I)V

    .line 32
    .line 33
    :cond_1
    if-eqz v0, :cond_7

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotal()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 37
    move-result-object v1

    .line 38
    const/4 v2, 0x0

    .line 39
    .line 40
    if-eqz v1, :cond_2

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    if-eqz v1, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 50
    move-result-object v3

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 54
    move-result-object v4

    .line 55
    .line 56
    .line 57
    invoke-static {v4}, Lcom/kubi/assets/view/q;->b(Ljava/lang/String;)I

    .line 58
    move-result v4

    .line 59
    .line 60
    .line 61
    invoke-static {v1, v3, v4}, Lgf/i;->a(Ljava/math/BigDecimal;Ljava/lang/String;I)Ljava/lang/String;

    .line 62
    move-result-object v1

    .line 63
    goto :goto_0

    .line 64
    :cond_2
    move-object v1, v2

    .line 65
    .line 66
    :goto_0
    const-string v3, "--"

    .line 67
    .line 68
    .line 69
    invoke-static {v1, v3}, Lcom/kubi/utils/extensions/f;->i(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotal()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 74
    move-result-object v3

    .line 75
    .line 76
    if-eqz v3, :cond_3

    .line 77
    .line 78
    .line 79
    invoke-virtual {v3}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 80
    move-result-object v3

    .line 81
    .line 82
    if-eqz v3, :cond_3

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 86
    move-result-object v4

    .line 87
    .line 88
    .line 89
    invoke-static {v3, v4}, Lkf/a;->n(Ljava/math/BigDecimal;Ljava/lang/String;)D

    .line 90
    move-result-wide v5

    .line 91
    .line 92
    const/16 v14, 0x2f

    .line 93
    const/4 v15, 0x0

    .line 94
    const/4 v7, 0x0

    .line 95
    const/4 v8, 0x0

    .line 96
    const/4 v9, 0x0

    .line 97
    const/4 v10, 0x0

    .line 98
    const/4 v11, 0x1

    .line 99
    const/4 v12, 0x0

    .line 100
    const/4 v13, 0x1

    .line 101
    .line 102
    .line 103
    invoke-static/range {v5 .. v15}, Lkf/a;->x(DLjava/lang/String;Ljava/math/RoundingMode;IZZZZILjava/lang/Object;)Ljava/lang/String;

    .line 104
    move-result-object v3

    .line 105
    goto :goto_1

    .line 106
    :cond_3
    move-object v3, v2

    .line 107
    .line 108
    .line 109
    :goto_1
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 110
    move-result-object v3

    .line 111
    .line 112
    .line 113
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 114
    move-result-object v4

    .line 115
    .line 116
    if-eqz v4, :cond_4

    .line 117
    .line 118
    iget-object v4, v4, Lta/p3;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 119
    .line 120
    if-eqz v4, :cond_4

    .line 121
    .line 122
    .line 123
    invoke-virtual {v4, v0, v1, v3}, Lcom/kubi/assets/view/AccountInfoHeaderView;->B(Lcom/kubi/assets/entity/AssetV2OverviewEntity;Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    :cond_4
    sget-object v4, Lcom/kubi/assets/AssetSyncManager;->a:Lcom/kubi/assets/AssetSyncManager;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4}, Lcom/kubi/assets/AssetSyncManager;->f()Lcom/kubi/assets/entity/HomeAssetInfo;

    .line 129
    move-result-object v5

    .line 130
    .line 131
    .line 132
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotal()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 133
    move-result-object v6

    .line 134
    .line 135
    if-eqz v6, :cond_5

    .line 136
    .line 137
    .line 138
    invoke-virtual {v6}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 139
    move-result-object v6

    .line 140
    .line 141
    if-eqz v6, :cond_5

    .line 142
    .line 143
    .line 144
    invoke-virtual {v6}, Ljava/math/BigDecimal;->toPlainString()Ljava/lang/String;

    .line 145
    move-result-object v2

    .line 146
    .line 147
    .line 148
    :cond_5
    invoke-virtual {v5, v2}, Lcom/kubi/assets/entity/HomeAssetInfo;->setOriginalTotalAsset(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v5, v1}, Lcom/kubi/assets/entity/HomeAssetInfo;->setTotalAsset(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v3}, Lcom/kubi/assets/AssetExKt;->e(Ljava/lang/String;)Ljava/lang/String;

    .line 155
    move-result-object v1

    .line 156
    .line 157
    .line 158
    invoke-virtual {v5, v1}, Lcom/kubi/assets/entity/HomeAssetInfo;->setFiatValue(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrencyName()Ljava/lang/String;

    .line 162
    move-result-object v1

    .line 163
    .line 164
    if-nez v1, :cond_6

    .line 165
    .line 166
    const-string v1, ""

    .line 167
    .line 168
    .line 169
    :cond_6
    invoke-virtual {v5, v1}, Lcom/kubi/assets/entity/HomeAssetInfo;->setBalanceCurrency(Ljava/lang/String;)V

    .line 170
    .line 171
    .line 172
    invoke-virtual {v0}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTimestamp()Ljava/lang/Long;

    .line 173
    move-result-object v0

    .line 174
    .line 175
    .line 176
    invoke-virtual {v5, v0}, Lcom/kubi/assets/entity/HomeAssetInfo;->setTimestamp(Ljava/lang/Long;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {v4, v5}, Lcom/kubi/assets/AssetSyncManager;->j(Lcom/kubi/assets/entity/HomeAssetInfo;)V

    .line 180
    .line 181
    .line 182
    invoke-virtual/range {p0 .. p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 183
    move-result-object v0

    .line 184
    .line 185
    if-eqz v0, :cond_7

    .line 186
    .line 187
    iget-object v0, v0, Lta/p3;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 188
    .line 189
    if-eqz v0, :cond_7

    .line 190
    const/4 v1, 0x1

    .line 191
    .line 192
    .line 193
    invoke-virtual {v0, v1}, Lcom/kubi/assets/view/AccountInfoHeaderView;->setZeroBalanceImgVisible(Z)V

    .line 194
    :cond_7
    return-void
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
.end method

.method public N2()Lcom/kubi/assets/entity/AssetV2OverviewEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->V:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

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
.end method

.method public final Z3()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lta/p3;->f:Lcom/kubi/assets/overview/AssetDynamicsCardView;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->l(Landroid/view/View;)Z

    .line 15
    move-result v0

    .line 16
    .line 17
    if-ne v0, v1, :cond_0

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v0, v0, Lta/p3;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 27
    .line 28
    if-eqz v0, :cond_1

    .line 29
    .line 30
    .line 31
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->l(Landroid/view/View;)Z

    .line 32
    move-result v0

    .line 33
    .line 34
    if-ne v0, v1, :cond_1

    .line 35
    goto :goto_0

    .line 36
    :cond_1
    const/4 v1, 0x0

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 40
    move-result-object v0

    .line 41
    .line 42
    if-eqz v0, :cond_2

    .line 43
    .line 44
    iget-object v0, v0, Lta/p3;->h:Landroid/widget/Space;

    .line 45
    .line 46
    if-eqz v0, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 50
    :cond_2
    return-void
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
.end method

.method public final a4()V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/event/api/b;->a:Lcom/kubi/event/api/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 6
    move-result v1

    .line 7
    .line 8
    const-string v2, "touch_line_chart"

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 14
    move-result v1

    .line 15
    .line 16
    :cond_0
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$1;

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2, v3, p0}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 21
    const/4 v2, 0x1

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 28
    move-result v1

    .line 29
    .line 30
    const-string v4, "no_touch_line_chart"

    .line 31
    .line 32
    if-eqz v1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 36
    move-result v1

    .line 37
    .line 38
    :cond_1
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$2;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1, v4, v3, p0}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$2;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 48
    move-result v1

    .line 49
    .line 50
    const-string v4, "update_range"

    .line 51
    .line 52
    if-eqz v1, :cond_2

    .line 53
    .line 54
    .line 55
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 56
    move-result v1

    .line 57
    .line 58
    :cond_2
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$3;

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v4, v3, p0}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$3;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 62
    .line 63
    .line 64
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 68
    move-result v0

    .line 69
    .line 70
    const-string v1, "change_mini_chart_visible"

    .line 71
    .line 72
    if-eqz v0, :cond_3

    .line 73
    .line 74
    .line 75
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 76
    move-result v0

    .line 77
    .line 78
    :cond_3
    new-instance v0, Lcom/kubi/assets/overview/AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$4;

    .line 79
    .line 80
    .line 81
    invoke-direct {v0, v1, v3, p0}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindLineChartFlowEvent$$inlined$bindFlowEvent$4;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 82
    .line 83
    .line 84
    invoke-static {p0, v2, v0}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 85
    return-void
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
.end method

.method public bindFlowEvent()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/state/BaseStateFragment;->bindFlowEvent()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/event/api/b;->a:Lcom/kubi/event/api/b;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 9
    move-result v1

    .line 10
    .line 11
    const-string v2, "event_network_failed"

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    .line 17
    move-result v1

    .line 18
    .line 19
    :cond_0
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$1;

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, v3, p0}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 24
    const/4 v2, 0x1

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 31
    move-result v1

    .line 32
    .line 33
    const-string v4, "event_network_succeed"

    .line 34
    .line 35
    if-eqz v1, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 39
    move-result v1

    .line 40
    .line 41
    :cond_1
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$2;

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, v4, v3, p0}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$2;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 45
    .line 46
    .line 47
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 51
    move-result v1

    .line 52
    .line 53
    const-string v4, "show_coin_guide"

    .line 54
    .line 55
    if-eqz v1, :cond_2

    .line 56
    .line 57
    .line 58
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 59
    move-result v1

    .line 60
    .line 61
    :cond_2
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$3;

    .line 62
    .line 63
    .line 64
    invoke-direct {v1, v4, v3, p0}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$3;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 65
    .line 66
    .line 67
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 71
    move-result v1

    .line 72
    .line 73
    const-string v4, "event_ongoing_tab"

    .line 74
    .line 75
    if-eqz v1, :cond_3

    .line 76
    .line 77
    .line 78
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 79
    move-result v1

    .line 80
    .line 81
    :cond_3
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$4;

    .line 82
    .line 83
    .line 84
    invoke-direct {v1, v4, v3, p0}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$4;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 85
    .line 86
    .line 87
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->a4()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 94
    move-result v1

    .line 95
    .line 96
    const-string v4, "hold_earn_open_succ"

    .line 97
    .line 98
    if-eqz v1, :cond_4

    .line 99
    .line 100
    .line 101
    invoke-interface {v4}, Ljava/lang/CharSequence;->length()I

    .line 102
    move-result v1

    .line 103
    .line 104
    :cond_4
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$5;

    .line 105
    .line 106
    .line 107
    invoke-direct {v1, v4, v3, p0}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$5;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 114
    move-result v0

    .line 115
    .line 116
    const-string v1, "AUTO_EARN_STATE_REFRESH"

    .line 117
    .line 118
    if-eqz v0, :cond_5

    .line 119
    .line 120
    .line 121
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 122
    move-result v0

    .line 123
    .line 124
    :cond_5
    new-instance v0, Lcom/kubi/assets/overview/AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1;

    .line 125
    .line 126
    .line 127
    invoke-direct {v0, v1, v3, p0}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindFlowEvent$$inlined$bindFlowEvent$default$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 128
    const/4 v1, 0x0

    .line 129
    .line 130
    .line 131
    invoke-static {p0, v1, v0}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 132
    return-void
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
.end method

.method public bindState()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$1;->INSTANCE:Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$1;

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$2;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v1, p0, v2}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$2;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V

    .line 12
    .line 13
    sget-object v0, Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$3;->INSTANCE:Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$3;

    .line 14
    .line 15
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$4;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p0, v2}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$4;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;Lkotlin/coroutines/Continuation;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V

    .line 22
    .line 23
    sget-object v0, Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$5;->INSTANCE:Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$5;

    .line 24
    .line 25
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$6;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, p0, v2}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$6;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;Lkotlin/coroutines/Continuation;)V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v0, v1}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V

    .line 32
    .line 33
    sget-object v0, Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$7;->INSTANCE:Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$7;

    .line 34
    .line 35
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$8;

    .line 36
    .line 37
    .line 38
    invoke-direct {v1, p0, v2}, Lcom/kubi/assets/overview/AssetOverviewFragment$bindState$8;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;Lkotlin/coroutines/Continuation;)V

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0, v1}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->x4()V

    .line 45
    return-void
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
.end method

.method public final c4()Lta/p3;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->U:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/assets/overview/AssetOverviewFragment;->j0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lta/p3;

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
.end method

.method public final d4()Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->X:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;

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
.end method

.method public final e4()Lcom/kubi/assets/entity/AssetV2OverviewEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->V:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

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
.end method

.method public final f4()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->c0:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->c0:Z

    .line 9
    .line 10
    sget-object v0, Lcom/kubi/assets/overview/g;->a:Lcom/kubi/assets/overview/g;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    if-eqz v1, :cond_1

    .line 17
    .line 18
    iget-object v1, v1, Lta/p3;->u:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-virtual {v0, v1, p0}, Lcom/kubi/assets/overview/g;->c(Lcom/kubi/resources/widget/flyco/SlidingTabLayout;Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 24
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public final g4()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->isShowing()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v0, v0, Lta/p3;->s:Lcom/kubi/resources/widget/KuCoinRefreshLayout;

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/KuCoinRefreshLayout;->setRefreshing(Z)V

    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$layout;->fragment_asset_overview:I

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
.end method

.method public getNeedLoadingView()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->d0:Z

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
.end method

.method public getVmClass()Lkotlin/reflect/KClass;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/reflect/KClass<",
            "+",
            "Lcom/kubi/mvi/state/l<",
            "Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-class v0, Lcom/kubi/assets/overview/AssetOverviewViewModel;

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lkotlin/jvm/internal/Reflection;->getOrCreateKotlinClass(Ljava/lang/Class;)Lkotlin/reflect/KClass;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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
.end method

.method public initView()V
    .locals 17
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged",
            "KCLongMethodCheck",
            "KCCyclomaticComplexityCheck"
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    const/4 v3, 0x2

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 9
    move-result-object v4

    .line 10
    const/4 v5, 0x0

    .line 11
    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    iget-object v4, v4, Lta/p3;->q:Landroid/view/View;

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    move-object v4, v5

    .line 17
    .line 18
    .line 19
    :goto_0
    invoke-static {v4}, Lcom/kubi/sdk/widget/loading/WrapperLoadingView;->injectView(Landroid/view/View;)Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

    .line 20
    move-result-object v4

    .line 21
    .line 22
    iput-object v4, v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->e0:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

    .line 23
    .line 24
    sget-object v4, Lcom/kubi/assets/overview/coin/AssetCoinFragment;->c0:Lcom/kubi/assets/overview/coin/AssetCoinFragment$Companion;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Lcom/kubi/assets/overview/coin/AssetCoinFragment$Companion;->newInstance()Lcom/kubi/assets/overview/coin/AssetCoinFragment;

    .line 28
    move-result-object v4

    .line 29
    .line 30
    sget-object v6, Lcom/kubi/assets/overview/account/AssetAccountFragment;->a0:Lcom/kubi/assets/overview/account/AssetAccountFragment$Companion;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v6}, Lcom/kubi/assets/overview/account/AssetAccountFragment$Companion;->newInstance()Lcom/kubi/assets/overview/account/AssetAccountFragment;

    .line 34
    move-result-object v6

    .line 35
    .line 36
    new-array v7, v3, [Lcom/kubi/sdk/BaseFragment;

    .line 37
    .line 38
    aput-object v4, v7, v2

    .line 39
    .line 40
    aput-object v6, v7, v1

    .line 41
    .line 42
    .line 43
    invoke-static {v7}, Lkotlin/collections/CollectionsKt;->arrayListOf([Ljava/lang/Object;)Ljava/util/ArrayList;

    .line 44
    move-result-object v4

    .line 45
    .line 46
    iput-object v4, v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->W:Ljava/util/ArrayList;

    .line 47
    .line 48
    new-instance v4, Ljava/util/ArrayList;

    .line 49
    .line 50
    .line 51
    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    .line 52
    .line 53
    sget v6, Lcom/kubi/assets/R$string;->coin:I

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 57
    move-result-object v6

    .line 58
    .line 59
    .line 60
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 61
    .line 62
    sget v6, Lcom/kubi/assets/R$string;->asset_account:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 66
    move-result-object v6

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 70
    .line 71
    sget-object v6, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->ONGOING:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 72
    .line 73
    .line 74
    invoke-static {v6}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 75
    move-result v6

    .line 76
    .line 77
    const-string v7, "fragmentList"

    .line 78
    .line 79
    if-eqz v6, :cond_2

    .line 80
    .line 81
    iget-object v6, v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->W:Ljava/util/ArrayList;

    .line 82
    .line 83
    if-nez v6, :cond_1

    .line 84
    .line 85
    .line 86
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 87
    move-object v6, v5

    .line 88
    .line 89
    :cond_1
    sget-object v8, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->Z:Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$Companion;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v8}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$Companion;->newInstance()Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;

    .line 93
    move-result-object v8

    .line 94
    .line 95
    .line 96
    invoke-virtual {v6, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 97
    .line 98
    sget v6, Lcom/kubi/assets/R$string;->kc_assets_ongoing:I

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v6}, Landroidx/fragment/app/Fragment;->getString(I)Ljava/lang/String;

    .line 102
    move-result-object v6

    .line 103
    .line 104
    .line 105
    invoke-virtual {v4, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 106
    .line 107
    .line 108
    :cond_2
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 109
    move-result-object v6

    .line 110
    .line 111
    if-eqz v6, :cond_3

    .line 112
    .line 113
    iget-object v6, v6, Lta/p3;->u:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 114
    .line 115
    if-eqz v6, :cond_3

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->setNeedBold(Z)V

    .line 119
    .line 120
    .line 121
    :cond_3
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 122
    move-result-object v6

    .line 123
    .line 124
    if-eqz v6, :cond_4

    .line 125
    .line 126
    iget-object v6, v6, Lta/p3;->r:Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;

    .line 127
    .line 128
    if-eqz v6, :cond_4

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6}, Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;->getAccountInfoHeader()Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 132
    move-result-object v6

    .line 133
    .line 134
    if-eqz v6, :cond_4

    .line 135
    .line 136
    iget-boolean v8, v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->h0:Z

    .line 137
    .line 138
    .line 139
    invoke-virtual {v6, v8}, Lcom/kubi/assets/view/AccountInfoHeaderView;->V(Z)V

    .line 140
    .line 141
    :cond_4
    sget-object v6, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->AiAssets:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 142
    .line 143
    .line 144
    invoke-static {v6}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 145
    move-result v6

    .line 146
    .line 147
    if-eqz v6, :cond_5

    .line 148
    .line 149
    sget-object v6, Lcom/kubi/assets/u;->a:Lcom/kubi/assets/u;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v6}, Lcom/kubi/assets/u;->j()Z

    .line 153
    move-result v6

    .line 154
    .line 155
    if-eqz v6, :cond_5

    .line 156
    move v6, v1

    .line 157
    goto :goto_1

    .line 158
    :cond_5
    move v6, v2

    .line 159
    .line 160
    .line 161
    :goto_1
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 162
    move-result-object v8

    .line 163
    .line 164
    if-eqz v8, :cond_6

    .line 165
    .line 166
    iget-object v8, v8, Lta/p3;->r:Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;

    .line 167
    .line 168
    if-eqz v8, :cond_6

    .line 169
    .line 170
    .line 171
    invoke-virtual {v8}, Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;->getAccountInfoHeader()Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 172
    move-result-object v8

    .line 173
    .line 174
    if-eqz v8, :cond_6

    .line 175
    .line 176
    .line 177
    invoke-virtual {v8, v6}, Lcom/kubi/assets/view/AccountInfoHeaderView;->T(Z)V

    .line 178
    .line 179
    .line 180
    :cond_6
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 181
    move-result-object v6

    .line 182
    .line 183
    if-eqz v6, :cond_7

    .line 184
    .line 185
    iget-object v6, v6, Lta/p3;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 186
    .line 187
    if-eqz v6, :cond_7

    .line 188
    .line 189
    .line 190
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->d4()Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;

    .line 191
    move-result-object v8

    .line 192
    .line 193
    .line 194
    invoke-virtual {v6, v8}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 195
    .line 196
    .line 197
    :cond_7
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->d4()Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;

    .line 198
    move-result-object v6

    .line 199
    .line 200
    new-instance v8, Lcom/kubi/assets/overview/r;

    .line 201
    .line 202
    .line 203
    invoke-direct {v8, v0}, Lcom/kubi/assets/overview/r;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 204
    .line 205
    .line 206
    invoke-virtual {v6, v8}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lio/chad/library/adapter/base/BaseQuickAdapter$OnItemClickListener;)V

    .line 207
    .line 208
    const-string v6, "key_overview_dynamics_bar"

    .line 209
    .line 210
    iget-object v8, v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Z:Ljava/util/Set;

    .line 211
    .line 212
    const-string v9, "asset"

    .line 213
    .line 214
    .line 215
    invoke-static {v9, v6, v8}, Ly70/e;->i(Ljava/lang/String;Ljava/lang/String;Ljava/util/Set;)Ljava/util/Set;

    .line 216
    move-result-object v6

    .line 217
    .line 218
    iput-object v6, v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Z:Ljava/util/Set;

    .line 219
    .line 220
    new-instance v6, Lcom/kubi/utils/z;

    .line 221
    .line 222
    .line 223
    invoke-virtual {v0}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 224
    move-result-object v8

    .line 225
    .line 226
    const-string v10, "getChildFragmentManager(...)"

    .line 227
    .line 228
    .line 229
    invoke-static {v8, v10}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 230
    .line 231
    iget-object v10, v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->W:Ljava/util/ArrayList;

    .line 232
    .line 233
    if-nez v10, :cond_8

    .line 234
    .line 235
    .line 236
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 237
    move-object v10, v5

    .line 238
    .line 239
    .line 240
    :cond_8
    invoke-direct {v6, v8, v10, v4}, Lcom/kubi/utils/z;-><init>(Landroidx/fragment/app/FragmentManager;Ljava/util/ArrayList;Ljava/util/List;)V

    .line 241
    .line 242
    .line 243
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 244
    move-result-object v4

    .line 245
    .line 246
    if-eqz v4, :cond_9

    .line 247
    .line 248
    iget-object v4, v4, Lta/p3;->z:Lcom/kubi/resources/widget/CustomViewPager;

    .line 249
    .line 250
    if-eqz v4, :cond_9

    .line 251
    .line 252
    .line 253
    invoke-virtual {v4, v6}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->setAdapter(Landroidx/viewpager/widget/PagerAdapter;)V

    .line 254
    .line 255
    .line 256
    :cond_9
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 257
    move-result-object v4

    .line 258
    .line 259
    if-eqz v4, :cond_b

    .line 260
    .line 261
    iget-object v4, v4, Lta/p3;->z:Lcom/kubi/resources/widget/CustomViewPager;

    .line 262
    .line 263
    if-eqz v4, :cond_b

    .line 264
    .line 265
    iget-object v6, v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->W:Ljava/util/ArrayList;

    .line 266
    .line 267
    if-nez v6, :cond_a

    .line 268
    .line 269
    .line 270
    invoke-static {v7}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 271
    move-object v6, v5

    .line 272
    .line 273
    .line 274
    :cond_a
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 275
    move-result v6

    .line 276
    .line 277
    .line 278
    invoke-virtual {v4, v6}, Landroidx/viewpager/widget/ViewPager;->setOffscreenPageLimit(I)V

    .line 279
    .line 280
    .line 281
    :cond_b
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 282
    move-result-object v4

    .line 283
    .line 284
    if-eqz v4, :cond_d

    .line 285
    .line 286
    iget-object v4, v4, Lta/p3;->u:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 287
    .line 288
    if-eqz v4, :cond_d

    .line 289
    .line 290
    .line 291
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 292
    move-result-object v6

    .line 293
    .line 294
    if-eqz v6, :cond_c

    .line 295
    .line 296
    iget-object v6, v6, Lta/p3;->z:Lcom/kubi/resources/widget/CustomViewPager;

    .line 297
    goto :goto_2

    .line 298
    :cond_c
    move-object v6, v5

    .line 299
    .line 300
    .line 301
    :goto_2
    invoke-virtual {v4, v6}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->setViewPager(Landroidx/viewpager/widget/ViewPager;)V

    .line 302
    .line 303
    :cond_d
    sget-object v4, Lcom/kubi/assets/sort/k;->a:Lcom/kubi/assets/sort/k;

    .line 304
    .line 305
    .line 306
    invoke-virtual {v4}, Lcom/kubi/assets/sort/k;->j()Z

    .line 307
    move-result v4

    .line 308
    .line 309
    if-eqz v4, :cond_e

    .line 310
    .line 311
    .line 312
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 313
    move-result-object v4

    .line 314
    .line 315
    if-eqz v4, :cond_e

    .line 316
    .line 317
    iget-object v4, v4, Lta/p3;->u:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 318
    .line 319
    if-eqz v4, :cond_e

    .line 320
    .line 321
    .line 322
    invoke-virtual {v4, v1}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->G(I)V

    .line 323
    .line 324
    :cond_e
    const-string v4, "key_overview_tab_position"

    .line 325
    .line 326
    .line 327
    invoke-static {v9, v4, v1}, Ly70/e;->e(Ljava/lang/String;Ljava/lang/String;I)I

    .line 328
    move-result v4

    .line 329
    .line 330
    .line 331
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 332
    move-result-object v6

    .line 333
    .line 334
    if-eqz v6, :cond_f

    .line 335
    .line 336
    iget-object v6, v6, Lta/p3;->z:Lcom/kubi/resources/widget/CustomViewPager;

    .line 337
    .line 338
    if-eqz v6, :cond_f

    .line 339
    .line 340
    .line 341
    invoke-virtual {v6, v4}, Lcom/kubi/resources/widget/CustomViewPager;->setCurrentItem(I)V

    .line 342
    .line 343
    :cond_f
    if-nez v4, :cond_10

    .line 344
    move v6, v1

    .line 345
    goto :goto_3

    .line 346
    :cond_10
    move v6, v2

    .line 347
    .line 348
    :goto_3
    iput-boolean v6, v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->b0:Z

    .line 349
    .line 350
    .line 351
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 352
    move-result-object v6

    .line 353
    .line 354
    if-eqz v6, :cond_11

    .line 355
    .line 356
    iget-object v6, v6, Lta/p3;->k:Landroid/widget/ImageView;

    .line 357
    .line 358
    if-eqz v6, :cond_11

    .line 359
    .line 360
    iget-boolean v7, v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->b0:Z

    .line 361
    .line 362
    .line 363
    invoke-static {v6, v7}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 364
    .line 365
    .line 366
    :cond_11
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 367
    move-result-object v6

    .line 368
    .line 369
    if-eqz v6, :cond_12

    .line 370
    .line 371
    iget-object v6, v6, Lta/p3;->j:Landroid/widget/ImageView;

    .line 372
    .line 373
    if-eqz v6, :cond_12

    .line 374
    .line 375
    iget-boolean v7, v0, Lcom/kubi/assets/overview/AssetOverviewFragment;->b0:Z

    .line 376
    .line 377
    .line 378
    invoke-static {v6, v7}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 379
    .line 380
    .line 381
    :cond_12
    invoke-virtual {v0, v4}, Lcom/kubi/assets/overview/AssetOverviewFragment;->B4(I)V

    .line 382
    .line 383
    .line 384
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 385
    move-result-object v4

    .line 386
    .line 387
    if-eqz v4, :cond_13

    .line 388
    .line 389
    iget-object v4, v4, Lta/p3;->r:Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;

    .line 390
    .line 391
    if-eqz v4, :cond_13

    .line 392
    .line 393
    .line 394
    invoke-virtual {v4, v0}, Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;->f(Lcom/kubi/sdk/BaseFragment;)V

    .line 395
    .line 396
    .line 397
    :cond_13
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 398
    move-result-object v4

    .line 399
    .line 400
    if-eqz v4, :cond_14

    .line 401
    .line 402
    iget-object v4, v4, Lta/p3;->r:Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;

    .line 403
    .line 404
    if-eqz v4, :cond_14

    .line 405
    .line 406
    .line 407
    invoke-virtual {v4}, Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;->getAccountInfoHeader()Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 408
    move-result-object v4

    .line 409
    .line 410
    if-eqz v4, :cond_14

    .line 411
    .line 412
    new-instance v6, Lcom/kubi/assets/overview/v;

    .line 413
    .line 414
    .line 415
    invoke-direct {v6, v0}, Lcom/kubi/assets/overview/v;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 416
    .line 417
    .line 418
    invoke-static {v4, v6, v5, v3, v5}, Lcom/kubi/assets/x0;->c(Lcom/kubi/assets/x0;Lio/reactivex/functions/Consumer;Ljava/lang/Boolean;ILjava/lang/Object;)V

    .line 419
    .line 420
    .line 421
    :cond_14
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 422
    move-result-object v4

    .line 423
    .line 424
    if-eqz v4, :cond_15

    .line 425
    .line 426
    iget-object v6, v4, Lta/p3;->n:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 427
    .line 428
    if-eqz v6, :cond_15

    .line 429
    .line 430
    new-instance v9, Lcom/kubi/assets/overview/w;

    .line 431
    .line 432
    .line 433
    invoke-direct {v9}, Lcom/kubi/assets/overview/w;-><init>()V

    .line 434
    const/4 v10, 0x1

    .line 435
    const/4 v11, 0x0

    .line 436
    .line 437
    const-wide/16 v7, 0x0

    .line 438
    .line 439
    .line 440
    invoke-static/range {v6 .. v11}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 441
    .line 442
    .line 443
    :cond_15
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 444
    move-result-object v4

    .line 445
    .line 446
    if-eqz v4, :cond_18

    .line 447
    .line 448
    iget-object v4, v4, Lta/p3;->w:Lcom/kubi/resources/widget/BaseTextView;

    .line 449
    .line 450
    if-eqz v4, :cond_18

    .line 451
    .line 452
    sget-object v6, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->FastTrade:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 453
    .line 454
    .line 455
    invoke-static {v6}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 456
    move-result v6

    .line 457
    .line 458
    if-nez v6, :cond_17

    .line 459
    .line 460
    sget-object v6, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->P2P:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 461
    .line 462
    .line 463
    invoke-static {v6}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 464
    move-result v6

    .line 465
    .line 466
    if-nez v6, :cond_17

    .line 467
    .line 468
    sget-object v6, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->FiatDeposit:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 469
    .line 470
    .line 471
    invoke-static {v6}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 472
    move-result v6

    .line 473
    .line 474
    if-eqz v6, :cond_16

    .line 475
    goto :goto_4

    .line 476
    :cond_16
    move v1, v2

    .line 477
    .line 478
    .line 479
    :cond_17
    :goto_4
    invoke-static {v4, v1}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 480
    .line 481
    .line 482
    :cond_18
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 483
    move-result-object v1

    .line 484
    .line 485
    if-eqz v1, :cond_19

    .line 486
    .line 487
    iget-object v1, v1, Lta/p3;->l:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 488
    .line 489
    if-eqz v1, :cond_19

    .line 490
    .line 491
    sget-object v2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->FastTrade:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 492
    .line 493
    .line 494
    invoke-static {v2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 495
    move-result v2

    .line 496
    .line 497
    .line 498
    invoke-static {v1, v2}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 499
    .line 500
    .line 501
    :cond_19
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 502
    move-result-object v1

    .line 503
    .line 504
    if-eqz v1, :cond_1a

    .line 505
    .line 506
    iget-object v6, v1, Lta/p3;->l:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 507
    .line 508
    if-eqz v6, :cond_1a

    .line 509
    .line 510
    new-instance v9, Lcom/kubi/assets/overview/x;

    .line 511
    .line 512
    .line 513
    invoke-direct {v9}, Lcom/kubi/assets/overview/x;-><init>()V

    .line 514
    const/4 v10, 0x1

    .line 515
    const/4 v11, 0x0

    .line 516
    .line 517
    const-wide/16 v7, 0x0

    .line 518
    .line 519
    .line 520
    invoke-static/range {v6 .. v11}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 521
    .line 522
    .line 523
    :cond_1a
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 524
    move-result-object v1

    .line 525
    .line 526
    if-eqz v1, :cond_1b

    .line 527
    .line 528
    iget-object v1, v1, Lta/p3;->m:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 529
    .line 530
    if-eqz v1, :cond_1b

    .line 531
    .line 532
    sget-object v2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->P2P:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 533
    .line 534
    .line 535
    invoke-static {v2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 536
    move-result v2

    .line 537
    .line 538
    .line 539
    invoke-static {v1, v2}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 540
    .line 541
    .line 542
    :cond_1b
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 543
    move-result-object v1

    .line 544
    .line 545
    if-eqz v1, :cond_1c

    .line 546
    .line 547
    iget-object v6, v1, Lta/p3;->m:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 548
    .line 549
    if-eqz v6, :cond_1c

    .line 550
    .line 551
    new-instance v9, Lcom/kubi/assets/overview/y;

    .line 552
    .line 553
    .line 554
    invoke-direct {v9}, Lcom/kubi/assets/overview/y;-><init>()V

    .line 555
    const/4 v10, 0x1

    .line 556
    const/4 v11, 0x0

    .line 557
    .line 558
    const-wide/16 v7, 0x0

    .line 559
    .line 560
    .line 561
    invoke-static/range {v6 .. v11}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 562
    .line 563
    .line 564
    :cond_1c
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 565
    move-result-object v1

    .line 566
    .line 567
    if-eqz v1, :cond_1d

    .line 568
    .line 569
    iget-object v1, v1, Lta/p3;->o:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 570
    .line 571
    if-eqz v1, :cond_1d

    .line 572
    .line 573
    sget-object v2, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->FiatDeposit:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 574
    .line 575
    .line 576
    invoke-static {v2}, Lcom/kubi/sdk/site/b;->b(Lcom/kubi/sdk/site/SiteVisibleConfigKey;)Z

    .line 577
    move-result v2

    .line 578
    .line 579
    .line 580
    invoke-static {v1, v2}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 581
    .line 582
    .line 583
    :cond_1d
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 584
    move-result-object v1

    .line 585
    .line 586
    if-eqz v1, :cond_1e

    .line 587
    .line 588
    iget-object v6, v1, Lta/p3;->o:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 589
    .line 590
    if-eqz v6, :cond_1e

    .line 591
    .line 592
    new-instance v9, Lcom/kubi/assets/overview/i;

    .line 593
    .line 594
    .line 595
    invoke-direct {v9}, Lcom/kubi/assets/overview/i;-><init>()V

    .line 596
    const/4 v10, 0x1

    .line 597
    const/4 v11, 0x0

    .line 598
    .line 599
    const-wide/16 v7, 0x0

    .line 600
    .line 601
    .line 602
    invoke-static/range {v6 .. v11}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 603
    .line 604
    .line 605
    :cond_1e
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 606
    move-result-object v1

    .line 607
    .line 608
    if-eqz v1, :cond_1f

    .line 609
    .line 610
    iget-object v1, v1, Lta/p3;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 611
    .line 612
    if-eqz v1, :cond_1f

    .line 613
    .line 614
    const-string v2, "B1overview"

    .line 615
    .line 616
    .line 617
    invoke-virtual {v1, v0, v2}, Lcom/kubi/assets/view/AccountInfoHeaderView;->d(Lcom/kubi/sdk/BaseFragment;Ljava/lang/String;)V

    .line 618
    .line 619
    .line 620
    :cond_1f
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 621
    move-result-object v1

    .line 622
    .line 623
    if-eqz v1, :cond_20

    .line 624
    .line 625
    iget-object v6, v1, Lta/p3;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 626
    .line 627
    if-eqz v6, :cond_20

    .line 628
    .line 629
    sget v9, Lcom/kubi/assets/R$drawable;->ic2_history_20:I

    .line 630
    .line 631
    new-instance v7, Lcom/kubi/assets/overview/j;

    .line 632
    .line 633
    .line 634
    invoke-direct {v7}, Lcom/kubi/assets/overview/j;-><init>()V

    .line 635
    .line 636
    const/16 v15, 0xba

    .line 637
    .line 638
    const/16 v16, 0x0

    .line 639
    const/4 v8, 0x0

    .line 640
    const/4 v10, 0x0

    .line 641
    const/4 v11, 0x0

    .line 642
    const/4 v12, 0x0

    .line 643
    const/4 v13, 0x0

    .line 644
    const/4 v14, 0x0

    .line 645
    .line 646
    .line 647
    invoke-static/range {v6 .. v16}, Lcom/kubi/assets/view/AccountInfoHeaderView;->y(Lcom/kubi/assets/view/AccountInfoHeaderView;Lio/reactivex/functions/Action;Ljava/lang/String;IIILio/reactivex/functions/Action;ZZILjava/lang/Object;)V

    .line 648
    .line 649
    .line 650
    :cond_20
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 651
    move-result-object v1

    .line 652
    .line 653
    if-eqz v1, :cond_21

    .line 654
    .line 655
    iget-object v1, v1, Lta/p3;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 656
    .line 657
    if-eqz v1, :cond_21

    .line 658
    .line 659
    new-instance v2, Lcom/kubi/assets/overview/k;

    .line 660
    .line 661
    .line 662
    invoke-direct {v2, v0}, Lcom/kubi/assets/overview/k;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 663
    .line 664
    .line 665
    invoke-static {v1, v2, v5, v3, v5}, Lcom/kubi/assets/x0;->c(Lcom/kubi/assets/x0;Lio/reactivex/functions/Consumer;Ljava/lang/Boolean;ILjava/lang/Object;)V

    .line 666
    .line 667
    .line 668
    :cond_21
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 669
    move-result-object v1

    .line 670
    .line 671
    if-eqz v1, :cond_22

    .line 672
    .line 673
    iget-object v1, v1, Lta/p3;->s:Lcom/kubi/resources/widget/KuCoinRefreshLayout;

    .line 674
    .line 675
    if-eqz v1, :cond_22

    .line 676
    .line 677
    new-instance v2, Lcom/kubi/assets/overview/l;

    .line 678
    .line 679
    .line 680
    invoke-direct {v2, v0}, Lcom/kubi/assets/overview/l;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 681
    .line 682
    .line 683
    invoke-virtual {v1, v2}, Lcom/kubi/resources/widget/KuCoinRefreshLayout;->b(Lkotlin/jvm/functions/Function0;)V

    .line 684
    .line 685
    .line 686
    :cond_22
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 687
    move-result-object v1

    .line 688
    .line 689
    if-eqz v1, :cond_23

    .line 690
    .line 691
    iget-object v1, v1, Lta/p3;->c:Lcom/google/android/material/appbar/AppBarLayout;

    .line 692
    .line 693
    if-eqz v1, :cond_23

    .line 694
    .line 695
    new-instance v2, Lcom/kubi/assets/overview/m;

    .line 696
    .line 697
    .line 698
    invoke-direct {v2, v0}, Lcom/kubi/assets/overview/m;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 699
    .line 700
    .line 701
    invoke-virtual {v1, v2}, Lcom/google/android/material/appbar/AppBarLayout;->addOnOffsetChangedListener(Lcom/google/android/material/appbar/AppBarLayout$OnOffsetChangedListener;)V

    .line 702
    .line 703
    .line 704
    :cond_23
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 705
    move-result-object v1

    .line 706
    .line 707
    if-eqz v1, :cond_24

    .line 708
    .line 709
    iget-object v1, v1, Lta/p3;->z:Lcom/kubi/resources/widget/CustomViewPager;

    .line 710
    .line 711
    if-eqz v1, :cond_24

    .line 712
    .line 713
    new-instance v2, Lcom/kubi/assets/overview/AssetOverviewFragment$a;

    .line 714
    .line 715
    .line 716
    invoke-direct {v2, v0}, Lcom/kubi/assets/overview/AssetOverviewFragment$a;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 717
    .line 718
    .line 719
    invoke-virtual {v1, v2}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->addOnPageChangeListener(Landroidx/viewpager/widget/ViewPager$OnPageChangeListener;)V

    .line 720
    .line 721
    .line 722
    :cond_24
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 723
    move-result-object v1

    .line 724
    .line 725
    if-eqz v1, :cond_25

    .line 726
    .line 727
    iget-object v1, v1, Lta/p3;->u:Lcom/kubi/resources/widget/flyco/SlidingTabLayout;

    .line 728
    .line 729
    if-eqz v1, :cond_25

    .line 730
    .line 731
    new-instance v2, Lcom/kubi/assets/overview/AssetOverviewFragment$b;

    .line 732
    .line 733
    .line 734
    invoke-direct {v2, v0}, Lcom/kubi/assets/overview/AssetOverviewFragment$b;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 735
    .line 736
    .line 737
    invoke-virtual {v1, v2}, Lcom/kubi/resources/widget/flyco/SlidingTabLayout;->setOnTabSelectListener(Lww/b;)V

    .line 738
    .line 739
    .line 740
    :cond_25
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 741
    move-result-object v1

    .line 742
    .line 743
    if-eqz v1, :cond_26

    .line 744
    .line 745
    iget-object v2, v1, Lta/p3;->k:Landroid/widget/ImageView;

    .line 746
    .line 747
    if-eqz v2, :cond_26

    .line 748
    .line 749
    new-instance v5, Lcom/kubi/assets/overview/s;

    .line 750
    .line 751
    .line 752
    invoke-direct {v5, v0}, Lcom/kubi/assets/overview/s;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 753
    const/4 v6, 0x1

    .line 754
    const/4 v7, 0x0

    .line 755
    .line 756
    const-wide/16 v3, 0x0

    .line 757
    .line 758
    .line 759
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 760
    .line 761
    .line 762
    :cond_26
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 763
    move-result-object v1

    .line 764
    .line 765
    if-eqz v1, :cond_27

    .line 766
    .line 767
    iget-object v2, v1, Lta/p3;->j:Landroid/widget/ImageView;

    .line 768
    .line 769
    if-eqz v2, :cond_27

    .line 770
    .line 771
    new-instance v5, Lcom/kubi/assets/overview/t;

    .line 772
    .line 773
    .line 774
    invoke-direct {v5, v0}, Lcom/kubi/assets/overview/t;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 775
    const/4 v6, 0x1

    .line 776
    const/4 v7, 0x0

    .line 777
    .line 778
    const-wide/16 v3, 0x0

    .line 779
    .line 780
    .line 781
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 782
    .line 783
    .line 784
    :cond_27
    invoke-virtual {v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 785
    move-result-object v1

    .line 786
    .line 787
    if-eqz v1, :cond_28

    .line 788
    .line 789
    iget-object v2, v1, Lta/p3;->i:Lcom/kubi/sdk/widget/shape/view/ShapeImageView;

    .line 790
    .line 791
    if-eqz v2, :cond_28

    .line 792
    .line 793
    new-instance v5, Lcom/kubi/assets/overview/u;

    .line 794
    .line 795
    .line 796
    invoke-direct {v5, v0}, Lcom/kubi/assets/overview/u;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 797
    const/4 v6, 0x1

    .line 798
    const/4 v7, 0x0

    .line 799
    .line 800
    const-wide/16 v3, 0x0

    .line 801
    .line 802
    .line 803
    invoke-static/range {v2 .. v7}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 804
    :cond_28
    return-void
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

.method public lazyLoad()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->lazyLoad()V

    .line 4
    const/4 v4, 0x6

    .line 5
    const/4 v5, 0x0

    .line 6
    .line 7
    const-string v0, "event_refresh_overview"

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    const-wide/16 v2, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 14
    .line 15
    sget-object v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetDynamicsData;->INSTANCE:Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetDynamicsData;

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

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
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 0
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/mvi/state/BaseStateFragment;->onCreate(Landroid/os/Bundle;)V

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
.end method

.method public onRefresh()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->W:Ljava/util/ArrayList;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    const-string v0, "fragmentList"

    .line 8
    .line 9
    .line 10
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 11
    move-object v0, v1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 15
    move-result-object v2

    .line 16
    .line 17
    if-eqz v2, :cond_1

    .line 18
    .line 19
    iget-object v2, v2, Lta/p3;->z:Lcom/kubi/resources/widget/CustomViewPager;

    .line 20
    .line 21
    if-eqz v2, :cond_1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/kubi/resources/widget/rtlviewpager/RtlViewPager;->getCurrentItem()I

    .line 25
    move-result v2

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 29
    move-result-object v2

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    move-object v2, v1

    .line 32
    .line 33
    .line 34
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 35
    move-result v2

    .line 36
    .line 37
    .line 38
    invoke-static {v0, v2}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    check-cast v0, Lcom/kubi/sdk/BaseFragment;

    .line 42
    .line 43
    instance-of v2, v0, Lcom/kubi/assets/overview/coin/AssetCoinFragment;

    .line 44
    .line 45
    if-eqz v2, :cond_4

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    check-cast v0, Lcom/kubi/assets/overview/coin/AssetCoinFragment;

    .line 50
    goto :goto_1

    .line 51
    :cond_2
    move-object v0, v1

    .line 52
    .line 53
    :goto_1
    if-eqz v0, :cond_3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lcom/kubi/assets/overview/coin/AssetCoinFragment;->C3()Landroidx/recyclerview/widget/RecyclerView;

    .line 57
    move-result-object v0

    .line 58
    goto :goto_3

    .line 59
    :cond_3
    move-object v0, v1

    .line 60
    goto :goto_3

    .line 61
    .line 62
    :cond_4
    instance-of v2, v0, Lcom/kubi/assets/overview/account/AssetAccountFragment;

    .line 63
    .line 64
    if-eqz v2, :cond_3

    .line 65
    .line 66
    if-eqz v0, :cond_5

    .line 67
    .line 68
    check-cast v0, Lcom/kubi/assets/overview/account/AssetAccountFragment;

    .line 69
    goto :goto_2

    .line 70
    :cond_5
    move-object v0, v1

    .line 71
    .line 72
    :goto_2
    if-eqz v0, :cond_3

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->H3()Landroidx/recyclerview/widget/RecyclerView;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    :goto_3
    if-eqz v0, :cond_7

    .line 79
    .line 80
    sget-object v2, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    if-eqz v3, :cond_6

    .line 87
    .line 88
    iget-object v1, v3, Lta/p3;->c:Lcom/google/android/material/appbar/AppBarLayout;

    .line 89
    .line 90
    :cond_6
    new-instance v3, Lcom/kubi/assets/overview/h;

    .line 91
    .line 92
    .line 93
    invoke-direct {v3, p0}, Lcom/kubi/assets/overview/h;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2, v0, v1, v3}, Lcom/kubi/assets/service/AssetsHelper;->t(Landroidx/recyclerview/widget/RecyclerView;Lcom/google/android/material/appbar/AppBarLayout;Lio/reactivex/functions/Action;)V

    .line 97
    :cond_7
    return-void
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
.end method

.method public onShow()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/state/BaseStateFragment;->onShow()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Y:Ljava/util/List;

    .line 6
    .line 7
    .line 8
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->C4(Z)V

    .line 16
    return-void

    .line 17
    :cond_0
    const/4 v0, 0x1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->C4(Z)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->d4()Lcom/kubi/assets/overview/AssetDynamicsBarAdapter;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    iget-object v1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->Y:Ljava/util/List;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->replaceData(Ljava/util/Collection;)V

    .line 30
    return-void
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
.end method

.method public onViewHideOrShowToggle(Z)V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onViewHideOrShowToggle(Z)V

    .line 4
    .line 5
    if-eqz p1, :cond_b

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_b

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 15
    move-result-object p1

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p1, Lta/p3;->s:Lcom/kubi/resources/widget/KuCoinRefreshLayout;

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object p1, v0

    .line 23
    .line 24
    :goto_0
    if-eqz p1, :cond_b

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    iget-object p1, p1, Lta/p3;->r:Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;

    .line 33
    goto :goto_1

    .line 34
    :cond_1
    move-object p1, v0

    .line 35
    .line 36
    :goto_1
    sget-object v1, Llb/h;->a:Llb/h;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v1}, Llb/h;->D()Ly70/g;

    .line 40
    move-result-object v2

    .line 41
    const/4 v3, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v3}, Ly70/a;->d(Ly70/g;Z)Z

    .line 45
    move-result v2

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v2}, Lcom/kubi/resources/widget/ShowHideTextView;->d(Landroid/view/View;Z)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    if-eqz p1, :cond_2

    .line 55
    .line 56
    iget-object p1, p1, Lta/p3;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 57
    goto :goto_2

    .line 58
    :cond_2
    move-object p1, v0

    .line 59
    .line 60
    .line 61
    :goto_2
    invoke-virtual {v1}, Llb/h;->D()Ly70/g;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    .line 65
    invoke-static {v2, v3}, Ly70/a;->d(Ly70/g;Z)Z

    .line 66
    move-result v2

    .line 67
    .line 68
    .line 69
    invoke-static {p1, v2}, Lcom/kubi/resources/widget/ShowHideTextView;->d(Landroid/view/View;Z)V

    .line 70
    .line 71
    sget-object p1, Lcom/kubi/assets/AssetSyncManager;->a:Lcom/kubi/assets/AssetSyncManager;

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1}, Lcom/kubi/assets/AssetSyncManager;->f()Lcom/kubi/assets/entity/HomeAssetInfo;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/kubi/assets/entity/HomeAssetInfo;->getOriginalTotalAsset()Ljava/lang/String;

    .line 79
    move-result-object v2

    .line 80
    .line 81
    if-eqz v2, :cond_5

    .line 82
    .line 83
    iget-object v4, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->V:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 84
    .line 85
    if-eqz v4, :cond_3

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getSubAsset()Lcom/kubi/data/entity/SubAssetEntity;

    .line 89
    move-result-object v4

    .line 90
    .line 91
    if-eqz v4, :cond_3

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Lcom/kubi/data/entity/SubAssetEntity;->getHasSubAccount()Ljava/lang/Boolean;

    .line 95
    move-result-object v5

    .line 96
    .line 97
    .line 98
    invoke-static {v5}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 99
    move-result v5

    .line 100
    .line 101
    if-eqz v5, :cond_3

    .line 102
    .line 103
    .line 104
    invoke-virtual {v4}, Lcom/kubi/data/entity/SubAssetEntity;->getShowSubAccountBalanceSwitch()Ljava/lang/Boolean;

    .line 105
    move-result-object v4

    .line 106
    .line 107
    .line 108
    invoke-static {v4}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 109
    move-result v4

    .line 110
    .line 111
    if-eqz v4, :cond_5

    .line 112
    .line 113
    :cond_3
    iget-object v4, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->V:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 114
    .line 115
    if-eqz v4, :cond_4

    .line 116
    .line 117
    .line 118
    invoke-virtual {v4}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotal()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 119
    move-result-object v4

    .line 120
    .line 121
    if-eqz v4, :cond_4

    .line 122
    .line 123
    .line 124
    invoke-static {v2}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 125
    move-result-object v2

    .line 126
    .line 127
    .line 128
    invoke-virtual {v4, v2}, Lcom/kubi/data/entity/AssetSingleEntity;->setTotalBalance(Ljava/math/BigDecimal;)V

    .line 129
    .line 130
    :cond_4
    iget-object v2, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->f0:Lcom/kubi/assets/entity/NewOverviewEntity;

    .line 131
    .line 132
    if-eqz v2, :cond_5

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/kubi/assets/entity/HomeAssetInfo;->getPreTotal()Ljava/lang/String;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    .line 139
    invoke-static {p1}, Lcom/kubi/utils/extensions/DowngradeExKt;->f(Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 140
    move-result-object p1

    .line 141
    .line 142
    .line 143
    invoke-virtual {v2, p1}, Lcom/kubi/assets/entity/NewOverviewEntity;->setPreTotal(Ljava/math/BigDecimal;)V

    .line 144
    .line 145
    :cond_5
    iget-object p1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->V:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 146
    .line 147
    if-eqz p1, :cond_b

    .line 148
    .line 149
    new-instance v2, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;

    .line 150
    .line 151
    .line 152
    invoke-virtual {v1}, Llb/h;->D()Ly70/g;

    .line 153
    move-result-object v1

    .line 154
    .line 155
    .line 156
    invoke-static {v1, v3}, Ly70/a;->d(Ly70/g;Z)Z

    .line 157
    move-result v1

    .line 158
    .line 159
    .line 160
    invoke-direct {v2, v1}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;-><init>(Z)V

    .line 161
    .line 162
    .line 163
    invoke-virtual {p0, v2}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 164
    .line 165
    .line 166
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotal()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 167
    move-result-object v1

    .line 168
    .line 169
    if-eqz v1, :cond_6

    .line 170
    .line 171
    .line 172
    invoke-virtual {v1}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 173
    move-result-object v1

    .line 174
    goto :goto_3

    .line 175
    :cond_6
    move-object v1, v0

    .line 176
    :goto_3
    const/4 v2, 0x1

    .line 177
    .line 178
    .line 179
    invoke-static {v1, v0, v2, v0}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 180
    move-result-object v0

    .line 181
    .line 182
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 183
    .line 184
    .line 185
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 186
    move-result v0

    .line 187
    .line 188
    if-gtz v0, :cond_9

    .line 189
    .line 190
    .line 191
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotal()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 192
    move-result-object v0

    .line 193
    .line 194
    if-eqz v0, :cond_7

    .line 195
    .line 196
    .line 197
    invoke-virtual {v0}, Lcom/kubi/data/entity/AssetSingleEntity;->getExecute()Ljava/lang/Boolean;

    .line 198
    move-result-object v0

    .line 199
    .line 200
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 201
    .line 202
    .line 203
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 204
    move-result v3

    .line 205
    .line 206
    :cond_7
    if-nez v3, :cond_8

    .line 207
    goto :goto_4

    .line 208
    .line 209
    :cond_8
    const/16 v8, 0x8

    .line 210
    const/4 v9, 0x0

    .line 211
    .line 212
    const-string v4, "B1overview"

    .line 213
    .line 214
    const-string v5, "guideIcon"

    .line 215
    .line 216
    const-string v6, "1"

    .line 217
    const/4 v7, 0x0

    .line 218
    .line 219
    .line 220
    invoke-static/range {v4 .. v9}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 221
    .line 222
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->V:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 223
    .line 224
    .line 225
    invoke-virtual {p0, v0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->D4(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

    .line 226
    goto :goto_5

    .line 227
    .line 228
    .line 229
    :cond_9
    :goto_4
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 230
    move-result-object v0

    .line 231
    .line 232
    if-eqz v0, :cond_a

    .line 233
    .line 234
    iget-object v0, v0, Lta/p3;->r:Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;

    .line 235
    .line 236
    if-eqz v0, :cond_a

    .line 237
    .line 238
    .line 239
    invoke-virtual {v0, p1}, Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;->g(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

    .line 240
    .line 241
    :cond_a
    :goto_5
    sget-object v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRollbackData;->INSTANCE:Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRollbackData;

    .line 242
    .line 243
    .line 244
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 245
    .line 246
    .line 247
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/AssetOverviewFragment;->A4(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

    .line 248
    :cond_b
    return-void
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
.end method

.method public r2(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V
    .locals 5
    .param p1    # Lcom/kubi/assets/entity/AssetV2OverviewEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->g4()V

    .line 4
    .line 5
    if-eqz p1, :cond_10

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->V:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->isShowing()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    goto/16 :goto_7

    .line 16
    .line 17
    :cond_0
    sget-object v0, Lcom/kubi/assets/g0;->a:Lcom/kubi/assets/g0;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotalAssetValue()Ljava/math/BigDecimal;

    .line 21
    move-result-object v1

    .line 22
    const/4 v2, 0x0

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getBaseCurrency()Ljava/lang/String;

    .line 28
    move-result-object v3

    .line 29
    .line 30
    sget-object v4, Lhf/b;->a:Lhf/b;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4}, Lhf/b;->a()Ljava/lang/String;

    .line 34
    move-result-object v4

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v3, v4}, Lkf/a;->A(Ljava/math/BigDecimal;Ljava/lang/String;Ljava/lang/String;)Ljava/math/BigDecimal;

    .line 38
    move-result-object v1

    .line 39
    goto :goto_0

    .line 40
    :cond_1
    move-object v1, v2

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {v0, v1}, Lcom/kubi/assets/g0;->g(Ljava/math/BigDecimal;)V

    .line 44
    .line 45
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->e0:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

    .line 46
    .line 47
    if-eqz v0, :cond_2

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Lcom/kubi/sdk/widget/loading/WrapperLoadingView;->showContent()V

    .line 51
    .line 52
    .line 53
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    if-eqz v0, :cond_3

    .line 57
    .line 58
    iget-object v0, v0, Lta/p3;->y:Lcom/kubi/assets/view/AssetEmptyView;

    .line 59
    .line 60
    if-eqz v0, :cond_3

    .line 61
    .line 62
    .line 63
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 64
    .line 65
    :cond_3
    iget-object v0, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->W:Ljava/util/ArrayList;

    .line 66
    .line 67
    if-nez v0, :cond_4

    .line 68
    .line 69
    const-string v0, "fragmentList"

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 73
    move-object v0, v2

    .line 74
    .line 75
    :cond_4
    new-instance v1, Ljava/util/ArrayList;

    .line 76
    .line 77
    .line 78
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 79
    .line 80
    .line 81
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    .line 85
    :cond_5
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 86
    move-result v3

    .line 87
    .line 88
    if-eqz v3, :cond_6

    .line 89
    .line 90
    .line 91
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    instance-of v4, v3, Lcom/kubi/assets/AssetV2Fragment$a;

    .line 95
    .line 96
    if-eqz v4, :cond_5

    .line 97
    .line 98
    .line 99
    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 100
    goto :goto_1

    .line 101
    .line 102
    .line 103
    :cond_6
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 104
    move-result-object v0

    .line 105
    .line 106
    .line 107
    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 108
    move-result v1

    .line 109
    .line 110
    if-eqz v1, :cond_7

    .line 111
    .line 112
    .line 113
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 114
    move-result-object v1

    .line 115
    .line 116
    check-cast v1, Lcom/kubi/assets/AssetV2Fragment$a;

    .line 117
    .line 118
    iget-object v3, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->V:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 119
    .line 120
    .line 121
    invoke-interface {v1, v3}, Lcom/kubi/assets/AssetV2Fragment$a;->r2(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

    .line 122
    goto :goto_2

    .line 123
    .line 124
    .line 125
    :cond_7
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotal()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 126
    move-result-object v0

    .line 127
    .line 128
    if-eqz v0, :cond_8

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 132
    move-result-object v0

    .line 133
    goto :goto_3

    .line 134
    :cond_8
    move-object v0, v2

    .line 135
    :goto_3
    const/4 v1, 0x1

    .line 136
    .line 137
    .line 138
    invoke-static {v0, v2, v1, v2}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 139
    move-result-object v0

    .line 140
    .line 141
    sget-object v2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 145
    move-result v0

    .line 146
    const/4 v2, 0x0

    .line 147
    .line 148
    if-gtz v0, :cond_b

    .line 149
    .line 150
    .line 151
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotal()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 152
    move-result-object v0

    .line 153
    .line 154
    if-eqz v0, :cond_9

    .line 155
    .line 156
    .line 157
    invoke-virtual {v0}, Lcom/kubi/data/entity/AssetSingleEntity;->getExecute()Ljava/lang/Boolean;

    .line 158
    move-result-object v0

    .line 159
    .line 160
    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 161
    .line 162
    .line 163
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 164
    move-result v0

    .line 165
    goto :goto_4

    .line 166
    :cond_9
    move v0, v2

    .line 167
    .line 168
    :goto_4
    if-nez v0, :cond_a

    .line 169
    goto :goto_5

    .line 170
    .line 171
    .line 172
    :cond_a
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/AssetOverviewFragment;->D4(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

    .line 173
    goto :goto_6

    .line 174
    .line 175
    .line 176
    :cond_b
    :goto_5
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 177
    move-result-object v0

    .line 178
    .line 179
    if-eqz v0, :cond_c

    .line 180
    .line 181
    iget-object v0, v0, Lta/p3;->r:Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;

    .line 182
    .line 183
    if-eqz v0, :cond_c

    .line 184
    .line 185
    .line 186
    invoke-virtual {v0, p1}, Lcom/kubi/assets/overview/AssetV2OverviewHeaderView;->g(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

    .line 187
    .line 188
    .line 189
    :cond_c
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 190
    move-result-object v0

    .line 191
    .line 192
    if-eqz v0, :cond_d

    .line 193
    .line 194
    iget-object v0, v0, Lta/p3;->d:Landroidx/coordinatorlayout/widget/CoordinatorLayout;

    .line 195
    .line 196
    if-eqz v0, :cond_d

    .line 197
    .line 198
    .line 199
    invoke-virtual {v0, v2}, Landroidx/coordinatorlayout/widget/CoordinatorLayout;->setVisibility(I)V

    .line 200
    .line 201
    .line 202
    :cond_d
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 203
    move-result-object v0

    .line 204
    .line 205
    if-eqz v0, :cond_e

    .line 206
    .line 207
    iget-object v0, v0, Lta/p3;->e:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 208
    .line 209
    if-eqz v0, :cond_e

    .line 210
    .line 211
    const/16 v3, 0x8

    .line 212
    .line 213
    .line 214
    invoke-virtual {v0, v3}, Landroid/view/View;->setVisibility(I)V

    .line 215
    .line 216
    .line 217
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/assets/overview/AssetOverviewFragment;->c4()Lta/p3;

    .line 218
    move-result-object v0

    .line 219
    .line 220
    if-eqz v0, :cond_f

    .line 221
    .line 222
    iget-object v0, v0, Lta/p3;->b:Lcom/kubi/assets/view/AccountInfoHeaderView;

    .line 223
    .line 224
    if-eqz v0, :cond_f

    .line 225
    .line 226
    .line 227
    invoke-virtual {v0, v2}, Lcom/kubi/assets/view/AccountInfoHeaderView;->setZeroBalanceImgVisible(Z)V

    .line 228
    .line 229
    :cond_f
    sget-object v0, Lcom/kubi/profit/loss/analysis/api/a;->a:Lcom/kubi/profit/loss/analysis/api/a;

    .line 230
    .line 231
    .line 232
    invoke-virtual {v0}, Lcom/kubi/profit/loss/analysis/api/a;->d()I

    .line 233
    move-result v2

    .line 234
    add-int/2addr v2, v1

    .line 235
    .line 236
    .line 237
    invoke-virtual {v0, v2}, Lcom/kubi/profit/loss/analysis/api/a;->k(I)V

    .line 238
    .line 239
    :goto_6
    sget-object v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRollbackData;->INSTANCE:Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRollbackData;

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/AssetOverviewFragment;->A4(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

    .line 246
    return-void

    .line 247
    .line 248
    :cond_10
    iget-object p1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->e0:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

    .line 249
    .line 250
    if-eqz p1, :cond_11

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1}, Lcom/kubi/sdk/widget/loading/WrapperLoadingView;->showLoading()V

    .line 254
    :cond_11
    :goto_7
    return-void
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
.end method

.method public setNeedLoadingView(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/assets/overview/AssetOverviewFragment;->d0:Z

    .line 3
    return-void
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
.end method

.method public final x4()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/overview/AssetOverviewFragment$lineChartBindState$1;->INSTANCE:Lcom/kubi/assets/overview/AssetOverviewFragment$lineChartBindState$1;

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$lineChartBindState$2;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v1, p0, v2}, Lcom/kubi/assets/overview/AssetOverviewFragment$lineChartBindState$2;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V

    .line 12
    .line 13
    sget-object v0, Lcom/kubi/assets/overview/AssetOverviewFragment$lineChartBindState$3;->INSTANCE:Lcom/kubi/assets/overview/AssetOverviewFragment$lineChartBindState$3;

    .line 14
    .line 15
    new-instance v1, Lcom/kubi/assets/overview/AssetOverviewFragment$lineChartBindState$4;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p0, v2}, Lcom/kubi/assets/overview/AssetOverviewFragment$lineChartBindState$4;-><init>(Lcom/kubi/assets/overview/AssetOverviewFragment;Lkotlin/coroutines/Continuation;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
.end method
