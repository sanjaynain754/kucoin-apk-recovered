.class public final Luf0/g;
.super Ljava/lang/Object;
.source "BigendianEncoding.java"


# static fields
.field public static final a:[C

.field public static final b:[B


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    .line 3
    invoke-static {}, Luf0/g;->b()[C

    .line 4
    move-result-object v0

    .line 5
    .line 6
    sput-object v0, Luf0/g;->a:[C

    .line 7
    .line 8
    .line 9
    invoke-static {}, Luf0/g;->a()[B

    .line 10
    move-result-object v0

    .line 11
    .line 12
    sput-object v0, Luf0/g;->b:[B

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

.method public static a()[B
    .locals 4

    .line 1
    .line 2
    const/16 v0, 0x80

    .line 3
    .line 4
    new-array v0, v0, [B

    .line 5
    const/4 v1, -0x1

    .line 6
    .line 7
    .line 8
    invoke-static {v0, v1}, Ljava/util/Arrays;->fill([BB)V

    .line 9
    const/4 v1, 0x0

    .line 10
    .line 11
    :goto_0
    const/16 v2, 0x10

    .line 12
    .line 13
    if-ge v1, v2, :cond_0

    .line 14
    .line 15
    const-string v2, "0123456789abcdef"

    .line 16
    .line 17
    .line 18
    invoke-virtual {v2, v1}, Ljava/lang/String;->charAt(I)C

    .line 19
    move-result v2

    .line 20
    int-to-byte v3, v1

    .line 21
    .line 22
    aput-byte v3, v0, v2

    .line 23
    .line 24
    add-int/lit8 v1, v1, 0x1

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    return-object v0
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

.method public static b()[C
    .locals 5

    .line 1
    .line 2
    const/16 v0, 0x200

    .line 3
    .line 4
    new-array v0, v0, [C

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    :goto_0
    const/16 v2, 0x100

    .line 8
    .line 9
    if-ge v1, v2, :cond_0

    .line 10
    .line 11
    ushr-int/lit8 v2, v1, 0x4

    .line 12
    .line 13
    const-string v3, "0123456789abcdef"

    .line 14
    .line 15
    .line 16
    invoke-virtual {v3, v2}, Ljava/lang/String;->charAt(I)C

    .line 17
    move-result v2

    .line 18
    .line 19
    aput-char v2, v0, v1

    .line 20
    .line 21
    or-int/lit16 v2, v1, 0x100

    .line 22
    .line 23
    and-int/lit8 v4, v1, 0xf

    .line 24
    .line 25
    .line 26
    invoke-virtual {v3, v4}, Ljava/lang/String;->charAt(I)C

    .line 27
    move-result v3

    .line 28
    .line 29
    aput-char v3, v0, v2

    .line 30
    .line 31
    add-int/lit8 v1, v1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_0
    return-object v0
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

.method public static c(B[CI)V
    .locals 2

    .line 1
    .line 2
    and-int/lit16 p0, p0, 0xff

    .line 3
    .line 4
    sget-object v0, Luf0/g;->a:[C

    .line 5
    .line 6
    aget-char v1, v0, p0

    .line 7
    .line 8
    aput-char v1, p1, p2

    .line 9
    .line 10
    add-int/lit8 p2, p2, 0x1

    .line 11
    .line 12
    or-int/lit16 p0, p0, 0x100

    .line 13
    .line 14
    aget-char p0, v0, p0

    .line 15
    .line 16
    aput-char p0, p1, p2

    .line 17
    return-void
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
.end method

.method public static d(J[CI)V
    .locals 4

    .line 1
    .line 2
    const/16 v0, 0x38

    .line 3
    .line 4
    shr-long v0, p0, v0

    .line 5
    .line 6
    const-wide/16 v2, 0xff

    .line 7
    and-long/2addr v0, v2

    .line 8
    long-to-int v0, v0

    .line 9
    int-to-byte v0, v0

    .line 10
    .line 11
    .line 12
    invoke-static {v0, p2, p3}, Luf0/g;->c(B[CI)V

    .line 13
    .line 14
    const/16 v0, 0x30

    .line 15
    .line 16
    shr-long v0, p0, v0

    .line 17
    and-long/2addr v0, v2

    .line 18
    long-to-int v0, v0

    .line 19
    int-to-byte v0, v0

    .line 20
    .line 21
    add-int/lit8 v1, p3, 0x2

    .line 22
    .line 23
    .line 24
    invoke-static {v0, p2, v1}, Luf0/g;->c(B[CI)V

    .line 25
    .line 26
    const/16 v0, 0x28

    .line 27
    .line 28
    shr-long v0, p0, v0

    .line 29
    and-long/2addr v0, v2

    .line 30
    long-to-int v0, v0

    .line 31
    int-to-byte v0, v0

    .line 32
    .line 33
    add-int/lit8 v1, p3, 0x4

    .line 34
    .line 35
    .line 36
    invoke-static {v0, p2, v1}, Luf0/g;->c(B[CI)V

    .line 37
    .line 38
    const/16 v0, 0x20

    .line 39
    .line 40
    shr-long v0, p0, v0

    .line 41
    and-long/2addr v0, v2

    .line 42
    long-to-int v0, v0

    .line 43
    int-to-byte v0, v0

    .line 44
    .line 45
    add-int/lit8 v1, p3, 0x6

    .line 46
    .line 47
    .line 48
    invoke-static {v0, p2, v1}, Luf0/g;->c(B[CI)V

    .line 49
    .line 50
    const/16 v0, 0x18

    .line 51
    .line 52
    shr-long v0, p0, v0

    .line 53
    and-long/2addr v0, v2

    .line 54
    long-to-int v0, v0

    .line 55
    int-to-byte v0, v0

    .line 56
    .line 57
    add-int/lit8 v1, p3, 0x8

    .line 58
    .line 59
    .line 60
    invoke-static {v0, p2, v1}, Luf0/g;->c(B[CI)V

    .line 61
    .line 62
    const/16 v0, 0x10

    .line 63
    .line 64
    shr-long v0, p0, v0

    .line 65
    and-long/2addr v0, v2

    .line 66
    long-to-int v0, v0

    .line 67
    int-to-byte v0, v0

    .line 68
    .line 69
    add-int/lit8 v1, p3, 0xa

    .line 70
    .line 71
    .line 72
    invoke-static {v0, p2, v1}, Luf0/g;->c(B[CI)V

    .line 73
    .line 74
    const/16 v0, 0x8

    .line 75
    .line 76
    shr-long v0, p0, v0

    .line 77
    and-long/2addr v0, v2

    .line 78
    long-to-int v0, v0

    .line 79
    int-to-byte v0, v0

    .line 80
    .line 81
    add-int/lit8 v1, p3, 0xc

    .line 82
    .line 83
    .line 84
    invoke-static {v0, p2, v1}, Luf0/g;->c(B[CI)V

    .line 85
    and-long/2addr p0, v2

    .line 86
    long-to-int p0, p0

    .line 87
    int-to-byte p0, p0

    .line 88
    .line 89
    add-int/lit8 p3, p3, 0xe

    .line 90
    .line 91
    .line 92
    invoke-static {p0, p2, p3}, Luf0/g;->c(B[CI)V

    .line 93
    return-void
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
.end method

.method public static e(J[BI)V
    .locals 5

    .line 1
    array-length v0, p2

    .line 2
    .line 3
    add-int/lit8 v1, p3, 0x8

    .line 4
    .line 5
    if-lt v0, v1, :cond_0

    .line 6
    const/4 v0, 0x1

    .line 7
    goto :goto_0

    .line 8
    :cond_0
    const/4 v0, 0x0

    .line 9
    .line 10
    :goto_0
    const-string v1, "array too small"

    .line 11
    .line 12
    .line 13
    invoke-static {v0, v1}, Ltf0/b;->a(ZLjava/lang/Object;)V

    .line 14
    .line 15
    add-int/lit8 v0, p3, 0x7

    .line 16
    .line 17
    const-wide/16 v1, 0xff

    .line 18
    .line 19
    and-long v3, p0, v1

    .line 20
    long-to-int v3, v3

    .line 21
    int-to-byte v3, v3

    .line 22
    .line 23
    aput-byte v3, p2, v0

    .line 24
    .line 25
    add-int/lit8 v0, p3, 0x6

    .line 26
    .line 27
    const/16 v3, 0x8

    .line 28
    .line 29
    shr-long v3, p0, v3

    .line 30
    and-long/2addr v3, v1

    .line 31
    long-to-int v3, v3

    .line 32
    int-to-byte v3, v3

    .line 33
    .line 34
    aput-byte v3, p2, v0

    .line 35
    .line 36
    add-int/lit8 v0, p3, 0x5

    .line 37
    .line 38
    const/16 v3, 0x10

    .line 39
    .line 40
    shr-long v3, p0, v3

    .line 41
    and-long/2addr v3, v1

    .line 42
    long-to-int v3, v3

    .line 43
    int-to-byte v3, v3

    .line 44
    .line 45
    aput-byte v3, p2, v0

    .line 46
    .line 47
    add-int/lit8 v0, p3, 0x4

    .line 48
    .line 49
    const/16 v3, 0x18

    .line 50
    .line 51
    shr-long v3, p0, v3

    .line 52
    and-long/2addr v3, v1

    .line 53
    long-to-int v3, v3

    .line 54
    int-to-byte v3, v3

    .line 55
    .line 56
    aput-byte v3, p2, v0

    .line 57
    .line 58
    add-int/lit8 v0, p3, 0x3

    .line 59
    .line 60
    const/16 v3, 0x20

    .line 61
    .line 62
    shr-long v3, p0, v3

    .line 63
    and-long/2addr v3, v1

    .line 64
    long-to-int v3, v3

    .line 65
    int-to-byte v3, v3

    .line 66
    .line 67
    aput-byte v3, p2, v0

    .line 68
    .line 69
    add-int/lit8 v0, p3, 0x2

    .line 70
    .line 71
    const/16 v3, 0x28

    .line 72
    .line 73
    shr-long v3, p0, v3

    .line 74
    and-long/2addr v3, v1

    .line 75
    long-to-int v3, v3

    .line 76
    int-to-byte v3, v3

    .line 77
    .line 78
    aput-byte v3, p2, v0

    .line 79
    .line 80
    add-int/lit8 v0, p3, 0x1

    .line 81
    .line 82
    const/16 v3, 0x30

    .line 83
    .line 84
    shr-long v3, p0, v3

    .line 85
    and-long/2addr v3, v1

    .line 86
    long-to-int v3, v3

    .line 87
    int-to-byte v3, v3

    .line 88
    .line 89
    aput-byte v3, p2, v0

    .line 90
    .line 91
    const/16 v0, 0x38

    .line 92
    shr-long/2addr p0, v0

    .line 93
    and-long/2addr p0, v1

    .line 94
    long-to-int p0, p0

    .line 95
    int-to-byte p0, p0

    .line 96
    .line 97
    aput-byte p0, p2, p3

    .line 98
    return-void
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
.end method
