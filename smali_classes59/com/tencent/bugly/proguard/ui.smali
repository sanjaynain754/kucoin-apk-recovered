.class public Lcom/tencent/bugly/proguard/ui;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/p9;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/ui$a;,
        Lcom/tencent/bugly/proguard/ui$b;
    }
.end annotation


# static fields
.field public static final k:Ljava/lang/String; = "RMonitor_looper_WorkThread"


# instance fields
.field public volatile i:Z

.field public final j:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/ui$b;",
            ">;"
        }
    .end annotation
.end field


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
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ui;->i:Z

    .line 7
    .line 8
    new-instance v0, Ljava/util/ArrayList;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/proguard/ui;->j:Ljava/util/ArrayList;

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->pluginStateListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->addListener(Lcom/tencent/rmonitor/base/plugin/listener/IBaseListener;)V

    .line 19
    .line 20
    .line 21
    invoke-static {}, Lcom/tencent/bugly/proguard/ti;->a()Lcom/tencent/bugly/proguard/ti;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    if-eqz v0, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/ti;->isRunning()Z

    .line 28
    move-result v0

    .line 29
    .line 30
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/ui;->i:Z

    .line 31
    .line 32
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    const-string v2, "init isMonitorRunning: "

    .line 37
    .line 38
    .line 39
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 40
    .line 41
    iget-boolean v2, p0, Lcom/tencent/bugly/proguard/ui;->i:Z

    .line 42
    .line 43
    .line 44
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 48
    move-result-object v1

    .line 49
    .line 50
    const-string v2, "RMonitor_looper_WorkThread"

    .line 51
    .line 52
    .line 53
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 54
    move-result-object v1

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 58
    return-void
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

.method public static b()Lcom/tencent/bugly/proguard/ui;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/ui$a;->a:Lcom/tencent/bugly/proguard/ui;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/si$a;)Lcom/tencent/bugly/proguard/qa;
    .locals 3

    .line 24
    new-instance v0, Lcom/tencent/bugly/proguard/qa;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/qa;-><init>()V

    .line 25
    iget v1, p1, Lcom/tencent/bugly/proguard/si$a;->c:F

    iput v1, v0, Lcom/tencent/bugly/proguard/qa;->a:F

    .line 26
    iget-wide v1, p1, Lcom/tencent/bugly/proguard/si$a;->d:J

    iput-wide v1, v0, Lcom/tencent/bugly/proguard/qa;->b:J

    .line 27
    iget-wide v1, p1, Lcom/tencent/bugly/proguard/si$a;->e:J

    iput-wide v1, v0, Lcom/tencent/bugly/proguard/qa;->d:J

    .line 28
    iget-wide v1, p1, Lcom/tencent/bugly/proguard/si$a;->f:J

    iput-wide v1, v0, Lcom/tencent/bugly/proguard/qa;->c:J

    return-object v0
.end method

