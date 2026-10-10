.class public Lcom/tencent/bugly/proguard/t2;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final g:J = 0x3e8L


# instance fields
.field public a:Lorg/json/JSONObject;

.field public b:I

.field public c:Ljava/lang/String;

.field public d:J

.field public e:J

.field public f:J


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/t2;->a:Lorg/json/JSONObject;

    .line 7
    const/4 v1, 0x0

    .line 8
    .line 9
    iput v1, p0, Lcom/tencent/bugly/proguard/t2;->b:I

    .line 10
    .line 11
    iput-object v0, p0, Lcom/tencent/bugly/proguard/t2;->c:Ljava/lang/String;

    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/t2;->d:J

    .line 16
    .line 17
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/t2;->e:J

    .line 18
    .line 19
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/t2;->f:J

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/t2;->a()V

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
.method public a()V
    .locals 2

    const/4 v0, 0x0

    .line 1
    iput-object v0, p0, Lcom/tencent/bugly/proguard/t2;->a:Lorg/json/JSONObject;

    const/4 v1, 0x0

    .line 2
    iput v1, p0, Lcom/tencent/bugly/proguard/t2;->b:I

    .line 3
    iput-object v0, p0, Lcom/tencent/bugly/proguard/t2;->c:Ljava/lang/String;

    const-wide/16 v0, 0x0

    .line 4
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/t2;->d:J

    .line 5
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/t2;->e:J

    .line 6
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/t2;->f:J

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/t2;)V
    .locals 2

    if-nez p1, :cond_0

    return-void

    .line 7
    :cond_0
    iget-object v0, p1, Lcom/tencent/bugly/proguard/t2;->a:Lorg/json/JSONObject;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/t2;->a:Lorg/json/JSONObject;

    .line 8
    iget v0, p1, Lcom/tencent/bugly/proguard/t2;->b:I

    iput v0, p0, Lcom/tencent/bugly/proguard/t2;->b:I

    .line 9
    iget-object v0, p1, Lcom/tencent/bugly/proguard/t2;->c:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/t2;->c:Ljava/lang/String;

    .line 10
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/t2;->d:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/t2;->d:J

    .line 11
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/t2;->e:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/t2;->e:J

    .line 12
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/t2;->f:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/t2;->f:J

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 5

    .line 20
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->debug:Z

    if-eqz v0, :cond_0

    .line 21
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", status: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget p1, p0, Lcom/tencent/bugly/proguard/t2;->b:I

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, ", md5code: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object p1, p0, Lcom/tencent/bugly/proguard/t2;->c:Ljava/lang/String;

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p1, ", next_time_in_sec: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/tencent/bugly/proguard/t2;->d:J

    const-wide/16 v3, 0x3e8

    div-long/2addr v1, v3

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", config_latest_update_time_in_sec: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/tencent/bugly/proguard/t2;->e:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string p1, ", last_load_config_time_in_ms: "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/tencent/bugly/proguard/t2;->f:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    .line 22
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 7

    if-nez p1, :cond_0

    return-void

    .line 13
    :cond_0
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/t2;->f:J

    .line 14
    const-string/jumbo v0, "status"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    iput v0, p0, Lcom/tencent/bugly/proguard/t2;->b:I

    .line 15
    const-string v0, "data"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/t2;->a:Lorg/json/JSONObject;

    .line 16
    const-string v0, "md5code"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/tencent/bugly/proguard/t2;->c:Ljava/lang/String;

    .line 17
    const-string/jumbo v0, "next_time_in_sec"

    const-wide/16 v1, 0x0

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v3

    const-wide/16 v5, 0x3e8

    mul-long/2addr v3, v5

    iput-wide v3, p0, Lcom/tencent/bugly/proguard/t2;->d:J

    .line 18
    const-string v0, "config_latest_update_time"

    invoke-virtual {p1, v0, v1, v2}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/t2;->e:J

    .line 19
    const-string p1, "apply result from json"

    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/t2;->a(Ljava/lang/String;)V

    return-void
.end method
