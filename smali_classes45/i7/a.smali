.class public final Li7/a;
.super Ljava/lang/Object;
.source "ByteSourceJsonBootstrapper.java"


# instance fields
.field public final a:Lcom/fasterxml/jackson/core/io/d;

.field public final b:Ljava/io/InputStream;

.field public final c:[B

.field public d:I

.field public e:I

.field public final f:Z

.field public g:Z

.field public h:I


# direct methods
.method public constructor <init>(Lcom/fasterxml/jackson/core/io/d;Ljava/io/InputStream;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 2
    iput-boolean v0, p0, Li7/a;->g:Z

    .line 3
    iput-object p1, p0, Li7/a;->a:Lcom/fasterxml/jackson/core/io/d;

    .line 4
    iput-object p2, p0, Li7/a;->b:Ljava/io/InputStream;

    .line 5
    invoke-virtual {p1}, Lcom/fasterxml/jackson/core/io/d;->g()[B

    move-result-object p1

    iput-object p1, p0, Li7/a;->c:[B

    const/4 p1, 0x0

    .line 6
    iput p1, p0, Li7/a;->d:I

    iput p1, p0, Li7/a;->e:I

    .line 7
    iput-boolean v0, p0, Li7/a;->f:Z

    return-void
.end method

.method public constructor <init>(Lcom/fasterxml/jackson/core/io/d;[BII)V
    .locals 1

    .line 8
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 9
    iput-boolean v0, p0, Li7/a;->g:Z

    .line 10
    iput-object p1, p0, Li7/a;->a:Lcom/fasterxml/jackson/core/io/d;

    const/4 p1, 0x0

    .line 11
    iput-object p1, p0, Li7/a;->b:Ljava/io/InputStream;

    .line 12
    iput-object p2, p0, Li7/a;->c:[B

    .line 13
    iput p3, p0, Li7/a;->d:I

    add-int/2addr p3, p4

    .line 14
    iput p3, p0, Li7/a;->e:I

    const/4 p1, 0x0

    .line 15
    iput-boolean p1, p0, Li7/a;->f:Z

    return-void
.end method

.method public static h(Lh7/a;)Lcom/fasterxml/jackson/core/format/MatchStrength;
    .locals 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lh7/a;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    .line 8
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 9
    return-object p0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {p0}, Lh7/a;->nextByte()B

    .line 13
    move-result v0

    .line 14
    .line 15
    const/16 v1, -0x11

    .line 16
    .line 17
    if-ne v0, v1, :cond_6

    .line 18
    .line 19
    .line 20
    invoke-interface {p0}, Lh7/a;->a()Z

    .line 21
    move-result v0

    .line 22
    .line 23
    if-nez v0, :cond_1

    .line 24
    .line 25
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 26
    return-object p0

    .line 27
    .line 28
    .line 29
    :cond_1
    invoke-interface {p0}, Lh7/a;->nextByte()B

    .line 30
    move-result v0

    .line 31
    .line 32
    const/16 v1, -0x45

    .line 33
    .line 34
    if-eq v0, v1, :cond_2

    .line 35
    .line 36
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->NO_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 37
    return-object p0

    .line 38
    .line 39
    .line 40
    :cond_2
    invoke-interface {p0}, Lh7/a;->a()Z

    .line 41
    move-result v0

    .line 42
    .line 43
    if-nez v0, :cond_3

    .line 44
    .line 45
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 46
    return-object p0

    .line 47
    .line 48
    .line 49
    :cond_3
    invoke-interface {p0}, Lh7/a;->nextByte()B

    .line 50
    move-result v0

    .line 51
    .line 52
    const/16 v1, -0x41

    .line 53
    .line 54
    if-eq v0, v1, :cond_4

    .line 55
    .line 56
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->NO_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 57
    return-object p0

    .line 58
    .line 59
    .line 60
    :cond_4
    invoke-interface {p0}, Lh7/a;->a()Z

    .line 61
    move-result v0

    .line 62
    .line 63
    if-nez v0, :cond_5

    .line 64
    .line 65
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 66
    return-object p0

    .line 67
    .line 68
    .line 69
    :cond_5
    invoke-interface {p0}, Lh7/a;->nextByte()B

    .line 70
    move-result v0

    .line 71
    .line 72
    .line 73
    :cond_6
    invoke-static {p0, v0}, Li7/a;->k(Lh7/a;B)I

    .line 74
    move-result v0

    .line 75
    .line 76
    if-gez v0, :cond_7

    .line 77
    .line 78
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 79
    return-object p0

    .line 80
    .line 81
    :cond_7
    const/16 v1, 0x7b

    .line 82
    .line 83
    const/16 v2, 0x22

    .line 84
    .line 85
    if-ne v0, v1, :cond_b

    .line 86
    .line 87
    .line 88
    invoke-static {p0}, Li7/a;->j(Lh7/a;)I

    .line 89
    move-result p0

    .line 90
    .line 91
    if-gez p0, :cond_8

    .line 92
    .line 93
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 94
    return-object p0

    .line 95
    .line 96
    :cond_8
    if-eq p0, v2, :cond_a

    .line 97
    .line 98
    const/16 v0, 0x7d

    .line 99
    .line 100
    if-ne p0, v0, :cond_9

    .line 101
    goto :goto_0

    .line 102
    .line 103
    :cond_9
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->NO_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 104
    return-object p0

    .line 105
    .line 106
    :cond_a
    :goto_0
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->SOLID_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 107
    return-object p0

    .line 108
    .line 109
    :cond_b
    const/16 v1, 0x5b

    .line 110
    .line 111
    if-ne v0, v1, :cond_f

    .line 112
    .line 113
    .line 114
    invoke-static {p0}, Li7/a;->j(Lh7/a;)I

    .line 115
    move-result p0

    .line 116
    .line 117
    if-gez p0, :cond_c

    .line 118
    .line 119
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 120
    return-object p0

    .line 121
    .line 122
    :cond_c
    const/16 v0, 0x5d

    .line 123
    .line 124
    if-eq p0, v0, :cond_e

    .line 125
    .line 126
    if-ne p0, v1, :cond_d

    .line 127
    goto :goto_1

    .line 128
    .line 129
    :cond_d
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->SOLID_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 130
    return-object p0

    .line 131
    .line 132
    :cond_e
    :goto_1
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->SOLID_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 133
    return-object p0

    .line 134
    .line 135
    :cond_f
    sget-object v1, Lcom/fasterxml/jackson/core/format/MatchStrength;->WEAK_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 136
    .line 137
    if-ne v0, v2, :cond_10

    .line 138
    goto :goto_2

    .line 139
    .line 140
    :cond_10
    const/16 v2, 0x30

    .line 141
    .line 142
    const/16 v3, 0x39

    .line 143
    .line 144
    if-gt v0, v3, :cond_11

    .line 145
    .line 146
    if-lt v0, v2, :cond_11

    .line 147
    goto :goto_2

    .line 148
    .line 149
    :cond_11
    const/16 v4, 0x2d

    .line 150
    .line 151
    if-ne v0, v4, :cond_14

    .line 152
    .line 153
    .line 154
    invoke-static {p0}, Li7/a;->j(Lh7/a;)I

    .line 155
    move-result p0

    .line 156
    .line 157
    if-gez p0, :cond_12

    .line 158
    .line 159
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 160
    return-object p0

    .line 161
    .line 162
    :cond_12
    if-gt p0, v3, :cond_13

    .line 163
    .line 164
    if-lt p0, v2, :cond_13

    .line 165
    :goto_2
    return-object v1

    .line 166
    .line 167
    :cond_13
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->NO_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 168
    return-object p0

    .line 169
    .line 170
    :cond_14
    const/16 v2, 0x6e

    .line 171
    .line 172
    if-ne v0, v2, :cond_15

    .line 173
    .line 174
    .line 175
    const-string/jumbo v0, "ull"

    .line 176
    .line 177
    .line 178
    invoke-static {p0, v0, v1}, Li7/a;->m(Lh7/a;Ljava/lang/String;Lcom/fasterxml/jackson/core/format/MatchStrength;)Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 179
    move-result-object p0

    .line 180
    return-object p0

    .line 181
    .line 182
    :cond_15
    const/16 v2, 0x74

    .line 183
    .line 184
    if-ne v0, v2, :cond_16

    .line 185
    .line 186
    .line 187
    const-string/jumbo v0, "rue"

    .line 188
    .line 189
    .line 190
    invoke-static {p0, v0, v1}, Li7/a;->m(Lh7/a;Ljava/lang/String;Lcom/fasterxml/jackson/core/format/MatchStrength;)Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 191
    move-result-object p0

    .line 192
    return-object p0

    .line 193
    .line 194
    :cond_16
    const/16 v2, 0x66

    .line 195
    .line 196
    if-ne v0, v2, :cond_17

    .line 197
    .line 198
    const-string v0, "alse"

    .line 199
    .line 200
    .line 201
    invoke-static {p0, v0, v1}, Li7/a;->m(Lh7/a;Ljava/lang/String;Lcom/fasterxml/jackson/core/format/MatchStrength;)Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 202
    move-result-object p0

    .line 203
    return-object p0

    .line 204
    .line 205
    :cond_17
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->NO_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 206
    return-object p0
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
.end method

.method public static j(Lh7/a;)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Lh7/a;->a()Z

    .line 4
    move-result v0

    .line 5
    .line 6
    if-nez v0, :cond_0

    .line 7
    const/4 p0, -0x1

    .line 8
    return p0

    .line 9
    .line 10
    .line 11
    :cond_0
    invoke-interface {p0}, Lh7/a;->nextByte()B

    .line 12
    move-result v0

    .line 13
    .line 14
    .line 15
    invoke-static {p0, v0}, Li7/a;->k(Lh7/a;B)I

    .line 16
    move-result p0

    .line 17
    return p0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
.end method

.method public static k(Lh7/a;B)I
    .locals 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    :goto_0
    and-int/lit16 p1, p1, 0xff

    .line 3
    .line 4
    const/16 v0, 0x20

    .line 5
    .line 6
    if-eq p1, v0, :cond_0

    .line 7
    .line 8
    const/16 v0, 0xd

    .line 9
    .line 10
    if-eq p1, v0, :cond_0

    .line 11
    .line 12
    const/16 v0, 0xa

    .line 13
    .line 14
    if-eq p1, v0, :cond_0

    .line 15
    .line 16
    const/16 v0, 0x9

    .line 17
    .line 18
    if-eq p1, v0, :cond_0

    .line 19
    return p1

    .line 20
    .line 21
    .line 22
    :cond_0
    invoke-interface {p0}, Lh7/a;->a()Z

    .line 23
    move-result p1

    .line 24
    .line 25
    if-nez p1, :cond_1

    .line 26
    const/4 p0, -0x1

    .line 27
    return p0

    .line 28
    .line 29
    .line 30
    :cond_1
    invoke-interface {p0}, Lh7/a;->nextByte()B

    .line 31
    move-result p1

    .line 32
    goto :goto_0
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

.method public static l(Ljava/io/DataInput;)I
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 4
    move-result v0

    .line 5
    .line 6
    const/16 v1, 0xef

    .line 7
    .line 8
    if-eq v0, v1, :cond_0

    .line 9
    return v0

    .line 10
    .line 11
    .line 12
    :cond_0
    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 13
    move-result v0

    .line 14
    .line 15
    const/16 v1, 0xbb

    .line 16
    .line 17
    const-string v2, "Unexpected byte 0x"

    .line 18
    .line 19
    if-ne v0, v1, :cond_2

    .line 20
    .line 21
    .line 22
    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 23
    move-result v0

    .line 24
    .line 25
    const/16 v1, 0xbf

    .line 26
    .line 27
    if-ne v0, v1, :cond_1

    .line 28
    .line 29
    .line 30
    invoke-interface {p0}, Ljava/io/DataInput;->readUnsignedByte()I

    .line 31
    move-result p0

    .line 32
    return p0

    .line 33
    .line 34
    :cond_1
    new-instance p0, Ljava/io/IOException;

    .line 35
    .line 36
    new-instance v1, Ljava/lang/StringBuilder;

    .line 37
    .line 38
    .line 39
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 40
    .line 41
    .line 42
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 46
    move-result-object v0

    .line 47
    .line 48
    .line 49
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 50
    .line 51
    const-string v0, " following 0xEF 0xBB; should get 0xBF as part of UTF-8 BOM"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    .line 60
    .line 61
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 62
    throw p0

    .line 63
    .line 64
    :cond_2
    new-instance p0, Ljava/io/IOException;

    .line 65
    .line 66
    new-instance v1, Ljava/lang/StringBuilder;

    .line 67
    .line 68
    .line 69
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 70
    .line 71
    .line 72
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 73
    .line 74
    .line 75
    invoke-static {v0}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    .line 76
    move-result-object v0

    .line 77
    .line 78
    .line 79
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 80
    .line 81
    const-string v0, " following 0xEF; should get 0xBB as part of UTF-8 BOM"

    .line 82
    .line 83
    .line 84
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    move-result-object v0

    .line 89
    .line 90
    .line 91
    invoke-direct {p0, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 92
    throw p0
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
.end method

.method public static m(Lh7/a;Ljava/lang/String;Lcom/fasterxml/jackson/core/format/MatchStrength;)Lcom/fasterxml/jackson/core/format/MatchStrength;
    .locals 4
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    .line 3
    invoke-virtual {p1}, Ljava/lang/String;->length()I

    .line 4
    move-result v0

    .line 5
    const/4 v1, 0x0

    .line 6
    .line 7
    :goto_0
    if-ge v1, v0, :cond_2

    .line 8
    .line 9
    .line 10
    invoke-interface {p0}, Lh7/a;->a()Z

    .line 11
    move-result v2

    .line 12
    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->INCONCLUSIVE:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 16
    return-object p0

    .line 17
    .line 18
    .line 19
    :cond_0
    invoke-interface {p0}, Lh7/a;->nextByte()B

    .line 20
    move-result v2

    .line 21
    .line 22
    .line 23
    invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C

    .line 24
    move-result v3

    .line 25
    .line 26
    if-eq v2, v3, :cond_1

    .line 27
    .line 28
    sget-object p0, Lcom/fasterxml/jackson/core/format/MatchStrength;->NO_MATCH:Lcom/fasterxml/jackson/core/format/MatchStrength;

    .line 29
    return-object p0

    .line 30
    .line 31
    :cond_1
    add-int/lit8 v1, v1, 0x1

    .line 32
    goto :goto_0

    .line 33
    :cond_2
    return-object p2
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


# virtual methods
.method public final a(I)Z
    .locals 2

    .line 1
    .line 2
    .line 3
    const v0, 0xff00

    .line 4
    and-int/2addr v0, p1

    .line 5
    const/4 v1, 0x1

    .line 6
    .line 7
    if-nez v0, :cond_0

    .line 8
    .line 9
    iput-boolean v1, p0, Li7/a;->g:Z

    .line 10
    goto :goto_0

    .line 11
    .line 12
    :cond_0
    and-int/lit16 p1, p1, 0xff

    .line 13
    const/4 v0, 0x0

    .line 14
    .line 15
    if-nez p1, :cond_1

    .line 16
    .line 17
    iput-boolean v0, p0, Li7/a;->g:Z

    .line 18
    :goto_0
    const/4 p1, 0x2

    .line 19
    .line 20
    iput p1, p0, Li7/a;->h:I

    .line 21
    return v1

    .line 22
    :cond_1
    return v0
    .line 23
.end method

.method public final b(I)Z
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    shr-int/lit8 v0, p1, 0x8

    .line 3
    const/4 v1, 0x1

    .line 4
    .line 5
    if-nez v0, :cond_0

    .line 6
    .line 7
    iput-boolean v1, p0, Li7/a;->g:Z

    .line 8
    goto :goto_0

    .line 9
    .line 10
    .line 11
    :cond_0
    const v0, 0xffffff

    .line 12
    and-int/2addr v0, p1

    .line 13
    const/4 v2, 0x0

    .line 14
    .line 15
    if-nez v0, :cond_1

    .line 16
    .line 17
    iput-boolean v2, p0, Li7/a;->g:Z

    .line 18
    goto :goto_0

    .line 19
    .line 20
    .line 21
    :cond_1
    const v0, -0xff0001

    .line 22
    and-int/2addr v0, p1

    .line 23
    .line 24
    if-nez v0, :cond_2

    .line 25
    .line 26
    const-string p1, "3412"

    .line 27
    .line 28
    .line 29
    invoke-virtual {p0, p1}, Li7/a;->i(Ljava/lang/String;)V

    .line 30
    goto :goto_0

    .line 31
    .line 32
    .line 33
    :cond_2
    const v0, -0xff01

    .line 34
    and-int/2addr p1, v0

    .line 35
    .line 36
    if-nez p1, :cond_3

    .line 37
    .line 38
    const-string p1, "2143"

    .line 39
    .line 40
    .line 41
    invoke-virtual {p0, p1}, Li7/a;->i(Ljava/lang/String;)V

    .line 42
    :goto_0
    const/4 p1, 0x4

    .line 43
    .line 44
    iput p1, p0, Li7/a;->h:I

    .line 45
    return v1

    .line 46
    :cond_3
    return v2
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

.method public c(ILcom/fasterxml/jackson/core/g;Lk7/a;Lk7/b;I)Lcom/fasterxml/jackson/core/JsonParser;
    .locals 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    move-object/from16 v0, p0

    .line 3
    .line 4
    move/from16 v1, p5

    .line 5
    .line 6
    iget v2, v0, Li7/a;->d:I

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Li7/a;->e()Lcom/fasterxml/jackson/core/JsonEncoding;

    .line 10
    move-result-object v3

    .line 11
    .line 12
    iget v4, v0, Li7/a;->d:I

    .line 13
    .line 14
    sub-int v14, v4, v2

    .line 15
    .line 16
    sget-object v2, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF8:Lcom/fasterxml/jackson/core/JsonEncoding;

    .line 17
    .line 18
    if-ne v3, v2, :cond_0

    .line 19
    .line 20
    sget-object v2, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->CANONICALIZE_FIELD_NAMES:Lcom/fasterxml/jackson/core/JsonFactory$Feature;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v1}, Lcom/fasterxml/jackson/core/JsonFactory$Feature;->enabledIn(I)Z

    .line 24
    move-result v2

    .line 25
    .line 26
    if-eqz v2, :cond_0

    .line 27
    .line 28
    move-object/from16 v2, p3

    .line 29
    .line 30
    .line 31
    invoke-virtual {v2, v1}, Lk7/a;->A(I)Lk7/a;

    .line 32
    move-result-object v10

    .line 33
    .line 34
    new-instance v5, Li7/j;

    .line 35
    .line 36
    iget-object v6, v0, Li7/a;->a:Lcom/fasterxml/jackson/core/io/d;

    .line 37
    .line 38
    iget-object v8, v0, Li7/a;->b:Ljava/io/InputStream;

    .line 39
    .line 40
    iget-object v11, v0, Li7/a;->c:[B

    .line 41
    .line 42
    iget v12, v0, Li7/a;->d:I

    .line 43
    .line 44
    iget v13, v0, Li7/a;->e:I

    .line 45
    .line 46
    iget-boolean v15, v0, Li7/a;->f:Z

    .line 47
    .line 48
    move/from16 v7, p1

    .line 49
    .line 50
    move-object/from16 v9, p2

    .line 51
    .line 52
    .line 53
    invoke-direct/range {v5 .. v15}, Li7/j;-><init>(Lcom/fasterxml/jackson/core/io/d;ILjava/io/InputStream;Lcom/fasterxml/jackson/core/g;Lk7/a;[BIIIZ)V

    .line 54
    return-object v5

    .line 55
    .line 56
    :cond_0
    new-instance v6, Li7/g;

    .line 57
    .line 58
    iget-object v7, v0, Li7/a;->a:Lcom/fasterxml/jackson/core/io/d;

    .line 59
    .line 60
    .line 61
    invoke-virtual {v0}, Li7/a;->d()Ljava/io/Reader;

    .line 62
    move-result-object v9

    .line 63
    .line 64
    .line 65
    invoke-virtual/range {p4 .. p5}, Lk7/b;->n(I)Lk7/b;

    .line 66
    move-result-object v11

    .line 67
    .line 68
    move/from16 v8, p1

    .line 69
    .line 70
    move-object/from16 v10, p2

    .line 71
    .line 72
    .line 73
    invoke-direct/range {v6 .. v11}, Li7/g;-><init>(Lcom/fasterxml/jackson/core/io/d;ILjava/io/Reader;Lcom/fasterxml/jackson/core/g;Lk7/b;)V

    .line 74
    return-object v6
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
.end method

.method public d()Ljava/io/Reader;
    .locals 9
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget-object v0, p0, Li7/a;->a:Lcom/fasterxml/jackson/core/io/d;

    .line 3
    .line 4
    .line 5
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/io/d;->m()Lcom/fasterxml/jackson/core/JsonEncoding;

    .line 6
    move-result-object v0

    .line 7
    .line 8
    .line 9
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonEncoding;->bits()I

    .line 10
    move-result v1

    .line 11
    .line 12
    const/16 v2, 0x8

    .line 13
    .line 14
    if-eq v1, v2, :cond_1

    .line 15
    .line 16
    const/16 v2, 0x10

    .line 17
    .line 18
    if-eq v1, v2, :cond_1

    .line 19
    .line 20
    const/16 v0, 0x20

    .line 21
    .line 22
    if-ne v1, v0, :cond_0

    .line 23
    .line 24
    new-instance v2, Lcom/fasterxml/jackson/core/io/j;

    .line 25
    .line 26
    iget-object v3, p0, Li7/a;->a:Lcom/fasterxml/jackson/core/io/d;

    .line 27
    .line 28
    iget-object v4, p0, Li7/a;->b:Ljava/io/InputStream;

    .line 29
    .line 30
    iget-object v5, p0, Li7/a;->c:[B

    .line 31
    .line 32
    iget v6, p0, Li7/a;->d:I

    .line 33
    .line 34
    iget v7, p0, Li7/a;->e:I

    .line 35
    .line 36
    .line 37
    invoke-virtual {v3}, Lcom/fasterxml/jackson/core/io/d;->m()Lcom/fasterxml/jackson/core/JsonEncoding;

    .line 38
    move-result-object v0

    .line 39
    .line 40
    .line 41
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonEncoding;->isBigEndian()Z

    .line 42
    move-result v8

    .line 43
    .line 44
    .line 45
    invoke-direct/range {v2 .. v8}, Lcom/fasterxml/jackson/core/io/j;-><init>(Lcom/fasterxml/jackson/core/io/d;Ljava/io/InputStream;[BIIZ)V

    .line 46
    return-object v2

    .line 47
    .line 48
    :cond_0
    new-instance v0, Ljava/lang/RuntimeException;

    .line 49
    .line 50
    const-string v1, "Internal error"

    .line 51
    .line 52
    .line 53
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 54
    throw v0

    .line 55
    .line 56
    :cond_1
    iget-object v4, p0, Li7/a;->b:Ljava/io/InputStream;

    .line 57
    .line 58
    if-nez v4, :cond_2

    .line 59
    .line 60
    new-instance v4, Ljava/io/ByteArrayInputStream;

    .line 61
    .line 62
    iget-object v1, p0, Li7/a;->c:[B

    .line 63
    .line 64
    iget v2, p0, Li7/a;->d:I

    .line 65
    .line 66
    iget v3, p0, Li7/a;->e:I

    .line 67
    .line 68
    .line 69
    invoke-direct {v4, v1, v2, v3}, Ljava/io/ByteArrayInputStream;-><init>([BII)V

    .line 70
    goto :goto_0

    .line 71
    .line 72
    :cond_2
    iget v1, p0, Li7/a;->d:I

    .line 73
    .line 74
    iget v2, p0, Li7/a;->e:I

    .line 75
    .line 76
    if-ge v1, v2, :cond_3

    .line 77
    .line 78
    new-instance v2, Lcom/fasterxml/jackson/core/io/f;

    .line 79
    .line 80
    iget-object v3, p0, Li7/a;->a:Lcom/fasterxml/jackson/core/io/d;

    .line 81
    .line 82
    iget-object v5, p0, Li7/a;->c:[B

    .line 83
    .line 84
    iget v6, p0, Li7/a;->d:I

    .line 85
    .line 86
    iget v7, p0, Li7/a;->e:I

    .line 87
    .line 88
    .line 89
    invoke-direct/range {v2 .. v7}, Lcom/fasterxml/jackson/core/io/f;-><init>(Lcom/fasterxml/jackson/core/io/d;Ljava/io/InputStream;[BII)V

    .line 90
    move-object v4, v2

    .line 91
    .line 92
    :cond_3
    :goto_0
    new-instance v1, Ljava/io/InputStreamReader;

    .line 93
    .line 94
    .line 95
    invoke-virtual {v0}, Lcom/fasterxml/jackson/core/JsonEncoding;->getJavaName()Ljava/lang/String;

    .line 96
    move-result-object v0

    .line 97
    .line 98
    .line 99
    invoke-direct {v1, v4, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V

    .line 100
    return-object v1
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
.end method

.method public e()Lcom/fasterxml/jackson/core/JsonEncoding;
    .locals 7
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    const/4 v0, 0x4

    .line 2
    .line 3
    .line 4
    invoke-virtual {p0, v0}, Li7/a;->f(I)Z

    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x2

    .line 7
    const/4 v3, 0x1

    .line 8
    .line 9
    if-eqz v1, :cond_2

    .line 10
    .line 11
    iget-object v1, p0, Li7/a;->c:[B

    .line 12
    .line 13
    iget v4, p0, Li7/a;->d:I

    .line 14
    .line 15
    aget-byte v5, v1, v4

    .line 16
    .line 17
    shl-int/lit8 v5, v5, 0x18

    .line 18
    .line 19
    add-int/lit8 v6, v4, 0x1

    .line 20
    .line 21
    aget-byte v6, v1, v6

    .line 22
    .line 23
    and-int/lit16 v6, v6, 0xff

    .line 24
    .line 25
    shl-int/lit8 v6, v6, 0x10

    .line 26
    or-int/2addr v5, v6

    .line 27
    .line 28
    add-int/lit8 v6, v4, 0x2

    .line 29
    .line 30
    aget-byte v6, v1, v6

    .line 31
    .line 32
    and-int/lit16 v6, v6, 0xff

    .line 33
    .line 34
    shl-int/lit8 v6, v6, 0x8

    .line 35
    or-int/2addr v5, v6

    .line 36
    .line 37
    add-int/lit8 v4, v4, 0x3

    .line 38
    .line 39
    aget-byte v1, v1, v4

    .line 40
    .line 41
    and-int/lit16 v1, v1, 0xff

    .line 42
    or-int/2addr v1, v5

    .line 43
    .line 44
    .line 45
    invoke-virtual {p0, v1}, Li7/a;->g(I)Z

    .line 46
    move-result v4

    .line 47
    .line 48
    if-eqz v4, :cond_0

    .line 49
    goto :goto_0

    .line 50
    .line 51
    .line 52
    :cond_0
    invoke-virtual {p0, v1}, Li7/a;->b(I)Z

    .line 53
    move-result v4

    .line 54
    .line 55
    if-eqz v4, :cond_1

    .line 56
    goto :goto_0

    .line 57
    .line 58
    :cond_1
    ushr-int/lit8 v1, v1, 0x10

    .line 59
    .line 60
    .line 61
    invoke-virtual {p0, v1}, Li7/a;->a(I)Z

    .line 62
    move-result v1

    .line 63
    .line 64
    if-eqz v1, :cond_8

    .line 65
    goto :goto_0

    .line 66
    .line 67
    .line 68
    :cond_2
    invoke-virtual {p0, v2}, Li7/a;->f(I)Z

    .line 69
    move-result v1

    .line 70
    .line 71
    if-eqz v1, :cond_8

    .line 72
    .line 73
    iget-object v1, p0, Li7/a;->c:[B

    .line 74
    .line 75
    iget v4, p0, Li7/a;->d:I

    .line 76
    .line 77
    aget-byte v5, v1, v4

    .line 78
    .line 79
    and-int/lit16 v5, v5, 0xff

    .line 80
    .line 81
    shl-int/lit8 v5, v5, 0x8

    .line 82
    add-int/2addr v4, v3

    .line 83
    .line 84
    aget-byte v1, v1, v4

    .line 85
    .line 86
    and-int/lit16 v1, v1, 0xff

    .line 87
    or-int/2addr v1, v5

    .line 88
    .line 89
    .line 90
    invoke-virtual {p0, v1}, Li7/a;->a(I)Z

    .line 91
    move-result v1

    .line 92
    .line 93
    if-eqz v1, :cond_8

    .line 94
    .line 95
    :goto_0
    iget v1, p0, Li7/a;->h:I

    .line 96
    .line 97
    if-eq v1, v3, :cond_7

    .line 98
    .line 99
    if-eq v1, v2, :cond_5

    .line 100
    .line 101
    if-ne v1, v0, :cond_4

    .line 102
    .line 103
    iget-boolean v0, p0, Li7/a;->g:Z

    .line 104
    .line 105
    if-eqz v0, :cond_3

    .line 106
    .line 107
    sget-object v0, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF32_BE:Lcom/fasterxml/jackson/core/JsonEncoding;

    .line 108
    goto :goto_1

    .line 109
    .line 110
    :cond_3
    sget-object v0, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF32_LE:Lcom/fasterxml/jackson/core/JsonEncoding;

    .line 111
    goto :goto_1

    .line 112
    .line 113
    :cond_4
    new-instance v0, Ljava/lang/RuntimeException;

    .line 114
    .line 115
    const-string v1, "Internal error"

    .line 116
    .line 117
    .line 118
    invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V

    .line 119
    throw v0

    .line 120
    .line 121
    :cond_5
    iget-boolean v0, p0, Li7/a;->g:Z

    .line 122
    .line 123
    if-eqz v0, :cond_6

    .line 124
    .line 125
    sget-object v0, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF16_BE:Lcom/fasterxml/jackson/core/JsonEncoding;

    .line 126
    goto :goto_1

    .line 127
    .line 128
    :cond_6
    sget-object v0, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF16_LE:Lcom/fasterxml/jackson/core/JsonEncoding;

    .line 129
    goto :goto_1

    .line 130
    .line 131
    :cond_7
    sget-object v0, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF8:Lcom/fasterxml/jackson/core/JsonEncoding;

    .line 132
    goto :goto_1

    .line 133
    .line 134
    :cond_8
    sget-object v0, Lcom/fasterxml/jackson/core/JsonEncoding;->UTF8:Lcom/fasterxml/jackson/core/JsonEncoding;

    .line 135
    .line 136
    :goto_1
    iget-object v1, p0, Li7/a;->a:Lcom/fasterxml/jackson/core/io/d;

    .line 137
    .line 138
    .line 139
    invoke-virtual {v1, v0}, Lcom/fasterxml/jackson/core/io/d;->u(Lcom/fasterxml/jackson/core/JsonEncoding;)V

    .line 140
    return-object v0
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

.method public f(I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    iget v0, p0, Li7/a;->e:I

    .line 3
    .line 4
    iget v1, p0, Li7/a;->d:I

    .line 5
    sub-int/2addr v0, v1

    .line 6
    :goto_0
    const/4 v1, 0x1

    .line 7
    .line 8
    if-ge v0, p1, :cond_2

    .line 9
    .line 10
    iget-object v2, p0, Li7/a;->b:Ljava/io/InputStream;

    .line 11
    .line 12
    if-nez v2, :cond_0

    .line 13
    const/4 v2, -0x1

    .line 14
    goto :goto_1

    .line 15
    .line 16
    :cond_0
    iget-object v3, p0, Li7/a;->c:[B

    .line 17
    .line 18
    iget v4, p0, Li7/a;->e:I

    .line 19
    array-length v5, v3

    .line 20
    sub-int/2addr v5, v4

    .line 21
    .line 22
    .line 23
    invoke-virtual {v2, v3, v4, v5}, Ljava/io/InputStream;->read([BII)I

    .line 24
    move-result v2

    .line 25
    .line 26
    :goto_1
    if-ge v2, v1, :cond_1

    .line 27
    const/4 p1, 0x0

    .line 28
    return p1

    .line 29
    .line 30
    :cond_1
    iget v1, p0, Li7/a;->e:I

    .line 31
    add-int/2addr v1, v2

    .line 32
    .line 33
    iput v1, p0, Li7/a;->e:I

    .line 34
    add-int/2addr v0, v2

    .line 35
    goto :goto_0

    .line 36
    :cond_2
    return v1
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

.method public final g(I)Z
    .locals 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    const/high16 v0, -0x1010000

    .line 3
    .line 4
    .line 5
    const v1, 0xfffe

    .line 6
    .line 7
    .line 8
    const v2, 0xfeff

    .line 9
    const/4 v3, 0x0

    .line 10
    const/4 v4, 0x1

    .line 11
    .line 12
    if-eq p1, v0, :cond_3

    .line 13
    .line 14
    const/high16 v0, -0x20000

    .line 15
    const/4 v5, 0x4

    .line 16
    .line 17
    if-eq p1, v0, :cond_2

    .line 18
    .line 19
    if-eq p1, v2, :cond_1

    .line 20
    .line 21
    if-eq p1, v1, :cond_0

    .line 22
    goto :goto_0

    .line 23
    .line 24
    :cond_0
    const-string v0, "2143"

    .line 25
    .line 26
    .line 27
    invoke-virtual {p0, v0}, Li7/a;->i(Ljava/lang/String;)V

    .line 28
    goto :goto_0

    .line 29
    .line 30
    :cond_1
    iput-boolean v4, p0, Li7/a;->g:Z

    .line 31
    .line 32
    iget p1, p0, Li7/a;->d:I

    .line 33
    add-int/2addr p1, v5

    .line 34
    .line 35
    iput p1, p0, Li7/a;->d:I

    .line 36
    .line 37
    iput v5, p0, Li7/a;->h:I

    .line 38
    return v4

    .line 39
    .line 40
    :cond_2
    iget p1, p0, Li7/a;->d:I

    .line 41
    add-int/2addr p1, v5

    .line 42
    .line 43
    iput p1, p0, Li7/a;->d:I

    .line 44
    .line 45
    iput v5, p0, Li7/a;->h:I

    .line 46
    .line 47
    iput-boolean v3, p0, Li7/a;->g:Z

    .line 48
    return v4

    .line 49
    .line 50
    :cond_3
    const-string v0, "3412"

    .line 51
    .line 52
    .line 53
    invoke-virtual {p0, v0}, Li7/a;->i(Ljava/lang/String;)V

    .line 54
    .line 55
    :goto_0
    ushr-int/lit8 v0, p1, 0x10

    .line 56
    const/4 v5, 0x2

    .line 57
    .line 58
    if-ne v0, v2, :cond_4

    .line 59
    .line 60
    iget p1, p0, Li7/a;->d:I

    .line 61
    add-int/2addr p1, v5

    .line 62
    .line 63
    iput p1, p0, Li7/a;->d:I

    .line 64
    .line 65
    iput v5, p0, Li7/a;->h:I

    .line 66
    .line 67
    iput-boolean v4, p0, Li7/a;->g:Z

    .line 68
    return v4

    .line 69
    .line 70
    :cond_4
    if-ne v0, v1, :cond_5

    .line 71
    .line 72
    iget p1, p0, Li7/a;->d:I

    .line 73
    add-int/2addr p1, v5

    .line 74
    .line 75
    iput p1, p0, Li7/a;->d:I

    .line 76
    .line 77
    iput v5, p0, Li7/a;->h:I

    .line 78
    .line 79
    iput-boolean v3, p0, Li7/a;->g:Z

    .line 80
    return v4

    .line 81
    .line 82
    :cond_5
    ushr-int/lit8 p1, p1, 0x8

    .line 83
    .line 84
    .line 85
    const v0, 0xefbbbf

    .line 86
    .line 87
    if-ne p1, v0, :cond_6

    .line 88
    .line 89
    iget p1, p0, Li7/a;->d:I

    .line 90
    .line 91
    add-int/lit8 p1, p1, 0x3

    .line 92
    .line 93
    iput p1, p0, Li7/a;->d:I

    .line 94
    .line 95
    iput v4, p0, Li7/a;->h:I

    .line 96
    .line 97
    iput-boolean v4, p0, Li7/a;->g:Z

    .line 98
    return v4

    .line 99
    :cond_6
    return v3
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
.end method

.method public final i(Ljava/lang/String;)V
    .locals 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1
    .line 2
    new-instance v0, Ljava/io/CharConversionException;

    .line 3
    .line 4
    new-instance v1, Ljava/lang/StringBuilder;

    .line 5
    .line 6
    .line 7
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 8
    .line 9
    const-string v2, "Unsupported UCS-4 endianness ("

    .line 10
    .line 11
    .line 12
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    const-string p1, ") detected"

    .line 18
    .line 19
    .line 20
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    .line 23
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 24
    move-result-object p1

    .line 25
    .line 26
    .line 27
    invoke-direct {v0, p1}, Ljava/io/CharConversionException;-><init>(Ljava/lang/String;)V

    .line 28
    throw v0
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
