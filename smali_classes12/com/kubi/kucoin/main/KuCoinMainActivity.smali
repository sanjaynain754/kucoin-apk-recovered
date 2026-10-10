.class public final Lcom/kubi/kucoin/main/KuCoinMainActivity;
.super Lcom/kubi/sdk/base/ui/BaseUiActivity;
.source "KuCoinMainActivity.kt"

# interfaces
.implements Lcom/kubi/kucoin/api/IMainActivity;
.implements Lmy/f;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/kucoin/main/KuCoinMainActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u00b1\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0011\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0014*\u00018\u0008\u0007\u0018\u0000 \u0082\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0082\u0001B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0008\u0010.\u001a\u00020\u0014H\u0014J\n\u0010/\u001a\u0004\u0018\u000100H\u0014J\u0008\u00101\u001a\u00020\u0018H\u0014J\u0008\u00102\u001a\u00020\u0014H\u0016J\u0012\u0010:\u001a\u00020;2\u0008\u0010<\u001a\u0004\u0018\u00010\u001dH\u0014J\u0012\u0010=\u001a\u00020;2\u0008\u0010>\u001a\u0004\u0018\u00010?H\u0002J\u0008\u0010@\u001a\u00020;H\u0002J\u0008\u0010A\u001a\u00020;H\u0002J\u0008\u0010B\u001a\u00020;H\u0002J\u0008\u0010C\u001a\u00020;H\u0002J\u0008\u0010D\u001a\u00020;H\u0002J\u0008\u0010E\u001a\u00020;H\u0002J\u0010\u0010F\u001a\u00020;2\u0006\u0010G\u001a\u00020HH\u0002J\u0008\u0010I\u001a\u00020;H\u0016J\u0008\u0010J\u001a\u00020;H\u0002J\u0008\u0010K\u001a\u00020;H\u0002J\u0008\u0010L\u001a\u00020;H\u0002J\u0014\u0010M\u001a\u00020;2\n\u0008\u0002\u0010N\u001a\u0004\u0018\u00010OH\u0002J\u0010\u0010P\u001a\u00020;2\u0006\u0010Q\u001a\u00020\u0007H\u0002J\u0008\u0010R\u001a\u00020SH\u0002J\u0010\u0010T\u001a\u00020;2\u0006\u0010U\u001a\u00020\u0014H\u0002J\u0018\u0010V\u001a\u00020;2\u0006\u0010W\u001a\u00020\u00072\u0006\u0010X\u001a\u00020\u0007H\u0002J\u0018\u0010Y\u001a\u00020;2\u0006\u0010N\u001a\u00020O2\u0006\u0010Z\u001a\u00020[H\u0002J\u0012\u0010\\\u001a\u00020;2\u0008\u0010<\u001a\u0004\u0018\u00010\u001dH\u0002J\u0010\u0010]\u001a\u00020;2\u0006\u0010^\u001a\u00020\u0014H\u0002J\u0010\u0010_\u001a\u00020\u00072\u0006\u0010`\u001a\u00020\u0014H\u0002J\u0012\u0010a\u001a\u0004\u0018\u00010\u00072\u0006\u0010`\u001a\u00020\u0014H\u0002J\u0010\u0010b\u001a\u00020;2\u0006\u0010c\u001a\u00020\u0014H\u0002J\u0008\u0010d\u001a\u00020;H\u0002J\u0010\u0010e\u001a\u00020;2\u0006\u0010f\u001a\u00020\u0018H\u0016J\u0008\u0010g\u001a\u00020;H\u0014J\u0008\u0010h\u001a\u00020;H\u0014J\u0018\u0010i\u001a\u00020;2\u0006\u0010j\u001a\u00020\u00182\u0006\u0010k\u001a\u00020\u0018H\u0016J\n\u0010l\u001a\u0004\u0018\u00010mH\u0002J\u0014\u0010n\u001a\u0004\u0018\u00010o2\u0008\u0010p\u001a\u0004\u0018\u00010mH\u0002J\u0008\u0010q\u001a\u00020;H\u0002J\u0008\u0010r\u001a\u00020;H\u0014J\u0010\u0010s\u001a\u00020;2\u0006\u0010t\u001a\u00020\u001dH\u0014J\u000c\u0010u\u001a\u00020\u0014*\u00020\u0014H\u0002J\u000c\u0010v\u001a\u00020\u0014*\u00020\u0014H\u0002J\u0015\u0010w\u001a\u0004\u0018\u00010\u0014*\u0004\u0018\u00010?H\u0002\u00a2\u0006\u0002\u0010xJ\u0012\u0010y\u001a\u00020;2\u0008\u0010>\u001a\u0004\u0018\u00010?H\u0002J\n\u0010z\u001a\u0004\u0018\u00010\u001dH\u0002J\u0012\u0010{\u001a\u00020;2\u0008\u0010>\u001a\u0004\u0018\u00010?H\u0014J\u0008\u0010|\u001a\u00020;H\u0016J\u0008\u0010}\u001a\u00020;H\u0014J\u0006\u0010~\u001a\u00020\u0018J\u0012\u0010\u007f\u001a\u00020\u00182\u0008\u0008\u0001\u0010U\u001a\u00020\u0014H\u0002J\t\u0010\u0080\u0001\u001a\u00020;H\u0002J\t\u0010\u0081\u0001\u001a\u00020;H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\u0008\u001a\u0004\u0018\u00010\t8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\u000c\u0010\r\u001a\u0004\u0008\n\u0010\u000bR\u0016\u0010\u000e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0014X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u001dX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u0018X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u001f\u001a\u00020 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008#\u0010$\u001a\u0004\u0008!\u0010\"R\u000e\u0010%\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001d\u0010\'\u001a\u0004\u0018\u00010 8BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008)\u0010$\u001a\u0004\u0008(\u0010\"R\u000e\u0010*\u001a\u00020 X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0010\u0010+\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010-\u001a\u0004\u0018\u00010,X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u001b\u00103\u001a\u00020\u00188BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u00086\u0010$\u001a\u0004\u00084\u00105R\u0010\u00107\u001a\u000208X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u00109\u00a8\u0006\u0083\u0001"
    }
    d2 = {
        "Lcom/kubi/kucoin/main/KuCoinMainActivity;",
        "Lcom/kubi/sdk/base/ui/BaseUiActivity;",
        "Lcom/kubi/kucoin/api/IMainActivity;",
        "Lcom/kubi/sdk/eventhub/IBusinessTabBarHideable;",
        "<init>",
        "()V",
        "gcdMainHostId",
        "",
        "kucoinActivityMainBinding",
        "Lcom/kubi/facade/lib/databinding/KucoinActivityMainBinding;",
        "getKucoinActivityMainBinding",
        "()Lcom/kubi/facade/lib/databinding/KucoinActivityMainBinding;",
        "kucoinActivityMainBinding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "kycStateLiveData",
        "Landroidx/lifecycle/MutableLiveData;",
        "Lcom/kubi/mine/api/entity/KycStatusEntity;",
        "mViewModel",
        "Lcom/kubi/kucoin/main/KuCoinMainViewModel;",
        "currentCheckId",
        "",
        "networkChangeReceiver",
        "Lcom/kubi/kucoin/utils/NetworkChangeReceiver;",
        "isToggle",
        "",
        "mainStatusBarFixUtil",
        "Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;",
        "businessTabBarHidden",
        "pendingTradeRouteExtras",
        "Landroid/os/Bundle;",
        "isFirstRequestLimitConfig",
        "homeFragment",
        "Lcom/kubi/sdk/BaseFragment;",
        "getHomeFragment",
        "()Lcom/kubi/sdk/BaseFragment;",
        "homeFragment$delegate",
        "Lkotlin/Lazy;",
        "marketFragment",
        "tradeFragment",
        "kumexFragment",
        "getKumexFragment",
        "kumexFragment$delegate",
        "assetFragment",
        "mHomeBadge",
        "Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;",
        "mTradeBadge",
        "getLayout",
        "initNavigationBar",
        "Landroid/view/View;",
        "openDoubleBack",
        "getBundleSizeLimit",
        "rnScreenCrashSwitch",
        "getRnScreenCrashSwitch",
        "()Z",
        "rnScreenCrashSwitch$delegate",
        "appStatusListener",
        "com/kubi/kucoin/main/KuCoinMainActivity$appStatusListener$1",
        "Lcom/kubi/kucoin/main/KuCoinMainActivity$appStatusListener$1;",
        "onCreate",
        "",
        "savedInstanceState",
        "handleJumpUri",
        "intent",
        "Landroid/content/Intent;",
        "initRedPointNotice",
        "initBizControlListener",
        "initUpdatePasswordConfig",
        "bindAutoCleanEvent",
        "queryKycStatus",
        "handleKlineInMaintenance",
        "handleMaintenance",
        "maintenance",
        "Lcom/kubi/data/entity/MaintenanceEntity;",
        "recreate",
        "listenEvent",
        "bindShowDepositDisableDialogEvent",
        "checkCOverlaySelector",
        "getUserRestrictedState",
        "childFragmentManager",
        "Landroidx/fragment/app/FragmentManager;",
        "showKycLimitNotice",
        "from",
        "getTabPageById",
        "Lcom/kubi/clean/api/constant/MainTabPage;",
        "bottomTabClickEventTrack",
        "id",
        "tabClickTrack",
        "pageId",
        "blockId",
        "showClearChinaUsersDialog",
        "restrictedState",
        "Lcom/kubi/user/api/UserRestrictedStateBean;",
        "initNavigationView",
        "externalDataFillFragment",
        "newId",
        "getTabName",
        "checkId",
        "getTabPageId",
        "showFragment",
        "itemId",
        "registerNetWorkChanged",
        "onWindowFocusChanged",
        "hasFocus",
        "onResume",
        "onPause",
        "setBusinessTabBarHidden",
        "hidden",
        "animated",
        "currentTabFragment",
        "Landroidx/fragment/app/Fragment;",
        "findRnContainerProvider",
        "Lcom/kubi/sdk/eventhub/RnContainerIdProvider;",
        "fragment",
        "syncTabBarForCurrentTab",
        "onReBack",
        "onSaveInstanceState",
        "outState",
        "id2Position",
        "position2Id",
        "resolveMainTabId",
        "(Landroid/content/Intent;)Ljava/lang/Integer;",
        "markPendingTradeRoute",
        "consumePendingTradeRouteExtras",
        "onNewIntent",
        "onBackPressed",
        "onDestroy",
        "tabOnTrade",
        "isTab",
        "checkNeedToastBack",
        "onRestart",
        "Companion",
        "KuFacadeLib_googleRelease"
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
        "SMAP\nKuCoinMainActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KuCoinMainActivity.kt\ncom/kubi/kucoin/main/KuCoinMainActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 4 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n+ 5 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 6 DurationTracker.kt\ncom/kubi/monitor/DurationTrackerKt\n+ 7 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 8 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 9 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,1285:1\n49#2,15:1286\n1869#3,2:1301\n25#4,3:1303\n25#4,3:1306\n81#5,2:1309\n81#5,2:1311\n158#5,2:1327\n81#5,2:1329\n158#5,2:1331\n46#6,14:1313\n1#7:1333\n35#8,4:1334\n39#8:1340\n35#8,4:1341\n39#8:1347\n44#9,2:1338\n44#9,2:1345\n*S KotlinDebug\n*F\n+ 1 KuCoinMainActivity.kt\ncom/kubi/kucoin/main/KuCoinMainActivity\n*L\n158#1:1286,15\n228#1:1301,2\n244#1:1303,3\n287#1:1306,3\n350#1:1309,2\n372#1:1311,2\n408#1:1327,2\n477#1:1329,2\n486#1:1331,2\n391#1:1313,14\n1170#1:1334,4\n1170#1:1340\n203#1:1341,4\n203#1:1347\n1170#1:1338,2\n203#1:1345,2\n*E\n"
    }
.end annotation


