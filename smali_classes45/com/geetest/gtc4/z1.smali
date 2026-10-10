.class public final Lcom/geetest/gtc4/z1;
.super Lcom/geetest/gtc4/b;
.source "SourceFile"


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Lcom/geetest/gtc4/b;-><init>([B)V

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
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method


# virtual methods
.method public final a(Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/geetest/gtc4/b;->a:[B

    array-length v0, v0

    .line 2
    invoke-static {v0, p1, v0}, Lcom/geetest/gtc4/d;->a(III)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 7

    .line 3
    iget-object v0, p0, Lcom/geetest/gtc4/b;->a:[B

    const/4 v1, 0x0

    aget-byte v2, v0, v1

    const/16 v3, 0xff

    and-int/2addr v2, v3

    .line 4
    array-length v4, v0

    add-int/lit8 v5, v4, -0x1

    .line 5
    aget-byte v6, v0, v5

    shl-int v2, v3, v2

    and-int/2addr v2, v6

    int-to-byte v2, v2

    const/4 v3, 0x3

    if-ne v6, v2, :cond_0

    .line 6
    invoke-virtual {p1, p2, v3, v0}, Lcom/geetest/gtc4/u;->a(ZI[B)V

    return-void

    .line 7
    :cond_0
    invoke-virtual {p1, p2, v3}, Lcom/geetest/gtc4/u;->a(ZI)V

    .line 8
    invoke-virtual {p1, v4}, Lcom/geetest/gtc4/u;->b(I)V

    .line 9
    iget-object p2, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p2, v0, v1, v5}, Ljava/io/OutputStream;->write([BII)V

    .line 10
    iget-object p1, p1, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, v2}, Ljava/io/OutputStream;->write(I)V

    return-void
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

.method public final g()Lcom/geetest/gtc4/w;
    .locals 0

    .line 1
    return-object p0
    .line 2
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

.method public final h()Lcom/geetest/gtc4/w;
    .locals 0

    .line 1
    return-object p0
    .line 2
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
