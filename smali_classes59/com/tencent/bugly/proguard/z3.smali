.class public Lcom/tencent/bugly/proguard/z3;
.super Lcom/tencent/bugly/proguard/df;
.source "BUGLY"


# static fields
.field public static final h:Ljava/lang/String; = "RMonitor_CustomEvent"


# instance fields
.field public b:Z

.field public c:Lcom/tencent/bugly/proguard/kg;

.field public d:Lcom/tencent/bugly/common/reporter/data/ReportData;

.field public e:Lorg/json/JSONArray;

.field public f:Lcom/tencent/bugly/proguard/y3;

.field public g:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/df;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/z3;->b:Z

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    iput-object v0, p0, Lcom/tencent/bugly/proguard/z3;->c:Lcom/tencent/bugly/proguard/kg;

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/bugly/proguard/z3;->d:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 12
    .line 13
    iput-object v0, p0, Lcom/tencent/bugly/proguard/z3;->e:Lorg/json/JSONArray;

    .line 14
    .line 15
    iput-object v0, p0, Lcom/tencent/bugly/proguard/z3;->f:Lcom/tencent/bugly/proguard/y3;

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/z3;->g:Ljava/lang/Runnable;

    .line 18
    return-void
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/z3;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    .line 2
    iput-object p1, p0, Lcom/tencent/bugly/proguard/z3;->g:Ljava/lang/Runnable;

    return-object p1
.end method

.method public static synthetic a(Lcom/tencent/bugly/proguard/z3;)Lorg/json/JSONArray;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/z3;->e:Lorg/json/JSONArray;

    return-object p0
.end method

.method public static synthetic b(Lcom/tencent/bugly/proguard/z3;)Lcom/tencent/bugly/common/reporter/data/ReportData;
    .locals 0

    .line 1
    iget-object p0, p0, Lcom/tencent/bugly/proguard/z3;->d:Lcom/tencent/bugly/common/reporter/data/ReportData;

    return-object p0
.end method


