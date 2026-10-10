.class public Lcom/tencent/bugly/proguard/tb;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static final r:I = 0x9

.field public static final s:I = 0x3

.field public static final t:I = 0x5

.field public static final u:Z


# instance fields
.field public n:I

.field public o:I

.field public p:I

.field public q:Z


# direct methods
.method public constructor <init>()V
    .locals 6

    const/high16 v4, 0x3f000000    # 0.5f

    const/16 v5, 0x5a

    .line 1
    const-string v1, "java_memory_ceiling_hprof"

    const/4 v2, 0x0

    const/4 v3, 0x5

    move-object v0, p0

    invoke-direct/range {v0 .. v5}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIFI)V

    const/16 v1, 0x9

    .line 2
    iput v1, v0, Lcom/tencent/bugly/proguard/tb;->n:I

    const/4 v1, 0x3

    .line 3
    iput v1, v0, Lcom/tencent/bugly/proguard/tb;->o:I

    const/4 v1, 0x5

    .line 4
    iput v1, v0, Lcom/tencent/bugly/proguard/tb;->p:I

    const/4 v1, 0x0

    .line 5
    iput-boolean v1, v0, Lcom/tencent/bugly/proguard/tb;->q:Z

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/tb;)V
    .locals 1

    .line 6
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Lcom/tencent/bugly/proguard/hf;)V

    const/16 v0, 0x9

    .line 7
    iput v0, p0, Lcom/tencent/bugly/proguard/tb;->n:I

    const/4 v0, 0x3

    .line 8
    iput v0, p0, Lcom/tencent/bugly/proguard/tb;->o:I

    const/4 v0, 0x5

    .line 9
    iput v0, p0, Lcom/tencent/bugly/proguard/tb;->p:I

    const/4 v0, 0x0

    .line 10
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/tb;->q:Z

    .line 11
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/tb;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    .line 2
    instance-of v0, p1, Lcom/tencent/bugly/proguard/tb;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/tencent/bugly/proguard/tb;

    .line 4
    iget v0, p1, Lcom/tencent/bugly/proguard/tb;->n:I

    iput v0, p0, Lcom/tencent/bugly/proguard/tb;->n:I

    .line 5
    iget v0, p1, Lcom/tencent/bugly/proguard/tb;->o:I

    iput v0, p0, Lcom/tencent/bugly/proguard/tb;->o:I

    .line 6
    iget v0, p1, Lcom/tencent/bugly/proguard/tb;->p:I

    iput v0, p0, Lcom/tencent/bugly/proguard/tb;->p:I

    .line 7
    iget-boolean p1, p1, Lcom/tencent/bugly/proguard/tb;->q:Z

    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/tb;->q:Z

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 5

    const-string v0, "check_gc_before_ceiling"

    const-string v1, "max_gc_count"

    const-string v2, "max_check_count"

    const-string v3, "hprof_strip_switch"

    if-nez p1, :cond_0

    goto :goto_2

    .line 8
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lorg/json/JSONObject;)V

    .line 9
    :try_start_0
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x9

    .line 10
    invoke-virtual {p1, v3, v4}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v3

    iput v3, p0, Lcom/tencent/bugly/proguard/tb;->n:I

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 11
    :cond_1
    :goto_0
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/4 v3, 0x3

    .line 12
    invoke-virtual {p1, v2, v3}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v2

    iput v2, p0, Lcom/tencent/bugly/proguard/tb;->o:I

    .line 13
    :cond_2
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/4 v2, 0x5

    .line 14
    invoke-virtual {p1, v1, v2}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/tencent/bugly/proguard/tb;->p:I

    .line 15
    :cond_3
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 v1, 0x0

    .line 16
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    iput-boolean p1, p0, Lcom/tencent/bugly/proguard/tb;->q:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 17
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    const-string/jumbo v2, "parsePluginConfig"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    return-void
.end method

.method public bridge synthetic b()Lcom/tencent/bugly/proguard/hf;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/tb;->c()Lcom/tencent/bugly/proguard/tb;

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

.method public c()Lcom/tencent/bugly/proguard/tb;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/tb;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/tb;-><init>(Lcom/tencent/bugly/proguard/tb;)V

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

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/tb;->c()Lcom/tencent/bugly/proguard/tb;

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

.method public d()Z
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/tencent/bugly/proguard/tb;->n:I

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
