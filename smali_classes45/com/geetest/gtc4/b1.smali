.class public final Lcom/geetest/gtc4/b1;
.super Lcom/geetest/gtc4/b;
.source "SourceFile"


# instance fields
.field public final d:I

.field public final e:[Lcom/geetest/gtc4/b;


# direct methods
.method public constructor <init>([BI)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2}, Lcom/geetest/gtc4/b;-><init>([BI)V

    const/4 p1, 0x0

    .line 2
    iput-object p1, p0, Lcom/geetest/gtc4/b1;->e:[Lcom/geetest/gtc4/b;

    const/16 p1, 0x3e8

    .line 3
    iput p1, p0, Lcom/geetest/gtc4/b1;->d:I

    return-void
.end method

.method public constructor <init>([Lcom/geetest/gtc4/b;)V
    .locals 1

    .line 4
    invoke-static {p1}, Lcom/geetest/gtc4/b1;->a([Lcom/geetest/gtc4/b;)[B

    move-result-object v0

    invoke-direct {p0, v0}, Lcom/geetest/gtc4/b;-><init>([B)V

    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/b1;->e:[Lcom/geetest/gtc4/b;

    const/16 p1, 0x3e8

    .line 6
    iput p1, p0, Lcom/geetest/gtc4/b1;->d:I

    return-void
.end method

.method public static a([Lcom/geetest/gtc4/b;)[B
    .locals 8

    const/4 v0, 0x1

    .line 1
    array-length v1, p0

    const/4 v2, 0x0

    if-eqz v1, :cond_4

    if-eq v1, v0, :cond_3

    add-int/lit8 v3, v1, -0x1

    move v4, v2

    move v5, v4

    :goto_0
    if-ge v4, v3, :cond_1

    .line 2
    aget-object v6, p0, v4

    iget-object v6, v6, Lcom/geetest/gtc4/b;->a:[B

    .line 3
    aget-byte v7, v6, v2

    if-nez v7, :cond_0

    .line 4
    array-length v6, v6

    sub-int/2addr v6, v0

    add-int/2addr v5, v6

    add-int/2addr v4, v0

    goto :goto_0

    .line 5
    :cond_0
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "only the last nested bitstring can have padding"

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 6
    :cond_1
    aget-object v3, p0, v3

    iget-object v3, v3, Lcom/geetest/gtc4/b;->a:[B

    .line 7
    aget-byte v4, v3, v2

    .line 8
    array-length v3, v3

    add-int/2addr v5, v3

    .line 9
    new-array v3, v5, [B

    .line 10
    aput-byte v4, v3, v2

    move v4, v0

    :goto_1
    if-ge v2, v1, :cond_2

    .line 11
    aget-object v5, p0, v2

    iget-object v5, v5, Lcom/geetest/gtc4/b;->a:[B

    .line 12
    array-length v6, v5

    sub-int/2addr v6, v0

    .line 13
    invoke-static {v5, v0, v3, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/2addr v4, v6

    add-int/2addr v2, v0

    goto :goto_1

    :cond_2
    return-object v3

    .line 14
    :cond_3
    aget-object p0, p0, v2

    iget-object p0, p0, Lcom/geetest/gtc4/b;->a:[B

    return-object p0

    .line 15
    :cond_4
    new-array p0, v0, [B

    aput-byte v2, p0, v2

    return-object p0
.end method


# virtual methods
.method public final a(Z)I
    .locals 4

    .line 16
    invoke-virtual {p0}, Lcom/geetest/gtc4/b1;->f()Z

    move-result v0

    if-nez v0, :cond_0

    .line 17
    iget-object v0, p0, Lcom/geetest/gtc4/b;->a:[B

    array-length v0, v0

    .line 18
    invoke-static {v0, p1, v0}, Lcom/geetest/gtc4/d;->a(III)I

    move-result p1

    return p1

    :cond_0
    if-eqz p1, :cond_1

    const/4 p1, 0x4

    goto :goto_0

    :cond_1
    const/4 p1, 0x3

    .line 19
    :goto_0
    iget-object v0, p0, Lcom/geetest/gtc4/b1;->e:[Lcom/geetest/gtc4/b;

    const/4 v1, 0x1

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 20
    :goto_1
    iget-object v2, p0, Lcom/geetest/gtc4/b1;->e:[Lcom/geetest/gtc4/b;

    array-length v3, v2

    if-ge v0, v3, :cond_2

    .line 21
    aget-object v2, v2, v0

    invoke-virtual {v2, v1}, Lcom/geetest/gtc4/w;->a(Z)I

    move-result v2

    add-int/2addr p1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_2
    return p1

    .line 22
    :cond_3
    iget-object v0, p0, Lcom/geetest/gtc4/b;->a:[B

    array-length v2, v0

    const/4 v3, 0x2

    if-ge v2, v3, :cond_4

    return p1

    .line 23
    :cond_4
    array-length v0, v0

    sub-int/2addr v0, v3

    iget v2, p0, Lcom/geetest/gtc4/b1;->d:I

    add-int/lit8 v3, v2, -0x1

    div-int/2addr v0, v3

    .line 24
    invoke-static {v2}, Lcom/geetest/gtc4/u;->a(I)I

    move-result v3

    add-int/2addr v3, v1

    add-int/2addr v3, v2

    mul-int/2addr v3, v0

    add-int/2addr v3, p1

    .line 25
    iget-object p1, p0, Lcom/geetest/gtc4/b;->a:[B

    array-length p1, p1

    iget v2, p0, Lcom/geetest/gtc4/b1;->d:I

    sub-int/2addr v2, v1

    mul-int/2addr v2, v0

    sub-int/2addr p1, v2

    .line 26
    invoke-static {p1}, Lcom/geetest/gtc4/u;->a(I)I

    move-result v0

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    add-int/2addr v0, v3

    return v0
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 9

    .line 27
    invoke-virtual {p0}, Lcom/geetest/gtc4/b1;->f()Z

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-nez v0, :cond_0

    .line 28
    iget-object v0, p0, Lcom/geetest/gtc4/b;->a:[B

    array-length v3, v0

    .line 29
    invoke-virtual {p1, p2, v1}, Lcom/geetest/gtc4/u;->a(ZI)V

    .line 30
    invoke-virtual {p1, v3}, Lcom/geetest/gtc4/u;->b(I)V

    .line 31
    iget-object p1, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, v0, v2, v3}, Ljava/io/OutputStream;->write([BII)V

    return-void

    :cond_0
    const/16 v0, 0x23

    .line 32
    invoke-virtual {p1, p2, v0}, Lcom/geetest/gtc4/u;->a(ZI)V

    .line 33
    iget-object p2, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    const/16 v0, 0x80

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    .line 34
    iget-object p2, p0, Lcom/geetest/gtc4/b1;->e:[Lcom/geetest/gtc4/b;

    if-eqz p2, :cond_1

    .line 35
    invoke-virtual {p1, p2}, Lcom/geetest/gtc4/u;->a([Lcom/geetest/gtc4/w;)V

    goto :goto_1

    .line 36
    :cond_1
    iget-object p2, p0, Lcom/geetest/gtc4/b;->a:[B

    array-length v0, p2

    const/4 v3, 0x2

    if-ge v0, v3, :cond_2

    goto :goto_1

    .line 37
    :cond_2
    aget-byte v0, p2, v2

    .line 38
    array-length p2, p2

    add-int/lit8 v3, p2, -0x1

    .line 39
    iget v4, p0, Lcom/geetest/gtc4/b1;->d:I

    add-int/lit8 v5, v4, -0x1

    :goto_0
    const/4 v6, 0x1

    if-le v3, v5, :cond_3

    .line 40
    iget-object v7, p0, Lcom/geetest/gtc4/b;->a:[B

    sub-int v8, p2, v3

    .line 41
    invoke-virtual {p1, v6, v1}, Lcom/geetest/gtc4/u;->a(ZI)V

    .line 42
    invoke-virtual {p1, v4}, Lcom/geetest/gtc4/u;->b(I)V

    .line 43
    iget-object v6, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v6, v2}, Ljava/io/OutputStream;->write(I)V

    .line 44
    iget-object v6, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v6, v7, v8, v5}, Ljava/io/OutputStream;->write([BII)V

    sub-int/2addr v3, v5

    goto :goto_0

    .line 45
    :cond_3
    iget-object v4, p0, Lcom/geetest/gtc4/b;->a:[B

    sub-int/2addr p2, v3

    .line 46
    invoke-virtual {p1, v6, v1}, Lcom/geetest/gtc4/u;->a(ZI)V

    add-int/lit8 v1, v3, 0x1

    .line 47
    invoke-virtual {p1, v1}, Lcom/geetest/gtc4/u;->b(I)V

    .line 48
    iget-object v1, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 49
    iget-object v0, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, v4, p2, v3}, Ljava/io/OutputStream;->write([BII)V

    .line 50
    :goto_1
    iget-object p2, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p2, v2}, Ljava/io/OutputStream;->write(I)V

    .line 51
    iget-object p1, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final f()Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/b1;->e:[Lcom/geetest/gtc4/b;

    .line 3
    .line 4
    if-nez v0, :cond_1

    .line 5
    .line 6
    iget-object v0, p0, Lcom/geetest/gtc4/b;->a:[B

    .line 7
    array-length v0, v0

    .line 8
    .line 9
    iget v1, p0, Lcom/geetest/gtc4/b1;->d:I

    .line 10
    .line 11
    if-le v0, v1, :cond_0

    .line 12
    goto :goto_0

    .line 13
    :cond_0
    const/4 v0, 0x0

    .line 14
    return v0

    .line 15
    :cond_1
    :goto_0
    const/4 v0, 0x1

    .line 16
    return v0
    .line 17
    .line 18
.end method
