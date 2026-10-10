.class public final Lcom/tencent/bugly/proguard/pd$e;
.super Lcom/tencent/bugly/proguard/pd$c;
.source "BUGLY"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/tencent/bugly/proguard/pd;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "e"
.end annotation


# instance fields
.field public final b:Lcom/tencent/bugly/proguard/pd$d;


# direct methods
.method public constructor <init>(Lcom/tencent/bugly/proguard/pd$d;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/tencent/bugly/proguard/pd$c;-><init>(Ljava/net/HttpURLConnection;)V

    .line 3
    iput-object p1, p0, Lcom/tencent/bugly/proguard/pd$e;->b:Lcom/tencent/bugly/proguard/pd$d;

    return-void
.end method

.method public constructor <init>(Ljava/net/URL;Lokhttp3/OkHttpClient;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/tencent/bugly/proguard/pd$d;

    invoke-direct {v0, p1, p2}, Lcom/tencent/bugly/proguard/pd$d;-><init>(Ljava/net/URL;Lokhttp3/OkHttpClient;)V

    invoke-direct {p0, v0}, Lcom/tencent/bugly/proguard/pd$e;-><init>(Lcom/tencent/bugly/proguard/pd$d;)V

    return-void
.end method


# virtual methods
.method public a()Lokhttp3/Handshake;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pd$e;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/tencent/bugly/proguard/pd$d;->f:Lokhttp3/Call;

    .line 5
    .line 6
    if-eqz v1, :cond_0

    .line 7
    .line 8
    iget-object v0, v0, Lcom/tencent/bugly/proguard/pd$d;->n:Lokhttp3/Handshake;

    .line 9
    return-object v0

    .line 10
    .line 11
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 12
    .line 13
    const-string v1, "Connection has not yet been established"

    .line 14
    .line 15
    .line 16
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 17
    throw v0
.end method

.method public getHostnameVerifier()Ljavax/net/ssl/HostnameVerifier;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pd$e;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/bugly/proguard/pd$d;->a:Lokhttp3/OkHttpClient;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->hostnameVerifier()Ljavax/net/ssl/HostnameVerifier;

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
    .line 17
.end method

.method public getSSLSocketFactory()Ljavax/net/ssl/SSLSocketFactory;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pd$e;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 3
    .line 4
    iget-object v0, v0, Lcom/tencent/bugly/proguard/pd$d;->a:Lokhttp3/OkHttpClient;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0}, Lokhttp3/OkHttpClient;->sslSocketFactory()Ljavax/net/ssl/SSLSocketFactory;

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
    .line 17
.end method

.method public setHostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/bugly/proguard/pd$e;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 3
    .line 4
    iget-object v1, v0, Lcom/tencent/bugly/proguard/pd$d;->a:Lokhttp3/OkHttpClient;

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    .line 11
    invoke-virtual {v1, p1}, Lokhttp3/OkHttpClient$Builder;->hostnameVerifier(Ljavax/net/ssl/HostnameVerifier;)Lokhttp3/OkHttpClient$Builder;

    .line 12
    move-result-object p1

    .line 13
    .line 14
    .line 15
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 16
    move-result-object p1

    .line 17
    .line 18
    iput-object p1, v0, Lcom/tencent/bugly/proguard/pd$d;->a:Lokhttp3/OkHttpClient;

    .line 19
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
.end method

.method public setSSLSocketFactory(Ljavax/net/ssl/SSLSocketFactory;)V
    .locals 3

    .line 1
    .line 2
    if-eqz p1, :cond_1

    .line 3
    .line 4
    .line 5
    :try_start_0
    invoke-static {}, Lcom/tencent/bugly/proguard/kh;->a()Ljavax/net/ssl/X509TrustManager;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    iget-object v1, p0, Lcom/tencent/bugly/proguard/pd$e;->b:Lcom/tencent/bugly/proguard/pd$d;

    .line 11
    .line 12
    iget-object v2, v1, Lcom/tencent/bugly/proguard/pd$d;->a:Lokhttp3/OkHttpClient;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v2}, Lokhttp3/OkHttpClient;->newBuilder()Lokhttp3/OkHttpClient$Builder;

    .line 16
    move-result-object v2

    .line 17
    .line 18
    .line 19
    invoke-virtual {v2, p1, v0}, Lokhttp3/OkHttpClient$Builder;->sslSocketFactory(Ljavax/net/ssl/SSLSocketFactory;Ljavax/net/ssl/X509TrustManager;)Lokhttp3/OkHttpClient$Builder;

    .line 20
    move-result-object p1

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Lokhttp3/OkHttpClient$Builder;->build()Lokhttp3/OkHttpClient;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    iput-object p1, v1, Lcom/tencent/bugly/proguard/pd$d;->a:Lokhttp3/OkHttpClient;

    .line 27
    return-void

    .line 28
    .line 29
    :cond_0
    sget-object p1, Lcom/tencent/rmonitor/common/logger/Logger;->INSTANCE:Lcom/tencent/rmonitor/common/logger/Logger;

    .line 30
    .line 31
    const-string v0, "RMonitor_ObsoleteUrlFactory"

    .line 32
    .line 33
    .line 34
    const-string/jumbo v1, "set SSLSocketFactory fail, so use default."

    .line 35
    .line 36
    .line 37
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {p1, v0}, Lcom/tencent/rmonitor/common/logger/Logger;->d([Ljava/lang/String;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 42
    :catchall_0
    return-void

    .line 43
    .line 44
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 45
    .line 46
    .line 47
    const-string/jumbo v0, "sslSocketFactory == null"

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1
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
