.class Landroidx/media3/exoplayer/source/SampleDataQueue;
.super Ljava/lang/Object;
.source "SampleDataQueue.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;
    }
.end annotation


# static fields
.field private static final INITIAL_SCRATCH_SIZE:I = 0x20


# instance fields
.field private final allocationLength:I

.field private final allocator:Landroidx/media3/exoplayer/upstream/Allocator;

.field private firstAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

.field private readAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

.field private final scratch:Landroidx/media3/common/util/ParsableByteArray;

.field private totalBytesWritten:J

.field private writeAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;


# direct methods
.method public constructor <init>(Landroidx/media3/exoplayer/upstream/Allocator;)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->allocator:Landroidx/media3/exoplayer/upstream/Allocator;

    .line 6
    .line 7
    .line 8
    invoke-interface {p1}, Landroidx/media3/exoplayer/upstream/Allocator;->getIndividualAllocationLength()I

    .line 9
    move-result p1

    .line 10
    .line 11
    iput p1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->allocationLength:I

    .line 12
    .line 13
    new-instance v0, Landroidx/media3/common/util/ParsableByteArray;

    .line 14
    .line 15
    const/16 v1, 0x20

    .line 16
    .line 17
    .line 18
    invoke-direct {v0, v1}, Landroidx/media3/common/util/ParsableByteArray;-><init>(I)V

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 21
    .line 22
    new-instance v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 23
    .line 24
    const-wide/16 v1, 0x0

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, v1, v2, p1}, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;-><init>(JI)V

    .line 28
    .line 29
    iput-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->firstAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 30
    .line 31
    iput-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->readAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 32
    .line 33
    iput-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->writeAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 34
    return-void
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
.end method

.method private clearAllocationNodes(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p1, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->allocation:Landroidx/media3/exoplayer/upstream/Allocation;

    .line 3
    .line 4
    if-nez v0, :cond_0

    .line 5
    return-void

    .line 6
    .line 7
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->allocator:Landroidx/media3/exoplayer/upstream/Allocator;

    .line 8
    .line 9
    .line 10
    invoke-interface {v0, p1}, Landroidx/media3/exoplayer/upstream/Allocator;->release(Landroidx/media3/exoplayer/upstream/Allocator$AllocationNode;)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {p1}, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->clear()Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

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
    .line 23
.end method

.method private static getNodeContainingPosition(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;J)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;
    .locals 2

    .line 1
    .line 2
    :goto_0
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->endPosition:J

    .line 3
    .line 4
    cmp-long v0, p1, v0

    .line 5
    .line 6
    if-ltz v0, :cond_0

    .line 7
    .line 8
    iget-object p0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->next:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 9
    goto :goto_0

    .line 10
    :cond_0
    return-object p0
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

.method private postAppend(I)V
    .locals 4

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->totalBytesWritten:J

    .line 3
    int-to-long v2, p1

    .line 4
    add-long/2addr v0, v2

    .line 5
    .line 6
    iput-wide v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->totalBytesWritten:J

    .line 7
    .line 8
    iget-object p1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->writeAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 9
    .line 10
    iget-wide v2, p1, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->endPosition:J

    .line 11
    .line 12
    cmp-long v0, v0, v2

    .line 13
    .line 14
    if-nez v0, :cond_0

    .line 15
    .line 16
    iget-object p1, p1, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->next:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 17
    .line 18
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->writeAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 19
    :cond_0
    return-void
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method private preAppend(I)I
    .locals 6

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->writeAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 3
    .line 4
    iget-object v1, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->allocation:Landroidx/media3/exoplayer/upstream/Allocation;

    .line 5
    .line 6
    if-nez v1, :cond_0

    .line 7
    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->allocator:Landroidx/media3/exoplayer/upstream/Allocator;

    .line 9
    .line 10
    .line 11
    invoke-interface {v1}, Landroidx/media3/exoplayer/upstream/Allocator;->allocate()Landroidx/media3/exoplayer/upstream/Allocation;

    .line 12
    move-result-object v1

    .line 13
    .line 14
    new-instance v2, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 15
    .line 16
    iget-object v3, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->writeAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 17
    .line 18
    iget-wide v3, v3, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->endPosition:J

    .line 19
    .line 20
    iget v5, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->allocationLength:I

    .line 21
    .line 22
    .line 23
    invoke-direct {v2, v3, v4, v5}, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;-><init>(JI)V

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v1, v2}, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->initialize(Landroidx/media3/exoplayer/upstream/Allocation;Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;)V

    .line 27
    .line 28
    :cond_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->writeAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 29
    .line 30
    iget-wide v0, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->endPosition:J

    .line 31
    .line 32
    iget-wide v2, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->totalBytesWritten:J

    .line 33
    sub-long/2addr v0, v2

    .line 34
    long-to-int v0, v0

    .line 35
    .line 36
    .line 37
    invoke-static {p1, v0}, Ljava/lang/Math;->min(II)I

    .line 38
    move-result p1

    .line 39
    return p1
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
.end method

