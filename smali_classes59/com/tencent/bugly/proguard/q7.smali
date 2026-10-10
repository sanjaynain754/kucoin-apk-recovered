.class public Lcom/tencent/bugly/proguard/q7;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# static fields
.field public static final i:I = 0x20

.field public static final j:I = 0x0

.field public static final k:I = 0x1

.field public static final l:I = 0x3


# instance fields
.field public final b:Landroid/os/Handler;

.field public final c:Ljava/lang/String;

.field public final d:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/ng;",
            ">;"
        }
    .end annotation
.end field

.field public e:J

.field public final f:J

.field public g:Z

.field public h:J


# direct methods
.method public constructor <init>(Landroid/os/Handler;Ljava/lang/String;J)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/LinkedList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/q7;->d:Ljava/util/List;

    .line 11
    .line 12
    iput-object p1, p0, Lcom/tencent/bugly/proguard/q7;->b:Landroid/os/Handler;

    .line 13
    .line 14
    iput-object p2, p0, Lcom/tencent/bugly/proguard/q7;->c:Ljava/lang/String;

    .line 15
    .line 16
    iput-wide p3, p0, Lcom/tencent/bugly/proguard/q7;->e:J

    .line 17
    .line 18
    iput-wide p3, p0, Lcom/tencent/bugly/proguard/q7;->f:J

    .line 19
    const/4 p1, 0x1

    .line 20
    .line 21
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/q7;->g:Z

    .line 22
    return-void
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


# virtual methods
.method public a()I
    .locals 4

    .line 1
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/q7;->g:Z

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 2
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    move-result-wide v0

    iget-wide v2, p0, Lcom/tencent/bugly/proguard/q7;->h:J

    sub-long/2addr v0, v2

    .line 3
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/q7;->e:J

    cmp-long v0, v0, v2

    if-gez v0, :cond_1

    const/4 v0, 0x1

    return v0

    :cond_1
    const/4 v0, 0x3

    return v0
.end method

