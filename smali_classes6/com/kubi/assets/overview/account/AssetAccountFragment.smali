.class public final Lcom/kubi/assets/overview/account/AssetAccountFragment;
.super Lcom/kubi/mvi/state/SimpleStateFragment;
.source "AssetAccountFragment.kt"

# interfaces
.implements Lcom/kubi/assets/AssetV2Fragment$a;
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;
.implements Lcom/kubi/assets/overview/AssetV2OverviewAdapter$a;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "KCFragmentCheck"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/assets/overview/account/AssetAccountFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/SimpleStateFragment<",
        "Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;",
        ">;",
        "Lcom/kubi/assets/AssetV2Fragment$a;",
        "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;",
        "Lcom/kubi/assets/overview/AssetV2OverviewAdapter$a;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u0000 @2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001@B\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0008\u0010$\u001a\u0004\u0018\u00010%J\u0008\u0010&\u001a\u00020\'H\u0014J\u0008\u0010(\u001a\u00020)H\u0016J\u0008\u0010*\u001a\u00020)H\u0015J\u0010\u0010+\u001a\u00020)2\u0006\u0010,\u001a\u00020\u001dH\u0014J\u0008\u0010-\u001a\u00020)H\u0015J\u0010\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020\u001dH\u0002J\u0008\u00100\u001a\u00020)H\u0002J\u0012\u00101\u001a\u00020)2\u0008\u00102\u001a\u0004\u0018\u00010\u0015H\u0016J\u0008\u00103\u001a\u00020)H\u0016J\u0010\u00109\u001a\u00020)2\u0006\u0010:\u001a\u00020\u001dH\u0016J\u0010\u0010;\u001a\u00020)2\u0006\u0010<\u001a\u00020\u001dH\u0016J\u0008\u0010=\u001a\u00020)H\u0002J\u0012\u0010>\u001a\u00020)2\u0008\u0010\u0008\u001a\u0004\u0018\u00010\tH\u0002J\u0008\u0010?\u001a\u00020)H\u0014R\u001d\u0010\u0008\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u001b\u0010\u000e\u001a\u00020\u000f8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u0012\u0010\u0013\u001a\u0004\u0008\u0010\u0010\u0011R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0016\u0010\u0017\"\u0004\u0008\u0018\u0010\u0019R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u001c\u001a\u00020\u001dX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001e\u0010\u001f\"\u0004\u0008 \u0010!R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u00104\u001a\u0010\u0012\u000c\u0008\u0001\u0012\u0008\u0012\u0004\u0012\u00020\u000206058TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u00087\u00108\u00a8\u0006A"
    }
    d2 = {
        "Lcom/kubi/assets/overview/account/AssetAccountFragment;",
        "Lcom/kubi/mvi/state/SimpleStateFragment;",
        "Lcom/kubi/assets/overview/AssetV2OverviewContract$UIState;",
        "Lcom/kubi/assets/AssetV2Fragment$IAssetsGet;",
        "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;",
        "Lcom/kubi/assets/overview/AssetV2OverviewAdapter$OverViewIntentListener;",
        "<init>",
        "()V",
        "binding",
        "Lcom/kubi/assets/databinding/AssetListBinding;",
        "getBinding",
        "()Lcom/kubi/assets/databinding/AssetListBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "adapter",
        "Lcom/kubi/assets/overview/AssetV2OverviewAdapter;",
        "getAdapter",
        "()Lcom/kubi/assets/overview/AssetV2OverviewAdapter;",
        "adapter$delegate",
        "Lkotlin/Lazy;",
        "overviewEntity",
        "Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
        "getOverviewEntity",
        "()Lcom/kubi/assets/entity/AssetV2OverviewEntity;",
        "setOverviewEntity",
        "(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V",
        "lastExecutionTime",
        "",
        "needLoadingView",
        "",
        "getNeedLoadingView",
        "()Z",
        "setNeedLoadingView",
        "(Z)V",
        "loadingView",
        "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;",
        "getRecyclerView",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "getLayout",
        "",
        "lazyLoad",
        "",
        "initView",
        "onViewHideOrShowToggle",
        "show",
        "bindState",
        "updateEmptyViewVisibility",
        "isEmpty",
        "setupCancelHideButton",
        "onAssetsGet",
        "myAssetEntity",
        "onRefresh",
        "vmClass",
        "Lkotlin/reflect/KClass;",
        "Lcom/kubi/mvi/state/SimpleStateVM;",
        "getVmClass",
        "()Lkotlin/reflect/KClass;",
        "onHideZeroListener",
        "hide",
        "onEyesChangedListener",
        "visible",
        "initSortSettingGuide",
        "jumpAccountTabSortFragment",
        "bindFlowEvent",
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
        "SMAP\nAssetAccountFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetAccountFragment.kt\ncom/kubi/assets/overview/account/AssetAccountFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 AssetEx.kt\ncom/kubi/assets/AssetExKt\n*L\n1#1,360:1\n147#2,16:361\n135#3,2:377\n135#3,2:379\n126#3,2:381\n126#3,2:390\n81#4,2:383\n251#5,5:385\n*S KotlinDebug\n*F\n+ 1 AssetAccountFragment.kt\ncom/kubi/assets/overview/account/AssetAccountFragment\n*L\n65#1:361,16\n184#1:377,2\n309#1:379,2\n331#1:381,2\n319#1:390,2\n337#1:383,2\n146#1:385,5\n*E\n"
    }
