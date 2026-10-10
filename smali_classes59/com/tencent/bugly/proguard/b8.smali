.class public Lcom/tencent/bugly/proguard/b8;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/a8;


# static fields
.field public static final g:Ljava/lang/String; = "RMonitor_net_quality_dealer"

.field public static final h:Ljava/lang/String; = "list"

.field public static final i:I = 0x0

.field public static final j:I = 0x1


# instance fields
.field public final a:Ljava/util/concurrent/ConcurrentLinkedQueue;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentLinkedQueue<",
            "Lcom/tencent/bugly/proguard/z7;",
            ">;"
        }
    .end annotation
.end field

.field public final b:Lcom/tencent/bugly/proguard/jd;

.field public final c:Lcom/tencent/bugly/proguard/of;

.field public d:Lcom/tencent/bugly/common/reporter/data/ReportData;

.field public e:I

.field public f:Ljava/lang/Runnable;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/jd;Lcom/tencent/bugly/proguard/of;)V
    .locals 2
    .param p1    # Lcom/tencent/bugly/proguard/jd;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b8;->d:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    iput v1, p0, Lcom/tencent/bugly/proguard/b8;->e:I

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b8;->f:Ljava/lang/Runnable;

    .line 12
    .line 13
    new-instance v0, Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 14
    .line 15
    .line 16
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;-><init>()V

    .line 17
    .line 18
    iput-object v0, p0, Lcom/tencent/bugly/proguard/b8;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    .line 19
    .line 20
    iput-object p1, p0, Lcom/tencent/bugly/proguard/b8;->b:Lcom/tencent/bugly/proguard/jd;

    .line 21
    .line 22
    iput-object p2, p0, Lcom/tencent/bugly/proguard/b8;->c:Lcom/tencent/bugly/proguard/of;

    .line 23
    .line 24
    sget-boolean p2, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    .line 25
    .line 26
    if-eqz p2, :cond_0

    .line 27
    .line 28
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 29
    .line 30
    new-instance v0, Ljava/lang/StringBuilder;

    .line 31
    .line 32
    const-string v1, "config: "

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 36
    .line 37
    .line 38
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object p1

    .line 43
    .line 44
    const-string v0, "RMonitor_net_quality_dealer"

    .line 45
    .line 46
    .line 47
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 48
    move-result-object p1

    .line 49
    .line 50
    .line 51
    invoke-virtual {p2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    .line 52
    :cond_0
    return-void
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

.method public static synthetic a(Lcom/tencent/bugly/proguard/b8;Ljava/lang/Runnable;)Ljava/lang/Runnable;
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/b8;->f:Ljava/lang/Runnable;

    return-object p1
.end method


# virtual methods
.method public a(II)I
    .locals 3

    .line 20
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b8;->d:Lcom/tencent/bugly/common/reporter/data/ReportData;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    return v1

    .line 21
    :cond_0
    iget v2, p0, Lcom/tencent/bugly/proguard/b8;->e:I

    sub-int/2addr p1, v2

    if-ltz p1, :cond_1

    .line 22
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 23
    invoke-virtual {p0, v2, p1}, Lcom/tencent/bugly/proguard/b8;->a(Ljava/util/ArrayList;I)V

    .line 24
    invoke-virtual {p0, v0, v2}, Lcom/tencent/bugly/proguard/b8;->a(Lcom/tencent/bugly/common/reporter/data/ReportData;Ljava/util/List;)V

    .line 25
    iget p1, p0, Lcom/tencent/bugly/proguard/b8;->e:I

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v2

    add-int/2addr v2, p1

    iput v2, p0, Lcom/tencent/bugly/proguard/b8;->e:I

    .line 26
    :cond_1
    iget p1, p0, Lcom/tencent/bugly/proguard/b8;->e:I

    if-lt p1, p2, :cond_2

    .line 27
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b8;->c:Lcom/tencent/bugly/proguard/of;

    invoke-interface {p1, v0}, Lcom/tencent/bugly/proguard/of;->c(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z

    .line 28
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/b8;->a(Lcom/tencent/bugly/common/reporter/data/ReportData;)V

    const/4 p1, 0x0

    .line 29
    iput-object p1, p0, Lcom/tencent/bugly/proguard/b8;->d:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 30
    iput v1, p0, Lcom/tencent/bugly/proguard/b8;->e:I

    return v1

    .line 31
    :cond_2
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b8;->c:Lcom/tencent/bugly/proguard/of;

    invoke-interface {p1, v0}, Lcom/tencent/bugly/proguard/of;->b(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z

    const/4 p1, 0x1

    return p1
.end method

.method public a(Ljava/util/List;Lcom/tencent/bugly/common/meta/UserMeta;)Lcom/tencent/bugly/common/reporter/data/ReportData;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/z7;",
            ">;",
            "Lcom/tencent/bugly/common/meta/UserMeta;",
            ")",
            "Lcom/tencent/bugly/common/reporter/data/ReportData;"
        }
    .end annotation

    const/4 v0, 0x0

    if-eqz p1, :cond_4

    .line 49
    invoke-interface {p1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_4

    if-nez p2, :cond_0

    goto/16 :goto_4

    .line 50
    :cond_0
    invoke-static {}, Lcom/tencent/bugly/proguard/d3;->c()Landroid/content/Context;

    move-result-object v1

    .line 51
    const-string/jumbo v2, "resource"

    const-string/jumbo v3, "net_quality"

    invoke-static {v1, v2, v3, p2}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    move-result-object v1

    const-string v2, "RMonitor_net_quality_dealer"

    if-nez v1, :cond_1

    .line 52
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "makeReportData fail for param is null."

    filled-new-array {v2, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return-object v0

    :cond_1
    const/4 v0, 0x1

    const/4 v4, 0x0

    .line 53
    :try_start_0
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    move v6, v4

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lcom/tencent/bugly/proguard/z7;

    .line 54
    iget-boolean v7, v7, Lcom/tencent/bugly/proguard/z7;->h:Z

    or-int/2addr v6, v7

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 55
    :cond_2
    const-string/jumbo v5, "translate_type"

    if-eqz v6, :cond_3

    const-string/jumbo v6, "translate"

    goto :goto_1

    :cond_3
    const-string/jumbo v6, "none"

    :goto_1
    invoke-virtual {v1, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 56
    sget-object v5, Lcom/tencent/bugly/proguard/nf;->T:[Ljava/lang/String;

    invoke-static {v5}, Lcom/tencent/bugly/proguard/nf;->a([Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    .line 57
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    move-result-object v6

    .line 58
    invoke-virtual {v6, v5}, Lcom/tencent/bugly/proguard/x3;->a(Lorg/json/JSONObject;)V

    .line 59
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    move-result-object v6

    .line 60
    invoke-virtual {v6, v0, v3, v5}, Lcom/tencent/bugly/proguard/x3;->a(ZLjava/lang/String;Lorg/json/JSONObject;)V

    .line 61
    const-string v6, "Attributes"

    invoke-virtual {v1, v6, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 62
    invoke-virtual {p0, v1, p1}, Lcom/tencent/bugly/proguard/b8;->a(Lorg/json/JSONObject;Ljava/util/List;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_3

    .line 63
    :goto_2
    sget-object v5, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v6, Ljava/lang/StringBuilder;

    const-string v7, "makeReportData fail for "

    invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 64
    :goto_3
    new-instance p1, Lcom/tencent/bugly/common/reporter/data/ReportData;

    iget-object p2, p2, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    invoke-direct {p1, p2, v0, v3, v1}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    .line 65
    invoke-virtual {p1, v4}, Lcom/tencent/bugly/common/reporter/data/ReportData;->setShouldRecordLinkData(Z)V

    return-object p1

    :cond_4
    :goto_4
    return-object v0
.end method

.method public a()Lcom/tencent/bugly/proguard/jd;
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b8;->b:Lcom/tencent/bugly/proguard/jd;

    return-object v0
.end method

.method public a(Lcom/tencent/bugly/common/reporter/data/ReportData;)V
    .locals 3

    .line 47
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string/jumbo v2, "realReport, id: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getDbId()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RMonitor_net_quality_dealer"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 48
    sget-object v0, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    const/4 v1, 0x0

    invoke-virtual {v0, p1, v1}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->reportNow(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)Z

    return-void
.end method

.method public a(Lcom/tencent/bugly/common/reporter/data/ReportData;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/tencent/bugly/common/reporter/data/ReportData;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/z7;",
            ">;)V"
        }
    .end annotation

    if-nez p1, :cond_0

    return-void

    .line 32
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getParams()Lorg/json/JSONObject;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/b8;->a(Lorg/json/JSONObject;Ljava/util/List;)V

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/z7;)V
    .locals 1

    if-nez p1, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b8;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->offer(Ljava/lang/Object;)Z

    .line 3
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b8;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {p1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result p1

    iget-object v0, p0, Lcom/tencent/bugly/proguard/b8;->b:Lcom/tencent/bugly/proguard/jd;

    iget v0, v0, Lcom/tencent/bugly/proguard/jd;->q:I

    if-lt p1, v0, :cond_1

    .line 4
    const-string p1, "meet maxBatchCount"

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/b8;->a(Ljava/lang/String;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .line 6
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b8;->f:Ljava/lang/Runnable;

    const-string v1, "RMonitor_net_quality_dealer"

    if-eqz v0, :cond_0

    .line 7
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo v0, "try report or cache data fail for last task not finish."

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return-void

    .line 8
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 9
    const-string/jumbo v2, "try report or cache data for "

    invoke-static {v2, p1}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 10
    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 11
    new-instance p1, Lcom/tencent/bugly/proguard/b8$a;

    invoke-direct {p1, p0}, Lcom/tencent/bugly/proguard/b8$a;-><init>(Lcom/tencent/bugly/proguard/b8;)V

    .line 12
    iput-object p1, p0, Lcom/tencent/bugly/proguard/b8;->f:Ljava/lang/Runnable;

    const-wide/16 v0, 0x0

    .line 13
    invoke-static {p1, v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager;->runInMonitorThread(Ljava/lang/Runnable;J)V

    return-void
.end method

.method public a(Ljava/util/ArrayList;I)V
    .locals 2
    .param p1    # Ljava/util/ArrayList;
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/z7;",
            ">;I)V"
        }
    .end annotation

    .line 43
    invoke-virtual {p1}, Ljava/util/ArrayList;->clear()V

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p2, :cond_0

    .line 44
    iget-object v1, p0, Lcom/tencent/bugly/proguard/b8;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_0

    .line 45
    iget-object v1, p0, Lcom/tencent/bugly/proguard/b8;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v1}, Ljava/util/concurrent/ConcurrentLinkedQueue;->poll()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/proguard/z7;

    if-eqz v1, :cond_0

    .line 46
    invoke-virtual {p1, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;Ljava/util/List;)V
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONObject;",
            "Ljava/util/List<",
            "Lcom/tencent/bugly/proguard/z7;",
            ">;)V"
        }
    .end annotation

    const-string v0, "list"

    const-string v1, "Body"

    if-eqz p1, :cond_3

    if-eqz p2, :cond_3

    .line 33
    invoke-interface {p2}, Ljava/util/List;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto :goto_3

    .line 34
    :cond_0
    :try_start_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-nez v2, :cond_1

    .line 35
    new-instance v2, Lorg/json/JSONObject;

    invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V

    .line 36
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    .line 37
    :cond_1
    :goto_0
    invoke-virtual {v2, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    if-nez p1, :cond_2

    .line 38
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    .line 39
    invoke-virtual {v2, v0, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 40
    :cond_2
    invoke-interface {p2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/tencent/bugly/proguard/z7;

    .line 41
    iget-object v0, v0, Lcom/tencent/bugly/proguard/z7;->m:Lorg/json/JSONObject;

    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    .line 42
    :goto_2
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "appendData fail for "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    const-string v0, "RMonitor_net_quality_dealer"

    filled-new-array {v0, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    :cond_3
    :goto_3
    return-void
.end method

.method public final a(ILjava/util/ArrayList;)Z
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/util/ArrayList<",
            "Lcom/tencent/bugly/proguard/z7;",
            ">;)Z"
        }
    .end annotation

    .line 14
    invoke-virtual {p2}, Ljava/util/ArrayList;->size()I

    move-result v0

    .line 15
    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-virtual {p0, p2, v1}, Lcom/tencent/bugly/proguard/b8;->a(Ljava/util/List;Lcom/tencent/bugly/common/meta/UserMeta;)Lcom/tencent/bugly/common/reporter/data/ReportData;

    move-result-object p2

    const/4 v1, 0x1

    if-nez p2, :cond_0

    return v1

    :cond_0
    if-lt v0, p1, :cond_1

    .line 16
    invoke-virtual {p0, p2}, Lcom/tencent/bugly/proguard/b8;->a(Lcom/tencent/bugly/common/reporter/data/ReportData;)V

    const/4 p1, 0x0

    return p1

    .line 17
    :cond_1
    iput-object p2, p0, Lcom/tencent/bugly/proguard/b8;->d:Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 18
    iput v0, p0, Lcom/tencent/bugly/proguard/b8;->e:I

    .line 19
    iget-object p1, p0, Lcom/tencent/bugly/proguard/b8;->c:Lcom/tencent/bugly/proguard/of;

    invoke-interface {p1, p2}, Lcom/tencent/bugly/proguard/of;->d(Lcom/tencent/bugly/common/reporter/data/ReportData;)Z

    return v1
.end method

.method public b()V
    .locals 2

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b8;->b:Lcom/tencent/bugly/proguard/jd;

    iget v1, v0, Lcom/tencent/bugly/proguard/jd;->q:I

    iget v0, v0, Lcom/tencent/bugly/proguard/jd;->r:I

    invoke-virtual {p0, v1, v0}, Lcom/tencent/bugly/proguard/b8;->b(II)V

    return-void
.end method

.method public b(II)V
    .locals 5

    if-lez p1, :cond_4

    if-ltz p2, :cond_4

    if-ge p1, p2, :cond_0

    goto :goto_2

    .line 2
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/b8;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v0}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_2

    .line 3
    :cond_1
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/b8;->a(II)I

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_2

    goto :goto_2

    .line 4
    :cond_2
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 5
    iget-object v2, p0, Lcom/tencent/bugly/proguard/b8;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v2}, Ljava/util/concurrent/ConcurrentLinkedQueue;->size()I

    move-result v2

    div-int/2addr v2, p1

    add-int/2addr v2, v1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-nez v3, :cond_4

    if-ge v4, v2, :cond_4

    .line 6
    iget-object v3, p0, Lcom/tencent/bugly/proguard/b8;->a:Ljava/util/concurrent/ConcurrentLinkedQueue;

    invoke-virtual {v3}, Ljava/util/concurrent/ConcurrentLinkedQueue;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_4

    .line 7
    invoke-virtual {p0, v0, p1}, Lcom/tencent/bugly/proguard/b8;->a(Ljava/util/ArrayList;I)V

    .line 8
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_3

    move v3, v1

    goto :goto_1

    .line 9
    :cond_3
    invoke-virtual {p0, p2, v0}, Lcom/tencent/bugly/proguard/b8;->a(ILjava/util/ArrayList;)Z

    move-result v3

    :goto_1
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_4
    :goto_2
    return-void
.end method
