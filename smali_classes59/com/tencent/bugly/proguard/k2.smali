.class public Lcom/tencent/bugly/proguard/k2;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final k:Ljava/lang/String; = "RMonitor_launch_cold"

.field public static final l:Ljava/lang/String; = "300200"

.field public static final m:Ljava/lang/String; = "300201"

.field public static final n:J = 0x2bf20L

.field public static final o:J = 0x4e20L

.field public static final p:J = 0x7d0L

.field public static final q:I = 0x1

.field public static final r:I = 0x2

.field public static final s:I = 0x3

.field public static final t:I = 0x4

.field public static final u:I = 0x5


# instance fields
.field public a:J

.field public b:J

.field public c:J

.field public d:J

.field public e:J

.field public f:J

.field public g:Z

.field public h:J

.field public i:Lcom/tencent/bugly/proguard/a0;

.field public final j:Lcom/tencent/bugly/proguard/b0;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/b0;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0x0

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->a:J

    .line 8
    .line 9
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->b:J

    .line 10
    .line 11
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->c:J

    .line 12
    .line 13
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->d:J

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->e:J

    .line 16
    .line 17
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->f:J

    .line 18
    const/4 v2, 0x0

    .line 19
    .line 20
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/k2;->g:Z

    .line 21
    .line 22
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->h:J

    .line 23
    .line 24
    sget-object v0, Lcom/tencent/bugly/proguard/a0;->b:Lcom/tencent/bugly/proguard/a0;

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/bugly/proguard/k2;->i:Lcom/tencent/bugly/proguard/a0;

    .line 27
    .line 28
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    .line 29
    return-void
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


# virtual methods
.method public final a(J)J
    .locals 5

    .line 31
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->h:J

    .line 32
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/k2;->a:J

    cmp-long v4, p1, v2

    if-eqz v4, :cond_0

    add-long/2addr v0, p1

    sub-long/2addr v0, v2

    :cond_0
    return-wide v0
.end method

.method public a()V
    .locals 1

    .line 22
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->g()Z

    move-result v0

    if-nez v0, :cond_0

    .line 23
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->m()V

    :cond_0
    return-void
.end method

