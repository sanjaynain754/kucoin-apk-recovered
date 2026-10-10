.class public final Lcom/jumio/core/network/AWSTrustManager;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/jumio/core/network/TrustManagerInterface;


# annotations
.annotation build Landroid/annotation/SuppressLint;
    value = {
        "CustomX509TrustManager"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\n\u0002\u0010\u0011\n\u0002\u0010\u0012\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000b\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J#\u0010\u0017\u001a\u00020\u00182\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\u001b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0002\u0010\u001cJ#\u0010\u001d\u001a\u00020\u00182\u000c\u0010\u0019\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u00142\u0006\u0010\u001b\u001a\u00020\u0007H\u0016\u00a2\u0006\u0002\u0010\u001cJ\u001b\u0010\u001e\u001a\u00020\u00182\u000c\u0010\u001f\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0014H\u0002\u00a2\u0006\u0002\u0010 J\u0010\u0010!\u001a\u00020\u00182\u0006\u0010\"\u001a\u00020\u001aH\u0002J\u0013\u0010#\u001a\u0008\u0012\u0004\u0012\u00020\u001a0\u0014H\u0016\u00a2\u0006\u0002\u0010$R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u0008\u0010\t\"\u0004\u0008\n\u0010\u000bR \u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\rX\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010\"\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004\u00a2\u0006\u0004\n\u0002\u0010\u0016\u00a8\u0006%"
    }
    d2 = {
        "Lcom/jumio/core/network/AWSTrustManager;",
        "Lcom/jumio/core/network/TrustManagerInterface;",
        "<init>",
        "()V",
        "defaultTrustManager",
        "Ljavax/net/ssl/X509TrustManager;",
        "hostname",
        "",
        "getHostname",
        "()Ljava/lang/String;",
        "setHostname",
        "(Ljava/lang/String;)V",
        "keyPinning",
        "Lkotlin/Function0;",
        "",
        "getKeyPinning",
        "()Lkotlin/jvm/functions/Function0;",
        "setKeyPinning",
        "(Lkotlin/jvm/functions/Function0;)V",
        "awsRootPins",
        "",
        "",
        "[[B",
        "checkServerTrusted",
        "",
        "chain",
        "Ljava/security/cert/X509Certificate;",
        "authType",
        "([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V",
        "checkClientTrusted",
        "checkCertificateChain",
        "x509Certificates",
        "([Ljava/security/cert/X509Certificate;)V",
        "checkCertificate",
        "x509Certificate",
        "getAcceptedIssuers",
        "()[Ljava/security/cert/X509Certificate;",
        "jumio-core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x2,
        0x0
    }
    xi = 0x30
.end annotation

.annotation build Lkotlin/jvm/internal/SourceDebugExtension;
    value = {
        "SMAP\nAWSTrustManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AWSTrustManager.kt\ncom/jumio/core/network/AWSTrustManager\n+ 2 _Arrays.kt\nkotlin/collections/ArraysKt___ArraysKt\n+ 3 _Strings.kt\nkotlin/text/StringsKt___StringsKt\n*L\n1#1,92:1\n12567#2,2:93\n488#3,11:95\n*S KotlinDebug\n*F\n+ 1 AWSTrustManager.kt\ncom/jumio/core/network/AWSTrustManager\n*L\n63#1:93,2\n66#1:95,11\n*E\n"
    }
.end annotation


# instance fields
.field public final a:Ljavax/net/ssl/X509TrustManager;

.field public b:Ljava/lang/String;

.field public c:Lkotlin/jvm/functions/Function0;

