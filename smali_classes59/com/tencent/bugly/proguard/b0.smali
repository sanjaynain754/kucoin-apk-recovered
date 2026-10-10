.class public final Lcom/tencent/bugly/proguard/b0;
.super Lcom/tencent/bugly/proguard/kg;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/k$b;
.implements Lcom/tencent/bugly/proguard/h$d;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "NewApi"
    }
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/b0$b;
    }
.end annotation


# static fields
.field public static m:Lcom/tencent/bugly/proguard/b0; = null

.field public static final n:Ljava/lang/String; = "RMonitor_launch_Monitor"

.field public static final o:J = 0x2bf20L

.field public static final p:J = 0x1f4L

.field public static final q:I = 0xa


# instance fields
.field public b:I

.field public c:Z

.field public d:Z

.field public e:Lcom/tencent/bugly/proguard/k;

.field public f:Lcom/tencent/bugly/proguard/h;

.field public final g:Lcom/tencent/bugly/proguard/g0;

.field public final h:Lcom/tencent/bugly/proguard/h0;

.field public final i:Lcom/tencent/bugly/proguard/ra;

.field public j:Lcom/tencent/bugly/proguard/ii;

.field public k:Lcom/tencent/bugly/proguard/k2;

.field public l:I


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
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/kg;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/bugly/proguard/b0;->b:I

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/b0;->c:Z

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/b0;->d:Z

    .line 12
    const/4 v0, 0x0

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b0;->e:Lcom/tencent/bugly/proguard/k;

    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b0;->f:Lcom/tencent/bugly/proguard/h;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b0;->j:Lcom/tencent/bugly/proguard/ii;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b0;->k:Lcom/tencent/bugly/proguard/k2;

    .line 21
    .line 22
    const/16 v0, 0xa

    .line 23
    .line 24
    iput v0, p0, Lcom/tencent/bugly/proguard/b0;->l:I

    .line 25
    .line 26
    new-instance v0, Lcom/tencent/bugly/proguard/g0;

    .line 27
    .line 28
    .line 29
    invoke-static {}, Lcom/tencent/bugly/proguard/ch;->d()Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/g0;-><init>(Ljava/lang/String;)V

    .line 34
    .line 35
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b0;->g:Lcom/tencent/bugly/proguard/g0;

    .line 36
    .line 37
    new-instance v0, Lcom/tencent/bugly/proguard/h0;

    .line 38
    .line 39
    .line 40
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/h0;-><init>()V

    .line 41
    .line 42
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b0;->h:Lcom/tencent/bugly/proguard/h0;

    .line 43
    .line 44
    new-instance v0, Lcom/tencent/bugly/proguard/ra;

    .line 45
    .line 46
    .line 47
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ra;-><init>()V

    .line 48
    .line 49
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b0;->i:Lcom/tencent/bugly/proguard/ra;

    .line 50
    return-void
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public static g()Lcom/tencent/bugly/proguard/b0;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/b0;->m:Lcom/tencent/bugly/proguard/b0;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    const-class v0, Lcom/tencent/bugly/proguard/b0;

    .line 7
    monitor-enter v0

    .line 8
    .line 9
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/b0;->m:Lcom/tencent/bugly/proguard/b0;

    .line 10
    .line 11
    if-nez v1, :cond_0

    .line 12
    .line 13
    new-instance v1, Lcom/tencent/bugly/proguard/b0;

    .line 14
    .line 15
    .line 16
    invoke-direct {v1}, Lcom/tencent/bugly/proguard/b0;-><init>()V

    .line 17
    .line 18
    sput-object v1, Lcom/tencent/bugly/proguard/b0;->m:Lcom/tencent/bugly/proguard/b0;

    .line 19
    goto :goto_0

    .line 20
    :catchall_0
    move-exception v1

    .line 21
    goto :goto_1

    .line 22
    :cond_0
    :goto_0
    monitor-exit v0

    .line 23
    goto :goto_2

    .line 24
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 25
    throw v1

    .line 26
    .line 27
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/bugly/proguard/b0;->m:Lcom/tencent/bugly/proguard/b0;

    .line 28
    return-object v0
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
.method public final a()V
    .locals 1

    .line 46
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->f:Lcom/tencent/bugly/proguard/h;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 47
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverJellyBeanMr2()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 48
    new-instance v0, Lcom/tencent/bugly/proguard/h;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/h;-><init>(Lcom/tencent/bugly/proguard/h$d;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/b0;->f:Lcom/tencent/bugly/proguard/h;

    :cond_1
    :goto_0
    return-void
.end method

.method public a(I)V
    .locals 2

    .line 1
    iput p1, p0, Lcom/tencent/bugly/proguard/b0;->l:I

    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string/jumbo v1, "updateWarmLaunchReportCount, %d"

    invoke-static {v1, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    const-string v1, "RMonitor_launch_Monitor"

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return-void
.end method

.method public a(Landroid/app/Application;)V
    .locals 3

    .line 10
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/b0;->c:Z

    const-string v1, "RMonitor_launch_Monitor"

    if-eqz v0, :cond_0

    .line 11
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "call startOnApplicationOnCreate fail forAppLaunchMonitor has started before."

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void

    .line 12
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v2, "startOnApplicationOnCreate"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    const/4 v0, 0x1

    .line 13
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/b0;->c:Z

    .line 14
    new-instance v0, Lcom/tencent/bugly/proguard/k2;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/k2;-><init>(Lcom/tencent/bugly/proguard/b0;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/b0;->k:Lcom/tencent/bugly/proguard/k2;

    .line 15
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k2;->k()V

    .line 16
    new-instance v0, Lcom/tencent/bugly/proguard/ii;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/ii;-><init>(Lcom/tencent/bugly/proguard/b0;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/b0;->j:Lcom/tencent/bugly/proguard/ii;

    .line 17
    invoke-static {p0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 18
    invoke-static {p1}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->initOnApplicationOnCreate(Landroid/app/Application;)V

    .line 19
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/b0;->d:Z

    if-eqz p1, :cond_1

    .line 20
    new-instance p1, Lcom/tencent/bugly/proguard/k;

    invoke-direct {p1, p0}, Lcom/tencent/bugly/proguard/k;-><init>(Lcom/tencent/bugly/proguard/k$b;)V

    iput-object p1, p0, Lcom/tencent/bugly/proguard/b0;->e:Lcom/tencent/bugly/proguard/k;

    .line 21
    :cond_1
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b0;->e:Lcom/tencent/bugly/proguard/k;

    if-eqz p1, :cond_2

    .line 22
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/k;->d()V

    :cond_2
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/a0;)V
    .locals 1
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 23
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->k:Lcom/tencent/bugly/proguard/k2;

    if-eqz v0, :cond_0

    .line 24
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/k2;->a(Lcom/tencent/bugly/proguard/a0;)V

    :cond_0
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/b0$b;)V
    .locals 4

    .line 31
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "RMonitor_launch_Monitor"

    const-string/jumbo v3, "postCheckAppLaunchStageTask, from: "

    filled-new-array {v2, v3, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 32
    sget-object v0, Lcom/tencent/bugly/proguard/b0$b;->c:Lcom/tencent/bugly/proguard/b0$b;

    if-ne p1, v0, :cond_0

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b0;->h()Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    .line 33
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/b0$b;->b:Lcom/tencent/bugly/proguard/b0$b;

    if-ne p1, v0, :cond_1

    const-wide/32 v0, 0x2bf20

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x1f4

    .line 34
    :goto_0
    new-instance p1, Lcom/tencent/bugly/proguard/b0$a;

    invoke-direct {p1, p0}, Lcom/tencent/bugly/proguard/b0$a;-><init>(Lcom/tencent/bugly/proguard/b0;)V

    .line 35
    invoke-static {p1, v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/h$b;)V
    .locals 3
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 25
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->k:Lcom/tencent/bugly/proguard/k2;

    if-eqz v0, :cond_0

    .line 26
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/k2;->a(Lcom/tencent/bugly/proguard/h$b;)V

    .line 27
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->j:Lcom/tencent/bugly/proguard/ii;

    if-eqz v0, :cond_1

    .line 28
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ii;->a(Lcom/tencent/bugly/proguard/h$b;)V

    .line 29
    :cond_1
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->debug:Z

    if-eqz v0, :cond_2

    .line 30
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v1, "onLaunchComplete"

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/h$b;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v2, "RMonitor_launch_Monitor"

    filled-new-array {v2, v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->i:Lcom/tencent/bugly/proguard/ra;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ra;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;JJJ)V
    .locals 8

    .line 36
    new-instance v0, Lcom/tencent/bugly/proguard/e0;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-wide v6, p6

    invoke-direct/range {v0 .. v7}, Lcom/tencent/bugly/proguard/e0;-><init>(Ljava/lang/String;JJJ)V

    .line 37
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b0;->g:Lcom/tencent/bugly/proguard/g0;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/g0;->c()Ljava/util/ArrayList;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/e0;->a(Ljava/util/List;)V

    .line 38
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b0;->h:Lcom/tencent/bugly/proguard/h0;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/h0;->b()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/e0;->b(Ljava/util/List;)V

    .line 39
    invoke-static {}, Lcom/tencent/bugly/proguard/d0;->b()Lcom/tencent/bugly/proguard/d0;

    move-result-object p1

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/d0;->b(Lcom/tencent/bugly/proguard/e0;)V

    .line 40
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b0;->g:Lcom/tencent/bugly/proguard/g0;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/g0;->a()V

    .line 41
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b0;->h:Lcom/tencent/bugly/proguard/h0;

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/h0;->a()V

    .line 42
    iget p1, p0, Lcom/tencent/bugly/proguard/b0;->b:I

    add-int/lit8 p1, p1, 0x1

    iput p1, p0, Lcom/tencent/bugly/proguard/b0;->b:I

    .line 43
    iget p2, p0, Lcom/tencent/bugly/proguard/b0;->l:I

    if-lt p1, p2, :cond_0

    .line 44
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b0;->n()V

    .line 45
    :cond_0
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo p2, "report, result: "

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/e0;->toString()Ljava/lang/String;

    move-result-object p3

    const-string p4, "RMonitor_launch_Monitor"

    filled-new-array {p4, p2, p3}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 49
    invoke-static {}, Lcom/tencent/bugly/proguard/d0;->b()Lcom/tencent/bugly/proguard/d0;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/d0;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;JJ)V
    .locals 8

    .line 5
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    cmp-long v2, p5, p3

    if-ltz v2, :cond_0

    cmp-long v2, p5, v0

    if-gtz v2, :cond_0

    cmp-long v2, p3, v0

    if-gtz v2, :cond_0

    sub-long/2addr v0, p3

    const-wide/32 v2, 0x2bf20

    cmp-long v0, v0, v2

    if-lez v0, :cond_1

    :cond_0
    move-object v2, p1

    move-wide v4, p3

    move-wide v6, p5

    goto :goto_0

    .line 6
    :cond_1
    iget-object v1, p0, Lcom/tencent/bugly/proguard/b0;->g:Lcom/tencent/bugly/proguard/g0;

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    move-wide v6, p5

    invoke-virtual/range {v1 .. v7}, Lcom/tencent/bugly/proguard/g0;->a(Ljava/lang/String;Ljava/lang/String;JJ)V

    return-void

    .line 7
    :goto_0
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 8
    invoke-static {v4, v5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p2

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p3

    filled-new-array {v2, p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    .line 9
    const-string p3, "addSpan fail for [name: %s, start: %s, end: %s]"

    invoke-static {p3, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    const-string p3, "RMonitor_launch_Monitor"

    filled-new-array {p3, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return-void
.end method

.method public a(Z)V
    .locals 1

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->i:Lcom/tencent/bugly/proguard/ra;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ra;->a(Z)V

    return-void
.end method

.method public b(Lcom/tencent/bugly/proguard/h$b;)Lcom/tencent/bugly/proguard/ra$a;
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->i:Lcom/tencent/bugly/proguard/ra;

    iget-object p1, p1, Lcom/tencent/bugly/proguard/h$b;->a:Ljava/lang/String;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ra;->c(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ra$a;

    move-result-object p1

    return-object p1
.end method

.method public b()V
    .locals 3

    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_launch_Monitor"

    const-string v2, "checkAppLaunchStage"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->k:Lcom/tencent/bugly/proguard/k2;

    if-eqz v0, :cond_0

    .line 10
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k2;->a()V

    .line 11
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->j:Lcom/tencent/bugly/proguard/ii;

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b0;->h()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->j:Lcom/tencent/bugly/proguard/ii;

    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ii;->b()V

    .line 13
    :cond_1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b0;->i()Z

    move-result v0

    if-nez v0, :cond_2

    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->e:Lcom/tencent/bugly/proguard/k;

    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k;->e()V

    .line 15
    :cond_2
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b0;->i()Z

    move-result v0

    if-nez v0, :cond_3

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b0;->j()Z

    move-result v0

    if-nez v0, :cond_3

    .line 16
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b0;->c()V

    :cond_3
    return-void
.end method

.method public b(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->i:Lcom/tencent/bugly/proguard/ra;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ra;->b(Ljava/lang/String;)V

    return-void
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->g:Lcom/tencent/bugly/proguard/g0;

    invoke-virtual {v0, p1, p2}, Lcom/tencent/bugly/proguard/g0;->a(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public b(Z)V
    .locals 3

    .line 3
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/b0;->d:Z

    .line 4
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v1, "setUseActivityThreadHacker, useHacker: "

    .line 5
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    move-result-object p1

    const-string v2, "RMonitor_launch_Monitor"

    filled-new-array {v2, v1, p1}, [Ljava/lang/String;

    move-result-object p1

    .line 6
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    return-void
.end method

.method public final c()V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->f:Lcom/tencent/bugly/proguard/h;

    if-nez v0, :cond_0

    return-void

    .line 3
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/h;->a()V

    const/4 v0, 0x0

    .line 4
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b0;->f:Lcom/tencent/bugly/proguard/h;

    return-void
.end method

.method public c(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->h:Lcom/tencent/bugly/proguard/h0;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/h0;->a(Ljava/lang/String;)V

    return-void
.end method

.method public d()Lcom/tencent/bugly/proguard/h;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->f:Lcom/tencent/bugly/proguard/h;

    return-object v0
.end method

.method public d(Ljava/lang/String;)V
    .locals 8

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->k:Lcom/tencent/bugly/proguard/k2;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k2;->c()J

    move-result-wide v4

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v6

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    .line 4
    invoke-virtual/range {v1 .. v7}, Lcom/tencent/bugly/proguard/b0;->a(Ljava/lang/String;Ljava/lang/String;JJ)V

    :cond_0
    return-void
.end method

.method public e()Lcom/tencent/bugly/proguard/a0;
    .locals 2

    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/a0;->b:Lcom/tencent/bugly/proguard/a0;

    .line 3
    iget-object v1, p0, Lcom/tencent/bugly/proguard/b0;->k:Lcom/tencent/bugly/proguard/k2;

    if-eqz v1, :cond_0

    .line 4
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/k2;->b()Lcom/tencent/bugly/proguard/a0;

    move-result-object v0

    :cond_0
    return-object v0
.end method

.method public e(Ljava/lang/String;)V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->g:Lcom/tencent/bugly/proguard/g0;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/g0;->c(Ljava/lang/String;)V

    return-void
.end method

.method public f()J
    .locals 2
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->g:Lcom/tencent/bugly/proguard/g0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/g0;->b()J

    .line 6
    move-result-wide v0

    .line 7
    return-wide v0
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

.method public final h()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->k:Lcom/tencent/bugly/proguard/k2;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k2;->g()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
.end method

.method public final i()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->k:Lcom/tencent/bugly/proguard/k2;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k2;->e()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
.end method

.method public final j()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->j:Lcom/tencent/bugly/proguard/ii;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ii;->d()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    const/4 v0, 0x1

    .line 12
    return v0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0
    .line 15
    .line 16
    .line 17
.end method

.method public k()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/b0;->c:Z

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

.method public l()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/b0;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->k:Lcom/tencent/bugly/proguard/k2;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k2;->i()V

    .line 13
    :cond_1
    :goto_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public m()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/b0;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    goto :goto_0

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->k:Lcom/tencent/bugly/proguard/k2;

    .line 8
    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k2;->l()V

    .line 13
    :cond_1
    :goto_0
    return-void
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public n()V
    .locals 3
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/b0;->c:Z

    .line 3
    .line 4
    const-string v1, "RMonitor_launch_Monitor"

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 9
    .line 10
    const-string v2, "AppLaunchMonitor has not started yet."

    .line 11
    .line 12
    .line 13
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 18
    return-void

    .line 19
    .line 20
    .line 21
    :cond_0
    invoke-static {p0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->unRegister(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b0;->c()V

    .line 25
    const/4 v0, 0x0

    .line 26
    .line 27
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/b0;->c:Z

    .line 28
    .line 29
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 30
    .line 31
    .line 32
    const-string/jumbo v2, "stop"

    .line 33
    .line 34
    .line 35
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 40
    return-void
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

.method public onCreate(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->k:Lcom/tencent/bugly/proguard/k2;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/k2;->h()V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->j:Lcom/tencent/bugly/proguard/ii;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ii;->f()V

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b0;->j()Z

    .line 18
    move-result v0

    .line 19
    .line 20
    if-nez v0, :cond_2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b0;->i()Z

    .line 24
    move-result v0

    .line 25
    .line 26
    if-eqz v0, :cond_3

    .line 27
    .line 28
    .line 29
    :cond_2
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/b0;->a()V

    .line 30
    .line 31
    :cond_3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->f:Lcom/tencent/bugly/proguard/h;

    .line 32
    .line 33
    if-eqz v0, :cond_4

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/h;->c(Landroid/app/Activity;)V

    .line 37
    :cond_4
    return-void
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

.method public onDestroy(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->f:Lcom/tencent/bugly/proguard/h;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/h;->d(Landroid/app/Activity;)V

    .line 8
    .line 9
    :cond_0
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b0;->j:Lcom/tencent/bugly/proguard/ii;

    .line 10
    .line 11
    if-eqz p1, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/ii;->g()V

    .line 15
    :cond_1
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

.method public onResume(Landroid/app/Activity;)V
    .locals 1
    .param p1    # Landroid/app/Activity;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Landroidx/annotation/RestrictTo;
        value = {
            .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b0;->f:Lcom/tencent/bugly/proguard/h;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/h;->e(Landroid/app/Activity;)V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method
