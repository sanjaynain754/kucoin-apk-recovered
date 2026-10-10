.class public Lcom/fasterxml/jackson/core/util/k;
.super Ljava/lang/Object;
.source "VersionUtil.java"


# static fields
.field public static final a:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const-string v0, "[-_./;:]"

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    sput-object v0, Lcom/fasterxml/jackson/core/util/k;->a:Ljava/util/regex/Pattern;

    .line 9
    return-void
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

.method public static a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/fasterxml/jackson/core/Version;
    .locals 7

    .line 1
    .line 2
    if-eqz p0, :cond_3

    .line 3
    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;

    .line 6
    move-result-object p0

    .line 7
    .line 8
    .line 9
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 10
    move-result v0

    .line 11
    .line 12
    if-lez v0, :cond_3

    .line 13
    .line 14
    sget-object v0, Lcom/fasterxml/jackson/core/util/k;->a:Ljava/util/regex/Pattern;

    .line 15
    .line 16
    .line 17
    invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->split(Ljava/lang/CharSequence;)[Ljava/lang/String;

    .line 18
    move-result-object p0

    .line 19
    .line 20
    new-instance v0, Lcom/fasterxml/jackson/core/Version;

    .line 21
    const/4 v1, 0x0

    .line 22
    .line 23
    aget-object v2, p0, v1

    .line 24
    .line 25
    .line 26
    invoke-static {v2}, Lcom/fasterxml/jackson/core/util/k;->b(Ljava/lang/String;)I

    .line 27
    move-result v2

    .line 28
    array-length v3, p0

    .line 29
    const/4 v4, 0x1

    .line 30
    .line 31
    if-le v3, v4, :cond_0

    .line 32
    .line 33
    aget-object v3, p0, v4

    .line 34
    .line 35
    .line 36
    invoke-static {v3}, Lcom/fasterxml/jackson/core/util/k;->b(Ljava/lang/String;)I

    .line 37
    move-result v3

    .line 38
    goto :goto_0

    .line 39
    :cond_0
    move v3, v1

    .line 40
    :goto_0
    array-length v4, p0

    .line 41
    const/4 v5, 0x2

    .line 42
    .line 43
    if-le v4, v5, :cond_1

    .line 44
    .line 45
    aget-object v1, p0, v5

    .line 46
    .line 47
    .line 48
    invoke-static {v1}, Lcom/fasterxml/jackson/core/util/k;->b(Ljava/lang/String;)I

    .line 49
    move-result v1

    .line 50
    :cond_1
    array-length v4, p0

    .line 51
    const/4 v5, 0x3

    .line 52
    .line 53
    if-le v4, v5, :cond_2

    .line 54
    .line 55
    aget-object p0, p0, v5

    .line 56
    :goto_1
    move v4, v3

    .line 57
    move v3, v1

    .line 58
    move v1, v2

    .line 59
    move v2, v4

    .line 60
    move-object v4, p0

    .line 61
    move-object v5, p1

    .line 62
    move-object v6, p2

    .line 63
    goto :goto_2

    .line 64
    :cond_2
    const/4 p0, 0x0

    .line 65
    goto :goto_1

    .line 66
    .line 67
    .line 68
    :goto_2
    invoke-direct/range {v0 .. v6}, Lcom/fasterxml/jackson/core/Version;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 69
    return-object v0

    .line 70
    .line 71
    .line 72
    :cond_3
    invoke-static {}, Lcom/fasterxml/jackson/core/Version;->unknownVersion()Lcom/fasterxml/jackson/core/Version;

    .line 73
    move-result-object p0

    .line 74
    return-object p0
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

.method public static b(Ljava/lang/String;)I
    .locals 5

    .line 1
    .line 2
    .line 3
    invoke-virtual {p0}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    move v2, v1

    .line 7
    .line 8
    :goto_0
    if-ge v1, v0, :cond_1

    .line 9
    .line 10
    .line 11
    invoke-virtual {p0, v1}, Ljava/lang/String;->charAt(I)C

    .line 12
    move-result v3

    .line 13
    .line 14
    const/16 v4, 0x39

    .line 15
    .line 16
    if-gt v3, v4, :cond_1

    .line 17
    .line 18
    const/16 v4, 0x30

    .line 19
    .line 20
    if-ge v3, v4, :cond_0

    .line 21
    goto :goto_1

    .line 22
    .line 23
    :cond_0
    mul-int/lit8 v2, v2, 0xa

    .line 24
    .line 25
    add-int/lit8 v3, v3, -0x30

    .line 26
    add-int/2addr v2, v3

    .line 27
    .line 28
    add-int/lit8 v1, v1, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    :goto_1
    return v2
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

.method public static final c()V
    .locals 2

    .line 1
    .line 2
    new-instance v0, Ljava/lang/RuntimeException;

    .line 3
    .line 4
    const-string v1, "Internal error: this code path should never get executed"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 8
    throw v0
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
