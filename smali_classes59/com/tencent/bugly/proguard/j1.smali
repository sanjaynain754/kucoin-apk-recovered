.class public Lcom/tencent/bugly/proguard/j1;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# static fields
.field public static final v:Ljava/lang/String; = "BatteryElementPluginConfig"


# instance fields
.field public n:J

.field public o:J

.field public p:J

.field public q:J

.field public r:J

.field public s:J

.field public t:J

.field public u:J


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v5, 0x0

    const/16 v6, 0x64

    .line 1
    const-string v1, "battery_element"

    const/4 v2, 0x0

    const/16 v3, 0x3e8

    const/high16 v4, 0x3f000000    # 0.5f

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFFI)V

    const-wide/16 v1, 0x2710

    .line 2
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/j1;->n:J

    const-wide/16 v3, 0x7530

    .line 3
    iput-wide v3, v0, Lcom/tencent/bugly/proguard/j1;->o:J

    const-wide/16 v5, 0x14

    .line 4
    iput-wide v5, v0, Lcom/tencent/bugly/proguard/j1;->p:J

    .line 5
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/j1;->q:J

    .line 6
    iput-wide v3, v0, Lcom/tencent/bugly/proguard/j1;->r:J

    .line 7
    iput-wide v5, v0, Lcom/tencent/bugly/proguard/j1;->s:J

    .line 8
    iput-wide v5, v0, Lcom/tencent/bugly/proguard/j1;->t:J

    .line 9
    iput-wide v5, v0, Lcom/tencent/bugly/proguard/j1;->u:J

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/j1;)V
    .locals 6

    .line 10
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Lcom/tencent/bugly/proguard/hf;)V

    const-wide/16 v0, 0x2710

    .line 11
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->n:J

    const-wide/16 v2, 0x7530

    .line 12
    iput-wide v2, p0, Lcom/tencent/bugly/proguard/j1;->o:J

    const-wide/16 v4, 0x14

    .line 13
    iput-wide v4, p0, Lcom/tencent/bugly/proguard/j1;->p:J

    .line 14
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->q:J

    .line 15
    iput-wide v2, p0, Lcom/tencent/bugly/proguard/j1;->r:J

    .line 16
    iput-wide v4, p0, Lcom/tencent/bugly/proguard/j1;->s:J

    .line 17
    iput-wide v4, p0, Lcom/tencent/bugly/proguard/j1;->t:J

    .line 18
    iput-wide v4, p0, Lcom/tencent/bugly/proguard/j1;->u:J

    .line 19
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/j1;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 14
    const-string v0, "battery_element"

    return-object v0
.end method

.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    .line 2
    instance-of v0, p1, Lcom/tencent/bugly/proguard/j1;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/tencent/bugly/proguard/j1;

    iget-wide v0, p1, Lcom/tencent/bugly/proguard/j1;->n:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->n:J

    .line 4
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/j1;->o:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->o:J

    .line 5
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/j1;->p:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->p:J

    .line 6
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/j1;->q:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->q:J

    .line 7
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/j1;->r:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->r:J

    .line 8
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/j1;->s:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->s:J

    .line 9
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/j1;->t:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->t:J

    .line 10
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/j1;->u:J

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->u:J

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 3

    if-nez p1, :cond_0

    goto :goto_0

    .line 11
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lorg/json/JSONObject;)V

    .line 12
    :try_start_0
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/j1;->b(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 13
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "BatteryElementPluginConfig"

    const-string/jumbo v2, "parsePluginConfig"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public bridge synthetic b()Lcom/tencent/bugly/proguard/hf;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/j1;->c()Lcom/tencent/bugly/proguard/j1;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lorg/json/JSONObject;)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 2
    const-string/jumbo v0, "single_location_duration_in_ms"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->n:J

    .line 4
    :cond_0
    const-string/jumbo v0, "total_location_duration_in_ms"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->o:J

    .line 6
    :cond_1
    const-string v0, "max_location_open_num"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_2

    .line 7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->p:J

    .line 8
    :cond_2
    const-string/jumbo v0, "single_wakelock_duration_in_ms"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    .line 9
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->q:J

    .line 10
    :cond_3
    const-string/jumbo v0, "total_wakelock_duration_in_ms"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    .line 11
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->r:J

    .line 12
    :cond_4
    const-string v0, "max_wakelock_open_num"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 13
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->s:J

    .line 14
    :cond_5
    const-string v0, "max_alarm_open_num"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 15
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->t:J

    .line 16
    :cond_6
    const-string v0, "max_wakeup_alarm_open_num"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_7

    .line 17
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/j1;->u:J

    :cond_7
    return-void
.end method

.method public c()Lcom/tencent/bugly/proguard/j1;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/j1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/j1;-><init>(Lcom/tencent/bugly/proguard/j1;)V

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
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/j1;->c()Lcom/tencent/bugly/proguard/j1;

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
