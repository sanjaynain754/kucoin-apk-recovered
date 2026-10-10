.class public final Lcom/tencent/bugly/proguard/ma;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:I = 0x25

.field public static final b:I = 0x11

.field public static final c:[B

.field public static final d:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 6

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    new-array v0, v0, [B

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    const/16 v1, 0x100

    .line 10
    .line 11
    new-array v2, v1, [B

    .line 12
    .line 13
    new-array v3, v1, [B

    .line 14
    const/4 v4, 0x0

    .line 15
    .line 16
    :goto_0
    if-ge v4, v1, :cond_0

    .line 17
    .line 18
    ushr-int/lit8 v5, v4, 0x4

    .line 19
    .line 20
    aget-byte v5, v0, v5

    .line 21
    .line 22
    aput-byte v5, v2, v4

    .line 23
    .line 24
    and-int/lit8 v5, v4, 0xf

    .line 25
    .line 26
    aget-byte v5, v0, v5

    .line 27
    .line 28
    aput-byte v5, v3, v4

    .line 29
    .line 30
    add-int/lit8 v4, v4, 0x1

    .line 31
    goto :goto_0

    .line 32
    .line 33
    :cond_0
    sput-object v2, Lcom/tencent/bugly/proguard/ma;->c:[B

    .line 34
    .line 35
    sput-object v3, Lcom/tencent/bugly/proguard/ma;->d:[B

    .line 36
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
    :array_0
    .array-data 1
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x41t
        0x42t
        0x43t
        0x44t
        0x45t
        0x46t
    .end array-data
    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    .line 54
    .line 55
    .line 56
    .line 57
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

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
.end method

.method public static a(B)I
    .locals 0

    .line 1
    add-int/lit16 p0, p0, 0x275

    return p0
.end method

.method public static a(BB)I
    .locals 0

    .line 2
    if-ge p0, p1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-le p0, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static a(C)I
    .locals 0

    .line 3
    add-int/lit16 p0, p0, 0x275

    return p0
.end method

.method public static a(CC)I
    .locals 0

    .line 4
    if-ge p0, p1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-le p0, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static a(D)I
    .locals 0

    .line 52
    invoke-static {p0, p1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide p0

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ma;->a(J)I

    move-result p0

    return p0
.end method

.method public static a(DD)I
    .locals 1

    .line 5
    cmpg-double v0, p0, p2

    if-gez v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    cmpl-double p0, p0, p2

    if-lez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static a(F)I
    .locals 0

    .line 55
    invoke-static {p0}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result p0

    add-int/lit16 p0, p0, 0x275

    return p0
.end method

.method public static a(FF)I
    .locals 1

    .line 6
    cmpg-float v0, p0, p1

    if-gez v0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    cmpl-float p0, p0, p1

    if-lez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static a(I)I
    .locals 0

    .line 7
    add-int/lit16 p0, p0, 0x275

    return p0
.end method

.method public static a(II)I
    .locals 0

    .line 8
    if-ge p0, p1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-le p0, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static a(J)I
    .locals 2

    .line 9
    const/16 v0, 0x20

    shr-long v0, p0, v0

    xor-long/2addr p0, v0

    long-to-int p0, p0

    add-int/lit16 p0, p0, 0x275

    return p0
.end method

.method public static a(JJ)I
    .locals 0

    .line 10
    cmp-long p0, p0, p2

    if-gez p0, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-lez p0, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static a(Ljava/lang/Comparable;Ljava/lang/Comparable;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "TT;>;>(TT;TT;)I"
        }
    .end annotation

    .line 16
    invoke-interface {p0, p1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result p0

    return p0
.end method

.method public static a(Ljava/lang/Object;)I
    .locals 2

    const/16 v0, 0x275

    if-nez p0, :cond_0

    return v0

    .line 66
    :cond_0
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v1

    invoke-virtual {v1}, Ljava/lang/Class;->isArray()Z

    move-result v1

    if-eqz v1, :cond_a

    .line 67
    instance-of v0, p0, [J

    if-eqz v0, :cond_1

    .line 68
    check-cast p0, [J

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ma;->a([J)I

    move-result p0

    return p0

    .line 69
    :cond_1
    instance-of v0, p0, [I

    if-eqz v0, :cond_2

    .line 70
    check-cast p0, [I

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ma;->a([I)I

    move-result p0

    return p0

    .line 71
    :cond_2
    instance-of v0, p0, [S

    if-eqz v0, :cond_3

    .line 72
    check-cast p0, [S

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ma;->a([S)I

    move-result p0

    return p0

    .line 73
    :cond_3
    instance-of v0, p0, [C

    if-eqz v0, :cond_4

    .line 74
    check-cast p0, [C

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ma;->a([C)I

    move-result p0

    return p0

    .line 75
    :cond_4
    instance-of v0, p0, [B

    if-eqz v0, :cond_5

    .line 76
    check-cast p0, [B

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ma;->b([B)I

    move-result p0

    return p0

    .line 77
    :cond_5
    instance-of v0, p0, [D

    if-eqz v0, :cond_6

    .line 78
    check-cast p0, [D

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ma;->a([D)I

    move-result p0

    return p0

    .line 79
    :cond_6
    instance-of v0, p0, [F

    if-eqz v0, :cond_7

    .line 80
    check-cast p0, [F

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ma;->a([F)I

    move-result p0

    return p0

    .line 81
    :cond_7
    instance-of v0, p0, [Z

    if-eqz v0, :cond_8

    .line 82
    check-cast p0, [Z

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ma;->a([Z)I

    move-result p0

    return p0

    .line 83
    :cond_8
    instance-of v0, p0, [Lcom/tencent/bugly/proguard/JceStruct;

    if-eqz v0, :cond_9

    .line 84
    check-cast p0, [Lcom/tencent/bugly/proguard/JceStruct;

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ma;->a([Lcom/tencent/bugly/proguard/JceStruct;)I

    move-result p0

    return p0

    .line 85
    :cond_9
    check-cast p0, [Ljava/lang/Object;

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ma;->a(Ljava/lang/Object;)I

    move-result p0

    return p0

    .line 86
    :cond_a
    instance-of v1, p0, Lcom/tencent/bugly/proguard/JceStruct;

    if-eqz v1, :cond_b

    .line 87
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    return p0

    .line 88
    :cond_b
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    add-int/2addr p0, v0

    return p0
.end method

.method public static a(Ljava/util/List;Ljava/util/List;)I
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "TT;>;>(",
            "Ljava/util/List<",
            "TT;>;",
            "Ljava/util/List<",
            "TT;>;)I"
        }
    .end annotation

    .line 17
    invoke-interface {p0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p0

    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object p1

    .line 18
    :cond_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    .line 19
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Comparable;

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0, v1}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v0

    if-eqz v0, :cond_0

    return v0

    .line 20
    :cond_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p0

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    sub-int/2addr p0, p1

    return p0
.end method

.method public static a(S)I
    .locals 0

    .line 11
    add-int/lit16 p0, p0, 0x275

    return p0
.end method

.method public static a(SS)I
    .locals 0

    .line 12
    if-ge p0, p1, :cond_0

    const/4 p0, -0x1

    return p0

    :cond_0
    if-le p0, p1, :cond_1

    const/4 p0, 0x1

    return p0

    :cond_1
    const/4 p0, 0x0

    return p0
.end method

.method public static a(Z)I
    .locals 0

    .line 13
    xor-int/lit8 p0, p0, 0x1

    add-int/lit16 p0, p0, 0x275

    return p0
.end method

.method public static a(ZZ)I
    .locals 0

    .line 14
    sub-int/2addr p0, p1

    return p0
.end method

.method public static a([B[B)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    .line 27
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_1

    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 28
    aget-byte v2, p0, v0

    aget-byte v3, p1, v1

    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/ma;->a(BB)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 29
    :cond_1
    array-length p0, p0

    array-length p1, p1

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ma;->a(II)I

    move-result p0

    return p0
.end method

.method public static a([C)I
    .locals 3

    if-nez p0, :cond_0

    const/16 p0, 0x275

    return p0

    :cond_0
    const/16 v0, 0x11

    const/4 v1, 0x0

    .line 50
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    mul-int/lit8 v0, v0, 0x25

    .line 51
    aget-char v2, p0, v1

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static a([C[C)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    .line 30
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_1

    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 31
    aget-char v2, p0, v0

    aget-char v3, p1, v1

    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/ma;->a(CC)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 32
    :cond_1
    array-length p0, p0

    array-length p1, p1

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ma;->a(II)I

    move-result p0

    return p0
.end method

.method public static a([D)I
    .locals 7

    if-nez p0, :cond_0

    const/16 p0, 0x275

    return p0

    :cond_0
    const/16 v0, 0x11

    const/4 v1, 0x0

    .line 53
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    mul-int/lit8 v0, v0, 0x25

    .line 54
    aget-wide v2, p0, v1

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    aget-wide v4, p0, v1

    invoke-static {v4, v5}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v4

    const/16 v6, 0x20

    shr-long/2addr v4, v6

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static a([D[D)I
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    .line 45
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_1

    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 46
    aget-wide v2, p0, v0

    aget-wide v4, p1, v1

    invoke-static {v2, v3, v4, v5}, Lcom/tencent/bugly/proguard/ma;->a(DD)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 47
    :cond_1
    array-length p0, p0

    array-length p1, p1

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ma;->a(II)I

    move-result p0

    return p0
.end method

.method public static a([F)I
    .locals 3

    if-nez p0, :cond_0

    const/16 p0, 0x275

    return p0

    :cond_0
    const/16 v0, 0x11

    const/4 v1, 0x0

    .line 56
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    mul-int/lit8 v0, v0, 0x25

    .line 57
    aget v2, p0, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToIntBits(F)I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static a([F[F)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    .line 42
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_1

    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 43
    aget v2, p0, v0

    aget v3, p1, v1

    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/ma;->a(FF)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 44
    :cond_1
    array-length p0, p0

    array-length p1, p1

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ma;->a(II)I

    move-result p0

    return p0
.end method

.method public static a([I)I
    .locals 3

    if-nez p0, :cond_0

    const/16 p0, 0x275

    return p0

    :cond_0
    const/16 v0, 0x11

    const/4 v1, 0x0

    .line 60
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    mul-int/lit8 v0, v0, 0x25

    .line 61
    aget v2, p0, v1

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static a([I[I)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    .line 36
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_1

    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 37
    aget v2, p0, v0

    aget v3, p1, v1

    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/ma;->a(II)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 38
    :cond_1
    array-length p0, p0

    array-length p1, p1

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ma;->a(II)I

    move-result p0

    return p0
.end method

.method public static a([J)I
    .locals 6

    if-nez p0, :cond_0

    const/16 p0, 0x275

    return p0

    :cond_0
    const/16 v0, 0x11

    const/4 v1, 0x0

    .line 62
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    mul-int/lit8 v0, v0, 0x25

    .line 63
    aget-wide v2, p0, v1

    const/16 v4, 0x20

    shr-long v4, v2, v4

    xor-long/2addr v2, v4

    long-to-int v2, v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static a([J[J)I
    .locals 6

    const/4 v0, 0x0

    move v1, v0

    .line 39
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_1

    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 40
    aget-wide v2, p0, v0

    aget-wide v4, p1, v1

    invoke-static {v2, v3, v4, v5}, Lcom/tencent/bugly/proguard/ma;->a(JJ)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 41
    :cond_1
    array-length p0, p0

    array-length p1, p1

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ma;->a(II)I

    move-result p0

    return p0
.end method

.method public static a([Lcom/tencent/bugly/proguard/JceStruct;)I
    .locals 3

    if-nez p0, :cond_0

    const/16 p0, 0x275

    return p0

    :cond_0
    const/16 v0, 0x11

    const/4 v1, 0x0

    .line 64
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    mul-int/lit8 v0, v0, 0x25

    .line 65
    aget-object v2, p0, v1

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static a([Ljava/lang/Comparable;[Ljava/lang/Comparable;)I
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T::",
            "Ljava/lang/Comparable<",
            "TT;>;>([TT;[TT;)I"
        }
    .end annotation

    const/4 v0, 0x0

    move v1, v0

    .line 21
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_1

    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 22
    aget-object v2, p0, v0

    aget-object v3, p1, v1

    invoke-interface {v2, v3}, Ljava/lang/Comparable;->compareTo(Ljava/lang/Object;)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 23
    :cond_1
    array-length p0, p0

    array-length p1, p1

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ma;->a(II)I

    move-result p0

    return p0
.end method

.method public static a([S)I
    .locals 3

    if-nez p0, :cond_0

    const/16 p0, 0x275

    return p0

    :cond_0
    const/16 v0, 0x11

    const/4 v1, 0x0

    .line 58
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    mul-int/lit8 v0, v0, 0x25

    .line 59
    aget-short v2, p0, v1

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static a([S[S)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    .line 33
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_1

    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 34
    aget-short v2, p0, v0

    aget-short v3, p1, v1

    invoke-static {v2, v3}, Lcom/tencent/bugly/proguard/ma;->a(SS)I

    move-result v2

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 35
    :cond_1
    array-length p0, p0

    array-length p1, p1

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ma;->a(II)I

    move-result p0

    return p0
.end method

.method public static a([Z)I
    .locals 3

    if-nez p0, :cond_0

    const/16 p0, 0x275

    return p0

    :cond_0
    const/16 v0, 0x11

    const/4 v1, 0x0

    .line 48
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    mul-int/lit8 v0, v0, 0x25

    .line 49
    aget-boolean v2, p0, v1

    xor-int/lit8 v2, v2, 0x1

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static a([Z[Z)I
    .locals 4

    const/4 v0, 0x0

    move v1, v0

    .line 24
    :goto_0
    array-length v2, p0

    if-ge v0, v2, :cond_1

    array-length v2, p1

    if-ge v1, v2, :cond_1

    .line 25
    aget-boolean v2, p0, v0

    aget-boolean v3, p1, v1

    sub-int/2addr v2, v3

    if-eqz v2, :cond_0

    return v2

    :cond_0
    add-int/lit8 v0, v0, 0x1

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 26
    :cond_1
    array-length p0, p0

    array-length p1, p1

    invoke-static {p0, p1}, Lcom/tencent/bugly/proguard/ma;->a(II)I

    move-result p0

    return p0
.end method

.method public static a(Ljava/nio/ByteBuffer;)Ljava/lang/String;
    .locals 5

    .line 90
    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v0

    if-nez v0, :cond_0

    .line 91
    const-string p0, "empty"

    return-object p0

    .line 92
    :cond_0
    new-instance v1, Ljava/lang/StringBuffer;

    invoke-virtual {p0}, Ljava/nio/Buffer;->remaining()I

    move-result v2

    mul-int/lit8 v2, v2, 0x3

    add-int/lit8 v2, v2, -0x1

    invoke-direct {v1, v2}, Ljava/lang/StringBuffer;-><init>(I)V

    .line 93
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v2

    .line 94
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    .line 95
    sget-object v4, Lcom/tencent/bugly/proguard/ma;->c:[B

    aget-byte v4, v4, v3

    int-to-char v4, v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 96
    sget-object v4, Lcom/tencent/bugly/proguard/ma;->d:[B

    aget-byte v3, v4, v3

    int-to-char v3, v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    :goto_0
    add-int/lit8 v0, v0, -0x1

    if-lez v0, :cond_1

    const/16 v3, 0x20

    .line 97
    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 98
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->get()B

    move-result v3

    and-int/lit16 v3, v3, 0xff

    .line 99
    sget-object v4, Lcom/tencent/bugly/proguard/ma;->c:[B

    aget-byte v4, v4, v3

    int-to-char v4, v4

    invoke-virtual {v1, v4}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    .line 100
    sget-object v4, Lcom/tencent/bugly/proguard/ma;->d:[B

    aget-byte v3, v4, v3

    int-to-char v3, v3

    invoke-virtual {v1, v3}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;

    goto :goto_0

    .line 101
    :cond_1
    invoke-virtual {p0, v2}, Ljava/nio/ByteBuffer;->position(I)Ljava/nio/Buffer;

    .line 102
    invoke-virtual {v1}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 0

    .line 89
    invoke-static {p0}, Ljava/nio/ByteBuffer;->wrap([B)Ljava/nio/ByteBuffer;

    move-result-object p0

    invoke-static {p0}, Lcom/tencent/bugly/proguard/ma;->a(Ljava/nio/ByteBuffer;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static a(Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 0

    .line 15
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method public static b([B)I
    .locals 3

    if-nez p0, :cond_0

    const/16 p0, 0x275

    return p0

    :cond_0
    const/16 v0, 0x11

    const/4 v1, 0x0

    .line 9
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    mul-int/lit8 v0, v0, 0x25

    .line 10
    aget-byte v2, p0, v1

    add-int/2addr v0, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return v0
.end method

.method public static b(BB)Z
    .locals 0

    .line 1
    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(CC)Z
    .locals 0

    .line 2
    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(DD)Z
    .locals 0

    .line 3
    cmpl-double p0, p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(FF)Z
    .locals 0

    .line 4
    cmpl-float p0, p0, p1

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(II)Z
    .locals 0

    .line 5
    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(JJ)Z
    .locals 0

    .line 6
    cmp-long p0, p0, p2

    if-nez p0, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(SS)Z
    .locals 0

    .line 7
    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(ZZ)Z
    .locals 0

    .line 8
    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static b(Ljava/nio/ByteBuffer;)[B
    .locals 3

    .line 11
    invoke-virtual {p0}, Ljava/nio/Buffer;->position()I

    move-result v0

    new-array v1, v0, [B

    .line 12
    invoke-virtual {p0}, Ljava/nio/ByteBuffer;->array()[B

    move-result-object p0

    const/4 v2, 0x0

    invoke-static {p0, v2, v1, v2, v0}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    return-object v1
.end method
