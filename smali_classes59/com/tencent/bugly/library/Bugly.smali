.class public Lcom/tencent/bugly/library/Bugly;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/library/BuglyConstants;


# static fields
.field public static a:Lcom/tencent/bugly/proguard/o5; = null

.field public static final b:J = 0x320L


# direct methods
.method public static constructor <clinit>()V
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
.end method

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
.end method

.method public static abolishPerformanceMonitors()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "Bugly_Init"

    .line 9
    .line 10
    const-string v1, "abolish monitors failed, pls init monitor first!"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    return-void

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/ff;->a()V

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

.method public static addCallback(Ljava/lang/String;Lcom/tencent/bugly/callback/Callback;Ljava/lang/Object;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    const-string p1, "add callback failed, pls init monitor first!"

    .line 11
    .line 12
    .line 13
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    return-void

    .line 15
    .line 16
    .line 17
    :cond_0
    :try_start_0
    const-string/jumbo v0, "msg_lag"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-eqz v0, :cond_2

    .line 24
    .line 25
    instance-of p0, p2, Ljava/lang/Long;

    .line 26
    .line 27
    if-eqz p0, :cond_1

    .line 28
    .line 29
    check-cast p2, Ljava/lang/Long;

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2}, Ljava/lang/Long;->longValue()J

    .line 33
    move-result-wide v0

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_1
    const-wide/16 v0, 0x320

    .line 37
    .line 38
    .line 39
    :goto_0
    invoke-static {v0, v1, p1}, Lcom/tencent/bugly/proguard/tc;->a(JLcom/tencent/bugly/callback/Callback;)V

    .line 40
    return-void

    .line 41
    .line 42
    .line 43
    :cond_2
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/g2;->a(Ljava/lang/String;Lcom/tencent/bugly/callback/Callback;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 44
    :catchall_0
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

.method public static addCustomDataCollector(Lcom/tencent/rmonitor/base/plugin/listener/ICustomDataCollector;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    const-string p0, "Bugly_Init"

    const-string v0, "add custom data collector failed, pls init monitor first!"

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/16 v0, 0xd8

    .line 3
    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/Object;)Z

    return-void
.end method

.method public static addCustomDataCollector(Lcom/tencent/rmonitor/base/plugin/listener/ICustomDataCollectorForIssue;)V
    .locals 1

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    const-string p0, "Bugly_Init"

    const-string v0, "add custom data collector failed, pls init monitor first!"

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/16 v0, 0xd9

    .line 6
    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/Object;)Z

    return-void
.end method

.method public static checkAllPluginStarted(Ljava/util/List;)Z
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    const-string v0, "check plugin started failed, pls init monitor first!"

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    .line 17
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->INSTANCE:Lcom/tencent/rmonitor/manager/RMonitorLauncher;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->checkAllDesiredPluginStarted(Ljava/util/List;)Z

    .line 21
    move-result p0

    .line 22
    return p0
    .line 23
    .line 24
    .line 25
.end method

.method public static enableHookJavaStackTrace(Z)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    const-string v0, "enable hook java stack trace failed, pls init first!"

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    const/4 p0, 0x0

    .line 15
    return p0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->c()Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->a(Z)Z

    .line 23
    move-result p0

    .line 24
    return p0
    .line 25
.end method

