.class public abstract Lcom/tencent/bugly/proguard/pa;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;


# static fields
.field static final TAG:Ljava/lang/String; = "RMonitor_lag"


# instance fields
.field private isDetecting:Z

.field private isResume:Z

.field private final lagParam:Lcom/tencent/bugly/proguard/qa;

.field private stackProvider:Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/qa;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/pa;->stackProvider:Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/pa;->isResume:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/pa;->isDetecting:Z

    .line 12
    .line 13
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pa;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 14
    return-void
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


# virtual methods
.method public beginDetection(J)V
    .locals 5

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pa;->stackProvider:Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/pa;->isResume:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {}, Ljava/lang/Math;->random()D

    .line 10
    move-result-wide v1

    .line 11
    .line 12
    iget-object v3, p0, Lcom/tencent/bugly/proguard/pa;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 13
    .line 14
    iget v3, v3, Lcom/tencent/bugly/proguard/qa;->a:F

    .line 15
    float-to-double v3, v3

    .line 16
    .line 17
    cmpg-double v1, v1, v3

    .line 18
    .line 19
    if-gez v1, :cond_0

    .line 20
    const/4 v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v1, 0x0

    .line 23
    .line 24
    :goto_0
    if-eqz v1, :cond_1

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/pa;->isDetecting:Z

    .line 29
    .line 30
    .line 31
    invoke-interface {v0, p1, p2}, Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;->dispatchStart(J)V

    .line 32
    :cond_1
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

.method public endDetection(JJ)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pa;->stackProvider:Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;

    .line 3
    .line 4
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/pa;->isDetecting:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-interface {v0, p1, p2, p3, p4}, Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;->dispatchEnd(JJ)V

    .line 12
    :cond_0
    const/4 p1, 0x0

    .line 13
    .line 14
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/pa;->isDetecting:Z

    .line 15
    return-void
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
.end method

.method public abstract getMonitoredThread()Ljava/lang/Thread;
.end method

.method public getMonitoredThreadName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/pa;->getMonitoredThread()Ljava/lang/Thread;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    return-object v0

    .line 12
    .line 13
    :cond_0
    const-string v0, ""

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
.end method

.method public isResume()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/pa;->isResume:Z

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

.method public onAfterStack(Lcom/tencent/rmonitor/looper/MonitorInfo;)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 9
    .line 10
    const-string v0, "RMonitor_lag"

    .line 11
    .line 12
    .line 13
    const-string/jumbo v1, "onAfterStack, in debugger mode."

    .line 14
    .line 15
    .line 16
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 21
    return-void

    .line 22
    .line 23
    :cond_0
    if-eqz p1, :cond_1

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getDuration()J

    .line 27
    move-result-wide v0

    .line 28
    .line 29
    iget-object v2, p0, Lcom/tencent/bugly/proguard/pa;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 30
    .line 31
    iget-wide v2, v2, Lcom/tencent/bugly/proguard/qa;->b:J

    .line 32
    .line 33
    cmp-long v0, v0, v2

    .line 34
    .line 35
    if-lez v0, :cond_1

    .line 36
    .line 37
    sget-object v0, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    .line 38
    .line 39
    new-instance v1, Lcom/tencent/bugly/proguard/pa$a;

    .line 40
    .line 41
    .line 42
    invoke-direct {v1, p0, p1}, Lcom/tencent/bugly/proguard/pa$a;-><init>(Lcom/tencent/bugly/proguard/pa;Lcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->post(Ljava/lang/Runnable;)V

    .line 46
    :cond_1
    return-void
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

.method public pause()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/pa;->isResume:Z

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

.method public resume()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/pa;->isResume:Z

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

.method public setStackProvider(Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;)V
    .locals 0

    .line 1
    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pa;->stackProvider:Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;

    .line 3
    return-void
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public start()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/pa;->getMonitoredThread()Ljava/lang/Thread;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pa;->stackProvider:Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;

    .line 7
    .line 8
    if-eqz v1, :cond_0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    iget-object v2, p0, Lcom/tencent/bugly/proguard/pa;->lagParam:Lcom/tencent/bugly/proguard/qa;

    .line 13
    .line 14
    .line 15
    invoke-interface {v1, v0, v2, p0}, Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;->prepare(Ljava/lang/Thread;Lcom/tencent/bugly/proguard/qa;Lcom/tencent/rmonitor/looper/listener/IMonitorCallback;)Z

    .line 16
    :cond_0
    return-void
    .line 17
.end method

.method public stop()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pa;->stackProvider:Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-interface {v0}, Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;->stop()V

    .line 8
    :cond_0
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
.end method
