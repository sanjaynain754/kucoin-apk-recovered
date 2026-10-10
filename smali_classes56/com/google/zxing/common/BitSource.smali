.class public final Lcom/google/zxing/common/BitSource;
.super Ljava/lang/Object;
.source "BitSource.java"


# instance fields
.field private bitOffset:I

.field private byteOffset:I

.field private final bytes:[B


# direct methods
.method public constructor <init>([B)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    iput-object p1, p0, Lcom/google/zxing/common/BitSource;->bytes:[B

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
    .line 24
.end method


# virtual methods
.method public available()I
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/zxing/common/BitSource;->bytes:[B

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    iget v1, p0, Lcom/google/zxing/common/BitSource;->byteOffset:I

    .line 6
    sub-int/2addr v0, v1

    .line 7
    .line 8
    mul-int/lit8 v0, v0, 0x8

    .line 9
    .line 10
    iget v1, p0, Lcom/google/zxing/common/BitSource;->bitOffset:I

    .line 11
    sub-int/2addr v0, v1

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public getBitOffset()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/google/zxing/common/BitSource;->bitOffset:I

    .line 3
    return v0
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
.end method

.method public getByteOffset()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/google/zxing/common/BitSource;->byteOffset:I

    .line 3
    return v0
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
.end method

.method public readBits(I)I
    .locals 9

    .line 1
    .line 2
    if-lez p1, :cond_5

    .line 3
    .line 4
    const/16 v0, 0x20

    .line 5
    .line 6
    if-gt p1, v0, :cond_5

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Lcom/google/zxing/common/BitSource;->available()I

    .line 10
    move-result v0

    .line 11
    .line 12
    if-gt p1, v0, :cond_5

    .line 13
    .line 14
    iget v0, p0, Lcom/google/zxing/common/BitSource;->bitOffset:I

    .line 15
    const/4 v1, 0x0

    .line 16
    .line 17
    const/16 v2, 0xff

    .line 18
    .line 19
    const/16 v3, 0x8

    .line 20
    .line 21
    if-lez v0, :cond_2

    .line 22
    .line 23
    rsub-int/lit8 v4, v0, 0x8

    .line 24
    .line 25
    if-ge p1, v4, :cond_0

    .line 26
    move v5, p1

    .line 27
    goto :goto_0

    .line 28
    :cond_0
    move v5, v4

    .line 29
    :goto_0
    sub-int/2addr v4, v5

    .line 30
    .line 31
    rsub-int/lit8 v6, v5, 0x8

    .line 32
    .line 33
    shr-int v6, v2, v6

    .line 34
    shl-int/2addr v6, v4

    .line 35
    .line 36
    iget-object v7, p0, Lcom/google/zxing/common/BitSource;->bytes:[B

    .line 37
    .line 38
    iget v8, p0, Lcom/google/zxing/common/BitSource;->byteOffset:I

    .line 39
    .line 40
    aget-byte v7, v7, v8

    .line 41
    and-int/2addr v6, v7

    .line 42
    .line 43
    shr-int v4, v6, v4

    .line 44
    sub-int/2addr p1, v5

    .line 45
    add-int/2addr v0, v5

    .line 46
    .line 47
    iput v0, p0, Lcom/google/zxing/common/BitSource;->bitOffset:I

    .line 48
    .line 49
    if-ne v0, v3, :cond_1

    .line 50
    .line 51
    iput v1, p0, Lcom/google/zxing/common/BitSource;->bitOffset:I

    .line 52
    .line 53
    add-int/lit8 v8, v8, 0x1

    .line 54
    .line 55
    iput v8, p0, Lcom/google/zxing/common/BitSource;->byteOffset:I

    .line 56
    :cond_1
    move v1, v4

    .line 57
    .line 58
    :cond_2
    if-lez p1, :cond_4

    .line 59
    .line 60
    :goto_1
    if-lt p1, v3, :cond_3

    .line 61
    .line 62
    shl-int/lit8 v0, v1, 0x8

    .line 63
    .line 64
    iget-object v1, p0, Lcom/google/zxing/common/BitSource;->bytes:[B

    .line 65
    .line 66
    iget v4, p0, Lcom/google/zxing/common/BitSource;->byteOffset:I

    .line 67
    .line 68
    aget-byte v1, v1, v4

    .line 69
    and-int/2addr v1, v2

    .line 70
    or-int/2addr v1, v0

    .line 71
    .line 72
    add-int/lit8 v4, v4, 0x1

    .line 73
    .line 74
    iput v4, p0, Lcom/google/zxing/common/BitSource;->byteOffset:I

    .line 75
    .line 76
    add-int/lit8 p1, p1, -0x8

    .line 77
    goto :goto_1

    .line 78
    .line 79
    :cond_3
    if-lez p1, :cond_4

    .line 80
    .line 81
    rsub-int/lit8 v0, p1, 0x8

    .line 82
    shr-int/2addr v2, v0

    .line 83
    shl-int/2addr v2, v0

    .line 84
    shl-int/2addr v1, p1

    .line 85
    .line 86
    iget-object v3, p0, Lcom/google/zxing/common/BitSource;->bytes:[B

    .line 87
    .line 88
    iget v4, p0, Lcom/google/zxing/common/BitSource;->byteOffset:I

    .line 89
    .line 90
    aget-byte v3, v3, v4

    .line 91
    and-int/2addr v2, v3

    .line 92
    .line 93
    shr-int v0, v2, v0

    .line 94
    or-int/2addr v0, v1

    .line 95
    .line 96
    iget v1, p0, Lcom/google/zxing/common/BitSource;->bitOffset:I

    .line 97
    add-int/2addr v1, p1

    .line 98
    .line 99
    iput v1, p0, Lcom/google/zxing/common/BitSource;->bitOffset:I

    .line 100
    return v0

    .line 101
    :cond_4
    return v1

    .line 102
    .line 103
    :cond_5
    new-instance v0, Ljava/lang/IllegalArgumentException;

    .line 104
    .line 105
    .line 106
    invoke-static {p1}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 107
    move-result-object p1

    .line 108
    .line 109
    .line 110
    invoke-direct {v0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 111
    throw v0
    .line 112
.end method