.method public static enterScene(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    const-string v0, "enter scene failed, pls init monitor first!"

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    return-void

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/g;->b(Ljava/lang/String;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public static exitScene(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    const-string v0, "exit scene failed, pls init monitor first!"

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    return-void

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->h()Lcom/tencent/bugly/proguard/g;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/proguard/g;->c(Ljava/lang/String;)V

    .line 22
    return-void
    .line 23
    .line 24
    .line 25
.end method

.method public static getGlobalCustomDataEditor()Lcom/tencent/rmonitor/custom/ICustomDataEditor;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "Bugly_Init"

    .line 9
    .line 10
    const-string v1, "get global custom data editor failed, pls init monitor first!"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    const/4 v0, 0x0

    .line 15
    return-object v0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/w3;->a()Lcom/tencent/rmonitor/custom/a;

    .line 19
    move-result-object v0

    .line 20
    return-object v0
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

.method public static getReplayOptions()Lcom/tencent/bugly/common/replay/BuglyReplayOptions;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "Bugly_Init"

    .line 9
    .line 10
    const-string v1, "get replay options failed, pls init bugly first!"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 14
    const/4 v0, 0x0

    .line 15
    return-object v0

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->d()Lcom/tencent/bugly/common/replay/BuglyReplayOptions;

    .line 19
    move-result-object v0

    .line 20
    return-object v0
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

.method public static getUniqueId()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->c()Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    return-object v0

    .line 19
    .line 20
    :cond_1
    :goto_0
    const-string v0, "Bugly_Init"

    .line 21
    .line 22
    const-string v1, "get unique id failed, pls init monitor first!"

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 26
    .line 27
    const-string v0, ""

    .line 28
    return-object v0
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

.method public static handleCatchException(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[B)Z
    .locals 1

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    const-string p0, "Bugly_Init"

    const-string p1, "handle catch exception failed, pls init monitor first!"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return p0

    :cond_0
    const/4 v0, 0x1

    .line 6
    invoke-static {p0, p1, p2, p3, v0}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[BZ)Z

    move-result p0

    return p0
.end method

.method public static handleCatchException(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[BZ)Z
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    const-string p0, "Bugly_Init"

    const-string p1, "handle catch exception failed, pls init monitor first!"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return p0

    .line 3
    :cond_0
    invoke-static {p0, p1, p2, p3, p4}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/lang/Thread;Ljava/lang/Throwable;Ljava/lang/String;[BZ)Z

    move-result p0

    return p0
.end method

.method public static init(Landroid/content/Context;Lcom/tencent/bugly/library/BuglyBuilder;)Z
    .locals 1

    .line 1
    invoke-static {p0}, Lcom/tencent/bugly/common/utils/ProcessUtil;->isMainProcess(Landroid/content/Context;)Z

    move-result v0

    invoke-static {p0, p1, v0}, Lcom/tencent/bugly/library/Bugly;->init(Landroid/content/Context;Lcom/tencent/bugly/library/BuglyBuilder;Z)Z

    move-result p0

    return p0
.end method

.method public static init(Landroid/content/Context;Lcom/tencent/bugly/library/BuglyBuilder;Z)Z
    .locals 10

    const-string v0, "Bugly_Init"

    const/4 v1, 0x0

    if-nez p0, :cond_0

    .line 2
    const-string p0, "Bugly init failed, please make sure context not null."

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    :cond_0
    if-nez p1, :cond_1

    .line 3
    const-string p0, "Bugly init failed, please make sure Bugly builder not null."

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 4
    :cond_1
    iget-object v2, p1, Lcom/tencent/bugly/library/BuglyBuilder;->serverHostType:Ljava/lang/String;

    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 5
    iget-object v2, p1, Lcom/tencent/bugly/library/BuglyBuilder;->serverHostType:Ljava/lang/String;

    invoke-static {v2}, Lcom/tencent/bugly/proguard/d2;->a(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_2

    .line 6
    const-string p0, "Bugly init failed, please make sure serverHostType is valid."

    invoke-static {v0, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return v1

    .line 7
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    .line 8
    invoke-static {p0}, Lcom/tencent/bugly/proguard/d3;->a(Landroid/content/Context;)V

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v4

    .line 10
    iget-wide v5, p1, Lcom/tencent/bugly/library/BuglyBuilder;->cacheDataIntervalMs:J

    invoke-static {v5, v6}, Lcom/tencent/bugly/proguard/m7;->a(J)V

    .line 11
    invoke-static {v4, p1}, Lcom/tencent/bugly/proguard/y1;->a(Landroid/content/Context;Lcom/tencent/bugly/library/BuglyBuilder;)V

    .line 12
    invoke-virtual {p1}, Lcom/tencent/bugly/library/BuglyBuilder;->getEmergencyReportPlugins()Ljava/util/ArrayList;

    move-result-object p0

    if-eqz p0, :cond_3

    .line 13
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v0

    if-lez v0, :cond_3

    .line 14
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 15
    sget-object v5, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->Companion:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$Companion;

    invoke-virtual {v5, v0}, Lcom/tencent/bugly/common/reporter/data/ReportStrategy$Companion;->addEmergencyPlugin(Ljava/lang/String;)V

    goto :goto_0

    .line 16
    :cond_3
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->appVersion:Ljava/lang/String;

    invoke-static {v4, p0}, Lcom/tencent/bugly/proguard/n3;->g(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->userId:Ljava/lang/String;

    invoke-static {v4, p0}, Lcom/tencent/bugly/proguard/n3;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 18
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->uniqueId:Ljava/lang/String;

    invoke-static {v4, p0}, Lcom/tencent/bugly/proguard/n3;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 19
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->buildNumber:Ljava/lang/String;

    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->e(Ljava/lang/String;)V

    .line 20
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->deviceModel:Ljava/lang/String;

    invoke-static {v4, p0}, Lcom/tencent/bugly/proguard/n3;->f(Landroid/content/Context;Ljava/lang/String;)V

    .line 21
    iget-boolean p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->enableAllThreadStackCrash:Z

    iget-boolean v0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->enableAllThreadStackAnr:Z

    .line 22
    invoke-static {v4}, Lcom/tencent/bugly/proguard/l2;->a(Landroid/content/Context;)Lcom/tencent/bugly/proguard/l2;

    move-result-object v5

    invoke-virtual {v5, p0, v0}, Lcom/tencent/bugly/proguard/l2;->a(ZZ)V

    .line 23
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->appKey:Ljava/lang/String;

    .line 24
    invoke-static {p0}, Lcom/tencent/bugly/proguard/m7;->c(Ljava/lang/String;)Z

    .line 25
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->appVersionType:Ljava/lang/String;

    .line 26
    invoke-static {p0}, Lcom/tencent/bugly/proguard/m7;->d(Ljava/lang/String;)Z

    .line 27
    iget-boolean p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->fetchConfigFromServerInSubProcess:Z

    .line 28
    invoke-static {p0}, Lcom/tencent/bugly/proguard/m7;->a(Z)V

    .line 29
    iget-object v5, p1, Lcom/tencent/bugly/library/BuglyBuilder;->appId:Ljava/lang/String;

    iget-boolean v6, p1, Lcom/tencent/bugly/library/BuglyBuilder;->debugMode:Z

    invoke-virtual {p1}, Lcom/tencent/bugly/library/BuglyBuilder;->a()Lcom/tencent/bugly/proguard/u3;

    move-result-object v7

    const-wide/16 v8, 0x0

    invoke-static/range {v4 .. v9}, Lcom/tencent/bugly/proguard/n3;->a(Landroid/content/Context;Ljava/lang/String;ZLcom/tencent/bugly/proguard/u3;J)V

    .line 30
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->appChannel:Ljava/lang/String;

    invoke-static {v4, p0}, Lcom/tencent/bugly/proguard/n3;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 31
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->hotPatchNum:Ljava/lang/String;

    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/lang/String;)V

    .line 32
    invoke-static {}, Lcom/tencent/rmonitor/sla/b$c;->a()Lcom/tencent/rmonitor/sla/b;

    move-result-object p0

    .line 33
    invoke-virtual {p0}, Lcom/tencent/rmonitor/sla/b;->g()V

    const/16 p0, 0x6b

    .line 34
    invoke-static {p0, v4}, Lcom/tencent/bugly/proguard/ff;->c(ILjava/lang/Object;)Z

    .line 35
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->appKey:Ljava/lang/String;

    const/16 v0, 0x64

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 36
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->appId:Ljava/lang/String;

    const/16 v0, 0x65

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 37
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->appVersion:Ljava/lang/String;

    const/16 v0, 0x67

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 38
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->buildNumber:Ljava/lang/String;

    const/16 v0, 0x6d

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 39
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->userId:Ljava/lang/String;

    const/16 v0, 0x66

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 40
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->uniqueId:Ljava/lang/String;

    const/16 v0, 0x6a

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 41
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->deviceModel:Ljava/lang/String;

    const/16 v0, 0x71

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 42
    iget p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->logLevel:I

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    const/16 v0, 0x68

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->c(ILjava/lang/Object;)Z

    .line 43
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->appVersionType:Ljava/lang/String;

    const/16 v0, 0x70

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 44
    iget-boolean p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->enableCrashProtect:Z

    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    const/16 v0, 0xd6

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->c(ILjava/lang/Object;)Z

    .line 45
    iget-object p0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->spProvider:Lcom/tencent/bugly/common/sp/ISharedPreferencesProvider;

    const/16 v0, 0x6f

    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->c(ILjava/lang/Object;)Z

    .line 46
    invoke-virtual {p1}, Lcom/tencent/bugly/library/BuglyBuilder;->b()Ljava/util/List;

    move-result-object p0

    if-eqz p2, :cond_4

    .line 47
    const-string/jumbo p1, "sub_memory_quantile"

    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    goto :goto_1

    .line 48
    :cond_4
    const-string p1, "memory_quantile"

    invoke-interface {p0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 49
    :goto_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ff;->b(Ljava/util/List;)V

    .line 50
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide p0

    const/4 p2, 0x1

    .line 51
    invoke-static {v2, v3, p0, p1, p2}, Lcom/tencent/bugly/proguard/ta;->a(JJZ)V

    .line 52
    sget-boolean p0, Lcom/tencent/bugly/proguard/n3;->c:Z

    if-eqz p0, :cond_5

    .line 53
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result p0

    if-eqz p0, :cond_5

    return p2

    :cond_5
    return v1
.end method

.method public static monitorEvent(JLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)Z
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    const-string p0, "Bugly_Init"

    const-string/jumbo p1, "monitor event failed, pls init monitor first!"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    const/4 p0, 0x0

    return p0

    .line 3
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/a4;->c()Lcom/tencent/bugly/proguard/a4;

    move-result-object v0

    move-wide v1, p0

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-virtual/range {v0 .. v5}, Lcom/tencent/bugly/proguard/a4;->b(JLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)Z

    move-result p0

    return p0
.end method

.method public static monitorEvent(Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/Double;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {v0, v1, p0, p1, p2}, Lcom/tencent/bugly/library/Bugly;->monitorEvent(JLjava/lang/String;Ljava/util/Map;Ljava/util/Map;)Z

    move-result p0

    return p0
.end method

.method public static postException(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    const-string p0, "Bugly_Init"

    const-string/jumbo p1, "post Exception failed, pls init monitor first!"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    .line 6
    :cond_0
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    move v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    invoke-static/range {v0 .. v5}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static postException(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/Thread;",
            "I",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    const-string p0, "Bugly_Init"

    const-string/jumbo p1, "post Exception failed, pls init monitor first!"

    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    .line 3
    invoke-static/range {v0 .. v5}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/lang/Thread;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;)V

    return-void
.end method

.method public static putUserData(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    .line 11
    const-string/jumbo p1, "put user data failed, pls init monitor first!"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/n3;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V

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

.method public static reRegisterHandler()Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->f()Z

    .line 17
    move-result v0

    .line 18
    return v0

    .line 19
    .line 20
    :cond_1
    :goto_0
    const-string v0, "Bugly_Init"

    .line 21
    .line 22
    .line 23
    const-string/jumbo v1, "reRegisterHandler failed, pls init monitor first!"

    .line 24
    .line 25
    .line 26
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 27
    const/4 v0, 0x0

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
.end method

.method public static removeCallback(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "remove callback failed, pls init monitor first!"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_0
    :try_start_0
    const-string/jumbo v0, "msg_lag"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-static {}, Lcom/tencent/bugly/proguard/tc;->a()V

    .line 28
    return-void

    .line 29
    .line 30
    .line 31
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/g2;->c(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 32
    :catchall_0
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
.end method

.method public static removeCustomDataCollector(Lcom/tencent/rmonitor/base/plugin/listener/ICustomDataCollector;)V
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 2
    const-string p0, "Bugly_Init"

    const-string/jumbo v0, "remove custom data collector failed, pls init monitor first!"

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/16 v0, 0xd8

    .line 3
    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->b(ILjava/lang/Object;)Z

    return-void
.end method

.method public static removeCustomDataCollector(Lcom/tencent/rmonitor/base/plugin/listener/ICustomDataCollectorForIssue;)V
    .locals 1

    .line 4
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    if-nez v0, :cond_0

    .line 5
    const-string p0, "Bugly_Init"

    const-string/jumbo v0, "remove custom data collector failed, pls init monitor first!"

    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    return-void

    :cond_0
    const/16 v0, 0xd9

    .line 6
    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->b(ILjava/lang/Object;)Z

    return-void
.end method

.method public static removeUserData(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    .line 11
    const-string/jumbo p1, "remove user data failed, pls init monitor first!"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    const/4 p0, 0x0

    .line 16
    return-object p0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->b(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 20
    move-result-object p0

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
.end method

.method public static setAdditionalAttachmentPaths([Ljava/lang/String;)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "set additional attachment paths failed, pls init monitor first!"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    const/4 p0, 0x0

    .line 16
    return p0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->a([Ljava/lang/String;)Z

    .line 20
    move-result p0

    .line 21
    return p0
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static setCaseLabels(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "set case labels fail, pls init bugly first!"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->d(Ljava/lang/String;)V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static setCrashMonitorAble(IZ)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "Bugly_Init"

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    const-string/jumbo p0, "set crash monitor able failed, pls init monitor first!"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_0
    packed-switch p0, :pswitch_data_0

    .line 19
    .line 20
    const-string p0, "Crash monitor able set failed, please check crash type."

    .line 21
    .line 22
    .line 23
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :pswitch_0
    invoke-static {p1}, Lcom/tencent/bugly/proguard/n3;->c(Z)V

    .line 28
    return-void

    .line 29
    .line 30
    .line 31
    :pswitch_1
    invoke-static {p1}, Lcom/tencent/bugly/proguard/n3;->f(Z)V

    .line 32
    return-void

    .line 33
    .line 34
    .line 35
    :pswitch_2
    invoke-static {p1}, Lcom/tencent/bugly/proguard/n3;->e(Z)V

    .line 36
    return-void

    .line 37
    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static setForegroundUserInfoReport(ZJ)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p0, p1, p2}, Lcom/tencent/bugly/proguard/sa;->a(ZJ)V

    .line 17
    return-void

    .line 18
    .line 19
    :cond_1
    :goto_0
    const-string p0, "Bugly_Init"

    .line 20
    .line 21
    .line 22
    const-string/jumbo p1, "setForegroundUserInfoReport failed, pls init monitor first!"

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

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
.end method

.method public static setMonitorCallback(Ljava/lang/String;Lcom/tencent/bugly/library/MonitorCallback;)V
    .locals 1

    .line 1
    .line 2
    const-string v0, "fps"

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 6
    move-result p0

    .line 7
    .line 8
    if-eqz p0, :cond_1

    .line 9
    .line 10
    sget-object p0, Lcom/tencent/bugly/library/Bugly;->a:Lcom/tencent/bugly/proguard/o5;

    .line 11
    .line 12
    if-nez p0, :cond_0

    .line 13
    .line 14
    new-instance p0, Lcom/tencent/bugly/proguard/o5;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/o5;-><init>()V

    .line 18
    .line 19
    sput-object p0, Lcom/tencent/bugly/library/Bugly;->a:Lcom/tencent/bugly/proguard/o5;

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/o5;->a(Lcom/tencent/bugly/library/MonitorCallback;)V

    .line 23
    :cond_1
    return-void
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
.end method

.method public static setPerformanceMonitorAble(Ljava/lang/String;Z)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    .line 11
    const-string/jumbo p1, "set performance monitors able failed, pls init monitor first!"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    if-eqz p1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 21
    move-result-object p0

    .line 22
    .line 23
    .line 24
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ff;->b(Ljava/util/List;)V

    .line 25
    return-void

    .line 26
    .line 27
    .line 28
    :cond_1
    invoke-static {p0}, Ljava/util/Collections;->singletonList(Ljava/lang/Object;)Ljava/util/List;

    .line 29
    move-result-object p0

    .line 30
    .line 31
    .line 32
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ff;->c(Ljava/util/List;)V

    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static setPerformanceMonitorsAble(Ljava/util/List;Z)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;Z)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    .line 11
    const-string/jumbo p1, "set performance monitors able failed, pls init monitor first!"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    if-eqz p1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ff;->b(Ljava/util/List;)V

    .line 21
    return-void

    .line 22
    .line 23
    .line 24
    :cond_1
    invoke-static {p0}, Lcom/tencent/bugly/proguard/ff;->c(Ljava/util/List;)V

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
.end method

.method public static setSdkLogProxy(Lcom/tencent/rmonitor/common/logger/ILogProxy;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->a(Lcom/tencent/rmonitor/common/logger/ILogProxy;)V

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
.end method

.method public static setTestLabels(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "set test labels fail, pls init bugly first!"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->g(Ljava/lang/String;)V

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public static setUserInfoReportOpt(Z)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/bugly/proguard/n3;->g(Z)V

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
.end method

.method public static startInspectLeakObj(Ljava/lang/Object;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "start inspect leak obj failed, pls init monitor first!"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    return-void

    .line 16
    .line 17
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/y4;

    .line 18
    .line 19
    .line 20
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/y4;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-static {p0, v0}, Lcom/tencent/bugly/proguard/bc;->a(Ljava/lang/Object;Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;)V

    .line 24
    return-void
    .line 25
.end method

.method public static testCrash(I)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "Bugly_Init"

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    .line 11
    const-string/jumbo p0, "test crash failed, pls init monitor first!"

    .line 12
    .line 13
    .line 14
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_0
    packed-switch p0, :pswitch_data_0

    .line 19
    .line 20
    .line 21
    const-string/jumbo p0, "test crash failed, please check crash type."

    .line 22
    .line 23
    .line 24
    invoke-static {v1, p0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 25
    return-void

    .line 26
    .line 27
    .line 28
    :pswitch_0
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->g()V

    .line 29
    return-void

    .line 30
    :pswitch_1
    const/4 p0, 0x1

    .line 31
    const/4 v0, 0x0

    .line 32
    .line 33
    .line 34
    invoke-static {v0, p0, v0}, Lcom/tencent/bugly/proguard/n3;->a(ZZZ)V

    .line 35
    return-void

    .line 36
    .line 37
    .line 38
    :pswitch_2
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->h()V

    .line 39
    return-void

    .line 40
    nop

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
    :pswitch_data_0
    .packed-switch 0x64
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
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
.end method

.method public static triggerUserDataReport()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string v0, "Bugly_Init"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v1, "trigger user info upload failed, pls init monitor first!"

    .line 12
    .line 13
    .line 14
    invoke-static {v0, v1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_0
    :try_start_0
    invoke-static {}, Lcom/tencent/feedback/eup/CrashReport;->triggerUserInfoUpload()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 19
    :catchall_0
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

.method public static updateAppChannel(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->c(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    return-void

    .line 18
    .line 19
    :cond_1
    :goto_0
    const-string p0, "Bugly_Init"

    .line 20
    .line 21
    .line 22
    const-string/jumbo p1, "update app channel failed, pls init monitor first!"

    .line 23
    .line 24
    .line 25
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

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
.end method

.method public static updateDeviceModel(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->f(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    .line 18
    const/16 p0, 0x71

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 22
    return-void

    .line 23
    .line 24
    :cond_1
    :goto_0
    const-string p0, "Bugly_Init"

    .line 25
    .line 26
    .line 27
    const-string/jumbo p1, "update device model failed, pls init monitor first!"

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static updateLogLevel(I)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-string p0, "Bugly_Init"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v0, "update log level failed, pls init monitor first!"

    .line 12
    .line 13
    .line 14
    invoke-static {p0, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 15
    return-void

    .line 16
    .line 17
    .line 18
    :cond_0
    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 19
    move-result-object p0

    .line 20
    .line 21
    const/16 v0, 0x68

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/ff;->c(ILjava/lang/Object;)Z

    .line 25
    return-void
.end method

.method public static updateUniqueId(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->e(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    .line 18
    const/16 p0, 0x6a

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 22
    return-void

    .line 23
    .line 24
    :cond_1
    :goto_0
    const-string p0, "Bugly_Init"

    .line 25
    .line 26
    .line 27
    const-string/jumbo p1, "update unique id failed, pls init monitor first!"

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public static updateUserId(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/n3;->e()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    goto :goto_0

    .line 14
    .line 15
    .line 16
    :cond_0
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/n3;->h(Landroid/content/Context;Ljava/lang/String;)V

    .line 17
    .line 18
    const/16 p0, 0x66

    .line 19
    .line 20
    .line 21
    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ff;->a(ILjava/lang/String;)Z

    .line 22
    return-void

    .line 23
    .line 24
    :cond_1
    :goto_0
    const-string p0, "Bugly_Init"

    .line 25
    .line 26
    .line 27
    const-string/jumbo p1, "update user id failed, pls init monitor first!"

    .line 28
    .line 29
    .line 30
    invoke-static {p0, p1}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I

    .line 31
    return-void
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method
