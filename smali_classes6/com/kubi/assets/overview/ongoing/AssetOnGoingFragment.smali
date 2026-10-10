.class public final Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;
.super Lcom/kubi/mvi/state/SimpleStateFragment;
.source "AssetOnGoingFragment.kt"

# interfaces
.implements Lcom/kubi/assets/overview/AssetV2OverviewAdapter$a;
.implements Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "KCFragmentCheck"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$Companion;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/kubi/mvi/state/SimpleStateFragment<",
        "Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;",
        ">;",
        "Lcom/kubi/assets/overview/AssetV2OverviewAdapter$a;",
        "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u0008\u0007\u0018\u0000 E2\u0008\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u0004:\u0001EB\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u0008\u0010\u0019\u001a\u00020\u001aH\u0014J\u0008\u0010\u001b\u001a\u00020\u001cH\u0014J\u0008\u0010\u001d\u001a\u00020\u001cH\u0002J\u0008\u0010\u001e\u001a\u00020\u001cH\u0002J.\u0010\u001f\u001a\u00020\u001c2\u0006\u0010 \u001a\u00020!2\u0008\u0010\"\u001a\u0004\u0018\u00010#2\u0008\u0010$\u001a\u0004\u0018\u00010%2\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u0002J\u0012\u0010(\u001a\u00020\u001c2\u0008\u0010&\u001a\u0004\u0018\u00010\'H\u0002J\u0010\u0010)\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020\u0018H\u0002J\u0018\u0010+\u001a\u00020\u001c2\u0006\u0010,\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020%H\u0002J\u0010\u0010.\u001a\u00020\u001c2\u0006\u0010*\u001a\u00020/H\u0002J\u0008\u00100\u001a\u00020\u001cH\u0016J\u0008\u00101\u001a\u00020\u001cH\u0014J\u0010\u00102\u001a\u00020\u001c2\u0006\u00103\u001a\u000204H\u0014J%\u00105\u001a\u00020\u001c2\n\u0008\u0002\u0010*\u001a\u0004\u0018\u0001062\n\u0008\u0002\u0010,\u001a\u0004\u0018\u00010\u001aH\u0002\u00a2\u0006\u0002\u00107J\u0010\u0010=\u001a\u00020\u001c2\u0006\u0010>\u001a\u00020\u0010H\u0016J\u0010\u0010?\u001a\u00020\u001c2\u0006\u0010@\u001a\u00020\u0010H\u0016J\u0008\u0010A\u001a\u00020\u001cH\u0016J\u000e\u0010B\u001a\u00020\u001c2\u0006\u0010C\u001a\u00020DR\u0010\u0010\u0007\u001a\u0004\u0018\u00010\u0008X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u0004\u0018\u00010\n8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\r\u0010\u000e\u001a\u0004\u0008\u000b\u0010\u000cR\u001a\u0010\u000f\u001a\u00020\u0010X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012\"\u0004\u0008\u0013\u0010\u0014R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\"\u00108\u001a\u0010\u0012\u000c\u0008\u0001\u0012\u0008\u0012\u0004\u0012\u00020\u00020:098TX\u0094\u0004\u00a2\u0006\u0006\u001a\u0004\u0008;\u0010<\u00a8\u0006F"
    }
    d2 = {
        "Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;",
        "Lcom/kubi/mvi/state/SimpleStateFragment;",
        "Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;",
        "Lcom/kubi/assets/overview/AssetV2OverviewAdapter$OverViewIntentListener;",
        "Landroidx/swiperefreshlayout/widget/SwipeRefreshLayout$OnRefreshListener;",
        "<init>",
        "()V",
        "mAdapter",
        "Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;",
        "binding",
        "Lcom/kubi/assets/databinding/AssetOngoingListBinding;",
        "getBinding",
        "()Lcom/kubi/assets/databinding/AssetOngoingListBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "needLoadingView",
        "",
        "getNeedLoadingView",
        "()Z",
        "setNeedLoadingView",
        "(Z)V",
        "loadingView",
        "Lcom/kubi/sdk/widget/loading/WrapperLoadingView;",
        "currentHeaderItem",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$HeaderItem;",
        "getLayout",
        "",
        "initView",
        "",
        "configureRecycledViewPool",
        "initHeaderSelectionUI",
        "updateFloatingTitle",
        "recyclerView",
        "Landroidx/recyclerview/widget/RecyclerView;",
        "floatingTitleTextView",
        "Landroid/widget/TextView;",
        "floatingTitleLayout",
        "Landroid/view/View;",
        "ivArrow",
        "Landroid/widget/ImageView;",
        "handleExpandedUI",
        "handleHeaderView",
        "productItem",
        "handleItemClick",
        "position",
        "view",
        "handleLoadMoreItem",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$LoadMoreItem;",
        "onShow",
        "bindState",
        "dispatchSingleEvent",
        "singleEvent",
        "Lcom/kubi/mvi/event/ISingleEvent;",
        "jumpRobotUrl",
        "Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$RobotItem;",
        "(Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$RobotItem;Ljava/lang/Integer;)V",
        "vmClass",
        "Lkotlin/reflect/KClass;",
        "Lcom/kubi/mvi/state/SimpleStateVM;",
        "getVmClass",
        "()Lkotlin/reflect/KClass;",
        "onHideZeroListener",
        "hide",
        "onEyesChangedListener",
        "visible",
        "onRefresh",
        "autoClickItemAtPosition",
        "account",
        "",
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
        "SMAP\nAssetOnGoingFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AssetOnGoingFragment.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingFragment\n+ 2 FragmentViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/FragmentViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 AssetEx.kt\ncom/kubi/assets/AssetExKt\n+ 5 AssetsIssue.kt\ncom/kubi/assets/exception/AssetsIssueKt\n+ 6 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n+ 7 StateEx.kt\ncom/kubi/mvi/state/StateExKt\n*L\n1#1,439:1\n147#2,16:440\n1869#3,2:456\n51#4,3:458\n44#5,2:461\n135#6,2:463\n93#7,4:465\n*S KotlinDebug\n*F\n+ 1 AssetOnGoingFragment.kt\ncom/kubi/assets/overview/ongoing/AssetOnGoingFragment\n*L\n59#1:440,16\n104#1:456,2\n262#1:458,3\n283#1:461,2\n320#1:463,2\n363#1:465,4\n*E\n"
    }
.end annotation


