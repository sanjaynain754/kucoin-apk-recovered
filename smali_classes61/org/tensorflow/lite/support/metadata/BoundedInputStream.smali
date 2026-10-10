.class final Lorg/tensorflow/lite/support/metadata/BoundedInputStream;
.super Ljava/io/InputStream;
.source "BoundedInputStream.java"


# instance fields
.field private final channel:Lorg/tensorflow/lite/support/metadata/SeekableByteChannelCompat;

.field private final end:J

.field private position:J

.field private final singleByteBuffer:Ljava/nio/ByteBuffer;


# direct methods
.method public constructor <init>(Lorg/tensorflow/lite/support/metadata/SeekableByteChannelCompat;JJ)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/io/InputStream;-><init>()V

    .line 4
    const/4 v0, 0x1

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    .line 8
    move-result-object v1

    .line 9
    .line 10
    iput-object v1, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->singleByteBuffer:Ljava/nio/ByteBuffer;

    .line 11
    .line 12
    const-wide/16 v1, 0x0

    .line 13
    .line 14
    cmp-long v3, p4, v1

    .line 15
    .line 16
    if-ltz v3, :cond_0

    .line 17
    .line 18
    cmp-long v1, p2, v1

    .line 19
    .line 20
    if-ltz v1, :cond_0

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    const/4 v0, 0x0

    .line 23
    .line 24
    .line 25
    :goto_0
    invoke-static {p2, p3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 26
    move-result-object v1

    .line 27
    .line 28
    .line 29
    invoke-static {p4, p5}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    .line 30
    move-result-object v2

    .line 31
    .line 32
    .line 33
    filled-new-array {v1, v2}, [Ljava/lang/Object;

    .line 34
    move-result-object v1

    .line 35
    .line 36
    const-string v2, "Invalid length of stream at offset=%d, length=%d"

    .line 37
    .line 38
    .line 39
    invoke-static {v2, v1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 40
    move-result-object v1

    .line 41
    .line 42
    .line 43
    invoke-static {v0, v1}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkArgument(ZLjava/lang/Object;)V

    .line 44
    add-long/2addr p4, p2

    .line 45
    .line 46
    iput-wide p4, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->end:J

    .line 47
    .line 48
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->channel:Lorg/tensorflow/lite/support/metadata/SeekableByteChannelCompat;

    .line 49
    .line 50
    iput-wide p2, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->position:J

    .line 51
    return-void
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
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
.end method

.method private read(JLjava/nio/ByteBuffer;)I
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->channel:Lorg/tensorflow/lite/support/metadata/SeekableByteChannelCompat;

    monitor-enter v0

    .line 14
    :try_start_0
    iget-object v1, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->channel:Lorg/tensorflow/lite/support/metadata/SeekableByteChannelCompat;

    invoke-interface {v1, p1, p2}, Lorg/tensorflow/lite/support/metadata/SeekableByteChannelCompat;->position(J)Lorg/tensorflow/lite/support/metadata/SeekableByteChannelCompat;

    .line 15
    iget-object p1, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->channel:Lorg/tensorflow/lite/support/metadata/SeekableByteChannelCompat;

    invoke-interface {p1, p3}, Lorg/tensorflow/lite/support/metadata/SeekableByteChannelCompat;->read(Ljava/nio/ByteBuffer;)I

    move-result p1

    .line 16
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 17
    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    return p1

    :catchall_0
    move-exception p1

    .line 18
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    throw p1
.end method


# virtual methods
.method public available()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-wide v0, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->end:J

    .line 3
    .line 4
    iget-object v2, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->channel:Lorg/tensorflow/lite/support/metadata/SeekableByteChannelCompat;

    .line 5
    .line 6
    .line 7
    invoke-interface {v2}, Lorg/tensorflow/lite/support/metadata/SeekableByteChannelCompat;->size()J

    .line 8
    move-result-wide v2

    .line 9
    .line 10
    .line 11
    invoke-static {v0, v1, v2, v3}, Ljava/lang/Math;->min(JJ)J

    .line 12
    move-result-wide v0

    .line 13
    .line 14
    iget-wide v2, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->position:J

    .line 15
    sub-long/2addr v0, v2

    .line 16
    long-to-int v0, v0

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public read()I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    iget-wide v0, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->position:J

    iget-wide v2, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->end:J

    cmp-long v0, v0, v2

    if-ltz v0, :cond_0

    const/4 v0, -0x1

    return v0

    .line 2
    :cond_0
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->singleByteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 3
    iget-wide v0, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->position:J

    iget-object v2, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->singleByteBuffer:Ljava/nio/ByteBuffer;

    invoke-direct {p0, v0, v1, v2}, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->read(JLjava/nio/ByteBuffer;)I

    move-result v0

    if-gez v0, :cond_1

    return v0

    .line 4
    :cond_1
    iget-wide v0, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->position:J

    const-wide/16 v2, 0x1

    add-long/2addr v0, v2

    iput-wide v0, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->position:J

    .line 5
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->singleByteBuffer:Ljava/nio/ByteBuffer;

    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->get()B

    move-result v0

    and-int/lit16 v0, v0, 0xff

    return v0
.end method

.method public read([BII)I
    .locals 8
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 6
    invoke-static {p1}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 7
    array-length v0, p1

    const-string v1, "The start offset"

    invoke-static {p2, v0, v1}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkElementIndex(IILjava/lang/String;)I

    .line 8
    array-length v0, p1

    sub-int/2addr v0, p2

    add-int/lit8 v0, v0, 0x1

    const-string v1, "The maximumn number of bytes to read"

    invoke-static {p3, v0, v1}, Lorg/tensorflow/lite/support/metadata/Preconditions;->checkElementIndex(IILjava/lang/String;)I

    if-nez p3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    int-to-long v0, p3

    .line 9
    iget-wide v2, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->end:J

    iget-wide v4, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->position:J

    sub-long v6, v2, v4

    cmp-long v0, v0, v6

    if-lez v0, :cond_2

    cmp-long p3, v4, v2

    if-ltz p3, :cond_1

    const/4 p1, -0x1

    return p1

    :cond_1
    sub-long/2addr v2, v4

    long-to-int p3, v2

    .line 10
    :cond_2
    invoke-static {p1, p2, p3}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 11
    iget-wide p2, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->position:J

    invoke-direct {p0, p2, p3, p1}, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->read(JLjava/nio/ByteBuffer;)I

    move-result p1

    if-lez p1, :cond_3

    .line 12
    iget-wide p2, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->position:J

    int-to-long v0, p1

    add-long/2addr p2, v0

    iput-wide p2, p0, Lorg/tensorflow/lite/support/metadata/BoundedInputStream;->position:J

    :cond_3
    return p1
.end method
