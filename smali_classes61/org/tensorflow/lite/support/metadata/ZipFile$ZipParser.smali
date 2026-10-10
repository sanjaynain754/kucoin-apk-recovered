.class Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;
.super Ljava/lang/Object;
.source "ZipFile.java"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lorg/tensorflow/lite/support/metadata/ZipFile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "ZipParser"
.end annotation


# instance fields
.field private final archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

.field private final intBuffer:Ljava/nio/ByteBuffer;

.field private final longBuffer:Ljava/nio/ByteBuffer;

.field private final shortBuffer:Ljava/nio/ByteBuffer;


# direct methods
.method private constructor <init>(Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;)V
    .locals 2

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0x8

    .line 3
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    sget-object v1, Ljava/nio/ByteOrder;->LITTLE_ENDIAN:Ljava/nio/ByteOrder;

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->longBuffer:Ljava/nio/ByteBuffer;

    const/4 v0, 0x4

    .line 4
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->intBuffer:Ljava/nio/ByteBuffer;

    const/4 v0, 0x2

    .line 5
    invoke-static {v0}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer;

    move-result-object v0

    invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;

    move-result-object v0

    iput-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->shortBuffer:Ljava/nio/ByteBuffer;

    .line 6
    iput-object p1, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    return-void
.end method

