.class public Lcom/tencent/bugly/proguard/x7;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lokhttp3/EventListener$Factory;
.implements Lcom/tencent/bugly/proguard/j8;


# instance fields
.field public final a:Lcom/tencent/bugly/proguard/a8;

.field public b:Lcom/tencent/bugly/proguard/w7;

.field public final c:Ljava/util/concurrent/atomic/AtomicBoolean;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/a8;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/x7;->b:Lcom/tencent/bugly/proguard/w7;

    .line 7
    .line 8
    new-instance v0, Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/util/concurrent/atomic/AtomicBoolean;-><init>(Z)V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/tencent/bugly/proguard/x7;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 15
    .line 16
    iput-object p1, p0, Lcom/tencent/bugly/proguard/x7;->a:Lcom/tencent/bugly/proguard/a8;

    .line 17
    return-void
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
.method public a()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/x7;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x0

    .line 4
    const/4 v2, 0x1

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/x7;->b:Lcom/tencent/bugly/proguard/w7;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/w7;->d()V

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
.end method

.method public b()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/x7;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    const/4 v1, 0x1

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->compareAndSet(ZZ)Z

    .line 8
    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/x7;->b:Lcom/tencent/bugly/proguard/w7;

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/w7;->e()V

    .line 15
    :cond_0
    return-void
    .line 16
    .line 17
.end method

.method public create(Lokhttp3/Call;)Lokhttp3/EventListener;
    .locals 2

    .line 1
    .line 2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/x7;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p1}, Ljava/util/concurrent/atomic/AtomicBoolean;->get()Z

    .line 6
    move-result p1

    .line 7
    .line 8
    if-nez p1, :cond_0

    .line 9
    const/4 p1, 0x0

    .line 10
    return-object p1

    .line 11
    .line 12
    :cond_0
    iget-object p1, p0, Lcom/tencent/bugly/proguard/x7;->b:Lcom/tencent/bugly/proguard/w7;

    .line 13
    .line 14
    if-nez p1, :cond_2

    .line 15
    .line 16
    const-class p1, Lcom/tencent/bugly/proguard/x7;

    .line 17
    monitor-enter p1

    .line 18
    .line 19
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/x7;->b:Lcom/tencent/bugly/proguard/w7;

    .line 20
    .line 21
    if-nez v0, :cond_1

    .line 22
    .line 23
    new-instance v0, Lcom/tencent/bugly/proguard/w7;

    .line 24
    .line 25
    iget-object v1, p0, Lcom/tencent/bugly/proguard/x7;->a:Lcom/tencent/bugly/proguard/a8;

    .line 26
    .line 27
    .line 28
    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/w7;-><init>(Lcom/tencent/bugly/proguard/a8;)V

    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/bugly/proguard/x7;->b:Lcom/tencent/bugly/proguard/w7;

    .line 31
    goto :goto_0

    .line 32
    :catchall_0
    move-exception v0

    .line 33
    goto :goto_1

    .line 34
    .line 35
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/x7;->b:Lcom/tencent/bugly/proguard/w7;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/w7;->d()V

    .line 39
    monitor-exit p1

    .line 40
    goto :goto_2

    .line 41
    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    throw v0

    .line 43
    .line 44
    :cond_2
    :goto_2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/x7;->b:Lcom/tencent/bugly/proguard/w7;

    .line 45
    return-object p1
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

.method public onCallEnd(Lokhttp3/Call;ZLjava/io/IOException;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/x7;->b:Lcom/tencent/bugly/proguard/w7;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    if-eqz p2, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p1, p3}, Lcom/tencent/bugly/proguard/w7;->callFailed(Lokhttp3/Call;Ljava/io/IOException;)V

    .line 10
    return-void

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/w7;->callEnd(Lokhttp3/Call;)V

    .line 14
    :cond_1
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
.end method
