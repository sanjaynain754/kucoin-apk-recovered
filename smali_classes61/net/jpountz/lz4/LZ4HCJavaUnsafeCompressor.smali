.class final Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor;
.super Lnet/jpountz/lz4/LZ4Compressor;
.source "LZ4HCJavaUnsafeCompressor.java"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor$HashTable;
    }
.end annotation


# static fields
.field static final synthetic $assertionsDisabled:Z

.field public static final INSTANCE:Lnet/jpountz/lz4/LZ4Compressor;


# instance fields
.field final compressionLevel:I

.field private final maxAttempts:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor;->INSTANCE:Lnet/jpountz/lz4/LZ4Compressor;

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
.end method

.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x9

    .line 1
    invoke-direct {p0, v0}, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 2

    .line 2
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4Compressor;-><init>()V

    add-int/lit8 v0, p1, -0x1

    const/4 v1, 0x1

    shl-int v0, v1, v0

    .line 3
    iput v0, p0, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor;->maxAttempts:I

    .line 4
    iput p1, p0, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor;->compressionLevel:I

    return-void
.end method

.method public static synthetic access$000(Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor;)I
    .locals 0

    .line 1
    .line 2
    iget p0, p0, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor;->maxAttempts:I

    .line 3
    return p0
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
.end method


# virtual methods
.method public compress(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)I
    .locals 20

    move/from16 v0, p2

    .line 57
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p4 .. p4}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v2

    if-eqz v2, :cond_0

    move/from16 v2, p5

    .line 58
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v3

    add-int/2addr v0, v3

    invoke-virtual/range {p4 .. p4}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    invoke-virtual/range {p4 .. p4}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result v3

    add-int v5, v2, v3

    move/from16 v3, p3

    move/from16 v6, p6

    move v2, v0

    move-object/from16 v0, p0

    invoke-virtual/range {v0 .. v6}, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor;->compress([BII[BII)I

    move-result v1

    return v1

    :cond_0
    move/from16 v3, p3

    move/from16 v2, p5

    move/from16 v6, p6

    .line 59
    invoke-static/range {p1 .. p1}, Lnet/jpountz/util/ByteBufferUtils;->inNativeByteOrder(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 60
    invoke-static/range {p4 .. p4}, Lnet/jpountz/util/ByteBufferUtils;->inNativeByteOrder(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 61
    invoke-static {v4, v0, v3}, Lnet/jpountz/util/ByteBufferUtils;->checkRange(Ljava/nio/ByteBuffer;II)V

    .line 62
    invoke-static {v1, v2, v6}, Lnet/jpountz/util/ByteBufferUtils;->checkRange(Ljava/nio/ByteBuffer;II)V

    add-int v11, v0, v3

    add-int v10, v2, v6

    add-int/lit8 v12, v11, -0xc

    add-int/lit8 v7, v11, -0x5

    add-int/lit8 v3, v0, 0x1

    move v5, v3

    .line 63
    new-instance v3, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor$HashTable;

    move-object/from16 v13, p0

    invoke-direct {v3, v13, v0}, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor$HashTable;-><init>(Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor;I)V

    .line 64
    new-instance v14, Lnet/jpountz/lz4/LZ4Utils$Match;

    invoke-direct {v14}, Lnet/jpountz/lz4/LZ4Utils$Match;-><init>()V

    .line 65
    new-instance v15, Lnet/jpountz/lz4/LZ4Utils$Match;

    invoke-direct {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;-><init>()V

    .line 66
    new-instance v9, Lnet/jpountz/lz4/LZ4Utils$Match;

    invoke-direct {v9}, Lnet/jpountz/lz4/LZ4Utils$Match;-><init>()V

    .line 67
    new-instance v16, Lnet/jpountz/lz4/LZ4Utils$Match;

    invoke-direct/range {v16 .. v16}, Lnet/jpountz/lz4/LZ4Utils$Match;-><init>()V

    move v6, v2

    :goto_0
    if-ge v5, v12, :cond_14

    .line 68
    invoke-virtual {v3, v4, v5, v7, v15}, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor$HashTable;->insertAndFindBestMatch(Ljava/nio/ByteBuffer;IILnet/jpountz/lz4/LZ4Utils$Match;)Z

    move-result v8

    if-nez v8, :cond_1

    add-int/lit8 v5, v5, 0x1

    goto :goto_0

    .line 69
    :cond_1
    invoke-static {v15, v14}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    move/from16 v17, v6

    .line 70
    :goto_1
    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v5

    if-ge v5, v12, :cond_13

    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v5

    add-int/lit8 v5, v5, -0x2

    iget v6, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    add-int/lit8 v6, v6, 0x1

    iget v8, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    invoke-virtual/range {v3 .. v9}, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor$HashTable;->insertAndFindWiderMatch(Ljava/nio/ByteBuffer;IIIILnet/jpountz/lz4/LZ4Utils$Match;)Z

    move-result v5

    move-object v6, v4

    move-object v4, v3

    move-object v3, v6

    move-object v6, v9

    if-nez v5, :cond_2

    move-object/from16 v19, v4

    move v4, v0

    move-object v0, v6

    :goto_2
    move-object v8, v1

    move/from16 v18, v7

    move-object/from16 v1, v16

    goto/16 :goto_9

    .line 71
    :cond_2
    iget v5, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v8, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    if-ge v5, v8, :cond_3

    .line 72
    iget v5, v6, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v9, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    add-int/2addr v8, v9

    if-ge v5, v8, :cond_3

    .line 73
    invoke-static {v14, v15}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    .line 74
    :cond_3
    iget v5, v6, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v8, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v5, v8

    const/4 v8, 0x3

    if-ge v5, v8, :cond_4

    .line 75
    invoke-static {v6, v15}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    move-object v9, v4

    move-object v4, v3

    move-object v3, v9

    move-object v9, v6

    goto :goto_1

    .line 76
    :cond_4
    :goto_3
    iget v5, v6, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v9, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v5, v9

    move/from16 p1, v0

    const/16 p2, 0x4

    const/16 v0, 0x12

    if-ge v5, v0, :cond_7

    .line 77
    iget v5, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    if-le v5, v0, :cond_5

    move v5, v0

    :cond_5
    add-int/2addr v9, v5

    .line 78
    invoke-virtual {v6}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v18

    move/from16 p3, v8

    add-int/lit8 v8, v18, -0x4

    if-le v9, v8, :cond_6

    .line 79
    iget v5, v6, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v8, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v5, v8

    iget v8, v6, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    add-int/2addr v5, v8

    add-int/lit8 v5, v5, -0x4

    .line 80
    :cond_6
    iget v8, v6, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v9, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v8, v9

    sub-int/2addr v5, v8

    if-lez v5, :cond_8

    .line 81
    invoke-virtual {v6, v5}, Lnet/jpountz/lz4/LZ4Utils$Match;->fix(I)V

    goto :goto_4

    :cond_7
    move/from16 p3, v8

    .line 82
    :cond_8
    :goto_4
    iget v5, v6, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v8, v6, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    add-int/2addr v5, v8

    if-ge v5, v12, :cond_11

    invoke-virtual {v6}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v5

    add-int/lit8 v5, v5, -0x3

    iget v8, v6, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    move v9, v8

    iget v8, v6, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    move-object v0, v4

    move-object v4, v3

    move-object v3, v0

    move-object v0, v6

    move v6, v9

    move-object/from16 v9, v16

    move/from16 v16, p3

    invoke-virtual/range {v3 .. v9}, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor$HashTable;->insertAndFindWiderMatch(Ljava/nio/ByteBuffer;IIIILnet/jpountz/lz4/LZ4Utils$Match;)Z

    move-result v5

    move-object/from16 v19, v3

    move-object v3, v4

    move/from16 v18, v7

    move-object v4, v9

    if-nez v5, :cond_9

    move-object v8, v1

    move-object v1, v4

    :goto_5
    move/from16 v9, v17

    move/from16 v4, p1

    goto/16 :goto_7

    .line 83
    :cond_9
    iget v5, v4, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v6

    add-int/lit8 v6, v6, 0x3

    if-ge v5, v6, :cond_c

    .line 84
    iget v5, v4, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v6

    if-lt v5, v6, :cond_b

    .line 85
    iget v5, v0, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v6

    if-ge v5, v6, :cond_a

    .line 86
    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v5

    iget v6, v0, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v5, v6

    .line 87
    invoke-virtual {v0, v5}, Lnet/jpountz/lz4/LZ4Utils$Match;->fix(I)V

    .line 88
    iget v5, v0, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    move/from16 v6, p2

    if-ge v5, v6, :cond_a

    .line 89
    invoke-static {v4, v0}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    .line 90
    :cond_a
    iget v5, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v6, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->ref:I

    iget v7, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    move-object v8, v1

    move-object v1, v4

    move/from16 v9, v17

    move/from16 v4, p1

    invoke-static/range {v3 .. v10}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->encodeSequence(Ljava/nio/ByteBuffer;IIIILjava/nio/ByteBuffer;II)I

    move-result v17

    .line 91
    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v4

    .line 92
    invoke-static {v1, v15}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    .line 93
    invoke-static {v0, v14}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    move-object v9, v0

    move-object/from16 v16, v1

    move v0, v4

    move-object v1, v8

    move/from16 v7, v18

    move-object v4, v3

    move-object/from16 v3, v19

    goto/16 :goto_1

    :cond_b
    move-object v8, v1

    move-object v1, v4

    move/from16 v9, v17

    move/from16 v4, p1

    .line 94
    invoke-static {v1, v0}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    move/from16 v6, v16

    move-object/from16 v16, v1

    move-object v1, v8

    move v8, v6

    move-object v6, v0

    move v0, v4

    move/from16 v7, v18

    move-object/from16 v4, v19

    goto/16 :goto_3

    :cond_c
    move-object v8, v1

    move-object v1, v4

    move/from16 v9, v17

    move/from16 v4, p1

    .line 95
    iget v5, v0, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v6

    if-ge v5, v6, :cond_10

    .line 96
    iget v5, v0, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v6, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int v7, v5, v6

    const/16 v2, 0xf

    if-ge v7, v2, :cond_f

    .line 97
    iget v2, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    const/16 v5, 0x12

    if-le v2, v5, :cond_d

    .line 98
    iput v5, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    .line 99
    :cond_d
    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v2

    invoke-virtual {v0}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v5

    const/4 v6, 0x4

    sub-int/2addr v5, v6

    if-le v2, v5, :cond_e

    .line 100
    invoke-virtual {v0}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v2

    iget v5, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v2, v5

    sub-int/2addr v2, v6

    iput v2, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    .line 101
    :cond_e
    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v2

    iget v5, v0, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v2, v5

    .line 102
    invoke-virtual {v0, v2}, Lnet/jpountz/lz4/LZ4Utils$Match;->fix(I)V

    goto :goto_6

    :cond_f
    sub-int/2addr v5, v6

    .line 103
    iput v5, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    .line 104
    :cond_10
    :goto_6
    iget v5, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v6, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->ref:I

    iget v7, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    invoke-static/range {v3 .. v10}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->encodeSequence(Ljava/nio/ByteBuffer;IIIILjava/nio/ByteBuffer;II)I

    move-result v17

    .line 105
    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v2

    .line 106
    invoke-static {v0, v15}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    .line 107
    invoke-static {v1, v0}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    move/from16 v4, v16

    move-object/from16 v16, v1

    move-object v1, v8

    move v8, v4

    move-object v6, v0

    move v0, v2

    move/from16 v7, v18

    move-object/from16 v4, v19

    move/from16 v2, p5

    goto/16 :goto_3

    :cond_11
    move-object v8, v1

    move-object/from16 v19, v4

    move-object v0, v6

    move/from16 v18, v7

    move-object/from16 v1, v16

    goto/16 :goto_5

    .line 108
    :goto_7
    iget v2, v0, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v5

    if-ge v2, v5, :cond_12

    .line 109
    iget v2, v0, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v5, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v2, v5

    iput v2, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    .line 110
    :cond_12
    iget v5, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v6, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->ref:I

    iget v7, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    invoke-static/range {v3 .. v10}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->encodeSequence(Ljava/nio/ByteBuffer;IIIILjava/nio/ByteBuffer;II)I

    move-result v9

    .line 111
    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v4

    .line 112
    iget v5, v0, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v6, v0, Lnet/jpountz/lz4/LZ4Utils$Match;->ref:I

    iget v7, v0, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    invoke-static/range {v3 .. v10}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->encodeSequence(Ljava/nio/ByteBuffer;IIIILjava/nio/ByteBuffer;II)I

    move-result v6

    .line 113
    invoke-virtual {v0}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v5

    :goto_8
    move/from16 v2, p5

    move-object v9, v0

    move-object/from16 v16, v1

    move-object v4, v3

    move v0, v5

    move-object v1, v8

    move/from16 v7, v18

    move-object/from16 v3, v19

    goto/16 :goto_0

    :cond_13
    move-object/from16 v19, v3

    move-object v3, v4

    move v4, v0

    move-object v0, v9

    goto/16 :goto_2

    .line 114
    :goto_9
    iget v5, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v6, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->ref:I

    iget v7, v15, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    move/from16 v9, v17

    invoke-static/range {v3 .. v10}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->encodeSequence(Ljava/nio/ByteBuffer;IIIILjava/nio/ByteBuffer;II)I

    move-result v6

    .line 115
    invoke-virtual {v15}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v5

    goto :goto_8

    :cond_14
    move-object v8, v1

    move-object v3, v4

    move v4, v0

    sub-int v5, v11, v4

    move v7, v6

    move-object v6, v8

    move v8, v10

    .line 116
    invoke-static/range {v3 .. v8}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->lastLiterals(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)I

    move-result v0

    sub-int v0, v0, p5

    return v0
.end method

.method public compress([BII[BII)I
    .locals 20

    move/from16 v0, p2

    .line 1
    invoke-static/range {p1 .. p3}, Lnet/jpountz/util/UnsafeUtils;->checkRange([BII)V

    .line 2
    invoke-static/range {p4 .. p6}, Lnet/jpountz/util/UnsafeUtils;->checkRange([BII)V

    add-int v1, v0, p3

    add-int v9, p5, p6

    add-int/lit8 v10, v1, -0xc

    add-int/lit8 v6, v1, -0x5

    add-int/lit8 v2, v0, 0x1

    move v3, v2

    .line 3
    new-instance v2, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor$HashTable;

    move-object/from16 v11, p0

    invoke-direct {v2, v11, v0}, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor$HashTable;-><init>(Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor;I)V

    .line 4
    new-instance v12, Lnet/jpountz/lz4/LZ4Utils$Match;

    invoke-direct {v12}, Lnet/jpountz/lz4/LZ4Utils$Match;-><init>()V

    .line 5
    new-instance v13, Lnet/jpountz/lz4/LZ4Utils$Match;

    invoke-direct {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;-><init>()V

    .line 6
    new-instance v8, Lnet/jpountz/lz4/LZ4Utils$Match;

    invoke-direct {v8}, Lnet/jpountz/lz4/LZ4Utils$Match;-><init>()V

    .line 7
    new-instance v14, Lnet/jpountz/lz4/LZ4Utils$Match;

    invoke-direct {v14}, Lnet/jpountz/lz4/LZ4Utils$Match;-><init>()V

    move v4, v3

    move v3, v0

    move v0, v4

    move/from16 v4, p5

    :goto_0
    if-ge v0, v10, :cond_13

    move-object/from16 v5, p1

    .line 8
    invoke-virtual {v2, v5, v0, v6, v13}, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor$HashTable;->insertAndFindBestMatch([BIILnet/jpountz/lz4/LZ4Utils$Match;)Z

    move-result v7

    if-nez v7, :cond_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    .line 9
    :cond_0
    invoke-static {v13, v12}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    move v0, v3

    move v15, v4

    .line 10
    :goto_1
    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v3

    if-ge v3, v10, :cond_12

    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v3

    add-int/lit8 v4, v3, -0x2

    iget v3, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    add-int/lit8 v3, v3, 0x1

    iget v7, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    move-object/from16 v19, v5

    move v5, v3

    move-object/from16 v3, v19

    invoke-virtual/range {v2 .. v8}, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor$HashTable;->insertAndFindWiderMatch([BIIIILnet/jpountz/lz4/LZ4Utils$Match;)Z

    move-result v4

    move-object v3, v8

    if-nez v4, :cond_1

    move-object/from16 v16, v14

    move-object v14, v3

    :goto_2
    move-object/from16 v18, v2

    move/from16 v17, v6

    goto/16 :goto_9

    .line 11
    :cond_1
    iget v4, v12, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v5, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    if-ge v4, v5, :cond_2

    .line 12
    iget v4, v3, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v7, v12, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    add-int/2addr v5, v7

    if-ge v4, v5, :cond_2

    .line 13
    invoke-static {v12, v13}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    .line 14
    :cond_2
    iget v4, v3, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v5, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v4, v5

    const/4 v5, 0x3

    if-ge v4, v5, :cond_3

    .line 15
    invoke-static {v3, v13}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    move-object/from16 v5, p1

    move-object v8, v3

    goto :goto_1

    .line 16
    :cond_3
    :goto_3
    iget v4, v3, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v7, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v4, v7

    const/4 v8, 0x4

    move/from16 p2, v0

    const/16 v0, 0x12

    if-ge v4, v0, :cond_6

    .line 17
    iget v4, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    if-le v4, v0, :cond_4

    move v4, v0

    :cond_4
    add-int/2addr v7, v4

    .line 18
    invoke-virtual {v3}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v16

    move/from16 p3, v5

    add-int/lit8 v5, v16, -0x4

    if-le v7, v5, :cond_5

    .line 19
    iget v4, v3, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v5, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v4, v5

    iget v5, v3, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    add-int/2addr v4, v5

    sub-int/2addr v4, v8

    .line 20
    :cond_5
    iget v5, v3, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v7, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v5, v7

    sub-int/2addr v4, v5

    if-lez v4, :cond_7

    .line 21
    invoke-virtual {v3, v4}, Lnet/jpountz/lz4/LZ4Utils$Match;->fix(I)V

    goto :goto_4

    :cond_6
    move/from16 p3, v5

    .line 22
    :cond_7
    :goto_4
    iget v4, v3, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v5, v3, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    add-int/2addr v4, v5

    if-ge v4, v10, :cond_10

    invoke-virtual {v3}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v4

    add-int/lit8 v4, v4, -0x3

    iget v5, v3, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v7, v3, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    move/from16 v16, p3

    move v0, v8

    move-object v8, v14

    move-object v14, v3

    move-object/from16 v3, p1

    invoke-virtual/range {v2 .. v8}, Lnet/jpountz/lz4/LZ4HCJavaUnsafeCompressor$HashTable;->insertAndFindWiderMatch([BIIIILnet/jpountz/lz4/LZ4Utils$Match;)Z

    move-result v4

    move-object/from16 v18, v2

    move/from16 v17, v6

    move-object v2, v8

    if-nez v4, :cond_8

    move v8, v15

    move-object v15, v2

    :goto_5
    move/from16 v3, p2

    goto/16 :goto_7

    .line 23
    :cond_8
    iget v3, v2, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v4

    add-int/lit8 v4, v4, 0x3

    if-ge v3, v4, :cond_b

    .line 24
    iget v3, v2, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v4

    if-lt v3, v4, :cond_a

    .line 25
    iget v3, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v4

    if-ge v3, v4, :cond_9

    .line 26
    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v3

    iget v4, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v3, v4

    .line 27
    invoke-virtual {v14, v3}, Lnet/jpountz/lz4/LZ4Utils$Match;->fix(I)V

    .line 28
    iget v3, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    if-ge v3, v0, :cond_9

    .line 29
    invoke-static {v2, v14}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    .line 30
    :cond_9
    iget v4, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v5, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->ref:I

    iget v6, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    move/from16 v3, p2

    move-object/from16 v7, p4

    move v8, v15

    move-object v15, v2

    move-object/from16 v2, p1

    invoke-static/range {v2 .. v9}, Lnet/jpountz/lz4/LZ4UnsafeUtils;->encodeSequence([BIIII[BII)I

    move-result v0

    .line 31
    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v2

    .line 32
    invoke-static {v15, v13}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    .line 33
    invoke-static {v14, v12}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    move-object/from16 v5, p1

    move-object v8, v14

    move-object v14, v15

    move/from16 v6, v17

    move v15, v0

    move v0, v2

    move-object/from16 v2, v18

    goto/16 :goto_1

    :cond_a
    move/from16 v3, p2

    move v8, v15

    move-object v15, v2

    .line 34
    invoke-static {v15, v14}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    move v0, v3

    move-object v3, v14

    move-object v14, v15

    move/from16 v5, v16

    move/from16 v6, v17

    move-object/from16 v2, v18

    move v15, v8

    goto/16 :goto_3

    :cond_b
    move/from16 v3, p2

    move v8, v15

    move-object v15, v2

    .line 35
    iget v2, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v4

    if-ge v2, v4, :cond_f

    .line 36
    iget v2, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v4, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int v5, v2, v4

    const/16 v6, 0xf

    if-ge v5, v6, :cond_e

    .line 37
    iget v2, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    const/16 v4, 0x12

    if-le v2, v4, :cond_c

    .line 38
    iput v4, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    .line 39
    :cond_c
    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v2

    invoke-virtual {v14}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v4

    sub-int/2addr v4, v0

    if-le v2, v4, :cond_d

    .line 40
    invoke-virtual {v14}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v2

    iget v4, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v2, v4

    sub-int/2addr v2, v0

    iput v2, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    .line 41
    :cond_d
    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v0

    iget v2, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v0, v2

    .line 42
    invoke-virtual {v14, v0}, Lnet/jpountz/lz4/LZ4Utils$Match;->fix(I)V

    goto :goto_6

    :cond_e
    sub-int/2addr v2, v4

    .line 43
    iput v2, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    .line 44
    :cond_f
    :goto_6
    iget v4, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v5, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->ref:I

    iget v6, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    move-object/from16 v2, p1

    move-object/from16 v7, p4

    invoke-static/range {v2 .. v9}, Lnet/jpountz/lz4/LZ4UnsafeUtils;->encodeSequence([BIIII[BII)I

    move-result v0

    .line 45
    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v2

    .line 46
    invoke-static {v14, v13}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    .line 47
    invoke-static {v15, v14}, Lnet/jpountz/lz4/LZ4Utils;->copyTo(Lnet/jpountz/lz4/LZ4Utils$Match;Lnet/jpountz/lz4/LZ4Utils$Match;)V

    move-object v3, v14

    move-object v14, v15

    move/from16 v5, v16

    move/from16 v6, v17

    move v15, v0

    move v0, v2

    move-object/from16 v2, v18

    goto/16 :goto_3

    :cond_10
    move-object/from16 v18, v2

    move/from16 v17, v6

    move v8, v15

    move-object v15, v14

    move-object v14, v3

    goto/16 :goto_5

    .line 48
    :goto_7
    iget v0, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v2

    if-ge v0, v2, :cond_11

    .line 49
    iget v0, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v2, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    sub-int/2addr v0, v2

    iput v0, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    .line 50
    :cond_11
    iget v4, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v5, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->ref:I

    iget v6, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    move-object/from16 v2, p1

    move-object/from16 v7, p4

    invoke-static/range {v2 .. v9}, Lnet/jpountz/lz4/LZ4UnsafeUtils;->encodeSequence([BIIII[BII)I

    move-result v8

    .line 51
    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v3

    .line 52
    iget v4, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v5, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->ref:I

    iget v6, v14, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    invoke-static/range {v2 .. v9}, Lnet/jpountz/lz4/LZ4UnsafeUtils;->encodeSequence([BIIII[BII)I

    move-result v4

    .line 53
    invoke-virtual {v14}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v0

    move v3, v0

    move-object v8, v14

    move-object v14, v15

    :goto_8
    move/from16 v6, v17

    move-object/from16 v2, v18

    goto/16 :goto_0

    :cond_12
    move-object/from16 v16, v14

    move-object v14, v8

    goto/16 :goto_2

    .line 54
    :goto_9
    iget v4, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->start:I

    iget v5, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->ref:I

    iget v6, v13, Lnet/jpountz/lz4/LZ4Utils$Match;->len:I

    move-object/from16 v2, p1

    move-object/from16 v7, p4

    move v3, v0

    move v8, v15

    invoke-static/range {v2 .. v9}, Lnet/jpountz/lz4/LZ4UnsafeUtils;->encodeSequence([BIIII[BII)I

    move-result v4

    .line 55
    invoke-virtual {v13}, Lnet/jpountz/lz4/LZ4Utils$Match;->end()I

    move-result v0

    move v3, v0

    move-object v8, v14

    move-object/from16 v14, v16

    goto :goto_8

    :cond_13
    sub-int/2addr v1, v3

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move v6, v4

    move v7, v9

    move v4, v1

    .line 56
    invoke-static/range {v2 .. v7}, Lnet/jpountz/lz4/LZ4UnsafeUtils;->lastLiterals([BII[BII)I

    move-result v0

    sub-int v0, v0, p5

    return v0
.end method
