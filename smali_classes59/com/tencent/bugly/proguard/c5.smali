.class public final Lcom/tencent/bugly/proguard/c5;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final i:Ljava/lang/String; = "RMonitor_report_entrance"

.field public static final j:Ljava/lang/String; = "limit_code"

.field public static final k:Ljava/lang/String; = "limit_expiration_time"

.field public static final l:Ljava/lang/String; = "config_latest_update_time"

.field public static final m:I = 0x0

.field public static final n:I = 0x186b4

.field public static final o:I = 0x186be

.field public static final p:I = 0x186c8

.field public static final q:I = 0x186ab

.field public static final r:J = 0xea60L

.field public static s:Lcom/tencent/bugly/proguard/c5;


# instance fields
.field public a:I

.field public b:J

.field public c:J

.field public d:Z

.field public e:J

.field public f:J

.field public final g:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public final h:Ljava/util/ArrayList;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/ArrayList<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method public constructor <init>()V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput v0, p0, Lcom/tencent/bugly/proguard/c5;->a:I

    .line 7
    .line 8
    const-wide/16 v1, 0x0

    .line 9
    .line 10
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/c5;->b:J

    .line 11
    .line 12
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/c5;->c:J

    .line 13
    .line 14
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/c5;->d:Z

    .line 15
    .line 16
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/c5;->e:J

    .line 17
    .line 18
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/c5;->f:J

    .line 19
    .line 20
    new-instance v0, Ljava/util/ArrayList;

    .line 21
    const/4 v1, 0x3

    .line 22
    .line 23
    .line 24
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 25
    .line 26
    iput-object v0, p0, Lcom/tencent/bugly/proguard/c5;->g:Ljava/util/ArrayList;

    .line 27
    .line 28
    new-instance v1, Ljava/util/ArrayList;

    .line 29
    const/4 v2, 0x4

    .line 30
    .line 31
    .line 32
    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    .line 33
    .line 34
    iput-object v1, p0, Lcom/tencent/bugly/proguard/c5;->h:Ljava/util/ArrayList;

    .line 35
    .line 36
    const-string v2, "crash"

    .line 37
    .line 38
    .line 39
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 40
    .line 41
    const-string v2, "anr"

    .line 42
    .line 43
    .line 44
    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->addAll(Ljava/util/Collection;)Z

    .line 48
    .line 49
    const-string v0, "error"

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 53
    return-void
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public static a(Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;)V
    .locals 6

    .line 1
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    const-string v1, "] fail for "

    const-string v2, "."

    const-string/jumbo v3, "update by ["

    const-string v4, "RMonitor_report_entrance"

    if-nez v0, :cond_2

    invoke-static {p1}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-nez v0, :cond_2

    if-nez p2, :cond_0

    goto :goto_0

    .line 2
    :cond_0
    const-string v0, "limit_code"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 3
    const-string v0, "limit_expiration_time"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 4
    const-string v0, "config_latest_update_time"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_1

    .line 5
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    if-eqz v0, :cond_3

    .line 6
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v4, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    return-void

    .line 7
    :cond_1
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/c5;->b()Lcom/tencent/bugly/proguard/c5;

    move-result-object v0

    invoke-virtual {v0, p2}, Lcom/tencent/bugly/proguard/c5;->a(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p2

    .line 8
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v4, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    goto :goto_1

    .line 9
    :cond_2
    :goto_0
    sget-boolean v0, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    if-eqz v0, :cond_3

    .line 10
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v4, p0}, [Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V

    :cond_3
    :goto_1
    return-void
.end method

.method public static b()Lcom/tencent/bugly/proguard/c5;
    .locals 1

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/c5;->s:Lcom/tencent/bugly/proguard/c5;

    if-nez v0, :cond_0

    .line 2
    new-instance v0, Lcom/tencent/bugly/proguard/c5;

    invoke-direct {v0}, Lcom/tencent/bugly/proguard/c5;-><init>()V

    sput-object v0, Lcom/tencent/bugly/proguard/c5;->s:Lcom/tencent/bugly/proguard/c5;

    .line 3
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/c5;->s:Lcom/tencent/bugly/proguard/c5;

    return-object v0
.end method

.method public static c(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 7

    const-string v0, "."

    const-string v1, "check block report of ["

    .line 1
    invoke-static {}, Lcom/tencent/bugly/proguard/m7;->g()Z

    move-result v2

    const-string v3, "RMonitor_report_entrance"

    if-eqz v2, :cond_0

    .line 2
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    filled-new-array {p0, p1}, [Ljava/lang/Object;

    move-result-object p0

    .line 3
    const-string p1, "block report %s.%s for app in standalone mode."

    invoke-static {p1, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    filled-new-array {v3, p0}, [Ljava/lang/String;

    move-result-object p0

    .line 4
    invoke-virtual {v0, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 v2, 0x0

    .line 5
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/c5;->b()Lcom/tencent/bugly/proguard/c5;

    move-result-object v4

    invoke-virtual {v4, p0, p1}, Lcom/tencent/bugly/proguard/c5;->b(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v4, "], block: "

    if-eqz v2, :cond_1

    .line 6
    :try_start_1
    sget-object v5, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/tencent/rmonitor/common/logger/Logger;->i([Ljava/lang/String;)V

    return v2

    :catchall_0
    move-exception v4

    goto :goto_0

    .line 7
    :cond_1
    sget-boolean v5, Lcom/tencent/rmonitor/common/logger/Logger;->verbos:Z

    if-eqz v5, :cond_2

    .line 8
    sget-object v5, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v3, v4}, [Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v5, v4}, Lcom/tencent/rmonitor/common/logger/Logger;->v([Ljava/lang/String;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_2
    return v2

    .line 9
    :goto_0
    sget-object v5, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "] fail for "

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    invoke-virtual {v4}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v6, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v3, p0}, [Ljava/lang/String;

    move-result-object p0

    .line 11
    invoke-virtual {v5, p0}, Lcom/tencent/rmonitor/common/logger/Logger;->e([Ljava/lang/String;)V

    return v2
.end method


# virtual methods
.method public final a()J
    .locals 4

    .line 29
    invoke-static {}, Lcom/tencent/bugly/proguard/eg;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 30
    const-string v1, "config_update_time_from_apply_in_sec"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/c5;->f:J

    .line 31
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "load from cache, config_update_time_from_apply_in_sec: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v2, p0, Lcom/tencent/bugly/proguard/c5;->f:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RMonitor_report_entrance"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 32
    :cond_0
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/c5;->f:J

    return-wide v0
.end method

.method public a(Lorg/json/JSONObject;)V
    .locals 9
    .param p1    # Lorg/json/JSONObject;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 14
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/c5;->d:Z

    if-nez v0, :cond_0

    .line 15
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/c5;->c()V

    .line 16
    :cond_0
    const-string v0, "limit_code"

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v0

    .line 17
    const-string v1, "limit_expiration_time"

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v1

    .line 18
    const-string v3, "config_latest_update_time"

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;)J

    move-result-wide v3

    .line 19
    iget v5, p0, Lcom/tencent/bugly/proguard/c5;->a:I

    const-string v6, "RMonitor_report_entrance"

    if-ne v5, v0, :cond_1

    iget-wide v7, p0, Lcom/tencent/bugly/proguard/c5;->b:J

    cmp-long v5, v7, v1

    if-nez v5, :cond_1

    iget-wide v7, p0, Lcom/tencent/bugly/proguard/c5;->c:J

    cmp-long v5, v7, v3

    if-eqz v5, :cond_2

    .line 20
    :cond_1
    sget-object v5, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v7, Ljava/lang/StringBuilder;

    const-string/jumbo v8, "update, response: "

    invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    filled-new-array {v6, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v5, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 21
    iput v0, p0, Lcom/tencent/bugly/proguard/c5;->a:I

    .line 22
    iput-wide v1, p0, Lcom/tencent/bugly/proguard/c5;->b:J

    .line 23
    iput-wide v3, p0, Lcom/tencent/bugly/proguard/c5;->c:J

    .line 24
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/c5;->d()V

    .line 25
    :cond_2
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/c5;->e()Z

    move-result p1

    if-eqz p1, :cond_3

    .line 26
    invoke-static {}, Lcom/tencent/rmonitor/base/config/b$c;->a()Lcom/tencent/rmonitor/base/config/b;

    move-result-object p1

    .line 27
    invoke-virtual {p1}, Lcom/tencent/rmonitor/base/config/b;->a()V

    :cond_3
    if-eqz v0, :cond_4

    .line 28
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string/jumbo v1, "upload data is limited by bugly\'s server, please wait "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/tencent/bugly/proguard/c5;->b:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, " second or call to bugly"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v6, v0}, [Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    :cond_4
    return-void
.end method

.method public final a(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 2

    .line 11
    iget p2, p0, Lcom/tencent/bugly/proguard/c5;->a:I

    if-nez p2, :cond_0

    goto :goto_0

    :cond_0
    const v0, 0x186ab

    const/4 v1, 0x1

    if-ne p2, v0, :cond_1

    return v1

    :cond_1
    const v0, 0x186c8

    if-eq p2, v0, :cond_4

    const v0, 0x186be

    if-ne p2, v0, :cond_2

    goto :goto_1

    :cond_2
    const v0, 0x186b4

    if-ne p2, v0, :cond_3

    .line 12
    iget-object p2, p0, Lcom/tencent/bugly/proguard/c5;->h:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_2

    :cond_3
    :goto_0
    const/4 p1, 0x0

    return p1

    .line 13
    :cond_4
    :goto_1
    iget-object p2, p0, Lcom/tencent/bugly/proguard/c5;->g:Ljava/util/ArrayList;

    invoke-virtual {p2, p1}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result p1

    :goto_2
    xor-int/2addr p1, v1

    return p1
.end method

.method public b(Ljava/lang/String;Ljava/lang/String;)Z
    .locals 8

    .line 4
    const-string/jumbo v0, "union_dau"

    invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    const-string/jumbo v0, "metric"

    invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return v1

    .line 5
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/c5;->d:Z

    if-nez v0, :cond_1

    .line 6
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/c5;->c()V

    .line 7
    :cond_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    .line 8
    iget-wide v4, p0, Lcom/tencent/bugly/proguard/c5;->b:J

    const-wide/16 v6, 0x0

    cmp-long v0, v4, v6

    if-eqz v0, :cond_2

    cmp-long v0, v2, v4

    if-lez v0, :cond_2

    return v1

    .line 9
    :cond_2
    invoke-virtual {p0, p1, p2}, Lcom/tencent/bugly/proguard/c5;->a(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p1

    return p1
.end method

.method public final c()V
    .locals 6

    .line 12
    invoke-static {}, Lcom/tencent/bugly/proguard/eg;->b()Landroid/content/SharedPreferences;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 13
    const-string v1, "entrance_resp_limit_code"

    const/4 v2, 0x0

    invoke-interface {v0, v1, v2}, Landroid/content/SharedPreferences;->getInt(Ljava/lang/String;I)I

    move-result v1

    iput v1, p0, Lcom/tencent/bugly/proguard/c5;->a:I

    .line 14
    const-string v1, "entrance_resp_limit_code_expiration_time_in_sec"

    const-wide/16 v2, 0x0

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v4

    iput-wide v4, p0, Lcom/tencent/bugly/proguard/c5;->b:J

    .line 15
    const-string v1, "entrance_resp_config_latest_update_time_in_sec"

    invoke-interface {v0, v1, v2, v3}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    iput-wide v0, p0, Lcom/tencent/bugly/proguard/c5;->c:J

    const/4 v0, 0x1

    .line 16
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/c5;->d:Z

    .line 17
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "load from cache, code: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v2, p0, Lcom/tencent/bugly/proguard/c5;->a:I

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", code_expiration_time_in_sec: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/tencent/bugly/proguard/c5;->b:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", config_latest_update_time_in_sec: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v2, p0, Lcom/tencent/bugly/proguard/c5;->c:J

    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "RMonitor_report_entrance"

    filled-new-array {v2, v1}, [Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final d()V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/tencent/bugly/proguard/eg;->a()Landroid/content/SharedPreferences$Editor;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    iget v1, p0, Lcom/tencent/bugly/proguard/c5;->a:I

    .line 9
    .line 10
    const-string v2, "entrance_resp_limit_code"

    .line 11
    .line 12
    .line 13
    invoke-interface {v0, v2, v1}, Landroid/content/SharedPreferences$Editor;->putInt(Ljava/lang/String;I)Landroid/content/SharedPreferences$Editor;

    .line 14
    .line 15
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/c5;->b:J

    .line 16
    .line 17
    const-string v3, "entrance_resp_limit_code_expiration_time_in_sec"

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 21
    .line 22
    iget-wide v1, p0, Lcom/tencent/bugly/proguard/c5;->c:J

    .line 23
    .line 24
    const-string v3, "entrance_resp_config_latest_update_time_in_sec"

    .line 25
    .line 26
    .line 27
    invoke-interface {v0, v3, v1, v2}, Landroid/content/SharedPreferences$Editor;->putLong(Ljava/lang/String;J)Landroid/content/SharedPreferences$Editor;

    .line 28
    .line 29
    .line 30
    invoke-interface {v0}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 31
    .line 32
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 33
    .line 34
    new-instance v1, Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    const-string/jumbo v2, "save to cache, code: "

    .line 38
    .line 39
    .line 40
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 41
    .line 42
    iget v2, p0, Lcom/tencent/bugly/proguard/c5;->a:I

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 46
    .line 47
    const-string v2, ", code_expiration_time_in_sec: "

    .line 48
    .line 49
    .line 50
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/c5;->b:J

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string v2, ", config_latest_update_time_in_sec: "

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/c5;->c:J

    .line 63
    .line 64
    .line 65
    invoke-virtual {v1, v2, v3}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 69
    move-result-object v1

    .line 70
    .line 71
    const-string v2, "RMonitor_report_entrance"

    .line 72
    .line 73
    .line 74
    filled-new-array {v2, v1}, [Ljava/lang/String;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V

    .line 79
    :cond_0
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
.end method

.method public final e()Z
    .locals 8

    .line 1
    .line 2
    iget-wide v0, p0, Lcom/tencent/bugly/proguard/c5;->c:J

    .line 3
    .line 4
    const-wide/16 v2, 0x0

    .line 5
    .line 6
    cmp-long v4, v0, v2

    .line 7
    const/4 v5, 0x0

    .line 8
    .line 9
    if-nez v4, :cond_0

    .line 10
    return v5

    .line 11
    .line 12
    :cond_0
    iget-wide v6, p0, Lcom/tencent/bugly/proguard/c5;->f:J

    .line 13
    .line 14
    cmp-long v0, v0, v6

    .line 15
    .line 16
    if-nez v0, :cond_1

    .line 17
    return v5

    .line 18
    .line 19
    .line 20
    :cond_1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 21
    move-result-wide v0

    .line 22
    .line 23
    iget-wide v6, p0, Lcom/tencent/bugly/proguard/c5;->e:J

    .line 24
    .line 25
    cmp-long v2, v6, v2

    .line 26
    .line 27
    if-eqz v2, :cond_2

    .line 28
    .line 29
    sub-long v2, v0, v6

    .line 30
    .line 31
    .line 32
    invoke-static {v2, v3}, Ljava/lang/Math;->abs(J)J

    .line 33
    move-result-wide v2

    .line 34
    .line 35
    .line 36
    const-wide/32 v6, 0xea60

    .line 37
    .line 38
    cmp-long v2, v2, v6

    .line 39
    .line 40
    if-gez v2, :cond_2

    .line 41
    return v5

    .line 42
    .line 43
    :cond_2
    iput-wide v0, p0, Lcom/tencent/bugly/proguard/c5;->e:J

    .line 44
    .line 45
    .line 46
    invoke-virtual {p0}, Lcom/tencent/bugly/proguard/c5;->a()J

    .line 47
    move-result-wide v0

    .line 48
    .line 49
    iget-wide v2, p0, Lcom/tencent/bugly/proguard/c5;->c:J

    .line 50
    .line 51
    cmp-long v0, v2, v0

    .line 52
    .line 53
    if-lez v0, :cond_3

    .line 54
    const/4 v0, 0x1

    .line 55
    return v0

    .line 56
    :cond_3
    return v5
    .line 57
.end method
