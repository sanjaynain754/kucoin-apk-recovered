.class public final Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;
.super Ljava/lang/Thread;


# instance fields
.field private final l1111l111111Il:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;>;"
        }
    .end annotation
.end field

.field private final l111l11111I1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;

.field private volatile l111l11111Il:Z

.field private final l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;


# direct methods
.method public constructor <init>(Ljava/util/concurrent/BlockingQueue;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/concurrent/BlockingQueue<",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;>;",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l111l11111Il:Z

    .line 7
    .line 8
    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l1111l111111Il:Ljava/util/concurrent/BlockingQueue;

    .line 9
    .line 10
    iput-object p2, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;

    .line 11
    .line 12
    iput-object p3, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l111l11111I1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;

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
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
.end method

.method private static l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)V
    .locals 0
    .annotation build Landroid/annotation/TargetApi;
        value = 0xe
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;)V"
        }
    .end annotation

    .line 2
    invoke-virtual {p0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l1111l1Il()I

    move-result p0

    invoke-static {p0}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    return-void
.end method

.method private l111l11111lIl()V
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l1111l111111Il:Ljava/util/concurrent/BlockingQueue;

    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;

    invoke-direct {p0, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l111l11111lIl(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)V

    return-void
.end method

.method private l111l11111lIl(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)V
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l<",
            "*>;)V"
        }
    .end annotation

    .line 2
    const-string v0, "body is null"

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    const/4 v1, 0x3

    invoke-virtual {p1, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(I)V

    const/4 v1, 0x4

    :try_start_0
    const-string v2, "network-queue-take"

    invoke-virtual {p1, v2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l11l1111I11l()Z

    move-result v2

    if-eqz v2, :cond_0

    const-string v2, "network-discard-cancelled"

    invoke-virtual {p1, v2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l11111lIl(Ljava/lang/String;)V
    :try_end_0
    .catch Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {p1, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(I)V

    return-void

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v2

    goto :goto_0

    :catch_1
    move-exception v0

    goto :goto_2

    :cond_0
    :try_start_1
    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l111l1111l1Il()I

    move-result v2

    invoke-static {v2}, Landroid/net/TrafficStats;->setThreadStatsTag(I)V

    iget-object v2, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;

    invoke-interface {v2, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l11111Il;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;

    move-result-object v2

    const-string v3, "network-http-complete"

    invoke-virtual {p1, v3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l11l11IlIIll()V

    iget-object v3, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l111l11111I1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;

    invoke-interface {v3, p1, v2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111lIIl;)V
    :try_end_1
    .catch Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-virtual {p1, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(I)V

    return-void

    :goto_0
    :try_start_2
    const-string v3, "Unhandled exception %s"

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    invoke-static {v2, v3, v4}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il;->l1111l111111Il(Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V

    instance-of v3, v2, Ljava/lang/IllegalArgumentException;

    if-eqz v3, :cond_1

    invoke-virtual {v2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_1

    new-instance v2, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    const/4 v3, -0x3

    invoke-direct {v2, v0, v3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;-><init>(Ljava/lang/String;I)V

    goto :goto_1

    :cond_1
    new-instance v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;

    const/4 v3, -0x4

    invoke-direct {v0, v2, v3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;-><init>(Ljava/lang/Throwable;I)V

    move-object v2, v0

    :goto_1
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l111l11111I1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;

    invoke-interface {v0, p1, v2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    invoke-virtual {p1, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(I)V

    return-void

    :goto_2
    :try_start_3
    iget-object v2, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l111l11111I1l:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;

    invoke-interface {v2, p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I11l;->l1111l111111Il(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111I1ll;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    invoke-virtual {p1, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(I)V

    return-void

    :goto_3
    invoke-virtual {p1, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;->l1111l111111Il(I)V

    throw v0
.end method


# virtual methods
.method public final l1111l111111Il()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    iput-boolean v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l111l11111Il:Z

    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V

    return-void
.end method

.method public final run()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0xa

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Landroid/os/Process;->setThreadPriority(I)V

    .line 6
    .line 7
    :goto_0
    :try_start_0
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l1111l111111Il:Ljava/util/concurrent/BlockingQueue;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/concurrent/BlockingQueue;->take()Ljava/lang/Object;

    .line 11
    move-result-object v0

    .line 12
    .line 13
    check-cast v0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l111l11111lIl(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111lI1l;)V
    :try_end_0
    .catch Ljava/lang/InterruptedException; {:try_start_0 .. :try_end_0} :catch_0

    .line 17
    goto :goto_0

    .line 18
    .line 19
    :catch_0
    iget-boolean v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l111l1111l1Il;->l111l11111Il:Z

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V

    .line 29
    return-void

    .line 30
    :cond_0
    const/4 v0, 0x0

    .line 31
    .line 32
    new-array v0, v0, [Ljava/lang/Object;

    .line 33
    .line 34
    const-string v1, "Ignoring spurious interrupt of NetworkDispatcher thread; use quit() to terminate it"

    .line 35
    .line 36
    .line 37
    invoke-static {v1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l11l1111Il;->l111l11111I1l(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 38
    goto :goto_0
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
    .line 94
    .line 95
.end method
