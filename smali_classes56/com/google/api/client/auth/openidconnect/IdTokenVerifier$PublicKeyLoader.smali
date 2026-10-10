.class Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader;
.super Lcom/google/common/cache/CacheLoader;
.source "IdTokenVerifier.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/api/client/auth/openidconnect/IdTokenVerifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "PublicKeyLoader"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;,
        Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKeySet;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lcom/google/common/cache/CacheLoader<",
        "Ljava/lang/String;",
        "Ljava/util/Map<",
        "Ljava/lang/String;",
        "Ljava/security/PublicKey;",
        ">;>;"
    }
.end annotation


# instance fields
.field private final httpTransportFactory:Lcom/google/api/client/auth/openidconnect/HttpTransportFactory;


# direct methods
.method public constructor <init>(Lcom/google/api/client/auth/openidconnect/HttpTransportFactory;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/google/common/cache/CacheLoader;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader;->httpTransportFactory:Lcom/google/api/client/auth/openidconnect/HttpTransportFactory;

    .line 6
    return-void
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

.method private buildEs256PublicKey(Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;)Ljava/security/PublicKey;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidParameterSpecException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p1, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;->kty:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "EC"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 12
    .line 13
    const-string v0, "P-256"

    .line 14
    .line 15
    iget-object v2, p1, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;->crv:Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 19
    move-result v0

    .line 20
    .line 21
    .line 22
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 23
    .line 24
    new-instance v0, Ljava/math/BigInteger;

    .line 25
    .line 26
    iget-object v2, p1, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;->x:Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    invoke-static {v2}, Lcom/google/api/client/util/Base64;->decodeBase64(Ljava/lang/String;)[B

    .line 30
    move-result-object v2

    .line 31
    const/4 v3, 0x1

    .line 32
    .line 33
    .line 34
    invoke-direct {v0, v3, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 35
    .line 36
    new-instance v2, Ljava/math/BigInteger;

    .line 37
    .line 38
    iget-object p1, p1, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;->y:Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Lcom/google/api/client/util/Base64;->decodeBase64(Ljava/lang/String;)[B

    .line 42
    move-result-object p1

    .line 43
    .line 44
    .line 45
    invoke-direct {v2, v3, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 46
    .line 47
    new-instance p1, Ljava/security/spec/ECPoint;

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, v0, v2}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 51
    .line 52
    .line 53
    invoke-static {v1}, Ljava/security/AlgorithmParameters;->getInstance(Ljava/lang/String;)Ljava/security/AlgorithmParameters;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    new-instance v2, Ljava/security/spec/ECGenParameterSpec;

    .line 57
    .line 58
    const-string v3, "secp256r1"

    .line 59
    .line 60
    .line 61
    invoke-direct {v2, v3}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0, v2}, Ljava/security/AlgorithmParameters;->init(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 65
    .line 66
    const-class v2, Ljava/security/spec/ECParameterSpec;

    .line 67
    .line 68
    .line 69
    invoke-virtual {v0, v2}, Ljava/security/AlgorithmParameters;->getParameterSpec(Ljava/lang/Class;)Ljava/security/spec/AlgorithmParameterSpec;

    .line 70
    move-result-object v0

    .line 71
    .line 72
    check-cast v0, Ljava/security/spec/ECParameterSpec;

    .line 73
    .line 74
    new-instance v2, Ljava/security/spec/ECPublicKeySpec;

    .line 75
    .line 76
    .line 77
    invoke-direct {v2, p1, v0}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    .line 78
    .line 79
    .line 80
    invoke-static {v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 81
    move-result-object p1

    .line 82
    .line 83
    .line 84
    invoke-virtual {p1, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 85
    move-result-object p1

    .line 86
    return-object p1
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
.end method

.method private buildPublicKey(Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;)Ljava/security/PublicKey;
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidParameterSpecException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    .line 1
    iget-object v0, p1, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;->alg:Ljava/lang/String;

    const-string v1, "ES256"

    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    .line 2
    invoke-direct {p0, p1}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader;->buildEs256PublicKey(Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;)Ljava/security/PublicKey;

    move-result-object p1

    return-object p1

    .line 3
    :cond_0
    const-string v0, "RS256"

    iget-object v1, p1, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;->alg:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    .line 4
    invoke-direct {p0, p1}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader;->buildRs256PublicKey(Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;)Ljava/security/PublicKey;

    move-result-object p1

    return-object p1

    :cond_1
    const/4 p1, 0x0

    return-object p1
.end method

.method private buildPublicKey(Ljava/lang/String;)Ljava/security/PublicKey;
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;,
            Ljava/io/UnsupportedEncodingException;
        }
    .end annotation

    .line 5
    const-string v0, "X.509"

    invoke-static {v0}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v0

    new-instance v1, Ljava/io/ByteArrayInputStream;

    const-string v2, "UTF-8"

    .line 6
    invoke-virtual {p1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    move-result-object p1

    invoke-direct {v1, p1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    invoke-virtual {v0, v1}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object p1

    .line 7
    invoke-virtual {p1}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    move-result-object p1

    return-object p1
.end method

.method private buildRs256PublicKey(Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;)Ljava/security/PublicKey;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/NoSuchAlgorithmException;,
            Ljava/security/spec/InvalidKeySpecException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p1, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;->kty:Ljava/lang/String;

    .line 3
    .line 4
    const-string v1, "RSA"

    .line 5
    .line 6
    .line 7
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    .line 11
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkArgument(Z)V

    .line 12
    .line 13
    iget-object v0, p1, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;->e:Ljava/lang/String;

    .line 14
    .line 15
    .line 16
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 17
    .line 18
    iget-object v0, p1, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;->n:Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    invoke-static {v0}, Lcom/google/common/base/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 22
    .line 23
    new-instance v0, Ljava/math/BigInteger;

    .line 24
    .line 25
    iget-object v2, p1, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;->n:Ljava/lang/String;

    .line 26
    .line 27
    .line 28
    invoke-static {v2}, Lcom/google/api/client/util/Base64;->decodeBase64(Ljava/lang/String;)[B

    .line 29
    move-result-object v2

    .line 30
    const/4 v3, 0x1

    .line 31
    .line 32
    .line 33
    invoke-direct {v0, v3, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 34
    .line 35
    new-instance v2, Ljava/math/BigInteger;

    .line 36
    .line 37
    iget-object p1, p1, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;->e:Ljava/lang/String;

    .line 38
    .line 39
    .line 40
    invoke-static {p1}, Lcom/google/api/client/util/Base64;->decodeBase64(Ljava/lang/String;)[B

    .line 41
    move-result-object p1

    .line 42
    .line 43
    .line 44
    invoke-direct {v2, v3, p1}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 45
    .line 46
    new-instance p1, Ljava/security/spec/RSAPublicKeySpec;

    .line 47
    .line 48
    .line 49
    invoke-direct {p1, v0, v2}, Ljava/security/spec/RSAPublicKeySpec;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 50
    .line 51
    .line 52
    invoke-static {v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 53
    move-result-object v0

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, p1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 57
    move-result-object p1

    .line 58
    return-object p1
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method


# virtual methods
.method public bridge synthetic load(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    check-cast p1, Ljava/lang/String;

    invoke-virtual {p0, p1}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader;->load(Ljava/lang/String;)Ljava/util/Map;

    move-result-object p1

    return-object p1
.end method

.method public load(Ljava/lang/String;)Ljava/util/Map;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/security/PublicKey;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    iget-object v0, p0, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader;->httpTransportFactory:Lcom/google/api/client/auth/openidconnect/HttpTransportFactory;

    invoke-interface {v0}, Lcom/google/api/client/auth/openidconnect/HttpTransportFactory;->create()Lcom/google/api/client/http/HttpTransport;

    move-result-object v0

    .line 3
    :try_start_0
    invoke-virtual {v0}, Lcom/google/api/client/http/HttpTransport;->createRequestFactory()Lcom/google/api/client/http/HttpRequestFactory;

    move-result-object v0

    new-instance v1, Lcom/google/api/client/http/GenericUrl;

    invoke-direct {v1, p1}, Lcom/google/api/client/http/GenericUrl;-><init>(Ljava/lang/String;)V

    .line 4
    invoke-virtual {v0, v1}, Lcom/google/api/client/http/HttpRequestFactory;->buildGetRequest(Lcom/google/api/client/http/GenericUrl;)Lcom/google/api/client/http/HttpRequest;

    move-result-object v0

    .line 5
    invoke-static {}, Lcom/google/api/client/json/gson/GsonFactory;->getDefaultInstance()Lcom/google/api/client/json/gson/GsonFactory;

    move-result-object v1

    invoke-virtual {v1}, Lcom/google/api/client/json/JsonFactory;->createJsonObjectParser()Lcom/google/api/client/json/JsonObjectParser;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/google/api/client/http/HttpRequest;->setParser(Lcom/google/api/client/util/ObjectParser;)Lcom/google/api/client/http/HttpRequest;

    move-result-object v0

    .line 6
    invoke-virtual {v0}, Lcom/google/api/client/http/HttpRequest;->execute()Lcom/google/api/client/http/HttpResponse;

    move-result-object v0

    .line 7
    const-class v1, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKeySet;

    invoke-virtual {v0, v1}, Lcom/google/api/client/http/HttpResponse;->parseAs(Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKeySet;
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_3

    .line 8
    new-instance v1, Lcom/google/common/collect/ImmutableMap$Builder;

    invoke-direct {v1}, Lcom/google/common/collect/ImmutableMap$Builder;-><init>()V

    .line 9
    iget-object v2, v0, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKeySet;->keys:Ljava/util/List;

    if-nez v2, :cond_0

    .line 10
    invoke-virtual {v0}, Ljava/util/AbstractMap;->keySet()Ljava/util/Set;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 11
    invoke-virtual {v0, v3}, Lcom/google/api/client/util/GenericData;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 12
    invoke-direct {p0, v4}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader;->buildPublicKey(Ljava/lang/String;)Ljava/security/PublicKey;

    move-result-object v4

    invoke-virtual {v1, v3, v4}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;

    goto :goto_0

    .line 13
    :cond_0
    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;

    .line 14
    :try_start_1
    iget-object v3, v2, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;->kid:Ljava/lang/String;

    invoke-direct {p0, v2}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader;->buildPublicKey(Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$PublicKeyLoader$JsonWebKey;)Ljava/security/PublicKey;

    move-result-object v2

    invoke-virtual {v1, v3, v2}, Lcom/google/common/collect/ImmutableMap$Builder;->put(Ljava/lang/Object;Ljava/lang/Object;)Lcom/google/common/collect/ImmutableMap$Builder;
    :try_end_1
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_1 .. :try_end_1} :catch_2
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_1 .. :try_end_1} :catch_1
    .catch Ljava/security/spec/InvalidParameterSpecException; {:try_start_1 .. :try_end_1} :catch_0

    goto :goto_1

    :catch_0
    move-exception v2

    goto :goto_2

    :catch_1
    move-exception v2

    goto :goto_2

    :catch_2
    move-exception v2

    .line 15
    :goto_2
    invoke-static {}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier;->access$000()Ljava/util/logging/Logger;

    move-result-object v3

    sget-object v4, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    const-string v5, "Failed to put a key into the cache"

    invoke-virtual {v3, v4, v5, v2}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_1

    .line 16
    :cond_1
    invoke-virtual {v1}, Lcom/google/common/collect/ImmutableMap$Builder;->build()Lcom/google/common/collect/ImmutableMap;

    move-result-object v0

    .line 17
    invoke-virtual {v0}, Lcom/google/common/collect/ImmutableMap;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_2

    .line 18
    invoke-virtual {v1}, Lcom/google/common/collect/ImmutableMap$Builder;->build()Lcom/google/common/collect/ImmutableMap;

    move-result-object p1

    return-object p1

    .line 19
    :cond_2
    new-instance v0, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$VerificationException;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    const-string v2, "No valid public key returned by the keystore: "

    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$VerificationException;-><init>(Ljava/lang/String;)V

    throw v0

    :catch_3
    move-exception v0

    .line 20
    invoke-static {}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier;->access$000()Ljava/util/logging/Logger;

    move-result-object v1

    sget-object v2, Ljava/util/logging/Level;->WARNING:Ljava/util/logging/Level;

    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    const-string v4, "Failed to get a certificate from certificate location "

    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, v2, p1, v0}, Ljava/util/logging/Logger;->log(Ljava/util/logging/Level;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 21
    throw v0
.end method