.field public final d:[[B


# direct methods
.method public constructor <init>()V
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, ""

    .line 6
    .line 7
    iput-object v0, p0, Lcom/jumio/core/network/AWSTrustManager;->b:Ljava/lang/String;

    .line 8
    .line 9
    new-instance v0, Lt9/a;

    .line 10
    .line 11
    .line 12
    invoke-direct {v0}, Lt9/a;-><init>()V

    .line 13
    .line 14
    iput-object v0, p0, Lcom/jumio/core/network/AWSTrustManager;->c:Lkotlin/jvm/functions/Function0;

    .line 15
    .line 16
    const-string v0, "fbe3018031f9586bcbf41727e417b7d1c45c2f47f93be372a17b96b50757d5a2"

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Ljumio/core/Q3;->a(Ljava/lang/String;)[B

    .line 20
    move-result-object v0

    .line 21
    .line 22
    const-string v1, "7f4296fc5b6a4e3b35d3c369623e364ab1af381d8fa7121533c9d6c633ea2461"

    .line 23
    .line 24
    .line 25
    invoke-static {v1}, Ljumio/core/Q3;->a(Ljava/lang/String;)[B

    .line 26
    move-result-object v1

    .line 27
    .line 28
    const-string v2, "36abc32656acfc645c61b71613c4bf21c787f5cabbee48348d58597803d7abc9"

    .line 29
    .line 30
    .line 31
    invoke-static {v2}, Ljumio/core/Q3;->a(Ljava/lang/String;)[B

    .line 32
    move-result-object v2

    .line 33
    .line 34
    const-string v3, "f7ecded5c66047d28ed6466b543c40e0743abe81d109254dcf845d4c2c7853c5"

    .line 35
    .line 36
    .line 37
    invoke-static {v3}, Ljumio/core/Q3;->a(Ljava/lang/String;)[B

    .line 38
    move-result-object v3

    .line 39
    .line 40
    const-string v4, "2b071c59a0a0ae76b0eadb2bad23bad4580b69c3601b630c2eaf0613afa83f92"

    .line 41
    .line 42
    .line 43
    invoke-static {v4}, Ljumio/core/Q3;->a(Ljava/lang/String;)[B

    .line 44
    move-result-object v4

    .line 45
    .line 46
    .line 47
    filled-new-array {v0, v1, v2, v3, v4}, [[B

    .line 48
    move-result-object v0

    .line 49
    .line 50
    iput-object v0, p0, Lcom/jumio/core/network/AWSTrustManager;->d:[[B

    .line 51
    .line 52
    .line 53
    invoke-static {}, Ljavax/net/ssl/TrustManagerFactory;->getDefaultAlgorithm()Ljava/lang/String;

    .line 54
    move-result-object v0

    .line 55
    .line 56
    .line 57
    invoke-static {v0}, Ljavax/net/ssl/TrustManagerFactory;->getInstance(Ljava/lang/String;)Ljavax/net/ssl/TrustManagerFactory;

    .line 58
    move-result-object v0

    .line 59
    const/4 v1, 0x0

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0, v1}, Ljavax/net/ssl/TrustManagerFactory;->init(Ljava/security/KeyStore;)V

    .line 63
    .line 64
    .line 65
    invoke-virtual {v0}, Ljavax/net/ssl/TrustManagerFactory;->getTrustManagers()[Ljavax/net/ssl/TrustManager;

    .line 66
    move-result-object v0

    .line 67
    const/4 v1, 0x0

    .line 68
    .line 69
    aget-object v0, v0, v1

    .line 70
    .line 71
    const-string v1, "null cannot be cast to non-null type javax.net.ssl.X509TrustManager"

    .line 72
    .line 73
    .line 74
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNull(Ljava/lang/Object;Ljava/lang/String;)V

    .line 75
    .line 76
    check-cast v0, Ljavax/net/ssl/X509TrustManager;

    .line 77
    .line 78
    iput-object v0, p0, Lcom/jumio/core/network/AWSTrustManager;->a:Ljavax/net/ssl/X509TrustManager;

    .line 79
    return-void
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
.end method

.method public static final a()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method


# virtual methods
.method public checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 1
    .param p1    # [Ljava/security/cert/X509Certificate;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "chain"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "authType"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    .line 12
    iget-object v0, p0, Lcom/jumio/core/network/AWSTrustManager;->a:Ljavax/net/ssl/X509TrustManager;

    .line 13
    .line 14
    .line 15
    invoke-interface {v0, p1, p2}, Ljavax/net/ssl/X509TrustManager;->checkClientTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V

    .line 16
    return-void
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
.end method

.method public checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;)V
    .locals 7
    .param p1    # [Ljava/security/cert/X509Certificate;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p2    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/security/cert/CertificateException;
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "chain"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    const-string v0, "authType"

    .line 8
    .line 9
    .line 10
    invoke-static {p2, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 11
    array-length v0, p1

    .line 12
    const/4 v1, 0x2

    .line 13
    .line 14
    if-lt v0, v1, :cond_6

    .line 15
    .line 16
    new-instance v0, Landroid/net/http/X509TrustManagerExtensions;

    .line 17
    .line 18
    iget-object v1, p0, Lcom/jumio/core/network/AWSTrustManager;->a:Ljavax/net/ssl/X509TrustManager;

    .line 19
    .line 20
    .line 21
    invoke-direct {v0, v1}, Landroid/net/http/X509TrustManagerExtensions;-><init>(Ljavax/net/ssl/X509TrustManager;)V

    .line 22
    .line 23
    .line 24
    invoke-virtual {p0}, Lcom/jumio/core/network/AWSTrustManager;->getHostname()Ljava/lang/String;

    .line 25
    move-result-object v1

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p1, p2, v1}, Landroid/net/http/X509TrustManagerExtensions;->checkServerTrusted([Ljava/security/cert/X509Certificate;Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    .line 29
    .line 30
    .line 31
    invoke-virtual {p0}, Lcom/jumio/core/network/AWSTrustManager;->getKeyPinning()Lkotlin/jvm/functions/Function0;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-interface {p2}, Lkotlin/jvm/functions/Function0;->invoke()Ljava/lang/Object;

    .line 36
    move-result-object p2

    .line 37
    .line 38
    check-cast p2, Ljava/lang/Boolean;

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    .line 42
    move-result p2

    .line 43
    .line 44
    if-eqz p2, :cond_5

    .line 45
    array-length p2, p1

    .line 46
    const/4 v0, 0x1

    .line 47
    sub-int/2addr p2, v0

    .line 48
    .line 49
    aget-object p2, p1, p2

    .line 50
    .line 51
    const-string v1, "SHA-256"

    .line 52
    .line 53
    .line 54
    invoke-static {v1}, Ljava/security/MessageDigest;->getInstance(Ljava/lang/String;)Ljava/security/MessageDigest;

    .line 55
    move-result-object v1

    .line 56
    .line 57
    .line 58
    invoke-virtual {p2}, Ljava/security/cert/Certificate;->getPublicKey()Ljava/security/PublicKey;

    .line 59
    move-result-object p2

    .line 60
    .line 61
    .line 62
    invoke-interface {p2}, Ljava/security/Key;->getEncoded()[B

    .line 63
    move-result-object p2

    .line 64
    .line 65
    .line 66
    invoke-virtual {v1, p2}, Ljava/security/MessageDigest;->digest([B)[B

    .line 67
    move-result-object p2

    .line 68
    .line 69
    iget-object v1, p0, Lcom/jumio/core/network/AWSTrustManager;->d:[[B

    .line 70
    array-length v2, v1

    .line 71
    const/4 v3, 0x0

    .line 72
    move v4, v3

    .line 73
    .line 74
    :goto_0
    const-string v5, "Certificate pinning failed"

    .line 75
    .line 76
    if-ge v4, v2, :cond_4

    .line 77
    .line 78
    aget-object v6, v1, v4

    .line 79
    .line 80
    .line 81
    invoke-static {p2, v6}, Ljava/security/MessageDigest;->isEqual([B[B)Z

    .line 82
    move-result v6

    .line 83
    .line 84
    if-eqz v6, :cond_3

    .line 85
    .line 86
    aget-object p1, p1, v3

    .line 87
    .line 88
    .line 89
    :try_start_0
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->checkValidity()V
    :try_end_0
    .catch Ljava/security/cert/CertificateNotYetValidException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 90
    goto :goto_1

    .line 91
    :catch_0
    move-exception p1

    .line 92
    goto :goto_3

    .line 93
    :catch_1
    move-exception p2

    .line 94
    .line 95
    :try_start_1
    const-string v1, "JumioTrustManager"

    .line 96
    .line 97
    const-string v2, "SSL Certificate is not yet valid"

    .line 98
    .line 99
    .line 100
    invoke-static {v1, v2, p2}, Lcom/jumio/commons/log/Log;->w(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    .line 101
    .line 102
    .line 103
    :goto_1
    invoke-virtual {p1}, Ljava/security/cert/X509Certificate;->getSubjectDN()Ljava/security/Principal;

    .line 104
    move-result-object p1

    .line 105
    .line 106
    .line 107
    invoke-interface {p1}, Ljava/security/Principal;->getName()Ljava/lang/String;

    .line 108
    move-result-object p1

    .line 109
    .line 110
    const-string p2, "getName(...)"

    .line 111
    .line 112
    .line 113
    invoke-static {p1, p2}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 114
    .line 115
    new-instance p2, Ljava/lang/StringBuilder;

    .line 116
    .line 117
    .line 118
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 119
    .line 120
    .line 121
    :goto_2
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 122
    move-result v1

    .line 123
    .line 124
    if-ge v3, v1, :cond_1

    .line 125
    .line 126
    .line 127
    invoke-virtual {p1, v3}, Ljava/lang/String;->charAt(I)C

    .line 128
    move-result v1

    .line 129
    .line 130
    .line 131
    invoke-static {v1}, Lkotlin/text/CharsKt;->isWhitespace(C)Z

    .line 132
    move-result v2

    .line 133
    .line 134
    if-nez v2, :cond_0

    .line 135
    .line 136
    .line 137
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/Appendable;

    .line 138
    .line 139
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 140
    goto :goto_2

    .line 141
    .line 142
    .line 143
    :cond_1
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 144
    move-result-object p1

    .line 145
    .line 146
    new-instance p2, Ljava/lang/StringBuilder;

    .line 147
    .line 148
    const-string v1, "CN="

    .line 149
    .line 150
    .line 151
    invoke-direct {p2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 152
    .line 153
    .line 154
    invoke-virtual {p0}, Lcom/jumio/core/network/AWSTrustManager;->getHostname()Ljava/lang/String;

    .line 155
    move-result-object v1

    .line 156
    .line 157
    .line 158
    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 159
    .line 160
    .line 161
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 162
    move-result-object p2

    .line 163
    .line 164
    .line 165
    invoke-static {p1, p2, v0}, Lkotlin/text/StringsKt;->contains(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    .line 166
    move-result p1

    .line 167
    .line 168
    if-eqz p1, :cond_2

    .line 169
    goto :goto_4

    .line 170
    .line 171
    :cond_2
    new-instance p1, Ljava/security/cert/CertificateException;

    .line 172
    .line 173
    .line 174
    invoke-direct {p1, v5}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    .line 175
    throw p1

    .line 176
    .line 177
    :goto_3
    new-instance p2, Ljava/security/cert/CertificateException;

    .line 178
    .line 179
    const-string v0, "SSL Certificate match error"

    .line 180
    .line 181
    .line 182
    invoke-direct {p2, v0, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 183
    throw p2

    .line 184
    .line 185
    :cond_3
    add-int/lit8 v4, v4, 0x1

    .line 186
    goto :goto_0

    .line 187
    .line 188
    :cond_4
    new-instance p1, Ljava/security/cert/CertificateException;

    .line 189
    .line 190
    .line 191
    invoke-direct {p1, v5}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    .line 192
    throw p1

    .line 193
    :cond_5
    :goto_4
    return-void

    .line 194
    .line 195
    :cond_6
    new-instance p1, Ljava/security/cert/CertificateException;

    .line 196
    .line 197
    const-string p2, "SSL Certificate Chain is not sufficient"

    .line 198
    .line 199
    .line 200
    invoke-direct {p1, p2}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    .line 201
    throw p1
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
.end method

.method public getAcceptedIssuers()[Ljava/security/cert/X509Certificate;
    .locals 2
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/network/AWSTrustManager;->a:Ljavax/net/ssl/X509TrustManager;

    .line 3
    .line 4
    .line 5
    invoke-interface {v0}, Ljavax/net/ssl/X509TrustManager;->getAcceptedIssuers()[Ljava/security/cert/X509Certificate;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    const-string v1, "getAcceptedIssuers(...)"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 12
    return-object v0
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getHostname()Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/network/AWSTrustManager;->b:Ljava/lang/String;

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

.method public getKeyPinning()Lkotlin/jvm/functions/Function0;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;"
        }
    .end annotation

    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/core/network/AWSTrustManager;->c:Lkotlin/jvm/functions/Function0;

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

.method public setHostname(Ljava/lang/String;)V
    .locals 1
    .param p1    # Ljava/lang/String;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/core/network/AWSTrustManager;->b:Ljava/lang/String;

    .line 8
    return-void
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

.method public setKeyPinning(Lkotlin/jvm/functions/Function0;)V
    .locals 1
    .param p1    # Lkotlin/jvm/functions/Function0;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function0<",
            "Ljava/lang/Boolean;",
            ">;)V"
        }
    .end annotation

    .line 1
    .line 2
    const-string v0, "<set-?>"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    iput-object p1, p0, Lcom/jumio/core/network/AWSTrustManager;->c:Lkotlin/jvm/functions/Function0;

    .line 8
    return-void
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
