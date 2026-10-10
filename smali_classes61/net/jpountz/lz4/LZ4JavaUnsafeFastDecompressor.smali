.class final Lnet/jpountz/lz4/LZ4JavaUnsafeFastDecompressor;
.super Lnet/jpountz/lz4/LZ4FastDecompressor;
.source "LZ4JavaUnsafeFastDecompressor.java"


# static fields
.field public static final INSTANCE:Lnet/jpountz/lz4/LZ4FastDecompressor;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lnet/jpountz/lz4/LZ4JavaUnsafeFastDecompressor;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lnet/jpountz/lz4/LZ4JavaUnsafeFastDecompressor;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lnet/jpountz/lz4/LZ4JavaUnsafeFastDecompressor;->INSTANCE:Lnet/jpountz/lz4/LZ4FastDecompressor;

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
    invoke-direct {p0}, Lnet/jpountz/lz4/LZ4FastDecompressor;-><init>()V

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
.method public decompress(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;II)I
    .locals 10

    .line 17
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->hasArray()Z

    move-result v0

    if-eqz v0, :cond_0

    .line 18
    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v2

    invoke-virtual {p1}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p1

    add-int v3, p2, p1

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object v4

    invoke-virtual {p3}, Ljava/nio/ByteBuffer;->arrayOffset()I

    move-result p1

    add-int v5, p4, p1

    move-object v1, p0

    move v6, p5

    invoke-virtual/range {v1 .. v6}, Lnet/jpountz/lz4/LZ4JavaUnsafeFastDecompressor;->decompress([BI[BII)I

    move-result p1

    return p1

    :cond_0
    move v6, p5

    .line 19
    invoke-static {p1}, Lnet/jpountz/util/ByteBufferUtils;->inNativeByteOrder(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p1

    .line 20
    invoke-static {p3}, Lnet/jpountz/util/ByteBufferUtils;->inNativeByteOrder(Ljava/nio/ByteBuffer;)Ljava/nio/ByteBuffer;

    move-result-object p3

    .line 21
    invoke-static {p1, p2}, Lnet/jpountz/util/ByteBufferUtils;->checkRange(Ljava/nio/ByteBuffer;I)V

    .line 22
    invoke-static {p3, p4, v6}, Lnet/jpountz/util/ByteBufferUtils;->checkRange(Ljava/nio/ByteBuffer;II)V

    const/4 p5, 0x1

    .line 23
    const-string v0, "Malformed input at "

    if-nez v6, :cond_2

    .line 24
    invoke-static {p1, p2}, Lnet/jpountz/util/ByteBufferUtils;->readByte(Ljava/nio/ByteBuffer;I)B

    move-result p1

    if-nez p1, :cond_1

    return p5

    .line 25
    :cond_1
    new-instance p1, Lnet/jpountz/lz4/LZ4Exception;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    add-int v1, p4, v6

    move v2, p2

    move v3, p4

    .line 26
    :goto_0
    invoke-static {p1, v2}, Lnet/jpountz/util/ByteBufferUtils;->readByte(Ljava/nio/ByteBuffer;I)B

    move-result v4

    and-int/lit16 v5, v4, 0xff

    add-int/2addr v2, p5

    ushr-int/lit8 v5, v5, 0x4

    const/4 v6, -0x1

    const/16 v7, 0xf

    if-ne v5, v7, :cond_4

    :goto_1
    add-int/lit8 v8, v2, 0x1

    .line 27
    invoke-static {p1, v2}, Lnet/jpountz/util/ByteBufferUtils;->readByte(Ljava/nio/ByteBuffer;I)B

    move-result v2

    if-ne v2, v6, :cond_3

    add-int/lit16 v5, v5, 0xff

    move v2, v8

    goto :goto_1

    :cond_3
    and-int/lit16 v2, v2, 0xff

    add-int/2addr v5, v2

    move v2, v8

    :cond_4
    add-int v8, v3, v5

    add-int/lit8 v9, v1, -0x8

    if-le v8, v9, :cond_6

    if-ne v8, v1, :cond_5

    .line 28
    invoke-static {p1, v2, p3, v3, v5}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->safeArraycopy(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;II)V

    add-int/2addr v2, v5

    sub-int/2addr v2, p2

    return v2

    .line 29
    :cond_5
    new-instance p1, Lnet/jpountz/lz4/LZ4Exception;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 30
    :cond_6
    invoke-static {p1, v2, p3, v3, v5}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->wildArraycopy(Ljava/nio/ByteBuffer;ILjava/nio/ByteBuffer;II)V

    add-int/2addr v2, v5

    .line 31
    invoke-static {p1, v2}, Lnet/jpountz/util/ByteBufferUtils;->readShortLE(Ljava/nio/ByteBuffer;I)I

    move-result v3

    add-int/lit8 v2, v2, 0x2

    sub-int v3, v8, v3

    if-lt v3, p4, :cond_b

    and-int/lit8 v4, v4, 0xf

    if-ne v4, v7, :cond_8

    :goto_2
    add-int/lit8 v5, v2, 0x1

    .line 32
    invoke-static {p1, v2}, Lnet/jpountz/util/ByteBufferUtils;->readByte(Ljava/nio/ByteBuffer;I)B

    move-result v2

    if-ne v2, v6, :cond_7

    add-int/lit16 v4, v4, 0xff

    move v2, v5

    goto :goto_2

    :cond_7
    and-int/lit16 v2, v2, 0xff

    add-int/2addr v4, v2

    move v2, v5

    :cond_8
    add-int/lit8 v4, v4, 0x4

    add-int v5, v8, v4

    if-le v5, v9, :cond_a

    if-gt v5, v1, :cond_9

    .line 33
    invoke-static {p3, v3, v8, v4}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->safeIncrementalCopy(Ljava/nio/ByteBuffer;III)V

    goto :goto_3

    .line 34
    :cond_9
    new-instance p1, Lnet/jpountz/lz4/LZ4Exception;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 35
    :cond_a
    invoke-static {p3, v3, v8, v5}, Lnet/jpountz/lz4/LZ4ByteBufferUtils;->wildIncrementalCopy(Ljava/nio/ByteBuffer;III)V

    :goto_3
    move v3, v5

    goto/16 :goto_0

    .line 36
    :cond_b
    new-instance p1, Lnet/jpountz/lz4/LZ4Exception;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public decompress([BI[BII)I
    .locals 10

    .line 1
    invoke-static {p1, p2}, Lnet/jpountz/util/UnsafeUtils;->checkRange([BI)V

    .line 2
    invoke-static {p3, p4, p5}, Lnet/jpountz/util/UnsafeUtils;->checkRange([BII)V

    const/4 v0, 0x1

    .line 3
    const-string v1, "Malformed input at "

    if-nez p5, :cond_1

    .line 4
    invoke-static {p1, p2}, Lnet/jpountz/util/UnsafeUtils;->readByte([BI)B

    move-result p1

    if-nez p1, :cond_0

    return v0

    .line 5
    :cond_0
    new-instance p1, Lnet/jpountz/lz4/LZ4Exception;

    new-instance p3, Ljava/lang/StringBuilder;

    invoke-direct {p3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p3, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    add-int/2addr p5, p4

    move v2, p2

    move v3, p4

    .line 6
    :goto_0
    invoke-static {p1, v2}, Lnet/jpountz/util/UnsafeUtils;->readByte([BI)B

    move-result v4

    and-int/lit16 v5, v4, 0xff

    add-int/2addr v2, v0

    ushr-int/lit8 v5, v5, 0x4

    const/4 v6, -0x1

    const/16 v7, 0xf

    if-ne v5, v7, :cond_3

    :goto_1
    add-int/lit8 v8, v2, 0x1

    .line 7
    invoke-static {p1, v2}, Lnet/jpountz/util/UnsafeUtils;->readByte([BI)B

    move-result v2

    if-ne v2, v6, :cond_2

    add-int/lit16 v5, v5, 0xff

    move v2, v8

    goto :goto_1

    :cond_2
    and-int/lit16 v2, v2, 0xff

    add-int/2addr v5, v2

    move v2, v8

    :cond_3
    add-int v8, v3, v5

    add-int/lit8 v9, p5, -0x8

    if-le v8, v9, :cond_5

    if-ne v8, p5, :cond_4

    .line 8
    invoke-static {p1, v2, p3, v3, v5}, Lnet/jpountz/lz4/LZ4UnsafeUtils;->safeArraycopy([BI[BII)V

    add-int/2addr v2, v5

    sub-int/2addr v2, p2

    return v2

    .line 9
    :cond_4
    new-instance p1, Lnet/jpountz/lz4/LZ4Exception;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 10
    :cond_5
    invoke-static {p1, v2, p3, v3, v5}, Lnet/jpountz/lz4/LZ4UnsafeUtils;->wildArraycopy([BI[BII)V

    add-int/2addr v2, v5

    .line 11
    invoke-static {p1, v2}, Lnet/jpountz/util/UnsafeUtils;->readShortLE([BI)I

    move-result v3

    add-int/lit8 v2, v2, 0x2

    sub-int v3, v8, v3

    if-lt v3, p4, :cond_a

    and-int/lit8 v4, v4, 0xf

    if-ne v4, v7, :cond_7

    :goto_2
    add-int/lit8 v5, v2, 0x1

    .line 12
    invoke-static {p1, v2}, Lnet/jpountz/util/UnsafeUtils;->readByte([BI)B

    move-result v2

    if-ne v2, v6, :cond_6

    add-int/lit16 v4, v4, 0xff

    move v2, v5

    goto :goto_2

    :cond_6
    and-int/lit16 v2, v2, 0xff

    add-int/2addr v4, v2

    move v2, v5

    :cond_7
    add-int/lit8 v4, v4, 0x4

    add-int v5, v8, v4

    if-le v5, v9, :cond_9

    if-gt v5, p5, :cond_8

    .line 13
    invoke-static {p3, v3, v8, v4}, Lnet/jpountz/lz4/LZ4UnsafeUtils;->safeIncrementalCopy([BIII)V

    goto :goto_3

    .line 14
    :cond_8
    new-instance p1, Lnet/jpountz/lz4/LZ4Exception;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw p1

    .line 15
    :cond_9
    invoke-static {p3, v3, v8, v5}, Lnet/jpountz/lz4/LZ4UnsafeUtils;->wildIncrementalCopy([BIII)V

    :goto_3
    move v3, v5

    goto/16 :goto_0

    .line 16
    :cond_a
    new-instance p1, Lnet/jpountz/lz4/LZ4Exception;

    new-instance p2, Ljava/lang/StringBuilder;

    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {p2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p2, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Lnet/jpountz/lz4/LZ4Exception;-><init>(Ljava/lang/String;)V

    throw p1
.end method
