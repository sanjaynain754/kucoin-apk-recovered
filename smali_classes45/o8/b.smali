.class public final Lo8/b;
.super Ljava/lang/Object;
.source "Pinyin.java"


# static fields
.field public static a:Lorg/ahocorasick/trie/Trie;

.field public static b:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lo8/g;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
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
.end method

.method public static a([B[BI)S
    .locals 2

    .line 1
    .line 2
    div-int/lit8 v0, p2, 0x8

    .line 3
    .line 4
    rem-int/lit8 v1, p2, 0x8

    .line 5
    .line 6
    aget-byte p1, p1, p2

    .line 7
    .line 8
    and-int/lit16 p1, p1, 0xff

    .line 9
    int-to-short p1, p1

    .line 10
    .line 11
    aget-byte p0, p0, v0

    .line 12
    .line 13
    sget-object p2, Lo8/f;->a:[I

    .line 14
    .line 15
    aget p2, p2, v1

    .line 16
    and-int/2addr p0, p2

    .line 17
    .line 18
    if-eqz p0, :cond_0

    .line 19
    .line 20
    or-int/lit16 p0, p1, 0x100

    .line 21
    int-to-short p0, p0

    .line 22
    return p0

    .line 23
    :cond_0
    return p1
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
.end method

.method public static b(C)I
    .locals 3

    .line 1
    .line 2
    add-int/lit16 v0, p0, -0x4e00

    .line 3
    .line 4
    const/16 v1, 0x1b58

    .line 5
    .line 6
    if-ltz v0, :cond_0

    .line 7
    .line 8
    if-ge v0, v1, :cond_0

    .line 9
    .line 10
    sget-object p0, Lo8/c;->a:[B

    .line 11
    .line 12
    sget-object v1, Lo8/c;->b:[B

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v1, v0}, Lo8/b;->a([B[BI)S

    .line 16
    move-result p0

    .line 17
    return p0

    .line 18
    .line 19
    :cond_0
    if-gt v1, v0, :cond_1

    .line 20
    .line 21
    const/16 v1, 0x36b0

    .line 22
    .line 23
    if-ge v0, v1, :cond_1

    .line 24
    .line 25
    sget-object v0, Lo8/d;->a:[B

    .line 26
    .line 27
    sget-object v1, Lo8/d;->b:[B

    .line 28
    .line 29
    add-int/lit16 p0, p0, -0x6958

    .line 30
    .line 31
    .line 32
    invoke-static {v0, v1, p0}, Lo8/b;->a([B[BI)S

    .line 33
    move-result p0

    .line 34
    return p0

    .line 35
    .line 36
    :cond_1
    sget-object v0, Lo8/e;->a:[B

    .line 37
    .line 38
    sget-object v1, Lo8/e;->b:[B

    .line 39
    .line 40
    .line 41
    const v2, 0x84b0

    .line 42
    sub-int/2addr p0, v2

    .line 43
    .line 44
    .line 45
    invoke-static {v0, v1, p0}, Lo8/b;->a([B[BI)S

    .line 46
    move-result p0

    .line 47
    return p0
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
.end method

.method public static c(C)Z
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x4e00

    .line 3
    .line 4
    if-gt v0, p0, :cond_0

    .line 5
    .line 6
    .line 7
    const v0, 0x9fa5

    .line 8
    .line 9
    if-gt p0, v0, :cond_0

    .line 10
    .line 11
    .line 12
    invoke-static {p0}, Lo8/b;->b(C)I

    .line 13
    move-result v0

    .line 14
    .line 15
    if-gtz v0, :cond_1

    .line 16
    .line 17
    :cond_0
    const/16 v0, 0x3007

    .line 18
    .line 19
    if-ne v0, p0, :cond_2

    .line 20
    :cond_1
    const/4 p0, 0x1

    .line 21
    return p0

    .line 22
    :cond_2
    const/4 p0, 0x0

    .line 23
    return p0
.end method

.method public static d(C)Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {p0}, Lo8/b;->c(C)Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-eqz v0, :cond_1

    .line 7
    .line 8
    const/16 v0, 0x3007

    .line 9
    .line 10
    if-ne p0, v0, :cond_0

    .line 11
    .line 12
    const-string p0, "LING"

    .line 13
    return-object p0

    .line 14
    .line 15
    :cond_0
    sget-object v0, Lo8/f;->b:[Ljava/lang/String;

    .line 16
    .line 17
    .line 18
    invoke-static {p0}, Lo8/b;->b(C)I

    .line 19
    move-result p0

    .line 20
    .line 21
    aget-object p0, v0, p0

    .line 22
    return-object p0

    .line 23
    .line 24
    .line 25
    :cond_1
    invoke-static {p0}, Ljava/lang/String;->valueOf(C)Ljava/lang/String;

    .line 26
    move-result-object p0

    .line 27
    return-object p0
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
.end method

.method public static e(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    sget-object v0, Lo8/b;->a:Lorg/ahocorasick/trie/Trie;

    .line 3
    .line 4
    sget-object v1, Lo8/b;->b:Ljava/util/List;

    .line 5
    const/4 v2, 0x0

    .line 6
    .line 7
    .line 8
    invoke-static {p0, v0, v1, p1, v2}, Lo8/a;->b(Ljava/lang/String;Lorg/ahocorasick/trie/Trie;Ljava/util/List;Ljava/lang/String;Lo8/h;)Ljava/lang/String;

    .line 9
    move-result-object p0

    .line 10
    return-object p0
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
.end method
