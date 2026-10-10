.class public Lcom/tencent/bugly/proguard/mb;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_Magnifier"

.field public static final b:I = 0x1

.field public static final c:I = 0x2

.field public static final d:I = 0x3

.field public static final e:I = 0x4

.field public static volatile f:Z


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

.method public static a(Ljava/lang/String;Z)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/rmonitor/sla/b$c;->a()Lcom/tencent/rmonitor/sla/b;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Lcom/tencent/rmonitor/sla/b;->a()V

    .line 3
    sget-object v0, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->INSTANCE:Lcom/tencent/rmonitor/manager/RMonitorLauncher;

    invoke-virtual {v0, p0, p1}, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->getPlugin(Ljava/lang/String;Z)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;

    move-result-object p0

    .line 4
    invoke-static {}, Lcom/tencent/rmonitor/sla/b$c;->a()Lcom/tencent/rmonitor/sla/b;

    move-result-object p1

    .line 5
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/b;->h()V

    return-object p0
.end method

.method public static a()V
    .locals 3

    .line 14
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x3

    const/4 v1, 0x0

    .line 15
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/mb;->a(ILjava/util/List;)V

    return-void

    .line 16
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "abolish fail, app: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", userMeta: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RMonitor_Magnifier"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void
.end method

.method public static a(ILjava/util/List;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 17
    new-instance v0, Lcom/tencent/bugly/proguard/mb$a;

    invoke-direct {v0, p0, p1}, Lcom/tencent/bugly/proguard/mb$a;-><init>(ILjava/util/List;)V

    const-wide/16 p0, 0x0

    .line 18
    invoke-static {v0, p0, p1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMonitorThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public static a(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    const-string v1, "RMonitor_Magnifier"

    if-eqz v0, :cond_3

    .line 7
    sget-boolean v0, Lcom/tencent/bugly/proguard/mb;->f:Z

    if-eqz v0, :cond_1

    sget-object v0, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->INSTANCE:Lcom/tencent/rmonitor/manager/RMonitorLauncher;

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->checkAllDesiredPluginStarted(Ljava/util/List;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    .line 8
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "startMonitors, "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, " has started yet."

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 9
    :cond_1
    :goto_0
    sget-boolean v0, Lcom/tencent/bugly/proguard/mb;->f:Z

    const/4 v1, 0x1

    if-nez v0, :cond_2

    .line 10
    sput-boolean v1, Lcom/tencent/bugly/proguard/mb;->f:Z

    .line 11
    :cond_2
    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/mb;->a(ILjava/util/List;)V

    return-void

    .line 12
    :cond_3
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p0

    sget-object v0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    filled-new-array {v0, v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string/jumbo v2, "startMonitors fail, app: %s, userMeta: %s"

    invoke-static {p0, v2, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    .line 13
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void
.end method

.method public static b()V
    .locals 3

    .line 6
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    const/4 v1, 0x0

    .line 7
    invoke-static {v0, v1}, Lcom/tencent/bugly/proguard/mb;->a(ILjava/util/List;)V

    return-void

    .line 8
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "stopDisabledPlugins fail for [app: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", userMeta: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RMonitor_Magnifier"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/util/List;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    move-result v0

    const-string v1, "RMonitor_Magnifier"

    if-eqz v0, :cond_1

    .line 2
    sget-object v0, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->INSTANCE:Lcom/tencent/rmonitor/manager/RMonitorLauncher;

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->checkSomeDesiredPluginStarted(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x2

    .line 3
    invoke-static {v0, p0}, Lcom/tencent/bugly/proguard/mb;->a(ILjava/util/List;)V

    return-void

    .line 4
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "stopMonitors, no monitor started for "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v1, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 5
    :cond_1
    sget-object p0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "stopMonitors fail app: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v2, ", userMeta: "

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void
.end method
