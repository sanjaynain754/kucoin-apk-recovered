.class public final Lshark/internal/aosp/ByteArrayTimSort$Companion;
.super Ljava/lang/Object;
.source "ByteArrayTimSort.kt"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lshark/internal/aosp/ByteArrayTimSort;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Companion"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J%\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ5\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\u000b\u0010\u000fJ\'\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J?\u0010\u0005\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u0005\u0010\u0015J7\u0010\t\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\t\u0010\u0016J/\u0010\u0017\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\u0017\u0010\u001a\u001a\u00020\u00062\u0006\u0010\u0019\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJO\u0010 \u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008 \u0010!JO\u0010\"\u001a\u00020\u00062\u0006\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u001e\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u001f\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\"\u0010!R\u0014\u0010$\u001a\u00020#8\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008$\u0010%R\u0014\u0010&\u001a\u00020\u00068\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0014\u0010(\u001a\u00020\u00068\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008(\u0010\'R\u0014\u0010)\u001a\u00020\u00068\u0002X\u0082D\u00a2\u0006\u0006\n\u0004\u0008)\u0010\'\u00a8\u0006*"
    }
    d2 = {
        "Lshark/internal/aosp/ByteArrayTimSort$Companion;",
        "",
        "<init>",
        "()V",
        "",
        "a",
        "",
        "entrySize",
        "Lbi0/a;",
        "c",
        "",
        "sort",
        "([BILbi0/a;)V",
        "lo",
        "hi",
        "([BIIILbi0/a;)V",
        "len",
        "start",
        "end",
        "b",
        "(III)V",
        "([BIIIILbi0/a;)V",
        "([BIIILbi0/a;)I",
        "g",
        "([BIII)V",
        "n",
        "f",
        "(I)I",
        "keyArray",
        "keyIndex",
        "base",
        "hint",
        "d",
        "([BI[BIIIILbi0/a;)I",
        "e",
        "",
        "DEBUG",
        "Z",
        "INITIAL_TMP_STORAGE_LENGTH",
        "I",
        "MIN_GALLOP",
        "MIN_MERGE",
        "shark-graph"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x1
    }
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Lshark/internal/aosp/ByteArrayTimSort$Companion;-><init>()V

    return-void
.end method

