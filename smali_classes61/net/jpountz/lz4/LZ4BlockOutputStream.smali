.class public Lnet/jpountz/lz4/LZ4BlockOutputStream;
.super Ljava/io/FilterOutputStream;
.source "LZ4BlockOutputStream.java"


# static fields
.field static final synthetic $assertionsDisabled:Z = false

.field static final COMPRESSION_LEVEL_BASE:I = 0xa

.field static final COMPRESSION_METHOD_LZ4:I = 0x20

.field static final COMPRESSION_METHOD_RAW:I = 0x10

.field static final DEFAULT_SEED:I = -0x68b84d74

.field static final HEADER_LENGTH:I

.field static final MAGIC:[B

.field static final MAGIC_LENGTH:I

.field static final MAX_BLOCK_SIZE:I = 0x2000000

.field static final MIN_BLOCK_SIZE:I = 0x40


# instance fields
.field private final blockSize:I

.field private final buffer:[B

.field private final checksum:Ljava/util/zip/Checksum;

.field private final compressedBuffer:[B

.field private final compressionLevel:I

.field private final compressor:Lnet/jpountz/lz4/LZ4Compressor;

.field private finished:Z

.field private o:I

.field private final syncFlush:Z


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x8

    .line 3
    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    sput-object v0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->MAGIC:[B

    .line 10
    array-length v0, v0

    .line 11
    .line 12
    sput v0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->MAGIC_LENGTH:I

    .line 13
    .line 14
    add-int/lit8 v0, v0, 0xd

    .line 15
    .line 16
    sput v0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->HEADER_LENGTH:I

    .line 17
    return-void

    .line 18
    nop

    .line 19
    .line 20
    .line 21
    :array_0
    .array-data 1
        0x4ct
        0x5at
        0x34t
        0x42t
        0x6ct
        0x6ft
        0x63t
        0x6bt
    .end array-data
.end method

.method public constructor <init>(Ljava/io/OutputStream;)V
    .locals 1

    const/high16 v0, 0x10000

    .line 15
    invoke-direct {p0, p1, v0}, Lnet/jpountz/lz4/LZ4BlockOutputStream;-><init>(Ljava/io/OutputStream;I)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;I)V
    .locals 1

    .line 14
    invoke-static {}, Lnet/jpountz/lz4/LZ4Factory;->fastestInstance()Lnet/jpountz/lz4/LZ4Factory;

    move-result-object v0

    invoke-virtual {v0}, Lnet/jpountz/lz4/LZ4Factory;->fastCompressor()Lnet/jpountz/lz4/LZ4Compressor;

    move-result-object v0

    invoke-direct {p0, p1, p2, v0}, Lnet/jpountz/lz4/LZ4BlockOutputStream;-><init>(Ljava/io/OutputStream;ILnet/jpountz/lz4/LZ4Compressor;)V

    return-void
.end method

.method public constructor <init>(Ljava/io/OutputStream;ILnet/jpountz/lz4/LZ4Compressor;)V
    .locals 0

    .line 13
    invoke-static {}, Lnet/jpountz/xxhash/e;->b()Lnet/jpountz/xxhash/e;

    move-result-object p1

    const p2, -0x68b84d74

    invoke-virtual {p1, p2}, Lnet/jpountz/xxhash/e;->g(I)Lnet/jpountz/xxhash/a;

    const/4 p1, 0x0

    throw p1
.end method

.method public constructor <init>(Ljava/io/OutputStream;ILnet/jpountz/lz4/LZ4Compressor;Ljava/util/zip/Checksum;Z)V
    .locals 0

    .line 1
    invoke-direct {p0, p1}, Ljava/io/FilterOutputStream;-><init>(Ljava/io/OutputStream;)V

    .line 2
    iput p2, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->blockSize:I

    .line 3
    iput-object p3, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressor:Lnet/jpountz/lz4/LZ4Compressor;

    .line 4
    iput-object p4, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->checksum:Ljava/util/zip/Checksum;

    .line 5
    invoke-static {p2}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressionLevel(I)I

    move-result p1

    iput p1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressionLevel:I

    .line 6
    new-array p1, p2, [B

    iput-object p1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->buffer:[B

    .line 7
    sget p1, Lnet/jpountz/lz4/LZ4BlockOutputStream;->HEADER_LENGTH:I

    invoke-virtual {p3, p2}, Lnet/jpountz/lz4/LZ4Compressor;->maxCompressedLength(I)I

    move-result p2

    add-int/2addr p1, p2

    .line 8
    new-array p1, p1, [B

    iput-object p1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressedBuffer:[B

    .line 9
    iput-boolean p5, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->syncFlush:Z

    const/4 p2, 0x0

    .line 10
    iput p2, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    .line 11
    iput-boolean p2, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->finished:Z

    .line 12
    sget-object p3, Lnet/jpountz/lz4/LZ4BlockOutputStream;->MAGIC:[B

    sget p4, Lnet/jpountz/lz4/LZ4BlockOutputStream;->MAGIC_LENGTH:I

    invoke-static {p3, p2, p1, p2, p4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-void
.end method

.method private static compressionLevel(I)I
    .locals 3

    .line 1
    .line 2
    const/16 v0, 0x40

    .line 3
    .line 4
    if-lt p0, v0, :cond_1

    .line 5
    .line 6
    const/high16 v0, 0x2000000

    .line 7
    .line 8
    if-gt p0, v0, :cond_0

    .line 9
    .line 10
    add-int/lit8 p0, p0, -0x1

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->numberOfLeadingZeros(I)I

    .line 14
    move-result p0

    .line 15
    .line 16
    rsub-int/lit8 p0, p0, 0x16

    .line 17
    const/4 v0, 0x0

    .line 18
    .line 19
    .line 20
    invoke-static {v0, p0}, Ljava/lang/Math;->max(II)I

    .line 21
    move-result p0

    .line 22
    return p0

    .line 23
    .line 24
    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 25
    .line 26
    new-instance v1, Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 30
    .line 31
    const-string v2, "blockSize must be <= 33554432, got "

    .line 32
    .line 33
    .line 34
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 35
    .line 36
    .line 37
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    move-result-object p0

    .line 42
    .line 43
    .line 44
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 45
    throw v0

    .line 46
    .line 47
    :cond_1
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 48
    .line 49
    new-instance v1, Ljava/lang/StringBuilder;

    .line 50
    .line 51
    .line 52
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 53
    .line 54
    const-string v2, "blockSize must be >= 64, got "

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 64
    move-result-object p0

    .line 65
    .line 66
    .line 67
    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 68
    throw v0
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
.end method

.method private ensureNotFinished()V
    .locals 2

    .line 1
    .line 2
    iget-boolean v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->finished:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 8
    .line 9
    const-string v1, "This stream is already closed"

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 13
    throw v0
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method private flushBufferedData()V
    .locals 11
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->checksum:Ljava/util/zip/Checksum;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0}, Ljava/util/zip/Checksum;->reset()V

    .line 11
    .line 12
    iget-object v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->checksum:Ljava/util/zip/Checksum;

    .line 13
    .line 14
    iget-object v1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->buffer:[B

    .line 15
    .line 16
    iget v2, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    .line 17
    const/4 v3, 0x0

    .line 18
    .line 19
    .line 20
    invoke-interface {v0, v1, v3, v2}, Ljava/util/zip/Checksum;->update([BII)V

    .line 21
    .line 22
    iget-object v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->checksum:Ljava/util/zip/Checksum;

    .line 23
    .line 24
    .line 25
    invoke-interface {v0}, Ljava/util/zip/Checksum;->getValue()J

    .line 26
    move-result-wide v0

    .line 27
    long-to-int v0, v0

    .line 28
    .line 29
    iget-object v4, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressor:Lnet/jpountz/lz4/LZ4Compressor;

    .line 30
    .line 31
    iget-object v5, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->buffer:[B

    .line 32
    .line 33
    iget v7, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    .line 34
    .line 35
    iget-object v8, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressedBuffer:[B

    .line 36
    .line 37
    sget v9, Lnet/jpountz/lz4/LZ4BlockOutputStream;->HEADER_LENGTH:I

    .line 38
    const/4 v6, 0x0

    .line 39
    .line 40
    .line 41
    invoke-virtual/range {v4 .. v9}, Lnet/jpountz/lz4/LZ4Compressor;->compress([BII[BI)I

    .line 42
    move-result v1

    .line 43
    .line 44
    iget v2, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    .line 45
    .line 46
    if-lt v1, v2, :cond_1

    .line 47
    .line 48
    iget-object v1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->buffer:[B

    .line 49
    .line 50
    iget-object v4, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressedBuffer:[B

    .line 51
    .line 52
    .line 53
    invoke-static {v1, v3, v4, v9, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 54
    .line 55
    const/16 v1, 0x10

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_1
    const/16 v2, 0x20

    .line 59
    move v10, v2

    .line 60
    move v2, v1

    .line 61
    move v1, v10

    .line 62
    .line 63
    :goto_0
    iget-object v4, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressedBuffer:[B

    .line 64
    .line 65
    sget v5, Lnet/jpountz/lz4/LZ4BlockOutputStream;->MAGIC_LENGTH:I

    .line 66
    .line 67
    iget v6, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressionLevel:I

    .line 68
    or-int/2addr v1, v6

    .line 69
    int-to-byte v1, v1

    .line 70
    .line 71
    aput-byte v1, v4, v5

    .line 72
    .line 73
    add-int/lit8 v1, v5, 0x1

    .line 74
    .line 75
    .line 76
    invoke-static {v2, v4, v1}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->writeIntLE(I[BI)V

    .line 77
    .line 78
    iget v1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    .line 79
    .line 80
    iget-object v4, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressedBuffer:[B

    .line 81
    .line 82
    add-int/lit8 v6, v5, 0x5

    .line 83
    .line 84
    .line 85
    invoke-static {v1, v4, v6}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->writeIntLE(I[BI)V

    .line 86
    .line 87
    iget-object v1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressedBuffer:[B

    .line 88
    .line 89
    add-int/lit8 v5, v5, 0x9

    .line 90
    .line 91
    .line 92
    invoke-static {v0, v1, v5}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->writeIntLE(I[BI)V

    .line 93
    .line 94
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    .line 95
    .line 96
    iget-object v1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressedBuffer:[B

    .line 97
    add-int/2addr v9, v2

    .line 98
    .line 99
    .line 100
    invoke-virtual {v0, v1, v3, v9}, Ljava/io/OutputStream;->write([BII)V

    .line 101
    .line 102
    iput v3, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    .line 103
    return-void
    .line 104
    .line 105
    .line 106
    .line 107
.end method

.method private static writeIntLE(I[BI)V
    .locals 3

    .line 1
    .line 2
    add-int/lit8 v0, p2, 0x1

    .line 3
    int-to-byte v1, p0

    .line 4
    .line 5
    aput-byte v1, p1, p2

    .line 6
    .line 7
    add-int/lit8 v1, p2, 0x2

    .line 8
    .line 9
    ushr-int/lit8 v2, p0, 0x8

    .line 10
    int-to-byte v2, v2

    .line 11
    .line 12
    aput-byte v2, p1, v0

    .line 13
    .line 14
    add-int/lit8 p2, p2, 0x3

    .line 15
    .line 16
    ushr-int/lit8 v0, p0, 0x10

    .line 17
    int-to-byte v0, v0

    .line 18
    .line 19
    aput-byte v0, p1, v1

    .line 20
    .line 21
    ushr-int/lit8 p0, p0, 0x18

    .line 22
    int-to-byte p0, p0

    .line 23
    .line 24
    aput-byte p0, p1, p2

    .line 25
    return-void
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


# virtual methods
.method public close()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-boolean v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->finished:Z

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->finish()V

    .line 8
    .line 9
    :cond_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    .line 10
    .line 11
    if-eqz v0, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/io/OutputStream;->close()V

    .line 15
    const/4 v0, 0x0

    .line 16
    .line 17
    iput-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    .line 18
    :cond_1
    return-void
    .line 19
    .line 20
    .line 21
.end method

.method public finish()V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->ensureNotFinished()V

    .line 4
    .line 5
    .line 6
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->flushBufferedData()V

    .line 7
    .line 8
    iget-object v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressedBuffer:[B

    .line 9
    .line 10
    sget v1, Lnet/jpountz/lz4/LZ4BlockOutputStream;->MAGIC_LENGTH:I

    .line 11
    .line 12
    iget v2, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressionLevel:I

    .line 13
    .line 14
    or-int/lit8 v2, v2, 0x10

    .line 15
    int-to-byte v2, v2

    .line 16
    .line 17
    aput-byte v2, v0, v1

    .line 18
    .line 19
    add-int/lit8 v2, v1, 0x1

    .line 20
    const/4 v3, 0x0

    .line 21
    .line 22
    .line 23
    invoke-static {v3, v0, v2}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->writeIntLE(I[BI)V

    .line 24
    .line 25
    iget-object v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressedBuffer:[B

    .line 26
    .line 27
    add-int/lit8 v2, v1, 0x5

    .line 28
    .line 29
    .line 30
    invoke-static {v3, v0, v2}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->writeIntLE(I[BI)V

    .line 31
    .line 32
    iget-object v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressedBuffer:[B

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x9

    .line 35
    .line 36
    .line 37
    invoke-static {v3, v0, v1}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->writeIntLE(I[BI)V

    .line 38
    .line 39
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    .line 40
    .line 41
    iget-object v1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressedBuffer:[B

    .line 42
    .line 43
    sget v2, Lnet/jpountz/lz4/LZ4BlockOutputStream;->HEADER_LENGTH:I

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1, v3, v2}, Ljava/io/OutputStream;->write([BII)V

    .line 47
    const/4 v0, 0x1

    .line 48
    .line 49
    iput-boolean v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->finished:Z

    .line 50
    .line 51
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 55
    return-void
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

.method public flush()V
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    .line 3
    .line 4
    if-eqz v0, :cond_1

    .line 5
    .line 6
    iget-boolean v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->syncFlush:Z

    .line 7
    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    .line 11
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->flushBufferedData()V

    .line 12
    .line 13
    :cond_0
    iget-object v0, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/io/OutputStream;->flush()V

    .line 17
    :cond_1
    return-void
    .line 18
    .line 19
    .line 20
    .line 21
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    .line 8
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    move-result-object v1

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    .line 13
    move-result-object v1

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 17
    .line 18
    const-string v1, "(out="

    .line 19
    .line 20
    .line 21
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 22
    .line 23
    iget-object v1, p0, Ljava/io/FilterOutputStream;->out:Ljava/io/OutputStream;

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    const-string v1, ", blockSize="

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    iget v1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->blockSize:I

    .line 34
    .line 35
    .line 36
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 37
    .line 38
    const-string v1, ", compressor="

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 42
    .line 43
    iget-object v1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->compressor:Lnet/jpountz/lz4/LZ4Compressor;

    .line 44
    .line 45
    .line 46
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    const-string v1, ", checksum="

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    iget-object v1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->checksum:Ljava/util/zip/Checksum;

    .line 54
    .line 55
    .line 56
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    const-string v1, ")"

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 62
    .line 63
    .line 64
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 65
    move-result-object v0

    .line 66
    return-object v0
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

.method public write(I)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->ensureNotFinished()V

    .line 2
    iget v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    iget v1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->blockSize:I

    if-ne v0, v1, :cond_0

    .line 3
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->flushBufferedData()V

    .line 4
    :cond_0
    iget-object v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->buffer:[B

    iget v1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    add-int/lit8 v2, v1, 0x1

    iput v2, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    int-to-byte p1, p1

    aput-byte p1, v0, v1

    return-void
.end method

.method public write([B)V
    .locals 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 13
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->ensureNotFinished()V

    .line 14
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->write([BII)V

    return-void
.end method

.method public write([BII)V
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 5
    invoke-static {p1, p2, p3}, Lnet/jpountz/util/SafeUtils;->checkRange([BII)V

    .line 6
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->ensureNotFinished()V

    .line 7
    :goto_0
    iget v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    add-int v1, v0, p3

    iget v2, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->blockSize:I

    if-le v1, v2, :cond_0

    sub-int v1, v2, v0

    .line 8
    iget-object v3, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->buffer:[B

    sub-int/2addr v2, v0

    invoke-static {p1, p2, v3, v0, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 9
    iget v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->blockSize:I

    iput v0, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    .line 10
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4BlockOutputStream;->flushBufferedData()V

    add-int/2addr p2, v1

    sub-int/2addr p3, v1

    goto :goto_0

    .line 11
    :cond_0
    iget-object v1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->buffer:[B

    invoke-static {p1, p2, v1, v0, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 12
    iget p1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    add-int/2addr p1, p3

    iput p1, p0, Lnet/jpountz/lz4/LZ4BlockOutputStream;->o:I

    return-void
.end method
