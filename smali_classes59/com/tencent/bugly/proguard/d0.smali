.class public Lcom/tencent/bugly/proguard/d0;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/tencent/bugly/proguard/d0$a;
    }
.end annotation


# static fields
.field public static e:Lcom/tencent/bugly/proguard/d0; = null

.field public static final f:Ljava/lang/String; = "RMonitor_launch_report"


# instance fields
.field public final b:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/tencent/bugly/proguard/e0;",
            ">;"
        }
    .end annotation
.end field

.field public final c:Ljava/util/concurrent/CopyOnWriteArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/CopyOnWriteArrayList<",
            "Lcom/tencent/bugly/proguard/d0$a;",
            ">;"
        }
    .end annotation
.end field

.field public d:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/d0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 11
    .line 12
    new-instance v0, Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/d0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 18
    const/4 v0, 0x0

    .line 19
    .line 20
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/d0;->d:Z

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

.method public static b()Lcom/tencent/bugly/proguard/d0;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/d0;->e:Lcom/tencent/bugly/proguard/d0;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/d0;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/d0;->e:Lcom/tencent/bugly/proguard/d0;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tencent/bugly/proguard/d0;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/d0;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/d0;->e:Lcom/tencent/bugly/proguard/d0;

    goto :goto_0

    :catchall_0
    move-exception v1

    goto :goto_1

    .line 5
    :cond_0
    :goto_0
    monitor-exit v0

    goto :goto_2

    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v1

    .line 6
    :cond_1
    :goto_2
    sget-object v0, Lcom/tencent/bugly/proguard/d0;->e:Lcom/tencent/bugly/proguard/d0;

    return-object v0
.end method


# virtual methods
.method public a()V
    .locals 1

    .line 5
    sget-object v0, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->post(Ljava/lang/Runnable;)V

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/e0;)V
    .locals 4

    .line 6
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/e0;->a()V

    .line 7
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/e0;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/d0;->d:Z

    if-eqz v0, :cond_0

    .line 8
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v0, "RMonitor_launch_report"

    const-string v1, "launch report fail for pre launch and disabled."

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void

    .line 9
    :cond_0
    new-instance v0, Lcom/tencent/bugly/common/reporter/data/ReportData;

    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    iget-object v1, v1, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    .line 10
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/e0;->e()Lorg/json/JSONObject;

    move-result-object p1

    const-string v2, "launch_metric"

    const/4 v3, 0x1

    invoke-direct {v0, v1, v3, v2, p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    .line 11
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    move-result-object p1

    .line 12
    invoke-virtual {p1, v3, v0}, Lcom/tencent/bugly/proguard/x3;->a(ZLcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 13
    sget-object p1, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->reportNow(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)Z

    return-void
.end method

.method public a(Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    new-instance v1, Lcom/tencent/bugly/proguard/d0$a;

    invoke-direct {v1, p1, p2}, Lcom/tencent/bugly/proguard/d0$a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/d0;->a()V

    return-void
.end method

.method public a(Z)V
    .locals 2

    .line 1
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/d0;->d:Z

    .line 2
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "disableReportPreLaunch: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/d0;->d:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RMonitor_launch_report"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-void
.end method

.method public b(Lcom/tencent/bugly/proguard/e0;)V
    .locals 1

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/CopyOnWriteArrayList;->add(Ljava/lang/Object;)Z

    .line 8
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/d0;->a()V

    return-void
.end method

.method public run()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, "RMonitor_launch_report"

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 11
    .line 12
    const-string v2, "launch report fail for "

    .line 13
    .line 14
    .line 15
    invoke-static {}, Lcom/tencent/bugly/proguard/gf;->d()Ljava/lang/String;

    .line 16
    move-result-object v3

    .line 17
    .line 18
    .line 19
    filled-new-array {v1, v2, v3}, [Ljava/lang/String;

    .line 20
    move-result-object v1

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    .line 27
    .line 28
    const-string v2, "launch_metric"

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->canCollect(Ljava/lang/String;)Z

    .line 32
    move-result v3

    .line 33
    .line 34
    if-nez v3, :cond_1

    .line 35
    .line 36
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 37
    .line 38
    const-string v2, "launch report fail for reach limit."

    .line 39
    .line 40
    .line 41
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 46
    return-void

    .line 47
    .line 48
    .line 49
    :cond_1
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->whetherPluginSampling(Ljava/lang/String;)Z

    .line 50
    move-result v0

    .line 51
    .line 52
    if-nez v0, :cond_2

    .line 53
    .line 54
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 55
    .line 56
    const-string v2, "launch report fail for disabled. "

    .line 57
    .line 58
    .line 59
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 64
    return-void

    .line 65
    .line 66
    :cond_2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 74
    move-result v1

    .line 75
    .line 76
    if-eqz v1, :cond_3

    .line 77
    .line 78
    .line 79
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 80
    move-result-object v1

    .line 81
    .line 82
    check-cast v1, Lcom/tencent/bugly/proguard/e0;

    .line 83
    .line 84
    .line 85
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/d0;->a(Lcom/tencent/bugly/proguard/e0;)V

    .line 86
    goto :goto_0

    .line 87
    .line 88
    :cond_3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d0;->b:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 92
    .line 93
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 97
    move-result-object v0

    .line 98
    .line 99
    .line 100
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 101
    move-result v1

    .line 102
    .line 103
    if-eqz v1, :cond_4

    .line 104
    .line 105
    .line 106
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 107
    move-result-object v1

    .line 108
    .line 109
    check-cast v1, Lcom/tencent/bugly/proguard/d0$a;

    .line 110
    .line 111
    iget-object v3, v1, Lcom/tencent/bugly/proguard/d0$a;->a:Ljava/lang/String;

    .line 112
    .line 113
    sget-object v4, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 114
    .line 115
    .line 116
    invoke-static {v4}, Lcom/tencent/bugly/proguard/nf;->a(Lcom/tencent/bugly/common/meta/UserMeta;)Ljava/lang/String;

    .line 117
    move-result-object v4

    .line 118
    .line 119
    iget-object v1, v1, Lcom/tencent/bugly/proguard/d0$a;->b:Ljava/lang/String;

    .line 120
    .line 121
    const-string v5, "launch"

    .line 122
    .line 123
    .line 124
    invoke-static {v5, v2, v3, v4, v1}, Lcom/tencent/rmonitor/sla/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 125
    goto :goto_1

    .line 126
    .line 127
    :cond_4
    iget-object v0, p0, Lcom/tencent/bugly/proguard/d0;->c:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 128
    .line 129
    .line 130
    invoke-virtual {v0}, Ljava/util/concurrent/CopyOnWriteArrayList;->clear()V

    .line 131
    return-void
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
