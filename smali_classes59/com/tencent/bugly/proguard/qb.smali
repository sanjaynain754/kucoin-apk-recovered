.class public Lcom/tencent/bugly/proguard/qb;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static b:Lcom/tencent/bugly/proguard/qb; = null

.field public static final c:Ljava/lang/String; = "RMonitor_MemoryQuantile"

.field public static final d:I = 0x1

.field public static final e:I = 0x2

.field public static final f:I = 0x4

.field public static final g:I = 0x8

.field public static final h:I = 0x30d40


# instance fields
.field public a:Z


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/qb;->a:Z

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

.method public static a()Lcom/tencent/bugly/proguard/qb;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/qb;->b:Lcom/tencent/bugly/proguard/qb;

    if-nez v0, :cond_1

    .line 2
    const-class v0, Lcom/tencent/bugly/proguard/qb;

    monitor-enter v0

    .line 3
    :try_start_0
    sget-object v1, Lcom/tencent/bugly/proguard/qb;->b:Lcom/tencent/bugly/proguard/qb;

    if-nez v1, :cond_0

    .line 4
    new-instance v1, Lcom/tencent/bugly/proguard/qb;

    invoke-direct {v1}, Lcom/tencent/bugly/proguard/qb;-><init>()V

    sput-object v1, Lcom/tencent/bugly/proguard/qb;->b:Lcom/tencent/bugly/proguard/qb;

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
    sget-object v0, Lcom/tencent/bugly/proguard/qb;->b:Lcom/tencent/bugly/proguard/qb;

    return-object v0
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/hc;)Lorg/json/JSONObject;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 19
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/hc;->i()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 20
    sget-object v0, Lcom/tencent/bugly/proguard/nf;->T:[Ljava/lang/String;

    invoke-static {v0}, Lcom/tencent/bugly/proguard/nf;->a([Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    .line 21
    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    invoke-static {v1}, Lcom/tencent/rmonitor/common/util/AppInfo;->obtainProcessName(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v1

    const-string/jumbo v2, "process_name"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->is64Bit:Ljava/lang/Boolean;

    const-string v2, "is64bit"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 23
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/hc;->a(Lorg/json/JSONObject;)V

    .line 24
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "makeAttribute, "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RMonitor_MemoryQuantile"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return-object v0

    :cond_0
    const/4 p1, 0x0

    return-object p1
.end method

.method public final a(Lcom/tencent/bugly/proguard/fc;)V
    .locals 9

    .line 7
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/fc;->c()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v4, v0, v2

    if-gtz v4, :cond_0

    const/4 v4, 0x1

    goto :goto_0

    :cond_0
    const/4 v4, 0x0

    .line 8
    :goto_0
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/fc;->e()J

    move-result-wide v5

    cmp-long v7, v5, v2

    if-gtz v7, :cond_1

    .line 9
    sget-object v8, Lcom/tencent/rmonitor/base/meta/BaseInfo;->is64Bit:Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_1

    or-int/lit8 v4, v4, 0x4

    :cond_1
    if-gtz v7, :cond_2

    .line 10
    sget-object v7, Lcom/tencent/rmonitor/base/meta/BaseInfo;->is64Bit:Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    if-nez v7, :cond_2

    or-int/lit8 v4, v4, 0x2

    .line 11
    :cond_2
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/fc;->a()J

    move-result-wide v7

    cmp-long p1, v7, v2

    if-gtz p1, :cond_3

    or-int/lit8 v4, v4, 0x8

    :cond_3
    const p1, 0x30d40

    or-int/2addr p1, v4

    .line 12
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object p1

    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 13
    invoke-static {v2}, Lcom/tencent/bugly/proguard/nf;->a(Lcom/tencent/bugly/common/meta/UserMeta;)Ljava/lang/String;

    move-result-object v2

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ","

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    .line 14
    const-string v1, "memory"

    const-string v3, "memory_quantile"

    invoke-static {v1, v3, p1, v2, v0}, Lcom/tencent/rmonitor/sla/c;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method public a(Lorg/json/JSONObject;Lcom/tencent/bugly/proguard/hc;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 15
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/hc;->f()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_0

    .line 16
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/hc;->f()Ljava/lang/String;

    move-result-object v0

    const-string/jumbo v1, "process_launch_id"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 17
    :cond_0
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/hc;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 18
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/hc;->c()Ljava/lang/String;

    move-result-object p2

    const-string v0, "launch_id"

    invoke-virtual {p1, v0, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_1
    return-void
.end method

.method public b()V
    .locals 7

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qb;->a:Z

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/qb;->a:Z

    .line 8
    .line 9
    .line 10
    invoke-static {}, Lcom/tencent/bugly/proguard/ac;->l()Lcom/tencent/bugly/proguard/ac;

    .line 11
    move-result-object v1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/ac;->m()Z

    .line 15
    move-result v1

    .line 16
    .line 17
    if-eqz v1, :cond_1

    .line 18
    .line 19
    .line 20
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/ac;->l()Lcom/tencent/bugly/proguard/ac;

    .line 21
    move-result-object v1

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/ac;->n()Lcom/tencent/bugly/proguard/hc;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/qb;->a(Lcom/tencent/bugly/proguard/hc;)Lorg/json/JSONObject;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    if-eqz v2, :cond_0

    .line 32
    .line 33
    sget-object v3, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    .line 34
    .line 35
    .line 36
    const-string/jumbo v4, "metric"

    .line 37
    .line 38
    const-string v5, "memory_quantile"

    .line 39
    .line 40
    sget-object v6, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 41
    .line 42
    .line 43
    invoke-static {v3, v4, v5, v6}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    .line 47
    invoke-virtual {p0, v3, v1}, Lcom/tencent/bugly/proguard/qb;->a(Lorg/json/JSONObject;Lcom/tencent/bugly/proguard/hc;)V

    .line 48
    .line 49
    const-string v1, "Attributes"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 53
    .line 54
    new-instance v1, Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 55
    .line 56
    iget-object v2, v6, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    .line 57
    .line 58
    const-string v4, "QUANTILE_EVENT"

    .line 59
    .line 60
    .line 61
    invoke-direct {v1, v2, v0, v4, v3}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getReportStrategy()Lcom/tencent/bugly/common/reporter/data/ReportStrategy;

    .line 65
    move-result-object v0

    .line 66
    .line 67
    sget-object v2, Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;->UPLOAD_ANY:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v2}, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->setUploadStrategy(Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;)V

    .line 71
    .line 72
    sget-object v0, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    .line 73
    .line 74
    new-instance v2, Lcom/tencent/bugly/proguard/qb$a;

    .line 75
    .line 76
    .line 77
    invoke-direct {v2, p0}, Lcom/tencent/bugly/proguard/qb$a;-><init>(Lcom/tencent/bugly/proguard/qb;)V

    .line 78
    .line 79
    .line 80
    invoke-virtual {v0, v1, v2}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->reportNow(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)Z

    .line 81
    goto :goto_1

    .line 82
    :catchall_0
    move-exception v0

    .line 83
    goto :goto_0

    .line 84
    .line 85
    .line 86
    :cond_0
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/hc;->e()Lcom/tencent/bugly/proguard/fc;

    .line 87
    move-result-object v0

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/qb;->a(Lcom/tencent/bugly/proguard/fc;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 91
    goto :goto_1

    .line 92
    .line 93
    :goto_0
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 94
    .line 95
    const-string v2, "RMonitor_MemoryQuantile"

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Ljava/lang/Throwable;->toString()Ljava/lang/String;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    const-string v1, "json_parser_error"

    .line 105
    .line 106
    .line 107
    invoke-static {v1, v0}, Lcom/tencent/bugly/proguard/zb;->a(Ljava/lang/String;Ljava/lang/String;)V

    .line 108
    .line 109
    .line 110
    :goto_1
    invoke-static {}, Lcom/tencent/bugly/proguard/ac;->l()Lcom/tencent/bugly/proguard/ac;

    .line 111
    move-result-object v0

    .line 112
    const/4 v1, 0x0

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/ac;->b(Z)V

    .line 116
    :cond_1
    return-void
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
