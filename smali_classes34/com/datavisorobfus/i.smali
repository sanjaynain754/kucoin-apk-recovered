.class public Lcom/datavisorobfus/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static t:Lcom/datavisorobfus/i;


# instance fields
.field private a:Ljava/lang/String;

.field private b:Ljava/lang/String;

.field public c:Lcom/datavisor/vangogh/face/DVTokenClient$InitResultListener;

.field public d:Lcom/datavisor/vangogh/face/DVTokenClient$InitResultWithExceptionListener;

.field public e:Ljava/util/concurrent/CyclicBarrier;

.field public f:Z

.field public g:[B

.field public h:[B

.field public i:J

.field public j:J

.field public k:Ljava/lang/String;

.field public l:Ljava/lang/String;

.field public m:J

.field public n:Z

.field public o:Z

.field private p:Ljava/util/concurrent/atomic/AtomicBoolean;

.field private q:Ljava/lang/String;

.field private r:Z

.field private s:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/datavisorobfus/i;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/datavisorobfus/i;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/datavisorobfus/i;->t:Lcom/datavisorobfus/i;

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
.end method

.method private constructor <init>()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/datavisorobfus/i;->g:[B

    .line 7
    .line 8
    iput-object v0, p0, Lcom/datavisorobfus/i;->h:[B

    .line 9
    .line 10
    const-wide/16 v1, 0x0

    .line 11
    .line 12
    iput-wide v1, p0, Lcom/datavisorobfus/i;->i:J

    .line 13
    .line 14
    iput-wide v1, p0, Lcom/datavisorobfus/i;->j:J

    .line 15
    .line 16
    const-string v3, ""

    .line 17
    .line 18
    iput-object v3, p0, Lcom/datavisorobfus/i;->k:Ljava/lang/String;

    .line 19
    .line 20
    iput-object v3, p0, Lcom/datavisorobfus/i;->l:Ljava/lang/String;

    .line 21
    .line 22
    iput-wide v1, p0, Lcom/datavisorobfus/i;->m:J

    .line 23
    const/4 v1, 0x0

    .line 24
    .line 25
    iput-boolean v1, p0, Lcom/datavisorobfus/i;->n:Z

    .line 26
    .line 27
    iput-boolean v1, p0, Lcom/datavisorobfus/i;->o:Z

    .line 28
    .line 29
    new-instance v2, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 30
    .line 31
    .line 32
    invoke-direct {v2, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 33
    .line 34
    iput-object v2, p0, Lcom/datavisorobfus/i;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 35
    .line 36
    iput-boolean v1, p0, Lcom/datavisorobfus/i;->s:Z

    .line 37
    .line 38
    iput-object v3, p0, Lcom/datavisorobfus/i;->a:Ljava/lang/String;

    .line 39
    .line 40
    iput-object v3, p0, Lcom/datavisorobfus/i;->b:Ljava/lang/String;

    .line 41
    .line 42
    iput-object v0, p0, Lcom/datavisorobfus/i;->q:Ljava/lang/String;

    .line 43
    .line 44
    iput-boolean v1, p0, Lcom/datavisorobfus/i;->r:Z

    .line 45
    .line 46
    iput-object v0, p0, Lcom/datavisorobfus/i;->c:Lcom/datavisor/vangogh/face/DVTokenClient$InitResultListener;

    .line 47
    .line 48
    iput-object v0, p0, Lcom/datavisorobfus/i;->d:Lcom/datavisor/vangogh/face/DVTokenClient$InitResultWithExceptionListener;

    .line 49
    .line 50
    new-instance v0, Ljava/util/concurrent/CyclicBarrier;

    .line 51
    const/4 v2, 0x2

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v2}, Ljava/util/concurrent/CyclicBarrier;-><init>(I)V

    .line 55
    .line 56
    iput-object v0, p0, Lcom/datavisorobfus/i;->e:Ljava/util/concurrent/CyclicBarrier;

    .line 57
    .line 58
    iput-boolean v1, p0, Lcom/datavisorobfus/i;->f:Z

    .line 59
    .line 60
    .line 61
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 62
    move-result-wide v2

    .line 63
    .line 64
    .line 65
    const-wide/32 v4, 0x186a0

    .line 66
    sub-long/2addr v2, v4

    .line 67
    .line 68
    iput-wide v2, p0, Lcom/datavisorobfus/i;->m:J

    .line 69
    .line 70
    iput-boolean v1, p0, Lcom/datavisorobfus/i;->n:Z

    .line 71
    .line 72
    iput-boolean v1, p0, Lcom/datavisorobfus/i;->o:Z

    .line 73
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method public static synthetic a(Lcom/datavisorobfus/i;)Ljava/lang/String;
    .locals 0

    .line 3
    iget-object p0, p0, Lcom/datavisorobfus/i;->a:Ljava/lang/String;

    return-object p0
.end method

.method public static synthetic a(Lcom/datavisorobfus/i;Ljava/lang/String;)Ljava/lang/String;
    .locals 0

    .line 4
    iput-object p1, p0, Lcom/datavisorobfus/i;->q:Ljava/lang/String;

    return-object p1
.end method

.method private a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 7

    .line 5
    invoke-static {p1}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_3

    invoke-static {p2}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_2

    :cond_0
    :try_start_0
    const-string v0, "&"

    invoke-virtual {p1, v0}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object p1

    array-length v0, p1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_2

    aget-object v4, p1, v3

    const-string v5, "="

    invoke-virtual {v4, v5}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v4

    array-length v5, v4

    const/4 v6, 0x2

    if-ne v5, v6, :cond_1

    aget-object v5, v4, v2

    invoke-virtual {v5}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v5, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 p1, 0x1

    aget-object p1, v4, p1

    invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-object v1

    :goto_1
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_3
    :goto_2
    return-object v1
.end method

.method public static synthetic a(Lcom/datavisorobfus/i;Z)Z
    .locals 0

    .line 9
    iput-boolean p1, p0, Lcom/datavisorobfus/i;->r:Z

    return p1
.end method

.method public static b()Lcom/datavisorobfus/i;
    .locals 1

    .line 1
    sget-object v0, Lcom/datavisorobfus/i;->t:Lcom/datavisorobfus/i;

    return-object v0
.end method

.method private d(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-nez p1, :cond_0

    .line 4
    return-object v0

    .line 5
    .line 6
    :cond_0
    :try_start_0
    iget-object v1, p0, Lcom/datavisorobfus/i;->p:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 7
    const/4 v2, 0x0

    .line 8
    const/4 v3, 0x1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2, v3}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-static {}, Lcom/datavisorobfus/k;->a()Lcom/datavisorobfus/k;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    iget-object v1, v1, Lcom/datavisorobfus/k;->j:Ljava/util/concurrent/ExecutorService;

    .line 21
    .line 22
    new-instance v2, Lcom/datavisorobfus/i$a;

    .line 23
    .line 24
    .line 25
    invoke-direct {v2, p0, p1}, Lcom/datavisorobfus/i$a;-><init>(Lcom/datavisorobfus/i;Landroid/content/Context;)V

    .line 26
    .line 27
    .line 28
    invoke-interface {v1, v2}, Ljava/util/concurrent/Executor;->execute(Ljava/lang/Runnable;)V

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception p1

    .line 31
    goto :goto_1

    .line 32
    .line 33
    :cond_1
    :goto_0
    iget-boolean v1, p0, Lcom/datavisorobfus/i;->r:Z

    .line 34
    .line 35
    if-nez v1, :cond_2

    .line 36
    .line 37
    const-string v1, "DVSPTESTING"

    .line 38
    .line 39
    .line 40
    invoke-static {p1, v1}, Lcom/datavisorobfus/u0;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 41
    move-result-object p1

    .line 42
    return-object p1

    .line 43
    .line 44
    :cond_2
    iget-object p1, p0, Lcom/datavisorobfus/i;->q:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    return-object p1

    .line 46
    .line 47
    .line 48
    :goto_1
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    .line 49
    return-object v0
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


# virtual methods
.method public declared-synchronized a()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/datavisorobfus/i;->a:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Landroid/content/Context;)Ljava/lang/String;
    .locals 2

    .line 2
    iget-boolean v0, p0, Lcom/datavisorobfus/i;->s:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_3

    if-nez p1, :cond_0

    return-object v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/datavisorobfus/i;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    invoke-direct {p0, p1}, Lcom/datavisorobfus/i;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    return-object v1

    :cond_2
    const-string v0, "dvdm"

    invoke-direct {p0, p1, v0}, Lcom/datavisorobfus/i;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p1

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_3
    return-object v1
.end method

.method public a(Landroid/content/Context;ILjava/lang/Throwable;Ljava/lang/String;)V
    .locals 9

    if-nez p2, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    .line 6
    :goto_0
    iput-boolean v0, p0, Lcom/datavisorobfus/i;->n:Z

    iget-object v6, p0, Lcom/datavisorobfus/i;->c:Lcom/datavisor/vangogh/face/DVTokenClient$InitResultListener;

    iget-object v7, p0, Lcom/datavisorobfus/i;->d:Lcom/datavisor/vangogh/face/DVTokenClient$InitResultWithExceptionListener;

    new-instance v0, Ljava/lang/Thread;

    new-instance v1, Lcom/datavisorobfus/i$b;

    move-object v2, p0

    move-object v3, p1

    move v5, p2

    move-object v8, p3

    move-object v4, p4

    invoke-direct/range {v1 .. v8}, Lcom/datavisorobfus/i$b;-><init>(Lcom/datavisorobfus/i;Landroid/content/Context;Ljava/lang/String;ILcom/datavisor/vangogh/face/DVTokenClient$InitResultListener;Lcom/datavisor/vangogh/face/DVTokenClient$InitResultWithExceptionListener;Ljava/lang/Throwable;)V

    invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    return-void
.end method

.method public declared-synchronized a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    if-nez p1, :cond_0

    .line 7
    monitor-exit p0

    return-void

    :cond_0
    :try_start_0
    invoke-static {p2}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    const-string v0, "SPLASTSESSIONID"

    invoke-static {p1, v0, p2}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_0

    :cond_1
    const-string p2, "SPLASTSESSIONID"

    invoke-static {p1, p2}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_2

    const-string p2, "SPLASTSESSIONID"

    invoke-static {p1, p2}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :goto_0
    :try_start_1
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :cond_2
    :goto_1
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public declared-synchronized a(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 8
    :try_start_0
    invoke-static {p1}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/datavisorobfus/i;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    iput-object p1, p0, Lcom/datavisorobfus/i;->a:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_3
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public declared-synchronized b(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 2
    :try_start_0
    const-string v0, "SPLASTSESSIONID"

    invoke-static {p1, v0}, Lcom/datavisorobfus/u0;->e(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    if-nez p1, :cond_0

    const-string p1, ""
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p0

    return-object p1

    :goto_1
    :try_start_1
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    const-string p1, ""
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    monitor-exit p0

    return-object p1

    :catchall_1
    move-exception p1

    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    throw p1
.end method

.method public declared-synchronized b(Ljava/lang/String;)V
    .locals 1

    monitor-enter p0

    .line 3
    :try_start_0
    invoke-static {p1}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    :cond_0
    :try_start_1
    iget-object v0, p0, Lcom/datavisorobfus/i;->b:Ljava/lang/String;

    invoke-static {v0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    if-eqz v0, :cond_1

    monitor-exit p0

    return-void

    :cond_1
    :try_start_2
    iput-object p1, p0, Lcom/datavisorobfus/i;->b:Ljava/lang/String;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    :try_start_3
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :goto_0
    monitor-exit p0

    return-void

    :catchall_1
    move-exception p1

    :try_start_4
    monitor-exit p0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    throw p1
.end method

.method public declared-synchronized c()Ljava/lang/String;
    .locals 1

    monitor-enter p0

    .line 1
    :try_start_0
    iget-object v0, p0, Lcom/datavisorobfus/i;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-object v0

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public c(Landroid/content/Context;)Z
    .locals 2

    .line 2
    iget-boolean v0, p0, Lcom/datavisorobfus/i;->s:Z

    const/4 v1, 0x1

    if-eqz v0, :cond_5

    if-nez p1, :cond_0

    return v1

    :cond_0
    :try_start_0
    iget-object v0, p0, Lcom/datavisorobfus/i;->a:Ljava/lang/String;

    invoke-static {v0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_1

    return v1

    :cond_1
    invoke-direct {p0, p1}, Lcom/datavisorobfus/i;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    return v1

    :cond_2
    const-string v0, "dvsw"

    invoke-direct {p0, p1, v0}, Lcom/datavisorobfus/i;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_3

    return v1

    :cond_3
    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p1, :cond_4

    return v1

    :cond_4
    const/4 p1, 0x0

    return p1

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_5
    return v1
.end method
