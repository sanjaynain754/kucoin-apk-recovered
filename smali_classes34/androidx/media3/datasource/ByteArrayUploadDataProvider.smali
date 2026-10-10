.class final Landroidx/media3/datasource/ByteArrayUploadDataProvider;
.super Landroid/net/http/UploadDataProvider;
.source "ByteArrayUploadDataProvider.java"


# annotations
.annotation build Landroidx/annotation/RequiresExtension;
    extension = 0x1f
    version = 0x7
.end annotation


# instance fields
.field private final data:[B

.field private position:I


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Landroid/net/http/UploadDataProvider;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/datasource/ByteArrayUploadDataProvider;->data:[B

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


# virtual methods
.method public getLength()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/datasource/ByteArrayUploadDataProvider;->data:[B

    .line 3
    array-length v0, v0

    .line 4
    int-to-long v0, v0

    .line 5
    return-wide v0
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

.method public read(Landroid/net/http/UploadDataSink;Ljava/nio/ByteBuffer;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p2}, Ljava/nio/Buffer;->remaining()I

    .line 4
    move-result v0

    .line 5
    .line 6
    iget-object v1, p0, Landroidx/media3/datasource/ByteArrayUploadDataProvider;->data:[B

    .line 7
    array-length v1, v1

    .line 8
    .line 9
    iget v2, p0, Landroidx/media3/datasource/ByteArrayUploadDataProvider;->position:I

    .line 10
    sub-int/2addr v1, v2

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    .line 14
    move-result v0

    .line 15
    .line 16
    iget-object v1, p0, Landroidx/media3/datasource/ByteArrayUploadDataProvider;->data:[B

    .line 17
    .line 18
    iget v2, p0, Landroidx/media3/datasource/ByteArrayUploadDataProvider;->position:I

    .line 19
    .line 20
    .line 21
    invoke-virtual {p2, v1, v2, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    .line 22
    .line 23
    iget p2, p0, Landroidx/media3/datasource/ByteArrayUploadDataProvider;->position:I

    .line 24
    add-int/2addr p2, v0

    .line 25
    .line 26
    iput p2, p0, Landroidx/media3/datasource/ByteArrayUploadDataProvider;->position:I

    .line 27
    const/4 p2, 0x0

    .line 28
    .line 29
    .line 30
    invoke-static {p1, p2}, Landroidx/media3/datasource/b;->a(Landroid/net/http/UploadDataSink;Z)V

    .line 31
    return-void
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

.method public rewind(Landroid/net/http/UploadDataSink;)V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    iput v0, p0, Landroidx/media3/datasource/ByteArrayUploadDataProvider;->position:I

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Landroidx/media3/datasource/c;->a(Landroid/net/http/UploadDataSink;)V

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
.end method
