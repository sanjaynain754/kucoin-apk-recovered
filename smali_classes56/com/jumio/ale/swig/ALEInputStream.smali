.class public Lcom/jumio/ale/swig/ALEInputStream;
.super Ljava/io/FilterInputStream;
.source "SourceFile"


# instance fields
.field public final a:Lcom/jumio/ale/swig/ALERequest;

.field public final b:Ljava/io/InputStream;

.field public final c:[B

.field public d:Z

.field public e:[B

.field public f:I

.field public g:I


# direct methods
.method public constructor <init>(Ljava/io/InputStream;Lcom/jumio/ale/swig/ALERequest;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1}, Ljava/io/FilterInputStream;-><init>(Ljava/io/InputStream;)V

    .line 4
    .line 5
    const/16 v0, 0x200

    .line 6
    .line 7
    new-array v0, v0, [B

    .line 8
    .line 9
    iput-object v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->c:[B

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    iput-boolean v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->d:Z

    .line 13
    .line 14
    iput v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->f:I

    .line 15
    .line 16
    iput v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->g:I

    .line 17
    .line 18
    iput-object p1, p0, Lcom/jumio/ale/swig/ALEInputStream;->b:Ljava/io/InputStream;

    .line 19
    .line 20
    iput-object p2, p0, Lcom/jumio/ale/swig/ALEInputStream;->a:Lcom/jumio/ale/swig/ALERequest;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p2}, Lcom/jumio/ale/swig/ALERequest;->initResponse()V

    .line 24
    return-void
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
.end method


# virtual methods
.method public available()I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->g:I

    .line 3
    .line 4
    iget v1, p0, Lcom/jumio/ale/swig/ALEInputStream;->f:I

    .line 5
    sub-int/2addr v0, v1

    .line 6
    return v0
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
    iget-object v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->b:Ljava/io/InputStream;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    .line 6
    .line 7
    :try_start_0
    iget-boolean v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->d:Z

    .line 8
    .line 9
    if-nez v0, :cond_0

    .line 10
    .line 11
    iget-object v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->a:Lcom/jumio/ale/swig/ALERequest;

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Lcom/jumio/ale/swig/ALERequest;->finishResponse()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    goto :goto_0

    .line 16
    :catch_0
    move-exception v0

    .line 17
    goto :goto_1

    .line 18
    :cond_0
    :goto_0
    const/4 v0, 0x0

    .line 19
    .line 20
    iput v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->f:I

    .line 21
    .line 22
    iput v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->g:I

    .line 23
    return-void

    .line 24
    .line 25
    :goto_1
    new-instance v1, Ljava/io/IOException;

    .line 26
    .line 27
    .line 28
    invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    .line 29
    throw v1
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
.end method

.method public markSupported()Z
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
.end method

.method public read([B)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcom/jumio/ale/swig/ALEInputStream;->read([BII)I

    move-result p1

    return p1
.end method

.method public read([BII)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 2
    iget v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->f:I

    iget v1, p0, Lcom/jumio/ale/swig/ALEInputStream;->g:I

    const/4 v2, 0x0

    if-lt v0, v1, :cond_5

    move v0, v2

    :goto_0
    const/4 v1, -0x1

    if-nez v0, :cond_4

    .line 3
    iget-boolean v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->d:Z

    if-eqz v0, :cond_0

    move v0, v1

    goto :goto_0

    .line 4
    :cond_0
    iget-object v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->b:Ljava/io/InputStream;

    iget-object v3, p0, Lcom/jumio/ale/swig/ALEInputStream;->c:[B

    invoke-virtual {v0, v3}, Ljava/io/InputStream;->read([B)I

    move-result v0

    if-ne v0, v1, :cond_1

    const/4 v1, 0x1

    .line 5
    iput-boolean v1, p0, Lcom/jumio/ale/swig/ALEInputStream;->d:Z

    .line 6
    :try_start_0
    iget-object v1, p0, Lcom/jumio/ale/swig/ALEInputStream;->a:Lcom/jumio/ale/swig/ALERequest;

    invoke-virtual {v1}, Lcom/jumio/ale/swig/ALERequest;->finishResponse()Z
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    move-exception p1

    .line 7
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    .line 8
    :cond_1
    :try_start_1
    iget-object v1, p0, Lcom/jumio/ale/swig/ALEInputStream;->c:[B

    array-length v3, v1

    if-eq v0, v3, :cond_2

    .line 9
    new-array v3, v0, [B

    .line 10
    invoke-static {v1, v2, v3, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    add-int/lit8 v0, v0, 0x20

    .line 11
    new-array v0, v0, [B

    iput-object v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->e:[B

    .line 12
    iget-object v1, p0, Lcom/jumio/ale/swig/ALEInputStream;->a:Lcom/jumio/ale/swig/ALERequest;

    invoke-virtual {v1, v3, v0}, Lcom/jumio/ale/swig/ALERequest;->updateResponse([B[B)I

    move-result v0

    goto :goto_1

    :catch_1
    move-exception p1

    goto :goto_3

    .line 13
    :cond_2
    array-length v0, v1

    add-int/lit8 v0, v0, 0x20

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->e:[B

    .line 14
    iget-object v3, p0, Lcom/jumio/ale/swig/ALEInputStream;->a:Lcom/jumio/ale/swig/ALERequest;

    invoke-virtual {v3, v1, v0}, Lcom/jumio/ale/swig/ALERequest;->updateResponse([B[B)I

    move-result v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    .line 15
    :goto_1
    iput v2, p0, Lcom/jumio/ale/swig/ALEInputStream;->f:I

    .line 16
    iget-object v1, p0, Lcom/jumio/ale/swig/ALEInputStream;->e:[B

    if-nez v1, :cond_3

    .line 17
    iput v2, p0, Lcom/jumio/ale/swig/ALEInputStream;->g:I

    goto :goto_2

    .line 18
    :cond_3
    iput v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->g:I

    .line 19
    :goto_2
    iget v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->g:I

    goto :goto_0

    :goto_3
    const/4 p2, 0x0

    .line 20
    iput-object p2, p0, Lcom/jumio/ale/swig/ALEInputStream;->e:[B

    .line 21
    new-instance p2, Ljava/io/IOException;

    invoke-direct {p2, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw p2

    :cond_4
    if-ne v0, v1, :cond_5

    return v1

    :cond_5
    if-gtz p3, :cond_6

    return v2

    .line 22
    :cond_6
    iget v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->g:I

    iget v1, p0, Lcom/jumio/ale/swig/ALEInputStream;->f:I

    sub-int/2addr v0, v1

    if-ge p3, v0, :cond_7

    goto :goto_4

    :cond_7
    move p3, v0

    :goto_4
    if-eqz p1, :cond_8

    .line 23
    iget-object v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->e:[B

    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 24
    :cond_8
    iget p1, p0, Lcom/jumio/ale/swig/ALEInputStream;->f:I

    add-int/2addr p1, p3

    iput p1, p0, Lcom/jumio/ale/swig/ALEInputStream;->f:I

    return p3
.end method

.method public skip(J)J
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->g:I

    .line 3
    .line 4
    iget v1, p0, Lcom/jumio/ale/swig/ALEInputStream;->f:I

    .line 5
    sub-int/2addr v0, v1

    .line 6
    int-to-long v2, v0

    .line 7
    .line 8
    cmp-long v0, p1, v2

    .line 9
    .line 10
    if-lez v0, :cond_0

    .line 11
    move-wide p1, v2

    .line 12
    .line 13
    :cond_0
    const-wide/16 v2, 0x0

    .line 14
    .line 15
    cmp-long v0, p1, v2

    .line 16
    .line 17
    if-gez v0, :cond_1

    .line 18
    return-wide v2

    .line 19
    :cond_1
    int-to-long v0, v1

    .line 20
    add-long/2addr v0, p1

    .line 21
    long-to-int v0, v0

    .line 22
    .line 23
    iput v0, p0, Lcom/jumio/ale/swig/ALEInputStream;->f:I

    .line 24
    return-wide p1
.end method
