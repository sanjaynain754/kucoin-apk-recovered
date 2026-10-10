.class public Lcom/tencent/bugly/proguard/o5;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Landroid/os/Handler$Callback;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/o5$a;
    }
.end annotation


# static fields
.field public static final j:Ljava/lang/String; = "RMonitor_MonitorCallback"

.field public static final k:J = 0x3e8L

.field public static final l:I = 0x1

.field public static final m:I = 0x3


# instance fields
.field public b:Lcom/tencent/bugly/library/MonitorCallback;

.field public c:Landroid/os/Handler;

.field public d:Landroid/os/HandlerThread;

.field public e:J

.field public f:Lcom/tencent/bugly/proguard/jf;

.field public g:I

.field public h:Z

.field public final i:Lcom/tencent/bugly/proguard/o5$a;


# direct methods
.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/o5;->b:Lcom/tencent/bugly/library/MonitorCallback;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/bugly/proguard/o5;->c:Landroid/os/Handler;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/o5;->d:Landroid/os/HandlerThread;

    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/o5;->e:J

    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/bugly/proguard/o5;->f:Lcom/tencent/bugly/proguard/jf;

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    iput v0, p0, Lcom/tencent/bugly/proguard/o5;->g:I

    .line 20
    .line 21
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/o5;->h:Z

    .line 22
    .line 23
    new-instance v0, Lcom/tencent/bugly/proguard/o5$a;

    .line 24
    .line 25
    .line 26
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/o5$a;-><init>(Lcom/tencent/bugly/proguard/o5;)V

    .line 27
    .line 28
    iput-object v0, p0, Lcom/tencent/bugly/proguard/o5;->i:Lcom/tencent/bugly/proguard/o5$a;

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
.end method


# virtual methods
.method public final a()V
    .locals 2

    .line 8
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o5;->c:Landroid/os/Handler;

    if-eqz v0, :cond_0

    const/4 v1, 0x1

    .line 9
    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeMessages(I)V

    :cond_0
    return-void
.end method