# static fields
.field public static final P:Lcom/kubi/kucoin/main/KuCoinMainActivity$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic Q:[Lkotlin/reflect/KProperty;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Lkotlin/reflect/KProperty<",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation
.end field

.field public static R:I


# instance fields
.field public A:Lcom/kubi/kucoin/utils/NetworkChangeReceiver;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public B:Z

.field public C:Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public D:Z

.field public E:Landroid/os/Bundle;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public F:Z

.field public final G:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final H:Lcom/kubi/sdk/BaseFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final I:Lcom/kubi/sdk/BaseFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final J:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final K:Lcom/kubi/sdk/BaseFragment;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public L:Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public M:Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field public final N:Lkotlin/Lazy;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final O:Lcom/kubi/kucoin/main/KuCoinMainActivity$a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final v:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final w:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final x:Landroidx/lifecycle/MutableLiveData;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroidx/lifecycle/MutableLiveData<",
            "Lcom/kubi/mine/api/entity/KycStatusEntity;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public y:Lcom/kubi/kucoin/main/i0;

.field public z:I


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getKucoinActivityMainBinding()Lcom/kubi/facade/lib/databinding/KucoinActivityMainBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/kucoin/main/KuCoinMainActivity;

    .line 8
    .line 9
    const-string v4, "kucoinActivityMainBinding"

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
    sput-object v1, Lcom/kubi/kucoin/main/KuCoinMainActivity;->Q:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/kucoin/main/KuCoinMainActivity$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/kucoin/main/KuCoinMainActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->P:Lcom/kubi/kucoin/main/KuCoinMainActivity$Companion;

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
    .line 184
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/base/ui/BaseUiActivity;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    const-class v1, Lcom/kubi/kucoin/main/KuCoinMainActivity;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    const/16 v1, 0x40

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-static {p0}, Ljava/lang/System;->identityHashCode(Ljava/lang/Object;)I

    .line 26
    move-result v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->v:Ljava/lang/String;

    .line 36
    .line 37
    sget-object v0, Lcom/kubi/kucoin/main/KuCoinMainActivity$special$$inlined$viewBindingActivity$1;->INSTANCE:Lcom/kubi/kucoin/main/KuCoinMainActivity$special$$inlined$viewBindingActivity$1;

    .line 38
    .line 39
    new-instance v1, Lcom/kubi/kucoin/main/KuCoinMainActivity$special$$inlined$viewBindingActivity$2;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity$special$$inlined$viewBindingActivity$2;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 43
    .line 44
    .line 45
    invoke-static {p0, v0, v1}, Lw00/b;->b(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 49
    .line 50
    new-instance v0, Landroidx/lifecycle/MutableLiveData;

    .line 51
    .line 52
    .line 53
    invoke-direct {v0}, Landroidx/lifecycle/MutableLiveData;-><init>()V

    .line 54
    .line 55
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x:Landroidx/lifecycle/MutableLiveData;

    .line 56
    const/4 v0, 0x1

    .line 57
    .line 58
    iput-boolean v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->F:Z

    .line 59
    .line 60
    new-instance v0, Lcom/kubi/kucoin/main/f;

    .line 61
    .line 62
    .line 63
    invoke-direct {v0}, Lcom/kubi/kucoin/main/f;-><init>()V

    .line 64
    .line 65
    .line 66
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->G:Lkotlin/Lazy;

    .line 70
    .line 71
    sget-object v0, Lcom/kubi/quotefacade/api/IQuoteFacadeService;->a:Lcom/kubi/quotefacade/api/IQuoteFacadeService$Companion;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v0}, Lcom/kubi/quotefacade/api/IQuoteFacadeService$Companion;->get()Lcom/kubi/quotefacade/api/IQuoteFacadeService;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    .line 78
    invoke-interface {v0}, Lcom/kubi/quotefacade/api/IQuoteFacadeService;->c()Lcom/kubi/sdk/BaseFragment;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->H:Lcom/kubi/sdk/BaseFragment;

    .line 82
    .line 83
    sget-object v0, Lcom/kubi/tradefacade/api/ITradeFacadeService;->a:Lcom/kubi/tradefacade/api/ITradeFacadeService$Companion;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lcom/kubi/tradefacade/api/ITradeFacadeService$Companion;->get()Lcom/kubi/tradefacade/api/ITradeFacadeService;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    .line 90
    invoke-interface {v0}, Lcom/kubi/tradefacade/api/ITradeFacadeService;->f()Lcom/kubi/sdk/BaseFragment;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->I:Lcom/kubi/sdk/BaseFragment;

    .line 94
    .line 95
    new-instance v0, Lcom/kubi/kucoin/main/g;

    .line 96
    .line 97
    .line 98
    invoke-direct {v0}, Lcom/kubi/kucoin/main/g;-><init>()V

    .line 99
    .line 100
    .line 101
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->J:Lkotlin/Lazy;

    .line 105
    .line 106
    sget-object v0, Lcom/kubi/assets/api/IAssetsCenterService;->a:Lcom/kubi/assets/api/IAssetsCenterService$Companion;

    .line 107
    .line 108
    .line 109
    invoke-virtual {v0}, Lcom/kubi/assets/api/IAssetsCenterService$Companion;->get()Lcom/kubi/assets/api/IAssetsCenterService;

    .line 110
    move-result-object v0

    .line 111
    .line 112
    .line 113
    invoke-interface {v0}, Lcom/kubi/assets/api/IAssetsCenterService;->A()Lcom/kubi/sdk/BaseFragment;

    .line 114
    move-result-object v0

    .line 115
    .line 116
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->K:Lcom/kubi/sdk/BaseFragment;

    .line 117
    .line 118
    new-instance v0, Lcom/kubi/kucoin/main/h;

    .line 119
    .line 120
    .line 121
    invoke-direct {v0}, Lcom/kubi/kucoin/main/h;-><init>()V

    .line 122
    .line 123
    .line 124
    invoke-static {v0}, Lkotlin/LazyKt;->lazy(Lkotlin/jvm/functions/Function0;)Lkotlin/Lazy;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->N:Lkotlin/Lazy;

    .line 128
    .line 129
    new-instance v0, Lcom/kubi/kucoin/main/KuCoinMainActivity$a;

    .line 130
    .line 131
    .line 132
    invoke-direct {v0, p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity$a;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 133
    .line 134
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->O:Lcom/kubi/kucoin/main/KuCoinMainActivity$a;

    .line 135
    return-void
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
.end method

.method public static synthetic A0()Lcom/kubi/sdk/BaseFragment;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->V1()Lcom/kubi/sdk/BaseFragment;

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
    .line 28
    .line 29
    .line 30
.end method

.method public static synthetic B0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->g2(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;

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
.end method

.method public static synthetic C0(Lcom/kubi/data/entity/MaintenanceEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->I1(Lcom/kubi/data/entity/MaintenanceEntity;)Lkotlin/Unit;

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
.end method

.method public static synthetic D1(Lcom/kubi/kucoin/main/KuCoinMainActivity;Landroidx/fragment/app/FragmentManager;ILjava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    and-int/lit8 p2, p2, 0x1

    .line 3
    .line 4
    if-eqz p2, :cond_0

    .line 5
    const/4 p1, 0x0

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->C1(Landroidx/fragment/app/FragmentManager;)V

    .line 9
    return-void
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
.end method

.method public static synthetic E0()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->q1()Lkotlin/Unit;

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
    .line 28
    .line 29
    .line 30
.end method

.method public static final E1(Lcom/kubi/kucoin/main/KuCoinMainActivity;Landroidx/fragment/app/FragmentManager;Lcom/kubi/user/api/UserRestrictedStateBean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    if-eqz p2, :cond_0

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, p1, p2}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->u2(Landroidx/fragment/app/FragmentManager;Lcom/kubi/user/api/UserRestrictedStateBean;)V

    .line 6
    .line 7
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method

.method public static synthetic F0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->d2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static synthetic G0()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->m2()Lkotlin/Unit;

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
    .line 28
    .line 29
    .line 30
.end method

.method public static synthetic H0(Ljava/lang/Throwable;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->e2(Ljava/lang/Throwable;)Lkotlin/Unit;

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
.end method

.method public static synthetic I0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->Z1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static final I1(Lcom/kubi/data/entity/MaintenanceEntity;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/data/entity/MaintenanceEntity;->getLink()Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lay/a;->k()Z

    .line 16
    .line 17
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    return-object p0
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
.end method

.method public static synthetic J0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->R1(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;

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
.end method

.method public static final J1(Lcom/kubi/data/entity/MaintenanceEntity;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/data/entity/MaintenanceEntity;->getLink()Ljava/lang/String;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    if-eqz p0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p0}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lay/a;->k()Z

    .line 16
    .line 17
    :cond_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    return-object p0
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
.end method

.method public static synthetic K0()Lcom/kubi/sdk/BaseFragment;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->K1()Lcom/kubi/sdk/BaseFragment;

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
    .line 28
    .line 29
    .line 30
.end method

.method public static final K1()Lcom/kubi/sdk/BaseFragment;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lvj/b;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/kubi/homern/api/IHomeRNService;->a:Lcom/kubi/homern/api/IHomeRNService$Companion;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/homern/api/IHomeRNService$Companion;->get()Lcom/kubi/homern/api/IHomeRNService;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Lcom/kubi/homern/api/IHomeRNService;->b()Lcom/kubi/sdk/BaseFragment;

    .line 16
    move-result-object v0

    .line 17
    return-object v0

    .line 18
    .line 19
    :cond_0
    sget-object v0, Lcom/kubi/home/api/IHomeService;->a:Lcom/kubi/home/api/IHomeService$Companion;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/kubi/home/api/IHomeService$Companion;->get()Lcom/kubi/home/api/IHomeService;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-interface {v0}, Lcom/kubi/home/api/IHomeService;->f()Lcom/kubi/sdk/BaseFragment;

    .line 27
    move-result-object v0

    .line 28
    return-object v0
    .line 29
    .line 30
.end method

.method public static synthetic L0(Ljava/lang/Boolean;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->a2(Ljava/lang/Boolean;)Z

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
.end method

.method public static synthetic M0()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->r2()Z

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public static final synthetic N0(Lcom/kubi/kucoin/main/KuCoinMainActivity;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->m1(I)V

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
.end method

.method public static final synthetic O0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->p1()V

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
.end method

.method public static final synthetic P0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Landroid/os/Bundle;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->r1()Landroid/os/Bundle;

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
.end method

.method public static final P1(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->z:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/facade/lib/R$id;->main_trade:I

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->B:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/tradefacade/api/ITradeFacadeService;->a:Lcom/kubi/tradefacade/api/ITradeFacadeService$Companion;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/tradefacade/api/ITradeFacadeService$Companion;->get()Lcom/kubi/tradefacade/api/ITradeFacadeService;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object p0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->I:Lcom/kubi/sdk/BaseFragment;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p0}, Lcom/kubi/tradefacade/api/ITradeFacadeService;->c(Lcom/kubi/sdk/BaseFragment;)V

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    .line 25
    iput-boolean v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->B:Z

    .line 26
    .line 27
    :goto_0
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
.end method

.method public static final synthetic Q0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Landroid/view/View;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/sdk/base/ui/BaseUiActivity;->p:Landroid/view/View;

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
    .line 44
    .line 45
.end method

.method public static final Q1(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->z:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/facade/lib/R$id;->main_kumex:I

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->B:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x1()Lcom/kubi/sdk/BaseFragment;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    if-eqz p0, :cond_1

    .line 17
    .line 18
    sget-object v0, Lcom/kubi/kumex/api/IKuMexService;->a:Lcom/kubi/kumex/api/IKuMexService$Companion;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/kumex/api/IKuMexService$Companion;->get()Lcom/kubi/kumex/api/IKuMexService;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0, p0}, Lcom/kubi/kumex/api/IKuMexService;->Q(Lcom/kubi/sdk/BaseFragment;)V

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    const/4 v0, 0x0

    .line 28
    .line 29
    iput-boolean v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->B:Z

    .line 30
    .line 31
    :cond_1
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 32
    return-object p0
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
.end method

.method public static final synthetic R0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->z:I

    .line 3
    return p0
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
.end method

.method public static final R1(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->z:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/facade/lib/R$id;->main_assets:I

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->B:Z

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/assets/api/IAssetsCenterService;->a:Lcom/kubi/assets/api/IAssetsCenterService$Companion;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/kubi/assets/api/IAssetsCenterService$Companion;->get()Lcom/kubi/assets/api/IAssetsCenterService;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object p0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->K:Lcom/kubi/sdk/BaseFragment;

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, p0}, Lcom/kubi/assets/api/IAssetsCenterService;->j(Lcom/kubi/sdk/BaseFragment;)V

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v0, 0x0

    .line 24
    .line 25
    iput-boolean v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->B:Z

    .line 26
    .line 27
    :goto_0
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
.end method

.method public static final synthetic S0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lsf/a;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

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
.end method

.method public static final synthetic T0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lcom/kubi/sdk/BaseFragment;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x1()Lcom/kubi/sdk/BaseFragment;

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
.end method

.method public static final synthetic U0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Landroidx/lifecycle/MutableLiveData;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x:Landroidx/lifecycle/MutableLiveData;

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
    .line 44
    .line 45
.end method

.method public static final synthetic V0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Landroid/content/Context;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/sdk/base/ui/BaseUiActivity;->q:Landroid/content/Context;

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
    .line 44
    .line 45
.end method

.method public static final V1()Lcom/kubi/sdk/BaseFragment;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/api/IKuMexService;->a:Lcom/kubi/kumex/api/IKuMexService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/kumex/api/IKuMexService$Companion;->get()Lcom/kubi/kumex/api/IKuMexService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/kubi/kumex/api/IKuMexService;->U()Lcom/kubi/sdk/BaseFragment;

    .line 10
    move-result-object v0

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
.end method

.method public static final synthetic W0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->L:Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

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
    .line 44
    .line 45
.end method

.method public static final synthetic X0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->M:Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

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
    .line 44
    .line 45
.end method

.method public static final synthetic Y0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lcom/kubi/kucoin/main/i0;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->y:Lcom/kubi/kucoin/main/i0;

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
    .line 44
    .line 45
.end method

.method public static final Y1(Lcom/kubi/kucoin/main/KuCoinMainActivity;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    .line 4
    move-result p1

    .line 5
    .line 6
    if-eqz p1, :cond_1

    .line 7
    .line 8
    iget-object p1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->y:Lcom/kubi/kucoin/main/i0;

    .line 9
    .line 10
    if-nez p1, :cond_0

    .line 11
    .line 12
    const-string p1, "mViewModel"

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 16
    const/4 p1, 0x0

    .line 17
    :cond_0
    const/4 v0, 0x1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lcom/kubi/kucoin/main/i0;->B(Z)V

    .line 21
    .line 22
    sget-object p1, Lcom/kubi/notice/api/service/INoticeService;->a:Lcom/kubi/notice/api/service/INoticeService$Companion;

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Lcom/kubi/notice/api/service/INoticeService$Companion;->get()Lcom/kubi/notice/api/service/INoticeService;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    iget-object p0, p0, Lcom/kubi/sdk/base/ui/BaseUiActivity;->q:Landroid/content/Context;

    .line 29
    .line 30
    const-string v1, "mContext"

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    invoke-interface {p1, p0, v0}, Lcom/kubi/notice/api/service/INoticeService;->e(Landroid/content/Context;Z)V

    .line 37
    const/4 v6, 0x6

    .line 38
    const/4 v7, 0x0

    .line 39
    .line 40
    const-string v2, "com.kubi.user.event.UserEvent:onConfigChange"

    .line 41
    const/4 v3, 0x0

    .line 42
    .line 43
    const-wide/16 v4, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static/range {v2 .. v7}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 47
    :cond_1
    const/4 v12, 0x6

    .line 48
    const/4 v13, 0x0

    .line 49
    .line 50
    const-string v8, "com.kubi.user.event.UserEvent:onConfigChangeV2"

    .line 51
    const/4 v9, 0x0

    .line 52
    .line 53
    const-wide/16 v10, 0x0

    .line 54
    .line 55
    .line 56
    invoke-static/range {v8 .. v13}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 57
    .line 58
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 59
    return-object p0
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
.end method

.method public static final synthetic Z0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lcom/kubi/sdk/BaseFragment;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->H:Lcom/kubi/sdk/BaseFragment;

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
    .line 44
    .line 45
.end method

.method public static final Z1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
.end method

.method public static final synthetic a1()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->R:I

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
.end method

.method public static final a2(Ljava/lang/Boolean;)Z
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
    .line 8
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 9
    move-result p0

    .line 10
    return p0
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
.end method

.method public static final synthetic b1(Lcom/kubi/kucoin/main/KuCoinMainActivity;I)Ljava/lang/String;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->A1(I)Ljava/lang/String;

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
.end method

.method public static final b2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 1

    .line 1
    .line 2
    const-string v0, "p0"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    .line 9
    move-result-object p0

    .line 10
    .line 11
    check-cast p0, Ljava/lang/Boolean;

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    .line 15
    move-result p0

    .line 16
    return p0
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
.end method

.method public static final synthetic c1(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lcom/kubi/clean/api/constant/MainTabPage;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->B1()Lcom/kubi/clean/api/constant/MainTabPage;

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
.end method

.method public static final c2(Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    sget-object p0, Lcom/kubi/data/p;->a:Lcom/kubi/data/p;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/data/p;->k()V

    .line 6
    .line 7
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method

.method public static final synthetic d1(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lcom/kubi/sdk/BaseFragment;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->I:Lcom/kubi/sdk/BaseFragment;

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
    .line 44
    .line 45
.end method

.method public static final d2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
.end method

.method public static final synthetic e1(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->o2()V

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
.end method

.method public static final e2(Ljava/lang/Throwable;)Lkotlin/Unit;
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
.end method

.method public static final synthetic f1(Lcom/kubi/kucoin/main/KuCoinMainActivity;I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->z:I

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
.end method

.method public static final f2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
.end method

.method public static final synthetic g1(Lcom/kubi/kucoin/main/KuCoinMainActivity;Landroidx/fragment/app/FragmentManager;Lcom/kubi/user/api/UserRestrictedStateBean;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->u2(Landroidx/fragment/app/FragmentManager;Lcom/kubi/user/api/UserRestrictedStateBean;)V

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
.end method

.method public static final g2(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/otc/api/IOtcService;->a:Lcom/kubi/otc/api/IOtcService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/otc/api/IOtcService$Companion;->get()Lcom/kubi/otc/api/IOtcService;

    .line 6
    move-result-object v0

    .line 7
    const/4 v1, 0x0

    .line 8
    const/4 v2, 0x1

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v1}, Lcom/kubi/otc/api/IOtcService;->l(Lcom/kubi/otc/api/IOtcService;Lio/reactivex/functions/Action;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->k1()V

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
.end method

.method public static final synthetic h1(Lcom/kubi/kucoin/main/KuCoinMainActivity;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->v2(I)V

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
.end method

.method public static final h2(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lcom/kubi/data/entity/MaintenanceEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->H1(Lcom/kubi/data/entity/MaintenanceEntity;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    if-eqz p1, :cond_1

    .line 13
    .line 14
    iget-object p1, p1, Lsf/a;->f:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/view/View;->getVisibility()I

    .line 20
    move-result p1

    .line 21
    .line 22
    if-nez p1, :cond_1

    .line 23
    .line 24
    sget-object p1, Lcom/kubi/clean/api/service/IAutoCleanService;->a:Lcom/kubi/clean/api/service/IAutoCleanService$Companion;

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lcom/kubi/clean/api/service/IAutoCleanService$Companion;->get()Lcom/kubi/clean/api/service/IAutoCleanService;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    if-eqz p0, :cond_0

    .line 35
    .line 36
    iget-object p0, p0, Lsf/a;->m:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 37
    goto :goto_0

    .line 38
    :cond_0
    const/4 p0, 0x0

    .line 39
    .line 40
    .line 41
    :goto_0
    invoke-interface {p1, p0}, Lcom/kubi/clean/api/service/IAutoCleanService;->d(Landroid/view/ViewGroup;)V

    .line 42
    :cond_1
    return-void
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
.end method

.method public static final synthetic i1(Lcom/kubi/kucoin/main/KuCoinMainActivity;Ljava/lang/String;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w2(Ljava/lang/String;)V

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
.end method

.method public static final i2(Lcom/kubi/kucoin/main/KuCoinMainActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    const-string v0, "symbol"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iget-object p0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->y:Lcom/kubi/kucoin/main/i0;

    .line 8
    .line 9
    if-nez p0, :cond_0

    .line 10
    .line 11
    const-string p0, "mViewModel"

    .line 12
    .line 13
    .line 14
    invoke-static {p0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 15
    const/4 p0, 0x0

    .line 16
    :cond_0
    const/4 v0, 0x2

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0, v0, p1}, Lcom/kubi/kucoin/main/i0;->t(ILjava/lang/String;)V

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
.end method

.method public static final synthetic j1(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x2()V

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
.end method

.method public static final j2(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lsf/a;->f:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    const/16 v1, 0x8

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 16
    .line 17
    :cond_0
    const-string v0, "maintenance"

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w2(Ljava/lang/String;)V

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->G1()V

    .line 24
    .line 25
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 26
    return-object p0
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
.end method

.method public static synthetic k0(Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->c2(Ljava/lang/Boolean;)Lkotlin/Unit;

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
.end method

.method public static final k2()Z
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kucoin/utils/r;->a:Lcom/kubi/kucoin/utils/r;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/kucoin/utils/r;->l()Z

    .line 6
    move-result v0

    .line 7
    return v0
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
.end method

.method public static synthetic l0(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lcom/kubi/resources/widget/RadioGroupPlus;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->s2(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lcom/kubi/resources/widget/RadioGroupPlus;)V

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
.end method

.method public static final l2()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/utils/a;->i()Lcom/kubi/utils/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/utils/a;->f()I

    .line 8
    move-result v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    sget-object v0, Lg10/o;->a:Lg10/o;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lg10/o;->f()V

    .line 16
    .line 17
    sget-object v0, Lcom/kubi/network/websocket/DefaultWebSocketClient;->b:Lcom/kubi/network/websocket/DefaultWebSocketClient$Companion;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Lcom/kubi/network/websocket/DefaultWebSocketClient$Companion;->get()Lcom/kubi/network/websocket/DefaultWebSocketClient;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/kubi/network/websocket/DefaultWebSocketClient;->c()V

    .line 25
    :cond_0
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public static synthetic m0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->P1(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;

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
.end method

.method public static final m2()Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kumex/api/IKuMexService;->a:Lcom/kubi/kumex/api/IKuMexService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/kumex/api/IKuMexService$Companion;->get()Lcom/kubi/kumex/api/IKuMexService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/kubi/kumex/api/IKuMexService;->g()V

    .line 10
    .line 11
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 12
    return-object v0
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
.end method

.method public static synthetic n0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->f2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method public static synthetic o0(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->b2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Z

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
.end method

.method public static final o1(Landroid/graphics/drawable/Drawable;Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;
    .locals 1

    .line 1
    .line 2
    check-cast p0, Landroid/graphics/drawable/RippleDrawable;

    .line 3
    const/4 v0, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, v0}, Landroid/graphics/drawable/LayerDrawable;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 7
    move-result-object p0

    .line 8
    .line 9
    instance-of v0, p0, Landroid/graphics/drawable/GradientDrawable;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    check-cast p0, Landroid/graphics/drawable/GradientDrawable;

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    const/4 p0, 0x0

    .line 16
    .line 17
    :goto_0
    if-eqz p0, :cond_1

    .line 18
    .line 19
    sget v0, Lcom/kubi/facade/lib/R$color;->c_overlay:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {p1, v0}, Lcom/kubi/sdk/base/ui/BaseUiActivity;->Y(I)I

    .line 23
    move-result p1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0, p1}, Landroid/graphics/drawable/GradientDrawable;->setColor(I)V

    .line 27
    .line 28
    :cond_1
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 29
    return-object p0
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
.end method

.method public static synthetic p0(Lcom/kubi/kucoin/main/KuCoinMainActivity;Ljava/lang/Boolean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->Y1(Lcom/kubi/kucoin/main/KuCoinMainActivity;Ljava/lang/Boolean;)Lkotlin/Unit;

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
.end method

.method public static synthetic q0(Lcom/kubi/kucoin/main/KuCoinMainActivity;Landroidx/fragment/app/FragmentManager;Lcom/kubi/user/api/UserRestrictedStateBean;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->E1(Lcom/kubi/kucoin/main/KuCoinMainActivity;Landroidx/fragment/app/FragmentManager;Lcom/kubi/user/api/UserRestrictedStateBean;)Lkotlin/Unit;

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
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
.end method

.method public static final q1()Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/utils/a;->i()Lcom/kubi/utils/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/utils/a;->h()Landroid/app/Activity;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    instance-of v1, v0, Landroidx/fragment/app/FragmentActivity;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Landroidx/fragment/app/FragmentActivity;

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    .line 18
    :goto_0
    if-eqz v0, :cond_1

    .line 19
    .line 20
    instance-of v1, v0, Lcom/kubi/kucoin/main/KuCoinMainActivity;

    .line 21
    .line 22
    if-eqz v1, :cond_1

    .line 23
    .line 24
    check-cast v0, Lcom/kubi/kucoin/main/KuCoinMainActivity;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->z2()Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    sget v0, Lcom/kubi/facade/lib/R$string;->app_is_background_tips:I

    .line 33
    .line 34
    .line 35
    invoke-static {v0}, Lcom/kubi/utils/ToastCompat;->C(I)V

    .line 36
    .line 37
    :cond_1
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 38
    return-object v0
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
.end method

.method public static synthetic r0()Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->k2()Z

    .line 4
    move-result v0

    .line 5
    return v0
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
.end method

.method public static final r2()Z
    .locals 8

    .line 1
    .line 2
    const-string v0, "kc_rn_screen_crash_switch"

    .line 3
    .line 4
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/kucoin/main/KuCoinMainActivity$e;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Lcom/kubi/kucoin/main/KuCoinMainActivity$e;-><init>()V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "object : TypeToken<T>() {}.type"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 22
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 23
    goto :goto_0

    .line 24
    :catchall_0
    move-exception v0

    .line 25
    move-object v2, v0

    .line 26
    .line 27
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 28
    .line 29
    const/16 v6, 0x8

    .line 30
    const/4 v7, 0x0

    .line 31
    .line 32
    const-string v3, "RemoteConfig"

    .line 33
    const/4 v4, 0x0

    .line 34
    const/4 v5, 0x0

    .line 35
    .line 36
    .line 37
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 38
    const/4 v0, 0x2

    .line 39
    const/4 v2, 0x0

    .line 40
    .line 41
    .line 42
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 43
    move-object v0, v2

    .line 44
    .line 45
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 46
    const/4 v1, 0x1

    .line 47
    .line 48
    .line 49
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 50
    move-result v0

    .line 51
    return v0
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
.end method

.method public static synthetic s0(Lcom/kubi/data/entity/MaintenanceEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->J1(Lcom/kubi/data/entity/MaintenanceEntity;)Lkotlin/Unit;

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
.end method

.method public static final s2(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lcom/kubi/resources/widget/RadioGroupPlus;)V
    .locals 0

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->D:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    .line 6
    const/16 p0, 0x8

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1, p0}, Landroid/view/View;->setVisibility(I)V

    .line 10
    const/4 p0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationY(F)V

    .line 14
    :cond_0
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
.end method

.method public static synthetic t0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->Q1(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;

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
.end method

.method public static final t2(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lcom/kubi/resources/widget/RadioGroupPlus;Z)V
    .locals 2

    .line 1
    .line 2
    iget-boolean p0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->D:Z

    .line 3
    .line 4
    if-eqz p0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p1}, Landroid/view/View;->getHeight()I

    .line 9
    move-result p0

    .line 10
    int-to-float p0, p0

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    cmpl-float v1, p0, v0

    .line 14
    .line 15
    if-lez v1, :cond_2

    .line 16
    .line 17
    if-nez p2, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Landroid/view/View;->getTranslationY()F

    .line 21
    move-result p2

    .line 22
    .line 23
    cmpg-float p2, p2, v0

    .line 24
    .line 25
    if-nez p2, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, p0}, Landroid/view/View;->setTranslationY(F)V

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-virtual {p1}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 32
    move-result-object p0

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v0}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 36
    move-result-object p0

    .line 37
    .line 38
    const-wide/16 p1, 0xfa

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1, p2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 42
    move-result-object p0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 46
    return-void

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {p1, v0}, Landroid/view/View;->setTranslationY(F)V

    .line 50
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
.end method

.method public static synthetic u0(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lcom/kubi/resources/widget/RadioGroupPlus;Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1, p2}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->t2(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lcom/kubi/resources/widget/RadioGroupPlus;Z)V

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
.end method

.method public static synthetic v0(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lcom/kubi/data/entity/MaintenanceEntity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->h2(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lcom/kubi/data/entity/MaintenanceEntity;)V

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
.end method

.method public static synthetic w0()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->l2()V

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
.end method

.method public static synthetic x0(Lcom/kubi/kucoin/main/KuCoinMainActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->i2(Lcom/kubi/kucoin/main/KuCoinMainActivity;Ljava/lang/String;)Lkotlin/Unit;

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
.end method

.method public static synthetic y0(Landroid/graphics/drawable/Drawable;Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->o1(Landroid/graphics/drawable/Drawable;Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;

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
.end method

.method public static synthetic z0(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->j2(Lcom/kubi/kucoin/main/KuCoinMainActivity;)Lkotlin/Unit;

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
.end method


# virtual methods
.method public final A1(I)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/facade/lib/R$id;->main_home:I

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    const-string p1, "main"

    .line 7
    return-object p1

    .line 8
    .line 9
    :cond_0
    sget v0, Lcom/kubi/facade/lib/R$id;->main_quotes:I

    .line 10
    .line 11
    if-ne p1, v0, :cond_1

    .line 12
    .line 13
    const-string p1, "market"

    .line 14
    return-object p1

    .line 15
    .line 16
    :cond_1
    sget v0, Lcom/kubi/facade/lib/R$id;->main_trade:I

    .line 17
    .line 18
    if-ne p1, v0, :cond_2

    .line 19
    .line 20
    const-string p1, "trade"

    .line 21
    return-object p1

    .line 22
    .line 23
    :cond_2
    sget v0, Lcom/kubi/facade/lib/R$id;->main_kumex:I

    .line 24
    .line 25
    if-ne p1, v0, :cond_3

    .line 26
    .line 27
    const-string p1, "contract"

    .line 28
    return-object p1

    .line 29
    .line 30
    :cond_3
    sget v0, Lcom/kubi/facade/lib/R$id;->main_assets:I

    .line 31
    .line 32
    if-ne p1, v0, :cond_4

    .line 33
    .line 34
    const-string p1, "assets"

    .line 35
    return-object p1

    .line 36
    .line 37
    :cond_4
    const-string p1, ""

    .line 38
    return-object p1
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final B1()Lcom/kubi/clean/api/constant/MainTabPage;
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lsf/a;->g:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/kubi/resources/widget/RadioGroupPlus;->getCheckedRadioButtonId()I

    .line 14
    move-result v0

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 18
    move-result-object v0

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    .line 22
    :goto_0
    sget v1, Lcom/kubi/facade/lib/R$id;->main_home:I

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    goto :goto_1

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 29
    move-result v2

    .line 30
    .line 31
    if-ne v2, v1, :cond_2

    .line 32
    .line 33
    sget-object v0, Lcom/kubi/clean/api/constant/MainTabPage;->HOME:Lcom/kubi/clean/api/constant/MainTabPage;

    .line 34
    return-object v0

    .line 35
    .line 36
    :cond_2
    :goto_1
    sget v1, Lcom/kubi/facade/lib/R$id;->main_quotes:I

    .line 37
    .line 38
    if-nez v0, :cond_3

    .line 39
    goto :goto_2

    .line 40
    .line 41
    .line 42
    :cond_3
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 43
    move-result v2

    .line 44
    .line 45
    if-ne v2, v1, :cond_4

    .line 46
    .line 47
    sget-object v0, Lcom/kubi/clean/api/constant/MainTabPage;->MARKET:Lcom/kubi/clean/api/constant/MainTabPage;

    .line 48
    return-object v0

    .line 49
    .line 50
    :cond_4
    :goto_2
    sget v1, Lcom/kubi/facade/lib/R$id;->main_trade:I

    .line 51
    .line 52
    if-nez v0, :cond_5

    .line 53
    goto :goto_3

    .line 54
    .line 55
    .line 56
    :cond_5
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 57
    move-result v2

    .line 58
    .line 59
    if-ne v2, v1, :cond_6

    .line 60
    .line 61
    sget-object v0, Lcom/kubi/clean/api/constant/MainTabPage;->TRADE:Lcom/kubi/clean/api/constant/MainTabPage;

    .line 62
    return-object v0

    .line 63
    .line 64
    :cond_6
    :goto_3
    sget v1, Lcom/kubi/facade/lib/R$id;->main_kumex:I

    .line 65
    .line 66
    if-nez v0, :cond_7

    .line 67
    goto :goto_4

    .line 68
    .line 69
    .line 70
    :cond_7
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 71
    move-result v2

    .line 72
    .line 73
    if-ne v2, v1, :cond_8

    .line 74
    .line 75
    sget-object v0, Lcom/kubi/clean/api/constant/MainTabPage;->FUTURES:Lcom/kubi/clean/api/constant/MainTabPage;

    .line 76
    return-object v0

    .line 77
    .line 78
    :cond_8
    :goto_4
    sget v1, Lcom/kubi/facade/lib/R$id;->main_assets:I

    .line 79
    .line 80
    if-nez v0, :cond_9

    .line 81
    goto :goto_5

    .line 82
    .line 83
    .line 84
    :cond_9
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 85
    move-result v0

    .line 86
    .line 87
    if-ne v0, v1, :cond_a

    .line 88
    .line 89
    sget-object v0, Lcom/kubi/clean/api/constant/MainTabPage;->ASSETS:Lcom/kubi/clean/api/constant/MainTabPage;

    .line 90
    return-object v0

    .line 91
    .line 92
    :cond_a
    :goto_5
    sget-object v0, Lcom/kubi/clean/api/constant/MainTabPage;->HOME:Lcom/kubi/clean/api/constant/MainTabPage;

    .line 93
    return-object v0
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
.end method

.method public final C1(Landroidx/fragment/app/FragmentManager;)V
    .locals 7

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    new-instance v4, Lcom/kubi/kucoin/main/KuCoinMainActivity$getUserRestrictedState$1;

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    .line 18
    invoke-direct {v4, p1, p0, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity$getUserRestrictedState$1;-><init>(Landroidx/fragment/app/FragmentManager;Lcom/kubi/kucoin/main/KuCoinMainActivity;Lkotlin/coroutines/Continuation;)V

    .line 19
    const/4 v5, 0x3

    .line 20
    const/4 v6, 0x0

    .line 21
    const/4 v2, 0x0

    .line 22
    const/4 v3, 0x0

    .line 23
    .line 24
    .line 25
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 26
    return-void

    .line 27
    .line 28
    :cond_0
    if-eqz p1, :cond_1

    .line 29
    .line 30
    sget-object v0, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    new-instance v2, Lcom/kubi/kucoin/main/m;

    .line 41
    .line 42
    .line 43
    invoke-direct {v2, p0, p1}, Lcom/kubi/kucoin/main/m;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;Landroidx/fragment/app/FragmentManager;)V

    .line 44
    .line 45
    .line 46
    invoke-interface {v0, v1, v2}, Lcom/kubi/user/api/IUserService;->F(Landroidx/lifecycle/LifecycleCoroutineScope;Lkotlin/jvm/functions/Function1;)V

    .line 47
    :cond_1
    return-void
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
.end method

.method public final F1(Landroid/content/Intent;)V
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_0

    .line 3
    .line 4
    const-string v0, "jumpUrl"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/kubi/router/utils/RouteExKt;->w(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 p1, 0x0

    .line 11
    .line 12
    :goto_0
    if-eqz p1, :cond_1

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 16
    move-result v0

    .line 17
    .line 18
    if-nez v0, :cond_1

    .line 19
    .line 20
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p1}, Lcom/kubi/router/core/Router;->f(Ljava/lang/String;)Lay/a;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-virtual {p1}, Lay/a;->k()Z

    .line 28
    :cond_1
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
.end method

.method public final G1()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    iget-object v0, v0, Lsf/a;->f:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 9
    .line 10
    if-eqz v0, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x1()Lcom/kubi/sdk/BaseFragment;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    sget-object v2, Lcom/kubi/kumex/api/IKuMexService;->a:Lcom/kubi/kumex/api/IKuMexService$Companion;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/kubi/kumex/api/IKuMexService$Companion;->get()Lcom/kubi/kumex/api/IKuMexService;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->s(Landroid/view/View;)Z

    .line 26
    move-result v3

    .line 27
    .line 28
    .line 29
    invoke-interface {v2, v1, v3}, Lcom/kubi/kumex/api/IKuMexService;->i(Lcom/kubi/sdk/BaseFragment;Z)V

    .line 30
    .line 31
    :cond_0
    sget-object v1, Lcom/kubi/tradefacade/api/ITradeFacadeService;->a:Lcom/kubi/tradefacade/api/ITradeFacadeService$Companion;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1}, Lcom/kubi/tradefacade/api/ITradeFacadeService$Companion;->get()Lcom/kubi/tradefacade/api/ITradeFacadeService;

    .line 35
    move-result-object v1

    .line 36
    .line 37
    iget-object v2, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->I:Lcom/kubi/sdk/BaseFragment;

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lcom/kubi/utils/extensions/k;->s(Landroid/view/View;)Z

    .line 41
    move-result v0

    .line 42
    .line 43
    .line 44
    invoke-interface {v1, v2, v0}, Lcom/kubi/tradefacade/api/ITradeFacadeService;->i(Lcom/kubi/sdk/BaseFragment;Z)V

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
.end method

.method public final H1(Lcom/kubi/data/entity/MaintenanceEntity;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_2

    .line 7
    .line 8
    iget-object v0, v0, Lsf/a;->f:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->y:Lcom/kubi/kucoin/main/i0;

    .line 13
    .line 14
    if-nez v1, :cond_0

    .line 15
    .line 16
    const-string v1, "mViewModel"

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 20
    const/4 v1, 0x0

    .line 21
    .line 22
    .line 23
    :cond_0
    invoke-virtual {v1}, Lcom/kubi/kucoin/main/i0;->y()Landroidx/lifecycle/MutableLiveData;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v1}, Landroidx/lifecycle/LiveData;->getValue()Ljava/lang/Object;

    .line 28
    move-result-object v1

    .line 29
    .line 30
    sget-object v2, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    .line 31
    .line 32
    .line 33
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 34
    move-result v1

    .line 35
    .line 36
    if-eqz v1, :cond_1

    .line 37
    const/4 v1, 0x0

    .line 38
    goto :goto_0

    .line 39
    .line 40
    :cond_1
    const/16 v1, 0x8

    .line 41
    .line 42
    .line 43
    :goto_0
    invoke-virtual {v0, v1}, Landroid/view/View;->setVisibility(I)V

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 47
    move-result-object v0

    .line 48
    .line 49
    if-eqz v0, :cond_3

    .line 50
    .line 51
    iget-object v0, v0, Lsf/a;->f:Landroidx/appcompat/widget/LinearLayoutCompat;

    .line 52
    .line 53
    if-eqz v0, :cond_3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Landroid/view/View;->bringToFront()V

    .line 57
    .line 58
    .line 59
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    if-eqz v0, :cond_4

    .line 63
    .line 64
    iget-object v0, v0, Lsf/a;->n:Landroid/widget/TextView;

    .line 65
    .line 66
    if-eqz v0, :cond_4

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Landroid/view/View;->requestFocus()Z

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Lcom/kubi/data/entity/MaintenanceEntity;->getTitle()Ljava/lang/String;

    .line 73
    move-result-object v1

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    .line 77
    .line 78
    new-instance v1, Lcom/kubi/kucoin/main/j;

    .line 79
    .line 80
    .line 81
    invoke-direct {v1, p1}, Lcom/kubi/kucoin/main/j;-><init>(Lcom/kubi/data/entity/MaintenanceEntity;)V

    .line 82
    .line 83
    .line 84
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/k;->B(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 85
    .line 86
    .line 87
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    if-eqz v0, :cond_5

    .line 91
    .line 92
    iget-object v0, v0, Lsf/a;->d:Landroid/widget/ImageView;

    .line 93
    .line 94
    if-eqz v0, :cond_5

    .line 95
    .line 96
    new-instance v1, Lcom/kubi/kucoin/main/k;

    .line 97
    .line 98
    .line 99
    invoke-direct {v1, p1}, Lcom/kubi/kucoin/main/k;-><init>(Lcom/kubi/data/entity/MaintenanceEntity;)V

    .line 100
    .line 101
    .line 102
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/k;->B(Landroid/view/View;Lkotlin/jvm/functions/Function0;)V

    .line 103
    .line 104
    .line 105
    :cond_5
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->G1()V

    .line 106
    return-void
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
.end method

.method public final L1(I)I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/facade/lib/R$id;->main_quotes:I

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    .line 8
    :cond_0
    sget v0, Lcom/kubi/facade/lib/R$id;->main_trade:I

    .line 9
    .line 10
    if-ne p1, v0, :cond_1

    .line 11
    const/4 p1, 0x2

    .line 12
    return p1

    .line 13
    .line 14
    :cond_1
    sget v0, Lcom/kubi/facade/lib/R$id;->main_kumex:I

    .line 15
    .line 16
    if-ne p1, v0, :cond_2

    .line 17
    const/4 p1, 0x3

    .line 18
    return p1

    .line 19
    .line 20
    :cond_2
    sget v0, Lcom/kubi/facade/lib/R$id;->main_assets:I

    .line 21
    .line 22
    if-ne p1, v0, :cond_3

    .line 23
    const/4 p1, 0x4

    .line 24
    return p1

    .line 25
    :cond_3
    const/4 p1, 0x0

    .line 26
    return p1
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
.end method

.method public final N1()V
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lgz/b;->a:Lgz/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lgz/b;->g()Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    sget-object v2, Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;->SUCCESS:Lcom/kubi/sdk/lib/kucoin/bizcontrol/api/BizControlConfigState;

    .line 9
    .line 10
    if-eq v1, v2, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lgz/b;->i()Z

    .line 14
    move-result v1

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    sget-object v1, Lcom/kubi/app/bizcontrol/BizControlService;->a:Lcom/kubi/app/bizcontrol/BizControlService;

    .line 19
    const/4 v2, 0x1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v1, v2}, Lcom/kubi/app/bizcontrol/BizControlService;->e(Z)V

    .line 23
    .line 24
    :cond_0
    const-string v1, "EVENT_BIZ_CONTROL_LOAD"

    .line 25
    .line 26
    .line 27
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 28
    move-result v2

    .line 29
    .line 30
    const-string v3, "page_load_end"

    .line 31
    .line 32
    if-nez v2, :cond_1

    .line 33
    goto :goto_0

    .line 34
    .line 35
    .line 36
    :cond_1
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 37
    move-result v2

    .line 38
    .line 39
    if-nez v2, :cond_2

    .line 40
    .line 41
    :goto_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 45
    .line 46
    const-string v2, "eventName("

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, ") or pointName("

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    const-string v1, ") is null"

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    const-string v1, "Monitor"

    .line 72
    .line 73
    .line 74
    invoke-static {v1, v0}, Lro/b;->n(Ljava/lang/String;Ljava/lang/String;)V

    .line 75
    goto :goto_1

    .line 76
    .line 77
    :cond_2
    sget-object v2, Lcom/kubi/monitor/EventParametersBuilder;->b:Lcom/kubi/monitor/EventParametersBuilder$Companion;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2}, Lcom/kubi/monitor/EventParametersBuilder$Companion;->acquire()Lcom/kubi/monitor/EventParametersBuilder;

    .line 81
    move-result-object v2

    .line 82
    .line 83
    const-string v4, "isABNew"

    .line 84
    .line 85
    .line 86
    invoke-virtual {v0}, Lgz/b;->i()Z

    .line 87
    move-result v0

    .line 88
    .line 89
    .line 90
    invoke-virtual {v2, v4, v0}, Lcom/kubi/monitor/EventParametersBuilder;->d(Ljava/lang/String;Z)Ljava/lang/Object;

    .line 91
    .line 92
    sget-object v0, Luq/a;->a:Luq/a;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v2}, Lcom/kubi/monitor/EventParametersBuilder;->a()Ljava/util/HashMap;

    .line 96
    move-result-object v2

    .line 97
    .line 98
    const-string v4, ""

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0, v1, v3, v4, v2}, Luq/a;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    .line 102
    .line 103
    .line 104
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->o2()V

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
.end method

.method public final O1(Landroid/os/Bundle;)V
    .locals 8

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/kucoin/utils/r;->a:Lcom/kubi/kucoin/utils/r;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/kucoin/utils/r;->l()Z

    .line 6
    move-result v7

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    iget-object v1, v0, Lsf/a;->i:Lcom/kubi/kucoin/main/widget/HomeRadioButton;

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    .line 18
    sget v3, Lcom/kubi/facade/lib/R$drawable;->icon_menu_home:I

    .line 19
    .line 20
    sget v4, Lcom/kubi/facade/lib/R$drawable;->icon_menu_home_top:I

    .line 21
    .line 22
    const-string v5, "home_to_top.json"

    .line 23
    .line 24
    const-string v6, "top_to_home.json"

    .line 25
    .line 26
    const-string v2, "icon_home_checked.json"

    .line 27
    .line 28
    .line 29
    invoke-virtual/range {v1 .. v7}, Lcom/kubi/kucoin/main/widget/HomeRadioButton;->d(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Z)V

    .line 30
    .line 31
    .line 32
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    iget-object v0, v0, Lsf/a;->k:Landroid/widget/RadioButton;

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    const-string v1, "icon_market_checked.json"

    .line 42
    .line 43
    sget v2, Lcom/kubi/facade/lib/R$drawable;->icon_menu_market:I

    .line 44
    .line 45
    .line 46
    invoke-static {v0, v1, v2, v7}, Lcom/kubi/kucoin/utils/n;->b(Landroid/widget/RadioButton;Ljava/lang/String;IZ)V

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    if-eqz v0, :cond_2

    .line 53
    .line 54
    iget-object v0, v0, Lsf/a;->l:Landroid/widget/RadioButton;

    .line 55
    .line 56
    if-eqz v0, :cond_2

    .line 57
    .line 58
    const-string v1, "icon_trade_checked.json"

    .line 59
    .line 60
    sget v2, Lcom/kubi/facade/lib/R$drawable;->icon_menu_trade:I

    .line 61
    .line 62
    .line 63
    invoke-static {v0, v1, v2, v7}, Lcom/kubi/kucoin/utils/n;->b(Landroid/widget/RadioButton;Ljava/lang/String;IZ)V

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 67
    move-result-object v0

    .line 68
    .line 69
    if-eqz v0, :cond_3

    .line 70
    .line 71
    iget-object v0, v0, Lsf/a;->j:Landroid/widget/RadioButton;

    .line 72
    .line 73
    if-eqz v0, :cond_3

    .line 74
    .line 75
    const-string v1, "icon_future_checked.json"

    .line 76
    .line 77
    sget v2, Lcom/kubi/facade/lib/R$drawable;->icon_menu_future:I

    .line 78
    .line 79
    .line 80
    invoke-static {v0, v1, v2, v7}, Lcom/kubi/kucoin/utils/n;->b(Landroid/widget/RadioButton;Ljava/lang/String;IZ)V

    .line 81
    .line 82
    .line 83
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    if-eqz v0, :cond_4

    .line 87
    .line 88
    iget-object v0, v0, Lsf/a;->h:Landroid/widget/RadioButton;

    .line 89
    .line 90
    if-eqz v0, :cond_4

    .line 91
    .line 92
    const-string v1, "icon_assets_checked.json"

    .line 93
    .line 94
    sget v2, Lcom/kubi/facade/lib/R$drawable;->icon_menu_assets:I

    .line 95
    .line 96
    .line 97
    invoke-static {v0, v1, v2, v7}, Lcom/kubi/kucoin/utils/n;->b(Landroid/widget/RadioButton;Ljava/lang/String;IZ)V

    .line 98
    .line 99
    .line 100
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 101
    move-result-object v0

    .line 102
    .line 103
    if-eqz v0, :cond_5

    .line 104
    .line 105
    iget-object v0, v0, Lsf/a;->g:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 106
    .line 107
    if-eqz v0, :cond_5

    .line 108
    .line 109
    new-instance v1, Lcom/kubi/kucoin/main/KuCoinMainActivity$c;

    .line 110
    .line 111
    .line 112
    invoke-direct {v1, p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity$c;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lcom/kubi/resources/widget/RadioGroupPlus;->setOnCheckedChangeListener(Lcom/kubi/resources/widget/RadioGroupPlus$c;)V

    .line 116
    .line 117
    :cond_5
    if-eqz p1, :cond_6

    .line 118
    .line 119
    .line 120
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 121
    move-result-object v0

    .line 122
    .line 123
    if-eqz v0, :cond_9

    .line 124
    .line 125
    iget-object v0, v0, Lsf/a;->g:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 126
    .line 127
    if-eqz v0, :cond_9

    .line 128
    .line 129
    const-string v1, "save_position"

    .line 130
    const/4 v2, 0x0

    .line 131
    .line 132
    .line 133
    invoke-static {p1, v1, v2}, Lcom/kubi/router/utils/RouteExKt;->Q(Landroid/os/Bundle;Ljava/lang/String;I)I

    .line 134
    move-result p1

    .line 135
    .line 136
    .line 137
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->n2(I)I

    .line 138
    move-result p1

    .line 139
    .line 140
    .line 141
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/RadioGroupPlus;->f(I)V

    .line 142
    goto :goto_2

    .line 143
    .line 144
    .line 145
    :cond_6
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 146
    move-result-object p1

    .line 147
    .line 148
    const-string v0, "getIntent(...)"

    .line 149
    .line 150
    .line 151
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 152
    .line 153
    const-string v1, "position"

    .line 154
    .line 155
    .line 156
    invoke-static {p1, v1}, Lcom/kubi/router/utils/RouteExKt;->R(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    .line 157
    move-result-object p1

    .line 158
    .line 159
    if-eqz p1, :cond_7

    .line 160
    .line 161
    .line 162
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 163
    move-result p1

    .line 164
    goto :goto_1

    .line 165
    .line 166
    .line 167
    :cond_7
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 168
    move-result-object p1

    .line 169
    .line 170
    .line 171
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 172
    .line 173
    const-string v0, "page"

    .line 174
    .line 175
    .line 176
    invoke-static {p1, v0}, Lcom/kubi/router/utils/RouteExKt;->R(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    .line 177
    move-result-object p1

    .line 178
    .line 179
    if-eqz p1, :cond_8

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    .line 183
    move-result p1

    .line 184
    .line 185
    .line 186
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->n2(I)I

    .line 187
    move-result p1

    .line 188
    .line 189
    .line 190
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 191
    move-result-object p1

    .line 192
    goto :goto_0

    .line 193
    :cond_8
    const/4 p1, 0x0

    .line 194
    .line 195
    :goto_0
    sget v0, Lcom/kubi/facade/lib/R$id;->main_home:I

    .line 196
    .line 197
    .line 198
    invoke-static {p1, v0}, Lcom/kubi/utils/extensions/d;->k(Ljava/lang/Integer;I)I

    .line 199
    move-result p1

    .line 200
    .line 201
    .line 202
    :goto_1
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 203
    move-result-object v0

    .line 204
    .line 205
    .line 206
    invoke-virtual {p0, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->X1(Landroid/content/Intent;)V

    .line 207
    .line 208
    .line 209
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->t1(I)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 213
    move-result-object v0

    .line 214
    .line 215
    if-eqz v0, :cond_9

    .line 216
    .line 217
    iget-object v0, v0, Lsf/a;->g:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 218
    .line 219
    if-eqz v0, :cond_9

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/RadioGroupPlus;->f(I)V

    .line 223
    .line 224
    .line 225
    :cond_9
    :goto_2
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 226
    move-result-object p1

    .line 227
    .line 228
    if-eqz p1, :cond_a

    .line 229
    .line 230
    iget-object v0, p1, Lsf/a;->l:Landroid/widget/RadioButton;

    .line 231
    .line 232
    if-eqz v0, :cond_a

    .line 233
    .line 234
    new-instance v3, Lcom/kubi/kucoin/main/n;

    .line 235
    .line 236
    .line 237
    invoke-direct {v3, p0}, Lcom/kubi/kucoin/main/n;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 238
    const/4 v4, 0x1

    .line 239
    const/4 v5, 0x0

    .line 240
    .line 241
    const-wide/16 v1, 0x0

    .line 242
    .line 243
    .line 244
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 245
    .line 246
    .line 247
    :cond_a
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 248
    move-result-object p1

    .line 249
    .line 250
    if-eqz p1, :cond_b

    .line 251
    .line 252
    iget-object v0, p1, Lsf/a;->j:Landroid/widget/RadioButton;

    .line 253
    .line 254
    if-eqz v0, :cond_b

    .line 255
    .line 256
    new-instance v3, Lcom/kubi/kucoin/main/o;

    .line 257
    .line 258
    .line 259
    invoke-direct {v3, p0}, Lcom/kubi/kucoin/main/o;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 260
    const/4 v4, 0x1

    .line 261
    const/4 v5, 0x0

    .line 262
    .line 263
    const-wide/16 v1, 0x0

    .line 264
    .line 265
    .line 266
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 267
    .line 268
    .line 269
    :cond_b
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 270
    move-result-object p1

    .line 271
    .line 272
    if-eqz p1, :cond_c

    .line 273
    .line 274
    iget-object v0, p1, Lsf/a;->h:Landroid/widget/RadioButton;

    .line 275
    .line 276
    if-eqz v0, :cond_c

    .line 277
    .line 278
    new-instance v3, Lcom/kubi/kucoin/main/p;

    .line 279
    .line 280
    .line 281
    invoke-direct {v3, p0}, Lcom/kubi/kucoin/main/p;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 282
    const/4 v4, 0x1

    .line 283
    const/4 v5, 0x0

    .line 284
    .line 285
    const-wide/16 v1, 0x0

    .line 286
    .line 287
    .line 288
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 289
    :cond_c
    return-void
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
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
.end method

.method public final S1()V
    .locals 4

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
    const-string v2, "com.kubi.home.event.HomeEvent:showRedPoint"

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
    new-instance v1, Lcom/kubi/kucoin/main/KuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$1;

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {v1, v2, v3, p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v2, v1}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 28
    move-result v0

    .line 29
    .line 30
    const-string v1, "com.kubi.notice.event.NoticeEvent:update_notice_count"

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 36
    move-result v0

    .line 37
    .line 38
    :cond_1
    new-instance v0, Lcom/kubi/kucoin/main/KuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$2;

    .line 39
    .line 40
    .line 41
    invoke-direct {v0, v1, v3, p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity$initRedPointNotice$$inlined$bindFlowEvent$2;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v2, v0}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

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
    .line 184
.end method

.method public final T1()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v3, Lcom/kubi/kucoin/main/KuCoinMainActivity$initUpdatePasswordConfig$1;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v3, v1}, Lcom/kubi/kucoin/main/KuCoinMainActivity$initUpdatePasswordConfig$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 11
    const/4 v4, 0x3

    .line 12
    const/4 v5, 0x0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    .line 16
    invoke-static/range {v0 .. v5}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 17
    .line 18
    sget-object v0, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Lcom/kubi/user/api/IUserService;->l0()V

    .line 26
    return-void
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final U1(I)Z
    .locals 1
    .param p1    # I
        .annotation build Landroidx/annotation/IdRes;
        .end annotation
    .end param

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->z:I

    .line 3
    .line 4
    if-ne v0, p1, :cond_0

    .line 5
    const/4 p1, 0x1

    .line 6
    return p1

    .line 7
    :cond_0
    const/4 p1, 0x0

    .line 8
    return p1
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
.end method

.method public W()Z
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
.end method

.method public final W1()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->l1()V

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
    const-string v1, "com.kubi.home.feed.QuoteEvent:home_feed_on_top"

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
    new-instance v0, Lcom/kubi/kucoin/main/KuCoinMainActivity$listenEvent$$inlined$bindFlowEvent$1;

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    .line 23
    invoke-direct {v0, v1, v2, p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity$listenEvent$$inlined$bindFlowEvent$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

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
.end method

.method public final X1(Landroid/content/Intent;)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_2

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->q2(Landroid/content/Intent;)Ljava/lang/Integer;

    .line 7
    move-result-object v1

    .line 8
    .line 9
    sget v2, Lcom/kubi/facade/lib/R$id;->main_trade:I

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    goto :goto_0

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    .line 16
    move-result v1

    .line 17
    .line 18
    if-ne v1, v2, :cond_1

    .line 19
    goto :goto_1

    .line 20
    :cond_1
    :goto_0
    move-object p1, v0

    .line 21
    .line 22
    :goto_1
    if-eqz p1, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 26
    move-result-object p1

    .line 27
    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    new-instance v0, Landroid/os/Bundle;

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, p1}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    .line 34
    .line 35
    :cond_2
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->E:Landroid/os/Bundle;

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
.end method

.method public Z()I
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/facade/lib/R$layout;->kucoin_activity_main:I

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
.end method

.method public c(ZZ)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_8

    .line 7
    .line 8
    iget-object v0, v0, Lsf/a;->g:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    .line 12
    goto/16 :goto_2

    .line 13
    .line 14
    .line 15
    :cond_0
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Landroid/view/ViewPropertyAnimator;->cancel()V

    .line 20
    const/4 v1, 0x1

    .line 21
    const/4 v2, 0x0

    .line 22
    .line 23
    if-eqz p1, :cond_4

    .line 24
    .line 25
    iput-boolean v1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->D:Z

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 29
    move-result p1

    .line 30
    .line 31
    if-eqz p1, :cond_1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 35
    return-void

    .line 36
    .line 37
    .line 38
    :cond_1
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 39
    move-result p1

    .line 40
    .line 41
    if-lez p1, :cond_2

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Landroid/view/View;->getHeight()I

    .line 45
    move-result p1

    .line 46
    goto :goto_0

    .line 47
    .line 48
    .line 49
    :cond_2
    invoke-virtual {v0}, Landroid/view/View;->getMeasuredHeight()I

    .line 50
    move-result p1

    .line 51
    :goto_0
    int-to-float p1, p1

    .line 52
    .line 53
    if-eqz p2, :cond_3

    .line 54
    .line 55
    cmpl-float p2, p1, v2

    .line 56
    .line 57
    if-lez p2, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0}, Landroid/view/View;->animate()Landroid/view/ViewPropertyAnimator;

    .line 61
    move-result-object p2

    .line 62
    .line 63
    .line 64
    invoke-virtual {p2, p1}, Landroid/view/ViewPropertyAnimator;->translationY(F)Landroid/view/ViewPropertyAnimator;

    .line 65
    move-result-object p1

    .line 66
    .line 67
    const-wide/16 v1, 0xfa

    .line 68
    .line 69
    .line 70
    invoke-virtual {p1, v1, v2}, Landroid/view/ViewPropertyAnimator;->setDuration(J)Landroid/view/ViewPropertyAnimator;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    new-instance p2, Lcom/kubi/kucoin/main/s;

    .line 74
    .line 75
    .line 76
    invoke-direct {p2, p0, v0}, Lcom/kubi/kucoin/main/s;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lcom/kubi/resources/widget/RadioGroupPlus;)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, p2}, Landroid/view/ViewPropertyAnimator;->withEndAction(Ljava/lang/Runnable;)Landroid/view/ViewPropertyAnimator;

    .line 80
    move-result-object p1

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/view/ViewPropertyAnimator;->start()V

    .line 84
    return-void

    .line 85
    .line 86
    :cond_3
    const/16 p1, 0x8

    .line 87
    .line 88
    .line 89
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 93
    return-void

    .line 94
    .line 95
    :cond_4
    iget-boolean p1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->D:Z

    .line 96
    .line 97
    if-nez p1, :cond_5

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 101
    move-result p1

    .line 102
    .line 103
    if-nez p1, :cond_5

    .line 104
    .line 105
    .line 106
    invoke-virtual {v0}, Landroid/view/View;->getTranslationY()F

    .line 107
    move-result p1

    .line 108
    .line 109
    cmpg-float p1, p1, v2

    .line 110
    .line 111
    if-nez p1, :cond_5

    .line 112
    return-void

    .line 113
    :cond_5
    const/4 p1, 0x0

    .line 114
    .line 115
    iput-boolean p1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->D:Z

    .line 116
    .line 117
    .line 118
    invoke-virtual {v0}, Landroid/view/View;->getVisibility()I

    .line 119
    move-result v3

    .line 120
    .line 121
    if-nez v3, :cond_6

    .line 122
    goto :goto_1

    .line 123
    :cond_6
    move v1, p1

    .line 124
    .line 125
    .line 126
    :goto_1
    invoke-virtual {v0, p1}, Landroid/view/View;->setVisibility(I)V

    .line 127
    .line 128
    if-eqz p2, :cond_7

    .line 129
    .line 130
    new-instance p1, Lcom/kubi/kucoin/main/t;

    .line 131
    .line 132
    .line 133
    invoke-direct {p1, p0, v0, v1}, Lcom/kubi/kucoin/main/t;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lcom/kubi/resources/widget/RadioGroupPlus;Z)V

    .line 134
    .line 135
    .line 136
    invoke-virtual {v0, p1}, Landroid/view/View;->post(Ljava/lang/Runnable;)Z

    .line 137
    return-void

    .line 138
    .line 139
    .line 140
    :cond_7
    invoke-virtual {v0, v2}, Landroid/view/View;->setTranslationY(F)V

    .line 141
    :cond_8
    :goto_2
    return-void
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
.end method

.method public c0()Landroid/view/View;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    return-object v0
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
.end method

.method public e0()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/site/SiteVisibleConfigKey;->Futures:Lcom/kubi/sdk/site/SiteVisibleConfigKey;

    .line 3
    .line 4
    new-instance v1, Lcom/kubi/kucoin/main/i;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Lcom/kubi/kucoin/main/i;-><init>()V

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lcom/kubi/sdk/site/b;->e(Lcom/kubi/sdk/site/SiteVisibleConfigKey;Lkotlin/jvm/functions/Function0;)V

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
.end method

.method public getBundleSizeLimit()I
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xc3

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
.end method

.method public final k1()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/clean/api/service/IAutoCleanService;->a:Lcom/kubi/clean/api/service/IAutoCleanService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/clean/api/service/IAutoCleanService$Companion;->get()Lcom/kubi/clean/api/service/IAutoCleanService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-interface {v0}, Lcom/kubi/clean/api/service/IAutoCleanService;->b()V

    .line 10
    .line 11
    sget-object v0, Lcom/kubi/event/api/b;->a:Lcom/kubi/event/api/b;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 15
    move-result v0

    .line 16
    .line 17
    const-string v1, "event_refresh_top_msg"

    .line 18
    .line 19
    if-eqz v0, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 23
    move-result v0

    .line 24
    .line 25
    :cond_0
    new-instance v0, Lcom/kubi/kucoin/main/KuCoinMainActivity$bindAutoCleanEvent$$inlined$bindFlowEvent$1;

    .line 26
    const/4 v2, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1, v2, p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity$bindAutoCleanEvent$$inlined$bindFlowEvent$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 30
    const/4 v1, 0x0

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v1, v0}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 34
    return-void
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
.end method

.method public final l1()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/event/api/b;->a:Lcom/kubi/event/api/b;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/event/api/b;->a()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    const-string v1, "show_deposit_disable_dialog"

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Ljava/lang/CharSequence;->length()I

    .line 14
    move-result v0

    .line 15
    .line 16
    :cond_0
    new-instance v0, Lcom/kubi/kucoin/main/KuCoinMainActivity$bindShowDepositDisableDialogEvent$$inlined$bindFlowEvent$1;

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2}, Lcom/kubi/kucoin/main/KuCoinMainActivity$bindShowDepositDisableDialogEvent$$inlined$bindFlowEvent$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;)V

    .line 21
    const/4 v1, 0x1

    .line 22
    .line 23
    .line 24
    invoke-static {p0, v1, v0}, Lcom/kubi/event/api/a;->a(Landroidx/lifecycle/LifecycleOwner;ZLkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 25
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final m1(I)V
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/facade/lib/R$id;->main_home:I

    .line 3
    .line 4
    if-ne p1, v0, :cond_0

    .line 5
    .line 6
    const-string p1, "B1homePage"

    .line 7
    .line 8
    const-string v0, "homeBottomTab"

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->y2(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    return-void

    .line 13
    .line 14
    :cond_0
    sget v0, Lcom/kubi/facade/lib/R$id;->main_quotes:I

    .line 15
    .line 16
    if-ne p1, v0, :cond_1

    .line 17
    .line 18
    const-string p1, "B5markets"

    .line 19
    .line 20
    const-string v0, "marketBottomTab"

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, p1, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->y2(Ljava/lang/String;Ljava/lang/String;)V

    .line 24
    return-void

    .line 25
    .line 26
    :cond_1
    sget v0, Lcom/kubi/facade/lib/R$id;->main_trade:I

    .line 27
    .line 28
    if-ne p1, v0, :cond_2

    .line 29
    .line 30
    const-string p1, "B5trading"

    .line 31
    .line 32
    const-string v0, "tradingBottomTab"

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, p1, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->y2(Ljava/lang/String;Ljava/lang/String;)V

    .line 36
    return-void

    .line 37
    .line 38
    :cond_2
    sget v0, Lcom/kubi/facade/lib/R$id;->main_kumex:I

    .line 39
    .line 40
    if-ne p1, v0, :cond_3

    .line 41
    .line 42
    const-string p1, "B6futuresTrade"

    .line 43
    .line 44
    const-string v0, "futuresBottomTab"

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, p1, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->y2(Ljava/lang/String;Ljava/lang/String;)V

    .line 48
    return-void

    .line 49
    .line 50
    :cond_3
    sget v0, Lcom/kubi/facade/lib/R$id;->main_assets:I

    .line 51
    .line 52
    if-ne p1, v0, :cond_4

    .line 53
    .line 54
    const-string p1, "B1overview"

    .line 55
    .line 56
    const-string v0, "assetsBottomTab"

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0, p1, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->y2(Ljava/lang/String;Ljava/lang/String;)V

    .line 60
    :cond_4
    return-void
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
.end method

.method public final n1()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseActivity;->getResources()Landroid/content/res/Resources;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget v1, Lcom/kubi/facade/lib/R$drawable;->selector_darkoverlay_click:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    instance-of v1, v0, Landroid/graphics/drawable/RippleDrawable;

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    new-instance v1, Lcom/kubi/kucoin/main/q;

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v0, p0}, Lcom/kubi/kucoin/main/q;-><init>(Landroid/graphics/drawable/Drawable;Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 20
    .line 21
    .line 22
    invoke-static {v1}, Lcom/kubi/utils/x0;->d(Lkotlin/jvm/functions/Function0;)V

    .line 23
    :cond_0
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public final n2(I)I
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_4

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_3

    .line 6
    const/4 v0, 0x2

    .line 7
    .line 8
    if-eq p1, v0, :cond_2

    .line 9
    const/4 v0, 0x3

    .line 10
    .line 11
    if-eq p1, v0, :cond_1

    .line 12
    const/4 v0, 0x4

    .line 13
    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    sget p1, Lcom/kubi/facade/lib/R$id;->main_home:I

    .line 17
    return p1

    .line 18
    .line 19
    :cond_0
    sget p1, Lcom/kubi/facade/lib/R$id;->main_assets:I

    .line 20
    return p1

    .line 21
    .line 22
    :cond_1
    sget p1, Lcom/kubi/facade/lib/R$id;->main_kumex:I

    .line 23
    return p1

    .line 24
    .line 25
    :cond_2
    sget p1, Lcom/kubi/facade/lib/R$id;->main_trade:I

    .line 26
    return p1

    .line 27
    .line 28
    :cond_3
    sget p1, Lcom/kubi/facade/lib/R$id;->main_quotes:I

    .line 29
    return p1

    .line 30
    .line 31
    :cond_4
    sget p1, Lcom/kubi/facade/lib/R$id;->main_home:I

    .line 32
    return p1
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
.end method

.method public final o2()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    new-instance v1, Lcom/kubi/kucoin/main/KuCoinMainActivity$queryKycStatus$1;

    .line 16
    const/4 v2, 0x0

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, p0, v2}, Lcom/kubi/kucoin/main/KuCoinMainActivity$queryKycStatus$1;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lkotlin/coroutines/Continuation;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenStarted(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 23
    return-void
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "getSupportFragmentManager(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseActivity;->dispatchBackPress(Landroidx/fragment/app/FragmentManager;)Z

    .line 13
    move-result v0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/OldBaseActivity;->onBackPressed()V

    .line 19
    :cond_0
    return-void
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
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/util/j1;->a:Lcom/kubi/sdk/util/j1;

    .line 3
    .line 4
    const-string v1, "duration7"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/kubi/sdk/util/j1;->j(Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v0, Loj/f;->a:Loj/f;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Loj/f;->i()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->y1()Z

    .line 16
    move-result v1

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-super {p0, v2}, Lcom/kubi/sdk/base/ui/BaseUiActivity;->onCreate(Landroid/os/Bundle;)V

    .line 23
    goto :goto_0

    .line 24
    .line 25
    .line 26
    :cond_0
    invoke-super {p0, p1}, Lcom/kubi/sdk/base/ui/BaseUiActivity;->onCreate(Landroid/os/Bundle;)V

    .line 27
    .line 28
    :goto_0
    const-string v1, "main_activity_xml_finish"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Loj/f;->b(Ljava/lang/String;)V

    .line 32
    .line 33
    new-instance v0, Ljava/lang/StringBuilder;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 37
    .line 38
    const-string v1, "KcCoinMainActivity: onCreate, "

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 45
    move-result v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    const-string v1, "LiteTag"

    .line 55
    .line 56
    .line 57
    invoke-static {v1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 58
    .line 59
    sget-object v0, Lcom/kubi/mine/api/service/IMineService;->a:Lcom/kubi/mine/api/service/IMineService$Companion;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/kubi/mine/api/service/IMineService$Companion;->get()Lcom/kubi/mine/api/service/IMineService;

    .line 63
    move-result-object v0

    .line 64
    .line 65
    .line 66
    invoke-interface {v0, p0}, Lcom/kubi/mine/api/service/IMineService;->k(Landroidx/fragment/app/FragmentActivity;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    const-string v1, "getFragments(...)"

    .line 77
    .line 78
    .line 79
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 83
    move-result-object v0

    .line 84
    .line 85
    .line 86
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 87
    move-result v1

    .line 88
    .line 89
    if-eqz v1, :cond_1

    .line 90
    .line 91
    .line 92
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 93
    move-result-object v1

    .line 94
    .line 95
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 96
    .line 97
    .line 98
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;)V

    .line 99
    .line 100
    .line 101
    invoke-static {p0, v1}, Lcom/kubi/utils/extensions/core/f;->l(Landroidx/fragment/app/FragmentActivity;Landroidx/fragment/app/Fragment;)V

    .line 102
    goto :goto_1

    .line 103
    .line 104
    .line 105
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->N1()V

    .line 106
    .line 107
    new-instance v0, Landroidx/lifecycle/ViewModelProvider;

    .line 108
    .line 109
    .line 110
    invoke-direct {v0, p0}, Landroidx/lifecycle/ViewModelProvider;-><init>(Landroidx/lifecycle/ViewModelStoreOwner;)V

    .line 111
    .line 112
    const-class v1, Lcom/kubi/kucoin/main/i0;

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Landroidx/lifecycle/ViewModelProvider;->get(Ljava/lang/Class;)Landroidx/lifecycle/ViewModel;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    check-cast v0, Lcom/kubi/kucoin/main/i0;

    .line 119
    const/4 v1, 0x0

    .line 120
    const/4 v3, 0x2

    .line 121
    .line 122
    .line 123
    invoke-static {v0, v1, v2, v3, v2}, Lcom/kubi/kucoin/main/i0;->u(Lcom/kubi/kucoin/main/i0;ILjava/lang/String;ILjava/lang/Object;)V

    .line 124
    .line 125
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->y:Lcom/kubi/kucoin/main/i0;

    .line 126
    .line 127
    .line 128
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->n1()V

    .line 129
    .line 130
    .line 131
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 132
    move-result-object v0

    .line 133
    .line 134
    if-eqz v0, :cond_2

    .line 135
    .line 136
    iget-object v0, v0, Lsf/a;->b:Landroid/view/View;

    .line 137
    .line 138
    if-eqz v0, :cond_2

    .line 139
    .line 140
    sget-object v1, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 141
    .line 142
    .line 143
    invoke-virtual {v1, p0, v0}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->f(Landroid/app/Activity;Landroid/view/View;)V

    .line 144
    .line 145
    .line 146
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 147
    .line 148
    :cond_2
    new-instance v0, Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;

    .line 149
    .line 150
    new-instance v1, Lcom/kubi/kucoin/main/l;

    .line 151
    .line 152
    .line 153
    invoke-direct {v1}, Lcom/kubi/kucoin/main/l;-><init>()V

    .line 154
    .line 155
    .line 156
    invoke-direct {v0, p0, v1}, Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;-><init>(Landroid/app/Activity;Lkotlin/jvm/functions/Function0;)V

    .line 157
    .line 158
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->C:Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v0}, Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;->e()V

    .line 162
    .line 163
    .line 164
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->p2()V

    .line 165
    .line 166
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 167
    .line 168
    sget-object v1, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 169
    .line 170
    .line 171
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 172
    move-result-object v3

    .line 173
    .line 174
    const-class v4, Ljl/b;

    .line 175
    .line 176
    .line 177
    invoke-virtual {v0, v4, v3}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 178
    move-result-object v3

    .line 179
    .line 180
    if-eqz v3, :cond_3

    .line 181
    .line 182
    check-cast v3, Ljl/b;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 186
    move-result-object v5

    .line 187
    .line 188
    .line 189
    invoke-interface {v3, v5}, Ljl/b;->b(Lsf/a;)V

    .line 190
    goto :goto_2

    .line 191
    .line 192
    .line 193
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x1()Lcom/kubi/sdk/BaseFragment;

    .line 194
    move-result-object v3

    .line 195
    .line 196
    if-nez v3, :cond_4

    .line 197
    .line 198
    .line 199
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 200
    move-result-object v3

    .line 201
    .line 202
    if-eqz v3, :cond_4

    .line 203
    .line 204
    iget-object v3, v3, Lsf/a;->j:Landroid/widget/RadioButton;

    .line 205
    .line 206
    if-eqz v3, :cond_4

    .line 207
    .line 208
    .line 209
    invoke-static {v3}, Lcom/kubi/utils/extensions/core/ViewExtKt;->h(Landroid/view/View;)V

    .line 210
    .line 211
    .line 212
    :cond_4
    :goto_2
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->O1(Landroid/os/Bundle;)V

    .line 213
    .line 214
    sget-object p1, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 215
    .line 216
    .line 217
    invoke-virtual {p1}, Lcom/kubi/user/config/UserInfo;->e()Lio/reactivex/Observable;

    .line 218
    move-result-object v3

    .line 219
    .line 220
    .line 221
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    .line 222
    move-result-object v5

    .line 223
    .line 224
    .line 225
    invoke-virtual {v3, v5}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    .line 226
    move-result-object v3

    .line 227
    .line 228
    new-instance v5, Lcom/kubi/kucoin/main/x;

    .line 229
    .line 230
    .line 231
    invoke-direct {v5, p0}, Lcom/kubi/kucoin/main/x;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 232
    .line 233
    new-instance v6, Lcom/kubi/kucoin/main/y;

    .line 234
    .line 235
    .line 236
    invoke-direct {v6, v5}, Lcom/kubi/kucoin/main/y;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 237
    .line 238
    .line 239
    invoke-virtual {v3, v6}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 240
    move-result-object v3

    .line 241
    .line 242
    .line 243
    invoke-virtual {p0, v3}, Lcom/kubi/sdk/base/ui/OldBaseActivity;->T(Lio/reactivex/disposables/Disposable;)V

    .line 244
    .line 245
    .line 246
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 247
    move-result-object v3

    .line 248
    .line 249
    new-instance v5, Lcom/kubi/kucoin/main/KuCoinMainActivity$onCreate$8;

    .line 250
    .line 251
    .line 252
    invoke-direct {v5, p0, v2}, Lcom/kubi/kucoin/main/KuCoinMainActivity$onCreate$8;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;Lkotlin/coroutines/Continuation;)V

    .line 253
    .line 254
    .line 255
    invoke-virtual {v3, v5}, Landroidx/lifecycle/LifecycleCoroutineScope;->launchWhenResumed(Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/x1;

    .line 256
    .line 257
    .line 258
    invoke-static {}, Lcom/kubi/user/config/a;->b()Z

    .line 259
    move-result v3

    .line 260
    .line 261
    if-nez v3, :cond_5

    .line 262
    .line 263
    .line 264
    invoke-virtual {p1}, Lcom/kubi/user/config/UserInfo;->n()Z

    .line 265
    move-result p1

    .line 266
    .line 267
    if-eqz p1, :cond_5

    .line 268
    const/4 p1, 0x1

    .line 269
    .line 270
    .line 271
    invoke-static {p0, v2, p1, v2}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->D1(Lcom/kubi/kucoin/main/KuCoinMainActivity;Landroidx/fragment/app/FragmentManager;ILjava/lang/Object;)V

    .line 272
    .line 273
    .line 274
    :cond_5
    invoke-static {}, Lkf/c;->a()Lio/reactivex/subjects/PublishSubject;

    .line 275
    move-result-object p1

    .line 276
    .line 277
    .line 278
    invoke-static {}, Lio/reactivex/android/schedulers/AndroidSchedulers;->mainThread()Lio/reactivex/Scheduler;

    .line 279
    move-result-object v3

    .line 280
    .line 281
    .line 282
    invoke-virtual {p1, v3}, Lio/reactivex/Observable;->observeOn(Lio/reactivex/Scheduler;)Lio/reactivex/Observable;

    .line 283
    move-result-object p1

    .line 284
    .line 285
    new-instance v3, Lcom/kubi/kucoin/main/z;

    .line 286
    .line 287
    .line 288
    invoke-direct {v3}, Lcom/kubi/kucoin/main/z;-><init>()V

    .line 289
    .line 290
    new-instance v5, Lcom/kubi/kucoin/main/a0;

    .line 291
    .line 292
    .line 293
    invoke-direct {v5, v3}, Lcom/kubi/kucoin/main/a0;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 294
    .line 295
    .line 296
    invoke-virtual {p1, v5}, Lio/reactivex/Observable;->filter(Lio/reactivex/functions/Predicate;)Lio/reactivex/Observable;

    .line 297
    move-result-object p1

    .line 298
    .line 299
    new-instance v3, Lcom/kubi/kucoin/main/b0;

    .line 300
    .line 301
    .line 302
    invoke-direct {v3}, Lcom/kubi/kucoin/main/b0;-><init>()V

    .line 303
    .line 304
    new-instance v5, Lcom/kubi/kucoin/main/b;

    .line 305
    .line 306
    .line 307
    invoke-direct {v5, v3}, Lcom/kubi/kucoin/main/b;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 308
    .line 309
    new-instance v3, Lcom/kubi/kucoin/main/c;

    .line 310
    .line 311
    .line 312
    invoke-direct {v3}, Lcom/kubi/kucoin/main/c;-><init>()V

    .line 313
    .line 314
    new-instance v6, Lcom/kubi/kucoin/main/d;

    .line 315
    .line 316
    .line 317
    invoke-direct {v6, v3}, Lcom/kubi/kucoin/main/d;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 318
    .line 319
    .line 320
    invoke-virtual {p1, v5, v6}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

    .line 321
    move-result-object p1

    .line 322
    .line 323
    const-string v3, "subscribe(...)"

    .line 324
    .line 325
    .line 326
    invoke-static {p1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 327
    .line 328
    .line 329
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseActivity;->getDestroyDisposable()Lio/reactivex/disposables/CompositeDisposable;

    .line 330
    move-result-object v3

    .line 331
    .line 332
    .line 333
    invoke-static {p1, v3}, Lio/reactivex/rxkotlin/DisposableKt;->addTo(Lio/reactivex/disposables/Disposable;Lio/reactivex/disposables/CompositeDisposable;)Lio/reactivex/disposables/Disposable;

    .line 334
    .line 335
    sget-object p1, Lcom/kubi/data/p;->a:Lcom/kubi/data/p;

    .line 336
    .line 337
    .line 338
    invoke-virtual {p1}, Lcom/kubi/data/p;->k()V

    .line 339
    .line 340
    sget-object p1, Lcom/kubi/assets/api/IAssetsCenterService;->a:Lcom/kubi/assets/api/IAssetsCenterService$Companion;

    .line 341
    .line 342
    .line 343
    invoke-virtual {p1}, Lcom/kubi/assets/api/IAssetsCenterService$Companion;->get()Lcom/kubi/assets/api/IAssetsCenterService;

    .line 344
    move-result-object p1

    .line 345
    .line 346
    .line 347
    invoke-interface {p1}, Lcom/kubi/assets/api/IAssetsCenterService;->u()V

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 351
    move-result-object p1

    .line 352
    .line 353
    .line 354
    invoke-virtual {v0, v4, p1}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 355
    move-result-object p1

    .line 356
    .line 357
    if-eqz p1, :cond_6

    .line 358
    .line 359
    check-cast p1, Ljl/b;

    .line 360
    .line 361
    new-instance v0, Lcom/kubi/kucoin/main/e;

    .line 362
    .line 363
    .line 364
    invoke-direct {v0, p0}, Lcom/kubi/kucoin/main/e;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 365
    .line 366
    .line 367
    invoke-interface {p1, v0}, Ljl/b;->a(Lkotlin/jvm/functions/Function0;)V

    .line 368
    goto :goto_3

    .line 369
    .line 370
    :cond_6
    sget-object p1, Lcom/kubi/market/monitor/api/IMarketMonitorService;->a:Lcom/kubi/market/monitor/api/IMarketMonitorService$Companion;

    .line 371
    .line 372
    .line 373
    invoke-virtual {p1}, Lcom/kubi/market/monitor/api/IMarketMonitorService$Companion;->get()Lcom/kubi/market/monitor/api/IMarketMonitorService;

    .line 374
    move-result-object p1

    .line 375
    .line 376
    iget-object v0, p0, Lcom/kubi/sdk/base/ui/BaseUiActivity;->q:Landroid/content/Context;

    .line 377
    .line 378
    .line 379
    invoke-interface {p1, v0}, Lcom/kubi/market/monitor/api/IMarketMonitorService;->a(Landroid/content/Context;)V

    .line 380
    .line 381
    .line 382
    :goto_3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 383
    move-result-object p1

    .line 384
    .line 385
    if-eqz p1, :cond_c

    .line 386
    .line 387
    iget-object p1, p1, Lsf/a;->g:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 388
    .line 389
    if-eqz p1, :cond_c

    .line 390
    .line 391
    .line 392
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 393
    move-result-object p1

    .line 394
    .line 395
    if-eqz p1, :cond_7

    .line 396
    .line 397
    iget-object p1, p1, Lsf/a;->i:Lcom/kubi/kucoin/main/widget/HomeRadioButton;

    .line 398
    .line 399
    if-eqz p1, :cond_7

    .line 400
    .line 401
    .line 402
    invoke-virtual {p1}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 403
    move-result-object p1

    .line 404
    goto :goto_4

    .line 405
    :cond_7
    move-object p1, v2

    .line 406
    .line 407
    :goto_4
    instance-of v0, p1, Landroid/view/ViewGroup;

    .line 408
    .line 409
    if-eqz v0, :cond_8

    .line 410
    .line 411
    check-cast p1, Landroid/view/ViewGroup;

    .line 412
    goto :goto_5

    .line 413
    :cond_8
    move-object p1, v2

    .line 414
    .line 415
    .line 416
    :goto_5
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 417
    move-result-object v0

    .line 418
    .line 419
    if-eqz v0, :cond_9

    .line 420
    .line 421
    iget-object v0, v0, Lsf/a;->l:Landroid/widget/RadioButton;

    .line 422
    .line 423
    if-eqz v0, :cond_9

    .line 424
    .line 425
    .line 426
    invoke-virtual {v0}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    .line 427
    move-result-object v0

    .line 428
    goto :goto_6

    .line 429
    :cond_9
    move-object v0, v2

    .line 430
    .line 431
    :goto_6
    instance-of v1, v0, Landroid/view/ViewGroup;

    .line 432
    .line 433
    if-eqz v1, :cond_a

    .line 434
    .line 435
    check-cast v0, Landroid/view/ViewGroup;

    .line 436
    goto :goto_7

    .line 437
    :cond_a
    move-object v0, v2

    .line 438
    .line 439
    :goto_7
    if-eqz p1, :cond_c

    .line 440
    .line 441
    if-nez v0, :cond_b

    .line 442
    goto :goto_8

    .line 443
    .line 444
    :cond_b
    new-instance v1, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

    .line 445
    .line 446
    .line 447
    invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 448
    move-result-object v3

    .line 449
    .line 450
    .line 451
    invoke-direct {v1, v3}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;-><init>(Landroid/content/Context;)V

    .line 452
    .line 453
    .line 454
    invoke-static {v1}, Lzw/c;->a(Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;)Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

    .line 455
    move-result-object v1

    .line 456
    .line 457
    .line 458
    invoke-virtual {v1, p1}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f(Landroid/view/View;)Lzw/a;

    .line 459
    move-result-object p1

    .line 460
    .line 461
    check-cast p1, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

    .line 462
    .line 463
    iput-object p1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->L:Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

    .line 464
    .line 465
    new-instance p1, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v0}, Landroid/view/View;->getContext()Landroid/content/Context;

    .line 469
    move-result-object v1

    .line 470
    .line 471
    .line 472
    invoke-direct {p1, v1}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;-><init>(Landroid/content/Context;)V

    .line 473
    .line 474
    .line 475
    invoke-static {p1}, Lzw/c;->a(Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;)Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

    .line 476
    move-result-object p1

    .line 477
    .line 478
    .line 479
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;->f(Landroid/view/View;)Lzw/a;

    .line 480
    move-result-object p1

    .line 481
    .line 482
    check-cast p1, Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

    .line 483
    .line 484
    iput-object p1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->M:Lcom/kubi/resources/widget/rorbin/badgeview/QBadgeView;

    .line 485
    .line 486
    .line 487
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->S1()V

    .line 488
    .line 489
    :cond_c
    :goto_8
    sget-object p1, Lcom/kubi/kucoin/utils/LocateManager;->a:Lcom/kubi/kucoin/utils/LocateManager;

    .line 490
    .line 491
    .line 492
    invoke-virtual {p1, p0}, Lcom/kubi/kucoin/utils/LocateManager;->g(Lcom/kubi/sdk/BaseActivity;)V

    .line 493
    .line 494
    iget-object p1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->y:Lcom/kubi/kucoin/main/i0;

    .line 495
    .line 496
    if-nez p1, :cond_d

    .line 497
    .line 498
    const-string p1, "mViewModel"

    .line 499
    .line 500
    .line 501
    invoke-static {p1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 502
    goto :goto_9

    .line 503
    :cond_d
    move-object v2, p1

    .line 504
    .line 505
    .line 506
    :goto_9
    invoke-virtual {v2}, Lcom/kubi/kucoin/main/i0;->s()Landroidx/lifecycle/MutableLiveData;

    .line 507
    move-result-object p1

    .line 508
    .line 509
    new-instance v0, Lcom/kubi/kucoin/main/u;

    .line 510
    .line 511
    .line 512
    invoke-direct {v0, p0}, Lcom/kubi/kucoin/main/u;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 513
    .line 514
    .line 515
    invoke-virtual {p1, p0, v0}, Landroidx/lifecycle/LiveData;->observe(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Observer;)V

    .line 516
    .line 517
    sget-object p1, Lcom/kubi/spot/api/ISpotService;->a:Lcom/kubi/spot/api/ISpotService$Companion;

    .line 518
    .line 519
    .line 520
    invoke-virtual {p1}, Lcom/kubi/spot/api/ISpotService$Companion;->get()Lcom/kubi/spot/api/ISpotService;

    .line 521
    move-result-object p1

    .line 522
    .line 523
    new-instance v0, Lcom/kubi/kucoin/main/v;

    .line 524
    .line 525
    .line 526
    invoke-direct {v0, p0}, Lcom/kubi/kucoin/main/v;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 527
    .line 528
    .line 529
    invoke-interface {p1, p0, v0}, Lcom/kubi/spot/api/ISpotService;->x(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function1;)V

    .line 530
    .line 531
    .line 532
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 533
    move-result-object p1

    .line 534
    .line 535
    if-eqz p1, :cond_e

    .line 536
    .line 537
    iget-object v0, p1, Lsf/a;->e:Landroid/widget/ImageView;

    .line 538
    .line 539
    if-eqz v0, :cond_e

    .line 540
    .line 541
    new-instance v3, Lcom/kubi/kucoin/main/w;

    .line 542
    .line 543
    .line 544
    invoke-direct {v3, p0}, Lcom/kubi/kucoin/main/w;-><init>(Lcom/kubi/kucoin/main/KuCoinMainActivity;)V

    .line 545
    const/4 v4, 0x1

    .line 546
    const/4 v5, 0x0

    .line 547
    .line 548
    const-wide/16 v1, 0x0

    .line 549
    .line 550
    .line 551
    invoke-static/range {v0 .. v5}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 552
    .line 553
    .line 554
    :cond_e
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->W1()V

    .line 555
    .line 556
    iget-object p1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->O:Lcom/kubi/kucoin/main/KuCoinMainActivity$a;

    .line 557
    .line 558
    .line 559
    invoke-static {p1}, Lcom/blankj/utilcode/util/d;->registerAppStatusChangedListener(Lcom/blankj/utilcode/util/o0$b;)V

    .line 560
    .line 561
    .line 562
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->T1()V

    .line 563
    .line 564
    .line 565
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 566
    move-result-object p1

    .line 567
    .line 568
    .line 569
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->F1(Landroid/content/Intent;)V

    .line 570
    return-void
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
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    .line 2
    :try_start_0
    sget-object v0, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 3
    .line 4
    iget-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->C:Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;->c()V

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception v0

    .line 12
    goto :goto_1

    .line 13
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 14
    .line 15
    iput-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->C:Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;

    .line 16
    .line 17
    sget-object v0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    goto :goto_2

    .line 22
    .line 23
    :goto_1
    sget-object v1, Lkotlin/Result;->Companion:Lkotlin/Result$Companion;

    .line 24
    .line 25
    .line 26
    invoke-static {v0}, Lkotlin/ResultKt;->createFailure(Ljava/lang/Throwable;)Ljava/lang/Object;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-static {v0}, Lkotlin/Result;->constructor-impl(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    .line 32
    .line 33
    :goto_2
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/BaseUiActivity;->onDestroy()V

    .line 34
    .line 35
    iget-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->A:Lcom/kubi/kucoin/utils/NetworkChangeReceiver;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, v0}, Landroid/content/Context;->unregisterReceiver(Landroid/content/BroadcastReceiver;)V

    .line 39
    .line 40
    iget-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->O:Lcom/kubi/kucoin/main/KuCoinMainActivity$a;

    .line 41
    .line 42
    .line 43
    invoke-static {v0}, Lcom/blankj/utilcode/util/d;->unregisterAppStatusChangedListener(Lcom/blankj/utilcode/util/o0$b;)V

    .line 44
    .line 45
    sget-object v0, Lcom/kubi/kucoin/utils/LocateManager;->a:Lcom/kubi/kucoin/utils/LocateManager;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Lcom/kubi/kucoin/utils/LocateManager;->h()V

    .line 49
    .line 50
    .line 51
    invoke-static {}, Lo00/g;->e()Ljava/util/concurrent/Executor;

    .line 52
    move-result-object v0

    .line 53
    .line 54
    new-instance v1, Lcom/kubi/kucoin/main/a;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1}, Lcom/kubi/kucoin/main/a;-><init>()V

    .line 58
    .line 59
    .line 60
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 61
    .line 62
    sget-object v0, Lml/a;->a:Lml/a;

    .line 63
    const/4 v1, 0x0

    .line 64
    .line 65
    .line 66
    invoke-virtual {v0, v1}, Lml/a;->a(Z)V

    .line 67
    .line 68
    sget-object v0, Lcom/kubi/data/BeepHelperV2;->a:Lcom/kubi/data/BeepHelperV2;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/kubi/data/BeepHelperV2;->g()V

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
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 10
    .param p1    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onNewIntent(Landroid/content/Intent;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->F1(Landroid/content/Intent;)V

    .line 7
    .line 8
    const-string v0, "[onNewIntent]"

    .line 9
    .line 10
    const-string v1, "KuCoinMainActivity"

    .line 11
    .line 12
    .line 13
    invoke-static {v1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    const/4 v2, 0x0

    .line 15
    .line 16
    if-eqz p1, :cond_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {p1}, Landroid/content/Intent;->getAction()Ljava/lang/String;

    .line 20
    move-result-object v0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move-object v0, v2

    .line 23
    .line 24
    :goto_0
    const-string v3, "action_widget_desk_home"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v3}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 28
    move-result v0

    .line 29
    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    goto/16 :goto_7

    .line 33
    .line 34
    :cond_1
    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    .line 35
    const/4 v7, 0x4

    .line 36
    const/4 v8, 0x0

    .line 37
    .line 38
    const-string v3, "com.kubi.home.event.HomeEvent:switchDrawer"

    .line 39
    .line 40
    const-wide/16 v5, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static/range {v3 .. v8}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 44
    .line 45
    if-eqz p1, :cond_e

    .line 46
    .line 47
    const-string v0, "position"

    .line 48
    .line 49
    .line 50
    invoke-static {p1, v0}, Lcom/kubi/router/utils/RouteExKt;->R(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    if-nez v0, :cond_3

    .line 54
    .line 55
    const-string v0, "page"

    .line 56
    .line 57
    .line 58
    invoke-static {p1, v0}, Lcom/kubi/router/utils/RouteExKt;->R(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    .line 59
    move-result-object v0

    .line 60
    .line 61
    if-eqz v0, :cond_2

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 65
    move-result v0

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->n2(I)I

    .line 69
    move-result v0

    .line 70
    .line 71
    .line 72
    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 73
    move-result-object v0

    .line 74
    goto :goto_1

    .line 75
    :cond_2
    move-object v0, v2

    .line 76
    .line 77
    :cond_3
    :goto_1
    if-eqz v0, :cond_b

    .line 78
    .line 79
    const-string v3, "data"

    .line 80
    const/4 v4, 0x0

    .line 81
    .line 82
    .line 83
    invoke-static {p1, v3, v4}, Lcom/kubi/router/utils/RouteExKt;->M(Landroid/content/Intent;Ljava/lang/String;Z)Z

    .line 84
    move-result v3

    .line 85
    .line 86
    if-eqz v3, :cond_4

    .line 87
    .line 88
    goto/16 :goto_3

    .line 89
    .line 90
    :cond_4
    new-instance v3, Ljava/lang/StringBuilder;

    .line 91
    .line 92
    .line 93
    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 94
    .line 95
    const-string v4, "[onNewIntent] do nothing, pos:"

    .line 96
    .line 97
    .line 98
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 102
    .line 103
    const-string v4, ",  "

    .line 104
    .line 105
    .line 106
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 110
    move-result v4

    .line 111
    .line 112
    .line 113
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 114
    .line 115
    .line 116
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 117
    move-result-object v3

    .line 118
    .line 119
    .line 120
    invoke-static {v1, v3}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0, p1}, Landroid/app/Activity;->setIntent(Landroid/content/Intent;)V

    .line 124
    .line 125
    .line 126
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->X1(Landroid/content/Intent;)V

    .line 127
    .line 128
    sget v1, Lcom/kubi/facade/lib/R$id;->main_trade:I

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 132
    move-result v3

    .line 133
    .line 134
    if-ne v3, v1, :cond_5

    .line 135
    .line 136
    iget v1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->z:I

    .line 137
    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 140
    move-result v3

    .line 141
    .line 142
    if-ne v3, v1, :cond_5

    .line 143
    .line 144
    .line 145
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->r1()Landroid/os/Bundle;

    .line 146
    move-result-object v1

    .line 147
    .line 148
    if-eqz v1, :cond_5

    .line 149
    .line 150
    sget-object v3, Lcom/kubi/tradefacade/api/ITradeFacadeService;->a:Lcom/kubi/tradefacade/api/ITradeFacadeService$Companion;

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Lcom/kubi/tradefacade/api/ITradeFacadeService$Companion;->get()Lcom/kubi/tradefacade/api/ITradeFacadeService;

    .line 154
    move-result-object v3

    .line 155
    .line 156
    iget-object v4, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->I:Lcom/kubi/sdk/BaseFragment;

    .line 157
    .line 158
    .line 159
    invoke-interface {v3, v4, v1}, Lcom/kubi/tradefacade/api/ITradeFacadeService;->d(Lcom/kubi/sdk/BaseFragment;Landroid/os/Bundle;)V

    .line 160
    .line 161
    .line 162
    :cond_5
    invoke-virtual {p1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 163
    move-result-object p1

    .line 164
    .line 165
    if-eqz p1, :cond_9

    .line 166
    .line 167
    sget v1, Lcom/kubi/facade/lib/R$id;->main_kumex:I

    .line 168
    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 171
    move-result v3

    .line 172
    .line 173
    if-ne v3, v1, :cond_6

    .line 174
    .line 175
    .line 176
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x1()Lcom/kubi/sdk/BaseFragment;

    .line 177
    move-result-object v2

    .line 178
    goto :goto_2

    .line 179
    .line 180
    :cond_6
    sget v1, Lcom/kubi/facade/lib/R$id;->main_quotes:I

    .line 181
    .line 182
    .line 183
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 184
    move-result v3

    .line 185
    .line 186
    if-ne v3, v1, :cond_7

    .line 187
    .line 188
    iget-object v2, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->H:Lcom/kubi/sdk/BaseFragment;

    .line 189
    goto :goto_2

    .line 190
    .line 191
    :cond_7
    sget v1, Lcom/kubi/facade/lib/R$id;->main_assets:I

    .line 192
    .line 193
    .line 194
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 195
    move-result v3

    .line 196
    .line 197
    if-ne v3, v1, :cond_8

    .line 198
    .line 199
    iget-object v2, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->K:Lcom/kubi/sdk/BaseFragment;

    .line 200
    .line 201
    :cond_8
    :goto_2
    if-eqz v2, :cond_9

    .line 202
    .line 203
    .line 204
    invoke-virtual {v2, p1}, Lcom/kubi/sdk/BaseFragment;->performArguments(Landroid/os/Bundle;)V

    .line 205
    .line 206
    .line 207
    :cond_9
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x1()Lcom/kubi/sdk/BaseFragment;

    .line 208
    move-result-object p1

    .line 209
    .line 210
    if-nez p1, :cond_a

    .line 211
    .line 212
    sget p1, Lcom/kubi/facade/lib/R$id;->main_kumex:I

    .line 213
    .line 214
    .line 215
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 216
    move-result v1

    .line 217
    .line 218
    if-ne v1, p1, :cond_a

    .line 219
    .line 220
    goto/16 :goto_7

    .line 221
    .line 222
    :cond_a
    iget p1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->z:I

    .line 223
    .line 224
    .line 225
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 226
    move-result v1

    .line 227
    .line 228
    if-eq v1, p1, :cond_e

    .line 229
    .line 230
    .line 231
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w1()Lsf/a;

    .line 232
    move-result-object p1

    .line 233
    .line 234
    if-eqz p1, :cond_e

    .line 235
    .line 236
    iget-object p1, p1, Lsf/a;->g:Lcom/kubi/resources/widget/RadioGroupPlus;

    .line 237
    .line 238
    if-eqz p1, :cond_e

    .line 239
    .line 240
    .line 241
    invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I

    .line 242
    move-result v0

    .line 243
    .line 244
    .line 245
    invoke-virtual {p1, v0}, Lcom/kubi/resources/widget/RadioGroupPlus;->f(I)V

    .line 246
    return-void

    .line 247
    .line 248
    :cond_b
    :goto_3
    const-string v0, "home_restart_use_clear_task"

    .line 249
    .line 250
    :try_start_0
    sget-object v3, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 251
    .line 252
    new-instance v3, Lcom/kubi/kucoin/main/KuCoinMainActivity$d;

    .line 253
    .line 254
    .line 255
    invoke-direct {v3}, Lcom/kubi/kucoin/main/KuCoinMainActivity$d;-><init>()V

    .line 256
    .line 257
    .line 258
    invoke-virtual {v3}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 259
    move-result-object v3

    .line 260
    .line 261
    const-string v4, "object : TypeToken<T>() {}.type"

    .line 262
    .line 263
    .line 264
    invoke-static {v3, v4}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 265
    .line 266
    .line 267
    invoke-static {v0, v3}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 268
    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 269
    goto :goto_4

    .line 270
    :catchall_0
    move-exception v0

    .line 271
    move-object v4, v0

    .line 272
    .line 273
    new-instance v3, Lcom/kubi/config/exception/KCConfigException;

    .line 274
    .line 275
    const/16 v8, 0x8

    .line 276
    const/4 v9, 0x0

    .line 277
    .line 278
    const-string v5, "RemoteConfig"

    .line 279
    const/4 v6, 0x0

    .line 280
    const/4 v7, 0x0

    .line 281
    .line 282
    .line 283
    invoke-direct/range {v3 .. v9}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 284
    const/4 v0, 0x2

    .line 285
    .line 286
    .line 287
    invoke-static {v3, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 288
    .line 289
    :goto_4
    check-cast v2, Ljava/lang/Boolean;

    .line 290
    const/4 v0, 0x1

    .line 291
    .line 292
    .line 293
    invoke-static {v2, v0}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 294
    move-result v0

    .line 295
    .line 296
    if-nez v0, :cond_d

    .line 297
    .line 298
    .line 299
    invoke-static {}, Lcom/kubi/utils/o;->a()Z

    .line 300
    move-result v2

    .line 301
    .line 302
    if-eqz v2, :cond_c

    .line 303
    goto :goto_5

    .line 304
    .line 305
    .line 306
    :cond_c
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 307
    .line 308
    .line 309
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 310
    .line 311
    new-instance p1, Ljava/lang/StringBuilder;

    .line 312
    .line 313
    .line 314
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 315
    .line 316
    const-string v0, "[onNewIntent] start finish, "

    .line 317
    .line 318
    .line 319
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 320
    .line 321
    .line 322
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 323
    move-result v0

    .line 324
    .line 325
    .line 326
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 327
    .line 328
    .line 329
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 330
    move-result-object p1

    .line 331
    .line 332
    .line 333
    invoke-static {v1, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 334
    goto :goto_6

    .line 335
    .line 336
    .line 337
    :cond_d
    :goto_5
    const v2, 0x10008000

    .line 338
    .line 339
    .line 340
    invoke-virtual {p1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;

    .line 341
    .line 342
    .line 343
    invoke-virtual {p0, p1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V

    .line 344
    .line 345
    new-instance p1, Ljava/lang/StringBuilder;

    .line 346
    .line 347
    .line 348
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 349
    .line 350
    const-string v2, "[onNewIntent] useClearTask:"

    .line 351
    .line 352
    .line 353
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 354
    .line 355
    .line 356
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 357
    .line 358
    const-string v0, ", isHarmonyOS, "

    .line 359
    .line 360
    .line 361
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 362
    .line 363
    .line 364
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 365
    move-result v0

    .line 366
    .line 367
    .line 368
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 369
    .line 370
    .line 371
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 372
    move-result-object p1

    .line 373
    .line 374
    .line 375
    invoke-static {v1, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 376
    .line 377
    :goto_6
    const/high16 p1, 0x10a0000

    .line 378
    .line 379
    .line 380
    const v0, 0x10a0001

    .line 381
    .line 382
    .line 383
    invoke-virtual {p0, p1, v0}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 384
    :cond_e
    :goto_7
    return-void
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
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
.end method

.method public onPause()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/BaseUiActivity;->onPause()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/advert/api/IAdvertService;->a:Lcom/kubi/advert/api/IAdvertService$Companion;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/advert/api/IAdvertService$Companion;->get()Lcom/kubi/advert/api/IAdvertService;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->v:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Lcom/kubi/advert/api/IAdvertService;->o(Ljava/lang/String;)V

    .line 15
    .line 16
    sget-object v0, Lmy/m;->a:Lmy/m;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Lmy/m;->j(Lmy/f;)V

    .line 20
    return-void
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
.end method

.method public onRestart()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/app/Activity;->onRestart()V

    .line 4
    .line 5
    sget-object v0, Lgf/n;->a:Lgf/n;

    .line 6
    const/4 v4, 0x3

    .line 7
    const/4 v5, 0x0

    .line 8
    .line 9
    const-wide/16 v1, 0x0

    .line 10
    const/4 v3, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static/range {v0 .. v5}, Lgf/n;->J(Lgf/n;JZILjava/lang/Object;)V

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
.end method

.method public onResume()V
    .locals 15

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/base/ui/BaseUiActivity;->onResume()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/advert/api/IAdvertService;->a:Lcom/kubi/advert/api/IAdvertService$Companion;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/advert/api/IAdvertService$Companion;->get()Lcom/kubi/advert/api/IAdvertService;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    iget-object v1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->v:Ljava/lang/String;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, Lcom/kubi/advert/api/IAdvertService;->m(Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x2()V

    .line 18
    .line 19
    iget-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->C:Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0}, Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;->e()V

    .line 25
    .line 26
    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    const-string v1, "KcCoinMainActivity: onResume , "

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 38
    move-result v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    const-string v1, "LiteTag"

    .line 48
    .line 49
    .line 50
    invoke-static {v1, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 51
    .line 52
    sget-object v0, Lcom/kubi/wallet/api/IWalletService;->a:Lcom/kubi/wallet/api/IWalletService$Companion;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Lcom/kubi/wallet/api/IWalletService$Companion;->get()Lcom/kubi/wallet/api/IWalletService;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-interface {v0, p0}, Lcom/kubi/wallet/api/IWalletService;->f(Lcom/kubi/sdk/BaseActivity;)Z

    .line 60
    move-result v0

    .line 61
    .line 62
    if-eqz v0, :cond_1

    .line 63
    return-void

    .line 64
    .line 65
    :cond_1
    sget-object v0, Lcom/kubi/notice/api/service/INoticeService;->a:Lcom/kubi/notice/api/service/INoticeService$Companion;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/kubi/notice/api/service/INoticeService$Companion;->get()Lcom/kubi/notice/api/service/INoticeService;

    .line 69
    move-result-object v0

    .line 70
    const/4 v1, 0x1

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, p0, v1}, Lcom/kubi/notice/api/service/INoticeService;->e(Landroid/content/Context;Z)V

    .line 74
    const/4 v6, 0x6

    .line 75
    const/4 v7, 0x0

    .line 76
    .line 77
    const-string v2, "com.kubi.home.event.HomeEvent:updateAvatar"

    .line 78
    const/4 v3, 0x0

    .line 79
    .line 80
    const-wide/16 v4, 0x0

    .line 81
    .line 82
    .line 83
    invoke-static/range {v2 .. v7}, Lcom/kubi/event/api/a;->d(Ljava/lang/String;Ljava/lang/Object;JILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 87
    move-result-object v0

    .line 88
    const/4 v1, 0x0

    .line 89
    .line 90
    const-string v2, "toLogin"

    .line 91
    .line 92
    if-eqz v0, :cond_2

    .line 93
    .line 94
    .line 95
    invoke-static {v0, v2}, Lcom/kubi/router/utils/RouteExKt;->K(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Boolean;

    .line 96
    move-result-object v0

    .line 97
    goto :goto_0

    .line 98
    :cond_2
    move-object v0, v1

    .line 99
    .line 100
    .line 101
    :goto_0
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 102
    move-result v0

    .line 103
    .line 104
    if-eqz v0, :cond_3

    .line 105
    .line 106
    sget-object v3, Lf00/a;->a:Lf00/a;

    .line 107
    .line 108
    const/16 v13, 0x1ff

    .line 109
    const/4 v14, 0x0

    .line 110
    const/4 v4, 0x0

    .line 111
    const/4 v5, 0x0

    .line 112
    const/4 v6, 0x0

    .line 113
    const/4 v7, 0x0

    .line 114
    const/4 v8, 0x0

    .line 115
    const/4 v9, 0x0

    .line 116
    const/4 v10, 0x0

    .line 117
    const/4 v11, 0x0

    .line 118
    const/4 v12, 0x0

    .line 119
    .line 120
    .line 121
    invoke-static/range {v3 .. v14}, Lg00/p$a;->b(Lg00/p;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/kubi/router/model/IRedirect;Lcy/b;ILjava/lang/Object;)Z

    .line 122
    .line 123
    .line 124
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 125
    move-result-object v0

    .line 126
    .line 127
    if-eqz v0, :cond_3

    .line 128
    const/4 v3, 0x0

    .line 129
    .line 130
    .line 131
    invoke-virtual {v0, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    .line 132
    .line 133
    .line 134
    :cond_3
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 135
    move-result-object v4

    .line 136
    .line 137
    new-instance v7, Lcom/kubi/kucoin/main/KuCoinMainActivity$onResume$1;

    .line 138
    .line 139
    .line 140
    invoke-direct {v7, v1}, Lcom/kubi/kucoin/main/KuCoinMainActivity$onResume$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 141
    const/4 v8, 0x3

    .line 142
    const/4 v9, 0x0

    .line 143
    const/4 v5, 0x0

    .line 144
    const/4 v6, 0x0

    .line 145
    .line 146
    .line 147
    invoke-static/range {v4 .. v9}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 148
    return-void
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
.end method

.method public onSaveInstanceState(Landroid/os/Bundle;)V
    .locals 2
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "outState"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1}, Lcom/kubi/sdk/BaseActivity;->onSaveInstanceState(Landroid/os/Bundle;)V

    .line 9
    .line 10
    iget v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->z:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->L1(I)I

    .line 14
    move-result v0

    .line 15
    .line 16
    const-string v1, "save_position"

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v1, v0}, Lcom/kubi/router/utils/RouteExKt;->l0(Landroid/os/Bundle;Ljava/lang/String;I)Landroid/os/Bundle;

    .line 20
    return-void
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
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 4
    .line 5
    if-eqz p1, :cond_2

    .line 6
    .line 7
    iget-object p1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->C:Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {p1}, Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;->e()V

    .line 13
    .line 14
    :cond_0
    :try_start_0
    sget-object p1, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, p0}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->m(Landroid/app/Activity;)Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-eqz v0, :cond_1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->i()I

    .line 24
    move-result p1

    .line 25
    goto :goto_0

    .line 26
    :catch_0
    move-exception p1

    .line 27
    goto :goto_1

    .line 28
    :cond_1
    const/4 p1, 0x0

    .line 29
    .line 30
    :goto_0
    sput p1, Lcom/kubi/kucoin/main/KuCoinMainActivity;->R:I
    :try_end_0
    .catch Landroid/content/res/Resources$NotFoundException; {:try_start_0 .. :try_end_0} :catch_0

    .line 31
    return-void

    .line 32
    .line 33
    .line 34
    :goto_1
    invoke-static {p1}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 35
    :cond_2
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
.end method

.method public final p1()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/kucoin/main/r;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/kubi/kucoin/main/r;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Lcom/kubi/utils/x0;->e(Lkotlin/jvm/functions/Function0;)V

    .line 9
    return-void
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
.end method

.method public final p2()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Landroid/content/IntentFilter;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V

    .line 6
    .line 7
    const-string v1, "android.net.conn.CONNECTIVITY_CHANGE"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V

    .line 11
    .line 12
    new-instance v1, Lcom/kubi/kucoin/utils/NetworkChangeReceiver;

    .line 13
    .line 14
    .line 15
    invoke-direct {v1}, Lcom/kubi/kucoin/utils/NetworkChangeReceiver;-><init>()V

    .line 16
    .line 17
    iput-object v1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->A:Lcom/kubi/kucoin/utils/NetworkChangeReceiver;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;

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
.end method

.method public final q2(Landroid/content/Intent;)Ljava/lang/Integer;
    .locals 1

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    const-string v0, "position"

    .line 5
    .line 6
    .line 7
    invoke-static {p1, v0}, Lcom/kubi/router/utils/RouteExKt;->R(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-nez v0, :cond_0

    .line 11
    goto :goto_0

    .line 12
    :cond_0
    return-object v0

    .line 13
    .line 14
    :cond_1
    :goto_0
    if-eqz p1, :cond_2

    .line 15
    .line 16
    const-string v0, "page"

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v0}, Lcom/kubi/router/utils/RouteExKt;->R(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/Integer;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    if-eqz p1, :cond_2

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 26
    move-result p1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->n2(I)I

    .line 30
    move-result p1

    .line 31
    .line 32
    .line 33
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 34
    move-result-object p1

    .line 35
    return-object p1

    .line 36
    :cond_2
    const/4 p1, 0x0

    .line 37
    return-object p1
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final r1()Landroid/os/Bundle;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->E:Landroid/os/Bundle;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    iput-object v1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->E:Landroid/os/Bundle;

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
.end method

.method public recreate()V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    :try_start_0
    sget-object v1, Lcom/kubi/kucoin/utils/r;->a:Lcom/kubi/kucoin/utils/r;

    .line 4
    .line 5
    .line 6
    invoke-virtual {v1}, Lcom/kubi/kucoin/utils/r;->m()Z

    .line 7
    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    if-eqz v2, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0}, Lcom/kubi/kucoin/utils/r;->t(Z)V

    .line 13
    return-void

    .line 14
    .line 15
    .line 16
    :cond_0
    :try_start_1
    invoke-super {p0}, Landroid/app/Activity;->recreate()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v0}, Lcom/kubi/kucoin/utils/r;->t(Z)V

    .line 20
    return-void

    .line 21
    :catchall_0
    move-exception v1

    .line 22
    .line 23
    sget-object v2, Lcom/kubi/kucoin/utils/r;->a:Lcom/kubi/kucoin/utils/r;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2, v0}, Lcom/kubi/kucoin/utils/r;->t(Z)V

    .line 27
    throw v1
    .line 28
    .line 29
    .line 30
.end method

.method public final s1()Landroidx/fragment/app/Fragment;
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->z:I

    .line 3
    .line 4
    sget v1, Lcom/kubi/facade/lib/R$id;->main_home:I

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->v1()Lcom/kubi/sdk/BaseFragment;

    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    sget v1, Lcom/kubi/facade/lib/R$id;->main_quotes:I

    .line 14
    .line 15
    if-ne v0, v1, :cond_1

    .line 16
    .line 17
    iget-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->H:Lcom/kubi/sdk/BaseFragment;

    .line 18
    return-object v0

    .line 19
    .line 20
    :cond_1
    sget v1, Lcom/kubi/facade/lib/R$id;->main_trade:I

    .line 21
    .line 22
    if-ne v0, v1, :cond_2

    .line 23
    .line 24
    iget-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->I:Lcom/kubi/sdk/BaseFragment;

    .line 25
    return-object v0

    .line 26
    .line 27
    :cond_2
    sget v1, Lcom/kubi/facade/lib/R$id;->main_kumex:I

    .line 28
    .line 29
    if-ne v0, v1, :cond_3

    .line 30
    .line 31
    .line 32
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x1()Lcom/kubi/sdk/BaseFragment;

    .line 33
    move-result-object v0

    .line 34
    return-object v0

    .line 35
    .line 36
    :cond_3
    sget v1, Lcom/kubi/facade/lib/R$id;->main_assets:I

    .line 37
    .line 38
    if-ne v0, v1, :cond_4

    .line 39
    .line 40
    iget-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->K:Lcom/kubi/sdk/BaseFragment;

    .line 41
    return-object v0

    .line 42
    :cond_4
    const/4 v0, 0x0

    .line 43
    return-object v0
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
.end method

.method public final t1(I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    sget v1, Lcom/kubi/facade/lib/R$id;->main_kumex:I

    .line 13
    .line 14
    if-ne p1, v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x1()Lcom/kubi/sdk/BaseFragment;

    .line 18
    move-result-object p1

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    sget v1, Lcom/kubi/facade/lib/R$id;->main_quotes:I

    .line 22
    .line 23
    if-ne p1, v1, :cond_1

    .line 24
    .line 25
    iget-object p1, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->H:Lcom/kubi/sdk/BaseFragment;

    .line 26
    goto :goto_0

    .line 27
    :cond_1
    const/4 p1, 0x0

    .line 28
    .line 29
    :goto_0
    if-eqz p1, :cond_2

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1, v0}, Lcom/kubi/sdk/BaseFragment;->performArguments(Landroid/os/Bundle;)V

    .line 33
    :cond_2
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
.end method

.method public final u1(Landroidx/fragment/app/Fragment;)Lmy/q;
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p1, :cond_3

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 7
    move-result v1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    instance-of v1, p1, Lmy/q;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast p1, Lmy/q;

    .line 17
    return-object p1

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-virtual {p1}, Landroidx/fragment/app/Fragment;->getChildFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 21
    move-result-object p1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p1}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    .line 25
    move-result-object p1

    .line 26
    .line 27
    .line 28
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    .line 32
    :cond_2
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    move-result v1

    .line 34
    .line 35
    if-eqz v1, :cond_3

    .line 36
    .line 37
    .line 38
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    check-cast v1, Landroidx/fragment/app/Fragment;

    .line 42
    .line 43
    .line 44
    invoke-virtual {p0, v1}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->u1(Landroidx/fragment/app/Fragment;)Lmy/q;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    if-eqz v1, :cond_2

    .line 48
    return-object v1

    .line 49
    :cond_3
    :goto_0
    return-object v0
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
.end method

.method public final u2(Landroidx/fragment/app/FragmentManager;Lcom/kubi/user/api/UserRestrictedStateBean;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lcom/kubi/user/api/IUserService;->a:Lcom/kubi/user/api/IUserService$Companion;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/kubi/user/api/IUserService$Companion;->get()Lcom/kubi/user/api/IUserService;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    const/16 v6, 0x8

    .line 22
    const/4 v7, 0x0

    .line 23
    const/4 v5, 0x0

    .line 24
    move-object v3, p0

    .line 25
    move-object v4, p1

    .line 26
    move-object v2, p2

    .line 27
    .line 28
    .line 29
    invoke-static/range {v1 .. v7}, Lcom/kubi/user/api/IUserService;->l(Lcom/kubi/user/api/IUserService;Lcom/kubi/user/api/UserRestrictedStateBean;Landroid/content/Context;Landroidx/fragment/app/FragmentManager;Lkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 30
    :cond_1
    :goto_0
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
.end method

.method public final v1()Lcom/kubi/sdk/BaseFragment;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->G:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/sdk/BaseFragment;

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
.end method

.method public final v2(I)V
    .locals 7

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->B:Z

    .line 4
    .line 5
    sget-object v1, Lhl/a;->a:Lhl/a;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v1}, Lhl/a;->e()V

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentManager;->beginTransaction()Landroidx/fragment/app/FragmentTransaction;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    const-string v2, "beginTransaction(...)"

    .line 19
    .line 20
    .line 21
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Landroidx/fragment/app/FragmentActivity;->getSupportFragmentManager()Landroidx/fragment/app/FragmentManager;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Landroidx/fragment/app/FragmentManager;->getFragments()Ljava/util/List;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 33
    move-result-object v2

    .line 34
    .line 35
    .line 36
    :cond_0
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 37
    move-result v3

    .line 38
    .line 39
    if-eqz v3, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 43
    move-result-object v3

    .line 44
    .line 45
    check-cast v3, Landroidx/fragment/app/Fragment;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 49
    move-result v4

    .line 50
    .line 51
    if-eqz v4, :cond_0

    .line 52
    .line 53
    instance-of v4, v3, Landroidx/fragment/app/DialogFragment;

    .line 54
    .line 55
    if-nez v4, :cond_0

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1, v3}, Landroidx/fragment/app/FragmentTransaction;->hide(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 59
    const/4 v4, 0x0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v3, v4}, Landroidx/fragment/app/Fragment;->setUserVisibleHint(Z)V

    .line 63
    goto :goto_0

    .line 64
    .line 65
    :cond_1
    sget v2, Lcom/kubi/facade/lib/R$id;->main_home:I

    .line 66
    .line 67
    if-ne p1, v2, :cond_4

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->v1()Lcom/kubi/sdk/BaseFragment;

    .line 71
    move-result-object v3

    .line 72
    .line 73
    .line 74
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 75
    move-result v3

    .line 76
    .line 77
    if-nez v3, :cond_2

    .line 78
    .line 79
    sget v3, Lcom/kubi/facade/lib/R$id;->fl_container:I

    .line 80
    .line 81
    .line 82
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->v1()Lcom/kubi/sdk/BaseFragment;

    .line 83
    move-result-object v4

    .line 84
    .line 85
    const-string v5, "homeFragment"

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v3, v4, v5}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 89
    goto :goto_1

    .line 90
    .line 91
    .line 92
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->v1()Lcom/kubi/sdk/BaseFragment;

    .line 93
    move-result-object v3

    .line 94
    .line 95
    .line 96
    invoke-virtual {v1, v3}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 97
    .line 98
    :goto_1
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->C:Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;

    .line 99
    .line 100
    if-eqz v3, :cond_3

    .line 101
    .line 102
    .line 103
    invoke-virtual {v3}, Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;->e()V

    .line 104
    .line 105
    .line 106
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->v1()Lcom/kubi/sdk/BaseFragment;

    .line 107
    move-result-object v3

    .line 108
    .line 109
    .line 110
    invoke-virtual {v3, v0}, Lcom/kubi/sdk/BaseFragment;->setUserVisibleHint(Z)V

    .line 111
    .line 112
    goto/16 :goto_6

    .line 113
    .line 114
    :cond_4
    sget v3, Lcom/kubi/facade/lib/R$id;->main_quotes:I

    .line 115
    .line 116
    if-ne p1, v3, :cond_7

    .line 117
    .line 118
    const-string v3, "open_spot_quotes"

    .line 119
    .line 120
    const-string v4, "\u73b0\u8d27\u884c\u60c5"

    .line 121
    .line 122
    .line 123
    invoke-static {v3, v4}, Lcom/kubi/monitor/helper/TracePageHelper;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 124
    .line 125
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->H:Lcom/kubi/sdk/BaseFragment;

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 129
    move-result v3

    .line 130
    .line 131
    if-nez v3, :cond_5

    .line 132
    .line 133
    sget v3, Lcom/kubi/facade/lib/R$id;->fl_container:I

    .line 134
    .line 135
    iget-object v4, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->H:Lcom/kubi/sdk/BaseFragment;

    .line 136
    .line 137
    const-string v5, "marketFragment"

    .line 138
    .line 139
    .line 140
    invoke-virtual {v1, v3, v4, v5}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 141
    goto :goto_2

    .line 142
    .line 143
    :cond_5
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->H:Lcom/kubi/sdk/BaseFragment;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v1, v3}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 147
    .line 148
    :goto_2
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->C:Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;

    .line 149
    .line 150
    if-eqz v3, :cond_6

    .line 151
    .line 152
    .line 153
    invoke-virtual {v3}, Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;->e()V

    .line 154
    .line 155
    :cond_6
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->H:Lcom/kubi/sdk/BaseFragment;

    .line 156
    .line 157
    .line 158
    invoke-virtual {v3, v0}, Lcom/kubi/sdk/BaseFragment;->setUserVisibleHint(Z)V

    .line 159
    .line 160
    goto/16 :goto_6

    .line 161
    .line 162
    :cond_7
    sget v3, Lcom/kubi/facade/lib/R$id;->main_assets:I

    .line 163
    .line 164
    if-ne p1, v3, :cond_a

    .line 165
    .line 166
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->K:Lcom/kubi/sdk/BaseFragment;

    .line 167
    .line 168
    .line 169
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 170
    move-result v3

    .line 171
    .line 172
    if-nez v3, :cond_8

    .line 173
    .line 174
    sget v3, Lcom/kubi/facade/lib/R$id;->fl_container:I

    .line 175
    .line 176
    iget-object v4, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->K:Lcom/kubi/sdk/BaseFragment;

    .line 177
    .line 178
    const-string v5, "assetFragment"

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v3, v4, v5}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 182
    goto :goto_3

    .line 183
    .line 184
    :cond_8
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->K:Lcom/kubi/sdk/BaseFragment;

    .line 185
    .line 186
    .line 187
    invoke-virtual {v1, v3}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 188
    .line 189
    :goto_3
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->C:Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;

    .line 190
    .line 191
    if-eqz v3, :cond_9

    .line 192
    .line 193
    .line 194
    invoke-virtual {v3}, Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;->e()V

    .line 195
    .line 196
    :cond_9
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->K:Lcom/kubi/sdk/BaseFragment;

    .line 197
    .line 198
    .line 199
    invoke-virtual {v3, v0}, Lcom/kubi/sdk/BaseFragment;->setUserVisibleHint(Z)V

    .line 200
    .line 201
    goto/16 :goto_6

    .line 202
    .line 203
    :cond_a
    sget v3, Lcom/kubi/facade/lib/R$id;->main_trade:I

    .line 204
    .line 205
    if-ne p1, v3, :cond_d

    .line 206
    .line 207
    const-string v3, "open_spot"

    .line 208
    .line 209
    const-string v4, "\u73b0\u8d27\u4ea4\u6613"

    .line 210
    .line 211
    .line 212
    invoke-static {v3, v4}, Lcom/kubi/monitor/helper/TracePageHelper;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 213
    .line 214
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->I:Lcom/kubi/sdk/BaseFragment;

    .line 215
    .line 216
    .line 217
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 218
    move-result v3

    .line 219
    .line 220
    if-nez v3, :cond_b

    .line 221
    .line 222
    sget v3, Lcom/kubi/facade/lib/R$id;->fl_container:I

    .line 223
    .line 224
    iget-object v4, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->I:Lcom/kubi/sdk/BaseFragment;

    .line 225
    .line 226
    const-string v5, "tradeFragment"

    .line 227
    .line 228
    .line 229
    invoke-virtual {v1, v3, v4, v5}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 230
    goto :goto_4

    .line 231
    .line 232
    :cond_b
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->I:Lcom/kubi/sdk/BaseFragment;

    .line 233
    .line 234
    .line 235
    invoke-virtual {v1, v3}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 236
    .line 237
    :goto_4
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->C:Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;

    .line 238
    .line 239
    if-eqz v3, :cond_c

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3}, Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;->e()V

    .line 243
    .line 244
    :cond_c
    iget-object v3, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->I:Lcom/kubi/sdk/BaseFragment;

    .line 245
    .line 246
    .line 247
    invoke-virtual {v3, v0}, Lcom/kubi/sdk/BaseFragment;->setUserVisibleHint(Z)V

    .line 248
    .line 249
    sget-object v3, Lcom/kubi/tradefacade/api/ITradeFacadeService;->a:Lcom/kubi/tradefacade/api/ITradeFacadeService$Companion;

    .line 250
    .line 251
    .line 252
    invoke-virtual {v3}, Lcom/kubi/tradefacade/api/ITradeFacadeService$Companion;->get()Lcom/kubi/tradefacade/api/ITradeFacadeService;

    .line 253
    move-result-object v3

    .line 254
    .line 255
    iget-object v4, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->I:Lcom/kubi/sdk/BaseFragment;

    .line 256
    .line 257
    .line 258
    invoke-interface {v3, v4, v0}, Lcom/kubi/tradefacade/api/ITradeFacadeService;->e(Lcom/kubi/sdk/BaseFragment;Z)V

    .line 259
    goto :goto_6

    .line 260
    .line 261
    :cond_d
    sget v3, Lcom/kubi/facade/lib/R$id;->main_kumex:I

    .line 262
    .line 263
    if-ne p1, v3, :cond_10

    .line 264
    .line 265
    const-string v3, "open_contract"

    .line 266
    .line 267
    const-string v4, "\u5408\u7ea6"

    .line 268
    .line 269
    .line 270
    invoke-static {v3, v4}, Lcom/kubi/monitor/helper/TracePageHelper;->g(Ljava/lang/String;Ljava/lang/String;)V

    .line 271
    .line 272
    .line 273
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->x1()Lcom/kubi/sdk/BaseFragment;

    .line 274
    move-result-object v3

    .line 275
    .line 276
    if-eqz v3, :cond_10

    .line 277
    .line 278
    .line 279
    invoke-virtual {v3}, Landroidx/fragment/app/Fragment;->isAdded()Z

    .line 280
    move-result v4

    .line 281
    .line 282
    if-nez v4, :cond_e

    .line 283
    .line 284
    sget-object v4, Lcom/kubi/kucoin/interceptor/RequestLimitInterceptor;->c:Lcom/kubi/kucoin/interceptor/RequestLimitInterceptor$Companion;

    .line 285
    .line 286
    const-wide/16 v5, 0x1388

    .line 287
    .line 288
    .line 289
    invoke-virtual {v4, v5, v6}, Lcom/kubi/kucoin/interceptor/RequestLimitInterceptor$Companion;->setTempExpiredTime(J)V

    .line 290
    .line 291
    sget v4, Lcom/kubi/facade/lib/R$id;->fl_container:I

    .line 292
    .line 293
    const-string v5, "kumexFragment"

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v4, v3, v5}, Landroidx/fragment/app/FragmentTransaction;->add(ILandroidx/fragment/app/Fragment;Ljava/lang/String;)Landroidx/fragment/app/FragmentTransaction;

    .line 297
    goto :goto_5

    .line 298
    .line 299
    :cond_e
    sget-object v4, Lcom/kubi/kucoin/interceptor/RequestLimitInterceptor;->c:Lcom/kubi/kucoin/interceptor/RequestLimitInterceptor$Companion;

    .line 300
    .line 301
    const-wide/16 v5, 0xbb8

    .line 302
    .line 303
    .line 304
    invoke-virtual {v4, v5, v6}, Lcom/kubi/kucoin/interceptor/RequestLimitInterceptor$Companion;->setTempExpiredTime(J)V

    .line 305
    .line 306
    .line 307
    invoke-virtual {v1, v3}, Landroidx/fragment/app/FragmentTransaction;->show(Landroidx/fragment/app/Fragment;)Landroidx/fragment/app/FragmentTransaction;

    .line 308
    .line 309
    :goto_5
    iget-object v4, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->C:Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;

    .line 310
    .line 311
    if-eqz v4, :cond_f

    .line 312
    .line 313
    .line 314
    invoke-virtual {v4}, Lcom/kubi/kucoin/main/helper/MainStatusBarFixUtil;->e()V

    .line 315
    .line 316
    .line 317
    :cond_f
    invoke-virtual {v3, v0}, Lcom/kubi/sdk/BaseFragment;->setUserVisibleHint(Z)V

    .line 318
    .line 319
    .line 320
    :cond_10
    :goto_6
    invoke-virtual {v1}, Landroidx/fragment/app/FragmentTransaction;->commitNowAllowingStateLoss()V

    .line 321
    .line 322
    if-eq p1, v2, :cond_11

    .line 323
    .line 324
    sget-object p1, Lcom/kubi/home/api/IHomeService;->a:Lcom/kubi/home/api/IHomeService$Companion;

    .line 325
    .line 326
    .line 327
    invoke-virtual {p1}, Lcom/kubi/home/api/IHomeService$Companion;->get()Lcom/kubi/home/api/IHomeService;

    .line 328
    move-result-object p1

    .line 329
    .line 330
    .line 331
    invoke-interface {p1}, Lcom/kubi/home/api/IHomeService;->g()V

    .line 332
    :cond_11
    return-void
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
    .line 1351
    .line 1352
    .line 1353
    .line 1354
    .line 1355
    .line 1356
    .line 1357
    .line 1358
    .line 1359
    .line 1360
    .line 1361
    .line 1362
    .line 1363
.end method

.method public final w1()Lsf/a;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->w:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/kucoin/main/KuCoinMainActivity;->Q:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lsf/a;

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
.end method

.method public final w2(Ljava/lang/String;)V
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
.end method

.method public final x1()Lcom/kubi/sdk/BaseFragment;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->J:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Lcom/kubi/sdk/BaseFragment;

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
.end method

.method public final x2()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->s1()Landroidx/fragment/app/Fragment;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->u1(Landroidx/fragment/app/Fragment;)Lmy/q;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    sget-object v1, Lmy/m;->a:Lmy/m;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-interface {v0}, Lmy/q;->getRnContainerId()Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v2, 0x0

    .line 19
    .line 20
    :goto_0
    if-eqz v0, :cond_1

    .line 21
    const/4 v0, 0x1

    .line 22
    goto :goto_1

    .line 23
    :cond_1
    const/4 v0, 0x0

    .line 24
    .line 25
    .line 26
    :goto_1
    invoke-virtual {v1, p0, v2, v0}, Lmy/m;->o(Lmy/f;Ljava/lang/String;Z)V

    .line 27
    return-void
    .line 28
    .line 29
    .line 30
.end method

.method public final y1()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/kucoin/main/KuCoinMainActivity;->N:Lkotlin/Lazy;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Lkotlin/Lazy;->getValue()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, Ljava/lang/Boolean;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

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
.end method

.method public final y2(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "norm_version"

    .line 3
    .line 4
    const-string v1, "1"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    filled-new-array {v0}, [Lkotlin/Pair;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    .line 15
    invoke-static {p1, p2, v1, v0}, Lqq/m;->b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[Lkotlin/Pair;)V

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
.end method

.method public final z2()Z
    .locals 1

    .line 1
    .line 2
    sget v0, Lcom/kubi/facade/lib/R$id;->main_trade:I

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->U1(I)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    .line 10
    sget v0, Lcom/kubi/facade/lib/R$id;->main_kumex:I

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/kubi/kucoin/main/KuCoinMainActivity;->U1(I)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_0

    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v0, 0x0

    .line 19
    return v0

    .line 20
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 21
    return v0
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
.end method
