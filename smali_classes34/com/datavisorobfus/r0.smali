.class public Lcom/datavisorobfus/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static a:Lokhttp3/OkHttpClient;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    .line 2
    new-instance v0, Lokhttp3/OkHttpClient;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lokhttp3/OkHttpClient;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 12
    .line 13
    const-wide/16 v2, 0x2710

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    .line 24
    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    .line 25
    move-result-object v0

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 29
    move-result-object v0

    .line 30
    .line 31
    sput-object v0, Lcom/datavisorobfus/r0;->a:Lokhttp3/OkHttpClient;

    .line 32
    return-void
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

.method private static a(Ljava/lang/String;)I
    .locals 2

    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return v0

    :cond_0
    const-string v1, "/vangogh_data"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const-string v1, "/config"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 p0, 0x2

    return p0

    :cond_2
    const-string v1, "/vangogh_errlog2"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 p0, 0x3

    return p0

    :cond_3
    const-string v1, "/vangogh_event"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/4 p0, 0x4

    return p0

    :cond_4
    const-string v1, "/vangogh_long_session"

    invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    if-eqz p0, :cond_5

    const/4 p0, 0x5

    return p0

    :catchall_0
    :cond_5
    return v0
.end method

.method private static a(IIILjava/util/Map;[BLjava/util/Map;Landroid/content/Context;)Lcom/datavisorobfus/s0;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(III",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            ")",
            "Lcom/datavisorobfus/s0;"
        }
    .end annotation

    move/from16 v1, p0

    move/from16 v9, p2

    const/4 v10, 0x0

    move-object/from16 v4, p3

    .line 3
    :try_start_0
    invoke-static {v4, v1}, Lcom/datavisorobfus/r0;->a(Ljava/util/Map;I)V

    new-instance v11, Lorg/json/JSONObject;

    invoke-direct {v11}, Lorg/json/JSONObject;-><init>()V

    const/4 v0, 0x0

    move v12, v0

    move v13, v12

    move-object v0, v10

    :goto_0
    const/4 v14, 0x1

    if-ge v12, v9, :cond_4

    move-object/from16 v7, p6

    invoke-static {v7, v1, v13}, Lcom/datavisorobfus/r0;->a(Landroid/content/Context;II)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v15

    const/4 v8, 0x0

    move/from16 v3, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    invoke-static/range {v2 .. v8}, Lcom/datavisorobfus/r0;->a(Ljava/lang/String;ILjava/util/Map;[BLjava/util/Map;Landroid/content/Context;Z)Lcom/datavisorobfus/s0;

    move-result-object v8

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    if-ne v1, v14, :cond_1

    if-nez v3, :cond_1

    sub-long/2addr v4, v15

    const-wide/32 v6, 0xf4240

    :try_start_1
    div-long/2addr v4, v6

    invoke-static {v2}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v2

    if-nez v2, :cond_0

    new-instance v2, Lorg/json/JSONArray;

    invoke-direct {v2}, Lorg/json/JSONArray;-><init>()V

    invoke-virtual {v11, v0, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    goto :goto_1

    :catchall_0
    move-exception v0

    goto :goto_2

    :cond_0
    :goto_1
    invoke-virtual {v11, v0}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v4, v5}, Lorg/json/JSONArray;->put(J)Lorg/json/JSONArray;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_3

    :goto_2
    :try_start_2
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_6

    :cond_1
    :goto_3
    iget v0, v8, Lcom/datavisorobfus/s0;->c:I

    if-eqz v0, :cond_5

    const/4 v2, 0x6

    if-eq v0, v2, :cond_5

    const/16 v2, 0x11

    if-eq v0, v2, :cond_5

    const/4 v2, 0x7

    if-eq v0, v2, :cond_5

    const/4 v2, 0x3

    if-ne v3, v2, :cond_2

    const/16 v2, 0x10

    if-ne v0, v2, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v0, v9, -0x1

    if-ge v12, v0, :cond_3

    invoke-static/range {p6 .. p6}, Lcom/datavisorobfus/y;->a(Landroid/content/Context;)Lcom/datavisorobfus/y;

    move-result-object v0

    invoke-virtual {v0, v13}, Lcom/datavisorobfus/y;->b(I)I

    move-result v0
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    const-wide/16 v4, 0xfa0

    :try_start_3
    invoke-static {v4, v5}, Ljava/lang/Thread;->sleep(J)V
    :try_end_3
    .catch Ljava/lang/InterruptedException; {:try_start_3 .. :try_end_3} :catch_0
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catch_0
    move v13, v0

    :cond_3
    add-int/lit8 v12, v12, 0x1

    move-object/from16 v4, p3

    move-object v0, v8

    goto/16 :goto_0

    :cond_4
    move/from16 v3, p1

    move-object v8, v0

    :cond_5
    :goto_4
    if-ne v1, v14, :cond_6

    if-nez v3, :cond_6

    :try_start_4
    invoke-static {}, Lcom/datavisorobfus/i;->b()Lcom/datavisorobfus/i;

    move-result-object v0

    invoke-virtual {v11}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v1

    iput-object v1, v0, Lcom/datavisorobfus/i;->k:Ljava/lang/String;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_2

    goto :goto_5

    :catchall_2
    move-exception v0

    :try_start_5
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_6
    :goto_5
    if-nez v8, :cond_7

    new-instance v8, Lcom/datavisorobfus/s0;

    invoke-direct {v8}, Lcom/datavisorobfus/s0;-><init>()V

    const/16 v0, 0xa

    iput v0, v8, Lcom/datavisorobfus/s0;->c:I
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_1

    :cond_7
    return-object v8

    :goto_6
    invoke-static {v0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    return-object v10
.end method

.method public static a(Ljava/lang/String;ILjava/util/Map;[BLjava/util/Map;Landroid/content/Context;Z)Lcom/datavisorobfus/s0;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "I",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Landroid/content/Context;",
            "Z)",
            "Lcom/datavisorobfus/s0;"
        }
    .end annotation

    .line 4
    new-instance v0, Lokhttp3/Request$Builder;

    invoke-direct {v0}, Lokhttp3/Request$Builder;-><init>()V

    new-instance v1, Lcom/datavisorobfus/s0;

    invoke-direct {v1}, Lcom/datavisorobfus/s0;-><init>()V

    if-eqz p2, :cond_0

    invoke-interface {p2}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {v0, v4, v3}, Lokhttp3/Request$Builder;->addHeader(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/Request$Builder;

    goto :goto_0

    :cond_0
    const/4 v2, 0x1

    if-eqz p3, :cond_4

    const-string v3, "application/octet-stream"

    if-ne p1, v2, :cond_1

    invoke-static {v3}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object p1

    invoke-static {p1, p3}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;[B)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->put(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    goto :goto_1

    :cond_1
    if-nez p1, :cond_2

    invoke-static {v3}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object p1

    invoke-static {p1, p3}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;[B)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->post(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    goto :goto_1

    :cond_2
    const/4 v4, 0x3

    if-ne p1, v4, :cond_3

    invoke-static {v3}, Lokhttp3/MediaType;->parse(Ljava/lang/String;)Lokhttp3/MediaType;

    move-result-object p1

    invoke-static {p1, p3}, Lokhttp3/RequestBody;->create(Lokhttp3/MediaType;[B)Lokhttp3/RequestBody;

    move-result-object p1

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->patch(Lokhttp3/RequestBody;)Lokhttp3/Request$Builder;

    goto :goto_1

    :cond_3
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->get()Lokhttp3/Request$Builder;

    :cond_4
    :goto_1
    if-eqz p4, :cond_6

    invoke-interface {p4}, Ljava/util/Map;->size()I

    move-result p1

    if-lez p1, :cond_6

    invoke-static {p0}, Lokhttp3/HttpUrl;->parse(Ljava/lang/String;)Lokhttp3/HttpUrl;

    move-result-object p1

    if-eqz p1, :cond_6

    invoke-virtual {p1}, Lokhttp3/HttpUrl;->newBuilder()Lokhttp3/HttpUrl$Builder;

    move-result-object p1

    invoke-interface {p4}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p4

    invoke-interface {p4}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p4

    :goto_2
    invoke-interface {p4}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {p4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/Map$Entry;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-interface {v3}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-virtual {p1, v4, v3}, Lokhttp3/HttpUrl$Builder;->addQueryParameter(Ljava/lang/String;Ljava/lang/String;)Lokhttp3/HttpUrl$Builder;

    goto :goto_2

    :cond_5
    invoke-virtual {p1}, Lokhttp3/HttpUrl$Builder;->build()Lokhttp3/HttpUrl;

    move-result-object p1

    invoke-virtual {v0, p1}, Lokhttp3/Request$Builder;->url(Lokhttp3/HttpUrl;)Lokhttp3/Request$Builder;

    goto :goto_3

    :cond_6
    invoke-virtual {v0, p0}, Lokhttp3/Request$Builder;->url(Ljava/lang/String;)Lokhttp3/Request$Builder;

    :goto_3
    invoke-virtual {v0}, Lokhttp3/Request$Builder;->build()Lokhttp3/Request;

    move-result-object p1

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    :try_start_0
    sget-object p4, Lcom/datavisorobfus/r0;->a:Lokhttp3/OkHttpClient;

    invoke-virtual {p4, p1}, Lokhttp3/OkHttpClient;->newCall(Lokhttp3/Request;)Lokhttp3/Call;

    move-result-object p1

    invoke-interface {p1}, Lokhttp3/Call;->execute()Lokhttp3/Response;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/Response;->isSuccessful()Z

    move-result p4

    if-eqz p4, :cond_7

    invoke-virtual {p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object p4

    invoke-virtual {p4}, Lokhttp3/Headers;->toMultimap()Ljava/util/Map;

    move-result-object p4

    iput-object p4, v1, Lcom/datavisorobfus/s0;->a:Ljava/util/Map;

    invoke-virtual {p1}, Lokhttp3/Response;->body()Lokhttp3/ResponseBody;

    move-result-object p4

    invoke-virtual {p4}, Lokhttp3/ResponseBody;->bytes()[B

    move-result-object p4

    iput-object p4, v1, Lcom/datavisorobfus/s0;->b:[B

    invoke-virtual {p1}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    move-result-object p1

    invoke-virtual {p1}, Lokhttp3/Headers;->toString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, v1, Lcom/datavisorobfus/s0;->e:Ljava/lang/String;

    goto/16 :goto_9

    :catchall_0
    move-exception p0

    goto/16 :goto_a

    :catch_0
    move-exception p1

    goto :goto_5

    :cond_7
    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result p4

    const/16 v0, 0x130

    if-ne p4, v0, :cond_8

    const/16 p1, 0x11

    iput p1, v1, Lcom/datavisorobfus/s0;->c:I

    goto/16 :goto_9

    :cond_8
    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result p4

    const/16 v0, 0x226

    if-ne p4, v0, :cond_9

    const/16 p4, 0x10

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    goto :goto_4

    :cond_9
    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result p4

    const/16 v0, 0x190

    if-lt p4, v0, :cond_a

    invoke-virtual {p1}, Lokhttp3/Response;->code()I

    move-result p4

    const/16 v0, 0x1f4

    if-ge p4, v0, :cond_a

    const/4 p4, 0x6

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    goto :goto_4

    :cond_a
    const/4 p4, 0x7

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    :goto_4
    invoke-static {p0}, Lcom/datavisorobfus/r0;->a(Ljava/lang/String;)I

    move-result p4

    if-ne p4, v2, :cond_17

    const-string/jumbo p4, "postException errcode: "

    invoke-virtual {p1}, Lokhttp3/Response;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-static {p4, p1, p5}, Lcom/datavisor/vangogh/util/ExceptionUtil;->a(Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_9

    :goto_5
    :try_start_1
    instance-of p4, p1, Ljava/net/SocketTimeoutException;

    if-eqz p4, :cond_b

    const/16 p4, 0x9

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    goto :goto_6

    :cond_b
    instance-of p4, p1, Ljava/net/ConnectException;

    if-eqz p4, :cond_c

    const/4 p4, 0x5

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    goto :goto_6

    :cond_c
    instance-of p4, p1, Ljava/net/UnknownHostException;

    if-eqz p4, :cond_d

    const/16 p4, 0x12

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    goto :goto_6

    :cond_d
    instance-of p4, p1, Ljavax/net/ssl/SSLHandshakeException;

    if-eqz p4, :cond_e

    const/16 p4, 0x13

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    goto :goto_6

    :cond_e
    instance-of p4, p1, Ljavax/net/ssl/SSLPeerUnverifiedException;

    if-eqz p4, :cond_f

    const/16 p4, 0x14

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    goto :goto_6

    :cond_f
    instance-of p4, p1, Ljavax/net/ssl/SSLKeyException;

    if-eqz p4, :cond_10

    const/16 p4, 0x15

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    goto :goto_6

    :cond_10
    instance-of p4, p1, Ljavax/net/ssl/SSLProtocolException;

    if-eqz p4, :cond_11

    const/16 p4, 0x16

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    goto :goto_6

    :cond_11
    instance-of p4, p1, Ljavax/net/ssl/SSLException;

    if-eqz p4, :cond_12

    const/16 p4, 0x17

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    goto :goto_6

    :cond_12
    instance-of p4, p1, Ljava/net/SocketException;

    if-eqz p4, :cond_13

    const/16 p4, 0x18

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    goto :goto_6

    :cond_13
    const/16 p4, 0xa

    iput p4, v1, Lcom/datavisorobfus/s0;->c:I

    :goto_6
    iput-object p1, v1, Lcom/datavisorobfus/s0;->f:Ljava/lang/Throwable;

    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    if-eqz p6, :cond_16

    invoke-static {p0, p3, p2}, Lcom/datavisorobfus/r0;->a(Ljava/lang/String;[BLjava/util/Map;)[B

    move-result-object p2

    if-eqz p2, :cond_15

    array-length p3, p2

    if-le p3, v2, :cond_15

    const/4 p3, 0x0

    iput p3, v1, Lcom/datavisorobfus/s0;->c:I

    new-instance p4, Ljava/util/HashMap;

    invoke-direct {p4}, Ljava/util/HashMap;-><init>()V

    aget-byte p6, p2, p3

    if-eqz p6, :cond_14

    new-instance p6, Ljava/util/ArrayList;

    invoke-direct {p6}, Ljava/util/ArrayList;-><init>()V

    const-string v0, "1"

    invoke-interface {p6, v0}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    const-string v0, "cv"

    invoke-interface {p4, v0, p6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    :cond_14
    iput-object p4, v1, Lcom/datavisorobfus/s0;->a:Ljava/util/Map;

    array-length p4, p2

    sub-int/2addr p4, v2

    new-array p4, p4, [B

    array-length p6, p2

    sub-int/2addr p6, v2

    invoke-static {p2, v2, p4, p3, p6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object p4, v1, Lcom/datavisorobfus/s0;->b:[B

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p3, "postException udpSuccess: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    :goto_7
    invoke-virtual {p2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_8

    :cond_15
    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p3, "postException udpFail: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_7

    :cond_16
    invoke-static {p0}, Lcom/datavisorobfus/r0;->a(Ljava/lang/String;)I

    move-result p2

    if-ne p2, v2, :cond_17

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    const-string/jumbo p3, "postException: "

    invoke-virtual {p2, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    goto :goto_7

    :goto_8
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1, p5}, Lcom/datavisor/vangogh/util/ExceptionUtil;->a(Ljava/lang/String;Ljava/lang/Throwable;Landroid/content/Context;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :cond_17
    :goto_9
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p0

    sub-long/2addr p0, v3

    iput-wide p0, v1, Lcom/datavisorobfus/s0;->d:J

    return-object v1

    :goto_a
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide p1

    sub-long/2addr p1, v3

    iput-wide p1, v1, Lcom/datavisorobfus/s0;->d:J

    throw p0
.end method

.method public static a(Ljava/util/Map;[BLandroid/content/Context;)Lcom/datavisorobfus/s0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B",
            "Landroid/content/Context;",
            ")",
            "Lcom/datavisorobfus/s0;"
        }
    .end annotation

    .line 5
    invoke-static {p2}, Lcom/datavisorobfus/y;->a(Landroid/content/Context;)Lcom/datavisorobfus/y;

    move-result-object v0

    invoke-virtual {v0}, Lcom/datavisorobfus/y;->e()I

    move-result v3

    const/4 v2, 0x3

    const/4 v6, 0x0

    const/4 v1, 0x1

    move-object v4, p0

    move-object v5, p1

    move-object v7, p2

    invoke-static/range {v1 .. v7}, Lcom/datavisorobfus/r0;->a(IIILjava/util/Map;[BLjava/util/Map;Landroid/content/Context;)Lcom/datavisorobfus/s0;

    move-result-object p0

    return-object p0
.end method

.method private static a(Landroid/content/Context;II)Ljava/lang/String;
    .locals 7

    .line 6
    const-string v0, ""

    const/4 v1, 0x5

    const/4 v2, 0x3

    const/4 v3, 0x2

    const/4 v4, 0x1

    const/16 v5, 0x8

    const/4 v6, 0x4

    if-ne p1, v6, :cond_0

    :try_start_0
    invoke-static {p0}, Lcom/datavisorobfus/y;->a(Landroid/content/Context;)Lcom/datavisorobfus/y;

    move-result-object p0

    invoke-virtual {p0}, Lcom/datavisorobfus/y;->c()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :catchall_0
    move-exception p0

    goto/16 :goto_3

    :cond_0
    if-ne p1, v5, :cond_1

    invoke-static {p0}, Lcom/datavisorobfus/y;->a(Landroid/content/Context;)Lcom/datavisorobfus/y;

    move-result-object p0

    invoke-virtual {p0}, Lcom/datavisorobfus/y;->d()Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_1
    if-eq p1, v4, :cond_3

    if-eq p1, v3, :cond_3

    if-eq p1, v2, :cond_3

    if-ne p1, v1, :cond_2

    goto :goto_0

    :cond_2
    move-object p0, v0

    goto :goto_1

    :cond_3
    :goto_0
    invoke-static {p0}, Lcom/datavisorobfus/y;->a(Landroid/content/Context;)Lcom/datavisorobfus/y;

    move-result-object p0

    invoke-virtual {p0, p2}, Lcom/datavisorobfus/y;->a(I)Ljava/lang/String;

    move-result-object p0

    :goto_1
    invoke-static {p0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result p2

    if-eqz p2, :cond_4

    return-object v0

    :cond_4
    if-eq p1, v4, :cond_a

    if-eq p1, v3, :cond_9

    if-eq p1, v2, :cond_8

    if-eq p1, v6, :cond_7

    if-eq p1, v1, :cond_6

    if-eq p1, v5, :cond_5

    return-object v0

    :cond_5
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/vangogh_raphael_v3"

    goto :goto_2

    :cond_6
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/vangogh_long_session"

    goto :goto_2

    :cond_7
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/vangogh_event"

    goto :goto_2

    :cond_8
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/vangogh_errlog2"

    goto :goto_2

    :cond_9
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/config"

    goto :goto_2

    :cond_a
    new-instance p1, Ljava/lang/StringBuilder;

    invoke-direct {p1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string p0, "/vangogh_data"

    :goto_2
    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object p0

    :goto_3
    invoke-static {p0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    return-object v0
.end method

.method public static a(Ljava/util/Map;)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)V"
        }
    .end annotation

    if-eqz p0, :cond_1

    .line 7
    invoke-interface {p0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lokhttp3/OkHttpClient;

    invoke-direct {v0}, Lokhttp3/OkHttpClient;-><init>()V

    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    sget-object v1, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v2, 0x2710

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->connectTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->writeTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    invoke-virtual {v0, v2, v3, v1}, Lokhttp3/OkHttpClient$Builder;->readTimeout(JLjava/util/concurrent/TimeUnit;)Lokhttp3/OkHttpClient$Builder;

    move-result-object v0

    new-instance v1, Lcom/datavisor/vangogh/util/network/AnyCastDNS;

    invoke-direct {v1, p0}, Lcom/datavisor/vangogh/util/network/AnyCastDNS;-><init>(Ljava/util/Map;)V

    invoke-virtual {v0, v1}, Lokhttp3/OkHttpClient$Builder;->dns(Lokhttp3/Dns;)Lokhttp3/OkHttpClient$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    move-result-object p0

    sput-object p0, Lcom/datavisorobfus/r0;->a:Lokhttp3/OkHttpClient;

    return-void

    :cond_1
    :goto_0
    const-string/jumbo p0, "setIPDirectClient iPDirectDomainMap is empty"

    invoke-static {p0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/String;)V

    return-void
.end method

.method private static a(Ljava/util/Map;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;I)V"
        }
    .end annotation

    .line 1
    return-void
.end method

.method private static a(Ljava/lang/String;[BLjava/util/Map;)[B
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "[B",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)[B"
        }
    .end annotation

    .line 8
    invoke-static {p0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x0

    if-nez v0, :cond_7

    if-nez p1, :cond_0

    goto/16 :goto_5

    :cond_0
    :try_start_0
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object v0

    invoke-virtual {v0}, Landroid/net/Uri;->getHost()Ljava/lang/String;

    move-result-object v0

    invoke-static {p1}, Lcom/datavisor/vangogh/bridge/crypto;->reduce([B)[B

    move-result-object p1

    if-eqz p1, :cond_3

    invoke-static {p1}, Lcom/datavisor/vangogh/bridge/crypto;->sign([B)[B

    move-result-object v2

    if-eqz v2, :cond_3

    array-length v3, p1

    const/4 v4, 0x2

    add-int/2addr v3, v4

    array-length v5, v2

    add-int/2addr v3, v5

    new-array v5, v3, [B

    invoke-static {p0}, Lcom/datavisorobfus/r0;->a(Ljava/lang/String;)I

    move-result p0

    and-int/lit16 p0, p0, 0xff

    int-to-byte p0, p0

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-eqz p2, :cond_1

    const-string v8, "c"

    invoke-interface {p2, v8}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    invoke-static {p2}, Lcom/datavisorobfus/z0;->b(Ljava/lang/String;)Z

    move-result v8

    if-eqz v8, :cond_1

    const-string v8, "1"

    invoke-virtual {p2, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_1

    int-to-byte p2, v6

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_3

    :cond_1
    move p2, v7

    :goto_0
    aput-byte p0, v5, v7

    aput-byte p2, v5, v6

    array-length p0, p1

    invoke-static {p1, v7, v5, v4, p0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p0, p1

    add-int/2addr p0, v4

    array-length p1, v2

    invoke-static {v2, v7, v5, p0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    new-instance p0, Ljava/net/DatagramSocket;

    const/16 p1, 0x2397

    invoke-direct {p0, p1}, Ljava/net/DatagramSocket;-><init>(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/16 p2, 0x4e20

    :try_start_1
    invoke-virtual {p0, p2}, Ljava/net/DatagramSocket;->setSoTimeout(I)V

    invoke-static {v0}, Ljava/net/InetAddress;->getByName(Ljava/lang/String;)Ljava/net/InetAddress;

    move-result-object p2

    new-instance v0, Ljava/net/DatagramPacket;

    invoke-direct {v0, v5, v3, p2, p1}, Ljava/net/DatagramPacket;-><init>([BILjava/net/InetAddress;I)V

    invoke-virtual {p0, v0}, Ljava/net/DatagramSocket;->send(Ljava/net/DatagramPacket;)V

    new-instance p1, Ljava/net/DatagramPacket;

    const/16 p2, 0x800

    new-array v0, p2, [B

    invoke-direct {p1, v0, p2}, Ljava/net/DatagramPacket;-><init>([BI)V

    invoke-virtual {p0, p1}, Ljava/net/DatagramSocket;->receive(Ljava/net/DatagramPacket;)V

    invoke-virtual {p1}, Ljava/net/DatagramPacket;->getLength()I

    move-result p2

    if-lez p2, :cond_2

    new-array v0, p2, [B

    invoke-virtual {p1}, Ljava/net/DatagramPacket;->getData()[B

    move-result-object p1

    invoke-static {p1, v7, v0, v7, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    move-object v1, v0

    goto :goto_1

    :catchall_1
    move-exception p1

    goto :goto_4

    :cond_2
    :goto_1
    move-object v9, v1

    move-object v1, p0

    move-object p0, v9

    goto :goto_2

    :cond_3
    move-object p0, v1

    :goto_2
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/net/DatagramSocket;->close()V

    :cond_4
    return-object p0

    :goto_3
    move-object p1, p0

    move-object p0, v1

    :goto_4
    :try_start_2
    invoke-static {p1}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_2

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/net/DatagramSocket;->close()V

    :cond_5
    return-object v1

    :catchall_2
    move-exception p1

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ljava/net/DatagramSocket;->close()V

    :cond_6
    throw p1

    :cond_7
    :goto_5
    return-object v1
.end method

.method public static b(Ljava/util/Map;[BLandroid/content/Context;)Lcom/datavisorobfus/s0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B",
            "Landroid/content/Context;",
            ")",
            "Lcom/datavisorobfus/s0;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p2}, Lcom/datavisorobfus/y;->a(Landroid/content/Context;)Lcom/datavisorobfus/y;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/datavisorobfus/y;->e()I

    .line 8
    move-result v3

    .line 9
    const/4 v2, 0x1

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v1, 0x1

    .line 12
    move-object v4, p0

    .line 13
    move-object v5, p1

    .line 14
    move-object v7, p2

    .line 15
    .line 16
    .line 17
    invoke-static/range {v1 .. v7}, Lcom/datavisorobfus/r0;->a(IIILjava/util/Map;[BLjava/util/Map;Landroid/content/Context;)Lcom/datavisorobfus/s0;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
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
    .line 78
    .line 79
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
.end method

.method public static c(Ljava/util/Map;[BLandroid/content/Context;)Lcom/datavisorobfus/s0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B",
            "Landroid/content/Context;",
            ")",
            "Lcom/datavisorobfus/s0;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p2}, Lcom/datavisorobfus/y;->a(Landroid/content/Context;)Lcom/datavisorobfus/y;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/datavisorobfus/y;->e()I

    .line 8
    move-result v3

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v1, 0x1

    .line 12
    move-object v4, p0

    .line 13
    move-object v5, p1

    .line 14
    move-object v7, p2

    .line 15
    .line 16
    .line 17
    invoke-static/range {v1 .. v7}, Lcom/datavisorobfus/r0;->a(IIILjava/util/Map;[BLjava/util/Map;Landroid/content/Context;)Lcom/datavisorobfus/s0;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
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
    .line 78
    .line 79
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
.end method

.method public static d(Ljava/util/Map;[BLandroid/content/Context;)Lcom/datavisorobfus/s0;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;[B",
            "Landroid/content/Context;",
            ")",
            "Lcom/datavisorobfus/s0;"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p2}, Lcom/datavisorobfus/y;->a(Landroid/content/Context;)Lcom/datavisorobfus/y;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lcom/datavisorobfus/y;->e()I

    .line 8
    move-result v3

    .line 9
    const/4 v2, 0x0

    .line 10
    const/4 v6, 0x0

    .line 11
    const/4 v1, 0x3

    .line 12
    move-object v4, p0

    .line 13
    move-object v5, p1

    .line 14
    move-object v7, p2

    .line 15
    .line 16
    .line 17
    invoke-static/range {v1 .. v7}, Lcom/datavisorobfus/r0;->a(IIILjava/util/Map;[BLjava/util/Map;Landroid/content/Context;)Lcom/datavisorobfus/s0;

    .line 18
    move-result-object p0

    .line 19
    return-object p0
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
    .line 78
    .line 79
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
.end method