# static fields
.field public static final Z:Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic a0:[Lkotlin/reflect/KProperty;
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
.field public U:Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final V:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public W:Z

.field public X:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public Y:Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;
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
    const-string v1, "getBinding()Lcom/kubi/assets/databinding/AssetOngoingListBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;

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
    sput-object v1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->a0:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->Z:Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$Companion;

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
    sget-object v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$special$$inlined$viewBindingFragment$1;->INSTANCE:Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$special$$inlined$viewBindingFragment$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$special$$inlined$viewBindingFragment$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$special$$inlined$viewBindingFragment$2;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;)V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v1, v0}, Lw00/e;->e(Landroidx/fragment/app/Fragment;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->V:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    return-void
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

.method public static final B3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->Y:Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->x3(Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;)V

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;->f()Z

    .line 11
    move-result v1

    .line 12
    .line 13
    xor-int/lit8 v1, v1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;->h(Z)V

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    if-eqz v0, :cond_0

    .line 23
    .line 24
    iget-object v0, v0, Lta/w1;->c:Landroid/widget/ImageView;

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    const/4 v0, 0x0

    .line 27
    .line 28
    .line 29
    :goto_0
    invoke-virtual {p0, v0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->w3(Landroid/widget/ImageView;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 33
    move-result-object p0

    .line 34
    .line 35
    if-eqz p0, :cond_1

    .line 36
    .line 37
    iget-object p0, p0, Lta/w1;->b:Landroid/widget/RelativeLayout;

    .line 38
    .line 39
    if-eqz p0, :cond_1

    .line 40
    .line 41
    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v0}, Landroid/view/View;->setTag(Ljava/lang/Object;)V

    .line 45
    .line 46
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 47
    return-object p0
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

.method public static final C3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "<unused var>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string p1, "view"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p3, p2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->y3(ILandroid/view/View;)V

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

.method public static synthetic E3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;Ljava/lang/Integer;ILjava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    and-int/lit8 p4, p3, 0x1

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    if-eqz p4, :cond_0

    .line 6
    move-object p1, v0

    .line 7
    .line 8
    :cond_0
    and-int/lit8 p3, p3, 0x2

    .line 9
    .line 10
    if-eqz p3, :cond_1

    .line 11
    move-object p2, v0

    .line 12
    .line 13
    .line 14
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->D3(Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;Ljava/lang/Integer;)V

    .line 15
    return-void
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
.end method

.method public static synthetic m3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->B3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;)Lkotlin/Unit;

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

.method public static synthetic n3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2, p3}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->C3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;Lcom/chad/library/adapter/base/BaseQuickAdapter;Landroid/view/View;I)V

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

.method public static final synthetic o3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;)Lta/w1;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

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

.method public static final synthetic p3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;)Lcom/kubi/sdk/widget/loading/WrapperLoadingView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->X:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

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

.method public static final synthetic q3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->U:Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;

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

.method public static final synthetic r3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;)Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/mvi/state/BaseStateFragment;->getState()Lcom/kubi/mvi/state/f;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    check-cast p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;

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

.method public static final synthetic s3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/ImageView;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2, p3, p4}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->F3(Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/ImageView;)V

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
.end method


# virtual methods
.method public final A3()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lta/w1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    new-instance v1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$a;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1, p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$a;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;)V

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->addOnScrollListener(Landroidx/recyclerview/widget/RecyclerView$OnScrollListener;)V

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    iget-object v1, v0, Lta/w1;->b:Landroid/widget/RelativeLayout;

    .line 27
    .line 28
    if-eqz v1, :cond_1

    .line 29
    .line 30
    new-instance v4, Lcom/kubi/assets/overview/ongoing/o;

    .line 31
    .line 32
    .line 33
    invoke-direct {v4, p0}, Lcom/kubi/assets/overview/ongoing/o;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;)V

    .line 34
    const/4 v5, 0x1

    .line 35
    const/4 v6, 0x0

    .line 36
    .line 37
    const-wide/16 v2, 0x0

    .line 38
    .line 39
    .line 40
    invoke-static/range {v1 .. v6}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 41
    :cond_1
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

.method public final D3(Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;Ljava/lang/Integer;)V
    .locals 6

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    sget-object v1, Lcom/kubi/host/HostManager;->a:Lcom/kubi/host/HostManager;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1}, Lcom/kubi/host/HostManager;->j()Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    const-string v1, "/running?redirect=false&loading=2&lang="

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 20
    .line 21
    sget-object v1, Lcom/kubi/sdk/function/language/a;->g:Lcom/kubi/sdk/function/language/LanguageType;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/kubi/sdk/function/language/LanguageType;->getLocale()Ljava/util/Locale;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    if-eqz p2, :cond_1

    .line 35
    .line 36
    if-nez p1, :cond_0

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_0
    sget-object v1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v0}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    new-instance v1, Ljava/lang/StringBuilder;

    .line 46
    .line 47
    .line 48
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 49
    .line 50
    const-string v2, "botCard"

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 57
    move-result v2

    .line 58
    .line 59
    add-int/lit8 v2, v2, 0x1

    .line 60
    .line 61
    .line 62
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 66
    move-result-object v1

    .line 67
    .line 68
    const-string v2, "B1overview"

    .line 69
    .line 70
    const-string v3, "ongoingArea"

    .line 71
    .line 72
    .line 73
    invoke-static {v2, v3, v1}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 74
    move-result-object v1

    .line 75
    .line 76
    .line 77
    invoke-static {v0, v1}, Lcom/kubi/sdk/util/s1;->c(Lay/a;Ljava/lang/String;)Lay/a;

    .line 78
    move-result-object v0

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0}, Lay/a;->k()Z

    .line 82
    .line 83
    sget-object v0, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 84
    .line 85
    .line 86
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 87
    move-result p2

    .line 88
    .line 89
    .line 90
    invoke-virtual {p1}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;->k()Ljava/lang/Integer;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;->m()Ljava/lang/String;

    .line 95
    move-result-object p1

    .line 96
    const/4 v2, 0x2

    .line 97
    const/4 v3, 0x0

    .line 98
    .line 99
    const-string v4, "-"

    .line 100
    const/4 v5, 0x0

    .line 101
    .line 102
    .line 103
    invoke-static {p1, v4, v5, v2, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 104
    move-result p1

    .line 105
    .line 106
    .line 107
    invoke-virtual {v0, p2, v1, p1}, Lcom/kubi/assets/overview/b1;->d(ILjava/lang/Integer;Z)V

    .line 108
    return-void

    .line 109
    .line 110
    :cond_1
    :goto_0
    sget-object p1, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1, v0}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    .line 117
    invoke-virtual {p1}, Lay/a;->k()Z

    .line 118
    return-void
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
.end method

