.class public Lfr/greweb/reactnativeviewshot/a$d;
.super Ljava/io/ByteArrayOutputStream;
.source "ViewShot.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lfr/greweb/reactnativeviewshot/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "d"
.end annotation


# direct methods
.method public constructor <init>([B)V
    .locals 1
    .param p1    # [B
        .annotation build Landroidx/annotation/NonNull;
        .end annotation
    .end param

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    .line 4
    invoke-direct {p0, v0}, Ljava/io/ByteArrayOutputStream;-><init>(I)V

    .line 5
    .line 6
    iput-object p1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 7
    return-void
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
.end method

.method public static g(I)I
    .locals 1

    .line 1
    .line 2
    if-ltz p0, :cond_1

    .line 3
    .line 4
    .line 5
    const v0, 0x7ffffff7

    .line 6
    .line 7
    if-le p0, v0, :cond_0

    .line 8
    .line 9
    .line 10
    const p0, 0x7fffffff

    .line 11
    return p0

    .line 12
    :cond_0
    return v0

    .line 13
    .line 14
    :cond_1
    new-instance p0, Ljava/lang/OutOfMemoryError;

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Ljava/lang/OutOfMemoryError;-><init>()V

    .line 18
    throw p0
    .line 19
    .line 20
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
.end method


# virtual methods
.method public a(I)Ljava/nio/ByteBuffer;
    .locals 1
    .annotation build Landroidx/annotation/NonNull;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    if-ge v0, p1, :cond_0

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0, p1}, Lfr/greweb/reactnativeviewshot/a$d;->b(I)V

    .line 9
    .line 10
    :cond_0
    iget-object p1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 11
    .line 12
    .line 13
    invoke-static {p1}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 14
    move-result-object p1

    .line 15
    return-object p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
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
.end method

.method public b(I)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    shl-int/lit8 v0, v0, 0x1

    .line 6
    .line 7
    sub-int v1, v0, p1

    .line 8
    .line 9
    if-gez v1, :cond_0

    .line 10
    move v0, p1

    .line 11
    .line 12
    .line 13
    :cond_0
    const v1, 0x7ffffff7

    .line 14
    .line 15
    sub-int v1, v0, v1

    .line 16
    .line 17
    if-lez v1, :cond_1

    .line 18
    .line 19
    .line 20
    invoke-static {p1}, Lfr/greweb/reactnativeviewshot/a$d;->g(I)I

    .line 21
    move-result v0

    .line 22
    .line 23
    :cond_1
    iget-object p1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 24
    .line 25
    .line 26
    invoke-static {p1, v0}, Ljava/util/Arrays;->copyOf([BI)[B

    .line 27
    move-result-object p1

    .line 28
    .line 29
    iput-object p1, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 30
    return-void
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
.end method

.method public h()[B
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Ljava/io/ByteArrayOutputStream;->buf:[B

    .line 3
    return-object v0
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
    .line 19
    .line 20
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
.end method

.method public i(I)V
    .locals 0

    .line 1
    .line 2
    iput p1, p0, Ljava/io/ByteArrayOutputStream;->count:I

    .line 3
    return-void
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
    .line 19
    .line 20
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
.end method
