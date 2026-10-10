.class public final synthetic Lkotlinx/serialization/json/internal/t;
.super Ljava/lang/Object;
.source "R8$$SyntheticClass"


# direct methods
.method public static synthetic a(JI)Ljava/lang/String;
    .locals 10

    .line 1
    .line 2
    const-wide/16 v0, 0x0

    .line 3
    .line 4
    cmp-long v2, p0, v0

    .line 5
    .line 6
    if-nez v2, :cond_0

    .line 7
    .line 8
    const-string p0, "0"

    .line 9
    return-object p0

    .line 10
    .line 11
    :cond_0
    if-lez v2, :cond_1

    .line 12
    .line 13
    .line 14
    invoke-static {p0, p1, p2}, Ljava/lang/Long;->toString(JI)Ljava/lang/String;

    .line 15
    move-result-object p0

    .line 16
    return-object p0

    .line 17
    :cond_1
    const/4 v2, 0x2

    .line 18
    .line 19
    if-lt p2, v2, :cond_2

    .line 20
    .line 21
    const/16 v2, 0x24

    .line 22
    .line 23
    if-le p2, v2, :cond_3

    .line 24
    .line 25
    :cond_2
    const/16 p2, 0xa

    .line 26
    .line 27
    :cond_3
    const/16 v2, 0x40

    .line 28
    .line 29
    new-array v3, v2, [C

    .line 30
    .line 31
    add-int/lit8 v4, p2, -0x1

    .line 32
    .line 33
    and-int v5, p2, v4

    .line 34
    .line 35
    if-nez v5, :cond_5

    .line 36
    .line 37
    .line 38
    invoke-static {p2}, Ljava/lang/Integer;->numberOfTrailingZeros(I)I

    .line 39
    move-result v5

    .line 40
    .line 41
    :cond_4
    add-int/lit8 v2, v2, -0x1

    .line 42
    long-to-int v6, p0

    .line 43
    and-int/2addr v6, v4

    .line 44
    .line 45
    .line 46
    invoke-static {v6, p2}, Ljava/lang/Character;->forDigit(II)C

    .line 47
    move-result v6

    .line 48
    .line 49
    aput-char v6, v3, v2

    .line 50
    ushr-long/2addr p0, v5

    .line 51
    .line 52
    cmp-long v6, p0, v0

    .line 53
    .line 54
    if-nez v6, :cond_4

    .line 55
    goto :goto_2

    .line 56
    .line 57
    :cond_5
    and-int/lit8 v2, p2, 0x1

    .line 58
    .line 59
    if-nez v2, :cond_6

    .line 60
    const/4 v2, 0x1

    .line 61
    .line 62
    ushr-long v4, p0, v2

    .line 63
    .line 64
    ushr-int/lit8 v2, p2, 0x1

    .line 65
    int-to-long v6, v2

    .line 66
    div-long/2addr v4, v6

    .line 67
    goto :goto_0

    .line 68
    :cond_6
    int-to-long v4, p2

    .line 69
    .line 70
    .line 71
    invoke-static {p0, p1, v4, v5}, Lkotlin/d;->a(JJ)J

    .line 72
    move-result-wide v4

    .line 73
    :goto_0
    int-to-long v6, p2

    .line 74
    .line 75
    mul-long v8, v4, v6

    .line 76
    sub-long/2addr p0, v8

    .line 77
    long-to-int p0, p0

    .line 78
    .line 79
    .line 80
    invoke-static {p0, p2}, Ljava/lang/Character;->forDigit(II)C

    .line 81
    move-result p0

    .line 82
    .line 83
    const/16 p1, 0x3f

    .line 84
    .line 85
    aput-char p0, v3, p1

    .line 86
    move v2, p1

    .line 87
    .line 88
    :goto_1
    cmp-long p0, v4, v0

    .line 89
    .line 90
    if-lez p0, :cond_7

    .line 91
    .line 92
    add-int/lit8 v2, v2, -0x1

    .line 93
    .line 94
    rem-long p0, v4, v6

    .line 95
    long-to-int p0, p0

    .line 96
    .line 97
    .line 98
    invoke-static {p0, p2}, Ljava/lang/Character;->forDigit(II)C

    .line 99
    move-result p0

    .line 100
    .line 101
    aput-char p0, v3, v2

    .line 102
    div-long/2addr v4, v6

    .line 103
    goto :goto_1

    .line 104
    .line 105
    :cond_7
    :goto_2
    new-instance p0, Ljava/lang/String;

    .line 106
    .line 107
    rsub-int/lit8 p1, v2, 0x40

    .line 108
    .line 109
    .line 110
    invoke-direct {p0, v3, v2, p1}, Ljava/lang/String;-><init>([CII)V

    .line 111
    return-object p0
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
