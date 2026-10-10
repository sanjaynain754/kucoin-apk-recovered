.class public final Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;
.super Ljava/io/ByteArrayOutputStream;


# static fields
.field private static final l1111l111111Il:I = 0x100


# instance fields
.field private final l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;


# direct methods
.method private constructor <init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;)V
    .locals 1

    .line 1
    const/16 v0, 0x100

    invoke-direct {p0, p1, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;-><init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;I)V

    return-void
.end method

.method public constructor <init>(Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;I)V
    .locals 1

    .line 2
    invoke-direct {p0}, Ljava/io/ByteArrayOutputStream;-><init>()V

    iput-object p1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;

    const/16 v0, 0x100

    invoke-static {p2, v0}, Ljava/lang/Math;->max(II)I

    move-result p2

    invoke-virtual {p1, p2}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;->l1111l111111Il(I)[B

    move-result-object p1

    iput-object p1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    return-void
.end method

.method private l1111l111111Il(I)V
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Ljava/io/ByteArrayOutputStream;->count:I

    .line 3
    .line 4
    add-int v1, v0, p1

    .line 5
    .line 6
    iget-object v2, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 7
    array-length v2, v2

    .line 8
    .line 9
    if-gt v1, v2, :cond_0

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    iget-object v1, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;

    .line 13
    add-int/2addr v0, p1

    .line 14
    .line 15
    shl-int/lit8 p1, v0, 0x1

    .line 16
    .line 17
    .line 18
    invoke-virtual {v1, p1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;->l1111l111111Il(I)[B

    .line 19
    move-result-object p1

    .line 20
    .line 21
    iget-object v0, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 22
    .line 23
    iget v1, p0, Ljava/io/ByteArrayOutputStream;->count:I

    .line 24
    const/4 v2, 0x0

    .line 25
    .line 26
    .line 27
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 28
    .line 29
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;

    .line 30
    .line 31
    iget-object v1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;->l1111l111111Il([B)V

    .line 35
    .line 36
    iput-object p1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 37
    return-void
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
    .line 94
    .line 95
    .line 96
    .line 97
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
    .line 109
    .line 110
    .line 111
.end method


# virtual methods
.method public final close()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;

    .line 3
    .line 4
    iget-object v1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;->l1111l111111Il([B)V

    .line 8
    const/4 v0, 0x0

    .line 9
    .line 10
    iput-object v0, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 11
    .line 12
    .line 13
    invoke-super {p0}, Ljava/io/ByteArrayOutputStream;->close()V

    .line 14
    return-void
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method public final finalize()V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;->l111l11111lIl:Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;

    .line 3
    .line 4
    iget-object v1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 5
    .line 6
    .line 7
    invoke-virtual {v0, v1}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l111l11111I1l;->l1111l111111Il([B)V

    .line 8
    return-void
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
.end method

.method public final declared-synchronized write(I)V
    .locals 1

    .line 1
    monitor-enter p0

    const/4 v0, 0x1

    :try_start_0
    invoke-direct {p0, v0}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;->l1111l111111Il(I)V

    invoke-super {p0, p1}, Ljava/io/ByteArrayOutputStream;->write(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method

.method public final declared-synchronized write([BII)V
    .locals 0

    .line 2
    monitor-enter p0

    :try_start_0
    invoke-direct {p0, p3}, Lcom/ishumei/smantifraud/l111l1111l1Il/l1111l111111Il/l1111l111111Il/l11l1111lIIl;->l1111l111111Il(I)V

    invoke-super {p0, p1, p2, p3}, Ljava/io/ByteArrayOutputStream;->write([BII)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    return-void

    :catchall_0
    move-exception p1

    :try_start_1
    monitor-exit p0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method
