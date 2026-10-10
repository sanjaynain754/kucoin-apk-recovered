.class public Lcom/tencent/bugly/proguard/hh;
.super Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;
.source "BUGLY"


# static fields
.field public static final c:Ljava/lang/String; = "TrafficPlugin"


# instance fields
.field public final b:Lcom/tencent/bugly/proguard/hf;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;-><init>()V

    .line 4
    .line 5
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    const-string/jumbo v1, "traffic"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/bugly/proguard/hh;->b:Lcom/tencent/bugly/proguard/hf;

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
.end method


# virtual methods
.method public final a()Z
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "traffic"

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    if-nez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 14
    .line 15
    const-string v1, "TrafficPlugin"

    .line 16
    .line 17
    .line 18
    const-string/jumbo v2, "traffic report too many times today,  please try again next day"

    .line 19
    .line 20
    .line 21
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 26
    const/4 v0, 0x0

    .line 27
    return v0

    .line 28
    :cond_0
    const/4 v0, 0x1

    .line 29
    return v0
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

.method public start()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hh;->b:Lcom/tencent/bugly/proguard/hf;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/hf;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hh;->a()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 15
    .line 16
    const-string v1, "TrafficPlugin"

    .line 17
    .line 18
    .line 19
    const-string/jumbo v2, "start traffic plugin"

    .line 20
    .line 21
    .line 22
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/tencent/bugly/traffic/TrafficMonitor;->c()Lcom/tencent/bugly/traffic/TrafficMonitor;

    .line 30
    move-result-object v0

    .line 31
    const/4 v1, 0x1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/traffic/TrafficMonitor;->c(Z)Z

    .line 35
    .line 36
    sget-object v0, Lcom/tencent/bugly/traffic/TrafficMonitor$b;->a:Lcom/tencent/bugly/traffic/TrafficMonitor;

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0}, Lcom/tencent/bugly/traffic/TrafficMonitor;->g()V

    .line 40
    .line 41
    .line 42
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    .line 43
    move-result-object v0

    .line 44
    .line 45
    .line 46
    const-string/jumbo v1, "traffic"

    .line 47
    .line 48
    .line 49
    invoke-static {v1}, Lcom/tencent/bugly/proguard/vd;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/cf;->b(Lcom/tencent/bugly/proguard/ef;)V

    .line 54
    :cond_0
    return-void
    .line 55
    .line 56
    .line 57
.end method

.method public stop()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 3
    .line 4
    const-string v1, "TrafficPlugin"

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "stop traffic plugin"

    .line 8
    .line 9
    .line 10
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/tencent/bugly/traffic/TrafficMonitor;->c()Lcom/tencent/bugly/traffic/TrafficMonitor;

    .line 18
    move-result-object v0

    .line 19
    const/4 v1, 0x0

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/traffic/TrafficMonitor;->c(Z)Z

    .line 23
    .line 24
    sget-object v0, Lcom/tencent/bugly/traffic/TrafficMonitor$b;->a:Lcom/tencent/bugly/traffic/TrafficMonitor;

    .line 25
    const/4 v1, 0x1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/traffic/TrafficMonitor;->d(Z)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    .line 32
    move-result-object v0

    .line 33
    .line 34
    .line 35
    const-string/jumbo v1, "traffic"

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lcom/tencent/bugly/proguard/vd;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/cf;->a(Lcom/tencent/bugly/proguard/ef;)V

    .line 43
    return-void
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
