.class public Lcom/tencent/bugly/proguard/n1;
.super Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;
.source "BUGLY"


# static fields
.field public static final c:Ljava/lang/String; = "BatteryMetricPlugin"


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
    const-string v1, "battery_metric"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/n1;->b:Lcom/tencent/bugly/proguard/hf;

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


# virtual methods
.method public final a()Z
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    .line 3
    .line 4
    const-string v1, "battery_metric"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    const-string v2, "BatteryMetricPlugin"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    const-string v3, "battery metric report too many times today,  please try again next day"

    .line 18
    .line 19
    .line 20
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 21
    move-result-object v2

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 25
    return v1

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverM()Z

    .line 29
    move-result v0

    .line 30
    .line 31
    if-nez v0, :cond_1

    .line 32
    .line 33
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 34
    .line 35
    const-string v3, "battery metric report couldn\'t open below Android M"

    .line 36
    .line 37
    .line 38
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 39
    move-result-object v2

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 43
    return v1

    .line 44
    :cond_1
    const/4 v0, 0x1

    .line 45
    return v0
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
    iget-object v0, p0, Lcom/tencent/bugly/proguard/n1;->b:Lcom/tencent/bugly/proguard/hf;

    .line 3
    .line 4
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/hf;->g:Z

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/n1;->a()Z

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
    const-string v1, "BatteryMetricPlugin"

    .line 17
    .line 18
    .line 19
    const-string/jumbo v2, "start battery metric plugin"

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
    sget-object v0, Lcom/tencent/bugly/proguard/m1$b;->a:Lcom/tencent/bugly/proguard/m1;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/m1;->c()V

    .line 32
    .line 33
    .line 34
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    .line 35
    move-result-object v0

    .line 36
    .line 37
    const-string v1, "battery_metric"

    .line 38
    .line 39
    .line 40
    invoke-static {v1}, Lcom/tencent/bugly/proguard/vd;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;

    .line 41
    move-result-object v1

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/cf;->b(Lcom/tencent/bugly/proguard/ef;)V

    .line 45
    :cond_0
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
.end method

.method public stop()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 3
    .line 4
    const-string v1, "BatteryMetricPlugin"

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "stop battery metric plugin"

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
    sget-object v0, Lcom/tencent/bugly/proguard/m1$b;->a:Lcom/tencent/bugly/proguard/m1;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/m1;->d()V

    .line 20
    .line 21
    .line 22
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v1, "battery_metric"

    .line 26
    .line 27
    .line 28
    invoke-static {v1}, Lcom/tencent/bugly/proguard/vd;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/cf;->a(Lcom/tencent/bugly/proguard/ef;)V

    .line 33
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
