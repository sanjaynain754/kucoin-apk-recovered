.class Lcom/google/api/client/googleapis/apache/v2/GoogleApacheHttpTransport$SocketFactoryRegistryHandler;
.super Ljava/lang/Object;
.source "GoogleApacheHttpTransport.java"


# annotations
.annotation build Lcom/google/common/annotations/VisibleForTesting;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/api/client/googleapis/apache/v2/GoogleApacheHttpTransport;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "SocketFactoryRegistryHandler"
.end annotation


# instance fields
.field private final isMtls:Z

.field private final socketFactoryRegistry:Lorg/apache/http/config/Registry;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lorg/apache/http/config/Registry<",
            "Lorg/apache/http/conn/socket/ConnectionSocketFactory;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Lcom/google/api/client/googleapis/mtls/MtlsProvider;)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/GeneralSecurityException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-interface {p1}, Lcom/google/api/client/googleapis/mtls/MtlsProvider;->useMtlsClientCertificate()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-eqz v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-interface {p1}, Lcom/google/api/client/googleapis/mtls/MtlsProvider;->getKeyStore()Ljava/security/KeyStore;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-interface {p1}, Lcom/google/api/client/googleapis/mtls/MtlsProvider;->getKeyStorePassword()Ljava/lang/String;

    .line 17
    move-result-object p1

    .line 18
    move-object v5, p1

    .line 19
    move-object v4, v0

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    const/4 v0, 0x0

    .line 22
    move-object v4, v0

    .line 23
    move-object v5, v4

    .line 24
    .line 25
    .line 26
    :goto_0
    invoke-static {}, Lcom/google/api/client/googleapis/GoogleUtils;->getCertificateTrustStore()Ljava/security/KeyStore;

    .line 27
    move-result-object v2

    .line 28
    .line 29
    .line 30
    invoke-static {}, Lcom/google/api/client/util/SslUtils;->getTlsSslContext()Ljavax/net/ssl/SSLContext;

    .line 31
    move-result-object v1

    .line 32
    .line 33
    if-eqz v4, :cond_1

    .line 34
    .line 35
    if-eqz v5, :cond_1

    .line 36
    const/4 p1, 0x1

    .line 37
    .line 38
    iput-boolean p1, p0, Lcom/google/api/client/googleapis/apache/v2/GoogleApacheHttpTransport$SocketFactoryRegistryHandler;->isMtls:Z

    .line 39
    .line 40
    .line 41
    invoke-static {}, Lcom/google/api/client/util/SslUtils;->getPkixTrustManagerFactory()Ljavax/net/ssl/TrustManagerFactory;

    .line 42
    move-result-object v3

    .line 43
    .line 44
    .line 45
    invoke-static {}, Lcom/google/api/client/util/SslUtils;->getDefaultKeyManagerFactory()Ljavax/net/ssl/KeyManagerFactory;

    .line 46
    move-result-object v6

    .line 47
    .line 48
    .line 49
    invoke-static/range {v1 .. v6}, Lcom/google/api/client/util/SslUtils;->initSslContext(Ljavax/net/ssl/SSLContext;Ljava/security/KeyStore;Ljavax/net/ssl/TrustManagerFactory;Ljava/security/KeyStore;Ljava/lang/String;Ljavax/net/ssl/KeyManagerFactory;)Ljavax/net/ssl/SSLContext;

    .line 50
    goto :goto_1

    .line 51
    :cond_1
    const/4 p1, 0x0

    .line 52
    .line 53
    iput-boolean p1, p0, Lcom/google/api/client/googleapis/apache/v2/GoogleApacheHttpTransport$SocketFactoryRegistryHandler;->isMtls:Z

    .line 54
    .line 55
    .line 56
    invoke-static {}, Lcom/google/api/client/util/SslUtils;->getPkixTrustManagerFactory()Ljavax/net/ssl/TrustManagerFactory;

    .line 57
    move-result-object p1

    .line 58
    .line 59
    .line 60
    invoke-static {v1, v2, p1}, Lcom/google/api/client/util/SslUtils;->initSslContext(Ljavax/net/ssl/SSLContext;Ljava/security/KeyStore;Ljavax/net/ssl/TrustManagerFactory;)Ljavax/net/ssl/SSLContext;

    .line 61
    .line 62
    :goto_1
    new-instance p1, Lorg/apache/http/conn/ssl/SSLConnectionSocketFactory;

    .line 63
    .line 64
    .line 65
    invoke-direct {p1, v1}, Lorg/apache/http/conn/ssl/SSLConnectionSocketFactory;-><init>(Ljavax/net/ssl/SSLContext;)V

    .line 66
    .line 67
    .line 68
    invoke-static {}, Lorg/apache/http/config/RegistryBuilder;->create()Lorg/apache/http/config/RegistryBuilder;

    .line 69
    move-result-object v0

    .line 70
    .line 71
    const-string v1, "http"

    .line 72
    .line 73
    .line 74
    invoke-static {}, Lorg/apache/http/conn/socket/PlainConnectionSocketFactory;->getSocketFactory()Lorg/apache/http/conn/socket/PlainConnectionSocketFactory;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    .line 78
    invoke-virtual {v0, v1, v2}, Lorg/apache/http/config/RegistryBuilder;->register(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/config/RegistryBuilder;

    .line 79
    move-result-object v0

    .line 80
    .line 81
    const-string v1, "https"

    .line 82
    .line 83
    .line 84
    invoke-virtual {v0, v1, p1}, Lorg/apache/http/config/RegistryBuilder;->register(Ljava/lang/String;Ljava/lang/Object;)Lorg/apache/http/config/RegistryBuilder;

    .line 85
    move-result-object p1

    .line 86
    .line 87
    .line 88
    invoke-virtual {p1}, Lorg/apache/http/config/RegistryBuilder;->build()Lorg/apache/http/config/Registry;

    .line 89
    move-result-object p1

    .line 90
    .line 91
    iput-object p1, p0, Lcom/google/api/client/googleapis/apache/v2/GoogleApacheHttpTransport$SocketFactoryRegistryHandler;->socketFactoryRegistry:Lorg/apache/http/config/Registry;

    .line 92
    return-void
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
.end method


# virtual methods
.method public getSocketFactoryRegistry()Lorg/apache/http/config/Registry;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lorg/apache/http/config/Registry<",
            "Lorg/apache/http/conn/socket/ConnectionSocketFactory;",
            ">;"
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/api/client/googleapis/apache/v2/GoogleApacheHttpTransport$SocketFactoryRegistryHandler;->socketFactoryRegistry:Lorg/apache/http/config/Registry;

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
    iget-boolean v0, p0, Lcom/google/api/client/googleapis/apache/v2/GoogleApacheHttpTransport$SocketFactoryRegistryHandler;->isMtls:Z

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
