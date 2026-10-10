.class public Lcom/tencent/bugly/proguard/fh;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# static fields
.field public static final w:Ljava/lang/String; = "TrafficDetailPluginConfig"


# instance fields
.field public n:D

.field public o:D

.field public p:D

.field public q:D

.field public r:D

.field public s:Z

.field public t:D

.field public u:D

.field public v:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .locals 7

    const/4 v5, 0x0

    const/16 v6, 0x64

    .line 1
    const-string/jumbo v1, "traffic_detail"

    const/4 v2, 0x0

    const/16 v3, 0x3e8

    const/high16 v4, 0x3f000000    # 0.5f

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFFI)V

    const-wide v1, 0x407f400000000000L    # 500.0

    .line 2
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/fh;->n:D

    const-wide/high16 v1, 0x4049000000000000L    # 50.0

    .line 3
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/fh;->o:D

    const-wide/high16 v3, 0x4069000000000000L    # 200.0

    .line 4
    iput-wide v3, v0, Lcom/tencent/bugly/proguard/fh;->p:D

    .line 5
    iput-wide v3, v0, Lcom/tencent/bugly/proguard/fh;->q:D

    .line 6
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/fh;->r:D

    const/4 v1, 0x1

    .line 7
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/fh;->s:Z

    const-wide/high16 v1, 0x3ff0000000000000L    # 1.0

    .line 8
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/fh;->t:D

    .line 9
    iput-wide v1, v0, Lcom/tencent/bugly/proguard/fh;->u:D

    .line 10
    new-instance v1, Lcom/tencent/bugly/proguard/fh$a;

    invoke-direct {v1, p0}, Lcom/tencent/bugly/proguard/fh$a;-><init>(Lcom/tencent/bugly/proguard/fh;)V

    iput-object v1, v0, Lcom/tencent/bugly/proguard/fh;->v:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/fh;)V
    .locals 4

    .line 11
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Lcom/tencent/bugly/proguard/hf;)V

    const-wide v0, 0x407f400000000000L    # 500.0

    .line 12
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->n:D

    const-wide/high16 v0, 0x4049000000000000L    # 50.0

    .line 13
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->o:D

    const-wide/high16 v2, 0x4069000000000000L    # 200.0

    .line 14
    iput-wide v2, p0, Lcom/tencent/bugly/proguard/fh;->p:D

    .line 15
    iput-wide v2, p0, Lcom/tencent/bugly/proguard/fh;->q:D

    .line 16
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->r:D

    const/4 v0, 0x1

    .line 17
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/fh;->s:Z

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    .line 18
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->t:D

    .line 19
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->u:D

    .line 20
    new-instance v0, Lcom/tencent/bugly/proguard/fh$a;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/fh$a;-><init>(Lcom/tencent/bugly/proguard/fh;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/fh;->v:Ljava/util/List;

    .line 21
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/fh;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 31
    const-string/jumbo v0, "traffic_detail"

    return-object v0
.end method

.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 2

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    .line 2
    instance-of v0, p1, Lcom/tencent/bugly/proguard/fh;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/tencent/bugly/proguard/fh;

    iget-wide v0, p1, Lcom/tencent/bugly/proguard/fh;->n:D

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->n:D

    .line 4
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/fh;->p:D

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->p:D

    .line 5
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/fh;->q:D

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->q:D

    .line 6
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/fh;->r:D

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->r:D

    .line 7
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/fh;->o:D

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->o:D

    .line 8
    iget-object v0, p1, Lcom/tencent/bugly/proguard/fh;->v:Ljava/util/List;

    iput-object v0, p0, Lcom/tencent/bugly/proguard/fh;->v:Ljava/util/List;

    .line 9
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/fh;->s:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/fh;->s:Z

    .line 10
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/fh;->t:D

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->t:D

    .line 11
    iget-wide v0, p1, Lcom/tencent/bugly/proguard/fh;->u:D

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->u:D

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 9

    const-string v0, "error_event_sample_ratio"

    const-string/jumbo v1, "metric_event_sample_ratio"

    const-string v2, "filter_local_address"

    const-string v3, "auto_start_limit_in_megabyte"

    const-string v4, "custom_limit_in_megabyte"

    const-string v5, "backend_limit_in_megabyte"

    const-string/jumbo v6, "mobile_limit_in_megabyte"

    const-string/jumbo v7, "total_limit_in_megabyte"

    if-nez p1, :cond_0

    goto/16 :goto_2

    .line 12
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lorg/json/JSONObject;)V

    .line 13
    :try_start_0
    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    .line 14
    invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v7

    iput-wide v7, p0, Lcom/tencent/bugly/proguard/fh;->n:D

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7

    if-eqz v7, :cond_2

    .line 16
    invoke-virtual {p1, v6}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v6

    iput-wide v6, p0, Lcom/tencent/bugly/proguard/fh;->p:D

    .line 17
    :cond_2
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    .line 18
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    iput-wide v5, p0, Lcom/tencent/bugly/proguard/fh;->o:D

    .line 19
    :cond_3
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_4

    .line 20
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v4

    iput-wide v4, p0, Lcom/tencent/bugly/proguard/fh;->q:D

    .line 21
    :cond_4
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_5

    .line 22
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v3

    iput-wide v3, p0, Lcom/tencent/bugly/proguard/fh;->r:D

    .line 23
    :cond_5
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_6

    .line 24
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/fh;->s:Z

    .line 25
    :cond_6
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    const-wide/high16 v3, 0x3ff0000000000000L    # 1.0

    if-eqz v2, :cond_7

    .line 26
    invoke-virtual {p1, v1, v3, v4}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v1

    iput-wide v1, p0, Lcom/tencent/bugly/proguard/fh;->t:D

    .line 27
    :cond_7
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 28
    invoke-virtual {p1, v0, v3, v4}, Lorg/json/JSONObject;->optDouble(Ljava/lang/String;D)D

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/fh;->u:D

    .line 29
    :cond_8
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/fh;->b(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 30
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "TrafficDetailPluginConfig"

    const-string/jumbo v2, "parsePluginConfig"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :goto_2
    return-void
.end method

.method public bridge synthetic b()Lcom/tencent/bugly/proguard/hf;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fh;->c()Lcom/tencent/bugly/proguard/fh;

    move-result-object v0

    return-object v0
.end method

.method public final b(Lorg/json/JSONObject;)V
    .locals 3

    .line 2
    const-string v0, "ignore_so_list"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    .line 3
    :try_start_0
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    const/4 v0, 0x0

    .line 4
    :goto_0
    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-ge v0, v1, :cond_0

    .line 5
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    .line 6
    iget-object v2, p0, Lcom/tencent/bugly/proguard/fh;->v:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception p1

    .line 7
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "TrafficDetailPluginConfig"

    const-string v2, "ignore_so_list parse failed"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method public c()Lcom/tencent/bugly/proguard/fh;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/fh;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/fh;-><init>(Lcom/tencent/bugly/proguard/fh;)V

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
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/fh;->c()Lcom/tencent/bugly/proguard/fh;

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
