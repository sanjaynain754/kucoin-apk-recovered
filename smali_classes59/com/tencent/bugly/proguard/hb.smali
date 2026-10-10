.class public Lcom/tencent/bugly/proguard/hb;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# static fields
.field public static final t:Ljava/lang/String; = "list_metric"

.field public static final u:Ljava/lang/String; = "FrameCallback"

.field public static final v:Ljava/lang/String; = "FrameMetric"


# instance fields
.field public n:Z

.field public o:Z

.field public p:Ljava/lang/String;

.field public q:J

.field public r:Z

.field public s:Ljava/lang/String;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/hb;)V
    .locals 3

    .line 8
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Lcom/tencent/bugly/proguard/hf;)V

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/hb;->n:Z

    .line 10
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/hb;->o:Z

    const/4 v1, 0x0

    .line 11
    iput-object v1, p0, Lcom/tencent/bugly/proguard/hb;->p:Ljava/lang/String;

    const-wide/16 v1, 0xbb8

    .line 12
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/hb;->q:J

    .line 13
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/hb;->r:Z

    .line 14
    const-string v0, "FrameCallback"

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hb;->s:Ljava/lang/String;

    .line 15
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/hb;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 6

    const/4 v4, 0x0

    const/16 v5, 0xc8

    const/4 v2, 0x0

    const/16 v3, 0x3e8

    move-object v0, p0

    move-object v1, p1

    .line 1
    invoke-direct/range {v0 .. v5}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFI)V

    const/4 p1, 0x1

    .line 2
    iput-boolean p1, v0, Lcom/tencent/bugly/proguard/hb;->n:Z

    .line 3
    iput-boolean p1, v0, Lcom/tencent/bugly/proguard/hb;->o:Z

    const/4 v1, 0x0

    .line 4
    iput-object v1, v0, Lcom/tencent/bugly/proguard/hb;->p:Ljava/lang/String;

    const-wide/16 v1, 0xbb8

    .line 5
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/hb;->q:J

    .line 6
    iput-boolean p1, v0, Lcom/tencent/bugly/proguard/hb;->r:Z

    .line 7
    const-string p1, "FrameCallback"

    iput-object p1, v0, Lcom/tencent/bugly/proguard/hb;->s:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/hb;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 24
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/hf;->g:Z

    if-nez v0, :cond_2

    iget-boolean p1, p1, Lcom/tencent/bugly/proguard/hf;->g:Z

    if-eqz p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 p1, 0x0

    goto :goto_1

    :cond_2
    :goto_0
    const/4 p1, 0x1

    :goto_1
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/hf;->g:Z

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    .line 2
    instance-of v0, p1, Lcom/tencent/bugly/proguard/hb;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/tencent/bugly/proguard/hb;

    .line 4
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/hb;->n:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/hb;->n:Z

    .line 5
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/hb;->o:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/hb;->o:Z

    .line 6
    iget-object v0, p1, Lcom/tencent/bugly/proguard/hb;->p:Ljava/lang/String;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/hb;->p:Ljava/lang/String;

    .line 7
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/hb;->q:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/hb;->q:J

    .line 8
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/hb;->r:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/hb;->r:Z

    .line 9
    iget-object p1, p1, Lcom/tencent/bugly/proguard/hb;->s:Ljava/lang/String;

    iput-object p1, p0, Lcom/tencent/bugly/proguard/hb;->s:Ljava/lang/String;

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 9

    const-string v0, "collector"

    const-string/jumbo v1, "report_background"

    const-string/jumbo v2, "report_background_delay"

    const-string v3, "enable_activity_switch"

    const-string v4, "enable_custom_stage"

    if-nez p1, :cond_0

    goto :goto_2

    .line 10
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lorg/json/JSONObject;)V

    .line 11
    :try_start_0
    const-string/jumbo v5, "name"

    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    iput-object v5, p0, Lcom/tencent/bugly/proguard/hb;->p:Ljava/lang/String;

    .line 12
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x1

    if-eqz v5, :cond_1

    .line 13
    invoke-virtual {p1, v4, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v4

    iput-boolean v4, p0, Lcom/tencent/bugly/proguard/hb;->n:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 14
    :cond_1
    :goto_0
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 15
    invoke-virtual {p1, v3, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v3

    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/hb;->o:Z

    .line 16
    :cond_2
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    const-wide/16 v3, 0x0

    .line 17
    invoke-virtual {p1, v2, v3, v4}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v7

    .line 18
    invoke-static {v7, v8, v3, v4}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v2

    iput-wide v2, p0, Lcom/tencent/bugly/proguard/hb;->q:J

    .line 19
    :cond_3
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 20
    invoke-virtual {p1, v1, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/hb;->r:Z

    .line 21
    :cond_4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 22
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/tencent/bugly/proguard/hb;->s:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 23
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    invoke-virtual {v0, v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public bridge synthetic b()Lcom/tencent/bugly/proguard/hf;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hb;->c()Lcom/tencent/bugly/proguard/hb;

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

.method public c()Lcom/tencent/bugly/proguard/hb;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/hb;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/hb;-><init>(Lcom/tencent/bugly/proguard/hb;)V

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
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hb;->c()Lcom/tencent/bugly/proguard/hb;

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
