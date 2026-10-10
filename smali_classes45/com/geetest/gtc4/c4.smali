.class public final Lcom/geetest/gtc4/c4;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public final a:[B

.field public final b:[B


# direct methods
.method public constructor <init>()V
    .locals 10

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    const/16 v0, 0x65

    .line 6
    .line 7
    const/16 v1, 0x66

    .line 8
    .line 9
    const/16 v2, 0x61

    .line 10
    .line 11
    const/16 v3, 0x62

    .line 12
    .line 13
    const/16 v4, 0x63

    .line 14
    .line 15
    const/16 v5, 0x64

    .line 16
    .line 17
    const/16 v6, 0x10

    .line 18
    .line 19
    new-array v6, v6, [B

    .line 20
    .line 21
    .line 22
    fill-array-data v6, :array_0

    .line 23
    .line 24
    iput-object v6, p0, Lcom/geetest/gtc4/c4;->a:[B

    .line 25
    .line 26
    const/16 v6, 0x80

    .line 27
    .line 28
    new-array v6, v6, [B

    .line 29
    .line 30
    iput-object v6, p0, Lcom/geetest/gtc4/c4;->b:[B

    .line 31
    const/4 v6, 0x0

    .line 32
    move v7, v6

    .line 33
    .line 34
    :goto_0
    iget-object v8, p0, Lcom/geetest/gtc4/c4;->b:[B

    .line 35
    array-length v9, v8

    .line 36
    .line 37
    if-ge v7, v9, :cond_0

    .line 38
    const/4 v9, -0x1

    .line 39
    .line 40
    aput-byte v9, v8, v7

    .line 41
    .line 42
    add-int/lit8 v7, v7, 0x1

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_0
    :goto_1
    iget-object v7, p0, Lcom/geetest/gtc4/c4;->a:[B

    .line 46
    array-length v8, v7

    .line 47
    .line 48
    if-ge v6, v8, :cond_1

    .line 49
    .line 50
    iget-object v8, p0, Lcom/geetest/gtc4/c4;->b:[B

    .line 51
    .line 52
    aget-byte v7, v7, v6

    .line 53
    int-to-byte v9, v6

    .line 54
    .line 55
    aput-byte v9, v8, v7

    .line 56
    .line 57
    add-int/lit8 v6, v6, 0x1

    .line 58
    goto :goto_1

    .line 59
    .line 60
    :cond_1
    iget-object v6, p0, Lcom/geetest/gtc4/c4;->b:[B

    .line 61
    .line 62
    aget-byte v2, v6, v2

    .line 63
    .line 64
    const/16 v7, 0x41

    .line 65
    .line 66
    aput-byte v2, v6, v7

    .line 67
    .line 68
    aget-byte v2, v6, v3

    .line 69
    .line 70
    const/16 v3, 0x42

    .line 71
    .line 72
    aput-byte v2, v6, v3

    .line 73
    .line 74
    aget-byte v2, v6, v4

    .line 75
    .line 76
    const/16 v3, 0x43

    .line 77
    .line 78
    aput-byte v2, v6, v3

    .line 79
    .line 80
    aget-byte v2, v6, v5

    .line 81
    .line 82
    const/16 v3, 0x44

    .line 83
    .line 84
    aput-byte v2, v6, v3

    .line 85
    .line 86
    aget-byte v0, v6, v0

    .line 87
    .line 88
    const/16 v2, 0x45

    .line 89
    .line 90
    aput-byte v0, v6, v2

    .line 91
    .line 92
    aget-byte v0, v6, v1

    .line 93
    .line 94
    const/16 v1, 0x46

    .line 95
    .line 96
    aput-byte v0, v6, v1

    .line 97
    return-void

    .line 98
    nop

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
    :array_0
    .array-data 1
        0x30t
        0x31t
        0x32t
        0x33t
        0x34t
        0x35t
        0x36t
        0x37t
        0x38t
        0x39t
        0x61t
        0x62t
        0x63t
        0x64t
        0x65t
        0x66t
    .end array-data
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
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
.end method
