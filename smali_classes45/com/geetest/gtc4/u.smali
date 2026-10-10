.class public Lcom/geetest/gtc4/u;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:Ljava/io/ByteArrayOutputStream;


# direct methods
.method public constructor <init>(Ljava/io/ByteArrayOutputStream;)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

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

.method public static a(I)I
    .locals 1

    .line 1
    const/16 v0, 0x80

    if-ge p0, v0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    ushr-int/lit8 p0, p0, 0x8

    if-eqz p0, :cond_1

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method


# virtual methods
.method public a()Lcom/geetest/gtc4/k2;
    .locals 2

    .line 2
    new-instance v0, Lcom/geetest/gtc4/k2;

    iget-object v1, p0, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v1}, Lcom/geetest/gtc4/k2;-><init>(Ljava/io/ByteArrayOutputStream;)V

    return-object v0
.end method

.method public final a(II)V
    .locals 4

    const/16 v0, 0x1f

    if-ge p2, v0, :cond_0

    or-int/2addr p1, p2

    .line 3
    iget-object p2, p0, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p2, p1}, Ljava/io/OutputStream;->write(I)V

    return-void

    :cond_0
    const/4 v1, 0x6

    .line 4
    new-array v1, v1, [B

    and-int/lit8 v2, p2, 0x7f

    int-to-byte v2, v2

    const/4 v3, 0x5

    .line 5
    aput-byte v2, v1, v3

    :goto_0
    const/16 v2, 0x7f

    if-le p2, v2, :cond_1

    ushr-int/lit8 p2, p2, 0x7

    add-int/lit8 v3, v3, -0x1

    and-int/lit8 v2, p2, 0x7f

    or-int/lit16 v2, v2, 0x80

    int-to-byte v2, v2

    .line 6
    aput-byte v2, v1, v3

    goto :goto_0

    :cond_1
    add-int/lit8 v3, v3, -0x1

    or-int/2addr p1, v0

    int-to-byte p1, p1

    .line 7
    aput-byte p1, v1, v3

    rsub-int/lit8 p1, v3, 0x6

    .line 8
    iget-object p2, p0, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p2, v1, v3, p1}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public final a(ZI)V
    .locals 0

    if-eqz p1, :cond_0

    .line 9
    iget-object p1, p0, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write(I)V

    :cond_0
    return-void
.end method

.method public final a(ZI[B)V
    .locals 1

    .line 12
    invoke-virtual {p0, p1, p2}, Lcom/geetest/gtc4/u;->a(ZI)V

    .line 13
    array-length p1, p3

    invoke-virtual {p0, p1}, Lcom/geetest/gtc4/u;->b(I)V

    .line 14
    array-length p1, p3

    .line 15
    iget-object p2, p0, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    const/4 v0, 0x0

    invoke-virtual {p2, p3, v0, p1}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method

.method public final a(ZI[Lcom/geetest/gtc4/f;)V
    .locals 0

    .line 16
    invoke-virtual {p0, p1, p2}, Lcom/geetest/gtc4/u;->a(ZI)V

    .line 17
    iget-object p1, p0, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    const/16 p2, 0x80

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write(I)V

    .line 18
    invoke-virtual {p0, p3}, Lcom/geetest/gtc4/u;->a([Lcom/geetest/gtc4/f;)V

    .line 19
    iget-object p1, p0, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write(I)V

    .line 20
    iget-object p1, p0, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {p1, p2}, Ljava/io/OutputStream;->write(I)V

    return-void
.end method

.method public a([Lcom/geetest/gtc4/f;)V
    .locals 4

    .line 10
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 11
    aget-object v2, p1, v1

    invoke-interface {v2}, Lcom/geetest/gtc4/f;->d()Lcom/geetest/gtc4/w;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, p0, v3}, Lcom/geetest/gtc4/w;->a(Lcom/geetest/gtc4/u;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public a([Lcom/geetest/gtc4/w;)V
    .locals 4

    .line 21
    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    .line 22
    aget-object v2, p1, v1

    const/4 v3, 0x1

    invoke-virtual {v2, p0, v3}, Lcom/geetest/gtc4/w;->a(Lcom/geetest/gtc4/u;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public b()Lcom/geetest/gtc4/y2;
    .locals 2

    .line 1
    new-instance v0, Lcom/geetest/gtc4/y2;

    iget-object v1, p0, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-direct {v0, v1}, Lcom/geetest/gtc4/y2;-><init>(Ljava/io/ByteArrayOutputStream;)V

    return-object v0
.end method

.method public final b(I)V
    .locals 5

    const/16 v0, 0x80

    if-ge p1, v0, :cond_0

    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, p1}, Ljava/io/OutputStream;->write(I)V

    return-void

    :cond_0
    const/4 v1, 0x5

    .line 3
    new-array v2, v1, [B

    :goto_0
    add-int/lit8 v3, v1, -0x1

    int-to-byte v4, p1

    .line 4
    aput-byte v4, v2, v3

    ushr-int/lit8 p1, p1, 0x8

    if-nez p1, :cond_1

    rsub-int/lit8 p1, v3, 0x5

    add-int/lit8 v1, v1, -0x2

    or-int/2addr p1, v0

    int-to-byte p1, p1

    .line 5
    aput-byte p1, v2, v1

    rsub-int/lit8 p1, v3, 0x6

    .line 6
    iget-object v0, p0, Lcom/geetest/gtc4/u;->a:Ljava/io/ByteArrayOutputStream;

    invoke-virtual {v0, v2, v1, p1}, Ljava/io/OutputStream;->write([BII)V

    return-void

    :cond_1
    move v1, v3

    goto :goto_0
.end method