.method public final a(I)V
    .locals 7

    const/4 v0, 0x1

    const-wide v1, 0x7fffffffffffffffL

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-eq p1, v0, :cond_0

    .line 24
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/k2;->f:J

    goto :goto_0

    .line 25
    :cond_0
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/k2;->d:J

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->c()J

    move-result-wide v5

    sub-long/2addr v3, v5

    iput-wide v3, p0, Lcom/tencent/bugly/proguard/k2;->f:J

    goto :goto_0

    .line 26
    :cond_1
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/k2;->e:J

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->c()J

    move-result-wide v5

    sub-long/2addr v3, v5

    iput-wide v3, p0, Lcom/tencent/bugly/proguard/k2;->f:J

    goto :goto_0

    .line 27
    :cond_2
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v3

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->c()J

    move-result-wide v5

    sub-long/2addr v3, v5

    iput-wide v3, p0, Lcom/tencent/bugly/proguard/k2;->f:J

    goto :goto_0

    .line 28
    :cond_3
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/k2;->b:J

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->c()J

    move-result-wide v5

    sub-long/2addr v3, v5

    iput-wide v3, p0, Lcom/tencent/bugly/proguard/k2;->f:J

    .line 29
    :goto_0
    iget-wide v3, p0, Lcom/tencent/bugly/proguard/k2;->f:J

    const-wide/16 v5, 0x0

    cmp-long p1, v3, v5

    if-gtz p1, :cond_4

    .line 30
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/k2;->f:J

    :cond_4
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/a0;)V
    .locals 4

    .line 14
    sget-object v0, Lcom/tencent/bugly/proguard/a0;->b:Lcom/tencent/bugly/proguard/a0;

    if-ne p1, v0, :cond_0

    goto :goto_1

    .line 15
    :cond_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/k2;->i:Lcom/tencent/bugly/proguard/a0;

    sget-object v2, Lcom/tencent/bugly/proguard/a0;->c:Lcom/tencent/bugly/proguard/a0;

    if-ne v1, v2, :cond_1

    goto :goto_1

    :cond_1
    if-ne v1, v0, :cond_2

    goto :goto_0

    :cond_2
    if-ne p1, v2, :cond_3

    .line 16
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/tencent/bugly/proguard/k2;->b:J

    sub-long/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->abs(J)J

    move-result-wide v0

    const-wide/16 v2, 0x7d0

    cmp-long v0, v0, v2

    if-gez v0, :cond_3

    .line 17
    :goto_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->j()V

    .line 18
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "RMonitor_launch_cold"

    const-string/jumbo v3, "updateLaunchMode, appLaunchMode: "

    filled-new-array {v2, v3, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 19
    iput-object p1, p0, Lcom/tencent/bugly/proguard/k2;->i:Lcom/tencent/bugly/proguard/a0;

    .line 20
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->f()Z

    move-result p1

    if-nez p1, :cond_3

    const/4 p1, 0x1

    .line 21
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/k2;->a(I)V

    :cond_3
    :goto_1
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/h$b;)V
    .locals 4

    .line 1
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->d:J

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    .line 2
    const-string v0, "first_screen_complete"

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/k2;->a(Ljava/lang/String;)V

    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->d:J

    .line 4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    const-string v1, "firstScreenRender"

    .line 5
    iget-object v0, v0, Lcom/tencent/bugly/proguard/b0;->g:Lcom/tencent/bugly/proguard/g0;

    .line 6
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/g0;->c(Ljava/lang/String;)V

    .line 7
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->e()Z

    move-result v0

    if-eqz v0, :cond_2

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/b0;->b(Lcom/tencent/bugly/proguard/h$b;)Lcom/tencent/bugly/proguard/ra$a;

    move-result-object p1

    .line 9
    sget-object v0, Lcom/tencent/bugly/proguard/ra$a;->c:Lcom/tencent/bugly/proguard/ra$a;

    if-ne p1, v0, :cond_1

    .line 10
    const-string p1, "landing_page_complete"

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/k2;->a(Ljava/lang/String;)V

    const/4 p1, 0x2

    .line 11
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/k2;->a(I)V

    return-void

    .line 12
    :cond_1
    sget-object v0, Lcom/tencent/bugly/proguard/ra$a;->b:Lcom/tencent/bugly/proguard/ra$a;

    if-ne p1, v0, :cond_2

    const/4 p1, 0x3

    .line 13
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/k2;->a(I)V

    :cond_2
    return-void
.end method

.method public final a(Ljava/lang/String;)V
    .locals 11

    .line 33
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->d()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v2, v0, v2

    if-lez v2, :cond_0

    .line 34
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v2

    sub-long/2addr v2, v0

    .line 35
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v9

    sub-long v7, v9, v2

    .line 36
    iget-object v4, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    const/4 v6, 0x0

    move-object v5, p1

    invoke-virtual/range {v4 .. v10}, Lcom/tencent/bugly/proguard/b0;->a(Ljava/lang/String;Ljava/lang/String;JJ)V

    :cond_0
    return-void
.end method

.method public b()Lcom/tencent/bugly/proguard/a0;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k2;->i:Lcom/tencent/bugly/proguard/a0;

    return-object v0
.end method

