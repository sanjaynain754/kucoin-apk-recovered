.class public final Lcom/sumsub/sns/internal/features/data/network/prooface/a;
.super Ljava/lang/Object;
.source "r8-map-id-e8070c335b728e491f9067563c2bfcb5588b777f644873c971594ef64ebda208"


# instance fields
.field public final a:Ljava/security/KeyPair;

.field public b:Ljavax/crypto/SecretKey;


# direct methods
.method public constructor <init>()V
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const-string v0, "EC"

    .line 6
    .line 7
    .line 8
    invoke-static {v0}, Ljava/security/KeyPairGenerator;->getInstance(Ljava/lang/String;)Ljava/security/KeyPairGenerator;

    .line 9
    move-result-object v0

    .line 10
    .line 11
    sget-object v1, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->a:Ljava/math/BigInteger;

    .line 12
    .line 13
    new-instance v1, Ljava/security/spec/ECParameterSpec;

    .line 14
    .line 15
    new-instance v2, Ljava/security/spec/EllipticCurve;

    .line 16
    .line 17
    new-instance v3, Ljava/security/spec/ECFieldFp;

    .line 18
    .line 19
    sget-object v4, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->a:Ljava/math/BigInteger;

    .line 20
    .line 21
    .line 22
    invoke-direct {v3, v4}, Ljava/security/spec/ECFieldFp;-><init>(Ljava/math/BigInteger;)V

    .line 23
    .line 24
    sget-object v4, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->c:Ljava/math/BigInteger;

    .line 25
    .line 26
    sget-object v5, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->d:Ljava/math/BigInteger;

    .line 27
    .line 28
    .line 29
    invoke-direct {v2, v3, v4, v5}, Ljava/security/spec/EllipticCurve;-><init>(Ljava/security/spec/ECField;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 30
    .line 31
    new-instance v3, Ljava/security/spec/ECPoint;

    .line 32
    .line 33
    sget-object v4, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->e:Ljava/math/BigInteger;

    .line 34
    .line 35
    sget-object v5, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->f:Ljava/math/BigInteger;

    .line 36
    .line 37
    .line 38
    invoke-direct {v3, v4, v5}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 39
    .line 40
    sget-object v4, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->b:Ljava/math/BigInteger;

    .line 41
    const/4 v5, 0x1

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, v2, v3, v4, v5}, Ljava/security/spec/ECParameterSpec;-><init>(Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;I)V

    .line 45
    .line 46
    .line 47
    invoke-virtual {v0, v1}, Ljava/security/KeyPairGenerator;->initialize(Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 48
    .line 49
    .line 50
    invoke-virtual {v0}, Ljava/security/KeyPairGenerator;->generateKeyPair()Ljava/security/KeyPair;

    .line 51
    move-result-object v0

    .line 52
    .line 53
    iput-object v0, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/a;->a:Ljava/security/KeyPair;

    .line 54
    return-void
    .line 55
    .line 56
    .line 57
.end method


# virtual methods
.method public final a(Ljava/security/PrivateKey;Ljava/security/PublicKey;)Ljavax/crypto/SecretKey;
    .locals 6

    .line 16
    const-string v0, "ECDH"

    invoke-static {v0}, Ljavax/crypto/KeyAgreement;->getInstance(Ljava/lang/String;)Ljavax/crypto/KeyAgreement;

    move-result-object v0

    .line 17
    invoke-virtual {v0, p1}, Ljavax/crypto/KeyAgreement;->init(Ljava/security/Key;)V

    const/4 p1, 0x1

    .line 18
    invoke-virtual {v0, p2, p1}, Ljavax/crypto/KeyAgreement;->doPhase(Ljava/security/Key;Z)Ljava/security/Key;

    .line 19
    const-string p1, "AES"

    invoke-virtual {v0, p1}, Ljavax/crypto/KeyAgreement;->generateSecret(Ljava/lang/String;)Ljavax/crypto/SecretKey;

    move-result-object p1

    .line 20
    sget-object v0, Lcom/sumsub/sns/internal/log/c;->a:Lcom/sumsub/sns/internal/log/c;

    invoke-static {p0}, Lcom/sumsub/sns/internal/log/e;->a(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1}, Ljava/security/Key;->getEncoded()[B

    move-result-object p2

    const/4 v2, 0x2

    invoke-static {p2, v2}, Landroid/util/Base64;->encodeToString([BI)Ljava/lang/String;

    move-result-object p2

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    const-string v3, "Crypto: secret="

    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    const/4 v4, 0x4

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lcom/sumsub/log/logger/Logger$DefaultImpls;->d$default(Lcom/sumsub/log/logger/Logger;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;ILjava/lang/Object;)V

    return-object p1
.end method

.method public final a(Ljava/lang/String;)V
    .locals 9

    .line 1
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/a;->a:Ljava/security/KeyPair;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPrivate()Ljava/security/PrivateKey;

    move-result-object v0

    const/4 v1, 0x2

    .line 2
    invoke-static {p1, v1}, Landroid/util/Base64;->decode(Ljava/lang/String;I)[B

    move-result-object p1

    const/16 v1, 0x20

    .line 3
    new-array v2, v1, [B

    const/4 v3, 0x1

    const/4 v4, 0x0

    .line 4
    invoke-static {p1, v3, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    new-instance v5, Ljava/math/BigInteger;

    invoke-direct {v5, v3, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 6
    new-array v2, v1, [B

    const/16 v6, 0x21

    .line 7
    invoke-static {p1, v6, v2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 8
    new-instance p1, Ljava/math/BigInteger;

    invoke-direct {p1, v3, v2}, Ljava/math/BigInteger;-><init>(I[B)V

    .line 9
    const-string v1, "EC"

    invoke-static {v1}, Ljava/security/KeyFactory;->getInstance(Ljava/lang/String;)Ljava/security/KeyFactory;

    move-result-object v1

    .line 10
    new-instance v2, Ljava/security/spec/ECPublicKeySpec;

    new-instance v4, Ljava/security/spec/ECPoint;

    invoke-direct {v4, v5, p1}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    sget-object p1, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->a:Ljava/math/BigInteger;

    .line 11
    new-instance p1, Ljava/security/spec/ECParameterSpec;

    .line 12
    new-instance v5, Ljava/security/spec/EllipticCurve;

    new-instance v6, Ljava/security/spec/ECFieldFp;

    sget-object v7, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->a:Ljava/math/BigInteger;

    invoke-direct {v6, v7}, Ljava/security/spec/ECFieldFp;-><init>(Ljava/math/BigInteger;)V

    sget-object v7, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->c:Ljava/math/BigInteger;

    sget-object v8, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->d:Ljava/math/BigInteger;

    invoke-direct {v5, v6, v7, v8}, Ljava/security/spec/EllipticCurve;-><init>(Ljava/security/spec/ECField;Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    .line 13
    new-instance v6, Ljava/security/spec/ECPoint;

    sget-object v7, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->e:Ljava/math/BigInteger;

    sget-object v8, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->f:Ljava/math/BigInteger;

    invoke-direct {v6, v7, v8}, Ljava/security/spec/ECPoint;-><init>(Ljava/math/BigInteger;Ljava/math/BigInteger;)V

    sget-object v7, Lcom/sumsub/sns/internal/features/data/network/prooface/p;->b:Ljava/math/BigInteger;

    invoke-direct {p1, v5, v6, v7, v3}, Ljava/security/spec/ECParameterSpec;-><init>(Ljava/security/spec/EllipticCurve;Ljava/security/spec/ECPoint;Ljava/math/BigInteger;I)V

    .line 14
    invoke-direct {v2, v4, p1}, Ljava/security/spec/ECPublicKeySpec;-><init>(Ljava/security/spec/ECPoint;Ljava/security/spec/ECParameterSpec;)V

    invoke-virtual {v1, v2}, Ljava/security/KeyFactory;->generatePublic(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;

    move-result-object p1

    .line 15
    invoke-virtual {p0, v0, p1}, Lcom/sumsub/sns/internal/features/data/network/prooface/a;->a(Ljava/security/PrivateKey;Ljava/security/PublicKey;)Ljavax/crypto/SecretKey;

    move-result-object p1

    iput-object p1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/a;->b:Ljavax/crypto/SecretKey;

    return-void
.end method

.method public final a([B[B)[B
    .locals 4

    .line 21
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/a;->b:Ljavax/crypto/SecretKey;

    if-eqz v0, :cond_0

    .line 22
    const-string v0, "AES/GCM/NoPadding"

    invoke-static {v0}, Ljavax/crypto/Cipher;->getInstance(Ljava/lang/String;)Ljavax/crypto/Cipher;

    move-result-object v0

    .line 23
    iget-object v1, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/a;->b:Ljavax/crypto/SecretKey;

    new-instance v2, Ljavax/crypto/spec/IvParameterSpec;

    invoke-direct {v2, p2}, Ljavax/crypto/spec/IvParameterSpec;-><init>([B)V

    const/4 v3, 0x1

    invoke-virtual {v0, v3, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;Ljava/security/spec/AlgorithmParameterSpec;)V

    .line 24
    invoke-virtual {v0, p1}, Ljavax/crypto/Cipher;->doFinal([B)[B

    move-result-object p1

    .line 25
    iget-object v0, p0, Lcom/sumsub/sns/internal/features/data/network/prooface/a;->a:Ljava/security/KeyPair;

    invoke-virtual {v0}, Ljava/security/KeyPair;->getPublic()Ljava/security/PublicKey;

    move-result-object v0

    invoke-interface {v0}, Ljava/security/Key;->getEncoded()[B

    move-result-object v0

    .line 26
    array-length v1, v0

    add-int/lit8 v1, v1, 0x3

    array-length v2, p2

    add-int/2addr v1, v2

    add-int/lit8 v1, v1, 0x4

    array-length v2, p1

    add-int/2addr v1, v2

    .line 27
    invoke-static {v1}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v1

    const/4 v2, 0x2

    .line 28
    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->put(B)Ljava/nio/ByteBuffer;

    .line 29
    array-length v2, v0

    int-to-short v2, v2

    invoke-virtual {v1, v2}, Ljava/nio/ByteBuffer;->putShort(S)Ljava/nio/ByteBuffer;

    .line 30
    invoke-virtual {v1, v0}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 31
    invoke-virtual {v1, p2}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 32
    array-length p2, p1

    invoke-virtual {v1, p2}, Ljava/nio/ByteBuffer;->putInt(I)Ljava/nio/ByteBuffer;

    .line 33
    invoke-virtual {v1, p1}, Ljava/nio/ByteBuffer;->put([B)Ljava/nio/ByteBuffer;

    .line 34
    invoke-virtual {v1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p1

    return-object p1

    .line 35
    :cond_0
    new-instance p1, Ljava/security/InvalidParameterException;

    const-string p2, "Session key is not set"

    invoke-direct {p1, p2}, Ljava/security/InvalidParameterException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
