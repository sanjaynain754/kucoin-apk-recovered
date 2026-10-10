.class public Lcom/tencent/bugly/proguard/c0;
.super Lcom/tencent/bugly/proguard/hf;
.source "BUGLY"


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static final q:I = 0xa


# instance fields
.field public n:Z

.field public o:Z

.field public p:I


# direct methods
.method public constructor <init>()V
    .locals 4

    const/16 v0, 0x64

    const/high16 v1, 0x3f800000    # 1.0f

    .line 1
    const-string v2, "launch_metric"

    const/4 v3, 0x0

    invoke-direct {p0, v2, v3, v0, v1}, Lcom/tencent/bugly/proguard/hf;-><init>(Ljava/lang/String;ZIF)V

    .line 2
    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/c0;->n:Z

    .line 3
    iput-boolean v3, p0, Lcom/tencent/bugly/proguard/c0;->o:Z

    const/16 v0, 0xa

    .line 4
    iput v0, p0, Lcom/tencent/bugly/proguard/c0;->p:I

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/c0;)V
    .locals 1

    .line 5
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/hf;-><init>(Lcom/tencent/bugly/proguard/hf;)V

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/c0;->n:Z

    .line 7
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/c0;->o:Z

    const/16 v0, 0xa

    .line 8
    iput v0, p0, Lcom/tencent/bugly/proguard/c0;->p:I

    .line 9
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/c0;->a(Lcom/tencent/bugly/proguard/hf;)V

    return-void
.end method


# virtual methods
.method public a(Lcom/tencent/bugly/proguard/hf;)V
    .locals 1

    .line 1
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lcom/tencent/bugly/proguard/hf;)V

    .line 2
    instance-of v0, p1, Lcom/tencent/bugly/proguard/c0;

    if-eqz v0, :cond_0

    .line 3
    check-cast p1, Lcom/tencent/bugly/proguard/c0;

    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/c0;->n:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/c0;->n:Z

    .line 4
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/c0;->o:Z

    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/c0;->o:Z

    .line 5
    iget p1, p1, Lcom/tencent/bugly/proguard/c0;->p:I

    iput p1, p0, Lcom/tencent/bugly/proguard/c0;->p:I

    :cond_0
    return-void
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 5

    const-string/jumbo v0, "warm_launch_max_report_count"

    const-string v1, "disable_report_pre_launch"

    const-string v2, "enable_protect"

    if-nez p1, :cond_0

    goto :goto_2

    .line 6
    :cond_0
    invoke-super {p0, p1}, Lcom/tencent/bugly/proguard/hf;->a(Lorg/json/JSONObject;)V

    .line 7
    :try_start_0
    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_1

    .line 8
    invoke-virtual {p1, v2, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v2

    iput-boolean v2, p0, Lcom/tencent/bugly/proguard/c0;->n:Z

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 9
    :cond_1
    :goto_0
    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_2

    .line 10
    invoke-virtual {p1, v1, v4}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    iput-boolean v1, p0, Lcom/tencent/bugly/proguard/c0;->o:Z

    .line 11
    :cond_2
    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0xa

    .line 12
    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result p1

    iput p1, p0, Lcom/tencent/bugly/proguard/c0;->p:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 13
    :goto_1
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 14
    const-string v1, "AppLaunchPluginConfig, parseLaunchConfigInfo, t: "

    invoke-static {v1, p1}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    .line 15
    const-string v1, "RMonitor_config"

    filled-new-array {v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    :cond_3
    :goto_2
    return-void
.end method

.method public bridge synthetic b()Lcom/tencent/bugly/proguard/hf;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/c0;->c()Lcom/tencent/bugly/proguard/c0;

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

.method public c()Lcom/tencent/bugly/proguard/c0;
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/c0;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0, p0}, Lcom/tencent/bugly/proguard/c0;-><init>(Lcom/tencent/bugly/proguard/c0;)V

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
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/c0;->c()Lcom/tencent/bugly/proguard/c0;

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
    iget v0, p0, Lcom/tencent/bugly/proguard/c0;->p:I

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
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/c0;->o:Z

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
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/c0;->n:Z

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
