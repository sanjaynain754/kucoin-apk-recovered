.class public Lcom/tencent/rmonitor/sla/d;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final c:Ljava/lang/String; = "RMonitor_sla"

.field public static final d:J = 0x50L


# instance fields
.field public a:J

.field public b:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/rmonitor/sla/d;->a:J

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/tencent/rmonitor/sla/d;->b:Z

    .line 11
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public static synthetic a(Lcom/tencent/rmonitor/sla/d;)J
    .locals 2

    .line 1
    iget-wide v0, p0, Lcom/tencent/rmonitor/sla/d;->a:J

    return-wide v0
.end method


# virtual methods
.method public a(Lcom/tencent/rmonitor/sla/AttaEvent;)I
    .locals 4

    if-nez p1, :cond_0

    goto :goto_0

    .line 9
    :cond_0
    invoke-static {}, Landroid/os/Debug;->isDebuggerConnected()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getEventCost()I

    move-result v0

    int-to-long v0, v0

    const-wide/16 v2, 0x50

    cmp-long v0, v0, v2

    if-ltz v0, :cond_2

    goto :goto_0

    .line 11
    :cond_2
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->getEventResult()I

    move-result p1

    if-nez p1, :cond_3

    :goto_0
    const/4 p1, 0x1

    return p1

    :cond_3
    const/4 p1, 0x0

    return p1
.end method

.method public a()V
    .locals 4

    .line 2
    iget-wide v0, p0, Lcom/tencent/rmonitor/sla/d;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/rmonitor/sla/d;->a:J

    :cond_0
    return-void
.end method

.method public a(I)Z
    .locals 4

    .line 4
    iget-wide v0, p0, Lcom/tencent/rmonitor/sla/d;->a:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 5
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "RMonitor_sla"

    const-string v1, "endStartRMonitor invalid call not start yet."

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    const/4 p1, 0x0

    return p1

    .line 6
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/rmonitor/sla/d;->b:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_1

    return v1

    .line 7
    :cond_1
    iput-boolean v1, p0, Lcom/tencent/rmonitor/sla/d;->b:Z

    .line 8
    invoke-virtual {p0, p1}, Lcom/tencent/rmonitor/sla/d;->b(I)V

    return v1
.end method

.method public b(I)V
    .locals 3

    .line 1
    new-instance v0, Lcom/tencent/rmonitor/sla/d$a;

    invoke-direct {v0, p0, p1}, Lcom/tencent/rmonitor/sla/d$a;-><init>(Lcom/tencent/rmonitor/sla/d;I)V

    .line 2
    invoke-static {}, Lcom/tencent/bugly/common/thread/ThreadManager;->inMonitorThread()Z

    move-result p1

    if-eqz p1, :cond_0

    .line 3
    invoke-virtual {v0}, Lcom/tencent/rmonitor/sla/d$a;->run()V

    return-void

    :cond_0
    const-wide/16 v1, 0x0

    .line 4
    invoke-static {v0, v1, v2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMonitorThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public b(Lcom/tencent/rmonitor/sla/AttaEvent;)V
    .locals 2
    .param p1    # Lcom/tencent/rmonitor/sla/AttaEvent;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 5
    sget-object v0, Lcom/tencent/rmonitor/sla/AttaEventReporter;->Companion:Lcom/tencent/rmonitor/sla/AttaEventReporter$Companion;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/sla/AttaEventReporter$Companion;->getInstance()Lcom/tencent/rmonitor/sla/AttaEventReporter;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {v0, p1, v1}, Lcom/tencent/rmonitor/sla/AttaEventReporter;->reportAsync(Lcom/tencent/rmonitor/sla/AttaEvent;Z)V

    return-void
.end method