.end annotation


# static fields
.field public static final a0:Lcom/kubi/assets/overview/account/AssetAccountFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic b0:[Lkotlin/reflect/KProperty;
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

.field public final V:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public W:Lcom/kubi/assets/entity/AssetV2OverviewEntity;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public X:J

.field public Y:Z

.field public Z:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
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
    const-string v1, "getBinding()Lcom/kubi/assets/databinding/AssetListBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/assets/overview/account/AssetAccountFragment;

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
    sput-object v1, Lcom/kubi/assets/overview/account/AssetAccountFragment;->b0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/assets/overview/account/AssetAccountFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/assets/overview/account/AssetAccountFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->a0:Lcom/kubi/assets/overview/account/AssetAccountFragment$Companion;

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
    sget-object v0, Lcom/kubi/assets/overview/account/AssetAccountFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/assets/overview/account/AssetAccountFragment$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/assets/overview/account/AssetAccountFragment$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/assets/overview/account/AssetAccountFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->U:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    new-instance v0, Lcom/kubi/assets/overview/account/g;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, p0}, Lcom/kubi/assets/overview/account/g;-><init>(Lcom/kubi/assets/overview/account/AssetAccountFragment;)V

    .line 22
    .line 23
    .line 24
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    iput-object v0, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->V:Lkotlin/Lazy;

    .line 28
    .line 29
    const-string v0, "B1overview"

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseFragment;->setPageId(Ljava/lang/String;)V

    .line 33
    return-void
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

.method public static final synthetic A3(Lcom/kubi/assets/overview/account/AssetAccountFragment;Lcom/kubi/mvi/state/d;)V
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

.method public static final synthetic B3(Lcom/kubi/assets/overview/account/AssetAccountFragment;J)V
    .locals 0

    .line 1
    .line 2
    iput-wide p1, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->X:J

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

.method public static final synthetic C3(Lcom/kubi/assets/overview/account/AssetAccountFragment;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->U3(Z)V

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

.method public static final D3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lcom/kubi/assets/overview/AssetV2OverviewAdapter;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;

    .line 3
    .line 4
    new-instance v1, Ljava/util/ArrayList;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-direct {v0, v1, p0}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;-><init>(Ljava/util/List;Lcom/kubi/assets/overview/account/AssetAccountFragment;)V

    .line 11
    return-object v0
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

.method private final F3()Lta/s1;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->U:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/assets/overview/account/AssetAccountFragment;->b0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lta/s1;

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

.method public static final J3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->Q3(Lta/s1;)V

    .line 8
    .line 9
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 10
    return-object p0
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

.method public static final K3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Llb/h;->a:Llb/h;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Llb/h;->d()Ly70/g;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 11
    .line 12
    .line 13
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    iget-object p0, p0, Lta/s1;->g:Lcom/kubi/assets/withdraw/view/WithdrawNoticeView;

    .line 19
    .line 20
    if-eqz p0, :cond_0

    .line 21
    const/4 v0, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v0}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 25
    .line 26
    :cond_0
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

