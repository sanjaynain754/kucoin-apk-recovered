.class public Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;
.super Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;
.source "GoogleIdTokenVerifier.java"


# annotations
.annotation build Lcom/google/api/client/util/Beta;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "Builder"
.end annotation


# instance fields
.field publicKeys:Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;


# direct methods
.method public constructor <init>(Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;)V
    .locals 1

    .line 2
    invoke-direct {p0}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;-><init>()V

    .line 3
    invoke-static {p1}, Lcom/google/api/client/util/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;

    iput-object p1, p0, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->publicKeys:Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;

    .line 4
    const-string p1, "accounts.google.com"

    const-string v0, "https://accounts.google.com"

    filled-new-array {p1, v0}, [Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    invoke-virtual {p0, p1}, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->setIssuers(Ljava/util/Collection;)Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;

    return-void
.end method

.method public constructor <init>(Lcom/google/api/client/http/HttpTransport;Lcom/google/api/client/json/JsonFactory;)V
    .locals 1

    .line 1
    new-instance v0, Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;

    invoke-direct {v0, p1, p2}, Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;-><init>(Lcom/google/api/client/http/HttpTransport;Lcom/google/api/client/json/JsonFactory;)V

    invoke-direct {p0, v0}, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;-><init>(Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;)V

    return-void
.end method


# virtual methods
.method public bridge synthetic build()Lcom/google/api/client/auth/openidconnect/IdTokenVerifier;
    .locals 1

    .line 1
    invoke-virtual {p0}, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->build()Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier;

    move-result-object v0

    return-object v0
.end method

.method public build()Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier;
    .locals 1

    .line 2
    new-instance v0, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier;

    invoke-direct {v0, p0}, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier;-><init>(Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;)V

    return-object v0
.end method

.method public final getJsonFactory()Lcom/google/api/client/json/JsonFactory;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->publicKeys:Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;->getJsonFactory()Lcom/google/api/client/json/JsonFactory;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final getPublicCerts()Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->publicKeys:Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;

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

.method public final getPublicCertsEncodedUrl()Ljava/lang/String;
    .locals 1
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->publicKeys:Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;->getPublicCertsEncodedUrl()Ljava/lang/String;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public final getTransport()Lcom/google/api/client/http/HttpTransport;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->publicKeys:Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;->getTransport()Lcom/google/api/client/http/HttpTransport;

    .line 6
    move-result-object v0

    .line 7
    return-object v0
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

.method public bridge synthetic setAcceptableTimeSkewSeconds(J)Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1, p2}, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->setAcceptableTimeSkewSeconds(J)Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setAcceptableTimeSkewSeconds(J)Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1, p2}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;->setAcceptableTimeSkewSeconds(J)Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;

    move-result-object p1

    check-cast p1, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;

    return-object p1
.end method

.method public bridge synthetic setAudience(Ljava/util/Collection;)Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->setAudience(Ljava/util/Collection;)Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setAudience(Ljava/util/Collection;)Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;"
        }
    .end annotation

    .line 2
    invoke-super {p0, p1}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;->setAudience(Ljava/util/Collection;)Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;

    move-result-object p1

    check-cast p1, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;

    return-object p1
.end method

.method public bridge synthetic setClock(Lcom/google/api/client/util/Clock;)Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->setClock(Lcom/google/api/client/util/Clock;)Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setClock(Lcom/google/api/client/util/Clock;)Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;->setClock(Lcom/google/api/client/util/Clock;)Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;

    move-result-object p1

    check-cast p1, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;

    return-object p1
.end method

.method public bridge synthetic setIssuer(Ljava/lang/String;)Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->setIssuer(Ljava/lang/String;)Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setIssuer(Ljava/lang/String;)Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;
    .locals 0

    .line 2
    invoke-super {p0, p1}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;->setIssuer(Ljava/lang/String;)Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;

    move-result-object p1

    check-cast p1, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;

    return-object p1
.end method

.method public bridge synthetic setIssuers(Ljava/util/Collection;)Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;
    .locals 0

    .line 1
    invoke-virtual {p0, p1}, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->setIssuers(Ljava/util/Collection;)Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;

    move-result-object p1

    return-object p1
.end method

.method public setIssuers(Ljava/util/Collection;)Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;)",
            "Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;"
        }
    .end annotation

    .line 2
    invoke-super {p0, p1}, Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;->setIssuers(Ljava/util/Collection;)Lcom/google/api/client/auth/openidconnect/IdTokenVerifier$Builder;

    move-result-object p1

    check-cast p1, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;

    return-object p1
.end method

.method public setPublicCertsEncodedUrl(Ljava/lang/String;)Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;
    .locals 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 1
    .line 2
    new-instance v0, Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager$Builder;

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->getTransport()Lcom/google/api/client/http/HttpTransport;

    .line 6
    move-result-object v1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->getJsonFactory()Lcom/google/api/client/json/JsonFactory;

    .line 10
    move-result-object v2

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1, v2}, Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager$Builder;-><init>(Lcom/google/api/client/http/HttpTransport;Lcom/google/api/client/json/JsonFactory;)V

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, p1}, Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager$Builder;->setPublicCertsEncodedUrl(Ljava/lang/String;)Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager$Builder;

    .line 17
    move-result-object p1

    .line 18
    .line 19
    iget-object v0, p0, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->publicKeys:Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;->getClock()Lcom/google/api/client/util/Clock;

    .line 23
    move-result-object v0

    .line 24
    .line 25
    .line 26
    invoke-virtual {p1, v0}, Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager$Builder;->setClock(Lcom/google/api/client/util/Clock;)Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager$Builder;

    .line 27
    move-result-object p1

    .line 28
    .line 29
    .line 30
    invoke-virtual {p1}, Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager$Builder;->build()Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;

    .line 31
    move-result-object p1

    .line 32
    .line 33
    iput-object p1, p0, Lcom/google/api/client/googleapis/auth/oauth2/GoogleIdTokenVerifier$Builder;->publicKeys:Lcom/google/api/client/googleapis/auth/oauth2/GooglePublicKeysManager;

    .line 34
    return-object p0
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
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
.end method
