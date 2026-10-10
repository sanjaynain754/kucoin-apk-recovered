.class public Lcom/tencent/bugly/proguard/hf;
.super Lcom/tencent/bugly/proguard/xe;
.source "BUGLY"

# interfaces
.implements Ljava/lang/Cloneable;
.implements Lcom/tencent/bugly/proguard/n9;


# static fields
.field public static final m:Ljava/lang/String; = "RMonitor_config"


# instance fields
.field public final f:Ljava/lang/String;

.field public g:Z

.field public h:I

.field public i:F

.field public j:F

.field public k:F

.field public l:I


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/hf;)V
    .locals 1

    .line 18
    iget-object v0, p1, Lcom/tencent/bugly/proguard/hf;->f:Ljava/lang/String;

    invoke-direct {p0, v0}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;)V

    .line 19
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Lcom/tencent/bugly/proguard/xe;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/hf;->g:Z

    const/16 v1, 0xa

    .line 3
    iput v1, p0, Lcom/tencent/bugly/proguard/hf;->h:I

    const/4 v1, 0x0

    .line 4
    iput v1, p0, Lcom/tencent/bugly/proguard/hf;->i:F

    .line 5
    iput v1, p0, Lcom/tencent/bugly/proguard/hf;->j:F

    const/high16 v1, 0x3f800000    # 1.0f

    .line 6
    iput v1, p0, Lcom/tencent/bugly/proguard/hf;->k:F

    .line 7
    iput v0, p0, Lcom/tencent/bugly/proguard/hf;->l:I

    .line 8
    iput-object p1, p0, Lcom/tencent/bugly/proguard/hf;->f:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZIF)V
    .locals 0

    .line 9
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;)V

    .line 10
    iput p3, p0, Lcom/tencent/bugly/proguard/hf;->h:I

    .line 11
    iput p4, p0, Lcom/tencent/bugly/proguard/hf;->j:F

    .line 12
    iput-boolean p2, p0, Lcom/tencent/bugly/proguard/hf;->g:Z

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZIFFI)V
    .locals 0

    .line 15
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIF)V

    .line 16
    iput p5, p0, Lcom/tencent/bugly/proguard/hf;->i:F

    .line 17
    iput p6, p0, Lcom/tencent/bugly/proguard/hf;->l:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;ZIFI)V
    .locals 0

    .line 13
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIF)V

    .line 14
    iput p5, p0, Lcom/tencent/bugly/proguard/hf;->l:I

    return-void
.end method


# virtual methods
.method public a()Ljava/lang/String;
    .locals 1

    .line 20
    iget-object v0, p0, Lcom/tencent/bugly/proguard/hf;->f:Ljava/lang/String;

    return-object v0
.end method

.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 1

    if-nez p1, :cond_0

    return-void

    .line 1
    :cond_0
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/hf;->g:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/hf;->g:Z

    .line 2
    iget v0, p1, Lcom/tencent/bugly/proguard/hf;->h:I

    iput v0, p0, Lcom/tencent/bugly/proguard/hf;->h:I

    .line 3
    iget v0, p1, Lcom/tencent/bugly/proguard/hf;->i:F

    iput v0, p0, Lcom/tencent/bugly/proguard/hf;->i:F

    .line 4
    iget v0, p1, Lcom/tencent/bugly/proguard/hf;->j:F

    iput v0, p0, Lcom/tencent/bugly/proguard/hf;->j:F

    .line 5
    iget v0, p1, Lcom/tencent/bugly/proguard/hf;->k:F

    iput v0, p0, Lcom/tencent/bugly/proguard/hf;->k:F

    .line 6
    iget p1, p1, Lcom/tencent/bugly/proguard/hf;->l:I

    iput p1, p0, Lcom/tencent/bugly/proguard/hf;->l:I

    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 7

    const-string/jumbo v0, "threshold"

    const-string/jumbo v1, "report_sample_ratio"

    const-string v2, "event_sample_ratio"

    const-string v3, "daily_report_limit"

    const-string v4, "enabled"

    const-string/jumbo v5, "sample_ratio"

    if-nez p1, :cond_0

    goto :goto_2

    .line 7
    :cond_0
    :try_start_0
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_1

    .line 8
    invoke-virtual {p1, v5}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v5

    double-to-float v5, v5

    iput v5, p0, Lcom/tencent/bugly/proguard/hf;->i:F

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 9
    :cond_1
    :goto_0
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    .line 10
    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->getBoolean(Ljava/lang/String;)Z

    move-result v4

    iput-boolean v4, p0, Lcom/tencent/bugly/proguard/hf;->g:Z

    .line 11
    :cond_2
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_3

    .line 12
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v3

    iput v3, p0, Lcom/tencent/bugly/proguard/hf;->h:I

    .line 13
    :cond_3
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_4

    .line 14
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v2

    double-to-float v2, v2

    iput v2, p0, Lcom/tencent/bugly/proguard/hf;->j:F

    .line 15
    :cond_4
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_5

    .line 16
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getDouble(Ljava/lang/String;)D

    move-result-wide v1

    double-to-float v1, v1

    iput v1, p0, Lcom/tencent/bugly/proguard/hf;->k:F

    .line 17
    :cond_5
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_6

    .line 18
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    iput p1, p0, Lcom/tencent/bugly/proguard/hf;->l:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 19
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config"

    const-string/jumbo v2, "parsePluginConfig"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_6
    :goto_2
    return-void
.end method

.method public b()Lcom/tencent/bugly/proguard/hf;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/hf;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/hf;-><init>(Lcom/tencent/bugly/proguard/hf;)V

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
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/hf;->b()Lcom/tencent/bugly/proguard/hf;

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
