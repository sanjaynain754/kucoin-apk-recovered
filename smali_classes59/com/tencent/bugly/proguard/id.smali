.class public final Lcom/tencent/bugly/proguard/id;
.super Lcom/tencent/bugly/proguard/df;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/id$a;
    }
.end annotation


# static fields
.field public static final g:Ljava/lang/String; = "RMonitor_net_quality"


# instance fields
.field public final b:Ljava/lang/Object;

.field public c:Z

.field public d:Lcom/tencent/bugly/proguard/b8;

.field public e:Lcom/tencent/bugly/proguard/x7;

.field public f:Lcom/tencent/bugly/proguard/id$a;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/df;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/lang/Object;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/id;->b:Ljava/lang/Object;

    .line 11
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/id;->c:Z

    .line 14
    const/4 v0, 0x0

    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/bugly/proguard/id;->d:Lcom/tencent/bugly/proguard/b8;

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/bugly/proguard/id;->e:Lcom/tencent/bugly/proguard/x7;

    .line 19
    .line 20
    iput-object v0, p0, Lcom/tencent/bugly/proguard/id;->f:Lcom/tencent/bugly/proguard/id$a;

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
.end method


# virtual methods
.method public a()Lcom/tencent/bugly/proguard/jd;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;->getPluginConfig()Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->config:Lcom/tencent/bugly/proguard/hf;

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    const/4 v0, 0x0

    .line 11
    .line 12
    :goto_0
    instance-of v1, v0, Lcom/tencent/bugly/proguard/jd;

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    check-cast v0, Lcom/tencent/bugly/proguard/jd;

    .line 17
    return-object v0

    .line 18
    .line 19
    :cond_1
    new-instance v0, Lcom/tencent/bugly/proguard/jd;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/jd;-><init>()V

    .line 23
    return-object v0
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

.method public getPluginName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    const-string/jumbo v0, "net_quality"

    .line 4
    return-object v0
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

.method public isRunning()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/id;->c:Z

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