.method public declared-synchronized a(Lcom/tencent/bugly/library/MonitorCallback;)V
    .locals 2

    monitor-enter p0

    if-nez p1, :cond_0

    .line 1
    :try_start_0
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->g()V

    .line 2
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->h()V

    .line 3
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "RMonitor_MonitorCallback"

    const-string/jumbo v1, "release call back"

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 4
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/o5;->b:Lcom/tencent/bugly/library/MonitorCallback;

    .line 5
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->b()V

    .line 6
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/o5;->h:Z

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->i()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_1
    :goto_0
    monitor-exit p0

    return-void

    :goto_1
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final b()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o5;->c:Landroid/os/Handler;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    new-instance v0, Landroid/os/HandlerThread;

    .line 7
    .line 8
    const-string v1, "MonitorCallback"

    .line 9
    .line 10
    .line 11
    invoke-direct {v0, v1}, Landroid/os/HandlerThread;-><init>(Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    .line 15
    .line 16
    new-instance v1, Landroid/os/Handler;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Landroid/os/HandlerThread;->getLooper()Landroid/os/Looper;

    .line 20
    move-result-object v2

    .line 21
    .line 22
    .line 23
    invoke-direct {v1, v2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 24
    .line 25
    iput-object v0, p0, Lcom/tencent/bugly/proguard/o5;->d:Landroid/os/HandlerThread;

    .line 26
    .line 27
    iput-object v1, p0, Lcom/tencent/bugly/proguard/o5;->c:Landroid/os/Handler;

    .line 28
    .line 29
    sget-object v0, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->isCurrentForeground()Z

    .line 33
    move-result v0

    .line 34
    .line 35
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/o5;->h:Z

    .line 36
    .line 37
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o5;->i:Lcom/tencent/bugly/proguard/o5$a;

    .line 38
    .line 39
    .line 40
    invoke-static {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 41
    .line 42
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 43
    .line 44
    const-string v1, "RMonitor_MonitorCallback"

    .line 45
    .line 46
    .line 47
    const-string/jumbo v2, "set call back"

    .line 48
    .line 49
    .line 50
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 51
    move-result-object v1

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 55
    :cond_0
    return-void
    .line 56
    .line 57
.end method

.method public final c()Lcom/tencent/bugly/proguard/jf;
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o5;->f:Lcom/tencent/bugly/proguard/jf;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    iget v1, p0, Lcom/tencent/bugly/proguard/o5;->g:I

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    iput v1, p0, Lcom/tencent/bugly/proguard/o5;->g:I

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->d()Lcom/tencent/bugly/proguard/t4;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    new-instance v0, Lcom/tencent/bugly/proguard/jf;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/jf;-><init>()V

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/t4;->a(Lcom/tencent/bugly/proguard/jf;)V

    .line 26
    .line 27
    :cond_1
    iput-object v0, p0, Lcom/tencent/bugly/proguard/o5;->f:Lcom/tencent/bugly/proguard/jf;

    .line 28
    .line 29
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 30
    .line 31
    if-eqz v0, :cond_2

    .line 32
    .line 33
    .line 34
    const-string/jumbo v2, "success"

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_2
    const-string v2, "fail"

    .line 38
    .line 39
    :goto_0
    const-string v3, "fetch monitor "

    .line 40
    .line 41
    .line 42
    invoke-virtual {v3, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 43
    move-result-object v2

    .line 44
    .line 45
    const-string v3, "RMonitor_MonitorCallback"

    .line 46
    .line 47
    .line 48
    filled-new-array {v3, v2}, [Ljava/lang/String;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 53
    .line 54
    iget v1, p0, Lcom/tencent/bugly/proguard/o5;->g:I

    .line 55
    const/4 v2, 0x3

    .line 56
    .line 57
    if-lt v1, v2, :cond_3

    .line 58
    .line 59
    .line 60
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->h()V

    .line 61
    :cond_3
    return-object v0
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

.method public final d()Lcom/tencent/bugly/proguard/t4;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->INSTANCE:Lcom/tencent/rmonitor/manager/RMonitorLauncher;

    .line 3
    .line 4
    const-string v1, "looper_metric"

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1, v2}, Lcom/tencent/rmonitor/manager/RMonitorLauncher;->getPlugin(Ljava/lang/String;Z)Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    instance-of v1, v0, Lcom/tencent/bugly/proguard/t4;

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    check-cast v0, Lcom/tencent/bugly/proguard/t4;

    .line 16
    return-object v0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    return-object v0
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
.end method

.method public e()V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/o5;->h:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->a()V

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

.method public f()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/o5;->h:Z

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->i()V

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

.method public final g()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o5;->f:Lcom/tencent/bugly/proguard/jf;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->d()Lcom/tencent/bugly/proguard/t4;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/t4;->a(Lcom/tencent/bugly/proguard/jf;)V

    .line 15
    .line 16
    :cond_0
    iput-object v1, p0, Lcom/tencent/bugly/proguard/o5;->f:Lcom/tencent/bugly/proguard/jf;

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    iput v0, p0, Lcom/tencent/bugly/proguard/o5;->g:I

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

.method public final h()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput-object v0, p0, Lcom/tencent/bugly/proguard/o5;->b:Lcom/tencent/bugly/library/MonitorCallback;

    .line 4
    .line 5
    .line 6
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->a()V

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/bugly/proguard/o5;->c:Landroid/os/Handler;

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/bugly/proguard/o5;->d:Landroid/os/HandlerThread;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1}, Landroid/os/HandlerThread;->quit()Z

    .line 16
    .line 17
    :cond_0
    iput-object v0, p0, Lcom/tencent/bugly/proguard/o5;->d:Landroid/os/HandlerThread;

    .line 18
    .line 19
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o5;->i:Lcom/tencent/bugly/proguard/o5$a;

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->unRegister(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

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

.method public handleMessage(Landroid/os/Message;)Z
    .locals 6

    .line 1
    .line 2
    iget p1, p1, Landroid/os/Message;->what:I

    .line 3
    const/4 v0, 0x1

    .line 4
    .line 5
    if-eq p1, v0, :cond_0

    .line 6
    return v0

    .line 7
    .line 8
    :cond_0
    iget-object p1, p0, Lcom/tencent/bugly/proguard/o5;->b:Lcom/tencent/bugly/library/MonitorCallback;

    .line 9
    .line 10
    if-nez p1, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->h()V

    .line 14
    goto :goto_0

    .line 15
    .line 16
    .line 17
    :cond_1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->c()Lcom/tencent/bugly/proguard/jf;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    if-eqz v1, :cond_2

    .line 21
    .line 22
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/o5;->e:J

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/jf;->b()J

    .line 26
    move-result-wide v4

    .line 27
    .line 28
    iput-wide v4, p0, Lcom/tencent/bugly/proguard/o5;->e:J

    .line 29
    .line 30
    cmp-long v2, v2, v4

    .line 31
    .line 32
    if-eqz v2, :cond_2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/jf;->a()F

    .line 36
    move-result v1

    .line 37
    .line 38
    .line 39
    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    const-string v2, "fps"

    .line 43
    .line 44
    .line 45
    invoke-interface {p1, v2, v1}, Lcom/tencent/bugly/library/MonitorCallback;->onEvent(Ljava/lang/String;Ljava/lang/Object;)V

    .line 46
    .line 47
    :cond_2
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/o5;->h:Z

    .line 48
    .line 49
    if-eqz p1, :cond_3

    .line 50
    .line 51
    .line 52
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/o5;->i()V

    .line 53
    :cond_3
    :goto_0
    return v0
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

.method public i()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/o5;->c:Landroid/os/Handler;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0, v1}, Landroid/os/Handler;->hasMessages(I)Z

    .line 9
    move-result v2

    .line 10
    .line 11
    if-nez v2, :cond_0

    .line 12
    .line 13
    const-wide/16 v2, 0x3e8

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1, v2, v3}, Landroid/os/Handler;->sendEmptyMessageDelayed(IJ)Z

    .line 17
    :cond_0
    return-void
.end method