.method public static final synthetic access$gallopLeft(Lshark/internal/aosp/ByteArrayTimSort$Companion;[BI[BIIIILbi0/a;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p8}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->d([BI[BIIIILbi0/a;)I

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method

.method public static final synthetic access$gallopRight(Lshark/internal/aosp/ByteArrayTimSort$Companion;[BI[BIIIILbi0/a;)I
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-virtual/range {p0 .. p8}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->e([BI[BIIIILbi0/a;)I

    .line 4
    move-result p0

    .line 5
    return p0
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
.end method


# virtual methods
.method public final a([BIIIILbi0/a;)V
    .locals 9

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-ne p4, p2, :cond_0

    .line 7
    .line 8
    add-int/lit8 p4, p4, 0x1

    .line 9
    .line 10
    :cond_0
    new-array v2, p5, [B

    .line 11
    .line 12
    :goto_0
    if-ge p4, p3, :cond_9

    .line 13
    .line 14
    mul-int v0, p4, p5

    .line 15
    const/4 v6, 0x0

    .line 16
    move v1, v6

    .line 17
    .line 18
    :goto_1
    if-ge v1, p5, :cond_1

    .line 19
    .line 20
    add-int v3, v0, v1

    .line 21
    .line 22
    aget-byte v3, p1, v3

    .line 23
    .line 24
    aput-byte v3, v2, v1

    .line 25
    .line 26
    add-int/lit8 v1, v1, 0x1

    .line 27
    goto :goto_1

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    .line 31
    move v7, p2

    .line 32
    move v8, p4

    .line 33
    :goto_2
    const/4 v0, 0x1

    .line 34
    .line 35
    if-ge v7, v8, :cond_3

    .line 36
    .line 37
    add-int v1, v7, v8

    .line 38
    .line 39
    ushr-int/lit8 v5, v1, 0x1

    .line 40
    const/4 v3, 0x0

    .line 41
    move-object v4, p1

    .line 42
    move v1, p5

    .line 43
    move-object v0, p6

    .line 44
    .line 45
    .line 46
    invoke-interface/range {v0 .. v5}, Lbi0/a;->a(I[BI[BI)I

    .line 47
    move-result p1

    .line 48
    move-object p5, v0

    .line 49
    .line 50
    if-gez p1, :cond_2

    .line 51
    move v8, v5

    .line 52
    goto :goto_3

    .line 53
    .line 54
    :cond_2
    add-int/lit8 v7, v5, 0x1

    .line 55
    :goto_3
    move-object p6, p5

    .line 56
    move p5, v1

    .line 57
    move-object p1, v4

    .line 58
    goto :goto_2

    .line 59
    :cond_3
    move-object v4, p1

    .line 60
    move v1, p5

    .line 61
    move-object p5, p6

    .line 62
    .line 63
    .line 64
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    .line 65
    .line 66
    sub-int p1, p4, v7

    .line 67
    .line 68
    if-eq p1, v0, :cond_6

    .line 69
    const/4 p6, 0x2

    .line 70
    .line 71
    if-eq p1, p6, :cond_4

    .line 72
    .line 73
    mul-int p6, v7, v1

    .line 74
    .line 75
    add-int/lit8 v0, v7, 0x1

    .line 76
    mul-int/2addr v0, v1

    .line 77
    mul-int/2addr p1, v1

    .line 78
    .line 79
    .line 80
    invoke-static {v4, p6, v4, v0, p1}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 81
    goto :goto_7

    .line 82
    .line 83
    :cond_4
    mul-int p1, v7, v1

    .line 84
    .line 85
    add-int/lit8 p6, v7, 0x1

    .line 86
    mul-int/2addr p6, v1

    .line 87
    .line 88
    add-int/lit8 v0, v7, 0x2

    .line 89
    mul-int/2addr v0, v1

    .line 90
    move v3, v6

    .line 91
    .line 92
    :goto_4
    if-ge v3, v1, :cond_5

    .line 93
    .line 94
    add-int v5, v0, v3

    .line 95
    .line 96
    add-int v8, p6, v3

    .line 97
    .line 98
    aget-byte v8, v4, v8

    .line 99
    .line 100
    aput-byte v8, v4, v5

    .line 101
    .line 102
    add-int/lit8 v3, v3, 0x1

    .line 103
    goto :goto_4

    .line 104
    :cond_5
    move v0, v6

    .line 105
    .line 106
    :goto_5
    if-ge v0, v1, :cond_7

    .line 107
    .line 108
    add-int v3, p6, v0

    .line 109
    .line 110
    add-int v5, p1, v0

    .line 111
    .line 112
    aget-byte v5, v4, v5

    .line 113
    .line 114
    aput-byte v5, v4, v3

    .line 115
    .line 116
    add-int/lit8 v0, v0, 0x1

    .line 117
    goto :goto_5

    .line 118
    .line 119
    :cond_6
    mul-int p1, v7, v1

    .line 120
    .line 121
    add-int/lit8 p6, v7, 0x1

    .line 122
    mul-int/2addr p6, v1

    .line 123
    move v0, v6

    .line 124
    .line 125
    :goto_6
    if-ge v0, v1, :cond_7

    .line 126
    .line 127
    add-int v3, p6, v0

    .line 128
    .line 129
    add-int v5, p1, v0

    .line 130
    .line 131
    aget-byte v5, v4, v5

    .line 132
    .line 133
    aput-byte v5, v4, v3

    .line 134
    .line 135
    add-int/lit8 v0, v0, 0x1

    .line 136
    goto :goto_6

    .line 137
    :cond_7
    :goto_7
    mul-int/2addr v7, v1

    .line 138
    .line 139
    :goto_8
    if-ge v6, v1, :cond_8

    .line 140
    .line 141
    add-int p1, v7, v6

    .line 142
    .line 143
    aget-byte p6, v2, v6

    .line 144
    .line 145
    aput-byte p6, v4, p1

    .line 146
    .line 147
    add-int/lit8 v6, v6, 0x1

    .line 148
    goto :goto_8

    .line 149
    .line 150
    :cond_8
    add-int/lit8 p4, p4, 0x1

    .line 151
    move-object p6, p5

    .line 152
    move p5, v1

    .line 153
    move-object p1, v4

    .line 154
    .line 155
    goto/16 :goto_0

    .line 156
    :cond_9
    return-void
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
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
.end method

.method public final b(III)V
    .locals 3

    .line 1
    .line 2
    if-ltz p2, :cond_1

    .line 3
    .line 4
    if-gt p3, p1, :cond_1

    .line 5
    .line 6
    if-gt p2, p3, :cond_0

    .line 7
    return-void

    .line 8
    .line 9
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 10
    .line 11
    new-instance v0, Ljava/lang/StringBuilder;

    .line 12
    .line 13
    .line 14
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 15
    .line 16
    .line 17
    const-string/jumbo v1, "start > end: "

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 24
    .line 25
    const-string p2, " > "

    .line 26
    .line 27
    .line 28
    invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 29
    .line 30
    .line 31
    invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 35
    move-result-object p2

    .line 36
    .line 37
    .line 38
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 39
    throw p1

    .line 40
    .line 41
    :cond_1
    new-instance v0, Ljava/lang/ArrayIndexOutOfBoundsException;

    .line 42
    .line 43
    new-instance v1, Ljava/lang/StringBuilder;

    .line 44
    .line 45
    .line 46
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 47
    .line 48
    .line 49
    const-string/jumbo v2, "start < 0 || end > len. start="

    .line 50
    .line 51
    .line 52
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 56
    .line 57
    const-string p2, ", end="

    .line 58
    .line 59
    .line 60
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 61
    .line 62
    .line 63
    invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 64
    .line 65
    const-string p2, ", len="

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 69
    .line 70
    .line 71
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 72
    .line 73
    .line 74
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 75
    move-result-object p1

    .line 76
    .line 77
    .line 78
    invoke-direct {v0, p1}, Ljava/lang/ArrayIndexOutOfBoundsException;-><init>(Ljava/lang/String;)V

    .line 79
    throw v0
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
.end method

.method public final c([BIIILbi0/a;)I
    .locals 6

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    .line 4
    .line 5
    add-int/lit8 v3, p2, 0x1

    .line 6
    .line 7
    if-ne v3, p3, :cond_0

    .line 8
    const/4 p1, 0x1

    .line 9
    return p1

    .line 10
    :cond_0
    move-object v4, p1

    .line 11
    move-object v2, p1

    .line 12
    move v5, p2

    .line 13
    move v1, p4

    .line 14
    move-object v0, p5

    .line 15
    .line 16
    .line 17
    invoke-interface/range {v0 .. v5}, Lbi0/a;->a(I[BI[BI)I

    .line 18
    move-result p1

    .line 19
    .line 20
    add-int/lit8 p4, p2, 0x2

    .line 21
    move v3, p4

    .line 22
    .line 23
    if-gez p1, :cond_2

    .line 24
    .line 25
    :goto_0
    if-ge v3, p3, :cond_1

    .line 26
    .line 27
    add-int/lit8 v5, v3, -0x1

    .line 28
    move-object v4, v2

    .line 29
    .line 30
    .line 31
    invoke-interface/range {v0 .. v5}, Lbi0/a;->a(I[BI[BI)I

    .line 32
    move-result p1

    .line 33
    .line 34
    if-gez p1, :cond_1

    .line 35
    .line 36
    add-int/lit8 v3, v3, 0x1

    .line 37
    goto :goto_0

    .line 38
    .line 39
    .line 40
    :cond_1
    invoke-virtual {p0, v2, p2, v3, v1}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->g([BIII)V

    .line 41
    goto :goto_2

    .line 42
    .line 43
    :cond_2
    :goto_1
    if-ge v3, p3, :cond_3

    .line 44
    .line 45
    add-int/lit8 v5, v3, -0x1

    .line 46
    move-object v4, v2

    .line 47
    .line 48
    .line 49
    invoke-interface/range {v0 .. v5}, Lbi0/a;->a(I[BI[BI)I

    .line 50
    move-result p1

    .line 51
    .line 52
    if-ltz p1, :cond_3

    .line 53
    .line 54
    add-int/lit8 v3, v3, 0x1

    .line 55
    goto :goto_1

    .line 56
    :cond_3
    :goto_2
    sub-int/2addr v3, p2

    .line 57
    return v3
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
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
.end method

.method public final d([BI[BIIIILbi0/a;)I
    .locals 16

    .line 1
    .line 2
    move/from16 v0, p5

    .line 3
    .line 4
    move/from16 v1, p6

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    .line 8
    move-result v2

    .line 9
    .line 10
    add-int v8, p4, v1

    .line 11
    .line 12
    move-object/from16 v5, p1

    .line 13
    .line 14
    move/from16 v6, p2

    .line 15
    .line 16
    move-object/from16 v7, p3

    .line 17
    .line 18
    move/from16 v4, p7

    .line 19
    .line 20
    move-object/from16 v3, p8

    .line 21
    .line 22
    .line 23
    invoke-interface/range {v3 .. v8}, Lbi0/a;->a(I[BI[BI)I

    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v4, 0x0

    .line 27
    .line 28
    if-lez v2, :cond_3

    .line 29
    .line 30
    sub-int v2, v0, v1

    .line 31
    move v5, v4

    .line 32
    move v4, v3

    .line 33
    .line 34
    :goto_0
    if-ge v4, v2, :cond_1

    .line 35
    .line 36
    add-int v14, v8, v4

    .line 37
    .line 38
    move-object/from16 v11, p1

    .line 39
    .line 40
    move/from16 v12, p2

    .line 41
    .line 42
    move-object/from16 v13, p3

    .line 43
    .line 44
    move/from16 v10, p7

    .line 45
    .line 46
    move-object/from16 v9, p8

    .line 47
    .line 48
    .line 49
    invoke-interface/range {v9 .. v14}, Lbi0/a;->a(I[BI[BI)I

    .line 50
    move-result v6

    .line 51
    .line 52
    if-lez v6, :cond_1

    .line 53
    .line 54
    mul-int/lit8 v5, v4, 0x2

    .line 55
    add-int/2addr v5, v3

    .line 56
    .line 57
    if-gtz v5, :cond_0

    .line 58
    move v5, v2

    .line 59
    :cond_0
    move v15, v5

    .line 60
    move v5, v4

    .line 61
    move v4, v15

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_1
    if-le v4, v2, :cond_2

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move v2, v4

    .line 67
    :goto_1
    add-int/2addr v5, v1

    .line 68
    add-int/2addr v2, v1

    .line 69
    goto :goto_4

    .line 70
    .line 71
    :cond_3
    add-int/lit8 v2, v1, 0x1

    .line 72
    move v5, v4

    .line 73
    move v4, v3

    .line 74
    .line 75
    :goto_2
    if-ge v4, v2, :cond_5

    .line 76
    .line 77
    sub-int v14, v8, v4

    .line 78
    .line 79
    move-object/from16 v11, p1

    .line 80
    .line 81
    move/from16 v12, p2

    .line 82
    .line 83
    move-object/from16 v13, p3

    .line 84
    .line 85
    move/from16 v10, p7

    .line 86
    .line 87
    move-object/from16 v9, p8

    .line 88
    .line 89
    .line 90
    invoke-interface/range {v9 .. v14}, Lbi0/a;->a(I[BI[BI)I

    .line 91
    move-result v6

    .line 92
    .line 93
    if-gtz v6, :cond_5

    .line 94
    .line 95
    mul-int/lit8 v5, v4, 0x2

    .line 96
    add-int/2addr v5, v3

    .line 97
    .line 98
    if-gtz v5, :cond_4

    .line 99
    move v5, v2

    .line 100
    :cond_4
    move v15, v5

    .line 101
    move v5, v4

    .line 102
    move v4, v15

    .line 103
    goto :goto_2

    .line 104
    .line 105
    :cond_5
    if-le v4, v2, :cond_6

    .line 106
    goto :goto_3

    .line 107
    :cond_6
    move v2, v4

    .line 108
    .line 109
    :goto_3
    sub-int v2, v1, v2

    .line 110
    sub-int/2addr v1, v5

    .line 111
    move v5, v2

    .line 112
    move v2, v1

    .line 113
    .line 114
    .line 115
    :goto_4
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    .line 116
    move-result v1

    .line 117
    .line 118
    if-eqz v1, :cond_7

    .line 119
    const/4 v1, -0x1

    .line 120
    :cond_7
    add-int/2addr v5, v3

    .line 121
    .line 122
    :goto_5
    if-ge v5, v2, :cond_9

    .line 123
    .line 124
    sub-int v0, v2, v5

    .line 125
    ushr-int/2addr v0, v3

    .line 126
    add-int/2addr v0, v5

    .line 127
    .line 128
    add-int v14, p4, v0

    .line 129
    .line 130
    move-object/from16 v11, p1

    .line 131
    .line 132
    move/from16 v12, p2

    .line 133
    .line 134
    move-object/from16 v13, p3

    .line 135
    .line 136
    move/from16 v10, p7

    .line 137
    .line 138
    move-object/from16 v9, p8

    .line 139
    .line 140
    .line 141
    invoke-interface/range {v9 .. v14}, Lbi0/a;->a(I[BI[BI)I

    .line 142
    move-result v1

    .line 143
    .line 144
    if-lez v1, :cond_8

    .line 145
    .line 146
    add-int/lit8 v0, v0, 0x1

    .line 147
    move v5, v0

    .line 148
    goto :goto_5

    .line 149
    :cond_8
    move v2, v0

    .line 150
    goto :goto_5

    .line 151
    .line 152
    .line 153
    :cond_9
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    .line 154
    return v2
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
.end method

.method public final e([BI[BIIIILbi0/a;)I
    .locals 16

    .line 1
    .line 2
    move/from16 v0, p5

    .line 3
    .line 4
    move/from16 v1, p6

    .line 5
    .line 6
    .line 7
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    .line 8
    move-result v2

    .line 9
    .line 10
    add-int v8, p4, v1

    .line 11
    .line 12
    move-object/from16 v5, p1

    .line 13
    .line 14
    move/from16 v6, p2

    .line 15
    .line 16
    move-object/from16 v7, p3

    .line 17
    .line 18
    move/from16 v4, p7

    .line 19
    .line 20
    move-object/from16 v3, p8

    .line 21
    .line 22
    .line 23
    invoke-interface/range {v3 .. v8}, Lbi0/a;->a(I[BI[BI)I

    .line 24
    move-result v2

    .line 25
    const/4 v3, 0x1

    .line 26
    const/4 v4, 0x0

    .line 27
    .line 28
    if-gez v2, :cond_3

    .line 29
    .line 30
    add-int/lit8 v2, v1, 0x1

    .line 31
    move v5, v4

    .line 32
    move v4, v3

    .line 33
    .line 34
    :goto_0
    if-ge v4, v2, :cond_1

    .line 35
    .line 36
    sub-int v14, v8, v4

    .line 37
    .line 38
    move-object/from16 v11, p1

    .line 39
    .line 40
    move/from16 v12, p2

    .line 41
    .line 42
    move-object/from16 v13, p3

    .line 43
    .line 44
    move/from16 v10, p7

    .line 45
    .line 46
    move-object/from16 v9, p8

    .line 47
    .line 48
    .line 49
    invoke-interface/range {v9 .. v14}, Lbi0/a;->a(I[BI[BI)I

    .line 50
    move-result v6

    .line 51
    .line 52
    if-gez v6, :cond_1

    .line 53
    .line 54
    mul-int/lit8 v5, v4, 0x2

    .line 55
    add-int/2addr v5, v3

    .line 56
    .line 57
    if-gtz v5, :cond_0

    .line 58
    move v5, v2

    .line 59
    :cond_0
    move v15, v5

    .line 60
    move v5, v4

    .line 61
    move v4, v15

    .line 62
    goto :goto_0

    .line 63
    .line 64
    :cond_1
    if-le v4, v2, :cond_2

    .line 65
    goto :goto_1

    .line 66
    :cond_2
    move v2, v4

    .line 67
    .line 68
    :goto_1
    sub-int v2, v1, v2

    .line 69
    sub-int/2addr v1, v5

    .line 70
    goto :goto_4

    .line 71
    .line 72
    :cond_3
    sub-int v2, v0, v1

    .line 73
    move v5, v4

    .line 74
    move v4, v3

    .line 75
    .line 76
    :goto_2
    if-ge v4, v2, :cond_5

    .line 77
    .line 78
    add-int v14, v8, v4

    .line 79
    .line 80
    move-object/from16 v11, p1

    .line 81
    .line 82
    move/from16 v12, p2

    .line 83
    .line 84
    move-object/from16 v13, p3

    .line 85
    .line 86
    move/from16 v10, p7

    .line 87
    .line 88
    move-object/from16 v9, p8

    .line 89
    .line 90
    .line 91
    invoke-interface/range {v9 .. v14}, Lbi0/a;->a(I[BI[BI)I

    .line 92
    move-result v6

    .line 93
    .line 94
    if-ltz v6, :cond_5

    .line 95
    .line 96
    mul-int/lit8 v5, v4, 0x2

    .line 97
    add-int/2addr v5, v3

    .line 98
    .line 99
    if-gtz v5, :cond_4

    .line 100
    move v5, v2

    .line 101
    :cond_4
    move v15, v5

    .line 102
    move v5, v4

    .line 103
    move v4, v15

    .line 104
    goto :goto_2

    .line 105
    .line 106
    :cond_5
    if-le v4, v2, :cond_6

    .line 107
    goto :goto_3

    .line 108
    :cond_6
    move v2, v4

    .line 109
    .line 110
    :goto_3
    add-int v4, v5, v1

    .line 111
    add-int/2addr v1, v2

    .line 112
    move v2, v4

    .line 113
    .line 114
    .line 115
    :goto_4
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    .line 116
    move-result v4

    .line 117
    .line 118
    if-eqz v4, :cond_7

    .line 119
    const/4 v4, -0x1

    .line 120
    :cond_7
    add-int/2addr v2, v3

    .line 121
    .line 122
    :goto_5
    if-ge v2, v1, :cond_9

    .line 123
    .line 124
    sub-int v0, v1, v2

    .line 125
    ushr-int/2addr v0, v3

    .line 126
    add-int/2addr v0, v2

    .line 127
    .line 128
    add-int v14, p4, v0

    .line 129
    .line 130
    move-object/from16 v11, p1

    .line 131
    .line 132
    move/from16 v12, p2

    .line 133
    .line 134
    move-object/from16 v13, p3

    .line 135
    .line 136
    move/from16 v10, p7

    .line 137
    .line 138
    move-object/from16 v9, p8

    .line 139
    .line 140
    .line 141
    invoke-interface/range {v9 .. v14}, Lbi0/a;->a(I[BI[BI)I

    .line 142
    move-result v4

    .line 143
    .line 144
    if-gez v4, :cond_8

    .line 145
    move v1, v0

    .line 146
    goto :goto_5

    .line 147
    .line 148
    :cond_8
    add-int/lit8 v0, v0, 0x1

    .line 149
    move v2, v0

    .line 150
    goto :goto_5

    .line 151
    .line 152
    .line 153
    :cond_9
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    .line 154
    return v1
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
.end method

.method public final f(I)I
    .locals 2

    .line 1
    .line 2
    .line 3
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    .line 4
    const/4 v0, 0x0

    .line 5
    .line 6
    .line 7
    :goto_0
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->b()I

    .line 8
    move-result v1

    .line 9
    .line 10
    if-lt p1, v1, :cond_0

    .line 11
    .line 12
    and-int/lit8 v1, p1, 0x1

    .line 13
    or-int/2addr v0, v1

    .line 14
    .line 15
    shr-int/lit8 p1, p1, 0x1

    .line 16
    goto :goto_0

    .line 17
    :cond_0
    add-int/2addr p1, v0

    .line 18
    return p1
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

.method public final g([BIII)V
    .locals 7

    .line 1
    .line 2
    :goto_0
    add-int/lit8 p3, p3, -0x1

    .line 3
    .line 4
    if-ge p2, p3, :cond_1

    .line 5
    .line 6
    mul-int v0, p2, p4

    .line 7
    .line 8
    mul-int v1, p3, p4

    .line 9
    const/4 v2, 0x0

    .line 10
    .line 11
    :goto_1
    if-ge v2, p4, :cond_0

    .line 12
    .line 13
    add-int v3, v0, v2

    .line 14
    .line 15
    aget-byte v4, p1, v3

    .line 16
    .line 17
    add-int v5, v1, v2

    .line 18
    .line 19
    aget-byte v6, p1, v5

    .line 20
    .line 21
    aput-byte v6, p1, v3

    .line 22
    .line 23
    aput-byte v4, p1, v5

    .line 24
    .line 25
    add-int/lit8 v2, v2, 0x1

    .line 26
    goto :goto_1

    .line 27
    .line 28
    :cond_0
    add-int/lit8 p2, p2, 0x1

    .line 29
    goto :goto_0

    .line 30
    :cond_1
    return-void
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
    .line 238
    .line 239
    .line 240
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
.end method

.method public final sort([BIIILbi0/a;)V
    .locals 9
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p5    # Lbi0/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 2
    array-length v0, p1

    div-int/2addr v0, p4

    invoke-virtual {p0, v0, p2, p3}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->b(III)V

    sub-int v0, p3, p2

    const/4 v1, 0x2

    if-ge v0, v1, :cond_0

    goto/16 :goto_2

    .line 3
    :cond_0
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->b()I

    move-result v1

    if-ge v0, v1, :cond_1

    .line 4
    invoke-virtual/range {p0 .. p5}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->c([BIIILbi0/a;)I

    move-result v0

    move-object v3, p1

    move v5, p3

    move v7, p4

    move-object v8, p5

    add-int v6, p2, v0

    move-object v2, p0

    move v4, p2

    .line 5
    invoke-virtual/range {v2 .. v8}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->a([BIIIILbi0/a;)V

    return-void

    :cond_1
    move-object v2, p0

    move-object v3, p1

    move v5, p3

    move v7, p4

    move-object v8, p5

    .line 6
    new-instance p1, Lshark/internal/aosp/ByteArrayTimSort;

    const/4 p3, 0x0

    invoke-direct {p1, v3, v8, v7, p3}, Lshark/internal/aosp/ByteArrayTimSort;-><init>([BLbi0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    .line 7
    invoke-virtual {p0, v0}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->f(I)I

    move-result p3

    move v4, p2

    :goto_0
    move v6, v7

    move-object v7, v8

    .line 8
    invoke-virtual/range {v2 .. v7}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->c([BIIILbi0/a;)I

    move-result p2

    move p4, v5

    move-object v8, v7

    move v7, v6

    if-ge p2, p3, :cond_3

    if-gt v0, p3, :cond_2

    move p5, v0

    goto :goto_1

    :cond_2
    move p5, p3

    :goto_1
    add-int v5, v4, p5

    add-int v6, v4, p2

    move-object v2, p0

    .line 9
    invoke-virtual/range {v2 .. v8}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->a([BIIIILbi0/a;)V

    move p2, p5

    .line 10
    :cond_3
    invoke-static {p1, v4, p2}, Lshark/internal/aosp/ByteArrayTimSort;->f(Lshark/internal/aosp/ByteArrayTimSort;II)V

    .line 11
    invoke-static {p1}, Lshark/internal/aosp/ByteArrayTimSort;->d(Lshark/internal/aosp/ByteArrayTimSort;)V

    add-int p5, v4, p2

    sub-int/2addr v0, p2

    if-nez v0, :cond_5

    .line 12
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    .line 13
    invoke-static {p1}, Lshark/internal/aosp/ByteArrayTimSort;->e(Lshark/internal/aosp/ByteArrayTimSort;)V

    .line 14
    invoke-static {}, Lshark/internal/aosp/ByteArrayTimSort;->a()Z

    move-result p2

    if-eqz p2, :cond_4

    invoke-static {p1}, Lshark/internal/aosp/ByteArrayTimSort;->c(Lshark/internal/aosp/ByteArrayTimSort;)I

    :cond_4
    :goto_2
    return-void

    :cond_5
    move-object v2, p0

    move v5, p4

    move v4, p5

    goto :goto_0
.end method

.method public final sort([BILbi0/a;)V
    .locals 7
    .param p1    # [B
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param
    .param p3    # Lbi0/a;
        .annotation build Lorg/jetbrains/annotations/NotNull;
        .end annotation
    .end param

    .line 1
    array-length v0, p1

    div-int v4, v0, p2

    const/4 v3, 0x0

    move-object v1, p0

    move-object v2, p1

    move v5, p2

    move-object v6, p3

    invoke-virtual/range {v1 .. v6}, Lshark/internal/aosp/ByteArrayTimSort$Companion;->sort([BIIILbi0/a;)V

    return-void
.end method
