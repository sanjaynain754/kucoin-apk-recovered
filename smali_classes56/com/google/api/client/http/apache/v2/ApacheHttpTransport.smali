.class public final Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;
.super Lcom/google/api/client/http/HttpTransport;
.source "ApacheHttpTransport.java"


# instance fields
.field private final httpClient:Lorg/apache/http/client/HttpClient;

.field private final isMtls:Z


# direct methods
.method public constructor <init>()V
    .locals 2

    .line 1
    invoke-static {}, Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;->newDefaultHttpClient()Lorg/apache/http/client/HttpClient;

    move-result-object v0

    const/4 v1, 0x0

    invoke-direct {p0, v0, v1}, Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;-><init>(Lorg/apache/http/client/HttpClient;Z)V

    return-void
.end method

.method public constructor <init>(Lorg/apache/http/client/HttpClient;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lcom/google/api/client/http/HttpTransport;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;->httpClient:Lorg/apache/http/client/HttpClient;

    const/4 p1, 0x0

    .line 4
    iput-boolean p1, p0, Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;->isMtls:Z

    return-void
.end method

.method public constructor <init>(Lorg/apache/http/client/HttpClient;Z)V
    .locals 0
    .annotation build Lcom/google/api/client/util/Beta;
    .end annotation

    .line 5
    invoke-direct {p0}, Lcom/google/api/client/http/HttpTransport;-><init>()V

    .line 6
    iput-object p1, p0, Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;->httpClient:Lorg/apache/http/client/HttpClient;

    .line 7
    iput-boolean p2, p0, Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;->isMtls:Z

    return-void
.end method

.method public static newDefaultHttpClient()Lorg/apache/http/client/HttpClient;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;->newDefaultHttpClientBuilder()Lorg/apache/http/impl/client/HttpClientBuilder;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/apache/http/impl/client/HttpClientBuilder;->build()Lorg/apache/http/impl/client/CloseableHttpClient;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
    .line 10
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public static newDefaultHttpClientBuilder()Lorg/apache/http/impl/client/HttpClientBuilder;
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lorg/apache/http/impl/client/HttpClientBuilder;->create()Lorg/apache/http/impl/client/HttpClientBuilder;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lorg/apache/http/impl/client/HttpClientBuilder;->useSystemProperties()Lorg/apache/http/impl/client/HttpClientBuilder;

    .line 8
    move-result-object v0

    .line 9
    .line 10
    .line 11
    invoke-static {}, Lorg/apache/http/conn/ssl/SSLConnectionSocketFactory;->getSocketFactory()Lorg/apache/http/conn/ssl/SSLConnectionSocketFactory;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/HttpClientBuilder;->setSSLSocketFactory(Lorg/apache/http/conn/socket/LayeredConnectionSocketFactory;)Lorg/apache/http/impl/client/HttpClientBuilder;

    .line 16
    move-result-object v0

    .line 17
    .line 18
    const/16 v1, 0xc8

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/HttpClientBuilder;->setMaxConnTotal(I)Lorg/apache/http/impl/client/HttpClientBuilder;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    const/16 v1, 0x14

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/HttpClientBuilder;->setMaxConnPerRoute(I)Lorg/apache/http/impl/client/HttpClientBuilder;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    const-wide/16 v1, -0x1

    .line 31
    .line 32
    sget-object v3, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v1, v2, v3}, Lorg/apache/http/impl/client/HttpClientBuilder;->setConnectionTimeToLive(JLjava/util/concurrent/TimeUnit;)Lorg/apache/http/impl/client/HttpClientBuilder;

    .line 36
    move-result-object v0

    .line 37
    .line 38
    new-instance v1, Lorg/apache/http/impl/conn/SystemDefaultRoutePlanner;

    .line 39
    .line 40
    .line 41
    invoke-static {}, Ljava/net/ProxySelector;->getDefault()Ljava/net/ProxySelector;

    .line 42
    move-result-object v2

    .line 43
    .line 44
    .line 45
    invoke-direct {v1, v2}, Lorg/apache/http/impl/conn/SystemDefaultRoutePlanner;-><init>(Ljava/net/ProxySelector;)V

    .line 46
    .line 47
    .line 48
    invoke-virtual {v0, v1}, Lorg/apache/http/impl/client/HttpClientBuilder;->setRoutePlanner(Lorg/apache/http/conn/routing/HttpRoutePlanner;)Lorg/apache/http/impl/client/HttpClientBuilder;

    .line 49
    move-result-object v0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v0}, Lorg/apache/http/impl/client/HttpClientBuilder;->disableRedirectHandling()Lorg/apache/http/impl/client/HttpClientBuilder;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0}, Lorg/apache/http/impl/client/HttpClientBuilder;->disableAutomaticRetries()Lorg/apache/http/impl/client/HttpClientBuilder;

    .line 57
    move-result-object v0

    .line 58
    return-object v0
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
.end method


