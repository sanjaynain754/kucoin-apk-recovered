.class public Lcom/tencent/bugly/proguard/dc;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# instance fields
.field public n:I

.field public o:Z

.field public p:I

.field public q:Z

.field public r:Z


# direct methods
.method public constructor <init>()V
    .locals 7

    const v5, 0x3dcccccd    # 0.1f

    const/4 v6, 0x0

    .line 1
    const-string v1, "activity_leak"

    const/4 v2, 0x0

    const/16 v3, 0xa

    const v4, 0x3dcccccd    # 0.1f

    move-object v0, p0

    invoke-direct/range {v0 .. v6}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFFI)V

    const/16 v1, 0x9

    .line 2
    iput v1, v0, Lcom/tencent/bugly/proguard/dc;->n:I

    const/4 v1, 0x1

    .line 3
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/dc;->o:Z

    const/16 v2, 0x64

    .line 4
    iput v2, v0, Lcom/tencent/bugly/proguard/dc;->p:I

    const/4 v2, 0x0

    .line 5
    iput-boolean v2, v0, Lcom/tencent/bugly/proguard/dc;->q:Z

    .line 6
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/dc;->r:Z

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/dc;)V
    .locals 2

    .line 7
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Lcom/tencent/bugly/proguard/hf;)V

    const/16 v0, 0x9

    .line 8
    iput v0, p0, Lcom/tencent/bugly/proguard/dc;->n:I

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/dc;->o:Z

    const/16 v1, 0x64

    .line 10
    iput v1, p0, Lcom/tencent/bugly/proguard/dc;->p:I

    const/4 v1, 0x0

    .line 11
    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/dc;->q:Z

    .line 12
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/dc;->r:Z

    .line 13
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/dc;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-void
.end method


# virtual methods
.method public a(I)V
    .locals 0

    .line 10
    iput p1, p0, Lcom/tencent/bugly/proguard/dc;->n:I

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    .line 2
    instance-of v0, p1, Lcom/tencent/bugly/proguard/dc;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/tencent/bugly/proguard/dc;

    .line 4
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/dc;->o:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/dc;->o:Z

    .line 5
    iget v0, p1, Lcom/tencent/bugly/proguard/dc;->p:I

    iput v0, p0, Lcom/tencent/bugly/proguard/dc;->p:I

    .line 6
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/dc;->q:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/dc;->q:Z

    .line 7
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/dc;->r:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/dc;->r:Z

    .line 8
    iget p1, p1, Lcom/tencent/bugly/proguard/dc;->n:I

    iput p1, p0, Lcom/tencent/bugly/proguard/dc;->n:I

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 6

    const-string v0, "hprof_strip_switch"

    const-string v1, "enable_fragment_inspect"

    const-string v2, "keep_uuid_when_leaked"

    const-string v3, "loop_max_count"

    const-string v4, "auto_dump"

    if-nez p1, :cond_0

    goto :goto_2

    .line 11
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lorg/json/JSONObject;)V

    .line 12
    :try_start_0
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_1

    .line 13
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    .line 14
    invoke-virtual {p0, v4}, Lcom/tencent/bugly/proguard/dc;->a(Z)V

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 15
    :cond_1
    :goto_0
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_2

    .line 16
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    .line 17
    invoke-virtual {p0, v3}, Lcom/tencent/bugly/proguard/dc;->b(I)V

    .line 18
    :cond_2
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_3

    .line 19
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v2

    .line 20
    invoke-virtual {p0, v2}, Lcom/tencent/bugly/proguard/dc;->c(Z)V

    .line 21
    :cond_3
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_4

    .line 22
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v1

    .line 23
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/dc;->b(Z)V

    .line 24
    :cond_4
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5

    .line 25
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    .line 26
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/dc;->a(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 27
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    const-string/jumbo v2, "parsePluginConfig"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_5
    :goto_2
    return-void
.end method

.method public a(Z)V
    .locals 0

    .line 9
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/dc;->o:Z

    return-void
.end method

.method public bridge synthetic b()Lcom/tencent/bugly/proguard/hf;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/dc;->c()Lcom/tencent/bugly/proguard/dc;

    move-result-object v0

    return-object v0
.end method

.method public b(I)V
    .locals 0

    .line 2
    iput p1, p0, Lcom/tencent/bugly/proguard/dc;->p:I

    return-void
.end method

.method public b(Z)V
    .locals 0

    .line 3
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/dc;->r:Z

    return-void
.end method

.method public c()Lcom/tencent/bugly/proguard/dc;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    new-instance v0, Lcom/tencent/bugly/proguard/dc;

    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/dc;-><init>(Lcom/tencent/bugly/proguard/dc;)V

    return-object v0
.end method

.method public c(Z)V
    .locals 0

    .line 2
    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/dc;->q:Z

    return-void
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/dc;->c()Lcom/tencent/bugly/proguard/dc;

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

.method public d()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/dc;->p:I

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
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/dc;->o:Z

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

.method public f()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/dc;->r:Z

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

.method public g()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/dc;->n:I

    .line 3
    const/4 v1, 0x1

    .line 4
    and-int/2addr v0, v1

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    return v1

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    return v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public h()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/dc;->q:Z

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
