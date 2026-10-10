.class public Lcom/tencent/bugly/proguard/o6;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final e:Ljava/lang/String; = "RMonitor_FdLeak_Trigger"

.field public static final f:I = 0x3


# instance fields
.field public final a:Lcom/tencent/bugly/proguard/e6;

.field public final b:Lcom/tencent/bugly/proguard/n6;

.field public c:Lcom/tencent/bugly/proguard/l6;

.field public d:I


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/n6;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/e6;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/e6;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/o6;->a:Lcom/tencent/bugly/proguard/e6;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput v0, p0, Lcom/tencent/bugly/proguard/o6;->d:I

    .line 14
    .line 15
    iput-object p1, p0, Lcom/tencent/bugly/proguard/o6;->b:Lcom/tencent/bugly/proguard/n6;

    .line 16
    return-void
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/o6;)Lcom/tencent/bugly/proguard/n6;
    .locals 0

    .line 2
    iget-object p0, p0, Lcom/tencent/bugly/proguard/o6;->b:Lcom/tencent/bugly/proguard/n6;

    return-object p0
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/o6;IILcom/tencent/bugly/proguard/i6;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2, p3}, Lcom/tencent/bugly/proguard/o6;->a(IILcom/tencent/bugly/proguard/i6;)V

    return-void
.end method


# virtual methods
.method public final a(IILcom/tencent/bugly/proguard/i6;)V
    .locals 3

    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o6;->a:Lcom/tencent/bugly/proguard/e6;

    new-instance v1, Lcom/tencent/bugly/proguard/o6$b;

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o6;->b()Lcom/tencent/bugly/proguard/y8;

    move-result-object v2

    invoke-direct {v1, p0, v2, p1, p2}, Lcom/tencent/bugly/proguard/o6$b;-><init>(Lcom/tencent/bugly/proguard/o6;Lcom/tencent/bugly/proguard/s8;II)V

    invoke-virtual {v0, p1, p2, p3, v1}, Lcom/tencent/bugly/proguard/e6;->a(IILcom/tencent/bugly/proguard/i6;Lcom/tencent/bugly/proguard/s8;)V

    return-void
.end method

.method public final a(Lcom/tencent/bugly/proguard/i6;)V
    .locals 1

    .line 15
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/s5;->a()I

    move-result p1

    const/16 v0, 0xb

    if-ne p1, v0, :cond_0

    .line 16
    iget p1, p0, Lcom/tencent/bugly/proguard/o6;->d:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/tencent/bugly/proguard/o6;->d:I

    return-void

    :cond_0
    const/4 p1, 0x0

    .line 17
    iput p1, p0, Lcom/tencent/bugly/proguard/o6;->d:I

    return-void
.end method

.method public final a()Z
    .locals 7

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/h6;->a()V

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o6;->b()Lcom/tencent/bugly/proguard/y8;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/h6;->a(ILcom/tencent/bugly/proguard/w8;)Lcom/tencent/bugly/proguard/i6;

    move-result-object v0

    .line 5
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/o6;->a(Lcom/tencent/bugly/proguard/i6;)V

    .line 6
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/s5;->c()Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    return v3

    .line 7
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/i6;->d()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/Map;

    invoke-static {v2}, Lcom/tencent/rmonitor/fd/cluser/FdCluster;->a(Ljava/util/Map;)Lcom/tencent/bugly/proguard/t5;

    move-result-object v2

    .line 8
    new-instance v4, Ljava/lang/StringBuilder;

    const-string/jumbo v5, "top fd: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "RMonitor_FdLeak_Trigger"

    invoke-static {v5, v4}, Lcom/tencent/bugly/proguard/fb;->c(Ljava/lang/String;Ljava/lang/String;)V

    if-nez v2, :cond_1

    return v3

    .line 9
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/g6;->d()Lcom/tencent/bugly/proguard/m6;

    move-result-object v4

    iget v4, v4, Lcom/tencent/bugly/proguard/hf;->j:F

    .line 10
    const-string v6, "fd_leak"

    invoke-static {v6, v4}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->whetherPluginSampling(Ljava/lang/String;F)Z

    move-result v4

    if-nez v4, :cond_2

    .line 11
    const-string v0, "do fd analyze, but not sampled."

    invoke-static {v5, v0}, Lcom/tencent/bugly/proguard/fb;->c(Ljava/lang/String;Ljava/lang/String;)V

    return v3

    .line 12
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/s6;->d()I

    move-result v3

    .line 13
    new-instance v4, Lcom/tencent/bugly/proguard/o6$a;

    invoke-direct {v4, p0, v2, v3, v0}, Lcom/tencent/bugly/proguard/o6$a;-><init>(Lcom/tencent/bugly/proguard/o6;Lcom/tencent/bugly/proguard/t5;ILcom/tencent/bugly/proguard/i6;)V

    const-wide/16 v2, 0x0

    invoke-static {v4, v2, v3}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInDumpThread(Ljava/lang/Runnable;J)V

    return v1
.end method

.method public b()Lcom/tencent/bugly/proguard/y8;
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o6;->c:Lcom/tencent/bugly/proguard/l6;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    new-instance v0, Ljava/util/ArrayList;

    .line 7
    .line 8
    .line 9
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 10
    .line 11
    sget-object v1, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->fdLeakListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->getListenerList()Ljava/util/ArrayList;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 23
    move-result v2

    .line 24
    .line 25
    if-eqz v2, :cond_0

    .line 26
    .line 27
    .line 28
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    check-cast v2, Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;

    .line 32
    .line 33
    check-cast v2, Lcom/tencent/bugly/proguard/y8;

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_0
    new-instance v1, Lcom/tencent/bugly/proguard/l6;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, v0}, Lcom/tencent/bugly/proguard/l6;-><init>(Ljava/util/List;)V

    .line 43
    .line 44
    iput-object v1, p0, Lcom/tencent/bugly/proguard/o6;->c:Lcom/tencent/bugly/proguard/l6;

    .line 45
    .line 46
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o6;->c:Lcom/tencent/bugly/proguard/l6;

    .line 47
    return-object v0
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

.method public c()Z
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/o6;->d:I

    .line 3
    const/4 v1, 0x3

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    const-string v3, "RMonitor_FdLeak_Trigger"

    .line 7
    .line 8
    if-lt v0, v1, :cond_0

    .line 9
    .line 10
    const-string v0, "fd leak detected, but fd dump empty to many times."

    .line 11
    .line 12
    .line 13
    invoke-static {v3, v0}, Lcom/tencent/bugly/proguard/fb;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 14
    return v2

    .line 15
    .line 16
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    .line 17
    .line 18
    const-string v1, "fd_leak"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    .line 22
    move-result v0

    .line 23
    .line 24
    if-nez v0, :cond_1

    .line 25
    .line 26
    const-string v0, "fd leak detected, but don\'t collect."

    .line 27
    .line 28
    .line 29
    invoke-static {v3, v0}, Lcom/tencent/bugly/proguard/fb;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    return v2

    .line 31
    .line 32
    .line 33
    :cond_1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o6;->a()Z

    .line 34
    move-result v0

    .line 35
    return v0
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
