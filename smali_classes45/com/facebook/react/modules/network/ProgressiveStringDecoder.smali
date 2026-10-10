.class Lcom/facebook/react/modules/network/ProgressiveStringDecoder;
.super Ljava/lang/Object;
.source "ProgressiveStringDecoder.java"


# static fields
.field private static final EMPTY_STRING:Ljava/lang/String; = ""


# instance fields
.field private final mDecoder:Ljava/nio/charset/CharsetDecoder;

.field private remainder:[B


# direct methods
.method public constructor <init>(Ljava/nio/charset/Charset;)V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    iput-object v0, p0, Lcom/facebook/react/modules/network/ProgressiveStringDecoder;->remainder:[B

    .line 7
    .line 8
    .line 9
    invoke-virtual {p1}, Ljava/nio/charset/Charset;->newDecoder()Ljava/nio/charset/CharsetDecoder;

    .line 10
    move-result-object p1

    .line 11
    .line 12
    iput-object p1, p0, Lcom/facebook/react/modules/network/ProgressiveStringDecoder;->mDecoder:Ljava/nio/charset/CharsetDecoder;

    .line 13
    return-void
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
.end method


# virtual methods
.method public decodeNext([BI)Ljava/lang/String;
    .locals 7

    .line 1
    .line 2
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressiveStringDecoder;->remainder:[B

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-eqz v0, :cond_0

    .line 6
    array-length v2, v0

    .line 7
    add-int/2addr v2, p2

    .line 8
    .line 9
    new-array v2, v2, [B

    .line 10
    array-length v3, v0

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1, v2, v1, v3}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 14
    .line 15
    iget-object v0, p0, Lcom/facebook/react/modules/network/ProgressiveStringDecoder;->remainder:[B

    .line 16
    array-length v0, v0

    .line 17
    .line 18
    .line 19
    invoke-static {p1, v1, v2, v0, p2}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 20
    .line 21
    iget-object p1, p0, Lcom/facebook/react/modules/network/ProgressiveStringDecoder;->remainder:[B

    .line 22
    array-length p1, p1

    .line 23
    add-int/2addr p2, p1

    .line 24
    move-object p1, v2

    .line 25
    .line 26
    .line 27
    :cond_0
    invoke-static {p1, v1, p2}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 28
    move-result-object v0

    .line 29
    const/4 v2, 0x0

    .line 30
    move v3, v1

    .line 31
    move v4, v3

    .line 32
    move-object v5, v2

    .line 33
    .line 34
    :goto_0
    if-nez v3, :cond_1

    .line 35
    const/4 v6, 0x4

    .line 36
    .line 37
    if-ge v4, v6, :cond_1

    .line 38
    .line 39
    :try_start_0
    iget-object v6, p0, Lcom/facebook/react/modules/network/ProgressiveStringDecoder;->mDecoder:Ljava/nio/charset/CharsetDecoder;

    .line 40
    .line 41
    .line 42
    invoke-virtual {v6, v0}, Ljava/nio/charset/CharsetDecoder;->decode(Ljava/nio/ByteBuffer;)Ljava/nio/CharBuffer;

    .line 43
    move-result-object v5
    :try_end_0
    .catch Ljava/nio/charset/CharacterCodingException; {:try_start_0 .. :try_end_0} :catch_0

    .line 44
    const/4 v3, 0x1

    .line 45
    goto :goto_0

    .line 46
    .line 47
    :catch_0
    add-int/lit8 v4, v4, 0x1

    .line 48
    .line 49
    sub-int v0, p2, v4

    .line 50
    .line 51
    .line 52
    invoke-static {p1, v1, v0}, Ljava/nio/ByteBuffer;->wrap([BII)Ljava/nio/ByteBuffer;

    .line 53
    move-result-object v0

    .line 54
    goto :goto_0

    .line 55
    .line 56
    :cond_1
    if-eqz v3, :cond_2

    .line 57
    .line 58
    if-lez v4, :cond_2

    .line 59
    .line 60
    new-array v0, v4, [B

    .line 61
    .line 62
    iput-object v0, p0, Lcom/facebook/react/modules/network/ProgressiveStringDecoder;->remainder:[B

    .line 63
    sub-int/2addr p2, v4

    .line 64
    .line 65
    .line 66
    invoke-static {p1, p2, v0, v1, v4}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 67
    goto :goto_1

    .line 68
    .line 69
    :cond_2
    iput-object v2, p0, Lcom/facebook/react/modules/network/ProgressiveStringDecoder;->remainder:[B

    .line 70
    .line 71
    :goto_1
    if-nez v3, :cond_3

    .line 72
    .line 73
    const-string p1, "ReactNative"

    .line 74
    .line 75
    const-string p2, "failed to decode string from byte array"

    .line 76
    .line 77
    .line 78
    invoke-static {p1, p2}, Lx3/a;->I(Ljava/lang/String;Ljava/lang/String;)V

    .line 79
    .line 80
    const-string p1, ""

    .line 81
    return-object p1

    .line 82
    .line 83
    :cond_3
    new-instance p1, Ljava/lang/String;

    .line 84
    .line 85
    .line 86
    invoke-virtual {v5}, Ljava/nio/CharBuffer;->array()[C

    .line 87
    move-result-object p2

    .line 88
    .line 89
    .line 90
    invoke-virtual {v5}, Ljava/nio/CharBuffer;->length()I

    .line 91
    move-result v0

    .line 92
    .line 93
    .line 94
    invoke-direct {p1, p2, v1, v0}, Ljava/lang/String;-><init>([CII)V

    .line 95
    return-object p1
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
