.class public Lcom/tencent/bugly/proguard/xb;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:F = 100.0f


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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

.method public static a()Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "java_memory_ceiling_hprof"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->c(Ljava/lang/String;)Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static b()F
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/xb;->c()Lcom/tencent/bugly/proguard/tb;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget v0, v0, Lcom/tencent/bugly/proguard/hf;->l:I

    .line 7
    int-to-float v0, v0

    .line 8
    .line 9
    const/high16 v1, 0x42c80000    # 100.0f

    .line 10
    div-float/2addr v0, v1

    .line 11
    return v0
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static c()Lcom/tencent/bugly/proguard/tb;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/xb;->a()Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->config:Lcom/tencent/bugly/proguard/hf;

    .line 7
    .line 8
    check-cast v0, Lcom/tencent/bugly/proguard/tb;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static d()Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;
    .locals 2

    .line 1
    .line 2
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "activity_leak"

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->c(Ljava/lang/String;)Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    .line 12
    move-result-object v0

    .line 13
    return-object v0
    .line 14
    .line 15
    .line 16
    .line 17
.end method

.method public static e()Lcom/tencent/bugly/proguard/dc;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/xb;->d()Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    iget-object v0, v0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->config:Lcom/tencent/bugly/proguard/hf;

    .line 7
    .line 8
    check-cast v0, Lcom/tencent/bugly/proguard/dc;

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
.end method
