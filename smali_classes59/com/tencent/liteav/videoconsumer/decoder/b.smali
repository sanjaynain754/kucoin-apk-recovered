.class public final Lcom/tencent/liteav/videoconsumer/decoder/b;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field protected a:Lcom/tencent/liteav/videoconsumer/decoder/a;

.field b:I

.field private c:Ljava/io/InputStream;

.field private d:I

.field private e:I

.field private final f:Ljava/io/OutputStream;

.field private g:[I

.field private h:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Ljava/io/OutputStream;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    new-instance v0, Lcom/tencent/liteav/videoconsumer/decoder/a;

    .line 6
    .line 7
    .line 8
    invoke-direct {v0}, Lcom/tencent/liteav/videoconsumer/decoder/a;-><init>()V

    .line 9
    .line 10
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->a:Lcom/tencent/liteav/videoconsumer/decoder/a;

    .line 11
    .line 12
    const/16 v0, 0x8

    .line 13
    .line 14
    new-array v0, v0, [I

    .line 15
    .line 16
    iput-object v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->g:[I

    .line 17
    .line 18
    iput-object p1, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->c:Ljava/io/InputStream;

    .line 19
    .line 20
    iput-object p2, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->f:Ljava/io/OutputStream;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 24
    move-result p2

    .line 25
    .line 26
    iput p2, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->d:I

    .line 27
    .line 28
    .line 29
    invoke-virtual {p1}, Ljava/io/InputStream;->read()I

    .line 30
    move-result p1

    .line 31
    .line 32
    iput p1, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->e:I

    .line 33
    return-void
    .line 34
    .line 35
    .line 36
    .line 37
.end method

.method private a(JI)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p3, :cond_0

    sub-int v1, p3, v0

    add-int/lit8 v1, v1, -0x1

    shr-long v1, p1, v1

    long-to-int v1, v1

    and-int/lit8 v1, v1, 0x1

    .line 6
    invoke-direct {p0, v1}, Lcom/tencent/liteav/videoconsumer/decoder/b;->f(I)V

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method private c(Z)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->b:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    .line 2
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->f()V

    .line 3
    iget v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->d:I

    const/4 v1, -0x1

    if-ne v0, v1, :cond_0

    return v1

    .line 4
    :cond_0
    iget v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->d:I

    iget v1, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->b:I

    rsub-int/lit8 v2, v1, 0x7

    shr-int/2addr v0, v2

    and-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    .line 5
    iput v1, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->b:I

    if-eqz p1, :cond_1

    .line 6
    iget-object p1, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->f:Ljava/io/OutputStream;

    if-eqz p1, :cond_1

    .line 7
    invoke-direct {p0, v0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->f(I)V

    :cond_1
    return v0
.end method

.method private e(I)J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x40

    if-gt p1, v0, :cond_1

    const-wide/16 v0, 0x0

    const/4 v2, 0x0

    :goto_0
    if-ge v2, p1, :cond_0

    const/4 v3, 0x1

    shl-long/2addr v0, v3

    .line 1
    invoke-direct {p0, v3}, Lcom/tencent/liteav/videoconsumer/decoder/b;->c(Z)I

    move-result v3

    int-to-long v3, v3

    or-long/2addr v0, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    return-wide v0

    .line 2
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can not readByte more then 64 bit"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method private f()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->e:I

    iput v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->d:I

    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->c:Ljava/io/InputStream;

    invoke-virtual {v0}, Ljava/io/InputStream;->read()I

    move-result v0

    iput v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->e:I

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->b:I

    return-void
.end method

.method private f(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 4
    iget v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->h:I

    const/16 v1, 0x8

    if-ne v0, v1, :cond_0

    const/4 v0, 0x0

    .line 5
    iput v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->h:I

    .line 6
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->h()V

    .line 7
    :cond_0
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->g:[I

    iget v1, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->h:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->h:I

    aput p1, v0, v1

    return-void
.end method

.method private g()I
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    :goto_0
    const/4 v2, 0x1

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v2}, Lcom/tencent/liteav/videoconsumer/decoder/b;->c(Z)I

    .line 7
    move-result v3

    .line 8
    .line 9
    if-nez v3, :cond_0

    .line 10
    .line 11
    add-int/lit8 v1, v1, 0x1

    .line 12
    goto :goto_0

    .line 13
    .line 14
    :cond_0
    if-lez v1, :cond_1

    .line 15
    .line 16
    .line 17
    invoke-direct {p0, v1}, Lcom/tencent/liteav/videoconsumer/decoder/b;->e(I)J

    .line 18
    move-result-wide v3

    .line 19
    .line 20
    shl-int v0, v2, v1

    .line 21
    sub-int/2addr v0, v2

    .line 22
    int-to-long v0, v0

    .line 23
    add-long/2addr v0, v3

    .line 24
    long-to-int v0, v0

    .line 25
    :cond_1
    return v0
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
.end method

.method private h()V
    .locals 10
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->g:[I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    aget v1, v0, v1

    .line 6
    const/4 v2, 0x7

    .line 7
    shl-int/2addr v1, v2

    .line 8
    const/4 v3, 0x1

    .line 9
    .line 10
    aget v4, v0, v3

    .line 11
    const/4 v5, 0x6

    .line 12
    shl-int/2addr v4, v5

    .line 13
    or-int/2addr v1, v4

    .line 14
    const/4 v4, 0x2

    .line 15
    .line 16
    aget v6, v0, v4

    .line 17
    const/4 v7, 0x5

    .line 18
    shl-int/2addr v6, v7

    .line 19
    or-int/2addr v1, v6

    .line 20
    const/4 v6, 0x3

    .line 21
    .line 22
    aget v8, v0, v6

    .line 23
    const/4 v9, 0x4

    .line 24
    shl-int/2addr v8, v9

    .line 25
    or-int/2addr v1, v8

    .line 26
    .line 27
    aget v8, v0, v9

    .line 28
    .line 29
    shl-int/lit8 v6, v8, 0x3

    .line 30
    or-int/2addr v1, v6

    .line 31
    .line 32
    aget v6, v0, v7

    .line 33
    .line 34
    shl-int/lit8 v4, v6, 0x2

    .line 35
    or-int/2addr v1, v4

    .line 36
    .line 37
    aget v4, v0, v5

    .line 38
    .line 39
    shl-int/lit8 v3, v4, 0x1

    .line 40
    or-int/2addr v1, v3

    .line 41
    .line 42
    aget v0, v0, v2

    .line 43
    or-int/2addr v0, v1

    .line 44
    .line 45
    iget-object v1, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->f:Ljava/io/OutputStream;

    .line 46
    .line 47
    .line 48
    invoke-virtual {v1, v0}, Ljava/io/OutputStream;->write(I)V

    .line 49
    return-void
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
.method public final a()J
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x8

    .line 2
    invoke-direct {p0, v0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->e(I)J

    move-result-wide v0

    .line 3
    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    return-wide v0
.end method

.method public final a(I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/16 v0, 0x40

    if-gt p1, v0, :cond_1

    const/4 v0, 0x0

    :goto_0
    if-ge v0, p1, :cond_0

    const/4 v1, 0x1

    .line 4
    invoke-direct {p0, v1}, Lcom/tencent/liteav/videoconsumer/decoder/b;->c(Z)I

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    return-void

    .line 5
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Can not skip more then 64 bit"

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public final a(Z)Z
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoconsumer/decoder/b;->c(Z)I

    move-result p1

    const/4 v0, 0x1

    if-ne p1, v0, :cond_0

    return v0

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public final b()I
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    .line 2
    :goto_0
    invoke-direct {p0, v0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->c(Z)I

    move-result v2

    if-nez v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    if-lez v1, :cond_3

    const/16 v2, 0x40

    if-gt v1, v2, :cond_2

    const-wide/16 v2, 0x0

    move v4, v0

    :goto_1
    const/4 v5, 0x1

    if-ge v4, v1, :cond_1

    shl-long/2addr v2, v5

    .line 3
    invoke-direct {p0, v0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->c(Z)I

    move-result v5

    int-to-long v5, v5

    or-long/2addr v2, v5

    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    shl-int v0, v5, v1

    sub-int/2addr v0, v5

    int-to-long v0, v0

    add-long/2addr v0, v2

    long-to-int v0, v0

    return v0

    .line 4
    :cond_2
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "Can not readByte more then 64 bit"

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    return v0
.end method

.method public final b(I)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0, p1}, Lcom/tencent/liteav/videoconsumer/decoder/b;->a(I)V

    return-void
.end method

.method public final b(Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    invoke-direct {p0, p1}, Lcom/tencent/liteav/videoconsumer/decoder/b;->f(I)V

    return-void
.end method

.method public final c()I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 8
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->g()I

    move-result v0

    .line 9
    invoke-static {v0}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    return v0
.end method

.method public final c(I)V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 10
    new-array v0, p1, [I

    const/16 v1, 0x8

    const/4 v2, 0x0

    move v3, v2

    move v2, v1

    :goto_0
    if-ge v3, p1, :cond_2

    if-eqz v1, :cond_0

    .line 11
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->g()I

    move-result v1

    and-int/lit8 v4, v1, 0x1

    shl-int/lit8 v5, v4, 0x1

    add-int/lit8 v5, v5, -0x1

    shr-int/lit8 v1, v1, 0x1

    add-int/2addr v1, v4

    mul-int/2addr v1, v5

    .line 12
    invoke-static {v1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    add-int/2addr v1, v2

    add-int/lit16 v1, v1, 0x100

    .line 13
    rem-int/lit16 v1, v1, 0x100

    :cond_0
    if-nez v1, :cond_1

    goto :goto_1

    :cond_1
    move v2, v1

    .line 14
    :goto_1
    aput v2, v0, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_2
    return-void
.end method

.method public final d()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    :goto_0
    const/4 v1, 0x1

    .line 1
    invoke-direct {p0, v1}, Lcom/tencent/liteav/videoconsumer/decoder/b;->c(Z)I

    move-result v1

    if-nez v1, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :cond_0
    if-lez v0, :cond_1

    .line 2
    invoke-virtual {p0, v0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->a(I)V

    :cond_1
    return-void
.end method

.method public final d(I)V
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    move v2, v1

    :goto_0
    const/16 v3, 0xf

    const/4 v4, 0x1

    if-ge v1, v3, :cond_1

    shl-int v3, v4, v1

    add-int/2addr v3, v2

    if-ge p1, v3, :cond_0

    move v0, v1

    goto :goto_1

    :cond_0
    add-int/lit8 v1, v1, 0x1

    move v2, v3

    goto :goto_0

    :cond_1
    :goto_1
    const-wide/16 v5, 0x0

    .line 3
    invoke-direct {p0, v5, v6, v0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->a(JI)V

    .line 4
    invoke-direct {p0, v4}, Lcom/tencent/liteav/videoconsumer/decoder/b;->f(I)V

    sub-int/2addr p1, v2

    int-to-long v1, p1

    .line 5
    invoke-direct {p0, v1, v2, v0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->a(JI)V

    return-void
.end method

.method public final e()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const/4 v0, 0x1

    .line 3
    invoke-direct {p0, v0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->f(I)V

    .line 4
    iget v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->h:I

    const/16 v1, 0x8

    rsub-int/lit8 v0, v0, 0x8

    const-wide/16 v2, 0x0

    invoke-direct {p0, v2, v3, v0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->a(JI)V

    .line 5
    iget v0, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->h:I

    :goto_0
    const/4 v2, 0x0

    if-ge v0, v1, :cond_0

    .line 6
    iget-object v3, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->g:[I

    aput v2, v3, v0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 7
    :cond_0
    iput v2, p0, Lcom/tencent/liteav/videoconsumer/decoder/b;->h:I

    .line 8
    invoke-direct {p0}, Lcom/tencent/liteav/videoconsumer/decoder/b;->h()V

    return-void
.end method