.method public final b(J)V
    .locals 4

    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v1, "postCheckPreLaunchTask, delay: "

    invoke-static {p1, p2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object v2

    const-string v3, "RMonitor_launch_cold"

    filled-new-array {v3, v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 3
    new-instance v0, Lcom/tencent/bugly/proguard/k2$a;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/k2$a;-><init>(Lcom/tencent/bugly/proguard/k2;)V

    .line 4
    invoke-static {v0, p1, p2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMainThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public c()J
    .locals 8

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->a:J

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->d()J

    .line 6
    move-result-wide v2

    .line 7
    .line 8
    const-wide/16 v4, 0x0

    .line 9
    .line 10
    cmp-long v4, v2, v4

    .line 11
    .line 12
    if-lez v4, :cond_0

    .line 13
    move-wide v0, v2

    .line 14
    .line 15
    :cond_0
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 19
    move-result-object v3

    .line 20
    .line 21
    iget-wide v4, p0, Lcom/tencent/bugly/proguard/k2;->a:J

    .line 22
    .line 23
    .line 24
    invoke-static {v4, v5}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 25
    move-result-object v4

    .line 26
    .line 27
    const-string v5, "RMonitor_launch_cold"

    .line 28
    .line 29
    const-string v6, "getColdLaunchStartTime, launchStartTime:"

    .line 30
    .line 31
    const-string v7, ", applicationOnCreateTime:"

    .line 32
    .line 33
    .line 34
    filled-new-array {v5, v6, v3, v7, v4}, [Ljava/lang/String;

    .line 35
    move-result-object v3

    .line 36
    .line 37
    .line 38
    invoke-virtual {v2, v3}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 39
    return-wide v0
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

.method public final d()J
    .locals 6

    .line 1
    .line 2
    const-wide/16 v0, -0x1

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-static {}, Landroid/os/Process;->getStartUptimeMillis()J

    .line 6
    move-result-wide v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 7
    goto :goto_0

    .line 8
    :catchall_0
    move-exception v2

    .line 9
    .line 10
    const-string v3, "RMonitor_launch_cold"

    .line 11
    .line 12
    const-string v4, "getProcessStartTime failed"

    .line 13
    .line 14
    .line 15
    invoke-static {v3, v4, v2}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 16
    move-wide v2, v0

    .line 17
    .line 18
    :goto_0
    iget-wide v4, p0, Lcom/tencent/bugly/proguard/k2;->a:J

    .line 19
    .line 20
    cmp-long v4, v2, v4

    .line 21
    .line 22
    if-lez v4, :cond_0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    move-wide v0, v2

    .line 25
    :goto_1
    return-wide v0
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

.method public e()Z
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->f:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    const/4 v0, 0x1

    .line 10
    return v0

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final f()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k2;->i:Lcom/tencent/bugly/proguard/a0;

    .line 3
    .line 4
    sget-object v1, Lcom/tencent/bugly/proguard/a0;->c:Lcom/tencent/bugly/proguard/a0;

    .line 5
    .line 6
    if-ne v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    return v0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    return v0
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public g()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/k2;->g:Z

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

.method public h()V
    .locals 4

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/bugly/proguard/a0;->c:Lcom/tencent/bugly/proguard/a0;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/k2;->a(Lcom/tencent/bugly/proguard/a0;)V

    .line 6
    .line 7
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->c:J

    .line 8
    .line 9
    const-wide/16 v2, 0x0

    .line 10
    .line 11
    cmp-long v0, v0, v2

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 17
    move-result-wide v0

    .line 18
    .line 19
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->c:J

    .line 20
    .line 21
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    .line 22
    const/4 v1, 0x0

    .line 23
    .line 24
    iget-object v0, v0, Lcom/tencent/bugly/proguard/b0;->g:Lcom/tencent/bugly/proguard/g0;

    .line 25
    .line 26
    const-string v2, "firstScreenRender"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/g0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    :cond_0
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

.method public i()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 3
    .line 4
    const-string v1, "RMonitor_launch_cold"

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "onApplicationCreateEnd"

    .line 8
    .line 9
    .line 10
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->j()V

    .line 18
    .line 19
    const-wide/16 v0, 0x7d0

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/k2;->b(J)V

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

.method public final j()V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->b:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    return-void

    .line 10
    .line 11
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 12
    .line 13
    const-string v1, "RMonitor_launch_cold"

    .line 14
    .line 15
    .line 16
    const-string/jumbo v2, "onApplicationCreateEndInner"

    .line 17
    .line 18
    .line 19
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 24
    .line 25
    const-string v0, "application_create_end"

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/k2;->a(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 32
    move-result-wide v0

    .line 33
    .line 34
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->b:J

    .line 35
    .line 36
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    .line 37
    .line 38
    const-string v1, "applicationCreate"

    .line 39
    .line 40
    iget-object v0, v0, Lcom/tencent/bugly/proguard/b0;->g:Lcom/tencent/bugly/proguard/g0;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/g0;->c(Ljava/lang/String;)V

    .line 44
    return-void
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

.method public k()V
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 3
    .line 4
    const-string v1, "RMonitor_launch_cold"

    .line 5
    .line 6
    .line 7
    const-string/jumbo v2, "onApplicationCreateStart"

    .line 8
    .line 9
    .line 10
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v0

    .line 19
    .line 20
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->h:J

    .line 21
    .line 22
    .line 23
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 24
    move-result-wide v0

    .line 25
    .line 26
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->a:J

    .line 27
    .line 28
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    .line 29
    const/4 v1, 0x0

    .line 30
    .line 31
    iget-object v0, v0, Lcom/tencent/bugly/proguard/b0;->g:Lcom/tencent/bugly/proguard/g0;

    .line 32
    .line 33
    const-string v2, "applicationCreate"

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v2, v1}, Lcom/tencent/bugly/proguard/g0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 37
    .line 38
    const-string v0, "application_create_start"

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/k2;->a(Ljava/lang/String;)V

    .line 42
    .line 43
    const-wide/16 v0, 0x4e20

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/k2;->b(J)V

    .line 47
    .line 48
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    .line 49
    .line 50
    sget-object v1, Lcom/tencent/bugly/proguard/b0$b;->b:Lcom/tencent/bugly/proguard/b0$b;

    .line 51
    .line 52
    .line 53
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/b0;->a(Lcom/tencent/bugly/proguard/b0$b;)V

    .line 54
    return-void
    .line 55
    .line 56
    .line 57
.end method

.method public l()V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->e:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v0, v0, v2

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    const-string v0, "app_full_launch"

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/k2;->a(Ljava/lang/String;)V

    .line 14
    .line 15
    .line 16
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 17
    move-result-wide v0

    .line 18
    .line 19
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->e:J

    .line 20
    const/4 v0, 0x4

    .line 21
    .line 22
    .line 23
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/k2;->a(I)V

    .line 24
    .line 25
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    .line 26
    .line 27
    sget-object v1, Lcom/tencent/bugly/proguard/b0$b;->d:Lcom/tencent/bugly/proguard/b0$b;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/b0;->a(Lcom/tencent/bugly/proguard/b0$b;)V

    .line 31
    .line 32
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 33
    .line 34
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/k2;->e:J

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    const-string v2, "RMonitor_launch_cold"

    .line 41
    .line 42
    .line 43
    const-string/jumbo v3, "reportAppFullLaunch, uptime: "

    .line 44
    .line 45
    .line 46
    filled-new-array {v2, v3, v1}, [Ljava/lang/String;

    .line 47
    move-result-object v1

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 51
    return-void
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public final m()V
    .locals 14

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->f()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->e()Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    const/4 v0, 0x5

    .line 14
    .line 15
    .line 16
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/k2;->a(I)V

    .line 17
    .line 18
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    .line 19
    .line 20
    .line 21
    const-string/jumbo v1, "tag_normal_launch"

    .line 22
    .line 23
    iget-object v0, v0, Lcom/tencent/bugly/proguard/b0;->h:Lcom/tencent/bugly/proguard/h0;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/h0;->a(Ljava/lang/String;)V

    .line 27
    goto :goto_0

    .line 28
    .line 29
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    .line 30
    .line 31
    .line 32
    const-string/jumbo v1, "tag_pre_launch"

    .line 33
    .line 34
    iget-object v0, v0, Lcom/tencent/bugly/proguard/b0;->h:Lcom/tencent/bugly/proguard/h0;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/h0;->a(Ljava/lang/String;)V

    .line 38
    .line 39
    iget-object v0, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    .line 40
    .line 41
    iget-object v1, p0, Lcom/tencent/bugly/proguard/k2;->i:Lcom/tencent/bugly/proguard/a0;

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 45
    move-result-object v1

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 49
    move-result-object v1

    .line 50
    .line 51
    iget-object v0, v0, Lcom/tencent/bugly/proguard/b0;->h:Lcom/tencent/bugly/proguard/h0;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/h0;->a(Ljava/lang/String;)V

    .line 55
    .line 56
    :goto_0
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/k2;->f:J

    .line 57
    .line 58
    .line 59
    const-wide/32 v2, 0x2bf20

    .line 60
    .line 61
    cmp-long v2, v0, v2

    .line 62
    .line 63
    const-wide/16 v3, 0x0

    .line 64
    .line 65
    if-gez v2, :cond_2

    .line 66
    .line 67
    cmp-long v5, v0, v3

    .line 68
    .line 69
    if-lez v5, :cond_2

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/k2;->c()J

    .line 73
    move-result-wide v8

    .line 74
    .line 75
    iget-object v6, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    .line 76
    .line 77
    iget-wide v10, p0, Lcom/tencent/bugly/proguard/k2;->f:J

    .line 78
    .line 79
    .line 80
    invoke-virtual {p0, v8, v9}, Lcom/tencent/bugly/proguard/k2;->a(J)J

    .line 81
    move-result-wide v12

    .line 82
    .line 83
    const-string v7, "cold_launch"

    .line 84
    .line 85
    .line 86
    invoke-virtual/range {v6 .. v13}, Lcom/tencent/bugly/proguard/b0;->a(Ljava/lang/String;JJJ)V

    .line 87
    goto :goto_2

    .line 88
    .line 89
    :cond_2
    if-ltz v2, :cond_3

    .line 90
    .line 91
    const-string v2, "300201"

    .line 92
    goto :goto_1

    .line 93
    .line 94
    :cond_3
    cmp-long v2, v0, v3

    .line 95
    .line 96
    if-gez v2, :cond_4

    .line 97
    .line 98
    const-string v2, "300200"

    .line 99
    goto :goto_1

    .line 100
    :cond_4
    const/4 v2, 0x0

    .line 101
    .line 102
    :goto_1
    if-eqz v2, :cond_5

    .line 103
    .line 104
    iget-object v3, p0, Lcom/tencent/bugly/proguard/k2;->j:Lcom/tencent/bugly/proguard/b0;

    .line 105
    .line 106
    .line 107
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 108
    move-result-object v0

    .line 109
    .line 110
    .line 111
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 112
    .line 113
    .line 114
    invoke-static {}, Lcom/tencent/bugly/proguard/d0;->b()Lcom/tencent/bugly/proguard/d0;

    .line 115
    move-result-object v1

    .line 116
    .line 117
    .line 118
    invoke-virtual {v1, v2, v0}, Lcom/tencent/bugly/proguard/d0;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 119
    .line 120
    :cond_5
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 121
    .line 122
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/k2;->f:J

    .line 123
    .line 124
    .line 125
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 126
    move-result-object v7

    .line 127
    .line 128
    const-string v8, "]"

    .line 129
    .line 130
    const-string v3, "RMonitor_launch_cold"

    .line 131
    .line 132
    .line 133
    const-string/jumbo v4, "reportColdCost has invalid data of launchType["

    .line 134
    .line 135
    const-string v5, "cold_launch"

    .line 136
    .line 137
    const-string v6, "], coldCostInMs["

    .line 138
    .line 139
    .line 140
    filled-new-array/range {v3 .. v8}, [Ljava/lang/String;

    .line 141
    move-result-object v1

    .line 142
    .line 143
    .line 144
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 145
    :goto_2
    const/4 v0, 0x1

    .line 146
    .line 147
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/k2;->g:Z

    .line 148
    return-void
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method
