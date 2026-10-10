.class public Lcom/datavisorobfus/p0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Ljava/lang/String;

.field public b:Ljava/lang/String;

.field public c:Lorg/json/JSONArray;

.field public d:Lorg/json/JSONArray;

.field public e:Ljava/lang/String;

.field public f:Ljava/lang/String;

.field public g:Ljava/lang/Throwable;

.field public h:I


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/datavisorobfus/p0;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/datavisorobfus/p0;->b:Ljava/lang/String;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    iput-object v1, p0, Lcom/datavisorobfus/p0;->c:Lorg/json/JSONArray;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    iput-object v1, p0, Lcom/datavisorobfus/p0;->d:Lorg/json/JSONArray;

    iput-object v0, p0, Lcom/datavisorobfus/p0;->e:Ljava/lang/String;

    iput-object v0, p0, Lcom/datavisorobfus/p0;->f:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/datavisorobfus/p0;->g:Ljava/lang/Throwable;

    const/4 v0, 0x0

    iput v0, p0, Lcom/datavisorobfus/p0;->h:I

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Lcom/datavisorobfus/s0;)V
    .locals 10

    .line 2
    const-string v0, "UT"

    const-string v1, "H6i67Ef/le8hZLVc"

    const-string v2, "H6i67A=="

    const-string v3, "H6iz6A=="

    const-string v4, "MpCYxg=="

    const-string v5, "PoyM9nvTo8U="

    const-string v6, "cv"

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v7, ""

    iput-object v7, p0, Lcom/datavisorobfus/p0;->a:Ljava/lang/String;

    iput-object v7, p0, Lcom/datavisorobfus/p0;->b:Ljava/lang/String;

    new-instance v8, Lorg/json/JSONArray;

    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    iput-object v8, p0, Lcom/datavisorobfus/p0;->c:Lorg/json/JSONArray;

    new-instance v8, Lorg/json/JSONArray;

    invoke-direct {v8}, Lorg/json/JSONArray;-><init>()V

    iput-object v8, p0, Lcom/datavisorobfus/p0;->d:Lorg/json/JSONArray;

    iput-object v7, p0, Lcom/datavisorobfus/p0;->e:Ljava/lang/String;

    iput-object v7, p0, Lcom/datavisorobfus/p0;->f:Ljava/lang/String;

    const/4 v7, 0x0

    iput-object v7, p0, Lcom/datavisorobfus/p0;->g:Ljava/lang/Throwable;

    const/4 v7, 0x0

    iput v7, p0, Lcom/datavisorobfus/p0;->h:I

    if-nez p2, :cond_0

    const/16 p1, 0xa

    :try_start_0
    iput p1, p0, Lcom/datavisorobfus/p0;->h:I

    return-void

    :cond_0
    iget v8, p2, Lcom/datavisorobfus/s0;->c:I

    iput v8, p0, Lcom/datavisorobfus/p0;->h:I

    iget-object v9, p2, Lcom/datavisorobfus/s0;->f:Ljava/lang/Throwable;

    iput-object v9, p0, Lcom/datavisorobfus/p0;->g:Ljava/lang/Throwable;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_5

    if-eqz v8, :cond_1

    goto/16 :goto_4

    :cond_1
    :try_start_1
    iget-object v8, p2, Lcom/datavisorobfus/s0;->a:Ljava/util/Map;

    invoke-interface {v8, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_2

    iget-object v8, p2, Lcom/datavisorobfus/s0;->a:Ljava/util/Map;

    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-interface {v8}, Ljava/util/List;->isEmpty()Z

    move-result v8

    if-nez v8, :cond_2

    iget-object v8, p2, Lcom/datavisorobfus/s0;->a:Ljava/util/Map;

    invoke-interface {v8, v6}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/util/List;

    invoke-interface {v6, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/String;

    const-string v7, "0"

    invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2

    iget-object v6, p2, Lcom/datavisorobfus/s0;->b:[B

    invoke-static {v6}, Lcom/datavisor/vangogh/bridge/crypto;->decryptV([B)[B

    move-result-object p2

    goto :goto_0

    :cond_2
    iget-object p2, p2, Lcom/datavisorobfus/s0;->b:[B
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_0

    :catchall_0
    :try_start_2
    iget-object p2, p2, Lcom/datavisorobfus/s0;->b:[B

    :goto_0
    if-nez p2, :cond_3

    const/4 p1, 0x3

    :goto_1
    iput p1, p0, Lcom/datavisorobfus/p0;->h:I

    goto/16 :goto_4

    :cond_3
    new-instance v6, Lorg/json/JSONObject;

    new-instance v7, Ljava/lang/String;

    invoke-direct {v7, p2}, Ljava/lang/String;-><init>([B)V

    invoke-direct {v6, v7}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-static {v5}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {v5}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {v5}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v6, p1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result p1

    goto :goto_1

    :cond_4
    invoke-static {v4}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2

    if-nez p2, :cond_5

    const/4 p1, 0x4

    goto :goto_1

    :cond_5
    invoke-static {v4}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object p2

    if-nez p2, :cond_6

    goto/16 :goto_4

    :cond_6
    invoke-direct {p0, p2}, Lcom/datavisorobfus/p0;->a(Lorg/json/JSONObject;)V

    invoke-direct {p0, p2, p1}, Lcom/datavisorobfus/p0;->c(Lorg/json/JSONObject;Landroid/content/Context;)V

    invoke-static {v3}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_5

    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz p2, :cond_7

    :try_start_3
    invoke-static {v3}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2}, Ljava/lang/Float;->parseFloat(Ljava/lang/String;)F

    move-result v4
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    :cond_7
    const p2, 0x4ca4cb80    # 8.64E7f

    mul-float/2addr v4, p2

    float-to-long v3, v4

    const-wide/32 v7, 0x927c0

    :try_start_4
    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v3

    const-wide/32 v7, 0x337f9800

    invoke-static {v3, v4, v7, v8}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v3

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v7

    add-long/2addr v7, v3

    const-string p2, "DVSPDVMA"

    invoke-static {p1, p2, v7, v8}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;J)V

    invoke-static {v2}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_5

    const-string v3, "DVSPDVDE"

    if-eqz p2, :cond_8

    :try_start_5
    invoke-static {v2}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p2

    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v3, p2}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_2

    goto :goto_2

    :cond_8
    :try_start_6
    invoke-static {p1, v3}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_9

    invoke-static {p1, v3}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;)V

    :catchall_2
    :cond_9
    :goto_2
    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p2
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_5

    const-string v2, "DVSPCRONDE"

    if-eqz p2, :cond_a

    :try_start_7
    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {v6, p2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p2

    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p1, v2, p2}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_3

    goto :goto_3

    :cond_a
    :try_start_8
    invoke-static {p1, v2}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_b

    invoke-static {p1, v2}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;)V

    :catchall_3
    :cond_b
    :goto_3
    invoke-direct {p0, v6, p1}, Lcom/datavisorobfus/p0;->a(Lorg/json/JSONObject;Landroid/content/Context;)V

    invoke-direct {p0, v6, p1}, Lcom/datavisorobfus/p0;->b(Lorg/json/JSONObject;Landroid/content/Context;)V

    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result p1
    :try_end_8
    .catchall {:try_start_8 .. :try_end_8} :catchall_5

    if-eqz p1, :cond_c

    :try_start_9
    invoke-virtual {v6, v0}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/datavisorobfus/p0;->f:Ljava/lang/String;
    :try_end_9
    .catchall {:try_start_9 .. :try_end_9} :catchall_4

    goto :goto_4

    :catchall_4
    move-exception p1

    :try_start_a
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V
    :try_end_a
    .catchall {:try_start_a .. :try_end_a} :catchall_5

    :catchall_5
    :cond_c
    :goto_4
    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v0, ""

    iput-object v0, p0, Lcom/datavisorobfus/p0;->a:Ljava/lang/String;

    iput-object v0, p0, Lcom/datavisorobfus/p0;->b:Ljava/lang/String;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    iput-object v1, p0, Lcom/datavisorobfus/p0;->c:Lorg/json/JSONArray;

    new-instance v1, Lorg/json/JSONArray;

    invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V

    iput-object v1, p0, Lcom/datavisorobfus/p0;->d:Lorg/json/JSONArray;

    iput-object v0, p0, Lcom/datavisorobfus/p0;->e:Ljava/lang/String;

    iput-object v0, p0, Lcom/datavisorobfus/p0;->f:Ljava/lang/String;

    const/4 v0, 0x0

    iput-object v0, p0, Lcom/datavisorobfus/p0;->g:Ljava/lang/Throwable;

    const/4 v0, 0x0

    iput v0, p0, Lcom/datavisorobfus/p0;->h:I

    :try_start_0
    invoke-static {p1, p2}, Lcom/datavisorobfus/u0;->f(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_0

    new-instance p2, Lorg/json/JSONObject;

    invoke-direct {p2, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p2}, Lcom/datavisorobfus/p0;->a(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_0
    return-void
.end method

.method private a()Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "H6i37Q=="

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/datavisorobfus/p0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const-string v0, ""

    return-object v0
.end method

.method private a(Lorg/json/JSONObject;)V
    .locals 5

    .line 3
    const-string v0, "H6iu233oqMsKXoc="

    const-string v1, "H6i9/Q=="

    const-string v2, "H6iqxnPZqQ=="

    const-string v3, "H6i37Q=="

    if-nez p1, :cond_0

    goto/16 :goto_1

    :cond_0
    :try_start_0
    invoke-static {v3}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v4

    if-eqz v4, :cond_1

    invoke-static {v3}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    iput-object v3, p0, Lcom/datavisorobfus/p0;->a:Ljava/lang/String;

    :cond_1
    invoke-static {v2}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-eqz v3, :cond_2

    invoke-static {v2}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    iput-object v2, p0, Lcom/datavisorobfus/p0;->b:Ljava/lang/String;

    :cond_2
    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iput-object v1, p0, Lcom/datavisorobfus/p0;->e:Ljava/lang/String;

    :cond_3
    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1

    iput-object p1, p0, Lcom/datavisorobfus/p0;->c:Lorg/json/JSONArray;

    :cond_4
    new-instance p1, Lorg/json/JSONArray;

    invoke-direct {p1}, Lorg/json/JSONArray;-><init>()V

    iput-object p1, p0, Lcom/datavisorobfus/p0;->d:Lorg/json/JSONArray;

    iget-object p1, p0, Lcom/datavisorobfus/p0;->c:Lorg/json/JSONArray;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lorg/json/JSONArray;->length()I

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    :goto_0
    iget-object v0, p0, Lcom/datavisorobfus/p0;->c:Lorg/json/JSONArray;

    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v0

    if-ge p1, v0, :cond_5

    iget-object v0, p0, Lcom/datavisorobfus/p0;->d:Lorg/json/JSONArray;

    iget-object v1, p0, Lcom/datavisorobfus/p0;->c:Lorg/json/JSONArray;

    invoke-virtual {v1, p1}, Lorg/json/JSONArray;->get(I)Ljava/lang/Object;

    move-result-object v1

    invoke-virtual {v0, v1}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :catchall_0
    :cond_5
    :goto_1
    return-void
.end method

.method private a(Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 2

    if-eqz p1, :cond_6

    if-nez p2, :cond_0

    goto :goto_3

    .line 4
    :cond_0
    :try_start_0
    const-string v0, "H6i/x2H/ptMbeaQ="

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const-string v1, "SPANYCASTIPS"

    if-eqz v0, :cond_1

    :try_start_1
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v1, v0}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    invoke-static {p2, v1}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-static {p2, v1}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;)V

    :cond_2
    :goto_0
    const-string v0, "H6i3+Q=="

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    const-string v1, "SPVANGOGHEIPS"

    if-eqz v0, :cond_3

    :try_start_2
    invoke-virtual {v0}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {p2, v1, v0}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    goto :goto_1

    :cond_3
    invoke-static {p2, v1}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_4

    invoke-static {p2, v1}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;)V

    :cond_4
    :goto_1
    const-string v0, "H6ik7VHs"

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object p1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    const-string v0, "SPZDEIPS"

    if-eqz p1, :cond_5

    :try_start_3
    invoke-virtual {p1}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, v0, p1}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    return-void

    :cond_5
    invoke-static {p2, v0}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_6

    invoke-static {p2, v0}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    return-void

    :goto_2
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_6
    :goto_3
    return-void
.end method

.method private b()Ljava/lang/String;
    .locals 3

    .line 1
    :try_start_0
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    const-string v1, "H6i37Q=="

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/datavisorobfus/p0;->a:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "H6iqxnPZqQ=="

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/datavisorobfus/p0;->b:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    const-string v1, "H6i9/Q=="

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/datavisorobfus/p0;->e:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    iget-object v1, p0, Lcom/datavisorobfus/p0;->c:Lorg/json/JSONArray;

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lorg/json/JSONArray;->length()I

    move-result v1

    if-eqz v1, :cond_0

    const-string v1, "H6iu233oqMsKXoc="

    invoke-static {v1}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    iget-object v2, p0, Lcom/datavisorobfus/p0;->c:Lorg/json/JSONArray;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_0
    invoke-virtual {v0}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    const-string v0, ""

    return-object v0
.end method

.method private b(Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 2

    if-eqz p1, :cond_1

    if-nez p2, :cond_0

    goto :goto_0

    .line 3
    :cond_0
    :try_start_0
    const-string v0, "H6i/x2H/ptMbdp1sA/s="

    invoke-static {v0}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x1

    invoke-virtual {p1, v0, v1}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result p1

    const-string v0, "DVSPANYCASTFIRST"

    invoke-static {p2, v0, p1}, Lcom/datavisorobfus/u0;->b(Landroid/content/Context;Ljava/lang/String;Z)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_1
    :goto_0
    return-void
.end method

.method public static c(Landroid/content/Context;Ljava/lang/String;)Lcom/datavisorobfus/p0;
    .locals 1

    .line 1
    new-instance v0, Lcom/datavisorobfus/p0;

    invoke-direct {v0}, Lcom/datavisorobfus/p0;-><init>()V

    :try_start_0
    invoke-static {p0, p1}, Lcom/datavisorobfus/t0;->a(Landroid/content/Context;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result p1

    if-eqz p1, :cond_0

    new-instance p1, Lorg/json/JSONObject;

    invoke-direct {p1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V

    invoke-direct {v0, p1}, Lcom/datavisorobfus/p0;->a(Lorg/json/JSONObject;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :catchall_0
    move-exception p0

    invoke-static {p0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_0
    return-object v0
.end method

.method private c(Lorg/json/JSONObject;Landroid/content/Context;)V
    .locals 6

    const-wide/16 v0, 0x0

    if-eqz p1, :cond_0

    .line 2
    :try_start_0
    const-string v2, "H6iq/VQ="

    invoke-static {v2}, Lcom/datavisor/vangogh/bridge/crypto;->convert(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {p1, v2, v0, v1}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_0
    move-wide v2, v0

    :goto_0
    cmp-long p1, v2, v0

    if-lez p1, :cond_1

    const-wide/16 v0, 0x2a30

    sub-long/2addr v2, v0

    const-wide/32 v0, 0x15180

    invoke-static {v2, v3, v0, v1}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v0

    goto :goto_1

    :cond_1
    const-wide/32 v0, 0x12cc0300

    :goto_1
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v2

    const-wide/16 v4, 0x3e8

    div-long/2addr v2, v4

    add-long/2addr v2, v0

    const-string p1, "DVSPDVTTL"

    invoke-static {p2, p1, v2, v3}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;J)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :goto_2
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    return-void
.end method


# virtual methods
.method public a(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/datavisorobfus/p0;->a()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2, v0}, Lcom/datavisorobfus/t0;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method

.method public b(Landroid/content/Context;Ljava/lang/String;)V
    .locals 2

    .line 2
    :try_start_0
    invoke-direct {p0}, Lcom/datavisorobfus/p0;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    goto :goto_0

    :cond_0
    invoke-static {p1, p2, v0}, Lcom/datavisorobfus/u0;->a(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :goto_0
    return-void
.end method
