.class public Lorg/springframework/web/util/pattern/b;
.super Lorg/springframework/web/util/pattern/e;
.source "CaptureVariablePathElement.java"


# instance fields
.field public final f:Ljava/lang/String;

.field public final g:Ljava/util/regex/Pattern;


# direct methods
.method public constructor <init>(I[CZC)V
    .locals 4

    .line 1
    .line 2
    .line 3
    invoke-direct {p0, p1, p4}, Lorg/springframework/web/util/pattern/e;-><init>(IC)V

    .line 4
    const/4 p1, 0x0

    .line 5
    move p4, p1

    .line 6
    :goto_0
    array-length v0, p2

    .line 7
    const/4 v1, -0x1

    .line 8
    .line 9
    if-ge p4, v0, :cond_1

    .line 10
    .line 11
    aget-char v0, p2, p4

    .line 12
    .line 13
    const/16 v2, 0x3a

    .line 14
    .line 15
    if-ne v0, v2, :cond_0

    .line 16
    goto :goto_1

    .line 17
    .line 18
    :cond_0
    add-int/lit8 p4, p4, 0x1

    .line 19
    goto :goto_0

    .line 20
    :cond_1
    move p4, v1

    .line 21
    :goto_1
    const/4 v0, 0x2

    .line 22
    const/4 v2, 0x1

    .line 23
    .line 24
    if-ne p4, v1, :cond_2

    .line 25
    .line 26
    new-instance p1, Ljava/lang/String;

    .line 27
    array-length p3, p2

    .line 28
    sub-int/2addr p3, v0

    .line 29
    .line 30
    .line 31
    invoke-direct {p1, p2, v2, p3}, Ljava/lang/String;-><init>([CII)V

    .line 32
    .line 33
    iput-object p1, p0, Lorg/springframework/web/util/pattern/b;->f:Ljava/lang/String;

    .line 34
    const/4 p1, 0x0

    .line 35
    .line 36
    iput-object p1, p0, Lorg/springframework/web/util/pattern/b;->g:Ljava/util/regex/Pattern;

    .line 37
    return-void

    .line 38
    .line 39
    :cond_2
    new-instance v1, Ljava/lang/String;

    .line 40
    .line 41
    add-int/lit8 v3, p4, -0x1

    .line 42
    .line 43
    .line 44
    invoke-direct {v1, p2, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 45
    .line 46
    iput-object v1, p0, Lorg/springframework/web/util/pattern/b;->f:Ljava/lang/String;

    .line 47
    .line 48
    new-instance v1, Ljava/lang/String;

    .line 49
    .line 50
    add-int/lit8 v2, p4, 0x1

    .line 51
    array-length v3, p2

    .line 52
    sub-int/2addr v3, p4

    .line 53
    sub-int/2addr v3, v0

    .line 54
    .line 55
    .line 56
    invoke-direct {v1, p2, v2, v3}, Ljava/lang/String;-><init>([CII)V

    .line 57
    .line 58
    if-eqz p3, :cond_3

    .line 59
    goto :goto_2

    .line 60
    :cond_3
    move p1, v0

    .line 61
    .line 62
    :goto_2
    or-int/lit8 p1, p1, 0x20

    .line 63
    .line 64
    .line 65
    invoke-static {v1, p1}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;I)Ljava/util/regex/Pattern;

    .line 66
    move-result-object p1

    .line 67
    .line 68
    iput-object p1, p0, Lorg/springframework/web/util/pattern/b;->g:Ljava/util/regex/Pattern;

    .line 69
    return-void
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


# virtual methods
.method public a()I
    .locals 1

    .line 1
    const/4 v0, 0x1

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
    .line 19
    .line 20
    .line 21
.end method

.method public b()I
    .locals 1

    .line 1
    const/4 v0, 0x1

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
    .line 19
    .line 20
    .line 21
.end method

.method public c()I
    .locals 1

    .line 1
    const/4 v0, 0x1

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
    .line 19
    .line 20
    .line 21
.end method

.method public e(ILorg/springframework/web/util/pattern/f$a;)Z
    .locals 6

    .line 1
    .line 2
    iget v0, p2, Lorg/springframework/web/util/pattern/f$a;->c:I

    .line 3
    const/4 v1, 0x0

    .line 4
    .line 5
    if-lt p1, v0, :cond_0

    .line 6
    return v1

    .line 7
    .line 8
    .line 9
    :cond_0
    invoke-virtual {p2, p1}, Lorg/springframework/web/util/pattern/f$a;->d(I)Ljava/lang/String;

    .line 10
    move-result-object v0

    .line 11
    .line 12
    .line 13
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    .line 14
    move-result v2

    .line 15
    .line 16
    if-nez v2, :cond_1

    .line 17
    return v1

    .line 18
    .line 19
    :cond_1
    iget-object v2, p0, Lorg/springframework/web/util/pattern/b;->g:Ljava/util/regex/Pattern;

    .line 20
    .line 21
    if-eqz v2, :cond_3

    .line 22
    .line 23
    .line 24
    invoke-virtual {v2, v0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    .line 25
    move-result-object v2

    .line 26
    .line 27
    .line 28
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->groupCount()I

    .line 29
    move-result v3

    .line 30
    .line 31
    if-nez v3, :cond_2

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z

    .line 35
    move-result v2

    .line 36
    .line 37
    if-nez v2, :cond_3

    .line 38
    return v1

    .line 39
    .line 40
    :cond_2
    new-instance p1, Ljava/lang/IllegalArgumentException;

    .line 41
    .line 42
    new-instance p2, Ljava/lang/StringBuilder;

    .line 43
    .line 44
    .line 45
    invoke-direct {p2}, Ljava/lang/StringBuilder;-><init>()V

    .line 46
    .line 47
    const-string v0, "No capture groups allowed in the constraint regex: "

    .line 48
    .line 49
    .line 50
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 51
    .line 52
    iget-object v0, p0, Lorg/springframework/web/util/pattern/b;->g:Ljava/util/regex/Pattern;

    .line 53
    .line 54
    .line 55
    invoke-virtual {v0}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 56
    move-result-object v0

    .line 57
    .line 58
    .line 59
    invoke-virtual {p2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 60
    .line 61
    .line 62
    invoke-virtual {p2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 63
    move-result-object p2

    .line 64
    .line 65
    .line 66
    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 67
    throw p1

    .line 68
    .line 69
    :cond_3
    add-int/lit8 v2, p1, 0x1

    .line 70
    .line 71
    .line 72
    invoke-virtual {p0}, Lorg/springframework/web/util/pattern/e;->d()Z

    .line 73
    move-result v3

    .line 74
    .line 75
    if-eqz v3, :cond_7

    .line 76
    .line 77
    iget-boolean v3, p2, Lorg/springframework/web/util/pattern/f$a;->g:Z

    .line 78
    const/4 v4, 0x1

    .line 79
    .line 80
    if-eqz v3, :cond_4

    .line 81
    .line 82
    iput v2, p2, Lorg/springframework/web/util/pattern/f$a;->h:I

    .line 83
    :goto_0
    move v1, v4

    .line 84
    goto :goto_2

    .line 85
    .line 86
    :cond_4
    iget v3, p2, Lorg/springframework/web/util/pattern/f$a;->c:I

    .line 87
    .line 88
    if-ne v2, v3, :cond_5

    .line 89
    move v3, v4

    .line 90
    goto :goto_1

    .line 91
    :cond_5
    move v3, v1

    .line 92
    .line 93
    :goto_1
    if-nez v3, :cond_6

    .line 94
    .line 95
    .line 96
    invoke-virtual {p2}, Lorg/springframework/web/util/pattern/f$a;->b()Z

    .line 97
    move-result v5

    .line 98
    .line 99
    if-eqz v5, :cond_6

    .line 100
    .line 101
    add-int/lit8 v3, p1, 0x2

    .line 102
    .line 103
    iget v5, p2, Lorg/springframework/web/util/pattern/f$a;->c:I

    .line 104
    .line 105
    if-ne v3, v5, :cond_8

    .line 106
    .line 107
    .line 108
    invoke-virtual {p2, v2}, Lorg/springframework/web/util/pattern/f$a;->c(I)Z

    .line 109
    move-result v2

    .line 110
    .line 111
    if-eqz v2, :cond_8

    .line 112
    goto :goto_0

    .line 113
    :cond_6
    move v1, v3

    .line 114
    goto :goto_2

    .line 115
    .line 116
    :cond_7
    iget-object v3, p0, Lorg/springframework/web/util/pattern/e;->c:Lorg/springframework/web/util/pattern/e;

    .line 117
    .line 118
    if-eqz v3, :cond_8

    .line 119
    .line 120
    .line 121
    invoke-virtual {v3, v2, p2}, Lorg/springframework/web/util/pattern/e;->e(ILorg/springframework/web/util/pattern/f$a;)Z

    .line 122
    move-result v1

    .line 123
    .line 124
    :cond_8
    :goto_2
    if-eqz v1, :cond_9

    .line 125
    .line 126
    iget-boolean v2, p2, Lorg/springframework/web/util/pattern/f$a;->f:Z

    .line 127
    .line 128
    if-eqz v2, :cond_9

    .line 129
    .line 130
    iget-object v2, p0, Lorg/springframework/web/util/pattern/b;->f:Ljava/lang/String;

    .line 131
    .line 132
    iget-object v3, p2, Lorg/springframework/web/util/pattern/f$a;->b:Ljava/util/List;

    .line 133
    .line 134
    .line 135
    invoke-interface {v3, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 136
    move-result-object p1

    .line 137
    .line 138
    check-cast p1, Lvh0/b$c;

    .line 139
    .line 140
    .line 141
    invoke-interface {p1}, Lvh0/b$c;->b()Lwh0/i;

    .line 142
    move-result-object p1

    .line 143
    .line 144
    .line 145
    invoke-virtual {p2, v2, v0, p1}, Lorg/springframework/web/util/pattern/f$a;->e(Ljava/lang/String;Ljava/lang/String;Lwh0/i;)V

    .line 146
    :cond_9
    return v1
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

.method public f()Ljava/lang/String;
    .locals 1

    .line 1
    .line 2
    iget-object v0, p0, Lorg/springframework/web/util/pattern/b;->f:Ljava/lang/String;

    .line 3
    return-object v0
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
    .line 19
    .line 20
    .line 21
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    .line 1
    .line 2
    new-instance v0, Ljava/lang/StringBuilder;

    .line 3
    .line 4
    .line 5
    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 6
    .line 7
    const-string v1, "CaptureVariable({"

    .line 8
    .line 9
    .line 10
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 11
    .line 12
    iget-object v1, p0, Lorg/springframework/web/util/pattern/b;->f:Ljava/lang/String;

    .line 13
    .line 14
    .line 15
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 16
    .line 17
    iget-object v1, p0, Lorg/springframework/web/util/pattern/b;->g:Ljava/util/regex/Pattern;

    .line 18
    .line 19
    if-eqz v1, :cond_0

    .line 20
    .line 21
    new-instance v1, Ljava/lang/StringBuilder;

    .line 22
    .line 23
    .line 24
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 25
    .line 26
    const-string v2, ":"

    .line 27
    .line 28
    .line 29
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 30
    .line 31
    iget-object v2, p0, Lorg/springframework/web/util/pattern/b;->g:Ljava/util/regex/Pattern;

    .line 32
    .line 33
    .line 34
    invoke-virtual {v2}, Ljava/util/regex/Pattern;->pattern()Ljava/lang/String;

    .line 35
    move-result-object v2

    .line 36
    .line 37
    .line 38
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 42
    move-result-object v1

    .line 43
    goto :goto_0

    .line 44
    .line 45
    :cond_0
    const-string v1, ""

    .line 46
    .line 47
    .line 48
    :goto_0
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 49
    .line 50
    .line 51
    const-string/jumbo v1, "})"

    .line 52
    .line 53
    .line 54
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 55
    .line 56
    .line 57
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 58
    move-result-object v0

    .line 59
    return-object v0
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
.end method