.method public a(J)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J)",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/ng;",
            ">;"
        }
    .end annotation

    .line 4
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    .line 5
    iget-object v2, p0, Lcom/tencent/bugly/proguard/q7;->d:Ljava/util/List;

    monitor-enter v2

    .line 6
    :try_start_0
    new-instance v3, Ljava/util/ArrayList;

    iget-object v4, p0, Lcom/tencent/bugly/proguard/q7;->d:Ljava/util/List;

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v4, 0x0

    .line 7
    :goto_0
    iget-object v5, p0, Lcom/tencent/bugly/proguard/q7;->d:Ljava/util/List;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ge v4, v5, :cond_1

    .line 8
    iget-object v5, p0, Lcom/tencent/bugly/proguard/q7;->d:Ljava/util/List;

    invoke-interface {v5, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/tencent/bugly/proguard/ng;

    .line 9
    invoke-virtual {v5}, Lcom/tencent/bugly/proguard/ng;->e()Z

    move-result v6

    if-nez v6, :cond_0

    invoke-virtual {v5}, Lcom/tencent/bugly/proguard/ng;->b()J

    move-result-wide v6

    sub-long v6, v0, v6

    cmp-long v6, v6, p1

    if-gez v6, :cond_0

    .line 10
    invoke-virtual {v3, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v6, 0x1

    .line 11
    invoke-virtual {v5, v6}, Lcom/tencent/bugly/proguard/ng;->a(Z)V

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    .line 12
    :cond_1
    monitor-exit v2

    return-object v3

    :goto_2
    monitor-exit v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b()Landroid/os/Looper;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/q7;->b:Landroid/os/Handler;

    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    move-result-object v0

    return-object v0
.end method

.method public b(J)V
    .locals 0

    .line 2
    iput-wide p1, p0, Lcom/tencent/bugly/proguard/q7;->e:J

    return-void
.end method

.method public c()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/q7;->c:Ljava/lang/String;

    .line 3
    return-object v0
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

.method public d()Ljava/lang/Thread;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/q7;->b:Landroid/os/Handler;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/Handler;->getLooper()Landroid/os/Looper;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 10
    move-result-object v0

    .line 11
    return-object v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public e()J
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 4
    move-result-wide v0

    .line 5
    .line 6
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/q7;->h:J

    .line 7
    sub-long/2addr v0, v2

    .line 8
    return-wide v0
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

.method public f()Landroid/os/Handler;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/q7;->b:Landroid/os/Handler;

    .line 3
    return-object v0
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

.method public g()Z
    .locals 6

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/q7;->g:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 8
    move-result-wide v0

    .line 9
    .line 10
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/q7;->h:J

    .line 11
    .line 12
    iget-wide v4, p0, Lcom/tencent/bugly/proguard/q7;->e:J

    .line 13
    add-long/2addr v2, v4

    .line 14
    .line 15
    cmp-long v0, v0, v2

    .line 16
    .line 17
    if-ltz v0, :cond_0

    .line 18
    const/4 v0, 0x1

    .line 19
    return v0

    .line 20
    :cond_0
    const/4 v0, 0x0

    .line 21
    return v0
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

.method public h()V
    .locals 9

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const/16 v1, 0x400

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 8
    .line 9
    .line 10
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 11
    move-result-wide v1

    .line 12
    const/4 v3, 0x0

    .line 13
    .line 14
    .line 15
    :try_start_0
    invoke-static {}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->c()Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;

    .line 16
    move-result-object v4

    .line 17
    .line 18
    .line 19
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/q7;->d()Ljava/lang/Thread;

    .line 20
    move-result-object v5

    .line 21
    .line 22
    .line 23
    invoke-virtual {v4, v5}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->b(Ljava/lang/Thread;)J

    .line 24
    move-result-wide v4

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/q7;->d()Ljava/lang/Thread;

    .line 28
    move-result-object v6

    .line 29
    .line 30
    .line 31
    invoke-virtual {v6}, Ljava/lang/Thread;->getStackTrace()[Ljava/lang/StackTraceElement;

    .line 32
    move-result-object v6

    .line 33
    .line 34
    .line 35
    invoke-static {}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->c()Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;

    .line 36
    move-result-object v7

    .line 37
    .line 38
    .line 39
    invoke-virtual {v7, v4, v5}, Lcom/tencent/rmonitor/base/thread/suspend/ThreadSuspend;->a(J)Z

    .line 40
    array-length v4, v6

    .line 41
    .line 42
    if-nez v4, :cond_0

    .line 43
    .line 44
    const-string v4, "Thread does not have stack trace.\n"

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    goto :goto_2

    .line 49
    :catch_0
    move-exception v4

    .line 50
    goto :goto_1

    .line 51
    :cond_0
    array-length v4, v6

    .line 52
    move v5, v3

    .line 53
    .line 54
    :goto_0
    if-ge v5, v4, :cond_1

    .line 55
    .line 56
    aget-object v7, v6, v5

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    const-string v7, "\n"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 65
    .line 66
    add-int/lit8 v5, v5, 0x1

    .line 67
    goto :goto_0

    .line 68
    .line 69
    :goto_1
    const-string v5, "getStackTrace() encountered:\n"

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 76
    move-result-object v5

    .line 77
    .line 78
    .line 79
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v5, "\n"

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-static {v4}, Lcom/tencent/bugly/proguard/x4;->b(Ljava/lang/Throwable;)Z

    .line 88
    .line 89
    .line 90
    :cond_1
    :goto_2
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    .line 91
    move-result-wide v4

    .line 92
    .line 93
    new-instance v6, Lcom/tencent/bugly/proguard/ng;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    .line 100
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 101
    move-result-wide v7

    .line 102
    .line 103
    .line 104
    invoke-direct {v6, v0, v7, v8}, Lcom/tencent/bugly/proguard/ng;-><init>(Ljava/lang/String;J)V

    .line 105
    sub-long/2addr v4, v1

    .line 106
    .line 107
    iput-wide v4, v6, Lcom/tencent/bugly/proguard/ng;->d:J

    .line 108
    .line 109
    .line 110
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/q7;->d()Ljava/lang/Thread;

    .line 111
    move-result-object v0

    .line 112
    .line 113
    .line 114
    invoke-virtual {v0}, Ljava/lang/Thread;->getName()Ljava/lang/String;

    .line 115
    move-result-object v0

    .line 116
    .line 117
    .line 118
    invoke-virtual {v6, v0}, Lcom/tencent/bugly/proguard/ng;->b(Ljava/lang/String;)V

    .line 119
    .line 120
    iget-object v0, p0, Lcom/tencent/bugly/proguard/q7;->d:Ljava/util/List;

    .line 121
    monitor-enter v0

    .line 122
    .line 123
    :goto_3
    :try_start_1
    iget-object v1, p0, Lcom/tencent/bugly/proguard/q7;->d:Ljava/util/List;

    .line 124
    .line 125
    .line 126
    invoke-interface {v1}, Ljava/util/List;->size()I

    .line 127
    move-result v1

    .line 128
    .line 129
    const/16 v2, 0x20

    .line 130
    .line 131
    if-lt v1, v2, :cond_2

    .line 132
    .line 133
    iget-object v1, p0, Lcom/tencent/bugly/proguard/q7;->d:Ljava/util/List;

    .line 134
    .line 135
    .line 136
    invoke-interface {v1, v3}, Ljava/util/List;->remove(I)Ljava/lang/Object;

    .line 137
    goto :goto_3

    .line 138
    :catchall_0
    move-exception v1

    .line 139
    goto :goto_4

    .line 140
    .line 141
    :cond_2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/q7;->d:Ljava/util/List;

    .line 142
    .line 143
    .line 144
    invoke-interface {v1, v6}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 145
    monitor-exit v0

    .line 146
    return-void

    .line 147
    :goto_4
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 148
    throw v1
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

.method public i()V
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/q7;->f:J

    .line 3
    .line 4
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/q7;->e:J

    .line 5
    return-void
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

.method public j()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/q7;->g:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x0

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/q7;->g:Z

    .line 9
    .line 10
    .line 11
    invoke-static {}, Landroid/os/SystemClock;->uptimeMillis()J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/q7;->h:J

    .line 15
    .line 16
    iget-object v0, p0, Lcom/tencent/bugly/proguard/q7;->b:Landroid/os/Handler;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    .line 20
    return-void
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
.end method

.method public run()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/q7;->g:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/q7;->i()V

    .line 7
    return-void
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