.method public final F3(Landroidx/recyclerview/widget/RecyclerView;Landroid/widget/TextView;Landroid/view/View;Landroid/widget/ImageView;)V
    .locals 5

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getLayoutManager()Landroidx/recyclerview/widget/RecyclerView$LayoutManager;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    instance-of v2, v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    if-eqz v2, :cond_0

    .line 13
    .line 14
    check-cast v1, Landroidx/recyclerview/widget/LinearLayoutManager;

    .line 15
    goto :goto_0

    .line 16
    :catchall_0
    move-exception p1

    .line 17
    .line 18
    goto/16 :goto_9

    .line 19
    :cond_0
    move-object v1, v3

    .line 20
    .line 21
    :goto_0
    if-eqz v1, :cond_e

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Landroidx/recyclerview/widget/LinearLayoutManager;->findFirstVisibleItemPosition()I

    .line 25
    move-result v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    instance-of v4, v2, Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    check-cast v2, Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;

    .line 36
    goto :goto_1

    .line 37
    :cond_1
    move-object v2, v3

    .line 38
    .line 39
    :goto_1
    if-eqz v2, :cond_2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v2}, Lcom/kubi/sdk/adapter/KcBaseDifferMultiAdapter;->getItems()Ljava/util/List;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    if-eqz v2, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    check-cast v2, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;

    .line 52
    goto :goto_2

    .line 53
    :cond_2
    move-object v2, v3

    .line 54
    .line 55
    :goto_2
    instance-of v4, v2, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 56
    .line 57
    if-eqz v4, :cond_3

    .line 58
    .line 59
    check-cast v2, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 60
    .line 61
    iput-object v2, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->Y:Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 62
    goto :goto_6

    .line 63
    .line 64
    :cond_3
    :goto_3
    if-ge v0, v1, :cond_7

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView;->getAdapter()Landroidx/recyclerview/widget/RecyclerView$Adapter;

    .line 68
    move-result-object v2

    .line 69
    .line 70
    instance-of v4, v2, Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;

    .line 71
    .line 72
    if-eqz v4, :cond_4

    .line 73
    .line 74
    check-cast v2, Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;

    .line 75
    goto :goto_4

    .line 76
    :cond_4
    move-object v2, v3

    .line 77
    .line 78
    :goto_4
    if-eqz v2, :cond_5

    .line 79
    .line 80
    .line 81
    invoke-virtual {v2}, Lcom/kubi/sdk/adapter/KcBaseDifferMultiAdapter;->getItems()Ljava/util/List;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    if-eqz v2, :cond_5

    .line 85
    .line 86
    .line 87
    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 88
    move-result-object v2

    .line 89
    .line 90
    check-cast v2, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;

    .line 91
    goto :goto_5

    .line 92
    :cond_5
    move-object v2, v3

    .line 93
    .line 94
    :goto_5
    instance-of v4, v2, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 95
    .line 96
    if-eqz v4, :cond_6

    .line 97
    .line 98
    check-cast v2, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 99
    .line 100
    iput-object v2, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->Y:Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 101
    goto :goto_6

    .line 102
    :cond_6
    add-int/2addr v1, v0

    .line 103
    goto :goto_3

    .line 104
    .line 105
    :cond_7
    :goto_6
    iget-object p1, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->Y:Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 106
    .line 107
    if-eqz p1, :cond_8

    .line 108
    .line 109
    .line 110
    invoke-virtual {p1}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->a()Ljava/lang/String;

    .line 111
    move-result-object p1

    .line 112
    goto :goto_7

    .line 113
    :cond_8
    move-object p1, v3

    .line 114
    .line 115
    .line 116
    :goto_7
    invoke-static {p1}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 117
    move-result-object p1

    .line 118
    .line 119
    .line 120
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 121
    move-result p1

    .line 122
    .line 123
    if-lez p1, :cond_c

    .line 124
    .line 125
    if-eqz p3, :cond_9

    .line 126
    .line 127
    .line 128
    invoke-static {p3}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 129
    .line 130
    :cond_9
    if-eqz p2, :cond_b

    .line 131
    .line 132
    iget-object p1, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->Y:Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 133
    .line 134
    if-eqz p1, :cond_a

    .line 135
    .line 136
    .line 137
    invoke-virtual {p1}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;->a()Ljava/lang/String;

    .line 138
    move-result-object v3

    .line 139
    .line 140
    .line 141
    :cond_a
    invoke-static {v3}, Lcom/kubi/utils/extensions/f;->h(Ljava/lang/String;)Ljava/lang/String;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, p1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 146
    .line 147
    .line 148
    :cond_b
    invoke-virtual {p0, p4}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->w3(Landroid/widget/ImageView;)V

    .line 149
    .line 150
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 151
    goto :goto_8

    .line 152
    .line 153
    :cond_c
    if-eqz p3, :cond_d

    .line 154
    .line 155
    .line 156
    invoke-static {p3}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 157
    .line 158
    sget-object v3, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 159
    .line 160
    .line 161
    :cond_d
    :goto_8
    invoke-static {v3}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 162
    return-void

    .line 163
    .line 164
    :goto_9
    sget-object p2, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 165
    .line 166
    .line 167
    invoke-static {p1}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 168
    move-result-object p1

    .line 169
    .line 170
    .line 171
    invoke-static {p1}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    :cond_e
    return-void
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
    goto :goto_0

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->U:Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, p1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;->R(Z)V

    .line 15
    .line 16
    :cond_1
    iget-object p1, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->U:Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;

    .line 17
    .line 18
    if-eqz p1, :cond_2

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Landroidx/recyclerview/widget/RecyclerView$Adapter;->notifyDataSetChanged()V

    .line 22
    :cond_2
    :goto_0
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

.method public bindState()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$bindState$1;->INSTANCE:Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$bindState$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$bindState$2;

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0, v2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$bindState$2;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;Lkotlin/coroutines/Continuation;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0, v0, v1}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V

    .line 15
    .line 16
    sget-object v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$bindState$3;->INSTANCE:Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$bindState$3;

    .line 17
    .line 18
    new-instance v1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$bindState$4;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1, p0, v2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$bindState$4;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;Lkotlin/coroutines/Continuation;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v0, v1}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V

    .line 25
    .line 26
    sget-object v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$bindState$5;->INSTANCE:Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$bindState$5;

    .line 27
    .line 28
    new-instance v1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$bindState$6;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, p0, v2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$bindState$6;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;Lkotlin/coroutines/Continuation;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v0, v1}, Lcom/kubi/mvi/state/BaseStateFragment;->bindState(Lkotlin/reflect/KProperty1;Lkotlin/jvm/functions/Function2;)V

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

.method public dispatchSingleEvent(Ldr/a;)V
    .locals 1
    .param p1    # Ldr/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "singleEvent"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    instance-of p1, p1, Lcom/kubi/assets/overview/ongoing/m;

    .line 8
    .line 9
    if-eqz p1, :cond_3

    .line 10
    .line 11
    iget-object p1, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->X:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

    .line 12
    .line 13
    if-eqz p1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Lcom/kubi/sdk/widget/loading/WrapperLoadingView;->getStatus()I

    .line 17
    move-result p1

    .line 18
    const/4 v0, 0x1

    .line 19
    .line 20
    if-ne p1, v0, :cond_0

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    sget-object p1, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 24
    .line 25
    const-string v0, "error"

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0}, Lcom/kubi/assets/overview/b1;->q(Ljava/lang/String;)V

    .line 29
    .line 30
    iget-object p1, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->X:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

    .line 31
    .line 32
    if-eqz p1, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {p1}, Lcom/kubi/sdk/widget/loading/WrapperLoadingView;->showContent()V

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 39
    move-result-object p1

    .line 40
    .line 41
    if-eqz p1, :cond_2

    .line 42
    .line 43
    iget-object p1, p1, Lta/w1;->f:Lcom/kubi/assets/overview/ongoing/OnGoingRecommendView;

    .line 44
    .line 45
    if-eqz p1, :cond_2

    .line 46
    .line 47
    .line 48
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 49
    .line 50
    .line 51
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 52
    move-result-object p1

    .line 53
    .line 54
    if-eqz p1, :cond_3

    .line 55
    .line 56
    iget-object p1, p1, Lta/w1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 57
    .line 58
    if-eqz p1, :cond_3

    .line 59
    .line 60
    .line 61
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 62
    :cond_3
    return-void
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

