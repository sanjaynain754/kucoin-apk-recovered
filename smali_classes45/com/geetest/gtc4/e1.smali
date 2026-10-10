.class public final Lcom/geetest/gtc4/e1;
.super Lcom/geetest/gtc4/s;
.source "SourceFile"


# instance fields
.field public final d:I

.field public final e:[Lcom/geetest/gtc4/s;


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 5
    invoke-direct {p0, p1}, Lcom/geetest/gtc4/s;-><init>([B)V

    const/4 p1, 0x0

    .line 6
    iput-object p1, p0, Lcom/geetest/gtc4/e1;->e:[Lcom/geetest/gtc4/s;

    const/16 p1, 0x3e8

    .line 7
    iput p1, p0, Lcom/geetest/gtc4/e1;->d:I

    return-void
.end method

.method public constructor <init>([Lcom/geetest/gtc4/s;)V
    .locals 1

    .line 1
    invoke-static {p1}, Lcom/geetest/gtc4/e1;->a([Lcom/geetest/gtc4/s;)[B

    move-result-object v0

    .line 2
    invoke-direct {p0, v0}, Lcom/geetest/gtc4/s;-><init>([B)V

    .line 3
    iput-object p1, p0, Lcom/geetest/gtc4/e1;->e:[Lcom/geetest/gtc4/s;

    const/16 p1, 0x3e8

    .line 4
    iput p1, p0, Lcom/geetest/gtc4/e1;->d:I

    return-void
.end method

.method public static a([Lcom/geetest/gtc4/s;)[B
    .locals 7

    .line 1
    array-length v0, p0

    if-eqz v0, :cond_3

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eq v0, v1, :cond_2

    move v1, v2

    move v3, v1

    :goto_0
    if-ge v1, v0, :cond_0

    .line 2
    aget-object v4, p0, v1

    iget-object v4, v4, Lcom/geetest/gtc4/s;->a:[B

    array-length v4, v4

    add-int/2addr v3, v4

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 3
    :cond_0
    new-array v1, v3, [B

    move v3, v2

    move v4, v3

    :goto_1
    if-ge v3, v0, :cond_1

    .line 4
    aget-object v5, p0, v3

    iget-object v5, v5, Lcom/geetest/gtc4/s;->a:[B

    .line 5
    array-length v6, v5

    invoke-static {v5, v2, v1, v4, v6}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 6
    array-length v5, v5

    add-int/2addr v4, v5

    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    return-object v1

    .line 7
    :cond_2
    aget-object p0, p0, v2

    iget-object p0, p0, Lcom/geetest/gtc4/s;->a:[B

    return-object p0

    .line 8
    :cond_3
    sget-object p0, Lcom/geetest/gtc4/s;->c:[B

    return-object p0
.end method


# virtual methods
.method public final a(Z)I
    .locals 4

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    .line 9
    :goto_0
    iget-object v0, p0, Lcom/geetest/gtc4/e1;->e:[Lcom/geetest/gtc4/s;

    const/4 v1, 0x1

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    .line 10
    :goto_1
    iget-object v2, p0, Lcom/geetest/gtc4/e1;->e:[Lcom/geetest/gtc4/s;

    array-length v3, v2

    if-ge v0, v3, :cond_1

    .line 11
    aget-object v2, v2, v0

    invoke-virtual {v2, v1}, Lcom/geetest/gtc4/w;->a(Z)I

    move-result v2

    add-int/2addr p1, v2

    add-int/lit8 v0, v0, 0x1

    goto :goto_1

    :cond_1
    return p1

    .line 12
    :cond_2
    iget-object v0, p0, Lcom/geetest/gtc4/s;->a:[B

    array-length v0, v0

    iget v2, p0, Lcom/geetest/gtc4/e1;->d:I

    div-int/2addr v0, v2

    .line 13
    invoke-static {v2}, Lcom/geetest/gtc4/u;->a(I)I

    move-result v3

    add-int/2addr v3, v1

    add-int/2addr v3, v2

    mul-int/2addr v3, v0

    add-int/2addr v3, p1

    .line 14
    iget-object p1, p0, Lcom/geetest/gtc4/s;->a:[B

    array-length p1, p1

    iget v2, p0, Lcom/geetest/gtc4/e1;->d:I

    mul-int/2addr v0, v2

    sub-int/2addr p1, v0

    if-lez p1, :cond_3

    .line 15
    invoke-static {p1}, Lcom/geetest/gtc4/u;->a(I)I

    move-result v0

    add-int/2addr v0, v1

    add-int/2addr v0, p1

    add-int/2addr v0, v3

    return v0

    :cond_3
    return v3
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 5

    const/16 v0, 0x24

    .line 16
    invoke-virtual {p1, p2, v0}, Lcom/geetest/gtc4/u;->a(ZI)V

    .line 17
    iget-object p2, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    const/16 v0, 0x80

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    .line 18
    iget-object p2, p0, Lcom/geetest/gtc4/e1;->e:[Lcom/geetest/gtc4/s;

    const/4 v0, 0x0

    if-eqz p2, :cond_0

    .line 19
    invoke-virtual {p1, p2}, Lcom/geetest/gtc4/u;->a([Lcom/geetest/gtc4/w;)V

    goto :goto_1

    :cond_0
    move p2, v0

    .line 20
    :goto_0
    iget-object v1, p0, Lcom/geetest/gtc4/s;->a:[B

    array-length v2, v1

    if-ge p2, v2, :cond_1

    .line 21
    array-length v1, v1

    sub-int/2addr v1, p2

    iget v2, p0, Lcom/geetest/gtc4/e1;->d:I

    invoke-static {v1, v2}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 22
    iget-object v2, p0, Lcom/geetest/gtc4/s;->a:[B

    const/4 v3, 0x1

    const/4 v4, 0x4

    .line 23
    invoke-virtual {p1, v3, v4}, Lcom/geetest/gtc4/u;->a(ZI)V

    .line 24
    invoke-virtual {p1, v1}, Lcom/geetest/gtc4/u;->b(I)V

    .line 25
    iget-object v3, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v3, v2, p2, v1}, Ljava/io/OutputStream;->write([BII)V

    add-int/2addr p2, v1

    goto :goto_0

    .line 26
    :cond_1
    :goto_1
    iget-object p2, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p2, v0}, Ljava/io/OutputStream;->write(I)V

    .line 27
    iget-object p1, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, v0}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public final f()Z
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
    .line 17
    .line 18
.end method
