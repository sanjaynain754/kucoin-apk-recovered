.class public final enum Lnet/jpountz/util/UnsafeUtils;
.super Ljava/lang/Enum;
.source "UnsafeUtils.java"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lnet/jpountz/util/UnsafeUtils;",
        ">;"
    }
.end annotation


# static fields
.field public static final b:Lsun/misc/Unsafe;

.field public static final c:J

.field public static final d:I

.field public static final e:J

.field public static final f:I

.field public static final g:J

.field public static final h:I

.field public static final synthetic i:[Lnet/jpountz/util/UnsafeUtils;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    .line 1
    .line 2
    const-class v0, [S

    .line 3
    .line 4
    const-class v1, [I

    .line 5
    .line 6
    const-class v2, [B

    .line 7
    .line 8
    const-string v3, "Cannot access Unsafe"

    .line 9
    const/4 v4, 0x0

    .line 10
    .line 11
    new-array v4, v4, [Lnet/jpountz/util/UnsafeUtils;

    .line 12
    .line 13
    sput-object v4, Lnet/jpountz/util/UnsafeUtils;->i:[Lnet/jpountz/util/UnsafeUtils;

    .line 14
    .line 15
    :try_start_0
    const-class v4, Lsun/misc/Unsafe;

    .line 16
    .line 17
    .line 18
    const-string/jumbo v5, "theUnsafe"

    .line 19
    .line 20
    .line 21
    invoke-virtual {v4, v5}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    .line 22
    move-result-object v4

    .line 23
    const/4 v5, 0x1

    .line 24
    .line 25
    .line 26
    invoke-virtual {v4, v5}, Ljava/lang/reflect/AccessibleObject;->setAccessible(Z)V

    .line 27
    const/4 v5, 0x0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v4, v5}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 31
    move-result-object v4

    .line 32
    .line 33
    check-cast v4, Lsun/misc/Unsafe;

    .line 34
    .line 35
    sput-object v4, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    .line 36
    .line 37
    .line 38
    invoke-virtual {v4, v2}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 39
    move-result v5

    .line 40
    int-to-long v5, v5

    .line 41
    .line 42
    sput-wide v5, Lnet/jpountz/util/UnsafeUtils;->c:J

    .line 43
    .line 44
    .line 45
    invoke-virtual {v4, v2}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    .line 46
    move-result v2

    .line 47
    .line 48
    sput v2, Lnet/jpountz/util/UnsafeUtils;->d:I

    .line 49
    .line 50
    .line 51
    invoke-virtual {v4, v1}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 52
    move-result v2

    .line 53
    int-to-long v5, v2

    .line 54
    .line 55
    sput-wide v5, Lnet/jpountz/util/UnsafeUtils;->e:J

    .line 56
    .line 57
    .line 58
    invoke-virtual {v4, v1}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    .line 59
    move-result v1

    .line 60
    .line 61
    sput v1, Lnet/jpountz/util/UnsafeUtils;->f:I

    .line 62
    .line 63
    .line 64
    invoke-virtual {v4, v0}, Lsun/misc/Unsafe;->arrayBaseOffset(Ljava/lang/Class;)I

    .line 65
    move-result v1

    .line 66
    int-to-long v1, v1

    .line 67
    .line 68
    sput-wide v1, Lnet/jpountz/util/UnsafeUtils;->g:J

    .line 69
    .line 70
    .line 71
    invoke-virtual {v4, v0}, Lsun/misc/Unsafe;->arrayIndexScale(Ljava/lang/Class;)I

    .line 72
    move-result v0

    .line 73
    .line 74
    sput v0, Lnet/jpountz/util/UnsafeUtils;->h:I
    :try_end_0
    .catch Ljava/lang/IllegalAccessException; {:try_start_0 .. :try_end_0} :catch_2
    .catch Ljava/lang/NoSuchFieldException; {:try_start_0 .. :try_end_0} :catch_1
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0

    .line 75
    return-void

    .line 76
    .line 77
    :catch_0
    new-instance v0, Ljava/lang/ExceptionInInitializerError;

    .line 78
    .line 79
    .line 80
    invoke-direct {v0, v3}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/String;)V

    .line 81
    throw v0

    .line 82
    .line 83
    :catch_1
    new-instance v0, Ljava/lang/ExceptionInInitializerError;

    .line 84
    .line 85
    .line 86
    invoke-direct {v0, v3}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/String;)V

    .line 87
    throw v0

    .line 88
    .line 89
    :catch_2
    new-instance v0, Ljava/lang/ExceptionInInitializerError;

    .line 90
    .line 91
    .line 92
    invoke-direct {v0, v3}, Ljava/lang/ExceptionInInitializerError;-><init>(Ljava/lang/String;)V

    .line 93
    throw v0
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

.method public static checkLength(I)V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lnet/jpountz/util/SafeUtils;->checkLength(I)V

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

.method public static checkRange([BI)V
    .locals 0

    .line 1
    invoke-static {p0, p1}, Lnet/jpountz/util/SafeUtils;->checkRange([BI)V

    return-void
.end method

.method public static checkRange([BII)V
    .locals 0

    .line 2
    invoke-static {p0, p1, p2}, Lnet/jpountz/util/SafeUtils;->checkRange([BII)V

    return-void
.end method

.method public static readByte([BI)B
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    .line 3
    .line 4
    sget-wide v1, Lnet/jpountz/util/UnsafeUtils;->c:J

    .line 5
    .line 6
    sget v3, Lnet/jpountz/util/UnsafeUtils;->d:I

    .line 7
    mul-int/2addr v3, p1

    .line 8
    int-to-long v3, v3

    .line 9
    add-long/2addr v1, v3

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getByte(Ljava/lang/Object;J)B

    .line 13
    move-result p0

    .line 14
    return p0
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
.end method

.method public static readInt([BI)I
    .locals 5

    .line 1
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    sget-wide v1, Lnet/jpountz/util/UnsafeUtils;->c:J

    int-to-long v3, p1

    add-long/2addr v1, v3

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result p0

    return p0
.end method

.method public static readInt([II)I
    .locals 5

    .line 2
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    sget-wide v1, Lnet/jpountz/util/UnsafeUtils;->e:J

    sget v3, Lnet/jpountz/util/UnsafeUtils;->f:I

    mul-int/2addr v3, p1

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getInt(Ljava/lang/Object;J)I

    move-result p0

    return p0
.end method

.method public static readIntLE([BI)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lnet/jpountz/util/UnsafeUtils;->readInt([BI)I

    .line 4
    move-result p0

    .line 5
    .line 6
    sget-object p1, Lnet/jpountz/util/Utils;->NATIVE_BYTE_ORDER:Ljava/nio/ByteOrder;

    .line 7
    .line 8
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Integer;->reverseBytes(I)I

    .line 14
    move-result p0

    .line 15
    :cond_0
    return p0
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
.end method

.method public static readLong([BI)J
    .locals 5

    .line 1
    .line 2
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    .line 3
    .line 4
    sget-wide v1, Lnet/jpountz/util/UnsafeUtils;->c:J

    .line 5
    int-to-long v3, p1

    .line 6
    add-long/2addr v1, v3

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getLong(Ljava/lang/Object;J)J

    .line 10
    move-result-wide p0

    .line 11
    return-wide p0
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
.end method

.method public static readLongLE([BI)J
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lnet/jpountz/util/UnsafeUtils;->readLong([BI)J

    .line 4
    move-result-wide p0

    .line 5
    .line 6
    sget-object v0, Lnet/jpountz/util/Utils;->NATIVE_BYTE_ORDER:Ljava/nio/ByteOrder;

    .line 7
    .line 8
    sget-object v1, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 9
    .line 10
    if-ne v0, v1, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {p0, p1}, Ljava/lang/Long;->reverseBytes(J)J

    .line 14
    move-result-wide p0

    .line 15
    :cond_0
    return-wide p0
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
.end method

.method public static readShort([SI)I
    .locals 5

    .line 2
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    sget-wide v1, Lnet/jpountz/util/UnsafeUtils;->g:J

    sget v3, Lnet/jpountz/util/UnsafeUtils;->h:I

    mul-int/2addr v3, p1

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    move-result p0

    const p1, 0xffff

    and-int/2addr p0, p1

    return p0
.end method

.method public static readShort([BI)S
    .locals 5

    .line 1
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    sget-wide v1, Lnet/jpountz/util/UnsafeUtils;->c:J

    int-to-long v3, p1

    add-long/2addr v1, v3

    invoke-virtual {v0, p0, v1, v2}, Lsun/misc/Unsafe;->getShort(Ljava/lang/Object;J)S

    move-result p0

    return p0
.end method

.method public static readShortLE([BI)I
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0, p1}, Lnet/jpountz/util/UnsafeUtils;->readShort([BI)S

    .line 4
    move-result p0

    .line 5
    .line 6
    sget-object p1, Lnet/jpountz/util/Utils;->NATIVE_BYTE_ORDER:Ljava/nio/ByteOrder;

    .line 7
    .line 8
    sget-object v0, Ljava/nio/ByteOrder;->BIG_ENDIAN:Ljava/nio/ByteOrder;

    .line 9
    .line 10
    if-ne p1, v0, :cond_0

    .line 11
    .line 12
    .line 13
    invoke-static {p0}, Ljava/lang/Short;->reverseBytes(S)S

    .line 14
    move-result p0

    .line 15
    .line 16
    .line 17
    :cond_0
    const p1, 0xffff

    .line 18
    and-int/2addr p0, p1

    .line 19
    return p0
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
.end method

.method public static valueOf(Ljava/lang/String;)Lnet/jpountz/util/UnsafeUtils;
    .locals 1

    .line 1
    .line 2
    const-class v0, Lnet/jpountz/util/UnsafeUtils;

    .line 3
    .line 4
    .line 5
    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    check-cast p0, Lnet/jpountz/util/UnsafeUtils;

    .line 9
    return-object p0
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

.method public static values()[Lnet/jpountz/util/UnsafeUtils;
    .locals 1

    .line 1
    .line 2
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->i:[Lnet/jpountz/util/UnsafeUtils;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, [Lnet/jpountz/util/UnsafeUtils;->clone()Ljava/lang/Object;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    check-cast v0, [Lnet/jpountz/util/UnsafeUtils;

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

.method public static writeByte([BIB)V
    .locals 5

    .line 1
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    sget-wide v1, Lnet/jpountz/util/UnsafeUtils;->c:J

    sget v3, Lnet/jpountz/util/UnsafeUtils;->d:I

    mul-int/2addr v3, p1

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-virtual {v0, p0, v1, v2, p2}, Lsun/misc/Unsafe;->putByte(Ljava/lang/Object;JB)V

    return-void
.end method

.method public static writeByte([BII)V
    .locals 0

    int-to-byte p2, p2

    .line 2
    invoke-static {p0, p1, p2}, Lnet/jpountz/util/UnsafeUtils;->writeByte([BIB)V

    return-void
.end method

.method public static writeInt([BII)V
    .locals 5

    .line 1
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    sget-wide v1, Lnet/jpountz/util/UnsafeUtils;->c:J

    int-to-long v3, p1

    add-long/2addr v1, v3

    invoke-virtual {v0, p0, v1, v2, p2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return-void
.end method

.method public static writeInt([III)V
    .locals 5

    .line 2
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    sget-wide v1, Lnet/jpountz/util/UnsafeUtils;->e:J

    sget v3, Lnet/jpountz/util/UnsafeUtils;->f:I

    mul-int/2addr v3, p1

    int-to-long v3, v3

    add-long/2addr v1, v3

    invoke-virtual {v0, p0, v1, v2, p2}, Lsun/misc/Unsafe;->putInt(Ljava/lang/Object;JI)V

    return-void
.end method

.method public static writeLong([BIJ)V
    .locals 6

    .line 1
    .line 2
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    .line 3
    .line 4
    sget-wide v1, Lnet/jpountz/util/UnsafeUtils;->c:J

    .line 5
    int-to-long v3, p1

    .line 6
    .line 7
    add-long v2, v1, v3

    .line 8
    move-object v1, p0

    .line 9
    move-wide v4, p2

    .line 10
    .line 11
    .line 12
    invoke-virtual/range {v0 .. v5}, Lsun/misc/Unsafe;->putLong(Ljava/lang/Object;JJ)V

    .line 13
    return-void
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

.method public static writeShort([BIS)V
    .locals 5

    .line 1
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    sget-wide v1, Lnet/jpountz/util/UnsafeUtils;->c:J

    int-to-long v3, p1

    add-long/2addr v1, v3

    invoke-virtual {v0, p0, v1, v2, p2}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    return-void
.end method

.method public static writeShort([SII)V
    .locals 5

    .line 2
    sget-object v0, Lnet/jpountz/util/UnsafeUtils;->b:Lsun/misc/Unsafe;

    sget-wide v1, Lnet/jpountz/util/UnsafeUtils;->g:J

    sget v3, Lnet/jpountz/util/UnsafeUtils;->h:I

    mul-int/2addr v3, p1

    int-to-long v3, v3

    add-long/2addr v1, v3

    int-to-short p1, p2

    invoke-virtual {v0, p0, v1, v2, p1}, Lsun/misc/Unsafe;->putShort(Ljava/lang/Object;JS)V

    return-void
.end method

.method public static writeShortLE([BII)V
    .locals 1

    .line 1
    int-to-byte v0, p2

    .line 2
    .line 3
    .line 4
    invoke-static {p0, p1, v0}, Lnet/jpountz/util/UnsafeUtils;->writeByte([BIB)V

    .line 5
    .line 6
    add-int/lit8 p1, p1, 0x1

    .line 7
    .line 8
    ushr-int/lit8 p2, p2, 0x8

    .line 9
    int-to-byte p2, p2

    .line 10
    .line 11
    .line 12
    invoke-static {p0, p1, p2}, Lnet/jpountz/util/UnsafeUtils;->writeByte([BIB)V

    .line 13
    return-void
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
