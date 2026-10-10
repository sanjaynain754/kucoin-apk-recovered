.class public final Lcom/kubi/HomeStartupTask;
.super Ljava/lang/Object;
.source "HomeStartupTask.kt"

# interfaces
.implements Lcom/kubi/sdk/startup/IStartupTask;


# annotations
.annotation build Lcom/kubi/sdk/startup/StartupOption;
    name = "home"
    priority = 0xc8
    stepType = .enum Lcom/kubi/sdk/startup/StartupStepType;->FirstPage:Lcom/kubi/sdk/startup/StartupStepType;
    threadType = .enum Lcom/kubi/sdk/startup/StartupThreadType;->Await:Lcom/kubi/sdk/startup/StartupThreadType;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/HomeStartupTask;",
        "Lcom/kubi/sdk/startup/IStartupTask;",
        "<init>",
        "()V",
        "run",
        "",
        "application",
        "Landroid/app/Application;",
        "HomeLib_googleRelease"
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
        "SMAP\nHomeStartupTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 HomeStartupTask.kt\ncom/kubi/HomeStartupTask\n+ 2 FlavorEx.kt\ncom/kubi/kucoin/helper/FlavorExKt\n*L\n1#1,42:1\n25#2,3:43\n*S KotlinDebug\n*F\n+ 1 HomeStartupTask.kt\ncom/kubi/HomeStartupTask\n*L\n27#1:43,3\n*E\n"
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static synthetic a()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/HomeStartupTask;->run$lambda$2$lambda$1()V

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
.end method

.method private static final run$lambda$2$lambda$1()V
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/kubi/home/shortcut/g;->a:Lcom/kubi/home/shortcut/g;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/kubi/home/shortcut/g;->g()V

    .line 6
    return-void
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
.end method


# virtual methods
.method public run(Landroid/app/Application;)V
    .locals 3
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "application"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object p1, Loj/d;->a:Loj/d;

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1}, Loj/d;->b()V

    .line 11
    .line 12
    sget-object v0, Lcom/kubi/router/core/Router;->a:Lcom/kubi/router/core/Router;

    .line 13
    .line 14
    sget-object v1, Lcom/kubi/sdk/site/info/SiteInfoManager;->a:Lcom/kubi/sdk/site/info/SiteInfoManager;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1}, Lcom/kubi/sdk/site/info/SiteInfoManager;->c()Ljava/lang/String;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    const-class v2, Lzf/p;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v2, v1}, Lcom/kubi/router/core/Router;->h(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Object;

    .line 24
    move-result-object v0

    .line 25
    .line 26
    if-eqz v0, :cond_0

    .line 27
    .line 28
    check-cast v0, Lzf/p;

    .line 29
    .line 30
    .line 31
    invoke-interface {v0}, Lzf/p;->b()V

    .line 32
    goto :goto_0

    .line 33
    .line 34
    .line 35
    :cond_0
    invoke-virtual {p1}, Loj/d;->c()Z

    .line 36
    move-result p1

    .line 37
    .line 38
    if-eqz p1, :cond_1

    .line 39
    .line 40
    sget-object p1, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->a:Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/kubi/home/v2/card/HomeCardsRepositoryV2;->c()V

    .line 44
    .line 45
    new-instance p1, Lcom/kubi/home/widgets/HomeWidgetRepo;

    .line 46
    .line 47
    .line 48
    invoke-direct {p1}, Lcom/kubi/home/widgets/HomeWidgetRepo;-><init>()V

    .line 49
    .line 50
    .line 51
    invoke-virtual {p1}, Lcom/kubi/home/widgets/HomeWidgetRepo;->j()Lkotlinx/coroutines/x1;

    .line 52
    .line 53
    sget-object p1, Lcom/kubi/home/widgets/grid/GridNavigationWidgetPreloader;->a:Lcom/kubi/home/widgets/grid/GridNavigationWidgetPreloader;

    .line 54
    .line 55
    .line 56
    invoke-virtual {p1}, Lcom/kubi/home/widgets/grid/GridNavigationWidgetPreloader;->b()Lkotlinx/coroutines/x1;

    .line 57
    .line 58
    sget-object p1, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->a:Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;

    .line 59
    .line 60
    .line 61
    invoke-virtual {p1}, Lcom/kubi/home/v2/biz/grid/utils/GridNaviDataProvider;->h()V

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_1
    sget-object p1, Lcom/kubi/home/common/card/HomeCardsRepository;->a:Lcom/kubi/home/common/card/HomeCardsRepository;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/kubi/home/common/card/HomeCardsRepository;->c()V

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lo00/g;->c()Ljava/util/concurrent/Executor;

    .line 71
    move-result-object p1

    .line 72
    .line 73
    new-instance v0, Lcom/kubi/a;

    .line 74
    .line 75
    .line 76
    invoke-direct {v0}, Lcom/kubi/a;-><init>()V

    .line 77
    .line 78
    .line 79
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 80
    .line 81
    :goto_0
    sget-object p1, Lej/i;->a:Lej/i;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1}, Lej/i;->C()V

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
.end method
