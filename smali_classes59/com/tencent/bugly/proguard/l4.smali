.class public Lcom/tencent/bugly/proguard/l4;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/rmonitor/base/config/c;


# static fields
.field public static final f:Ljava/lang/String; = "RMonitor_config_Loader"


# instance fields
.field public final a:Lcom/tencent/bugly/proguard/o8;

.field public final b:Lcom/tencent/bugly/proguard/n8;

.field public final c:Lcom/tencent/bugly/proguard/s2;

.field public d:Lcom/tencent/bugly/proguard/k8;

.field public e:Lcom/tencent/bugly/common/meta/UserMeta;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/s2;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/s2;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/l4;->c:Lcom/tencent/bugly/proguard/s2;

    const/4 v0, 0x0

    .line 3
    iput-object v0, p0, Lcom/tencent/bugly/proguard/l4;->d:Lcom/tencent/bugly/proguard/k8;

    .line 4
    new-instance v0, Lcom/tencent/bugly/proguard/a3;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/a3;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/l4;->a:Lcom/tencent/bugly/proguard/o8;

    .line 5
    new-instance v0, Lcom/tencent/bugly/proguard/z2;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/z2;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/l4;->b:Lcom/tencent/bugly/proguard/n8;

    return-void
.end method

.method public constructor <init>(Lcom/tencent/bugly/proguard/k8;Lcom/tencent/bugly/proguard/o8;Lcom/tencent/bugly/proguard/n8;)V
    .locals 1
    .param p2    # Lcom/tencent/bugly/proguard/o8;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lcom/tencent/bugly/proguard/n8;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    new-instance v0, Lcom/tencent/bugly/proguard/s2;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/s2;-><init>()V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/l4;->c:Lcom/tencent/bugly/proguard/s2;

    .line 8
    iput-object p1, p0, Lcom/tencent/bugly/proguard/l4;->d:Lcom/tencent/bugly/proguard/k8;

    .line 9
    iput-object p2, p0, Lcom/tencent/bugly/proguard/l4;->a:Lcom/tencent/bugly/proguard/o8;

    .line 10
    iput-object p3, p0, Lcom/tencent/bugly/proguard/l4;->b:Lcom/tencent/bugly/proguard/n8;

    return-void
.end method


