.class public Lcom/tencent/bugly/library/BuglyBuilder;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/library/BuglyConstants;


# static fields
.field public static final APP_STATE_BACKGROUND:Ljava/lang/String; = "background"

.field public static final APP_STATE_FOREGROUND:Ljava/lang/String; = "foreground"

.field public static final ServerHostTypeBuglyCloud:Ljava/lang/String; = "https://cloud.bugly.qq.com"

.field public static final ServerHostTypeBuglyCloudSGP:Ljava/lang/String; = "https://buglycloud.sgp.tencent.com"

.field public static final ServerHostTypeBuglyIOT:Ljava/lang/String; = "https://buglypro.iot-tencent.com"

.field public static final ServerHostTypeBuglyOversea:Ljava/lang/String; = "https://android.bugly.tencent.com"

.field public static final ServerHostTypeBuglyPro:Ljava/lang/String; = "https://pro.bugly.qq.com"

.field public static final ServerHostTypeDefault:Ljava/lang/String; = "https://rmonitor.qq.com"


# instance fields
.field public final a:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public appChannel:Ljava/lang/String;

.field public final appId:Ljava/lang/String;

.field public final appKey:Ljava/lang/String;

.field public appVersion:Ljava/lang/String;

.field public appVersionType:Ljava/lang/String;

.field public final b:Lcom/tencent/bugly/proguard/u3;

.field public buildNumber:Ljava/lang/String;

.field public final c:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public cacheDataIntervalMs:J

.field public debugMode:Z

.field public deviceModel:Ljava/lang/String;

.field public enableAllThreadStackAnr:Z

.field public enableAllThreadStackCrash:Z

.field public enableCrashProtect:Z

.field public fetchConfigFromServerInSubProcess:Z

.field public hotPatchNum:Ljava/lang/String;

.field public initAppState:Ljava/lang/String;

.field public logLevel:I

.field public serverHostType:Ljava/lang/String;

.field public spProvider:Lcom/tencent/bugly/common/sp/ISharedPreferencesProvider;

.field public uniqueId:Ljava/lang/String;

.field public userId:Ljava/lang/String;


# direct methods
.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;)V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->appVersion:Ljava/lang/String;

    .line 7
    .line 8
    iput-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->buildNumber:Ljava/lang/String;

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->uniqueId:Ljava/lang/String;

    .line 11
    .line 12
    iput-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->userId:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    const-string/jumbo v1, "unknown"

    .line 16
    .line 17
    iput-object v1, p0, Lcom/tencent/bugly/library/BuglyBuilder;->deviceModel:Ljava/lang/String;

    .line 18
    const/4 v1, 0x0

    .line 19
    .line 20
    iput-boolean v1, p0, Lcom/tencent/bugly/library/BuglyBuilder;->debugMode:Z

    .line 21
    .line 22
    const-string v2, "Unknown"

    .line 23
    .line 24
    iput-object v2, p0, Lcom/tencent/bugly/library/BuglyBuilder;->appVersionType:Ljava/lang/String;

    .line 25
    .line 26
    sget v2, Lcom/tencent/bugly/library/BuglyLogLevel;->LEVEL_WARN:I

    .line 27
    .line 28
    iput v2, p0, Lcom/tencent/bugly/library/BuglyBuilder;->logLevel:I

    .line 29
    .line 30
    iput-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->appChannel:Ljava/lang/String;

    .line 31
    const/4 v2, 0x1

    .line 32
    .line 33
    iput-boolean v2, p0, Lcom/tencent/bugly/library/BuglyBuilder;->enableAllThreadStackCrash:Z

    .line 34
    .line 35
    iput-boolean v2, p0, Lcom/tencent/bugly/library/BuglyBuilder;->enableAllThreadStackAnr:Z

    .line 36
    .line 37
    iput-boolean v2, p0, Lcom/tencent/bugly/library/BuglyBuilder;->enableCrashProtect:Z

    .line 38
    .line 39
    iput-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->hotPatchNum:Ljava/lang/String;

    .line 40
    .line 41
    iput-boolean v1, p0, Lcom/tencent/bugly/library/BuglyBuilder;->fetchConfigFromServerInSubProcess:Z

    .line 42
    .line 43
    iput-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->spProvider:Lcom/tencent/bugly/common/sp/ISharedPreferencesProvider;

    .line 44
    .line 45
    iput-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->serverHostType:Ljava/lang/String;

    .line 46
    .line 47
    iput-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->initAppState:Ljava/lang/String;

    .line 48
    .line 49
    .line 50
    const-wide/32 v3, 0x1b7740

    .line 51
    .line 52
    iput-wide v3, p0, Lcom/tencent/bugly/library/BuglyBuilder;->cacheDataIntervalMs:J

    .line 53
    .line 54
    new-instance v1, Ljava/util/ArrayList;

    .line 55
    .line 56
    .line 57
    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 58
    .line 59
    iput-object v1, p0, Lcom/tencent/bugly/library/BuglyBuilder;->c:Ljava/util/ArrayList;

    .line 60
    .line 61
    iput-object p1, p0, Lcom/tencent/bugly/library/BuglyBuilder;->appId:Ljava/lang/String;

    .line 62
    .line 63
    iput-object p2, p0, Lcom/tencent/bugly/library/BuglyBuilder;->appKey:Ljava/lang/String;

    .line 64
    .line 65
    new-instance p1, Lcom/tencent/bugly/proguard/u3;

    .line 66
    .line 67
    .line 68
    invoke-direct {p1}, Lcom/tencent/bugly/proguard/u3;-><init>()V

    .line 69
    .line 70
    iput-object p1, p0, Lcom/tencent/bugly/library/BuglyBuilder;->b:Lcom/tencent/bugly/proguard/u3;

    .line 71
    .line 72
    .line 73
    invoke-virtual {p1, v2}, Lcom/tencent/bugly/proguard/u3;->d(Z)V

    .line 74
    .line 75
    .line 76
    invoke-virtual {p1, v2}, Lcom/tencent/bugly/proguard/u3;->b(Z)V

    .line 77
    .line 78
    .line 79
    invoke-virtual {p1, v2}, Lcom/tencent/bugly/proguard/u3;->c(Z)V

    .line 80
    .line 81
    .line 82
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/u3;->a(Lcom/tencent/feedback/eup/CrashHandleListener;)V

    .line 83
    .line 84
    .line 85
    invoke-virtual {p1, v0}, Lcom/tencent/bugly/proguard/u3;->a(Lcom/tencent/feedback/upload/UploadHandleListener;)V

    .line 86
    .line 87
    new-instance p1, Ljava/util/ArrayList;

    .line 88
    .line 89
    .line 90
    invoke-direct {p1}, Ljava/util/ArrayList;-><init>()V

    .line 91
    .line 92
    iput-object p1, p0, Lcom/tencent/bugly/library/BuglyBuilder;->a:Ljava/util/List;

    .line 93
    .line 94
    const-string p2, "looper_metric"

    .line 95
    .line 96
    .line 97
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 98
    .line 99
    const-string p2, "looper_stack"

    .line 100
    .line 101
    .line 102
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 103
    .line 104
    const-string p2, "launch_metric"

    .line 105
    .line 106
    .line 107
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 108
    .line 109
    const-string p2, "memory_quantile"

    .line 110
    .line 111
    .line 112
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 113
    .line 114
    .line 115
    const-string/jumbo p2, "sub_memory_quantile"

    .line 116
    .line 117
    .line 118
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 119
    .line 120
    const-string p2, "activity_leak"

    .line 121
    .line 122
    .line 123
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 124
    .line 125
    const-string p2, "big_bitmap"

    .line 126
    .line 127
    .line 128
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 129
    .line 130
    .line 131
    const-string/jumbo p2, "net_quality"

    .line 132
    .line 133
    .line 134
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 135
    .line 136
    const-string p2, "java_memory_ceiling_hprof"

    .line 137
    .line 138
    .line 139
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 140
    .line 141
    .line 142
    const-string/jumbo p2, "page_launch"

    .line 143
    .line 144
    .line 145
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 146
    .line 147
    const-string p2, "custom_event"

    .line 148
    .line 149
    .line 150
    invoke-interface {p1, p2}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 151
    return-void
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


