.class public final Lcom/geetest/gtc4/h;
.super Lcom/geetest/gtc4/w;
.source "SourceFile"


# static fields
.field public static final b:[Lcom/geetest/gtc4/h;


# instance fields
.field public final a:[B


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    const/16 v0, 0xc

    .line 3
    .line 4
    new-array v0, v0, [Lcom/geetest/gtc4/h;

    .line 5
    .line 6
    sput-object v0, Lcom/geetest/gtc4/h;->b:[Lcom/geetest/gtc4/h;

    .line 7
    return-void
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

.method public constructor <init>([BZ)V
    .locals 3

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Lcom/geetest/gtc4/w;-><init>()V

    .line 4
    .line 5
    .line 6
    invoke-static {p1}, Lcom/geetest/gtc4/n;->a([B)Z

    .line 7
    move-result v0

    .line 8
    .line 9
    if-nez v0, :cond_3

    .line 10
    const/4 v0, 0x0

    .line 11
    .line 12
    aget-byte v1, p1, v0

    .line 13
    .line 14
    and-int/lit16 v1, v1, 0x80

    .line 15
    .line 16
    if-nez v1, :cond_2

    .line 17
    .line 18
    if-eqz p2, :cond_0

    .line 19
    .line 20
    .line 21
    invoke-static {p1}, Lcom/geetest/gtc4/o0;->a([B)[B

    .line 22
    move-result-object p2

    .line 23
    goto :goto_0

    .line 24
    :cond_0
    move-object p2, p1

    .line 25
    .line 26
    :goto_0
    iput-object p2, p0, Lcom/geetest/gtc4/h;->a:[B

    .line 27
    array-length p2, p1

    .line 28
    .line 29
    add-int/lit8 p2, p2, -0x1

    .line 30
    .line 31
    :goto_1
    if-ge v0, p2, :cond_1

    .line 32
    .line 33
    aget-byte v1, p1, v0

    .line 34
    .line 35
    add-int/lit8 v0, v0, 0x1

    .line 36
    .line 37
    aget-byte v2, p1, v0

    .line 38
    .line 39
    shr-int/lit8 v2, v2, 0x7

    .line 40
    .line 41
    if-ne v1, v2, :cond_1

    .line 42
    goto :goto_1

    .line 43
    :cond_1
    return-void

    .line 44
    .line 45
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 46
    .line 47
    const-string p2, "enumerated must be non-negative"

    .line 48
    .line 49
    .line 50
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 51
    throw p1

    .line 52
    .line 53
    :cond_3
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 54
    .line 55
    const-string p2, "malformed enumerated"

    .line 56
    .line 57
    .line 58
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 59
    throw p1
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
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
.end method

.method public static a([BZ)Lcom/geetest/gtc4/h;
    .locals 3

    .line 8
    array-length v0, p0

    const/4 v1, 0x1

    if-le v0, v1, :cond_0

    .line 9
    new-instance v0, Lcom/geetest/gtc4/h;

    invoke-direct {v0, p0, p1}, Lcom/geetest/gtc4/h;-><init>([BZ)V

    return-object v0

    .line 10
    :cond_0
    array-length v0, p0

    if-eqz v0, :cond_3

    const/4 v0, 0x0

    .line 11
    aget-byte v0, p0, v0

    and-int/lit16 v0, v0, 0xff

    .line 12
    sget-object v1, Lcom/geetest/gtc4/h;->b:[Lcom/geetest/gtc4/h;

    const/16 v2, 0xc

    if-lt v0, v2, :cond_1

    .line 13
    new-instance v0, Lcom/geetest/gtc4/h;

    invoke-direct {v0, p0, p1}, Lcom/geetest/gtc4/h;-><init>([BZ)V

    return-object v0

    .line 14
    :cond_1
    aget-object v2, v1, v0

    if-nez v2, :cond_2

    .line 15
    new-instance v2, Lcom/geetest/gtc4/h;

    invoke-direct {v2, p0, p1}, Lcom/geetest/gtc4/h;-><init>([BZ)V

    aput-object v2, v1, v0

    :cond_2
    return-object v2

    .line 16
    :cond_3
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string p1, "ENUMERATED has zero length"

    invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p0
.end method


# virtual methods
.method public final a(Z)I
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/geetest/gtc4/h;->a:[B

    array-length v0, v0

    .line 2
    invoke-static {v0, p1, v0}, Lcom/geetest/gtc4/d;->a(III)I

    move-result p1

    return p1
.end method

.method public final a(Lcom/geetest/gtc4/u;Z)V
    .locals 2

    .line 3
    iget-object v0, p0, Lcom/geetest/gtc4/h;->a:[B

    const/16 v1, 0xa

    invoke-virtual {p1, p2, v1, v0}, Lcom/geetest/gtc4/u;->a(ZI[B)V

    return-void
.end method

.method public final a(Lcom/geetest/gtc4/w;)Z
    .locals 1

    .line 4
    instance-of v0, p1, Lcom/geetest/gtc4/h;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    .line 5
    :cond_0
    check-cast p1, Lcom/geetest/gtc4/h;

    .line 6
    iget-object v0, p0, Lcom/geetest/gtc4/h;->a:[B

    iget-object p1, p1, Lcom/geetest/gtc4/h;->a:[B

    .line 7
    invoke-static {v0, p1}, Ljava/util/Arrays;->equals([B[B)Z

    move-result p1

    return p1
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x0

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

.method public final hashCode()I
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lcom/geetest/gtc4/h;->a:[B

    .line 3
    .line 4
    .line 5
    invoke-static {v0}, Lcom/geetest/gtc4/o0;->b([B)I

    .line 6
    move-result v0

    .line 7
    return v0
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
