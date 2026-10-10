.class Lcom/sensorsdata/analytics/android/sdk/encrypt/SARSAEncrypt;
.super Ljava/lang/Object;
.source "SARSAEncrypt.java"

# interfaces
.implements Lcom/sensorsdata/analytics/android/sdk/encrypt/SAEncryptListener;


# instance fields
.field aesKey:[B

.field mEncryptKey:Ljava/lang/String;


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


# virtual methods
.method public asymmetricEncryptType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "RSA"

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
    .line 17
.end method

.method public encryptEvent([B)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/encrypt/SARSAEncrypt;->aesKey:[B

    .line 3
    .line 4
    sget-object v1, Lcom/sensorsdata/analytics/android/sdk/encrypt/SymmetricEncryptMode;->AES:Lcom/sensorsdata/analytics/android/sdk/encrypt/SymmetricEncryptMode;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1, v1}, Lcom/sensorsdata/analytics/android/sdk/encrypt/EncryptUtils;->symmetricEncrypt([B[BLcom/sensorsdata/analytics/android/sdk/encrypt/SymmetricEncryptMode;)Ljava/lang/String;

    .line 8
    move-result-object p1

    .line 9
    return-object p1
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
    .line 25
.end method

.method public encryptSymmetricKeyWithPublicKey(Ljava/lang/String;)Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/encrypt/SARSAEncrypt;->mEncryptKey:Ljava/lang/String;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    :try_start_0
    sget-object v0, Lcom/sensorsdata/analytics/android/sdk/encrypt/SymmetricEncryptMode;->AES:Lcom/sensorsdata/analytics/android/sdk/encrypt/SymmetricEncryptMode;

    .line 7
    .line 8
    .line 9
    invoke-static {v0}, Lcom/sensorsdata/analytics/android/sdk/encrypt/EncryptUtils;->generateSymmetricKey(Lcom/sensorsdata/analytics/android/sdk/encrypt/SymmetricEncryptMode;)[B

    .line 10
    move-result-object v0

    .line 11
    .line 12
    iput-object v0, p0, Lcom/sensorsdata/analytics/android/sdk/encrypt/SARSAEncrypt;->aesKey:[B

    .line 13
    .line 14
    const-string v1, "RSA"

    .line 15
    .line 16
    .line 17
    invoke-static {p1, v0, v1}, Lcom/sensorsdata/analytics/android/sdk/encrypt/EncryptUtils;->encryptAESKey(Ljava/lang/String;[BLjava/lang/String;)Ljava/lang/String;

    .line 18
    move-result-object p1

    .line 19
    .line 20
    iput-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/encrypt/SARSAEncrypt;->mEncryptKey:Ljava/lang/String;
    :try_end_0
    .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 .. :try_end_0} :catch_0

    .line 21
    goto :goto_0

    .line 22
    :catch_0
    move-exception p1

    .line 23
    .line 24
    .line 25
    invoke-static {p1}, Lcom/sensorsdata/analytics/android/sdk/SALog;->printStackTrace(Ljava/lang/Exception;)V

    .line 26
    const/4 p1, 0x0

    .line 27
    return-object p1

    .line 28
    .line 29
    :cond_0
    :goto_0
    iget-object p1, p0, Lcom/sensorsdata/analytics/android/sdk/encrypt/SARSAEncrypt;->mEncryptKey:Ljava/lang/String;

    .line 30
    return-object p1
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

.method public symmetricEncryptType()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    const-string v0, "AES"

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
    .line 17
.end method