.method public synthetic constructor <init>(Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;Lorg/tensorflow/lite/support/metadata/ZipFile$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;-><init>(Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;)V

    return-void
.end method

.method public static synthetic access$100(Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;)Ljava/util/Map;
    .locals 0
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->parseEntries()Ljava/util/Map;

    .line 4
    move-result-object p0

    .line 5
    return-object p0
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
.end method

.method private foundCentralFileheaderSignature()Z
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->getInt()I

    .line 4
    move-result v0

    .line 5
    int-to-long v0, v0

    .line 6
    .line 7
    .line 8
    const-wide/32 v2, 0x2014b50    # 1.6619997E-316

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    if-nez v0, :cond_0

    .line 13
    const/4 v0, 0x1

    .line 14
    return v0

    .line 15
    :cond_0
    const/4 v0, 0x0

    .line 16
    return v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private getInt()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->intBuffer:Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 6
    .line 7
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 8
    .line 9
    iget-object v1, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->intBuffer:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 13
    .line 14
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->intBuffer:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 18
    .line 19
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->intBuffer:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getInt()I

    .line 23
    move-result v0

    .line 24
    return v0
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
.end method

.method private getLong()J
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->longBuffer:Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 6
    .line 7
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 8
    .line 9
    iget-object v1, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->longBuffer:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 13
    .line 14
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->longBuffer:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 18
    .line 19
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->longBuffer:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getLong()J

    .line 23
    move-result-wide v0

    .line 24
    return-wide v0
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
.end method

.method private getShort()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->shortBuffer:Ljava/nio/ByteBuffer;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;

    .line 6
    .line 7
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 8
    .line 9
    iget-object v1, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->shortBuffer:Ljava/nio/ByteBuffer;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 13
    .line 14
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->shortBuffer:Ljava/nio/ByteBuffer;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->flip()Ljava/nio/Buffer;

    .line 18
    .line 19
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->shortBuffer:Ljava/nio/ByteBuffer;

    .line 20
    .line 21
    .line 22
    invoke-virtual {v0}, Ljava/nio/ByteBuffer;->getShort()S

    .line 23
    move-result v0

    .line 24
    return v0
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
.end method

.method private locateCentralDirectory()V
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->size()J

    .line 6
    move-result-wide v0

    .line 7
    .line 8
    const-wide/16 v2, 0x16

    .line 9
    .line 10
    cmp-long v0, v0, v2

    .line 11
    .line 12
    const-string v1, "The archive is not a ZIP archive."

    .line 13
    .line 14
    if-ltz v0, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 17
    .line 18
    .line 19
    invoke-virtual {v0}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->size()J

    .line 20
    move-result-wide v4

    .line 21
    sub-long/2addr v4, v2

    .line 22
    .line 23
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v4, v5}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->position(J)Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 27
    .line 28
    .line 29
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->getLong()J

    .line 30
    move-result-wide v2

    .line 31
    .line 32
    .line 33
    const-wide/32 v4, 0x6054b50

    .line 34
    .line 35
    cmp-long v0, v2, v4

    .line 36
    .line 37
    if-nez v0, :cond_0

    .line 38
    .line 39
    const/16 v0, 0x8

    .line 40
    .line 41
    .line 42
    invoke-direct {p0, v0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->skipBytes(I)V

    .line 43
    .line 44
    .line 45
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->getInt()I

    .line 46
    move-result v0

    .line 47
    int-to-long v0, v0

    .line 48
    .line 49
    iget-object v2, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 50
    .line 51
    .line 52
    invoke-virtual {v2, v0, v1}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->position(J)Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 53
    return-void

    .line 54
    .line 55
    :cond_0
    new-instance v0, Ljava/util/zip/ZipException;

    .line 56
    .line 57
    .line 58
    invoke-direct {v0, v1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 59
    throw v0

    .line 60
    .line 61
    :cond_1
    new-instance v0, Ljava/util/zip/ZipException;

    .line 62
    .line 63
    .line 64
    invoke-direct {v0, v1}, Ljava/util/zip/ZipException;-><init>(Ljava/lang/String;)V

    .line 65
    throw v0
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
.end method

.method private parseCentralDirectory()Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;",
            ">;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/ArrayList;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->locateCentralDirectory()V

    .line 9
    .line 10
    .line 11
    :goto_0
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->foundCentralFileheaderSignature()Z

    .line 12
    move-result v1

    .line 13
    .line 14
    if-eqz v1, :cond_0

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->parseCentralDirectoryEntry()Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;

    .line 18
    move-result-object v1

    .line 19
    .line 20
    .line 21
    invoke-interface {v0, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    return-object v0
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
.end method

.method private parseCentralDirectoryEntry()Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->skipBytes(I)V

    .line 6
    .line 7
    .line 8
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->getInt()I

    .line 9
    move-result v0

    .line 10
    int-to-long v0, v0

    .line 11
    const/4 v2, 0x4

    .line 12
    .line 13
    .line 14
    invoke-direct {p0, v2}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->skipBytes(I)V

    .line 15
    .line 16
    .line 17
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->getShort()I

    .line 18
    move-result v2

    .line 19
    .line 20
    .line 21
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->getShort()I

    .line 22
    move-result v3

    .line 23
    .line 24
    .line 25
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->getShort()I

    .line 26
    move-result v4

    .line 27
    .line 28
    const/16 v5, 0x8

    .line 29
    .line 30
    .line 31
    invoke-direct {p0, v5}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->skipBytes(I)V

    .line 32
    .line 33
    .line 34
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->getInt()I

    .line 35
    move-result v5

    .line 36
    int-to-long v5, v5

    .line 37
    .line 38
    new-array v2, v2, [B

    .line 39
    .line 40
    iget-object v7, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 41
    .line 42
    .line 43
    invoke-static {v2}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    .line 44
    move-result-object v8

    .line 45
    .line 46
    .line 47
    invoke-virtual {v7, v8}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->read(Ljava/nio/ByteBuffer;)I

    .line 48
    .line 49
    new-instance v7, Ljava/lang/String;

    .line 50
    .line 51
    const-string v8, "UTF-8"

    .line 52
    .line 53
    .line 54
    invoke-static {v8}, Ljava/nio/charset/Charset;->forName(Ljava/lang/String;)Ljava/nio/charset/Charset;

    .line 55
    move-result-object v8

    .line 56
    .line 57
    .line 58
    invoke-direct {v7, v2, v8}, Ljava/lang/String;-><init>([BLjava/nio/charset/Charset;)V

    .line 59
    add-int/2addr v3, v4

    .line 60
    .line 61
    .line 62
    invoke-direct {p0, v3}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->skipBytes(I)V

    .line 63
    .line 64
    new-instance v2, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;

    .line 65
    const/4 v3, 0x0

    .line 66
    .line 67
    .line 68
    invoke-direct {v2, v3}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;-><init>(Lorg/tensorflow/lite/support/metadata/ZipFile$1;)V

    .line 69
    .line 70
    .line 71
    invoke-virtual {v2, v0, v1}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;->setSize(J)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v2, v5, v6}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;->setLocalHeaderOffset(J)V

    .line 75
    .line 76
    .line 77
    invoke-virtual {v2, v7}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;->setName(Ljava/lang/String;)V

    .line 78
    return-object v2
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
.end method

.method private parseEntries()Ljava/util/Map;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;",
            ">;>;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->parseCentralDirectory()Ljava/util/List;

    .line 4
    move-result-object v0

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->parseLocalFileHeaderData(Ljava/util/List;)Ljava/util/Map;

    .line 8
    move-result-object v0

    .line 9
    return-object v0
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
.end method

.method private parseLocalFileHeaderData(Ljava/util/List;)Ljava/util/Map;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;",
            ">;)",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Ljava/util/List<",
            "Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;",
            ">;>;"
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/util/LinkedHashMap;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 9
    move-result-object p1

    .line 10
    .line 11
    .line 12
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    .line 13
    move-result v1

    .line 14
    .line 15
    if-eqz v1, :cond_1

    .line 16
    .line 17
    .line 18
    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 19
    move-result-object v1

    .line 20
    .line 21
    check-cast v1, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;

    .line 22
    .line 23
    .line 24
    invoke-virtual {v1}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;->getLocalHeaderOffset()J

    .line 25
    move-result-wide v2

    .line 26
    .line 27
    iget-object v4, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 28
    .line 29
    const-wide/16 v5, 0x1a

    .line 30
    add-long/2addr v5, v2

    .line 31
    .line 32
    .line 33
    invoke-virtual {v4, v5, v6}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->position(J)Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 34
    .line 35
    .line 36
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->getShort()I

    .line 37
    move-result v4

    .line 38
    .line 39
    .line 40
    invoke-direct {p0}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->getShort()I

    .line 41
    move-result v5

    .line 42
    .line 43
    const-wide/16 v6, 0x1e

    .line 44
    add-long/2addr v2, v6

    .line 45
    int-to-long v6, v4

    .line 46
    add-long/2addr v2, v6

    .line 47
    int-to-long v4, v5

    .line 48
    add-long/2addr v2, v4

    .line 49
    .line 50
    .line 51
    invoke-virtual {v1, v2, v3}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;->setDataOffset(J)V

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1}, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipEntry;->getName()Ljava/lang/String;

    .line 55
    move-result-object v2

    .line 56
    .line 57
    .line 58
    invoke-interface {v0, v2}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    .line 59
    move-result v3

    .line 60
    .line 61
    if-eqz v3, :cond_0

    .line 62
    .line 63
    .line 64
    invoke-interface {v0, v2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 65
    move-result-object v2

    .line 66
    .line 67
    check-cast v2, Ljava/util/List;

    .line 68
    goto :goto_1

    .line 69
    .line 70
    :cond_0
    new-instance v3, Ljava/util/ArrayList;

    .line 71
    .line 72
    .line 73
    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    .line 74
    .line 75
    .line 76
    invoke-interface {v0, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 77
    move-object v2, v3

    .line 78
    .line 79
    .line 80
    :goto_1
    invoke-interface {v2, v1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 81
    goto :goto_0

    .line 82
    :cond_1
    return-object v0
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
.end method

.method private skipBytes(I)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->position()J

    .line 6
    move-result-wide v0

    .line 7
    int-to-long v2, p1

    .line 8
    add-long/2addr v0, v2

    .line 9
    .line 10
    iget-object p1, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->size()J

    .line 14
    move-result-wide v2

    .line 15
    .line 16
    cmp-long p1, v0, v2

    .line 17
    .line 18
    if-gtz p1, :cond_0

    .line 19
    .line 20
    iget-object p1, p0, Lorg/tensorflow/lite/support/metadata/ZipFile$ZipParser;->archive:Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v0, v1}, Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;->position(J)Lorg/tensorflow/lite/support/metadata/ByteBufferChannel;

    .line 24
    return-void

    .line 25
    .line 26
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    .line 27
    .line 28
    .line 29
    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    .line 30
    throw p1
.end method