.method public getLayout()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/assets/R$layout;->asset_ongoing_list:I

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
    iget-boolean v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->W:Z

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
            "Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UIState;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-class v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingViewModel;

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
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/state/BaseStateFragment;->initView()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v0, v0, Lta/w1;->e:Landroid/view/View;

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move-object v0, v1

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-static {v0}, Lcom/kubi/sdk/widget/loading/WrapperLoadingView;->injectView(Landroid/view/View;)Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    iput-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->X:Lcom/kubi/sdk/widget/loading/WrapperLoadingView;

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0}, Lcom/kubi/sdk/widget/loading/WrapperLoadingView;->showLoading()V

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    iget-object v0, v0, Lta/w1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 34
    .line 35
    if-eqz v0, :cond_2

    .line 36
    const/4 v2, 0x0

    .line 37
    .line 38
    .line 39
    invoke-static {v0, v2}, Lcom/kubi/resources/t;->g(Landroidx/recyclerview/widget/RecyclerView;Z)V

    .line 40
    .line 41
    .line 42
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    if-eqz v0, :cond_3

    .line 46
    .line 47
    iget-object v0, v0, Lta/w1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemAnimator(Landroidx/recyclerview/widget/RecyclerView$ItemAnimator;)V

    .line 53
    .line 54
    .line 55
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->u3()V

    .line 56
    .line 57
    new-instance v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;

    .line 58
    .line 59
    new-instance v1, Lcom/kubi/assets/overview/ongoing/f0;

    .line 60
    .line 61
    .line 62
    invoke-direct {v1}, Lcom/kubi/assets/overview/ongoing/f0;-><init>()V

    .line 63
    .line 64
    new-instance v2, Ljava/util/ArrayList;

    .line 65
    .line 66
    .line 67
    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 68
    .line 69
    .line 70
    invoke-direct {v0, p0, v1, v2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;Lcom/kubi/assets/overview/ongoing/f0;Ljava/util/List;)V

    .line 71
    .line 72
    iput-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->U:Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;

    .line 73
    .line 74
    new-instance v1, Lcom/kubi/assets/overview/ongoing/n;

    .line 75
    .line 76
    .line 77
    invoke-direct {v1, p0}, Lcom/kubi/assets/overview/ongoing/n;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1}, Lcom/chad/library/adapter/base/BaseQuickAdapter;->setOnItemClickListener(Lcom/chad/library/adapter/base/BaseQuickAdapter$OnItemClickListener;)Lcom/chad/library/adapter/base/BaseQuickAdapter;

    .line 81
    .line 82
    .line 83
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    iget-object v0, v0, Lta/w1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 89
    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    iget-object v1, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->U:Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setAdapter(Landroidx/recyclerview/widget/RecyclerView$Adapter;)V

    .line 96
    .line 97
    .line 98
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->A3()V

    .line 99
    return-void
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

.method public onRefresh()V
    .locals 1

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
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->onShow()V

    .line 10
    :cond_0
    return-void
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

.method public onShow()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/mvi/state/BaseStateFragment;->onShow()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$GetOnGoingData;->INSTANCE:Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$GetOnGoingData;

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 9
    .line 10
    new-instance v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$HideOrShowNumber;

    .line 11
    .line 12
    sget-object v1, Llb/h;->a:Llb/h;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Llb/h;->D()Ly70/g;

    .line 16
    move-result-object v1

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {v1, v2}, Ly70/a;->d(Ly70/g;Z)Z

    .line 21
    move-result v1

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$HideOrShowNumber;-><init>(Z)V

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

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

.method public setNeedLoadingView(Z)V
    .locals 0

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->W:Z

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

.method public final t3(Ljava/lang/String;)V
    .locals 3
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "account"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Ljava/lang/String;->hashCode()I

    .line 9
    move-result v0

    .line 10
    .line 11
    .line 12
    sparse-switch v0, :sswitch_data_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :sswitch_0
    const-string v0, "leadTrading"

    .line 16
    .line 17
    .line 18
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    move-result p1

    .line 20
    .line 21
    if-nez p1, :cond_0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    const/16 p1, 0x9

    .line 25
    goto :goto_1

    .line 26
    .line 27
    :sswitch_1
    const-string v0, "robot"

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 31
    move-result p1

    .line 32
    .line 33
    if-nez p1, :cond_1

    .line 34
    goto :goto_0

    .line 35
    :cond_1
    const/4 p1, 0x4

    .line 36
    goto :goto_1

    .line 37
    .line 38
    :sswitch_2
    const-string v0, "finance"

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 42
    move-result p1

    .line 43
    .line 44
    if-nez p1, :cond_2

    .line 45
    goto :goto_0

    .line 46
    :cond_2
    const/4 p1, 0x5

    .line 47
    goto :goto_1

    .line 48
    .line 49
    :sswitch_3
    const-string v0, "margin"

    .line 50
    .line 51
    .line 52
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 53
    move-result p1

    .line 54
    .line 55
    if-nez p1, :cond_3

    .line 56
    goto :goto_0

    .line 57
    :cond_3
    const/4 p1, 0x2

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :sswitch_4
    const-string v0, "future"

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 64
    move-result p1

    .line 65
    .line 66
    if-nez p1, :cond_4

    .line 67
    goto :goto_0

    .line 68
    :cond_4
    const/4 p1, 0x1

    .line 69
    goto :goto_1

    .line 70
    .line 71
    :sswitch_5
    const-string v0, "copyTrading"

    .line 72
    .line 73
    .line 74
    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 75
    move-result p1

    .line 76
    .line 77
    if-nez p1, :cond_5

    .line 78
    :goto_0
    const/4 p1, 0x0

    .line 79
    goto :goto_1

    .line 80
    .line 81
    :cond_5
    const/16 p1, 0x8

    .line 82
    .line 83
    .line 84
    :goto_1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 85
    move-result-object v0

    .line 86
    .line 87
    new-instance v1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$autoClickItemAtPosition$1;

    .line 88
    const/4 v2, 0x0

    .line 89
    .line 90
    .line 91
    invoke-direct {v1, p0, p1, v2}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment$autoClickItemAtPosition$1;-><init>(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;ILkotlin/coroutines/Continuation;)V

    .line 92
    .line 93
    .line 94
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenCreated(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 95
    return-void

    .line 96
    nop

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
    :sswitch_data_0
    .sparse-switch
        -0x64be3014 -> :sswitch_5
        -0x4b4a723d -> :sswitch_4
        -0x40737a52 -> :sswitch_3
        -0x32dbb026 -> :sswitch_2
        0x67a6a6a -> :sswitch_1
        0x16f27e25 -> :sswitch_0
    .end sparse-switch
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

.method public final u3()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    const/4 v1, 0x1

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    const/4 v1, 0x3

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    const/4 v1, 0x2

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 30
    const/4 v1, 0x4

    .line 31
    .line 32
    .line 33
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    .line 37
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 38
    .line 39
    const/16 v1, 0x8

    .line 40
    .line 41
    .line 42
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 43
    move-result-object v1

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 47
    .line 48
    const/16 v1, 0x9

    .line 49
    .line 50
    .line 51
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 52
    move-result-object v1

    .line 53
    .line 54
    .line 55
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 56
    const/4 v1, 0x5

    .line 57
    .line 58
    .line 59
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 64
    .line 65
    .line 66
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    .line 70
    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 71
    move-result v1

    .line 72
    .line 73
    if-eqz v1, :cond_1

    .line 74
    .line 75
    .line 76
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    check-cast v1, Ljava/lang/Number;

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    .line 83
    move-result v1

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 87
    move-result-object v2

    .line 88
    .line 89
    if-eqz v2, :cond_0

    .line 90
    .line 91
    iget-object v2, v2, Lta/w1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 92
    .line 93
    if-eqz v2, :cond_0

    .line 94
    .line 95
    .line 96
    invoke-virtual {v2}, Landroidx/recyclerview/widget/RecyclerView;->getRecycledViewPool()Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;

    .line 97
    move-result-object v2

    .line 98
    .line 99
    if-eqz v2, :cond_0

    .line 100
    const/4 v3, 0x0

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v1, v3}, Landroidx/recyclerview/widget/RecyclerView$RecycledViewPool;->setMaxRecycledViews(II)V

    .line 104
    goto :goto_0

    .line 105
    .line 106
    .line 107
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    if-eqz v0, :cond_2

    .line 111
    .line 112
    iget-object v0, v0, Lta/w1;->g:Landroidx/recyclerview/widget/RecyclerView;

    .line 113
    .line 114
    if-eqz v0, :cond_2

    .line 115
    .line 116
    const/16 v1, 0x14

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0, v1}, Landroidx/recyclerview/widget/RecyclerView;->setItemViewCacheSize(I)V

    .line 120
    :cond_2
    return-void
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

