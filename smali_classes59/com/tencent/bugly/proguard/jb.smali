.class public Lcom/tencent/bugly/proguard/jb;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/j9;


# static fields
.field public static final l:Ljava/lang/String; = "RMonitor_looper_metric"

.field public static final m:I = 0x64


# instance fields
.field public final e:Lcom/tencent/bugly/proguard/ca;

.field public final f:Lcom/tencent/rmonitor/metrics/looper/LooperMetricReportDataBuilder;

.field public final g:Lcom/tencent/bugly/proguard/pf;

.field public h:Z

.field public i:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

.field public j:Lorg/json/JSONArray;

.field public k:Lcom/tencent/bugly/common/reporter/data/ReportData;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/ca;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/ca;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/proguard/jb;->e:Lcom/tencent/bugly/proguard/ca;

    .line 11
    .line 12
    new-instance v0, Lcom/tencent/rmonitor/metrics/looper/LooperMetricReportDataBuilder;

    .line 13
    .line 14
    .line 15
    invoke-direct {v0}, Lcom/tencent/rmonitor/metrics/looper/LooperMetricReportDataBuilder;-><init>()V

    .line 16
    .line 17
    iput-object v0, p0, Lcom/tencent/bugly/proguard/jb;->f:Lcom/tencent/rmonitor/metrics/looper/LooperMetricReportDataBuilder;

    .line 18
    .line 19
    new-instance v0, Lcom/tencent/bugly/proguard/pf;

    .line 20
    .line 21
    .line 22
    invoke-direct {v0}, Lcom/tencent/bugly/proguard/pf;-><init>()V

    .line 23
    .line 24
    iput-object v0, p0, Lcom/tencent/bugly/proguard/jb;->g:Lcom/tencent/bugly/proguard/pf;

    .line 25
    const/4 v0, 0x1

    .line 26
    .line 27
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/jb;->h:Z

    .line 28
    const/4 v0, 0x0

    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/bugly/proguard/jb;->i:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    .line 31
    .line 32
    iput-object v0, p0, Lcom/tencent/bugly/proguard/jb;->j:Lorg/json/JSONArray;

    .line 33
    .line 34
    iput-object v0, p0, Lcom/tencent/bugly/proguard/jb;->k:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 35
    return-void
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/jb;Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;Ljava/lang/String;)V
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/jb;->c(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final a()V
    .locals 1

    const/4 v0, 0x0

    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/jb;->i:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    .line 7
    iput-object v0, p0, Lcom/tencent/bugly/proguard/jb;->j:Lorg/json/JSONArray;

    .line 8
    iput-object v0, p0, Lcom/tencent/bugly/proguard/jb;->k:Lcom/tencent/bugly/common/reporter/data/ReportData;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/hb;)V
    .locals 2

    if-eqz p1, :cond_0

    .line 3
    iget-boolean p1, p1, Lcom/tencent/bugly/proguard/hb;->r:Z

    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/jb;->h:Z

    .line 4
    :cond_0
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "start, reportBackground: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/jb;->h:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RMonitor_looper_metric"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 5
    new-instance p1, Lcom/tencent/bugly/proguard/jb$b;

    invoke-direct {p1, p0}, Lcom/tencent/bugly/proguard/jb$b;-><init>(Lcom/tencent/bugly/proguard/jb;)V

    const-wide/16 v0, 0x0

    invoke-static {p1, v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMonitorThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public a(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;Ljava/lang/String;)V
    .locals 1

    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/jb$a;

    invoke-direct {v0, p0, p1, p2}, Lcom/tencent/bugly/proguard/jb$a;-><init>(Lcom/tencent/bugly/proguard/jb;Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;Ljava/lang/String;)V

    const-wide/16 p1, 0x0

    invoke-static {v0, p1, p2}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMonitorThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public b()V
    .locals 3

    .line 1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_looper_metric"

    const-string/jumbo v2, "stop"

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return-void
.end method

.method public declared-synchronized b(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;Ljava/lang/String;)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    monitor-enter p0

    .line 2
    :try_start_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/jb;->j:Lorg/json/JSONArray;

    if-nez v0, :cond_0

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/proguard/jb;->i:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    .line 4
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    iput-object p1, p0, Lcom/tencent/bugly/proguard/jb;->j:Lorg/json/JSONArray;

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/jb;->i:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->toJSONObject()Lorg/json/JSONObject;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto/16 :goto_3

    .line 6
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/jb;->i:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    if-eqz v0, :cond_1

    iget-object v1, p1, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->scene:Ljava/lang/String;

    iget-object v0, v0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->scene:Ljava/lang/String;

    invoke-static {v1, v0}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 7
    iget-object v0, p0, Lcom/tencent/bugly/proguard/jb;->i:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->merge(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;)V

    .line 8
    iget-object p1, p0, Lcom/tencent/bugly/proguard/jb;->j:Lorg/json/JSONArray;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v0

    add-int/lit8 v0, v0, -0x1

    iget-object v1, p0, Lcom/tencent/bugly/proguard/jb;->i:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->toJSONObject()Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONArray;->put(ILjava/lang/Object;)Lorg/json/JSONArray;

    goto :goto_0

    .line 9
    :cond_1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/jb;->i:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/jb;->j:Lorg/json/JSONArray;

    invoke-virtual {p1}, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->toJSONObject()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {v0, p1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 11
    :goto_0
    iget-object p1, p0, Lcom/tencent/bugly/proguard/jb;->k:Lcom/tencent/bugly/common/reporter/data/ReportData;

    if-nez p1, :cond_2

    .line 12
    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/jb;->j:Lorg/json/JSONArray;

    const-string/jumbo v1, "metrics"

    invoke-virtual {p1, v1, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/jb;->f:Lcom/tencent/rmonitor/metrics/looper/LooperMetricReportDataBuilder;

    const-string v1, "looper_metric"

    .line 15
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v2

    invoke-static {v2}, Lcom/tencent/bugly/proguard/ch;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v2

    .line 16
    sget-object v3, Lcom/tencent/bugly/proguard/ch;->f:Ljava/lang/String;

    .line 17
    invoke-virtual {v0, v1, v2, v3, p1}, Lcom/tencent/rmonitor/metrics/looper/LooperMetricReportDataBuilder;->buildReportData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)Lcom/tencent/bugly/common/reporter/data/ReportData;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/jb;->k:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 18
    :cond_2
    iget-boolean p1, p0, Lcom/tencent/bugly/proguard/jb;->h:Z

    const/16 v0, 0x64

    if-eqz p1, :cond_5

    .line 19
    iget-object p1, p0, Lcom/tencent/bugly/proguard/jb;->j:Lorg/json/JSONArray;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result p1

    if-ge p1, v0, :cond_4

    const-string p1, "background"

    invoke-virtual {p1, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_3

    goto :goto_1

    .line 20
    :cond_3
    iget-object p1, p0, Lcom/tencent/bugly/proguard/jb;->g:Lcom/tencent/bugly/proguard/pf;

    iget-object p2, p0, Lcom/tencent/bugly/proguard/jb;->k:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/pf;->b(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z

    goto :goto_2

    .line 21
    :cond_4
    :goto_1
    iget-object p1, p0, Lcom/tencent/bugly/proguard/jb;->g:Lcom/tencent/bugly/proguard/pf;

    iget-object p2, p0, Lcom/tencent/bugly/proguard/jb;->k:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/pf;->c(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z

    .line 22
    iget-object p1, p0, Lcom/tencent/bugly/proguard/jb;->k:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getReportStrategy()Lcom/tencent/bugly/common/reporter/data/ReportStrategy;

    move-result-object p1

    sget-object p2, Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;->UPLOAD_ANY:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;

    invoke-virtual {p1, p2}, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->setUploadStrategy(Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;)V

    .line 23
    sget-object p1, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    iget-object p2, p0, Lcom/tencent/bugly/proguard/jb;->k:Lcom/tencent/bugly/common/reporter/data/ReportData;

    const/4 v0, 0x0

    invoke-virtual {p1, p2, v0}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->reportNow(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)Z

    .line 24
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/jb;->a()V

    goto :goto_2

    .line 25
    :cond_5
    iget-object p1, p0, Lcom/tencent/bugly/proguard/jb;->g:Lcom/tencent/bugly/proguard/pf;

    iget-object p2, p0, Lcom/tencent/bugly/proguard/jb;->k:Lcom/tencent/bugly/common/reporter/data/ReportData;

    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/pf;->b(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z

    .line 26
    iget-object p1, p0, Lcom/tencent/bugly/proguard/jb;->j:Lorg/json/JSONArray;

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result p1

    if-lt p1, v0, :cond_6

    .line 27
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/jb;->a()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :cond_6
    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final c(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;Ljava/lang/String;)V
    .locals 2

    .line 1
    .line 2
    const-string v0, "looper_metric"

    .line 3
    .line 4
    :try_start_0
    sget-boolean v1, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->dump()V

    .line 10
    goto :goto_0

    .line 11
    :catchall_0
    move-exception p1

    .line 12
    goto :goto_1

    .line 13
    .line 14
    :cond_0
    :goto_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/jb;->e:Lcom/tencent/bugly/proguard/ca;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v1, v0, p1}, Lcom/tencent/bugly/proguard/ca;->a(Ljava/lang/String;Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;)Z

    .line 18
    move-result v1

    .line 19
    .line 20
    if-eqz v1, :cond_1

    .line 21
    .line 22
    iget-object v1, p0, Lcom/tencent/bugly/proguard/jb;->e:Lcom/tencent/bugly/proguard/ca;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1, v0, p1}, Lcom/tencent/bugly/proguard/ca;->b(Ljava/lang/String;Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;)V

    .line 26
    .line 27
    iget-object v0, p0, Lcom/tencent/bugly/proguard/jb;->e:Lcom/tencent/bugly/proguard/ca;

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/ca;->a(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/jb;->b(Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 34
    return-void

    .line 35
    .line 36
    :goto_1
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 37
    .line 38
    .line 39
    const-string/jumbo v0, "onMetaCollectedSync"

    .line 40
    .line 41
    .line 42
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 43
    move-result-object p1

    .line 44
    .line 45
    const-string v1, "RMonitor_looper_metric"

    .line 46
    .line 47
    .line 48
    filled-new-array {v1, v0, p1}, [Ljava/lang/String;

    .line 49
    move-result-object p1

    .line 50
    .line 51
    .line 52
    invoke-virtual {p2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 53
    :cond_1
    return-void
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method
