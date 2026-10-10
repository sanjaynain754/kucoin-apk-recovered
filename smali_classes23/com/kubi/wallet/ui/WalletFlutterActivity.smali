.class public final Lcom/kubi/wallet/ui/WalletFlutterActivity;
.super Lcom/kubi/sdk/BaseActivity;
.source "WalletFlutterActivity.kt"

# interfaces
.implements Lb80/b;
.implements Lcom/kubi/sdk/util/w;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/wallet/ui/WalletFlutterActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0008\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\u0008\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0018\u0000 B2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001BB\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0012\u0010\u0014\u001a\u00020\u00152\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014J\u0012\u0010\u0018\u001a\u00020\u00152\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0002J\u0008\u0010\u001b\u001a\u00020\u0015H\u0002J\u0008\u0010\u001c\u001a\u00020\u0015H\u0002J\u000e\u0010\u001d\u001a\u00020\u0015H\u0082@\u00a2\u0006\u0002\u0010\u001eJ\u0008\u0010\u001f\u001a\u00020\u0015H\u0002J\u0008\u0010 \u001a\u00020\u0015H\u0002J\u0008\u0010!\u001a\u00020\u0015H\u0002J\u0008\u0010\"\u001a\u00020\u0015H\u0002J\u0008\u0010#\u001a\u00020\u0015H\u0014J\u0008\u0010$\u001a\u00020\u0015H\u0014J\u0008\u0010%\u001a\u00020\u0015H\u0014J\u0010\u0010&\u001a\u00020\u00152\u0006\u0010\'\u001a\u00020(H\u0016J\u0008\u0010)\u001a\u00020\u0015H\u0014J\u0008\u0010*\u001a\u00020\u0015H\u0014J\u0012\u0010+\u001a\u00020\u00152\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0014J\"\u0010,\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020.2\u0008\u00100\u001a\u0004\u0018\u00010\u001aH\u0014J\u0008\u00101\u001a\u00020\u0015H\u0017J-\u00102\u001a\u00020\u00152\u0006\u0010-\u001a\u00020.2\u000e\u00103\u001a\n\u0012\u0006\u0008\u0001\u0012\u000205042\u0006\u00106\u001a\u000207H\u0016\u00a2\u0006\u0002\u00108J\u0010\u00109\u001a\u00020\u00152\u0006\u0010:\u001a\u00020.H\u0016J\u0008\u0010;\u001a\u00020\u0015H\u0014J\u0008\u0010<\u001a\u00020\u0015H\u0016J\u0008\u0010=\u001a\u00020\u0015H\u0014J\u0008\u0010>\u001a\u00020\u0015H\u0016J\u0014\u0010?\u001a\u00020\u0015*\u00020@2\u0006\u0010A\u001a\u00020(H\u0002R\u001d\u0010\u0006\u001a\u0004\u0018\u00010\u00078BX\u0082\u0084\u0002\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u000b\u001a\u0004\u0008\u0008\u0010\tR\u000e\u0010\u000c\u001a\u00020\rX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082.\u00a2\u0006\u0002\n\u0000\u00a8\u0006C"
    }
    d2 = {
        "Lcom/kubi/wallet/ui/WalletFlutterActivity;",
        "Lcom/kubi/sdk/BaseActivity;",
        "Lcom/kubi/wallet/api/IWalletFlutterEntryActivity;",
        "Lcom/kubi/sdk/util/IDisableEdgeToEdge;",
        "<init>",
        "()V",
        "binding",
        "Lcom/kubi/wallet/databinding/WalletFlutterLayoutBinding;",
        "getBinding",
        "()Lcom/kubi/wallet/databinding/WalletFlutterLayoutBinding;",
        "binding$delegate",
        "Lcom/kubi/sdk/viewbindingdelegate/base/ViewBindingProperty;",
        "delegate",
        "Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;",
        "isLoaded",
        "Ljava/util/concurrent/atomic/AtomicBoolean;",
        "upgradeHelper",
        "Lcom/kubi/wallet/utils/CheckUpgradeHelper;",
        "maskView",
        "Lcom/kubi/sdk/mode/widget/HomeMaskView;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "handleJumpUri",
        "intent",
        "Landroid/content/Intent;",
        "setSystemUI",
        "bindEvent",
        "onFlutterDisplayed",
        "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;",
        "onLoading",
        "loadingWithoutAnimation",
        "loadingWithAnimation",
        "onLoaded",
        "onResume",
        "onPostResume",
        "onStart",
        "onWindowFocusChanged",
        "hasFocus",
        "",
        "onStop",
        "onPause",
        "onNewIntent",
        "onActivityResult",
        "requestCode",
        "",
        "resultCode",
        "data",
        "onBackPressed",
        "onRequestPermissionsResult",
        "permissions",
        "",
        "",
        "grantResults",
        "",
        "(I[Ljava/lang/String;[I)V",
        "onTrimMemory",
        "level",
        "onUserLeaveHint",
        "onPreFinish",
        "onDestroy",
        "finish",
        "setStatusBarDarkIcons",
        "Landroid/app/Activity;",
        "darkIcons",
        "Companion",
        "WalletLib_googleRelease"
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
        "SMAP\nWalletFlutterActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 WalletFlutterActivity.kt\ncom/kubi/wallet/ui/WalletFlutterActivity\n+ 2 ActivityViewBindings.kt\ncom/kubi/sdk/viewbindingdelegate/ActivityViewBindings\n+ 3 WalletIssue.kt\ncom/kubi/wallet/exception/WalletIssueKt\n+ 4 FlowEventBusApi.kt\ncom/kubi/event/api/FlowEventBusApiKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,395:1\n45#2,19:396\n55#3,2:415\n76#4,7:417\n1#5:424\n*S KotlinDebug\n*F\n+ 1 WalletFlutterActivity.kt\ncom/kubi/wallet/ui/WalletFlutterActivity\n*L\n128#1:396,19\n143#1:415,2\n188#1:417,7\n*E\n"
    }
