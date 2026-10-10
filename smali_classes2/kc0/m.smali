.class public Lkc0/m;
.super Lkc0/h;
.source "TimerSendBatchTask.java"


# instance fields
.field public final b:Ljc0/b;

.field public final c:Lkc0/d;

.field public final d:Lkc0/j;

.field public final e:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lkc0/i;",
            ">;"
        }
    .end annotation
.end field

.field public final f:Ljava/util/concurrent/BlockingQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/BlockingQueue<",
            "Lkc0/i;",
            ">;"
        }
    .end annotation
.end field

.field public final g:Lkc0/l;

.field public final h:Ljava/util/concurrent/atomic/AtomicInteger;

.field public volatile i:Z


# direct methods
.method public constructor <init>(Ljava/lang/String;ZLjc0/b;Lkc0/d;Lkc0/j;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Lkc0/l;Ljava/util/concurrent/atomic/AtomicInteger;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Ljc0/b;",
            "Lkc0/d;",
            "Lkc0/j;",
            "Ljava/util/concurrent/BlockingQueue<",
            "Lkc0/i;",
            ">;",
            "Ljava/util/concurrent/BlockingQueue<",
            "Lkc0/i;",
            ">;",
            "Lkc0/l;",
            "Ljava/util/concurrent/atomic/AtomicInteger;",
            ")V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p2}, Lkc0/h;-><init>(Ljava/lang/String;Z)V

    .line 4
    .line 5
    iput-object p3, p0, Lkc0/m;->b:Ljc0/b;

    .line 6
    .line 7
    iput-object p4, p0, Lkc0/m;->c:Lkc0/d;

    .line 8
    .line 9
    iput-object p5, p0, Lkc0/m;->d:Lkc0/j;

    .line 10
    .line 11
    iput-object p6, p0, Lkc0/m;->e:Ljava/util/concurrent/BlockingQueue;

    .line 12
    .line 13
    iput-object p7, p0, Lkc0/m;->f:Ljava/util/concurrent/BlockingQueue;

    .line 14
    .line 15
    iput-object p8, p0, Lkc0/m;->g:Lkc0/l;

    .line 16
    .line 17
    iput-object p9, p0, Lkc0/m;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 18
    const/4 p1, 0x0

    .line 19
    .line 20
    iput-boolean p1, p0, Lkc0/m;->i:Z

    .line 21
    return-void
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
.end method


# virtual methods
.method public final b(Lkc0/i;)Lkc0/k;
    .locals 7

    .line 1
    .line 2
    new-instance v0, Lkc0/k;

    .line 3
    .line 4
    iget-object v2, p0, Lkc0/m;->b:Ljc0/b;

    .line 5
    .line 6
    iget-object v3, p0, Lkc0/m;->d:Lkc0/j;

    .line 7
    .line 8
    iget-object v4, p0, Lkc0/m;->e:Ljava/util/concurrent/BlockingQueue;

    .line 9
    .line 10
    iget-object v5, p0, Lkc0/m;->f:Ljava/util/concurrent/BlockingQueue;

    .line 11
    .line 12
    iget-object v6, p0, Lkc0/m;->h:Ljava/util/concurrent/atomic/AtomicInteger;

    .line 13
    move-object v1, p1

    .line 14
    .line 15
    .line 16
    invoke-direct/range {v0 .. v6}, Lkc0/k;-><init>(Lkc0/i;Ljc0/b;Lkc0/j;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/BlockingQueue;Ljava/util/concurrent/atomic/AtomicInteger;)V

    .line 17
    return-object v0
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
.end method

.method public final c()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lkc0/m;->c:Lkc0/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkc0/d;->g()Lkc0/c;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lkc0/c;->b()Ljava/util/List;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    .line 13
    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 14
    move-result-object v1

    .line 15
    .line 16
    .line 17
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 18
    move-result v2

    .line 19
    .line 20
    if-eqz v2, :cond_0

    .line 21
    .line 22
    .line 23
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    check-cast v2, Lkc0/i;

    .line 27
    .line 28
    iget-object v3, p0, Lkc0/m;->g:Lkc0/l;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v2}, Lkc0/m;->b(Lkc0/i;)Lkc0/k;

    .line 32
    move-result-object v2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v3, v2}, Lkc0/l;->a(Lkc0/k;)V

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_0
    iget-object v1, p0, Lkc0/m;->d:Lkc0/j;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lkc0/c;->c()J

    .line 42
    move-result-wide v2

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2, v3}, Lkc0/j;->a(J)Ljava/util/List;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 50
    move-result-object v0

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 54
    move-result v1

    .line 55
    .line 56
    if-eqz v1, :cond_1

    .line 57
    .line 58
    .line 59
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    check-cast v1, Lkc0/i;

    .line 63
    .line 64
    iget-object v2, p0, Lkc0/m;->g:Lkc0/l;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p0, v1}, Lkc0/m;->b(Lkc0/i;)Lkc0/k;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v1}, Lkc0/l;->a(Lkc0/k;)V

    .line 72
    goto :goto_1

    .line 73
    :cond_1
    return-void
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
.end method

.method public final d()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lkc0/i;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lkc0/m;->c:Lkc0/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lkc0/d;->i()Ljava/util/List;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    iget-object v1, p0, Lkc0/m;->d:Lkc0/j;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1}, Lkc0/j;->e()Ljava/util/List;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, v1}, Ljava/util/List;->addAll(Ljava/util/Collection;)Z

    .line 16
    return-object v0
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
.end method

.method public final e()V
    .locals 2

    .line 1
    .line 2
    :goto_0
    iget-boolean v0, p0, Lkc0/m;->i:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    :try_start_0
    invoke-virtual {p0}, Lkc0/m;->c()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    goto :goto_0

    .line 9
    :catch_0
    move-exception v0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    filled-new-array {v0}, [Ljava/lang/Object;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    const-string v1, "Uncaught exception in timer batch send task, e=%s"

    .line 20
    .line 21
    .line 22
    invoke-static {v1, v0}, Lhc0/a;->c(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    const-string v1, "producer"

    .line 26
    .line 27
    .line 28
    invoke-static {v1, v0}, Lhc0/a;->a(Ljava/lang/String;Ljava/lang/Object;)V

    .line 29
    goto :goto_0

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

.method public final f(Ljava/util/List;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lkc0/i;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    check-cast v0, Lkc0/i;

    .line 17
    .line 18
    iget-object v1, p0, Lkc0/m;->g:Lkc0/l;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p0, v0}, Lkc0/m;->b(Lkc0/i;)Lkc0/k;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lkc0/l;->a(Lkc0/k;)V

    .line 26
    goto :goto_0

    .line 27
    :cond_0
    return-void
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
.end method

.method public run()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lkc0/m;->e()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lkc0/m;->d()Ljava/util/List;

    .line 7
    move-result-object v0

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0, v0}, Lkc0/m;->f(Ljava/util/List;)V

    .line 11
    return-void
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
.end method