.method public final a(Landroid/os/Looper;)Lcom/tencent/bugly/proguard/ui$b;
    .locals 3

    .line 22
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ui;->j:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/ui$b;

    .line 23
    iget-object v2, v1, Lcom/tencent/bugly/proguard/ui$b;->a:Landroid/os/Looper;

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Landroid/os/Looper;Ljava/lang/String;)Lcom/tencent/bugly/proguard/ui$b;
    .locals 1

    .line 17
    monitor-enter p0

    .line 18
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/ui;->a(Landroid/os/Looper;)Lcom/tencent/bugly/proguard/ui$b;

    move-result-object v0

    if-nez v0, :cond_0

    .line 19
    new-instance v0, Lcom/tencent/bugly/proguard/ui$b;

    invoke-direct {v0, p1, p2}, Lcom/tencent/bugly/proguard/ui$b;-><init>(Landroid/os/Looper;Ljava/lang/String;)V

    .line 20
    iget-object p1, p0, Lcom/tencent/bugly/proguard/ui;->j:Ljava/util/ArrayList;

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 21
    :cond_0
    :goto_0
    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public a(Lcom/tencent/bugly/proguard/ui$b;)V
    .locals 5

    if-eqz p1, :cond_3

    .line 9
    iget-object v0, p1, Lcom/tencent/bugly/proguard/ui$b;->c:Lcom/tencent/bugly/proguard/aa;

    if-eqz v0, :cond_0

    goto :goto_0

    .line 10
    :cond_0
    iget-object v0, p1, Lcom/tencent/bugly/proguard/ui$b;->b:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/ui;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/si$a;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_0

    .line 11
    :cond_1
    invoke-static {}, Ljava/lang/Math;->random()D

    move-result-wide v1

    iget v3, v0, Lcom/tencent/bugly/proguard/si$a;->b:F

    float-to-double v3, v3

    cmpg-double v1, v1, v3

    const-string/jumbo v2, "start monitor looper["

    const-string v3, "RMonitor_looper_WorkThread"

    if-gez v1, :cond_2

    .line 12
    new-instance v1, Lcom/tencent/bugly/proguard/aa;

    iget-object v4, p1, Lcom/tencent/bugly/proguard/ui$b;->a:Landroid/os/Looper;

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/ui;->a(Lcom/tencent/bugly/proguard/si$a;)Lcom/tencent/bugly/proguard/qa;

    move-result-object v0

    invoke-direct {v1, v4, v0}, Lcom/tencent/bugly/proguard/aa;-><init>(Landroid/os/Looper;Lcom/tencent/bugly/proguard/qa;)V

    .line 13
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/aa;->c()V

    .line 14
    iput-object v1, p1, Lcom/tencent/bugly/proguard/ui$b;->c:Lcom/tencent/bugly/proguard/aa;

    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lcom/tencent/bugly/proguard/ui$b;->a:Landroid/os/Looper;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v3, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 16
    :cond_2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object p1, p1, Lcom/tencent/bugly/proguard/ui$b;->a:Landroid/os/Looper;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "] fail for not hit sampling."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v3, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    :cond_3
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 1
    const-string/jumbo p3, "work_thread_lag"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    const/4 p1, 0x0

    .line 2
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/ui;->a(Z)V

    :cond_0
    return-void
.end method

.method public a(Z)V
    .locals 3

    .line 3
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/ui;->i:Z

    if-ne v0, p1, :cond_0

    return-void

    .line 4
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "changeRunningState, from ["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v2, p0, Lcom/tencent/bugly/proguard/ui;->i:Z

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, "] to ["

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v2, "]"

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RMonitor_looper_WorkThread"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 5
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/ui;->i:Z

    .line 6
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/ui;->i:Z

    if-eqz p1, :cond_1

    .line 7
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ui;->d()V

    return-void

    .line 8
    :cond_1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/ui;->e()V

    return-void
.end method

.method public b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/si$a;
    .locals 3

    .line 20
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    move-result-object v0

    .line 21
    const-string/jumbo v1, "work_thread_lag"

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->c(Ljava/lang/String;)Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    move-result-object v0

    iget-object v0, v0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->config:Lcom/tencent/bugly/proguard/hf;

    .line 22
    instance-of v1, v0, Lcom/tencent/bugly/proguard/si;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    .line 23
    check-cast v0, Lcom/tencent/bugly/proguard/si;

    goto :goto_0

    :cond_0
    move-object v0, v2

    :goto_0
    if-nez v0, :cond_1

    return-object v2

    .line 24
    :cond_1
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/si;->a(Ljava/lang/String;)Lcom/tencent/bugly/proguard/si$a;

    move-result-object p1

    return-object p1
.end method