.end annotation


# static fields
.field public static final n:Lcom/kubi/wallet/ui/WalletFlutterActivity$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final synthetic o:[Lkotlin/reflect/KProperty;
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
.field public final i:Lcom/kubi/sdk/viewbindingdelegate/base/a;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final k:Ljava/util/concurrent/atomic/AtomicBoolean;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public final l:Lcom/kubi/wallet/utils/CheckUpgradeHelper;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public m:Lcom/kubi/sdk/mode/widget/HomeMaskView;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Lkotlin/jvm/internal/PropertyReference1Impl;

    .line 3
    .line 4
    const-string v1, "getBinding()Lcom/kubi/wallet/databinding/WalletFlutterLayoutBinding;"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    const-class v3, Lcom/kubi/wallet/ui/WalletFlutterActivity;

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
    sput-object v1, Lcom/kubi/wallet/ui/WalletFlutterActivity;->o:[Lkotlin/reflect/KProperty;

    .line 24
    .line 25
    new-instance v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$Companion;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Lcom/kubi/wallet/ui/WalletFlutterActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 30
    .line 31
    sput-object v0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->n:Lcom/kubi/wallet/ui/WalletFlutterActivity$Companion;

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
.end method

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/BaseActivity;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$special$$inlined$viewBindingActivity$default$1;->INSTANCE:Lcom/kubi/wallet/ui/WalletFlutterActivity$special$$inlined$viewBindingActivity$default$1;

    .line 6
    .line 7
    new-instance v1, Lcom/kubi/wallet/ui/WalletFlutterActivity$special$$inlined$viewBindingActivity$default$2;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1}, Lcom/kubi/wallet/ui/WalletFlutterActivity$special$$inlined$viewBindingActivity$default$2;-><init>()V

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0, v1}, Lw00/b;->b(Landroidx/activity/ComponentActivity;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->i:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 17
    .line 18
    new-instance v0, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;-><init>()V

    .line 22
    .line 23
    iput-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 24
    .line 25
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 26
    const/4 v1, 0x0

    .line 27
    .line 28
    .line 29
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 30
    .line 31
    iput-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 32
    .line 33
    new-instance v0, Lcom/kubi/wallet/utils/CheckUpgradeHelper;

    .line 34
    .line 35
    .line 36
    invoke-direct {v0, p0}, Lcom/kubi/wallet/utils/CheckUpgradeHelper;-><init>(Landroidx/fragment/app/FragmentActivity;)V

    .line 37
    .line 38
    iput-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->l:Lcom/kubi/wallet/utils/CheckUpgradeHelper;

    .line 39
    return-void
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
.end method

.method public static final synthetic T(Lcom/kubi/wallet/ui/WalletFlutterActivity;)Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

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
.end method

.method public static final synthetic U(Lcom/kubi/wallet/ui/WalletFlutterActivity;)Lcom/kubi/sdk/mode/widget/HomeMaskView;
    .locals 0

    .line 1
    .line 2
    iget-object p0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->m:Lcom/kubi/sdk/mode/widget/HomeMaskView;

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
.end method

.method public static final synthetic V(Lcom/kubi/wallet/ui/WalletFlutterActivity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->c0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

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

.method public static final synthetic W(Lcom/kubi/wallet/ui/WalletFlutterActivity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->d0()V

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
.end method

.method private final X()V
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
    const-string v1, "com.kubi.event.FlutterEvent:flutterCommonEvent"

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
    new-instance v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$bindEvent$$inlined$bindFlowEvent$default$1;

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    .line 20
    invoke-direct {v0, v1, v2, p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity$bindEvent$$inlined$bindFlowEvent$default$1;-><init>(Ljava/lang/String;Lkotlin/coroutines/Continuation;Lcom/kubi/wallet/ui/WalletFlutterActivity;)V

    .line 21
    const/4 v1, 0x0

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
.end method

.method private final Z(Landroid/content/Intent;)V
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
.end method

.method private final a0()V
    .locals 21

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->Y()Lc80/a;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    if-nez v1, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-virtual {v0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    const-string v2, "getIntent(...)"

    .line 16
    .line 17
    .line 18
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 19
    .line 20
    const-string v2, "from"

    .line 21
    .line 22
    .line 23
    invoke-static {v1, v2}, Lcom/kubi/router/utils/RouteExKt;->w(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    if-eqz v1, :cond_2

    .line 27
    .line 28
    sget-object v2, Lcom/kubi/sdk/mode/AppMode;->Companion:Lcom/kubi/sdk/mode/AppMode$Companion;

    .line 29
    .line 30
    sget-object v3, Lcom/kubi/sdk/mode/AppMode;->Pro:Lcom/kubi/sdk/mode/AppMode;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2, v1, v3}, Lcom/kubi/sdk/mode/AppMode$Companion;->fromStringDefault(Ljava/lang/String;Lcom/kubi/sdk/mode/AppMode;)Lcom/kubi/sdk/mode/AppMode;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    if-nez v1, :cond_1

    .line 37
    goto :goto_1

    .line 38
    :cond_1
    :goto_0
    move-object v3, v1

    .line 39
    goto :goto_2

    .line 40
    .line 41
    :cond_2
    :goto_1
    sget-object v1, Lcom/kubi/sdk/mode/AppMode;->Pro:Lcom/kubi/sdk/mode/AppMode;

    .line 42
    goto :goto_0

    .line 43
    .line 44
    :goto_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 48
    .line 49
    const-string v2, "[loadingWithAnimation] fromAppMode:"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    const-string v2, "WalletFlutterActivity"

    .line 62
    .line 63
    .line 64
    invoke-static {v2, v1}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 65
    .line 66
    iget-object v1, v0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->m:Lcom/kubi/sdk/mode/widget/HomeMaskView;

    .line 67
    const/4 v2, 0x0

    .line 68
    .line 69
    if-nez v1, :cond_3

    .line 70
    .line 71
    .line 72
    const-string/jumbo v1, "maskView"

    .line 73
    .line 74
    .line 75
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 76
    move-object v1, v2

    .line 77
    .line 78
    .line 79
    :cond_3
    invoke-virtual {v1}, Lcom/kubi/sdk/mode/widget/HomeMaskView;->getSharedView()Lcom/kubi/sdk/mode/widget/SwitchLayout;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    if-eqz v1, :cond_4

    .line 83
    .line 84
    sget-object v4, Lcom/kubi/sdk/mode/AppMode;->Web3:Lcom/kubi/sdk/mode/AppMode;

    .line 85
    move-object v5, v2

    .line 86
    .line 87
    new-instance v2, Lcom/kubi/sdk/mode/SwitchConfig;

    .line 88
    .line 89
    const/16 v18, 0x294

    .line 90
    .line 91
    const/16 v19, 0x0

    .line 92
    move-object v6, v5

    .line 93
    const/4 v5, 0x0

    .line 94
    move-object v7, v6

    .line 95
    const/4 v6, 0x0

    .line 96
    move-object v8, v7

    .line 97
    const/4 v7, 0x0

    .line 98
    move-object v10, v8

    .line 99
    .line 100
    const-wide/16 v8, 0x64

    .line 101
    move-object v12, v10

    .line 102
    .line 103
    const-wide/16 v10, 0x190

    .line 104
    move-object v14, v12

    .line 105
    .line 106
    const-wide/16 v12, 0x0

    .line 107
    .line 108
    move-object/from16 v16, v14

    .line 109
    .line 110
    const-wide/16 v14, 0x258

    .line 111
    .line 112
    move-object/from16 v17, v16

    .line 113
    .line 114
    const/16 v16, 0x0

    .line 115
    .line 116
    move-object/from16 v20, v17

    .line 117
    .line 118
    const/16 v17, 0x1

    .line 119
    .line 120
    .line 121
    invoke-direct/range {v2 .. v19}, Lcom/kubi/sdk/mode/SwitchConfig;-><init>(Lcom/kubi/sdk/mode/AppMode;Lcom/kubi/sdk/mode/AppMode;ZZZJJJJLandroid/view/View;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, v2}, Lcom/kubi/sdk/mode/widget/SwitchLayout;->y(Lcom/kubi/sdk/mode/SwitchConfig;)V

    .line 125
    .line 126
    .line 127
    :cond_4
    invoke-static {v0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 128
    move-result-object v3

    .line 129
    .line 130
    new-instance v6, Lcom/kubi/wallet/ui/WalletFlutterActivity$loadingWithAnimation$1;

    .line 131
    const/4 v5, 0x0

    .line 132
    .line 133
    .line 134
    invoke-direct {v6, v0, v5}, Lcom/kubi/wallet/ui/WalletFlutterActivity$loadingWithAnimation$1;-><init>(Lcom/kubi/wallet/ui/WalletFlutterActivity;Lkotlin/coroutines/Continuation;)V

    .line 135
    const/4 v7, 0x3

    .line 136
    const/4 v8, 0x0

    .line 137
    const/4 v4, 0x0

    .line 138
    const/4 v5, 0x0

    .line 139
    .line 140
    .line 141
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 142
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
.end method

.method private final b0()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->Y()Lc80/a;

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
    iget-object v1, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->m:Lcom/kubi/sdk/mode/widget/HomeMaskView;

    .line 10
    .line 11
    if-nez v1, :cond_1

    .line 12
    .line 13
    .line 14
    const-string/jumbo v1, "maskView"

    .line 15
    .line 16
    .line 17
    invoke-static {v1}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {v1}, Lcom/kubi/sdk/mode/widget/HomeMaskView;->a()V

    .line 22
    .line 23
    const-string v1, "WalletFlutterActivity"

    .line 24
    .line 25
    const-string v2, "[loadingWithoutAnimation] maskView removeMask"

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v2}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 29
    .line 30
    iget-object v0, v0, Lc80/a;->b:Landroid/widget/FrameLayout;

    .line 31
    .line 32
    const-string v1, "flutterContainer"

    .line 33
    .line 34
    .line 35
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-static {v0}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 39
    .line 40
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->y()V

    .line 44
    .line 45
    .line 46
    invoke-direct {p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->d0()V

    .line 47
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
.end method

.method private final c0(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/coroutines/Continuation<",
            "-",
            "Lkotlin/Unit;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    .line 1
    .line 2
    instance-of v0, p1, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    move-object v0, p1

    .line 6
    .line 7
    check-cast v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;

    .line 8
    .line 9
    iget v1, v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;->label:I

    .line 10
    .line 11
    const/high16 v2, -0x80000000

    .line 12
    .line 13
    and-int v3, v1, v2

    .line 14
    .line 15
    if-eqz v3, :cond_0

    .line 16
    sub-int/2addr v1, v2

    .line 17
    .line 18
    iput v1, v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;->label:I

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, p0, p1}, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;-><init>(Lcom/kubi/wallet/ui/WalletFlutterActivity;Lkotlin/coroutines/Continuation;)V

    .line 25
    .line 26
    :goto_0
    iget-object p1, v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;->result:Ljava/lang/Object;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lkotlin/coroutines/intrinsics/IntrinsicsKt;->getCOROUTINE_SUSPENDED()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    iget v2, v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;->label:I

    .line 33
    const/4 v3, 0x0

    .line 34
    .line 35
    .line 36
    const-string/jumbo v4, "maskView"

    .line 37
    .line 38
    const-string v5, "WalletFlutterActivity"

    .line 39
    const/4 v6, 0x2

    .line 40
    const/4 v7, 0x1

    .line 41
    .line 42
    if-eqz v2, :cond_3

    .line 43
    .line 44
    if-eq v2, v7, :cond_2

    .line 45
    .line 46
    if-ne v2, v6, :cond_1

    .line 47
    .line 48
    iget-object v0, v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;->L$0:Ljava/lang/Object;

    .line 49
    .line 50
    check-cast v0, Lc80/a;

    .line 51
    .line 52
    .line 53
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 54
    goto :goto_3

    .line 55
    .line 56
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 57
    .line 58
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p1

    .line 63
    .line 64
    :cond_2
    iget-object v2, v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;->L$0:Ljava/lang/Object;

    .line 65
    .line 66
    check-cast v2, Lc80/a;

    .line 67
    .line 68
    .line 69
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 70
    goto :goto_1

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-static {p1}, Lkotlin/ResultKt;->throwOnFailure(Ljava/lang/Object;)V

    .line 74
    .line 75
    const-string p1, "[onFlutterDisplayed]"

    .line 76
    .line 77
    .line 78
    invoke-static {v5, p1}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->Y()Lc80/a;

    .line 82
    move-result-object v2

    .line 83
    .line 84
    if-nez v2, :cond_4

    .line 85
    .line 86
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 87
    return-object p1

    .line 88
    .line 89
    :cond_4
    iput-object v2, v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;->L$0:Ljava/lang/Object;

    .line 90
    .line 91
    iput v7, v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;->label:I

    .line 92
    .line 93
    const-wide/16 v7, 0xc8

    .line 94
    .line 95
    .line 96
    invoke-static {v7, v8, v0}, Lkotlinx/coroutines/DelayKt;->b(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 97
    move-result-object p1

    .line 98
    .line 99
    if-ne p1, v1, :cond_5

    .line 100
    goto :goto_2

    .line 101
    .line 102
    :cond_5
    :goto_1
    iget-object p1, v2, Lc80/a;->b:Landroid/widget/FrameLayout;

    .line 103
    .line 104
    const-string v7, "flutterContainer"

    .line 105
    .line 106
    .line 107
    invoke-static {p1, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    invoke-static {p1}, Lcom/kubi/utils/extensions/core/ViewExtKt;->y(Landroid/view/View;)V

    .line 111
    .line 112
    iget-object p1, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->m:Lcom/kubi/sdk/mode/widget/HomeMaskView;

    .line 113
    .line 114
    if-nez p1, :cond_6

    .line 115
    .line 116
    .line 117
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 118
    move-object p1, v3

    .line 119
    .line 120
    .line 121
    :cond_6
    invoke-virtual {p1}, Lcom/kubi/sdk/mode/widget/HomeMaskView;->getSharedView()Lcom/kubi/sdk/mode/widget/SwitchLayout;

    .line 122
    move-result-object p1

    .line 123
    .line 124
    if-eqz p1, :cond_7

    .line 125
    .line 126
    sget-object v7, Lcom/kubi/wallet/ui/WalletFlutterActivity;->n:Lcom/kubi/wallet/ui/WalletFlutterActivity$Companion;

    .line 127
    .line 128
    .line 129
    invoke-static {v2}, Lkotlin/coroutines/jvm/internal/SpillingKt;->nullOutSpilledVariable(Ljava/lang/Object;)Ljava/lang/Object;

    .line 130
    move-result-object v2

    .line 131
    .line 132
    iput-object v2, v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;->L$0:Ljava/lang/Object;

    .line 133
    .line 134
    iput v6, v0, Lcom/kubi/wallet/ui/WalletFlutterActivity$onFlutterDisplayed$1;->label:I

    .line 135
    .line 136
    .line 137
    invoke-virtual {v7, p1, v0}, Lcom/kubi/wallet/ui/WalletFlutterActivity$Companion;->showAnimationOutAsync(Lcom/kubi/sdk/mode/widget/SwitchLayout;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;

    .line 138
    move-result-object p1

    .line 139
    .line 140
    if-ne p1, v1, :cond_7

    .line 141
    :goto_2
    return-object v1

    .line 142
    .line 143
    :cond_7
    :goto_3
    iget-object p1, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->m:Lcom/kubi/sdk/mode/widget/HomeMaskView;

    .line 144
    .line 145
    if-nez p1, :cond_8

    .line 146
    .line 147
    .line 148
    invoke-static {v4}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 149
    goto :goto_4

    .line 150
    :cond_8
    move-object v3, p1

    .line 151
    .line 152
    .line 153
    :goto_4
    invoke-virtual {v3}, Lcom/kubi/sdk/mode/widget/HomeMaskView;->a()V

    .line 154
    .line 155
    const-string p1, "[onFlutterDisplayed] maskView removeMask"

    .line 156
    .line 157
    .line 158
    invoke-static {v5, p1}, Lro/b;->c(Ljava/lang/String;Ljava/lang/String;)V

    .line 159
    .line 160
    sget-object p1, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 161
    return-object p1
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
.end method

.method private final d0()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->A()V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->l:Lcom/kubi/wallet/utils/CheckUpgradeHelper;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/kubi/wallet/utils/CheckUpgradeHelper;->f()V

    .line 11
    .line 12
    sget-object v0, Lwz/a;->a:Lwz/a;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lwz/a;->c()V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method private final e0()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "getIntent(...)"

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 10
    .line 11
    const-string v1, "flutterInitialRoute"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Lcom/kubi/router/utils/RouteExKt;->w(Landroid/content/Intent;Ljava/lang/String;)Ljava/lang/String;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    if-nez v0, :cond_0

    .line 18
    .line 19
    const-string v0, "/"

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 23
    move-result-object v1

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    const-string/jumbo v3, "wallet_animation"

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v3, v2}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Landroid/content/Intent;->removeExtra(Ljava/lang/String;)V

    .line 39
    .line 40
    iget-object v2, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v2, v0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->V(Ljava/lang/String;)V

    .line 44
    .line 45
    if-eqz v1, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-direct {p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->a0()V

    .line 49
    return-void

    .line 50
    .line 51
    .line 52
    :cond_1
    invoke-direct {p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->b0()V

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
.end method

.method private final f0(Landroid/app/Activity;Z)V
    .locals 2

    .line 1
    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    const/16 v1, 0x1e

    .line 5
    .line 6
    if-lt v0, v1, :cond_2

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Landroidx/core/view/n2;->a(Landroid/view/Window;)Landroid/view/WindowInsetsController;

    .line 14
    move-result-object p1

    .line 15
    .line 16
    if-eqz p1, :cond_1

    .line 17
    .line 18
    const/16 v0, 0x8

    .line 19
    .line 20
    if-eqz p2, :cond_0

    .line 21
    move p2, v0

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 p2, 0x0

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-static {p1, p2, v0}, Landroidx/core/view/l2;->a(Landroid/view/WindowInsetsController;II)V

    .line 27
    :cond_1
    return-void

    .line 28
    .line 29
    .line 30
    :cond_2
    invoke-virtual {p1}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    .line 34
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 35
    move-result-object p1

    .line 36
    .line 37
    if-eqz p2, :cond_3

    .line 38
    .line 39
    .line 40
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 41
    move-result p2

    .line 42
    .line 43
    or-int/lit16 p2, p2, 0x2000

    .line 44
    goto :goto_1

    .line 45
    .line 46
    .line 47
    :cond_3
    invoke-virtual {p1}, Landroid/view/View;->getSystemUiVisibility()I

    .line 48
    move-result p2

    .line 49
    .line 50
    and-int/lit16 p2, p2, -0x2001

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-virtual {p1, p2}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 54
    return-void
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
.end method

.method private final g0()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/blankj/utilcode/util/g;->t(Landroid/app/Activity;)V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 7
    move-result-object v0

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Landroid/view/Window;->setStatusBarColor(I)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    sget v1, Lcom/kubi/wallet/R$color;->c_overlay:I

    .line 18
    .line 19
    .line 20
    invoke-static {p0, v1}, Lcom/kubi/utils/extensions/k;->n(Landroid/content/Context;I)I

    .line 21
    move-result v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v1}, Landroid/view/Window;->setNavigationBarColor(I)V

    .line 25
    .line 26
    const-string v0, "LiteTag"

    .line 27
    .line 28
    const-string v1, "WalletFlutterActivity setSystemUI"

    .line 29
    .line 30
    .line 31
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

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
.end method


# virtual methods
.method public final Y()Lc80/a;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->i:Lcom/kubi/sdk/viewbindingdelegate/base/a;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/wallet/ui/WalletFlutterActivity;->o:[Lkotlin/reflect/KProperty;

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
    check-cast v0, Lc80/a;

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public finish()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/app/Activity;->finish()V

    .line 4
    .line 5
    const-string v0, "LiteTag"

    .line 6
    .line 7
    const-string v1, "WalletFlutterActivity finish"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

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
.end method

.method public onActivityResult(IILandroid/content/Intent;)V
    .locals 1
    .param p3    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Lcom/kubi/sdk/BaseActivity;->onActivityResult(IILandroid/content/Intent;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1, p2, p3}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->z(IILandroid/content/Intent;)V

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
.end method

.method public onBackPressed()V
    .locals 1
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "MissingSuperCall"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->B()Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-super {p0}, Lcom/kubi/sdk/BaseActivity;->onBackPressed()V

    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 8
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    const/4 p1, 0x0

    .line 2
    .line 3
    .line 4
    invoke-super {p0, p1}, Lcom/kubi/sdk/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseActivity;->getTitleBar()Lcom/kubi/sdk/widget/TitleBar;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/sdk/widget/TitleBar;->f()V

    .line 12
    .line 13
    const-string v0, "LiteTag"

    .line 14
    .line 15
    const-string v1, "WalletFlutterActivity onCreate"

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 19
    .line 20
    sget v0, Lcom/kubi/wallet/R$layout;->wallet_flutter_layout:I

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/kubi/sdk/BaseActivity;->setContentView(I)V

    .line 24
    .line 25
    .line 26
    invoke-direct {p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->g0()V

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->Y()Lc80/a;

    .line 30
    move-result-object v0

    .line 31
    .line 32
    if-nez v0, :cond_0

    .line 33
    .line 34
    new-instance v1, Lcom/kubi/wallet/exception/WalletMessage;

    .line 35
    const/4 v5, 0x4

    .line 36
    const/4 v6, 0x0

    .line 37
    .line 38
    const-string v2, "bing = null"

    .line 39
    .line 40
    const-string v3, "WalletFlutterActivity"

    .line 41
    const/4 v4, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct/range {v1 .. v6}, Lcom/kubi/wallet/exception/WalletMessage;-><init>(Ljava/lang/String;Ljava/lang/String;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 45
    const/4 v0, 0x2

    .line 46
    .line 47
    .line 48
    invoke-static {v1, p1, v0, p1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->finish()V

    .line 52
    return-void

    .line 53
    .line 54
    :cond_0
    sget-object v2, Lcom/kubi/sdk/mode/widget/HomeMaskView;->d:Lcom/kubi/sdk/mode/widget/HomeMaskView$Companion;

    .line 55
    .line 56
    sget-object v4, Lcom/kubi/sdk/mode/AppMode;->Web3:Lcom/kubi/sdk/mode/AppMode;

    .line 57
    const/4 v6, 0x4

    .line 58
    const/4 v7, 0x0

    .line 59
    const/4 v5, 0x0

    .line 60
    move-object v3, p0

    .line 61
    .line 62
    .line 63
    invoke-static/range {v2 .. v7}, Lcom/kubi/sdk/mode/widget/HomeMaskView$Companion;->setMaskView$default(Lcom/kubi/sdk/mode/widget/HomeMaskView$Companion;Landroid/app/Activity;Lcom/kubi/sdk/mode/AppMode;ZILjava/lang/Object;)Lcom/kubi/sdk/mode/widget/HomeMaskView;

    .line 64
    move-result-object p1

    .line 65
    move-object v2, v3

    .line 66
    .line 67
    if-nez p1, :cond_1

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->finish()V

    .line 71
    return-void

    .line 72
    .line 73
    :cond_1
    iput-object p1, v2, Lcom/kubi/wallet/ui/WalletFlutterActivity;->m:Lcom/kubi/sdk/mode/widget/HomeMaskView;

    .line 74
    .line 75
    iget-object p1, v2, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 76
    .line 77
    .line 78
    invoke-virtual {p1}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->i()V

    .line 79
    .line 80
    iget-object p1, v2, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 81
    .line 82
    const-string v1, "entry=web3Wallet"

    .line 83
    .line 84
    .line 85
    invoke-static {v1}, Lkotlin/collections/CollectionsKt;->listOf(Ljava/lang/Object;)Ljava/util/List;

    .line 86
    move-result-object v1

    .line 87
    .line 88
    .line 89
    invoke-virtual {p1, v1}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->U(Ljava/util/List;)V

    .line 90
    .line 91
    iget-object p1, v2, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 92
    .line 93
    .line 94
    invoke-virtual {p1, p0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->l(Lcom/kubi/sdk/BaseActivity;)V

    .line 95
    .line 96
    iget-object v1, v2, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 97
    .line 98
    iget-object v3, v0, Lc80/a;->b:Landroid/widget/FrameLayout;

    .line 99
    .line 100
    const-string p1, "flutterContainer"

    .line 101
    .line 102
    .line 103
    invoke-static {v3, p1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 104
    const/4 v5, 0x4

    .line 105
    const/4 v6, 0x0

    .line 106
    const/4 v4, 0x0

    .line 107
    .line 108
    .line 109
    invoke-static/range {v1 .. v6}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->D(Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;Landroid/content/Context;Landroid/widget/FrameLayout;ZILjava/lang/Object;)V

    .line 110
    .line 111
    .line 112
    invoke-direct {p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->X()V

    .line 113
    .line 114
    .line 115
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 116
    move-result-object p1

    .line 117
    .line 118
    .line 119
    invoke-direct {p0, p1}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->Z(Landroid/content/Intent;)V

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
.end method

.method public onDestroy()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseActivity;->onDestroy()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->E()V

    .line 9
    .line 10
    const-string v0, "LiteTag"

    .line 11
    .line 12
    const-string v1, "WalletFlutterActivity onDestroy"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public onNewIntent(Landroid/content/Intent;)V
    .locals 1
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
    invoke-direct {p0, p1}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->Z(Landroid/content/Intent;)V

    .line 7
    .line 8
    if-eqz p1, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->I(Landroid/content/Intent;)V

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
.end method

.method public onPause()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseActivity;->onPause()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->K()V

    .line 9
    .line 10
    const-string v0, "LiteTag"

    .line 11
    .line 12
    const-string v1, "WalletFlutterActivity onPause"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public onPostResume()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onPostResume()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->L()V

    .line 9
    .line 10
    const-string v0, "LiteTag"

    .line 11
    .line 12
    const-string v1, "WalletFlutterActivity onPostResume"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public onPreFinish()V
    .locals 2

    .line 1
    .line 2
    const-string v0, "LiteTag"

    .line 3
    .line 4
    const-string v1, "WalletFlutterActivity onPreFinish"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

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
.end method

.method public onRequestPermissionsResult(I[Ljava/lang/String;[I)V
    .locals 1
    .param p2    # [Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # [I
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "permissions"

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    const-string v0, "grantResults"

    .line 9
    .line 10
    .line 11
    invoke-static {p3, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-super {p0, p1, p2, p3}, Landroidx/fragment/app/FragmentActivity;->onRequestPermissionsResult(I[Ljava/lang/String;[I)V

    .line 15
    .line 16
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p1, p2, p3}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->M(I[Ljava/lang/String;[I)V

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
.end method

.method public onResume()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseActivity;->onResume()V

    .line 4
    .line 5
    const-string v0, "LiteTag"

    .line 6
    .line 7
    const-string v1, "WalletFlutterActivity onResume"

    .line 8
    .line 9
    .line 10
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->k:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 13
    const/4 v1, 0x1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;->getAndSet(Z)Z

    .line 17
    move-result v0

    .line 18
    .line 19
    if-nez v0, :cond_0

    .line 20
    .line 21
    .line 22
    invoke-direct {p0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->e0()V

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->N()V

    .line 28
    .line 29
    sget-object v0, Lcom/kubi/kucoin/utils/r;->a:Lcom/kubi/kucoin/utils/r;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/kubi/kucoin/utils/r;->u()V

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0}, Lcom/kubi/kucoin/utils/r;->l()Z

    .line 36
    move-result v0

    .line 37
    .line 38
    .line 39
    invoke-direct {p0, p0, v0}, Lcom/kubi/wallet/ui/WalletFlutterActivity;->f0(Landroid/app/Activity;Z)V

    .line 40
    return-void
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
.end method

.method public onStart()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStart()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->O()V

    .line 9
    .line 10
    const-string v0, "LiteTag"

    .line 11
    .line 12
    const-string v1, "WalletFlutterActivity onStart"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public onStop()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroidx/appcompat/app/AppCompatActivity;->onStop()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->G()V

    .line 9
    .line 10
    const-string v0, "LiteTag"

    .line 11
    .line 12
    const-string v1, "WalletFlutterActivity onStop"

    .line 13
    .line 14
    .line 15
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 16
    return-void
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public onTrimMemory(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroidx/activity/ComponentActivity;->onTrimMemory(I)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->P(I)V

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
.end method

.method public onUserLeaveHint()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Landroid/app/Activity;->onUserLeaveHint()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->Q()V

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
.end method

.method public onWindowFocusChanged(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Landroid/app/Activity;->onWindowFocusChanged(Z)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/kubi/wallet/ui/WalletFlutterActivity;->j:Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p1}, Lcom/kubi/sdk/flutter/delegate/FlutterViewDelegate;->R(Z)V

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
.end method
