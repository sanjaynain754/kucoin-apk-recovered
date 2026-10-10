.class public final Lshark/internal/c;
.super Ljava/lang/Object;
.source "ByteSubArray.kt"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u0012\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\n\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0002\u0008\u0003\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u001b\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001b\u0010\t\u001a\u00020\u0008*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "",
        "index",
        "",
        "c",
        "([BI)S",
        "a",
        "([BI)I",
        "",
        "b",
        "([BI)J",
        "shark-graph"
    }
    k = 0x2
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# direct methods
.method public static final a([BI)I
    .locals 3
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    add-int/lit8 v0, p1, 0x1

    .line 3
    .line 4
    aget-byte v1, p0, p1

    .line 5
    .line 6
    and-int/lit16 v1, v1, 0xff

    .line 7
    .line 8
    shl-int/lit8 v1, v1, 0x18

    .line 9
    .line 10
    add-int/lit8 v2, p1, 0x2

    .line 11
    .line 12
    aget-byte v0, p0, v0

    .line 13
    .line 14
    and-int/lit16 v0, v0, 0xff

    .line 15
    .line 16
    shl-int/lit8 v0, v0, 0x10

    .line 17
    or-int/2addr v0, v1

    .line 18
    .line 19
    add-int/lit8 p1, p1, 0x3

    .line 20
    .line 21
    aget-byte v1, p0, v2

    .line 22
    .line 23
    and-int/lit16 v1, v1, 0xff

    .line 24
    .line 25
    shl-int/lit8 v1, v1, 0x8

    .line 26
    or-int/2addr v0, v1

    .line 27
    .line 28
    aget-byte p0, p0, p1

    .line 29
    .line 30
    and-int/lit16 p0, p0, 0xff

    .line 31
    or-int/2addr p0, v0

    .line 32
    return p0
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

.method public static final b([BI)J
    .locals 8
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    add-int/lit8 v0, p1, 0x1

    .line 3
    .line 4
    aget-byte v1, p0, p1

    .line 5
    int-to-long v1, v1

    .line 6
    .line 7
    const-wide/16 v3, 0xff

    .line 8
    and-long/2addr v1, v3

    .line 9
    .line 10
    const/16 v5, 0x38

    .line 11
    shl-long/2addr v1, v5

    .line 12
    .line 13
    add-int/lit8 v5, p1, 0x2

    .line 14
    .line 15
    aget-byte v0, p0, v0

    .line 16
    int-to-long v6, v0

    .line 17
    and-long/2addr v6, v3

    .line 18
    .line 19
    const/16 v0, 0x30

    .line 20
    shl-long/2addr v6, v0

    .line 21
    .line 22
    or-long v0, v1, v6

    .line 23
    .line 24
    add-int/lit8 v2, p1, 0x3

    .line 25
    .line 26
    aget-byte v5, p0, v5

    .line 27
    int-to-long v5, v5

    .line 28
    and-long/2addr v5, v3

    .line 29
    .line 30
    const/16 v7, 0x28

    .line 31
    shl-long/2addr v5, v7

    .line 32
    or-long/2addr v0, v5

    .line 33
    .line 34
    add-int/lit8 v5, p1, 0x4

    .line 35
    .line 36
    aget-byte v2, p0, v2

    .line 37
    int-to-long v6, v2

    .line 38
    and-long/2addr v6, v3

    .line 39
    .line 40
    const/16 v2, 0x20

    .line 41
    shl-long/2addr v6, v2

    .line 42
    or-long/2addr v0, v6

    .line 43
    .line 44
    add-int/lit8 v2, p1, 0x5

    .line 45
    .line 46
    aget-byte v5, p0, v5

    .line 47
    int-to-long v5, v5

    .line 48
    and-long/2addr v5, v3

    .line 49
    .line 50
    const/16 v7, 0x18

    .line 51
    shl-long/2addr v5, v7

    .line 52
    or-long/2addr v0, v5

    .line 53
    .line 54
    add-int/lit8 v5, p1, 0x6

    .line 55
    .line 56
    aget-byte v2, p0, v2

    .line 57
    int-to-long v6, v2

    .line 58
    and-long/2addr v6, v3

    .line 59
    .line 60
    const/16 v2, 0x10

    .line 61
    shl-long/2addr v6, v2

    .line 62
    or-long/2addr v0, v6

    .line 63
    .line 64
    add-int/lit8 p1, p1, 0x7

    .line 65
    .line 66
    aget-byte v2, p0, v5

    .line 67
    int-to-long v5, v2

    .line 68
    and-long/2addr v5, v3

    .line 69
    .line 70
    const/16 v2, 0x8

    .line 71
    shl-long/2addr v5, v2

    .line 72
    or-long/2addr v0, v5

    .line 73
    .line 74
    aget-byte p0, p0, p1

    .line 75
    int-to-long p0, p0

    .line 76
    and-long/2addr p0, v3

    .line 77
    or-long/2addr p0, v0

    .line 78
    return-wide p0
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
.end method

.method public static final c([BI)S
    .locals 1
    .param p0    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    .line 2
    add-int/lit8 v0, p1, 0x1

    .line 3
    .line 4
    aget-byte p1, p0, p1

    .line 5
    .line 6
    and-int/lit16 p1, p1, 0xff

    .line 7
    .line 8
    shl-int/lit8 p1, p1, 0x8

    .line 9
    .line 10
    aget-byte p0, p0, v0

    .line 11
    .line 12
    and-int/lit16 p0, p0, 0xff

    .line 13
    or-int/2addr p0, p1

    .line 14
    int-to-short p0, p0

    .line 15
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
