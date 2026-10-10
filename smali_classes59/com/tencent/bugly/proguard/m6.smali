.class public Lcom/tencent/bugly/proguard/m6;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static final s:I = 0x1


# instance fields
.field public n:I

.field public o:I

.field public p:Z

.field public q:Z

.field public r:D


# direct methods
.method public constructor <init>()V
    .locals 7

    const v5, 0x3dcccccd    # 0.1f

    const/16 v6, 0x320

    .line 1
    const-string v1, "fd_leak"

    const/4 v2, 0x0

    const/16 v3, 0xa

    const/high16 v4, 0x3f000000    # 0.5f

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFFI)V

    const/4 v1, 0x1

    .line 2
    iput v1, v0, Lcom/tencent/bugly/proguard/m6;->n:I

    const/16 v1, 0x9

    .line 3
    iput v1, v0, Lcom/tencent/bugly/proguard/m6;->o:I

    const/4 v1, 0x0

    .line 4
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/m6;->p:Z

    .line 5
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/m6;->q:Z

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 6
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/m6;->r:D

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/m6;)V
    .locals 2

    .line 7
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Lcom/tencent/bugly/proguard/hf;)V

    const/4 v0, 0x1

    .line 8
    iput v0, p0, Lcom/tencent/bugly/proguard/m6;->n:I

    const/16 v0, 0x9

    .line 9
    iput v0, p0, Lcom/tencent/bugly/proguard/m6;->o:I

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/m6;->p:Z

    .line 11
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/m6;->q:Z

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 12
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/m6;->r:D

    .line 13
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/m6;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    .line 2
    instance-of v0, p1, Lcom/tencent/bugly/proguard/m6;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/tencent/bugly/proguard/m6;

    .line 4
    iget v0, p1, Lcom/tencent/bugly/proguard/m6;->n:I

    iput v0, p0, Lcom/tencent/bugly/proguard/m6;->n:I

    .line 5
    iget v0, p1, Lcom/tencent/bugly/proguard/m6;->o:I

    iput v0, p0, Lcom/tencent/bugly/proguard/m6;->o:I

    .line 6
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/m6;->p:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/m6;->p:Z

    .line 7
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/m6;->q:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/m6;->q:Z

    .line 8
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/m6;->r:D

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/m6;->r:D

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 6

    const-string v0, "hprof_dump_ratio"

    const-string/jumbo v1, "use_fd_track_feature"

    const-string v2, "check_leak_in_native"

    const-string v3, "hprof_strip_switch"

    const-string v4, "fd_monitor_switch"

    if-nez p1, :cond_0

    goto :goto_2

    .line 9
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lorg/json/JSONObject;)V

    .line 10
    :try_start_0
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 11
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v4

    iput v4, p0, Lcom/tencent/bugly/proguard/m6;->n:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 12
    :cond_1
    :goto_0
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 13
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    iput v3, p0, Lcom/tencent/bugly/proguard/m6;->o:I

    .line 14
    :cond_2
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 15
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/m6;->p:Z

    .line 16
    :cond_3
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 17
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/m6;->q:Z

    .line 18
    :cond_4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 19
    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/m6;->r:D
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 20
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    const-string/jumbo v2, "parsePluginConfig"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic b()Lcom/tencent/bugly/proguard/hf;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/m6;->c()Lcom/tencent/bugly/proguard/m6;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public c()Lcom/tencent/bugly/proguard/m6;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/m6;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/m6;-><init>(Lcom/tencent/bugly/proguard/m6;)V

    .line 6
    return-object v0
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

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/m6;->c()Lcom/tencent/bugly/proguard/m6;

    .line 4
    move-result-object v0

    .line 5
    return-object v0
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

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    const-string v1, "FdLeakPluginConfig{threshold="

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    iget v1, p0, Lcom/tencent/bugly/proguard/hf;->l:I

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v1, ", maxReportNum="

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 18
    .line 19
    iget v1, p0, Lcom/tencent/bugly/proguard/hf;->h:I

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 23
    .line 24
    const-string v1, ", eventSampleRatio="

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 28
    .line 29
    iget v1, p0, Lcom/tencent/bugly/proguard/hf;->j:F

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    .line 33
    .line 34
    const-string v1, ", fdMonitorSwitch="

    .line 35
    .line 36
    .line 37
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    iget v1, p0, Lcom/tencent/bugly/proguard/m6;->n:I

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    const-string v1, ", hprofStripSwitch="

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 48
    .line 49
    iget v1, p0, Lcom/tencent/bugly/proguard/m6;->o:I

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    const-string v1, ", checkLeakInNative="

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/m6;->p:Z

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 63
    .line 64
    const-string v1, ", useFdTrackFeature="

    .line 65
    .line 66
    .line 67
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 68
    .line 69
    iget-boolean v1, p0, Lcom/tencent/bugly/proguard/m6;->q:Z

    .line 70
    .line 71
    .line 72
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    const-string v1, ", hprofDumpRatio= "

    .line 75
    .line 76
    .line 77
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/m6;->r:D

    .line 80
    .line 81
    .line 82
    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    .line 85
    const-string/jumbo v1, "}"

    .line 86
    .line 87
    .line 88
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 92
    move-result-object v0

    .line 93
    return-object v0
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
