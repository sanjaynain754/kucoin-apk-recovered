.class public Lcom/tencent/bugly/proguard/ec;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:Ljava/lang/String; = "RMonitor_MemoryLeakReporter"


# direct methods
.method public constructor <init>()V
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
    .line 17
.end method


# virtual methods
.method public a(Ljava/lang/String;Ljava/lang/String;Lcom/tencent/rmonitor/base/meta/DumpResult;Ljava/util/Map;)Lcom/tencent/bugly/common/reporter/data/ReportData;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Lcom/tencent/rmonitor/base/meta/DumpResult;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/tencent/bugly/common/reporter/data/ReportData;"
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p3, :cond_2

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/nf;->a()Lorg/json/JSONObject;

    .line 7
    move-result-object v1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 8
    .line 9
    const-string v2, "leakobj"

    .line 10
    .line 11
    .line 12
    const-string/jumbo v3, "uuid"

    .line 13
    .line 14
    if-eqz p4, :cond_1

    .line 15
    .line 16
    :try_start_1
    new-instance v4, Lorg/json/JSONArray;

    .line 17
    .line 18
    .line 19
    invoke-direct {v4}, Lorg/json/JSONArray;-><init>()V

    .line 20
    .line 21
    .line 22
    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 23
    move-result-object p4

    .line 24
    .line 25
    .line 26
    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 27
    move-result-object p4

    .line 28
    .line 29
    .line 30
    :goto_0
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    .line 31
    move-result v5

    .line 32
    .line 33
    if-eqz v5, :cond_0

    .line 34
    .line 35
    .line 36
    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 37
    move-result-object v5

    .line 38
    .line 39
    check-cast v5, Ljava/util/Map$Entry;

    .line 40
    .line 41
    new-instance v6, Lorg/json/JSONObject;

    .line 42
    .line 43
    .line 44
    invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V

    .line 45
    .line 46
    .line 47
    invoke-interface {v5}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    .line 48
    move-result-object v7

    .line 49
    .line 50
    .line 51
    invoke-virtual {v6, v3, v7}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 52
    .line 53
    .line 54
    invoke-interface {v5}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 55
    move-result-object v5

    .line 56
    .line 57
    .line 58
    invoke-virtual {v6, v2, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v4, v6}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 62
    goto :goto_0

    .line 63
    :catchall_0
    move-exception p1

    .line 64
    .line 65
    goto/16 :goto_1

    .line 66
    .line 67
    :cond_0
    const-string p4, "extra_leak"

    .line 68
    .line 69
    .line 70
    invoke-virtual {v1, p4, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 71
    .line 72
    .line 73
    :cond_1
    const-string/jumbo p4, "process_name"

    .line 74
    .line 75
    sget-object v4, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    .line 76
    .line 77
    .line 78
    invoke-static {v4}, Lcom/tencent/rmonitor/common/util/AppInfo;->obtainProcessName(Landroid/content/Context;)Ljava/lang/String;

    .line 79
    move-result-object v4

    .line 80
    .line 81
    .line 82
    invoke-virtual {v1, p4, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 83
    .line 84
    const-string p4, "is64bit"

    .line 85
    .line 86
    sget-object v4, Lcom/tencent/rmonitor/base/meta/BaseInfo;->is64Bit:Ljava/lang/Boolean;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v1, p4, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 90
    .line 91
    .line 92
    invoke-virtual {v1, v2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v1, v3, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 96
    .line 97
    iget-object p1, p3, Lcom/tencent/rmonitor/base/meta/DumpResult;->zipFilePath:Ljava/lang/String;

    .line 98
    .line 99
    const-string p2, "fileObj"

    .line 100
    .line 101
    .line 102
    invoke-virtual {v1, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 103
    .line 104
    .line 105
    const-string/jumbo p2, "stage"

    .line 106
    .line 107
    .line 108
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    .line 109
    move-result-object p4

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 113
    .line 114
    iget-object p2, p3, Lcom/tencent/rmonitor/base/meta/DumpResult;->hprofPath:Ljava/lang/String;

    .line 115
    .line 116
    new-instance p3, Lorg/json/JSONObject;

    .line 117
    .line 118
    .line 119
    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 120
    .line 121
    const-string p4, "hprof_file"

    .line 122
    .line 123
    sget-object v2, Ljava/io/File;->separator:Ljava/lang/String;

    .line 124
    .line 125
    .line 126
    invoke-virtual {p2, v2}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I

    .line 127
    move-result v2

    .line 128
    const/4 v3, 0x1

    .line 129
    add-int/2addr v2, v3

    .line 130
    .line 131
    .line 132
    invoke-virtual {p2, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    .line 133
    move-result-object p2

    .line 134
    .line 135
    .line 136
    invoke-virtual {p3, p4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 137
    .line 138
    sget-object p2, Lcom/tencent/rmonitor/base/meta/BaseInfo;->app:Landroid/app/Application;

    .line 139
    .line 140
    const-string p4, "memory"

    .line 141
    .line 142
    const-string v2, "activity_leak"

    .line 143
    .line 144
    sget-object v4, Lcom/tencent/rmonitor/base/meta/BaseInfo;->userMeta:Lcom/tencent/bugly/common/meta/UserMeta;

    .line 145
    .line 146
    .line 147
    invoke-static {p2, p4, v2, v4}, Lcom/tencent/bugly/proguard/nf;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Lcom/tencent/bugly/common/meta/UserMeta;)Lorg/json/JSONObject;

    .line 148
    move-result-object p2

    .line 149
    .line 150
    const-string p4, "Attributes"

    .line 151
    .line 152
    .line 153
    invoke-virtual {p2, p4, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 154
    .line 155
    const-string p4, "Body"

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2, p4, p3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 159
    .line 160
    new-instance p3, Lcom/tencent/bugly/common/reporter/data/ReportData;

    .line 161
    .line 162
    iget-object p4, v4, Lcom/tencent/bugly/common/meta/UserMeta;->uin:Ljava/lang/String;

    .line 163
    .line 164
    const-string v1, "MemoryLeak"

    .line 165
    .line 166
    .line 167
    invoke-direct {p3, p4, v3, v1, p2}, Lcom/tencent/bugly/common/reporter/data/ReportData;-><init>(Ljava/lang/String;ILjava/lang/String;Lorg/json/JSONObject;)V

    .line 168
    .line 169
    .line 170
    invoke-virtual {p3}, Lcom/tencent/bugly/common/reporter/data/ReportData;->getReportStrategy()Lcom/tencent/bugly/common/reporter/data/ReportStrategy;

    .line 171
    move-result-object p2

    .line 172
    .line 173
    sget-object p4, Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;->UPLOAD_WIFI:Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;

    .line 174
    .line 175
    .line 176
    invoke-virtual {p2, p4}, Lcom/tencent/bugly/common/reporter/data/ReportStrategy;->setUploadStrategy(Lcom/tencent/bugly/common/reporter/data/ReportStrategy$UploadStrategy;)V

    .line 177
    .line 178
    .line 179
    invoke-virtual {p3, p1, v3, v3}, Lcom/tencent/bugly/common/reporter/data/ReportData;->addFile(Ljava/lang/String;ZZ)V

    .line 180
    .line 181
    .line 182
    invoke-virtual {p3, v3}, Lcom/tencent/bugly/common/reporter/data/ReportData;->setShouldRecordLinkData(Z)V

    .line 183
    .line 184
    .line 185
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    .line 186
    move-result-object p1

    .line 187
    .line 188
    .line 189
    invoke-virtual {p1, p3}, Lcom/tencent/bugly/proguard/x3;->a(Lcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 190
    .line 191
    .line 192
    invoke-static {}, Lcom/tencent/bugly/proguard/x3$a;->a()Lcom/tencent/bugly/proguard/x3;

    .line 193
    move-result-object p1

    .line 194
    const/4 p2, 0x0

    .line 195
    .line 196
    .line 197
    invoke-virtual {p1, p2, p3}, Lcom/tencent/bugly/proguard/x3;->a(ZLcom/tencent/bugly/common/reporter/data/ReportData;)V

    .line 198
    .line 199
    sget-object p1, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->INSTANCE:Lcom/tencent/rmonitor/base/reporter/ReporterMachine;

    .line 200
    .line 201
    .line 202
    invoke-virtual {p1, p3, v0}, Lcom/tencent/rmonitor/base/reporter/ReporterMachine;->reportNow(Lcom/tencent/bugly/common/reporter/data/ReportData;Lcom/tencent/bugly/common/reporter/IReporter$ReportCallback;)Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 203
    return-object p3

    .line 204
    .line 205
    :goto_1
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 206
    .line 207
    const-string p3, "RMonitor_MemoryLeakReporter"

    .line 208
    .line 209
    .line 210
    invoke-virtual {p2, p3, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 211
    :cond_2
    return-object v0
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
.end method