.method public final b(Landroid/os/Looper;)Lcom/tencent/bugly/proguard/ui$b;
    .locals 2

    .line 16
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ui;->j:Ljava/util/ArrayList;

    monitor-enter v0

    .line 17
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/ui;->a(Landroid/os/Looper;)Lcom/tencent/bugly/proguard/ui$b;

    move-result-object p1

    if-eqz p1, :cond_0

    .line 18
    iget-object v1, p0, Lcom/tencent/bugly/proguard/ui;->j:Ljava/util/ArrayList;

    invoke-virtual {v1, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 19
    :cond_0
    :goto_0
    monitor-exit v0

    return-object p1

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public b(Landroid/os/Looper;Ljava/lang/String;)V
    .locals 3

    const-string v0, "RMonitor_looper_WorkThread"

    if-nez p1, :cond_0

    .line 2
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo p2, "monitor fail for looper is null"

    filled-new-array {v0, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void

    .line 3
    :cond_0
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/ui;->b(Ljava/lang/String;)Lcom/tencent/bugly/proguard/si$a;

    move-result-object v1

    if-nez v1, :cond_1

    .line 4
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 5
    const-string/jumbo v1, "monitor fail for "

    const-string v2, " invalid."

    invoke-static {v1, p2, v2}, Lcom/tencent/bugly/proguard/lf;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    .line 6
    filled-new-array {v0, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void

    .line 7
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/ui;->a(Landroid/os/Looper;Ljava/lang/String;)Lcom/tencent/bugly/proguard/ui$b;

    move-result-object p2

    .line 8
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/ui;->i:Z

    if-eqz v1, :cond_2

    .line 9
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/ui;->a(Lcom/tencent/bugly/proguard/ui$b;)V

    return-void

    .line 10
    :cond_2
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "startMonitor looper["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "] wait monitor to run."

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/tencent/bugly/proguard/ui$b;)V
    .locals 3

    if-nez p1, :cond_0

    const/4 v0, 0x0

    goto :goto_0

    .line 13
    :cond_0
    iget-object v0, p1, Lcom/tencent/bugly/proguard/ui$b;->c:Lcom/tencent/bugly/proguard/aa;

    :goto_0
    if-eqz v0, :cond_2

    .line 14
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/aa;->d()V

    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "stop monitor looper["

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    if-nez p1, :cond_1

    const-string p1, ""

    goto :goto_1

    :cond_1
    iget-object p1, p1, Lcom/tencent/bugly/proguard/ui$b;->a:Landroid/os/Looper;

    :goto_1
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string p1, "]"

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v1, "RMonitor_looper_WorkThread"

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    :cond_2
    return-void
.end method

.method public b(Ljava/lang/String;ILjava/lang/String;)V
    .locals 0

    .line 11
    const-string/jumbo p3, "work_thread_lag"

    invoke-virtual {p3, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    if-nez p2, :cond_0

    const/4 p1, 0x1

    .line 12
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/ui;->a(Z)V

    :cond_0
    return-void
.end method

.method public c(Landroid/os/Looper;)V
    .locals 0

    .line 1
    .line 2
    if-nez p1, :cond_0

    .line 3
    goto :goto_0

    .line 4
    .line 5
    .line 6
    :cond_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/ui;->b(Landroid/os/Looper;)Lcom/tencent/bugly/proguard/ui$b;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    if-eqz p1, :cond_1

    .line 10
    .line 11
    .line 12
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/ui;->b(Lcom/tencent/bugly/proguard/ui$b;)V

    .line 13
    :cond_1
    :goto_0
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
.end method

.method public d()V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ui;->j:Ljava/util/ArrayList;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ui;->j:Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 11
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    .line 18
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 19
    move-result v1

    .line 20
    .line 21
    if-eqz v1, :cond_0

    .line 22
    .line 23
    .line 24
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    check-cast v1, Lcom/tencent/bugly/proguard/ui$b;

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/ui;->a(Lcom/tencent/bugly/proguard/ui$b;)V

    .line 31
    goto :goto_0

    .line 32
    :cond_0
    return-void

    .line 33
    :catchall_0
    move-exception v1

    .line 34
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 35
    throw v1
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
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/ui;->j:Ljava/util/ArrayList;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Ljava/util/ArrayList;

    .line 6
    .line 7
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ui;->j:Ljava/util/ArrayList;

    .line 8
    .line 9
    .line 10
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    .line 11
    .line 12
    iget-object v2, p0, Lcom/tencent/bugly/proguard/ui;->j:Ljava/util/ArrayList;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Ljava/util/ArrayList;->clear()V

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    .line 18
    .line 19
    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    .line 23
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 24
    move-result v1

    .line 25
    .line 26
    if-eqz v1, :cond_0

    .line 27
    .line 28
    .line 29
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    check-cast v1, Lcom/tencent/bugly/proguard/ui$b;

    .line 33
    .line 34
    .line 35
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/ui;->b(Lcom/tencent/bugly/proguard/ui$b;)V

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    return-void

    .line 38
    :catchall_0
    move-exception v1

    .line 39
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 40
    throw v1
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
