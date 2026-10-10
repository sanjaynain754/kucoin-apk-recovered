.class public Lcom/tencent/bugly/proguard/zc;
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

    .line 1
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->natMemListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->getListenerList()Ljava/util/ArrayList;

    move-result-object v0

    .line 2
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;

    .line 3
    instance-of v2, v1, Lcom/tencent/bugly/proguard/k9;

    if-eqz v2, :cond_0

    .line 4
    check-cast v1, Lcom/tencent/bugly/proguard/k9;

    invoke-interface {v1}, Lcom/tencent/bugly/proguard/k9;->c()V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static a(I)V
    .locals 3

    .line 5
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->natMemListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->getListenerList()Ljava/util/ArrayList;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;

    .line 7
    instance-of v2, v1, Lcom/tencent/bugly/proguard/k9;

    if-eqz v2, :cond_0

    .line 8
    check-cast v1, Lcom/tencent/bugly/proguard/k9;

    invoke-interface {v1, p0}, Lcom/tencent/bugly/proguard/k9;->a(I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static a(Ljava/lang/String;)V
    .locals 1

    .line 13
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b(Ljava/lang/String;)V

    return-void
.end method

.method public static a(Ljava/lang/String;I)V
    .locals 3

    .line 9
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->natMemListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->getListenerList()Ljava/util/ArrayList;

    move-result-object v0

    .line 10
    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;

    .line 11
    instance-of v2, v1, Lcom/tencent/bugly/proguard/k9;

    if-eqz v2, :cond_0

    .line 12
    check-cast v1, Lcom/tencent/bugly/proguard/k9;

    invoke-interface {v1, p0, p1}, Lcom/tencent/bugly/proguard/k9;->a(Ljava/lang/String;I)V

    goto :goto_0

    :cond_1
    return-void
.end method

.method public static b(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->b()Lcom/tencent/rmonitor/natmem/NatMemMonitor;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/natmem/NatMemMonitor;->c(Ljava/lang/String;)V

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
    .line 25
.end method
