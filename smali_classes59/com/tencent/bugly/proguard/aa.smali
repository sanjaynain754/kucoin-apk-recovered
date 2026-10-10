.class public Lcom/tencent/bugly/proguard/aa;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final e:Ljava/lang/String; = "RMonitor_lag"


# instance fields
.field public final a:Landroid/os/Looper;

.field public final b:Lcom/tencent/bugly/proguard/qa;

.field public c:Lcom/tencent/bugly/proguard/pa;

.field public d:Z


# direct methods
.method public constructor <init>(Landroid/os/Looper;Lcom/tencent/bugly/proguard/qa;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/qa;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/qa;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/aa;->b:Lcom/tencent/bugly/proguard/qa;

    .line 11
    const/4 v1, 0x0

    .line 12
    .line 13
    iput-object v1, p0, Lcom/tencent/bugly/proguard/aa;->c:Lcom/tencent/bugly/proguard/pa;

    .line 14
    const/4 v1, 0x0

    .line 15
    .line 16
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/aa;->d:Z

    .line 17
    .line 18
    iput-object p1, p0, Lcom/tencent/bugly/proguard/aa;->a:Landroid/os/Looper;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, p2}, Lcom/tencent/bugly/proguard/qa;->a(Lcom/tencent/bugly/proguard/qa;)V

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
.end method


# virtual methods
.method public final a()Z
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/aa;->a:Landroid/os/Looper;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Landroid/os/Looper;->getThread()Ljava/lang/Thread;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Ljava/lang/Thread;->isAlive()Z

    .line 10
    move-result v0

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public b()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/aa;->d:Z

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

.method public c()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/aa;->d:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 7
    .line 8
    const-string v1, "RMonitor_lag"

    .line 9
    .line 10
    .line 11
    const-string/jumbo v2, "work thread monitor has start yet."

    .line 12
    .line 13
    .line 14
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 19
    return-void

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/aa;->a()Z

    .line 23
    move-result v0

    .line 24
    .line 25
    if-nez v0, :cond_1

    .line 26
    .line 27
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 28
    .line 29
    const-string v1, "RMonitor_lag"

    .line 30
    .line 31
    .line 32
    const-string/jumbo v2, "start fail for work thread is not alive."

    .line 33
    .line 34
    .line 35
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 36
    move-result-object v1

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 40
    return-void

    .line 41
    :cond_1
    monitor-enter p0

    .line 42
    .line 43
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/aa;->d:Z

    .line 44
    .line 45
    if-nez v0, :cond_2

    .line 46
    .line 47
    new-instance v0, Lcom/tencent/rmonitor/looper/LooperObserver;

    .line 48
    .line 49
    iget-object v1, p0, Lcom/tencent/bugly/proguard/aa;->a:Landroid/os/Looper;

    .line 50
    .line 51
    iget-object v2, p0, Lcom/tencent/bugly/proguard/aa;->b:Lcom/tencent/bugly/proguard/qa;

    .line 52
    .line 53
    .line 54
    invoke-direct {v0, v1, v2}, Lcom/tencent/rmonitor/looper/LooperObserver;-><init>(Landroid/os/Looper;Lcom/tencent/bugly/proguard/qa;)V

    .line 55
    .line 56
    new-instance v1, Lcom/tencent/rmonitor/looper/provider/StackQueueProvider;

    .line 57
    .line 58
    .line 59
    invoke-direct {v1}, Lcom/tencent/rmonitor/looper/provider/StackQueueProvider;-><init>()V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/pa;->setStackProvider(Lcom/tencent/rmonitor/looper/provider/LooperStackProvider;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lcom/tencent/rmonitor/looper/LooperObserver;->start()V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pa;->resume()V

    .line 69
    .line 70
    iput-object v0, p0, Lcom/tencent/bugly/proguard/aa;->c:Lcom/tencent/bugly/proguard/pa;

    .line 71
    const/4 v0, 0x1

    .line 72
    .line 73
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/aa;->d:Z

    .line 74
    goto :goto_0

    .line 75
    :catchall_0
    move-exception v0

    .line 76
    goto :goto_1

    .line 77
    :cond_2
    :goto_0
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 78
    .line 79
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 80
    .line 81
    const-string v1, "RMonitor_lag"

    .line 82
    .line 83
    .line 84
    const-string/jumbo v2, "start work thread monitor."

    .line 85
    .line 86
    .line 87
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 92
    return-void

    .line 93
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 94
    throw v0
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

.method public d()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/aa;->d:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    monitor-enter p0

    .line 7
    .line 8
    :try_start_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/aa;->d:Z

    .line 9
    .line 10
    if-eqz v0, :cond_2

    .line 11
    .line 12
    iget-object v0, p0, Lcom/tencent/bugly/proguard/aa;->c:Lcom/tencent/bugly/proguard/pa;

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/pa;->stop()V

    .line 18
    goto :goto_0

    .line 19
    :catchall_0
    move-exception v0

    .line 20
    goto :goto_1

    .line 21
    :cond_1
    :goto_0
    const/4 v0, 0x0

    .line 22
    .line 23
    iput-object v0, p0, Lcom/tencent/bugly/proguard/aa;->c:Lcom/tencent/bugly/proguard/pa;

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/aa;->d:Z

    .line 27
    :cond_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 30
    .line 31
    const-string v1, "RMonitor_lag"

    .line 32
    .line 33
    .line 34
    const-string/jumbo v2, "stop work thread monitor."

    .line 35
    .line 36
    .line 37
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 38
    move-result-object v1

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 42
    return-void

    .line 43
    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 44
    throw v0
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
