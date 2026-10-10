.class public Lcom/tencent/bugly/proguard/y1;
.super Ljava/lang/Object;
.source "BUGLY"


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
.end method

.method public static a()V
    .locals 3

    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_init"

    const-string v2, "initConfig"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 9
    invoke-static {}, Lcom/tencent/bugly/proguard/v2$b;->a()Lcom/tencent/bugly/proguard/v2;

    move-result-object v0

    .line 10
    new-instance v1, Lcom/tencent/bugly/proguard/g3;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/g3;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/v2;->a(Lcom/tencent/bugly/proguard/l8;)V

    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/v2$b;->a()Lcom/tencent/bugly/proguard/v2;

    move-result-object v0

    .line 12
    new-instance v1, Lcom/tencent/bugly/proguard/oa;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/oa;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/v2;->a(Lcom/tencent/bugly/proguard/l8;)V

    .line 13
    invoke-static {}, Lcom/tencent/bugly/proguard/v2$b;->a()Lcom/tencent/bugly/proguard/v2;

    move-result-object v0

    .line 14
    new-instance v1, Lcom/tencent/bugly/proguard/wb;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/wb;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/v2;->a(Lcom/tencent/bugly/proguard/l8;)V

    .line 15
    invoke-static {}, Lcom/tencent/bugly/proguard/v2$b;->a()Lcom/tencent/bugly/proguard/v2;

    move-result-object v0

    .line 16
    new-instance v1, Lcom/tencent/bugly/proguard/k4;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/k4;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/v2;->a(Lcom/tencent/bugly/proguard/l8;)V

    .line 17
    invoke-static {}, Lcom/tencent/bugly/proguard/v2$b;->a()Lcom/tencent/bugly/proguard/v2;

    move-result-object v0

    .line 18
    new-instance v1, Lcom/tencent/bugly/proguard/uf;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/uf;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/v2;->a(Lcom/tencent/bugly/proguard/l8;)V

    .line 19
    invoke-static {}, Lcom/tencent/bugly/proguard/v2$b;->a()Lcom/tencent/bugly/proguard/v2;

    move-result-object v0

    .line 20
    new-instance v1, Lcom/tencent/bugly/proguard/n2;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/n2;-><init>()V

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/v2;->a(Lcom/tencent/bugly/proguard/l8;)V

    return-void
.end method

.method public static a(Landroid/content/Context;Lcom/tencent/bugly/library/BuglyBuilder;)V
    .locals 2

    .line 1
    iget-object v0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->initAppState:Ljava/lang/String;

    const-string v1, "foreground"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->initAppState:Ljava/lang/String;

    .line 2
    const-string v1, "background"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 3
    :cond_0
    iget-object v0, p1, Lcom/tencent/bugly/library/BuglyBuilder;->initAppState:Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->initAppState(Ljava/lang/String;)V

    .line 4
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/y1;->b()V

    .line 5
    invoke-static {}, Lcom/tencent/bugly/proguard/y1;->a()V

    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/y1;->c()V

    .line 7
    iget-object p1, p1, Lcom/tencent/bugly/library/BuglyBuilder;->appId:Ljava/lang/String;

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/xa;->a(Landroid/content/Context;Ljava/lang/String;)V

    return-void
.end method

.method public static b()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 3
    .line 4
    const-string v1, "RMonitor_init"

    .line 5
    .line 6
    const-string v2, "initJsonProtocol"

    .line 7
    .line 8
    .line 9
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 14
    const/4 v0, 0x1

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Lcom/tencent/bugly/proguard/n3;->d(Z)V

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

.method public static c()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 3
    .line 4
    const-string v1, "RMonitor_init"

    .line 5
    .line 6
    const-string v2, "initPluginFactory"

    .line 7
    .line 8
    .line 9
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->INSTANCE:Lcom/tencent/rmonitor/manager/RMonitorLauncher;

    .line 16
    .line 17
    new-instance v1, Lcom/tencent/bugly/proguard/xd;

    .line 18
    .line 19
    .line 20
    invoke-direct {v1}, Lcom/tencent/bugly/proguard/xd;-><init>()V

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->setPluginFactory(Lcom/tencent/bugly/proguard/wd;)V

    .line 24
    return-void
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
