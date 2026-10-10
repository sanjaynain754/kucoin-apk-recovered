.class public final Lcom/blankj/utilcode/util/i;
.super Ljava/lang/Object;
.source "ConvertUtils.java"


# static fields
.field public static final a:[C

.field public static final b:[C


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    new-array v1, v0, [C

    .line 5
    .line 6
    .line 7
    fill-array-data v1, :array_0

    .line 8
    .line 9
    sput-object v1, Lcom/blankj/utilcode/util/i;->a:[C

    .line 10
    .line 11
    new-array v0, v0, [C

    .line 12
    .line 13
    .line 14
    fill-array-data v0, :array_1

    .line 15
    .line 16
    sput-object v0, Lcom/blankj/utilcode/util/i;->b:[C

    .line 17
    return-void

    .line 18
    nop

    .line 19
    .line 20
    .line 21
    .line 22
    :array_0
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x41s
        0x42s
        0x43s
        0x44s
        0x45s
        0x46s
    .end array-data

    :array_1
    .array-data 2
        0x30s
        0x31s
        0x32s
        0x33s
        0x34s
        0x35s
        0x36s
        0x37s
        0x38s
        0x39s
        0x61s
        0x62s
        0x63s
        0x64s
        0x65s
        0x66s
    .end array-data
.end method

.method public static a([B)Ljava/lang/String;
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    .line 4
    invoke-static {p0, v0}, Lcom/blankj/utilcode/util/i;->b([BZ)Ljava/lang/String;

    .line 5
    move-result-object p0

    .line 6
    return-object p0
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
.end method

.method public static b([BZ)Ljava/lang/String;
    .locals 7

    .line 1
    .line 2
    const-string v0, ""

    .line 3
    .line 4
    if-nez p0, :cond_0

    .line 5
    return-object v0

    .line 6
    .line 7
    :cond_0
    if-eqz p1, :cond_1

    .line 8
    .line 9
    sget-object p1, Lcom/blankj/utilcode/util/i;->a:[C

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_1
    sget-object p1, Lcom/blankj/utilcode/util/i;->b:[C

    .line 13
    :goto_0
    array-length v1, p0

    .line 14
    .line 15
    if-gtz v1, :cond_2

    .line 16
    return-object v0

    .line 17
    .line 18
    :cond_2
    shl-int/lit8 v0, v1, 0x1

    .line 19
    .line 20
    new-array v0, v0, [C

    .line 21
    const/4 v2, 0x0

    .line 22
    move v3, v2

    .line 23
    .line 24
    :goto_1
    if-ge v2, v1, :cond_3

    .line 25
    .line 26
    add-int/lit8 v4, v3, 0x1

    .line 27
    .line 28
    aget-byte v5, p0, v2

    .line 29
    .line 30
    shr-int/lit8 v6, v5, 0x4

    .line 31
    .line 32
    and-int/lit8 v6, v6, 0xf

    .line 33
    .line 34
    aget-char v6, p1, v6

    .line 35
    .line 36
    aput-char v6, v0, v3

    .line 37
    .line 38
    add-int/lit8 v3, v3, 0x2

    .line 39
    .line 40
    and-int/lit8 v5, v5, 0xf

    .line 41
    .line 42
    aget-char v5, p1, v5

    .line 43
    .line 44
    aput-char v5, v0, v4

    .line 45
    .line 46
    add-int/lit8 v2, v2, 0x1

    .line 47
    goto :goto_1

    .line 48
    .line 49
    :cond_3
    new-instance p0, Ljava/lang/String;

    .line 50
    .line 51
    .line 52
    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    .line 53
    return-object p0
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
.end method

.method public static c(F)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lcom/blankj/utilcode/util/u0;->g(F)I

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method
