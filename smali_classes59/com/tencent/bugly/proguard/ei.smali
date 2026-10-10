.class public Lcom/tencent/bugly/proguard/ei;
.super Lcom/tencent/bugly/proguard/pa;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/common/looper/IFrame;
.implements Lcom/tencent/bugly/proguard/i;


# static fields
.field public static final d:Ljava/lang/String; = "RMonitor_lag_vsync"


# instance fields
.field public final b:Lcom/tencent/bugly/proguard/j;

.field public c:J


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/qa;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/pa;-><init>(Lcom/tencent/bugly/proguard/qa;)V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/ei;->c:J

    .line 8
    .line 9
    new-instance p1, Lcom/tencent/bugly/proguard/j;

    .line 10
    .line 11
    .line 12
    invoke-direct {p1, p0}, Lcom/tencent/bugly/proguard/j;-><init>(Lcom/tencent/bugly/proguard/i;)V

    .line 13
    .line 14
    iput-object p1, p0, Lcom/tencent/bugly/proguard/ei;->b:Lcom/tencent/bugly/proguard/j;

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
.end method


# virtual methods
.method public final a(J)V
    .locals 5

    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/ei;->c:J

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-eqz v4, :cond_0

    sub-long v0, p1, v0

    .line 3
    invoke-virtual {p0, p1, p2, v0, v1}, Lcom/tencent/bugly/proguard/pa;->endDetection(JJ)V

    .line 4
    :cond_0
    iput-wide v2, p0, Lcom/tencent/bugly/proguard/ei;->c:J

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 0

    .line 1
    return-void
.end method

.method public doFrame(J)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    move-result-wide p1

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/ei;->a(J)V

    .line 8
    .line 9
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/ei;->c:J

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/pa;->beginDetection(J)V

    .line 13
    return-void
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

.method public getMonitoredThread()Ljava/lang/Thread;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 v0, 0x0

    .line 8
    return-object v0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public isOpen()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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

.method public onBackground()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ei;->pause()V

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

.method public onForeground()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ei;->resume()V

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

.method public pause()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/tencent/bugly/proguard/pa;->pause()V

    .line 4
    .line 5
    sget-object v0, Lcom/tencent/bugly/common/looper/FrameManager;->Companion:Lcom/tencent/bugly/common/looper/FrameManager$Companion;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/common/looper/FrameManager$Companion;->unRegister(Lcom/tencent/bugly/common/looper/IFrame;)V

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/ei;->a(J)V

    .line 16
    .line 17
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 18
    .line 19
    const-string v1, "RMonitor_lag_vsync"

    .line 20
    .line 21
    .line 22
    const-string/jumbo v2, "pause"

    .line 23
    .line 24
    .line 25
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 30
    return-void
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

.method public resume()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-super {p0}, Lcom/tencent/bugly/proguard/pa;->resume()V

    .line 4
    .line 5
    sget-object v0, Lcom/tencent/bugly/common/looper/FrameManager;->Companion:Lcom/tencent/bugly/common/looper/FrameManager$Companion;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/common/looper/FrameManager$Companion;->register(Lcom/tencent/bugly/common/looper/IFrame;)V

    .line 9
    .line 10
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 11
    .line 12
    const-string v1, "RMonitor_lag_vsync"

    .line 13
    .line 14
    .line 15
    const-string/jumbo v2, "resume"

    .line 16
    .line 17
    .line 18
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 23
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
    .line 3
    invoke-super {p0}, Lcom/tencent/bugly/proguard/pa;->start()V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ei;->b:Lcom/tencent/bugly/proguard/j;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/j;->a()V

    .line 9
    .line 10
    sget-object v0, Lcom/tencent/bugly/common/looper/FrameManager;->Companion:Lcom/tencent/bugly/common/looper/FrameManager$Companion;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/common/looper/FrameManager$Companion;->register(Lcom/tencent/bugly/common/looper/IFrame;)V

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    const-string v1, "RMonitor_lag_vsync"

    .line 18
    .line 19
    .line 20
    const-string/jumbo v2, "start"

    .line 21
    .line 22
    .line 23
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 28
    return-void
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

.method public stop()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/common/looper/FrameManager;->Companion:Lcom/tencent/bugly/common/looper/FrameManager$Companion;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Lcom/tencent/bugly/common/looper/FrameManager$Companion;->unRegister(Lcom/tencent/bugly/common/looper/IFrame;)V

    .line 6
    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ei;->b:Lcom/tencent/bugly/proguard/j;

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/j;->b()V

    .line 11
    .line 12
    .line 13
    invoke-super {p0}, Lcom/tencent/bugly/proguard/pa;->stop()V

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    const-string v1, "RMonitor_lag_vsync"

    .line 18
    .line 19
    .line 20
    const-string/jumbo v2, "stop"

    .line 21
    .line 22
    .line 23
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 24
    move-result-object v1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 28
    return-void
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
