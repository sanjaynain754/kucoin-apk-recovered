.class public Lcom/jumio/ale/swig/ALEOutputStream;
.super Ljava/io/FilterOutputStream;
.source "SourceFile"


# instance fields
.field public final a:Lcom/jumio/ale/swig/ALERequest;

.field public final b:Ljava/io/OutputStream;

.field public c:[B

.field public d:I

.field public e:Z


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lcom/jumio/ale/swig/ALERequest;I)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    const/4 v0, 0x0

    .line 1
    invoke-direct {p0, p1, p2, v0, p3}, Lcom/jumio/ale/swig/ALEOutputStream;-><init>(Ljava/io/OutputStream;Lcom/jumio/ale/swig/ALERequest;Lcom/jumio/ale/swig/ALEHeader;I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;Lcom/jumio/ale/swig/ALERequest;Lcom/jumio/ale/swig/ALEHeader;I)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    .line 2
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    const/4 v0, 0x0

    .line 3
    iput v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->d:I

    .line 4
    iput-boolean v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->e:Z

    .line 5
    iput-object p1, p0, Lcom/jumio/ale/swig/ALEOutputStream;->b:Ljava/io/OutputStream;

    .line 6
    iput-object p2, p0, Lcom/jumio/ale/swig/ALEOutputStream;->a:Lcom/jumio/ale/swig/ALERequest;

    .line 7
    invoke-virtual {p2, p3, p4}, Lcom/jumio/ale/swig/ALERequest;->calculateRequestInit(Lcom/jumio/ale/swig/ALEHeader;I)I

    move-result v1

    new-array v1, v1, [B

    iput-object v1, p0, Lcom/jumio/ale/swig/ALEOutputStream;->c:[B

    .line 8
    invoke-virtual {p2, p3, p4, v1}, Lcom/jumio/ale/swig/ALERequest;->initRequest(Lcom/jumio/ale/swig/ALEHeader;I[B)I

    move-result p2

    iput p2, p0, Lcom/jumio/ale/swig/ALEOutputStream;->d:I

    .line 9
    iget-object p3, p0, Lcom/jumio/ale/swig/ALEOutputStream;->c:[B

    invoke-virtual {p1, p3, v0, p2}, Ljava/io/OutputStream;->write([BII)V

    return-void
.end method


# virtual methods
.method public close()V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->e:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    return-void

    .line 6
    :cond_0
    const/4 v0, 0x1

    .line 7
    .line 8
    iput-boolean v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->e:Z

    .line 9
    .line 10
    :try_start_0
    iget-object v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->a:Lcom/jumio/ale/swig/ALERequest;

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Lcom/jumio/ale/swig/ALERequest;->calculateRequestFinish()I

    .line 14
    move-result v0

    .line 15
    .line 16
    new-array v0, v0, [B

    .line 17
    .line 18
    iput-object v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->c:[B

    .line 19
    .line 20
    iget-object v1, p0, Lcom/jumio/ale/swig/ALEOutputStream;->a:Lcom/jumio/ale/swig/ALERequest;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1, v0}, Lcom/jumio/ale/swig/ALERequest;->finishRequest([B)I

    .line 24
    move-result v0

    .line 25
    .line 26
    iput v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 27
    goto :goto_0

    .line 28
    :catch_0
    const/4 v0, 0x0

    .line 29
    .line 30
    iput-object v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->c:[B

    .line 31
    const/4 v0, 0x0

    .line 32
    .line 33
    iput v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->d:I

    .line 34
    .line 35
    .line 36
    :goto_0
    :try_start_1
    invoke-virtual {p0}, Lcom/jumio/ale/swig/ALEOutputStream;->flush()V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_1

    .line 37
    .line 38
    :catch_1
    iget-object v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->b:Ljava/io/OutputStream;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 42
    return-void
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

.method public flush()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->c:[B

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    iget-object v1, p0, Lcom/jumio/ale/swig/ALEOutputStream;->b:Ljava/io/OutputStream;

    .line 7
    .line 8
    iget v2, p0, Lcom/jumio/ale/swig/ALEOutputStream;->d:I

    .line 9
    const/4 v3, 0x0

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v0, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    iput-object v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->c:[B

    .line 16
    .line 17
    :cond_0
    iget-object v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->b:Ljava/io/OutputStream;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 21
    return-void
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
.end method

.method public write([B)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    iget-object v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->a:Lcom/jumio/ale/swig/ALERequest;

    array-length v1, p1

    invoke-virtual {v0, v1}, Lcom/jumio/ale/swig/ALERequest;->calculateRequestUpdate(I)I

    move-result v0

    new-array v0, v0, [B

    iput-object v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->c:[B

    .line 7
    :try_start_0
    iget-object v1, p0, Lcom/jumio/ale/swig/ALEOutputStream;->a:Lcom/jumio/ale/swig/ALERequest;

    invoke-virtual {v1, p1, v0}, Lcom/jumio/ale/swig/ALERequest;->updateRequest([B[B)I

    move-result p1

    iput p1, p0, Lcom/jumio/ale/swig/ALEOutputStream;->d:I
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 8
    iget-object v0, p0, Lcom/jumio/ale/swig/ALEOutputStream;->c:[B

    if-eqz v0, :cond_0

    .line 9
    iget-object v1, p0, Lcom/jumio/ale/swig/ALEOutputStream;->b:Ljava/io/OutputStream;

    const/4 v2, 0x0

    invoke-virtual {v1, v0, v2, p1}, Ljava/io/OutputStream;->write([BII)V

    const/4 p1, 0x0

    .line 10
    iput-object p1, p0, Lcom/jumio/ale/swig/ALEOutputStream;->c:[B

    .line 11
    iput v2, p0, Lcom/jumio/ale/swig/ALEOutputStream;->d:I

    :cond_0
    return-void

    :catch_0
    move-exception p1

    .line 12
    new-instance v0, Ljava/io/IOException;

    invoke-direct {v0, p1}, Ljava/io/IOException;-><init>(Ljava/lang/Throwable;)V

    throw v0
.end method

.method public write([BII)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    if-nez p2, :cond_0

    .line 1
    array-length v0, p1

    if-ne p3, v0, :cond_0

    .line 2
    invoke-virtual {p0, p1}, Lcom/jumio/ale/swig/ALEOutputStream;->write([B)V

    return-void

    .line 3
    :cond_0
    new-array v0, p3, [B

    const/4 v1, 0x0

    .line 4
    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 5
    invoke-virtual {p0, v0}, Lcom/jumio/ale/swig/ALEOutputStream;->write([B)V

    return-void
.end method
