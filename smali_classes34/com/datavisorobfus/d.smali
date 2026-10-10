.class public Lcom/datavisorobfus/d;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Ljava/util/Map;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private static b:Ljava/lang/String;

.field private static c:J

.field public static d:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/util/TreeMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/TreeMap;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    .line 8
    .line 9
    const-string v0, ""

    .line 10
    .line 11
    sput-object v0, Lcom/datavisorobfus/d;->b:Ljava/lang/String;

    .line 12
    .line 13
    const-wide/16 v0, 0x0

    .line 14
    .line 15
    sput-wide v0, Lcom/datavisorobfus/d;->c:J

    .line 16
    const/4 v0, 0x0

    .line 17
    .line 18
    sput v0, Lcom/datavisorobfus/d;->d:I

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
.end method

.method private static a(Landroid/content/Context;)Ljava/lang/String;
    .locals 9

    .line 1
    :try_start_0
    const-string v0, "empty"

    invoke-static {p0}, Lcom/datavisorobfus/g;->a(Landroid/content/Context;)Lcom/datavisorobfus/g;

    move-result-object v1

    const-string v2, "Oo6OwHbPs8EDXJF6"

    invoke-static {v2}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lcom/datavisorobfus/g;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_2

    const-string v0, "K5+dwnnbotM="

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    new-instance v1, Lorg/json/JSONObject;

    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v4

    if-ge v3, v4, :cond_1

    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    move-result-object v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;

    move-result-object v5

    invoke-virtual {v5, v4, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;

    move-result-object v5
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_1

    :catchall_0
    const/4 v5, 0x0

    :goto_1
    if-eqz v5, :cond_0

    :try_start_2
    new-instance v6, Lorg/json/JSONArray;

    invoke-direct {v6}, Lorg/json/JSONArray;-><init>()V

    iget-wide v7, v5, Landroid/content/pm/PackageInfo;->firstInstallTime:J

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    iget-wide v7, v5, Landroid/content/pm/PackageInfo;->lastUpdateTime:J

    invoke-virtual {v6, v7, v8}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;

    invoke-virtual {v1, v4, v6}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_1
    invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    return-object p0

    :cond_2
    return-object v0

    :catchall_1
    move-exception p0

    invoke-static {p0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    const-string p0, "exception"

    return-object p0
.end method

.method public static a()V
    .locals 1

    const/4 v0, 0x0

    .line 2
    sput v0, Lcom/datavisorobfus/d;->d:I

    sget-object v0, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-interface {v0}, Ljava/util/Map;->clear()V

    return-void
.end method

.method private static a(Landroid/content/Context;Ljava/util/Map;)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 3
    const-string v0, "k2"

    invoke-static {p0}, Lcom/datavisorobfus/g;->a(Landroid/content/Context;)Lcom/datavisorobfus/g;

    move-result-object p0

    const-string v1, "PJKRy3nQrcEZUQ=="

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/datavisorobfus/g;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_1

    :try_start_0
    const-string v1, "PZeSzGs="

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    const-string v1, ""

    invoke-virtual {p0, v0, v1}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-static {p0}, Lcom/datavisorobfus/t;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-interface {p1, v0, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void

    :cond_0
    const-string p0, "k2 result is null"

    invoke-static {p0}, Lcom/datavisorobfus/f0;->b(Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_1
    return-void
.end method

.method public static declared-synchronized b(Landroid/content/Context;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    const-class v0, Lcom/datavisorobfus/d;

    monitor-enter v0

    .line 1
    :try_start_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    new-instance v3, Ljava/util/HashMap;

    invoke-direct {v3}, Ljava/util/HashMap;-><init>()V

    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/a;->b()Ljava/lang/String;

    move-result-object v4

    const-string v5, "a6"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->v()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d14"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "d15"

    const-string v5, "Android"

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->d0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d19"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->K(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d35"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->J(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d36"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d39"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d40"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->M(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d61"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/i0;->d()Ljava/lang/String;

    move-result-object v4

    const-string v5, "n10"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->g0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    const-string v6, "dynamic getWebRTCIP:  "

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/datavisorobfus/f0;->a(Ljava/lang/String;)V

    const-string v5, "d128"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v4, Ljava/lang/StringBuilder;

    invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V

    sget v5, Lcom/datavisorobfus/d;->d:I

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v5, ""

    invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string/jumbo v5, "v5"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "H6ih6lT1gu47b6BRO8on"

    invoke-static {v4}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    invoke-static {v4, v5}, Lcom/datavisor/vangogh/bridge/storage;->globalGet(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    const-string/jumbo v5, "v8"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :catchall_0
    move-exception p0

    goto/16 :goto_5

    :cond_0
    :goto_0
    const-string v4, "d95"

    const-string v5, "default"

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "DVSPLASTREAL120WAITTIME"

    invoke-static {p0, v4}, Lcom/datavisorobfus/u0;->d(Landroid/content/Context;Ljava/lang/String;)J

    move-result-wide v4

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-gez v6, :cond_1

    const-string v4, "d97"

    const-string v5, "empty"

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_1
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v4, ""

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d97"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :goto_1
    :try_start_1
    const-string v4, "empty"

    const-string v5, "empty"

    invoke-static {p0}, Lcom/datavisorobfus/e0;->a(Landroid/content/Context;)Ljava/util/Map;

    move-result-object v6

    if-eqz v6, :cond_3

    const-string v4, "dv_latitude"

    invoke-interface {v6, v4}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    const-string v4, "empty"

    goto :goto_2

    :catchall_1
    move-exception v4

    goto :goto_3

    :cond_2
    :goto_2
    const-string v5, "dv_longitude"

    invoke-interface {v6, v5}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v6

    if-eqz v6, :cond_3

    const-string v5, "empty"

    :cond_3
    const-string v6, "d22"

    invoke-interface {v3, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v5, "d23"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_4

    :goto_3
    :try_start_2
    invoke-static {v4}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :goto_4
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->r(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d138"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->P(Landroid/content/Context;)Ljava/lang/String;

    move-result-object p0

    const-string v4, "d609"

    invoke-interface {v3, v4, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sub-long/2addr v4, v1

    const-wide/32 v1, 0xf4240

    div-long/2addr v4, v1

    new-instance p0, Ljava/lang/StringBuilder;

    invoke-direct {p0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p0, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ""

    invoke-virtual {p0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v1, "d80"

    invoke-interface {v3, v1, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    monitor-exit v0

    return-object v3

    :goto_5
    :try_start_3
    monitor-exit v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw p0
.end method

.method private static b(Landroid/content/Context;Ljava/util/Map;)V
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    .line 2
    const-string v0, "empty"

    invoke-static {p0}, Lcom/datavisorobfus/g;->a(Landroid/content/Context;)Lcom/datavisorobfus/g;

    move-result-object p0

    const-string v1, "PJKRy3nQrcEZUQ=="

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lcom/datavisorobfus/g;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    if-eqz p0, :cond_5

    :try_start_0
    const-string v1, "K4yR2Ws="

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/datavisorobfus/t;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_0

    move-object v4, v0

    :cond_0
    invoke-interface {p1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception v1

    invoke-static {v1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_1
    :try_start_1
    const-string v1, "OJOa"

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    invoke-virtual {v1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/datavisorobfus/t;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2

    move-object v4, v0

    :cond_2
    invoke-interface {p1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_1

    :catchall_1
    move-exception v1

    invoke-static {v1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_3
    :try_start_2
    const-string v1, "PZeSzGs="

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p0

    invoke-virtual {p0}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v1

    :goto_2
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/datavisorobfus/t;->e(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_4

    move-object v3, v0

    :cond_4
    invoke-interface {p1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    goto :goto_2

    :catchall_2
    move-exception p0

    invoke-static {p0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_5
    return-void
.end method

.method private static c(Landroid/content/Context;)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/datavisorobfus/g;->a(Landroid/content/Context;)Lcom/datavisorobfus/g;

    .line 4
    move-result-object p0

    .line 5
    .line 6
    const-string v0, "PZeSzH3ErtMb"

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v0}, Lcom/datavisorobfus/g;->a(Ljava/lang/String;)Lorg/json/JSONObject;

    .line 14
    move-result-object p0

    .line 15
    .line 16
    if-eqz p0, :cond_2

    .line 17
    .line 18
    :try_start_0
    const-string v0, "PZeSzGs="

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    .line 25
    invoke-virtual {p0, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    .line 26
    move-result-object p0

    .line 27
    .line 28
    new-instance v0, Lorg/json/JSONArray;

    .line 29
    .line 30
    .line 31
    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 32
    const/4 v1, 0x0

    .line 33
    .line 34
    .line 35
    :goto_0
    invoke-virtual {p0}, Lorg/json/JSONArray;->length()I

    .line 36
    move-result v2

    .line 37
    .line 38
    if-ge v1, v2, :cond_1

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, v1}, Lorg/json/JSONArray;->getString(I)Ljava/lang/String;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-static {v2}, Lcom/datavisorobfus/v;->a(Ljava/lang/String;)Z

    .line 46
    move-result v3

    .line 47
    .line 48
    if-eqz v3, :cond_0

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v2}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    .line 52
    .line 53
    :cond_0
    add-int/lit8 v1, v1, 0x1

    .line 54
    goto :goto_0

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    .line 58
    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 59
    return-object p0

    .line 60
    :catchall_0
    move-exception p0

    .line 61
    .line 62
    .line 63
    invoke-static {p0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    .line 64
    .line 65
    const-string p0, "exception"

    .line 66
    return-object p0

    .line 67
    .line 68
    :cond_2
    const-string p0, "empty"

    .line 69
    return-object p0
    .line 70
    .line 71
    .line 72
.end method

.method public static declared-synchronized d(Landroid/content/Context;)Ljava/lang/String;
    .locals 7

    .line 1
    .line 2
    const-class v0, Lcom/datavisorobfus/d;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    sget-object v1, Lcom/datavisorobfus/d;->b:Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    invoke-static {v1}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    .line 9
    move-result v1

    .line 10
    .line 11
    if-eqz v1, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 15
    move-result-wide v1

    .line 16
    .line 17
    sget-wide v3, Lcom/datavisorobfus/d;->c:J

    .line 18
    .line 19
    .line 20
    const-wide/32 v5, 0x5265c00

    .line 21
    add-long/2addr v3, v5

    .line 22
    .line 23
    cmp-long v1, v1, v3

    .line 24
    .line 25
    if-gez v1, :cond_0

    .line 26
    .line 27
    sget-object p0, Lcom/datavisorobfus/d;->b:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    monitor-exit v0

    .line 29
    return-object p0

    .line 30
    :catchall_0
    move-exception p0

    .line 31
    .line 32
    goto/16 :goto_3

    .line 33
    .line 34
    :cond_0
    :try_start_1
    const-string v1, ""

    .line 35
    .line 36
    sput-object v1, Lcom/datavisorobfus/d;->b:Ljava/lang/String;

    .line 37
    .line 38
    new-instance v1, Ljava/util/HashMap;

    .line 39
    .line 40
    .line 41
    invoke-direct {v1}, Ljava/util/HashMap;-><init>()V

    .line 42
    .line 43
    .line 44
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 45
    move-result-object v2

    .line 46
    .line 47
    .line 48
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->v(Landroid/content/Context;)Ljava/lang/String;

    .line 49
    move-result-object v2

    .line 50
    .line 51
    const-string v3, "d1"

    .line 52
    .line 53
    .line 54
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 55
    .line 56
    .line 57
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->x(Landroid/content/Context;)Ljava/lang/String;

    .line 62
    move-result-object v2

    .line 63
    .line 64
    const-string v3, "d2"

    .line 65
    .line 66
    .line 67
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 71
    move-result-object v2

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->V(Landroid/content/Context;)Ljava/lang/String;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    const-string v3, "d3"

    .line 78
    .line 79
    .line 80
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 81
    .line 82
    .line 83
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 84
    move-result-object v2

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->E(Landroid/content/Context;)Ljava/lang/String;

    .line 88
    move-result-object v2

    .line 89
    .line 90
    const-string v3, "d4"

    .line 91
    .line 92
    .line 93
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 94
    .line 95
    .line 96
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 97
    move-result-object v2

    .line 98
    .line 99
    .line 100
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->k(Landroid/content/Context;)Ljava/lang/String;

    .line 101
    move-result-object v2

    .line 102
    .line 103
    const-string v3, "d5"

    .line 104
    .line 105
    .line 106
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 107
    .line 108
    .line 109
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 110
    move-result-object v2

    .line 111
    .line 112
    .line 113
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 114
    move-result-object v2

    .line 115
    .line 116
    const-string v3, "d6"

    .line 117
    .line 118
    .line 119
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 120
    .line 121
    .line 122
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 123
    move-result-object v2

    .line 124
    .line 125
    .line 126
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->b()Ljava/lang/String;

    .line 127
    move-result-object v2

    .line 128
    .line 129
    const-string v3, "d7"

    .line 130
    .line 131
    .line 132
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 133
    .line 134
    .line 135
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 136
    move-result-object v2

    .line 137
    .line 138
    .line 139
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->a()Ljava/lang/String;

    .line 140
    move-result-object v2

    .line 141
    .line 142
    const-string v3, "d8"

    .line 143
    .line 144
    .line 145
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 146
    .line 147
    .line 148
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 149
    move-result-object v2

    .line 150
    .line 151
    .line 152
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->u()Ljava/lang/String;

    .line 153
    move-result-object v2

    .line 154
    .line 155
    const-string v3, "d9"

    .line 156
    .line 157
    .line 158
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 159
    .line 160
    .line 161
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 162
    move-result-object v2

    .line 163
    .line 164
    .line 165
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->n()Ljava/lang/String;

    .line 166
    move-result-object v2

    .line 167
    .line 168
    const-string v3, "d13"

    .line 169
    .line 170
    .line 171
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    .line 173
    .line 174
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 175
    move-result-object v2

    .line 176
    .line 177
    .line 178
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->v()Ljava/lang/String;

    .line 179
    move-result-object v2

    .line 180
    .line 181
    const-string v3, "d14"

    .line 182
    .line 183
    .line 184
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    .line 186
    const-string v2, "d15"

    .line 187
    .line 188
    const-string v3, "Android"

    .line 189
    .line 190
    .line 191
    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    .line 193
    .line 194
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 195
    move-result-object v2

    .line 196
    .line 197
    .line 198
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->d()Ljava/lang/String;

    .line 199
    move-result-object v2

    .line 200
    .line 201
    const-string v3, "d16"

    .line 202
    .line 203
    .line 204
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 208
    move-result-object v2

    .line 209
    .line 210
    .line 211
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->Y(Landroid/content/Context;)Ljava/lang/String;

    .line 212
    move-result-object v2

    .line 213
    .line 214
    const-string v3, "d17"

    .line 215
    .line 216
    .line 217
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 218
    .line 219
    .line 220
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 221
    move-result-object v2

    .line 222
    .line 223
    .line 224
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->W(Landroid/content/Context;)Ljava/lang/String;

    .line 225
    move-result-object v2

    .line 226
    .line 227
    const-string v3, "d18"

    .line 228
    .line 229
    .line 230
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 231
    .line 232
    .line 233
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 234
    move-result-object v2

    .line 235
    .line 236
    .line 237
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->r()Ljava/lang/String;

    .line 238
    move-result-object v2

    .line 239
    .line 240
    const-string v3, "d20"

    .line 241
    .line 242
    .line 243
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 244
    .line 245
    .line 246
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 247
    move-result-object v2

    .line 248
    .line 249
    .line 250
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->e0(Landroid/content/Context;)Ljava/lang/String;

    .line 251
    move-result-object v2

    .line 252
    .line 253
    const-string v3, "d24"

    .line 254
    .line 255
    .line 256
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 257
    .line 258
    .line 259
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 260
    move-result-object v2

    .line 261
    .line 262
    .line 263
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->h0(Landroid/content/Context;)Ljava/lang/String;

    .line 264
    move-result-object v2

    .line 265
    .line 266
    const-string v3, "d28"

    .line 267
    .line 268
    .line 269
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 270
    .line 271
    .line 272
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 273
    move-result-object v2

    .line 274
    .line 275
    .line 276
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->i0(Landroid/content/Context;)Ljava/lang/String;

    .line 277
    move-result-object v2

    .line 278
    .line 279
    const-string v3, "d29"

    .line 280
    .line 281
    .line 282
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 283
    .line 284
    .line 285
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 286
    move-result-object v2

    .line 287
    .line 288
    .line 289
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->N(Landroid/content/Context;)Ljava/lang/String;

    .line 290
    move-result-object v2

    .line 291
    .line 292
    const-string v3, "d30"

    .line 293
    .line 294
    .line 295
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    .line 297
    .line 298
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 299
    move-result-object v2

    .line 300
    .line 301
    .line 302
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->l(Landroid/content/Context;)Ljava/lang/String;

    .line 303
    move-result-object v2

    .line 304
    .line 305
    const-string v3, "d33"

    .line 306
    .line 307
    .line 308
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 309
    .line 310
    .line 311
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 312
    move-result-object v2

    .line 313
    .line 314
    .line 315
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->e()Ljava/lang/String;

    .line 316
    move-result-object v2

    .line 317
    .line 318
    const-string v3, "d34"

    .line 319
    .line 320
    .line 321
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 322
    .line 323
    .line 324
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 325
    move-result-object v2

    .line 326
    .line 327
    .line 328
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->E()Ljava/lang/String;

    .line 329
    move-result-object v2

    .line 330
    .line 331
    const-string v3, "d38"

    .line 332
    .line 333
    .line 334
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 335
    .line 336
    .line 337
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 338
    move-result-object v2

    .line 339
    .line 340
    .line 341
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->o()Ljava/lang/String;

    .line 342
    move-result-object v2

    .line 343
    .line 344
    const-string v3, "d41"

    .line 345
    .line 346
    .line 347
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 348
    .line 349
    .line 350
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 351
    move-result-object v2

    .line 352
    .line 353
    .line 354
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->k()Ljava/lang/String;

    .line 355
    move-result-object v2

    .line 356
    .line 357
    const-string v3, "d42"

    .line 358
    .line 359
    .line 360
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 364
    move-result-object v2

    .line 365
    .line 366
    .line 367
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->m()Ljava/lang/String;

    .line 368
    move-result-object v2

    .line 369
    .line 370
    const-string v3, "d43"

    .line 371
    .line 372
    .line 373
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 374
    .line 375
    .line 376
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 377
    move-result-object v2

    .line 378
    .line 379
    .line 380
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 381
    move-result-object v2

    .line 382
    .line 383
    const-string v3, "d44"

    .line 384
    .line 385
    .line 386
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 387
    .line 388
    .line 389
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 390
    move-result-object v2

    .line 391
    .line 392
    .line 393
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->a0(Landroid/content/Context;)Ljava/lang/String;

    .line 394
    move-result-object v2

    .line 395
    .line 396
    const-string v3, "d46"

    .line 397
    .line 398
    .line 399
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 400
    .line 401
    .line 402
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 403
    move-result-object v2

    .line 404
    .line 405
    .line 406
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->z()Ljava/lang/String;

    .line 407
    move-result-object v2

    .line 408
    .line 409
    const-string v3, "d47"

    .line 410
    .line 411
    .line 412
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 413
    .line 414
    .line 415
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 416
    move-result-object v2

    .line 417
    .line 418
    .line 419
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->y()Ljava/lang/String;

    .line 420
    move-result-object v2

    .line 421
    .line 422
    const-string v3, "d48"

    .line 423
    .line 424
    .line 425
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 426
    .line 427
    .line 428
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 429
    move-result-object v2

    .line 430
    .line 431
    .line 432
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->x()Ljava/lang/String;

    .line 433
    move-result-object v2

    .line 434
    .line 435
    const-string v3, "d49"

    .line 436
    .line 437
    .line 438
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 439
    .line 440
    .line 441
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 442
    move-result-object v2

    .line 443
    .line 444
    .line 445
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->A()Ljava/lang/String;

    .line 446
    move-result-object v2

    .line 447
    .line 448
    const-string v3, "d50"

    .line 449
    .line 450
    .line 451
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 452
    .line 453
    .line 454
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 455
    move-result-object v2

    .line 456
    .line 457
    .line 458
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->b0(Landroid/content/Context;)Ljava/lang/String;

    .line 459
    move-result-object v2

    .line 460
    .line 461
    const-string v3, "d51"

    .line 462
    .line 463
    .line 464
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 465
    .line 466
    .line 467
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 468
    move-result-object v2

    .line 469
    .line 470
    .line 471
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->p(Landroid/content/Context;)Ljava/lang/String;

    .line 472
    move-result-object v2

    .line 473
    .line 474
    const-string v3, "d52"

    .line 475
    .line 476
    .line 477
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 478
    .line 479
    .line 480
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 481
    move-result-object v2

    .line 482
    .line 483
    .line 484
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->A(Landroid/content/Context;)Ljava/lang/String;

    .line 485
    move-result-object v2

    .line 486
    .line 487
    const-string v3, "d54"

    .line 488
    .line 489
    .line 490
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 491
    .line 492
    .line 493
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 494
    move-result-object v2

    .line 495
    .line 496
    .line 497
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->C()Ljava/lang/String;

    .line 498
    move-result-object v2

    .line 499
    .line 500
    const-string v3, "d58"

    .line 501
    .line 502
    .line 503
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 504
    .line 505
    .line 506
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 507
    move-result-object v2

    .line 508
    .line 509
    .line 510
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->w(Landroid/content/Context;)Ljava/lang/String;

    .line 511
    move-result-object v2

    .line 512
    .line 513
    const-string v3, "d59"

    .line 514
    .line 515
    .line 516
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 517
    .line 518
    .line 519
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 520
    move-result-object v2

    .line 521
    .line 522
    .line 523
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->I(Landroid/content/Context;)Ljava/lang/String;

    .line 524
    move-result-object v2

    .line 525
    .line 526
    const-string v3, "d60"

    .line 527
    .line 528
    .line 529
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 530
    .line 531
    .line 532
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 533
    move-result-object v2

    .line 534
    .line 535
    .line 536
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->S(Landroid/content/Context;)Ljava/lang/String;

    .line 537
    move-result-object v2

    .line 538
    .line 539
    const-string v3, "d62"

    .line 540
    .line 541
    .line 542
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 543
    .line 544
    .line 545
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 546
    move-result-object v2

    .line 547
    .line 548
    .line 549
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->T(Landroid/content/Context;)Ljava/lang/String;

    .line 550
    move-result-object v2

    .line 551
    .line 552
    const-string v3, "d63"

    .line 553
    .line 554
    .line 555
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 556
    .line 557
    .line 558
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 559
    move-result-object v2

    .line 560
    .line 561
    .line 562
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->U(Landroid/content/Context;)Ljava/lang/String;

    .line 563
    move-result-object v2

    .line 564
    .line 565
    const-string v3, "d64"

    .line 566
    .line 567
    .line 568
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 569
    .line 570
    .line 571
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 572
    move-result-object v2

    .line 573
    .line 574
    .line 575
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->Q(Landroid/content/Context;)Ljava/lang/String;

    .line 576
    move-result-object v2

    .line 577
    .line 578
    const-string v3, "d65"

    .line 579
    .line 580
    .line 581
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 582
    .line 583
    .line 584
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 585
    move-result-object v2

    .line 586
    .line 587
    .line 588
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->R(Landroid/content/Context;)Ljava/lang/String;

    .line 589
    move-result-object v2

    .line 590
    .line 591
    const-string v3, "d66"

    .line 592
    .line 593
    .line 594
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 595
    .line 596
    .line 597
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 598
    move-result-object v2

    .line 599
    .line 600
    .line 601
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 602
    move-result-object v2

    .line 603
    .line 604
    const-string v3, "d68"

    .line 605
    .line 606
    .line 607
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 608
    .line 609
    .line 610
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 611
    move-result-object v2

    .line 612
    .line 613
    .line 614
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->D(Landroid/content/Context;)Ljava/lang/String;

    .line 615
    move-result-object v2

    .line 616
    .line 617
    const-string v3, "d71"

    .line 618
    .line 619
    .line 620
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 621
    .line 622
    .line 623
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 624
    move-result-object v2

    .line 625
    .line 626
    .line 627
    const-string/jumbo v3, "wlan0"

    .line 628
    .line 629
    .line 630
    invoke-virtual {v2, p0, v3}, Lcom/datavisorobfus/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 631
    move-result-object v2

    .line 632
    .line 633
    const-string v3, "d72"

    .line 634
    .line 635
    .line 636
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 637
    .line 638
    .line 639
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 640
    move-result-object v2

    .line 641
    .line 642
    .line 643
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->H(Landroid/content/Context;)Ljava/lang/String;

    .line 644
    move-result-object v2

    .line 645
    .line 646
    const-string v3, "d73"

    .line 647
    .line 648
    .line 649
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 650
    .line 651
    .line 652
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 653
    move-result-object v2

    .line 654
    .line 655
    .line 656
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->G(Landroid/content/Context;)Ljava/lang/String;

    .line 657
    move-result-object v2

    .line 658
    .line 659
    const-string v3, "d74"

    .line 660
    .line 661
    .line 662
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 663
    .line 664
    .line 665
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 666
    move-result-object v2

    .line 667
    .line 668
    .line 669
    const-string/jumbo v3, "wlan1"

    .line 670
    .line 671
    .line 672
    invoke-virtual {v2, p0, v3}, Lcom/datavisorobfus/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    .line 673
    move-result-object v2

    .line 674
    .line 675
    const-string v3, "d75"

    .line 676
    .line 677
    .line 678
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 679
    .line 680
    .line 681
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 682
    move-result-object v2

    .line 683
    .line 684
    .line 685
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->c0(Landroid/content/Context;)Ljava/lang/String;

    .line 686
    move-result-object v2

    .line 687
    .line 688
    const-string v3, "d76"

    .line 689
    .line 690
    .line 691
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 692
    .line 693
    .line 694
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 695
    move-result-object v2

    .line 696
    .line 697
    .line 698
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->o(Landroid/content/Context;)Ljava/lang/String;

    .line 699
    move-result-object v2

    .line 700
    .line 701
    const-string v3, "d78"

    .line 702
    .line 703
    .line 704
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 705
    .line 706
    .line 707
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 708
    move-result-object v2

    .line 709
    .line 710
    .line 711
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->i()Ljava/lang/String;

    .line 712
    move-result-object v2

    .line 713
    .line 714
    const-string v3, "d86"

    .line 715
    .line 716
    .line 717
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 718
    .line 719
    .line 720
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 721
    move-result-object v2

    .line 722
    .line 723
    .line 724
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->m(Landroid/content/Context;)Ljava/lang/String;

    .line 725
    move-result-object v2

    .line 726
    .line 727
    const-string v3, "d90"

    .line 728
    .line 729
    .line 730
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 731
    .line 732
    .line 733
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 734
    move-result-object v2

    .line 735
    .line 736
    .line 737
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->B(Landroid/content/Context;)Ljava/lang/String;

    .line 738
    move-result-object v2

    .line 739
    .line 740
    const-string v3, "d91"

    .line 741
    .line 742
    .line 743
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 744
    .line 745
    .line 746
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 747
    move-result-object v2

    .line 748
    .line 749
    .line 750
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->u(Landroid/content/Context;)Ljava/lang/String;

    .line 751
    move-result-object v2

    .line 752
    .line 753
    const-string v3, "d92"

    .line 754
    .line 755
    .line 756
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 757
    .line 758
    .line 759
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 760
    move-result-object v2

    .line 761
    .line 762
    .line 763
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->t()Ljava/lang/String;

    .line 764
    move-result-object v2

    .line 765
    .line 766
    const-string v3, "d94"

    .line 767
    .line 768
    .line 769
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 770
    .line 771
    .line 772
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 773
    move-result-object v2

    .line 774
    .line 775
    .line 776
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->G()Ljava/lang/String;

    .line 777
    move-result-object v2

    .line 778
    .line 779
    const-string v3, "d102"

    .line 780
    .line 781
    .line 782
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 783
    .line 784
    .line 785
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 786
    move-result-object v2

    .line 787
    .line 788
    .line 789
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->O(Landroid/content/Context;)Ljava/lang/String;

    .line 790
    move-result-object v2

    .line 791
    .line 792
    const-string v3, "d103"

    .line 793
    .line 794
    .line 795
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 796
    .line 797
    .line 798
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 799
    move-result-object v2

    .line 800
    .line 801
    .line 802
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->l()Ljava/lang/String;

    .line 803
    move-result-object v2

    .line 804
    .line 805
    const-string v3, "d109"

    .line 806
    .line 807
    .line 808
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 809
    const/4 v2, 0x0

    .line 810
    .line 811
    .line 812
    :try_start_2
    invoke-static {p0}, Lcom/datavisorobfus/q0;->a(Landroid/content/Context;)Lcom/datavisorobfus/q0;

    .line 813
    move-result-object v3

    .line 814
    .line 815
    .line 816
    invoke-virtual {v3, v2}, Lcom/datavisorobfus/q0;->a(Z)Lorg/json/JSONObject;

    .line 817
    move-result-object v3

    .line 818
    .line 819
    const-string v4, "c1"

    .line 820
    .line 821
    .line 822
    const-string/jumbo v5, "result"

    .line 823
    .line 824
    const-string v6, "0"

    .line 825
    .line 826
    .line 827
    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 828
    move-result-object v3

    .line 829
    .line 830
    .line 831
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 832
    goto :goto_0

    .line 833
    .line 834
    :catchall_1
    :try_start_3
    const-string v3, "c1"

    .line 835
    .line 836
    const-string v4, "0"

    .line 837
    .line 838
    .line 839
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 840
    .line 841
    .line 842
    :goto_0
    :try_start_4
    invoke-static {p0}, Lcom/datavisorobfus/x;->a(Landroid/content/Context;)Lcom/datavisorobfus/x;

    .line 843
    move-result-object v3

    .line 844
    .line 845
    .line 846
    invoke-virtual {v3, v2}, Lcom/datavisorobfus/x;->a(Z)Lorg/json/JSONObject;

    .line 847
    move-result-object v3

    .line 848
    .line 849
    const-string v4, "c3"

    .line 850
    .line 851
    .line 852
    const-string/jumbo v5, "result"

    .line 853
    .line 854
    const-string v6, "0"

    .line 855
    .line 856
    .line 857
    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 858
    move-result-object v3

    .line 859
    .line 860
    .line 861
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    .line 862
    goto :goto_1

    .line 863
    .line 864
    :catchall_2
    :try_start_5
    const-string v3, "c3"

    .line 865
    .line 866
    const-string v4, "0"

    .line 867
    .line 868
    .line 869
    invoke-interface {v1, v3, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 870
    .line 871
    .line 872
    :goto_1
    invoke-static {p0}, Lcom/datavisorobfus/x0;->a(Landroid/content/Context;)Lcom/datavisorobfus/x0;

    .line 873
    move-result-object v3

    .line 874
    .line 875
    .line 876
    invoke-virtual {v3}, Lcom/datavisorobfus/x0;->a()Ljava/lang/String;

    .line 877
    move-result-object v3

    .line 878
    .line 879
    const-string v4, "c6"

    .line 880
    .line 881
    .line 882
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 883
    .line 884
    .line 885
    invoke-static {p0}, Lcom/datavisorobfus/p;->a(Landroid/content/Context;)Lcom/datavisorobfus/p;

    .line 886
    move-result-object v3

    .line 887
    .line 888
    .line 889
    invoke-virtual {v3}, Lcom/datavisorobfus/p;->c()Ljava/lang/String;

    .line 890
    move-result-object v3

    .line 891
    .line 892
    const-string v4, "c8"

    .line 893
    .line 894
    .line 895
    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 896
    .line 897
    .line 898
    invoke-static {p0}, Lcom/datavisorobfus/h0;->a(Landroid/content/Context;)Lcom/datavisorobfus/h0;

    .line 899
    move-result-object v3

    .line 900
    .line 901
    .line 902
    invoke-virtual {v3, v2}, Lcom/datavisorobfus/h0;->a(Z)Ljava/lang/String;

    .line 903
    move-result-object v2

    .line 904
    .line 905
    const-string v3, "c9"

    .line 906
    .line 907
    .line 908
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 909
    .line 910
    .line 911
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 912
    move-result-object v2

    .line 913
    .line 914
    .line 915
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->z(Landroid/content/Context;)Ljava/lang/String;

    .line 916
    move-result-object v2

    .line 917
    .line 918
    const-string v3, "c16"

    .line 919
    .line 920
    .line 921
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 922
    .line 923
    .line 924
    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    .line 925
    move-result-object v2

    .line 926
    .line 927
    .line 928
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/a;->d(Landroid/content/Context;)Ljava/lang/String;

    .line 929
    move-result-object v2

    .line 930
    .line 931
    const-string v3, "a1"

    .line 932
    .line 933
    .line 934
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 935
    .line 936
    .line 937
    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    .line 938
    move-result-object v2

    .line 939
    .line 940
    .line 941
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/a;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 942
    move-result-object v2

    .line 943
    .line 944
    const-string v3, "a2"

    .line 945
    .line 946
    .line 947
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 948
    .line 949
    .line 950
    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    .line 951
    move-result-object v2

    .line 952
    .line 953
    .line 954
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/a;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 955
    move-result-object v2

    .line 956
    .line 957
    const-string v3, "a3"

    .line 958
    .line 959
    .line 960
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 961
    .line 962
    .line 963
    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    .line 964
    move-result-object v2

    .line 965
    .line 966
    .line 967
    invoke-virtual {v2}, Lcom/datavisorobfus/a;->b()Ljava/lang/String;

    .line 968
    move-result-object v2

    .line 969
    .line 970
    const-string v3, "a6"

    .line 971
    .line 972
    .line 973
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 974
    .line 975
    .line 976
    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    .line 977
    move-result-object v2

    .line 978
    .line 979
    .line 980
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/a;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 981
    move-result-object v2

    .line 982
    .line 983
    const-string v3, "a8"

    .line 984
    .line 985
    .line 986
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 987
    .line 988
    .line 989
    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    .line 990
    move-result-object v2

    .line 991
    .line 992
    .line 993
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/a;->b(Landroid/content/Context;)Ljava/lang/String;

    .line 994
    move-result-object v2

    .line 995
    .line 996
    const-string v3, "a9"

    .line 997
    .line 998
    .line 999
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1000
    .line 1001
    .line 1002
    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    .line 1003
    move-result-object v2

    .line 1004
    .line 1005
    .line 1006
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/i0;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 1007
    move-result-object v2

    .line 1008
    .line 1009
    const-string v3, "n1"

    .line 1010
    .line 1011
    .line 1012
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1013
    .line 1014
    .line 1015
    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    .line 1016
    move-result-object v2

    .line 1017
    .line 1018
    .line 1019
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/i0;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 1020
    move-result-object v2

    .line 1021
    .line 1022
    const-string v3, "n2"

    .line 1023
    .line 1024
    .line 1025
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1026
    .line 1027
    .line 1028
    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    .line 1029
    move-result-object v2

    .line 1030
    .line 1031
    .line 1032
    invoke-virtual {v2}, Lcom/datavisorobfus/i0;->a()Ljava/lang/String;

    .line 1033
    move-result-object v2

    .line 1034
    .line 1035
    const-string v3, "n11"

    .line 1036
    .line 1037
    .line 1038
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1039
    .line 1040
    .line 1041
    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    .line 1042
    move-result-object v2

    .line 1043
    .line 1044
    .line 1045
    invoke-virtual {v2}, Lcom/datavisorobfus/i0;->e()Ljava/lang/String;

    .line 1046
    move-result-object v2

    .line 1047
    .line 1048
    const-string v3, "n12"

    .line 1049
    .line 1050
    .line 1051
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1052
    .line 1053
    .line 1054
    invoke-static {p0}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    .line 1055
    move-result-object v2

    .line 1056
    .line 1057
    const-string v3, "H6i37Q=="

    .line 1058
    .line 1059
    .line 1060
    invoke-static {v3}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 1061
    move-result-object v3

    .line 1062
    .line 1063
    .line 1064
    invoke-virtual {v2, v3}, Lcom/datavisorobfus/y0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1065
    move-result-object v2

    .line 1066
    .line 1067
    .line 1068
    const-string/jumbo v3, "v1"

    .line 1069
    .line 1070
    .line 1071
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1072
    .line 1073
    .line 1074
    invoke-static {p0}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    .line 1075
    move-result-object v2

    .line 1076
    .line 1077
    const-string v3, "H6iqxnPZqQ=="

    .line 1078
    .line 1079
    .line 1080
    invoke-static {v3}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    .line 1081
    move-result-object v3

    .line 1082
    .line 1083
    .line 1084
    invoke-virtual {v2, v3}, Lcom/datavisorobfus/y0;->a(Ljava/lang/String;)Ljava/lang/String;

    .line 1085
    move-result-object v2

    .line 1086
    .line 1087
    .line 1088
    const-string/jumbo v3, "v2"

    .line 1089
    .line 1090
    .line 1091
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1092
    .line 1093
    .line 1094
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 1095
    move-result-object v2

    .line 1096
    .line 1097
    .line 1098
    invoke-virtual {v2, p0}, Lcom/datavisorobfus/r;->n(Landroid/content/Context;)Ljava/lang/String;

    .line 1099
    move-result-object v2

    .line 1100
    .line 1101
    .line 1102
    const-string/jumbo v3, "v4"

    .line 1103
    .line 1104
    .line 1105
    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1106
    .line 1107
    .line 1108
    invoke-static {p0, v1}, Lcom/datavisorobfus/d;->a(Landroid/content/Context;Ljava/util/Map;)V

    .line 1109
    .line 1110
    .line 1111
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 1112
    move-result-object p0

    .line 1113
    .line 1114
    .line 1115
    invoke-virtual {p0}, Lcom/datavisorobfus/i;->a()Ljava/lang/String;

    .line 1116
    move-result-object p0

    .line 1117
    .line 1118
    .line 1119
    const-string/jumbo v2, "u1"

    .line 1120
    .line 1121
    .line 1122
    invoke-interface {v1, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1123
    .line 1124
    .line 1125
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    .line 1126
    move-result-object p0

    .line 1127
    .line 1128
    .line 1129
    invoke-virtual {p0}, Lcom/datavisorobfus/i;->c()Ljava/lang/String;

    .line 1130
    move-result-object p0

    .line 1131
    .line 1132
    .line 1133
    const-string/jumbo v2, "u2"

    .line 1134
    .line 1135
    .line 1136
    invoke-interface {v1, v2, p0}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 1137
    .line 1138
    .line 1139
    invoke-interface {v1}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    .line 1140
    move-result-object p0

    .line 1141
    .line 1142
    .line 1143
    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    .line 1144
    move-result-object p0

    .line 1145
    .line 1146
    .line 1147
    :cond_1
    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 1148
    move-result v2

    .line 1149
    .line 1150
    if-eqz v2, :cond_3

    .line 1151
    .line 1152
    .line 1153
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 1154
    move-result-object v2

    .line 1155
    .line 1156
    check-cast v2, Ljava/util/Map$Entry;

    .line 1157
    .line 1158
    .line 1159
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1160
    move-result-object v3

    .line 1161
    .line 1162
    const-string v4, "default"

    .line 1163
    .line 1164
    .line 1165
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1166
    move-result v3

    .line 1167
    .line 1168
    if-nez v3, :cond_2

    .line 1169
    .line 1170
    .line 1171
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1172
    move-result-object v3

    .line 1173
    .line 1174
    .line 1175
    const-string/jumbo v4, "para_err"

    .line 1176
    .line 1177
    .line 1178
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1179
    move-result v3

    .line 1180
    .line 1181
    if-nez v3, :cond_2

    .line 1182
    .line 1183
    .line 1184
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1185
    move-result-object v3

    .line 1186
    .line 1187
    const-string v4, "no_permission"

    .line 1188
    .line 1189
    .line 1190
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1191
    move-result v3

    .line 1192
    .line 1193
    if-nez v3, :cond_2

    .line 1194
    .line 1195
    .line 1196
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1197
    move-result-object v3

    .line 1198
    .line 1199
    const-string v4, "exception"

    .line 1200
    .line 1201
    .line 1202
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1203
    move-result v3

    .line 1204
    .line 1205
    if-nez v3, :cond_2

    .line 1206
    .line 1207
    .line 1208
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1209
    move-result-object v3

    .line 1210
    .line 1211
    const-string v4, "empty"

    .line 1212
    .line 1213
    .line 1214
    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1215
    move-result v3

    .line 1216
    .line 1217
    if-nez v3, :cond_2

    .line 1218
    .line 1219
    .line 1220
    invoke-interface {v2}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    .line 1221
    move-result-object v2

    .line 1222
    .line 1223
    const-string v3, "not_supported"

    .line 1224
    .line 1225
    .line 1226
    invoke-virtual {v3, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 1227
    move-result v2

    .line 1228
    .line 1229
    if-eqz v2, :cond_1

    .line 1230
    .line 1231
    .line 1232
    :cond_2
    invoke-interface {p0}, Ljava/util/Iterator;->remove()V

    .line 1233
    goto :goto_2

    .line 1234
    .line 1235
    .line 1236
    :cond_3
    invoke-static {v1}, Lcom/datavisorobfus/e;->b(Ljava/util/Map;)Lorg/json/JSONObject;

    .line 1237
    move-result-object p0

    .line 1238
    .line 1239
    .line 1240
    invoke-virtual {p0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    .line 1241
    move-result-object p0

    .line 1242
    const/4 v1, 0x3

    .line 1243
    .line 1244
    .line 1245
    invoke-static {p0, v1}, Lcom/datavisorobfus/m;->a(Ljava/lang/String;I)Lcom/datavisorobfus/m$a;

    .line 1246
    move-result-object p0

    .line 1247
    .line 1248
    if-eqz p0, :cond_4

    .line 1249
    .line 1250
    iget v1, p0, Lcom/datavisorobfus/m$a;->a:I

    .line 1251
    .line 1252
    if-nez v1, :cond_4

    .line 1253
    .line 1254
    new-instance v1, Ljava/lang/StringBuilder;

    .line 1255
    .line 1256
    .line 1257
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 1258
    .line 1259
    const-string v2, "LT"

    .line 1260
    .line 1261
    .line 1262
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1263
    .line 1264
    iget-object p0, p0, Lcom/datavisorobfus/m$a;->b:[B

    .line 1265
    .line 1266
    const/16 v2, 0xb

    .line 1267
    .line 1268
    .line 1269
    invoke-static {p0, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    .line 1270
    move-result-object p0

    .line 1271
    .line 1272
    .line 1273
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1274
    .line 1275
    .line 1276
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 1277
    move-result-object p0

    .line 1278
    .line 1279
    sput-object p0, Lcom/datavisorobfus/d;->b:Ljava/lang/String;

    .line 1280
    .line 1281
    .line 1282
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 1283
    move-result-wide v1

    .line 1284
    .line 1285
    sput-wide v1, Lcom/datavisorobfus/d;->c:J

    .line 1286
    .line 1287
    :cond_4
    sget-object p0, Lcom/datavisorobfus/d;->b:Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    .line 1288
    monitor-exit v0

    .line 1289
    return-object p0

    .line 1290
    :goto_3
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    .line 1291
    throw p0
.end method

.method public static declared-synchronized e(Landroid/content/Context;)Lorg/json/JSONObject;
    .locals 7

    .line 1
    .line 2
    const-class v0, Lcom/datavisorobfus/d;

    .line 3
    monitor-enter v0

    .line 4
    .line 5
    :try_start_0
    new-instance v1, Lorg/json/JSONObject;

    .line 6
    .line 7
    .line 8
    invoke-direct {v1}, Lorg/json/JSONObject;-><init>()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_3

    .line 9
    .line 10
    :try_start_1
    const-string v2, "d20"

    .line 11
    .line 12
    .line 13
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 14
    move-result-object v3

    .line 15
    .line 16
    .line 17
    invoke-virtual {v3}, Lcom/datavisorobfus/r;->r()Ljava/lang/String;

    .line 18
    move-result-object v3

    .line 19
    .line 20
    .line 21
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 22
    .line 23
    const-string v2, "d24"

    .line 24
    .line 25
    .line 26
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 27
    move-result-object v3

    .line 28
    .line 29
    .line 30
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/r;->e0(Landroid/content/Context;)Ljava/lang/String;

    .line 31
    move-result-object v3

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 35
    .line 36
    const-string v2, "d25"

    .line 37
    .line 38
    .line 39
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 40
    move-result-object v3

    .line 41
    .line 42
    .line 43
    invoke-virtual {v3}, Lcom/datavisorobfus/r;->F()Ljava/lang/String;

    .line 44
    move-result-object v3

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 48
    .line 49
    const-string v2, "d28"

    .line 50
    .line 51
    .line 52
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 53
    move-result-object v3

    .line 54
    .line 55
    .line 56
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/r;->h0(Landroid/content/Context;)Ljava/lang/String;

    .line 57
    move-result-object v3

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 61
    .line 62
    const-string v2, "d29"

    .line 63
    .line 64
    .line 65
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 66
    move-result-object v3

    .line 67
    .line 68
    .line 69
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/r;->i0(Landroid/content/Context;)Ljava/lang/String;

    .line 70
    move-result-object v3

    .line 71
    .line 72
    .line 73
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 74
    .line 75
    const-string v2, "d30"

    .line 76
    .line 77
    .line 78
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 79
    move-result-object v3

    .line 80
    .line 81
    .line 82
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/r;->N(Landroid/content/Context;)Ljava/lang/String;

    .line 83
    move-result-object v3

    .line 84
    .line 85
    .line 86
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 87
    .line 88
    const-string v2, "d33"

    .line 89
    .line 90
    .line 91
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 92
    move-result-object v3

    .line 93
    .line 94
    .line 95
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/r;->l(Landroid/content/Context;)Ljava/lang/String;

    .line 96
    move-result-object v3

    .line 97
    .line 98
    .line 99
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 100
    .line 101
    const-string v2, "d44"

    .line 102
    .line 103
    .line 104
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 105
    move-result-object v3

    .line 106
    .line 107
    .line 108
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/r;->a(Landroid/content/Context;)Ljava/lang/String;

    .line 109
    move-result-object v3

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_2

    .line 113
    const/4 v2, 0x0

    .line 114
    .line 115
    .line 116
    :try_start_2
    invoke-static {p0}, Lcom/datavisorobfus/q0;->a(Landroid/content/Context;)Lcom/datavisorobfus/q0;

    .line 117
    move-result-object v3

    .line 118
    .line 119
    .line 120
    invoke-virtual {v3, v2}, Lcom/datavisorobfus/q0;->a(Z)Lorg/json/JSONObject;

    .line 121
    move-result-object v3

    .line 122
    .line 123
    const-string v4, "c1"

    .line 124
    .line 125
    .line 126
    const-string/jumbo v5, "result"

    .line 127
    .line 128
    const-string v6, "0"

    .line 129
    .line 130
    .line 131
    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 132
    move-result-object v3

    .line 133
    .line 134
    .line 135
    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 136
    goto :goto_0

    .line 137
    :catchall_0
    move-exception v3

    .line 138
    .line 139
    .line 140
    :try_start_3
    invoke-static {v3}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    .line 141
    .line 142
    const-string v3, "c1"

    .line 143
    .line 144
    const-string v4, "0"

    .line 145
    .line 146
    .line 147
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 148
    .line 149
    .line 150
    :goto_0
    :try_start_4
    invoke-static {p0}, Lcom/datavisorobfus/x;->a(Landroid/content/Context;)Lcom/datavisorobfus/x;

    .line 151
    move-result-object v3

    .line 152
    .line 153
    .line 154
    invoke-virtual {v3, v2}, Lcom/datavisorobfus/x;->a(Z)Lorg/json/JSONObject;

    .line 155
    move-result-object v3

    .line 156
    .line 157
    const-string v4, "c3"

    .line 158
    .line 159
    .line 160
    const-string/jumbo v5, "result"

    .line 161
    .line 162
    const-string v6, "0"

    .line 163
    .line 164
    .line 165
    invoke-virtual {v3, v5, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    .line 166
    move-result-object v3

    .line 167
    .line 168
    .line 169
    invoke-virtual {v1, v4, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 170
    goto :goto_1

    .line 171
    :catchall_1
    move-exception v3

    .line 172
    .line 173
    .line 174
    :try_start_5
    invoke-static {v3}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    .line 175
    .line 176
    const-string v3, "c3"

    .line 177
    .line 178
    const-string v4, "0"

    .line 179
    .line 180
    .line 181
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 182
    .line 183
    :goto_1
    const-string v3, "c6"

    .line 184
    .line 185
    .line 186
    invoke-static {p0}, Lcom/datavisorobfus/x0;->a(Landroid/content/Context;)Lcom/datavisorobfus/x0;

    .line 187
    move-result-object v4

    .line 188
    .line 189
    .line 190
    invoke-virtual {v4}, Lcom/datavisorobfus/x0;->a()Ljava/lang/String;

    .line 191
    move-result-object v4

    .line 192
    .line 193
    .line 194
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 195
    .line 196
    const-string v3, "c8"

    .line 197
    .line 198
    .line 199
    invoke-static {p0}, Lcom/datavisorobfus/p;->a(Landroid/content/Context;)Lcom/datavisorobfus/p;

    .line 200
    move-result-object v4

    .line 201
    .line 202
    .line 203
    invoke-virtual {v4}, Lcom/datavisorobfus/p;->c()Ljava/lang/String;

    .line 204
    move-result-object v4

    .line 205
    .line 206
    .line 207
    invoke-virtual {v1, v3, v4}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 208
    .line 209
    const-string v3, "c9"

    .line 210
    .line 211
    .line 212
    invoke-static {p0}, Lcom/datavisorobfus/h0;->a(Landroid/content/Context;)Lcom/datavisorobfus/h0;

    .line 213
    move-result-object v4

    .line 214
    .line 215
    .line 216
    invoke-virtual {v4, v2}, Lcom/datavisorobfus/h0;->a(Z)Ljava/lang/String;

    .line 217
    move-result-object v2

    .line 218
    .line 219
    .line 220
    invoke-virtual {v1, v3, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 221
    .line 222
    const-string v2, "c21"

    .line 223
    .line 224
    .line 225
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 226
    move-result-object v3

    .line 227
    .line 228
    .line 229
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/r;->L(Landroid/content/Context;)Ljava/lang/String;

    .line 230
    move-result-object v3

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 234
    .line 235
    const-string v2, "n1"

    .line 236
    .line 237
    .line 238
    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    .line 239
    move-result-object v3

    .line 240
    .line 241
    .line 242
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/i0;->e(Landroid/content/Context;)Ljava/lang/String;

    .line 243
    move-result-object v3

    .line 244
    .line 245
    .line 246
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 247
    .line 248
    const-string v2, "n2"

    .line 249
    .line 250
    .line 251
    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    .line 252
    move-result-object v3

    .line 253
    .line 254
    .line 255
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/i0;->g(Landroid/content/Context;)Ljava/lang/String;

    .line 256
    move-result-object v3

    .line 257
    .line 258
    .line 259
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 260
    .line 261
    const-string v2, "n3"

    .line 262
    .line 263
    .line 264
    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    .line 265
    move-result-object v3

    .line 266
    .line 267
    .line 268
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/i0;->f(Landroid/content/Context;)Ljava/lang/String;

    .line 269
    move-result-object v3

    .line 270
    .line 271
    .line 272
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 273
    .line 274
    const-string v2, "n4"

    .line 275
    .line 276
    .line 277
    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    .line 278
    move-result-object v3

    .line 279
    .line 280
    .line 281
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/i0;->h(Landroid/content/Context;)Ljava/lang/String;

    .line 282
    move-result-object v3

    .line 283
    .line 284
    .line 285
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 286
    .line 287
    const-string v2, "n9"

    .line 288
    .line 289
    .line 290
    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    .line 291
    move-result-object v3

    .line 292
    .line 293
    .line 294
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/i0;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 295
    move-result-object v3

    .line 296
    .line 297
    .line 298
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 299
    .line 300
    const-string v2, "n11"

    .line 301
    .line 302
    .line 303
    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    .line 304
    move-result-object v3

    .line 305
    .line 306
    .line 307
    invoke-virtual {v3}, Lcom/datavisorobfus/i0;->a()Ljava/lang/String;

    .line 308
    move-result-object v3

    .line 309
    .line 310
    .line 311
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 312
    .line 313
    const-string v2, "d39"

    .line 314
    .line 315
    .line 316
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 317
    move-result-object v3

    .line 318
    .line 319
    .line 320
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/r;->h(Landroid/content/Context;)Ljava/lang/String;

    .line 321
    move-result-object v3

    .line 322
    .line 323
    .line 324
    invoke-virtual {v1, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 325
    .line 326
    const-string v2, "d40"

    .line 327
    .line 328
    .line 329
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 330
    move-result-object v3

    .line 331
    .line 332
    .line 333
    invoke-virtual {v3, p0}, Lcom/datavisorobfus/r;->i(Landroid/content/Context;)Ljava/lang/String;

    .line 334
    move-result-object p0

    .line 335
    .line 336
    .line 337
    invoke-virtual {v1, v2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 338
    .line 339
    const-string p0, "d136"

    .line 340
    .line 341
    .line 342
    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    .line 343
    move-result-object v2

    .line 344
    .line 345
    .line 346
    invoke-virtual {v2}, Lcom/datavisorobfus/r;->p()Ljava/lang/String;

    .line 347
    move-result-object v2

    .line 348
    .line 349
    .line 350
    invoke-virtual {v1, p0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    .line 351
    :catchall_2
    monitor-exit v0

    .line 352
    return-object v1

    .line 353
    :catchall_3
    move-exception p0

    .line 354
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_3

    .line 355
    throw p0
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
    .line 994
    .line 995
    .line 996
    .line 997
    .line 998
    .line 999
    .line 1000
    .line 1001
    .line 1002
    .line 1003
    .line 1004
    .line 1005
    .line 1006
    .line 1007
    .line 1008
    .line 1009
    .line 1010
    .line 1011
    .line 1012
    .line 1013
    .line 1014
    .line 1015
    .line 1016
    .line 1017
    .line 1018
    .line 1019
    .line 1020
    .line 1021
    .line 1022
    .line 1023
    .line 1024
    .line 1025
    .line 1026
    .line 1027
    .line 1028
    .line 1029
    .line 1030
    .line 1031
    .line 1032
    .line 1033
    .line 1034
    .line 1035
    .line 1036
    .line 1037
    .line 1038
    .line 1039
    .line 1040
    .line 1041
    .line 1042
    .line 1043
    .line 1044
    .line 1045
    .line 1046
    .line 1047
    .line 1048
    .line 1049
    .line 1050
    .line 1051
    .line 1052
    .line 1053
    .line 1054
    .line 1055
    .line 1056
    .line 1057
    .line 1058
    .line 1059
    .line 1060
    .line 1061
    .line 1062
    .line 1063
    .line 1064
    .line 1065
    .line 1066
    .line 1067
    .line 1068
    .line 1069
    .line 1070
    .line 1071
    .line 1072
    .line 1073
    .line 1074
    .line 1075
    .line 1076
    .line 1077
    .line 1078
    .line 1079
    .line 1080
    .line 1081
    .line 1082
    .line 1083
    .line 1084
    .line 1085
    .line 1086
    .line 1087
    .line 1088
    .line 1089
    .line 1090
    .line 1091
    .line 1092
    .line 1093
    .line 1094
    .line 1095
    .line 1096
    .line 1097
    .line 1098
    .line 1099
    .line 1100
    .line 1101
    .line 1102
    .line 1103
    .line 1104
    .line 1105
    .line 1106
    .line 1107
    .line 1108
    .line 1109
    .line 1110
    .line 1111
    .line 1112
    .line 1113
    .line 1114
    .line 1115
    .line 1116
    .line 1117
    .line 1118
    .line 1119
    .line 1120
    .line 1121
    .line 1122
    .line 1123
    .line 1124
    .line 1125
    .line 1126
    .line 1127
    .line 1128
    .line 1129
    .line 1130
    .line 1131
    .line 1132
    .line 1133
    .line 1134
    .line 1135
    .line 1136
    .line 1137
    .line 1138
    .line 1139
    .line 1140
    .line 1141
    .line 1142
    .line 1143
    .line 1144
    .line 1145
    .line 1146
    .line 1147
    .line 1148
    .line 1149
    .line 1150
    .line 1151
    .line 1152
    .line 1153
    .line 1154
    .line 1155
    .line 1156
    .line 1157
    .line 1158
    .line 1159
    .line 1160
    .line 1161
    .line 1162
    .line 1163
    .line 1164
    .line 1165
    .line 1166
    .line 1167
    .line 1168
    .line 1169
    .line 1170
    .line 1171
    .line 1172
    .line 1173
    .line 1174
    .line 1175
    .line 1176
    .line 1177
    .line 1178
    .line 1179
    .line 1180
    .line 1181
    .line 1182
    .line 1183
    .line 1184
    .line 1185
    .line 1186
    .line 1187
    .line 1188
    .line 1189
    .line 1190
    .line 1191
    .line 1192
    .line 1193
    .line 1194
    .line 1195
    .line 1196
    .line 1197
    .line 1198
    .line 1199
    .line 1200
    .line 1201
    .line 1202
    .line 1203
    .line 1204
    .line 1205
    .line 1206
    .line 1207
    .line 1208
    .line 1209
    .line 1210
    .line 1211
    .line 1212
    .line 1213
    .line 1214
    .line 1215
    .line 1216
    .line 1217
    .line 1218
    .line 1219
    .line 1220
    .line 1221
    .line 1222
    .line 1223
    .line 1224
    .line 1225
    .line 1226
    .line 1227
    .line 1228
    .line 1229
    .line 1230
    .line 1231
    .line 1232
    .line 1233
    .line 1234
    .line 1235
    .line 1236
    .line 1237
    .line 1238
    .line 1239
    .line 1240
    .line 1241
    .line 1242
    .line 1243
    .line 1244
    .line 1245
    .line 1246
    .line 1247
    .line 1248
    .line 1249
    .line 1250
    .line 1251
    .line 1252
    .line 1253
    .line 1254
    .line 1255
    .line 1256
    .line 1257
    .line 1258
    .line 1259
    .line 1260
    .line 1261
    .line 1262
    .line 1263
    .line 1264
    .line 1265
    .line 1266
    .line 1267
    .line 1268
    .line 1269
    .line 1270
    .line 1271
    .line 1272
    .line 1273
    .line 1274
    .line 1275
    .line 1276
    .line 1277
    .line 1278
    .line 1279
    .line 1280
    .line 1281
    .line 1282
    .line 1283
    .line 1284
    .line 1285
    .line 1286
    .line 1287
    .line 1288
    .line 1289
    .line 1290
    .line 1291
.end method

.method public static declared-synchronized f(Landroid/content/Context;)Ljava/util/Map;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 1
    const-class v0, Lcom/datavisorobfus/d;

    monitor-enter v0

    :try_start_0
    sget-object v1, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {v1}, Lcom/datavisorobfus/e;->a(Ljava/util/Map;)Z

    move-result v1

    if-nez v1, :cond_0

    sget-object p0, Lcom/datavisorobfus/d;->a:Ljava/util/Map;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit v0

    return-object p0

    :catchall_0
    move-exception p0

    goto/16 :goto_2

    :cond_0
    :try_start_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v1

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->v(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d1"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->x(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d2"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->V(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d3"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->E(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d4"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->k(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d5"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d6"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->b()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d7"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->a()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d8"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->u()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d9"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d12"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->n()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d13"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->v()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d14"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    const-string v4, "d15"

    const-string v5, "Android"

    invoke-interface {v3, v4, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->d()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d16"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->Y(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d17"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->W(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d18"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->r()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d20"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->e0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d24"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->F()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d25"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->s()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d26"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->D()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d27"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->h0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d28"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->i0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d29"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->N(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d30"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->l(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d33"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->e()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d34"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->E()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d38"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->o()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d41"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->k()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d42"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->m()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d43"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d44"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->a0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d46"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->z()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d47"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->y()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d48"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->x()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d49"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->A()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d50"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->b0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d51"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->p(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d52"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->A(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d54"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->C()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d58"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->w(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d59"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->I(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d60"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->S(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d62"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->T(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d63"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->U(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d64"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->Q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d65"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->R(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d66"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d68"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->D(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d71"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    const-string/jumbo v5, "wlan0"

    invoke-virtual {v4, p0, v5}, Lcom/datavisorobfus/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d72"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    const-string/jumbo v5, "wlan1"

    invoke-virtual {v4, p0, v5}, Lcom/datavisorobfus/r;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d75"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->H(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d73"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->G(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d74"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->c0(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d76"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {p0}, Lcom/datavisorobfus/d;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d77"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->o(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d78"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->f()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d83"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->g()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d84"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->h()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d85"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->i()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d86"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->w()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d87"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->Z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d88"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->m(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d90"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->B(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d91"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->u(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d92"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d93"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->t()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d94"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d101"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->G()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d102"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->O(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d103"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->t(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d104"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {p0}, Lcom/datavisorobfus/d;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d105"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->j(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d106"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d107"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->C(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d108"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->l()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d109"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->X(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d129"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->q(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d130"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    const/4 v5, 0x2

    invoke-virtual {v4, p0, v5}, Lcom/datavisorobfus/r;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d132"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    const/4 v5, 0x4

    invoke-virtual {v4, p0, v5}, Lcom/datavisorobfus/r;->a(Landroid/content/Context;I)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d134"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4}, Lcom/datavisorobfus/r;->p()Ljava/lang/String;

    move-result-object v4

    const-string v5, "d136"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v4

    invoke-virtual {v4, p0}, Lcom/datavisorobfus/r;->y(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "d139"

    invoke-interface {v3, v5, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const/4 v3, 0x0

    :try_start_2
    invoke-static {p0}, Lcom/datavisorobfus/q0;->a(Landroid/content/Context;)Lcom/datavisorobfus/q0;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/datavisorobfus/q0;->a(Z)Lorg/json/JSONObject;

    move-result-object v4

    sget-object v5, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    const-string v6, "c1"

    const-string/jumbo v7, "result"

    const-string v8, "0"

    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    const-string v6, "c2"

    const-string v7, "detailedInfo"

    const-string v8, "empty"

    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    goto :goto_0

    :catchall_1
    move-exception v4

    :try_start_3
    invoke-static {v4}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    const-string v5, "c1"

    const-string v6, "0"

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    const-string v5, "c2"

    const-string v6, "exception"

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    :goto_0
    :try_start_4
    invoke-static {p0}, Lcom/datavisorobfus/x;->a(Landroid/content/Context;)Lcom/datavisorobfus/x;

    move-result-object v4

    invoke-virtual {v4, v3}, Lcom/datavisorobfus/x;->a(Z)Lorg/json/JSONObject;

    move-result-object v4

    sget-object v5, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    const-string v6, "c3"

    const-string/jumbo v7, "result"

    const-string v8, "0"

    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v5, v6, v7}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v5, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    const-string v6, "c4"

    const-string v7, "detailedInfo"

    const-string v8, "empty"

    invoke-virtual {v4, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-interface {v5, v6, v4}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_1

    :catchall_2
    move-exception v4

    :try_start_5
    invoke-static {v4}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    const-string v5, "c3"

    const-string v6, "0"

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    const-string v5, "c4"

    const-string v6, "exception"

    invoke-interface {v4, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :goto_1
    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {p0}, Lcom/datavisorobfus/x0;->a(Landroid/content/Context;)Lcom/datavisorobfus/x0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/datavisorobfus/x0;->a()Ljava/lang/String;

    move-result-object v5

    const-string v6, "c6"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {p0}, Lcom/datavisorobfus/p;->a(Landroid/content/Context;)Lcom/datavisorobfus/p;

    move-result-object v5

    invoke-virtual {v5}, Lcom/datavisorobfus/p;->c()Ljava/lang/String;

    move-result-object v5

    const-string v6, "c8"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {p0}, Lcom/datavisorobfus/h0;->a(Landroid/content/Context;)Lcom/datavisorobfus/h0;

    move-result-object v5

    invoke-virtual {v5, v3}, Lcom/datavisorobfus/h0;->a(Z)Ljava/lang/String;

    move-result-object v5

    const-string v6, "c9"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/r;->z(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "c16"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {p0}, Lcom/datavisorobfus/q0;->a(Landroid/content/Context;)Lcom/datavisorobfus/q0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/datavisorobfus/q0;->f()Ljava/lang/String;

    move-result-object v5

    const-string v6, "c20"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/r;->L(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "c21"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {p0}, Lcom/datavisorobfus/h0;->a(Landroid/content/Context;)Lcom/datavisorobfus/h0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/datavisorobfus/h0;->d()Ljava/lang/String;

    move-result-object v5

    const-string v6, "c22"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {p0}, Lcom/datavisorobfus/h0;->a(Landroid/content/Context;)Lcom/datavisorobfus/h0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/datavisorobfus/h0;->c()Ljava/lang/String;

    move-result-object v5

    const-string v6, "c23"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/a;->d(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "a1"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/a;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "a2"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/a;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "a3"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    move-result-object v5

    invoke-virtual {v5}, Lcom/datavisorobfus/a;->b()Ljava/lang/String;

    move-result-object v5

    const-string v6, "a6"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/a;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "a8"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/a;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "a9"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/a;->c(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "a10"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/a;->a()Lcom/datavisorobfus/a;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/a;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "a17"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/i0;->e(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "n1"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/i0;->g(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "n2"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/i0;->f(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "n3"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/i0;->h(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "n4"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/i0;->i(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "n9"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/datavisorobfus/i0;->a()Ljava/lang/String;

    move-result-object v5

    const-string v6, "n11"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/datavisorobfus/i0;->e()Ljava/lang/String;

    move-result-object v5

    const-string v6, "n12"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    move-result-object v5

    invoke-virtual {v5}, Lcom/datavisorobfus/i0;->b()Ljava/lang/String;

    move-result-object v5

    const-string v6, "n42"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/i0;->b(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "n43"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/i0;->c()Lcom/datavisorobfus/i0;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/i0;->a(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "n44"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {p0}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    move-result-object v5

    const-string v6, "H6i37Q=="

    invoke-static {v6}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/datavisorobfus/y0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string/jumbo v6, "v1"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {p0}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    move-result-object v5

    const-string v6, "H6iqxnPZqQ=="

    invoke-static {v6}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v5, v6}, Lcom/datavisorobfus/y0;->a(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const-string/jumbo v6, "v2"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/r;->n(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string/jumbo v6, "v4"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {}, Lcom/datavisorobfus/r;->q()Lcom/datavisorobfus/r;

    move-result-object v5

    invoke-virtual {v5, p0}, Lcom/datavisorobfus/r;->s(Landroid/content/Context;)Ljava/lang/String;

    move-result-object v5

    const-string/jumbo v6, "v6"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    invoke-static {p0}, Lcom/datavisorobfus/y0;->a(Landroid/content/Context;)Lcom/datavisorobfus/y0;

    move-result-object v6

    iget v6, v6, Lcom/datavisorobfus/y0;->b:I

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v6, ""

    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    const-string/jumbo v6, "v7"

    invoke-interface {v4, v6, v5}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v4, "H6ih6lT1gu47b6BRO8on"

    invoke-static {v4}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lcom/datavisor/vangogh/bridge/storage;->globalGet(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    sget-object v4, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    const-string/jumbo v5, "v8"

    invoke-interface {v4, v5, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object v3, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    invoke-static {p0, v3}, Lcom/datavisorobfus/d;->b(Landroid/content/Context;Ljava/util/Map;)V

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v3

    sub-long/2addr v3, v1

    const-wide/32 v1, 0xf4240

    div-long/2addr v3, v1

    sget-object p0, Lcom/datavisorobfus/d;->a:Ljava/util/Map;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ""

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v2, "d79"

    invoke-interface {p0, v2, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lcom/datavisorobfus/d;->a:Ljava/util/Map;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_0

    monitor-exit v0

    return-object p0

    :goto_2
    :try_start_6
    monitor-exit v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_0

    throw p0
.end method