# virtual methods
.method public final a()Lcom/tencent/bugly/proguard/k8;
    .locals 3

    .line 21
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l4;->d:Lcom/tencent/bugly/proguard/k8;

    if-nez v0, :cond_0

    .line 22
    :try_start_0
    new-instance v0, Lcom/tencent/bugly/proguard/u2;

    new-instance v1, Ljava/net/URL;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/l4;->c:Lcom/tencent/bugly/proguard/s2;

    iget-object v2, v2, Lcom/tencent/bugly/proguard/s2;->a:Ljava/lang/String;

    invoke-direct {v1, v2}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lcom/tencent/bugly/proguard/u2;-><init>(Ljava/net/URL;)V

    iput-object v0, p0, Lcom/tencent/bugly/proguard/l4;->d:Lcom/tencent/bugly/proguard/k8;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v0

    .line 23
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v2, "RMonitor_config_Loader"

    invoke-virtual {v1, v2, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 24
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l4;->d:Lcom/tencent/bugly/proguard/k8;

    return-object v0
.end method

.method public final a(Lcom/tencent/bugly/proguard/k8;Lcom/tencent/bugly/proguard/r2;)Lorg/json/JSONObject;
    .locals 3
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation

    .line 12
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config_Loader"

    const-string v2, "load config from server."

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 13
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l4;->c:Lcom/tencent/bugly/proguard/s2;

    if-nez p2, :cond_0

    const-string v1, ""

    goto :goto_0

    :cond_0
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/r2;->b()Lcom/tencent/bugly/proguard/t2;

    move-result-object v1

    iget-object v1, v1, Lcom/tencent/bugly/proguard/t2;->c:Ljava/lang/String;

    :goto_0
    iput-object v1, v0, Lcom/tencent/bugly/proguard/s2;->b:Ljava/lang/String;

    .line 14
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l4;->c:Lcom/tencent/bugly/proguard/s2;

    invoke-interface {p1, v0}, Lcom/tencent/bugly/proguard/k8;->a(Lcom/tencent/bugly/proguard/s2;)V

    .line 15
    invoke-interface {p1}, Lcom/tencent/bugly/proguard/k8;->a()I

    move-result v0

    .line 16
    invoke-interface {p1}, Lcom/tencent/bugly/proguard/k8;->b()Lcom/tencent/bugly/proguard/t2;

    move-result-object p1

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    .line 17
    iget-object p2, p1, Lcom/tencent/bugly/proguard/t2;->a:Lorg/json/JSONObject;

    goto :goto_1

    :cond_1
    if-nez p2, :cond_2

    const/4 p2, 0x0

    goto :goto_1

    .line 18
    :cond_2
    invoke-virtual {p2}, Lcom/tencent/bugly/proguard/r2;->b()Lcom/tencent/bugly/proguard/t2;

    move-result-object p2

    iget-object p2, p2, Lcom/tencent/bugly/proguard/t2;->a:Lorg/json/JSONObject;

    :goto_1
    const/4 v2, 0x3

    if-eq v0, v2, :cond_4

    if-ne v0, v1, :cond_3

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    .line 19
    :goto_2
    new-instance v0, Lcom/tencent/bugly/proguard/r2;

    iget-object v2, p0, Lcom/tencent/bugly/proguard/l4;->c:Lcom/tencent/bugly/proguard/s2;

    invoke-direct {v0, v2, p1, v1}, Lcom/tencent/bugly/proguard/r2;-><init>(Lcom/tencent/bugly/proguard/s2;Lcom/tencent/bugly/proguard/t2;Z)V

    .line 20
    iget-object p1, p0, Lcom/tencent/bugly/proguard/l4;->a:Lcom/tencent/bugly/proguard/o8;

    invoke-interface {p1, v0}, Lcom/tencent/bugly/proguard/o8;->a(Lcom/tencent/bugly/proguard/r2;)Z

    :cond_4
    return-object p2
.end method

.method public a(Lcom/tencent/bugly/common/meta/UserMeta;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lcom/tencent/bugly/proguard/l4;->e:Lcom/tencent/bugly/common/meta/UserMeta;

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/af;)V
    .locals 3
    .param p1    # Lcom/tencent/bugly/proguard/af;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    const-string v0, "RMonitor_config_Loader"

    .line 25
    :try_start_0
    iget-object v1, p0, Lcom/tencent/bugly/proguard/l4;->a:Lcom/tencent/bugly/proguard/o8;

    invoke-interface {v1}, Lcom/tencent/bugly/proguard/o8;->a()Lcom/tencent/bugly/proguard/r2;

    move-result-object v1

    if-nez v1, :cond_0

    const/4 v1, 0x0

    goto :goto_0

    .line 26
    :cond_0
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/r2;->b()Lcom/tencent/bugly/proguard/t2;

    move-result-object v1

    iget-object v1, v1, Lcom/tencent/bugly/proguard/t2;->a:Lorg/json/JSONObject;

    :goto_0
    if-eqz v1, :cond_1

    .line 27
    iget-object v2, p0, Lcom/tencent/bugly/proguard/l4;->b:Lcom/tencent/bugly/proguard/n8;

    invoke-interface {v2, v1, p1}, Lcom/tencent/bugly/proguard/n8;->a(Lorg/json/JSONObject;Lcom/tencent/bugly/proguard/af;)Z

    .line 28
    :cond_1
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "load config from local."

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    .line 29
    :catchall_0
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "load config from local fail."

    filled-new-array {v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-void
.end method

.method public a(Lcom/tencent/bugly/proguard/af;Lcom/tencent/rmonitor/base/config/c$a;)V
    .locals 3
    .param p1    # Lcom/tencent/bugly/proguard/af;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l4;->c:Lcom/tencent/bugly/proguard/s2;

    iget-object v1, p0, Lcom/tencent/bugly/proguard/l4;->e:Lcom/tencent/bugly/common/meta/UserMeta;

    invoke-virtual {v0, v1}, Lcom/tencent/bugly/proguard/s2;->a(Lcom/tencent/bugly/common/meta/UserMeta;)V

    .line 4
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/l4;->a()Lcom/tencent/bugly/proguard/k8;

    move-result-object v0

    .line 5
    iget-object v1, p0, Lcom/tencent/bugly/proguard/l4;->a:Lcom/tencent/bugly/proguard/o8;

    invoke-interface {v1}, Lcom/tencent/bugly/proguard/o8;->a()Lcom/tencent/bugly/proguard/r2;

    move-result-object v1

    if-eqz v0, :cond_0

    .line 6
    invoke-virtual {p0, v1, p2}, Lcom/tencent/bugly/proguard/l4;->a(Lcom/tencent/bugly/proguard/r2;Lcom/tencent/rmonitor/base/config/c$a;)Z

    move-result p2

    if-eqz p2, :cond_0

    .line 7
    invoke-virtual {p0, v0, v1}, Lcom/tencent/bugly/proguard/l4;->a(Lcom/tencent/bugly/proguard/k8;Lcom/tencent/bugly/proguard/r2;)Lorg/json/JSONObject;

    move-result-object p2

    goto :goto_1

    :cond_0
    if-nez v1, :cond_1

    const/4 p2, 0x0

    goto :goto_0

    .line 8
    :cond_1
    invoke-virtual {v1}, Lcom/tencent/bugly/proguard/r2;->b()Lcom/tencent/bugly/proguard/t2;

    move-result-object p2

    iget-object p2, p2, Lcom/tencent/bugly/proguard/t2;->a:Lorg/json/JSONObject;

    .line 9
    :goto_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "RMonitor_config_Loader"

    const-string v2, "load config from cache."

    filled-new-array {v1, v2}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    :goto_1
    if-eqz p2, :cond_2

    .line 10
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l4;->b:Lcom/tencent/bugly/proguard/n8;

    invoke-interface {v0, p2, p1}, Lcom/tencent/bugly/proguard/n8;->a(Lorg/json/JSONObject;Lcom/tencent/bugly/proguard/af;)Z

    .line 11
    :cond_2
    const-string p2, "loadConfig"

    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/af;->a(Ljava/lang/String;)V

    return-void
.end method

.method public a(Ljava/lang/String;)V
    .locals 1

    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/l4;->c:Lcom/tencent/bugly/proguard/s2;

    iput-object p1, v0, Lcom/tencent/bugly/proguard/s2;->a:Ljava/lang/String;

    return-void
.end method

.method public final a(Lcom/tencent/bugly/proguard/r2;Lcom/tencent/rmonitor/base/config/c$a;)Z
    .locals 8

    .line 30
    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->f()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "RMonitor_config_Loader"

    if-eqz v0, :cond_0

    .line 31
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "disable apply config for user turn off"

    filled-new-array {v2, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return v1

    .line 32
    :cond_0
    sget-object v0, Lcom/tencent/rmonitor/base/config/c$a;->c:Lcom/tencent/rmonitor/base/config/c$a;

    const/4 v3, 0x1

    if-eq p2, v0, :cond_5

    if-nez p1, :cond_1

    goto :goto_1

    .line 33
    :cond_1
    iget-object p2, p0, Lcom/tencent/bugly/proguard/l4;->c:Lcom/tencent/bugly/proguard/s2;

    invoke-virtual {p1, p2}, Lcom/tencent/bugly/proguard/r2;->a(Lcom/tencent/bugly/proguard/s2;)Z

    move-result p2

    if-eqz p2, :cond_2

    .line 34
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "enable apply config for param change"

    filled-new-array {v2, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return v3

    .line 35
    :cond_2
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/r2;->b()Lcom/tencent/bugly/proguard/t2;

    move-result-object p1

    .line 36
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v4

    .line 37
    iget-wide v6, p1, Lcom/tencent/bugly/proguard/t2;->f:J

    sub-long/2addr v4, v6

    .line 38
    invoke-static {v4, v5}, Ljava/lang/Math;->abs(J)J

    move-result-wide v4

    .line 39
    iget-wide p1, p1, Lcom/tencent/bugly/proguard/t2;->d:J

    cmp-long p1, v4, p1

    if-ltz p1, :cond_3

    move v1, v3

    .line 40
    :cond_3
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    if-eqz v1, :cond_4

    const-string p2, "enable apply config"

    goto :goto_0

    :cond_4
    const-string p2, "disable apply config"

    :goto_0
    filled-new-array {v2, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return v1

    .line 41
    :cond_5
    :goto_1
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string p2, "enable apply config for config change"

    filled-new-array {v2, p2}, [Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    return v3
.end method
