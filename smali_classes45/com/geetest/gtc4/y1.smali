.class public final Lcom/geetest/gtc4/y1;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"


# instance fields
.field public final a:[C


# direct methods
.method public constructor <init>([C)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/y1;->a:[C

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
.end method


# virtual methods
.method public final a(Z)I
    .locals 1

    .line 5
    iget-object v0, p0, Lcom/geetest/gtc4/y1;->a:[C

    array-length v0, v0

    mul-int/lit8 v0, v0, 0x2

    .line 6
    invoke-static {v0, p1, v0}, Lcom/geetest/gtc4/d;->a(III)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 12

    .line 7
    iget-object v0, p0, Lcom/geetest/gtc4/y1;->a:[C

    array-length v0, v0

    const/16 v1, 0x1e

    .line 8
    invoke-virtual {p1, p2, v1}, Lcom/geetest/gtc4/u;->a(ZI)V

    mul-int/lit8 p2, v0, 0x2

    .line 9
    invoke-virtual {p1, p2}, Lcom/geetest/gtc4/u;->b(I)V

    const/16 p2, 0x8

    .line 10
    new-array v1, p2, [B

    and-int/lit8 v2, v0, -0x4

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    const/4 v5, 0x1

    const/4 v6, 0x2

    if-ge v4, v2, :cond_0

    .line 11
    iget-object v7, p0, Lcom/geetest/gtc4/y1;->a:[C

    aget-char v8, v7, v4

    add-int/lit8 v9, v4, 0x1

    aget-char v9, v7, v9

    add-int/lit8 v10, v4, 0x2

    aget-char v10, v7, v10

    add-int/lit8 v11, v4, 0x3

    aget-char v7, v7, v11

    add-int/lit8 v4, v4, 0x4

    shr-int/lit8 v11, v8, 0x8

    int-to-byte v11, v11

    .line 12
    aput-byte v11, v1, v3

    int-to-byte v8, v8

    .line 13
    aput-byte v8, v1, v5

    shr-int/lit8 v5, v9, 0x8

    int-to-byte v5, v5

    .line 14
    aput-byte v5, v1, v6

    int-to-byte v5, v9

    const/4 v6, 0x3

    .line 15
    aput-byte v5, v1, v6

    shr-int/lit8 v5, v10, 0x8

    int-to-byte v5, v5

    const/4 v6, 0x4

    .line 16
    aput-byte v5, v1, v6

    int-to-byte v5, v10

    const/4 v6, 0x5

    .line 17
    aput-byte v5, v1, v6

    shr-int/lit8 v5, v7, 0x8

    int-to-byte v5, v5

    const/4 v6, 0x6

    .line 18
    aput-byte v5, v1, v6

    int-to-byte v5, v7

    const/4 v6, 0x7

    .line 19
    aput-byte v5, v1, v6

    .line 20
    iget-object v5, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v5, v1, v3, p2}, Ljava/io/OutputStream;->write([BII)V

    goto :goto_0

    :cond_0
    if-ge v4, v0, :cond_2

    move p2, v3

    .line 21
    :cond_1
    iget-object v2, p0, Lcom/geetest/gtc4/y1;->a:[C

    aget-char v2, v2, v4

    add-int/2addr v4, v5

    add-int/lit8 v7, p2, 0x1

    shr-int/lit8 v8, v2, 0x8

    int-to-byte v8, v8

    .line 22
    aput-byte v8, v1, p2

    add-int/2addr p2, v6

    int-to-byte v2, v2

    .line 23
    aput-byte v2, v1, v7

    if-lt v4, v0, :cond_1

    .line 24
    iget-object p1, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, v1, v3, p2}, Ljava/io/OutputStream;->write([BII)V

    :cond_2
    return-void
.end method

.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 1

    .line 1
    instance-of v0, p1, Lcom/geetest/gtc4/y1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 2
    :cond_0
    check-cast p1, Lcom/geetest/gtc4/y1;

    .line 3
    iget-object v0, p0, Lcom/geetest/gtc4/y1;->a:[C

    iget-object p1, p1, Lcom/geetest/gtc4/y1;->a:[C

    .line 4
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([C[C)Z

    move-result p1

    return p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

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
    .line 17
    .line 18
.end method

.method public final hashCode()I
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/y1;->a:[C

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    return v0

    .line 7
    :cond_0
    array-length v1, v0

    .line 8
    .line 9
    add-int/lit8 v2, v1, 0x1

    .line 10
    .line 11
    :goto_0
    add-int/lit8 v1, v1, -0x1

    .line 12
    .line 13
    if-ltz v1, :cond_1

    .line 14
    .line 15
    mul-int/lit16 v2, v2, 0x101

    .line 16
    .line 17
    aget-char v3, v0, v1

    .line 18
    xor-int/2addr v2, v3

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    return v2
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
.end method

.method public final toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/String;

    .line 3
    .line 4
    iget-object v1, p0, Lcom/geetest/gtc4/y1;->a:[C

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/String;-><init>([C)V

    .line 8
    return-object v0
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
