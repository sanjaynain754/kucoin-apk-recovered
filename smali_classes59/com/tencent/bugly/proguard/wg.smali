.class public Lcom/tencent/bugly/proguard/wg;
.super Ljava/lang/Thread;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/wg$a;
    }
.end annotation


# static fields
.field public static final i:J = 0x1388L

.field public static final j:J = 0x5dcL

.field public static final k:J = 0xaL

.field public static final l:J = 0x1f4L

.field public static final m:J = 0x30d40L


# instance fields
.field public b:Z

.field public c:Z

.field public d:Z

.field public e:I

.field public f:Lcom/tencent/bugly/proguard/q7;

.field public g:Lcom/tencent/bugly/proguard/wg$a;

.field public h:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Thread;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/wg;->b:Z

    .line 7
    const/4 v1, 0x1

    .line 8
    .line 9
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/wg;->c:Z

    .line 10
    .line 11
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/wg;->d:Z

    .line 12
    .line 13
    iput v1, p0, Lcom/tencent/bugly/proguard/wg;->e:I

    .line 14
    .line 15
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/wg;->h:Z

    .line 16
    return-void
    .line 17
.end method


# virtual methods
.method public declared-synchronized a()V
    .locals 2

    monitor-enter p0

    const/4 v0, 0x0

    .line 10
    :try_start_0
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/wg;->c:Z

    .line 11
    new-array v0, v0, [Ljava/lang/Object;

    const-string v1, "Record stack trace is disabled."

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception v0

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw v0
.end method

.method public a(Lcom/tencent/bugly/proguard/wg$a;)V
    .locals 0

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/proguard/wg;->g:Lcom/tencent/bugly/proguard/wg$a;

    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/wg;->h:Z

    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "set record stack trace enable:"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Ljava/lang/Object;

    invoke-static {p1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return-void
.end method

.method public final a(Lcom/tencent/bugly/proguard/q7;)Z
    .locals 6

    .line 4
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/wg;->h:Z

    const/4 v1, 0x0

    if-eqz v0, :cond_5

    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/wg;->c:Z

    if-nez v0, :cond_0

    goto :goto_1

    .line 5
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/q7;->e()J

    move-result-wide v2

    const-wide/16 v4, 0x5e6

    cmp-long p1, v2, v4

    if-lez p1, :cond_5

    const-wide/32 v4, 0x30d36

    cmp-long p1, v2, v4

    if-ltz p1, :cond_1

    goto :goto_1

    :cond_1
    const-wide/16 v4, 0x1392

    cmp-long p1, v2, v4

    const/4 v0, 0x1

    if-gtz p1, :cond_2

    .line 6
    iput v0, p0, Lcom/tencent/bugly/proguard/wg;->e:I

    .line 7
    new-array p1, v1, [Ljava/lang/Object;

    const-string/jumbo v1, "timeSinceMsgSent in [2s, 5s], record stack"

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    return v0

    .line 8
    :cond_2
    iget p1, p0, Lcom/tencent/bugly/proguard/wg;->e:I

    add-int/lit8 v2, p1, 0x1

    iput v2, p0, Lcom/tencent/bugly/proguard/wg;->e:I

    and-int/2addr p1, v2

    if-nez p1, :cond_3

    goto :goto_0

    :cond_3
    move v0, v1

    :goto_0
    if-eqz v0, :cond_4

    .line 9
    new-array p1, v1, [Ljava/lang/Object;

    const-string/jumbo v1, "timeSinceMsgSent in (5s, 200s), should record stack:true"

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    :cond_4
    return v0

    :cond_5
    :goto_1
    return v1
.end method

.method public b()Ljava/util/List;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/ng;",
            ">;"
        }
    .end annotation

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/wg;->f:Lcom/tencent/bugly/proguard/q7;

    if-eqz v0, :cond_0

    const-wide/32 v1, 0x30d40

    .line 2
    invoke-virtual {v0, v1, v2}, Lcom/tencent/bugly/proguard/q7;->a(J)Ljava/util/List;

    move-result-object v0

    return-object v0

    :cond_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public final declared-synchronized b(Lcom/tencent/bugly/proguard/q7;)V
    .locals 2

    monitor-enter p0

    .line 3
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/wg;->c:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz v0, :cond_0

    monitor-exit p0

    return-void

    .line 4
    :cond_0
    :try_start_1
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/wg;->d:Z

    if-eqz v0, :cond_1

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/q7;->g()Z

    move-result p1

    if-nez p1, :cond_1

    const/4 p1, 0x0

    .line 5
    new-array v0, p1, [Ljava/lang/Object;

    const-string v1, "Restart getting main stack trace."

    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    const/4 v0, 0x1

    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/wg;->c:Z

    .line 7
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/wg;->d:Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    throw p1
.end method

.method public declared-synchronized b(Z)V
    .locals 0

    monitor-enter p0

    .line 8
    :try_start_0
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/wg;->d:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final c()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    new-array v0, v0, [Ljava/lang/Object;

    .line 4
    .line 5
    const-string v1, "MainHandlerChecker is reset to null."

    .line 6
    .line 7
    .line 8
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/x4;->f(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 9
    const/4 v0, 0x0

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/bugly/proguard/wg;->f:Lcom/tencent/bugly/proguard/q7;

    .line 12
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public final d()V
    .locals 5

    .line 1
    .line 2
    new-instance v0, Landroid/os/Handler;

    .line 3
    .line 4
    .line 5
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 10
    .line 11
    iget-object v1, p0, Lcom/tencent/bugly/proguard/wg;->f:Lcom/tencent/bugly/proguard/q7;

    .line 12
    .line 13
    const-wide/16 v2, 0x1388

    .line 14
    .line 15
    if-eqz v1, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, v2, v3}, Lcom/tencent/bugly/proguard/q7;->b(J)V

    .line 19
    return-void

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {v1}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    new-instance v4, Lcom/tencent/bugly/proguard/q7;

    .line 34
    .line 35
    .line 36
    invoke-direct {v4, v0, v1, v2, v3}, Lcom/tencent/bugly/proguard/q7;-><init>(Landroid/os/Handler;Ljava/lang/String;J)V

    .line 37
    .line 38
    iput-object v4, p0, Lcom/tencent/bugly/proguard/wg;->f:Lcom/tencent/bugly/proguard/q7;

    .line 39
    return-void
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
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/wg;->d()V

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Thread;->isAlive()Z

    .line 7
    move-result v0

    .line 8
    const/4 v1, 0x0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    return v1

    .line 12
    .line 13
    .line 14
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Thread;->start()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    const/4 v0, 0x1

    .line 16
    return v0

    .line 17
    :catch_0
    move-exception v0

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 21
    return v1
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
.end method

.method public f()Z
    .locals 2

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/wg;->b:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Ljava/lang/Thread;->isAlive()Z

    .line 7
    move-result v1

    .line 8
    .line 9
    if-nez v1, :cond_0

    .line 10
    const/4 v0, 0x0

    .line 11
    return v0

    .line 12
    .line 13
    .line 14
    :cond_0
    :try_start_0
    invoke-virtual {p0}, Ljava/lang/Thread;->interrupt()V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception v1

    .line 17
    .line 18
    .line 19
    invoke-static {v1}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 20
    .line 21
    .line 22
    :goto_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/wg;->c()V

    .line 23
    return v0
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

.method public run()V
    .locals 7

    .line 1
    .line 2
    .line 3
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    :goto_0
    iget-boolean v2, p0, Lcom/tencent/bugly/proguard/wg;->b:Z

    .line 7
    .line 8
    if-nez v2, :cond_3

    .line 9
    .line 10
    :try_start_0
    iget-object v2, p0, Lcom/tencent/bugly/proguard/wg;->f:Lcom/tencent/bugly/proguard/q7;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    .line 14
    const-string v2, "Main handler checker is null. Stop thread monitor."

    .line 15
    const/4 v3, 0x0

    .line 16
    .line 17
    new-array v3, v3, [Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/String;[Ljava/lang/Object;)Z

    .line 21
    goto :goto_3

    .line 22
    :catch_0
    move-exception v2

    .line 23
    goto :goto_1

    .line 24
    :catch_1
    move-exception v2

    .line 25
    goto :goto_2

    .line 26
    .line 27
    .line 28
    :cond_0
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/q7;->j()V

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/wg;->b(Lcom/tencent/bugly/proguard/q7;)V

    .line 32
    .line 33
    .line 34
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/wg;->a(Lcom/tencent/bugly/proguard/q7;)Z

    .line 35
    move-result v3

    .line 36
    .line 37
    if-eqz v3, :cond_1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/q7;->h()V

    .line 41
    .line 42
    :cond_1
    iget-object v3, p0, Lcom/tencent/bugly/proguard/wg;->g:Lcom/tencent/bugly/proguard/wg$a;

    .line 43
    .line 44
    if-eqz v3, :cond_2

    .line 45
    .line 46
    iget-boolean v4, p0, Lcom/tencent/bugly/proguard/wg;->c:Z

    .line 47
    .line 48
    if-eqz v4, :cond_2

    .line 49
    .line 50
    .line 51
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/q7;->g()Z

    .line 52
    move-result v4

    .line 53
    .line 54
    .line 55
    invoke-virtual {v2}, Lcom/tencent/bugly/proguard/q7;->e()J

    .line 56
    move-result-wide v5

    .line 57
    .line 58
    .line 59
    invoke-interface {v3, v4, v5, v6}, Lcom/tencent/bugly/proguard/wg$a;->a(ZJ)V

    .line 60
    .line 61
    .line 62
    :cond_2
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 63
    move-result-wide v2

    .line 64
    sub-long/2addr v2, v0

    .line 65
    .line 66
    const-wide/16 v4, 0x1f4

    .line 67
    rem-long/2addr v2, v4

    .line 68
    sub-long/2addr v4, v2

    .line 69
    .line 70
    .line 71
    invoke-static {v4, v5}, Lcom/tencent/bugly/proguard/bi;->c(J)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/OutOfMemoryError; {:try_start_0 .. :try_end_0} :catch_0

    .line 72
    goto :goto_0

    .line 73
    .line 74
    .line 75
    :goto_1
    invoke-static {v2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 76
    goto :goto_0

    .line 77
    .line 78
    .line 79
    :goto_2
    invoke-static {v2}, Lcom/tencent/bugly/proguard/x4;->a(Ljava/lang/Throwable;)Z

    .line 80
    goto :goto_0

    .line 81
    :cond_3
    :goto_3
    return-void
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
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
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
