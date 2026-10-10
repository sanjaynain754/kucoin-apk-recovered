.class public Lcom/tencent/bugly/proguard/ti;
.super Lcom/tencent/bugly/proguard/df;
.source "BUGLY"


# static fields
.field public static final c:Ljava/lang/String; = "RMonitor_looper_WorkThread"

.field public static d:Ljava/lang/ref/WeakReference;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ref/WeakReference<",
            "Lcom/tencent/bugly/proguard/ti;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public b:Z


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
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/df;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ti;->b:Z

    .line 7
    .line 8
    new-instance v0, Ljava/lang/ref/WeakReference;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V

    .line 12
    .line 13
    sput-object v0, Lcom/tencent/bugly/proguard/ti;->d:Ljava/lang/ref/WeakReference;

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
.end method

.method public static a()Lcom/tencent/bugly/proguard/ti;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/ti;->d:Ljava/lang/ref/WeakReference;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return-object v0

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {v0}, Ljava/lang/ref/Reference;->get()Ljava/lang/Object;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    check-cast v0, Lcom/tencent/bugly/proguard/ti;

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method


# virtual methods
.method public getPluginName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "work_thread_lag"

    .line 4
    return-object v0
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

.method public isRunning()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/ti;->b:Z

    .line 3
    return v0
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

.method public start()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/looper/LooperConfig;->INSTANCE:Lcom/tencent/rmonitor/looper/LooperConfig;

    .line 3
    .line 4
    .line 5
    const-string/jumbo v1, "work_thread_lag"

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/looper/LooperConfig;->isCanCollect(Ljava/lang/String;)Z

    .line 9
    move-result v0

    .line 10
    .line 11
    const-string v1, "RMonitor_looper_WorkThread"

    .line 12
    const/4 v2, 0x1

    .line 13
    const/4 v3, 0x0

    .line 14
    .line 15
    if-nez v0, :cond_0

    .line 16
    .line 17
    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/ti;->b:Z

    .line 18
    .line 19
    const-string v0, "can not collect"

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v2, v0}, Lcom/tencent/bugly/proguard/df;->notifyStartResult(ILjava/lang/String;)V

    .line 23
    .line 24
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 25
    .line 26
    .line 27
    const-string/jumbo v2, "start, can not collect"

    .line 28
    .line 29
    .line 30
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 35
    return-void

    .line 36
    .line 37
    :cond_0
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/ti;->b:Z

    .line 38
    .line 39
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 40
    .line 41
    .line 42
    const-string/jumbo v2, "start"

    .line 43
    .line 44
    .line 45
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 46
    move-result-object v1

    .line 47
    .line 48
    .line 49
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 50
    const/4 v0, 0x0

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v3, v0}, Lcom/tencent/bugly/proguard/df;->notifyStartResult(ILjava/lang/String;)V

    .line 54
    return-void
    .line 55
    .line 56
    .line 57
.end method

.method public stop()V
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ti;->b:Z

    .line 4
    .line 5
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 6
    .line 7
    const-string v2, "RMonitor_looper_WorkThread"

    .line 8
    .line 9
    .line 10
    const-string/jumbo v3, "stop"

    .line 11
    .line 12
    .line 13
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 14
    move-result-object v2

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/df;->notifyStopResult(ILjava/lang/String;)V

    .line 22
    return-void
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
