.class public Lcom/tencent/bugly/proguard/qd;
.super Lokhttp3/EventListener;
.source "BUGLY"


# static fields
.field public static final c:Ljava/lang/String; = "Okhttp3EventListener"

.field public static final d:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public static e:Ljava/lang/String;

.field public static final f:Ljava/util/concurrent/ConcurrentHashMap;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/concurrent/ConcurrentHashMap<",
            "Lokhttp3/Call;",
            "Lcom/tencent/bugly/traffic/custom/SocketInfo;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public a:Lokhttp3/EventListener;

.field public b:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/proguard/qd;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 8
    .line 9
    new-instance v0, Ljava/util/concurrent/ConcurrentHashMap;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Ljava/util/concurrent/ConcurrentHashMap;-><init>()V

    .line 13
    .line 14
    sput-object v0, Lcom/tencent/bugly/proguard/qd;->f:Ljava/util/concurrent/ConcurrentHashMap;

    .line 15
    return-void
    .line 16
    .line 17
.end method

.method public constructor <init>()V
    .locals 1

    .line 4
    invoke-direct {p0}, Lokhttp3/EventListener;-><init>()V

    const/4 v0, 0x0

    .line 5
    iput-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    const/4 v0, 0x0

    .line 6
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    return-void
.end method

.method public constructor <init>(Lokhttp3/EventListener;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lokhttp3/EventListener;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    return-void
.end method

.method public static a(Lokhttp3/Headers;Ljava/util/Map;Lcom/tencent/bugly/traffic/custom/SocketInfo;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Headers;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;",
            "Lcom/tencent/bugly/traffic/custom/SocketInfo;",
            ")V"
        }
    .end annotation

    if-eqz p2, :cond_1

    .line 4
    iget-object p0, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->requestHeaders:Ljava/util/Map;

    const-string p1, "content-encoding"

    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    const/4 v0, 0x1

    if-eqz p0, :cond_0

    .line 5
    iget-object p0, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->requestHeaders:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 6
    const-string p1, "gzip"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_0

    .line 7
    iput-boolean v0, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->gzip:Z

    .line 8
    :cond_0
    iget-object p0, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->requestHeaders:Ljava/util/Map;

    const-string/jumbo p1, "transfer-encoding"

    invoke-interface {p0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 9
    iget-object p0, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->requestHeaders:Ljava/util/Map;

    invoke-interface {p0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    .line 10
    const-string p1, "chunked"

    invoke-virtual {p1, p0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z

    move-result p0

    if-eqz p0, :cond_1

    .line 11
    iput-boolean v0, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->chunked:Z

    :cond_1
    return-void
.end method


# virtual methods
.method public final a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;
    .locals 2

    .line 1
    sget-object v0, Lcom/tencent/bugly/proguard/qd;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;

    if-nez v1, :cond_0

    if-eqz p2, :cond_0

    .line 2
    new-instance p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;

    invoke-direct {p2}, Lcom/tencent/bugly/traffic/custom/SocketInfo;-><init>()V

    .line 3
    invoke-virtual {v0, p1, p2}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p2

    :cond_0
    return-object v1
.end method

.method public final a(Lcom/tencent/bugly/traffic/custom/SocketInfo;)V
    .locals 3

    .line 44
    invoke-static {}, Ljava/lang/Thread;->currentThread()Ljava/lang/Thread;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Thread;->getId()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->threadId:J

    .line 45
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    iput-wide v0, p1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->endTimeStamp:J

    .line 46
    iget-object v0, p1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->host:Ljava/lang/String;

    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->url:Ljava/lang/String;

    .line 47
    invoke-static {v0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 48
    :try_start_0
    new-instance v0, Ljava/net/URL;

    iget-object v1, p1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->url:Ljava/lang/String;

    invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    .line 49
    invoke-virtual {v0}, Ljava/net/URL;->getHost()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->host:Ljava/lang/String;

    .line 50
    sget-object v1, Lcom/tencent/bugly/proguard/qd;->d:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v1, v0}, Ljava/util/concurrent/ConcurrentHashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    iput-object v0, p1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->ip:Ljava/lang/String;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-void

    :catchall_0
    move-exception p1

    .line 51
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "fill socket has failed, "

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v2, "Okhttp3EventListener"

    filled-new-array {v2, v1, p1}, [Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    :cond_0
    return-void
.end method

.method public final a(Ljava/lang/Exception;Lcom/tencent/bugly/traffic/custom/SocketInfo;)V
    .locals 2

    .line 12
    instance-of v0, p1, Ljava/io/IOException;

    if-eqz v0, :cond_1

    .line 13
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/qd;->a(Ljava/lang/Exception;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 p1, 0x38f

    .line 14
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->errorCode:I

    .line 15
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->statusCode:I

    return-void

    .line 16
    :cond_0
    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1

    .line 17
    const-string v1, "ftruncate failed: ENOENT (No such file or directory)"

    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 p1, 0x395

    .line 18
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->errorCode:I

    .line 19
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->statusCode:I

    return-void

    .line 20
    :cond_1
    instance-of v0, p1, Ljava/net/UnknownHostException;

    if-eqz v0, :cond_2

    const/16 p1, 0x385

    .line 21
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->errorCode:I

    .line 22
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->statusCode:I

    return-void

    .line 23
    :cond_2
    instance-of v0, p1, Ljava/net/SocketTimeoutException;

    if-eqz v0, :cond_3

    const/16 p1, 0x387

    .line 24
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->errorCode:I

    .line 25
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->statusCode:I

    return-void

    .line 26
    :cond_3
    instance-of v0, p1, Ljava/net/ConnectException;

    if-eqz v0, :cond_4

    const/16 p1, 0x386

    .line 27
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->errorCode:I

    .line 28
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->statusCode:I

    return-void

    .line 29
    :cond_4
    instance-of v0, p1, Ljava/net/MalformedURLException;

    if-eqz v0, :cond_5

    const/16 p1, 0x384

    .line 30
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->errorCode:I

    .line 31
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->statusCode:I

    return-void

    .line 32
    :cond_5
    instance-of p1, p1, Ljavax/net/ssl/SSLException;

    if-eqz p1, :cond_6

    const/16 p1, 0x38c

    .line 33
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->errorCode:I

    .line 34
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->statusCode:I

    return-void

    :cond_6
    const/4 p1, -0x1

    .line 35
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->errorCode:I

    .line 36
    iput p1, p2, Lcom/tencent/bugly/traffic/custom/SocketInfo;->statusCode:I

    return-void
.end method

.method public final a(Lokhttp3/Call;)V
    .locals 2

    .line 39
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    if-eqz v0, :cond_1

    const/4 v0, 0x0

    .line 40
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    move-result-object v0

    if-eqz v0, :cond_0

    .line 41
    invoke-virtual {p0, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lcom/tencent/bugly/traffic/custom/SocketInfo;)V

    .line 42
    invoke-static {}, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->getInstance()Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;

    move-result-object v1

    invoke-virtual {v1, v0}, Lcom/tencent/bugly/traffic/custom/CustomTrafficStatistic;->addHttpToQueue(Lcom/tencent/bugly/traffic/custom/SocketInfo;)V

    .line 43
    :cond_0
    sget-object v0, Lcom/tencent/bugly/proguard/qd;->f:Ljava/util/concurrent/ConcurrentHashMap;

    invoke-virtual {v0, p1}, Ljava/util/concurrent/ConcurrentHashMap;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    return-void
.end method

.method public final a(Ljava/lang/Exception;)Z
    .locals 3

    if-eqz p1, :cond_0

    .line 37
    :try_start_0
    instance-of v0, p1, Ljava/net/SocketException;

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string/jumbo v0, "recvfrom failed: ECONNRESET (Connection reset by peer)"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :catch_0
    move-exception p1

    .line 38
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    const-string v1, "Okhttp3EventListener"

    const-string v2, "isSocketECONNRESET error"

    invoke-virtual {v0, v1, v2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->exception(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public callEnd(Lokhttp3/Call;)V
    .locals 2
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lokhttp3/EventListener;->callEnd(Lokhttp3/Call;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    const/4 v1, 0x1

    .line 16
    .line 17
    iput-boolean v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->isEnd:Z

    .line 18
    .line 19
    iput-boolean v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->hasSaved:Z

    .line 20
    .line 21
    .line 22
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;)V

    .line 23
    .line 24
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 25
    .line 26
    if-eqz v0, :cond_1

    .line 27
    .line 28
    .line 29
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->callEnd(Lokhttp3/Call;)V

    .line 30
    :cond_1
    return-void
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
.end method

.method public callFailed(Lokhttp3/Call;Ljava/io/IOException;)V
    .locals 1
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/io/IOException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lokhttp3/EventListener;->callFailed(Lokhttp3/Call;Ljava/io/IOException;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p0, p2, v0}, Lcom/tencent/bugly/proguard/qd;->a(Ljava/lang/Exception;Lcom/tencent/bugly/traffic/custom/SocketInfo;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {p0, p1}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;)V

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->callFailed(Lokhttp3/Call;Ljava/io/IOException;)V

    .line 28
    :cond_1
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public callStart(Lokhttp3/Call;)V
    .locals 5
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lokhttp3/EventListener;->callStart(Lokhttp3/Call;)V

    .line 4
    .line 5
    sget-object v0, Lcom/tencent/rmonitor/base/config/ConfigProxy;->INSTANCE:Lcom/tencent/rmonitor/base/config/ConfigProxy;

    .line 6
    .line 7
    .line 8
    invoke-virtual {v0}, Lcom/tencent/rmonitor/base/config/ConfigProxy;->getConfig()Lcom/tencent/rmonitor/base/config/a;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    .line 12
    const-string/jumbo v1, "traffic_detail"

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/base/config/a;->c(Ljava/lang/String;)Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    iget-object v0, v0, Lcom/tencent/rmonitor/base/config/DefaultPluginConfig;->config:Lcom/tencent/bugly/proguard/hf;

    .line 19
    .line 20
    iget-boolean v0, v0, Lcom/tencent/bugly/proguard/hf;->g:Z

    .line 21
    .line 22
    iput-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 23
    .line 24
    if-eqz v0, :cond_3

    .line 25
    const/4 v0, 0x1

    .line 26
    .line 27
    .line 28
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 29
    move-result-object v1

    .line 30
    .line 31
    sget-object v2, Lcom/tencent/bugly/common/network/NetworkWatcher;->INSTANCE:Lcom/tencent/bugly/common/network/NetworkWatcher;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Lcom/tencent/bugly/common/network/NetworkWatcher;->isWifiAvailable()Z

    .line 35
    move-result v3

    .line 36
    const/4 v4, 0x2

    .line 37
    .line 38
    if-eqz v3, :cond_0

    .line 39
    .line 40
    iput v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->networkType:I

    .line 41
    goto :goto_0

    .line 42
    :catchall_0
    move-exception v0

    .line 43
    goto :goto_2

    .line 44
    .line 45
    .line 46
    :cond_0
    invoke-virtual {v2}, Lcom/tencent/bugly/common/network/NetworkWatcher;->isNetAvailable()Z

    .line 47
    move-result v2

    .line 48
    .line 49
    if-eqz v2, :cond_1

    .line 50
    .line 51
    iput v4, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->networkType:I

    .line 52
    goto :goto_0

    .line 53
    :cond_1
    const/4 v2, 0x3

    .line 54
    .line 55
    iput v2, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->networkType:I

    .line 56
    .line 57
    :goto_0
    sget-object v2, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->INSTANCE:Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v2}, Lcom/tencent/rmonitor/common/lifecycle/LifecycleCallback;->isCurrentForeground()Z

    .line 61
    move-result v2

    .line 62
    .line 63
    if-eqz v2, :cond_2

    .line 64
    .line 65
    iput v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->frontState:I

    .line 66
    goto :goto_1

    .line 67
    .line 68
    :cond_2
    iput v4, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->frontState:I

    .line 69
    .line 70
    :goto_1
    const-string v0, "custom"

    .line 71
    .line 72
    iput-object v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->type:Ljava/lang/String;

    .line 73
    .line 74
    .line 75
    invoke-static {}, Lcom/tencent/bugly/proguard/g;->e()Ljava/lang/String;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    iput-object v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->pageId:Ljava/lang/String;

    .line 79
    .line 80
    .line 81
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 82
    move-result-wide v2

    .line 83
    .line 84
    iput-wide v2, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->startTimeStamp:J

    .line 85
    .line 86
    .line 87
    invoke-interface {p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    invoke-virtual {v0}, Lokhttp3/Request;->method()Ljava/lang/String;

    .line 92
    move-result-object v0

    .line 93
    .line 94
    iput-object v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->method:Ljava/lang/String;

    .line 95
    .line 96
    .line 97
    invoke-interface {p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    .line 98
    move-result-object v0

    .line 99
    .line 100
    .line 101
    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 102
    move-result-object v0

    .line 103
    .line 104
    .line 105
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 106
    move-result-object v0

    .line 107
    .line 108
    iput-object v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->url:Ljava/lang/String;

    .line 109
    .line 110
    .line 111
    invoke-interface {p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    .line 112
    move-result-object v0

    .line 113
    .line 114
    .line 115
    invoke-virtual {v0}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 116
    move-result-object v0

    .line 117
    .line 118
    .line 119
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->url()Ljava/net/URL;

    .line 120
    move-result-object v0

    .line 121
    .line 122
    .line 123
    invoke-virtual {v0}, Ljava/net/URL;->getProtocol()Ljava/lang/String;

    .line 124
    move-result-object v0

    .line 125
    .line 126
    iput-object v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->protocol:Ljava/lang/String;

    .line 127
    .line 128
    .line 129
    invoke-interface {p1}, Lokhttp3/Call;->request()Lokhttp3/Request;

    .line 130
    move-result-object v0

    .line 131
    .line 132
    .line 133
    invoke-virtual {v0}, Lokhttp3/Request;->isHttps()Z

    .line 134
    move-result v0

    .line 135
    .line 136
    iput-boolean v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->ssl:Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 137
    goto :goto_3

    .line 138
    .line 139
    :goto_2
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 140
    .line 141
    new-instance v2, Ljava/lang/StringBuilder;

    .line 142
    .line 143
    const-string v3, "callStart failed, "

    .line 144
    .line 145
    .line 146
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 147
    .line 148
    .line 149
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 150
    move-result-object v0

    .line 151
    .line 152
    .line 153
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 154
    .line 155
    .line 156
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 157
    move-result-object v0

    .line 158
    .line 159
    const-string v2, "Okhttp3EventListener"

    .line 160
    .line 161
    .line 162
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 163
    move-result-object v0

    .line 164
    .line 165
    .line 166
    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 167
    .line 168
    :cond_3
    :goto_3
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 169
    .line 170
    if-eqz v0, :cond_4

    .line 171
    .line 172
    .line 173
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->callStart(Lokhttp3/Call;)V

    .line 174
    :cond_4
    return-void
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
.end method

.method public connectEnd(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V
    .locals 4
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/net/InetSocketAddress;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/net/Proxy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lokhttp3/Protocol;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3, p4}, Lokhttp3/EventListener;->connectEnd(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v2

    .line 19
    .line 20
    iput-wide v2, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->connEnd:J

    .line 21
    .line 22
    .line 23
    invoke-virtual {p3}, Ljava/net/Proxy;->address()Ljava/net/SocketAddress;

    .line 24
    move-result-object v2

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    const/4 v0, 0x1

    .line 28
    .line 29
    :cond_0
    iput-boolean v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->isProxy:Z

    .line 30
    .line 31
    .line 32
    :try_start_0
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    if-eqz v0, :cond_1

    .line 36
    .line 37
    .line 38
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    .line 39
    move-result v0

    .line 40
    .line 41
    iput v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->port:I

    .line 42
    .line 43
    .line 44
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 45
    move-result-object v0

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    iput-object v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->ip:Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 55
    move-result-object v0

    .line 56
    .line 57
    iput-object v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->host:Ljava/lang/String;

    .line 58
    .line 59
    sget-object v2, Lcom/tencent/bugly/proguard/qd;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 60
    .line 61
    iget-object v1, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->ip:Ljava/lang/String;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v2, v0, v1}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 65
    goto :goto_0

    .line 66
    .line 67
    :catchall_0
    sget-object v0, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 68
    .line 69
    const-string v1, "Okhttp3EventListener"

    .line 70
    .line 71
    const-string v2, "get inetSocket info failed from connectEnd"

    .line 72
    .line 73
    .line 74
    filled-new-array {v1, v2}, [Ljava/lang/String;

    .line 75
    move-result-object v1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 79
    .line 80
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 81
    .line 82
    if-eqz v0, :cond_2

    .line 83
    .line 84
    .line 85
    invoke-virtual {v0, p1, p2, p3, p4}, Lokhttp3/EventListener;->connectEnd(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;)V

    .line 86
    :cond_2
    return-void
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
.end method

.method public connectFailed(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V
    .locals 6
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/net/InetSocketAddress;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/net/Proxy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p4    # Lokhttp3/Protocol;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param
    .param p5    # Ljava/io/IOException;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super/range {p0 .. p5}, Lokhttp3/EventListener;->connectFailed(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V

    .line 4
    move-object v1, p1

    .line 5
    move-object p1, p0

    .line 6
    .line 7
    iget-boolean v0, p1, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 8
    .line 9
    if-eqz v0, :cond_3

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, v1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 14
    move-result-object v0

    .line 15
    .line 16
    if-eqz v0, :cond_3

    .line 17
    .line 18
    iget-wide v2, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->sslConnStart:J

    .line 19
    .line 20
    const-wide/16 v4, 0x0

    .line 21
    .line 22
    cmp-long v2, v2, v4

    .line 23
    .line 24
    if-eqz v2, :cond_0

    .line 25
    .line 26
    iget-wide v2, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->sslConnEnd:J

    .line 27
    .line 28
    cmp-long v2, v2, v4

    .line 29
    .line 30
    if-nez v2, :cond_0

    .line 31
    .line 32
    .line 33
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 34
    move-result-wide v2

    .line 35
    .line 36
    iput-wide v2, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->sslConnEnd:J

    .line 37
    .line 38
    :cond_0
    iget-wide v2, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->connStart:J

    .line 39
    .line 40
    cmp-long v2, v2, v4

    .line 41
    .line 42
    if-eqz v2, :cond_1

    .line 43
    .line 44
    iget-wide v2, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->connEnd:J

    .line 45
    .line 46
    cmp-long v2, v2, v4

    .line 47
    .line 48
    if-nez v2, :cond_1

    .line 49
    .line 50
    .line 51
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 52
    move-result-wide v2

    .line 53
    .line 54
    iput-wide v2, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->connEnd:J

    .line 55
    .line 56
    .line 57
    :cond_1
    :try_start_0
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 58
    move-result-object v2

    .line 59
    .line 60
    if-eqz v2, :cond_2

    .line 61
    .line 62
    .line 63
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getPort()I

    .line 64
    move-result v2

    .line 65
    .line 66
    iput v2, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->port:I

    .line 67
    .line 68
    .line 69
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getAddress()Ljava/net/InetAddress;

    .line 70
    move-result-object v2

    .line 71
    .line 72
    .line 73
    invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;

    .line 74
    move-result-object v2

    .line 75
    .line 76
    iput-object v2, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->ip:Ljava/lang/String;

    .line 77
    .line 78
    .line 79
    invoke-virtual {p2}, Ljava/net/InetSocketAddress;->getHostName()Ljava/lang/String;

    .line 80
    move-result-object v2

    .line 81
    .line 82
    iput-object v2, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->host:Ljava/lang/String;

    .line 83
    .line 84
    sget-object v3, Lcom/tencent/bugly/proguard/qd;->d:Ljava/util/concurrent/ConcurrentHashMap;

    .line 85
    .line 86
    iget-object v4, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->ip:Ljava/lang/String;

    .line 87
    .line 88
    .line 89
    invoke-virtual {v3, v2, v4}, Ljava/util/concurrent/ConcurrentHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 90
    goto :goto_0

    .line 91
    .line 92
    :catchall_0
    sget-object v2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 93
    .line 94
    const-string v3, "Okhttp3EventListener"

    .line 95
    .line 96
    const-string v4, "get inetSocket info failed from connectFailed"

    .line 97
    .line 98
    .line 99
    filled-new-array {v3, v4}, [Ljava/lang/String;

    .line 100
    move-result-object v3

    .line 101
    .line 102
    .line 103
    invoke-virtual {v2, v3}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 104
    .line 105
    .line 106
    :cond_2
    :goto_0
    invoke-virtual {p0, p5, v0}, Lcom/tencent/bugly/proguard/qd;->a(Ljava/lang/Exception;Lcom/tencent/bugly/traffic/custom/SocketInfo;)V

    .line 107
    .line 108
    .line 109
    invoke-virtual {p0, v1}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;)V

    .line 110
    .line 111
    :cond_3
    iget-object v0, p1, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 112
    .line 113
    if-eqz v0, :cond_4

    .line 114
    move-object v2, p2

    .line 115
    move-object v3, p3

    .line 116
    move-object v4, p4

    .line 117
    move-object v5, p5

    .line 118
    .line 119
    .line 120
    invoke-virtual/range {v0 .. v5}, Lokhttp3/EventListener;->connectFailed(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;Lokhttp3/Protocol;Ljava/io/IOException;)V

    .line 121
    :cond_4
    return-void
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
.end method

.method public connectStart(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V
    .locals 3
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/net/InetSocketAddress;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/net/Proxy;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Lokhttp3/EventListener;->connectStart(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v1

    .line 19
    .line 20
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->connStart:J

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, p2, p3}, Lokhttp3/EventListener;->connectStart(Lokhttp3/Call;Ljava/net/InetSocketAddress;Ljava/net/Proxy;)V

    .line 28
    :cond_1
    return-void
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
.end method

.method public connectionAcquired(Lokhttp3/Call;Lokhttp3/Connection;)V
    .locals 6
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/Connection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lokhttp3/EventListener;->connectionAcquired(Lokhttp3/Call;Lokhttp3/Connection;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_1

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    if-eqz v1, :cond_1

    .line 15
    .line 16
    iget-wide v2, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->dnsStart:J

    .line 17
    .line 18
    const-wide/16 v4, 0x0

    .line 19
    .line 20
    cmp-long v2, v2, v4

    .line 21
    .line 22
    if-nez v2, :cond_0

    .line 23
    const/4 v0, 0x1

    .line 24
    .line 25
    iput-boolean v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->isDnsCache:Z

    .line 26
    goto :goto_0

    .line 27
    .line 28
    :cond_0
    iput-boolean v0, v1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->isDnsCache:Z

    .line 29
    .line 30
    :cond_1
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 31
    .line 32
    if-eqz v0, :cond_2

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->connectionAcquired(Lokhttp3/Call;Lokhttp3/Connection;)V

    .line 36
    :cond_2
    return-void
    .line 37
.end method

.method public connectionReleased(Lokhttp3/Call;Lokhttp3/Connection;)V
    .locals 1
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/Connection;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lokhttp3/EventListener;->connectionReleased(Lokhttp3/Call;Lokhttp3/Connection;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->connectionReleased(Lokhttp3/Call;Lokhttp3/Connection;)V

    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
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
.end method

.method public dnsEnd(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V
    .locals 3
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Ljava/util/List;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lokhttp3/Call;",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Ljava/net/InetAddress;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Lokhttp3/EventListener;->dnsEnd(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v1

    .line 19
    .line 20
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->dnsEnd:J

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, p2, p3}, Lokhttp3/EventListener;->dnsEnd(Lokhttp3/Call;Ljava/lang/String;Ljava/util/List;)V

    .line 28
    :cond_1
    return-void
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
.end method

.method public dnsStart(Lokhttp3/Call;Ljava/lang/String;)V
    .locals 3
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lokhttp3/EventListener;->dnsStart(Lokhttp3/Call;Ljava/lang/String;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v1

    .line 19
    .line 20
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->dnsStart:J

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->dnsStart(Lokhttp3/Call;Ljava/lang/String;)V

    .line 28
    :cond_1
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public requestBodyEnd(Lokhttp3/Call;J)V
    .locals 3
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Lokhttp3/EventListener;->requestBodyEnd(Lokhttp3/Call;J)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v1

    .line 19
    .line 20
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->reqEnd:J

    .line 21
    .line 22
    iget-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->sendBytes:J

    .line 23
    add-long/2addr v1, p2

    .line 24
    .line 25
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->sendBytes:J

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1, p2, p3}, Lokhttp3/EventListener;->requestBodyEnd(Lokhttp3/Call;J)V

    .line 33
    :cond_1
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public requestBodyStart(Lokhttp3/Call;)V
    .locals 5
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lokhttp3/EventListener;->requestBodyStart(Lokhttp3/Call;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->reqStart:J

    .line 17
    .line 18
    const-wide/16 v3, 0x0

    .line 19
    .line 20
    cmp-long v1, v1, v3

    .line 21
    .line 22
    if-nez v1, :cond_0

    .line 23
    .line 24
    .line 25
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 26
    move-result-wide v1

    .line 27
    .line 28
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->reqStart:J

    .line 29
    .line 30
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 31
    .line 32
    if-eqz v0, :cond_1

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->requestBodyStart(Lokhttp3/Call;)V

    .line 36
    :cond_1
    return-void
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
.end method

.method public requestHeadersEnd(Lokhttp3/Call;Lokhttp3/Request;)V
    .locals 4
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/Request;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lokhttp3/EventListener;->requestHeadersEnd(Lokhttp3/Call;Lokhttp3/Request;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->requestHeadersEnd(Lokhttp3/Call;Lokhttp3/Request;)V

    .line 11
    .line 12
    :cond_0
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 13
    .line 14
    if-eqz v0, :cond_2

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 19
    move-result-object p1

    .line 20
    .line 21
    if-eqz p1, :cond_2

    .line 22
    .line 23
    .line 24
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 25
    move-result-wide v0

    .line 26
    .line 27
    iput-wide v0, p1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->reqEnd:J

    .line 28
    .line 29
    const-string v0, "User-Agent"

    .line 30
    .line 31
    .line 32
    invoke-virtual {p2, v0}, Lokhttp3/Request;->header(Ljava/lang/String;)Ljava/lang/String;

    .line 33
    move-result-object v0

    .line 34
    .line 35
    sget-object v1, Lcom/tencent/bugly/proguard/qd;->e:Ljava/lang/String;

    .line 36
    .line 37
    if-eqz v1, :cond_1

    .line 38
    .line 39
    if-eqz v0, :cond_1

    .line 40
    .line 41
    .line 42
    invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    .line 43
    move-result v0

    .line 44
    .line 45
    if-eqz v0, :cond_2

    .line 46
    .line 47
    :cond_1
    :try_start_0
    iget-wide v0, p1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->sendBytes:J

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    .line 51
    move-result-object v2

    .line 52
    .line 53
    .line 54
    invoke-virtual {v2}, Lokhttp3/Headers;->byteCount()J

    .line 55
    move-result-wide v2

    .line 56
    add-long/2addr v0, v2

    .line 57
    .line 58
    iput-wide v0, p1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->sendBytes:J

    .line 59
    .line 60
    .line 61
    invoke-virtual {p2}, Lokhttp3/Request;->url()Lokhttp3/HttpUrl;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Lokhttp3/HttpUrl;->toString()Ljava/lang/String;

    .line 66
    move-result-object v0

    .line 67
    .line 68
    iput-object v0, p1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->url:Ljava/lang/String;

    .line 69
    .line 70
    .line 71
    invoke-virtual {p2}, Lokhttp3/Request;->headers()Lokhttp3/Headers;

    .line 72
    move-result-object p2

    .line 73
    .line 74
    iget-object v0, p1, Lcom/tencent/bugly/traffic/custom/SocketInfo;->requestHeaders:Ljava/util/Map;

    .line 75
    .line 76
    .line 77
    invoke-static {p2, v0, p1}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Headers;Ljava/util/Map;Lcom/tencent/bugly/traffic/custom/SocketInfo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 78
    return-void

    .line 79
    :catch_0
    move-exception p1

    .line 80
    .line 81
    sget-object p2, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 82
    .line 83
    new-instance v0, Ljava/lang/StringBuilder;

    .line 84
    .line 85
    .line 86
    const-string/jumbo v1, "parse header failed, "

    .line 87
    .line 88
    .line 89
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 90
    .line 91
    .line 92
    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 96
    move-result-object p1

    .line 97
    .line 98
    const-string v0, "Okhttp3EventListener"

    .line 99
    .line 100
    .line 101
    filled-new-array {v0, p1}, [Ljava/lang/String;

    .line 102
    move-result-object p1

    .line 103
    .line 104
    .line 105
    invoke-virtual {p2, p1}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 106
    :cond_2
    return-void
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public requestHeadersStart(Lokhttp3/Call;)V
    .locals 3
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lokhttp3/EventListener;->requestHeadersStart(Lokhttp3/Call;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v1

    .line 19
    .line 20
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->reqStart:J

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->requestHeadersStart(Lokhttp3/Call;)V

    .line 28
    :cond_1
    return-void
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
.end method

.method public responseBodyEnd(Lokhttp3/Call;J)V
    .locals 3
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2, p3}, Lokhttp3/EventListener;->responseBodyEnd(Lokhttp3/Call;J)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    iget-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->receivedBytes:J

    .line 17
    add-long/2addr v1, p2

    .line 18
    .line 19
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->receivedBytes:J

    .line 20
    .line 21
    .line 22
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 23
    move-result-wide v1

    .line 24
    .line 25
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->respEnd:J

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1, p2, p3}, Lokhttp3/EventListener;->responseBodyEnd(Lokhttp3/Call;J)V

    .line 33
    :cond_1
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public responseBodyStart(Lokhttp3/Call;)V
    .locals 1
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lokhttp3/EventListener;->responseBodyStart(Lokhttp3/Call;)V

    .line 4
    .line 5
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->responseBodyStart(Lokhttp3/Call;)V

    .line 11
    :cond_0
    return-void
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public responseHeadersEnd(Lokhttp3/Call;Lokhttp3/Response;)V
    .locals 5
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/Response;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lokhttp3/EventListener;->responseHeadersEnd(Lokhttp3/Call;Lokhttp3/Response;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    :try_start_0
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-virtual {p2}, Lokhttp3/Response;->code()I

    .line 18
    move-result v1

    .line 19
    .line 20
    iput v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->statusCode:I

    .line 21
    .line 22
    iget-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->receivedBytes:J

    .line 23
    .line 24
    .line 25
    invoke-virtual {p2}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-virtual {v3}, Lokhttp3/Headers;->byteCount()J

    .line 30
    move-result-wide v3

    .line 31
    add-long/2addr v1, v3

    .line 32
    .line 33
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->receivedBytes:J

    .line 34
    .line 35
    .line 36
    invoke-virtual {p2}, Lokhttp3/Response;->headers()Lokhttp3/Headers;

    .line 37
    move-result-object v1

    .line 38
    .line 39
    iget-object v0, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->responseHeaders:Ljava/util/Map;

    .line 40
    const/4 v2, 0x0

    .line 41
    .line 42
    .line 43
    invoke-static {v1, v0, v2}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Headers;Ljava/util/Map;Lcom/tencent/bugly/traffic/custom/SocketInfo;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    goto :goto_0

    .line 45
    :catch_0
    move-exception v0

    .line 46
    .line 47
    sget-object v1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 48
    .line 49
    new-instance v2, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    const-string/jumbo v3, "responseHeadersEnd may be failed, "

    .line 53
    .line 54
    .line 55
    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 62
    move-result-object v0

    .line 63
    .line 64
    const-string v2, "Okhttp3EventListener"

    .line 65
    .line 66
    .line 67
    filled-new-array {v2, v0}, [Ljava/lang/String;

    .line 68
    move-result-object v0

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->w([Ljava/lang/String;)V

    .line 72
    .line 73
    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 74
    .line 75
    if-eqz v0, :cond_1

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->responseHeadersEnd(Lokhttp3/Call;Lokhttp3/Response;)V

    .line 79
    :cond_1
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
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
.end method

.method public responseHeadersStart(Lokhttp3/Call;)V
    .locals 5
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lokhttp3/EventListener;->responseHeadersStart(Lokhttp3/Call;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v1

    .line 19
    .line 20
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->respStart:J

    .line 21
    .line 22
    iget-wide v3, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->reqEnd:J

    .line 23
    sub-long/2addr v1, v3

    .line 24
    .line 25
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->firstPacketPeriod:J

    .line 26
    .line 27
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 28
    .line 29
    if-eqz v0, :cond_1

    .line 30
    .line 31
    .line 32
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->responseHeadersStart(Lokhttp3/Call;)V

    .line 33
    :cond_1
    return-void
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
.end method

.method public secureConnectEnd(Lokhttp3/Call;Lokhttp3/Handshake;)V
    .locals 3
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Lokhttp3/Handshake;
        .annotation build Landroidx/annotation/Nullable;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1, p2}, Lokhttp3/EventListener;->secureConnectEnd(Lokhttp3/Call;Lokhttp3/Handshake;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v1

    .line 19
    .line 20
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->sslConnEnd:J

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1, p2}, Lokhttp3/EventListener;->secureConnectEnd(Lokhttp3/Call;Lokhttp3/Handshake;)V

    .line 28
    :cond_1
    return-void
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method public secureConnectStart(Lokhttp3/Call;)V
    .locals 3
    .param p1    # Lokhttp3/Call;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    .line 3
    invoke-super {p0, p1}, Lokhttp3/EventListener;->secureConnectStart(Lokhttp3/Call;)V

    .line 4
    .line 5
    iget-boolean v0, p0, Lcom/tencent/bugly/proguard/qd;->b:Z

    .line 6
    .line 7
    if-eqz v0, :cond_0

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, p1, v0}, Lcom/tencent/bugly/proguard/qd;->a(Lokhttp3/Call;Z)Lcom/tencent/bugly/traffic/custom/SocketInfo;

    .line 12
    move-result-object v0

    .line 13
    .line 14
    if-eqz v0, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 18
    move-result-wide v1

    .line 19
    .line 20
    iput-wide v1, v0, Lcom/tencent/bugly/traffic/custom/SocketInfo;->sslConnStart:J

    .line 21
    .line 22
    :cond_0
    iget-object v0, p0, Lcom/tencent/bugly/proguard/qd;->a:Lokhttp3/EventListener;

    .line 23
    .line 24
    if-eqz v0, :cond_1

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, p1}, Lokhttp3/EventListener;->secureConnectStart(Lokhttp3/Call;)V

    .line 28
    :cond_1
    return-void
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
.end method
