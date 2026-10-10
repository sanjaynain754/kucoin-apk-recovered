.class public Lcom/datavisorobfus/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/datavisorobfus/m$a;
    }
.end annotation


# direct methods
.method public static a(Ljava/lang/String;I)Lcom/datavisorobfus/m$a;
    .locals 6

    const/4 v0, 0x0

    .line 1
    :try_start_0
    invoke-static {p0}, Lcom/datavisorobfus/z0;->a(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_0

    return-object v0

    :cond_0
    new-instance v1, Lcom/datavisorobfus/m$a;

    invoke-direct {v1}, Lcom/datavisorobfus/m$a;-><init>()V

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-nez p1, :cond_1

    invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B

    move-result-object p0

    invoke-static {p0}, Lcom/datavisor/vangogh/bridge/crypto;->encryptV([B)[B

    move-result-object p0

    goto :goto_0

    :cond_1
    if-ne p1, v3, :cond_2

    invoke-static {p0, v4}, Lcom/datavisor/vangogh/bridge/crypto;->encryptVV(Ljava/lang/String;I)[B

    move-result-object p0

    goto :goto_0

    :cond_2
    if-ne p1, v2, :cond_3

    invoke-static {p0}, Lcom/datavisor/vangogh/bridge/crypto;->encryptZDVV(Ljava/lang/String;)[B

    move-result-object p0

    goto :goto_0

    :cond_3
    const/4 v5, 0x3

    if-ne p1, v5, :cond_4

    invoke-static {p0}, Lcom/datavisor/vangogh/bridge/crypto;->encryptForLongToken(Ljava/lang/String;)[B

    move-result-object p0

    goto :goto_0

    :cond_4
    const/4 v5, 0x4

    if-ne p1, v5, :cond_5

    invoke-static {p0}, Lcom/datavisor/vangogh/bridge/crypto;->encryptForPatchConfig(Ljava/lang/String;)[B

    move-result-object p0

    goto :goto_0

    :cond_5
    move-object p0, v0

    :goto_0
    if-nez p0, :cond_6

    iput v3, v1, Lcom/datavisorobfus/m$a;->a:I

    return-object v1

    :cond_6
    invoke-static {p0}, Lcom/datavisor/vangogh/bridge/crypto;->sign([B)[B

    move-result-object p1

    if-nez p1, :cond_7

    iput v2, v1, Lcom/datavisorobfus/m$a;->a:I

    return-object v1

    :cond_7
    array-length v2, p0

    array-length v3, p1

    add-int/2addr v2, v3

    new-array v2, v2, [B

    array-length v3, p0

    invoke-static {p0, v4, v2, v4, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length p0, p0

    array-length v3, p1

    invoke-static {p1, v4, v2, p0, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput v4, v1, Lcom/datavisorobfus/m$a;->a:I

    iput-object v2, v1, Lcom/datavisorobfus/m$a;->b:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v1

    :catchall_0
    return-object v0
.end method

.method public static a([B)[B
    .locals 11

    const/16 v0, 0x30

    const/16 v1, 0x10

    const/4 v2, 0x0

    if-eqz p0, :cond_4

    .line 2
    :try_start_0
    array-length v3, p0

    if-nez v3, :cond_0

    goto :goto_2

    :cond_0
    new-array v3, v0, [B

    fill-array-data v3, :array_0

    new-array v4, v1, [B

    fill-array-data v4, :array_1

    invoke-static {p0}, Lcom/datavisorobfus/f;->a([B)[B

    move-result-object p0

    if-nez p0, :cond_1

    return-object v2

    :cond_1
    array-length v5, p0

    new-array v6, v5, [B

    const/4 v7, 0x0

    move v8, v7

    :goto_0
    array-length v9, p0

    if-ge v8, v9, :cond_2

    aget-byte v9, p0, v8

    rem-int/lit8 v10, v8, 0x30

    aget-byte v10, v3, v10

    xor-int/2addr v9, v10

    int-to-byte v9, v9

    not-int v9, v9

    int-to-byte v9, v9

    aput-byte v9, v6, v8

    add-int/lit8 v8, v8, 0x1

    goto :goto_0

    :catchall_0
    move-exception p0

    goto :goto_1

    :cond_2
    add-int/lit8 p0, v5, 0x10

    new-array p0, p0, [B

    invoke-static {v6, v7, p0, v7, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {v4, v7, p0, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    invoke-static {p0}, Lcom/datavisorobfus/u;->a([B)[B

    move-result-object p0

    if-nez p0, :cond_3

    return-object v2

    :cond_3
    array-length v0, p0

    add-int/2addr v0, v5

    new-array v0, v0, [B

    invoke-static {v6, v7, v0, v7, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    array-length v1, p0

    invoke-static {p0, v7, v0, v5, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    return-object v0

    :goto_1
    invoke-static {p0}, Lcom/datavisorobfus/f0;->a(Ljava/lang/Throwable;)V

    :cond_4
    :goto_2
    return-object v2

    :array_0
    .array-data 1
        0xet
        -0xat
        -0x2dt
        -0x3et
        0x62t
        -0x54t
        -0x6bt
        -0x6ft
        0x79t
        -0x1ct
        0x32t
        -0x20t
        0xat
        0x3at
        0x6t
        0x49t
        0x5ct
        0x24t
        0x56t
        0x6ct
        -0x16t
        -0xct
        0x7at
        0x65t
        0x8t
        -0x52t
        -0x38t
        -0x19t
        0x6dt
        0x37t
        -0x2bt
        -0x73t
        -0x57t
        0x4et
        -0x59t
        -0x3ct
        0x3dt
        0x7et
        0x5dt
        0x64t
        0x73t
        0x19t
        0xct
        -0x33t
        -0x14t
        0x13t
        -0x69t
        0x5ft
    .end array-data

    :array_1
    .array-data 1
        0x55t
        0x28t
        -0x21t
        -0x1ft
        -0x8t
        -0x68t
        0x11t
        0x69t
        -0x27t
        -0x72t
        -0x6ct
        0x61t
        0x35t
        0x57t
        -0x47t
        -0x7at
    .end array-data
.end method
