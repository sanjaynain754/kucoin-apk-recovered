.class public abstract Lcom/kubi/widget/web/ui/KWebBaseActivity;
.super Lcom/kubi/sdk/BaseActivity;
.source "KWebBaseActivity.kt"

# interfaces
.implements Lcom/kubi/sdk/applet/KCMiniAppBaseProtocol;
.implements Lcom/kubi/widget/web/ui/a;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/kubi/widget/web/ui/KWebBaseActivity$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u008e\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010#\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010!\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u000c\n\u0002\u0010\u0008\n\u0002\u0008\u001d\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008&\u0018\u0000 `2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001`B\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005J\u0012\u0010!\u001a\u00020\"2\u0008\u0010#\u001a\u0004\u0018\u00010$H\u0014J\u0010\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020\'H\u0002J\u0010\u0010(\u001a\u00020\u001c2\u0006\u0010&\u001a\u00020\'H\u0002J\u0010\u0010)\u001a\u00020\"2\u0006\u0010*\u001a\u00020+H\u0002J\n\u0010,\u001a\u0004\u0018\u00010\'H\u0014J\u0010\u0010-\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0014J\u0010\u00100\u001a\u00020\"2\u0006\u0010.\u001a\u00020/H\u0014J\u0008\u00101\u001a\u00020\"H\u0014J\u0008\u00102\u001a\u00020\"H\u0002J\u0008\u00103\u001a\u00020\"H\u0002J\u0018\u00104\u001a\u00020\"2\u0006\u00105\u001a\u00020\u001c2\u0008\u0008\u0002\u00106\u001a\u00020\u001cJ\u0018\u00107\u001a\u00020\"2\u0008\u00108\u001a\u0004\u0018\u00010\u00192\u0006\u00109\u001a\u00020\u0019J\u001a\u0010:\u001a\u00020\"2\u0008\u00108\u001a\u0004\u0018\u00010\u00192\u0006\u00109\u001a\u00020\u0019H\u0002J\u0008\u0010;\u001a\u00020<H\u0002J\u0008\u0010=\u001a\u00020\"H\u0002J\u0018\u0010>\u001a\u00020\"2\u0006\u0010?\u001a\u00020<2\u0006\u00109\u001a\u00020\u0019H\u0002J\u0008\u0010@\u001a\u00020\"H\u0002J\u0008\u0010A\u001a\u00020\"H\u0002J\u0008\u0010B\u001a\u00020\u0019H\u0002J\u000c\u0010C\u001a\u00020\u0019*\u00020+H\u0002J\u000c\u0010D\u001a\u00020\u0019*\u00020<H\u0002J\u0013\u0010E\u001a\u0004\u0018\u00010<*\u00020\u0019H\u0002\u00a2\u0006\u0002\u0010FJ\u000c\u0010G\u001a\u00020\"*\u00020\u0010H\u0002J\u0008\u0010H\u001a\u00020\"H\u0014J\u0008\u0010I\u001a\u00020\"H\u0014J\u0008\u0010J\u001a\u00020\u001cH\u0016J\u0008\u0010K\u001a\u00020\"H\u0016J\u0008\u0010L\u001a\u00020\"H\u0014J\u0008\u0010M\u001a\u00020\"H\u0014J\u001d\u0010N\u001a\u00020\"2\u0006\u0010O\u001a\u00020\u001c2\u0008\u0010P\u001a\u0004\u0018\u00010<\u00a2\u0006\u0002\u0010QJ\u000e\u0010R\u001a\u00020\"2\u0006\u0010S\u001a\u00020\u001cJ\u0008\u0010T\u001a\u0004\u0018\u00010/J\u0008\u0010U\u001a\u00020\u0019H\u0016J*\u0010V\u001a\u00020\"2\u0006\u0010W\u001a\u00020<2\u0006\u0010X\u001a\u00020<2\u0008\u0010Y\u001a\u0004\u0018\u00010Z2\u0006\u0010[\u001a\u00020\\H\u0016J\u0010\u0010]\u001a\u00020\"2\u0006\u0010^\u001a\u00020\u0008H\u0016J\u0010\u0010_\u001a\u00020\"2\u0006\u0010^\u001a\u00020\u0008H\u0016R\u0014\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000R$\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n@DX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000c\u0010\r\"\u0004\u0008\u000e\u0010\u000fR\u001e\u0010\u0011\u001a\u00020\u00102\u0006\u0010\t\u001a\u00020\u0010@BX\u0086.\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004\u00a2\u0006\u0002\n\u0000R \u0010\u0016\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00190\u00180\u0017X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0019X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001cX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0010\u0010\u001f\u001a\u0004\u0018\u00010 X\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006a"
    }
    d2 = {
        "Lcom/kubi/widget/web/ui/KWebBaseActivity;",
        "Lcom/kubi/sdk/BaseActivity;",
        "Lcom/kubi/sdk/applet/KCMiniAppBaseProtocol;",
        "Lcom/kubi/widget/web/ui/ActivityResultHost;",
        "<init>",
        "()V",
        "listeners",
        "",
        "Lcom/kubi/widget/web/ui/ActivityResultListener;",
        "value",
        "Lcom/kubi/widget/web/ui/KWebContainer;",
        "webContainer",
        "getWebContainer",
        "()Lcom/kubi/widget/web/ui/KWebContainer;",
        "setWebContainer",
        "(Lcom/kubi/widget/web/ui/KWebContainer;)V",
        "Lcom/kubi/resources/widget/NavigationBar;",
        "navigationBar",
        "getNavigationBar",
        "()Lcom/kubi/resources/widget/NavigationBar;",
        "initStartTime",
        "",
        "navBackgroundChangeHistoryBeforePageMount",
        "",
        "",
        "",
        "lastNavBackgroundColorBeforePageMount",
        "hasReportedNavBackgroundThemeConsistency",
        "",
        "isNavigationBarTransparent",
        "hasReceivedPageMount",
        "navBackgroundThemeConsistencyFallbackJob",
        "Lkotlinx/coroutines/Job;",
        "onCreate",
        "",
        "savedInstanceState",
        "Landroid/os/Bundle;",
        "reportInvalidWebTarget",
        "config",
        "Lcom/kubi/widget/web/ui/KWebUIConfig;",
        "isValidWebTarget",
        "dealFullScreen",
        "uri",
        "Landroid/net/Uri;",
        "getWebUIConfig",
        "initWebView",
        "webView",
        "Lcom/kubi/sdk/web/KWebView;",
        "addAllHandlers",
        "startLoad",
        "perInitColor",
        "applyUrlNavigationBarStyle",
        "applyNavigationBarTransparent",
        "transparent",
        "hideNavigationBar",
        "applyNavigationBarBackground",
        "background",
        "source",
        "applyResolvedNavigationBarBackground",
        "themeNavigationBarBackgroundColor",
        "",
        "applyDebugColorOverridesIfNeeded",
        "recordNavigationBarBackgroundChangeIfNeeded",
        "color",
        "reportNavigationBarThemeConsistencyIfNeeded",
        "scheduleNavigationBarThemeConsistencyFallback",
        "reportUrl",
        "pathWithoutLanguagePrefix",
        "toHexColor",
        "toColorOrNull",
        "(Ljava/lang/String;)Ljava/lang/Integer;",
        "initBar",
        "onNavigationBarRightClick",
        "onDestroy",
        "interceptWebContainerDestroy",
        "onBackPressed",
        "onResume",
        "onPause",
        "setStatusBarTransparent",
        "statusBarTransparent",
        "backgroundColor",
        "(ZLjava/lang/Integer;)V",
        "setWebViewScrollBarVisible",
        "enable",
        "getWebView",
        "url",
        "onActivityResult",
        "requestCode",
        "resultCode",
        "data",
        "Landroid/content/Intent;",
        "caller",
        "Landroid/app/ComponentCaller;",
        "registerActivityResultListener",
        "listener",
        "unregisterActivityResultListener",
        "Companion",
        "LWebWidget_googleRelease"
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
        "SMAP\nKWebBaseActivity.kt\nKotlin\n*S Kotlin\n*F\n+ 1 KWebBaseActivity.kt\ncom/kubi/widget/web/ui/KWebBaseActivity\n+ 2 KWebIssue.kt\ncom/kubi/widget/web/exception/KWebIssueKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 5 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n+ 6 RemoteConfig.kt\ncom/kubi/config/RemoteConfig\n+ 7 KCConfigIssue.kt\ncom/kubi/config/exception/KCConfigIssueKt\n*L\n1#1,585:1\n46#2,6:586\n46#2,6:592\n46#2,6:599\n46#2,6:624\n46#2,6:630\n1#3:598\n774#4:605\n865#4,2:606\n1869#4,2:636\n1069#5,2:608\n35#6,4:610\n39#6:616\n35#6,4:617\n39#6:623\n44#7,2:614\n44#7,2:621\n*S KotlinDebug\n*F\n+ 1 KWebBaseActivity.kt\ncom/kubi/widget/web/ui/KWebBaseActivity\n*L\n230#1:586,6\n256#1:592,6\n353#1:599,6\n546#1:624,6\n558#1:630,6\n381#1:605\n381#1:606,2\n574#1:636,2\n402#1:608,2\n490#1:610,4\n490#1:616\n502#1:617,4\n502#1:623\n490#1:614,2\n502#1:621,2\n*E\n"
    }
.end annotation


# static fields
.field public static final s:Lcom/kubi/widget/web/ui/KWebBaseActivity$Companion;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# instance fields
.field public final i:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Lcom/kubi/widget/web/ui/b;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public j:Lcom/kubi/widget/web/ui/KWebContainer;

.field public k:Lcom/kubi/resources/widget/NavigationBar;

.field public final l:J

.field public final m:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;>;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public n:Ljava/lang/String;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public o:Z

.field public p:Z

.field public q:Z

.field public r:Lkotlinx/coroutines/x1;
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/kubi/widget/web/ui/KWebBaseActivity$Companion;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-direct {v0, v1}, Lcom/kubi/widget/web/ui/KWebBaseActivity$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    .line 8
    sput-object v0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->s:Lcom/kubi/widget/web/ui/KWebBaseActivity$Companion;

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

.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/kubi/sdk/BaseActivity;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/LinkedHashSet;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedHashSet;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->i:Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 14
    move-result-wide v0

    .line 15
    .line 16
    iput-wide v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l:J

    .line 17
    .line 18
    new-instance v0, Ljava/util/ArrayList;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 22
    .line 23
    iput-object v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->m:Ljava/util/List;

    .line 24
    .line 25
    const-string v0, ""

    .line 26
    .line 27
    iput-object v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->n:Ljava/lang/String;

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
.end method

.method public static final A0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->K0()V

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
.end method

