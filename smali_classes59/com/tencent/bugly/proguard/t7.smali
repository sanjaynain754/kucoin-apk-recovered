.class public Lcom/tencent/bugly/proguard/t7;
.super Ljava/lang/Object;
.source "BUGLY"


# static fields
.field public static final a:[C

.field public static final b:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x10

    .line 3
    .line 4
    new-array v0, v0, [C

    .line 5
    .line 6
    .line 7
    fill-array-data v0, :array_0

    .line 8
    .line 9
    sput-object v0, Lcom/tencent/bugly/proguard/t7;->a:[C

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    new-array v0, v0, [B

    .line 13
    .line 14
    sput-object v0, Lcom/tencent/bugly/proguard/t7;->b:[B

    .line 15
    return-void

    .line 16
    nop

    .line 17
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

.method public static a(C)B
    .locals 2

    .line 1
    const/16 v0, 0x30

    if-lt p0, v0, :cond_0

    const/16 v1, 0x39

    if-gt p0, v1, :cond_0

    sub-int/2addr p0, v0

    :goto_0
    int-to-byte p0, p0

    return p0

    :cond_0
    const/16 v0, 0x61

    if-lt p0, v0, :cond_1

    const/16 v0, 0x66

    if-gt p0, v0, :cond_1

    add-int/lit8 p0, p0, -0x57

    goto :goto_0

    :cond_1
    const/16 v0, 0x41

    if-lt p0, v0, :cond_2

    const/16 v0, 0x46

    if-gt p0, v0, :cond_2

    add-int/lit8 p0, p0, -0x37

    goto :goto_0

    :cond_2
    const/4 p0, 0x0

    return p0
.end method

.method public static a(Ljava/lang/String;)B
    .locals 3

    const/4 v0, 0x0

    if-eqz p0, :cond_0

    .line 13
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_0

    .line 14
    invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C

    move-result p0

    invoke-static {p0}, Lcom/tencent/bugly/proguard/t7;->a(C)B

    move-result p0

    return p0

    :cond_0
    return v0
.end method

.method public static a(B)Ljava/lang/String;
    .locals 4

    const/4 v0, 0x2

    .line 2
    new-array v0, v0, [C

    .line 3
    sget-object v1, Lcom/tencent/bugly/proguard/t7;->a:[C

    and-int/lit8 v2, p0, 0xf

    aget-char v2, v1, v2

    const/4 v3, 0x1

    aput-char v2, v0, v3

    ushr-int/lit8 p0, p0, 0x4

    int-to-byte p0, p0

    and-int/lit8 p0, p0, 0xf

    .line 4
    aget-char p0, v1, p0

    const/4 v1, 0x0

    aput-char p0, v0, v1

    .line 5
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0
.end method

.method public static a([B)Ljava/lang/String;
    .locals 7

    if-eqz p0, :cond_2

    .line 6
    array-length v0, p0

    if-nez v0, :cond_0

    goto :goto_1

    .line 7
    :cond_0
    array-length v0, p0

    mul-int/lit8 v0, v0, 0x2

    new-array v0, v0, [C

    const/4 v1, 0x0

    .line 8
    :goto_0
    array-length v2, p0

    if-ge v1, v2, :cond_1

    .line 9
    aget-byte v2, p0, v1

    mul-int/lit8 v3, v1, 0x2

    add-int/lit8 v4, v3, 0x1

    .line 10
    sget-object v5, Lcom/tencent/bugly/proguard/t7;->a:[C

    and-int/lit8 v6, v2, 0xf

    aget-char v6, v5, v6

    aput-char v6, v0, v4

    ushr-int/lit8 v2, v2, 0x4

    int-to-byte v2, v2

    and-int/lit8 v2, v2, 0xf

    .line 11
    aget-char v2, v5, v2

    aput-char v2, v0, v3

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    .line 12
    :cond_1
    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v0}, Ljava/lang/String;-><init>([C)V

    return-object p0

    :cond_2
    :goto_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static a([Ljava/lang/String;)V
    .locals 5

    .line 15
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    const/4 p0, 0x0

    :goto_0
    const v2, 0xf4240

    if-ge p0, v2, :cond_1

    .line 16
    const-string v2, "234"

    invoke-static {v2, p0}, Lcom/tencent/bugly/proguard/vi;->a(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object v2

    .line 17
    invoke-virtual {v2}, Ljava/lang/String;->getBytes()[B

    move-result-object v3

    .line 18
    invoke-static {v3}, Lcom/tencent/bugly/proguard/t7;->a([B)Ljava/lang/String;

    move-result-object v3

    .line 19
    invoke-static {v3}, Lcom/tencent/bugly/proguard/t7;->b(Ljava/lang/String;)[B

    move-result-object v3

    .line 20
    new-instance v4, Ljava/lang/String;

    invoke-direct {v4, v3}, Ljava/lang/String;-><init>([B)V

    .line 21
    invoke-virtual {v4, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_0

    .line 22
    sget-object v3, Ljava/lang/System;->out:Ljava/io/PrintStream;

    const-string v4, "error:"

    invoke-virtual {v4, v2}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v3, v2}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    :cond_0
    add-int/lit8 p0, p0, 0x1

    goto :goto_0

    .line 23
    :cond_1
    sget-object p0, Ljava/lang/System;->out:Ljava/io/PrintStream;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string/jumbo v3, "use:"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v3

    sub-long/2addr v3, v0

    invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V

    return-void
.end method

.method public static b(Ljava/lang/String;)[B
    .locals 5

    .line 1
    .line 2
    if-eqz p0, :cond_2

    .line 3
    .line 4
    const-string v0, ""

    .line 5
    .line 6
    .line 7
    invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    if-eqz v0, :cond_0

    .line 11
    goto :goto_1

    .line 12
    .line 13
    .line 14
    :cond_0
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 15
    move-result v0

    .line 16
    .line 17
    div-int/lit8 v0, v0, 0x2

    .line 18
    .line 19
    new-array v1, v0, [B

    .line 20
    const/4 v2, 0x0

    .line 21
    .line 22
    :goto_0
    if-ge v2, v0, :cond_1

    .line 23
    .line 24
    mul-int/lit8 v3, v2, 0x2

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 28
    move-result v4

    .line 29
    .line 30
    add-int/lit8 v3, v3, 0x1

    .line 31
    .line 32
    .line 33
    invoke-virtual {p0, v3}, Ljava/lang/String;->charAt(I)C

    .line 34
    move-result v3

    .line 35
    .line 36
    .line 37
    invoke-static {v4}, Lcom/tencent/bugly/proguard/t7;->a(C)B

    .line 38
    move-result v4

    .line 39
    .line 40
    mul-int/lit8 v4, v4, 0x10

    .line 41
    .line 42
    .line 43
    invoke-static {v3}, Lcom/tencent/bugly/proguard/t7;->a(C)B

    .line 44
    move-result v3

    .line 45
    add-int/2addr v3, v4

    .line 46
    int-to-byte v3, v3

    .line 47
    .line 48
    aput-byte v3, v1, v2

    .line 49
    .line 50
    add-int/lit8 v2, v2, 0x1

    .line 51
    goto :goto_0

    .line 52
    :cond_1
    return-object v1

    .line 53
    .line 54
    :cond_2
    :goto_1
    sget-object p0, Lcom/tencent/bugly/proguard/t7;->b:[B

    .line 55
    return-object p0
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
.end method