.method public static final L3(Lcom/kubi/assets/overview/account/AssetAccountFragment;Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1, p3}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 4
    move-result-object p2

    .line 5
    .line 6
    instance-of p2, p2, Lcom/kubi/assets/entity/OverviewItemEntity;

    .line 7
    .line 8
    if-eqz p2, :cond_10

    .line 9
    .line 10
    .line 11
    invoke-virtual {p1, p3}, Lio/chad/library/adapter/base/BaseQuickAdapter;->getItem(I)Ljava/lang/Object;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    const-string p2, "null cannot be cast to non-null type com.kubi.assets.entity.OverviewItemEntity"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 18
    .line 19
    check-cast p1, Lcom/kubi/assets/entity/OverviewItemEntity;

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 23
    move-result-object p2

    .line 24
    .line 25
    const-string p3, "B1overview"

    .line 26
    .line 27
    const-string v0, "1"

    .line 28
    .line 29
    if-eqz p2, :cond_e

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    if-eqz p2, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMain()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 39
    move-result-object p2

    .line 40
    .line 41
    if-eqz p2, :cond_0

    .line 42
    .line 43
    const-string p2, "main"

    .line 44
    goto :goto_0

    .line 45
    .line 46
    :cond_0
    const-string p2, "overview"

    .line 47
    .line 48
    .line 49
    :goto_0
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    if-eqz v1, :cond_1

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getTrade()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    if-eqz v1, :cond_1

    .line 59
    .line 60
    const-string p2, "trade"

    .line 61
    .line 62
    .line 63
    :cond_1
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 64
    move-result-object v1

    .line 65
    .line 66
    if-eqz v1, :cond_2

    .line 67
    .line 68
    .line 69
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMargin()Lcom/kubi/assets/entity/MarginEntity;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    if-eqz v1, :cond_2

    .line 73
    .line 74
    const-string p2, "margin"

    .line 75
    .line 76
    .line 77
    :cond_2
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 78
    move-result-object v1

    .line 79
    .line 80
    if-eqz v1, :cond_3

    .line 81
    .line 82
    .line 83
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getKumex()Lcom/kubi/assets/entity/EquityEntity;

    .line 84
    move-result-object v1

    .line 85
    .line 86
    if-eqz v1, :cond_3

    .line 87
    .line 88
    const-string p2, "futures"

    .line 89
    .line 90
    .line 91
    :cond_3
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 92
    move-result-object v1

    .line 93
    .line 94
    if-eqz v1, :cond_4

    .line 95
    .line 96
    .line 97
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getAlpha()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 98
    move-result-object v1

    .line 99
    .line 100
    if-eqz v1, :cond_4

    .line 101
    .line 102
    const-string p2, "alpha"

    .line 103
    .line 104
    .line 105
    :cond_4
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 106
    move-result-object v1

    .line 107
    .line 108
    if-eqz v1, :cond_5

    .line 109
    .line 110
    .line 111
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getRobot()Lcom/kubi/data/entity/SubAssetEntity;

    .line 112
    move-result-object v1

    .line 113
    .line 114
    if-eqz v1, :cond_5

    .line 115
    .line 116
    const-string p2, "bots"

    .line 117
    .line 118
    .line 119
    :cond_5
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    if-eqz v1, :cond_6

    .line 123
    .line 124
    .line 125
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getEarn()Lcom/kubi/assets/entity/EarnBalance;

    .line 126
    move-result-object v1

    .line 127
    .line 128
    if-eqz v1, :cond_6

    .line 129
    .line 130
    const-string p2, "finance"

    .line 131
    .line 132
    .line 133
    :cond_6
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 134
    move-result-object v1

    .line 135
    .line 136
    if-eqz v1, :cond_7

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getOption()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 140
    move-result-object v1

    .line 141
    .line 142
    if-eqz v1, :cond_7

    .line 143
    .line 144
    const-string p2, "option"

    .line 145
    .line 146
    .line 147
    :cond_7
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 148
    move-result-object v1

    .line 149
    .line 150
    if-eqz v1, :cond_8

    .line 151
    .line 152
    .line 153
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getCopyTrading()Lcom/kubi/data/entity/SubAssetEntity;

    .line 154
    move-result-object v1

    .line 155
    .line 156
    if-eqz v1, :cond_8

    .line 157
    .line 158
    const-string p2, "copyTrading"

    .line 159
    .line 160
    .line 161
    :cond_8
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 162
    move-result-object v1

    .line 163
    .line 164
    if-eqz v1, :cond_9

    .line 165
    .line 166
    .line 167
    invoke-virtual {v1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getUnified()Lcom/kubi/data/entity/UnifiedAssetEntity;

    .line 168
    move-result-object v1

    .line 169
    .line 170
    if-eqz v1, :cond_9

    .line 171
    .line 172
    const-string p2, "unified"

    .line 173
    .line 174
    .line 175
    :cond_9
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getAccountInfo()Lcom/kubi/assets/entity/OverviewAccountInfo;

    .line 176
    move-result-object p1

    .line 177
    .line 178
    if-eqz p1, :cond_a

    .line 179
    .line 180
    .line 181
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewAccountInfo;->getMining()Lcom/kubi/assets/entity/CommonAccountEntity;

    .line 182
    move-result-object p1

    .line 183
    .line 184
    if-eqz p1, :cond_a

    .line 185
    .line 186
    const-string p2, "mining"

    .line 187
    .line 188
    .line 189
    :cond_a
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 190
    move-result-object p0

    .line 191
    .line 192
    :goto_1
    if-eqz p0, :cond_b

    .line 193
    .line 194
    instance-of p1, p0, Lcom/kubi/assets/AssetV2Fragment;

    .line 195
    .line 196
    if-nez p1, :cond_b

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getParentFragment()Landroidx/fragment/app/Fragment;

    .line 200
    move-result-object p0

    .line 201
    goto :goto_1

    .line 202
    .line 203
    :cond_b
    instance-of p1, p0, Lcom/kubi/assets/AssetV2Fragment;

    .line 204
    .line 205
    if-nez p1, :cond_c

    .line 206
    const/4 p0, 0x0

    .line 207
    .line 208
    :cond_c
    check-cast p0, Lcom/kubi/assets/AssetV2Fragment;

    .line 209
    .line 210
    if-eqz p0, :cond_d

    .line 211
    .line 212
    .line 213
    invoke-virtual {p0, p2}, Lcom/kubi/assets/AssetV2Fragment;->s3(Ljava/lang/String;)V

    .line 214
    .line 215
    :cond_d
    const-string p0, "after_page_id"

    .line 216
    .line 217
    const-string p1, "B1depositCoinList"

    .line 218
    .line 219
    .line 220
    invoke-static {p0, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 221
    move-result-object p0

    .line 222
    .line 223
    const-string p1, "norm_version"

    .line 224
    .line 225
    .line 226
    invoke-static {p1, v0}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 227
    move-result-object p1

    .line 228
    .line 229
    .line 230
    filled-new-array {p0, p1}, [Lkotlin/Pair;

    .line 231
    move-result-object p0

    .line 232
    .line 233
    const-string p1, "account"

    .line 234
    .line 235
    .line 236
    invoke-static {p3, p1, p2, p0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

    .line 237
    return-void

    .line 238
    .line 239
    .line 240
    :cond_e
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getHistoryInfo()Lcom/kubi/assets/entity/HistoryRecordEntity;

    .line 241
    move-result-object p0

    .line 242
    .line 243
    if-eqz p0, :cond_10

    .line 244
    .line 245
    new-instance p0, Lorg/json/JSONObject;

    .line 246
    .line 247
    .line 248
    invoke-direct {p0}, Lorg/json/JSONObject;-><init>()V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getHistoryInfo()Lcom/kubi/assets/entity/HistoryRecordEntity;

    .line 252
    move-result-object p2

    .line 253
    .line 254
    .line 255
    invoke-virtual {p2}, Lcom/kubi/assets/entity/HistoryRecordEntity;->getType()Ljava/lang/String;

    .line 256
    move-result-object p2

    .line 257
    .line 258
    const-string v1, "withdraw_deposit_type"

    .line 259
    .line 260
    .line 261
    invoke-virtual {p0, v1, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 262
    move-result-object p0

    .line 263
    .line 264
    const-string p2, "recentTran"

    .line 265
    .line 266
    .line 267
    invoke-static {p3, p2, v0, p0}, Lqq/m;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 268
    .line 269
    sget-object v1, Lf00/a;->a:Lf00/a;

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getHistoryInfo()Lcom/kubi/assets/entity/HistoryRecordEntity;

    .line 273
    move-result-object p0

    .line 274
    .line 275
    iget-object p0, p0, Lcom/kubi/assets/entity/HistoryRecordEntity;->id:Ljava/lang/String;

    .line 276
    .line 277
    .line 278
    invoke-static {p0}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 279
    move-result-object v2

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1}, Lcom/kubi/assets/entity/OverviewItemEntity;->getHistoryInfo()Lcom/kubi/assets/entity/HistoryRecordEntity;

    .line 283
    move-result-object p0

    .line 284
    .line 285
    .line 286
    invoke-virtual {p0}, Lcom/kubi/assets/entity/HistoryRecordEntity;->isWithdraw()Z

    .line 287
    move-result p0

    .line 288
    .line 289
    if-eqz p0, :cond_f

    .line 290
    move-object v3, v0

    .line 291
    goto :goto_2

    .line 292
    .line 293
    :cond_f
    const-string p0, "0"

    .line 294
    move-object v3, p0

    .line 295
    .line 296
    .line 297
    :goto_2
    invoke-static {p3, p2, v0}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 298
    move-result-object v4

    .line 299
    .line 300
    const/16 v7, 0x18

    .line 301
    const/4 v8, 0x0

    .line 302
    const/4 v5, 0x0

    .line 303
    const/4 v6, 0x0

    .line 304
    .line 305
    .line 306
    invoke-static/range {v1 .. v8}, Lg00/a$a;->h(Lg00/a;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 307
    :cond_10
    return-void
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

.method public static final M3(Lcom/kubi/assets/overview/account/AssetAccountFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    if-eqz p1, :cond_0

    .line 7
    .line 8
    iget-object p1, p1, Lta/s1;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    if-eqz p1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->isVisible()Z

    .line 14
    move-result p0

    .line 15
    .line 16
    if-eqz p0, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 20
    move-result-object p0

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 26
    .line 27
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 28
    return-object p0
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

.method private static final N3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
.end method

.method private static final O3(Ljava/lang/Throwable;)Lkotlin/Unit;
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
.end method

.method private static final P3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
.end method

.method public static final R3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->lazyLoad()V

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

.method public static final T3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lkotlin/Unit;
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-static {v0}, Lcom/kubi/assets/overview/account/q;->b(Z)V

    .line 5
    .line 6
    sget-object v2, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 7
    const/4 v5, 0x4

    .line 8
    const/4 v6, 0x0

    .line 9
    .line 10
    const-string v1, "EVENT_HIDE_SMALL_ASSET_ACCOUNT"

    .line 11
    .line 12
    const-wide/16 v3, 0x0

    .line 13
    .line 14
    .line 15
    invoke-static/range {v1 .. v6}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 16
    .line 17
    .line 18
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    iget-object v0, v0, Lta/s1;->c:Landroid/widget/LinearLayout;

    .line 24
    .line 25
    if-eqz v0, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    if-eqz p0, :cond_1

    .line 35
    .line 36
    iget-object p0, p0, Lta/s1;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    if-eqz p0, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-static {p0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 42
    .line 43
    :cond_1
    const/16 v4, 0x8

    .line 44
    const/4 v5, 0x0

    .line 45
    .line 46
    const-string v0, "B1overview"

    .line 47
    .line 48
    const-string v1, "emptyList"

    .line 49
    .line 50
    const-string v2, "unhide"

    .line 51
    const/4 v3, 0x0

    .line 52
    .line 53
    .line 54
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 55
    .line 56
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 57
    return-object p0
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

.method public static synthetic m3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->J3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lkotlin/Unit;

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

.method public static synthetic n3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->N3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic o3(Lcom/kubi/assets/overview/account/AssetAccountFragment;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->M3(Lcom/kubi/assets/overview/account/AssetAccountFragment;Ljava/lang/Boolean;)Lkotlin/Unit;

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
.end method

.method public static synthetic p3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->T3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lkotlin/Unit;

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

.method public static synthetic q3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lcom/kubi/assets/overview/AssetV2OverviewAdapter;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->D3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lcom/kubi/assets/overview/AssetV2OverviewAdapter;

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

.method public static synthetic r3(Lcom/kubi/assets/overview/account/AssetAccountFragment;Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->L3(Lcom/kubi/assets/overview/account/AssetAccountFragment;Lio/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

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

.method public static synthetic s3(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->O3(Ljava/lang/Throwable;)Lkotlin/Unit;

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

.method public static synthetic t3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->K3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lkotlin/Unit;

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

.method public static synthetic u3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->P3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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

.method public static synthetic v3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->R3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)V

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

.method public static final synthetic w3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lcom/kubi/assets/overview/AssetV2OverviewAdapter;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->E3()Lcom/kubi/assets/overview/AssetV2OverviewAdapter;

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

.method public static final synthetic x3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lta/s1;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

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

.method public static final synthetic y3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->X:J

    .line 3
    return-wide v0
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

.method public static final synthetic z3(Lcom/kubi/assets/overview/account/AssetAccountFragment;)Lcom/kubi/sdk/widget/loading/WrapperLoadingView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->Z:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

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


# virtual methods
.method public final E3()Lcom/kubi/assets/overview/AssetV2OverviewAdapter;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->V:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;

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

.method public final G3()Lcom/kubi/assets/entity/AssetV2OverviewEntity;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->W:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

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

.method public final H3()Landroidx/recyclerview/widget/RecyclerView;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->isShowing()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    iget-object v0, v0, Lta/s1;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 16
    return-object v0

    .line 17
    :cond_0
    return-object v1
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

.method public final I3()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/sort/l;->a()Z

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    sget-object v0, Llb/h;->a:Llb/h;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Llb/h;->d()Ly70/g;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-static {v0, v1}, Ly70/a;->d(Ly70/g;Z)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    const/4 v0, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move v0, v1

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 26
    move-result-object v2

    .line 27
    .line 28
    if-eqz v2, :cond_1

    .line 29
    .line 30
    iget-object v2, v2, Lta/s1;->g:Lcom/kubi/assets/withdraw/view/WithdrawNoticeView;

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-static {v2, v0}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 36
    .line 37
    :cond_1
    if-eqz v0, :cond_3

    .line 38
    .line 39
    const/16 v7, 0x8

    .line 40
    const/4 v8, 0x0

    .line 41
    .line 42
    const-string v3, "B1overview"

    .line 43
    .line 44
    const-string v4, "accountList"

    .line 45
    .line 46
    const-string v5, "newGuide"

    .line 47
    const/4 v6, 0x0

    .line 48
    .line 49
    .line 50
    invoke-static/range {v3 .. v8}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 51
    .line 52
    .line 53
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    iget-object v0, v0, Lta/s1;->g:Lcom/kubi/assets/withdraw/view/WithdrawNoticeView;

    .line 59
    .line 60
    if-eqz v0, :cond_2

    .line 61
    .line 62
    sget-object v2, Lcom/kubi/utils/c;->a:Lcom/kubi/utils/c;

    .line 63
    .line 64
    sget v3, Lcom/kubi/assets/R$string;->kc_asset_sort_lead_tip:I

    .line 65
    .line 66
    new-array v1, v1, [Ljava/lang/Object;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v2, v3, v1}, Lcom/kubi/utils/c;->f(I[Ljava/lang/Object;)Ljava/lang/String;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    new-instance v2, Lcom/kubi/assets/overview/account/o;

    .line 73
    .line 74
    .line 75
    invoke-direct {v2, p0}, Lcom/kubi/assets/overview/account/o;-><init>(Lcom/kubi/assets/overview/account/AssetAccountFragment;)V

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Lcom/kubi/assets/withdraw/view/WithdrawNoticeView;->g(Ljava/lang/String;Lkotlin/jvm/functions/Function0;)V

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    if-eqz v0, :cond_3

    .line 85
    .line 86
    iget-object v0, v0, Lta/s1;->g:Lcom/kubi/assets/withdraw/view/WithdrawNoticeView;

    .line 87
    .line 88
    if-eqz v0, :cond_3

    .line 89
    .line 90
    new-instance v1, Lcom/kubi/assets/overview/account/p;

    .line 91
    .line 92
    .line 93
    invoke-direct {v1, p0}, Lcom/kubi/assets/overview/account/p;-><init>(Lcom/kubi/assets/overview/account/AssetAccountFragment;)V

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0, v1}, Lcom/kubi/assets/withdraw/view/WithdrawNoticeView;->setOnCloseClickListener(Lkotlin/jvm/functions/Function0;)V

    .line 97
    :cond_3
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

.method public final Q3(Lta/s1;)V
    .locals 6

    .line 1
    .line 2
    const/16 v4, 0x8

    .line 3
    const/4 v5, 0x0

    .line 4
    .line 5
    const-string v0, "B1overview"

    .line 6
    .line 7
    const-string v1, "accountList"

    .line 8
    .line 9
    const-string v2, "accountManage"

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lqq/m;->c(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    sget-object v1, Lcom/kubi/assets/sort/AccountTabSortSettingFragment;->Z:Lcom/kubi/assets/sort/AccountTabSortSettingFragment$Companion;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v0}, Lcom/kubi/assets/sort/AccountTabSortSettingFragment$Companion;->launchPageOnCase(Landroid/content/Context;)V

    .line 25
    .line 26
    :cond_0
    sget-object v0, Llb/h;->a:Llb/h;

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0}, Llb/h;->d()Ly70/g;

    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x1

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1}, Ly70/a;->k(Ly70/g;Z)Ly70/a;

    .line 35
    .line 36
    if-eqz p1, :cond_1

    .line 37
    .line 38
    iget-object p1, p1, Lta/s1;->g:Lcom/kubi/assets/withdraw/view/WithdrawNoticeView;

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    const/4 v0, 0x0

    .line 42
    .line 43
    .line 44
    invoke-static {p1, v0}, Lcom/kubi/assets/AssetExKt;->z(Landroid/view/View;Z)V

    .line 45
    :cond_1
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
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
.end method

.method public final S3()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v1, v0, Lta/s1;->b:Lcom/kubi/resources/widget/button/KcPrimaryButton;

    .line 9
    .line 10
    if-eqz v1, :cond_0

    .line 11
    .line 12
    new-instance v4, Lcom/kubi/assets/overview/account/i;

    .line 13
    .line 14
    .line 15
    invoke-direct {v4, p0}, Lcom/kubi/assets/overview/account/i;-><init>(Lcom/kubi/assets/overview/account/AssetAccountFragment;)V

    .line 16
    const/4 v5, 0x1

    .line 17
    const/4 v6, 0x0

    .line 18
    .line 19
    const-wide/16 v2, 0x0

    .line 20
    .line 21
    .line 22
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
.end method

.method public T2(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->isShowing()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    .line 10
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->E3()Lcom/kubi/assets/overview/AssetV2OverviewAdapter;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/kubi/assets/overview/AssetV2OverviewAdapter;->l(Z)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->E3()Lcom/kubi/assets/overview/AssetV2OverviewAdapter;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 22
    return-void
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

.method public final U3(Z)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/assets/overview/account/q;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz p1, :cond_5

    .line 7
    .line 8
    if-eqz v0, :cond_5

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Lta/s1;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 17
    .line 18
    if-eqz p1, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 22
    .line 23
    .line 24
    :cond_0
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    if-eqz p1, :cond_1

    .line 28
    .line 29
    iget-object p1, p1, Lta/s1;->c:Landroid/widget/LinearLayout;

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 35
    .line 36
    :cond_1
    sget-object p1, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 37
    .line 38
    .line 39
    invoke-virtual {p1}, Lcom/kubi/assets/service/AssetsHelper;->h()Lcom/kubi/assets/entity/SmallEntity;

    .line 40
    move-result-object p1

    .line 41
    .line 42
    if-eqz p1, :cond_2

    .line 43
    .line 44
    .line 45
    invoke-virtual {p1}, Lcom/kubi/assets/entity/SmallEntity;->getQuotaLimit()Ljava/math/BigDecimal;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    if-nez p1, :cond_3

    .line 49
    .line 50
    :cond_2
    sget-object p1, Ljava/math/BigDecimal;->ONE:Ljava/math/BigDecimal;

    .line 51
    .line 52
    .line 53
    :cond_3
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    if-eqz v0, :cond_4

    .line 57
    .line 58
    iget-object v0, v0, Lta/s1;->h:Lcom/kubi/resources/widget/BaseTextView;

    .line 59
    .line 60
    if-eqz v0, :cond_4

    .line 61
    .line 62
    sget-object v1, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getResources()Landroid/content/res/Resources;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    sget v2, Lcom/kubi/assets/R$string;->kc_asset_sort_hide_small_desc:I

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    .line 72
    move-result-object v1

    .line 73
    .line 74
    const-string v2, "getString(...)"

    .line 75
    .line 76
    .line 77
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 78
    const/4 v2, 0x1

    .line 79
    .line 80
    .line 81
    filled-new-array {p1}, [Ljava/lang/Object;

    .line 82
    move-result-object p1

    .line 83
    .line 84
    .line 85
    invoke-static {p1, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 86
    move-result-object p1

    .line 87
    .line 88
    .line 89
    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 90
    move-result-object p1

    .line 91
    .line 92
    const-string v1, "format(...)"

    .line 93
    .line 94
    .line 95
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 96
    .line 97
    .line 98
    invoke-virtual {v0, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 99
    .line 100
    :cond_4
    const/16 v6, 0x8

    .line 101
    const/4 v7, 0x0

    .line 102
    .line 103
    const-string v2, "B1overview"

    .line 104
    .line 105
    const-string v3, "emptyList"

    .line 106
    .line 107
    const-string v4, "1"

    .line 108
    const/4 v5, 0x0

    .line 109
    .line 110
    .line 111
    invoke-static/range {v2 .. v7}, Lqq/m;->g(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;ILjava/lang/Object;)V

    .line 112
    .line 113
    .line 114
    invoke-virtual {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->S3()V

    .line 115
    return-void

    .line 116
    .line 117
    .line 118
    :cond_5
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 119
    move-result-object p1

    .line 120
    .line 121
    if-eqz p1, :cond_6

    .line 122
    .line 123
    iget-object p1, p1, Lta/s1;->c:Landroid/widget/LinearLayout;

    .line 124
    .line 125
    if-eqz p1, :cond_6

    .line 126
    .line 127
    .line 128
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 129
    .line 130
    .line 131
    :cond_6
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    if-eqz p1, :cond_7

    .line 135
    .line 136
    iget-object p1, p1, Lta/s1;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 137
    .line 138
    if-eqz p1, :cond_7

    .line 139
    .line 140
    .line 141
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 142
    :cond_7
    return-void
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

.method public bindFlowEvent()V
    .locals 3

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
    move-result v0

    .line 10
    .line 11
    const-string v1, "EVENT_HIDE_SMALL_ASSET_ACCOUNT"

    .line 12
    .line 13
    if-eqz v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 17
    move-result v0

    .line 18
    .line 19
    :cond_0
    new-instance v0, Lcom/kubi/assets/overview/account/AssetAccountFragment$bindFlowEvent$$inlined$bindFlowEvent$1;

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, v2, p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment$bindFlowEvent$$inlined$bindFlowEvent$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/assets/overview/account/AssetAccountFragment;)V

    .line 24
    const/4 v1, 0x1

    .line 25
    .line 26
    .line 27
    invoke-static {p0, v1, v0}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

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

.method public bindState()V
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged"
        }
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/assets/overview/account/AssetAccountFragment$bindState$1;->INSTANCE:Lcom/kubi/assets/overview/account/AssetAccountFragment$bindState$1;

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/assets/overview/account/AssetAccountFragment$bindState$2;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-direct {v1, p0, v2}, Lcom/kubi/assets/overview/account/AssetAccountFragment$bindState$2;-><init>(Lcom/kubi/assets/overview/account/AssetAccountFragment;Lkotlin/coroutines/Continuation;)V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0, v1}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V

    .line 12
    .line 13
    sget-object v0, Lcom/kubi/assets/overview/account/AssetAccountFragment$bindState$3;->INSTANCE:Lcom/kubi/assets/overview/account/AssetAccountFragment$bindState$3;

    .line 14
    .line 15
    new-instance v1, Lcom/kubi/assets/overview/account/AssetAccountFragment$bindState$4;

    .line 16
    .line 17
    .line 18
    invoke-direct {v1, p0, v2}, Lcom/kubi/assets/overview/account/AssetAccountFragment$bindState$4;-><init>(Lcom/kubi/assets/overview/account/AssetAccountFragment;Lkotlin/coroutines/Continuation;)V

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

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$layout;->asset_list:I

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
    iget-boolean v0, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->Y:Z

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
    .locals 4
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NotifyDataSetChanged",
            "KCLongMethodCheck",
            "KCCyclomaticComplexityCheck"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    iget-object v0, v0, Lta/s1;->e:Landroid/view/View;

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    move-object v0, v1

    .line 12
    .line 13
    .line 14
    :goto_0
    invoke-static {v0}, Lcom/kubi/sdk/widget/loading/WrapperLoadingView;->injectView(Landroid/view/View;)Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iput-object v0, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->Z:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/kubi/sdk/widget/loading/WrapperLoadingView;->showLoading()V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->E3()Lcom/kubi/assets/overview/AssetV2OverviewAdapter;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    sget v2, Lcom/kubi/assets/R$layout;->view_empty:I

    .line 29
    .line 30
    .line 31
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    if-eqz v3, :cond_2

    .line 35
    .line 36
    iget-object v1, v3, Lta/s1;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 37
    .line 38
    .line 39
    :cond_2
    invoke-virtual {v0, v2, v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setEmptyView(ILandroid/view/ViewGroup;)V

    .line 40
    .line 41
    .line 42
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, v0, Lta/s1;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->E3()Lcom/kubi/assets/overview/AssetV2OverviewAdapter;

    .line 53
    move-result-object v1

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->I3()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->E3()Lcom/kubi/assets/overview/AssetV2OverviewAdapter;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    new-instance v1, Lcom/kubi/assets/overview/account/j;

    .line 66
    .line 67
    .line 68
    invoke-direct {v1, p0}, Lcom/kubi/assets/overview/account/j;-><init>(Lcom/kubi/assets/overview/account/AssetAccountFragment;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lio/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lio/chad/library/adapter/base/BaseQuickAdapter$OnItemClickListener;)V

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lkf/c;->a()Lio/reactivex/subjects/PublishSubject;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    .line 79
    move-result-object v1

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    new-instance v1, Lcom/kubi/assets/overview/account/k;

    .line 86
    .line 87
    .line 88
    invoke-direct {v1, p0}, Lcom/kubi/assets/overview/account/k;-><init>(Lcom/kubi/assets/overview/account/AssetAccountFragment;)V

    .line 89
    .line 90
    new-instance v2, Lcom/kubi/assets/overview/account/l;

    .line 91
    .line 92
    .line 93
    invoke-direct {v2, v1}, Lcom/kubi/assets/overview/account/l;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 94
    .line 95
    new-instance v1, Lcom/kubi/assets/overview/account/m;

    .line 96
    .line 97
    .line 98
    invoke-direct {v1}, Lcom/kubi/assets/overview/account/m;-><init>()V

    .line 99
    .line 100
    new-instance v3, Lcom/kubi/assets/overview/account/n;

    .line 101
    .line 102
    .line 103
    invoke-direct {v3, v1}, Lcom/kubi/assets/overview/account/n;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0, v2, v3}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 107
    move-result-object v0

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->addSubscription(Lio/reactivex/disposables/Disposable;)V

    .line 111
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
.end method

.method public onRefresh()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/assets/overview/account/AssetAccountFragment;->F3()Lta/s1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v2, v0, Lta/s1;->f:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    sget-object v1, Lcom/kubi/assets/service/AssetsHelper;->a:Lcom/kubi/assets/service/AssetsHelper;

    .line 13
    .line 14
    new-instance v4, Lcom/kubi/assets/overview/account/h;

    .line 15
    .line 16
    .line 17
    invoke-direct {v4, p0}, Lcom/kubi/assets/overview/account/h;-><init>(Lcom/kubi/assets/overview/account/AssetAccountFragment;)V

    .line 18
    const/4 v5, 0x2

    .line 19
    const/4 v6, 0x0

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static/range {v1 .. v6}, Lcom/kubi/assets/service/AssetsHelper;->u(Lcom/kubi/assets/service/AssetsHelper;Landroidx/recyclerview/widget/RecyclerView;Lcom/google/android/material/appbar/AppBarLayout;Lio/reactivex/functions/Action;ILjava/lang/Object;)V

    .line 24
    :cond_0
    return-void
    .line 25
    .line 26
    .line 27
.end method

.method public onViewHideOrShowToggle(Z)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/sdk/base/ui/OldBaseFragment;->onViewHideOrShowToggle(Z)V

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    if-eqz p1, :cond_2

    .line 12
    .line 13
    iget-object p1, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->W:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 14
    .line 15
    if-eqz p1, :cond_2

    .line 16
    .line 17
    new-instance v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;

    .line 18
    .line 19
    sget-object v1, Llb/h;->a:Llb/h;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1}, Llb/h;->D()Ly70/g;

    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {v1, v2}, Ly70/a;->d(Ly70/g;Z)Z

    .line 28
    move-result v1

    .line 29
    .line 30
    .line 31
    invoke-direct {v0, v1}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$HideOrShowNumber;-><init>(Z)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotal()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 38
    move-result-object v0

    .line 39
    const/4 v1, 0x0

    .line 40
    .line 41
    if-eqz v0, :cond_0

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 45
    move-result-object v0

    .line 46
    goto :goto_0

    .line 47
    :cond_0
    move-object v0, v1

    .line 48
    :goto_0
    const/4 v2, 0x1

    .line 49
    .line 50
    .line 51
    invoke-static {v0, v1, v2, v1}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    sget-object v1, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 58
    move-result v0

    .line 59
    .line 60
    if-lez v0, :cond_1

    .line 61
    .line 62
    new-instance v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;

    .line 63
    .line 64
    .line 65
    invoke-direct {v0, p1}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;-><init>(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 69
    .line 70
    :cond_1
    sget-object p1, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRollbackData;->INSTANCE:Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRollbackData;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p0, p1}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 74
    :cond_2
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

.method public r2(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V
    .locals 3
    .param p1    # Lcom/kubi/assets/entity/AssetV2OverviewEntity;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    if-eqz p1, :cond_5

    .line 3
    .line 4
    iput-object p1, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->W:Lcom/kubi/assets/entity/AssetV2OverviewEntity;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Landroidx/fragment/app/Fragment;->getContext()Landroid/content/Context;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_5

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseFragment;->isShowing()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_0

    .line 17
    goto :goto_2

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotal()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 21
    move-result-object v0

    .line 22
    const/4 v1, 0x0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/data/entity/AssetSingleEntity;->getTotalBalance()Ljava/math/BigDecimal;

    .line 28
    move-result-object v0

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    move-object v0, v1

    .line 31
    :goto_0
    const/4 v2, 0x1

    .line 32
    .line 33
    .line 34
    invoke-static {v0, v1, v2, v1}, Lkf/a;->G(Ljava/math/BigDecimal;Ljava/lang/String;ILjava/lang/Object;)Ljava/math/BigDecimal;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    sget-object v2, Ljava/math/BigDecimal;->ZERO:Ljava/math/BigDecimal;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v2}, Ljava/math/BigDecimal;->compareTo(Ljava/math/BigDecimal;)I

    .line 41
    move-result v0

    .line 42
    .line 43
    if-gtz v0, :cond_3

    .line 44
    .line 45
    .line 46
    invoke-virtual {p1}, Lcom/kubi/assets/entity/AssetV2OverviewEntity;->getTotal()Lcom/kubi/data/entity/AssetSingleEntity;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    if-eqz v0, :cond_2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lcom/kubi/data/entity/AssetSingleEntity;->getExecute()Ljava/lang/Boolean;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 56
    .line 57
    .line 58
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 59
    move-result v0

    .line 60
    goto :goto_1

    .line 61
    :cond_2
    const/4 v0, 0x0

    .line 62
    .line 63
    :goto_1
    if-nez v0, :cond_4

    .line 64
    .line 65
    :cond_3
    new-instance v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, p1}, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRecentTransitionData;-><init>(Lcom/kubi/assets/entity/AssetV2OverviewEntity;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 72
    .line 73
    :cond_4
    sget-object v0, Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRollbackData;->INSTANCE:Lcom/kubi/assets/overview/AssetV2OverviewContract$UiIntent$GetRollbackData;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 77
    .line 78
    .line 79
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 80
    move-result-object v0

    .line 81
    .line 82
    new-instance v2, Lcom/kubi/assets/overview/account/AssetAccountFragment$onAssetsGet$1$1;

    .line 83
    .line 84
    .line 85
    invoke-direct {v2, p0, p1, v1}, Lcom/kubi/assets/overview/account/AssetAccountFragment$onAssetsGet$1$1;-><init>(Lcom/kubi/assets/overview/account/AssetAccountFragment;Lcom/kubi/assets/entity/AssetV2OverviewEntity;Lkotlin/coroutines/Continuation;)V

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v2}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 89
    :cond_5
    :goto_2
    return-void
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

.method public setNeedLoadingView(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/assets/overview/account/AssetAccountFragment;->Y:Z

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
