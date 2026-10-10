.class public final Lkotlinx/serialization/json/internal/b;
.super Ljava/lang/Object;
.source "AbstractJsonLexer.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u000c\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u0008H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "token",
        "",
        "c",
        "(B)Ljava/lang/String;",
        "",
        "a",
        "(C)B",
        "",
        "b",
        "(I)C",
        "kotlinx-serialization-json"
    }
    k = 0x2
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static final a(C)B
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x7e

    .line 3
    .line 4
    if-ge p0, v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lkotlinx/serialization/json/internal/m;->c:[B

    .line 7
    .line 8
    aget-byte p0, v0, p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
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

.method public static final b(I)C
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0x75

    .line 3
    .line 4
    if-ge p0, v0, :cond_0

    .line 5
    .line 6
    sget-object v0, Lkotlinx/serialization/json/internal/m;->b:[C

    .line 7
    .line 8
    aget-char p0, v0, p0

    .line 9
    return p0

    .line 10
    :cond_0
    const/4 p0, 0x0

    .line 11
    return p0
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

.method public static final c(B)Ljava/lang/String;
    .locals 1
    .annotation build Lorg/jetbrains/annotations/NotNull;
    .end annotation

    .line 1
    const/4 v0, 0x1

    .line 2
    .line 3
    if-ne p0, v0, :cond_0

    .line 4
    .line 5
    const-string p0, "quotation mark \'\"\'"

    .line 6
    return-object p0

    .line 7
    :cond_0
    const/4 v0, 0x2

    .line 8
    .line 9
    if-ne p0, v0, :cond_1

    .line 10
    .line 11
    .line 12
    const-string/jumbo p0, "string escape sequence \'\\\'"

    .line 13
    return-object p0

    .line 14
    :cond_1
    const/4 v0, 0x4

    .line 15
    .line 16
    if-ne p0, v0, :cond_2

    .line 17
    .line 18
    const-string p0, "comma \',\'"

    .line 19
    return-object p0

    .line 20
    :cond_2
    const/4 v0, 0x5

    .line 21
    .line 22
    if-ne p0, v0, :cond_3

    .line 23
    .line 24
    const-string p0, "colon \':\'"

    .line 25
    return-object p0

    .line 26
    :cond_3
    const/4 v0, 0x6

    .line 27
    .line 28
    if-ne p0, v0, :cond_4

    .line 29
    .line 30
    .line 31
    const-string/jumbo p0, "start of the object \'{\'"

    .line 32
    return-object p0

    .line 33
    :cond_4
    const/4 v0, 0x7

    .line 34
    .line 35
    if-ne p0, v0, :cond_5

    .line 36
    .line 37
    const-string p0, "end of the object \'}\'"

    .line 38
    return-object p0

    .line 39
    .line 40
    :cond_5
    const/16 v0, 0x8

    .line 41
    .line 42
    if-ne p0, v0, :cond_6

    .line 43
    .line 44
    .line 45
    const-string/jumbo p0, "start of the array \'[\'"

    .line 46
    return-object p0

    .line 47
    .line 48
    :cond_6
    const/16 v0, 0x9

    .line 49
    .line 50
    if-ne p0, v0, :cond_7

    .line 51
    .line 52
    const-string p0, "end of the array \']\'"

    .line 53
    return-object p0

    .line 54
    .line 55
    :cond_7
    const/16 v0, 0xa

    .line 56
    .line 57
    if-ne p0, v0, :cond_8

    .line 58
    .line 59
    const-string p0, "end of the input"

    .line 60
    return-object p0

    .line 61
    .line 62
    :cond_8
    const/16 v0, 0x7f

    .line 63
    .line 64
    if-ne p0, v0, :cond_9

    .line 65
    .line 66
    const-string p0, "invalid token"

    .line 67
    return-object p0

    .line 68
    .line 69
    .line 70
    :cond_9
    const-string/jumbo p0, "valid token"

    .line 71
    return-object p0
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
.end method
