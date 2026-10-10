.class public Lcom/facebook/imagepipeline/producers/JobScheduler;
.super Ljava/lang/Object;
.source "JobScheduler.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;,
        Lcom/facebook/imagepipeline/producers/JobScheduler$d;,
        Lcom/facebook/imagepipeline/producers/JobScheduler$e;
    }
.end annotation


# instance fields
.field public final a:Ljava/util/concurrent/Executor;

.field public final b:Lcom/facebook/imagepipeline/producers/JobScheduler$d;

.field public final c:Ljava/lang/Runnable;

.field public final d:Ljava/lang/Runnable;

.field public final e:I

.field public f:Lx5/i;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public g:I
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public h:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public i:J
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field

.field public j:J
    .annotation build Landroidx/annotation/VisibleForTesting;
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/util/concurrent/Executor;Lcom/facebook/imagepipeline/producers/JobScheduler$d;I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->a:Ljava/util/concurrent/Executor;

    .line 6
    .line 7
    iput-object p2, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->b:Lcom/facebook/imagepipeline/producers/JobScheduler$d;

    .line 8
    .line 9
    iput p3, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->e:I

    .line 10
    .line 11
    new-instance p1, Lcom/facebook/imagepipeline/producers/JobScheduler$a;

    .line 12
    .line 13
    .line 14
    invoke-direct {p1, p0}, Lcom/facebook/imagepipeline/producers/JobScheduler$a;-><init>(Lcom/facebook/imagepipeline/producers/JobScheduler;)V

    .line 15
    .line 16
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->c:Ljava/lang/Runnable;

    .line 17
    .line 18
    new-instance p1, Lcom/facebook/imagepipeline/producers/JobScheduler$b;

    .line 19
    .line 20
    .line 21
    invoke-direct {p1, p0}, Lcom/facebook/imagepipeline/producers/JobScheduler$b;-><init>(Lcom/facebook/imagepipeline/producers/JobScheduler;)V

    .line 22
    .line 23
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->d:Ljava/lang/Runnable;

    .line 24
    const/4 p1, 0x0

    .line 25
    .line 26
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->f:Lx5/i;

    .line 27
    const/4 p1, 0x0

    .line 28
    .line 29
    iput p1, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->g:I

    .line 30
    .line 31
    sget-object p1, Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;->IDLE:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 32
    .line 33
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->h:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 34
    .line 35
    const-wide/16 p1, 0x0

    .line 36
    .line 37
    iput-wide p1, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->i:J

    .line 38
    .line 39
    iput-wide p1, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->j:J

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
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
.end method

