.class public final Lcom/tencent/rmonitor/looper/LooperReport;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0006\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u000eH\u0002J\u000e\u0010\u0019\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0018\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J\u0010\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u0012H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0008\u001a\u00020\tX\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R*\u0010\u000c\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e0\rj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000e`\u000fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u001d"
    }
    d2 = {
        "Lcom/tencent/rmonitor/looper/LooperReport;",
        "",
        "()V",
        "COLLECT_STACK_MSG_MAX_DELAY",
        "",
        "HAS_FULL_STACK",
        "",
        "LONG_LAG_LIMIT",
        "MAX_LONG_LAG_MAP_SIZE",
        "",
        "NO_FULL_STACK",
        "TAG",
        "longLagMap",
        "Ljava/util/HashMap;",
        "Lcom/tencent/bugly/common/reporter/data/ReportData;",
        "Lkotlin/collections/HashMap;",
        "buildReportData",
        "monitorInfo",
        "Lcom/tencent/rmonitor/looper/MonitorInfo;",
        "cancelCachedReportData",
        "",
        "reportData",
        "checkValid",
        "",
        "dealLongLag",
        "gotoReport",
        "gotoReportInner",
        "realReport",
        "reportSLA",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final COLLECT_STACK_MSG_MAX_DELAY:J = 0x14L

.field private static final HAS_FULL_STACK:Ljava/lang/String; = "1"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field public static final INSTANCE:Lcom/tencent/rmonitor/looper/LooperReport;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final LONG_LAG_LIMIT:J = 0x1388L

.field private static final MAX_LONG_LAG_MAP_SIZE:I = 0x14

.field private static final NO_FULL_STACK:Ljava/lang/String; = "0"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final TAG:Ljava/lang/String; = "RMonitor_lag_report"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static final longLagMap:Ljava/util/HashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/HashMap<",
            "Ljava/lang/Long;",
            "Lcom/tencent/bugly/common/reporter/data/ReportData;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/rmonitor/looper/LooperReport;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/rmonitor/looper/LooperReport;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/rmonitor/looper/LooperReport;->INSTANCE:Lcom/tencent/rmonitor/looper/LooperReport;

    .line 8
    .line 9
    new-instance v0, Ljava/util/HashMap;

    .line 10
    .line 11
    const/16 v1, 0x14

    .line 12
    .line 13
    .line 14
    invoke-direct {v0, v1}, Ljava/util/HashMap;-><init>(I)V

    .line 15
    .line 16
    sput-object v0, Lcom/tencent/rmonitor/looper/LooperReport;->longLagMap:Ljava/util/HashMap;

    .line 17
    return-void
    .line 18
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
.end method

.method private constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static synthetic a(Lcom/tencent/bugly/common/reporter/data/ReportData;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/tencent/rmonitor/looper/LooperReport;->cancelCachedReportData$lambda-0(Lcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 4
    return-void
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method private final buildReportData(Lcom/tencent/rmonitor/looper/MonitorInfo;)Lcom/tencent/bugly/common/reporter/data/ReportData;
    .locals 12

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/nf;->a()Lorg/json/JSONObject;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sget-object v1, Lcom/tencent/rmonitor/common/util/AppInfo;->Companion:Lcom/tencent/rmonitor/common/util/AppInfo$Companion;

    .line 7
    .line 8
    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/common/util/AppInfo$Companion;->obtainProcessName(Landroid/content/Context;)Ljava/lang/String;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    const-string v2, "process_name"

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 18
    .line 19
    .line 20
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getDuration()J

    .line 21
    move-result-wide v1

    .line 22
    .line 23
    const-string v3, "time_cost"

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getScene()Ljava/lang/String;

    .line 30
    move-result-object v1

    .line 31
    .line 32
    const-string v2, "stage"

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 36
    .line 37
    .line 38
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLagParam()Lcom/tencent/bugly/proguard/qa;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    iget-wide v1, v1, Lcom/tencent/bugly/proguard/qa;->d:J

    .line 42
    .line 43
    const-string v3, "stack_interval"

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 50
    move-result-wide v1

    .line 51
    .line 52
    const-string v3, "start_time"

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 56
    .line 57
    .line 58
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getThreadName()Ljava/lang/String;

    .line 59
    move-result-object v1

    .line 60
    .line 61
    const-string v2, "monitored_thread_name"

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 65
    .line 66
    .line 67
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->isAppInForeground()Z

    .line 68
    move-result v1

    .line 69
    .line 70
    const-string v2, "app_in_foreground"

    .line 71
    .line 72
    .line 73
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLagParam()Lcom/tencent/bugly/proguard/qa;

    .line 77
    move-result-object v1

    .line 78
    .line 79
    iget-object v1, v1, Lcom/tencent/bugly/proguard/qa;->f:Ljava/lang/String;

    .line 80
    .line 81
    const-string v2, "detect_strategy"

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 85
    .line 86
    .line 87
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    .line 88
    move-result-object v1

    .line 89
    .line 90
    .line 91
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getScene()Ljava/lang/String;

    .line 92
    move-result-object v3

    .line 93
    const/4 v4, 0x0

    .line 94
    .line 95
    const-string v5, "looper_stack"

    .line 96
    .line 97
    .line 98
    invoke-virtual {v1, v4, v5, v3, v0}, Lcom/tencent/bugly/proguard/x3;->a(ZLjava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V

    .line 99
    .line 100
    .line 101
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    .line 102
    move-result-object v1

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v0}, Lcom/tencent/bugly/proguard/x3;->a(Lorg/json/JSONObject;)V

    .line 106
    .line 107
    const-string v1, "biz_extend_info"

    .line 108
    .line 109
    .line 110
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    .line 111
    move-result v3

    .line 112
    .line 113
    if-eqz v3, :cond_0

    .line 114
    .line 115
    .line 116
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 117
    move-result-object v3

    .line 118
    goto :goto_0

    .line 119
    :cond_0
    const/4 v3, 0x0

    .line 120
    .line 121
    :goto_0
    if-nez v3, :cond_1

    .line 122
    .line 123
    new-instance v3, Lorg/json/JSONObject;

    .line 124
    .line 125
    .line 126
    invoke-direct {v3}, Lorg/json/JSONObject;-><init>()V

    .line 127
    .line 128
    .line 129
    :cond_1
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLagParam()Lcom/tencent/bugly/proguard/qa;

    .line 130
    move-result-object v6

    .line 131
    .line 132
    iget-object v6, v6, Lcom/tencent/bugly/proguard/qa;->f:Ljava/lang/String;

    .line 133
    .line 134
    .line 135
    invoke-virtual {v3, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 136
    .line 137
    .line 138
    invoke-virtual {v0, v1, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 139
    .line 140
    sget-object v1, Lcom/tencent/bugly/proguard/k7$d;->a:Lcom/tencent/bugly/proguard/k7;

    .line 141
    .line 142
    .line 143
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 144
    move-result-wide v2

    .line 145
    .line 146
    const-wide/16 v6, 0x3e8

    .line 147
    sub-long/2addr v2, v6

    .line 148
    .line 149
    .line 150
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 151
    move-result-wide v8

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getDuration()J

    .line 155
    move-result-wide v10

    .line 156
    add-long/2addr v10, v8

    .line 157
    .line 158
    .line 159
    invoke-virtual {v1, v2, v3, v10, v11}, Lcom/tencent/bugly/proguard/k7;->a(JJ)Lorg/json/JSONObject;

    .line 160
    move-result-object v1

    .line 161
    .line 162
    if-eqz v1, :cond_2

    .line 163
    .line 164
    const-string v2, "gc_info"

    .line 165
    .line 166
    .line 167
    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 168
    .line 169
    :cond_2
    sget-object v1, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    .line 170
    .line 171
    sget-object v2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 172
    .line 173
    const-string v3, "looper"

    .line 174
    .line 175
    .line 176
    invoke-static {v1, v3, v5, v2}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    .line 177
    move-result-object v1

    .line 178
    .line 179
    const-string v3, "Attributes"

    .line 180
    .line 181
    .line 182
    invoke-virtual {v1, v3, v0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 183
    .line 184
    .line 185
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 186
    move-result-wide v8

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getDuration()J

    .line 190
    move-result-wide v10

    .line 191
    add-long/2addr v10, v8

    .line 192
    .line 193
    div-long v5, v10, v6

    .line 194
    .line 195
    const-string v0, "event_time_in_ms"

    .line 196
    .line 197
    .line 198
    invoke-virtual {v1, v0, v10, v11}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 199
    .line 200
    const-string v0, "event_time"

    .line 201
    .line 202
    .line 203
    invoke-virtual {v1, v0, v5, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 204
    .line 205
    new-instance v0, Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 206
    .line 207
    iget-object v2, v2, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    .line 208
    .line 209
    const-string v3, "params"

    .line 210
    .line 211
    .line 212
    invoke-static {v1, v3}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 213
    .line 214
    const-string v3, "Looper single"

    .line 215
    const/4 v5, 0x1

    .line 216
    .line 217
    .line 218
    invoke-direct {v0, v2, v5, v3, v1}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    .line 219
    .line 220
    .line 221
    invoke-virtual {v0, v5}, Lcom/tencent/bugly/common/reporter/data/ReportData;->setShouldRecordLinkData(Z)V

    .line 222
    .line 223
    .line 224
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->checkUseFileToTransStacks()Z

    .line 225
    move-result v2

    .line 226
    .line 227
    const-string v3, "Body"

    .line 228
    .line 229
    if-eqz v2, :cond_3

    .line 230
    .line 231
    sget-object v2, Lcom/tencent/rmonitor/common/util/FileUtil;->Companion:Lcom/tencent/rmonitor/common/util/FileUtil$Companion;

    .line 232
    .line 233
    const-string v6, "rmonitor_trace"

    .line 234
    .line 235
    const-string v7, "json"

    .line 236
    .line 237
    .line 238
    invoke-virtual {v2, v6, v7}, Lcom/tencent/rmonitor/common/util/FileUtil$Companion;->makeTempFileName(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 239
    move-result-object v6

    .line 240
    .line 241
    new-instance v7, Ljava/io/File;

    .line 242
    .line 243
    .line 244
    invoke-virtual {v2}, Lcom/tencent/rmonitor/common/util/FileUtil$Companion;->getTempPath()Ljava/lang/String;

    .line 245
    move-result-object v8

    .line 246
    .line 247
    .line 248
    invoke-direct {v7, v8, v6}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    .line 249
    .line 250
    .line 251
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getFullStack()Lorg/json/JSONObject;

    .line 252
    move-result-object p1

    .line 253
    .line 254
    .line 255
    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    .line 256
    move-result-object p1

    .line 257
    .line 258
    .line 259
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 260
    move-result-object v8

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, v8, p1, v4}, Lcom/tencent/rmonitor/common/util/FileUtil$Companion;->writeFile(Ljava/lang/String;Ljava/lang/String;Z)Z

    .line 264
    .line 265
    .line 266
    invoke-virtual {v7}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;

    .line 267
    move-result-object p1

    .line 268
    .line 269
    const-string v2, "file.absolutePath"

    .line 270
    .line 271
    .line 272
    invoke-static {p1, v2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 273
    .line 274
    .line 275
    invoke-virtual {v0, p1, v5, v5}, Lcom/tencent/bugly/common/reporter/data/ReportData;->addFile(Ljava/lang/String;ZZ)V

    .line 276
    .line 277
    new-instance p1, Lorg/json/JSONObject;

    .line 278
    .line 279
    .line 280
    invoke-direct {p1}, Lorg/json/JSONObject;-><init>()V

    .line 281
    .line 282
    const-string v2, "file_stacks"

    .line 283
    .line 284
    .line 285
    invoke-virtual {p1, v2, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 286
    .line 287
    .line 288
    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 289
    return-object v0

    .line 290
    .line 291
    .line 292
    :cond_3
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getFullStack()Lorg/json/JSONObject;

    .line 293
    move-result-object p1

    .line 294
    .line 295
    .line 296
    invoke-virtual {v1, v3, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 297
    return-object v0
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method private final cancelCachedReportData(Lcom/tencent/bugly/common/reporter/data/ReportData;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getDbId()I

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    const-wide/16 v0, 0x3e8

    .line 9
    goto :goto_0

    .line 10
    .line 11
    :cond_0
    const-wide/16 v0, 0xc8

    .line 12
    .line 13
    :goto_0
    new-instance v2, Lfc0/a;

    .line 14
    .line 15
    .line 16
    invoke-direct {v2, p1}, Lfc0/a;-><init>(Lcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 17
    .line 18
    sget-object p1, Lcom/tencent/bugly/common/thread/ThreadManager;->Companion:Lcom/tencent/bugly/common/thread/ThreadManager$Companion;

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1, v2, v0, v1}, Lcom/tencent/bugly/common/thread/ThreadManager$Companion;->runInMonitorThread(Ljava/lang/Runnable;J)V

    .line 22
    return-void
    .line 23
    .line 24
.end method

.method private static final cancelCachedReportData$lambda-0(Lcom/tencent/bugly/common/reporter/data/ReportData;)V
    .locals 5

    .line 1
    .line 2
    const-string v0, "$reportData"

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getDbId()I

    .line 9
    move-result v0

    .line 10
    .line 11
    if-lez v0, :cond_0

    .line 12
    .line 13
    sget-object v0, Lcom/tencent/rmonitor/base/meta/BaseInfo;->dbHelper:Lcom/tencent/rmonitor/base/db/DBHelper;

    .line 14
    .line 15
    if-eqz v0, :cond_0

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/db/DBHelper;->getDbHandler()Lcom/tencent/rmonitor/base/db/DBHandler;

    .line 19
    move-result-object v0

    .line 20
    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    sget-object v1, Lcom/tencent/rmonitor/base/db/table/ReportDataTable;->Companion:Lcom/tencent/rmonitor/base/db/table/ReportDataTable$Companion;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Lcom/tencent/rmonitor/base/db/table/ReportDataTable$Companion;->getTableName()Ljava/lang/String;

    .line 27
    move-result-object v1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p0}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getDbId()I

    .line 31
    move-result v2

    .line 32
    int-to-long v2, v2

    .line 33
    .line 34
    sget-object v4, Lcom/tencent/rmonitor/base/db/DBDataStatus;->SENT:Lcom/tencent/rmonitor/base/db/DBDataStatus;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v4}, Lcom/tencent/rmonitor/base/db/DBDataStatus;->getValue()I

    .line 38
    move-result v4

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1, v2, v3, v4}, Lcom/tencent/rmonitor/base/db/DBHandler;->updateStatus(Ljava/lang/String;JI)I

    .line 42
    .line 43
    :cond_0
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->debug:Z

    .line 44
    .line 45
    if-eqz v0, :cond_1

    .line 46
    .line 47
    .line 48
    invoke-virtual {p0}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getParams()Lorg/json/JSONObject;

    .line 49
    move-result-object p0

    .line 50
    .line 51
    const-string v0, "client_identify"

    .line 52
    .line 53
    .line 54
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 55
    move-result-object p0

    .line 56
    .line 57
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 58
    .line 59
    const-string v1, "deal cached report data, clientIdentify: "

    .line 60
    .line 61
    .line 62
    invoke-static {v1, p0}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 63
    move-result-object p0

    .line 64
    .line 65
    const-string v1, "RMonitor_lag_report"

    .line 66
    .line 67
    .line 68
    filled-new-array {v1, p0}, [Ljava/lang/String;

    .line 69
    move-result-object p0

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 73
    :cond_1
    return-void
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
.end method

.method private final checkValid(Lcom/tencent/rmonitor/looper/MonitorInfo;)Z
    .locals 15

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/looper/LooperConfig;->INSTANCE:Lcom/tencent/rmonitor/looper/LooperConfig;

    .line 3
    .line 4
    const-string v1, "looper_stack"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/looper/LooperConfig;->getPluginConfig(Ljava/lang/String;)Lcom/tencent/bugly/proguard/hf;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    instance-of v1, v0, Lcom/tencent/bugly/proguard/kb;

    .line 11
    .line 12
    if-eqz v1, :cond_0

    .line 13
    .line 14
    check-cast v0, Lcom/tencent/bugly/proguard/kb;

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 v0, 0x0

    .line 17
    :goto_0
    const/4 v1, 0x1

    .line 18
    .line 19
    if-eqz v0, :cond_5

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kb;->e()Z

    .line 23
    move-result v2

    .line 24
    .line 25
    if-nez v2, :cond_1

    .line 26
    .line 27
    goto/16 :goto_2

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getDuration()J

    .line 31
    move-result-wide v2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kb;->g()J

    .line 35
    move-result-wide v4

    .line 36
    .line 37
    cmp-long v4, v2, v4

    .line 38
    const/4 v5, 0x0

    .line 39
    .line 40
    const-string v6, "RMonitor_lag_report"

    .line 41
    .line 42
    if-lez v4, :cond_2

    .line 43
    .line 44
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 45
    .line 46
    new-instance v4, Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v7, "not valid sample for "

    .line 49
    .line 50
    .line 51
    invoke-direct {v4, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    const-string v2, " exceed "

    .line 57
    .line 58
    .line 59
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kb;->g()J

    .line 63
    move-result-wide v2

    .line 64
    .line 65
    .line 66
    invoke-virtual {v4, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    .line 73
    filled-new-array {v6, v0}, [Ljava/lang/String;

    .line 74
    move-result-object v0

    .line 75
    .line 76
    .line 77
    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 78
    return v5

    .line 79
    .line 80
    .line 81
    :cond_2
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getCollectStackMsgCount()I

    .line 82
    move-result v4

    .line 83
    .line 84
    .line 85
    invoke-virtual/range {p1 .. p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLagParam()Lcom/tencent/bugly/proguard/qa;

    .line 86
    move-result-object v7

    .line 87
    .line 88
    iget-wide v7, v7, Lcom/tencent/bugly/proguard/qa;->d:J

    .line 89
    int-to-long v9, v4

    .line 90
    .line 91
    mul-long v11, v7, v9

    .line 92
    .line 93
    sub-long v11, v2, v11

    .line 94
    .line 95
    .line 96
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kb;->f()J

    .line 97
    move-result-wide v13

    .line 98
    mul-long/2addr v13, v9

    .line 99
    add-long/2addr v13, v7

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0}, Lcom/tencent/bugly/proguard/kb;->i()I

    .line 103
    move-result v0

    .line 104
    .line 105
    if-ge v4, v0, :cond_4

    .line 106
    .line 107
    cmp-long v0, v11, v13

    .line 108
    .line 109
    if-gtz v0, :cond_3

    .line 110
    goto :goto_1

    .line 111
    :cond_3
    move v1, v5

    .line 112
    .line 113
    :cond_4
    :goto_1
    if-nez v1, :cond_5

    .line 114
    .line 115
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 116
    .line 117
    new-instance v5, Ljava/lang/StringBuilder;

    .line 118
    .line 119
    const-string v9, "not valid sample for {totalCost: "

    .line 120
    .line 121
    .line 122
    invoke-direct {v5, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 123
    .line 124
    .line 125
    invoke-virtual {v5, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 126
    .line 127
    const-string v2, ", sliceCount: "

    .line 128
    .line 129
    .line 130
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 131
    .line 132
    .line 133
    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 134
    .line 135
    const-string v2, ", stackInterval: "

    .line 136
    .line 137
    .line 138
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 139
    .line 140
    .line 141
    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v2, ", delay: "

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    invoke-virtual {v5, v11, v12}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 150
    .line 151
    const-string v2, ", delayLimit: "

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 155
    .line 156
    .line 157
    invoke-virtual {v5, v13, v14}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 158
    .line 159
    const/16 v2, 0x7d

    .line 160
    .line 161
    .line 162
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 166
    move-result-object v2

    .line 167
    .line 168
    .line 169
    filled-new-array {v6, v2}, [Ljava/lang/String;

    .line 170
    move-result-object v2

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 174
    :cond_5
    :goto_2
    return v1
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method

.method private final dealLongLag(Lcom/tencent/rmonitor/looper/MonitorInfo;Lcom/tencent/bugly/common/reporter/data/ReportData;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->isDetectedLongLag()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    const-string v1, ", clientIdentify: "

    .line 7
    .line 8
    const-string v2, ", requestTime: "

    .line 9
    .line 10
    const-string v3, "RMonitor_lag_report"

    .line 11
    .line 12
    const-string v4, "client_identify"

    .line 13
    .line 14
    if-eqz v0, :cond_1

    .line 15
    .line 16
    sget-object v0, Lcom/tencent/rmonitor/looper/LooperReport;->longLagMap:Ljava/util/HashMap;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Ljava/util/HashMap;->size()I

    .line 20
    move-result v5

    .line 21
    .line 22
    const/16 v6, 0x14

    .line 23
    .line 24
    if-lt v5, v6, :cond_0

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Ljava/util/HashMap;->clear()V

    .line 28
    .line 29
    .line 30
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 31
    move-result-wide v5

    .line 32
    .line 33
    .line 34
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 35
    move-result-object v5

    .line 36
    .line 37
    .line 38
    invoke-interface {v0, v5, p2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getReportStrategy()Lcom/tencent/bugly/common/reporter/data/ReportStrategy;

    .line 42
    move-result-object v0

    .line 43
    .line 44
    sget-object v5, Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;->UPLOAD_NEXT_LAUNCH:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v5}, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->setUploadStrategy(Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;)V

    .line 48
    .line 49
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    .line 50
    .line 51
    if-eqz v0, :cond_3

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getParams()Lorg/json/JSONObject;

    .line 55
    move-result-object p2

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 59
    move-result-object p2

    .line 60
    .line 61
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 62
    .line 63
    new-instance v4, Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string v5, "record unfinished long lag clientIdentify, duration: "

    .line 66
    .line 67
    .line 68
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getDuration()J

    .line 72
    move-result-wide v5

    .line 73
    .line 74
    .line 75
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 76
    .line 77
    .line 78
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 79
    .line 80
    .line 81
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 82
    move-result-wide v5

    .line 83
    .line 84
    .line 85
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 86
    .line 87
    .line 88
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 92
    .line 93
    .line 94
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 95
    move-result-object p1

    .line 96
    .line 97
    .line 98
    filled-new-array {v3, p1}, [Ljava/lang/String;

    .line 99
    move-result-object p1

    .line 100
    .line 101
    .line 102
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    .line 103
    return-void

    .line 104
    .line 105
    .line 106
    :cond_1
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getDuration()J

    .line 107
    move-result-wide v5

    .line 108
    .line 109
    const-wide/16 v7, 0x1388

    .line 110
    .line 111
    cmp-long v0, v5, v7

    .line 112
    .line 113
    if-ltz v0, :cond_3

    .line 114
    .line 115
    sget-object v0, Lcom/tencent/rmonitor/looper/LooperReport;->longLagMap:Ljava/util/HashMap;

    .line 116
    .line 117
    .line 118
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 119
    move-result-wide v5

    .line 120
    .line 121
    .line 122
    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 123
    move-result-object v5

    .line 124
    .line 125
    .line 126
    invoke-virtual {v0, v5}, Ljava/util/HashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    move-result-object v0

    .line 128
    .line 129
    check-cast v0, Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 130
    .line 131
    if-eqz v0, :cond_2

    .line 132
    .line 133
    .line 134
    invoke-direct {p0, v0}, Lcom/tencent/rmonitor/looper/LooperReport;->cancelCachedReportData(Lcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 135
    .line 136
    :cond_2
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    .line 137
    .line 138
    if-eqz v0, :cond_3

    .line 139
    .line 140
    .line 141
    invoke-virtual {p2}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getParams()Lorg/json/JSONObject;

    .line 142
    move-result-object p2

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, v4}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    .line 146
    move-result-object p2

    .line 147
    .line 148
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 149
    .line 150
    new-instance v4, Ljava/lang/StringBuilder;

    .line 151
    .line 152
    const-string v5, "deal finished long lag clientIdentify, duration: "

    .line 153
    .line 154
    .line 155
    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 156
    .line 157
    .line 158
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getDuration()J

    .line 159
    move-result-wide v5

    .line 160
    .line 161
    .line 162
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 163
    .line 164
    .line 165
    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 166
    .line 167
    .line 168
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getLastStackRequestTime()J

    .line 169
    move-result-wide v5

    .line 170
    .line 171
    .line 172
    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 173
    .line 174
    .line 175
    invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 176
    .line 177
    .line 178
    invoke-virtual {v4, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 179
    .line 180
    .line 181
    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 182
    move-result-object p1

    .line 183
    .line 184
    .line 185
    filled-new-array {v3, p1}, [Ljava/lang/String;

    .line 186
    move-result-object p1

    .line 187
    .line 188
    .line 189
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    .line 190
    :cond_3
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method private final gotoReportInner(Lcom/tencent/rmonitor/looper/MonitorInfo;)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/tencent/rmonitor/looper/LooperReport;->buildReportData(Lcom/tencent/rmonitor/looper/MonitorInfo;)Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, p1, v0}, Lcom/tencent/rmonitor/looper/LooperReport;->dealLongLag(Lcom/tencent/rmonitor/looper/MonitorInfo;Lcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, p1}, Lcom/tencent/rmonitor/looper/LooperReport;->checkValid(Lcom/tencent/rmonitor/looper/MonitorInfo;)Z

    .line 11
    move-result v1

    .line 12
    .line 13
    if-eqz v1, :cond_0

    .line 14
    .line 15
    .line 16
    invoke-direct {p0, v0, p1}, Lcom/tencent/rmonitor/looper/LooperReport;->realReport(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/rmonitor/looper/MonitorInfo;)Z

    .line 17
    move-result p1

    .line 18
    return p1

    .line 19
    .line 20
    :cond_0
    new-instance p1, Lcom/tencent/bugly/proguard/pf;

    .line 21
    .line 22
    .line 23
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/pf;-><init>()V

    .line 24
    .line 25
    sget-object v1, Lcom/tencent/rmonitor/base/db/DBDataStatus;->SENT:Lcom/tencent/rmonitor/base/db/DBDataStatus;

    .line 26
    .line 27
    .line 28
    invoke-virtual {p1, v0, v1}, Lcom/tencent/bugly/proguard/pf;->a(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/rmonitor/base/db/DBDataStatus;)Z

    .line 29
    const/4 p1, 0x0

    .line 30
    return p1
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
.end method

.method private final realReport(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/rmonitor/looper/MonitorInfo;)Z
    .locals 5

    .line 1
    .line 2
    const-string v0, "RMonitor_lag_report"

    .line 3
    .line 4
    :try_start_0
    new-instance v1, Lcom/tencent/rmonitor/base/meta/LooperMeta;

    .line 5
    .line 6
    .line 7
    invoke-virtual {p1}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getParams()Lorg/json/JSONObject;

    .line 8
    move-result-object v2

    .line 9
    .line 10
    .line 11
    invoke-virtual {p2}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getThreadId()Ljava/lang/String;

    .line 12
    move-result-object v3

    .line 13
    .line 14
    .line 15
    invoke-virtual {p2}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getThreadName()Ljava/lang/String;

    .line 16
    move-result-object v4

    .line 17
    .line 18
    .line 19
    invoke-direct {v1, v2, v3, v4}, Lcom/tencent/rmonitor/base/meta/LooperMeta;-><init>(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)V

    .line 20
    .line 21
    sget-object v2, Lcom/tencent/rmonitor/base/plugin/listener/ListenerManager;->looperListener:Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2}, Lcom/tencent/rmonitor/base/plugin/listener/MonitorListenerMng;->getListenerList()Ljava/util/ArrayList;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 29
    move-result-object v2

    .line 30
    .line 31
    .line 32
    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    .line 33
    move-result v3

    .line 34
    .line 35
    if-eqz v3, :cond_0

    .line 36
    .line 37
    .line 38
    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 39
    move-result-object v3

    .line 40
    .line 41
    check-cast v3, Lcom/tencent/rmonitor/base/plugin/listener/ILooperListener;

    .line 42
    .line 43
    .line 44
    invoke-interface {v3, v1}, Lcom/tencent/rmonitor/base/plugin/listener/ILooperListener;->onBeforeReport(Lcom/tencent/rmonitor/base/meta/LooperMeta;)V

    .line 45
    goto :goto_0

    .line 46
    :catchall_0
    move-exception p1

    .line 47
    goto :goto_2

    .line 48
    .line 49
    :cond_0
    sget-object v1, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->INSTANCE:Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;

    .line 50
    .line 51
    const-string v2, "looper_stack"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v2}, Lcom/tencent/rmonitor/base/plugin/monitor/PluginController;->whetherPluginReportSampling(Ljava/lang/String;)Z

    .line 55
    move-result v1

    .line 56
    .line 57
    if-eqz v1, :cond_1

    .line 58
    .line 59
    sget-object p2, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    .line 60
    const/4 v1, 0x2

    .line 61
    const/4 v2, 0x0

    .line 62
    .line 63
    .line 64
    invoke-static {p2, p1, v2, v1, v2}, Lcom/tencent/bugly/common/reporter/IReporter$DefaultImpls;->reportNow$default(Lcom/tencent/bugly/common/reporter/IReporter;Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;ILjava/lang/Object;)Z

    .line 65
    goto :goto_1

    .line 66
    .line 67
    :cond_1
    sget-boolean p1, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    .line 68
    .line 69
    if-eqz p1, :cond_2

    .line 70
    .line 71
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 72
    .line 73
    new-instance v1, Ljava/lang/StringBuilder;

    .line 74
    .line 75
    .line 76
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 77
    .line 78
    const-string v2, "miss report for sampling. [ThreadName: "

    .line 79
    .line 80
    .line 81
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 82
    .line 83
    .line 84
    invoke-virtual {p2}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getThreadName()Ljava/lang/String;

    .line 85
    move-result-object v2

    .line 86
    .line 87
    .line 88
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    const-string v2, ", CostInMs: "

    .line 91
    .line 92
    .line 93
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getDuration()J

    .line 97
    move-result-wide v2

    .line 98
    .line 99
    .line 100
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    const-string v2, ", Scene: "

    .line 103
    .line 104
    .line 105
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getScene()Ljava/lang/String;

    .line 109
    move-result-object v2

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 113
    .line 114
    const-string v2, ", Foreground: "

    .line 115
    .line 116
    .line 117
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 118
    .line 119
    .line 120
    invoke-virtual {p2}, Lcom/tencent/rmonitor/looper/MonitorInfo;->isAppInForeground()Z

    .line 121
    move-result p2

    .line 122
    .line 123
    .line 124
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 125
    .line 126
    const/16 p2, 0x5d

    .line 127
    .line 128
    .line 129
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 130
    .line 131
    .line 132
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 133
    move-result-object p2

    .line 134
    .line 135
    .line 136
    filled-new-array {v0, p2}, [Ljava/lang/String;

    .line 137
    move-result-object p2

    .line 138
    .line 139
    .line 140
    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 141
    :cond_2
    :goto_1
    const/4 p1, 0x1

    .line 142
    return p1

    .line 143
    .line 144
    :goto_2
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 145
    .line 146
    new-instance v1, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v2, "looper data may be error, "

    .line 149
    .line 150
    .line 151
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 155
    move-result-object p1

    .line 156
    .line 157
    .line 158
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    move-result-object p1

    .line 163
    .line 164
    .line 165
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 166
    move-result-object p1

    .line 167
    .line 168
    .line 169
    invoke-virtual {p2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 170
    const/4 p1, 0x0

    .line 171
    return p1
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method private final reportSLA(Lcom/tencent/rmonitor/looper/MonitorInfo;)V
    .locals 8

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/q0$a;->a()Lcom/tencent/bugly/proguard/q0;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    const-string v1, "RMLooperStackCollectStack"

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/q0;->a(Ljava/lang/String;)Z

    .line 10
    move-result v0

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    return-void

    .line 14
    .line 15
    :cond_0
    new-instance v0, Lcom/tencent/rmonitor/sla/AttaEvent;

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Lcom/tencent/rmonitor/sla/AttaEvent;-><init>(Ljava/lang/String;)V

    .line 19
    .line 20
    .line 21
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getAvgCollectStackMsgCost()D

    .line 22
    move-result-wide v1

    .line 23
    .line 24
    .line 25
    invoke-static {v1, v2}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, v3}, Lcom/tencent/rmonitor/sla/AttaEvent;->setParam0(Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getAvgCollectStackMsgDelay()J

    .line 33
    move-result-wide v3

    .line 34
    .line 35
    .line 36
    invoke-static {v3, v4}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 37
    move-result-object v5

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v5}, Lcom/tencent/rmonitor/sla/AttaEvent;->setParam1(Ljava/lang/String;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getCollectStackMsgCount()I

    .line 44
    move-result v5

    .line 45
    .line 46
    .line 47
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 48
    move-result-object v5

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v5}, Lcom/tencent/rmonitor/sla/AttaEvent;->setParam2(Ljava/lang/String;)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getDuration()J

    .line 55
    move-result-wide v5

    .line 56
    .line 57
    .line 58
    invoke-static {v5, v6}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 59
    move-result-object v5

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v5}, Lcom/tencent/rmonitor/sla/AttaEvent;->setParam3(Ljava/lang/String;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getDuration()J

    .line 66
    move-result-wide v5

    .line 67
    long-to-int v5, v5

    .line 68
    .line 69
    .line 70
    invoke-virtual {v0, v5}, Lcom/tencent/rmonitor/sla/AttaEvent;->setEventCost(I)V

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getFullStack()Lorg/json/JSONObject;

    .line 74
    move-result-object v5

    .line 75
    .line 76
    if-nez v5, :cond_1

    .line 77
    .line 78
    const-string v5, "0"

    .line 79
    .line 80
    .line 81
    invoke-virtual {v0, v5}, Lcom/tencent/rmonitor/sla/AttaEvent;->setParam4(Ljava/lang/String;)V

    .line 82
    goto :goto_0

    .line 83
    .line 84
    :cond_1
    const-string v5, "1"

    .line 85
    .line 86
    .line 87
    invoke-virtual {v0, v5}, Lcom/tencent/rmonitor/sla/AttaEvent;->setParam4(Ljava/lang/String;)V

    .line 88
    .line 89
    .line 90
    :goto_0
    invoke-static {}, Lcom/tencent/bugly/proguard/ie;->k()Lcom/tencent/bugly/proguard/ie;

    .line 91
    move-result-object v5

    .line 92
    .line 93
    .line 94
    invoke-virtual {v5}, Lcom/tencent/bugly/proguard/ie;->g()Ljava/lang/String;

    .line 95
    move-result-object v5

    .line 96
    .line 97
    const-string v6, "getInstance().osVersion"

    .line 98
    .line 99
    .line 100
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v5}, Lcom/tencent/rmonitor/sla/AttaEvent;->setParam5(Ljava/lang/String;)V

    .line 104
    .line 105
    sget-object v5, Lcom/tencent/bugly/proguard/ie;->o:Lcom/tencent/bugly/proguard/ie;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Lcom/tencent/bugly/proguard/ie;->b()Ljava/lang/String;

    .line 109
    move-result-object v6

    .line 110
    .line 111
    const-string v7, "getInstance().manufacture"

    .line 112
    .line 113
    .line 114
    invoke-static {v6, v7}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 115
    .line 116
    .line 117
    invoke-virtual {v0, v6}, Lcom/tencent/rmonitor/sla/AttaEvent;->setParam6(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    invoke-virtual {v5}, Lcom/tencent/bugly/proguard/ie;->d()Ljava/lang/String;

    .line 121
    move-result-object v5

    .line 122
    .line 123
    const-string v6, "getInstance().model"

    .line 124
    .line 125
    .line 126
    invoke-static {v5, v6}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 127
    .line 128
    .line 129
    invoke-virtual {v0, v5}, Lcom/tencent/rmonitor/sla/AttaEvent;->setParam7(Ljava/lang/String;)V

    .line 130
    .line 131
    .line 132
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getQuickTraceFlag()Z

    .line 133
    move-result p1

    .line 134
    .line 135
    .line 136
    invoke-static {p1}, Ljava/lang/String;->valueOf(Z)Ljava/lang/String;

    .line 137
    move-result-object p1

    .line 138
    .line 139
    .line 140
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->setParam8(Ljava/lang/String;)V

    .line 141
    .line 142
    const/16 p1, 0x3e8

    .line 143
    int-to-double v5, p1

    .line 144
    div-double/2addr v1, v5

    .line 145
    long-to-double v3, v3

    .line 146
    add-double/2addr v1, v3

    .line 147
    .line 148
    const-wide/high16 v3, 0x4034000000000000L    # 20.0

    .line 149
    .line 150
    cmpl-double p1, v1, v3

    .line 151
    .line 152
    if-lez p1, :cond_2

    .line 153
    const/4 p1, 0x0

    .line 154
    goto :goto_1

    .line 155
    :cond_2
    const/4 p1, 0x1

    .line 156
    .line 157
    .line 158
    :goto_1
    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/sla/AttaEvent;->setEventResult(I)V

    .line 159
    .line 160
    sget-object p1, Lcom/tencent/rmonitor/sla/AttaEventReporter;->Companion:Lcom/tencent/rmonitor/sla/AttaEventReporter$Companion;

    .line 161
    .line 162
    .line 163
    invoke-virtual {p1}, Lcom/tencent/rmonitor/sla/AttaEventReporter$Companion;->getInstance()Lcom/tencent/rmonitor/sla/AttaEventReporter;

    .line 164
    move-result-object p1

    .line 165
    .line 166
    .line 167
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/sla/AttaEventReporter;->addEvent(Lcom/tencent/rmonitor/sla/AttaEvent;)V

    .line 168
    return-void
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
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
.end method


# virtual methods
.method public final gotoReport(Lcom/tencent/rmonitor/looper/MonitorInfo;)Z
    .locals 1
    .param p1    # Lcom/tencent/rmonitor/looper/MonitorInfo;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "monitorInfo"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p1}, Lcom/tencent/rmonitor/looper/MonitorInfo;->getFullStack()Lorg/json/JSONObject;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    if-eqz v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, p1}, Lcom/tencent/rmonitor/looper/LooperReport;->gotoReportInner(Lcom/tencent/rmonitor/looper/MonitorInfo;)Z

    .line 15
    move-result v0

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const/4 v0, 0x0

    .line 18
    .line 19
    .line 20
    :goto_0
    invoke-direct {p0, p1}, Lcom/tencent/rmonitor/looper/LooperReport;->reportSLA(Lcom/tencent/rmonitor/looper/MonitorInfo;)V

    .line 21
    return v0
    .line 22
    .line 23
    .line 24
.end method
