.class public Lz3/g;
.super Ljava/io/InputStream;
.source "PooledByteArrayBufferedInputStream.java"


# instance fields
.field public final b:Ljava/io/InputStream;

.field public final c:[B

.field public final d:La4/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "La4/h<",
            "[B>;"
        }
    .end annotation
.end field

.field public e:I

.field public f:I

.field public g:Z


# direct methods
.method public constructor <init>(Ljava/io/InputStream;[BLa4/h;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/io/InputStream;",
            "[B",
            "La4/h<",
            "[B>;)V"
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    move-result-object p1

    .line 8
    .line 9
    check-cast p1, Ljava/io/InputStream;

    .line 10
    .line 11
    iput-object p1, p0, Lz3/g;->b:Ljava/io/InputStream;

    .line 12
    .line 13
    .line 14
    invoke-static {p2}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 15
    move-result-object p1

    .line 16
    .line 17
    check-cast p1, [B

    .line 18
    .line 19
    iput-object p1, p0, Lz3/g;->c:[B

    .line 20
    .line 21
    .line 22
    invoke-static {p3}, Lw3/h;->g(Ljava/lang/Object;)Ljava/lang/Object;

    .line 23
    move-result-object p1

    .line 24
    .line 25
    check-cast p1, La4/h;

    .line 26
    .line 27
    iput-object p1, p0, Lz3/g;->d:La4/h;

    .line 28
    const/4 p1, 0x0

    .line 29
    .line 30
    iput p1, p0, Lz3/g;->e:I

    .line 31
    .line 32
    iput p1, p0, Lz3/g;->f:I

    .line 33
    .line 34
    iput-boolean p1, p0, Lz3/g;->g:Z

    .line 35
    return-void
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


# virtual methods
.method public final a()Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lz3/g;->f:I

    .line 3
    .line 4
    iget v1, p0, Lz3/g;->e:I

    .line 5
    const/4 v2, 0x1

    .line 6
    .line 7
    if-ge v0, v1, :cond_0

    .line 8
    return v2

    .line 9
    .line 10
    :cond_0
    iget-object v0, p0, Lz3/g;->b:Ljava/io/InputStream;

    .line 11
    .line 12
    iget-object v1, p0, Lz3/g;->c:[B

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/io/InputStream;->read([B)I

    .line 16
    move-result v0

    .line 17
    const/4 v1, 0x0

    .line 18
    .line 19
    if-gtz v0, :cond_1

    .line 20
    return v1

    .line 21
    .line 22
    :cond_1
    iput v0, p0, Lz3/g;->e:I

    .line 23
    .line 24
    iput v1, p0, Lz3/g;->f:I

    .line 25
    return v2
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
.end method

.method public available()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lz3/g;->f:I

    .line 3
    .line 4
    iget v1, p0, Lz3/g;->e:I

    .line 5
    .line 6
    if-gt v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0}, Lw3/h;->i(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lz3/g;->b()V

    .line 16
    .line 17
    iget v0, p0, Lz3/g;->e:I

    .line 18
    .line 19
    iget v1, p0, Lz3/g;->f:I

    .line 20
    sub-int/2addr v0, v1

    .line 21
    .line 22
    iget-object v1, p0, Lz3/g;->b:Ljava/io/InputStream;

    .line 23
    .line 24
    .line 25
    invoke-virtual {v1}, Ljava/io/InputStream;->available()I

    .line 26
    move-result v1

    .line 27
    add-int/2addr v0, v1

    .line 28
    return v0
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
.end method

.method public final b()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lz3/g;->g:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    new-instance v0, Ljava/io/IOException;

    .line 8
    .line 9
    .line 10
    const-string/jumbo v1, "stream already closed"

    .line 11
    .line 12
    .line 13
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 14
    throw v0
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lz3/g;->g:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    const/4 v0, 0x1

    .line 6
    .line 7
    iput-boolean v0, p0, Lz3/g;->g:Z

    .line 8
    .line 9
    iget-object v0, p0, Lz3/g;->d:La4/h;

    .line 10
    .line 11
    iget-object v1, p0, Lz3/g;->c:[B

    .line 12
    .line 13
    .line 14
    invoke-interface {v0, v1}, La4/h;->release(Ljava/lang/Object;)V

    .line 15
    .line 16
    .line 17
    invoke-super {p0}, Ljava/io/InputStream;->close()V

    .line 18
    :cond_0
    return-void
.end method

.method public finalize()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Throwable;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lz3/g;->g:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    const-string v0, "PooledByteInputStream"

    .line 7
    .line 8
    const-string v1, "Finalized without closing"

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1}, Lx3/a;->m(Ljava/lang/String;Ljava/lang/String;)V

    .line 12
    .line 13
    .line 14
    invoke-virtual {p0}, Lz3/g;->close()V

    .line 15
    .line 16
    .line 17
    :cond_0
    invoke-super {p0}, Ljava/lang/Object;->finalize()V

    .line 18
    return-void
.end method

.method public read()I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget v0, p0, Lz3/g;->f:I

    iget v1, p0, Lz3/g;->e:I

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lw3/h;->i(Z)V

    .line 2
    invoke-virtual {p0}, Lz3/g;->b()V

    .line 3
    invoke-virtual {p0}, Lz3/g;->a()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, -0x1

    return v0

    .line 4
    :cond_1
    iget-object v0, p0, Lz3/g;->c:[B

    iget v1, p0, Lz3/g;->f:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lz3/g;->f:I

    aget-byte v0, v0, v1

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public read([BII)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    iget v0, p0, Lz3/g;->f:I

    iget v1, p0, Lz3/g;->e:I

    if-gt v0, v1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    invoke-static {v0}, Lw3/h;->i(Z)V

    .line 6
    invoke-virtual {p0}, Lz3/g;->b()V

    .line 7
    invoke-virtual {p0}, Lz3/g;->a()Z

    move-result v0

    if-nez v0, :cond_1

    const/4 p1, -0x1

    return p1

    .line 8
    :cond_1
    iget v0, p0, Lz3/g;->e:I

    iget v1, p0, Lz3/g;->f:I

    sub-int/2addr v0, v1

    invoke-static {v0, p3}, Ljava/lang/Math;->min(II)I

    move-result p3

    .line 9
    iget-object v0, p0, Lz3/g;->c:[B

    iget v1, p0, Lz3/g;->f:I

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 10
    iget p1, p0, Lz3/g;->f:I

    add-int/2addr p1, p3

    iput p1, p0, Lz3/g;->f:I

    return p3
.end method

.method public skip(J)J
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lz3/g;->f:I

    .line 3
    .line 4
    iget v1, p0, Lz3/g;->e:I

    .line 5
    .line 6
    if-gt v0, v1, :cond_0

    .line 7
    const/4 v0, 0x1

    .line 8
    goto :goto_0

    .line 9
    :cond_0
    const/4 v0, 0x0

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-static {v0}, Lw3/h;->i(Z)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Lz3/g;->b()V

    .line 16
    .line 17
    iget v0, p0, Lz3/g;->e:I

    .line 18
    .line 19
    iget v1, p0, Lz3/g;->f:I

    .line 20
    .line 21
    sub-int v2, v0, v1

    .line 22
    int-to-long v2, v2

    .line 23
    .line 24
    cmp-long v4, v2, p1

    .line 25
    .line 26
    if-ltz v4, :cond_1

    .line 27
    int-to-long v0, v1

    .line 28
    add-long/2addr v0, p1

    .line 29
    long-to-int v0, v0

    .line 30
    .line 31
    iput v0, p0, Lz3/g;->f:I

    .line 32
    return-wide p1

    .line 33
    .line 34
    :cond_1
    iput v0, p0, Lz3/g;->f:I

    .line 35
    .line 36
    iget-object v0, p0, Lz3/g;->b:Ljava/io/InputStream;

    .line 37
    sub-long/2addr p1, v2

    .line 38
    .line 39
    .line 40
    invoke-virtual {v0, p1, p2}, Ljava/io/InputStream;->skip(J)J

    .line 41
    move-result-wide p1

    .line 42
    add-long/2addr v2, p1

    .line 43
    return-wide v2
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
