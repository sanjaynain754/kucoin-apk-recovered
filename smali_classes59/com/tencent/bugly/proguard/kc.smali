.class public Lcom/tencent/bugly/proguard/kc;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final g:J = 0xfe502bL

.field public static final h:J = 0xf4240L

.field public static final i:Ljava/lang/String; = "RMonitor_looper_metric"


# instance fields
.field public b:J

.field public c:Z

.field public d:Z

.field public final e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

.field public f:Lcom/tencent/bugly/proguard/jf;


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-wide/16 v0, 0xc8

    .line 6
    .line 7
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/kc;->b:J

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->c:Z

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->d:Z

    .line 13
    .line 14
    new-instance v0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    .line 15
    .line 16
    .line 17
    invoke-direct {v0}, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;-><init>()V

    .line 18
    .line 19
    iput-object v0, p0, Lcom/tencent/bugly/proguard/kc;->e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    .line 20
    const/4 v0, 0x0

    .line 21
    .line 22
    iput-object v0, p0, Lcom/tencent/bugly/proguard/kc;->f:Lcom/tencent/bugly/proguard/jf;

    .line 23
    return-void
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


# virtual methods
.method public final a(Lcom/tencent/bugly/proguard/f7;JJ)V
    .locals 8

    .line 18
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/f7;->d()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 19
    iget-object v1, p0, Lcom/tencent/bugly/proguard/kc;->f:Lcom/tencent/bugly/proguard/jf;

    if-eqz v1, :cond_0

    .line 20
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/f7;->b()J

    move-result-wide v2

    move-wide v4, p2

    move-wide v6, p4

    invoke-virtual/range {v1 .. v7}, Lcom/tencent/bugly/proguard/jf;->a(JJJ)V

    goto :goto_0

    :cond_0
    move-wide v4, p2

    .line 21
    :goto_0
    iget-wide p2, p0, Lcom/tencent/bugly/proguard/kc;->b:J

    cmp-long p2, v4, p2

    if-lez p2, :cond_1

    const-string p2, "frame_lag"

    invoke-static {p2}, Lcom/tencent/bugly/proguard/g2;->a(Ljava/lang/String;)Z

    move-result p3

    if-eqz p3, :cond_1

    .line 22
    :try_start_0
    new-instance p3, Lorg/json/JSONObject;

    invoke-direct {p3}, Lorg/json/JSONObject;-><init>()V

    .line 23
    const-string/jumbo p4, "name"

    invoke-virtual {p3, p4, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 24
    const-string/jumbo p2, "timeStamp"

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p4

    invoke-virtual {p3, p2, p4, p5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 25
    const-string/jumbo p2, "scene"

    iget-object p4, p0, Lcom/tencent/bugly/proguard/kc;->e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    iget-object p4, p4, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->scene:Ljava/lang/String;

    invoke-virtual {p3, p2, p4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 26
    const-string p2, "delay"

    invoke-virtual {p3, p2, v4, v5}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 27
    const-string p2, "isRealUIRefreshed"

    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/f7;->d()Z

    move-result p1

    invoke-virtual {p3, p2, p1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Z)Lorg/json/JSONObject;

    .line 28
    invoke-static {p3}, Lcom/tencent/bugly/proguard/g2;->a(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_1
    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/jf;)V
    .locals 0

    .line 17
    iput-object p1, p0, Lcom/tencent/bugly/proguard/kc;->f:Lcom/tencent/bugly/proguard/jf;

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 3

    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/kc;->e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->reset()V

    .line 15
    iget-object v0, p0, Lcom/tencent/bugly/proguard/kc;->e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    iput-object p1, v0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->scene:Ljava/lang/String;

    .line 16
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    iput-wide v1, v0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->timeStamp:J

    return-void
.end method

.method public a(Ljava/lang/String;J)Z
    .locals 3
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    invoke-static {}, Lcom/tencent/bugly/common/utils/AndroidVersion;->isOverJellyBean()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "RMonitor_looper_metric"

    if-nez v0, :cond_0

    .line 2
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "Build.VERSION.SDK_INT is to low."

    filled-new-array {v2, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return v1

    .line 3
    :cond_0
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lcom/tencent/bugly/proguard/ah;->a(Landroid/os/Looper;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo p2, "start, not in main looper"

    filled-new-array {v2, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return v1

    .line 5
    :cond_1
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->c:Z

    if-eqz v0, :cond_2

    .line 6
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string/jumbo p2, "start, has start before."

    filled-new-array {v2, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return v1

    .line 7
    :cond_2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 8
    const-string/jumbo v1, "start scene: "

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 9
    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 10
    iput-wide p2, p0, Lcom/tencent/bugly/proguard/kc;->b:J

    .line 11
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/kc;->a(Ljava/lang/String;)V

    const/4 p1, 0x1

    .line 12
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/kc;->c:Z

    .line 13
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/kc;->d:Z

    return p1
.end method

.method public b()Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/kc;->e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    return-object v0
.end method

.method public b(Lcom/tencent/bugly/proguard/f7;)V
    .locals 12

    if-eqz p1, :cond_7

    .line 2
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/f7;->c()Z

    move-result v0

    if-eqz v0, :cond_0

    goto/16 :goto_2

    .line 3
    :cond_0
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/f7;->a()J

    move-result-wide v0

    const-wide/32 v2, 0xf4240

    .line 4
    div-long v6, v0, v2

    const-wide/16 v4, 0x0

    cmp-long v8, v6, v4

    if-gez v8, :cond_1

    goto/16 :goto_2

    .line 5
    :cond_1
    iget-wide v8, p0, Lcom/tencent/bugly/proguard/kc;->b:J

    cmp-long v8, v6, v8

    if-lez v8, :cond_2

    .line 6
    iget-object v8, p0, Lcom/tencent/bugly/proguard/kc;->e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    iget-wide v9, v8, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->suspendDuration:J

    add-long/2addr v9, v6

    iput-wide v9, v8, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->suspendDuration:J

    .line 7
    :cond_2
    iget-object v8, p0, Lcom/tencent/bugly/proguard/kc;->e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    iget-wide v9, v8, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->totalDuration:J

    add-long/2addr v9, v6

    iput-wide v9, v8, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->totalDuration:J

    .line 8
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/f7;->d()Z

    move-result v8

    if-eqz v8, :cond_6

    const-wide/32 v8, 0xfe502b

    cmp-long v10, v0, v8

    const/4 v11, 0x0

    if-lez v10, :cond_3

    sub-long v4, v0, v8

    .line 9
    div-long/2addr v4, v2

    .line 10
    div-long v2, v0, v8

    long-to-int v2, v2

    goto :goto_0

    :cond_3
    move v2, v11

    .line 11
    :goto_0
    iget-object v3, p0, Lcom/tencent/bugly/proguard/kc;->e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    iget-object v3, v3, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->refreshCount:[J

    array-length v8, v3

    if-lt v2, v8, :cond_4

    .line 12
    array-length v0, v3

    add-int/lit8 v11, v0, -0x1

    goto :goto_1

    :cond_4
    if-gez v2, :cond_5

    .line 13
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v8, "invalid nanoSecondDelay: "

    invoke-direct {v3, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    const-string v1, "RMonitor_looper_metric"

    filled-new-array {v1, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    goto :goto_1

    :cond_5
    move v11, v2

    .line 14
    :goto_1
    iget-object v0, p0, Lcom/tencent/bugly/proguard/kc;->e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    iget-wide v1, v0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->hitchesDuration:J

    add-long/2addr v1, v4

    iput-wide v1, v0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->hitchesDuration:J

    .line 15
    iget-object v1, v0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->refreshCount:[J

    aget-wide v2, v1, v11

    const-wide/16 v8, 0x1

    add-long/2addr v2, v8

    aput-wide v2, v1, v11

    .line 16
    iget-object v0, v0, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->refreshDuration:[J

    aget-wide v1, v0, v11

    add-long/2addr v1, v6

    aput-wide v1, v0, v11

    :cond_6
    move-wide v8, v4

    move-object v4, p0

    move-object v5, p1

    .line 17
    :try_start_0
    invoke-virtual/range {v4 .. v9}, Lcom/tencent/bugly/proguard/kc;->a(Lcom/tencent/bugly/proguard/f7;JJ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :catchall_0
    :cond_7
    :goto_2
    return-void
.end method

.method public c()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->d:Z

    .line 3
    .line 4
    xor-int/lit8 v0, v0, 0x1

    .line 5
    return v0
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

.method public d()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->c:Z

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

.method public e()Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ah;->a(Landroid/os/Looper;)Z

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    const-string v2, "RMonitor_looper_metric"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    .line 18
    const-string/jumbo v3, "pause, not in main looper"

    .line 19
    .line 20
    .line 21
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 26
    return v1

    .line 27
    .line 28
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->c:Z

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->d:Z

    .line 33
    .line 34
    if-nez v0, :cond_1

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 38
    .line 39
    new-instance v3, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string/jumbo v4, "pause scene: "

    .line 43
    .line 44
    .line 45
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    iget-object v4, p0, Lcom/tencent/bugly/proguard/kc;->e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    .line 48
    .line 49
    iget-object v4, v4, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->scene:Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    move-result-object v3

    .line 57
    .line 58
    .line 59
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 60
    move-result-object v2

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 64
    .line 65
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/kc;->d:Z

    .line 66
    const/4 v0, 0x1

    .line 67
    return v0

    .line 68
    .line 69
    :cond_2
    :goto_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 70
    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string/jumbo v4, "pause, isStarted: "

    .line 75
    .line 76
    .line 77
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    iget-boolean v4, p0, Lcom/tencent/bugly/proguard/kc;->c:Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v4, ", isResumed: "

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    iget-boolean v4, p0, Lcom/tencent/bugly/proguard/kc;->d:Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    move-result-object v3

    .line 97
    .line 98
    .line 99
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 104
    return v1
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

.method public f()Z
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ah;->a(Landroid/os/Looper;)Z

    .line 8
    move-result v0

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    const-string v2, "RMonitor_looper_metric"

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    .line 18
    const-string/jumbo v3, "resume, not in main looper"

    .line 19
    .line 20
    .line 21
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 22
    move-result-object v2

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 26
    return v1

    .line 27
    .line 28
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->c:Z

    .line 29
    .line 30
    if-eqz v0, :cond_2

    .line 31
    .line 32
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->d:Z

    .line 33
    .line 34
    if-eqz v0, :cond_1

    .line 35
    goto :goto_0

    .line 36
    .line 37
    :cond_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 38
    .line 39
    new-instance v1, Ljava/lang/StringBuilder;

    .line 40
    .line 41
    .line 42
    const-string/jumbo v3, "resume scene: "

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 46
    .line 47
    iget-object v3, p0, Lcom/tencent/bugly/proguard/kc;->e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    .line 48
    .line 49
    iget-object v3, v3, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->scene:Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 56
    move-result-object v1

    .line 57
    .line 58
    .line 59
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 60
    move-result-object v1

    .line 61
    .line 62
    .line 63
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 64
    const/4 v0, 0x1

    .line 65
    .line 66
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->d:Z

    .line 67
    return v0

    .line 68
    .line 69
    :cond_2
    :goto_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 70
    .line 71
    new-instance v3, Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    const-string/jumbo v4, "resume, isStarted: "

    .line 75
    .line 76
    .line 77
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 78
    .line 79
    iget-boolean v4, p0, Lcom/tencent/bugly/proguard/kc;->c:Z

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 83
    .line 84
    const-string v4, ", isResumed: "

    .line 85
    .line 86
    .line 87
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 88
    .line 89
    iget-boolean v4, p0, Lcom/tencent/bugly/proguard/kc;->d:Z

    .line 90
    .line 91
    .line 92
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    move-result-object v3

    .line 97
    .line 98
    .line 99
    filled-new-array {v2, v3}, [Ljava/lang/String;

    .line 100
    move-result-object v2

    .line 101
    .line 102
    .line 103
    invoke-virtual {v0, v2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 104
    return v1
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

.method public g()Z
    .locals 5
    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lcom/tencent/bugly/proguard/ah;->a(Landroid/os/Looper;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    const-string v1, "RMonitor_looper_metric"

    .line 11
    const/4 v2, 0x0

    .line 12
    .line 13
    if-nez v0, :cond_0

    .line 14
    .line 15
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 16
    .line 17
    .line 18
    const-string/jumbo v3, "stop, not in main looper"

    .line 19
    .line 20
    .line 21
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 22
    move-result-object v1

    .line 23
    .line 24
    .line 25
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    .line 26
    return v2

    .line 27
    .line 28
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/kc;->c:Z

    .line 29
    .line 30
    if-nez v0, :cond_1

    .line 31
    .line 32
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 33
    .line 34
    .line 35
    const-string/jumbo v3, "stop, not start yet."

    .line 36
    .line 37
    .line 38
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 39
    move-result-object v1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 43
    return v2

    .line 44
    .line 45
    :cond_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 46
    .line 47
    new-instance v3, Ljava/lang/StringBuilder;

    .line 48
    .line 49
    .line 50
    const-string/jumbo v4, "stop scene: "

    .line 51
    .line 52
    .line 53
    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 54
    .line 55
    iget-object v4, p0, Lcom/tencent/bugly/proguard/kc;->e:Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;

    .line 56
    .line 57
    iget-object v4, v4, Lcom/tencent/rmonitor/base/meta/DropFrameResultMeta;->scene:Ljava/lang/String;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    move-result-object v3

    .line 65
    .line 66
    .line 67
    filled-new-array {v1, v3}, [Ljava/lang/String;

    .line 68
    move-result-object v1

    .line 69
    .line 70
    .line 71
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 72
    .line 73
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/kc;->c:Z

    .line 74
    .line 75
    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/kc;->d:Z

    .line 76
    const/4 v0, 0x1

    .line 77
    return v0
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
