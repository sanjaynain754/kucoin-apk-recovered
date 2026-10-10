.class final Lnet/jpountz/lz4/LZ4JavaSafeSafeDecompressor;
.super Lnet/jpountz/lz4/LZ4SafeDecompressor;
.source "LZ4JavaSafeSafeDecompressor.java"


# static fields
.field public static final INSTANCE:Lnet/jpountz/lz4/LZ4SafeDecompressor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lnet/jpountz/lz4/LZ4JavaSafeSafeDecompressor;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lnet/jpountz/lz4/LZ4JavaSafeSafeDecompressor;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lnet/jpountz/lz4/LZ4JavaSafeSafeDecompressor;->INSTANCE:Lnet/jpountz/lz4/LZ4SafeDecompressor;

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
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4SafeDecompressor;-><init>()V

    .line 4
    return-void
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
.end method


# virtual methods
.method public decompress(Ljava/nio/ByteBuffer;IILjava/nio/ByteBuffer;II)I
    .locals 17

    move/from16 v0, p2

    .line 18
    invoke-virtual/range {p1 .. p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual/range {p4 .. p4}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v2

    if-eqz v2, :cond_0

    move/from16 v2, p5

    .line 19
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

    invoke-virtual/range {v0 .. v6}, Lnet/jpountz/lz4/LZ4JavaSafeSafeDecompressor;->decompress([BII[BII)I

    move-result v1

    return v1

    :cond_0
    move/from16 v3, p3

    move/from16 v2, p5

    move/from16 v6, p6

    .line 20
    invoke-static/range {p1 .. p1}, Lnet/jpountz/util/ByteBufferUtils;->inNativeByteOrder(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v1

    .line 21
    invoke-static/range {p4 .. p4}, Lnet/jpountz/util/ByteBufferUtils;->inNativeByteOrder(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object v4

    .line 22
    invoke-static {v1, v0, v3}, Lnet/jpountz/util/ByteBufferUtils;->checkRange(Ljava/nio/ByteBuffer;II)V

    .line 23
    invoke-static {v4, v2, v6}, Lnet/jpountz/util/ByteBufferUtils;->checkRange(Ljava/nio/ByteBuffer;II)V

    const/4 v5, 0x1

    if-nez v6, :cond_2

    if-ne v3, v5, :cond_1

    .line 24
    invoke-static {v1, v0}, Lnet/jpountz/util/ByteBufferUtils;->readByte(Ljava/nio/ByteBuffer;I)B

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    return v0

    .line 25
    :cond_1
    new-instance v0, Lnet/jpountz/lz4/LZ4Exception;

    const-string v1, "Output buffer too small"

    invoke-direct {v0, v1}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    add-int/2addr v3, v0

    add-int/2addr v6, v2

    move v7, v2

    .line 26
    :goto_0
    invoke-static {v1, v0}, Lnet/jpountz/util/ByteBufferUtils;->readByte(Ljava/nio/ByteBuffer;I)B

    move-result v8

    and-int/lit16 v9, v8, 0xff

    add-int/2addr v0, v5

    ushr-int/lit8 v9, v9, 0x4

    const/16 v10, 0xf

    const/4 v11, -0x1

    if-ne v9, v10, :cond_5

    move v12, v11

    :goto_1
    if-ge v0, v3, :cond_4

    add-int/lit8 v12, v0, 0x1

    .line 27
    invoke-static {v1, v0}, Lnet/jpountz/util/ByteBufferUtils;->readByte(Ljava/nio/ByteBuffer;I)B

    move-result v0

    if-ne v0, v11, :cond_3

    add-int/lit16 v9, v9, 0xff

    move/from16 v16, v12

    move v12, v0

    move/from16 v0, v16

    goto :goto_1

    :cond_3
    move/from16 v16, v12

    move v12, v0

    move/from16 v0, v16

    :cond_4
    and-int/lit16 v12, v12, 0xff

    add-int/2addr v9, v12

    :cond_5
    add-int v12, v7, v9

    add-int/lit8 v13, v6, -0x8

    .line 28
    const-string v14, "Malformed input at "

    if-gt v12, v13, :cond_d

    add-int v15, v0, v9

    add-int/lit8 v5, v3, -0x8

    if-le v15, v5, :cond_6

    goto :goto_4

    .line 29
    :cond_6
    invoke-static {v1, v0, v4, v7, v9}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->wildArraycopy(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;II)V

    .line 30
    invoke-static {v1, v15}, Lnet/jpountz/util/ByteBufferUtils;->readShortLE(Ljava/nio/ByteBuffer;I)I

    move-result v0

    add-int/lit8 v15, v15, 0x2

    sub-int v0, v12, v0

    if-lt v0, v2, :cond_c

    and-int/lit8 v5, v8, 0xf

    if-ne v5, v10, :cond_9

    move v7, v11

    :goto_2
    if-ge v15, v3, :cond_8

    add-int/lit8 v7, v15, 0x1

    .line 31
    invoke-static {v1, v15}, Lnet/jpountz/util/ByteBufferUtils;->readByte(Ljava/nio/ByteBuffer;I)B

    move-result v8

    if-ne v8, v11, :cond_7

    add-int/lit16 v5, v5, 0xff

    move v15, v7

    move v7, v8

    goto :goto_2

    :cond_7
    move v15, v7

    move v7, v8

    :cond_8
    and-int/lit16 v7, v7, 0xff

    add-int/2addr v5, v7

    :cond_9
    add-int/lit8 v5, v5, 0x4

    add-int v7, v12, v5

    if-le v7, v13, :cond_b

    if-gt v7, v6, :cond_a

    .line 32
    invoke-static {v4, v0, v12, v5}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->safeIncrementalCopy(Ljava/nio/ByteBuffer;III)V

    goto :goto_3

    .line 33
    :cond_a
    new-instance v0, Lnet/jpountz/lz4/LZ4Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 34
    :cond_b
    invoke-static {v4, v0, v12, v7}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->wildIncrementalCopy(Ljava/nio/ByteBuffer;III)V

    :goto_3
    move v0, v15

    const/4 v5, 0x1

    goto/16 :goto_0

    .line 35
    :cond_c
    new-instance v0, Lnet/jpountz/lz4/LZ4Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_d
    :goto_4
    if-gt v12, v6, :cond_f

    add-int v5, v0, v9

    if-ne v5, v3, :cond_e

    .line 36
    invoke-static {v1, v0, v4, v7, v9}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->safeArraycopy(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;II)V

    sub-int/2addr v12, v2

    return v12

    .line 37
    :cond_e
    new-instance v1, Lnet/jpountz/lz4/LZ4Exception;

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v2, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v0}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw v1

    .line 38
    :cond_f
    new-instance v0, Lnet/jpountz/lz4/LZ4Exception;

    invoke-direct {v0}, Lnet/jpountz/lz4/LZ4Exception;-><init>()V

    throw v0
.end method

.method public decompress([BII[BII)I
    .locals 17

    move-object/from16 v0, p1

    move/from16 v1, p3

    move-object/from16 v2, p4

    move/from16 v3, p5

    .line 1
    invoke-static/range {p1 .. p3}, Lnet/jpountz/util/SafeUtils;->checkRange([BII)V

    .line 2
    invoke-static/range {p4 .. p6}, Lnet/jpountz/util/SafeUtils;->checkRange([BII)V

    const/4 v4, 0x1

    if-nez p6, :cond_1

    if-ne v1, v4, :cond_0

    .line 3
    invoke-static/range {p1 .. p2}, Lnet/jpountz/util/SafeUtils;->readByte([BI)B

    move-result v0

    if-nez v0, :cond_0

    const/4 v0, 0x0

    return v0

    .line 4
    :cond_0
    new-instance v0, Lnet/jpountz/lz4/LZ4Exception;

    const-string v1, "Output buffer too small"

    invoke-direct {v0, v1}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    add-int v1, p2, v1

    add-int v5, v3, p6

    move/from16 v6, p2

    move v7, v3

    .line 5
    :goto_0
    invoke-static {v0, v6}, Lnet/jpountz/util/SafeUtils;->readByte([BI)B

    move-result v8

    and-int/lit16 v9, v8, 0xff

    add-int/2addr v6, v4

    ushr-int/lit8 v9, v9, 0x4

    const/16 v10, 0xf

    const/4 v11, -0x1

    if-ne v9, v10, :cond_4

    move v12, v11

    :goto_1
    if-ge v6, v1, :cond_3

    add-int/lit8 v12, v6, 0x1

    .line 6
    invoke-static {v0, v6}, Lnet/jpountz/util/SafeUtils;->readByte([BI)B

    move-result v6

    if-ne v6, v11, :cond_2

    add-int/lit16 v9, v9, 0xff

    move/from16 v16, v12

    move v12, v6

    move/from16 v6, v16

    goto :goto_1

    :cond_2
    move/from16 v16, v12

    move v12, v6

    move/from16 v6, v16

    :cond_3
    and-int/lit16 v12, v12, 0xff

    add-int/2addr v9, v12

    :cond_4
    add-int v12, v7, v9

    add-int/lit8 v13, v5, -0x8

    .line 7
    const-string v14, "Malformed input at "

    if-gt v12, v13, :cond_c

    add-int v15, v6, v9

    add-int/lit8 v4, v1, -0x8

    if-le v15, v4, :cond_5

    goto :goto_4

    .line 8
    :cond_5
    invoke-static {v0, v6, v2, v7, v9}, Lnet/jpountz/lz4/LZ4SafeUtils;->wildArraycopy([BI[BII)V

    .line 9
    invoke-static {v0, v15}, Lnet/jpountz/util/SafeUtils;->readShortLE([BI)I

    move-result v4

    add-int/lit8 v15, v15, 0x2

    sub-int v4, v12, v4

    if-lt v4, v3, :cond_b

    and-int/lit8 v6, v8, 0xf

    if-ne v6, v10, :cond_8

    move v7, v11

    :goto_2
    if-ge v15, v1, :cond_7

    add-int/lit8 v7, v15, 0x1

    .line 10
    invoke-static {v0, v15}, Lnet/jpountz/util/SafeUtils;->readByte([BI)B

    move-result v8

    if-ne v8, v11, :cond_6

    add-int/lit16 v6, v6, 0xff

    move v15, v7

    move v7, v8

    goto :goto_2

    :cond_6
    move v15, v7

    move v7, v8

    :cond_7
    and-int/lit16 v7, v7, 0xff

    add-int/2addr v6, v7

    :cond_8
    add-int/lit8 v6, v6, 0x4

    add-int v7, v12, v6

    if-le v7, v13, :cond_a

    if-gt v7, v5, :cond_9

    .line 11
    invoke-static {v2, v4, v12, v6}, Lnet/jpountz/lz4/LZ4SafeUtils;->safeIncrementalCopy([BIII)V

    goto :goto_3

    .line 12
    :cond_9
    new-instance v0, Lnet/jpountz/lz4/LZ4Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 13
    :cond_a
    invoke-static {v2, v4, v12, v7}, Lnet/jpountz/lz4/LZ4SafeUtils;->wildIncrementalCopy([BIII)V

    :goto_3
    move v6, v15

    const/4 v4, 0x1

    goto/16 :goto_0

    .line 14
    :cond_b
    new-instance v0, Lnet/jpountz/lz4/LZ4Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v15}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_c
    :goto_4
    if-gt v12, v5, :cond_e

    add-int v4, v6, v9

    if-ne v4, v1, :cond_d

    .line 15
    invoke-static {v0, v6, v2, v7, v9}, Lnet/jpountz/lz4/LZ4SafeUtils;->safeArraycopy([BI[BII)V

    sub-int/2addr v12, v3

    return v12

    .line 16
    :cond_d
    new-instance v0, Lnet/jpountz/lz4/LZ4Exception;

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v1, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v1}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw v0

    .line 17
    :cond_e
    new-instance v0, Lnet/jpountz/lz4/LZ4Exception;

    invoke-direct {v0}, Lnet/jpountz/lz4/LZ4Exception;-><init>()V

    throw v0
.end method