# virtual methods
.method public a()Lcom/tencent/bugly/proguard/u3;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->b:Lcom/tencent/bugly/proguard/u3;

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

.method public addEmergencyReportPlugin(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 13
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

.method public addMonitor(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->a:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    .line 6
    move-result v0

    .line 7
    .line 8
    if-nez v0, :cond_0

    .line 9
    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->a:Ljava/util/List;

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 14
    :cond_0
    return-void
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

.method public b()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->a:Ljava/util/List;

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

.method public getEmergencyReportPlugins()Ljava/util/ArrayList;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->c:Ljava/util/ArrayList;

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

.method public removeEmergencyReportPlugin(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->c:Ljava/util/ArrayList;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z

    .line 13
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

.method public removeMonitor(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->a:Ljava/util/List;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0, p1}, Ljava/util/List;->remove(Ljava/lang/Object;)Z

    .line 6
    return-void
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
    .line 25
.end method

.method public setCrashHandleListener(Lcom/tencent/feedback/eup/CrashHandleListener;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->b:Lcom/tencent/bugly/proguard/u3;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/u3;->a(Lcom/tencent/feedback/eup/CrashHandleListener;)V

    .line 6
    return-void
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
    .line 25
.end method

.method public setEnableRecordAnrMainStack(Z)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->b:Lcom/tencent/bugly/proguard/u3;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/u3;->e(Z)V

    .line 8
    :cond_0
    return-void
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
    .line 25
.end method

.method public setQutLibraryPath(Ljava/util/ArrayList;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcom/tencent/bugly/proguard/n3;->a(Ljava/util/ArrayList;)V

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
    .line 25
.end method

.method public setServerHostType(Ljava/lang/String;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    iput-object p1, p0, Lcom/tencent/bugly/library/BuglyBuilder;->serverHostType:Ljava/lang/String;

    .line 9
    :cond_0
    return-void
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
    .line 25
.end method

.method public setUploadHandleListener(Lcom/tencent/feedback/upload/UploadHandleListener;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/library/BuglyBuilder;->b:Lcom/tencent/bugly/proguard/u3;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p1}, Lcom/tencent/bugly/proguard/u3;->a(Lcom/tencent/feedback/upload/UploadHandleListener;)V

    .line 6
    return-void
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
    .line 25
.end method
