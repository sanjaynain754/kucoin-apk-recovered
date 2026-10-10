.class public final Lcom/google/zxing/common/BitArray;
.super Ljava/lang/Object;
.source "BitArray.java"

# interfaces
.implements Ljava/lang/Cloneable;


# instance fields
.field private bits:[I

.field private size:I


# direct methods
.method public constructor <init>()V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lcom/google/zxing/common/BitArray;->size:I

    const/4 v0, 0x1

    .line 3
    new-array v0, v0, [I

    iput-object v0, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 6
    invoke-static {p1}, Lcom/google/zxing/common/BitArray;->makeArray(I)[I

    move-result-object p1

    iput-object p1, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    return-void
.end method

.method public constructor <init>([II)V
    .locals 0

    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    iput-object p1, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 9
    iput p2, p0, Lcom/google/zxing/common/BitArray;->size:I

    return-void
.end method

.method private ensureCapacity(I)V
    .locals 3

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    shl-int/lit8 v0, v0, 0x5

    .line 6
    .line 7
    if-le p1, v0, :cond_0

    .line 8
    .line 9
    .line 10
    invoke-static {p1}, Lcom/google/zxing/common/BitArray;->makeArray(I)[I

    .line 11
    move-result-object p1

    .line 12
    .line 13
    iget-object v0, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 14
    array-length v1, v0

    .line 15
    const/4 v2, 0x0

    .line 16
    .line 17
    .line 18
    invoke-static {v0, v2, p1, v2, v1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 19
    .line 20
    iput-object p1, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 21
    :cond_0
    return-void
    .line 22
    .line 23
    .line 24
.end method

.method private static makeArray(I)[I
    .locals 0

    .line 1
    .line 2
    add-int/lit8 p0, p0, 0x1f

    .line 3
    .line 4
    div-int/lit8 p0, p0, 0x20

    .line 5
    .line 6
    new-array p0, p0, [I

    .line 7
    return-object p0
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
.method public appendBit(Z)V
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 3
    const/4 v1, 0x1

    .line 4
    add-int/2addr v0, v1

    .line 5
    .line 6
    .line 7
    invoke-direct {p0, v0}, Lcom/google/zxing/common/BitArray;->ensureCapacity(I)V

    .line 8
    .line 9
    if-eqz p1, :cond_0

    .line 10
    .line 11
    iget-object p1, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 12
    .line 13
    iget v0, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 14
    .line 15
    div-int/lit8 v2, v0, 0x20

    .line 16
    .line 17
    aget v3, p1, v2

    .line 18
    .line 19
    and-int/lit8 v0, v0, 0x1f

    .line 20
    .line 21
    shl-int v0, v1, v0

    .line 22
    or-int/2addr v0, v3

    .line 23
    .line 24
    aput v0, p1, v2

    .line 25
    .line 26
    :cond_0
    iget p1, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 27
    add-int/2addr p1, v1

    .line 28
    .line 29
    iput p1, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 30
    return-void
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
.end method

.method public appendBitArray(Lcom/google/zxing/common/BitArray;)V
    .locals 3

    .line 1
    .line 2
    iget v0, p1, Lcom/google/zxing/common/BitArray;->size:I

    .line 3
    .line 4
    iget v1, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 5
    add-int/2addr v1, v0

    .line 6
    .line 7
    .line 8
    invoke-direct {p0, v1}, Lcom/google/zxing/common/BitArray;->ensureCapacity(I)V

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    :goto_0
    if-ge v1, v0, :cond_0

    .line 12
    .line 13
    .line 14
    invoke-virtual {p1, v1}, Lcom/google/zxing/common/BitArray;->get(I)Z

    .line 15
    move-result v2

    .line 16
    .line 17
    .line 18
    invoke-virtual {p0, v2}, Lcom/google/zxing/common/BitArray;->appendBit(Z)V

    .line 19
    .line 20
    add-int/lit8 v1, v1, 0x1

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    return-void
    .line 23
    .line 24
.end method

.method public appendBits(II)V
    .locals 2

    .line 1
    .line 2
    if-ltz p2, :cond_2

    .line 3
    .line 4
    const/16 v0, 0x20

    .line 5
    .line 6
    if-gt p2, v0, :cond_2

    .line 7
    .line 8
    iget v0, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 9
    add-int/2addr v0, p2

    .line 10
    .line 11
    .line 12
    invoke-direct {p0, v0}, Lcom/google/zxing/common/BitArray;->ensureCapacity(I)V

    .line 13
    .line 14
    :goto_0
    if-lez p2, :cond_1

    .line 15
    .line 16
    add-int/lit8 v0, p2, -0x1

    .line 17
    .line 18
    shr-int v0, p1, v0

    .line 19
    const/4 v1, 0x1

    .line 20
    and-int/2addr v0, v1

    .line 21
    .line 22
    if-ne v0, v1, :cond_0

    .line 23
    goto :goto_1

    .line 24
    :cond_0
    const/4 v1, 0x0

    .line 25
    .line 26
    .line 27
    :goto_1
    invoke-virtual {p0, v1}, Lcom/google/zxing/common/BitArray;->appendBit(Z)V

    .line 28
    .line 29
    add-int/lit8 p2, p2, -0x1

    .line 30
    goto :goto_0

    .line 31
    :cond_1
    return-void

    .line 32
    .line 33
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 34
    .line 35
    const-string p2, "Num bits must be between 0 and 32"

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    throw p1
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
.end method

.method public clear()V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 3
    array-length v0, v0

    .line 4
    const/4 v1, 0x0

    .line 5
    move v2, v1

    .line 6
    .line 7
    :goto_0
    if-ge v2, v0, :cond_0

    .line 8
    .line 9
    iget-object v3, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 10
    .line 11
    aput v1, v3, v2

    .line 12
    .line 13
    add-int/lit8 v2, v2, 0x1

    .line 14
    goto :goto_0

    .line 15
    :cond_0
    return-void
    .line 16
.end method

.method public clone()Lcom/google/zxing/common/BitArray;
    .locals 3

    .line 2
    new-instance v0, Lcom/google/zxing/common/BitArray;

    iget-object v1, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    invoke-virtual {v1}, [I->clone()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, [I

    iget v2, p0, Lcom/google/zxing/common/BitArray;->size:I

    invoke-direct {v0, v1, v2}, Lcom/google/zxing/common/BitArray;-><init>([II)V

    return-object v0
.end method

.method public bridge synthetic clone()Ljava/lang/Object;
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/CloneNotSupportedException;
        }
    .end annotation

    .line 1
    invoke-virtual {p0}, Lcom/google/zxing/common/BitArray;->clone()Lcom/google/zxing/common/BitArray;

    move-result-object v0

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 3

    .line 1
    .line 2
    instance-of v0, p1, Lcom/google/zxing/common/BitArray;

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    :cond_0
    check-cast p1, Lcom/google/zxing/common/BitArray;

    .line 9
    .line 10
    iget v0, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 11
    .line 12
    iget v2, p1, Lcom/google/zxing/common/BitArray;->size:I

    .line 13
    .line 14
    if-ne v0, v2, :cond_1

    .line 15
    .line 16
    iget-object v0, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 17
    .line 18
    iget-object p1, p1, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 19
    .line 20
    .line 21
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([I[I)Z

    .line 22
    move-result p1

    .line 23
    .line 24
    if-eqz p1, :cond_1

    .line 25
    const/4 p1, 0x1

    .line 26
    return p1

    .line 27
    :cond_1
    return v1
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
.end method

.method public flip(I)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 3
    .line 4
    div-int/lit8 v1, p1, 0x20

    .line 5
    .line 6
    aget v2, v0, v1

    .line 7
    .line 8
    and-int/lit8 p1, p1, 0x1f

    .line 9
    const/4 v3, 0x1

    .line 10
    .line 11
    shl-int p1, v3, p1

    .line 12
    xor-int/2addr p1, v2

    .line 13
    .line 14
    aput p1, v0, v1

    .line 15
    return-void
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

.method public get(I)Z
    .locals 2

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 3
    .line 4
    div-int/lit8 v1, p1, 0x20

    .line 5
    .line 6
    aget v0, v0, v1

    .line 7
    .line 8
    and-int/lit8 p1, p1, 0x1f

    .line 9
    const/4 v1, 0x1

    .line 10
    .line 11
    shl-int p1, v1, p1

    .line 12
    and-int/2addr p1, v0

    .line 13
    .line 14
    if-eqz p1, :cond_0

    .line 15
    return v1

    .line 16
    :cond_0
    const/4 p1, 0x0

    .line 17
    return p1
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
.end method

.method public getBitArray()[I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/zxing/common/BitArray;->bits:[I

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
.end method

.method public getNextSet(I)I
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 3
    .line 4
    if-lt p1, v0, :cond_0

    .line 5
    return v0

    .line 6
    .line 7
    :cond_0
    div-int/lit8 v0, p1, 0x20

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 10
    .line 11
    aget v1, v1, v0

    .line 12
    .line 13
    and-int/lit8 p1, p1, 0x1f

    .line 14
    const/4 v2, 0x1

    .line 15
    .line 16
    shl-int p1, v2, p1

    .line 17
    sub-int/2addr p1, v2

    .line 18
    not-int p1, p1

    .line 19
    and-int/2addr p1, v1

    .line 20
    .line 21
    :goto_0
    if-nez p1, :cond_2

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    .line 25
    iget-object p1, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 26
    array-length v1, p1

    .line 27
    .line 28
    if-ne v0, v1, :cond_1

    .line 29
    .line 30
    iget p1, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 31
    return p1

    .line 32
    .line 33
    :cond_1
    aget p1, p1, v0

    .line 34
    goto :goto_0

    .line 35
    .line 36
    :cond_2
    shl-int/lit8 v0, v0, 0x5

    .line 37
    .line 38
    .line 39
    invoke-static {p1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 40
    move-result p1

    .line 41
    add-int/2addr v0, p1

    .line 42
    .line 43
    iget p1, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 44
    .line 45
    if-le v0, p1, :cond_3

    .line 46
    return p1

    .line 47
    :cond_3
    return v0
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
.end method

.method public getNextUnset(I)I
    .locals 3

    .line 1
    .line 2
    iget v0, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 3
    .line 4
    if-lt p1, v0, :cond_0

    .line 5
    return v0

    .line 6
    .line 7
    :cond_0
    div-int/lit8 v0, p1, 0x20

    .line 8
    .line 9
    iget-object v1, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 10
    .line 11
    aget v1, v1, v0

    .line 12
    not-int v1, v1

    .line 13
    .line 14
    and-int/lit8 p1, p1, 0x1f

    .line 15
    const/4 v2, 0x1

    .line 16
    .line 17
    shl-int p1, v2, p1

    .line 18
    sub-int/2addr p1, v2

    .line 19
    not-int p1, p1

    .line 20
    and-int/2addr p1, v1

    .line 21
    .line 22
    :goto_0
    if-nez p1, :cond_2

    .line 23
    .line 24
    add-int/lit8 v0, v0, 0x1

    .line 25
    .line 26
    iget-object p1, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 27
    array-length v1, p1

    .line 28
    .line 29
    if-ne v0, v1, :cond_1

    .line 30
    .line 31
    iget p1, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 32
    return p1

    .line 33
    .line 34
    :cond_1
    aget p1, p1, v0

    .line 35
    not-int p1, p1

    .line 36
    goto :goto_0

    .line 37
    .line 38
    :cond_2
    shl-int/lit8 v0, v0, 0x5

    .line 39
    .line 40
    .line 41
    invoke-static {p1}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 42
    move-result p1

    .line 43
    add-int/2addr v0, p1

    .line 44
    .line 45
    iget p1, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 46
    .line 47
    if-le v0, p1, :cond_3

    .line 48
    return p1

    .line 49
    :cond_3
    return v0
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
.end method

.method public getSize()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/google/zxing/common/BitArray;->size:I

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

.method public getSizeInBytes()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 3
    .line 4
    add-int/lit8 v0, v0, 0x7

    .line 5
    .line 6
    div-int/lit8 v0, v0, 0x8

    .line 7
    return v0
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

.method public hashCode()I
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 3
    .line 4
    mul-int/lit8 v0, v0, 0x1f

    .line 5
    .line 6
    iget-object v1, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 7
    .line 8
    .line 9
    invoke-static {v1}, Ljava/util/Arrays;->hashCode([I)I

    .line 10
    move-result v1

    .line 11
    add-int/2addr v0, v1

    .line 12
    return v0
    .line 13
    .line 14
    .line 15
    .line 16
.end method

.method public isRange(IIZ)Z
    .locals 8

    .line 1
    .line 2
    if-lt p2, p1, :cond_6

    .line 3
    .line 4
    if-ltz p1, :cond_6

    .line 5
    .line 6
    iget v0, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 7
    .line 8
    if-gt p2, v0, :cond_6

    .line 9
    const/4 v0, 0x1

    .line 10
    .line 11
    if-ne p2, p1, :cond_0

    .line 12
    return v0

    .line 13
    .line 14
    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 15
    .line 16
    div-int/lit8 v1, p1, 0x20

    .line 17
    .line 18
    div-int/lit8 v2, p2, 0x20

    .line 19
    move v3, v1

    .line 20
    .line 21
    :goto_0
    if-gt v3, v2, :cond_5

    .line 22
    .line 23
    const/16 v4, 0x1f

    .line 24
    const/4 v5, 0x0

    .line 25
    .line 26
    if-le v3, v1, :cond_1

    .line 27
    move v6, v5

    .line 28
    goto :goto_1

    .line 29
    .line 30
    :cond_1
    and-int/lit8 v6, p1, 0x1f

    .line 31
    .line 32
    :goto_1
    if-ge v3, v2, :cond_2

    .line 33
    goto :goto_2

    .line 34
    :cond_2
    and-int/2addr v4, p2

    .line 35
    :goto_2
    const/4 v7, 0x2

    .line 36
    .line 37
    shl-int v4, v7, v4

    .line 38
    .line 39
    shl-int v6, v0, v6

    .line 40
    sub-int/2addr v4, v6

    .line 41
    .line 42
    iget-object v6, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 43
    .line 44
    aget v6, v6, v3

    .line 45
    and-int/2addr v6, v4

    .line 46
    .line 47
    if-eqz p3, :cond_3

    .line 48
    goto :goto_3

    .line 49
    :cond_3
    move v4, v5

    .line 50
    .line 51
    :goto_3
    if-eq v6, v4, :cond_4

    .line 52
    return v5

    .line 53
    .line 54
    :cond_4
    add-int/lit8 v3, v3, 0x1

    .line 55
    goto :goto_0

    .line 56
    :cond_5
    return v0

    .line 57
    .line 58
    :cond_6
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 59
    .line 60
    .line 61
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 62
    throw p1
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
.end method

.method public reverse()V
    .locals 13

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 3
    array-length v0, v0

    .line 4
    .line 5
    new-array v0, v0, [I

    .line 6
    .line 7
    iget v1, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 8
    const/4 v2, 0x1

    .line 9
    sub-int/2addr v1, v2

    .line 10
    .line 11
    div-int/lit8 v1, v1, 0x20

    .line 12
    .line 13
    add-int/lit8 v3, v1, 0x1

    .line 14
    const/4 v4, 0x0

    .line 15
    move v5, v4

    .line 16
    .line 17
    :goto_0
    if-ge v5, v3, :cond_0

    .line 18
    .line 19
    iget-object v6, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 20
    .line 21
    aget v6, v6, v5

    .line 22
    int-to-long v6, v6

    .line 23
    .line 24
    shr-long v8, v6, v2

    .line 25
    .line 26
    .line 27
    const-wide/32 v10, 0x55555555

    .line 28
    and-long/2addr v8, v10

    .line 29
    and-long/2addr v6, v10

    .line 30
    shl-long/2addr v6, v2

    .line 31
    or-long/2addr v6, v8

    .line 32
    const/4 v8, 0x2

    .line 33
    .line 34
    shr-long v9, v6, v8

    .line 35
    .line 36
    .line 37
    const-wide/32 v11, 0x33333333

    .line 38
    and-long/2addr v9, v11

    .line 39
    and-long/2addr v6, v11

    .line 40
    shl-long/2addr v6, v8

    .line 41
    or-long/2addr v6, v9

    .line 42
    const/4 v8, 0x4

    .line 43
    .line 44
    shr-long v9, v6, v8

    .line 45
    .line 46
    .line 47
    const-wide/32 v11, 0xf0f0f0f

    .line 48
    and-long/2addr v9, v11

    .line 49
    and-long/2addr v6, v11

    .line 50
    shl-long/2addr v6, v8

    .line 51
    or-long/2addr v6, v9

    .line 52
    .line 53
    const/16 v8, 0x8

    .line 54
    .line 55
    shr-long v9, v6, v8

    .line 56
    .line 57
    .line 58
    const-wide/32 v11, 0xff00ff

    .line 59
    and-long/2addr v9, v11

    .line 60
    and-long/2addr v6, v11

    .line 61
    shl-long/2addr v6, v8

    .line 62
    or-long/2addr v6, v9

    .line 63
    .line 64
    const/16 v8, 0x10

    .line 65
    .line 66
    shr-long v9, v6, v8

    .line 67
    .line 68
    .line 69
    const-wide/32 v11, 0xffff

    .line 70
    and-long/2addr v9, v11

    .line 71
    and-long/2addr v6, v11

    .line 72
    shl-long/2addr v6, v8

    .line 73
    or-long/2addr v6, v9

    .line 74
    .line 75
    sub-int v8, v1, v5

    .line 76
    long-to-int v6, v6

    .line 77
    .line 78
    aput v6, v0, v8

    .line 79
    .line 80
    add-int/lit8 v5, v5, 0x1

    .line 81
    goto :goto_0

    .line 82
    .line 83
    :cond_0
    iget v5, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 84
    .line 85
    shl-int/lit8 v6, v3, 0x5

    .line 86
    .line 87
    if-eq v5, v6, :cond_2

    .line 88
    sub-int/2addr v6, v5

    .line 89
    .line 90
    aget v4, v0, v4

    .line 91
    ushr-int/2addr v4, v6

    .line 92
    .line 93
    :goto_1
    if-ge v2, v3, :cond_1

    .line 94
    .line 95
    aget v5, v0, v2

    .line 96
    .line 97
    rsub-int/lit8 v7, v6, 0x20

    .line 98
    .line 99
    shl-int v7, v5, v7

    .line 100
    or-int/2addr v4, v7

    .line 101
    .line 102
    add-int/lit8 v7, v2, -0x1

    .line 103
    .line 104
    aput v4, v0, v7

    .line 105
    .line 106
    ushr-int v4, v5, v6

    .line 107
    .line 108
    add-int/lit8 v2, v2, 0x1

    .line 109
    goto :goto_1

    .line 110
    .line 111
    :cond_1
    aput v4, v0, v1

    .line 112
    .line 113
    :cond_2
    iput-object v0, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 114
    return-void
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
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
.end method

.method public set(I)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 3
    .line 4
    div-int/lit8 v1, p1, 0x20

    .line 5
    .line 6
    aget v2, v0, v1

    .line 7
    .line 8
    and-int/lit8 p1, p1, 0x1f

    .line 9
    const/4 v3, 0x1

    .line 10
    .line 11
    shl-int p1, v3, p1

    .line 12
    or-int/2addr p1, v2

    .line 13
    .line 14
    aput p1, v0, v1

    .line 15
    return-void
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

.method public setBulk(II)V
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 3
    .line 4
    div-int/lit8 p1, p1, 0x20

    .line 5
    .line 6
    aput p2, v0, p1

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
.end method

.method public setRange(II)V
    .locals 6

    .line 1
    .line 2
    if-lt p2, p1, :cond_4

    .line 3
    .line 4
    if-ltz p1, :cond_4

    .line 5
    .line 6
    iget v0, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 7
    .line 8
    if-gt p2, v0, :cond_4

    .line 9
    .line 10
    if-ne p2, p1, :cond_0

    .line 11
    goto :goto_3

    .line 12
    .line 13
    :cond_0
    add-int/lit8 p2, p2, -0x1

    .line 14
    .line 15
    div-int/lit8 v0, p1, 0x20

    .line 16
    .line 17
    div-int/lit8 v1, p2, 0x20

    .line 18
    move v2, v0

    .line 19
    .line 20
    :goto_0
    if-gt v2, v1, :cond_3

    .line 21
    .line 22
    const/16 v3, 0x1f

    .line 23
    .line 24
    if-le v2, v0, :cond_1

    .line 25
    const/4 v4, 0x0

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_1
    and-int/lit8 v4, p1, 0x1f

    .line 29
    .line 30
    :goto_1
    if-ge v2, v1, :cond_2

    .line 31
    goto :goto_2

    .line 32
    :cond_2
    and-int/2addr v3, p2

    .line 33
    :goto_2
    const/4 v5, 0x2

    .line 34
    .line 35
    shl-int v3, v5, v3

    .line 36
    const/4 v5, 0x1

    .line 37
    .line 38
    shl-int v4, v5, v4

    .line 39
    sub-int/2addr v3, v4

    .line 40
    .line 41
    iget-object v4, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 42
    .line 43
    aget v5, v4, v2

    .line 44
    or-int/2addr v3, v5

    .line 45
    .line 46
    aput v3, v4, v2

    .line 47
    .line 48
    add-int/lit8 v2, v2, 0x1

    .line 49
    goto :goto_0

    .line 50
    :cond_3
    :goto_3
    return-void

    .line 51
    .line 52
    :cond_4
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 53
    .line 54
    .line 55
    invoke-direct {p1}, Ljava/lang/IllegalArgumentException;-><init>()V

    .line 56
    throw p1
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
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public toBytes(I[BII)V
    .locals 6

    .line 1
    const/4 v0, 0x0

    .line 2
    move v1, v0

    .line 3
    .line 4
    :goto_0
    if-ge v1, p4, :cond_2

    .line 5
    move v2, v0

    .line 6
    move v3, v2

    .line 7
    .line 8
    :goto_1
    const/16 v4, 0x8

    .line 9
    .line 10
    if-ge v2, v4, :cond_1

    .line 11
    .line 12
    .line 13
    invoke-virtual {p0, p1}, Lcom/google/zxing/common/BitArray;->get(I)Z

    .line 14
    move-result v4

    .line 15
    .line 16
    if-eqz v4, :cond_0

    .line 17
    .line 18
    rsub-int/lit8 v4, v2, 0x7

    .line 19
    const/4 v5, 0x1

    .line 20
    .line 21
    shl-int v4, v5, v4

    .line 22
    or-int/2addr v3, v4

    .line 23
    .line 24
    :cond_0
    add-int/lit8 p1, p1, 0x1

    .line 25
    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    goto :goto_1

    .line 28
    .line 29
    :cond_1
    add-int v2, p3, v1

    .line 30
    int-to-byte v3, v3

    .line 31
    .line 32
    aput-byte v3, p2, v2

    .line 33
    .line 34
    add-int/lit8 v1, v1, 0x1

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return-void
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
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    iget v1, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 5
    .line 6
    div-int/lit8 v2, v1, 0x8

    .line 7
    add-int/2addr v1, v2

    .line 8
    .line 9
    add-int/lit8 v1, v1, 0x1

    .line 10
    .line 11
    .line 12
    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(I)V

    .line 13
    const/4 v1, 0x0

    .line 14
    .line 15
    :goto_0
    iget v2, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 16
    .line 17
    if-ge v1, v2, :cond_2

    .line 18
    .line 19
    and-int/lit8 v2, v1, 0x7

    .line 20
    .line 21
    if-nez v2, :cond_0

    .line 22
    .line 23
    const/16 v2, 0x20

    .line 24
    .line 25
    .line 26
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 27
    .line 28
    .line 29
    :cond_0
    invoke-virtual {p0, v1}, Lcom/google/zxing/common/BitArray;->get(I)Z

    .line 30
    move-result v2

    .line 31
    .line 32
    if-eqz v2, :cond_1

    .line 33
    .line 34
    const/16 v2, 0x58

    .line 35
    goto :goto_1

    .line 36
    .line 37
    :cond_1
    const/16 v2, 0x2e

    .line 38
    .line 39
    .line 40
    :goto_1
    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    .line 41
    .line 42
    add-int/lit8 v1, v1, 0x1

    .line 43
    goto :goto_0

    .line 44
    .line 45
    .line 46
    :cond_2
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 47
    move-result-object v0

    .line 48
    return-object v0
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
.end method

.method public xor(Lcom/google/zxing/common/BitArray;)V
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcom/google/zxing/common/BitArray;->size:I

    .line 3
    .line 4
    iget v1, p1, Lcom/google/zxing/common/BitArray;->size:I

    .line 5
    .line 6
    if-ne v0, v1, :cond_1

    .line 7
    const/4 v0, 0x0

    .line 8
    .line 9
    :goto_0
    iget-object v1, p0, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 10
    array-length v2, v1

    .line 11
    .line 12
    if-ge v0, v2, :cond_0

    .line 13
    .line 14
    aget v2, v1, v0

    .line 15
    .line 16
    iget-object v3, p1, Lcom/google/zxing/common/BitArray;->bits:[I

    .line 17
    .line 18
    aget v3, v3, v0

    .line 19
    xor-int/2addr v2, v3

    .line 20
    .line 21
    aput v2, v1, v0

    .line 22
    .line 23
    add-int/lit8 v0, v0, 0x1

    .line 24
    goto :goto_0

    .line 25
    :cond_0
    return-void

    .line 26
    .line 27
    :cond_1
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 28
    .line 29
    const-string v0, "Sizes don\'t match"

    .line 30
    .line 31
    .line 32
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 33
    throw p1
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
.end method
