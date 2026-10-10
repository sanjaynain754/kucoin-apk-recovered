.class public final Lcom/kubi/app/bizcontrol/BizControlStartUpTask;
.super Ljava/lang/Object;
.source "BizControlStartUpTask.kt"

# interfaces
.implements Lcom/kubi/sdk/startup/IStartupTask;


# annotations
.annotation build Lcom/kubi/sdk/startup/StartupOption;
    name = "biz_control"
    priority = 0x0
    stepType = .enum Lcom/kubi/sdk/startup/StartupStepType;->PreFirstPage:Lcom/kubi/sdk/startup/StartupStepType;
    threadType = .enum Lcom/kubi/sdk/startup/StartupThreadType;->Await:Lcom/kubi/sdk/startup/StartupThreadType;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0017\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/kubi/app/bizcontrol/BizControlStartUpTask;",
        "Lcom/kubi/sdk/startup/IStartupTask;",
        "<init>",
        "()V",
        "run",
        "",
        "application",
        "Landroid/app/Application;",
        "LBizControl_googleRelease"
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
        "SMAP\nBizControlStartUpTask.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BizControlStartUpTask.kt\ncom/kubi/app/bizcontrol/BizControlStartUpTask\n+ 2 StorageIdEx.kt\ncom/kubi/utils/storage/StorageIdExKt\n*L\n1#1,53:1\n136#2:54\n*S KotlinDebug\n*F\n+ 1 BizControlStartUpTask.kt\ncom/kubi/app/bizcontrol/BizControlStartUpTask\n*L\n45#1:54\n*E\n"
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

.method public static synthetic a(Lcom/kubi/user/model/LoginUserEntity;)Lkotlin/Unit;
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/kubi/app/bizcontrol/BizControlStartUpTask;->run$lambda$1(Lcom/kubi/user/model/LoginUserEntity;)Lkotlin/Unit;

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
.end method

.method public static synthetic b()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/kubi/app/bizcontrol/BizControlStartUpTask;->run$lambda$0()V

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

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lcom/kubi/app/bizcontrol/BizControlStartUpTask;->run$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

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
.end method

.method private static final run$lambda$0()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lgz/b;->a:Lgz/b;

    .line 3
    .line 4
    sget-object v1, Lcom/kubi/sdk/d0;->a:Lcom/kubi/sdk/d0;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lcom/kubi/sdk/d0;->b()Ly70/g;

    .line 8
    move-result-object v1

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    .line 12
    invoke-static {v1, v2}, Ly70/a;->d(Ly70/g;Z)Z

    .line 13
    move-result v1

    .line 14
    .line 15
    xor-int/lit8 v1, v1, 0x1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lgz/b;->l(Z)V

    .line 19
    .line 20
    sget-object v1, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Lcom/kubi/user/config/UserInfo;->h()Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    if-nez v1, :cond_0

    .line 27
    .line 28
    const-string v1, ""

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-virtual {v0, v1}, Lgz/b;->j(Ljava/lang/String;)V

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
.end method

.method private static final run$lambda$1(Lcom/kubi/user/model/LoginUserEntity;)Lkotlin/Unit;
    .locals 2

    .line 1
    .line 2
    new-instance p0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    const-string/jumbo v0, "userInfo userInfoObs, update uid="

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    .line 13
    sget-object v0, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->h()Ljava/lang/String;

    .line 17
    move-result-object v1

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object p0

    .line 25
    .line 26
    const-string v1, "BizControlStartUpTask"

    .line 27
    .line 28
    .line 29
    invoke-static {v1, p0}, Lro/b;->j(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    sget-object p0, Lgz/b;->a:Lgz/b;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/kubi/user/config/UserInfo;->h()Ljava/lang/String;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    const-string v0, ""

    .line 40
    .line 41
    .line 42
    :cond_0
    invoke-virtual {p0, v0}, Lgz/b;->m(Ljava/lang/String;)V

    .line 43
    .line 44
    sget-object p0, Lkotlin/Unit;->INSTANCE:Lkotlin/Unit;

    .line 45
    return-object p0
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
.end method

.method private static final run$lambda$2(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
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
.end method


# virtual methods
.method public run(Landroid/app/Application;)V
    .locals 4
    .param p1    # Landroid/app/Application;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "CheckResult"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "application"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    const/4 v0, 0x0

    .line 7
    const/4 v1, 0x4

    .line 8
    .line 9
    const-string v2, "EVENT_BIZ_CONTROL_LOAD"

    .line 10
    .line 11
    const-string v3, "page_load_start"

    .line 12
    .line 13
    .line 14
    invoke-static {v2, v3, v0, v1, v0}, Lqq/b;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)V

    .line 15
    .line 16
    sget-object v0, Lgz/b;->a:Lgz/b;

    .line 17
    .line 18
    new-instance v1, Lcom/kubi/sdk/lib/kucoin/biz/control/BizControlImpl;

    .line 19
    .line 20
    .line 21
    invoke-direct {v1}, Lcom/kubi/sdk/lib/kucoin/biz/control/BizControlImpl;-><init>()V

    .line 22
    .line 23
    sget-object v2, Lcom/kubi/sdk/site/SiteType;->Companion:Lcom/kubi/sdk/site/SiteType$Companion;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v2}, Lcom/kubi/sdk/site/SiteType$Companion;->getCurrentSiteType()Ljava/lang/String;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    .line 30
    invoke-virtual {v2}, Lcom/kubi/sdk/site/SiteType$Companion;->getCurrentSiteType()Ljava/lang/String;

    .line 31
    move-result-object v2

    .line 32
    .line 33
    .line 34
    invoke-static {v2}, Lcom/kubi/sdk/site/e;->a(Ljava/lang/String;)Z

    .line 35
    move-result v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, v1, p1, v3, v2}, Lgz/b;->h(Lgz/d;Landroid/content/Context;Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lo00/g;->c()Ljava/util/concurrent/Executor;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    new-instance v0, Lcom/kubi/app/bizcontrol/e;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Lcom/kubi/app/bizcontrol/e;-><init>()V

    .line 48
    .line 49
    .line 50
    invoke-interface {p1, v0}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 51
    .line 52
    sget-object p1, Lcom/kubi/user/config/UserInfo;->a:Lcom/kubi/user/config/UserInfo;

    .line 53
    .line 54
    .line 55
    invoke-virtual {p1}, Lcom/kubi/user/config/UserInfo;->j()Lio/reactivex/Observable;

    .line 56
    move-result-object p1

    .line 57
    .line 58
    new-instance v0, Lcom/kubi/app/bizcontrol/f;

    .line 59
    .line 60
    .line 61
    invoke-direct {v0}, Lcom/kubi/app/bizcontrol/f;-><init>()V

    .line 62
    .line 63
    new-instance v1, Lcom/kubi/app/bizcontrol/g;

    .line 64
    .line 65
    .line 66
    invoke-direct {v1, v0}, Lcom/kubi/app/bizcontrol/g;-><init>(Lkotlin/jvm/functions/Function1;)V

    .line 67
    .line 68
    .line 69
    invoke-virtual {p1, v1}, Lio/reactivex/Observable;->subscribe(Lio/reactivex/functions/Consumer;)Lio/reactivex/disposables/Disposable;

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
.end method
