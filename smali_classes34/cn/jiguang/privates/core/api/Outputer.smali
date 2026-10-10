.class public Lcn/jiguang/privates/core/api/Outputer;
.super Ljava/lang/Object;
.source "Outputer.java"


# instance fields
.field private array:[B

.field private pos:I

.field private saved_pos:I


# direct methods
.method public constructor <init>()V
    .locals 1

    const/16 v0, 0x20

    .line 5
    invoke-direct {p0, v0}, Lcn/jiguang/privates/core/api/Outputer;-><init>(I)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    new-array p1, p1, [B

    iput-object p1, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    const/4 p1, 0x0

    .line 3
    iput p1, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    const/4 p1, -0x1

    .line 4
    iput p1, p0, Lcn/jiguang/privates/core/api/Outputer;->saved_pos:I

    return-void
.end method

.method private check(JI)V
    .locals 0

    .line 1
    return-void
    .line 2
    .line 3
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

.method private need(I)V
    .locals 4

    .line 1
    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    .line 3
    array-length v1, v0

    .line 4
    .line 5
    iget v2, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 6
    sub-int/2addr v1, v2

    .line 7
    .line 8
    if-lt v1, p1, :cond_0

    .line 9
    return-void

    .line 10
    :cond_0
    array-length v1, v0

    .line 11
    .line 12
    mul-int/lit8 v1, v1, 0x2

    .line 13
    .line 14
    add-int v3, v2, p1

    .line 15
    .line 16
    if-ge v1, v3, :cond_1

    .line 17
    .line 18
    add-int v1, v2, p1

    .line 19
    .line 20
    :cond_1
    new-array p1, v1, [B

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    .line 24
    invoke-static {v0, v1, p1, v1, v2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 25
    .line 26
    iput-object p1, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    .line 27
    return-void
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
.end method


# virtual methods
.method public current()I
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

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
    .line 17
    .line 18
.end method

.method public jump(I)V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 3
    .line 4
    if-gt p1, v0, :cond_0

    .line 5
    .line 6
    iput p1, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    const-string v0, "cannot jump past end of data"

    .line 12
    .line 13
    .line 14
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 15
    throw p1
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public restore()V
    .locals 2

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/core/api/Outputer;->saved_pos:I

    .line 3
    .line 4
    if-ltz v0, :cond_0

    .line 5
    .line 6
    iput v0, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 7
    const/4 v0, -0x1

    .line 8
    .line 9
    iput v0, p0, Lcn/jiguang/privates/core/api/Outputer;->saved_pos:I

    .line 10
    return-void

    .line 11
    .line 12
    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 13
    .line 14
    const-string v1, "no previous state"

    .line 15
    .line 16
    .line 17
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 18
    throw v0
.end method

.method public save()V
    .locals 1

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 3
    .line 4
    iput v0, p0, Lcn/jiguang/privates/core/api/Outputer;->saved_pos:I

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

.method public toByteArray()[B
    .locals 4

    .line 1
    .line 2
    iget v0, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 3
    .line 4
    new-array v1, v0, [B

    .line 5
    .line 6
    iget-object v2, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    .line 7
    const/4 v3, 0x0

    .line 8
    .line 9
    .line 10
    invoke-static {v2, v3, v1, v3, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 11
    return-object v1
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
.end method

.method public writeByteArray([B)V
    .locals 2

    .line 4
    array-length v0, p1

    const/4 v1, 0x0

    invoke-virtual {p0, p1, v1, v0}, Lcn/jiguang/privates/core/api/Outputer;->writeByteArray([BII)V

    return-void
.end method

.method public writeByteArray([BII)V
    .locals 2

    .line 1
    invoke-direct {p0, p3}, Lcn/jiguang/privates/core/api/Outputer;->need(I)V

    .line 2
    iget-object v0, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    iget v1, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    invoke-static {p1, p2, v0, v1, p3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 3
    iget p1, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    add-int/2addr p1, p3

    iput p1, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    return-void
.end method

.method public writeByteArrayIncludeLength([B)V
    .locals 2

    .line 1
    array-length v0, p1

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Lcn/jiguang/privates/core/api/Outputer;->writeU16(I)V

    .line 5
    const/4 v0, 0x0

    .line 6
    array-length v1, p1

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0, p1, v0, v1}, Lcn/jiguang/privates/core/api/Outputer;->writeByteArray([BII)V

    .line 10
    return-void
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

.method public writeCountedString([B)V
    .locals 4

    .line 1
    array-length v0, p1

    .line 2
    .line 3
    const/16 v1, 0xff

    .line 4
    .line 5
    if-gt v0, v1, :cond_0

    .line 6
    array-length v0, p1

    .line 7
    .line 8
    add-int/lit8 v0, v0, 0x1

    .line 9
    .line 10
    .line 11
    invoke-direct {p0, v0}, Lcn/jiguang/privates/core/api/Outputer;->need(I)V

    .line 12
    .line 13
    iget-object v0, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    .line 14
    .line 15
    iget v2, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 16
    .line 17
    add-int/lit8 v3, v2, 0x1

    .line 18
    .line 19
    iput v3, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 20
    array-length v3, p1

    .line 21
    and-int/2addr v1, v3

    .line 22
    int-to-byte v1, v1

    .line 23
    .line 24
    aput-byte v1, v0, v2

    .line 25
    const/4 v0, 0x0

    .line 26
    array-length v1, p1

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1, v0, v1}, Lcn/jiguang/privates/core/api/Outputer;->writeByteArray([BII)V

    .line 30
    return-void

    .line 31
    .line 32
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 33
    .line 34
    const-string v0, "Invalid counted string"

    .line 35
    .line 36
    .line 37
    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 38
    throw p1
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

.method public writeU16(I)V
    .locals 5

    .line 1
    int-to-long v0, p1

    .line 2
    .line 3
    const/16 v2, 0x10

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0, v1, v2}, Lcn/jiguang/privates/core/api/Outputer;->check(JI)V

    .line 7
    const/4 v0, 0x2

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcn/jiguang/privates/core/api/Outputer;->need(I)V

    .line 11
    .line 12
    iget-object v1, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    .line 13
    .line 14
    iget v2, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 15
    .line 16
    add-int/lit8 v3, v2, 0x1

    .line 17
    .line 18
    iput v3, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 19
    .line 20
    ushr-int/lit8 v4, p1, 0x8

    .line 21
    .line 22
    and-int/lit16 v4, v4, 0xff

    .line 23
    int-to-byte v4, v4

    .line 24
    .line 25
    aput-byte v4, v1, v2

    .line 26
    add-int/2addr v2, v0

    .line 27
    .line 28
    iput v2, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 29
    .line 30
    and-int/lit16 p1, p1, 0xff

    .line 31
    int-to-byte p1, p1

    .line 32
    .line 33
    aput-byte p1, v1, v3

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

.method public writeU16At(II)V
    .locals 3

    .line 1
    int-to-long v0, p1

    .line 2
    .line 3
    const/16 v2, 0x10

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0, v1, v2}, Lcn/jiguang/privates/core/api/Outputer;->check(JI)V

    .line 7
    .line 8
    iget v0, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x2

    .line 11
    .line 12
    if-gt p2, v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    .line 15
    .line 16
    add-int/lit8 v1, p2, 0x1

    .line 17
    .line 18
    ushr-int/lit8 v2, p1, 0x8

    .line 19
    .line 20
    and-int/lit16 v2, v2, 0xff

    .line 21
    int-to-byte v2, v2

    .line 22
    .line 23
    aput-byte v2, v0, p2

    .line 24
    .line 25
    and-int/lit16 p1, p1, 0xff

    .line 26
    int-to-byte p1, p1

    .line 27
    .line 28
    aput-byte p1, v0, v1

    .line 29
    return-void

    .line 30
    .line 31
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 32
    .line 33
    const-string p2, "cannot write past end of data"

    .line 34
    .line 35
    .line 36
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 37
    throw p1
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
.end method

.method public writeU32(J)V
    .locals 10

    .line 1
    .line 2
    const/16 v0, 0x20

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, p2, v0}, Lcn/jiguang/privates/core/api/Outputer;->check(JI)V

    .line 6
    const/4 v0, 0x4

    .line 7
    .line 8
    .line 9
    invoke-direct {p0, v0}, Lcn/jiguang/privates/core/api/Outputer;->need(I)V

    .line 10
    .line 11
    iget-object v1, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    .line 12
    .line 13
    iget v2, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 14
    .line 15
    add-int/lit8 v3, v2, 0x1

    .line 16
    .line 17
    iput v3, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 18
    .line 19
    const/16 v4, 0x18

    .line 20
    .line 21
    ushr-long v4, p1, v4

    .line 22
    .line 23
    const-wide/16 v6, 0xff

    .line 24
    and-long/2addr v4, v6

    .line 25
    long-to-int v4, v4

    .line 26
    int-to-byte v4, v4

    .line 27
    .line 28
    aput-byte v4, v1, v2

    .line 29
    .line 30
    add-int/lit8 v4, v2, 0x2

    .line 31
    .line 32
    iput v4, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 33
    .line 34
    const/16 v5, 0x10

    .line 35
    .line 36
    ushr-long v8, p1, v5

    .line 37
    and-long/2addr v8, v6

    .line 38
    long-to-int v5, v8

    .line 39
    int-to-byte v5, v5

    .line 40
    .line 41
    aput-byte v5, v1, v3

    .line 42
    .line 43
    add-int/lit8 v3, v2, 0x3

    .line 44
    .line 45
    iput v3, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 46
    .line 47
    const/16 v5, 0x8

    .line 48
    .line 49
    ushr-long v8, p1, v5

    .line 50
    and-long/2addr v8, v6

    .line 51
    long-to-int v5, v8

    .line 52
    int-to-byte v5, v5

    .line 53
    .line 54
    aput-byte v5, v1, v4

    .line 55
    add-int/2addr v2, v0

    .line 56
    .line 57
    iput v2, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 58
    and-long/2addr p1, v6

    .line 59
    long-to-int p1, p1

    .line 60
    int-to-byte p1, p1

    .line 61
    .line 62
    aput-byte p1, v1, v3

    .line 63
    return-void
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

.method public writeU32At(JI)V
    .locals 8

    .line 1
    .line 2
    const/16 v0, 0x20

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, p2, v0}, Lcn/jiguang/privates/core/api/Outputer;->check(JI)V

    .line 6
    .line 7
    iget v0, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 8
    .line 9
    add-int/lit8 v0, v0, -0x4

    .line 10
    .line 11
    if-gt p3, v0, :cond_0

    .line 12
    .line 13
    iget-object v0, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    .line 14
    .line 15
    add-int/lit8 v1, p3, 0x1

    .line 16
    .line 17
    const/16 v2, 0x18

    .line 18
    .line 19
    ushr-long v2, p1, v2

    .line 20
    .line 21
    const-wide/16 v4, 0xff

    .line 22
    and-long/2addr v2, v4

    .line 23
    long-to-int v2, v2

    .line 24
    int-to-byte v2, v2

    .line 25
    .line 26
    aput-byte v2, v0, p3

    .line 27
    .line 28
    add-int/lit8 v2, p3, 0x2

    .line 29
    .line 30
    const/16 v3, 0x10

    .line 31
    .line 32
    ushr-long v6, p1, v3

    .line 33
    and-long/2addr v6, v4

    .line 34
    long-to-int v3, v6

    .line 35
    int-to-byte v3, v3

    .line 36
    .line 37
    aput-byte v3, v0, v1

    .line 38
    .line 39
    add-int/lit8 p3, p3, 0x3

    .line 40
    .line 41
    const/16 v1, 0x8

    .line 42
    .line 43
    ushr-long v6, p1, v1

    .line 44
    and-long/2addr v6, v4

    .line 45
    long-to-int v1, v6

    .line 46
    int-to-byte v1, v1

    .line 47
    .line 48
    aput-byte v1, v0, v2

    .line 49
    and-long/2addr p1, v4

    .line 50
    long-to-int p1, p1

    .line 51
    int-to-byte p1, p1

    .line 52
    .line 53
    aput-byte p1, v0, p3

    .line 54
    return-void

    .line 55
    .line 56
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 57
    .line 58
    const-string p2, "cannot write past end of data"

    .line 59
    .line 60
    .line 61
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

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
.end method

.method public writeU64(J)V
    .locals 10

    .line 1
    .line 2
    const/16 v0, 0x8

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, v0}, Lcn/jiguang/privates/core/api/Outputer;->need(I)V

    .line 6
    .line 7
    iget-object v1, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    .line 8
    .line 9
    iget v2, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 10
    .line 11
    add-int/lit8 v3, v2, 0x1

    .line 12
    .line 13
    iput v3, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 14
    .line 15
    const/16 v4, 0x38

    .line 16
    .line 17
    ushr-long v4, p1, v4

    .line 18
    .line 19
    const-wide/16 v6, 0xff

    .line 20
    and-long/2addr v4, v6

    .line 21
    long-to-int v4, v4

    .line 22
    int-to-byte v4, v4

    .line 23
    .line 24
    aput-byte v4, v1, v2

    .line 25
    .line 26
    add-int/lit8 v4, v2, 0x2

    .line 27
    .line 28
    iput v4, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 29
    .line 30
    const/16 v5, 0x30

    .line 31
    .line 32
    ushr-long v8, p1, v5

    .line 33
    and-long/2addr v8, v6

    .line 34
    long-to-int v5, v8

    .line 35
    int-to-byte v5, v5

    .line 36
    .line 37
    aput-byte v5, v1, v3

    .line 38
    .line 39
    add-int/lit8 v3, v2, 0x3

    .line 40
    .line 41
    iput v3, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 42
    .line 43
    const/16 v5, 0x28

    .line 44
    .line 45
    ushr-long v8, p1, v5

    .line 46
    and-long/2addr v8, v6

    .line 47
    long-to-int v5, v8

    .line 48
    int-to-byte v5, v5

    .line 49
    .line 50
    aput-byte v5, v1, v4

    .line 51
    .line 52
    add-int/lit8 v4, v2, 0x4

    .line 53
    .line 54
    iput v4, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 55
    .line 56
    const/16 v5, 0x20

    .line 57
    .line 58
    ushr-long v8, p1, v5

    .line 59
    and-long/2addr v8, v6

    .line 60
    long-to-int v5, v8

    .line 61
    int-to-byte v5, v5

    .line 62
    .line 63
    aput-byte v5, v1, v3

    .line 64
    .line 65
    add-int/lit8 v3, v2, 0x5

    .line 66
    .line 67
    iput v3, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 68
    .line 69
    const/16 v5, 0x18

    .line 70
    .line 71
    ushr-long v8, p1, v5

    .line 72
    and-long/2addr v8, v6

    .line 73
    long-to-int v5, v8

    .line 74
    int-to-byte v5, v5

    .line 75
    .line 76
    aput-byte v5, v1, v4

    .line 77
    .line 78
    add-int/lit8 v4, v2, 0x6

    .line 79
    .line 80
    iput v4, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 81
    .line 82
    const/16 v5, 0x10

    .line 83
    .line 84
    ushr-long v8, p1, v5

    .line 85
    and-long/2addr v8, v6

    .line 86
    long-to-int v5, v8

    .line 87
    int-to-byte v5, v5

    .line 88
    .line 89
    aput-byte v5, v1, v3

    .line 90
    .line 91
    add-int/lit8 v3, v2, 0x7

    .line 92
    .line 93
    iput v3, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 94
    .line 95
    ushr-long v8, p1, v0

    .line 96
    and-long/2addr v8, v6

    .line 97
    long-to-int v5, v8

    .line 98
    int-to-byte v5, v5

    .line 99
    .line 100
    aput-byte v5, v1, v4

    .line 101
    add-int/2addr v2, v0

    .line 102
    .line 103
    iput v2, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 104
    and-long/2addr p1, v6

    .line 105
    long-to-int p1, p1

    .line 106
    int-to-byte p1, p1

    .line 107
    .line 108
    aput-byte p1, v1, v3

    .line 109
    return-void
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

.method public writeU64At(JI)V
    .locals 9

    .line 1
    .line 2
    const/16 v0, 0x40

    .line 3
    .line 4
    .line 5
    invoke-direct {p0, p1, p2, v0}, Lcn/jiguang/privates/core/api/Outputer;->check(JI)V

    .line 6
    .line 7
    iget v0, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 8
    .line 9
    const/16 v1, 0x8

    .line 10
    sub-int/2addr v0, v1

    .line 11
    .line 12
    if-gt p3, v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    .line 15
    .line 16
    add-int/lit8 v2, p3, 0x1

    .line 17
    .line 18
    const/16 v3, 0x38

    .line 19
    .line 20
    ushr-long v3, p1, v3

    .line 21
    .line 22
    const-wide/16 v5, 0xff

    .line 23
    and-long/2addr v3, v5

    .line 24
    long-to-int v3, v3

    .line 25
    int-to-byte v3, v3

    .line 26
    .line 27
    aput-byte v3, v0, p3

    .line 28
    .line 29
    add-int/lit8 v3, p3, 0x2

    .line 30
    .line 31
    const/16 v4, 0x30

    .line 32
    .line 33
    ushr-long v7, p1, v4

    .line 34
    and-long/2addr v7, v5

    .line 35
    long-to-int v4, v7

    .line 36
    int-to-byte v4, v4

    .line 37
    .line 38
    aput-byte v4, v0, v2

    .line 39
    .line 40
    add-int/lit8 v2, p3, 0x3

    .line 41
    .line 42
    const/16 v4, 0x28

    .line 43
    .line 44
    ushr-long v7, p1, v4

    .line 45
    and-long/2addr v7, v5

    .line 46
    long-to-int v4, v7

    .line 47
    int-to-byte v4, v4

    .line 48
    .line 49
    aput-byte v4, v0, v3

    .line 50
    .line 51
    add-int/lit8 v3, p3, 0x4

    .line 52
    .line 53
    const/16 v4, 0x20

    .line 54
    .line 55
    ushr-long v7, p1, v4

    .line 56
    and-long/2addr v7, v5

    .line 57
    long-to-int v4, v7

    .line 58
    int-to-byte v4, v4

    .line 59
    .line 60
    aput-byte v4, v0, v2

    .line 61
    .line 62
    add-int/lit8 v2, p3, 0x5

    .line 63
    .line 64
    const/16 v4, 0x18

    .line 65
    .line 66
    ushr-long v7, p1, v4

    .line 67
    and-long/2addr v7, v5

    .line 68
    long-to-int v4, v7

    .line 69
    int-to-byte v4, v4

    .line 70
    .line 71
    aput-byte v4, v0, v3

    .line 72
    .line 73
    add-int/lit8 v3, p3, 0x6

    .line 74
    .line 75
    const/16 v4, 0x10

    .line 76
    .line 77
    ushr-long v7, p1, v4

    .line 78
    and-long/2addr v7, v5

    .line 79
    long-to-int v4, v7

    .line 80
    int-to-byte v4, v4

    .line 81
    .line 82
    aput-byte v4, v0, v2

    .line 83
    .line 84
    add-int/lit8 p3, p3, 0x7

    .line 85
    .line 86
    ushr-long v1, p1, v1

    .line 87
    and-long/2addr v1, v5

    .line 88
    long-to-int v1, v1

    .line 89
    int-to-byte v1, v1

    .line 90
    .line 91
    aput-byte v1, v0, v3

    .line 92
    and-long/2addr p1, v5

    .line 93
    long-to-int p1, p1

    .line 94
    int-to-byte p1, p1

    .line 95
    .line 96
    aput-byte p1, v0, p3

    .line 97
    return-void

    .line 98
    .line 99
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 100
    .line 101
    const-string p2, "cannot write past end of data"

    .line 102
    .line 103
    .line 104
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 105
    throw p1
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
.end method

.method public writeU8(I)V
    .locals 3

    .line 1
    int-to-long v0, p1

    .line 2
    .line 3
    const/16 v2, 0x8

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0, v1, v2}, Lcn/jiguang/privates/core/api/Outputer;->check(JI)V

    .line 7
    const/4 v0, 0x1

    .line 8
    .line 9
    .line 10
    invoke-direct {p0, v0}, Lcn/jiguang/privates/core/api/Outputer;->need(I)V

    .line 11
    .line 12
    iget-object v0, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    .line 13
    .line 14
    iget v1, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 15
    .line 16
    add-int/lit8 v2, v1, 0x1

    .line 17
    .line 18
    iput v2, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 19
    .line 20
    and-int/lit16 p1, p1, 0xff

    .line 21
    int-to-byte p1, p1

    .line 22
    .line 23
    aput-byte p1, v0, v1

    .line 24
    return-void
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
.end method

.method public writeU8At(II)V
    .locals 3

    .line 1
    int-to-long v0, p1

    .line 2
    .line 3
    const/16 v2, 0x8

    .line 4
    .line 5
    .line 6
    invoke-direct {p0, v0, v1, v2}, Lcn/jiguang/privates/core/api/Outputer;->check(JI)V

    .line 7
    .line 8
    iget v0, p0, Lcn/jiguang/privates/core/api/Outputer;->pos:I

    .line 9
    .line 10
    add-int/lit8 v0, v0, -0x1

    .line 11
    .line 12
    if-gt p2, v0, :cond_0

    .line 13
    .line 14
    iget-object v0, p0, Lcn/jiguang/privates/core/api/Outputer;->array:[B

    .line 15
    .line 16
    and-int/lit16 p1, p1, 0xff

    .line 17
    int-to-byte p1, p1

    .line 18
    .line 19
    aput-byte p1, v0, p2

    .line 20
    return-void

    .line 21
    .line 22
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 23
    .line 24
    const-string p2, "cannot write past end of data"

    .line 25
    .line 26
    .line 27
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 28
    throw p1
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
