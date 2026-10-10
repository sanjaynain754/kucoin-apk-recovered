.class public final Landroidx/media3/datasource/ByteArrayDataSource;
.super Landroidx/media3/datasource/BaseDataSource;
.source "ByteArrayDataSource.java"


# annotations
.annotation build Landroidx/media3/common/util/UnstableApi;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/datasource/ByteArrayDataSource$UriResolver;
    }
.end annotation


# instance fields
.field private bytesRemaining:I

.field private data:[B
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private opened:Z

.field private readPosition:I

.field private uri:Landroid/net/Uri;
    .annotation build Landroidx/annotation/Nullable;
    .end annotation
.end field

.field private final uriResolver:Landroidx/media3/datasource/ByteArrayDataSource$UriResolver;


# direct methods
.method public constructor <init>(Landroidx/media3/datasource/ByteArrayDataSource$UriResolver;)V
    .locals 1

    const/4 v0, 0x0

    .line 3
    invoke-direct {p0, v0}, Landroidx/media3/datasource/BaseDataSource;-><init>(Z)V

    .line 4
    invoke-static {p1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroidx/media3/datasource/ByteArrayDataSource$UriResolver;

    iput-object p1, p0, Landroidx/media3/datasource/ByteArrayDataSource;->uriResolver:Landroidx/media3/datasource/ByteArrayDataSource$UriResolver;

    return-void
.end method

.method public constructor <init>([B)V
    .locals 1

    .line 1
    new-instance v0, Landroidx/media3/datasource/a;

    invoke-direct {v0, p1}, Landroidx/media3/datasource/a;-><init>([B)V

    invoke-direct {p0, v0}, Landroidx/media3/datasource/ByteArrayDataSource;-><init>(Landroidx/media3/datasource/ByteArrayDataSource$UriResolver;)V

    .line 2
    array-length p1, p1

    if-lez p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p1}, Landroidx/media3/common/util/Assertions;->checkArgument(Z)V

    return-void
.end method

.method public static synthetic b([BLandroid/net/Uri;)[B
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


# virtual methods
.method public close()V
    .locals 1

    .line 1
    .line 2
    iget-boolean v0, p0, Landroidx/media3/datasource/ByteArrayDataSource;->opened:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    const/4 v0, 0x0

    .line 6
    .line 7
    iput-boolean v0, p0, Landroidx/media3/datasource/ByteArrayDataSource;->opened:Z

    .line 8
    .line 9
    .line 10
    invoke-virtual {p0}, Landroidx/media3/datasource/BaseDataSource;->transferEnded()V

    .line 11
    :cond_0
    const/4 v0, 0x0

    .line 12
    .line 13
    iput-object v0, p0, Landroidx/media3/datasource/ByteArrayDataSource;->uri:Landroid/net/Uri;

    .line 14
    .line 15
    iput-object v0, p0, Landroidx/media3/datasource/ByteArrayDataSource;->data:[B

    .line 16
    return-void
    .line 17
    .line 18
.end method

.method public getUri()Landroid/net/Uri;
    .locals 1
    .annotation build Landroidx/annotation/Nullable;
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/datasource/ByteArrayDataSource;->uri:Landroid/net/Uri;

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
.end method

.method public open(Landroidx/media3/datasource/DataSpec;)J
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0, p1}, Landroidx/media3/datasource/BaseDataSource;->transferInitializing(Landroidx/media3/datasource/DataSpec;)V

    .line 4
    .line 5
    iget-object v0, p1, Landroidx/media3/datasource/DataSpec;->uri:Landroid/net/Uri;

    .line 6
    .line 7
    iput-object v0, p0, Landroidx/media3/datasource/ByteArrayDataSource;->uri:Landroid/net/Uri;

    .line 8
    .line 9
    iget-object v1, p0, Landroidx/media3/datasource/ByteArrayDataSource;->uriResolver:Landroidx/media3/datasource/ByteArrayDataSource$UriResolver;

    .line 10
    .line 11
    .line 12
    invoke-interface {v1, v0}, Landroidx/media3/datasource/ByteArrayDataSource$UriResolver;->resolve(Landroid/net/Uri;)[B

    .line 13
    move-result-object v0

    .line 14
    .line 15
    iput-object v0, p0, Landroidx/media3/datasource/ByteArrayDataSource;->data:[B

    .line 16
    .line 17
    iget-wide v1, p1, Landroidx/media3/datasource/DataSpec;->position:J

    .line 18
    array-length v3, v0

    .line 19
    int-to-long v3, v3

    .line 20
    .line 21
    cmp-long v3, v1, v3

    .line 22
    .line 23
    if-gtz v3, :cond_2

    .line 24
    long-to-int v3, v1

    .line 25
    .line 26
    iput v3, p0, Landroidx/media3/datasource/ByteArrayDataSource;->readPosition:I

    .line 27
    array-length v0, v0

    .line 28
    long-to-int v1, v1

    .line 29
    sub-int/2addr v0, v1

    .line 30
    .line 31
    iput v0, p0, Landroidx/media3/datasource/ByteArrayDataSource;->bytesRemaining:I

    .line 32
    .line 33
    iget-wide v1, p1, Landroidx/media3/datasource/DataSpec;->length:J

    .line 34
    .line 35
    const-wide/16 v3, -0x1

    .line 36
    .line 37
    cmp-long v5, v1, v3

    .line 38
    .line 39
    if-eqz v5, :cond_0

    .line 40
    int-to-long v5, v0

    .line 41
    .line 42
    .line 43
    invoke-static {v5, v6, v1, v2}, Ljava/lang/Math;->min(JJ)J

    .line 44
    move-result-wide v0

    .line 45
    long-to-int v0, v0

    .line 46
    .line 47
    iput v0, p0, Landroidx/media3/datasource/ByteArrayDataSource;->bytesRemaining:I

    .line 48
    :cond_0
    const/4 v0, 0x1

    .line 49
    .line 50
    iput-boolean v0, p0, Landroidx/media3/datasource/ByteArrayDataSource;->opened:Z

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, p1}, Landroidx/media3/datasource/BaseDataSource;->transferStarted(Landroidx/media3/datasource/DataSpec;)V

    .line 54
    .line 55
    iget-wide v0, p1, Landroidx/media3/datasource/DataSpec;->length:J

    .line 56
    .line 57
    cmp-long p1, v0, v3

    .line 58
    .line 59
    if-eqz p1, :cond_1

    .line 60
    return-wide v0

    .line 61
    .line 62
    :cond_1
    iget p1, p0, Landroidx/media3/datasource/ByteArrayDataSource;->bytesRemaining:I

    .line 63
    int-to-long v0, p1

    .line 64
    return-wide v0

    .line 65
    .line 66
    :cond_2
    new-instance p1, Landroidx/media3/datasource/DataSourceException;

    .line 67
    .line 68
    const/16 v0, 0x7d8

    .line 69
    .line 70
    .line 71
    invoke-direct {p1, v0}, Landroidx/media3/datasource/DataSourceException;-><init>(I)V

    .line 72
    throw p1
.end method

.method public read([BII)I
    .locals 2

    .line 1
    .line 2
    if-nez p3, :cond_0

    .line 3
    const/4 p1, 0x0

    .line 4
    return p1

    .line 5
    .line 6
    :cond_0
    iget v0, p0, Landroidx/media3/datasource/ByteArrayDataSource;->bytesRemaining:I

    .line 7
    .line 8
    if-nez v0, :cond_1

    .line 9
    const/4 p1, -0x1

    .line 10
    return p1

    .line 11
    .line 12
    .line 13
    :cond_1
    invoke-static {p3, v0}, Ljava/lang/Math;->min(II)I

    .line 14
    move-result p3

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/datasource/ByteArrayDataSource;->data:[B

    .line 17
    .line 18
    .line 19
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkStateNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 20
    move-result-object v0

    .line 21
    .line 22
    iget v1, p0, Landroidx/media3/datasource/ByteArrayDataSource;->readPosition:I

    .line 23
    .line 24
    .line 25
    invoke-static {v0, v1, p1, p2, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 26
    .line 27
    iget p1, p0, Landroidx/media3/datasource/ByteArrayDataSource;->readPosition:I

    .line 28
    add-int/2addr p1, p3

    .line 29
    .line 30
    iput p1, p0, Landroidx/media3/datasource/ByteArrayDataSource;->readPosition:I

    .line 31
    .line 32
    iget p1, p0, Landroidx/media3/datasource/ByteArrayDataSource;->bytesRemaining:I

    .line 33
    sub-int/2addr p1, p3

    .line 34
    .line 35
    iput p1, p0, Landroidx/media3/datasource/ByteArrayDataSource;->bytesRemaining:I

    .line 36
    .line 37
    .line 38
    invoke-virtual {p0, p3}, Landroidx/media3/datasource/BaseDataSource;->bytesTransferred(I)V

    .line 39
    return p3
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
