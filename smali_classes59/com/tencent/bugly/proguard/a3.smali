.class public Lcom/tencent/bugly/proguard/a3;
.super Ljava/lang/Object;
.source "BUGLY"

# interfaces
.implements Lcom/tencent/bugly/proguard/o8;


# annotations
.annotation build Landroidx/annotation/RestrictTo;
    value = {
        .enum Landroidx/annotation/RestrictTo$Scope;->LIBRARY_GROUP:Landroidx/annotation/RestrictTo$Scope;
    }
.end annotation


# static fields
.field public static final b:Ljava/lang/String; = "RMonitor_config"


# instance fields
.field public a:Lcom/tencent/bugly/proguard/r2;


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/tencent/bugly/proguard/a3;->a:Lcom/tencent/bugly/proguard/r2;

    .line 7
    return-void
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


# virtual methods
.method public a()Lcom/tencent/bugly/proguard/r2;
    .locals 1

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/eg;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/a3;->a(Landroid/content/SharedPreferences;)Lcom/tencent/bugly/proguard/r2;

    move-result-object v0

    return-object v0
.end method

.method public final a(Landroid/content/SharedPreferences;)Lcom/tencent/bugly/proguard/r2;
    .locals 5

    .line 23
    new-instance v0, Lcom/tencent/bugly/proguard/r2;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/r2;-><init>()V

    if-nez p1, :cond_0

    return-object v0

    .line 24
    :cond_0
    :try_start_0
    iget-object v1, v0, Lcom/tencent/bugly/proguard/r2;->c:Lcom/tencent/bugly/proguard/t2;

    .line 25
    const-string/jumbo v2, "rmonitor_config_data"

    const/4 v3, 0x0

    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    .line 26
    invoke-static {v2}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_1

    .line 27
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    iput-object v3, v1, Lcom/tencent/bugly/proguard/t2;->a:Lorg/json/JSONObject;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    .line 28
    :cond_1
    :goto_0
    const-string v2, "config_latest_md5_code"

    iget-object v3, v1, Lcom/tencent/bugly/proguard/t2;->c:Ljava/lang/String;

    invoke-interface {p1, v2, v3}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, v1, Lcom/tencent/bugly/proguard/t2;->c:Ljava/lang/String;

    .line 29
    const-string v2, "config_next_time"

    iget-wide v3, v1, Lcom/tencent/bugly/proguard/t2;->d:J

    invoke-interface {p1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/t2;->d:J

    .line 30
    const-string v2, "config_latest_update_time"

    iget-wide v3, v1, Lcom/tencent/bugly/proguard/t2;->f:J

    invoke-interface {p1, v2, v3, v4}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v2

    iput-wide v2, v1, Lcom/tencent/bugly/proguard/t2;->f:J

    .line 31
    iget-object v2, v0, Lcom/tencent/bugly/proguard/r2;->b:Lcom/tencent/bugly/proguard/s2;

    .line 32
    const-string v3, "config_last_apply_params"

    const-string v4, ""

    invoke-interface {p1, v3, v4}, Landroid/content/SharedPreferences;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    .line 33
    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_2

    .line 34
    new-instance v3, Lorg/json/JSONObject;

    invoke-direct {v3, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    .line 35
    invoke-virtual {v2, v3}, Lcom/tencent/bugly/proguard/s2;->a(Lorg/json/JSONObject;)V

    .line 36
    :cond_2
    const-string p1, "apply result from cache"

    invoke-virtual {v1, p1}, Lcom/tencent/bugly/proguard/t2;->a(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    .line 37
    :goto_1
    iget-object v1, p0, Lcom/tencent/bugly/proguard/a3;->a:Lcom/tencent/bugly/proguard/r2;

    if-eqz v1, :cond_3

    move-object v0, v1

    .line 38
    :cond_3
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 39
    const-string v2, "load apply result fail for "

    invoke-static {v2, p1}, Lcom/tencent/bugly/proguard/mf;->a(Ljava/lang/String;Ljava/lang/Throwable;)Ljava/lang/String;

    move-result-object p1

    .line 40
    const-string v2, "RMonitor_config"

    filled-new-array {v2, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return-object v0
.end method

.method public a(Lcom/tencent/bugly/proguard/r2;)Z
    .locals 6

    const/4 v0, 0x0

    if-nez p1, :cond_0

    return v0

    .line 2
    :cond_0
    iput-object p1, p0, Lcom/tencent/bugly/proguard/a3;->a:Lcom/tencent/bugly/proguard/r2;

    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/eg;->a()Landroid/content/SharedPreferences$Editor;

    move-result-object v1

    if-eqz v1, :cond_6

    .line 4
    :try_start_0
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/r2;->b()Lcom/tencent/bugly/proguard/t2;

    move-result-object v2

    .line 5
    const-string v3, "config_next_time"

    iget-wide v4, v2, Lcom/tencent/bugly/proguard/t2;->d:J

    invoke-interface {v1, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 6
    const-string v3, "config_update_time_from_apply_in_sec"

    iget-wide v4, v2, Lcom/tencent/bugly/proguard/t2;->e:J

    invoke-interface {v1, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 7
    const-string v3, "config_latest_update_time"

    iget-wide v4, v2, Lcom/tencent/bugly/proguard/t2;->f:J

    invoke-interface {v1, v3, v4, v5}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 8
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/r2;->c()Z

    move-result v3
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, ""

    if-eqz v3, :cond_3

    .line 9
    :try_start_1
    iget-object v3, v2, Lcom/tencent/bugly/proguard/t2;->a:Lorg/json/JSONObject;

    if-nez v3, :cond_1

    move-object v3, v4

    goto :goto_0

    .line 10
    :cond_1
    invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v3

    .line 11
    :goto_0
    const-string/jumbo v5, "rmonitor_config_data"

    if-nez v3, :cond_2

    move-object v3, v4

    :cond_2
    invoke-interface {v1, v5, v3}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 12
    const-string v3, "config_latest_md5_code"

    iget-object v2, v2, Lcom/tencent/bugly/proguard/t2;->c:Ljava/lang/String;

    invoke-interface {v1, v3, v2}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_3

    .line 13
    :cond_3
    :goto_1
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/r2;->a()Lcom/tencent/bugly/proguard/s2;

    move-result-object p1

    .line 14
    invoke-virtual {p1}, Lcom/tencent/bugly/proguard/s2;->a()Lorg/json/JSONObject;

    move-result-object p1

    if-nez p1, :cond_4

    move-object p1, v4

    goto :goto_2

    .line 15
    :cond_4
    invoke-virtual {p1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p1

    .line 16
    :goto_2
    const-string v2, "config_last_apply_params"

    if-nez p1, :cond_5

    move-object p1, v4

    :cond_5
    invoke-interface {v1, v2, p1}, Landroid/content/SharedPreferences$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)Landroid/content/SharedPreferences$Editor;

    .line 17
    invoke-interface {v1}, Landroid/content/SharedPreferences$Editor;->commit()Z
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v0, 0x1

    goto :goto_4

    .line 18
    :goto_3
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v4

    goto :goto_4

    .line 19
    :cond_6
    const-string v4, "editor is null."

    :goto_4
    if-nez v0, :cond_7

    .line 20
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 21
    const-string/jumbo v1, "save config apply data fail for "

    invoke-static {v1, v4}, Lcom/tencent/bugly/proguard/l7;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 22
    const-string v2, "RMonitor_config"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    :cond_7
    return v0
.end method
