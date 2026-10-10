.class public final Lcom/tencent/bugly/common/reporter/upload/EncryptionUtil;
.super Ljava/lang/Object;
.source "BUGLY"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\u0008\u0003\u0008\u00c6\u0002\u0018\u00002\u00020\u0001B\u0007\u0008\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0007\u001a\u00020\u00082\u0006\u0010\t\u001a\u00020\u0008J\u0008\u0010\n\u001a\u00020\u0004H\u0002R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/tencent/bugly/common/reporter/upload/EncryptionUtil;",
        "",
        "()V",
        "publicKey",
        "Ljava/security/PublicKey;",
        "publicKeyText",
        "",
        "encryptData",
        "",
        "data",
        "generatePublicKey",
        "bugly-pro_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x6,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final INSTANCE:Lcom/tencent/bugly/common/reporter/upload/EncryptionUtil;
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field

.field private static publicKey:Ljava/security/PublicKey; = null
    .annotation build Lorg/jetbrains/annotations/Nullable;
    .end annotation
.end field

.field private static final publicKeyText:Ljava/lang/String; = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA68geFnp46/efYc9WoheJGk9CkL80BGx1ICZ2fmSb/z6ygAhgiNS9d/zjS2Xa1ZN1HIRoh31y2fYn5kTEmkVqyxvFyy/npNdhEbl8N56F10B6p7b8DdAD3Mt8kydC6aXi2aTU+TBQ6XDvfHPLaLPDzaFm0Szs2Dsg9y7F6fh70pOn5A+zfV+/RsSLkgRNV0KALfKPNXvqGMeKaWFNZRdHARIAy4nQ8lH8TxHC43nR0Vjb/bsU1pcifyeaDu6+i29wwvyl5ygfSVRCdHXFzT2a3IOdEoLsUODIACzN2iYEf+y6Mujy4BKARb6rw9Mdd3JUiMn6rIy2wfPqvif3TbBxnwIDAQAB"
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation
.end field


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/tencent/bugly/common/reporter/upload/EncryptionUtil;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/tencent/bugly/common/reporter/upload/EncryptionUtil;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/tencent/bugly/common/reporter/upload/EncryptionUtil;->INSTANCE:Lcom/tencent/bugly/common/reporter/upload/EncryptionUtil;

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
.end method

.method private constructor <init>()V
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

.method private final generatePublicKey()Ljava/security/PublicKey;
    .locals 2

    .line 1
    .line 2
    const-string v0, "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEA68geFnp46/efYc9WoheJGk9CkL80BGx1ICZ2fmSb/z6ygAhgiNS9d/zjS2Xa1ZN1HIRoh31y2fYn5kTEmkVqyxvFyy/npNdhEbl8N56F10B6p7b8DdAD3Mt8kydC6aXi2aTU+TBQ6XDvfHPLaLPDzaFm0Szs2Dsg9y7F6fh70pOn5A+zfV+/RsSLkgRNV0KALfKPNXvqGMeKaWFNZRdHARIAy4nQ8lH8TxHC43nR0Vjb/bsU1pcifyeaDu6+i29wwvyl5ygfSVRCdHXFzT2a3IOdEoLsUODIACzN2iYEf+y6Mujy4BKARb6rw9Mdd3JUiMn6rIy2wfPqvif3TbBxnwIDAQAB"

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    .line 6
    invoke-static {v0, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    .line 7
    move-result-object v0

    .line 8
    .line 9
    new-instance v1, Ljava/security/spec/X509EncodedKeySpec;

    .line 10
    .line 11
    .line 12
    invoke-direct {v1, v0}, Ljava/security/spec/X509EncodedKeySpec;-><init>([B)V

    .line 13
    .line 14
    const-string v0, "RSA"

    .line 15
    .line 16
    .line 17
    invoke-static {v0}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    .line 18
    move-result-object v0

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    .line 22
    move-result-object v0

    .line 23
    .line 24
    const-string v1, "keyFactory.generatePublic(keySpec)"

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v1}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 28
    return-object v0
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
.end method


# virtual methods
.method public final encryptData([B)[B
    .locals 7
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    .line 2
    const-string v0, "data"

    .line 3
    .line 4
    .line 5
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullParameter(Ljava/lang/Object;Ljava/lang/String;)V

    .line 6
    .line 7
    sget-object v0, Lcom/tencent/bugly/common/reporter/upload/EncryptionUtil;->publicKey:Ljava/security/PublicKey;

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-direct {p0}, Lcom/tencent/bugly/common/reporter/upload/EncryptionUtil;->generatePublicKey()Ljava/security/PublicKey;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    sput-object v0, Lcom/tencent/bugly/common/reporter/upload/EncryptionUtil;->publicKey:Ljava/security/PublicKey;

    .line 16
    .line 17
    :cond_0
    const-string v0, "RSA/ECB/OAEPPadding"

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sget-object v1, Lcom/tencent/bugly/common/reporter/upload/EncryptionUtil;->publicKey:Ljava/security/PublicKey;

    .line 24
    .line 25
    new-instance v2, Ljavax/crypto/spec/OAEPParameterSpec;

    .line 26
    .line 27
    sget-object v3, Ljava/security/spec/MGF1ParameterSpec;->SHA256:Ljava/security/spec/MGF1ParameterSpec;

    .line 28
    .line 29
    sget-object v4, Ljavax/crypto/spec/PSource$PSpecified;->DEFAULT:Ljavax/crypto/spec/PSource$PSpecified;

    .line 30
    .line 31
    const-string v5, "SHA-256"

    .line 32
    .line 33
    const-string v6, "MGF1"

    .line 34
    .line 35
    .line 36
    invoke-direct {v2, v5, v6, v3, v4}, Ljavax/crypto/spec/OAEPParameterSpec;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/security/spec/AlgorithmParameterSpec;Ljavax/crypto/spec/PSource;)V

    .line 37
    const/4 v3, 0x1

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, v3, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 41
    .line 42
    .line 43
    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    .line 44
    move-result-object p1

    .line 45
    .line 46
    const-string v0, "cipher.doFinal(data)"

    .line 47
    .line 48
    .line 49
    invoke-static {p1, v0}, Lkotlin/jvm/internal/Intrinsics;->checkNotNullExpressionValue(Ljava/lang/Object;Ljava/lang/String;)V

    .line 50
    return-object p1
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