# virtual methods
.method public a()V
    .locals 4

    .line 19
    iget-object v0, p0, Lcom/tencent/bugly/proguard/z3;->g:Ljava/lang/Runnable;

    if-eqz v0, :cond_0

    return-void

    .line 20
    :cond_0
    new-instance v0, Lcom/tencent/bugly/proguard/z3$b;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/z3$b;-><init>(Lcom/tencent/bugly/proguard/z3;)V

    .line 21
    iput-object v0, p0, Lcom/tencent/bugly/proguard/z3;->g:Ljava/lang/Runnable;

    .line 22
    sget-object v1, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z3;->c()J

    move-result-wide v2

    invoke-virtual {v1, v0, v2, v3}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->postDelayed(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 8

    const-string v0, "RMonitor_CustomEvent"

    const-string v1, "custom_event"

    if-nez p1, :cond_0

    goto/16 :goto_2

    .line 3
    :cond_0
    iget-object v2, p0, Lcom/tencent/bugly/proguard/z3;->d:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 4
    iget-object v3, p0, Lcom/tencent/bugly/proguard/z3;->e:Lorg/json/JSONArray;

    if-eqz v2, :cond_1

    if-nez v3, :cond_3

    .line 5
    :cond_1
    :try_start_0
    sget-object v4, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    const-string/jumbo v5, "metric"

    sget-object v6, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-static {v4, v5, v1, v6}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_2

    .line 6
    sget-object v5, Lcom/tencent/bugly/proguard/nf;->S:[Ljava/lang/String;

    invoke-static {v5}, Lcom/tencent/bugly/proguard/nf;->a([Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 7
    new-instance v7, Lorg/json/JSONArray;

    invoke-direct {v7}, Lorg/json/JSONArray;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 8
    :try_start_1
    const-string v3, "event_infos"

    invoke-virtual {v5, v3, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 9
    const-string v3, "Attributes"

    invoke-virtual {v4, v3, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 10
    new-instance v3, Lcom/tencent/bugly/common/reporter/data/ReportData;

    iget-object v5, v6, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    const/4 v6, 0x1

    invoke-direct {v3, v5, v6, v1, v4}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v2, v3

    move-object v3, v7

    goto :goto_1

    :catchall_0
    move-exception v1

    move-object v3, v7

    goto :goto_0

    :catchall_1
    move-exception v1

    goto :goto_0

    .line 11
    :cond_2
    :try_start_2
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v4, "add event fail for params is null."

    filled-new-array {v0, v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1, v4}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_1

    .line 12
    :goto_0
    sget-object v4, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "add event fail for "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 13
    :goto_1
    iput-object v3, p0, Lcom/tencent/bugly/proguard/z3;->e:Lorg/json/JSONArray;

    .line 14
    iput-object v2, p0, Lcom/tencent/bugly/proguard/z3;->d:Lcom/tencent/bugly/common/reporter/data/ReportData;

    :cond_3
    if-eqz v3, :cond_5

    .line 15
    :try_start_3
    invoke-virtual {v3, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 16
    :catchall_2
    invoke-virtual {v3}, Lorg/json/JSONArray;->length()I

    move-result p1

    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z3;->b()I

    move-result v0

    if-lt p1, v0, :cond_4

    .line 17
    const-string p1, "meet_batch_count"

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/z3;->b(Ljava/lang/String;)V

    goto :goto_2

    .line 18
    :cond_4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/z3;->a()V

    :cond_5
    :goto_2
    return-void
.end method

.method public b()I
    .locals 1

    .line 9
    iget-object v0, p0, Lcom/tencent/bugly/proguard/z3;->f:Lcom/tencent/bugly/proguard/y3;

    if-nez v0, :cond_0

    const/16 v0, 0x14

    return v0

    .line 10
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/y3;->c()I

    move-result v0

    return v0
.end method

.method public b(Ljava/lang/String;)V
    .locals 7

    const-string/jumbo v0, "reportEvent, reason: "

    .line 2
    iget-object v1, p0, Lcom/tencent/bugly/proguard/z3;->e:Lorg/json/JSONArray;

    .line 3
    iget-object v2, p0, Lcom/tencent/bugly/proguard/z3;->d:Lcom/tencent/bugly/common/reporter/data/ReportData;

    const/4 v3, 0x0

    .line 4
    iput-object v3, p0, Lcom/tencent/bugly/proguard/z3;->d:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 5
    iput-object v3, p0, Lcom/tencent/bugly/proguard/z3;->e:Lorg/json/JSONArray;

    if-eqz v2, :cond_0

    if-eqz v1, :cond_0

    .line 6
    :try_start_0
    sget-object v4, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v5, "RMonitor_CustomEvent"

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", event_count: "

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v5, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v4, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 7
    invoke-virtual {v2}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getReportStrategy()Lcom/tencent/bugly/common/reporter/data/ReportStrategy;

    move-result-object p1

    sget-object v0, Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;->UPLOAD_ANY:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;

    invoke-virtual {p1, v0}, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->setUploadStrategy(Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;)V

    .line 8
    sget-object p1, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    invoke-virtual {p1, v2, v3}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->reportNow(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_0
    return-void
.end method

.method public c()J
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/z3;->f:Lcom/tencent/bugly/proguard/y3;

    if-nez v0, :cond_0

    const-wide/32 v0, 0x493e0

    return-wide v0

    .line 4
    :cond_0
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/y3;->d()J

    move-result-wide v0

    return-wide v0
.end method

.method public c(Ljava/lang/String;)Z
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/z3;->f:Lcom/tencent/bugly/proguard/y3;

    if-eqz v0, :cond_0

    .line 2
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/y3;->a(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public d()Lcom/tencent/bugly/proguard/y3;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/z3;->f:Lcom/tencent/bugly/proguard/y3;

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

.method public getPluginName()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "custom_event"

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

.method public isRunning()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/z3;->b:Z

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
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/z3;->b:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 8
    .line 9
    const-string v1, "RMonitor_CustomEvent"

    .line 10
    .line 11
    .line 12
    const-string/jumbo v2, "start CustomEventMonitor"

    .line 13
    .line 14
    .line 15
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 20
    const/4 v0, 0x1

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/z3;->b:Z

    .line 23
    .line 24
    iget-object v1, p0, Lcom/tencent/bugly/proguard/z3;->c:Lcom/tencent/bugly/proguard/kg;

    .line 25
    .line 26
    if-nez v1, :cond_1

    .line 27
    .line 28
    new-instance v1, Lcom/tencent/bugly/proguard/z3$a;

    .line 29
    .line 30
    .line 31
    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/z3$a;-><init>(Lcom/tencent/bugly/proguard/z3;)V

    .line 32
    .line 33
    iput-object v1, p0, Lcom/tencent/bugly/proguard/z3;->c:Lcom/tencent/bugly/proguard/kg;

    .line 34
    .line 35
    :cond_1
    iget-object v1, p0, Lcom/tencent/bugly/proguard/z3;->c:Lcom/tencent/bugly/proguard/kg;

    .line 36
    .line 37
    .line 38
    invoke-static {v1}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->register(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 39
    .line 40
    sget-object v1, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    .line 41
    .line 42
    .line 43
    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 44
    move-result-object v1

    .line 45
    .line 46
    const-string v2, "custom_event"

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/base/config/a;->e(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    .line 50
    move-result-object v1

    .line 51
    .line 52
    instance-of v2, v1, Lcom/tencent/bugly/proguard/y3;

    .line 53
    .line 54
    if-eqz v2, :cond_2

    .line 55
    .line 56
    check-cast v1, Lcom/tencent/bugly/proguard/y3;

    .line 57
    .line 58
    iput-object v1, p0, Lcom/tencent/bugly/proguard/z3;->f:Lcom/tencent/bugly/proguard/y3;

    .line 59
    .line 60
    .line 61
    :cond_2
    invoke-static {}, Lcom/tencent/bugly/proguard/a4;->c()Lcom/tencent/bugly/proguard/a4;

    .line 62
    move-result-object v1

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, p0, v0}, Lcom/tencent/bugly/proguard/a4;->a(Lcom/tencent/bugly/proguard/z3;Z)V

    .line 66
    return-void
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

.method public stop()V
    .locals 3

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/z3;->b:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 8
    .line 9
    const-string v1, "RMonitor_CustomEvent"

    .line 10
    .line 11
    .line 12
    const-string/jumbo v2, "stop CustomEventMonitor"

    .line 13
    .line 14
    .line 15
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 16
    move-result-object v1

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/z3;->b:Z

    .line 23
    .line 24
    iget-object v1, p0, Lcom/tencent/bugly/proguard/z3;->c:Lcom/tencent/bugly/proguard/kg;

    .line 25
    .line 26
    if-eqz v1, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-static {v1}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->unRegister(Lcom/tencent/rmonitor/common/lifecycle/IActivityStateCallback;)V

    .line 30
    .line 31
    .line 32
    :cond_1
    invoke-static {}, Lcom/tencent/bugly/proguard/a4;->c()Lcom/tencent/bugly/proguard/a4;

    .line 33
    move-result-object v1

    .line 34
    .line 35
    .line 36
    invoke-virtual {v1, p0, v0}, Lcom/tencent/bugly/proguard/a4;->a(Lcom/tencent/bugly/proguard/z3;Z)V

    .line 37
    return-void
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
