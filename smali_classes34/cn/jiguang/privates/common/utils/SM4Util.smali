.class public Lcn/jiguang/privates/common/utils/SM4Util;
.super Ljava/lang/Object;
.source "SM4Util.java"


# static fields
.field private static final BLOCK:I = 0x10

.field private static CK:[I = null

.field private static final ROUND:I = 0x20

.field private static Sbox:[B = null

.field private static final TAG:Ljava/lang/String; = "SM4"


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x20

    .line 3
    .line 4
    const/16 v1, 0x100

    .line 5
    .line 6
    new-array v1, v1, [B

    .line 7
    .line 8
    .line 9
    fill-array-data v1, :array_0

    .line 10
    .line 11
    sput-object v1, Lcn/jiguang/privates/common/utils/SM4Util;->Sbox:[B

    .line 12
    .line 13
    new-array v0, v0, [I

    .line 14
    .line 15
    .line 16
    fill-array-data v0, :array_1

    .line 17
    .line 18
    sput-object v0, Lcn/jiguang/privates/common/utils/SM4Util;->CK:[I

    .line 19
    return-void

    .line 20
    nop

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
    :array_0
    .array-data 1
        -0x2at
        -0x70t
        -0x17t
        -0x2t
        -0x34t
        -0x1ft
        0x3dt
        -0x49t
        0x16t
        -0x4at
        0x14t
        -0x3et
        0x28t
        -0x5t
        0x2ct
        0x5t
        0x2bt
        0x67t
        -0x66t
        0x76t
        0x2at
        -0x42t
        0x4t
        -0x3dt
        -0x56t
        0x44t
        0x13t
        0x26t
        0x49t
        -0x7at
        0x6t
        -0x67t
        -0x64t
        0x42t
        0x50t
        -0xct
        -0x6ft
        -0x11t
        -0x68t
        0x7at
        0x33t
        0x54t
        0xbt
        0x43t
        -0x13t
        -0x31t
        -0x54t
        0x62t
        -0x1ct
        -0x4dt
        0x1ct
        -0x57t
        -0x37t
        0x8t
        -0x18t
        -0x6bt
        -0x80t
        -0x21t
        -0x6ct
        -0x6t
        0x75t
        -0x71t
        0x3ft
        -0x5at
        0x47t
        0x7t
        -0x59t
        -0x4t
        -0xdt
        0x73t
        0x17t
        -0x46t
        -0x7dt
        0x59t
        0x3ct
        0x19t
        -0x1at
        -0x7bt
        0x4ft
        -0x58t
        0x68t
        0x6bt
        -0x7ft
        -0x4et
        0x71t
        0x64t
        -0x26t
        -0x75t
        -0x8t
        -0x15t
        0xft
        0x4bt
        0x70t
        0x56t
        -0x63t
        0x35t
        0x1et
        0x24t
        0xet
        0x5et
        0x63t
        0x58t
        -0x2ft
        -0x5et
        0x25t
        0x22t
        0x7ct
        0x3bt
        0x1t
        0x21t
        0x78t
        -0x79t
        -0x2ct
        0x0t
        0x46t
        0x57t
        -0x61t
        -0x2dt
        0x27t
        0x52t
        0x4ct
        0x36t
        0x2t
        -0x19t
        -0x60t
        -0x3ct
        -0x38t
        -0x62t
        -0x16t
        -0x41t
        -0x76t
        -0x2et
        0x40t
        -0x39t
        0x38t
        -0x4bt
        -0x5dt
        -0x9t
        -0xet
        -0x32t
        -0x7t
        0x61t
        0x15t
        -0x5ft
        -0x20t
        -0x52t
        0x5dt
        -0x5ct
        -0x65t
        0x34t
        0x1at
        0x55t
        -0x53t
        -0x6dt
        0x32t
        0x30t
        -0xbt
        -0x74t
        -0x4ft
        -0x1dt
        0x1dt
        -0xat
        -0x1et
        0x2et
        -0x7et
        0x66t
        -0x36t
        0x60t
        -0x40t
        0x29t
        0x23t
        -0x55t
        0xdt
        0x53t
        0x4et
        0x6ft
        -0x2bt
        -0x25t
        0x37t
        0x45t
        -0x22t
        -0x3t
        -0x72t
        0x2ft
        0x3t
        -0x1t
        0x6at
        0x72t
        0x6dt
        0x6ct
        0x5bt
        0x51t
        -0x73t
        0x1bt
        -0x51t
        -0x6et
        -0x45t
        -0x23t
        -0x44t
        0x7ft
        0x11t
        -0x27t
        0x5ct
        0x41t
        0x1ft
        0x10t
        0x5at
        -0x28t
        0xat
        -0x3ft
        0x31t
        -0x78t
        -0x5bt
        -0x33t
        0x7bt
        -0x43t
        0x2dt
        0x74t
        -0x30t
        0x12t
        -0x48t
        -0x1bt
        -0x4ct
        -0x50t
        -0x77t
        0x69t
        -0x69t
        0x4at
        0xct
        -0x6at
        0x77t
        0x7et
        0x65t
        -0x47t
        -0xft
        0x9t
        -0x3bt
        0x6et
        -0x3at
        -0x7ct
        0x18t
        -0x10t
        0x7dt
        -0x14t
        0x3at
        -0x24t
        0x4dt
        0x20t
        0x79t
        -0x12t
        0x5ft
        0x3et
        -0x29t
        -0x35t
        0x39t
        0x48t
    .end array-data

    :array_1
    .array-data 4
        0x70e15
        0x1c232a31
        0x383f464d
        0x545b6269
        0x70777e85    # 3.06383E29f
        -0x736c655f    # -2.2742E-31f
        -0x57504943
        -0x3b342d27
        -0x1f18110b
        -0x3fcf5ef
        0x181f262d
        0x343b4249
        0x50575e65
        0x6c737a81
        -0x77706963
        -0x5b544d47
        -0x3f38312b
        -0x231c150f
        -0x700f9f3
        0x141b2229
        0x30373e45
        0x4c535a61    # 5.5404932E7f
        0x686f767d
        -0x7b746d67
        -0x5f58514b
        -0x433c352f
        -0x27201913
        -0xb04fdf7
        0x10171e25
        0x2c333a41
        0x484f565d
        0x646b7279
    .end array-data
.end method

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
    .line 18
.end method

.method private static ByteSub(I)I
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lcn/jiguang/privates/common/utils/SM4Util;->Sbox:[B

    .line 3
    .line 4
    ushr-int/lit8 v1, p0, 0x18

    .line 5
    .line 6
    and-int/lit16 v1, v1, 0xff

    .line 7
    .line 8
    aget-byte v1, v0, v1

    .line 9
    .line 10
    and-int/lit16 v1, v1, 0xff

    .line 11
    .line 12
    shl-int/lit8 v1, v1, 0x18

    .line 13
    .line 14
    ushr-int/lit8 v2, p0, 0x10

    .line 15
    .line 16
    and-int/lit16 v2, v2, 0xff

    .line 17
    .line 18
    aget-byte v2, v0, v2

    .line 19
    .line 20
    and-int/lit16 v2, v2, 0xff

    .line 21
    .line 22
    shl-int/lit8 v2, v2, 0x10

    .line 23
    or-int/2addr v1, v2

    .line 24
    .line 25
    ushr-int/lit8 v2, p0, 0x8

    .line 26
    .line 27
    and-int/lit16 v2, v2, 0xff

    .line 28
    .line 29
    aget-byte v2, v0, v2

    .line 30
    .line 31
    and-int/lit16 v2, v2, 0xff

    .line 32
    .line 33
    shl-int/lit8 v2, v2, 0x8

    .line 34
    or-int/2addr v1, v2

    .line 35
    .line 36
    and-int/lit16 p0, p0, 0xff

    .line 37
    .line 38
    aget-byte p0, v0, p0

    .line 39
    .line 40
    and-int/lit16 p0, p0, 0xff

    .line 41
    or-int/2addr p0, v1

    .line 42
    return p0
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
.end method

.method private static L1(I)I
    .locals 2

    .line 1
    const/4 v0, 0x2

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lcn/jiguang/privates/common/utils/SM4Util;->Rotl(II)I

    .line 5
    move-result v0

    .line 6
    xor-int/2addr v0, p0

    .line 7
    .line 8
    const/16 v1, 0xa

    .line 9
    .line 10
    .line 11
    invoke-static {p0, v1}, Lcn/jiguang/privates/common/utils/SM4Util;->Rotl(II)I

    .line 12
    move-result v1

    .line 13
    xor-int/2addr v0, v1

    .line 14
    .line 15
    const/16 v1, 0x12

    .line 16
    .line 17
    .line 18
    invoke-static {p0, v1}, Lcn/jiguang/privates/common/utils/SM4Util;->Rotl(II)I

    .line 19
    move-result v1

    .line 20
    xor-int/2addr v0, v1

    .line 21
    .line 22
    const/16 v1, 0x18

    .line 23
    .line 24
    .line 25
    invoke-static {p0, v1}, Lcn/jiguang/privates/common/utils/SM4Util;->Rotl(II)I

    .line 26
    move-result p0

    .line 27
    xor-int/2addr p0, v0

    .line 28
    return p0
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
.end method

.method private static L2(I)I
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0xd

    .line 3
    .line 4
    .line 5
    invoke-static {p0, v0}, Lcn/jiguang/privates/common/utils/SM4Util;->Rotl(II)I

    .line 6
    move-result v0

    .line 7
    xor-int/2addr v0, p0

    .line 8
    .line 9
    const/16 v1, 0x17

    .line 10
    .line 11
    .line 12
    invoke-static {p0, v1}, Lcn/jiguang/privates/common/utils/SM4Util;->Rotl(II)I

    .line 13
    move-result p0

    .line 14
    xor-int/2addr p0, v0

    .line 15
    return p0
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private static L3([B)[I
    .locals 6

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    new-array v1, v0, [I

    .line 4
    const/4 v2, 0x0

    .line 5
    .line 6
    :goto_0
    if-ge v2, v0, :cond_0

    .line 7
    .line 8
    mul-int/lit8 v3, v2, 0x4

    .line 9
    .line 10
    aget-byte v4, p0, v3

    .line 11
    .line 12
    and-int/lit16 v4, v4, 0xff

    .line 13
    .line 14
    shl-int/lit8 v4, v4, 0x18

    .line 15
    .line 16
    add-int/lit8 v5, v3, 0x1

    .line 17
    .line 18
    aget-byte v5, p0, v5

    .line 19
    .line 20
    and-int/lit16 v5, v5, 0xff

    .line 21
    .line 22
    shl-int/lit8 v5, v5, 0x10

    .line 23
    or-int/2addr v4, v5

    .line 24
    .line 25
    add-int/lit8 v5, v3, 0x2

    .line 26
    .line 27
    aget-byte v5, p0, v5

    .line 28
    .line 29
    and-int/lit16 v5, v5, 0xff

    .line 30
    .line 31
    shl-int/lit8 v5, v5, 0x8

    .line 32
    or-int/2addr v4, v5

    .line 33
    .line 34
    add-int/lit8 v3, v3, 0x3

    .line 35
    .line 36
    aget-byte v3, p0, v3

    .line 37
    .line 38
    and-int/lit16 v3, v3, 0xff

    .line 39
    or-int/2addr v3, v4

    .line 40
    .line 41
    aput v3, v1, v2

    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-object v1
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
.end method

.method private static Rotl(II)I
    .locals 1

    .line 1
    .line 2
    shl-int v0, p0, p1

    .line 3
    .line 4
    rsub-int/lit8 p1, p1, 0x20

    .line 5
    ushr-int/2addr p0, p1

    .line 6
    or-int/2addr p0, v0

    .line 7
    return p0
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
.end method

.method private static cbcXor([B[B)V
    .locals 3

    .line 1
    const/4 v0, 0x0

    .line 2
    :goto_0
    array-length v1, p0

    .line 3
    .line 4
    if-ge v0, v1, :cond_0

    .line 5
    .line 6
    aget-byte v1, p0, v0

    .line 7
    .line 8
    aget-byte v2, p1, v0

    .line 9
    xor-int/2addr v1, v2

    .line 10
    int-to-byte v1, v1

    .line 11
    .line 12
    aput-byte v1, p0, v0

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0x1

    .line 15
    goto :goto_0

    .line 16
    :cond_0
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
.end method

.method public static decode([B[B[B)[B
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p0, :cond_5

    .line 3
    array-length v0, p0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    goto :goto_2

    .line 7
    .line 8
    :cond_0
    if-eqz p1, :cond_4

    .line 9
    array-length v0, p1

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    if-ne v0, v1, :cond_4

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    array-length v0, p2

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    const/4 p2, 0x0

    .line 20
    :cond_1
    const/4 v0, 0x1

    .line 21
    .line 22
    .line 23
    invoke-static {p1, v0}, Lcn/jiguang/privates/common/utils/SM4Util;->sm4KeyExt([BZ)[I

    .line 24
    move-result-object p1

    .line 25
    .line 26
    new-array v0, v1, [B

    .line 27
    .line 28
    new-array v2, v1, [B

    .line 29
    array-length v3, p0

    .line 30
    .line 31
    new-array v3, v3, [B

    .line 32
    const/4 v4, 0x0

    .line 33
    move v5, v4

    .line 34
    .line 35
    :goto_0
    add-int/lit8 v6, v5, 0x10

    .line 36
    array-length v7, p0

    .line 37
    .line 38
    if-gt v6, v7, :cond_3

    .line 39
    .line 40
    .line 41
    invoke-static {p0, v5, v0, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 42
    .line 43
    .line 44
    invoke-static {v0, v2, p1}, Lcn/jiguang/privates/common/utils/SM4Util;->sm4Crypt([B[B[I)V

    .line 45
    .line 46
    if-eqz p2, :cond_2

    .line 47
    .line 48
    .line 49
    invoke-static {v2, p2}, Lcn/jiguang/privates/common/utils/SM4Util;->cbcXor([B[B)V

    .line 50
    goto :goto_1

    .line 51
    .line 52
    :cond_2
    new-array p2, v1, [B

    .line 53
    .line 54
    .line 55
    :goto_1
    invoke-static {p0, v5, p2, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 56
    .line 57
    .line 58
    invoke-static {v2, v4, v3, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 59
    move v5, v6

    .line 60
    goto :goto_0

    .line 61
    .line 62
    .line 63
    :cond_3
    invoke-static {v3}, Lcn/jiguang/privates/common/utils/SM4Util;->revertPkcs7Padding([B)[B

    .line 64
    move-result-object p0

    .line 65
    return-object p0

    .line 66
    .line 67
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 68
    .line 69
    const-string p1, "key\'s length should be 16"

    .line 70
    .line 71
    .line 72
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 73
    throw p0

    .line 74
    :cond_5
    :goto_2
    return-object p0
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
.end method

.method public static decryptBytes([BLjava/lang/String;)[B
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/common/utils/SM4Util;->hexStringToByte(Ljava/lang/String;)[B

    .line 4
    move-result-object v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    const/16 v2, 0x10

    .line 8
    .line 9
    .line 10
    invoke-virtual {p1, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;

    .line 11
    move-result-object p1

    .line 12
    .line 13
    .line 14
    const-string/jumbo v1, "utf-8"

    .line 15
    .line 16
    .line 17
    invoke-virtual {p1, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 18
    move-result-object p1

    .line 19
    .line 20
    .line 21
    invoke-static {p0, v0, p1}, Lcn/jiguang/privates/common/utils/SM4Util;->decode([B[B[B)[B

    .line 22
    move-result-object p0

    .line 23
    return-object p0
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
.end method

.method public static encode([B[B[B)[B
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    if-eqz p0, :cond_5

    .line 3
    array-length v0, p0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    goto :goto_2

    .line 7
    .line 8
    :cond_0
    if-eqz p1, :cond_4

    .line 9
    array-length v0, p1

    .line 10
    .line 11
    const/16 v1, 0x10

    .line 12
    .line 13
    if-ne v0, v1, :cond_4

    .line 14
    .line 15
    if-eqz p2, :cond_1

    .line 16
    array-length v0, p2

    .line 17
    .line 18
    if-eq v0, v1, :cond_1

    .line 19
    const/4 p2, 0x0

    .line 20
    .line 21
    .line 22
    :cond_1
    invoke-static {p0}, Lcn/jiguang/privates/common/utils/SM4Util;->pkcs7padding([B)[B

    .line 23
    move-result-object p0

    .line 24
    const/4 v0, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {p1, v0}, Lcn/jiguang/privates/common/utils/SM4Util;->sm4KeyExt([BZ)[I

    .line 28
    move-result-object p1

    .line 29
    .line 30
    new-array v2, v1, [B

    .line 31
    array-length v3, p0

    .line 32
    .line 33
    new-array v3, v3, [B

    .line 34
    move v4, v0

    .line 35
    .line 36
    :goto_0
    add-int/lit8 v5, v4, 0x10

    .line 37
    array-length v6, p0

    .line 38
    .line 39
    if-gt v5, v6, :cond_3

    .line 40
    .line 41
    .line 42
    invoke-static {p0, v4, v2, v0, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 43
    .line 44
    if-eqz p2, :cond_2

    .line 45
    .line 46
    .line 47
    invoke-static {v2, p2}, Lcn/jiguang/privates/common/utils/SM4Util;->cbcXor([B[B)V

    .line 48
    goto :goto_1

    .line 49
    .line 50
    :cond_2
    new-array p2, v1, [B

    .line 51
    .line 52
    .line 53
    :goto_1
    invoke-static {v2, p2, p1}, Lcn/jiguang/privates/common/utils/SM4Util;->sm4Crypt([B[B[I)V

    .line 54
    array-length v6, p2

    .line 55
    .line 56
    .line 57
    invoke-static {p2, v0, v3, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 58
    move v4, v5

    .line 59
    goto :goto_0

    .line 60
    :cond_3
    return-object v3

    .line 61
    .line 62
    :cond_4
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 63
    .line 64
    const-string p1, "key\'s length should be 16"

    .line 65
    .line 66
    .line 67
    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    throw p0

    .line 69
    :cond_5
    :goto_2
    return-object p0
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
.end method

.method public static encryptBytes([BLjava/lang/String;Ljava/lang/String;)[B
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-static {p1}, Lcn/jiguang/privates/common/utils/SM4Util;->hexStringToByte(Ljava/lang/String;)[B

    .line 4
    move-result-object p1

    .line 5
    .line 6
    .line 7
    const-string/jumbo v0, "utf-8"

    .line 8
    .line 9
    .line 10
    invoke-virtual {p2, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 11
    move-result-object p2

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1, p2}, Lcn/jiguang/privates/common/utils/SM4Util;->encode([B[B[B)[B

    .line 15
    move-result-object p0

    .line 16
    return-object p0
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
.end method

.method public static hexStringToByte(Ljava/lang/String;)[B
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    .line 6
    div-int/lit8 v0, v0, 0x2

    .line 7
    .line 8
    new-array v1, v0, [B

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 12
    move-result-object p0

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/String;->toCharArray()[C

    .line 16
    move-result-object p0

    .line 17
    const/4 v2, 0x0

    .line 18
    .line 19
    :goto_0
    if-ge v2, v0, :cond_0

    .line 20
    .line 21
    mul-int/lit8 v3, v2, 0x2

    .line 22
    .line 23
    aget-char v4, p0, v3

    .line 24
    .line 25
    .line 26
    invoke-static {v4}, Lcn/jiguang/privates/common/utils/SM4Util;->toByte(C)I

    .line 27
    move-result v4

    .line 28
    .line 29
    shl-int/lit8 v4, v4, 0x4

    .line 30
    .line 31
    add-int/lit8 v3, v3, 0x1

    .line 32
    .line 33
    aget-char v3, p0, v3

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Lcn/jiguang/privates/common/utils/SM4Util;->toByte(C)I

    .line 37
    move-result v3

    .line 38
    or-int/2addr v3, v4

    .line 39
    int-to-byte v3, v3

    .line 40
    .line 41
    aput-byte v3, v1, v2

    .line 42
    .line 43
    add-int/lit8 v2, v2, 0x1

    .line 44
    goto :goto_0

    .line 45
    :cond_0
    return-object v1
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
.end method

.method private static pkcs7padding([B)[B
    .locals 5

    .line 1
    array-length v0, p0

    .line 2
    .line 3
    rem-int/lit8 v0, v0, 0x10

    .line 4
    .line 5
    rsub-int/lit8 v0, v0, 0x10

    .line 6
    array-length v1, p0

    .line 7
    add-int/2addr v1, v0

    .line 8
    .line 9
    .line 10
    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x0

    .line 13
    .line 14
    :goto_0
    if-ge v2, v0, :cond_0

    .line 15
    array-length v3, p0

    .line 16
    add-int/2addr v3, v2

    .line 17
    int-to-byte v4, v0

    .line 18
    .line 19
    aput-byte v4, v1, v3

    .line 20
    .line 21
    add-int/lit8 v2, v2, 0x1

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v1
.end method

.method private static revertPkcs7Padding([B)[B
    .locals 3

    .line 1
    array-length v0, p0

    .line 2
    .line 3
    add-int/lit8 v0, v0, -0x1

    .line 4
    .line 5
    aget-byte v0, p0, v0

    .line 6
    array-length v1, p0

    .line 7
    sub-int/2addr v1, v0

    .line 8
    .line 9
    new-array v0, v1, [B

    .line 10
    const/4 v2, 0x0

    .line 11
    .line 12
    .line 13
    invoke-static {p0, v2, v0, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    return-object v0
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static sm4Crypt([B[B[I)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcn/jiguang/privates/common/utils/SM4Util;->L3([B)[I

    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    move v1, v0

    .line 7
    .line 8
    :goto_0
    const/16 v2, 0x20

    .line 9
    const/4 v3, 0x3

    .line 10
    .line 11
    if-ge v1, v2, :cond_0

    .line 12
    .line 13
    aget v2, p0, v0

    .line 14
    const/4 v4, 0x1

    .line 15
    .line 16
    aget v5, p0, v4

    .line 17
    const/4 v6, 0x2

    .line 18
    .line 19
    aget v7, p0, v6

    .line 20
    xor-int/2addr v5, v7

    .line 21
    .line 22
    aget v7, p0, v3

    .line 23
    xor-int/2addr v5, v7

    .line 24
    .line 25
    aget v7, p2, v1

    .line 26
    xor-int/2addr v5, v7

    .line 27
    .line 28
    .line 29
    invoke-static {v5}, Lcn/jiguang/privates/common/utils/SM4Util;->ByteSub(I)I

    .line 30
    move-result v5

    .line 31
    .line 32
    .line 33
    invoke-static {v5}, Lcn/jiguang/privates/common/utils/SM4Util;->L1(I)I

    .line 34
    move-result v5

    .line 35
    xor-int/2addr v2, v5

    .line 36
    .line 37
    aput v2, p0, v0

    .line 38
    .line 39
    aget v5, p0, v4

    .line 40
    .line 41
    aget v7, p0, v6

    .line 42
    .line 43
    aget v8, p0, v3

    .line 44
    xor-int/2addr v7, v8

    .line 45
    xor-int/2addr v2, v7

    .line 46
    .line 47
    add-int/lit8 v7, v1, 0x1

    .line 48
    .line 49
    aget v7, p2, v7

    .line 50
    xor-int/2addr v2, v7

    .line 51
    .line 52
    .line 53
    invoke-static {v2}, Lcn/jiguang/privates/common/utils/SM4Util;->ByteSub(I)I

    .line 54
    move-result v2

    .line 55
    .line 56
    .line 57
    invoke-static {v2}, Lcn/jiguang/privates/common/utils/SM4Util;->L1(I)I

    .line 58
    move-result v2

    .line 59
    xor-int/2addr v2, v5

    .line 60
    .line 61
    aput v2, p0, v4

    .line 62
    .line 63
    aget v5, p0, v6

    .line 64
    .line 65
    aget v7, p0, v3

    .line 66
    .line 67
    aget v8, p0, v0

    .line 68
    xor-int/2addr v7, v8

    .line 69
    xor-int/2addr v2, v7

    .line 70
    .line 71
    add-int/lit8 v7, v1, 0x2

    .line 72
    .line 73
    aget v7, p2, v7

    .line 74
    xor-int/2addr v2, v7

    .line 75
    .line 76
    .line 77
    invoke-static {v2}, Lcn/jiguang/privates/common/utils/SM4Util;->ByteSub(I)I

    .line 78
    move-result v2

    .line 79
    .line 80
    .line 81
    invoke-static {v2}, Lcn/jiguang/privates/common/utils/SM4Util;->L1(I)I

    .line 82
    move-result v2

    .line 83
    xor-int/2addr v2, v5

    .line 84
    .line 85
    aput v2, p0, v6

    .line 86
    .line 87
    aget v5, p0, v3

    .line 88
    .line 89
    aget v6, p0, v0

    .line 90
    .line 91
    aget v4, p0, v4

    .line 92
    xor-int/2addr v4, v6

    .line 93
    xor-int/2addr v2, v4

    .line 94
    .line 95
    add-int/lit8 v4, v1, 0x3

    .line 96
    .line 97
    aget v4, p2, v4

    .line 98
    xor-int/2addr v2, v4

    .line 99
    .line 100
    .line 101
    invoke-static {v2}, Lcn/jiguang/privates/common/utils/SM4Util;->ByteSub(I)I

    .line 102
    move-result v2

    .line 103
    .line 104
    .line 105
    invoke-static {v2}, Lcn/jiguang/privates/common/utils/SM4Util;->L1(I)I

    .line 106
    move-result v2

    .line 107
    xor-int/2addr v2, v5

    .line 108
    .line 109
    aput v2, p0, v3

    .line 110
    .line 111
    add-int/lit8 v1, v1, 0x4

    .line 112
    goto :goto_0

    .line 113
    .line 114
    :cond_0
    :goto_1
    const/16 p2, 0x10

    .line 115
    .line 116
    if-ge v0, p2, :cond_1

    .line 117
    .line 118
    div-int/lit8 p2, v0, 0x4

    .line 119
    .line 120
    rsub-int/lit8 p2, p2, 0x3

    .line 121
    .line 122
    aget p2, p0, p2

    .line 123
    .line 124
    ushr-int/lit8 v1, p2, 0x18

    .line 125
    .line 126
    and-int/lit16 v1, v1, 0xff

    .line 127
    int-to-byte v1, v1

    .line 128
    .line 129
    aput-byte v1, p1, v0

    .line 130
    .line 131
    add-int/lit8 v1, v0, 0x1

    .line 132
    .line 133
    ushr-int/lit8 v2, p2, 0x10

    .line 134
    .line 135
    and-int/lit16 v2, v2, 0xff

    .line 136
    int-to-byte v2, v2

    .line 137
    .line 138
    aput-byte v2, p1, v1

    .line 139
    .line 140
    add-int/lit8 v1, v0, 0x2

    .line 141
    .line 142
    ushr-int/lit8 v2, p2, 0x8

    .line 143
    .line 144
    and-int/lit16 v2, v2, 0xff

    .line 145
    int-to-byte v2, v2

    .line 146
    .line 147
    aput-byte v2, p1, v1

    .line 148
    .line 149
    add-int/lit8 v1, v0, 0x3

    .line 150
    .line 151
    and-int/lit16 p2, p2, 0xff

    .line 152
    int-to-byte p2, p2

    .line 153
    .line 154
    aput-byte p2, p1, v1

    .line 155
    .line 156
    add-int/lit8 v0, v0, 0x4

    .line 157
    goto :goto_1

    .line 158
    :cond_1
    return-void
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
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
.end method

.method public static sm4KeyExt([BZ)[I
    .locals 11

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcn/jiguang/privates/common/utils/SM4Util;->L3([B)[I

    .line 4
    move-result-object p0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    aget v1, p0, v0

    .line 8
    .line 9
    .line 10
    const v2, -0x5c4e453a

    .line 11
    xor-int/2addr v1, v2

    .line 12
    .line 13
    aput v1, p0, v0

    .line 14
    const/4 v1, 0x1

    .line 15
    .line 16
    aget v2, p0, v1

    .line 17
    .line 18
    .line 19
    const v3, 0x56aa3350

    .line 20
    xor-int/2addr v2, v3

    .line 21
    .line 22
    aput v2, p0, v1

    .line 23
    const/4 v2, 0x2

    .line 24
    .line 25
    aget v3, p0, v2

    .line 26
    .line 27
    .line 28
    const v4, 0x677d9197

    .line 29
    xor-int/2addr v3, v4

    .line 30
    .line 31
    aput v3, p0, v2

    .line 32
    const/4 v3, 0x3

    .line 33
    .line 34
    aget v4, p0, v3

    .line 35
    .line 36
    .line 37
    const v5, -0x4d8fdd24

    .line 38
    xor-int/2addr v4, v5

    .line 39
    .line 40
    aput v4, p0, v3

    .line 41
    .line 42
    const/16 v4, 0x20

    .line 43
    .line 44
    new-array v5, v4, [I

    .line 45
    move v6, v0

    .line 46
    .line 47
    :goto_0
    if-ge v6, v4, :cond_0

    .line 48
    .line 49
    aget v7, p0, v0

    .line 50
    .line 51
    aget v8, p0, v1

    .line 52
    .line 53
    aget v9, p0, v2

    .line 54
    xor-int/2addr v8, v9

    .line 55
    .line 56
    aget v9, p0, v3

    .line 57
    xor-int/2addr v8, v9

    .line 58
    .line 59
    sget-object v9, Lcn/jiguang/privates/common/utils/SM4Util;->CK:[I

    .line 60
    .line 61
    aget v9, v9, v6

    .line 62
    xor-int/2addr v8, v9

    .line 63
    .line 64
    .line 65
    invoke-static {v8}, Lcn/jiguang/privates/common/utils/SM4Util;->ByteSub(I)I

    .line 66
    move-result v8

    .line 67
    .line 68
    .line 69
    invoke-static {v8}, Lcn/jiguang/privates/common/utils/SM4Util;->L2(I)I

    .line 70
    move-result v8

    .line 71
    xor-int/2addr v7, v8

    .line 72
    .line 73
    aput v7, p0, v0

    .line 74
    .line 75
    aput v7, v5, v6

    .line 76
    .line 77
    add-int/lit8 v7, v6, 0x1

    .line 78
    .line 79
    aget v8, p0, v1

    .line 80
    .line 81
    aget v9, p0, v2

    .line 82
    .line 83
    aget v10, p0, v3

    .line 84
    xor-int/2addr v9, v10

    .line 85
    .line 86
    aget v10, p0, v0

    .line 87
    xor-int/2addr v9, v10

    .line 88
    .line 89
    sget-object v10, Lcn/jiguang/privates/common/utils/SM4Util;->CK:[I

    .line 90
    .line 91
    aget v10, v10, v7

    .line 92
    xor-int/2addr v9, v10

    .line 93
    .line 94
    .line 95
    invoke-static {v9}, Lcn/jiguang/privates/common/utils/SM4Util;->ByteSub(I)I

    .line 96
    move-result v9

    .line 97
    .line 98
    .line 99
    invoke-static {v9}, Lcn/jiguang/privates/common/utils/SM4Util;->L2(I)I

    .line 100
    move-result v9

    .line 101
    xor-int/2addr v8, v9

    .line 102
    .line 103
    aput v8, p0, v1

    .line 104
    .line 105
    aput v8, v5, v7

    .line 106
    .line 107
    add-int/lit8 v7, v6, 0x2

    .line 108
    .line 109
    aget v8, p0, v2

    .line 110
    .line 111
    aget v9, p0, v3

    .line 112
    .line 113
    aget v10, p0, v0

    .line 114
    xor-int/2addr v9, v10

    .line 115
    .line 116
    aget v10, p0, v1

    .line 117
    xor-int/2addr v9, v10

    .line 118
    .line 119
    sget-object v10, Lcn/jiguang/privates/common/utils/SM4Util;->CK:[I

    .line 120
    .line 121
    aget v10, v10, v7

    .line 122
    xor-int/2addr v9, v10

    .line 123
    .line 124
    .line 125
    invoke-static {v9}, Lcn/jiguang/privates/common/utils/SM4Util;->ByteSub(I)I

    .line 126
    move-result v9

    .line 127
    .line 128
    .line 129
    invoke-static {v9}, Lcn/jiguang/privates/common/utils/SM4Util;->L2(I)I

    .line 130
    move-result v9

    .line 131
    xor-int/2addr v8, v9

    .line 132
    .line 133
    aput v8, p0, v2

    .line 134
    .line 135
    aput v8, v5, v7

    .line 136
    .line 137
    add-int/lit8 v7, v6, 0x3

    .line 138
    .line 139
    aget v8, p0, v3

    .line 140
    .line 141
    aget v9, p0, v0

    .line 142
    .line 143
    aget v10, p0, v1

    .line 144
    xor-int/2addr v9, v10

    .line 145
    .line 146
    aget v10, p0, v2

    .line 147
    xor-int/2addr v9, v10

    .line 148
    .line 149
    sget-object v10, Lcn/jiguang/privates/common/utils/SM4Util;->CK:[I

    .line 150
    .line 151
    aget v10, v10, v7

    .line 152
    xor-int/2addr v9, v10

    .line 153
    .line 154
    .line 155
    invoke-static {v9}, Lcn/jiguang/privates/common/utils/SM4Util;->ByteSub(I)I

    .line 156
    move-result v9

    .line 157
    .line 158
    .line 159
    invoke-static {v9}, Lcn/jiguang/privates/common/utils/SM4Util;->L2(I)I

    .line 160
    move-result v9

    .line 161
    xor-int/2addr v8, v9

    .line 162
    .line 163
    aput v8, p0, v3

    .line 164
    .line 165
    aput v8, v5, v7

    .line 166
    .line 167
    add-int/lit8 v6, v6, 0x4

    .line 168
    goto :goto_0

    .line 169
    .line 170
    :cond_0
    if-eqz p1, :cond_1

    .line 171
    .line 172
    :goto_1
    const/16 p0, 0x10

    .line 173
    .line 174
    if-ge v0, p0, :cond_1

    .line 175
    .line 176
    aget p0, v5, v0

    .line 177
    .line 178
    rsub-int/lit8 p1, v0, 0x1f

    .line 179
    .line 180
    aget v1, v5, p1

    .line 181
    .line 182
    aput v1, v5, v0

    .line 183
    .line 184
    aput p0, v5, p1

    .line 185
    .line 186
    add-int/lit8 v0, v0, 0x1

    .line 187
    goto :goto_1

    .line 188
    :cond_1
    return-object v5
.end method

.method private static toByte(C)I
    .locals 1

    .line 1
    .line 2
    const-string v0, "0123456789abcdef"

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0, p0}, Ljava/lang/String;->indexOf(I)I

    .line 6
    move-result p0

    .line 7
    int-to-byte p0, p0

    .line 8
    return p0
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
.end method

.method public static toHexString([B)Ljava/lang/String;
    .locals 5

    .line 1
    .line 2
    if-eqz p0, :cond_2

    .line 3
    array-length v0, p0

    .line 4
    const/4 v1, 0x1

    .line 5
    .line 6
    if-lt v0, v1, :cond_2

    .line 7
    .line 8
    new-instance v0, Ljava/lang/StringBuilder;

    .line 9
    .line 10
    .line 11
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 12
    array-length v1, p0

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    :goto_0
    if-ge v2, v1, :cond_1

    .line 16
    .line 17
    aget-byte v3, p0, v2

    .line 18
    .line 19
    and-int/lit16 v3, v3, 0xff

    .line 20
    .line 21
    const/16 v4, 0x10

    .line 22
    .line 23
    if-ge v3, v4, :cond_0

    .line 24
    .line 25
    const-string v4, "0"

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    :cond_0
    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 32
    move-result-object v3

    .line 33
    .line 34
    .line 35
    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 36
    .line 37
    add-int/lit8 v2, v2, 0x1

    .line 38
    goto :goto_0

    .line 39
    .line 40
    .line 41
    :cond_1
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object p0

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;

    .line 46
    move-result-object p0

    .line 47
    return-object p0

    .line 48
    .line 49
    :cond_2
    new-instance p0, Ljava/lang/IllegalArgumentException;

    .line 50
    .line 51
    .line 52
    const-string/jumbo v0, "this byteArray must not be null or empty"

    .line 53
    .line 54
    .line 55
    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 56
    throw p0
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
.end method