# virtual methods
.method public bridge synthetic buildRequest(Ljava/lang/String;Ljava/lang/String;)Lcom/google/api/client/http/LowLevelHttpRequest;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;->buildRequest(Ljava/lang/String;Ljava/lang/String;)Lcom/google/api/client/http/apache/v2/ApacheHttpRequest;

    move-result-object p1

    return-object p1
.end method

.method public buildRequest(Ljava/lang/String;Ljava/lang/String;)Lcom/google/api/client/http/apache/v2/ApacheHttpRequest;
    .locals 1

    .line 2
    const-string v0, "DELETE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 3
    new-instance p1, Lorg/apache/http/client/methods/HttpDelete;

    invoke-direct {p1, p2}, Lorg/apache/http/client/methods/HttpDelete;-><init>(Ljava/lang/String;)V

    goto/16 :goto_0

    .line 4
    :cond_0
    const-string v0, "GET"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 5
    new-instance p1, Lorg/apache/http/client/methods/HttpGet;

    invoke-direct {p1, p2}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 6
    :cond_1
    const-string v0, "HEAD"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    .line 7
    new-instance p1, Lorg/apache/http/client/methods/HttpHead;

    invoke-direct {p1, p2}, Lorg/apache/http/client/methods/HttpHead;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 8
    :cond_2
    const-string v0, "PATCH"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3

    .line 9
    new-instance p1, Lorg/apache/http/client/methods/HttpPatch;

    invoke-direct {p1, p2}, Lorg/apache/http/client/methods/HttpPatch;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 10
    :cond_3
    const-string v0, "POST"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_4

    .line 11
    new-instance p1, Lorg/apache/http/client/methods/HttpPost;

    invoke-direct {p1, p2}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 12
    :cond_4
    const-string v0, "PUT"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    .line 13
    new-instance p1, Lorg/apache/http/client/methods/HttpPut;

    invoke-direct {p1, p2}, Lorg/apache/http/client/methods/HttpPut;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 14
    :cond_5
    const-string v0, "TRACE"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_6

    .line 15
    new-instance p1, Lorg/apache/http/client/methods/HttpTrace;

    invoke-direct {p1, p2}, Lorg/apache/http/client/methods/HttpTrace;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 16
    :cond_6
    const-string v0, "OPTIONS"

    invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    .line 17
    new-instance p1, Lorg/apache/http/client/methods/HttpOptions;

    invoke-direct {p1, p2}, Lorg/apache/http/client/methods/HttpOptions;-><init>(Ljava/lang/String;)V

    goto :goto_0

    .line 18
    :cond_7
    new-instance v0, Lcom/google/api/client/http/apache/v2/HttpExtensionMethod;

    invoke-direct {v0, p1, p2}, Lcom/google/api/client/http/apache/v2/HttpExtensionMethod;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    move-object p1, v0

    .line 19
    :goto_0
    new-instance p2, Lcom/google/api/client/http/apache/v2/ApacheHttpRequest;

    iget-object v0, p0, Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;->httpClient:Lorg/apache/http/client/HttpClient;

    invoke-direct {p2, v0, p1}, Lcom/google/api/client/http/apache/v2/ApacheHttpRequest;-><init>(Lorg/apache/http/client/HttpClient;Lorg/apache/http/client/methods/HttpRequestBase;)V

    return-object p2
.end method

.method public getHttpClient()Lorg/apache/http/client/HttpClient;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;->httpClient:Lorg/apache/http/client/HttpClient;

    .line 3
    return-object v0
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
.end method

.method public isMtls()Z
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;->isMtls:Z

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
.end method

.method public shutdown()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/api/client/http/apache/v2/ApacheHttpTransport;->httpClient:Lorg/apache/http/client/HttpClient;

    .line 3
    .line 4
    instance-of v1, v0, Lorg/apache/http/impl/client/CloseableHttpClient;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    check-cast v0, Lorg/apache/http/impl/client/CloseableHttpClient;

    .line 9
    .line 10
    .line 11
    invoke-virtual {v0}, Lorg/apache/http/impl/client/CloseableHttpClient;->close()V

    .line 12
    :cond_0
    return-void
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public supportsMethod(Ljava/lang/String;)Z
    .locals 0

    .line 1
    const/4 p1, 0x1

    .line 2
    return p1
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
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method