.method public final v3()Lta/w1;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->V:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->a0:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lta/w1;

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

.method public final w3(Landroid/widget/ImageView;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->Y:Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;->f()Z

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
    .line 16
    :goto_0
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 17
    .line 18
    .line 19
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 20
    move-result v1

    .line 21
    .line 22
    if-eqz v1, :cond_3

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    .line 26
    sget v0, Lcom/kubi/assets/R$drawable;->ic2_arrow_up_16:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 30
    .line 31
    :cond_1
    if-eqz p1, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 38
    move-result-object p1

    .line 39
    .line 40
    if-eqz p1, :cond_7

    .line 41
    .line 42
    iget-object p1, p1, Lta/w1;->i:Landroid/view/View;

    .line 43
    .line 44
    if-eqz p1, :cond_7

    .line 45
    .line 46
    .line 47
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 48
    return-void

    .line 49
    .line 50
    :cond_3
    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 54
    move-result v0

    .line 55
    .line 56
    if-eqz v0, :cond_6

    .line 57
    .line 58
    if-eqz p1, :cond_4

    .line 59
    .line 60
    sget v0, Lcom/kubi/assets/R$drawable;->ic2_arrow_down_16:I

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, v0}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 64
    .line 65
    :cond_4
    if-eqz p1, :cond_5

    .line 66
    .line 67
    .line 68
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 69
    .line 70
    .line 71
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->v3()Lta/w1;

    .line 72
    move-result-object p1

    .line 73
    .line 74
    if-eqz p1, :cond_7

    .line 75
    .line 76
    iget-object p1, p1, Lta/w1;->i:Landroid/view/View;

    .line 77
    .line 78
    if-eqz p1, :cond_7

    .line 79
    .line 80
    .line 81
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 82
    return-void

    .line 83
    .line 84
    :cond_6
    if-eqz p1, :cond_7

    .line 85
    .line 86
    .line 87
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 88
    :cond_7
    return-void
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

.method public final x3(Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;)V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$TitleClickEvent;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;->e()I

    .line 6
    move-result v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;->f()Z

    .line 10
    move-result p1

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, p1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingContract$UiIntent$TitleClickEvent;-><init>(IZ)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/kubi/mvi/state/BaseStateFragment;->sendIntent(Lcom/kubi/mvi/state/d;)V

    .line 17
    return-void
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

