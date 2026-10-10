.class public Lcom/tencent/bugly/proguard/cc;
.super Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/cc$b;
    }
.end annotation


# static fields
.field public static final d:Ljava/lang/String; = "RMonitor_MemoryLeak"


# instance fields
.field public b:Lcom/tencent/bugly/proguard/bc;

.field public c:Lcom/tencent/bugly/proguard/j0;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/tencent/rmonitor/base/plugin/monitor/QAPMMonitorPlugin;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lcom/tencent/bugly/proguard/cc$a;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/cc;-><init>()V

    return-void
.end method

.method public static a()Lcom/tencent/bugly/proguard/cc;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/cc$b;->a()Lcom/tencent/bugly/proguard/cc;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final a(Lcom/tencent/bugly/proguard/bc;)Lcom/tencent/bugly/proguard/j0;
    .locals 1

    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/j0;

    invoke-direct {v0, p1}, Lcom/tencent/bugly/proguard/j0;-><init>(Lcom/tencent/bugly/proguard/bc;)V

    return-object v0
.end method

.method public declared-synchronized start()V
    .locals 3

    .line 1
    monitor-enter p0

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverL()Z

    .line 5
    move-result v0

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/i4;->a()Z

    .line 11
    move-result v0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    const-string v1, "RMonitor_MemoryLeak"

    .line 18
    .line 19
    const-string v2, "don\'t support fork dumper"

    .line 20
    .line 21
    .line 22
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 23
    move-result-object v1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 27
    monitor-exit p0

    .line 28
    return-void

    .line 29
    :catchall_0
    move-exception v0

    .line 30
    goto :goto_1

    .line 31
    .line 32
    .line 33
    :cond_0
    :try_start_1
    invoke-static {}, Lcom/tencent/bugly/proguard/s7;->a()Lcom/tencent/bugly/proguard/e9;

    .line 34
    move-result-object v0

    .line 35
    .line 36
    instance-of v0, v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;

    .line 37
    .line 38
    if-eqz v0, :cond_3

    .line 39
    .line 40
    iget-object v0, p0, Lcom/tencent/bugly/proguard/cc;->b:Lcom/tencent/bugly/proguard/bc;

    .line 41
    .line 42
    if-nez v0, :cond_2

    .line 43
    .line 44
    new-instance v0, Landroid/os/Handler;

    .line 45
    .line 46
    .line 47
    invoke-static {}, Lcom/tencent/bugly/common/thread/ThreadManager;->getMonitorThreadLooper()Landroid/os/Looper;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    .line 51
    invoke-direct {v0, v1}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 52
    .line 53
    sget-object v1, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->memoryLeakListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->getListener()Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;

    .line 57
    move-result-object v1

    .line 58
    .line 59
    check-cast v1, Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;

    .line 60
    .line 61
    if-nez v1, :cond_1

    .line 62
    .line 63
    new-instance v1, Lcom/tencent/bugly/proguard/y4;

    .line 64
    .line 65
    .line 66
    invoke-direct {v1}, Lcom/tencent/bugly/proguard/y4;-><init>()V

    .line 67
    .line 68
    :cond_1
    new-instance v2, Lcom/tencent/bugly/proguard/bc;

    .line 69
    .line 70
    .line 71
    invoke-direct {v2, v0, v1}, Lcom/tencent/bugly/proguard/bc;-><init>(Landroid/os/Handler;Lcom/tencent/rmonitor/base/plugin/listener/IMemoryLeakListener;)V

    .line 72
    .line 73
    iput-object v2, p0, Lcom/tencent/bugly/proguard/cc;->b:Lcom/tencent/bugly/proguard/bc;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/cc;->a(Lcom/tencent/bugly/proguard/bc;)Lcom/tencent/bugly/proguard/j0;

    .line 77
    move-result-object v0

    .line 78
    .line 79
    iput-object v0, p0, Lcom/tencent/bugly/proguard/cc;->c:Lcom/tencent/bugly/proguard/j0;

    .line 80
    .line 81
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/cc;->c:Lcom/tencent/bugly/proguard/j0;

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/j0;->b()Z

    .line 85
    .line 86
    .line 87
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    const-string v1, "activity_leak"

    .line 91
    .line 92
    .line 93
    invoke-static {v1}, Lcom/tencent/bugly/proguard/vd;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;

    .line 94
    move-result-object v1

    .line 95
    .line 96
    .line 97
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/cf;->b(Lcom/tencent/bugly/proguard/ef;)V

    .line 98
    goto :goto_0

    .line 99
    .line 100
    :cond_3
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 101
    .line 102
    const-string v1, "RMonitor_MemoryLeak"

    .line 103
    .line 104
    const-string v2, "has not valid dumper, start failed"

    .line 105
    .line 106
    .line 107
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 108
    move-result-object v1

    .line 109
    .line 110
    .line 111
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 112
    :goto_0
    monitor-exit p0

    .line 113
    return-void

    .line 114
    :goto_1
    :try_start_2
    monitor-exit p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 115
    throw v0
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

.method public stop()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/s7;->a()Lcom/tencent/bugly/proguard/e9;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    instance-of v0, v0, Lcom/tencent/bugly/common/heapdump/ForkJvmHeapDumper;

    .line 7
    .line 8
    if-eqz v0, :cond_2

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/cc;->b:Lcom/tencent/bugly/proguard/bc;

    .line 11
    .line 12
    if-eqz v0, :cond_0

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/bc;->g()V

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/cc;->c:Lcom/tencent/bugly/proguard/j0;

    .line 18
    .line 19
    if-eqz v0, :cond_1

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/j0;->c()V

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/cf;->a()Lcom/tencent/bugly/proguard/cf;

    .line 26
    move-result-object v0

    .line 27
    .line 28
    const-string v1, "activity_leak"

    .line 29
    .line 30
    .line 31
    invoke-static {v1}, Lcom/tencent/bugly/proguard/vd;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/ef;

    .line 32
    move-result-object v1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/cf;->a(Lcom/tencent/bugly/proguard/ef;)V

    .line 36
    :cond_2
    return-void
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
