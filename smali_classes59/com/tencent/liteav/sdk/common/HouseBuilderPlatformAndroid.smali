.class public Lcom/tencent/liteav/sdk/common/HouseBuilderPlatformAndroid;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lcom/tencent/liteav/base/annotations/JNINamespace;
    value = "liteav::house"
.end annotation


# static fields
.field private static final ALGORITHM_AES:Ljava/lang/String; = "AES"

.field private static final ALGORITHM_AES_CBC_PKCS5PADDING:Ljava/lang/String; = "AES/CBC/PKCS5Padding"

.field private static final ALGORITHM_RSA:Ljava/lang/String; = "RSA"

.field private static final ALGORITHM_SHA256WITH_RSA:Ljava/lang/String; = "SHA256WithRSA"

.field private static final TAG:Ljava/lang/String; = "HouseBuilderPlatformAndroid"


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
.end method

.method public static decryptHouse([B[B[B)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz p0, :cond_1

    .line 6
    array-length v2, p0

    .line 7
    .line 8
    if-eqz v2, :cond_1

    .line 9
    .line 10
    if-eqz p1, :cond_1

    .line 11
    array-length v2, p1

    .line 12
    .line 13
    if-eqz v2, :cond_1

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    array-length v2, p2

    .line 17
    .line 18
    if-nez v2, :cond_0

    .line 19
    goto :goto_0

    .line 20
    .line 21
    :cond_0
    new-instance v2, Ljavax/crypto/spec/SecretKeySpec;

    .line 22
    .line 23
    const-string v3, "AES"

    .line 24
    .line 25
    .line 26
    invoke-direct {v2, p1, v3}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V

    .line 27
    .line 28
    new-instance p1, Ljavax/crypto/spec/IvParameterSpec;

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    .line 32
    .line 33
    :try_start_0
    const-string p2, "AES/CBC/PKCS5Padding"

    .line 34
    .line 35
    .line 36
    invoke-static {p2}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 37
    move-result-object p2

    .line 38
    const/4 v3, 0x2

    .line 39
    .line 40
    .line 41
    invoke-virtual {p2, v3, v2, p1}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 42
    .line 43
    .line 44
    invoke-static {p0, v1}, Landroid/util/Base64;->decode([BI)[B

    .line 45
    move-result-object p0

    .line 46
    .line 47
    .line 48
    invoke-virtual {p2, p0}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 49
    move-result-object p0

    .line 50
    .line 51
    new-instance p1, Ljava/lang/String;

    .line 52
    .line 53
    .line 54
    invoke-direct {p1, p0}, Ljava/lang/String;-><init>([B)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 55
    return-object p1

    .line 56
    :catch_0
    move-exception p0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 60
    return-object v0

    .line 61
    .line 62
    :cond_1
    :goto_0
    const-string p0, "decryptHouse: invalid parameter."

    .line 63
    .line 64
    new-array p1, v1, [Ljava/lang/Object;

    .line 65
    .line 66
    const-string p2, "HouseBuilderPlatformAndroid"

    .line 67
    .line 68
    .line 69
    invoke-static {p2, p0, p1}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 70
    return-object v0
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

.method public static getPackageFile(Ljava/lang/String;)Ljava/lang/String;
    .locals 4

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    :try_start_0
    invoke-static {}, Lcom/tencent/liteav/base/ContextUtils;->getApplicationContext()Landroid/content/Context;

    .line 7
    move-result-object v2

    .line 8
    .line 9
    .line 10
    invoke-virtual {v2}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;

    .line 11
    move-result-object v2

    .line 12
    .line 13
    .line 14
    invoke-virtual {v2, p0}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;

    .line 15
    move-result-object v1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    .line 19
    move-result p0

    .line 20
    .line 21
    new-array p0, p0, [B

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1, p0}, Ljava/io/InputStream;->read([B)I

    .line 25
    move-result v2
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_2
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 26
    .line 27
    if-gtz v2, :cond_0

    .line 28
    .line 29
    .line 30
    :try_start_1
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0

    .line 31
    :catch_0
    return-object v0

    .line 32
    .line 33
    .line 34
    :cond_0
    :try_start_2
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V

    .line 35
    .line 36
    new-instance v2, Ljava/lang/String;

    .line 37
    .line 38
    .line 39
    invoke-direct {v2, p0}, Ljava/lang/String;-><init>([B)V
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 40
    .line 41
    .line 42
    :try_start_3
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_3
    .catch Ljava/io/IOException; {:try_start_3 .. :try_end_3} :catch_1

    .line 43
    :catch_1
    return-object v2

    .line 44
    :catchall_0
    move-exception p0

    .line 45
    goto :goto_0

    .line 46
    :catch_2
    move-exception p0

    .line 47
    .line 48
    :try_start_4
    const-string v2, "HouseBuilderPlatformAndroid"

    .line 49
    .line 50
    .line 51
    const-string/jumbo v3, "read asset file failed."

    .line 52
    .line 53
    .line 54
    filled-new-array {p0}, [Ljava/lang/Object;

    .line 55
    move-result-object p0

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v3, p0}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_0

    .line 59
    .line 60
    if-eqz v1, :cond_1

    .line 61
    .line 62
    .line 63
    :try_start_5
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_5
    .catch Ljava/io/IOException; {:try_start_5 .. :try_end_5} :catch_3

    .line 64
    :catch_3
    :cond_1
    return-object v0

    .line 65
    .line 66
    :goto_0
    if-eqz v1, :cond_2

    .line 67
    .line 68
    .line 69
    :try_start_6
    invoke-virtual {v1}, Ljava/io/InputStream;->close()V
    :try_end_6
    .catch Ljava/io/IOException; {:try_start_6 .. :try_end_6} :catch_4

    .line 70
    :catch_4
    :cond_2
    throw p0
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

.method public static verifyHouse([B[B[B)Z
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p0, :cond_1

    .line 4
    array-length v1, p0

    .line 5
    .line 6
    if-eqz v1, :cond_1

    .line 7
    .line 8
    if-eqz p1, :cond_1

    .line 9
    array-length v1, p1

    .line 10
    .line 11
    if-eqz v1, :cond_1

    .line 12
    .line 13
    if-eqz p2, :cond_1

    .line 14
    array-length v1, p2

    .line 15
    .line 16
    if-nez v1, :cond_0

    .line 17
    goto :goto_1

    .line 18
    .line 19
    :cond_0
    :try_start_0
    new-instance v1, Ljava/security/spec/X509EncodedKeySpec;

    .line 20
    .line 21
    .line 22
    invoke-static {p2, v0}, Landroid/util/Base64;->decode([BI)[B

    .line 23
    move-result-object p2

    .line 24
    .line 25
    .line 26
    invoke-direct {v1, p2}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 27
    .line 28
    const-string p2, "RSA"

    .line 29
    .line 30
    .line 31
    invoke-static {p2}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 32
    move-result-object p2

    .line 33
    .line 34
    .line 35
    invoke-virtual {p2, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 36
    move-result-object p2

    .line 37
    .line 38
    const-string v1, "SHA256WithRSA"

    .line 39
    .line 40
    .line 41
    invoke-static {v1}, Ljava/security/Signature;->getInstance(Ljava/lang/String;)Ljava/security/Signature;

    .line 42
    move-result-object v1

    .line 43
    .line 44
    .line 45
    invoke-virtual {v1, p2}, Ljava/security/Signature;->initVerify(Ljava/security/PublicKey;)V

    .line 46
    .line 47
    .line 48
    invoke-static {p0, v0}, Landroid/util/Base64;->decode([BI)[B

    .line 49
    move-result-object p0

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, p0}, Ljava/security/Signature;->update([B)V

    .line 53
    .line 54
    .line 55
    invoke-static {p1, v0}, Landroid/util/Base64;->decode([BI)[B

    .line 56
    move-result-object p0

    .line 57
    .line 58
    .line 59
    invoke-virtual {v1, p0}, Ljava/security/Signature;->verify([B)Z

    .line 60
    move-result p0
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_3
    .catch Ljava/security/spec/InvalidKeySpecException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/security/InvalidKeyException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/security/SignatureException; {:try_start_0 .. :try_end_0} :catch_0

    .line 61
    return p0

    .line 62
    :catch_0
    move-exception p0

    .line 63
    goto :goto_0

    .line 64
    :catch_1
    move-exception p0

    .line 65
    goto :goto_0

    .line 66
    :catch_2
    move-exception p0

    .line 67
    goto :goto_0

    .line 68
    :catch_3
    move-exception p0

    .line 69
    .line 70
    .line 71
    :goto_0
    invoke-virtual {p0}, Ljava/lang/Throwable;->printStackTrace()V

    .line 72
    return v0

    .line 73
    .line 74
    .line 75
    :cond_1
    :goto_1
    const-string/jumbo p0, "verifyHouse: invalid parameter."

    .line 76
    .line 77
    new-array p1, v0, [Ljava/lang/Object;

    .line 78
    .line 79
    const-string p2, "HouseBuilderPlatformAndroid"

    .line 80
    .line 81
    .line 82
    invoke-static {p2, p0, p1}, Lcom/tencent/liteav/base/Log;->w(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    .line 83
    return v0
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
