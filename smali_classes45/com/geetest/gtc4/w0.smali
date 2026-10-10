.class public final Lcom/geetest/gtc4/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Z


# direct methods
.method public constructor <init>(Landroid/content/pm/PackageManager;)V
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 6
    .line 7
    const/16 v1, 0x1c

    .line 8
    .line 9
    if-lt v0, v1, :cond_0

    .line 10
    .line 11
    const-string v0, "android.hardware.strongbox_keystore"

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z

    .line 15
    move-result p1

    .line 16
    .line 17
    if-eqz p1, :cond_0

    .line 18
    const/4 p1, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_0
    const/4 p1, 0x0

    .line 21
    .line 22
    :goto_0
    iput-boolean p1, p0, Lcom/geetest/gtc4/w0;->a:Z

    .line 23
    return-void
.end method

.method public static a(Ljava/lang/String;Z)Lcom/geetest/gtc4/z0;
    .locals 8

    const-string v0, ""

    const/4 v1, -0x2

    .line 17
    :try_start_0
    invoke-static {p0, p1}, Lcom/geetest/gtc4/w0;->b(Ljava/lang/String;Z)V

    .line 18
    const-string p1, "AndroidKeyStore"

    invoke-static {p1}, Ljava/security/KeyStore;->getInstance(Ljava/lang/String;)Ljava/security/KeyStore;

    move-result-object p1

    const/4 v2, 0x0

    .line 19
    invoke-virtual {p1, v2}, Ljava/security/KeyStore;->load(Ljava/security/KeyStore$LoadStoreParameter;)V

    .line 20
    invoke-virtual {p1, p0}, Ljava/security/KeyStore;->getCertificateChain(Ljava/lang/String;)[Ljava/security/cert/Certificate;

    move-result-object p0

    if-eqz p0, :cond_7

    .line 21
    new-instance p1, Ljava/util/ArrayList;

    array-length v3, p0

    invoke-direct {p1, v3}, Ljava/util/ArrayList;-><init>(I)V

    .line 22
    const-string v3, "X.509"

    invoke-static {v3}, Ljava/security/cert/CertificateFactory;->getInstance(Ljava/lang/String;)Ljava/security/cert/CertificateFactory;

    move-result-object v3

    .line 23
    array-length v4, p0

    const/4 v5, 0x0

    :goto_0
    if-ge v5, v4, :cond_0

    aget-object v6, p0, v5

    .line 24
    new-instance v7, Ljava/io/ByteArrayInputStream;

    invoke-virtual {v6}, Ljava/security/cert/Certificate;->getEncoded()[B

    move-result-object v6

    invoke-direct {v7, v6}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    .line 25
    invoke-virtual {v3, v7}, Ljava/security/cert/CertificateFactory;->generateCertificate(Ljava/io/InputStream;)Ljava/security/cert/Certificate;

    move-result-object v6

    invoke-virtual {p1, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
    :try_end_0
    .catch Ljava/security/ProviderException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    goto/16 :goto_7

    :catch_1
    move-exception p0

    goto/16 :goto_8

    .line 26
    :cond_0
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    .line 27
    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_1
    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/security/cert/Certificate;

    .line 28
    instance-of v3, v1, Ljava/security/cert/X509Certificate;

    if-eqz v3, :cond_1

    .line 29
    check-cast v1, Ljava/security/cert/X509Certificate;

    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    .line 30
    :cond_2
    :try_start_1
    invoke-static {p0}, Lcom/geetest/gtc4/v7;->a(Ljava/util/ArrayList;)I

    move-result p1
    :try_end_1
    .catch Ljava/security/GeneralSecurityException; {:try_start_1 .. :try_end_1} :catch_2

    .line 31
    :try_start_2
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 32
    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_3

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/cert/X509Certificate;

    .line 33
    invoke-virtual {v4}, Ljava/security/cert/X509Certificate;->getSerialNumber()Ljava/math/BigInteger;

    move-result-object v4

    const/16 v5, 0x10

    invoke-virtual {v4, v5}, Ljava/math/BigInteger;->toString(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    move-result-object v4

    .line 34
    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    .line 35
    :cond_3
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    const-string v3, " "

    .line 36
    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "["

    .line 37
    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v1

    const-string v3, "]"

    .line 38
    invoke-virtual {v1, v3, v0}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;

    move-result-object v0
    :try_end_2
    .catch Ljava/security/GeneralSecurityException; {:try_start_2 .. :try_end_2} :catch_3

    goto :goto_3

    :catch_2
    const/4 p1, -0x1

    :catch_3
    move-object v0, v2

    .line 39
    :goto_3
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    move-object v3, v2

    :goto_4
    if-ltz v1, :cond_4

    .line 40
    :try_start_3
    invoke-virtual {p0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/security/cert/X509Certificate;

    invoke-static {v4}, Lcom/geetest/gtc4/t0;->a(Ljava/security/cert/X509Certificate;)Lcom/geetest/gtc4/t0;

    move-result-object v2
    :try_end_3
    .catch Ljava/security/cert/CertificateParsingException; {:try_start_3 .. :try_end_3} :catch_4

    goto :goto_5

    :catch_4
    move-exception v3

    .line 41
    new-instance v4, Lcom/geetest/gtc4/x0;

    const/4 v5, -0x4

    invoke-direct {v4, v5, v3}, Lcom/geetest/gtc4/x0;-><init>(ILjava/lang/Throwable;)V

    add-int/lit8 v1, v1, -0x1

    move-object v3, v4

    goto :goto_4

    :cond_4
    :goto_5
    if-nez v2, :cond_6

    if-nez v3, :cond_5

    goto :goto_6

    .line 42
    :cond_5
    throw v3

    .line 43
    :cond_6
    :goto_6
    new-instance p0, Lcom/geetest/gtc4/z0;

    invoke-direct {p0, v2, p1, v0}, Lcom/geetest/gtc4/z0;-><init>(Lcom/geetest/gtc4/t0;ILjava/lang/String;)V

    return-object p0

    .line 44
    :cond_7
    :try_start_4
    new-instance p0, Ljava/security/cert/CertificateException;

    const-string p1, "Unable to get certificate chain"

    invoke-direct {p0, p1}, Ljava/security/cert/CertificateException;-><init>(Ljava/lang/String;)V

    throw p0
    :try_end_4
    .catch Ljava/security/ProviderException; {:try_start_4 .. :try_end_4} :catch_1
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_0

    .line 45
    :goto_7
    new-instance p1, Lcom/geetest/gtc4/x0;

    invoke-direct {p1, v1, p0}, Lcom/geetest/gtc4/x0;-><init>(ILjava/lang/Throwable;)V

    throw p1

    .line 46
    :goto_8
    sget p1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v0, 0x1c

    if-lt p1, v0, :cond_9

    invoke-static {p0}, Lv7/i;->a(Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_8

    goto :goto_9

    .line 47
    :cond_8
    new-instance p1, Lcom/geetest/gtc4/x0;

    const/4 v0, -0x5

    invoke-direct {p1, v0, p0}, Lcom/geetest/gtc4/x0;-><init>(ILjava/lang/Throwable;)V

    throw p1

    .line 48
    :cond_9
    :goto_9
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 49
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_a

    .line 50
    invoke-virtual {p0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p1

    const-string v0, "device ids"

    invoke-virtual {p1, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z

    move-result p1

    if-eqz p1, :cond_a

    .line 51
    new-instance p1, Lcom/geetest/gtc4/x0;

    const/4 v0, -0x6

    invoke-direct {p1, v0, p0}, Lcom/geetest/gtc4/x0;-><init>(ILjava/lang/Throwable;)V

    throw p1

    .line 52
    :cond_a
    new-instance p1, Lcom/geetest/gtc4/x0;

    invoke-direct {p1, v1, p0}, Lcom/geetest/gtc4/x0;-><init>(ILjava/lang/Throwable;)V

    throw p1
.end method

.method public static b(Ljava/lang/String;Z)V
    .locals 9

    .line 1
    .line 2
    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 3
    .line 4
    const-string v1, "EC"

    .line 5
    .line 6
    const-string v2, "AndroidKeyStore"

    .line 7
    .line 8
    .line 9
    invoke-static {v1, v2}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    .line 10
    move-result-object v1

    .line 11
    .line 12
    new-instance v2, Ljava/util/Date;

    .line 13
    .line 14
    .line 15
    invoke-direct {v2}, Ljava/util/Date;-><init>()V

    .line 16
    .line 17
    new-instance v3, Ljava/util/Date;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 21
    move-result-wide v4

    .line 22
    .line 23
    .line 24
    const-wide/32 v6, 0xf4240

    .line 25
    add-long/2addr v4, v6

    .line 26
    .line 27
    .line 28
    invoke-direct {v3, v4, v5}, Ljava/util/Date;-><init>(J)V

    .line 29
    .line 30
    new-instance v4, Ljava/util/Date;

    .line 31
    .line 32
    .line 33
    invoke-virtual {v2}, Ljava/util/Date;->getTime()J

    .line 34
    move-result-wide v5

    .line 35
    .line 36
    .line 37
    const-wide/32 v7, 0x1e8480

    .line 38
    add-long/2addr v5, v7

    .line 39
    .line 40
    .line 41
    invoke-direct {v4, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 42
    .line 43
    new-instance v5, Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 44
    const/4 v6, 0x4

    .line 45
    .line 46
    .line 47
    invoke-direct {v5, p0, v6}, Landroid/security/keystore/KeyGenParameterSpec$Builder;-><init>(Ljava/lang/String;I)V

    .line 48
    .line 49
    new-instance p0, Ljava/security/spec/ECGenParameterSpec;

    .line 50
    .line 51
    .line 52
    const-string/jumbo v6, "secp256r1"

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, v6}, Ljava/security/spec/ECGenParameterSpec;-><init>(Ljava/lang/String;)V

    .line 56
    .line 57
    .line 58
    invoke-virtual {v5, p0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setAlgorithmParameterSpec(Ljava/security/spec/AlgorithmParameterSpec;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 59
    move-result-object p0

    .line 60
    .line 61
    .line 62
    invoke-virtual {p0, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeyValidityStart(Ljava/util/Date;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 63
    move-result-object p0

    .line 64
    .line 65
    .line 66
    invoke-virtual {p0, v3}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeyValidityForOriginationEnd(Ljava/util/Date;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 67
    move-result-object p0

    .line 68
    .line 69
    .line 70
    invoke-virtual {p0, v4}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setKeyValidityForConsumptionEnd(Ljava/util/Date;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 71
    move-result-object p0

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2}, Ljava/util/Date;->toString()Ljava/lang/String;

    .line 75
    move-result-object v2

    .line 76
    .line 77
    sget-object v3, Ljava/nio/charset/StandardCharsets;->UTF_8:Ljava/nio/charset/Charset;

    .line 78
    .line 79
    .line 80
    invoke-virtual {v2, v3}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    .line 81
    move-result-object v2

    .line 82
    .line 83
    .line 84
    invoke-virtual {p0, v2}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setAttestationChallenge([B)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 85
    .line 86
    const/16 p0, 0x1c

    .line 87
    .line 88
    if-lt v0, p0, :cond_0

    .line 89
    .line 90
    if-eqz p1, :cond_0

    .line 91
    const/4 p0, 0x1

    .line 92
    .line 93
    .line 94
    invoke-static {v5, p0}, Lv7/h;->a(Landroid/security/keystore/KeyGenParameterSpec$Builder;Z)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 95
    .line 96
    :cond_0
    const-string p0, "NONE"

    .line 97
    .line 98
    const-string p1, "SHA-256"

    .line 99
    .line 100
    .line 101
    filled-new-array {p0, p1}, [Ljava/lang/String;

    .line 102
    move-result-object p0

    .line 103
    .line 104
    .line 105
    invoke-virtual {v5, p0}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->setDigests([Ljava/lang/String;)Landroid/security/keystore/KeyGenParameterSpec$Builder;

    .line 106
    .line 107
    .line 108
    invoke-virtual {v5}, Landroid/security/keystore/KeyGenParameterSpec$Builder;->build()Landroid/security/keystore/KeyGenParameterSpec;

    .line 109
    move-result-object p0

    .line 110
    .line 111
    .line 112
    invoke-virtual {v1, p0}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    .line 116
    return-void
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
.end method


# virtual methods
.method public final a()Ljava/lang/String;
    .locals 5

    .line 1
    const-string/jumbo v0, "|"

    const-string v1, "com.geetest.gtc4.attestation."

    .line 2
    iget-boolean v2, p0, Lcom/geetest/gtc4/w0;->a:Z

    .line 3
    :try_start_0
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    .line 4
    invoke-static {v1, v2}, Lcom/geetest/gtc4/w0;->a(Ljava/lang/String;Z)Lcom/geetest/gtc4/z0;

    move-result-object v1

    .line 5
    iget-object v2, v1, Lcom/geetest/gtc4/z0;->a:Lcom/geetest/gtc4/t0;

    .line 6
    invoke-virtual {v2}, Lcom/geetest/gtc4/t0;->b()Lcom/geetest/gtc4/r6;

    move-result-object v2

    .line 7
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    iget-boolean v4, v2, Lcom/geetest/gtc4/r6;->b:Z

    if-eqz v4, :cond_0

    .line 9
    const-string v4, "1"

    goto :goto_0

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    const-string v4, "0"

    :goto_0
    invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 10
    iget v2, v2, Lcom/geetest/gtc4/r6;->c:I

    .line 11
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 12
    iget v2, v1, Lcom/geetest/gtc4/z0;->b:I

    .line 13
    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 14
    iget-object v0, v1, Lcom/geetest/gtc4/z0;->c:Ljava/lang/String;

    .line 15
    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0
    :try_end_0
    .catch Lcom/geetest/gtc4/x0; {:try_start_0 .. :try_end_0} :catch_0

    return-object v0

    .line 16
    :goto_1
    invoke-virtual {v0}, Lcom/geetest/gtc4/x0;->getCode()I

    move-result v0

    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