.method public static bridge synthetic a(Lcom/facebook/imagepipeline/producers/JobScheduler;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/JobScheduler;->d()V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static bridge synthetic b(Lcom/facebook/imagepipeline/producers/JobScheduler;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/JobScheduler;->j()V

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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static i(Lx5/i;I)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/facebook/imagepipeline/producers/c;->d(I)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_1

    .line 7
    const/4 v0, 0x4

    .line 8
    .line 9
    .line 10
    invoke-static {p1, v0}, Lcom/facebook/imagepipeline/producers/c;->m(II)Z

    .line 11
    move-result p1

    .line 12
    .line 13
    if-nez p1, :cond_1

    .line 14
    .line 15
    .line 16
    invoke-static {p0}, Lx5/i;->E(Lx5/i;)Z

    .line 17
    move-result p0

    .line 18
    .line 19
    if-eqz p0, :cond_0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 p0, 0x0

    .line 22
    return p0

    .line 23
    :cond_1
    :goto_0
    const/4 p0, 0x1

    .line 24
    return p0
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
.end method


# virtual methods
.method public c()V
    .locals 2

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->f:Lx5/i;

    .line 4
    const/4 v1, 0x0

    .line 5
    .line 6
    iput-object v1, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->f:Lx5/i;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    iput v1, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->g:I

    .line 10
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 11
    .line 12
    .line 13
    invoke-static {v0}, Lx5/i;->g(Lx5/i;)V

    .line 14
    return-void

    .line 15
    :catchall_0
    move-exception v0

    .line 16
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 17
    throw v0
    .line 18
.end method

.method public final d()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    monitor-enter p0

    .line 6
    .line 7
    :try_start_0
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->f:Lx5/i;

    .line 8
    .line 9
    iget v3, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->g:I

    .line 10
    const/4 v4, 0x0

    .line 11
    .line 12
    iput-object v4, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->f:Lx5/i;

    .line 13
    const/4 v4, 0x0

    .line 14
    .line 15
    iput v4, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->g:I

    .line 16
    .line 17
    sget-object v4, Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;->RUNNING:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 18
    .line 19
    iput-object v4, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->h:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 20
    .line 21
    iput-wide v0, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->j:J

    .line 22
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 23
    .line 24
    .line 25
    :try_start_1
    invoke-static {v2, v3}, Lcom/facebook/imagepipeline/producers/JobScheduler;->i(Lx5/i;I)Z

    .line 26
    move-result v0

    .line 27
    .line 28
    if-eqz v0, :cond_0

    .line 29
    .line 30
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->b:Lcom/facebook/imagepipeline/producers/JobScheduler$d;

    .line 31
    .line 32
    .line 33
    invoke-interface {v0, v2, v3}, Lcom/facebook/imagepipeline/producers/JobScheduler$d;->a(Lx5/i;I)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 34
    goto :goto_0

    .line 35
    :catchall_0
    move-exception v0

    .line 36
    goto :goto_1

    .line 37
    .line 38
    .line 39
    :cond_0
    :goto_0
    invoke-static {v2}, Lx5/i;->g(Lx5/i;)V

    .line 40
    .line 41
    .line 42
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/JobScheduler;->g()V

    .line 43
    return-void

    .line 44
    .line 45
    .line 46
    :goto_1
    invoke-static {v2}, Lx5/i;->g(Lx5/i;)V

    .line 47
    .line 48
    .line 49
    invoke-virtual {p0}, Lcom/facebook/imagepipeline/producers/JobScheduler;->g()V

    .line 50
    throw v0

    .line 51
    :catchall_1
    move-exception v0

    .line 52
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 53
    throw v0
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
.end method

.method public final e(J)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->d:Ljava/lang/Runnable;

    .line 3
    .line 4
    const-string v1, "JobScheduler_enqueueJob"

    .line 5
    .line 6
    .line 7
    invoke-static {v0, v1}, Ly5/a;->a(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    cmp-long v1, p1, v1

    .line 13
    .line 14
    if-lez v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/facebook/imagepipeline/producers/JobScheduler$e;->a()Ljava/util/concurrent/ScheduledExecutorService;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    sget-object v2, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 21
    .line 22
    .line 23
    invoke-interface {v1, v0, p1, p2, v2}, Ljava/util/concurrent/ScheduledExecutorService;->schedule(Ljava/lang/Runnable;JLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 24
    return-void

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-interface {v0}, Ljava/lang/Runnable;->run()V

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
.end method

.method public declared-synchronized f()J
    .locals 4

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    :try_start_0
    iget-wide v0, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->j:J

    .line 4
    .line 5
    iget-wide v2, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->i:J
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    sub-long/2addr v0, v2

    .line 7
    monitor-exit p0

    .line 8
    return-wide v0

    .line 9
    :catchall_0
    move-exception v0

    .line 10
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 11
    throw v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public final g()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    monitor-enter p0

    .line 6
    .line 7
    :try_start_0
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->h:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 8
    .line 9
    sget-object v3, Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;->RUNNING_AND_PENDING:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 10
    .line 11
    if-ne v2, v3, :cond_0

    .line 12
    .line 13
    iget-wide v2, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->j:J

    .line 14
    .line 15
    iget v4, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->e:I

    .line 16
    int-to-long v4, v4

    .line 17
    add-long/2addr v2, v4

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 21
    move-result-wide v2

    .line 22
    .line 23
    iput-wide v0, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->i:J

    .line 24
    .line 25
    sget-object v4, Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;->QUEUED:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 26
    .line 27
    iput-object v4, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->h:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 28
    const/4 v4, 0x1

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v0

    .line 31
    goto :goto_1

    .line 32
    .line 33
    :cond_0
    sget-object v2, Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;->IDLE:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 34
    .line 35
    iput-object v2, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->h:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 36
    .line 37
    const-wide/16 v2, 0x0

    .line 38
    const/4 v4, 0x0

    .line 39
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 40
    .line 41
    if-eqz v4, :cond_1

    .line 42
    sub-long/2addr v2, v0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v2, v3}, Lcom/facebook/imagepipeline/producers/JobScheduler;->e(J)V

    .line 46
    :cond_1
    return-void

    .line 47
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 48
    throw v0
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
.end method

.method public h()Z
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    monitor-enter p0

    .line 6
    .line 7
    :try_start_0
    iget-object v2, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->f:Lx5/i;

    .line 8
    .line 9
    iget v3, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->g:I

    .line 10
    .line 11
    .line 12
    invoke-static {v2, v3}, Lcom/facebook/imagepipeline/producers/JobScheduler;->i(Lx5/i;I)Z

    .line 13
    move-result v2

    .line 14
    const/4 v3, 0x0

    .line 15
    .line 16
    if-nez v2, :cond_0

    .line 17
    monitor-exit p0

    .line 18
    return v3

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_2

    .line 21
    .line 22
    :cond_0
    sget-object v2, Lcom/facebook/imagepipeline/producers/JobScheduler$c;->a:[I

    .line 23
    .line 24
    iget-object v4, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->h:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v4}, Ljava/lang/Enum;->ordinal()I

    .line 28
    move-result v4

    .line 29
    .line 30
    aget v2, v2, v4

    .line 31
    const/4 v4, 0x1

    .line 32
    .line 33
    if-eq v2, v4, :cond_2

    .line 34
    const/4 v5, 0x3

    .line 35
    .line 36
    if-eq v2, v5, :cond_1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    :cond_1
    sget-object v2, Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;->RUNNING_AND_PENDING:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 40
    .line 41
    iput-object v2, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->h:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 42
    .line 43
    :goto_0
    const-wide/16 v5, 0x0

    .line 44
    goto :goto_1

    .line 45
    .line 46
    :cond_2
    iget-wide v2, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->j:J

    .line 47
    .line 48
    iget v5, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->e:I

    .line 49
    int-to-long v5, v5

    .line 50
    add-long/2addr v2, v5

    .line 51
    .line 52
    .line 53
    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    .line 54
    move-result-wide v5

    .line 55
    .line 56
    iput-wide v0, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->i:J

    .line 57
    .line 58
    sget-object v2, Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;->QUEUED:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 59
    .line 60
    iput-object v2, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->h:Lcom/facebook/imagepipeline/producers/JobScheduler$JobState;

    .line 61
    move v3, v4

    .line 62
    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 63
    .line 64
    if-eqz v3, :cond_3

    .line 65
    sub-long/2addr v5, v0

    .line 66
    .line 67
    .line 68
    invoke-virtual {p0, v5, v6}, Lcom/facebook/imagepipeline/producers/JobScheduler;->e(J)V

    .line 69
    :cond_3
    return v4

    .line 70
    :goto_2
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 71
    throw v0
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public final j()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->a:Ljava/util/concurrent/Executor;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->c:Ljava/lang/Runnable;

    .line 5
    .line 6
    const-string v2, "JobScheduler_submitJob"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Ly5/a;->a(Ljava/lang/Runnable;Ljava/lang/String;)Ljava/lang/Runnable;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v1}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public k(Lx5/i;I)Z
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1, p2}, Lcom/facebook/imagepipeline/producers/JobScheduler;->i(Lx5/i;I)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 p1, 0x0

    .line 8
    return p1

    .line 9
    :cond_0
    monitor-enter p0

    .line 10
    .line 11
    :try_start_0
    iget-object v0, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->f:Lx5/i;

    .line 12
    .line 13
    .line 14
    invoke-static {p1}, Lx5/i;->b(Lx5/i;)Lx5/i;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    iput-object p1, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->f:Lx5/i;

    .line 18
    .line 19
    iput p2, p0, Lcom/facebook/imagepipeline/producers/JobScheduler;->g:I

    .line 20
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 21
    .line 22
    .line 23
    invoke-static {v0}, Lx5/i;->g(Lx5/i;)V

    .line 24
    const/4 p1, 0x1

    .line 25
    return p1

    .line 26
    :catchall_0
    move-exception p1

    .line 27
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 28
    throw p1
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
.end method