.method public start()V
    .locals 4

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/id;->c:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v1, "net_quality"

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    .line 18
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 19
    .line 20
    const-string v1, "RMonitor_net_quality"

    .line 21
    .line 22
    const-string v2, "can not start plugin for can not collect."

    .line 23
    .line 24
    .line 25
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 30
    return-void

    .line 31
    .line 32
    :cond_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/id;->b:Ljava/lang/Object;

    .line 33
    monitor-enter v0

    .line 34
    .line 35
    :try_start_0
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/id;->c:Z

    .line 36
    .line 37
    if-nez v1, :cond_4

    .line 38
    .line 39
    iget-object v1, p0, Lcom/tencent/bugly/proguard/id;->d:Lcom/tencent/bugly/proguard/b8;

    .line 40
    .line 41
    if-nez v1, :cond_2

    .line 42
    .line 43
    new-instance v1, Lcom/tencent/bugly/proguard/b8;

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/id;->a()Lcom/tencent/bugly/proguard/jd;

    .line 47
    move-result-object v2

    .line 48
    .line 49
    new-instance v3, Lcom/tencent/bugly/proguard/pf;

    .line 50
    .line 51
    .line 52
    invoke-direct {v3}, Lcom/tencent/bugly/proguard/pf;-><init>()V

    .line 53
    .line 54
    .line 55
    invoke-direct {v1, v2, v3}, Lcom/tencent/bugly/proguard/b8;-><init>(Lcom/tencent/bugly/proguard/jd;Lcom/tencent/bugly/proguard/of;)V

    .line 56
    .line 57
    iput-object v1, p0, Lcom/tencent/bugly/proguard/id;->d:Lcom/tencent/bugly/proguard/b8;

    .line 58
    goto :goto_0

    .line 59
    :catchall_0
    move-exception v1

    .line 60
    goto :goto_1

    .line 61
    .line 62
    :cond_2
    :goto_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/id;->e:Lcom/tencent/bugly/proguard/x7;

    .line 63
    .line 64
    if-nez v1, :cond_3

    .line 65
    .line 66
    new-instance v1, Lcom/tencent/bugly/proguard/x7;

    .line 67
    .line 68
    iget-object v2, p0, Lcom/tencent/bugly/proguard/id;->d:Lcom/tencent/bugly/proguard/b8;

    .line 69
    .line 70
    .line 71
    invoke-direct {v1, v2}, Lcom/tencent/bugly/proguard/x7;-><init>(Lcom/tencent/bugly/proguard/a8;)V

    .line 72
    .line 73
    iput-object v1, p0, Lcom/tencent/bugly/proguard/id;->e:Lcom/tencent/bugly/proguard/x7;

    .line 74
    .line 75
    :cond_3
    iget-object v1, p0, Lcom/tencent/bugly/proguard/id;->e:Lcom/tencent/bugly/proguard/x7;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/x7;->a()V

    .line 79
    .line 80
    .line 81
    invoke-static {}, Lcom/tencent/bugly/network/BuglyListenerFactory;->getInstance()Lcom/tencent/bugly/network/BuglyListenerFactory;

    .line 82
    move-result-object v1

    .line 83
    .line 84
    iget-object v2, p0, Lcom/tencent/bugly/proguard/id;->e:Lcom/tencent/bugly/proguard/x7;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/network/BuglyListenerFactory;->addFactory(Lokhttp3/EventListener$Factory;)V

    .line 88
    const/4 v1, 0x1

    .line 89
    .line 90
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/id;->c:Z

    .line 91
    .line 92
    const-string v1, ""

    .line 93
    const/4 v2, 0x0

    .line 94
    .line 95
    .line 96
    invoke-virtual {p0, v2, v1}, Lcom/tencent/bugly/proguard/df;->notifyStartResult(ILjava/lang/String;)V

    .line 97
    :cond_4
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 98
    .line 99
    new-instance v0, Lcom/tencent/bugly/proguard/id$a;

    .line 100
    .line 101
    iget-object v1, p0, Lcom/tencent/bugly/proguard/id;->d:Lcom/tencent/bugly/proguard/b8;

    .line 102
    .line 103
    .line 104
    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/id$a;-><init>(Lcom/tencent/bugly/proguard/b8;)V

    .line 105
    .line 106
    .line 107
    invoke-static {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 108
    .line 109
    iput-object v0, p0, Lcom/tencent/bugly/proguard/id;->f:Lcom/tencent/bugly/proguard/id$a;

    .line 110
    .line 111
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 112
    .line 113
    const-string v1, "RMonitor_net_quality"

    .line 114
    .line 115
    .line 116
    const-string/jumbo v2, "start"

    .line 117
    .line 118
    .line 119
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 120
    move-result-object v1

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 124
    return-void

    .line 125
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 126
    throw v1
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

.method public stop()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/id;->c:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/id;->b:Ljava/lang/Object;

    .line 8
    monitor-enter v0

    .line 9
    .line 10
    :try_start_0
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/id;->c:Z

    .line 11
    .line 12
    if-eqz v1, :cond_2

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/tencent/bugly/network/BuglyListenerFactory;->getInstance()Lcom/tencent/bugly/network/BuglyListenerFactory;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    iget-object v2, p0, Lcom/tencent/bugly/proguard/id;->e:Lcom/tencent/bugly/proguard/x7;

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2}, Lcom/tencent/bugly/network/BuglyListenerFactory;->removeFactory(Lokhttp3/EventListener$Factory;)V

    .line 22
    .line 23
    iget-object v1, p0, Lcom/tencent/bugly/proguard/id;->e:Lcom/tencent/bugly/proguard/x7;

    .line 24
    .line 25
    if-eqz v1, :cond_1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/x7;->b()V

    .line 29
    goto :goto_0

    .line 30
    :catchall_0
    move-exception v1

    .line 31
    goto :goto_1

    .line 32
    :cond_1
    :goto_0
    const/4 v1, 0x0

    .line 33
    .line 34
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/id;->c:Z

    .line 35
    .line 36
    const-string v2, ""

    .line 37
    .line 38
    .line 39
    invoke-virtual {p0, v1, v2}, Lcom/tencent/bugly/proguard/df;->notifyStopResult(ILjava/lang/String;)V

    .line 40
    :cond_2
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 41
    .line 42
    iget-object v0, p0, Lcom/tencent/bugly/proguard/id;->f:Lcom/tencent/bugly/proguard/id$a;

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->unRegister(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 46
    .line 47
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 48
    .line 49
    const-string v1, "RMonitor_net_quality"

    .line 50
    .line 51
    .line 52
    const-string/jumbo v2, "stop"

    .line 53
    .line 54
    .line 55
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 60
    return-void

    .line 61
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 62
    throw v1
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