.method private static readData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;JLjava/nio/ByteBuffer;I)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;
    .locals 3

    .line 1
    invoke-static {p0, p1, p2}, Landroidx/media3/exoplayer/source/SampleDataQueue;->getNodeContainingPosition(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;J)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    move-result-object p0

    :cond_0
    :goto_0
    if-lez p4, :cond_1

    .line 2
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->endPosition:J

    sub-long/2addr v0, p1

    long-to-int v0, v0

    invoke-static {p4, v0}, Ljava/lang/Math;->min(II)I

    move-result v0

    .line 3
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->allocation:Landroidx/media3/exoplayer/upstream/Allocation;

    .line 4
    iget-object v1, v1, Landroidx/media3/exoplayer/upstream/Allocation;->data:[B

    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->translateOffset(J)I

    move-result v2

    invoke-virtual {p3, v1, v2, v0}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;

    sub-int/2addr p4, v0

    int-to-long v0, v0

    add-long/2addr p1, v0

    .line 5
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->endPosition:J

    cmp-long v0, p1, v0

    if-nez v0, :cond_0

    .line 6
    iget-object p0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->next:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method private static readData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;J[BI)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;
    .locals 5

    .line 7
    invoke-static {p0, p1, p2}, Landroidx/media3/exoplayer/source/SampleDataQueue;->getNodeContainingPosition(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;J)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    move-result-object p0

    move v0, p4

    :cond_0
    :goto_0
    if-lez v0, :cond_1

    .line 8
    iget-wide v1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->endPosition:J

    sub-long/2addr v1, p1

    long-to-int v1, v1

    invoke-static {v0, v1}, Ljava/lang/Math;->min(II)I

    move-result v1

    .line 9
    iget-object v2, p0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->allocation:Landroidx/media3/exoplayer/upstream/Allocation;

    .line 10
    iget-object v2, v2, Landroidx/media3/exoplayer/upstream/Allocation;->data:[B

    .line 11
    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->translateOffset(J)I

    move-result v3

    sub-int v4, p4, v0

    .line 12
    invoke-static {v2, v3, p3, v4, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int/2addr v0, v1

    int-to-long v1, v1

    add-long/2addr p1, v1

    .line 13
    iget-wide v1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->endPosition:J

    cmp-long v1, p1, v1

    if-nez v1, :cond_0

    .line 14
    iget-object p0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->next:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    goto :goto_0

    :cond_1
    return-object p0
.end method

.method private static readEncryptionData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;Landroidx/media3/decoder/DecoderInputBuffer;Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;Landroidx/media3/common/util/ParsableByteArray;)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;
    .locals 18

    .line 1
    .line 2
    move-object/from16 v0, p2

    .line 3
    .line 4
    move-object/from16 v1, p3

    .line 5
    .line 6
    iget-wide v2, v0, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->offset:J

    .line 7
    const/4 v4, 0x1

    .line 8
    .line 9
    .line 10
    invoke-virtual {v1, v4}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 11
    .line 12
    .line 13
    invoke-virtual {v1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 14
    move-result-object v5

    .line 15
    .line 16
    move-object/from16 v6, p0

    .line 17
    .line 18
    .line 19
    invoke-static {v6, v2, v3, v5, v4}, Landroidx/media3/exoplayer/source/SampleDataQueue;->readData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;J[BI)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 20
    move-result-object v5

    .line 21
    .line 22
    const-wide/16 v6, 0x1

    .line 23
    add-long/2addr v2, v6

    .line 24
    .line 25
    .line 26
    invoke-virtual {v1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 27
    move-result-object v6

    .line 28
    const/4 v7, 0x0

    .line 29
    .line 30
    aget-byte v6, v6, v7

    .line 31
    .line 32
    and-int/lit16 v8, v6, 0x80

    .line 33
    .line 34
    if-eqz v8, :cond_0

    .line 35
    move v8, v4

    .line 36
    goto :goto_0

    .line 37
    :cond_0
    move v8, v7

    .line 38
    .line 39
    :goto_0
    and-int/lit8 v6, v6, 0x7f

    .line 40
    .line 41
    move-object/from16 v9, p1

    .line 42
    .line 43
    iget-object v9, v9, Landroidx/media3/decoder/DecoderInputBuffer;->cryptoInfo:Landroidx/media3/decoder/CryptoInfo;

    .line 44
    .line 45
    iget-object v10, v9, Landroidx/media3/decoder/CryptoInfo;->iv:[B

    .line 46
    .line 47
    if-nez v10, :cond_1

    .line 48
    .line 49
    const/16 v10, 0x10

    .line 50
    .line 51
    new-array v10, v10, [B

    .line 52
    .line 53
    iput-object v10, v9, Landroidx/media3/decoder/CryptoInfo;->iv:[B

    .line 54
    goto :goto_1

    .line 55
    .line 56
    .line 57
    :cond_1
    invoke-static {v10, v7}, Ljava/util/Arrays;->fill([BB)V

    .line 58
    .line 59
    :goto_1
    iget-object v10, v9, Landroidx/media3/decoder/CryptoInfo;->iv:[B

    .line 60
    .line 61
    .line 62
    invoke-static {v5, v2, v3, v10, v6}, Landroidx/media3/exoplayer/source/SampleDataQueue;->readData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;J[BI)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 63
    move-result-object v5

    .line 64
    int-to-long v10, v6

    .line 65
    add-long/2addr v2, v10

    .line 66
    .line 67
    if-eqz v8, :cond_2

    .line 68
    const/4 v4, 0x2

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, v4}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 75
    move-result-object v6

    .line 76
    .line 77
    .line 78
    invoke-static {v5, v2, v3, v6, v4}, Landroidx/media3/exoplayer/source/SampleDataQueue;->readData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;J[BI)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 79
    move-result-object v5

    .line 80
    .line 81
    const-wide/16 v10, 0x2

    .line 82
    add-long/2addr v2, v10

    .line 83
    .line 84
    .line 85
    invoke-virtual {v1}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedShort()I

    .line 86
    move-result v4

    .line 87
    :cond_2
    move v10, v4

    .line 88
    .line 89
    iget-object v4, v9, Landroidx/media3/decoder/CryptoInfo;->numBytesOfClearData:[I

    .line 90
    .line 91
    if-eqz v4, :cond_4

    .line 92
    array-length v6, v4

    .line 93
    .line 94
    if-ge v6, v10, :cond_3

    .line 95
    goto :goto_3

    .line 96
    :cond_3
    :goto_2
    move-object v11, v4

    .line 97
    goto :goto_4

    .line 98
    .line 99
    :cond_4
    :goto_3
    new-array v4, v10, [I

    .line 100
    goto :goto_2

    .line 101
    .line 102
    :goto_4
    iget-object v4, v9, Landroidx/media3/decoder/CryptoInfo;->numBytesOfEncryptedData:[I

    .line 103
    .line 104
    if-eqz v4, :cond_6

    .line 105
    array-length v6, v4

    .line 106
    .line 107
    if-ge v6, v10, :cond_5

    .line 108
    goto :goto_6

    .line 109
    :cond_5
    :goto_5
    move-object v12, v4

    .line 110
    goto :goto_7

    .line 111
    .line 112
    :cond_6
    :goto_6
    new-array v4, v10, [I

    .line 113
    goto :goto_5

    .line 114
    .line 115
    :goto_7
    if-eqz v8, :cond_7

    .line 116
    .line 117
    mul-int/lit8 v4, v10, 0x6

    .line 118
    .line 119
    .line 120
    invoke-virtual {v1, v4}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 121
    .line 122
    .line 123
    invoke-virtual {v1}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 124
    move-result-object v6

    .line 125
    .line 126
    .line 127
    invoke-static {v5, v2, v3, v6, v4}, Landroidx/media3/exoplayer/source/SampleDataQueue;->readData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;J[BI)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 128
    move-result-object v5

    .line 129
    int-to-long v13, v4

    .line 130
    add-long/2addr v2, v13

    .line 131
    .line 132
    .line 133
    invoke-virtual {v1, v7}, Landroidx/media3/common/util/ParsableByteArray;->setPosition(I)V

    .line 134
    .line 135
    :goto_8
    if-ge v7, v10, :cond_8

    .line 136
    .line 137
    .line 138
    invoke-virtual {v1}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedShort()I

    .line 139
    move-result v4

    .line 140
    .line 141
    aput v4, v11, v7

    .line 142
    .line 143
    .line 144
    invoke-virtual {v1}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedIntToInt()I

    .line 145
    move-result v4

    .line 146
    .line 147
    aput v4, v12, v7

    .line 148
    .line 149
    add-int/lit8 v7, v7, 0x1

    .line 150
    goto :goto_8

    .line 151
    .line 152
    :cond_7
    aput v7, v11, v7

    .line 153
    .line 154
    iget v1, v0, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->size:I

    .line 155
    .line 156
    iget-wide v13, v0, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->offset:J

    .line 157
    .line 158
    sub-long v13, v2, v13

    .line 159
    long-to-int v4, v13

    .line 160
    sub-int/2addr v1, v4

    .line 161
    .line 162
    aput v1, v12, v7

    .line 163
    .line 164
    :cond_8
    iget-object v1, v0, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->cryptoData:Landroidx/media3/extractor/TrackOutput$CryptoData;

    .line 165
    .line 166
    .line 167
    invoke-static {v1}, Landroidx/media3/common/util/Util;->castNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    move-result-object v1

    .line 169
    .line 170
    check-cast v1, Landroidx/media3/extractor/TrackOutput$CryptoData;

    .line 171
    .line 172
    iget-object v13, v1, Landroidx/media3/extractor/TrackOutput$CryptoData;->encryptionKey:[B

    .line 173
    .line 174
    iget-object v14, v9, Landroidx/media3/decoder/CryptoInfo;->iv:[B

    .line 175
    .line 176
    iget v15, v1, Landroidx/media3/extractor/TrackOutput$CryptoData;->cryptoMode:I

    .line 177
    .line 178
    iget v4, v1, Landroidx/media3/extractor/TrackOutput$CryptoData;->encryptedBlocks:I

    .line 179
    .line 180
    iget v1, v1, Landroidx/media3/extractor/TrackOutput$CryptoData;->clearBlocks:I

    .line 181
    .line 182
    move/from16 v17, v1

    .line 183
    .line 184
    move/from16 v16, v4

    .line 185
    .line 186
    .line 187
    invoke-virtual/range {v9 .. v17}, Landroidx/media3/decoder/CryptoInfo;->set(I[I[I[B[BIII)V

    .line 188
    .line 189
    iget-wide v6, v0, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->offset:J

    .line 190
    sub-long/2addr v2, v6

    .line 191
    long-to-int v1, v2

    .line 192
    int-to-long v2, v1

    .line 193
    add-long/2addr v6, v2

    .line 194
    .line 195
    iput-wide v6, v0, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->offset:J

    .line 196
    .line 197
    iget v2, v0, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->size:I

    .line 198
    sub-int/2addr v2, v1

    .line 199
    .line 200
    iput v2, v0, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->size:I

    .line 201
    return-object v5
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
.end method

.method private static readSampleData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;Landroidx/media3/decoder/DecoderInputBuffer;Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;Landroidx/media3/common/util/ParsableByteArray;)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Landroidx/media3/decoder/DecoderInputBuffer;->isEncrypted()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_0

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1, p2, p3}, Landroidx/media3/exoplayer/source/SampleDataQueue;->readEncryptionData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;Landroidx/media3/decoder/DecoderInputBuffer;Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;Landroidx/media3/common/util/ParsableByteArray;)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 10
    move-result-object p0

    .line 11
    .line 12
    .line 13
    :cond_0
    invoke-virtual {p1}, Landroidx/media3/decoder/Buffer;->hasSupplementalData()Z

    .line 14
    move-result v0

    .line 15
    .line 16
    if-eqz v0, :cond_1

    .line 17
    const/4 v0, 0x4

    .line 18
    .line 19
    .line 20
    invoke-virtual {p3, v0}, Landroidx/media3/common/util/ParsableByteArray;->reset(I)V

    .line 21
    .line 22
    iget-wide v1, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->offset:J

    .line 23
    .line 24
    .line 25
    invoke-virtual {p3}, Landroidx/media3/common/util/ParsableByteArray;->getData()[B

    .line 26
    move-result-object v3

    .line 27
    .line 28
    .line 29
    invoke-static {p0, v1, v2, v3, v0}, Landroidx/media3/exoplayer/source/SampleDataQueue;->readData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;J[BI)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 30
    move-result-object p0

    .line 31
    .line 32
    .line 33
    invoke-virtual {p3}, Landroidx/media3/common/util/ParsableByteArray;->readUnsignedIntToInt()I

    .line 34
    move-result p3

    .line 35
    .line 36
    iget-wide v1, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->offset:J

    .line 37
    .line 38
    const-wide/16 v3, 0x4

    .line 39
    add-long/2addr v1, v3

    .line 40
    .line 41
    iput-wide v1, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->offset:J

    .line 42
    .line 43
    iget v1, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->size:I

    .line 44
    sub-int/2addr v1, v0

    .line 45
    .line 46
    iput v1, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->size:I

    .line 47
    .line 48
    .line 49
    invoke-virtual {p1, p3}, Landroidx/media3/decoder/DecoderInputBuffer;->ensureSpaceForWrite(I)V

    .line 50
    .line 51
    iget-wide v0, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->offset:J

    .line 52
    .line 53
    iget-object v2, p1, Landroidx/media3/decoder/DecoderInputBuffer;->data:Ljava/nio/ByteBuffer;

    .line 54
    .line 55
    .line 56
    invoke-static {p0, v0, v1, v2, p3}, Landroidx/media3/exoplayer/source/SampleDataQueue;->readData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;JLjava/nio/ByteBuffer;I)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 57
    move-result-object p0

    .line 58
    .line 59
    iget-wide v0, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->offset:J

    .line 60
    int-to-long v2, p3

    .line 61
    add-long/2addr v0, v2

    .line 62
    .line 63
    iput-wide v0, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->offset:J

    .line 64
    .line 65
    iget v0, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->size:I

    .line 66
    sub-int/2addr v0, p3

    .line 67
    .line 68
    iput v0, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->size:I

    .line 69
    .line 70
    .line 71
    invoke-virtual {p1, v0}, Landroidx/media3/decoder/DecoderInputBuffer;->resetSupplementalData(I)V

    .line 72
    .line 73
    iget-wide v0, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->offset:J

    .line 74
    .line 75
    iget-object p1, p1, Landroidx/media3/decoder/DecoderInputBuffer;->supplementalData:Ljava/nio/ByteBuffer;

    .line 76
    .line 77
    iget p2, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->size:I

    .line 78
    .line 79
    .line 80
    invoke-static {p0, v0, v1, p1, p2}, Landroidx/media3/exoplayer/source/SampleDataQueue;->readData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;JLjava/nio/ByteBuffer;I)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 81
    move-result-object p0

    .line 82
    return-object p0

    .line 83
    .line 84
    :cond_1
    iget p3, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->size:I

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1, p3}, Landroidx/media3/decoder/DecoderInputBuffer;->ensureSpaceForWrite(I)V

    .line 88
    .line 89
    iget-wide v0, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->offset:J

    .line 90
    .line 91
    iget-object p1, p1, Landroidx/media3/decoder/DecoderInputBuffer;->data:Ljava/nio/ByteBuffer;

    .line 92
    .line 93
    iget p2, p2, Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;->size:I

    .line 94
    .line 95
    .line 96
    invoke-static {p0, v0, v1, p1, p2}, Landroidx/media3/exoplayer/source/SampleDataQueue;->readData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;JLjava/nio/ByteBuffer;I)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 97
    move-result-object p0

    .line 98
    return-object p0
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
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
.end method


# virtual methods
.method public discardDownstreamTo(J)V
    .locals 3

    .line 1
    .line 2
    const-wide/16 v0, -0x1

    .line 3
    .line 4
    cmp-long v0, p1, v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    goto :goto_1

    .line 8
    .line 9
    :cond_0
    :goto_0
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->firstAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 10
    .line 11
    iget-wide v1, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->endPosition:J

    .line 12
    .line 13
    cmp-long v1, p1, v1

    .line 14
    .line 15
    if-ltz v1, :cond_1

    .line 16
    .line 17
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->allocator:Landroidx/media3/exoplayer/upstream/Allocator;

    .line 18
    .line 19
    iget-object v0, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->allocation:Landroidx/media3/exoplayer/upstream/Allocation;

    .line 20
    .line 21
    .line 22
    invoke-interface {v1, v0}, Landroidx/media3/exoplayer/upstream/Allocator;->release(Landroidx/media3/exoplayer/upstream/Allocation;)V

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->firstAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 25
    .line 26
    .line 27
    invoke-virtual {v0}, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->clear()Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 28
    move-result-object v0

    .line 29
    .line 30
    iput-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->firstAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_1
    iget-object p1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->readAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 34
    .line 35
    iget-wide p1, p1, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->startPosition:J

    .line 36
    .line 37
    iget-wide v1, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->startPosition:J

    .line 38
    .line 39
    cmp-long p1, p1, v1

    .line 40
    .line 41
    if-gez p1, :cond_2

    .line 42
    .line 43
    iput-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->readAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 44
    :cond_2
    :goto_1
    return-void
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

.method public discardUpstreamSampleBytes(J)V
    .locals 5

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->totalBytesWritten:J

    .line 3
    .line 4
    cmp-long v0, p1, v0

    .line 5
    .line 6
    if-gtz v0, :cond_0

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
    invoke-static {v0}, Landroidx/media3/common/util/Assertions;->checkArgument(Z)V

    .line 13
    .line 14
    iput-wide p1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->totalBytesWritten:J

    .line 15
    .line 16
    const-wide/16 v0, 0x0

    .line 17
    .line 18
    cmp-long v0, p1, v0

    .line 19
    .line 20
    if-eqz v0, :cond_5

    .line 21
    .line 22
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->firstAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 23
    .line 24
    iget-wide v1, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->startPosition:J

    .line 25
    .line 26
    cmp-long p1, p1, v1

    .line 27
    .line 28
    if-nez p1, :cond_1

    .line 29
    goto :goto_2

    .line 30
    .line 31
    :cond_1
    :goto_1
    iget-wide p1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->totalBytesWritten:J

    .line 32
    .line 33
    iget-wide v1, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->endPosition:J

    .line 34
    .line 35
    cmp-long p1, p1, v1

    .line 36
    .line 37
    if-lez p1, :cond_2

    .line 38
    .line 39
    iget-object v0, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->next:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 40
    goto :goto_1

    .line 41
    .line 42
    :cond_2
    iget-object p1, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->next:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 43
    .line 44
    .line 45
    invoke-static {p1}, Landroidx/media3/common/util/Assertions;->checkNotNull(Ljava/lang/Object;)Ljava/lang/Object;

    .line 46
    move-result-object p1

    .line 47
    .line 48
    check-cast p1, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 49
    .line 50
    .line 51
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/source/SampleDataQueue;->clearAllocationNodes(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;)V

    .line 52
    .line 53
    new-instance p2, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 54
    .line 55
    iget-wide v1, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->endPosition:J

    .line 56
    .line 57
    iget v3, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->allocationLength:I

    .line 58
    .line 59
    .line 60
    invoke-direct {p2, v1, v2, v3}, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;-><init>(JI)V

    .line 61
    .line 62
    iput-object p2, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->next:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 63
    .line 64
    iget-wide v1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->totalBytesWritten:J

    .line 65
    .line 66
    iget-wide v3, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->endPosition:J

    .line 67
    .line 68
    cmp-long v1, v1, v3

    .line 69
    .line 70
    if-nez v1, :cond_3

    .line 71
    move-object v0, p2

    .line 72
    .line 73
    :cond_3
    iput-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->writeAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 74
    .line 75
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->readAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 76
    .line 77
    if-ne v0, p1, :cond_4

    .line 78
    .line 79
    iput-object p2, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->readAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 80
    :cond_4
    return-void

    .line 81
    .line 82
    :cond_5
    :goto_2
    iget-object p1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->firstAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 83
    .line 84
    .line 85
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/source/SampleDataQueue;->clearAllocationNodes(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;)V

    .line 86
    .line 87
    new-instance p1, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 88
    .line 89
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->totalBytesWritten:J

    .line 90
    .line 91
    iget p2, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->allocationLength:I

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, v0, v1, p2}, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;-><init>(JI)V

    .line 95
    .line 96
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->firstAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 97
    .line 98
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->readAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 99
    .line 100
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->writeAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 101
    return-void
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
    .line 135
    .line 136
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
.end method

.method public getTotalBytesWritten()J
    .locals 2

    .line 1
    .line 2
    iget-wide v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->totalBytesWritten:J

    .line 3
    return-wide v0
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

.method public peekToBuffer(Landroidx/media3/decoder/DecoderInputBuffer;Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->readAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1, p2, v1}, Landroidx/media3/exoplayer/source/SampleDataQueue;->readSampleData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;Landroidx/media3/decoder/DecoderInputBuffer;Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;Landroidx/media3/common/util/ParsableByteArray;)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

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

.method public readToBuffer(Landroidx/media3/decoder/DecoderInputBuffer;Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;)V
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->readAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 3
    .line 4
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->scratch:Landroidx/media3/common/util/ParsableByteArray;

    .line 5
    .line 6
    .line 7
    invoke-static {v0, p1, p2, v1}, Landroidx/media3/exoplayer/source/SampleDataQueue;->readSampleData(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;Landroidx/media3/decoder/DecoderInputBuffer;Landroidx/media3/exoplayer/source/SampleQueue$SampleExtrasHolder;Landroidx/media3/common/util/ParsableByteArray;)Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 8
    move-result-object p1

    .line 9
    .line 10
    iput-object p1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->readAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 11
    return-void
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

.method public reset()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->firstAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/source/SampleDataQueue;->clearAllocationNodes(Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;)V

    .line 6
    .line 7
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->firstAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 8
    .line 9
    iget v1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->allocationLength:I

    .line 10
    .line 11
    const-wide/16 v2, 0x0

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2, v3, v1}, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->reset(JI)V

    .line 15
    .line 16
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->firstAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 17
    .line 18
    iput-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->readAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 19
    .line 20
    iput-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->writeAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 21
    .line 22
    iput-wide v2, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->totalBytesWritten:J

    .line 23
    .line 24
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->allocator:Landroidx/media3/exoplayer/upstream/Allocator;

    .line 25
    .line 26
    .line 27
    invoke-interface {v0}, Landroidx/media3/exoplayer/upstream/Allocator;->trim()V

    .line 28
    return-void
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

.method public rewind()V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->firstAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 3
    .line 4
    iput-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->readAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    .line 5
    return-void
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

.method public sampleData(Landroidx/media3/common/DataReader;IZ)I
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/source/SampleDataQueue;->preAppend(I)I

    move-result p2

    .line 2
    iget-object v0, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->writeAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    iget-object v1, v0, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->allocation:Landroidx/media3/exoplayer/upstream/Allocation;

    iget-object v1, v1, Landroidx/media3/exoplayer/upstream/Allocation;->data:[B

    iget-wide v2, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->totalBytesWritten:J

    .line 3
    invoke-virtual {v0, v2, v3}, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->translateOffset(J)I

    move-result v0

    .line 4
    invoke-interface {p1, v1, v0, p2}, Landroidx/media3/common/DataReader;->read([BII)I

    move-result p1

    const/4 p2, -0x1

    if-ne p1, p2, :cond_1

    if-eqz p3, :cond_0

    return p2

    .line 5
    :cond_0
    new-instance p1, Ljava/io/EOFException;

    invoke-direct {p1}, Ljava/io/EOFException;-><init>()V

    throw p1

    .line 6
    :cond_1
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/source/SampleDataQueue;->postAppend(I)V

    return p1
.end method

.method public sampleData(Landroidx/media3/common/util/ParsableByteArray;I)V
    .locals 5

    :goto_0
    if-lez p2, :cond_0

    .line 7
    invoke-direct {p0, p2}, Landroidx/media3/exoplayer/source/SampleDataQueue;->preAppend(I)I

    move-result v0

    .line 8
    iget-object v1, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->writeAllocationNode:Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;

    iget-object v2, v1, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->allocation:Landroidx/media3/exoplayer/upstream/Allocation;

    iget-object v2, v2, Landroidx/media3/exoplayer/upstream/Allocation;->data:[B

    iget-wide v3, p0, Landroidx/media3/exoplayer/source/SampleDataQueue;->totalBytesWritten:J

    .line 9
    invoke-virtual {v1, v3, v4}, Landroidx/media3/exoplayer/source/SampleDataQueue$AllocationNode;->translateOffset(J)I

    move-result v1

    .line 10
    invoke-virtual {p1, v2, v1, v0}, Landroidx/media3/common/util/ParsableByteArray;->readBytes([BII)V

    sub-int/2addr p2, v0

    .line 11
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/source/SampleDataQueue;->postAppend(I)V

    goto :goto_0

    :cond_0
    return-void
.end method
