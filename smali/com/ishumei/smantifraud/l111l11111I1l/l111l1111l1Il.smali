.class public final Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;
.super Ljava/lang/Object;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il$l1111l111111Il;
    }
.end annotation


# static fields
.field private static final l1111l111111Il:I = -0x1

.field private static final l111l11111lIl:Ljava/io/FileFilter;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    .line 2
    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il$1;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il$1;-><init>()V

    .line 6
    .line 7
    sput-object v0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l111l11111lIl:Ljava/io/FileFilter;

    .line 8
    return-void
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
.end method

.method public constructor <init>()V
    .locals 0

    .line 1
    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    return-void
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
    .line 19
    .line 20
    .line 21
    .line 22
.end method

.method private static l1111l111111Il(Ljava/lang/String;)I
    .locals 4

    .line 1
    const/4 v0, -0x1

    const/4 v1, 0x0

    :try_start_0
    new-instance v2, Ljava/io/FileInputStream;

    invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_1
    .catchall {:try_start_0 .. :try_end_0} :catchall_2

    :try_start_1
    new-instance p0, Ljava/io/BufferedReader;

    new-instance v3, Ljava/io/InputStreamReader;

    invoke-direct {v3, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {p0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_2
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :try_start_2
    invoke-virtual {p0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    const-string v3, "0-[\\d]+$"

    invoke-virtual {v1, v3}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_0

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    invoke-virtual {v1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v0
    :try_end_2
    .catch Ljava/io/IOException; {:try_start_2 .. :try_end_2} :catch_0
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    add-int/lit8 v0, v0, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    move-object v1, p0

    goto :goto_2

    :cond_1
    :goto_0
    invoke-static {p0}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il(Ljava/io/Closeable;)V

    :goto_1
    invoke-static {v2}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il(Ljava/io/Closeable;)V

    return v0

    :catch_0
    move-object v1, p0

    goto :goto_3

    :catchall_1
    move-exception v0

    goto :goto_2

    :catchall_2
    move-exception v0

    move-object v2, v1

    :goto_2
    invoke-static {v1}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il(Ljava/io/Closeable;)V

    invoke-static {v2}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il(Ljava/io/Closeable;)V

    throw v0

    :catch_1
    move-object v2, v1

    :catch_2
    :goto_3
    invoke-static {v1}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il(Ljava/io/Closeable;)V

    goto :goto_1
.end method

.method private static l1111l111111Il(Ljava/lang/String;Ljava/io/FileInputStream;)I
    .locals 10

    .line 2
    const/16 v0, 0x400

    new-array v1, v0, [B

    const/4 v2, -0x1

    :try_start_0
    invoke-virtual {p1, v1}, Ljava/io/FileInputStream;->read([B)I

    move-result p1

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, p1, :cond_7

    aget-byte v5, v1, v4

    const/16 v6, 0xa

    if-eq v5, v6, :cond_0

    if-nez v4, :cond_6

    :cond_0
    if-ne v5, v6, :cond_1

    add-int/lit8 v4, v4, 0x1

    :cond_1
    move v5, v4

    :goto_1
    if-ge v5, p1, :cond_6

    sub-int v7, v5, v4

    aget-byte v8, v1, v5

    invoke-virtual {p0, v7}, Ljava/lang/String;->charAt(I)C

    move-result v9

    if-ne v8, v9, :cond_6

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-ne v7, v8, :cond_5

    :goto_2
    if-ge v5, v0, :cond_4

    aget-byte p0, v1, v5

    if-eq p0, v6, :cond_4

    invoke-static {p0}, Ljava/lang/Character;->isDigit(I)Z

    move-result p0

    if-eqz p0, :cond_3

    add-int/lit8 p0, v5, 0x1

    :goto_3
    if-ge p0, v0, :cond_2

    aget-byte p1, v1, p0

    invoke-static {p1}, Ljava/lang/Character;->isDigit(I)Z

    move-result p1

    if-eqz p1, :cond_2

    add-int/lit8 p0, p0, 0x1

    goto :goto_3

    :cond_2
    new-instance p1, Ljava/lang/String;

    sub-int/2addr p0, v5

    invoke-direct {p1, v1, v3, v5, p0}, Ljava/lang/String;-><init>([BIII)V

    invoke-static {p1}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0
    :try_end_0
    .catch Ljava/io/IOException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/NumberFormatException; {:try_start_0 .. :try_end_0} :catch_0

    return p0

    :cond_3
    add-int/lit8 v5, v5, 0x1

    goto :goto_2

    :cond_4
    return v2

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_1

    :cond_6
    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :catch_0
    :cond_7
    return v2
.end method

.method private static l1111l111111Il([BI)I
    .locals 3

    .line 3
    :goto_0
    const/16 v0, 0x400

    if-ge p1, v0, :cond_2

    aget-byte v1, p0, p1

    const/16 v2, 0xa

    if-eq v1, v2, :cond_2

    invoke-static {v1}, Ljava/lang/Character;->isDigit(I)Z

    move-result v1

    if-eqz v1, :cond_1

    add-int/lit8 v1, p1, 0x1

    :goto_1
    if-ge v1, v0, :cond_0

    aget-byte v2, p0, v1

    invoke-static {v2}, Ljava/lang/Character;->isDigit(I)Z

    move-result v2

    if-eqz v2, :cond_0

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_0
    new-instance v0, Ljava/lang/String;

    const/4 v2, 0x0

    sub-int/2addr v1, p1

    invoke-direct {v0, p0, v2, p1, v1}, Ljava/lang/String;-><init>([BIII)V

    invoke-static {v0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    return p0

    :cond_1
    add-int/lit8 p1, p1, 0x1

    goto :goto_0

    :cond_2
    const/4 p0, -0x1

    return p0
.end method

.method public static l1111l111111Il()Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il$l1111l111111Il;
    .locals 5

    .line 4
    new-instance v0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il$l1111l111111Il;

    invoke-direct {v0}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il$l1111l111111Il;-><init>()V

    :try_start_0
    const-string v1, "/proc/cpuinfo"

    invoke-static {v1}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l111l11111lIl(Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    const-string v3, ":"

    invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;

    move-result-object v2

    array-length v3, v2

    const/4 v4, 0x2

    if-ne v4, v3, :cond_0

    const/4 v3, 0x0

    aget-object v3, v2, v3

    invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x1

    aget-object v2, v2, v4

    invoke-virtual {v2}, Ljava/lang/String;->trim()Ljava/lang/String;

    move-result-object v2

    const-string v4, "Hardware"

    invoke-virtual {v4, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    iput-object v2, v0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il$l1111l111111Il;->l111l11111lIl:Ljava/lang/String;

    :cond_1
    const-string v4, "Processor"

    invoke-static {v4, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_2

    const-string v4, "model name"

    invoke-static {v4, v3}, Landroid/text/TextUtils;->equals(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Z

    move-result v3

    if-eqz v3, :cond_0

    :cond_2
    iput-object v2, v0, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il$l1111l111111Il;->l1111l111111Il:Ljava/lang/String;
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_0

    :catch_0
    :cond_3
    return-object v0
.end method

.method public static l111l11111I1l()I
    .locals 11

    .line 1
    const/4 v0, -0x1

    .line 2
    .line 3
    .line 4
    :try_start_0
    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l111l11111lIl()I

    .line 5
    move-result v1

    .line 6
    const/4 v2, 0x0

    .line 7
    move v4, v0

    .line 8
    move v3, v2

    .line 9
    .line 10
    :goto_0
    if-ge v3, v1, :cond_3

    .line 11
    .line 12
    new-instance v5, Ljava/lang/StringBuilder;

    .line 13
    .line 14
    const-string v6, "/sys/devices/system/cpu/cpu"

    .line 15
    .line 16
    .line 17
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 18
    .line 19
    .line 20
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 21
    .line 22
    const-string v6, "/cpufreq/cpuinfo_max_freq"

    .line 23
    .line 24
    .line 25
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 26
    .line 27
    .line 28
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 29
    move-result-object v5

    .line 30
    .line 31
    new-instance v6, Ljava/io/File;

    .line 32
    .line 33
    .line 34
    invoke-direct {v6, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 35
    .line 36
    .line 37
    invoke-virtual {v6}, Ljava/io/File;->exists()Z

    .line 38
    move-result v5

    .line 39
    .line 40
    if-eqz v5, :cond_2

    .line 41
    .line 42
    const/16 v5, 0x80

    .line 43
    .line 44
    new-array v7, v5, [B

    .line 45
    .line 46
    new-instance v8, Ljava/io/FileInputStream;

    .line 47
    .line 48
    .line 49
    invoke-direct {v8, v6}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_1

    .line 50
    .line 51
    .line 52
    :try_start_1
    invoke-virtual {v8, v7}, Ljava/io/FileInputStream;->read([B)I

    .line 53
    move v6, v2

    .line 54
    .line 55
    :goto_1
    if-ge v6, v5, :cond_0

    .line 56
    .line 57
    aget-byte v9, v7, v6

    .line 58
    .line 59
    .line 60
    invoke-static {v9}, Ljava/lang/Character;->isDigit(I)Z

    .line 61
    move-result v9

    .line 62
    .line 63
    if-eqz v9, :cond_0

    .line 64
    .line 65
    add-int/lit8 v6, v6, 0x1

    .line 66
    goto :goto_1

    .line 67
    :catchall_0
    move-exception v1

    .line 68
    goto :goto_2

    .line 69
    .line 70
    :cond_0
    new-instance v5, Ljava/lang/String;

    .line 71
    .line 72
    .line 73
    invoke-direct {v5, v7, v2, v6}, Ljava/lang/String;-><init>([BII)V

    .line 74
    .line 75
    .line 76
    invoke-static {v5}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    .line 77
    move-result v5
    :try_end_1
    .catch Ljava/lang/NumberFormatException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 78
    .line 79
    if-le v5, v4, :cond_1

    .line 80
    move v4, v5

    .line 81
    .line 82
    .line 83
    :catch_0
    :cond_1
    :try_start_2
    invoke-static {v8}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il(Ljava/io/Closeable;)V

    .line 84
    goto :goto_3

    .line 85
    .line 86
    .line 87
    :goto_2
    invoke-static {v8}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il(Ljava/io/Closeable;)V

    .line 88
    throw v1
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    .line 89
    .line 90
    :cond_2
    :goto_3
    add-int/lit8 v3, v3, 0x1

    .line 91
    goto :goto_0

    .line 92
    .line 93
    :cond_3
    if-ne v4, v0, :cond_5

    .line 94
    const/4 v1, 0x0

    .line 95
    .line 96
    :try_start_3
    new-instance v2, Ljava/io/FileInputStream;

    .line 97
    .line 98
    const-string v3, "/proc/cpuinfo"

    .line 99
    .line 100
    .line 101
    invoke-direct {v2, v3}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_2

    .line 102
    .line 103
    :try_start_4
    const-string v1, "cpu MHz"

    .line 104
    .line 105
    .line 106
    invoke-static {v1, v2}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l1111l111111Il(Ljava/lang/String;Ljava/io/FileInputStream;)I

    .line 107
    move-result v1
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 108
    .line 109
    mul-int/lit16 v1, v1, 0x3e8

    .line 110
    .line 111
    if-le v1, v4, :cond_4

    .line 112
    move v4, v1

    .line 113
    .line 114
    .line 115
    :cond_4
    :try_start_5
    invoke-static {v2}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il(Ljava/io/Closeable;)V

    .line 116
    :cond_5
    move v0, v4

    .line 117
    goto :goto_5

    .line 118
    :catchall_1
    move-exception v1

    .line 119
    goto :goto_4

    .line 120
    :catchall_2
    move-exception v2

    .line 121
    move-object v10, v2

    .line 122
    move-object v2, v1

    .line 123
    move-object v1, v10

    .line 124
    .line 125
    .line 126
    :goto_4
    invoke-static {v2}, Lcom/ishumei/smantifraud/l111l1111llIl/l111l1111l1Il;->l1111l111111Il(Ljava/io/Closeable;)V

    .line 127
    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_1

    .line 128
    :catch_1
    :goto_5
    return v0
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
.end method

.method public static l111l11111Il()J
    .locals 3
    .annotation build Landroid/annotation/TargetApi;
        value = 0x10
    .end annotation

    .line 1
    .line 2
    sget-object v0, Lcom/ishumei/smantifraud/l111l11111lIl/l111l1111l1Il;->l1111l111111Il:Landroid/content/Context;

    .line 3
    .line 4
    if-eqz v0, :cond_0

    .line 5
    .line 6
    :try_start_0
    new-instance v1, Landroid/app/ActivityManager$MemoryInfo;

    .line 7
    .line 8
    .line 9
    invoke-direct {v1}, Landroid/app/ActivityManager$MemoryInfo;-><init>()V

    .line 10
    .line 11
    const-string v2, "activity"

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 15
    move-result-object v0

    .line 16
    .line 17
    check-cast v0, Landroid/app/ActivityManager;

    .line 18
    .line 19
    .line 20
    invoke-virtual {v0, v1}, Landroid/app/ActivityManager;->getMemoryInfo(Landroid/app/ActivityManager$MemoryInfo;)V

    .line 21
    .line 22
    iget-wide v0, v1, Landroid/app/ActivityManager$MemoryInfo;->totalMem:J
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 23
    return-wide v0

    .line 24
    .line 25
    :catch_0
    :cond_0
    const-wide/16 v0, 0x0

    .line 26
    return-wide v0
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
.end method

.method public static l111l11111lIl()I
    .locals 2

    .line 1
    const/4 v0, -0x1

    :try_start_0
    const-string v1, "/sys/devices/system/cpu/possible"

    invoke-static {v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l1111l111111Il(Ljava/lang/String;)I

    move-result v1

    if-ne v1, v0, :cond_0

    const-string v1, "/sys/devices/system/cpu/present"

    invoke-static {v1}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l1111l111111Il(Ljava/lang/String;)I

    move-result v1

    :cond_0
    if-ne v1, v0, :cond_1

    invoke-static {}, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l111l1111l1Il()I

    move-result v0
    :try_end_0
    .catch Ljava/lang/SecurityException; {:try_start_0 .. :try_end_0} :catch_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    return v0

    :cond_1
    return v1

    :catch_0
    return v0
.end method

.method private static l111l11111lIl(Ljava/lang/String;)I
    .locals 1

    .line 2
    if-eqz p0, :cond_1

    const-string v0, "0-[\\d]+$"

    invoke-virtual {p0, v0}, Ljava/lang/String;->matches(Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    invoke-virtual {p0, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    return p0

    :cond_1
    :goto_0
    const/4 p0, -0x1

    return p0
.end method

.method private static l111l1111l1Il()I
    .locals 2

    .line 1
    .line 2
    :try_start_0
    new-instance v0, Ljava/io/File;

    .line 3
    .line 4
    const-string v1, "/sys/devices/system/cpu/possible"

    .line 5
    .line 6
    .line 7
    invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V

    .line 8
    .line 9
    sget-object v1, Lcom/ishumei/smantifraud/l111l11111I1l/l111l1111l1Il;->l111l11111lIl:Ljava/io/FileFilter;

    .line 10
    .line 11
    .line 12
    invoke-virtual {v0, v1}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;

    .line 13
    move-result-object v0

    .line 14
    array-length v0, v0
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    .line 15
    return v0

    .line 16
    :catch_0
    const/4 v0, 0x0

    .line 17
    return v0
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
.end method
