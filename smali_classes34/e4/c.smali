.class public Le4/c;
.super Ljava/lang/Object;
.source "WebpSupportStatus.java"


# static fields
.field public static final a:Z

.field public static final b:Z

.field public static c:Le4/b;

.field public static d:Z

.field public static final e:[B

.field public static final f:[B

.field public static final g:[B

.field public static final h:[B

.field public static final i:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    sput-boolean v0, Le4/c;->a:Z

    .line 4
    .line 5
    .line 6
    invoke-static {}, Le4/c;->e()Z

    .line 7
    move-result v0

    .line 8
    .line 9
    sput-boolean v0, Le4/c;->b:Z

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    sput-object v0, Le4/c;->c:Le4/b;

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    sput-boolean v0, Le4/c;->d:Z

    .line 16
    .line 17
    const-string v0, "RIFF"

    .line 18
    .line 19
    .line 20
    invoke-static {v0}, Le4/c;->a(Ljava/lang/String;)[B

    .line 21
    move-result-object v0

    .line 22
    .line 23
    sput-object v0, Le4/c;->e:[B

    .line 24
    .line 25
    const-string v0, "WEBP"

    .line 26
    .line 27
    .line 28
    invoke-static {v0}, Le4/c;->a(Ljava/lang/String;)[B

    .line 29
    move-result-object v0

    .line 30
    .line 31
    sput-object v0, Le4/c;->f:[B

    .line 32
    .line 33
    const-string v0, "VP8 "

    .line 34
    .line 35
    .line 36
    invoke-static {v0}, Le4/c;->a(Ljava/lang/String;)[B

    .line 37
    move-result-object v0

    .line 38
    .line 39
    sput-object v0, Le4/c;->g:[B

    .line 40
    .line 41
    const-string v0, "VP8L"

    .line 42
    .line 43
    .line 44
    invoke-static {v0}, Le4/c;->a(Ljava/lang/String;)[B

    .line 45
    move-result-object v0

    .line 46
    .line 47
    sput-object v0, Le4/c;->h:[B

    .line 48
    .line 49
    const-string v0, "VP8X"

    .line 50
    .line 51
    .line 52
    invoke-static {v0}, Le4/c;->a(Ljava/lang/String;)[B

    .line 53
    move-result-object v0

    .line 54
    .line 55
    sput-object v0, Le4/c;->i:[B

    .line 56
    return-void
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
.end method

.method public static a(Ljava/lang/String;)[B
    .locals 2

    .line 1
    .line 2
    :try_start_0
    const-string v0, "ASCII"

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0, v0}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B

    .line 6
    move-result-object p0
    :try_end_0
    .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 7
    return-object p0

    .line 8
    :catch_0
    move-exception p0

    .line 9
    .line 10
    new-instance v0, Ljava/lang/RuntimeException;

    .line 11
    .line 12
    const-string v1, "ASCII not found!"

    .line 13
    .line 14
    .line 15
    invoke-direct {v0, v1, p0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 16
    throw v0
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static b([BI)Z
    .locals 3

    .line 1
    .line 2
    add-int/lit8 v0, p1, 0xc

    .line 3
    .line 4
    sget-object v1, Le4/c;->i:[B

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Le4/c;->j([BI[B)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    add-int/lit8 p1, p1, 0x14

    .line 11
    .line 12
    aget-byte p0, p0, p1

    .line 13
    const/4 p1, 0x2

    .line 14
    and-int/2addr p0, p1

    .line 15
    const/4 v1, 0x0

    .line 16
    const/4 v2, 0x1

    .line 17
    .line 18
    if-ne p0, p1, :cond_0

    .line 19
    move p0, v2

    .line 20
    goto :goto_0

    .line 21
    :cond_0
    move p0, v1

    .line 22
    .line 23
    :goto_0
    if-eqz v0, :cond_1

    .line 24
    .line 25
    if-eqz p0, :cond_1

    .line 26
    return v2

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
.end method

.method public static c([BII)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x15

    .line 3
    .line 4
    if-lt p2, v0, :cond_0

    .line 5
    .line 6
    add-int/lit8 p1, p1, 0xc

    .line 7
    .line 8
    sget-object p2, Le4/c;->i:[B

    .line 9
    .line 10
    .line 11
    invoke-static {p0, p1, p2}, Le4/c;->j([BI[B)Z

    .line 12
    move-result p0

    .line 13
    .line 14
    if-eqz p0, :cond_0

    .line 15
    const/4 p0, 0x1

    .line 16
    return p0

    .line 17
    :cond_0
    const/4 p0, 0x0

    .line 18
    return p0
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
.end method

.method public static d([BI)Z
    .locals 3

    .line 1
    .line 2
    add-int/lit8 v0, p1, 0xc

    .line 3
    .line 4
    sget-object v1, Le4/c;->i:[B

    .line 5
    .line 6
    .line 7
    invoke-static {p0, v0, v1}, Le4/c;->j([BI[B)Z

    .line 8
    move-result v0

    .line 9
    .line 10
    add-int/lit8 p1, p1, 0x14

    .line 11
    .line 12
    aget-byte p0, p0, p1

    .line 13
    .line 14
    const/16 p1, 0x10

    .line 15
    and-int/2addr p0, p1

    .line 16
    const/4 v1, 0x0

    .line 17
    const/4 v2, 0x1

    .line 18
    .line 19
    if-ne p0, p1, :cond_0

    .line 20
    move p0, v2

    .line 21
    goto :goto_0

    .line 22
    :cond_0
    move p0, v1

    .line 23
    .line 24
    :goto_0
    if-eqz v0, :cond_1

    .line 25
    .line 26
    if-eqz p0, :cond_1

    .line 27
    return v2

    .line 28
    :cond_1
    return v1
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

.method public static e()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
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
.end method

.method public static f([BI)Z
    .locals 1

    .line 1
    .line 2
    add-int/lit8 p1, p1, 0xc

    .line 3
    .line 4
    sget-object v0, Le4/c;->h:[B

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1, v0}, Le4/c;->j([BI[B)Z

    .line 8
    move-result p0

    .line 9
    return p0
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

.method public static g([BI)Z
    .locals 1

    .line 1
    .line 2
    add-int/lit8 p1, p1, 0xc

    .line 3
    .line 4
    sget-object v0, Le4/c;->g:[B

    .line 5
    .line 6
    .line 7
    invoke-static {p0, p1, v0}, Le4/c;->j([BI[B)Z

    .line 8
    move-result p0

    .line 9
    return p0
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

.method public static h([BII)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x14

    .line 3
    .line 4
    if-lt p2, v0, :cond_0

    .line 5
    .line 6
    sget-object p2, Le4/c;->e:[B

    .line 7
    .line 8
    .line 9
    invoke-static {p0, p1, p2}, Le4/c;->j([BI[B)Z

    .line 10
    move-result p2

    .line 11
    .line 12
    if-eqz p2, :cond_0

    .line 13
    .line 14
    add-int/lit8 p1, p1, 0x8

    .line 15
    .line 16
    sget-object p2, Le4/c;->f:[B

    .line 17
    .line 18
    .line 19
    invoke-static {p0, p1, p2}, Le4/c;->j([BI[B)Z

    .line 20
    move-result p0

    .line 21
    .line 22
    if-eqz p0, :cond_0

    .line 23
    const/4 p0, 0x1

    .line 24
    return p0

    .line 25
    :cond_0
    const/4 p0, 0x0

    .line 26
    return p0
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
.end method

.method public static i()Le4/b;
    .locals 2

    .line 1
    .line 2
    sget-boolean v0, Le4/c;->d:Z

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Le4/c;->c:Le4/b;

    .line 7
    return-object v0

    .line 8
    .line 9
    :cond_0
    :try_start_0
    const-string v0, "com.facebook.webpsupport.WebpBitmapFactoryImpl"

    .line 10
    .line 11
    .line 12
    invoke-static {v0}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    .line 13
    move-result-object v0

    .line 14
    .line 15
    .line 16
    invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;

    .line 17
    move-result-object v0

    .line 18
    .line 19
    check-cast v0, Le4/b;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 20
    goto :goto_0

    .line 21
    :catchall_0
    const/4 v0, 0x0

    .line 22
    :goto_0
    const/4 v1, 0x1

    .line 23
    .line 24
    sput-boolean v1, Le4/c;->d:Z

    .line 25
    return-object v0
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
.end method

.method public static j([BI[B)Z
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    .line 3
    if-eqz p2, :cond_4

    .line 4
    .line 5
    if-nez p0, :cond_0

    .line 6
    goto :goto_1

    .line 7
    :cond_0
    array-length v1, p2

    .line 8
    add-int/2addr v1, p1

    .line 9
    array-length v2, p0

    .line 10
    .line 11
    if-le v1, v2, :cond_1

    .line 12
    return v0

    .line 13
    :cond_1
    move v1, v0

    .line 14
    :goto_0
    array-length v2, p2

    .line 15
    .line 16
    if-ge v1, v2, :cond_3

    .line 17
    .line 18
    add-int v2, v1, p1

    .line 19
    .line 20
    aget-byte v2, p0, v2

    .line 21
    .line 22
    aget-byte v3, p2, v1

    .line 23
    .line 24
    if-eq v2, v3, :cond_2

    .line 25
    return v0

    .line 26
    .line 27
    :cond_2
    add-int/lit8 v1, v1, 0x1

    .line 28
    goto :goto_0

    .line 29
    :cond_3
    const/4 p0, 0x1

    .line 30
    return p0

    .line 31
    :cond_4
    :goto_1
    return v0
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
.end method