.method public static final B0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;
    .locals 3

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->q:Z

    .line 4
    .line 5
    iget-object v1, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->r:Lkotlinx/coroutines/x1;

    .line 6
    .line 7
    if-eqz v1, :cond_0

    .line 8
    const/4 v2, 0x0

    .line 9
    .line 10
    .line 11
    invoke-static {v1, v2, v0, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->I0()V

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
.end method

.method public static synthetic T(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->z0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;

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
.end method

.method public static synthetic U(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->A0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;

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
.end method

.method public static synthetic V(Lcom/kubi/sdk/web/KWebView;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->p0(Lcom/kubi/sdk/web/KWebView;)Lkotlin/Unit;

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
.end method

.method public static synthetic W(Lcom/kubi/widget/web/ui/KWebBaseActivity;Ljava/lang/String;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->s0(Lcom/kubi/widget/web/ui/KWebBaseActivity;Ljava/lang/String;)Lkotlin/Unit;

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

.method public static synthetic X(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->B0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;

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
.end method

.method public static synthetic Y(Lcom/kubi/sdk/web/KWebView;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->q0(Lcom/kubi/sdk/web/KWebView;)Lkotlin/Unit;

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
.end method

.method public static synthetic Z(Lcom/kubi/widget/web/ui/KWebBaseActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->t0(Lcom/kubi/widget/web/ui/KWebBaseActivity;Landroid/view/View;)V

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

.method public static synthetic a0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->y0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;

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
.end method

.method public static synthetic b0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->x0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;

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
.end method

.method public static synthetic c0(Lcom/kubi/sdk/web/KWebView;Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->r0(Lcom/kubi/sdk/web/KWebView;Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;

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

.method public static final synthetic d0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->I0()V

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

.method public static final p0(Lcom/kubi/sdk/web/KWebView;)Lkotlin/Unit;
    .locals 6

    .line 1
    const/4 v4, 0x6

    .line 2
    const/4 v5, 0x0

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "onLeadClick"

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v0, p0

    .line 9
    .line 10
    .line 11
    invoke-static/range {v0 .. v5}, Lcom/kubi/sdk/web/KWebView;->y(Lcom/kubi/sdk/web/KWebView;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method

.method public static final q0(Lcom/kubi/sdk/web/KWebView;)Lkotlin/Unit;
    .locals 6

    .line 1
    const/4 v4, 0x6

    .line 2
    const/4 v5, 0x0

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "onTrailClick"

    .line 6
    const/4 v2, 0x0

    .line 7
    const/4 v3, 0x0

    .line 8
    move-object v0, p0

    .line 9
    .line 10
    .line 11
    invoke-static/range {v0 .. v5}, Lcom/kubi/sdk/web/KWebView;->y(Lcom/kubi/sdk/web/KWebView;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 12
    .line 13
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

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
.end method

.method public static final r0(Lcom/kubi/sdk/web/KWebView;Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/sdk/web/KWebView;->w()V

    .line 4
    .line 5
    new-instance v3, Lcom/kubi/widget/web/ui/l;

    .line 6
    .line 7
    .line 8
    invoke-direct {v3, p1}, Lcom/kubi/widget/web/ui/l;-><init>(Lcom/kubi/widget/web/ui/KWebBaseActivity;)V

    .line 9
    const/4 v4, 0x2

    .line 10
    const/4 v5, 0x0

    .line 11
    .line 12
    .line 13
    const-string/jumbo v1, "onRightClick"

    .line 14
    const/4 v2, 0x0

    .line 15
    move-object v0, p0

    .line 16
    .line 17
    .line 18
    invoke-static/range {v0 .. v5}, Lcom/kubi/sdk/web/KWebView;->y(Lcom/kubi/sdk/web/KWebView;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)V

    .line 19
    .line 20
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 21
    return-object p0
    .line 22
    .line 23
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

.method public static final s0(Lcom/kubi/widget/web/ui/KWebBaseActivity;Ljava/lang/String;)Lkotlin/Unit;
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
    const-string/jumbo v0, "true"

    .line 9
    .line 10
    .line 11
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 12
    move-result p1

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    .line 16
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 17
    return-object p0

    .line 18
    .line 19
    .line 20
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->C0()V

    .line 21
    .line 22
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 23
    return-object p0
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

.method public static final t0(Lcom/kubi/widget/web/ui/KWebBaseActivity;Landroid/view/View;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->onBackPressed()V

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

.method public static final x0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v1, Lcom/kubi/widget/web/ui/k;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1, p0}, Lcom/kubi/widget/web/ui/k;-><init>(Lcom/kubi/widget/web/ui/KWebBaseActivity;)V

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lcom/kubi/widget/web/ui/KWebContainer;->G(Lkotlin/jvm/functions/Function0;)V

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
.end method

.method public static final y0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/kubi/router/core/Router;->u(Landroid/content/Intent;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 16
    goto :goto_0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-super {p0}, Lcom/kubi/sdk/BaseActivity;->onBackPressed()V

    .line 20
    .line 21
    :goto_0
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 22
    return-object p0
    .line 23
    .line 24
.end method

.method public static final z0(Lcom/kubi/widget/web/ui/KWebBaseActivity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->O0()V

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
.end method


# virtual methods
.method public C0()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 4
    .line 5
    const/high16 v0, 0x10a0000

    .line 6
    .line 7
    sget v1, Lcom/kubi/widget/web/R$anim;->anim_bottom_out_200:I

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0, v1}, Landroid/app/Activity;->overridePendingTransition(II)V

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

.method public final E0(Landroid/net/Uri;)Ljava/lang/String;
    .locals 13

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Landroid/net/Uri;->getEncodedPath()Ljava/lang/String;

    .line 6
    move-result-object p1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    .line 10
    const-string p1, ""

    .line 11
    .line 12
    :cond_0
    const/16 v2, 0x2f

    .line 13
    .line 14
    new-array v3, v1, [C

    .line 15
    .line 16
    aput-char v2, v3, v0

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v3}, Lkotlin/text/StringsKt;->trim(Ljava/lang/String;[C)Ljava/lang/String;

    .line 20
    move-result-object v4

    .line 21
    .line 22
    new-array v5, v1, [C

    .line 23
    .line 24
    aput-char v2, v5, v0

    .line 25
    const/4 v8, 0x6

    .line 26
    const/4 v9, 0x0

    .line 27
    const/4 v6, 0x0

    .line 28
    const/4 v7, 0x0

    .line 29
    .line 30
    .line 31
    invoke-static/range {v4 .. v9}, Lkotlin/text/StringsKt;->split$default(Ljava/lang/CharSequence;[CZIILjava/lang/Object;)Ljava/util/List;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    new-instance v3, Ljava/util/ArrayList;

    .line 35
    .line 36
    .line 37
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 38
    .line 39
    .line 40
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    :cond_1
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 45
    move-result v4

    .line 46
    .line 47
    if-eqz v4, :cond_2

    .line 48
    .line 49
    .line 50
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 51
    move-result-object v4

    .line 52
    move-object v5, v4

    .line 53
    .line 54
    check-cast v5, Ljava/lang/String;

    .line 55
    .line 56
    .line 57
    invoke-interface {v5}, Ljava/lang/CharSequence;->length()I

    .line 58
    move-result v5

    .line 59
    .line 60
    if-lez v5, :cond_1

    .line 61
    .line 62
    .line 63
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    .line 64
    goto :goto_0

    .line 65
    .line 66
    .line 67
    :cond_2
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    .line 68
    move-result v0

    .line 69
    .line 70
    if-eqz v0, :cond_3

    .line 71
    goto :goto_1

    .line 72
    .line 73
    .line 74
    :cond_3
    invoke-static {v3}, Lkotlin/collections/CollectionsKt;->first(Ljava/util/List;)Ljava/lang/Object;

    .line 75
    move-result-object v0

    .line 76
    .line 77
    check-cast v0, Ljava/lang/String;

    .line 78
    .line 79
    new-instance v4, Lkotlin/text/Regex;

    .line 80
    .line 81
    const-string v5, "[a-z]{2}(-[a-z]{2,4})?"

    .line 82
    .line 83
    sget-object v6, Lkotlin/text/RegexOption;->IGNORE_CASE:Lkotlin/text/RegexOption;

    .line 84
    .line 85
    .line 86
    invoke-direct {v4, v5, v6}, Lkotlin/text/Regex;-><init>(Ljava/lang/String;Lkotlin/text/RegexOption;)V

    .line 87
    .line 88
    .line 89
    invoke-virtual {v4, v0}, Lkotlin/text/Regex;->matches(Ljava/lang/CharSequence;)Z

    .line 90
    move-result v0

    .line 91
    .line 92
    if-eqz v0, :cond_4

    .line 93
    .line 94
    new-instance p1, Ljava/lang/StringBuilder;

    .line 95
    .line 96
    .line 97
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    invoke-static {v3, v1}, Lkotlin/collections/CollectionsKt;->drop(Ljava/lang/Iterable;I)Ljava/util/List;

    .line 104
    move-result-object v4

    .line 105
    .line 106
    const/16 v11, 0x3e

    .line 107
    const/4 v12, 0x0

    .line 108
    .line 109
    const-string v5, "/"

    .line 110
    const/4 v6, 0x0

    .line 111
    const/4 v7, 0x0

    .line 112
    const/4 v8, 0x0

    .line 113
    const/4 v9, 0x0

    .line 114
    const/4 v10, 0x0

    .line 115
    .line 116
    .line 117
    invoke-static/range {v4 .. v12}, Lkotlin/collections/CollectionsKt;->joinToString$default(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;ILjava/lang/Object;)Ljava/lang/String;

    .line 118
    move-result-object v0

    .line 119
    .line 120
    .line 121
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 122
    .line 123
    .line 124
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 125
    move-result-object p1

    .line 126
    :cond_4
    :goto_1
    return-object p1
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

.method public final F0()V
    .locals 9

    .line 1
    const/4 v1, 0x0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 5
    move-result-object v0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/kubi/resources/widget/NavigationBar;->getLeftIcon()Landroid/widget/ImageView;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    const-string v2, "getLeftIcon(...)"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 18
    move-result-object v2

    .line 19
    .line 20
    .line 21
    invoke-virtual {v2}, Lcom/kubi/widget/web/ui/KWebContainer;->getConfig()Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v2}, Lcom/kubi/widget/web/ui/KWebUIConfig;->d()Z

    .line 26
    move-result v2

    .line 27
    .line 28
    if-eqz v2, :cond_0

    .line 29
    .line 30
    sget v2, Lcom/kubi/widget/web/R$color;->kweb_foreground_dark:I

    .line 31
    .line 32
    .line 33
    invoke-static {p0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 34
    move-result v2

    .line 35
    .line 36
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2, v3}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 40
    const/4 v0, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static {p0, v0}, Lcom/blankj/utilcode/util/g;->r(Landroid/app/Activity;Z)V

    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    move-object v3, v0

    .line 47
    goto :goto_1

    .line 48
    .line 49
    :cond_0
    sget v2, Lcom/kubi/widget/web/R$color;->kweb_foreground_light:I

    .line 50
    .line 51
    .line 52
    invoke-static {p0, v2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 53
    move-result v2

    .line 54
    .line 55
    sget-object v3, Landroid/graphics/PorterDuff$Mode;->SRC_IN:Landroid/graphics/PorterDuff$Mode;

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0, v2, v3}, Landroid/widget/ImageView;->setColorFilter(ILandroid/graphics/PorterDuff$Mode;)V

    .line 59
    const/4 v0, 0x1

    .line 60
    .line 61
    .line 62
    invoke-static {p0, v0}, Lcom/blankj/utilcode/util/g;->r(Landroid/app/Activity;Z)V

    .line 63
    .line 64
    .line 65
    :goto_0
    const-string/jumbo v0, "themeDefault"

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v1, v0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->i0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 69
    return-void

    .line 70
    .line 71
    .line 72
    :goto_1
    invoke-static {v3}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 73
    move-result v0

    .line 74
    .line 75
    if-nez v0, :cond_1

    .line 76
    .line 77
    new-instance v2, Lcom/kubi/widget/web/exception/KWebWidgetException;

    .line 78
    .line 79
    const/16 v7, 0x8

    .line 80
    const/4 v8, 0x0

    .line 81
    .line 82
    const-string v4, "MyKcWebView-BaseActivity"

    .line 83
    const/4 v5, 0x0

    .line 84
    const/4 v6, 0x0

    .line 85
    .line 86
    .line 87
    invoke-direct/range {v2 .. v8}, Lcom/kubi/widget/web/exception/KWebWidgetException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 88
    const/4 v0, 0x2

    .line 89
    .line 90
    .line 91
    invoke-static {v2, v1, v0, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 92
    goto :goto_2

    .line 93
    .line 94
    .line 95
    :cond_1
    invoke-static {v3}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 96
    :goto_2
    return-void
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
.end method

.method public final G0(ILjava/lang/String;)V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->o:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    .line 8
    :cond_0
    invoke-virtual {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->R0(I)Ljava/lang/String;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    iget-object v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->m:Ljava/util/List;

    .line 12
    .line 13
    .line 14
    const-string/jumbo v1, "value"

    .line 15
    .line 16
    .line 17
    invoke-static {v1, p1}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    const-string/jumbo v2, "source"

    .line 22
    .line 23
    .line 24
    invoke-static {v2, p2}, Lkotlin/TuplesKt;->to(Ljava/lang/Object;Ljava/lang/Object;)Lkotlin/Pair;

    .line 25
    move-result-object p2

    .line 26
    .line 27
    .line 28
    filled-new-array {v1, p2}, [Lkotlin/Pair;

    .line 29
    move-result-object p2

    .line 30
    .line 31
    .line 32
    invoke-static {p2}, Lkotlin/collections/MapsKt;->mapOf([Lkotlin/Pair;)Ljava/util/Map;

    .line 33
    move-result-object p2

    .line 34
    .line 35
    .line 36
    invoke-interface {v0, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 37
    .line 38
    iput-object p1, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->n:Ljava/lang/String;

    .line 39
    return-void
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final H0(Lcom/kubi/widget/web/ui/KWebUIConfig;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/widget/web/ui/KWebUIConfig;->h()Landroid/net/Uri;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    new-instance v0, Ljava/lang/StringBuilder;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 10
    .line 11
    const-string v1, "[entry] invalid web target blocked uriNull="

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    if-nez p1, :cond_0

    .line 17
    const/4 v1, 0x1

    .line 18
    goto :goto_0

    .line 19
    :cond_0
    const/4 v1, 0x0

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, ", scheme="

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    const/4 v1, 0x0

    .line 29
    .line 30
    if-eqz p1, :cond_1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 34
    move-result-object v2

    .line 35
    goto :goto_1

    .line 36
    :cond_1
    move-object v2, v1

    .line 37
    .line 38
    .line 39
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v2, ", hierarchical="

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    if-eqz p1, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Landroid/net/Uri;->isHierarchical()Z

    .line 50
    move-result v2

    .line 51
    .line 52
    .line 53
    invoke-static {v2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 54
    move-result-object v2

    .line 55
    goto :goto_2

    .line 56
    :cond_2
    move-object v2, v1

    .line 57
    .line 58
    .line 59
    :goto_2
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v2, ", host="

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 65
    .line 66
    if-eqz p1, :cond_3

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 70
    move-result-object v1

    .line 71
    .line 72
    .line 73
    :cond_3
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 77
    move-result-object p1

    .line 78
    .line 79
    const-string v0, "MyKcWebView-BaseActivity"

    .line 80
    .line 81
    .line 82
    invoke-static {p1, v0}, Lqq/a;->g(Ljava/lang/String;Ljava/lang/String;)V

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

.method public final I0()V
    .locals 10

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->o:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    goto/16 :goto_4

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->o:Z

    .line 10
    .line 11
    iget-object v1, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->r:Lkotlinx/coroutines/x1;

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-static {v1, v2, v0, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 18
    .line 19
    .line 20
    :cond_1
    :try_start_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->P0()I

    .line 21
    move-result v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0, v1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->R0(I)Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    iget-object v3, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->n:Ljava/lang/String;

    .line 28
    .line 29
    .line 30
    invoke-interface {v3}, Ljava/lang/CharSequence;->length()I

    .line 31
    move-result v4

    .line 32
    .line 33
    if-nez v4, :cond_2

    .line 34
    move-object v3, v1

    .line 35
    .line 36
    .line 37
    :cond_2
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->J0()Ljava/lang/String;

    .line 38
    move-result-object v4

    .line 39
    .line 40
    const-string v5, "duration_event"

    .line 41
    .line 42
    new-instance v6, Lorg/json/JSONObject;

    .line 43
    .line 44
    .line 45
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 46
    .line 47
    const-string v7, "category"

    .line 48
    .line 49
    .line 50
    const-string/jumbo v8, "nav_bar_bg_theme_consistency"

    .line 51
    .line 52
    .line 53
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 54
    .line 55
    .line 56
    const-string/jumbo v7, "url"

    .line 57
    .line 58
    .line 59
    invoke-virtual {v6, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 60
    .line 61
    const-string v7, "host"

    .line 62
    .line 63
    .line 64
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 65
    move-result-object v8

    .line 66
    .line 67
    .line 68
    invoke-virtual {v8}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 69
    move-result-object v8
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 70
    .line 71
    const-string v9, ""

    .line 72
    .line 73
    if-nez v8, :cond_3

    .line 74
    move-object v8, v9

    .line 75
    .line 76
    .line 77
    :cond_3
    :try_start_1
    invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 78
    .line 79
    .line 80
    const-string/jumbo v7, "path"

    .line 81
    .line 82
    .line 83
    invoke-static {v4}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    .line 84
    move-result-object v4

    .line 85
    .line 86
    .line 87
    const-string/jumbo v8, "parse(...)"

    .line 88
    .line 89
    .line 90
    invoke-static {v4, v8}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 91
    .line 92
    .line 93
    invoke-virtual {p0, v4}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->E0(Landroid/net/Uri;)Ljava/lang/String;

    .line 94
    move-result-object v4

    .line 95
    .line 96
    .line 97
    invoke-virtual {v6, v7, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 98
    .line 99
    const-string v4, "appTheme"

    .line 100
    .line 101
    .line 102
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 103
    move-result-object v7

    .line 104
    .line 105
    .line 106
    invoke-virtual {v7}, Lcom/kubi/widget/web/ui/KWebContainer;->getConfig()Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 107
    move-result-object v7

    .line 108
    .line 109
    .line 110
    invoke-virtual {v7}, Lcom/kubi/widget/web/ui/KWebUIConfig;->d()Z

    .line 111
    move-result v7

    .line 112
    .line 113
    if-eqz v7, :cond_4

    .line 114
    .line 115
    const-string v7, "dark"

    .line 116
    goto :goto_0

    .line 117
    :catch_0
    move-exception v0

    .line 118
    move-object v4, v0

    .line 119
    goto :goto_3

    .line 120
    .line 121
    .line 122
    :cond_4
    const-string/jumbo v7, "light"

    .line 123
    .line 124
    .line 125
    :goto_0
    invoke-virtual {v6, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 126
    .line 127
    .line 128
    const-string/jumbo v4, "themeNavBackgroundColor"

    .line 129
    .line 130
    .line 131
    invoke-virtual {v6, v4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 132
    .line 133
    .line 134
    const-string/jumbo v4, "navBackgroundColorHistory"

    .line 135
    .line 136
    new-instance v7, Lorg/json/JSONArray;

    .line 137
    .line 138
    iget-object v8, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->m:Ljava/util/List;

    .line 139
    .line 140
    .line 141
    invoke-direct {v7, v8}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 142
    .line 143
    .line 144
    invoke-virtual {v7}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 145
    move-result-object v7

    .line 146
    .line 147
    .line 148
    invoke-virtual {v6, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 149
    .line 150
    .line 151
    const-string/jumbo v4, "navBackgroundColorLastValue"

    .line 152
    .line 153
    iget-boolean v7, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->p:Z

    .line 154
    .line 155
    if-eqz v7, :cond_5

    .line 156
    goto :goto_1

    .line 157
    :cond_5
    move-object v9, v3

    .line 158
    .line 159
    .line 160
    :goto_1
    invoke-virtual {v6, v4, v9}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 161
    .line 162
    const-string v4, "isNavigationBarTransparent"

    .line 163
    .line 164
    iget-boolean v7, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->p:Z

    .line 165
    .line 166
    .line 167
    invoke-virtual {v6, v4, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 168
    .line 169
    const-string v4, "isNavBackgroundColorConsistentWithTheme"

    .line 170
    .line 171
    iget-boolean v7, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->p:Z

    .line 172
    .line 173
    if-nez v7, :cond_7

    .line 174
    .line 175
    .line 176
    invoke-static {v3, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 177
    move-result v1

    .line 178
    .line 179
    if-eqz v1, :cond_6

    .line 180
    goto :goto_2

    .line 181
    :cond_6
    const/4 v0, 0x0

    .line 182
    .line 183
    .line 184
    :cond_7
    :goto_2
    invoke-virtual {v6, v4, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 185
    .line 186
    .line 187
    invoke-static {v5, v6}, Lqq/m;->q(Ljava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 188
    return-void

    .line 189
    .line 190
    .line 191
    :goto_3
    invoke-static {v4}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 192
    move-result v0

    .line 193
    .line 194
    if-nez v0, :cond_8

    .line 195
    .line 196
    new-instance v3, Lcom/kubi/widget/web/exception/KWebWidgetException;

    .line 197
    .line 198
    const/16 v8, 0x8

    .line 199
    const/4 v9, 0x0

    .line 200
    .line 201
    const-string v5, "MyKcWebView-BaseActivity"

    .line 202
    const/4 v6, 0x0

    .line 203
    const/4 v7, 0x0

    .line 204
    .line 205
    .line 206
    invoke-direct/range {v3 .. v9}, Lcom/kubi/widget/web/exception/KWebWidgetException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 207
    const/4 v0, 0x2

    .line 208
    .line 209
    .line 210
    invoke-static {v3, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 211
    goto :goto_4

    .line 212
    .line 213
    .line 214
    :cond_8
    invoke-static {v4}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 215
    :goto_4
    return-void
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

.method public final J0()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->getWebView()Lcom/kubi/sdk/web/KWebView;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Landroid/webkit/WebView;->getUrl()Ljava/lang/String;

    .line 14
    move-result-object v0

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    .line 18
    :goto_0
    if-eqz v0, :cond_3

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 22
    move-result v1

    .line 23
    .line 24
    if-eqz v1, :cond_1

    .line 25
    goto :goto_1

    .line 26
    .line 27
    :cond_1
    const-string v1, "about:blank"

    .line 28
    .line 29
    .line 30
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->areEqual(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 31
    move-result v1

    .line 32
    .line 33
    if-eqz v1, :cond_2

    .line 34
    goto :goto_1

    .line 35
    :cond_2
    return-object v0

    .line 36
    .line 37
    .line 38
    :cond_3
    :goto_1
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 39
    move-result-object v0

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->getConfig()Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebUIConfig;->i()Ljava/lang/String;

    .line 47
    move-result-object v0

    .line 48
    return-object v0
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

.method public final K0()V
    .locals 9

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->o:Z

    .line 3
    .line 4
    if-nez v0, :cond_2

    .line 5
    .line 6
    iget-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->q:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->r:Lkotlinx/coroutines/x1;

    .line 12
    const/4 v1, 0x0

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1, v2, v1}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    new-instance v6, Lcom/kubi/widget/web/ui/KWebBaseActivity$scheduleNavigationBarThemeConsistencyFallback$1;

    .line 25
    .line 26
    .line 27
    invoke-direct {v6, p0, v1}, Lcom/kubi/widget/web/ui/KWebBaseActivity$scheduleNavigationBarThemeConsistencyFallback$1;-><init>(Lcom/kubi/widget/web/ui/KWebBaseActivity;Lkotlin/coroutines/Continuation;)V

    .line 28
    const/4 v7, 0x3

    .line 29
    const/4 v8, 0x0

    .line 30
    const/4 v4, 0x0

    .line 31
    const/4 v5, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static/range {v3 .. v8}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    iput-object v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->r:Lkotlinx/coroutines/x1;

    .line 38
    :cond_2
    :goto_0
    return-void
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

.method public final L0(ZLjava/lang/Integer;)V
    .locals 7
    .param p2    # Ljava/lang/Integer;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-nez v0, :cond_6

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-static {v0}, Lcom/kubi/utils/extensions/c;->d(Ljava/lang/Boolean;)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    goto/16 :goto_2

    .line 31
    .line 32
    .line 33
    :cond_0
    :try_start_0
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-static {p0, v0}, Lw80/a;->a(Landroid/app/Activity;Ljava/lang/Boolean;)V

    .line 38
    const/4 v0, 0x0

    .line 39
    .line 40
    if-eqz p1, :cond_1

    .line 41
    .line 42
    sget-object p1, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 43
    .line 44
    sget p2, Lcom/kubi/widget/web/R$color;->c_transparent:I

    .line 45
    .line 46
    .line 47
    invoke-static {p0, p2}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 48
    move-result p2

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1, p0, p2}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->e(Landroid/app/Activity;I)V

    .line 52
    goto :goto_0

    .line 53
    :catch_0
    move-exception v0

    .line 54
    move-object p1, v0

    .line 55
    move-object v1, p1

    .line 56
    goto :goto_1

    .line 57
    .line 58
    :cond_1
    if-eqz p2, :cond_2

    .line 59
    .line 60
    sget-object p1, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->a:Lcom/kubi/sdk/util/EdgeToEdgeCompat;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p1, p0, p2}, Lcom/kubi/sdk/util/EdgeToEdgeCompat;->q(Landroid/app/Activity;Ljava/lang/Integer;)V

    .line 64
    .line 65
    .line 66
    :cond_2
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 67
    move-result-object p1

    .line 68
    .line 69
    if-eqz p1, :cond_4

    .line 70
    .line 71
    .line 72
    invoke-virtual {p1}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 73
    move-result-object p1

    .line 74
    .line 75
    if-eqz p1, :cond_4

    .line 76
    .line 77
    .line 78
    invoke-virtual {p0}, Landroid/app/Activity;->getWindow()Landroid/view/Window;

    .line 79
    move-result-object p2

    .line 80
    .line 81
    if-eqz p2, :cond_3

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Landroid/view/Window;->getDecorView()Landroid/view/View;

    .line 85
    move-result-object p2

    .line 86
    .line 87
    if-eqz p2, :cond_3

    .line 88
    .line 89
    .line 90
    invoke-virtual {p2}, Landroid/view/View;->getSystemUiVisibility()I

    .line 91
    move-result p2

    .line 92
    .line 93
    and-int/lit16 v0, p2, -0x405

    .line 94
    .line 95
    .line 96
    :cond_3
    invoke-virtual {p1, v0}, Landroid/view/View;->setSystemUiVisibility(I)V

    .line 97
    .line 98
    .line 99
    :cond_4
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 100
    move-result-object p1

    .line 101
    .line 102
    .line 103
    invoke-virtual {p1}, Lcom/kubi/widget/web/ui/KWebContainer;->getConfig()Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    .line 107
    invoke-virtual {p1}, Lcom/kubi/widget/web/ui/KWebUIConfig;->d()Z

    .line 108
    move-result p1

    .line 109
    .line 110
    xor-int/lit8 p1, p1, 0x1

    .line 111
    .line 112
    .line 113
    invoke-static {p0, p1}, Lcom/blankj/utilcode/util/g;->r(Landroid/app/Activity;Z)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 114
    return-void

    .line 115
    .line 116
    .line 117
    :goto_1
    invoke-static {v1}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 118
    move-result p1

    .line 119
    .line 120
    if-nez p1, :cond_5

    .line 121
    .line 122
    new-instance v0, Lcom/kubi/widget/web/exception/KWebWidgetException;

    .line 123
    .line 124
    const/16 v5, 0x8

    .line 125
    const/4 v6, 0x0

    .line 126
    .line 127
    const-string v2, "MyKcWebView-BaseActivity"

    .line 128
    const/4 v3, 0x0

    .line 129
    const/4 v4, 0x0

    .line 130
    .line 131
    .line 132
    invoke-direct/range {v0 .. v6}, Lcom/kubi/widget/web/exception/KWebWidgetException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 133
    const/4 p1, 0x2

    .line 134
    const/4 p2, 0x0

    .line 135
    .line 136
    .line 137
    invoke-static {v0, p2, p1, p2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 138
    goto :goto_2

    .line 139
    .line 140
    .line 141
    :cond_5
    invoke-static {v1}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 142
    :cond_6
    :goto_2
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
.end method

.method public final M0(Lcom/kubi/widget/web/ui/KWebContainer;)V
    .locals 1
    .param p1    # Lcom/kubi/widget/web/ui/KWebContainer;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->j:Lcom/kubi/widget/web/ui/KWebContainer;

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
.end method

.method public final N0(Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->getWebView()Lcom/kubi/sdk/web/KWebView;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p1}, Landroid/view/View;->setVerticalScrollBarEnabled(Z)V

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

.method public O0()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    new-instance v3, Lcom/kubi/widget/web/ui/KWebBaseActivity$startLoad$1;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    .line 10
    invoke-direct {v3, p0, v1}, Lcom/kubi/widget/web/ui/KWebBaseActivity$startLoad$1;-><init>(Lcom/kubi/widget/web/ui/KWebBaseActivity;Lkotlin/coroutines/Continuation;)V

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
    return-void
    .line 18
    .line 19
    .line 20
.end method

.method public final P0()I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->getConfig()Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebUIConfig;->d()Z

    .line 12
    move-result v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    sget v0, Lcom/kubi/widget/web/R$color;->kweb_background_dark:I

    .line 17
    .line 18
    .line 19
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 20
    move-result v0

    .line 21
    return v0

    .line 22
    .line 23
    :cond_0
    sget v0, Lcom/kubi/widget/web/R$color;->kweb_background_light:I

    .line 24
    .line 25
    .line 26
    invoke-static {p0, v0}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 27
    move-result v0

    .line 28
    return v0
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

.method public final Q0(Ljava/lang/String;)Ljava/lang/Integer;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    .line 11
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 12
    move-result v0

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    return-object v1

    .line 17
    :cond_0
    const/4 v0, 0x2

    .line 18
    .line 19
    const-string v2, "#"

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v2, v3, v0, v1}, Lkotlin/text/StringsKt;->startsWith$default(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/Object;)Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_1
    new-instance v0, Ljava/lang/StringBuilder;

    .line 30
    .line 31
    .line 32
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 33
    .line 34
    const/16 v4, 0x23

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 44
    move-result-object p1

    .line 45
    .line 46
    .line 47
    :goto_0
    invoke-static {p1, v2}, Lkotlin/text/StringsKt;->removePrefix(Ljava/lang/String;Ljava/lang/CharSequence;)Ljava/lang/String;

    .line 48
    move-result-object v0

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 52
    move-result v2

    .line 53
    const/4 v4, 0x6

    .line 54
    .line 55
    if-eq v2, v4, :cond_2

    .line 56
    .line 57
    .line 58
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 59
    move-result v2

    .line 60
    .line 61
    const/16 v4, 0x8

    .line 62
    .line 63
    if-eq v2, v4, :cond_2

    .line 64
    return-object v1

    .line 65
    .line 66
    .line 67
    :cond_2
    :goto_1
    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    .line 68
    move-result v2

    .line 69
    .line 70
    if-ge v3, v2, :cond_6

    .line 71
    .line 72
    .line 73
    invoke-interface {v0, v3}, Ljava/lang/CharSequence;->charAt(I)C

    .line 74
    move-result v2

    .line 75
    .line 76
    const/16 v4, 0x30

    .line 77
    .line 78
    if-gt v4, v2, :cond_3

    .line 79
    .line 80
    const/16 v4, 0x3a

    .line 81
    .line 82
    if-ge v2, v4, :cond_3

    .line 83
    goto :goto_2

    .line 84
    .line 85
    :cond_3
    const/16 v4, 0x61

    .line 86
    .line 87
    if-gt v4, v2, :cond_4

    .line 88
    .line 89
    const/16 v4, 0x67

    .line 90
    .line 91
    if-ge v2, v4, :cond_4

    .line 92
    goto :goto_2

    .line 93
    .line 94
    :cond_4
    const/16 v4, 0x41

    .line 95
    .line 96
    if-gt v4, v2, :cond_5

    .line 97
    .line 98
    const/16 v4, 0x47

    .line 99
    .line 100
    if-ge v2, v4, :cond_5

    .line 101
    .line 102
    :goto_2
    add-int/lit8 v3, v3, 0x1

    .line 103
    goto :goto_1

    .line 104
    :cond_5
    return-object v1

    .line 105
    .line 106
    .line 107
    :cond_6
    :try_start_0
    invoke-static {p1}, Landroid/graphics/Color;->parseColor(Ljava/lang/String;)I

    .line 108
    move-result p1

    .line 109
    .line 110
    .line 111
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 112
    move-result-object p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 113
    return-object p1

    .line 114
    :catch_0
    return-object v1
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
.end method

.method public final R0(I)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lkotlin/jvm/internal/StringCompanionObject;->INSTANCE:Lkotlin/jvm/internal/StringCompanionObject;

    .line 3
    .line 4
    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 5
    .line 6
    .line 7
    invoke-static {p1}, Landroid/graphics/Color;->red(I)I

    .line 8
    move-result v1

    .line 9
    .line 10
    .line 11
    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-static {p1}, Landroid/graphics/Color;->green(I)I

    .line 16
    move-result v2

    .line 17
    .line 18
    .line 19
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-static {p1}, Landroid/graphics/Color;->blue(I)I

    .line 24
    move-result p1

    .line 25
    .line 26
    .line 27
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 28
    move-result-object p1

    .line 29
    .line 30
    .line 31
    filled-new-array {v1, v2, p1}, [Ljava/lang/Object;

    .line 32
    move-result-object p1

    .line 33
    const/4 v1, 0x3

    .line 34
    .line 35
    .line 36
    invoke-static {p1, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    .line 37
    move-result-object p1

    .line 38
    .line 39
    const-string v1, "#%02X%02X%02X"

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    const-string v0, "format(...)"

    .line 46
    .line 47
    .line 48
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 49
    return-object p1
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

.method public e0(Lcom/kubi/sdk/web/KWebView;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/web/KWebView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "webView"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    sget-object v0, Ls80/a;->a:Ls80/a;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, p1, p0}, Ls80/a;->b(Lcom/kubi/sdk/web/KWebView;Lcom/kubi/sdk/BaseActivity;)V

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
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

.method public final f0()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lw80/d;->a:Lw80/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Lcom/kubi/widget/web/ui/KWebContainer;->getConfig()Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-virtual {v3}, Lcom/kubi/widget/web/ui/KWebUIConfig;->i()Ljava/lang/String;

    .line 22
    move-result-object v3

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1, v2, v3}, Lw80/d;->a(Lcom/kubi/resources/widget/NavigationBar;Lcom/kubi/widget/web/ui/KWebContainer;Ljava/lang/String;)V

    .line 26
    return-void
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

.method public final g0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "source"

    .line 4
    .line 5
    .line 6
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->p:Z

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    return-void

    .line 12
    :cond_0
    const/4 v0, 0x0

    .line 13
    .line 14
    if-eqz p1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-static {p1}, Lkotlin/text/StringsKt;->trim(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 22
    move-result-object p1

    .line 23
    goto :goto_0

    .line 24
    :cond_1
    move-object p1, v0

    .line 25
    .line 26
    :goto_0
    if-nez p1, :cond_2

    .line 27
    .line 28
    const-string p1, ""

    .line 29
    .line 30
    .line 31
    :cond_2
    invoke-interface {p1}, Ljava/lang/CharSequence;->length()I

    .line 32
    move-result v1

    .line 33
    .line 34
    if-nez v1, :cond_3

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v0, p2}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->i0(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    return-void

    .line 39
    .line 40
    .line 41
    :cond_3
    invoke-virtual {p0, p1, p2}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->i0(Ljava/lang/String;Ljava/lang/String;)V

    .line 42
    return-void
    .line 43
    .line 44
    .line 45
.end method

.method public final getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->k:Lcom/kubi/resources/widget/NavigationBar;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    .line 8
    :cond_0
    const-string/jumbo v0, "navigationBar"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public final h0(ZZ)V
    .locals 6

    .line 1
    .line 2
    iput-boolean p1, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->p:Z

    .line 3
    .line 4
    new-instance v0, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v1, "applyNavigationBarTransparent transparent="

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string v1, " hideNavigationBar="

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string v1, " titleBarVisibility="

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseActivity;->getTitleBar()Lcom/kubi/sdk/widget/TitleBar;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Landroid/view/View;->getVisibility()I

    .line 36
    move-result v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 40
    .line 41
    const-string v1, " titleBarShown="

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseActivity;->getTitleBar()Lcom/kubi/sdk/widget/TitleBar;

    .line 48
    move-result-object v2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Landroid/view/View;->isShown()Z

    .line 52
    move-result v2

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v2, " navVisibility="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 64
    move-result-object v3

    .line 65
    .line 66
    .line 67
    invoke-virtual {v3}, Landroid/view/View;->getVisibility()I

    .line 68
    move-result v3

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    const-string v3, " navShown="

    .line 74
    .line 75
    .line 76
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 80
    move-result-object v4

    .line 81
    .line 82
    .line 83
    invoke-virtual {v4}, Landroid/view/View;->isShown()Z

    .line 84
    move-result v4

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    move-result-object v0

    .line 92
    .line 93
    const-string v4, "MyKcWebView-BaseActivity"

    .line 94
    .line 95
    .line 96
    invoke-static {v4, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 97
    .line 98
    const-string v0, "applyNavigationBarTransparent result titleBarVisibility="

    .line 99
    .line 100
    if-eqz p1, :cond_1

    .line 101
    const/4 p1, 0x1

    .line 102
    const/4 v5, 0x0

    .line 103
    .line 104
    .line 105
    invoke-virtual {p0, p1, v5}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->L0(ZLjava/lang/Integer;)V

    .line 106
    .line 107
    .line 108
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 109
    move-result-object p1

    .line 110
    .line 111
    sget v5, Lcom/kubi/widget/web/R$color;->c_transparent:I

    .line 112
    .line 113
    .line 114
    invoke-static {p0, v5}, Landroidx/core/content/ContextCompat;->getColor(Landroid/content/Context;I)I

    .line 115
    move-result v5

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1, v5}, Lcom/kubi/resources/widget/NavigationBar;->setBackGroundColor(I)V

    .line 119
    .line 120
    if-eqz p2, :cond_0

    .line 121
    .line 122
    .line 123
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 124
    move-result-object p1

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1}, Lcom/kubi/resources/widget/NavigationBar;->c()V

    .line 128
    goto :goto_0

    .line 129
    .line 130
    .line 131
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 132
    move-result-object p1

    .line 133
    .line 134
    .line 135
    invoke-virtual {p1}, Lcom/kubi/resources/widget/NavigationBar;->j()V

    .line 136
    .line 137
    :goto_0
    new-instance p1, Ljava/lang/StringBuilder;

    .line 138
    .line 139
    .line 140
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseActivity;->getTitleBar()Lcom/kubi/sdk/widget/TitleBar;

    .line 147
    move-result-object p2

    .line 148
    .line 149
    .line 150
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 151
    move-result p2

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    .line 160
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseActivity;->getTitleBar()Lcom/kubi/sdk/widget/TitleBar;

    .line 161
    move-result-object p2

    .line 162
    .line 163
    .line 164
    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    .line 165
    move-result p2

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 169
    .line 170
    .line 171
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 172
    .line 173
    .line 174
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 175
    move-result-object p2

    .line 176
    .line 177
    .line 178
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 179
    move-result p2

    .line 180
    .line 181
    .line 182
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 186
    .line 187
    .line 188
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 189
    move-result-object p2

    .line 190
    .line 191
    .line 192
    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    .line 193
    move-result p2

    .line 194
    .line 195
    .line 196
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 197
    .line 198
    .line 199
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 200
    move-result-object p1

    .line 201
    .line 202
    .line 203
    invoke-static {v4, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 204
    return-void

    .line 205
    .line 206
    .line 207
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 208
    move-result-object p1

    .line 209
    .line 210
    .line 211
    invoke-virtual {p1}, Lcom/kubi/resources/widget/NavigationBar;->j()V

    .line 212
    .line 213
    new-instance p1, Ljava/lang/StringBuilder;

    .line 214
    .line 215
    .line 216
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 217
    .line 218
    .line 219
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseActivity;->getTitleBar()Lcom/kubi/sdk/widget/TitleBar;

    .line 223
    move-result-object p2

    .line 224
    .line 225
    .line 226
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 227
    move-result p2

    .line 228
    .line 229
    .line 230
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 231
    .line 232
    .line 233
    invoke-virtual {p1, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0}, Lcom/kubi/sdk/BaseActivity;->getTitleBar()Lcom/kubi/sdk/widget/TitleBar;

    .line 237
    move-result-object p2

    .line 238
    .line 239
    .line 240
    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    .line 241
    move-result p2

    .line 242
    .line 243
    .line 244
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 245
    .line 246
    .line 247
    invoke-virtual {p1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 248
    .line 249
    .line 250
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 251
    move-result-object p2

    .line 252
    .line 253
    .line 254
    invoke-virtual {p2}, Landroid/view/View;->getVisibility()I

    .line 255
    move-result p2

    .line 256
    .line 257
    .line 258
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 259
    .line 260
    .line 261
    invoke-virtual {p1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 262
    .line 263
    .line 264
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 265
    move-result-object p2

    .line 266
    .line 267
    .line 268
    invoke-virtual {p2}, Landroid/view/View;->isShown()Z

    .line 269
    move-result p2

    .line 270
    .line 271
    .line 272
    invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 273
    .line 274
    .line 275
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 276
    move-result-object p1

    .line 277
    .line 278
    .line 279
    invoke-static {v4, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 280
    return-void
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
.end method

.method public final i0(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->p:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    if-eqz p1, :cond_1

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->Q0(Ljava/lang/String;)Ljava/lang/Integer;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    if-eqz p1, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    .line 17
    move-result p1

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_1
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->P0()I

    .line 22
    move-result p1

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lcom/kubi/resources/widget/NavigationBar;->setBackGroundColor(I)V

    .line 30
    .line 31
    .line 32
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 33
    move-result-object v0

    .line 34
    const/4 v1, 0x0

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0, v1, v0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->L0(ZLjava/lang/Integer;)V

    .line 38
    .line 39
    .line 40
    invoke-virtual {p0, p1, p2}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->G0(ILjava/lang/String;)V

    .line 41
    return-void
    .line 42
    .line 43
    .line 44
    .line 45
.end method

.method public final j0()V
    .locals 8

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->getConfig()Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebUIConfig;->g()Z

    .line 12
    move-result v1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 13
    .line 14
    const-string v2, "MyKcWebView-BaseActivity"

    .line 15
    .line 16
    if-eqz v1, :cond_0

    .line 17
    const/4 v1, 0x1

    .line 18
    .line 19
    .line 20
    :try_start_1
    invoke-virtual {p0, v1, v1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->h0(ZZ)V

    .line 21
    .line 22
    new-instance v1, Ljava/lang/StringBuilder;

    .line 23
    .line 24
    .line 25
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 26
    .line 27
    const-string v3, "applyUrlNavigationBarStyle transparent=true url="

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebUIConfig;->i()Ljava/lang/String;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object v0

    .line 42
    .line 43
    .line 44
    invoke-static {v2, v0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 45
    return-void

    .line 46
    :catch_0
    move-exception v0

    .line 47
    move-object v2, v0

    .line 48
    goto :goto_0

    .line 49
    :cond_0
    const/4 v1, 0x0

    .line 50
    .line 51
    iput-boolean v1, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->p:Z

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {v1}, Lcom/kubi/resources/widget/NavigationBar;->j()V

    .line 59
    .line 60
    new-instance v1, Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 64
    .line 65
    const-string v3, "applyUrlNavigationBarStyle transparent=false navBackgroundColor="

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebUIConfig;->e()Ljava/lang/String;

    .line 72
    move-result-object v3

    .line 73
    .line 74
    .line 75
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    const-string v3, " url="

    .line 78
    .line 79
    .line 80
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 81
    .line 82
    .line 83
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebUIConfig;->i()Ljava/lang/String;

    .line 84
    move-result-object v3

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    .line 90
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 91
    move-result-object v1

    .line 92
    .line 93
    .line 94
    invoke-static {v2, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebUIConfig;->e()Ljava/lang/String;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    if-eqz v0, :cond_2

    .line 101
    .line 102
    .line 103
    const-string/jumbo v1, "urlQuery"

    .line 104
    .line 105
    .line 106
    invoke-virtual {p0, v0, v1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->g0(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 107
    return-void

    .line 108
    .line 109
    .line 110
    :goto_0
    invoke-static {v2}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 111
    move-result v0

    .line 112
    .line 113
    if-nez v0, :cond_1

    .line 114
    .line 115
    new-instance v1, Lcom/kubi/widget/web/exception/KWebWidgetException;

    .line 116
    .line 117
    const/16 v6, 0x8

    .line 118
    const/4 v7, 0x0

    .line 119
    .line 120
    const-string v3, "MyKcWebView-BaseActivity"

    .line 121
    const/4 v4, 0x0

    .line 122
    const/4 v5, 0x0

    .line 123
    .line 124
    .line 125
    invoke-direct/range {v1 .. v7}, Lcom/kubi/widget/web/exception/KWebWidgetException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 126
    const/4 v0, 0x2

    .line 127
    const/4 v2, 0x0

    .line 128
    .line 129
    .line 130
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 131
    goto :goto_1

    .line 132
    .line 133
    .line 134
    :cond_1
    invoke-static {v2}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 135
    :cond_2
    :goto_1
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

.method public final k0(Landroid/net/Uri;)V
    .locals 3

    .line 1
    .line 2
    const-string v0, "fullScreen"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-virtual {p1, v0, v1}, Landroid/net/Uri;->getBooleanQueryParameter(Ljava/lang/String;Z)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    new-instance v1, Ljava/lang/StringBuilder;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 13
    .line 14
    const-string v2, "dealFullScreen fullScreen="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v2, " url="

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 32
    move-result-object p1

    .line 33
    .line 34
    const-string v1, "MyKcWebView-BaseActivity"

    .line 35
    .line 36
    .line 37
    invoke-static {v1, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 38
    .line 39
    if-eqz v0, :cond_0

    .line 40
    const/4 p1, 0x1

    .line 41
    .line 42
    .line 43
    invoke-virtual {p0, p1, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->h0(ZZ)V

    .line 44
    :cond_0
    return-void
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

.method public final l0()Lcom/kubi/widget/web/ui/KWebContainer;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->j:Lcom/kubi/widget/web/ui/KWebContainer;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    .line 8
    :cond_0
    const-string/jumbo v0, "webContainer"

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lkotlin/jvm/internal/Intrinsics;->throwUninitializedPropertyAccessException(Ljava/lang/String;)V

    .line 12
    const/4 v0, 0x0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public m0()Lcom/kubi/widget/web/ui/KWebUIConfig;
    .locals 4
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

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
    const/4 v1, 0x0

    .line 10
    .line 11
    const-string v2, "MyKcWebView-BaseActivity"

    .line 12
    .line 13
    if-eqz v0, :cond_2

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Landroid/os/BaseBundle;->isEmpty()Z

    .line 17
    move-result v3

    .line 18
    .line 19
    if-eqz v3, :cond_0

    .line 20
    goto :goto_0

    .line 21
    .line 22
    :cond_0
    sget-object v3, Lcom/kubi/widget/web/ui/KWebUIConfig;->m:Lcom/kubi/widget/web/ui/KWebUIConfig$Companion;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v3, v0}, Lcom/kubi/widget/web/ui/KWebUIConfig$Companion;->fromBundle(Landroid/os/Bundle;)Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    if-nez v0, :cond_1

    .line 29
    .line 30
    .line 31
    const-string/jumbo v0, "webContainer bundle error"

    .line 32
    .line 33
    .line 34
    invoke-static {v2, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 38
    return-object v1

    .line 39
    :cond_1
    return-object v0

    .line 40
    .line 41
    .line 42
    :cond_2
    :goto_0
    const-string/jumbo v0, "webContainer bundle empty"

    .line 43
    .line 44
    .line 45
    invoke-static {v2, v0}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 46
    return-object v1
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

.method public final n0()Lcom/kubi/sdk/web/KWebView;
    .locals 9
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 1
    .line 2
    .line 3
    :try_start_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->getWebView()Lcom/kubi/sdk/web/KWebView;

    .line 8
    move-result-object v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 9
    return-object v0

    .line 10
    :catch_0
    move-exception v0

    .line 11
    move-object v2, v0

    .line 12
    .line 13
    .line 14
    invoke-static {v2}, Lny/b;->e(Ljava/lang/Throwable;)Z

    .line 15
    move-result v0

    .line 16
    const/4 v8, 0x0

    .line 17
    .line 18
    if-nez v0, :cond_0

    .line 19
    .line 20
    new-instance v1, Lcom/kubi/widget/web/exception/KWebWidgetException;

    .line 21
    .line 22
    const/16 v6, 0x8

    .line 23
    const/4 v7, 0x0

    .line 24
    .line 25
    const-string v3, "MyKcWebView-BaseActivity"

    .line 26
    const/4 v4, 0x0

    .line 27
    const/4 v5, 0x0

    .line 28
    .line 29
    .line 30
    invoke-direct/range {v1 .. v7}, Lcom/kubi/widget/web/exception/KWebWidgetException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 31
    const/4 v0, 0x2

    .line 32
    .line 33
    .line 34
    invoke-static {v1, v8, v0, v8}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 35
    goto :goto_0

    .line 36
    .line 37
    .line 38
    :cond_0
    invoke-static {v2}, Lro/b;->h(Ljava/lang/Throwable;)V

    .line 39
    :goto_0
    return-object v8
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

.method public final o0(Lcom/kubi/resources/widget/NavigationBar;)V
    .locals 17

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move-object/from16 v1, p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {v2}, Lcom/kubi/widget/web/ui/KWebContainer;->getConfig()Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 12
    move-result-object v2

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lcom/kubi/widget/web/ui/KWebUIConfig;->j()Ljava/lang/String;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1, v2}, Lcom/kubi/resources/widget/NavigationBar;->setMainTitle(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 23
    move-result-object v2

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/kubi/widget/web/ui/KWebContainer;->getWebView()Lcom/kubi/sdk/web/KWebView;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    if-nez v2, :cond_0

    .line 30
    goto :goto_0

    .line 31
    .line 32
    :cond_0
    new-instance v3, Lcom/kubi/widget/web/ui/g;

    .line 33
    .line 34
    .line 35
    invoke-direct {v3, v0}, Lcom/kubi/widget/web/ui/g;-><init>(Lcom/kubi/widget/web/ui/KWebBaseActivity;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v3}, Lcom/kubi/resources/widget/NavigationBar;->setLeftOnclickListener(Landroid/view/View$OnClickListener;)V

    .line 39
    .line 40
    const/16 v3, 0x2d

    .line 41
    .line 42
    .line 43
    invoke-static {v3}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 44
    move-result v3

    .line 45
    .line 46
    const/16 v4, 0xd

    .line 47
    .line 48
    .line 49
    invoke-static {v4}, Lcom/kubi/utils/extensions/e;->b(I)I

    .line 50
    move-result v4

    .line 51
    .line 52
    .line 53
    invoke-virtual {v1}, Lcom/kubi/resources/widget/NavigationBar;->getRightOne()Landroid/widget/ImageView;

    .line 54
    move-result-object v5

    .line 55
    .line 56
    if-eqz v5, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 60
    move-result-object v6

    .line 61
    .line 62
    iput v3, v6, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 63
    .line 64
    .line 65
    invoke-virtual {v5}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 66
    move-result-object v6

    .line 67
    .line 68
    iput v3, v6, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 69
    .line 70
    .line 71
    invoke-virtual {v5, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 72
    .line 73
    new-instance v8, Lcom/kubi/widget/web/ui/h;

    .line 74
    .line 75
    .line 76
    invoke-direct {v8, v2}, Lcom/kubi/widget/web/ui/h;-><init>(Lcom/kubi/sdk/web/KWebView;)V

    .line 77
    const/4 v9, 0x1

    .line 78
    const/4 v10, 0x0

    .line 79
    .line 80
    const-wide/16 v6, 0x0

    .line 81
    .line 82
    .line 83
    invoke-static/range {v5 .. v10}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 84
    .line 85
    .line 86
    :cond_1
    invoke-virtual {v1}, Lcom/kubi/resources/widget/NavigationBar;->getRightTwo()Landroid/widget/ImageView;

    .line 87
    move-result-object v11

    .line 88
    .line 89
    if-eqz v11, :cond_2

    .line 90
    .line 91
    .line 92
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 93
    move-result-object v5

    .line 94
    .line 95
    iput v3, v5, Landroid/view/ViewGroup$LayoutParams;->width:I

    .line 96
    .line 97
    .line 98
    invoke-virtual {v11}, Landroid/view/View;->getLayoutParams()Landroid/view/ViewGroup$LayoutParams;

    .line 99
    move-result-object v5

    .line 100
    .line 101
    iput v3, v5, Landroid/view/ViewGroup$LayoutParams;->height:I

    .line 102
    .line 103
    .line 104
    invoke-virtual {v11, v4, v4, v4, v4}, Landroid/view/View;->setPadding(IIII)V

    .line 105
    .line 106
    new-instance v14, Lcom/kubi/widget/web/ui/i;

    .line 107
    .line 108
    .line 109
    invoke-direct {v14, v2}, Lcom/kubi/widget/web/ui/i;-><init>(Lcom/kubi/sdk/web/KWebView;)V

    .line 110
    const/4 v15, 0x1

    .line 111
    .line 112
    const/16 v16, 0x0

    .line 113
    .line 114
    const-wide/16 v12, 0x0

    .line 115
    .line 116
    .line 117
    invoke-static/range {v11 .. v16}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 118
    .line 119
    .line 120
    :cond_2
    invoke-virtual {v1}, Lcom/kubi/resources/widget/NavigationBar;->getRightThree()Landroid/widget/ImageView;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    if-eqz v3, :cond_3

    .line 124
    .line 125
    sget v4, Lcom/kubi/widget/web/R$drawable;->ic_close_24:I

    .line 126
    .line 127
    .line 128
    invoke-virtual {v3, v4}, Landroid/widget/ImageView;->setImageResource(I)V

    .line 129
    .line 130
    .line 131
    :cond_3
    invoke-virtual {v1}, Lcom/kubi/resources/widget/NavigationBar;->getRightThree()Landroid/widget/ImageView;

    .line 132
    move-result-object v5

    .line 133
    .line 134
    if-eqz v5, :cond_4

    .line 135
    .line 136
    new-instance v8, Lcom/kubi/widget/web/ui/j;

    .line 137
    .line 138
    .line 139
    invoke-direct {v8, v2, v0}, Lcom/kubi/widget/web/ui/j;-><init>(Lcom/kubi/sdk/web/KWebView;Lcom/kubi/widget/web/ui/KWebBaseActivity;)V

    .line 140
    const/4 v9, 0x1

    .line 141
    const/4 v10, 0x0

    .line 142
    .line 143
    const-wide/16 v6, 0x0

    .line 144
    .line 145
    .line 146
    invoke-static/range {v5 .. v10}, Lcom/kubi/utils/extensions/k;->z(Landroid/view/View;JLkotlin/jvm/functions/Function0;ILjava/lang/Object;)V

    .line 147
    :cond_4
    :goto_0
    return-void
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

.method public onActivityResult(IILandroid/content/Intent;Landroid/app/ComponentCaller;)V
    .locals 1
    .param p3    # Landroid/content/Intent;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param
    .param p4    # Landroid/app/ComponentCaller;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "caller"

    .line 3
    .line 4
    .line 5
    invoke-static {p4, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-super {p0, p1, p2, p3, p4}, Landroid/app/Activity;->onActivityResult(IILandroid/content/Intent;Landroid/app/ComponentCaller;)V

    .line 9
    .line 10
    iget-object p4, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->i:Ljava/util/Set;

    .line 11
    .line 12
    .line 13
    invoke-static {p4}, Lkotlin/collections/CollectionsKt;->toList(Ljava/lang/Iterable;)Ljava/util/List;

    .line 14
    move-result-object p4

    .line 15
    .line 16
    .line 17
    invoke-interface {p4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 18
    move-result-object p4

    .line 19
    .line 20
    .line 21
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    check-cast v0, Lcom/kubi/widget/web/ui/b;

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, p1, p2, p3}, Lcom/kubi/widget/web/ui/b;->onActivityResult(IILandroid/content/Intent;)V

    .line 34
    goto :goto_0

    .line 35
    :cond_0
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
.end method

.method public onBackPressed()V
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/sdk/applet/IAppletService;->a:Lcom/kubi/sdk/applet/IAppletService$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/sdk/applet/IAppletService$Companion;->get()Lcom/kubi/sdk/applet/IAppletService;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    new-instance v1, Lcom/kubi/widget/web/ui/c;

    .line 9
    .line 10
    .line 11
    invoke-direct {v1, p0}, Lcom/kubi/widget/web/ui/c;-><init>(Lcom/kubi/widget/web/ui/KWebBaseActivity;)V

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, p0, v1}, Lcom/kubi/sdk/applet/IAppletService;->d(Landroidx/fragment/app/FragmentActivity;Lkotlin/jvm/functions/Function0;)V

    .line 15
    return-void
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public onCreate(Landroid/os/Bundle;)V
    .locals 7
    .param p1    # Landroid/os/Bundle;
        .annotation build Lorg/jetbrains/annotations/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lcom/kubi/sdk/BaseActivity;->onCreate(Landroid/os/Bundle;)V

    .line 4
    .line 5
    new-instance p1, Ljava/lang/StringBuilder;

    .line 6
    .line 7
    .line 8
    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "onCreate activity="

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object p1

    .line 30
    .line 31
    const-string v0, "MyKcWebView-BaseActivity"

    .line 32
    .line 33
    .line 34
    invoke-static {v0, p1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    new-instance v4, Lcom/kubi/widget/web/ui/KWebBaseActivity$onCreate$1;

    .line 41
    const/4 p1, 0x0

    .line 42
    .line 43
    .line 44
    invoke-direct {v4, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity$onCreate$1;-><init>(Lkotlin/coroutines/Continuation;)V

    .line 45
    const/4 v5, 0x3

    .line 46
    const/4 v6, 0x0

    .line 47
    const/4 v2, 0x0

    .line 48
    const/4 v3, 0x0

    .line 49
    .line 50
    .line 51
    invoke-static/range {v1 .. v6}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 52
    .line 53
    sget p1, Lcom/kubi/widget/web/R$layout;->kweb_activity_webview:I

    .line 54
    .line 55
    .line 56
    invoke-virtual {p0, p1}, Lcom/kubi/sdk/BaseActivity;->setContentView(I)V

    .line 57
    .line 58
    sget p1, Lcom/kubi/widget/web/R$id;->web_container:I

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 62
    move-result-object p1

    .line 63
    .line 64
    const-string v1, "findViewById(...)"

    .line 65
    .line 66
    .line 67
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 68
    .line 69
    check-cast p1, Lcom/kubi/widget/web/ui/KWebContainer;

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->M0(Lcom/kubi/widget/web/ui/KWebContainer;)V

    .line 73
    .line 74
    sget p1, Lcom/kubi/widget/web/R$id;->navigation_bar:I

    .line 75
    .line 76
    .line 77
    invoke-virtual {p0, p1}, Landroidx/appcompat/app/AppCompatActivity;->findViewById(I)Landroid/view/View;

    .line 78
    move-result-object p1

    .line 79
    .line 80
    .line 81
    invoke-static {p1, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 82
    .line 83
    check-cast p1, Lcom/kubi/resources/widget/NavigationBar;

    .line 84
    .line 85
    iput-object p1, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->k:Lcom/kubi/resources/widget/NavigationBar;

    .line 86
    .line 87
    .line 88
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    new-instance v1, Lcom/kubi/widget/web/ui/d;

    .line 92
    .line 93
    .line 94
    invoke-direct {v1, p0}, Lcom/kubi/widget/web/ui/d;-><init>(Lcom/kubi/widget/web/ui/KWebBaseActivity;)V

    .line 95
    .line 96
    .line 97
    invoke-virtual {p1, v1}, Lcom/kubi/widget/web/ui/KWebContainer;->setOnReload$LWebWidget_googleRelease(Lkotlin/jvm/functions/Function0;)V

    .line 98
    .line 99
    .line 100
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 101
    move-result-object p1

    .line 102
    .line 103
    .line 104
    invoke-virtual {p1}, Lcom/kubi/widget/web/ui/KWebContainer;->getWebView()Lcom/kubi/sdk/web/KWebView;

    .line 105
    move-result-object p1

    .line 106
    .line 107
    if-eqz p1, :cond_0

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->u0(Lcom/kubi/sdk/web/KWebView;)V

    .line 111
    .line 112
    .line 113
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->m0()Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    if-nez p1, :cond_1

    .line 117
    .line 118
    .line 119
    const-string/jumbo p1, "webContainer bundle error"

    .line 120
    .line 121
    .line 122
    invoke-static {v0, p1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 126
    return-void

    .line 127
    .line 128
    .line 129
    :cond_1
    invoke-virtual {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->w0(Lcom/kubi/widget/web/ui/KWebUIConfig;)Z

    .line 130
    move-result v1

    .line 131
    .line 132
    if-nez v1, :cond_2

    .line 133
    .line 134
    .line 135
    invoke-virtual {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->H0(Lcom/kubi/widget/web/ui/KWebUIConfig;)V

    .line 136
    .line 137
    .line 138
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 139
    return-void

    .line 140
    .line 141
    :cond_2
    new-instance v1, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    .line 144
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 145
    .line 146
    const-string v2, "WebView begin, url is: \n"

    .line 147
    .line 148
    .line 149
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    .line 152
    invoke-virtual {p1}, Lcom/kubi/widget/web/ui/KWebUIConfig;->i()Ljava/lang/String;

    .line 153
    move-result-object v2

    .line 154
    .line 155
    .line 156
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 157
    .line 158
    const/16 v2, 0xa

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 162
    .line 163
    .line 164
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 165
    move-result-object v1

    .line 166
    .line 167
    .line 168
    invoke-static {v0, v1}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 169
    .line 170
    .line 171
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 172
    move-result-object v1

    .line 173
    .line 174
    .line 175
    invoke-virtual {v1, p1}, Lcom/kubi/widget/web/ui/KWebContainer;->Q(Lcom/kubi/widget/web/ui/KWebUIConfig;)Z

    .line 176
    move-result v1

    .line 177
    .line 178
    if-nez v1, :cond_3

    .line 179
    .line 180
    .line 181
    const-string/jumbo p1, "webContainer updateConfig failed"

    .line 182
    .line 183
    .line 184
    invoke-static {v0, p1}, Lro/b;->e(Ljava/lang/String;Ljava/lang/String;)V

    .line 185
    .line 186
    .line 187
    invoke-virtual {p0}, Landroid/app/Activity;->finish()V

    .line 188
    return-void

    .line 189
    .line 190
    .line 191
    :cond_3
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 192
    move-result-object v0

    .line 193
    .line 194
    new-instance v1, Lcom/kubi/widget/web/ui/e;

    .line 195
    .line 196
    .line 197
    invoke-direct {v1, p0}, Lcom/kubi/widget/web/ui/e;-><init>(Lcom/kubi/widget/web/ui/KWebBaseActivity;)V

    .line 198
    .line 199
    .line 200
    invoke-virtual {v0, v1}, Lcom/kubi/widget/web/ui/KWebContainer;->setOnLoadSuccess$LWebWidget_googleRelease(Lkotlin/jvm/functions/Function0;)V

    .line 201
    .line 202
    .line 203
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 204
    move-result-object v0

    .line 205
    .line 206
    new-instance v1, Lcom/kubi/widget/web/ui/f;

    .line 207
    .line 208
    .line 209
    invoke-direct {v1, p0}, Lcom/kubi/widget/web/ui/f;-><init>(Lcom/kubi/widget/web/ui/KWebBaseActivity;)V

    .line 210
    .line 211
    .line 212
    invoke-virtual {v0, v1}, Lcom/kubi/widget/web/ui/KWebContainer;->setOnPageMount$LWebWidget_googleRelease(Lkotlin/jvm/functions/Function0;)V

    .line 213
    .line 214
    .line 215
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 216
    move-result-object v0

    .line 217
    .line 218
    .line 219
    invoke-virtual {v0, p0}, Lcom/kubi/widget/web/ui/KWebContainer;->y(Lcom/kubi/sdk/BaseActivity;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->getNavigationBar()Lcom/kubi/resources/widget/NavigationBar;

    .line 223
    move-result-object v0

    .line 224
    .line 225
    .line 226
    invoke-virtual {p0, v0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->o0(Lcom/kubi/resources/widget/NavigationBar;)V

    .line 227
    .line 228
    .line 229
    invoke-virtual {p1}, Lcom/kubi/widget/web/ui/KWebUIConfig;->b()Z

    .line 230
    move-result p1

    .line 231
    .line 232
    if-nez p1, :cond_4

    .line 233
    const/4 p1, 0x0

    .line 234
    .line 235
    .line 236
    invoke-virtual {p0, p1, p1}, Landroid/app/Activity;->overridePendingTransition(II)V

    .line 237
    .line 238
    .line 239
    :cond_4
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->F0()V

    .line 240
    .line 241
    .line 242
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->j0()V

    .line 243
    .line 244
    .line 245
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 246
    move-result-object p1

    .line 247
    .line 248
    .line 249
    invoke-virtual {p1}, Lcom/kubi/widget/web/ui/KWebContainer;->getConfig()Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 250
    move-result-object p1

    .line 251
    .line 252
    .line 253
    invoke-virtual {p1}, Lcom/kubi/widget/web/ui/KWebUIConfig;->h()Landroid/net/Uri;

    .line 254
    move-result-object p1

    .line 255
    .line 256
    .line 257
    invoke-virtual {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->k0(Landroid/net/Uri;)V

    .line 258
    .line 259
    .line 260
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->f0()V

    .line 261
    .line 262
    .line 263
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->O0()V

    .line 264
    return-void
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
.end method

.method public onDestroy()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->r:Lkotlinx/coroutines/x1;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x1

    .line 6
    const/4 v2, 0x0

    .line 7
    .line 8
    .line 9
    invoke-static {v0, v2, v1, v2}, Lkotlinx/coroutines/x1$a;->a(Lkotlinx/coroutines/x1;Ljava/util/concurrent/CancellationException;ILjava/lang/Object;)V

    .line 10
    .line 11
    :cond_0
    iget-object v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->i:Ljava/util/Set;

    .line 12
    .line 13
    .line 14
    invoke-interface {v0}, Ljava/util/Set;->clear()V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Lcom/kubi/sdk/BaseActivity;->onDestroy()V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->v0()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 27
    move-result-object v0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->J()V

    .line 31
    :cond_1
    return-void
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

.method public onPause()V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseActivity;->onPause()V

    .line 4
    .line 5
    const-string v0, "android_webview_fix_crash_test"

    .line 6
    const/4 v1, 0x0

    .line 7
    .line 8
    :try_start_0
    sget-object v2, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 9
    .line 10
    new-instance v2, Lcom/kubi/widget/web/ui/KWebBaseActivity$a;

    .line 11
    .line 12
    .line 13
    invoke-direct {v2}, Lcom/kubi/widget/web/ui/KWebBaseActivity$a;-><init>()V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v2}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 17
    move-result-object v2

    .line 18
    .line 19
    .line 20
    const-string/jumbo v3, "object : TypeToken<T>() {}.type"

    .line 21
    .line 22
    .line 23
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v2}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 27
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    goto :goto_0

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    move-object v3, v0

    .line 31
    .line 32
    new-instance v2, Lcom/kubi/config/exception/KCConfigException;

    .line 33
    .line 34
    const/16 v7, 0x8

    .line 35
    const/4 v8, 0x0

    .line 36
    .line 37
    const-string v4, "RemoteConfig"

    .line 38
    const/4 v5, 0x0

    .line 39
    const/4 v6, 0x0

    .line 40
    .line 41
    .line 42
    invoke-direct/range {v2 .. v8}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 43
    const/4 v0, 0x2

    .line 44
    .line 45
    .line 46
    invoke-static {v2, v1, v0, v1}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 47
    move-object v0, v1

    .line 48
    .line 49
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 50
    const/4 v2, 0x1

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v2}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 54
    move-result v0

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Landroid/app/Activity;->isFinishing()Z

    .line 60
    move-result v0

    .line 61
    .line 62
    if-nez v0, :cond_1

    .line 63
    .line 64
    .line 65
    invoke-virtual {p0}, Landroid/app/Activity;->isDestroyed()Z

    .line 66
    move-result v0

    .line 67
    .line 68
    if-nez v0, :cond_1

    .line 69
    .line 70
    .line 71
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 72
    move-result-object v0

    .line 73
    .line 74
    .line 75
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->m()Z

    .line 76
    move-result v0

    .line 77
    .line 78
    if-eqz v0, :cond_1

    .line 79
    .line 80
    .line 81
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 82
    move-result-object v0

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->getWebView()Lcom/kubi/sdk/web/KWebView;

    .line 86
    move-result-object v0

    .line 87
    .line 88
    if-eqz v0, :cond_1

    .line 89
    .line 90
    .line 91
    invoke-static {v0}, Lcom/kubi/widget/web/helper/m;->a(Lcom/kubi/sdk/web/KWebView;)V

    .line 92
    goto :goto_1

    .line 93
    .line 94
    .line 95
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    .line 99
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->getWebView()Lcom/kubi/sdk/web/KWebView;

    .line 100
    move-result-object v0

    .line 101
    .line 102
    if-eqz v0, :cond_1

    .line 103
    .line 104
    .line 105
    invoke-static {v0}, Lcom/kubi/widget/web/helper/m;->a(Lcom/kubi/sdk/web/KWebView;)V

    .line 106
    .line 107
    .line 108
    :cond_1
    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 109
    move-result-wide v2

    .line 110
    .line 111
    iget-wide v4, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l:J

    .line 112
    sub-long/2addr v2, v4

    .line 113
    .line 114
    sget-object v0, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->a:Lcom/kubi/widget/web/helper/WhitePageCheckHelper;

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->c()Z

    .line 118
    move-result v4

    .line 119
    .line 120
    if-eqz v4, :cond_2

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Lcom/kubi/widget/web/helper/WhitePageCheckHelper;->b()J

    .line 124
    move-result-wide v4

    .line 125
    .line 126
    cmp-long v0, v2, v4

    .line 127
    .line 128
    if-ltz v0, :cond_2

    .line 129
    .line 130
    .line 131
    invoke-static {p0}, Landroidx/lifecycle/LifecycleOwnerKt;->getLifecycleScope(Landroidx/lifecycle/LifecycleOwner;)Landroidx/lifecycle/LifecycleCoroutineScope;

    .line 132
    move-result-object v2

    .line 133
    .line 134
    new-instance v5, Lcom/kubi/widget/web/ui/KWebBaseActivity$onPause$1;

    .line 135
    .line 136
    .line 137
    invoke-direct {v5, p0, v1}, Lcom/kubi/widget/web/ui/KWebBaseActivity$onPause$1;-><init>(Lcom/kubi/widget/web/ui/KWebBaseActivity;Lkotlin/coroutines/Continuation;)V

    .line 138
    const/4 v6, 0x3

    .line 139
    const/4 v7, 0x0

    .line 140
    const/4 v3, 0x0

    .line 141
    const/4 v4, 0x0

    .line 142
    .line 143
    .line 144
    invoke-static/range {v2 .. v7}, Lkotlinx/coroutines/h;->d(Lkotlinx/coroutines/m0;Lkotlin/coroutines/CoroutineContext;Lkotlinx/coroutines/CoroutineStart;Lkotlin/jvm/functions/Function2;ILjava/lang/Object;)Lkotlinx/coroutines/x1;

    .line 145
    :cond_2
    return-void
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

.method public onResume()V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/kubi/sdk/BaseActivity;->onResume()V

    .line 4
    .line 5
    const-string v0, "android_webview_fix_crash_test"

    .line 6
    .line 7
    :try_start_0
    sget-object v1, Lcom/kubi/config/RemoteConfig;->a:Lcom/kubi/config/RemoteConfig;

    .line 8
    .line 9
    new-instance v1, Lcom/kubi/widget/web/ui/KWebBaseActivity$b;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1}, Lcom/kubi/widget/web/ui/KWebBaseActivity$b;-><init>()V

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Lcom/google/gson/reflect/TypeToken;->getType()Ljava/lang/reflect/Type;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    const-string/jumbo v2, "object : TypeToken<T>() {}.type"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Lcom/kubi/config/RemoteConfig;->a(Ljava/lang/String;Ljava/lang/reflect/Type;)Ljava/lang/Object;

    .line 26
    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    goto :goto_0

    .line 28
    :catchall_0
    move-exception v0

    .line 29
    move-object v2, v0

    .line 30
    .line 31
    new-instance v1, Lcom/kubi/config/exception/KCConfigException;

    .line 32
    .line 33
    const/16 v6, 0x8

    .line 34
    const/4 v7, 0x0

    .line 35
    .line 36
    const-string v3, "RemoteConfig"

    .line 37
    const/4 v4, 0x0

    .line 38
    const/4 v5, 0x0

    .line 39
    .line 40
    .line 41
    invoke-direct/range {v1 .. v7}, Lcom/kubi/config/exception/KCConfigException;-><init>(Ljava/lang/Throwable;Ljava/lang/String;ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 42
    const/4 v0, 0x2

    .line 43
    const/4 v2, 0x0

    .line 44
    .line 45
    .line 46
    invoke-static {v1, v2, v0, v2}, Lqq/g;->c(Lcom/kubi/monitor/BaseIssueException;Lcom/kubi/monitor/MonitorLevel;ILjava/lang/Object;)V

    .line 47
    move-object v0, v2

    .line 48
    .line 49
    :goto_0
    check-cast v0, Ljava/lang/Boolean;

    .line 50
    const/4 v1, 0x1

    .line 51
    .line 52
    .line 53
    invoke-static {v0, v1}, Lcom/kubi/utils/extensions/c;->e(Ljava/lang/Boolean;Z)Z

    .line 54
    move-result v0

    .line 55
    .line 56
    if-eqz v0, :cond_0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 60
    move-result-object v0

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->m()Z

    .line 64
    move-result v0

    .line 65
    .line 66
    if-eqz v0, :cond_1

    .line 67
    .line 68
    .line 69
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->getWebView()Lcom/kubi/sdk/web/KWebView;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    if-eqz v0, :cond_1

    .line 77
    .line 78
    .line 79
    invoke-static {v0}, Lcom/kubi/widget/web/helper/m;->b(Lcom/kubi/sdk/web/KWebView;)V

    .line 80
    goto :goto_1

    .line 81
    .line 82
    .line 83
    :cond_0
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 84
    move-result-object v0

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->getWebView()Lcom/kubi/sdk/web/KWebView;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    if-eqz v0, :cond_1

    .line 91
    .line 92
    .line 93
    invoke-static {v0}, Lcom/kubi/widget/web/helper/m;->b(Lcom/kubi/sdk/web/KWebView;)V

    .line 94
    :cond_1
    :goto_1
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

.method public t(Lcom/kubi/widget/web/ui/b;)V
    .locals 1
    .param p1    # Lcom/kubi/widget/web/ui/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "listener"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->i:Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
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

.method public u0(Lcom/kubi/sdk/web/KWebView;)V
    .locals 1
    .param p1    # Lcom/kubi/sdk/web/KWebView;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "webView"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->e0(Lcom/kubi/sdk/web/KWebView;)V

    .line 10
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
.end method

.method public url()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/kubi/widget/web/ui/KWebBaseActivity;->l0()Lcom/kubi/widget/web/ui/KWebContainer;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebContainer;->getConfig()Lcom/kubi/widget/web/ui/KWebUIConfig;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lcom/kubi/widget/web/ui/KWebUIConfig;->i()Ljava/lang/String;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
.end method

.method public v0()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

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
.end method

.method public final w0(Lcom/kubi/widget/web/ui/KWebUIConfig;)Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/kubi/widget/web/ui/KWebUIConfig;->h()Landroid/net/Uri;

    .line 4
    move-result-object p1

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    if-nez p1, :cond_0

    .line 8
    return v0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {p1}, Landroid/net/Uri;->getScheme()Ljava/lang/String;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    .line 17
    .line 18
    const-string v3, "ROOT"

    .line 19
    .line 20
    .line 21
    invoke-static {v2, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, v2}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    const-string/jumbo v2, "toLowerCase(...)"

    .line 29
    .line 30
    .line 31
    invoke-static {v1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 32
    goto :goto_0

    .line 33
    :cond_1
    const/4 v1, 0x0

    .line 34
    .line 35
    :goto_0
    if-eqz v1, :cond_a

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    .line 39
    move-result v2

    .line 40
    .line 41
    .line 42
    const v3, 0x2ff57c

    .line 43
    const/4 v4, 0x1

    .line 44
    .line 45
    if-eq v2, v3, :cond_7

    .line 46
    .line 47
    .line 48
    const v3, 0x310888    # 4.503E-39f

    .line 49
    .line 50
    if-eq v2, v3, :cond_3

    .line 51
    .line 52
    .line 53
    const v3, 0x5f008eb

    .line 54
    .line 55
    if-eq v2, v3, :cond_2

    .line 56
    goto :goto_3

    .line 57
    .line 58
    :cond_2
    const-string v2, "https"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 62
    move-result v1

    .line 63
    .line 64
    if-eqz v1, :cond_a

    .line 65
    goto :goto_1

    .line 66
    .line 67
    :cond_3
    const-string v2, "http"

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 71
    move-result v1

    .line 72
    .line 73
    if-nez v1, :cond_4

    .line 74
    goto :goto_3

    .line 75
    .line 76
    .line 77
    :cond_4
    :goto_1
    invoke-virtual {p1}, Landroid/net/Uri;->isHierarchical()Z

    .line 78
    move-result v1

    .line 79
    .line 80
    if-eqz v1, :cond_6

    .line 81
    .line 82
    .line 83
    invoke-virtual {p1}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    .line 84
    move-result-object p1

    .line 85
    .line 86
    if-eqz p1, :cond_6

    .line 87
    .line 88
    .line 89
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 90
    move-result p1

    .line 91
    .line 92
    if-eqz p1, :cond_5

    .line 93
    goto :goto_2

    .line 94
    :cond_5
    return v4

    .line 95
    :cond_6
    :goto_2
    return v0

    .line 96
    .line 97
    :cond_7
    const-string v2, "file"

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 101
    move-result v1

    .line 102
    .line 103
    if-nez v1, :cond_8

    .line 104
    goto :goto_3

    .line 105
    .line 106
    .line 107
    :cond_8
    invoke-virtual {p1}, Landroid/net/Uri;->isHierarchical()Z

    .line 108
    move-result v1

    .line 109
    .line 110
    if-eqz v1, :cond_a

    .line 111
    .line 112
    .line 113
    invoke-virtual {p1}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    .line 114
    move-result-object p1

    .line 115
    .line 116
    if-eqz p1, :cond_a

    .line 117
    .line 118
    .line 119
    invoke-static {p1}, Lkotlin/text/StringsKt;->isBlank(Ljava/lang/CharSequence;)Z

    .line 120
    move-result p1

    .line 121
    .line 122
    if-eqz p1, :cond_9

    .line 123
    goto :goto_3

    .line 124
    :cond_9
    return v4

    .line 125
    :cond_a
    :goto_3
    return v0
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

.method public x(Lcom/kubi/widget/web/ui/b;)V
    .locals 1
    .param p1    # Lcom/kubi/widget/web/ui/b;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "listener"

    .line 4
    .line 5
    .line 6
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    iget-object v0, p0, Lcom/kubi/widget/web/ui/KWebBaseActivity;->i:Ljava/util/Set;

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1}, Ljava/util/Set;->remove(Ljava/lang/Object;)Z

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
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