.method public final y3(ILandroid/view/View;)V
    .locals 21

    .line 1
    .line 2
    move-object/from16 v1, p0

    .line 3
    .line 4
    move/from16 v0, p1

    .line 5
    .line 6
    .line 7
    invoke-static/range {p2 .. p2}, Lcom/kubi/utils/a1;->a(Landroid/view/View;)Z

    .line 8
    move-result v2

    .line 9
    .line 10
    if-nez v2, :cond_14

    .line 11
    .line 12
    if-ltz v0, :cond_14

    .line 13
    .line 14
    iget-object v2, v1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->U:Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    if-eqz v2, :cond_0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Lcom/kubi/sdk/adapter/KcBaseDifferMultiAdapter;->getItems()Ljava/util/List;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    if-eqz v2, :cond_0

    .line 24
    .line 25
    .line 26
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 27
    move-result v2

    .line 28
    .line 29
    .line 30
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 31
    move-result-object v2

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    move-object v2, v3

    .line 34
    .line 35
    .line 36
    :goto_0
    invoke-static {v2}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 37
    move-result v2

    .line 38
    .line 39
    if-lt v0, v2, :cond_1

    .line 40
    .line 41
    goto/16 :goto_b

    .line 42
    :cond_1
    const/4 v2, 0x2

    .line 43
    .line 44
    :try_start_0
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 45
    .line 46
    iget-object v4, v1, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->U:Lcom/kubi/assets/overview/ongoing/AssetOnGoingAdapter;

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4}, Lcom/kubi/sdk/adapter/KcBaseDifferMultiAdapter;->getItems()Ljava/util/List;

    .line 52
    move-result-object v4

    .line 53
    .line 54
    if-eqz v4, :cond_2

    .line 55
    .line 56
    .line 57
    invoke-static {v4, v0}, Lkotlin/collections/CollectionsKt;->getOrNull(Ljava/util/List;I)Ljava/lang/Object;

    .line 58
    move-result-object v4

    .line 59
    .line 60
    check-cast v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem;

    .line 61
    goto :goto_1

    .line 62
    :catchall_0
    move-exception v0

    .line 63
    .line 64
    goto/16 :goto_9

    .line 65
    :cond_2
    move-object v4, v3

    .line 66
    .line 67
    :goto_1
    instance-of v5, v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$a;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 68
    const/4 v6, 0x0

    .line 69
    .line 70
    const-string v7, "-"

    .line 71
    .line 72
    if-eqz v5, :cond_3

    .line 73
    .line 74
    :try_start_1
    sget-object v5, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 75
    .line 76
    new-instance v8, Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V

    .line 80
    .line 81
    const-string v9, "kumex/trade?symbol="

    .line 82
    .line 83
    .line 84
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    move-object v9, v4

    .line 86
    .line 87
    check-cast v9, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$a;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v9}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$a;->q()Ljava/lang/String;

    .line 91
    move-result-object v9

    .line 92
    .line 93
    .line 94
    invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 98
    move-result-object v8

    .line 99
    .line 100
    .line 101
    invoke-virtual {v5, v8}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 102
    move-result-object v5

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5}, Lay/a;->k()Z

    .line 106
    .line 107
    sget-object v5, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 108
    move-object v8, v4

    .line 109
    .line 110
    check-cast v8, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$a;

    .line 111
    .line 112
    .line 113
    invoke-virtual {v8}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$a;->q()Ljava/lang/String;

    .line 114
    move-result-object v8

    .line 115
    move-object v9, v4

    .line 116
    .line 117
    check-cast v9, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$a;

    .line 118
    .line 119
    .line 120
    invoke-virtual {v9}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$a;->i()Ljava/lang/String;

    .line 121
    move-result-object v9

    .line 122
    .line 123
    check-cast v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$a;

    .line 124
    .line 125
    .line 126
    invoke-virtual {v4}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$a;->r()Ljava/lang/String;

    .line 127
    move-result-object v4

    .line 128
    .line 129
    .line 130
    invoke-static {v4, v7, v6, v2, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 131
    move-result v4

    .line 132
    .line 133
    .line 134
    invoke-virtual {v5, v0, v8, v9, v4}, Lcom/kubi/assets/overview/b1;->h(ILjava/lang/String;Ljava/lang/String;Z)V

    .line 135
    .line 136
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 137
    .line 138
    goto/16 :goto_8

    .line 139
    .line 140
    :cond_3
    instance-of v5, v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$c;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 141
    .line 142
    const-string v8, "ongoingArea"

    .line 143
    .line 144
    const-string v9, "B1overview"

    .line 145
    .line 146
    if-eqz v5, :cond_5

    .line 147
    .line 148
    :try_start_2
    sget-object v10, Lf00/a;->a:Lf00/a;

    .line 149
    .line 150
    const-string v0, "crossMarginCard"

    .line 151
    .line 152
    .line 153
    invoke-static {v9, v8, v0}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 154
    move-result-object v13

    .line 155
    .line 156
    const/16 v16, 0x1b

    .line 157
    .line 158
    const/16 v17, 0x0

    .line 159
    const/4 v11, 0x0

    .line 160
    const/4 v12, 0x0

    .line 161
    const/4 v14, 0x0

    .line 162
    const/4 v15, 0x0

    .line 163
    .line 164
    .line 165
    invoke-static/range {v10 .. v17}, Lg00/f$a;->h(Lg00/f;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 166
    .line 167
    sget-object v0, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 168
    move-object v5, v4

    .line 169
    .line 170
    check-cast v5, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$c;

    .line 171
    .line 172
    .line 173
    invoke-virtual {v5}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$c;->e()Ljava/util/List;

    .line 174
    move-result-object v5

    .line 175
    .line 176
    if-eqz v5, :cond_4

    .line 177
    .line 178
    .line 179
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 180
    move-result v5

    .line 181
    .line 182
    .line 183
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 184
    move-result-object v5

    .line 185
    goto :goto_2

    .line 186
    :cond_4
    move-object v5, v3

    .line 187
    .line 188
    .line 189
    :goto_2
    invoke-static {v5}, Lcom/kubi/utils/extensions/d;->j(Ljava/lang/Integer;)I

    .line 190
    move-result v5

    .line 191
    .line 192
    check-cast v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$c;

    .line 193
    .line 194
    .line 195
    invoke-virtual {v4}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$c;->h()Ljava/lang/String;

    .line 196
    move-result-object v4

    .line 197
    .line 198
    .line 199
    invoke-static {v4, v7, v6, v2, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 200
    move-result v4

    .line 201
    .line 202
    .line 203
    invoke-virtual {v0, v5, v4}, Lcom/kubi/assets/overview/b1;->e(IZ)V

    .line 204
    .line 205
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 206
    .line 207
    goto/16 :goto_8

    .line 208
    .line 209
    :cond_5
    instance-of v5, v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$f;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 210
    .line 211
    const-string v10, ""

    .line 212
    .line 213
    if-eqz v5, :cond_9

    .line 214
    .line 215
    :try_start_3
    sget-object v5, Lgf/n;->a:Lgf/n;

    .line 216
    move-object v11, v4

    .line 217
    .line 218
    check-cast v11, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$f;

    .line 219
    .line 220
    .line 221
    invoke-virtual {v11}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$f;->m()Ljava/lang/String;

    .line 222
    move-result-object v11

    .line 223
    .line 224
    if-nez v11, :cond_6

    .line 225
    move-object v11, v10

    .line 226
    .line 227
    .line 228
    :cond_6
    invoke-virtual {v5, v11}, Lgf/n;->B(Ljava/lang/String;)Lcom/kubi/data/entity/SymbolInfoEntity;

    .line 229
    move-result-object v5

    .line 230
    .line 231
    sget-object v11, Lf00/a;->a:Lf00/a;

    .line 232
    .line 233
    if-eqz v5, :cond_7

    .line 234
    .line 235
    .line 236
    invoke-virtual {v5}, Lcom/kubi/data/entity/SymbolInfoEntity;->getSymbol()Ljava/lang/String;

    .line 237
    move-result-object v5

    .line 238
    goto :goto_3

    .line 239
    :cond_7
    move-object v5, v3

    .line 240
    .line 241
    :goto_3
    if-nez v5, :cond_8

    .line 242
    move-object v12, v10

    .line 243
    goto :goto_4

    .line 244
    :cond_8
    move-object v12, v5

    .line 245
    .line 246
    :goto_4
    new-instance v5, Ljava/lang/StringBuilder;

    .line 247
    .line 248
    .line 249
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 250
    .line 251
    const-string v10, "isolatedMarginCard"

    .line 252
    .line 253
    .line 254
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 255
    .line 256
    add-int/lit8 v10, v0, 0x1

    .line 257
    .line 258
    .line 259
    invoke-virtual {v5, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 260
    .line 261
    .line 262
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 263
    move-result-object v5

    .line 264
    .line 265
    .line 266
    invoke-static {v9, v8, v5}, Lqq/m;->m(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 267
    move-result-object v14

    .line 268
    .line 269
    const/16 v17, 0x1a

    .line 270
    .line 271
    const/16 v18, 0x0

    .line 272
    const/4 v13, 0x0

    .line 273
    const/4 v15, 0x0

    .line 274
    .line 275
    const/16 v16, 0x0

    .line 276
    .line 277
    .line 278
    invoke-static/range {v11 .. v18}, Lg00/f$a;->f(Lg00/f;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 279
    .line 280
    sget-object v5, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 281
    move-object v8, v4

    .line 282
    .line 283
    check-cast v8, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$f;

    .line 284
    .line 285
    .line 286
    invoke-virtual {v8}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$f;->m()Ljava/lang/String;

    .line 287
    move-result-object v8

    .line 288
    .line 289
    check-cast v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$f;

    .line 290
    .line 291
    .line 292
    invoke-virtual {v4}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$f;->j()Ljava/lang/String;

    .line 293
    move-result-object v4

    .line 294
    .line 295
    .line 296
    invoke-static {v4, v7, v6, v2, v3}, Lkotlin/text/StringsKt;->contains$default(Ljava/lang/CharSequence;Ljava/lang/CharSequence;ZILjava/lang/Object;)Z

    .line 297
    move-result v4

    .line 298
    .line 299
    .line 300
    invoke-virtual {v5, v0, v8, v4}, Lcom/kubi/assets/overview/b1;->i(ILjava/lang/String;Z)V

    .line 301
    .line 302
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 303
    .line 304
    goto/16 :goto_8

    .line 305
    .line 306
    :cond_9
    instance-of v5, v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;

    .line 307
    .line 308
    if-eqz v5, :cond_a

    .line 309
    .line 310
    check-cast v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;

    .line 311
    .line 312
    .line 313
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 314
    move-result-object v0

    .line 315
    .line 316
    .line 317
    invoke-virtual {v1, v4, v0}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->D3(Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;Ljava/lang/Integer;)V

    .line 318
    .line 319
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 320
    .line 321
    goto/16 :goto_8

    .line 322
    .line 323
    :cond_a
    instance-of v5, v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$b;

    .line 324
    .line 325
    if-eqz v5, :cond_b

    .line 326
    .line 327
    sget-object v11, Lf00/a;->a:Lf00/a;

    .line 328
    .line 329
    const-string v12, "copyTrading"

    .line 330
    .line 331
    const-string v14, "copyTradingJump.myCopy"

    .line 332
    .line 333
    const/16 v19, 0x7a

    .line 334
    .line 335
    const/16 v20, 0x0

    .line 336
    const/4 v13, 0x0

    .line 337
    const/4 v15, 0x0

    .line 338
    .line 339
    const/16 v16, 0x0

    .line 340
    .line 341
    const/16 v17, 0x0

    .line 342
    .line 343
    const/16 v18, 0x0

    .line 344
    .line 345
    .line 346
    invoke-static/range {v11 .. v20}, Lg00/f$a;->j(Lg00/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 347
    move-result v0

    .line 348
    .line 349
    .line 350
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 351
    move-result-object v0

    .line 352
    .line 353
    goto/16 :goto_8

    .line 354
    .line 355
    :cond_b
    instance-of v5, v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$g;

    .line 356
    .line 357
    if-eqz v5, :cond_c

    .line 358
    .line 359
    sget-object v11, Lf00/a;->a:Lf00/a;

    .line 360
    .line 361
    const-string v12, "copyTrading"

    .line 362
    .line 363
    const-string v14, "copyTradingJump.myLeading"

    .line 364
    .line 365
    const/16 v19, 0x7a

    .line 366
    .line 367
    const/16 v20, 0x0

    .line 368
    const/4 v13, 0x0

    .line 369
    const/4 v15, 0x0

    .line 370
    .line 371
    const/16 v16, 0x0

    .line 372
    .line 373
    const/16 v17, 0x0

    .line 374
    .line 375
    const/16 v18, 0x0

    .line 376
    .line 377
    .line 378
    invoke-static/range {v11 .. v20}, Lg00/f$a;->j(Lg00/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 379
    move-result v0

    .line 380
    .line 381
    .line 382
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 383
    move-result-object v0

    .line 384
    .line 385
    goto/16 :goto_8

    .line 386
    .line 387
    :cond_c
    instance-of v5, v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;

    .line 388
    .line 389
    if-eqz v5, :cond_11

    .line 390
    move-object v5, v4

    .line 391
    .line 392
    check-cast v5, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;

    .line 393
    .line 394
    .line 395
    invoke-virtual {v5}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;->n()Ljava/lang/String;

    .line 396
    move-result-object v5

    .line 397
    .line 398
    .line 399
    invoke-static {v5}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 400
    move-result v6

    .line 401
    .line 402
    if-nez v6, :cond_10

    .line 403
    .line 404
    sget-object v6, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 405
    .line 406
    .line 407
    invoke-virtual {v6, v5}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 408
    move-result-object v5

    .line 409
    .line 410
    .line 411
    invoke-virtual {v5}, Lay/a;->k()Z

    .line 412
    .line 413
    sget-object v5, Lcom/kubi/assets/overview/b1;->a:Lcom/kubi/assets/overview/b1;

    .line 414
    move-object v6, v4

    .line 415
    .line 416
    check-cast v6, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;

    .line 417
    .line 418
    .line 419
    invoke-virtual {v6}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;->h()Ljava/lang/String;

    .line 420
    move-result-object v6

    .line 421
    .line 422
    .line 423
    invoke-virtual {v5, v0, v6}, Lcom/kubi/assets/overview/b1;->g(ILjava/lang/String;)V

    .line 424
    .line 425
    sget-object v0, Lgf/n;->a:Lgf/n;

    .line 426
    move-object v5, v4

    .line 427
    .line 428
    check-cast v5, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;

    .line 429
    .line 430
    .line 431
    invoke-virtual {v5}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;->h()Ljava/lang/String;

    .line 432
    move-result-object v5

    .line 433
    .line 434
    if-nez v5, :cond_d

    .line 435
    goto :goto_5

    .line 436
    :cond_d
    move-object v10, v5

    .line 437
    .line 438
    .line 439
    :goto_5
    invoke-virtual {v0, v10}, Lgf/n;->u(Ljava/lang/String;)Lcom/kubi/data/entity/CoinInfoEntity;

    .line 440
    move-result-object v0

    .line 441
    move-object v5, v4

    .line 442
    .line 443
    check-cast v5, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;

    .line 444
    .line 445
    .line 446
    invoke-virtual {v5}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;->e()Ljava/lang/String;

    .line 447
    move-result-object v5

    .line 448
    .line 449
    const-string v6, "PWM_FUND"

    .line 450
    .line 451
    .line 452
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 453
    move-result v5

    .line 454
    .line 455
    const-wide/16 v6, 0x3e8

    .line 456
    .line 457
    if-eqz v5, :cond_e

    .line 458
    .line 459
    const-string v0, "finance_pwm_query_currency"

    .line 460
    .line 461
    check-cast v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;

    .line 462
    .line 463
    .line 464
    invoke-virtual {v4}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$d;->f()Ljava/lang/String;

    .line 465
    move-result-object v4

    .line 466
    .line 467
    .line 468
    invoke-static {v0, v4, v6, v7}, Lcom/kubi/event/api/a;->c(Ljava/lang/String;Ljava/lang/Object;J)V

    .line 469
    goto :goto_7

    .line 470
    .line 471
    :cond_e
    const-string v4, "finance_query_currency"

    .line 472
    .line 473
    if-eqz v0, :cond_f

    .line 474
    .line 475
    .line 476
    invoke-virtual {v0}, Lcom/kubi/data/entity/CoinInfoEntity;->getCode()Ljava/lang/String;

    .line 477
    move-result-object v0

    .line 478
    goto :goto_6

    .line 479
    :cond_f
    move-object v0, v3

    .line 480
    .line 481
    .line 482
    :goto_6
    invoke-static {v4, v0, v6, v7}, Lcom/kubi/event/api/a;->c(Ljava/lang/String;Ljava/lang/Object;J)V

    .line 483
    .line 484
    :cond_10
    :goto_7
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 485
    goto :goto_8

    .line 486
    .line 487
    :cond_11
    instance-of v0, v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 488
    .line 489
    if-eqz v0, :cond_12

    .line 490
    .line 491
    check-cast v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;

    .line 492
    .line 493
    .line 494
    invoke-virtual {v1, v4}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->x3(Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$e;)V

    .line 495
    .line 496
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 497
    goto :goto_8

    .line 498
    .line 499
    :cond_12
    instance-of v0, v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;

    .line 500
    .line 501
    if-eqz v0, :cond_13

    .line 502
    .line 503
    check-cast v4, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;

    .line 504
    .line 505
    .line 506
    invoke-virtual {v1, v4}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->z3(Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;)V

    .line 507
    .line 508
    :cond_13
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 509
    .line 510
    .line 511
    :goto_8
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 512
    move-result-object v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 513
    goto :goto_a

    .line 514
    .line 515
    :goto_9
    sget-object v4, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 516
    .line 517
    .line 518
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 519
    move-result-object v0

    .line 520
    .line 521
    .line 522
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 523
    move-result-object v0

    .line 524
    .line 525
    .line 526
    :goto_a
    invoke-static {v0}, Lkotlin/Result;->exceptionOrNull-impl(Ljava/lang/Object;)Ljava/lang/Throwable;

    .line 527
    move-result-object v5

    .line 528
    .line 529
    if-eqz v5, :cond_14

    .line 530
    .line 531
    new-instance v4, Lcom/kubi/assets/exception/AssetsException;

    .line 532
    .line 533
    const/16 v9, 0x8

    .line 534
    const/4 v10, 0x0

    .line 535
    .line 536
    const-string v6, "handleItemClick-AssetOnGoingFragment"

    .line 537
    const/4 v7, 0x0

    .line 538
    const/4 v8, 0x0

    .line 539
    .line 540
    .line 541
    invoke-direct/range {v4 .. v10}, Lcom/kubi/assets/exception/AssetsException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 542
    .line 543
    .line 544
    invoke-static {v4, v3, v2, v3}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 545
    :cond_14
    :goto_b
    return-void
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
.end method

.method public final z3(Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;)V
    .locals 22

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p1 .. p1}, Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$h;->d()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-eq v0, v1, :cond_5

    .line 8
    const/4 v1, 0x2

    .line 9
    .line 10
    if-eq v0, v1, :cond_4

    .line 11
    const/4 v1, 0x4

    .line 12
    .line 13
    if-eq v0, v1, :cond_3

    .line 14
    const/4 v1, 0x5

    .line 15
    .line 16
    if-eq v0, v1, :cond_2

    .line 17
    .line 18
    const/16 v1, 0x8

    .line 19
    .line 20
    if-eq v0, v1, :cond_1

    .line 21
    .line 22
    const/16 v1, 0x9

    .line 23
    .line 24
    if-eq v0, v1, :cond_0

    .line 25
    return-void

    .line 26
    .line 27
    :cond_0
    sget-object v2, Lf00/a;->a:Lf00/a;

    .line 28
    .line 29
    const/16 v10, 0x7a

    .line 30
    const/4 v11, 0x0

    .line 31
    .line 32
    const-string v3, "copyTrading"

    .line 33
    const/4 v4, 0x0

    .line 34
    .line 35
    const-string v5, "copyTradingJump.myLeading"

    .line 36
    const/4 v6, 0x0

    .line 37
    const/4 v7, 0x0

    .line 38
    const/4 v8, 0x0

    .line 39
    const/4 v9, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static/range {v2 .. v11}, Lg00/f$a;->j(Lg00/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 43
    return-void

    .line 44
    .line 45
    :cond_1
    sget-object v12, Lf00/a;->a:Lf00/a;

    .line 46
    .line 47
    const/16 v20, 0x7a

    .line 48
    .line 49
    const/16 v21, 0x0

    .line 50
    .line 51
    const-string v13, "copyTrading"

    .line 52
    const/4 v14, 0x0

    .line 53
    .line 54
    const-string v15, "copyTradingJump.myCopy"

    .line 55
    .line 56
    const/16 v16, 0x0

    .line 57
    .line 58
    const/16 v17, 0x0

    .line 59
    .line 60
    const/16 v18, 0x0

    .line 61
    .line 62
    const/16 v19, 0x0

    .line 63
    .line 64
    .line 65
    invoke-static/range {v12 .. v21}, Lg00/f$a;->j(Lg00/f;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 66
    return-void

    .line 67
    .line 68
    :cond_2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 69
    .line 70
    const-string v1, "account/asset?from=finance"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0}, Lay/a;->k()Z

    .line 78
    return-void

    .line 79
    :cond_3
    const/4 v0, 0x3

    .line 80
    const/4 v1, 0x0

    .line 81
    .line 82
    move-object/from16 v2, p0

    .line 83
    .line 84
    .line 85
    invoke-static {v2, v1, v1, v0, v1}, Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;->E3(Lcom/kubi/assets/overview/ongoing/AssetOnGoingFragment;Lcom/kubi/assets/overview/ongoing/mapper/ProductItem$i;Ljava/lang/Integer;ILjava/lang/Object;)V

    .line 86
    return-void

    .line 87
    .line 88
    :cond_4
    move-object/from16 v2, p0

    .line 89
    .line 90
    sget-object v0, Lcom/kubi/assets/service/a;->a:Lcom/kubi/assets/service/a;

    .line 91
    .line 92
    .line 93
    invoke-virtual {v0}, Lcom/kubi/assets/service/a;->d()Lcom/kubi/margin/api/IMarginService;

    .line 94
    move-result-object v3

    .line 95
    .line 96
    const/16 v8, 0xc

    .line 97
    const/4 v9, 0x0

    .line 98
    .line 99
    const-string v4, ""

    .line 100
    const/4 v5, 0x1

    .line 101
    const/4 v6, 0x0

    .line 102
    const/4 v7, 0x0

    .line 103
    .line 104
    .line 105
    invoke-static/range {v3 .. v9}, Lcom/kubi/margin/api/IMarginService;->d0(Lcom/kubi/margin/api/IMarginService;Ljava/lang/String;ZZLjava/lang/String;ILjava/lang/Object;)V

    .line 106
    return-void

    .line 107
    .line 108
    :cond_5
    move-object/from16 v2, p0

    .line 109
    .line 110
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 111
    .line 112
    const-string v1, "kumex/trade"

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lay/a;->k()Z

    .line 120
    return-void
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
